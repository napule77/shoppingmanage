package com.amalfi.dto;

import org.mapstruct.Mapper;

import com.amalfi.entity.Users;

@Mapper(componentModel = "spring")

public interface MapUserDTO {

	UserDTO DBtoUSerDTO(Users user);
}
