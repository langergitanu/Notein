package com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory;

import com.microsoft.identity.common.java.providers.microsoft.MicrosoftTokenResponse;
import com.microsoft.identity.common.java.util.CopyUtil;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class AzureActiveDirectoryTokenResponse extends MicrosoftTokenResponse {
    private Date mExpiresOn;
    private String mNotBefore;
    private String mResource;
    private String mSpeRing;

    public Date getExpiresOn() {
        return CopyUtil.copyIfNotNull(this.mExpiresOn);
    }

    public String getNotBefore() {
        return this.mNotBefore;
    }

    public String getResource() {
        return this.mResource;
    }

    @Override // com.microsoft.identity.common.java.providers.microsoft.MicrosoftTokenResponse
    public String getSpeRing() {
        return this.mSpeRing;
    }

    public void setExpiresOn(Date date) {
        this.mExpiresOn = CopyUtil.copyIfNotNull(date);
    }

    public void setNotBefore(String str) {
        this.mNotBefore = str;
    }

    public void setResource(String str) {
        this.mResource = str;
    }

    @Override // com.microsoft.identity.common.java.providers.microsoft.MicrosoftTokenResponse
    public void setSpeRing(String str) {
        this.mSpeRing = str;
    }

    @Override // com.microsoft.identity.common.java.providers.microsoft.MicrosoftTokenResponse, com.microsoft.identity.common.java.providers.oauth2.TokenResponse
    public String toString() {
        return "AzureActiveDirectoryTokenResponse{mExpiresOn=" + this.mExpiresOn + ", mResource='" + this.mResource + "', mNotBefore='" + this.mNotBefore + "', mSpeRing='" + this.mSpeRing + "'} " + super.toString();
    }
}
