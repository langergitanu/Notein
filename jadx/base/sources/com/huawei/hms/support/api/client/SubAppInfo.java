package com.huawei.hms.support.api.client;

/* JADX INFO: loaded from: classes9.dex */
public class SubAppInfo {

    /* JADX INFO: renamed from: a */
    private String f56910a;

    public SubAppInfo(SubAppInfo subAppInfo) {
        if (subAppInfo != null) {
            this.f56910a = subAppInfo.getSubAppID();
        }
    }

    public String getSubAppID() {
        return this.f56910a;
    }

    public void setSubAppInfoID(String str) {
        this.f56910a = str;
    }

    public SubAppInfo(String str) {
        this.f56910a = str;
    }
}
