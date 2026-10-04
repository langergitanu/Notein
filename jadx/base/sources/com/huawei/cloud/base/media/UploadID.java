package com.huawei.cloud.base.media;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class UploadID implements Serializable {
    private static final long MAX_CACHE_CLEAN_TIME = 864000000;
    private static final long MAX_CACHE_TIME = 604800000;
    private static final long serialVersionUID = 1;
    private String localID;
    private long timeStamp;
    private String uploadID;

    public String getLocalID() {
        return this.localID;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getUploadID() {
        return this.uploadID;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() - this.timeStamp >= MAX_CACHE_TIME;
    }

    public boolean isExpiredTooLong() {
        return System.currentTimeMillis() - this.timeStamp >= MAX_CACHE_CLEAN_TIME;
    }

    public void setLocalID(String str) {
        this.localID = str;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setUploadID(String str) {
        this.uploadID = str;
    }
}
