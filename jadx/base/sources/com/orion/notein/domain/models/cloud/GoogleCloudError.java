package com.orion.notein.domain.models.cloud;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.firestore.util.OooOOO;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/GoogleCloudError;", "", "code", "", "message", "errors", "", "Lcom/orion/notein/domain/models/cloud/GoogleCloudErrorDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class GoogleCloudError {

    @SerializedName("code")
    private final String code;

    @SerializedName("errors")
    private final List<GoogleCloudErrorDetail> errors;

    @SerializedName("message")
    private final String message;

    public GoogleCloudError(String code, String message, List<GoogleCloudErrorDetail> errors) {
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(message, "message");
        OooOOO0.OooO0oO(errors, "errors");
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoogleCloudError copy$default(GoogleCloudError googleCloudError, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googleCloudError.code;
        }
        if ((i & 2) != 0) {
            str2 = googleCloudError.message;
        }
        if ((i & 4) != 0) {
            list = googleCloudError.errors;
        }
        return googleCloudError.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<GoogleCloudErrorDetail> component3() {
        return this.errors;
    }

    public final GoogleCloudError copy(String code, String message, List<GoogleCloudErrorDetail> errors) {
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(message, "message");
        OooOOO0.OooO0oO(errors, "errors");
        return new GoogleCloudError(code, message, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleCloudError)) {
            return false;
        }
        GoogleCloudError googleCloudError = (GoogleCloudError) other;
        return OooOOO0.OooO0O0(this.code, googleCloudError.code) && OooOOO0.OooO0O0(this.message, googleCloudError.message) && OooOOO0.OooO0O0(this.errors, googleCloudError.errors);
    }

    public final String getCode() {
        return this.code;
    }

    public final List<GoogleCloudErrorDetail> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.errors.hashCode() + OooO00o.OooO0O0(this.code.hashCode() * 31, 31, this.message);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.message;
        return OooOOO.OooO0O0(")", OooO0o.OooO0O0("GoogleCloudError(code=", str, ", message=", str2, ", errors="), this.errors);
    }
}
