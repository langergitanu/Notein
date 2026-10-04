package com.orion.notein.domain.models.cloud;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/HuaweiCloudErrorContent;", "", "error", "Lcom/orion/notein/domain/models/cloud/HuaweiCloudError;", "<init>", "(Lcom/orion/notein/domain/models/cloud/HuaweiCloudError;)V", "getError", "()Lcom/orion/notein/domain/models/cloud/HuaweiCloudError;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HuaweiCloudErrorContent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR_RESOURCE_NOT_EXIST = "21084041";

    @SerializedName("error")
    private final HuaweiCloudError error;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/HuaweiCloudErrorContent$Companion;", "", "<init>", "()V", "ERROR_RESOURCE_NOT_EXIST", "", "getERROR_RESOURCE_NOT_EXIST$annotations", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ void getERROR_RESOURCE_NOT_EXIST$annotations() {
        }

        private Companion() {
        }
    }

    public HuaweiCloudErrorContent(HuaweiCloudError error) {
        OooOOO0.OooO0oO(error, "error");
        this.error = error;
    }

    public static /* synthetic */ HuaweiCloudErrorContent copy$default(HuaweiCloudErrorContent huaweiCloudErrorContent, HuaweiCloudError huaweiCloudError, int i, Object obj) {
        if ((i & 1) != 0) {
            huaweiCloudError = huaweiCloudErrorContent.error;
        }
        return huaweiCloudErrorContent.copy(huaweiCloudError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HuaweiCloudError getError() {
        return this.error;
    }

    public final HuaweiCloudErrorContent copy(HuaweiCloudError error) {
        OooOOO0.OooO0oO(error, "error");
        return new HuaweiCloudErrorContent(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HuaweiCloudErrorContent) && OooOOO0.OooO0O0(this.error, ((HuaweiCloudErrorContent) other).error);
    }

    public final HuaweiCloudError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return "HuaweiCloudErrorContent(error=" + this.error + ")";
    }
}
