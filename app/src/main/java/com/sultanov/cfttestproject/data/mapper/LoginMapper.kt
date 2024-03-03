package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.LoginDto
import com.sultanov.cfttestproject.domain.item.Login

class LoginMapper {

    fun mapLoginToDto(login: Login): LoginDto {
        return LoginDto(
            uuid = login.uuid,
            username = login.username,
            password = login.password,
            salt = login.salt,
            md5 = login.md5,
            sha1 = login.sha1,
            sha256 = login.sha256,
        )
    }

    fun mapDtoToLogin(loginDto: LoginDto): Login {
        return Login(
            uuid = loginDto.uuid,
            username = loginDto.username,
            password = loginDto.password,
            salt = loginDto.salt,
            md5 = loginDto.md5,
            sha1 = loginDto.sha1,
            sha256 = loginDto.sha256,
        )
    }
}