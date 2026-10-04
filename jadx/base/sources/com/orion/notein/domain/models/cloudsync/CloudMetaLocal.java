package com.orion.notein.domain.models.cloudsync;

import OooOO0.OooO0O0;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0007HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u00069"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "", "id", "", "driveId", "mimeType", "metaVersion", "", "contentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "metaHash", "stagedContentTag", "syncState", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", "deleted", "", "deletedRemote", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "lastErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/orion/notein/domain/models/cloudsync/CloudContentTag;Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;Lcom/orion/notein/domain/models/cloudsync/SyncState;ZZJLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDriveId", "getMimeType", "getMetaVersion", "()I", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getMetaHash", "getStagedContentTag", "getSyncState", "()Lcom/orion/notein/domain/models/cloudsync/SyncState;", "getDeleted", "()Z", "getDeletedRemote", "getLastModificationTime", "()J", "getLastErrorCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMetaLocal {
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

    public CloudMetaLocal(String id, String driveId, String mimeType, int i, CloudContentTag contentTag, String metaHash, CloudContentTag cloudContentTag, SyncState syncState, boolean z, boolean z2, long j, String str) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        OooOOO0.OooO0oO(metaHash, "metaHash");
        OooOOO0.OooO0oO(syncState, "syncState");
        this.id = id;
        this.driveId = driveId;
        this.mimeType = mimeType;
        this.metaVersion = i;
        this.contentTag = contentTag;
        this.metaHash = metaHash;
        this.stagedContentTag = cloudContentTag;
        this.syncState = syncState;
        this.deleted = z;
        this.deletedRemote = z2;
        this.lastModificationTime = j;
        this.lastErrorCode = str;
    }

    public static /* synthetic */ CloudMetaLocal copy$default(CloudMetaLocal cloudMetaLocal, String str, String str2, String str3, int i, CloudContentTag cloudContentTag, String str4, CloudContentTag cloudContentTag2, SyncState syncState, boolean z, boolean z2, long j, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cloudMetaLocal.id;
        }
        return cloudMetaLocal.copy(str, (i2 & 2) != 0 ? cloudMetaLocal.driveId : str2, (i2 & 4) != 0 ? cloudMetaLocal.mimeType : str3, (i2 & 8) != 0 ? cloudMetaLocal.metaVersion : i, (i2 & 16) != 0 ? cloudMetaLocal.contentTag : cloudContentTag, (i2 & 32) != 0 ? cloudMetaLocal.metaHash : str4, (i2 & 64) != 0 ? cloudMetaLocal.stagedContentTag : cloudContentTag2, (i2 & 128) != 0 ? cloudMetaLocal.syncState : syncState, (i2 & 256) != 0 ? cloudMetaLocal.deleted : z, (i2 & 512) != 0 ? cloudMetaLocal.deletedRemote : z2, (i2 & 1024) != 0 ? cloudMetaLocal.lastModificationTime : j, (i2 & 2048) != 0 ? cloudMetaLocal.lastErrorCode : str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDeletedRemote() {
        return this.deletedRemote;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
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
    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMetaHash() {
        return this.metaHash;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CloudContentTag getStagedContentTag() {
        return this.stagedContentTag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SyncState getSyncState() {
        return this.syncState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final CloudMetaLocal copy(String id, String driveId, String mimeType, int metaVersion, CloudContentTag contentTag, String metaHash, CloudContentTag stagedContentTag, SyncState syncState, boolean deleted, boolean deletedRemote, long lastModificationTime, String lastErrorCode) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        OooOOO0.OooO0oO(metaHash, "metaHash");
        OooOOO0.OooO0oO(syncState, "syncState");
        return new CloudMetaLocal(id, driveId, mimeType, metaVersion, contentTag, metaHash, stagedContentTag, syncState, deleted, deletedRemote, lastModificationTime, lastErrorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMetaLocal)) {
            return false;
        }
        CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) other;
        return OooOOO0.OooO0O0(this.id, cloudMetaLocal.id) && OooOOO0.OooO0O0(this.driveId, cloudMetaLocal.driveId) && OooOOO0.OooO0O0(this.mimeType, cloudMetaLocal.mimeType) && this.metaVersion == cloudMetaLocal.metaVersion && OooOOO0.OooO0O0(this.contentTag, cloudMetaLocal.contentTag) && OooOOO0.OooO0O0(this.metaHash, cloudMetaLocal.metaHash) && OooOOO0.OooO0O0(this.stagedContentTag, cloudMetaLocal.stagedContentTag) && OooOOO0.OooO0O0(this.syncState, cloudMetaLocal.syncState) && this.deleted == cloudMetaLocal.deleted && this.deletedRemote == cloudMetaLocal.deletedRemote && this.lastModificationTime == cloudMetaLocal.lastModificationTime && OooOOO0.OooO0O0(this.lastErrorCode, cloudMetaLocal.lastErrorCode);
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
        int iOooO0O0 = OooO00o.OooO0O0((this.contentTag.hashCode() + C20785Oooo00o.OooO00o(this.metaVersion, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId), 31, this.mimeType), 31)) * 31, 31, this.metaHash);
        CloudContentTag cloudContentTag = this.stagedContentTag;
        int iOooO0O02 = C20703o000000o.OooO0O0(o00000.OooO0O0(o00000.OooO0O0((this.syncState.hashCode() + ((iOooO0O0 + (cloudContentTag == null ? 0 : cloudContentTag.hashCode())) * 31)) * 31, 31, this.deleted), 31, this.deletedRemote), 31, this.lastModificationTime);
        String str = this.lastErrorCode;
        return iOooO0O02 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        String str3 = this.mimeType;
        int i = this.metaVersion;
        CloudContentTag cloudContentTag = this.contentTag;
        String str4 = this.metaHash;
        CloudContentTag cloudContentTag2 = this.stagedContentTag;
        SyncState syncState = this.syncState;
        boolean z = this.deleted;
        boolean z2 = this.deletedRemote;
        long j = this.lastModificationTime;
        String str5 = this.lastErrorCode;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMetaLocal(id=", str, ", driveId=", str2, ", mimeType=");
        OooO0O0.OooO0Oo(i, str3, ", metaVersion=", ", contentTag=", sbOooO0O0);
        sbOooO0O0.append(cloudContentTag);
        sbOooO0O0.append(", metaHash=");
        sbOooO0O0.append(str4);
        sbOooO0O0.append(", stagedContentTag=");
        sbOooO0O0.append(cloudContentTag2);
        sbOooO0O0.append(", syncState=");
        sbOooO0O0.append(syncState);
        sbOooO0O0.append(", deleted=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", deletedRemote=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", lastModificationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", lastErrorCode=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ CloudMetaLocal(String str, String str2, String str3, int i, CloudContentTag cloudContentTag, String str4, CloudContentTag cloudContentTag2, SyncState syncState, boolean z, boolean z2, long j, String str5, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, i, cloudContentTag, str4, cloudContentTag2, syncState, z, z2, j, (i2 & 2048) != 0 ? null : str5);
    }
}
