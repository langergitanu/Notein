package com.orion.notein.data.service.ocr.response;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/ocr/response/OcrGoogleResponse;", "", "error", "", "message", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getMessage", "getData", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OcrGoogleResponse {
    private final String data;
    private final String error;
    private final String message;

    public OcrGoogleResponse(String str, String str2, String str3) {
        this.error = str;
        this.message = str2;
        this.data = str3;
    }

    public static /* synthetic */ OcrGoogleResponse copy$default(OcrGoogleResponse ocrGoogleResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ocrGoogleResponse.error;
        }
        if ((i & 2) != 0) {
            str2 = ocrGoogleResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = ocrGoogleResponse.data;
        }
        return ocrGoogleResponse.copy(str, str2, str3);
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
    public final String getData() {
        return this.data;
    }

    public final OcrGoogleResponse copy(String error, String message, String data) {
        return new OcrGoogleResponse(error, message, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrGoogleResponse)) {
            return false;
        }
        OcrGoogleResponse ocrGoogleResponse = (OcrGoogleResponse) other;
        return OooOOO0.OooO0O0(this.error, ocrGoogleResponse.error) && OooOOO0.OooO0O0(this.message, ocrGoogleResponse.message) && OooOOO0.OooO0O0(this.data, ocrGoogleResponse.data);
    }

    public final String getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.data;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.error;
        String str2 = this.message;
        return OooO00o.OooO0OO(OooO0o.OooO0O0("OcrGoogleResponse(error=", str, ", message=", str2, ", data="), this.data, ")");
    }
}
