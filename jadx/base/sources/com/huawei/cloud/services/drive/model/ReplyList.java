package com.huawei.cloud.services.drive.model;

import com.huawei.cloud.base.json.GenericJson;
import com.huawei.cloud.base.util.Key;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ReplyList extends GenericJson {

    @Key
    private String category;

    @Key
    private String nextCursor;

    @Key
    private List<Reply> replies;

    public String getCategory() {
        return this.category;
    }

    public String getNextCursor() {
        return this.nextCursor;
    }

    public List<Reply> getReplies() {
        return this.replies;
    }

    public ReplyList setCategory(String str) {
        this.category = str;
        return this;
    }

    public ReplyList setNextCursor(String str) {
        this.nextCursor = str;
        return this;
    }

    public ReplyList setReplies(List<Reply> list) {
        this.replies = list;
        return this;
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData
    public ReplyList set(String str, Object obj) {
        return (ReplyList) super.set(str, obj);
    }

    @Override // com.huawei.cloud.base.json.GenericJson, com.huawei.cloud.base.util.GenericData, java.util.AbstractMap
    public ReplyList clone() {
        return (ReplyList) super.clone();
    }
}
