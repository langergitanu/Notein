package com.orion.notein.domain.models.cloud;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.firestore.util.OooOOO;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/HuaweiCloudError;", "", "code", "", "description", "errorDetail", "", "Lcom/orion/notein/domain/models/cloud/HuaweiCloudErrorDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getErrorDetail", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HuaweiCloudError {

    @SerializedName("code")
    private final String code;

    @SerializedName("description")
    private final String description;

    @SerializedName("errorDetail")
    private final List<HuaweiCloudErrorDetail> errorDetail;

    public HuaweiCloudError(String code, String description, List<HuaweiCloudErrorDetail> errorDetail) {
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(errorDetail, "errorDetail");
        this.code = code;
        this.description = description;
        this.errorDetail = errorDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HuaweiCloudError copy$default(HuaweiCloudError huaweiCloudError, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = huaweiCloudError.code;
        }
        if ((i & 2) != 0) {
            str2 = huaweiCloudError.description;
        }
        if ((i & 4) != 0) {
            list = huaweiCloudError.errorDetail;
        }
        return huaweiCloudError.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<HuaweiCloudErrorDetail> component3() {
        return this.errorDetail;
    }

    public final HuaweiCloudError copy(String code, String description, List<HuaweiCloudErrorDetail> errorDetail) {
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(errorDetail, "errorDetail");
        return new HuaweiCloudError(code, description, errorDetail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuaweiCloudError)) {
            return false;
        }
        HuaweiCloudError huaweiCloudError = (HuaweiCloudError) other;
        return OooOOO0.OooO0O0(this.code, huaweiCloudError.code) && OooOOO0.OooO0O0(this.description, huaweiCloudError.description) && OooOOO0.OooO0O0(this.errorDetail, huaweiCloudError.errorDetail);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<HuaweiCloudErrorDetail> getErrorDetail() {
        return this.errorDetail;
    }

    public int hashCode() {
        return this.errorDetail.hashCode() + OooO00o.OooO0O0(this.code.hashCode() * 31, 31, this.description);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.description;
        return OooOOO.OooO0O0(")", OooO0o.OooO0O0("HuaweiCloudError(code=", str, ", description=", str2, ", errorDetail="), this.errorDetail);
    }
}
