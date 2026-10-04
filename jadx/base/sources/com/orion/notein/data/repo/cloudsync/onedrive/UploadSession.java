package com.orion.notein.data.repo.cloudsync.onedrive;

import androidx.core.database.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/data/repo/cloudsync/onedrive/UploadSession;", "", "expirationDateTime", "", "uploadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpirationDateTime", "()Ljava/lang/String;", "getUploadUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UploadSession {

    @SerializedName("expirationDateTime")
    private final String expirationDateTime;

    @SerializedName("uploadUrl")
    private final String uploadUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadSession() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UploadSession copy$default(UploadSession uploadSession, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadSession.expirationDateTime;
        }
        if ((i & 2) != 0) {
            str2 = uploadSession.uploadUrl;
        }
        return uploadSession.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public final UploadSession copy(String expirationDateTime, String uploadUrl) {
        return new UploadSession(expirationDateTime, uploadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadSession)) {
            return false;
        }
        UploadSession uploadSession = (UploadSession) other;
        return OooOOO0.OooO0O0(this.expirationDateTime, uploadSession.expirationDateTime) && OooOOO0.OooO0O0(this.uploadUrl, uploadSession.uploadUrl);
    }

    public final String getExpirationDateTime() {
        return this.expirationDateTime;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        String str = this.expirationDateTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uploadUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return OooO00o.OooO00o("UploadSession(expirationDateTime=", this.expirationDateTime, ", uploadUrl=", this.uploadUrl, ")");
    }

    public UploadSession(String str, String str2) {
        this.expirationDateTime = str;
        this.uploadUrl = str2;
    }

    public /* synthetic */ UploadSession(String str, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
