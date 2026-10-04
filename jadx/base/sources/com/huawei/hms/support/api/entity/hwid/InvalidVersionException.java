package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes9.dex */
public class InvalidVersionException extends Exception {

    /* JADX INFO: renamed from: a */
    private Status f56921a;

    public InvalidVersionException(Status status) {
        this.f56921a = status;
    }

    public Status getError() {
        return this.f56921a;
    }
}
