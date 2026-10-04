package com.microsoft.identity.common.java.providers.oauth2;

import com.microsoft.identity.common.java.dto.IRefreshTokenRecord;

/* JADX INFO: loaded from: classes9.dex */
public abstract class RefreshToken implements IRefreshTokenRecord {
    private String mRawRefreshToken;
    private long mTokenReceivedTime;

    public RefreshToken(String str) {
        this.mRawRefreshToken = str;
    }

    public String getRefreshToken() {
        return this.mRawRefreshToken;
    }

    public long getTokenReceivedTime() {
        return this.mTokenReceivedTime;
    }

    public void setRawRefreshToken(String str) {
        this.mRawRefreshToken = str;
    }

    public void setTokenReceivedTime(long j) {
        this.mTokenReceivedTime = j;
    }

    public RefreshToken(TokenResponse tokenResponse) {
        this.mTokenReceivedTime = tokenResponse.getResponseReceivedTime();
        this.mRawRefreshToken = tokenResponse.getRefreshToken();
    }
}
