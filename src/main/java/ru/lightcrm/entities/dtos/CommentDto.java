package ru.lightcrm.entities.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.lightcrm.entities.Comment;
import ru.lightcrm.entities.Contact;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@ApiModel(description = "Комментарии dto в приложении")
@Data
@NoArgsConstructor
public class CommentDto {
    @ApiModelProperty(notes = "Идентификатор комментария", example = "1", required = true, position = 1)
    private Long id;

    @ApiModelProperty(notes = "Имя автора комментария", example = "Иван", required = true, position = 2)
    private String authorFirstName;

    @ApiModelProperty(notes = "Фамилия автора комментария", example = "Иванов", required = true, position = 3)
    private String authorLastName;

    @ApiModelProperty(notes = "Почта автора комментария", example = "ivan@gmail.com", required = true, position = 4)
    private String authorEmail;

    @ApiModelProperty(notes = "Дата создания комментария", required = true, position = 5)
    private OffsetDateTime createdDate;

    @ApiModelProperty(notes = "Содержание комментария", example = "Уточнить реквизиты компании.", required = true, position = 6)
    private String text;


    public CommentDto(Comment comment) {
        this.id = comment.getId();
        this.authorFirstName = comment.getAuthor().getFirstname();
        this.authorLastName = comment.getAuthor().getLastname();
        this.authorEmail = comment.getAuthor().getEmail();
        this.createdDate = comment.getCreatedDate();
        this.text = comment.getText();
    }
}
