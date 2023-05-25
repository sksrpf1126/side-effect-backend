package sideeffect.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sideeffect.project.domain.user.ProviderType;
import sideeffect.project.domain.user.User;
import sideeffect.project.dto.user.RefreshTokenResponse;
import sideeffect.project.security.JwtTokenProvider;
import sideeffect.project.security.RefreshTokenProvider;
import sideeffect.project.security.UserDetailsImpl;
import sideeffect.project.security.UserDetailsServiceImpl;
import sideeffect.project.service.OauthService;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/social")
public class OauthController {

    private final OauthService oauthService;
    private final RefreshTokenProvider refreshTokenProvider;

    @PostMapping("/login")
    public ResponseEntity<RefreshTokenResponse> login(@RequestHeader(value = "token") String token,
                                @RequestHeader(value = "providerType") String provider){
        log.info("test={}", token);
        ProviderType providerType = ProviderType.valueOf(provider.toUpperCase());
        User user = oauthService.login(token, providerType);
        RefreshTokenResponse refreshToken = refreshTokenProvider.createRefreshToken(createToken(user));
        String accessToken = refreshTokenProvider.issueAccessToken(refreshToken.getRefreshToken());
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", accessToken);
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(refreshToken, headers, HttpStatus.OK);
    }

    private Authentication createToken(User user) {
        UserDetailsImpl userDetails = UserDetailsImpl.of(user);
        return new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(),
            userDetails.getAuthorities());
    }
}
