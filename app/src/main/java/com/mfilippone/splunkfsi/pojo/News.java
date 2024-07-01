package com.mfilippone.splunkfsi.pojo;

import com.mfilippone.splunkfsi.Meta;

import java.util.List;
public class News {

    private List<Data> data;
    private Meta meta;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}

