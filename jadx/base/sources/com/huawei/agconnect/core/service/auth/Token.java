package com.huawei.agconnect.core.service.auth;

/* JADX INFO: loaded from: classes8.dex */
public interface Token {
    long getExpiration();

    long getIssuedAt();

    long getNotBefore();

    String getTokenString();
}
