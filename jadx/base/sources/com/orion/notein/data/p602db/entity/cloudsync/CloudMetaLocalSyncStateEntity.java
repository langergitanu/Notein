package com.orion.notein.data.p602db.entity.cloudsync;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.cloudsync.SyncState;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaLocalSyncStateEntity;", "", "id", "", "driveId", "syncState", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/SyncState;J)V", "getId", "()Ljava/lang/String;", "getDriveId", "getSyncState", "()Lcom/orion/notein/domain/models/cloudsync/SyncState;", "getLastModificationTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMetaLocalSyncStateEntity {
    private final String driveId;
    private final String id;
    private final long lastModificationTime;
    private final SyncState syncState;

    public CloudMetaLocalSyncStateEntity(String id, String driveId, SyncState syncState, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(syncState, "syncState");
        this.id = id;
        this.driveId = driveId;
        this.syncState = syncState;
        this.lastModificationTime = j;
    }

    public static /* synthetic */ CloudMetaLocalSyncStateEntity copy$default(CloudMetaLocalSyncStateEntity cloudMetaLocalSyncStateEntity, String str, String str2, SyncState syncState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudMetaLocalSyncStateEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = cloudMetaLocalSyncStateEntity.driveId;
        }
        if ((i & 4) != 0) {
            syncState = cloudMetaLocalSyncStateEntity.syncState;
        }
        if ((i & 8) != 0) {
            j = cloudMetaLocalSyncStateEntity.lastModificationTime;
        }
        SyncState syncState2 = syncState;
        return cloudMetaLocalSyncStateEntity.copy(str, str2, syncState2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDriveId() {
        return this.driveId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SyncState getSyncState() {
        return this.syncState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final CloudMetaLocalSyncStateEntity copy(String id, String driveId, SyncState syncState, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(syncState, "syncState");
        return new CloudMetaLocalSyncStateEntity(id, driveId, syncState, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMetaLocalSyncStateEntity)) {
            return false;
        }
        CloudMetaLocalSyncStateEntity cloudMetaLocalSyncStateEntity = (CloudMetaLocalSyncStateEntity) other;
        return OooOOO0.OooO0O0(this.id, cloudMetaLocalSyncStateEntity.id) && OooOOO0.OooO0O0(this.driveId, cloudMetaLocalSyncStateEntity.driveId) && OooOOO0.OooO0O0(this.syncState, cloudMetaLocalSyncStateEntity.syncState) && this.lastModificationTime == cloudMetaLocalSyncStateEntity.lastModificationTime;
    }

    public final String getDriveId() {
        return this.driveId;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final SyncState getSyncState() {
        return this.syncState;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModificationTime) + ((this.syncState.hashCode() + OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        SyncState syncState = this.syncState;
        long j = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMetaLocalSyncStateEntity(id=", str, ", driveId=", str2, ", syncState=");
        sbOooO0O0.append(syncState);
        sbOooO0O0.append(", lastModificationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
