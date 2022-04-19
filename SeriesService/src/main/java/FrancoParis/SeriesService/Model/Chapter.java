package FrancoParis.SeriesService.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Chapter {

    private String id;
    private Integer chapterNumber;
    private String chapterName;
    private String urlStream;

}
