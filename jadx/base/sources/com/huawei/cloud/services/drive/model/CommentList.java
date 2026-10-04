package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentList extends GenericJson {

    @Key
    private String category;

    @Key
    private List<Comment> comments;

    @Key
    private String nextCursor;

    public String getCategory() {
        return this.category;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public CommentList setCategory(String str) {
        this.category = str;
        return this;
    }

    public CommentList setComments(List<Comment> list) {
        this.comments = list;
        return this;
    }

    public CommentList setNextCursor(String str) {
        this.nextCursor = str;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public CommentList set(String str, Object obj) {
        return (CommentList) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public CommentList clone() {
        return (CommentList) super.clone();
    }
}
