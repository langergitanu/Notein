package com.microsoft.identity.common.java.dto;

import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.dto.Credential;

/* JADX INFO: loaded from: classes9.dex */
public class RefreshTokenRecord extends Credential {

    @SerializedName("family_id")
    private String mFamilyId;

    @SerializedName("target")
    private String mTarget;

    public static class SerializedNames extends Credential.SerializedNames {
        public static final String FAMILY_ID = "family_id";
        public static final String TARGET = "target";
    }

    @Override // com.microsoft.identity.common.java.dto.Credential
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        RefreshTokenRecord refreshTokenRecord = (RefreshTokenRecord) obj;
        String str = this.mFamilyId;
        if (str == null ? refreshTokenRecord.mFamilyId != null : !str.equals(refreshTokenRecord.mFamilyId)) {
            return false;
        }
        String str2 = this.mTarget;
        String str3 = refreshTokenRecord.mTarget;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public String getFamilyId() {
        return this.mFamilyId;
    }

    public String getTarget() {
        return this.mTarget;
    }

    @Override // com.microsoft.identity.common.java.dto.Credential
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.mFamilyId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mTarget;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.microsoft.identity.common.java.dto.Credential
    public boolean isExpired() {
        return false;
    }

    public void setFamilyId(String str) {
        this.mFamilyId = str;
    }

    public void setTarget(String str) {
        this.mTarget = str;
    }

    @Override // com.microsoft.identity.common.java.dto.AccountCredentialBase
    public String toString() {
        return "RefreshToken{mFamilyId='" + this.mFamilyId + "', mTarget='" + this.mTarget + "'} " + super.toString();
    }
}
