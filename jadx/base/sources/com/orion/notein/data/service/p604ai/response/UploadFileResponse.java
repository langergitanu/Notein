package com.orion.notein.data.service.p604ai.response;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/ai/response/UploadFileResponse;", "", "error", "", "message", "md5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getMessage", "getMd5", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UploadFileResponse {
    private final String error;
    private final String md5;
    private final String message;

    public UploadFileResponse(String str, String str2, String str3) {
        this.error = str;
        this.message = str2;
        this.md5 = str3;
    }

    public static /* synthetic */ UploadFileResponse copy$default(UploadFileResponse uploadFileResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadFileResponse.error;
        }
        if ((i & 2) != 0) {
            str2 = uploadFileResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = uploadFileResponse.md5;
        }
        return uploadFileResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    public final UploadFileResponse copy(String error, String message, String md5) {
        return new UploadFileResponse(error, message, md5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFileResponse)) {
            return false;
        }
        UploadFileResponse uploadFileResponse = (UploadFileResponse) other;
        return OooOOO0.OooO0O0(this.error, uploadFileResponse.error) && OooOOO0.OooO0O0(this.message, uploadFileResponse.message) && OooOOO0.OooO0O0(this.md5, uploadFileResponse.md5);
    }

    public final String getError() {
        return this.error;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.md5;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.error;
        String str2 = this.message;
        return OooO00o.OooO0OO(OooO0o.OooO0O0("UploadFileResponse(error=", str, ", message=", str2, ", md5="), this.md5, ")");
    }
}
