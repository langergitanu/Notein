package com.orion.notein.domain.models.cloudsync;

import OooOoo.C20593OooO0Oo;
import androidx.appcompat.app.OooOOO;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0014\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0014 !\"#$%&'()*+,-./0123ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "payload", "Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "getPayload", "()Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "LocalModified", "CloudModified", "LocalDeleted", "CloudDeleted", "RequestPush", "RequestPull", "UploadSucceeded", "UploadFailed", "DownloadSucceeded", "DownloadFailed", "RemoteNotFoundResolved", "PackageSucceeded", "PackageFailed", "RestoreSucceeded", "RestoreFailed", "RequestResolve", "ResolveSucceeded", "ResolveFailed", "AutoResolveSucceeded", "ContentConflict", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$AutoResolveSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$CloudDeleted;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$CloudModified;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$ContentConflict;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$DownloadFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$DownloadSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$LocalDeleted;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$LocalModified;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$PackageFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$PackageSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RemoteNotFoundResolved;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RequestPull;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RequestPush;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RequestResolve;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$ResolveFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$ResolveSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RestoreFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RestoreSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$UploadFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent$UploadSucceeded;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface SyncEvent {

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$AutoResolveSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "resolvedResult", "Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;)V", "getId", "()Ljava/lang/String;", "getResolvedResult", "()Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class AutoResolveSucceeded implements SyncEvent {
        private final String id;
        private final ConflictResolution resolvedResult;

        public AutoResolveSucceeded(String id, ConflictResolution resolvedResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(resolvedResult, "resolvedResult");
            this.id = id;
            this.resolvedResult = resolvedResult;
        }

        public static /* synthetic */ AutoResolveSucceeded copy$default(AutoResolveSucceeded autoResolveSucceeded, String str, ConflictResolution conflictResolution, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autoResolveSucceeded.id;
            }
            if ((i & 2) != 0) {
                conflictResolution = autoResolveSucceeded.resolvedResult;
            }
            return autoResolveSucceeded.copy(str, conflictResolution);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConflictResolution getResolvedResult() {
            return this.resolvedResult;
        }

        public final AutoResolveSucceeded copy(String id, ConflictResolution resolvedResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(resolvedResult, "resolvedResult");
            return new AutoResolveSucceeded(id, resolvedResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoResolveSucceeded)) {
                return false;
            }
            AutoResolveSucceeded autoResolveSucceeded = (AutoResolveSucceeded) other;
            return OooOOO0.OooO0O0(this.id, autoResolveSucceeded.id) && OooOOO0.OooO0O0(this.resolvedResult, autoResolveSucceeded.resolvedResult);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "AutoResolveSucceeded";
        }

        public final ConflictResolution getResolvedResult() {
            return this.resolvedResult;
        }

        public int hashCode() {
            return this.resolvedResult.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "AutoResolveSucceeded(id=" + this.id + ", resolvedResult=" + this.resolvedResult + ")";
        }
    }

    @Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$CloudDeleted;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "dirtyCloudMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;)V", "getId", "()Ljava/lang/String;", "getDirtyCloudMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "name", "getName", "payload", "Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "getPayload", "()Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class CloudDeleted implements SyncEvent {
        private final CloudMetaRemote dirtyCloudMeta;
        private final String id;

        public CloudDeleted(String id, CloudMetaRemote dirtyCloudMeta) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
            this.id = id;
            this.dirtyCloudMeta = dirtyCloudMeta;
        }

        public static /* synthetic */ CloudDeleted copy$default(CloudDeleted cloudDeleted, String str, CloudMetaRemote cloudMetaRemote, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cloudDeleted.id;
            }
            if ((i & 2) != 0) {
                cloudMetaRemote = cloudDeleted.dirtyCloudMeta;
            }
            return cloudDeleted.copy(str, cloudMetaRemote);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaRemote getDirtyCloudMeta() {
            return this.dirtyCloudMeta;
        }

        public final CloudDeleted copy(String id, CloudMetaRemote dirtyCloudMeta) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
            return new CloudDeleted(id, dirtyCloudMeta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloudDeleted)) {
                return false;
            }
            CloudDeleted cloudDeleted = (CloudDeleted) other;
            return OooOOO0.OooO0O0(this.id, cloudDeleted.id) && OooOOO0.OooO0O0(this.dirtyCloudMeta, cloudDeleted.dirtyCloudMeta);
        }

        public final CloudMetaRemote getDirtyCloudMeta() {
            return this.dirtyCloudMeta;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "CloudDeleted";
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public SyncEventPayload getPayload() {
            return new SyncEventPayload(this.dirtyCloudMeta, null, 2, null);
        }

        public int hashCode() {
            return this.dirtyCloudMeta.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "CloudDeleted(id=" + this.id + ", dirtyCloudMeta=" + this.dirtyCloudMeta + ")";
        }
    }

    @Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$CloudModified;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "dirtyCloudMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;)V", "getId", "()Ljava/lang/String;", "getDirtyCloudMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "name", "getName", "payload", "Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "getPayload", "()Lcom/orion/notein/domain/models/cloudsync/SyncEventPayload;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class CloudModified implements SyncEvent {
        private final CloudMetaRemote dirtyCloudMeta;
        private final String id;

        public CloudModified(String id, CloudMetaRemote dirtyCloudMeta) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
            this.id = id;
            this.dirtyCloudMeta = dirtyCloudMeta;
        }

        public static /* synthetic */ CloudModified copy$default(CloudModified cloudModified, String str, CloudMetaRemote cloudMetaRemote, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cloudModified.id;
            }
            if ((i & 2) != 0) {
                cloudMetaRemote = cloudModified.dirtyCloudMeta;
            }
            return cloudModified.copy(str, cloudMetaRemote);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaRemote getDirtyCloudMeta() {
            return this.dirtyCloudMeta;
        }

        public final CloudModified copy(String id, CloudMetaRemote dirtyCloudMeta) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
            return new CloudModified(id, dirtyCloudMeta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloudModified)) {
                return false;
            }
            CloudModified cloudModified = (CloudModified) other;
            return OooOOO0.OooO0O0(this.id, cloudModified.id) && OooOOO0.OooO0O0(this.dirtyCloudMeta, cloudModified.dirtyCloudMeta);
        }

        public final CloudMetaRemote getDirtyCloudMeta() {
            return this.dirtyCloudMeta;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "CloudModified";
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public SyncEventPayload getPayload() {
            return new SyncEventPayload(this.dirtyCloudMeta, null, 2, null);
        }

        public int hashCode() {
            return this.dirtyCloudMeta.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "CloudModified(id=" + this.id + ", dirtyCloudMeta=" + this.dirtyCloudMeta + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$ContentConflict;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "name", "getName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class ContentConflict implements SyncEvent {
        private final String id;

        public ContentConflict(String id) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
        }

        public static /* synthetic */ ContentConflict copy$default(ContentConflict contentConflict, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentConflict.id;
            }
            return contentConflict.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final ContentConflict copy(String id) {
            OooOOO0.OooO0oO(id, "id");
            return new ContentConflict(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentConflict) && OooOOO0.OooO0O0(this.id, ((ContentConflict) other).id);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "ContentConflict";
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("ContentConflict(id=", this.id, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$DownloadFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "error", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class DownloadFailed implements SyncEvent {
        private final Throwable error;
        private final String id;

        public DownloadFailed(String id, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            this.id = id;
            this.error = error;
        }

        public static /* synthetic */ DownloadFailed copy$default(DownloadFailed downloadFailed, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadFailed.id;
            }
            if ((i & 2) != 0) {
                th = downloadFailed.error;
            }
            return downloadFailed.copy(str, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final DownloadFailed copy(String id, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            return new DownloadFailed(id, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadFailed)) {
                return false;
            }
            DownloadFailed downloadFailed = (DownloadFailed) other;
            return OooOOO0.OooO0O0(this.id, downloadFailed.id) && OooOOO0.OooO0O0(this.error, downloadFailed.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "DownloadFailed";
        }

        public int hashCode() {
            return this.error.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "DownloadFailed(id=" + this.id + ", error=" + this.error + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$DownloadSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "bundle", "Lcom/orion/notein/domain/models/cloudsync/CloudBundle;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudBundle;)V", "getId", "()Ljava/lang/String;", "getBundle", "()Lcom/orion/notein/domain/models/cloudsync/CloudBundle;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class DownloadSucceeded implements SyncEvent {
        private final CloudBundle bundle;
        private final String id;

        public DownloadSucceeded(String id, CloudBundle bundle) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(bundle, "bundle");
            this.id = id;
            this.bundle = bundle;
        }

        public static /* synthetic */ DownloadSucceeded copy$default(DownloadSucceeded downloadSucceeded, String str, CloudBundle cloudBundle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadSucceeded.id;
            }
            if ((i & 2) != 0) {
                cloudBundle = downloadSucceeded.bundle;
            }
            return downloadSucceeded.copy(str, cloudBundle);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudBundle getBundle() {
            return this.bundle;
        }

        public final DownloadSucceeded copy(String id, CloudBundle bundle) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(bundle, "bundle");
            return new DownloadSucceeded(id, bundle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadSucceeded)) {
                return false;
            }
            DownloadSucceeded downloadSucceeded = (DownloadSucceeded) other;
            return OooOOO0.OooO0O0(this.id, downloadSucceeded.id) && OooOOO0.OooO0O0(this.bundle, downloadSucceeded.bundle);
        }

        public final CloudBundle getBundle() {
            return this.bundle;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "DownloadSucceeded";
        }

        public int hashCode() {
            return this.bundle.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "DownloadSucceeded(id=" + this.id + ", bundle=" + this.bundle + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$LocalDeleted;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "name", "getName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class LocalDeleted implements SyncEvent {
        private final String id;

        public LocalDeleted(String id) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
        }

        public static /* synthetic */ LocalDeleted copy$default(LocalDeleted localDeleted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localDeleted.id;
            }
            return localDeleted.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final LocalDeleted copy(String id) {
            OooOOO0.OooO0oO(id, "id");
            return new LocalDeleted(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocalDeleted) && OooOOO0.OooO0O0(this.id, ((LocalDeleted) other).id);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "LocalDeleted";
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("LocalDeleted(id=", this.id, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$LocalModified;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "metaType", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;)V", "getId", "()Ljava/lang/String;", "getMetaType", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class LocalModified implements SyncEvent {
        private final String id;
        private final CloudMetaType metaType;

        public LocalModified(String id, CloudMetaType metaType) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(metaType, "metaType");
            this.id = id;
            this.metaType = metaType;
        }

        public static /* synthetic */ LocalModified copy$default(LocalModified localModified, String str, CloudMetaType cloudMetaType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localModified.id;
            }
            if ((i & 2) != 0) {
                cloudMetaType = localModified.metaType;
            }
            return localModified.copy(str, cloudMetaType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaType getMetaType() {
            return this.metaType;
        }

        public final LocalModified copy(String id, CloudMetaType metaType) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(metaType, "metaType");
            return new LocalModified(id, metaType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalModified)) {
                return false;
            }
            LocalModified localModified = (LocalModified) other;
            return OooOOO0.OooO0O0(this.id, localModified.id) && this.metaType == localModified.metaType;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        public final CloudMetaType getMetaType() {
            return this.metaType;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "LocalModified";
        }

        public int hashCode() {
            return this.metaType.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "LocalModified(id=" + this.id + ", metaType=" + this.metaType + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$PackageFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "error", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PackageFailed implements SyncEvent {
        private final Throwable error;
        private final String id;

        public PackageFailed(String id, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            this.id = id;
            this.error = error;
        }

        public static /* synthetic */ PackageFailed copy$default(PackageFailed packageFailed, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = packageFailed.id;
            }
            if ((i & 2) != 0) {
                th = packageFailed.error;
            }
            return packageFailed.copy(str, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final PackageFailed copy(String id, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            return new PackageFailed(id, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageFailed)) {
                return false;
            }
            PackageFailed packageFailed = (PackageFailed) other;
            return OooOOO0.OooO0O0(this.id, packageFailed.id) && OooOOO0.OooO0O0(this.error, packageFailed.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "PackageFailed";
        }

        public int hashCode() {
            return this.error.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "PackageFailed(id=" + this.id + ", error=" + this.error + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RemoteNotFoundResolved;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "postAction", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;)V", "getId", "()Ljava/lang/String;", "getPostAction", "()Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RemoteNotFoundResolved implements SyncEvent {
        private final String id;
        private final SyncPostAction postAction;

        public RemoteNotFoundResolved(String id, SyncPostAction postAction) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(postAction, "postAction");
            this.id = id;
            this.postAction = postAction;
        }

        public static /* synthetic */ RemoteNotFoundResolved copy$default(RemoteNotFoundResolved remoteNotFoundResolved, String str, SyncPostAction syncPostAction, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteNotFoundResolved.id;
            }
            if ((i & 2) != 0) {
                syncPostAction = remoteNotFoundResolved.postAction;
            }
            return remoteNotFoundResolved.copy(str, syncPostAction);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SyncPostAction getPostAction() {
            return this.postAction;
        }

        public final RemoteNotFoundResolved copy(String id, SyncPostAction postAction) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(postAction, "postAction");
            return new RemoteNotFoundResolved(id, postAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteNotFoundResolved)) {
                return false;
            }
            RemoteNotFoundResolved remoteNotFoundResolved = (RemoteNotFoundResolved) other;
            return OooOOO0.OooO0O0(this.id, remoteNotFoundResolved.id) && OooOOO0.OooO0O0(this.postAction, remoteNotFoundResolved.postAction);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "RemoteNotFoundResolved";
        }

        public final SyncPostAction getPostAction() {
            return this.postAction;
        }

        public int hashCode() {
            return this.postAction.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "RemoteNotFoundResolved(id=" + this.id + ", postAction=" + this.postAction + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RequestPull;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "name", "getName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RequestPull implements SyncEvent {
        private final String id;

        public RequestPull(String id) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
        }

        public static /* synthetic */ RequestPull copy$default(RequestPull requestPull, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestPull.id;
            }
            return requestPull.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final RequestPull copy(String id) {
            OooOOO0.OooO0oO(id, "id");
            return new RequestPull(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestPull) && OooOOO0.OooO0O0(this.id, ((RequestPull) other).id);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "RequestPull";
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("RequestPull(id=", this.id, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RequestResolve;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "name", "getName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RequestResolve implements SyncEvent {
        private final String id;

        public RequestResolve(String id) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
        }

        public static /* synthetic */ RequestResolve copy$default(RequestResolve requestResolve, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestResolve.id;
            }
            return requestResolve.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final RequestResolve copy(String id) {
            OooOOO0.OooO0oO(id, "id");
            return new RequestResolve(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestResolve) && OooOOO0.OooO0O0(this.id, ((RequestResolve) other).id);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "RequestResolve";
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("RequestResolve(id=", this.id, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$ResolveFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "error", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class ResolveFailed implements SyncEvent {
        private final Throwable error;
        private final String id;

        public ResolveFailed(String id, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            this.id = id;
            this.error = error;
        }

        public static /* synthetic */ ResolveFailed copy$default(ResolveFailed resolveFailed, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolveFailed.id;
            }
            if ((i & 2) != 0) {
                th = resolveFailed.error;
            }
            return resolveFailed.copy(str, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final ResolveFailed copy(String id, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            return new ResolveFailed(id, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResolveFailed)) {
                return false;
            }
            ResolveFailed resolveFailed = (ResolveFailed) other;
            return OooOOO0.OooO0O0(this.id, resolveFailed.id) && OooOOO0.OooO0O0(this.error, resolveFailed.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "ResolveFailed";
        }

        public int hashCode() {
            return this.error.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "ResolveFailed(id=" + this.id + ", error=" + this.error + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$ResolveSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "resolvedResult", "Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;)V", "getId", "()Ljava/lang/String;", "getResolvedResult", "()Lcom/orion/notein/domain/models/cloudsync/ConflictResolution;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class ResolveSucceeded implements SyncEvent {
        private final String id;
        private final ConflictResolution resolvedResult;

        public ResolveSucceeded(String id, ConflictResolution resolvedResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(resolvedResult, "resolvedResult");
            this.id = id;
            this.resolvedResult = resolvedResult;
        }

        public static /* synthetic */ ResolveSucceeded copy$default(ResolveSucceeded resolveSucceeded, String str, ConflictResolution conflictResolution, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolveSucceeded.id;
            }
            if ((i & 2) != 0) {
                conflictResolution = resolveSucceeded.resolvedResult;
            }
            return resolveSucceeded.copy(str, conflictResolution);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConflictResolution getResolvedResult() {
            return this.resolvedResult;
        }

        public final ResolveSucceeded copy(String id, ConflictResolution resolvedResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(resolvedResult, "resolvedResult");
            return new ResolveSucceeded(id, resolvedResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResolveSucceeded)) {
                return false;
            }
            ResolveSucceeded resolveSucceeded = (ResolveSucceeded) other;
            return OooOOO0.OooO0O0(this.id, resolveSucceeded.id) && OooOOO0.OooO0O0(this.resolvedResult, resolveSucceeded.resolvedResult);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "ResolveSucceeded";
        }

        public final ConflictResolution getResolvedResult() {
            return this.resolvedResult;
        }

        public int hashCode() {
            return this.resolvedResult.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "ResolveSucceeded(id=" + this.id + ", resolvedResult=" + this.resolvedResult + ")";
        }
    }

    @Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RestoreFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "metaType", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "error", "", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;Ljava/lang/Throwable;)V", "getId", "()Ljava/lang/String;", "getMetaType", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "getError", "()Ljava/lang/Throwable;", "name", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RestoreFailed implements SyncEvent {
        private final Throwable error;
        private final String id;
        private final CloudMetaType metaType;

        public RestoreFailed(String id, CloudMetaType metaType, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(metaType, "metaType");
            OooOOO0.OooO0oO(error, "error");
            this.id = id;
            this.metaType = metaType;
            this.error = error;
        }

        public static /* synthetic */ RestoreFailed copy$default(RestoreFailed restoreFailed, String str, CloudMetaType cloudMetaType, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = restoreFailed.id;
            }
            if ((i & 2) != 0) {
                cloudMetaType = restoreFailed.metaType;
            }
            if ((i & 4) != 0) {
                th = restoreFailed.error;
            }
            return restoreFailed.copy(str, cloudMetaType, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaType getMetaType() {
            return this.metaType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final RestoreFailed copy(String id, CloudMetaType metaType, Throwable error) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(metaType, "metaType");
            OooOOO0.OooO0oO(error, "error");
            return new RestoreFailed(id, metaType, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestoreFailed)) {
                return false;
            }
            RestoreFailed restoreFailed = (RestoreFailed) other;
            return OooOOO0.OooO0O0(this.id, restoreFailed.id) && this.metaType == restoreFailed.metaType && OooOOO0.OooO0O0(this.error, restoreFailed.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        public final CloudMetaType getMetaType() {
            return this.metaType;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "RestoreFailed";
        }

        public int hashCode() {
            return this.error.hashCode() + ((this.metaType.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "RestoreFailed(id=" + this.id + ", metaType=" + this.metaType + ", error=" + this.error + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RestoreSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "restoreResult", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;)V", "getId", "()Ljava/lang/String;", "getRestoreResult", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RestoreSucceeded implements SyncEvent {
        private final String id;
        private final CloudMetaLocal restoreResult;

        public RestoreSucceeded(String id, CloudMetaLocal restoreResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(restoreResult, "restoreResult");
            this.id = id;
            this.restoreResult = restoreResult;
        }

        public static /* synthetic */ RestoreSucceeded copy$default(RestoreSucceeded restoreSucceeded, String str, CloudMetaLocal cloudMetaLocal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = restoreSucceeded.id;
            }
            if ((i & 2) != 0) {
                cloudMetaLocal = restoreSucceeded.restoreResult;
            }
            return restoreSucceeded.copy(str, cloudMetaLocal);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaLocal getRestoreResult() {
            return this.restoreResult;
        }

        public final RestoreSucceeded copy(String id, CloudMetaLocal restoreResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(restoreResult, "restoreResult");
            return new RestoreSucceeded(id, restoreResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestoreSucceeded)) {
                return false;
            }
            RestoreSucceeded restoreSucceeded = (RestoreSucceeded) other;
            return OooOOO0.OooO0O0(this.id, restoreSucceeded.id) && OooOOO0.OooO0O0(this.restoreResult, restoreSucceeded.restoreResult);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "RestoreSucceeded";
        }

        public final CloudMetaLocal getRestoreResult() {
            return this.restoreResult;
        }

        public int hashCode() {
            return this.restoreResult.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "RestoreSucceeded(id=" + this.id + ", restoreResult=" + this.restoreResult + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$UploadSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "uploadResult", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;)V", "getId", "()Ljava/lang/String;", "getUploadResult", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "name", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class UploadSucceeded implements SyncEvent {
        private final String id;
        private final CloudMetaLocal uploadResult;

        public UploadSucceeded(String id, CloudMetaLocal uploadResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(uploadResult, "uploadResult");
            this.id = id;
            this.uploadResult = uploadResult;
        }

        public static /* synthetic */ UploadSucceeded copy$default(UploadSucceeded uploadSucceeded, String str, CloudMetaLocal cloudMetaLocal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadSucceeded.id;
            }
            if ((i & 2) != 0) {
                cloudMetaLocal = uploadSucceeded.uploadResult;
            }
            return uploadSucceeded.copy(str, cloudMetaLocal);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaLocal getUploadResult() {
            return this.uploadResult;
        }

        public final UploadSucceeded copy(String id, CloudMetaLocal uploadResult) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(uploadResult, "uploadResult");
            return new UploadSucceeded(id, uploadResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadSucceeded)) {
                return false;
            }
            UploadSucceeded uploadSucceeded = (UploadSucceeded) other;
            return OooOOO0.OooO0O0(this.id, uploadSucceeded.id) && OooOOO0.OooO0O0(this.uploadResult, uploadSucceeded.uploadResult);
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "UploadSucceeded";
        }

        public final CloudMetaLocal getUploadResult() {
            return this.uploadResult;
        }

        public int hashCode() {
            return this.uploadResult.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "UploadSucceeded(id=" + this.id + ", uploadResult=" + this.uploadResult + ")";
        }
    }

    String getId();

    String getName();

    default SyncEventPayload getPayload() {
        return SyncEventPayload.INSTANCE.getNone();
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$PackageSucceeded;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "bundle", "Lcom/orion/notein/domain/models/cloudsync/CloudBundle;", "forceFullContent", "", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudBundle;Z)V", "getId", "()Ljava/lang/String;", "getBundle", "()Lcom/orion/notein/domain/models/cloudsync/CloudBundle;", "getForceFullContent", "()Z", "name", "getName", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PackageSucceeded implements SyncEvent {
        private final CloudBundle bundle;
        private final boolean forceFullContent;
        private final String id;

        public PackageSucceeded(String id, CloudBundle bundle, boolean z) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(bundle, "bundle");
            this.id = id;
            this.bundle = bundle;
            this.forceFullContent = z;
        }

        public static /* synthetic */ PackageSucceeded copy$default(PackageSucceeded packageSucceeded, String str, CloudBundle cloudBundle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = packageSucceeded.id;
            }
            if ((i & 2) != 0) {
                cloudBundle = packageSucceeded.bundle;
            }
            if ((i & 4) != 0) {
                z = packageSucceeded.forceFullContent;
            }
            return packageSucceeded.copy(str, cloudBundle, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudBundle getBundle() {
            return this.bundle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getForceFullContent() {
            return this.forceFullContent;
        }

        public final PackageSucceeded copy(String id, CloudBundle bundle, boolean forceFullContent) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(bundle, "bundle");
            return new PackageSucceeded(id, bundle, forceFullContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageSucceeded)) {
                return false;
            }
            PackageSucceeded packageSucceeded = (PackageSucceeded) other;
            return OooOOO0.OooO0O0(this.id, packageSucceeded.id) && OooOOO0.OooO0O0(this.bundle, packageSucceeded.bundle) && this.forceFullContent == packageSucceeded.forceFullContent;
        }

        public final CloudBundle getBundle() {
            return this.bundle;
        }

        public final boolean getForceFullContent() {
            return this.forceFullContent;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "PackageSucceeded";
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceFullContent) + ((this.bundle.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.id;
            CloudBundle cloudBundle = this.bundle;
            boolean z = this.forceFullContent;
            StringBuilder sb = new StringBuilder("PackageSucceeded(id=");
            sb.append(str);
            sb.append(", bundle=");
            sb.append(cloudBundle);
            sb.append(", forceFullContent=");
            return OooOOO.OooO00o(sb, ")", z);
        }

        public /* synthetic */ PackageSucceeded(String str, CloudBundle cloudBundle, boolean z, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, cloudBundle, (i & 4) != 0 ? false : z);
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$RequestPush;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "metaType", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "forceFullContent", "", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;Z)V", "getId", "()Ljava/lang/String;", "getMetaType", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "getForceFullContent", "()Z", "name", "getName", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RequestPush implements SyncEvent {
        private final boolean forceFullContent;
        private final String id;
        private final CloudMetaType metaType;

        public RequestPush(String id, CloudMetaType metaType, boolean z) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(metaType, "metaType");
            this.id = id;
            this.metaType = metaType;
            this.forceFullContent = z;
        }

        public static /* synthetic */ RequestPush copy$default(RequestPush requestPush, String str, CloudMetaType cloudMetaType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestPush.id;
            }
            if ((i & 2) != 0) {
                cloudMetaType = requestPush.metaType;
            }
            if ((i & 4) != 0) {
                z = requestPush.forceFullContent;
            }
            return requestPush.copy(str, cloudMetaType, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaType getMetaType() {
            return this.metaType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getForceFullContent() {
            return this.forceFullContent;
        }

        public final RequestPush copy(String id, CloudMetaType metaType, boolean forceFullContent) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(metaType, "metaType");
            return new RequestPush(id, metaType, forceFullContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestPush)) {
                return false;
            }
            RequestPush requestPush = (RequestPush) other;
            return OooOOO0.OooO0O0(this.id, requestPush.id) && this.metaType == requestPush.metaType && this.forceFullContent == requestPush.forceFullContent;
        }

        public final boolean getForceFullContent() {
            return this.forceFullContent;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        public final CloudMetaType getMetaType() {
            return this.metaType;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "RequestPush";
        }

        public int hashCode() {
            return Boolean.hashCode(this.forceFullContent) + ((this.metaType.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.id;
            CloudMetaType cloudMetaType = this.metaType;
            boolean z = this.forceFullContent;
            StringBuilder sb = new StringBuilder("RequestPush(id=");
            sb.append(str);
            sb.append(", metaType=");
            sb.append(cloudMetaType);
            sb.append(", forceFullContent=");
            return OooOOO.OooO00o(sb, ")", z);
        }

        public /* synthetic */ RequestPush(String str, CloudMetaType cloudMetaType, boolean z, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, cloudMetaType, (i & 4) != 0 ? false : z);
        }
    }

    @Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncEvent$UploadFailed;", "Lcom/orion/notein/domain/models/cloudsync/SyncEvent;", "id", "", "error", "", "bundleType", "Lcom/orion/notein/domain/models/cloudsync/CloudBundle$BundleType;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/orion/notein/domain/models/cloudsync/CloudBundle$BundleType;)V", "getId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getBundleType", "()Lcom/orion/notein/domain/models/cloudsync/CloudBundle$BundleType;", "name", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class UploadFailed implements SyncEvent {
        private final CloudBundle.BundleType bundleType;
        private final Throwable error;
        private final String id;

        public UploadFailed(String id, Throwable error, CloudBundle.BundleType bundleType) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            this.id = id;
            this.error = error;
            this.bundleType = bundleType;
        }

        public static /* synthetic */ UploadFailed copy$default(UploadFailed uploadFailed, String str, Throwable th, CloudBundle.BundleType bundleType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadFailed.id;
            }
            if ((i & 2) != 0) {
                th = uploadFailed.error;
            }
            if ((i & 4) != 0) {
                bundleType = uploadFailed.bundleType;
            }
            return uploadFailed.copy(str, th, bundleType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CloudBundle.BundleType getBundleType() {
            return this.bundleType;
        }

        public final UploadFailed copy(String id, Throwable error, CloudBundle.BundleType bundleType) {
            OooOOO0.OooO0oO(id, "id");
            OooOOO0.OooO0oO(error, "error");
            return new UploadFailed(id, error, bundleType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadFailed)) {
                return false;
            }
            UploadFailed uploadFailed = (UploadFailed) other;
            return OooOOO0.OooO0O0(this.id, uploadFailed.id) && OooOOO0.OooO0O0(this.error, uploadFailed.error) && this.bundleType == uploadFailed.bundleType;
        }

        public final CloudBundle.BundleType getBundleType() {
            return this.bundleType;
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getId() {
            return this.id;
        }

        @Override // com.orion.notein.domain.models.cloudsync.SyncEvent
        public String getName() {
            return "UploadFailed";
        }

        public int hashCode() {
            int iHashCode = (this.error.hashCode() + (this.id.hashCode() * 31)) * 31;
            CloudBundle.BundleType bundleType = this.bundleType;
            return iHashCode + (bundleType == null ? 0 : bundleType.hashCode());
        }

        public String toString() {
            return "UploadFailed(id=" + this.id + ", error=" + this.error + ", bundleType=" + this.bundleType + ")";
        }

        public /* synthetic */ UploadFailed(String str, Throwable th, CloudBundle.BundleType bundleType, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, th, (i & 4) != 0 ? null : bundleType);
        }
    }
}
