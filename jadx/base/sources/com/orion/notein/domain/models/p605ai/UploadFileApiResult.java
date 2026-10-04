package com.orion.notein.domain.models.p605ai;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/ai/UploadFileApiResult;", "", "isSuccessful", "", "errorMessage", "", "uiErrorMessageId", "", "md5", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getUiErrorMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMd5", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/orion/notein/domain/models/ai/UploadFileApiResult;", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UploadFileApiResult {
    private final String errorMessage;
    private final boolean isSuccessful;
    private final String md5;
    private final Integer uiErrorMessageId;

    public UploadFileApiResult(boolean z, String str, Integer num, String str2) {
        this.isSuccessful = z;
        this.errorMessage = str;
        this.uiErrorMessageId = num;
        this.md5 = str2;
    }

    public static /* synthetic */ UploadFileApiResult copy$default(UploadFileApiResult uploadFileApiResult, boolean z, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uploadFileApiResult.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = uploadFileApiResult.errorMessage;
        }
        if ((i & 4) != 0) {
            num = uploadFileApiResult.uiErrorMessageId;
        }
        if ((i & 8) != 0) {
            str2 = uploadFileApiResult.md5;
        }
        return uploadFileApiResult.copy(z, str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getUiErrorMessageId() {
        return this.uiErrorMessageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    public final UploadFileApiResult copy(boolean isSuccessful, String errorMessage, Integer uiErrorMessageId, String md5) {
        return new UploadFileApiResult(isSuccessful, errorMessage, uiErrorMessageId, md5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFileApiResult)) {
            return false;
        }
        UploadFileApiResult uploadFileApiResult = (UploadFileApiResult) other;
        return this.isSuccessful == uploadFileApiResult.isSuccessful && OooOOO0.OooO0O0(this.errorMessage, uploadFileApiResult.errorMessage) && OooOOO0.OooO0O0(this.uiErrorMessageId, uploadFileApiResult.uiErrorMessageId) && OooOOO0.OooO0O0(this.md5, uploadFileApiResult.md5);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Integer getUiErrorMessageId() {
        return this.uiErrorMessageId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccessful) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.uiErrorMessageId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.md5;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public String toString() {
        return "UploadFileApiResult(isSuccessful=" + this.isSuccessful + ", errorMessage=" + this.errorMessage + ", uiErrorMessageId=" + this.uiErrorMessageId + ", md5=" + this.md5 + ")";
    }

    public /* synthetic */ UploadFileApiResult(boolean z, String str, Integer num, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
    }
}
