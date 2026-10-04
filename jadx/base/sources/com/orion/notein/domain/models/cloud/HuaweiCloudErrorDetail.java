package com.orion.notein.domain.models.cloud;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/HuaweiCloudErrorDetail;", "", "reason", "", "domain", "errorCode", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getDomain", "getErrorCode", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HuaweiCloudErrorDetail {

    @SerializedName("description")
    private final String description;

    @SerializedName("domain")
    private final String domain;

    @SerializedName("errorCode")
    private final String errorCode;

    @SerializedName("reason")
    private final String reason;

    public HuaweiCloudErrorDetail(String reason, String domain, String errorCode, String description) {
        OooOOO0.OooO0oO(reason, "reason");
        OooOOO0.OooO0oO(domain, "domain");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(description, "description");
        this.reason = reason;
        this.domain = domain;
        this.errorCode = errorCode;
        this.description = description;
    }

    public static /* synthetic */ HuaweiCloudErrorDetail copy$default(HuaweiCloudErrorDetail huaweiCloudErrorDetail, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = huaweiCloudErrorDetail.reason;
        }
        if ((i & 2) != 0) {
            str2 = huaweiCloudErrorDetail.domain;
        }
        if ((i & 4) != 0) {
            str3 = huaweiCloudErrorDetail.errorCode;
        }
        if ((i & 8) != 0) {
            str4 = huaweiCloudErrorDetail.description;
        }
        return huaweiCloudErrorDetail.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final HuaweiCloudErrorDetail copy(String reason, String domain, String errorCode, String description) {
        OooOOO0.OooO0oO(reason, "reason");
        OooOOO0.OooO0oO(domain, "domain");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(description, "description");
        return new HuaweiCloudErrorDetail(reason, domain, errorCode, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuaweiCloudErrorDetail)) {
            return false;
        }
        HuaweiCloudErrorDetail huaweiCloudErrorDetail = (HuaweiCloudErrorDetail) other;
        return OooOOO0.OooO0O0(this.reason, huaweiCloudErrorDetail.reason) && OooOOO0.OooO0O0(this.domain, huaweiCloudErrorDetail.domain) && OooOOO0.OooO0O0(this.errorCode, huaweiCloudErrorDetail.errorCode) && OooOOO0.OooO0O0(this.description, huaweiCloudErrorDetail.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.description.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(this.reason.hashCode() * 31, 31, this.domain), 31, this.errorCode);
    }

    public String toString() {
        String str = this.reason;
        String str2 = this.domain;
        return C21445Oooo.OooO0O0(OooO0o.OooO0O0("HuaweiCloudErrorDetail(reason=", str, ", domain=", str2, ", errorCode="), this.errorCode, ", description=", this.description, ")");
    }
}
