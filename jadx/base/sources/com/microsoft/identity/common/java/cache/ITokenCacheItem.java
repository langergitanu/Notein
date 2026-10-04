package com.microsoft.identity.common.java.cache;

/* JADX INFO: loaded from: classes9.dex */
public interface ITokenCacheItem {
    String getAuthority();

    String getClientId();

    String getRefreshToken();

    String getResource();
}
