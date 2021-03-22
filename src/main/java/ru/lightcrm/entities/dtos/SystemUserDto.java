package ru.lightcrm.entities.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ApiModel(description = "Класс, содержащий данные необходимые для регистрации нового пользователя", parent = ProfileMiniDto.class)
public class SystemUserDto extends ProfileMiniDto {

    @ApiModelProperty(notes = "Логин пользователя", dataType = "String", example = "Aladdin", required = true, position = 7)
    @Size(min = 3, max = 50, message = "Некорректная длина логина: минимум 3 и максимум 50 символов")
    private String login;

    @Size(min = 3, max = 255, message = "Некорректная длина пароль: минимум 3 и максимум 255 символов")
    @ApiModelProperty(notes = "Пароль пользователя", dataType = "String", example = "12345", required = true, position = 8)
    private String password;

    @Size(min = 3, max = 255, message = "Некорректная длина пароль: минимум 3 и максимум 255 символов")
    @ApiModelProperty(notes = "Подтверждающий пароль пользователя (должен совпадать с паролем)", dataType = "String", example = "12345", required = true, position = 9)
    private String confirmationPassword;
}