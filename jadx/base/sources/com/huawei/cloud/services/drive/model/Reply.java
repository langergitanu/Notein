package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.base.util.Key;

/* JADX INFO: loaded from: classes8.dex */
public final class Reply extends GenericJson {

    @Key
    private String category;

    @Key
    private DateTime createdTime;

    @Key
    private User creator;

    @Key
    private Boolean deleted;

    @Key
    private String description;

    @Key
    private DateTime editedTime;

    @Key
    private String htmlDescription;

    /* JADX INFO: renamed from: id */
    @Key
    private String f52359id;

    @Key
    private String operate;

    public String getCategory() {
        return this.category;
    }

    public DateTime getCreatedTime() {
        return this.createdTime;
    }

    public User getCreator() {
        return this.creator;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public String getDescription() {
        return this.description;
    }

    public DateTime getEditedTime() {
        return this.editedTime;
    }

    public String getHtmlDescription() {
        return this.htmlDescription;
    }

    public String getId() {
        return this.f52359id;
    }

    public String getOperate() {
        return this.operate;
    }

    public Reply setCategory(String str) {
        this.category = str;
        return this;
    }

    public Reply setCreatedTime(DateTime dateTime) {
        this.createdTime = dateTime;
        return this;
    }

    public Reply setCreator(User user) {
        this.creator = user;
        return this;
    }

    public Reply setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public Reply setDescription(String str) {
        this.description = str;
        return this;
    }

    public Reply setEditedTime(DateTime dateTime) {
        this.editedTime = dateTime;
        return this;
    }

    public Reply setHtmlDescription(String str) {
        this.htmlDescription = str;
        return this;
    }

    public Reply setId(String str) {
        this.f52359id = str;
        return this;
    }

    public Reply setOperate(String str) {
        this.operate = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public Reply set(String str, Object obj) {
        return (Reply) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public Reply clone() {
        return (Reply) super.clone();
    }
}
