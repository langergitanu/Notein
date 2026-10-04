package com.orion.notein.domain.models.cloudsync;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "", "dirtyCloudMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "dirtyLocalMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "<init>", "(Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;)V", "getDirtyCloudMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "getDirtyLocalMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SyncEventPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SyncEventPayload None = new SyncEventPayload(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    private final CloudMetaRemote dirtyCloudMeta;
    private final CloudMetaLocal dirtyLocalMeta;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload$Companion;", "", "<init>", "()V", "None", "Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "getNone", "()Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final SyncEventPayload getNone() {
            return SyncEventPayload.None;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncEventPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SyncEventPayload copy$default(SyncEventPayload syncEventPayload, CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            cloudMetaRemote = syncEventPayload.dirtyCloudMeta;
        }
        if ((i & 2) != 0) {
            cloudMetaLocal = syncEventPayload.dirtyLocalMeta;
        }
        return syncEventPayload.copy(cloudMetaRemote, cloudMetaLocal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CloudMetaRemote getDirtyCloudMeta() {
        return this.dirtyCloudMeta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CloudMetaLocal getDirtyLocalMeta() {
        return this.dirtyLocalMeta;
    }

    public final SyncEventPayload copy(CloudMetaRemote dirtyCloudMeta, CloudMetaLocal dirtyLocalMeta) {
        return new SyncEventPayload(dirtyCloudMeta, dirtyLocalMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncEventPayload)) {
            return false;
        }
        SyncEventPayload syncEventPayload = (SyncEventPayload) other;
        return OooOOO0.OooO0O0(this.dirtyCloudMeta, syncEventPayload.dirtyCloudMeta) && OooOOO0.OooO0O0(this.dirtyLocalMeta, syncEventPayload.dirtyLocalMeta);
    }

    public final CloudMetaRemote getDirtyCloudMeta() {
        return this.dirtyCloudMeta;
    }

    public final CloudMetaLocal getDirtyLocalMeta() {
        return this.dirtyLocalMeta;
    }

    public int hashCode() {
        CloudMetaRemote cloudMetaRemote = this.dirtyCloudMeta;
        int iHashCode = (cloudMetaRemote == null ? 0 : cloudMetaRemote.hashCode()) * 31;
        CloudMetaLocal cloudMetaLocal = this.dirtyLocalMeta;
        return iHashCode + (cloudMetaLocal != null ? cloudMetaLocal.hashCode() : 0);
    }

    public String toString() {
        return "SyncEventPayload(dirtyCloudMeta=" + this.dirtyCloudMeta + ", dirtyLocalMeta=" + this.dirtyLocalMeta + ")";
    }

    public SyncEventPayload(CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal) {
        this.dirtyCloudMeta = cloudMetaRemote;
        this.dirtyLocalMeta = cloudMetaLocal;
    }

    public /* synthetic */ SyncEventPayload(CloudMetaRemote cloudMetaRemote, CloudMetaLocal cloudMetaLocal, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : cloudMetaRemote, (i & 2) != 0 ? null : cloudMetaLocal);
    }
}
