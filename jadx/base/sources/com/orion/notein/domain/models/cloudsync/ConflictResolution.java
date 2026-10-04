package com.orion.notein.domain.models.cloudsync;

import com.orion.notein.domain.models.cloudsync.SyncPostAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;", "", "resolvedMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "postAction", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "<init>", "(Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;)V", "getResolvedMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "getPostAction", "()Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ConflictResolution {
    private final SyncPostAction postAction;
    private final CloudMetaLocal resolvedMeta;

    public ConflictResolution(CloudMetaLocal resolvedMeta, SyncPostAction postAction) {
        OooOOO0.OooO0oO(resolvedMeta, "resolvedMeta");
        OooOOO0.OooO0oO(postAction, "postAction");
        this.resolvedMeta = resolvedMeta;
        this.postAction = postAction;
    }

    public static /* synthetic */ ConflictResolution copy$default(ConflictResolution conflictResolution, CloudMetaLocal cloudMetaLocal, SyncPostAction syncPostAction, int i, Object obj) {
        if ((i & 1) != 0) {
            cloudMetaLocal = conflictResolution.resolvedMeta;
        }
        if ((i & 2) != 0) {
            syncPostAction = conflictResolution.postAction;
        }
        return conflictResolution.copy(cloudMetaLocal, syncPostAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CloudMetaLocal getResolvedMeta() {
        return this.resolvedMeta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SyncPostAction getPostAction() {
        return this.postAction;
    }

    public final ConflictResolution copy(CloudMetaLocal resolvedMeta, SyncPostAction postAction) {
        OooOOO0.OooO0oO(resolvedMeta, "resolvedMeta");
        OooOOO0.OooO0oO(postAction, "postAction");
        return new ConflictResolution(resolvedMeta, postAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConflictResolution)) {
            return false;
        }
        ConflictResolution conflictResolution = (ConflictResolution) other;
        return OooOOO0.OooO0O0(this.resolvedMeta, conflictResolution.resolvedMeta) && OooOOO0.OooO0O0(this.postAction, conflictResolution.postAction);
    }

    public final SyncPostAction getPostAction() {
        return this.postAction;
    }

    public final CloudMetaLocal getResolvedMeta() {
        return this.resolvedMeta;
    }

    public int hashCode() {
        return this.postAction.hashCode() + (this.resolvedMeta.hashCode() * 31);
    }

    public String toString() {
        return "ConflictResolution(resolvedMeta=" + this.resolvedMeta + ", postAction=" + this.postAction + ")";
    }

    public /* synthetic */ ConflictResolution(CloudMetaLocal cloudMetaLocal, SyncPostAction syncPostAction, int i, C24018OooO0oo c24018OooO0oo) {
        this(cloudMetaLocal, (i & 2) != 0 ? SyncPostAction.None.INSTANCE : syncPostAction);
    }
}
