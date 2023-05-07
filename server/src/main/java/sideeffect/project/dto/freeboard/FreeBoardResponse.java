package sideeffect.project.dto.freeboard;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sideeffect.project.domain.freeboard.FreeBoard;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FreeBoardResponse {

    private Long id;
    private int views;
    private String userNickname;
    private String title;
    private String content;
    private String projectUrl;
    private String headerImage;
    private int recommendations;
    private boolean recommend;
    private int commentNumber;
    private LocalDateTime createAt;


    public static List<FreeBoardResponse> listOf(List<FreeBoard> freeBoards) {
        return freeBoards.stream()
            .map(FreeBoardResponse::of)
            .collect(Collectors.toList());
    }

    public static FreeBoardResponse of(FreeBoard freeBoard) {
        return FreeBoardResponse.builder()
            .id(freeBoard.getId())
            .views(freeBoard.getViews())
            .title(freeBoard.getTitle())
            .userNickname(freeBoard.getUser().getNickname())
            .content(freeBoard.getContent())
            .projectUrl(freeBoard.getProjectUrl())
            .headerImage(freeBoard.getImgUrl())
            .recommendations(freeBoard.getRecommends().size())
            .commentNumber(freeBoard.getComments().size())
            .createAt(freeBoard.getCreateAt())
            .build();
    }
}
