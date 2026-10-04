package com.orion.notein.domain.models.cloud;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/GoogleCloudErrorContent;", "", "error", "Lcom/orion/notein/domain/models/cloud/GoogleCloudError;", "<init>", "(Lcom/orion/notein/domain/models/cloud/GoogleCloudError;)V", "getError", "()Lcom/orion/notein/domain/models/cloud/GoogleCloudError;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class GoogleCloudErrorContent {

    @SerializedName("error")
    private final GoogleCloudError error;

    public GoogleCloudErrorContent(GoogleCloudError error) {
        OooOOO0.OooO0oO(error, "error");
        this.error = error;
    }

    public static /* synthetic */ GoogleCloudErrorContent copy$default(GoogleCloudErrorContent googleCloudErrorContent, GoogleCloudError googleCloudError, int i, Object obj) {
        if ((i & 1) != 0) {
            googleCloudError = googleCloudErrorContent.error;
        }
        return googleCloudErrorContent.copy(googleCloudError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GoogleCloudError getError() {
        return this.error;
    }

    public final GoogleCloudErrorContent copy(GoogleCloudError error) {
        OooOOO0.OooO0oO(error, "error");
        return new GoogleCloudErrorContent(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoogleCloudErrorContent) && OooOOO0.OooO0O0(this.error, ((GoogleCloudErrorContent) other).error);
    }

    public final GoogleCloudError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return "GoogleCloudErrorContent(error=" + this.error + ")";
    }
}
