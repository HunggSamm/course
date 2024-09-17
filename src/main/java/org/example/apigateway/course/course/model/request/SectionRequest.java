package org.example.apigateway.course.course.model.request;
import lombok.*;
import org.example.apigateway.course.course.model.Lesson;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SectionRequest {
    private int courseId;
    private String title;
    private List<Lesson> lessons;
    private String createdBy;
    private String createdAt;
}
