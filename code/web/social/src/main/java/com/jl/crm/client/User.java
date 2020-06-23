package com.jl.crm.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jl.crm.client.meta.Resource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class User extends Resource {

    private String firstName, lastName, username;
    private String profilePhotoMediaType;
    private long id;
    private boolean profilePhotoImported;
    private Date signupDate;

    public User(String firstName, String lastName, String username, long id, String profilePhotoMediaType, boolean profilePhotoImported, Date signupDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = id;
        this.profilePhotoMediaType = profilePhotoMediaType;
        this.profilePhotoImported = profilePhotoImported;
        this.signupDate = signupDate;
    }

    User() {
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", username='" + username
                + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

    public MediaType getProfilePhotoMediaType() {
        return StringUtils.hasText(profilePhotoMediaType) ?
                MediaType.parseMediaType(profilePhotoMediaType) : null;
    }
}
