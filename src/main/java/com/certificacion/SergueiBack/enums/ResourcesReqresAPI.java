package com.certificacion.SergueiBack.enums;

import lombok.Getter;

@Getter
public enum ResourcesReqresAPI {

    BASE_URL_REQRES_API("https://reqres.in"),

    PATH_LIST_USERS("/api/users?page=2"),

    ;

    private String resourceReqresAPI;

    public String getResourceReqresAPI() {
        return resourceReqresAPI;
    }

    ResourcesReqresAPI(String resourceReqresAPI) {
        this.resourceReqresAPI = resourceReqresAPI;
    }
}
