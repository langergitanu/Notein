package com.orion.notein.domain.models.cloud;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.aspose.slides.OooOOO;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006!"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/HuaweiCloudInfo;", "", "category", "", "maxFileUploadSize", "", "storageQuota", "Lcom/orion/notein/domain/models/cloud/HuaweiStorageQuota;", "needUpdate", "", "updateUrl", "<init>", "(Ljava/lang/String;JLcom/orion/notein/domain/models/cloud/HuaweiStorageQuota;ZLjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getMaxFileUploadSize", "()J", "getStorageQuota", "()Lcom/orion/notein/domain/models/cloud/HuaweiStorageQuota;", "getNeedUpdate", "()Z", "getUpdateUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HuaweiCloudInfo {

    @SerializedName("category")
    private final String category;

    @SerializedName("maxFileUploadSize")
    private final long maxFileUploadSize;

    @SerializedName("needUpdate")
    private final boolean needUpdate;

    @SerializedName("storageQuota")
    private final HuaweiStorageQuota storageQuota;

    @SerializedName("updateUrl")
    private final String updateUrl;

    public HuaweiCloudInfo(String category, long j, HuaweiStorageQuota storageQuota, boolean z, String updateUrl) {
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(storageQuota, "storageQuota");
        OooOOO0.OooO0oO(updateUrl, "updateUrl");
        this.category = category;
        this.maxFileUploadSize = j;
        this.storageQuota = storageQuota;
        this.needUpdate = z;
        this.updateUrl = updateUrl;
    }

    public static /* synthetic */ HuaweiCloudInfo copy$default(HuaweiCloudInfo huaweiCloudInfo, String str, long j, HuaweiStorageQuota huaweiStorageQuota, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = huaweiCloudInfo.category;
        }
        if ((i & 2) != 0) {
            j = huaweiCloudInfo.maxFileUploadSize;
        }
        if ((i & 4) != 0) {
            huaweiStorageQuota = huaweiCloudInfo.storageQuota;
        }
        if ((i & 8) != 0) {
            z = huaweiCloudInfo.needUpdate;
        }
        if ((i & 16) != 0) {
            str2 = huaweiCloudInfo.updateUrl;
        }
        String str3 = str2;
        HuaweiStorageQuota huaweiStorageQuota2 = huaweiStorageQuota;
        return huaweiCloudInfo.copy(str, j, huaweiStorageQuota2, z, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMaxFileUploadSize() {
        return this.maxFileUploadSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HuaweiStorageQuota getStorageQuota() {
        return this.storageQuota;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    public final HuaweiCloudInfo copy(String category, long maxFileUploadSize, HuaweiStorageQuota storageQuota, boolean needUpdate, String updateUrl) {
        OooOOO0.OooO0oO(category, "category");
        OooOOO0.OooO0oO(storageQuota, "storageQuota");
        OooOOO0.OooO0oO(updateUrl, "updateUrl");
        return new HuaweiCloudInfo(category, maxFileUploadSize, storageQuota, needUpdate, updateUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HuaweiCloudInfo)) {
            return false;
        }
        HuaweiCloudInfo huaweiCloudInfo = (HuaweiCloudInfo) other;
        return OooOOO0.OooO0O0(this.category, huaweiCloudInfo.category) && this.maxFileUploadSize == huaweiCloudInfo.maxFileUploadSize && OooOOO0.OooO0O0(this.storageQuota, huaweiCloudInfo.storageQuota) && this.needUpdate == huaweiCloudInfo.needUpdate && OooOOO0.OooO0O0(this.updateUrl, huaweiCloudInfo.updateUrl);
    }

    public final String getCategory() {
        return this.category;
    }

    public final long getMaxFileUploadSize() {
        return this.maxFileUploadSize;
    }

    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public final HuaweiStorageQuota getStorageQuota() {
        return this.storageQuota;
    }

    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    public int hashCode() {
        return this.updateUrl.hashCode() + o00000.OooO0O0((this.storageQuota.hashCode() + C20703o000000o.OooO0O0(this.category.hashCode() * 31, 31, this.maxFileUploadSize)) * 31, 31, this.needUpdate);
    }

    public String toString() {
        String str = this.category;
        long j = this.maxFileUploadSize;
        HuaweiStorageQuota huaweiStorageQuota = this.storageQuota;
        boolean z = this.needUpdate;
        String str2 = this.updateUrl;
        StringBuilder sb = new StringBuilder("HuaweiCloudInfo(category=");
        sb.append(str);
        sb.append(", maxFileUploadSize=");
        sb.append(j);
        sb.append(", storageQuota=");
        sb.append(huaweiStorageQuota);
        sb.append(", needUpdate=");
        sb.append(z);
        return OooOOO.OooO0O0(sb, ", updateUrl=", str2, ")");
    }
}
