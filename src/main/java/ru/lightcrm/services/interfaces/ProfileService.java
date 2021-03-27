package ru.lightcrm.services.interfaces;

import ru.lightcrm.entities.Profile;
import ru.lightcrm.entities.dtos.ProfileDto;
import ru.lightcrm.entities.dtos.ProfileFullDto;

import java.util.List;

public interface ProfileService {

    ProfileDto findById(Long id);

    Profile findEntityById(Long id);

    List<ProfileDto> findAll();

    ProfileFullDto findFullById(Long id);

    List<ProfileFullDto> findFullAll();

    ProfileFullDto findFullByUserId(Long userId);

    void saveProfile(Profile profile);

}
