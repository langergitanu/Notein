package com.orion.notein.domain.models.cloudsync;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncContext;", "", "dirtyCloudMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "autoRetryUploadCount", "", "lastAutoRetryAt", "", "autoRetryDownloadCount", "<init>", "(Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;IJI)V", "getDirtyCloudMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "getAutoRetryUploadCount", "()I", "getLastAutoRetryAt", "()J", "getAutoRetryDownloadCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SyncContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SyncContext Empty = new SyncContext(null, 0, 0, 0, 15, null);
    private final int autoRetryDownloadCount;
    private final int autoRetryUploadCount;
    private final CloudMetaRemote dirtyCloudMeta;
    private final long lastAutoRetryAt;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncContext$Companion;", "", "<init>", "()V", "Empty", "Lcom/orion/notein/domain/models/cloudsync/SyncContext;", "getEmpty", "()Lcom/orion/notein/domain/models/cloudsync/SyncContext;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final SyncContext getEmpty() {
            return SyncContext.Empty;
        }

        private Companion() {
        }
    }

    public SyncContext() {
        this(null, 0, 0L, 0, 15, null);
    }

    public static /* synthetic */ SyncContext copy$default(SyncContext syncContext, CloudMetaRemote cloudMetaRemote, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cloudMetaRemote = syncContext.dirtyCloudMeta;
        }
        if ((i3 & 2) != 0) {
            i = syncContext.autoRetryUploadCount;
        }
        if ((i3 & 4) != 0) {
            j = syncContext.lastAutoRetryAt;
        }
        if ((i3 & 8) != 0) {
            i2 = syncContext.autoRetryDownloadCount;
        }
        int i4 = i2;
        return syncContext.copy(cloudMetaRemote, i, j, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CloudMetaRemote getDirtyCloudMeta() {
        return this.dirtyCloudMeta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAutoRetryUploadCount() {
        return this.autoRetryUploadCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastAutoRetryAt() {
        return this.lastAutoRetryAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAutoRetryDownloadCount() {
        return this.autoRetryDownloadCount;
    }

    public final SyncContext copy(CloudMetaRemote dirtyCloudMeta, int autoRetryUploadCount, long lastAutoRetryAt, int autoRetryDownloadCount) {
        return new SyncContext(dirtyCloudMeta, autoRetryUploadCount, lastAutoRetryAt, autoRetryDownloadCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncContext)) {
            return false;
        }
        SyncContext syncContext = (SyncContext) other;
        return OooOOO0.OooO0O0(this.dirtyCloudMeta, syncContext.dirtyCloudMeta) && this.autoRetryUploadCount == syncContext.autoRetryUploadCount && this.lastAutoRetryAt == syncContext.lastAutoRetryAt && this.autoRetryDownloadCount == syncContext.autoRetryDownloadCount;
    }

    public final int getAutoRetryDownloadCount() {
        return this.autoRetryDownloadCount;
    }

    public final int getAutoRetryUploadCount() {
        return this.autoRetryUploadCount;
    }

    public final CloudMetaRemote getDirtyCloudMeta() {
        return this.dirtyCloudMeta;
    }

    public final long getLastAutoRetryAt() {
        return this.lastAutoRetryAt;
    }

    public int hashCode() {
        CloudMetaRemote cloudMetaRemote = this.dirtyCloudMeta;
        return Integer.hashCode(this.autoRetryDownloadCount) + C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.autoRetryUploadCount, (cloudMetaRemote == null ? 0 : cloudMetaRemote.hashCode()) * 31, 31), 31, this.lastAutoRetryAt);
    }

    public String toString() {
        return "SyncContext(dirtyCloudMeta=" + this.dirtyCloudMeta + ", autoRetryUploadCount=" + this.autoRetryUploadCount + ", lastAutoRetryAt=" + this.lastAutoRetryAt + ", autoRetryDownloadCount=" + this.autoRetryDownloadCount + ")";
    }

    public SyncContext(CloudMetaRemote cloudMetaRemote, int i, long j, int i2) {
        this.dirtyCloudMeta = cloudMetaRemote;
        this.autoRetryUploadCount = i;
        this.lastAutoRetryAt = j;
        this.autoRetryDownloadCount = i2;
    }

    public /* synthetic */ SyncContext(CloudMetaRemote cloudMetaRemote, int i, long j, int i2, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? null : cloudMetaRemote, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0 : i2);
    }
}
