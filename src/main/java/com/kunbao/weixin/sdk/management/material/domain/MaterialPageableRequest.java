package com.kunbao.weixin.sdk.management.material.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kunbao.weixin.sdk.management.material.domain.constant.MaterialType;

/**
 * {
 * "type":TYPE,
 * "offset":OFFSET,
 * "count":COUNT
 * }
 * Created by lemon_bar on 15/7/12.
 */
public class MaterialPageableRequest {
    @JsonProperty("type")
    private MaterialType type;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("count")
    private int count;

    public MaterialPageableRequest(MaterialType type, int offset, int count) {
        this.type = type;
        this.offset = offset;
        this.count = count;
    }

    public MaterialType getType() {
        return type;
    }

    public void setType(MaterialType type) {
        this.type = type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
