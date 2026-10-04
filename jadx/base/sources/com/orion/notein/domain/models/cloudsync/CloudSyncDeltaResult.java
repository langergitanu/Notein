package com.orion.notein.domain.models.cloudsync;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncDeltaResult;", "", FirebaseAnalytics.Param.SUCCESS, "", "emittedEvents", "", "skipped", "reason", "", "shouldRetry", "<init>", "(ZIZLjava/lang/String;Z)V", "getSuccess", "()Z", "getEmittedEvents", "()I", "getSkipped", "getReason", "()Ljava/lang/String;", "getShouldRetry", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudSyncDeltaResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int emittedEvents;
    private final String reason;
    private final boolean shouldRetry;
    private final boolean skipped;
    private final boolean success;

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncDeltaResult$Companion;", "", "<init>", "()V", FirebaseAnalytics.Param.SUCCESS, "Lcom/orion/notein/domain/models/cloudsync/CloudSyncDeltaResult;", "emittedEvents", "", "skipped", "reason", "", "failure", "retry", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ CloudSyncDeltaResult failure$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return companion.failure(str, z);
        }

        public static /* synthetic */ CloudSyncDeltaResult skipped$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.skipped(str);
        }

        public static /* synthetic */ CloudSyncDeltaResult success$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return companion.success(i);
        }

        public final CloudSyncDeltaResult failure(String reason, boolean retry) {
            return new CloudSyncDeltaResult(false, 0, false, reason, retry);
        }

        public final CloudSyncDeltaResult skipped(String reason) {
            return new CloudSyncDeltaResult(true, 0, true, reason, false, 16, null);
        }

        public final CloudSyncDeltaResult success(int emittedEvents) {
            return new CloudSyncDeltaResult(true, emittedEvents, false, null, false, 28, null);
        }

        private Companion() {
        }
    }

    public CloudSyncDeltaResult(boolean z, int i, boolean z2, String str, boolean z3) {
        this.success = z;
        this.emittedEvents = i;
        this.skipped = z2;
        this.reason = str;
        this.shouldRetry = z3;
    }

    public static /* synthetic */ CloudSyncDeltaResult copy$default(CloudSyncDeltaResult cloudSyncDeltaResult, boolean z, int i, boolean z2, String str, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cloudSyncDeltaResult.success;
        }
        if ((i2 & 2) != 0) {
            i = cloudSyncDeltaResult.emittedEvents;
        }
        if ((i2 & 4) != 0) {
            z2 = cloudSyncDeltaResult.skipped;
        }
        if ((i2 & 8) != 0) {
            str = cloudSyncDeltaResult.reason;
        }
        if ((i2 & 16) != 0) {
            z3 = cloudSyncDeltaResult.shouldRetry;
        }
        boolean z4 = z3;
        boolean z5 = z2;
        return cloudSyncDeltaResult.copy(z, i, z5, str, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEmittedEvents() {
        return this.emittedEvents;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    public final CloudSyncDeltaResult copy(boolean success, int emittedEvents, boolean skipped, String reason, boolean shouldRetry) {
        return new CloudSyncDeltaResult(success, emittedEvents, skipped, reason, shouldRetry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudSyncDeltaResult)) {
            return false;
        }
        CloudSyncDeltaResult cloudSyncDeltaResult = (CloudSyncDeltaResult) other;
        return this.success == cloudSyncDeltaResult.success && this.emittedEvents == cloudSyncDeltaResult.emittedEvents && this.skipped == cloudSyncDeltaResult.skipped && OooOOO0.OooO0O0(this.reason, cloudSyncDeltaResult.reason) && this.shouldRetry == cloudSyncDeltaResult.shouldRetry;
    }

    public final int getEmittedEvents() {
        return this.emittedEvents;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    public final boolean getSkipped() {
        return this.skipped;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(C20785Oooo00o.OooO00o(this.emittedEvents, Boolean.hashCode(this.success) * 31, 31), 31, this.skipped);
        String str = this.reason;
        return Boolean.hashCode(this.shouldRetry) + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        boolean z = this.success;
        int i = this.emittedEvents;
        boolean z2 = this.skipped;
        String str = this.reason;
        boolean z3 = this.shouldRetry;
        StringBuilder sb = new StringBuilder("CloudSyncDeltaResult(success=");
        sb.append(z);
        sb.append(", emittedEvents=");
        sb.append(i);
        sb.append(", skipped=");
        sb.append(z2);
        sb.append(", reason=");
        sb.append(str);
        sb.append(", shouldRetry=");
        return OooOOO.OooO00o(sb, ")", z3);
    }

    public /* synthetic */ CloudSyncDeltaResult(boolean z, int i, boolean z2, String str, boolean z3, int i2, C24018OooO0oo c24018OooO0oo) {
        this(z, i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z3);
    }
}
