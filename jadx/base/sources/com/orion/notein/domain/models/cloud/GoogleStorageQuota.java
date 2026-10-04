package com.orion.notein.domain.models.cloud;

import android.support.v4.media.session.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import o00oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/GoogleStorageQuota;", "", "userCapacity", "", "usedSpace", "<init>", "(JJ)V", "getUserCapacity", "()J", "getUsedSpace", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class GoogleStorageQuota {

    @SerializedName("usage")
    private final long usedSpace;

    @SerializedName("limit")
    private final long userCapacity;

    public GoogleStorageQuota(long j, long j2) {
        this.userCapacity = j;
        this.usedSpace = j2;
    }

    public static /* synthetic */ GoogleStorageQuota copy$default(GoogleStorageQuota googleStorageQuota, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = googleStorageQuota.userCapacity;
        }
        if ((i & 2) != 0) {
            j2 = googleStorageQuota.usedSpace;
        }
        return googleStorageQuota.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserCapacity() {
        return this.userCapacity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUsedSpace() {
        return this.usedSpace;
    }

    public final GoogleStorageQuota copy(long userCapacity, long usedSpace) {
        return new GoogleStorageQuota(userCapacity, usedSpace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleStorageQuota)) {
            return false;
        }
        GoogleStorageQuota googleStorageQuota = (GoogleStorageQuota) other;
        return this.userCapacity == googleStorageQuota.userCapacity && this.usedSpace == googleStorageQuota.usedSpace;
    }

    public final long getUsedSpace() {
        return this.usedSpace;
    }

    public final long getUserCapacity() {
        return this.userCapacity;
    }

    public int hashCode() {
        return Long.hashCode(this.usedSpace) + (Long.hashCode(this.userCapacity) * 31);
    }

    public String toString() {
        return OooO00o.OooO00o(this.usedSpace, ")", o0OoOo0.OooO00o(this.userCapacity, "GoogleStorageQuota(userCapacity=", ", usedSpace="));
    }
}
