package com.kunbao.weixin.sdk.management.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {
 * "group": {
 * "id": 107,
 * "name": "test"
 * }
 * }
 * Created by lemon_bar on 15/7/23.
 */
public class WXUserGroup {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("count")
    private Integer count;

    protected WXUserGroup() {
        this.id = null;
        this.count = null;
        this.name = null;
    }

    public WXUserGroup(Integer id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public WXUserGroup(String name) {
        this();
        this.name = name;
    }

    public WXUserGroup(int id) {
        this();
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
