package com.certificacion.SergueiBack.enums;

import lombok.Getter;

@Getter
public enum ResourcesPetStore {

    BASE_URL_PET_STORE("https://petstore.swagger.io/v2"),

    PATH_ADD_NEW_PET("/pet/"),

    PATH_STATUS_PET("/pet/findByStatus?status="),

    HEADER_VALUE_CONTEN_TYPE("application/json"),

    ;

    private String resourcePetStore;

    public String getResourcePetStore() {
        return resourcePetStore;
    }

    ResourcesPetStore(String resourcePetStore) {
        this.resourcePetStore = resourcePetStore;
    }
}
