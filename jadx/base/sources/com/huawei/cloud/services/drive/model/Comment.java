package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Comment extends GenericJson {

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
    private String f52355id;

    @Key
    private String position;

    @Key
    private QuotedContent quotedContent;

    @Key
    private List<Reply> replies;

    @Key
    private Boolean resolved;

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
        return this.f52355id;
    }

    public String getPosition() {
        return this.position;
    }

    public QuotedContent getQuotedContent() {
        return this.quotedContent;
    }

    public List<Reply> getReplies() {
        return this.replies;
    }

    public Boolean getResolved() {
        return this.resolved;
    }

    public Comment setCategory(String str) {
        this.category = str;
        return this;
    }

    public Comment setCreatedTime(DateTime dateTime) {
        this.createdTime = dateTime;
        return this;
    }

    public Comment setCreator(User user) {
        this.creator = user;
        return this;
    }

    public Comment setDeleted(Boolean bool) {
        this.deleted = bool;
        return this;
    }

    public Comment setDescription(String str) {
        this.description = str;
        return this;
    }

    public Comment setEditedTime(DateTime dateTime) {
        this.editedTime = dateTime;
        return this;
    }

    public Comment setHtmlDescription(String str) {
        this.htmlDescription = str;
        return this;
    }

    public Comment setId(String str) {
        this.f52355id = str;
        return this;
    }

    public Comment setPosition(String str) {
        this.position = str;
        return this;
    }

    public Comment setQuotedContent(QuotedContent quotedContent) {
        this.quotedContent = quotedContent;
        return this;
    }

    public Comment setReplies(List<Reply> list) {
        this.replies = list;
        return this;
    }

    public Comment setResolved(Boolean bool) {
        this.resolved = bool;
        return this;
    }

    public static final class QuotedContent extends GenericJson {

        @Key
        private String content;

        @Key
        private String mimeType;

        public String getContent() {
            return this.content;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public QuotedContent setContent(String str) {
            this.content = str;
            return this;
        }

        public QuotedContent setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
        public QuotedContent set(String str, Object obj) {
            return (QuotedContent) super.set(str, obj);
        }

        @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
        public QuotedContent clone() {
            return (QuotedContent) super.clone();
        }
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public Comment set(String str, Object obj) {
        return (Comment) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public Comment clone() {
        return (Comment) super.clone();
    }
}
