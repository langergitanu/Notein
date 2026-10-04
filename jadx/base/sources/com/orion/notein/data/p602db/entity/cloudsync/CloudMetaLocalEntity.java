package com.orion.notein.data.p602db.entity.cloudsync;

import OooOO0.OooO0O0;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.SyncState;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0007HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u00069"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaLocalEntity;", "", "id", "", "driveId", "mimeType", "metaVersion", "", "syncState", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "metaHash", "contentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "stagedContentTag", "deleted", "", "deletedRemote", "lastErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/orion/notein/domain/models/cloudsync/SyncState;JLjava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDriveId", "getMimeType", "getMetaVersion", "()I", "getSyncState", "()Lcom/orion/notein/domain/models/cloudsync/SyncState;", "getLastModificationTime", "()J", "getMetaHash", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getStagedContentTag", "getDeleted", "()Z", "getDeletedRemote", "getLastErrorCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMetaLocalEntity {
    private final CloudContentTag contentTag;
    private final boolean deleted;
    private final boolean deletedRemote;
    private final String driveId;
    private final String id;
    private final String lastErrorCode;
    private final long lastModificationTime;
    private final String metaHash;
    private final int metaVersion;
    private final String mimeType;
    private final CloudContentTag stagedContentTag;
    private final SyncState syncState;

    public CloudMetaLocalEntity(String id, String driveId, String mimeType, int i, SyncState syncState, long j, String metaHash, CloudContentTag contentTag, CloudContentTag cloudContentTag, boolean z, boolean z2, String str) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(syncState, "syncState");
        OooOOO0.OooO0oO(metaHash, "metaHash");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        this.id = id;
        this.driveId = driveId;
        this.mimeType = mimeType;
        this.metaVersion = i;
        this.syncState = syncState;
        this.lastModificationTime = j;
        this.metaHash = metaHash;
        this.contentTag = contentTag;
        this.stagedContentTag = cloudContentTag;
        this.deleted = z;
        this.deletedRemote = z2;
        this.lastErrorCode = str;
    }

    public static /* synthetic */ CloudMetaLocalEntity copy$default(CloudMetaLocalEntity cloudMetaLocalEntity, String str, String str2, String str3, int i, SyncState syncState, long j, String str4, CloudContentTag cloudContentTag, CloudContentTag cloudContentTag2, boolean z, boolean z2, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cloudMetaLocalEntity.id;
        }
        return cloudMetaLocalEntity.copy(str, (i2 & 2) != 0 ? cloudMetaLocalEntity.driveId : str2, (i2 & 4) != 0 ? cloudMetaLocalEntity.mimeType : str3, (i2 & 8) != 0 ? cloudMetaLocalEntity.metaVersion : i, (i2 & 16) != 0 ? cloudMetaLocalEntity.syncState : syncState, (i2 & 32) != 0 ? cloudMetaLocalEntity.lastModificationTime : j, (i2 & 64) != 0 ? cloudMetaLocalEntity.metaHash : str4, (i2 & 128) != 0 ? cloudMetaLocalEntity.contentTag : cloudContentTag, (i2 & 256) != 0 ? cloudMetaLocalEntity.stagedContentTag : cloudContentTag2, (i2 & 512) != 0 ? cloudMetaLocalEntity.deleted : z, (i2 & 1024) != 0 ? cloudMetaLocalEntity.deletedRemote : z2, (i2 & 2048) != 0 ? cloudMetaLocalEntity.lastErrorCode : str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getDeletedRemote() {
        return this.deletedRemote;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDriveId() {
        return this.driveId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMetaVersion() {
        return this.metaVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SyncState getSyncState() {
        return this.syncState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMetaHash() {
        return this.metaHash;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CloudContentTag getStagedContentTag() {
        return this.stagedContentTag;
    }

    public final CloudMetaLocalEntity copy(String id, String driveId, String mimeType, int metaVersion, SyncState syncState, long lastModificationTime, String metaHash, CloudContentTag contentTag, CloudContentTag stagedContentTag, boolean deleted, boolean deletedRemote, String lastErrorCode) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(syncState, "syncState");
        OooOOO0.OooO0oO(metaHash, "metaHash");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        return new CloudMetaLocalEntity(id, driveId, mimeType, metaVersion, syncState, lastModificationTime, metaHash, contentTag, stagedContentTag, deleted, deletedRemote, lastErrorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMetaLocalEntity)) {
            return false;
        }
        CloudMetaLocalEntity cloudMetaLocalEntity = (CloudMetaLocalEntity) other;
        return OooOOO0.OooO0O0(this.id, cloudMetaLocalEntity.id) && OooOOO0.OooO0O0(this.driveId, cloudMetaLocalEntity.driveId) && OooOOO0.OooO0O0(this.mimeType, cloudMetaLocalEntity.mimeType) && this.metaVersion == cloudMetaLocalEntity.metaVersion && OooOOO0.OooO0O0(this.syncState, cloudMetaLocalEntity.syncState) && this.lastModificationTime == cloudMetaLocalEntity.lastModificationTime && OooOOO0.OooO0O0(this.metaHash, cloudMetaLocalEntity.metaHash) && OooOOO0.OooO0O0(this.contentTag, cloudMetaLocalEntity.contentTag) && OooOOO0.OooO0O0(this.stagedContentTag, cloudMetaLocalEntity.stagedContentTag) && this.deleted == cloudMetaLocalEntity.deleted && this.deletedRemote == cloudMetaLocalEntity.deletedRemote && OooOOO0.OooO0O0(this.lastErrorCode, cloudMetaLocalEntity.lastErrorCode);
    }

    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final boolean getDeletedRemote() {
        return this.deletedRemote;
    }

    public final String getDriveId() {
        return this.driveId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastErrorCode() {
        return this.lastErrorCode;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getMetaHash() {
        return this.metaHash;
    }

    public final int getMetaVersion() {
        return this.metaVersion;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final CloudContentTag getStagedContentTag() {
        return this.stagedContentTag;
    }

    public final SyncState getSyncState() {
        return this.syncState;
    }

    public int hashCode() {
        int iHashCode = (this.contentTag.hashCode() + OooO00o.OooO0O0(C20703o000000o.OooO0O0((this.syncState.hashCode() + C20785Oooo00o.OooO00o(this.metaVersion, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId), 31, this.mimeType), 31)) * 31, 31, this.lastModificationTime), 31, this.metaHash)) * 31;
        CloudContentTag cloudContentTag = this.stagedContentTag;
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0((iHashCode + (cloudContentTag == null ? 0 : cloudContentTag.hashCode())) * 31, 31, this.deleted), 31, this.deletedRemote);
        String str = this.lastErrorCode;
        return iOooO0O0 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        String str3 = this.mimeType;
        int i = this.metaVersion;
        SyncState syncState = this.syncState;
        long j = this.lastModificationTime;
        String str4 = this.metaHash;
        CloudContentTag cloudContentTag = this.contentTag;
        CloudContentTag cloudContentTag2 = this.stagedContentTag;
        boolean z = this.deleted;
        boolean z2 = this.deletedRemote;
        String str5 = this.lastErrorCode;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMetaLocalEntity(id=", str, ", driveId=", str2, ", mimeType=");
        OooO0O0.OooO0Oo(i, str3, ", metaVersion=", ", syncState=", sbOooO0O0);
        sbOooO0O0.append(syncState);
        sbOooO0O0.append(", lastModificationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", metaHash=");
        sbOooO0O0.append(str4);
        sbOooO0O0.append(", contentTag=");
        sbOooO0O0.append(cloudContentTag);
        sbOooO0O0.append(", stagedContentTag=");
        sbOooO0O0.append(cloudContentTag2);
        sbOooO0O0.append(", deleted=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", deletedRemote=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", lastErrorCode=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ CloudMetaLocalEntity(String str, String str2, String str3, int i, SyncState syncState, long j, String str4, CloudContentTag cloudContentTag, CloudContentTag cloudContentTag2, boolean z, boolean z2, String str5, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, i, syncState, j, str4, cloudContentTag, cloudContentTag2, z, z2, (i2 & 2048) != 0 ? null : str5);
    }
}
