package com.api.service;


import aj.org.objectweb.asm.ConstantDynamic;
import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationService {
    private RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public List<Registration> getRegistrations() {
        List<Registration> registrations = registrationRepository.findAll();
        return registrations;
    }


    public RegistrationDto createRegistrations(RegistrationDto registrationDto) {
        //copy dto to entity
        Registration registration = mapToEntity(registrationDto);

        Registration savedEntity = registrationRepository.save(registration);
        //copy entity to dto
        RegistrationDto dto = mapToDto(savedEntity);
        return dto;
    }

    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }

    public Registration updateRegistration(Long id, Registration registration) {
        Registration r = registrationRepository.findById(id).get();
        r.setName(registration.getName());
        r.setEmail(registration.getEmail());
        r.setMobile(registration.getMobile());
        Registration savedEntity = registrationRepository.save(r);
        return savedEntity;

    }

    Registration mapToEntity(RegistrationDto registrationDto) {
        Registration registration = new Registration();
        registration.setName(registrationDto.getName());
        registration.setEmail(registrationDto.getEmail());
        registration.setMobile(registrationDto.getMobile());
        return registration;
    }

    RegistrationDto mapToDto(Registration registration) {
        RegistrationDto dto = new RegistrationDto();
        dto.setName(registration.getName());
        dto.setEmail(registration.getEmail());
        dto.setMobile(registration.getMobile());
        return dto;
    }
}


