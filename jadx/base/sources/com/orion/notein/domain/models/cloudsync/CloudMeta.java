package com.orion.notein.domain.models.cloudsync;

import OooOO0.OooO0O0;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\t\u0010D\u001a\u00020\u0017HÆ\u0003J\u009f\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0007HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006J"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudMeta;", "", "id", "", "driveId", "mimeType", "metaVersionLocal", "", "deletedLocal", "", "syncState", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "metaVersionRemote", "deletedRemote", "contentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "contentLength", "contentUploadTime", "driveObjectKey", "lastSyncTime", "extra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/orion/notein/domain/models/cloudsync/SyncState;JIZLcom/orion/notein/domain/models/cloudsync/CloudContentTag;JJLjava/lang/String;JLcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;)V", "getId", "()Ljava/lang/String;", "getDriveId", "getMimeType", "getMetaVersionLocal", "()I", "setMetaVersionLocal", "(I)V", "getDeletedLocal", "()Z", "setDeletedLocal", "(Z)V", "getSyncState", "()Lcom/orion/notein/domain/models/cloudsync/SyncState;", "getLastModificationTime", "()J", "getMetaVersionRemote", "setMetaVersionRemote", "getDeletedRemote", "setDeletedRemote", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getContentLength", "getContentUploadTime", "getDriveObjectKey", "getLastSyncTime", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMeta {
    private final long contentLength;
    private final CloudContentTag contentTag;
    private final long contentUploadTime;
    private boolean deletedLocal;
    private boolean deletedRemote;
    private final String driveId;
    private final String driveObjectKey;
    private final CloudMetaExtra extra;
    private final String id;
    private final long lastModificationTime;
    private final long lastSyncTime;
    private int metaVersionLocal;
    private int metaVersionRemote;
    private final String mimeType;
    private final SyncState syncState;

    public CloudMeta(String id, String driveId, String mimeType, int i, boolean z, SyncState syncState, long j, int i2, boolean z2, CloudContentTag contentTag, long j2, long j3, String driveObjectKey, long j4, CloudMetaExtra extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(syncState, "syncState");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
        OooOOO0.OooO0oO(extra, "extra");
        this.id = id;
        this.driveId = driveId;
        this.mimeType = mimeType;
        this.metaVersionLocal = i;
        this.deletedLocal = z;
        this.syncState = syncState;
        this.lastModificationTime = j;
        this.metaVersionRemote = i2;
        this.deletedRemote = z2;
        this.contentTag = contentTag;
        this.contentLength = j2;
        this.contentUploadTime = j3;
        this.driveObjectKey = driveObjectKey;
        this.lastSyncTime = j4;
        this.extra = extra;
    }

    public static /* synthetic */ CloudMeta copy$default(CloudMeta cloudMeta, String str, String str2, String str3, int i, boolean z, SyncState syncState, long j, int i2, boolean z2, CloudContentTag cloudContentTag, long j2, long j3, String str4, long j4, CloudMetaExtra cloudMetaExtra, int i3, Object obj) {
        String str5 = (i3 & 1) != 0 ? cloudMeta.id : str;
        String str6 = (i3 & 2) != 0 ? cloudMeta.driveId : str2;
        return cloudMeta.copy(str5, str6, (i3 & 4) != 0 ? cloudMeta.mimeType : str3, (i3 & 8) != 0 ? cloudMeta.metaVersionLocal : i, (i3 & 16) != 0 ? cloudMeta.deletedLocal : z, (i3 & 32) != 0 ? cloudMeta.syncState : syncState, (i3 & 64) != 0 ? cloudMeta.lastModificationTime : j, (i3 & 128) != 0 ? cloudMeta.metaVersionRemote : i2, (i3 & 256) != 0 ? cloudMeta.deletedRemote : z2, (i3 & 512) != 0 ? cloudMeta.contentTag : cloudContentTag, (i3 & 1024) != 0 ? cloudMeta.contentLength : j2, (i3 & 2048) != 0 ? cloudMeta.contentUploadTime : j3, (i3 & 4096) != 0 ? cloudMeta.driveObjectKey : str4, (i3 & 8192) != 0 ? cloudMeta.lastSyncTime : j4, (i3 & 16384) != 0 ? cloudMeta.extra : cloudMetaExtra);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getContentUploadTime() {
        return this.contentUploadTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDriveObjectKey() {
        return this.driveObjectKey;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final CloudMetaExtra getExtra() {
        return this.extra;
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
    public final int getMetaVersionLocal() {
        return this.metaVersionLocal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDeletedLocal() {
        return this.deletedLocal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SyncState getSyncState() {
        return this.syncState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMetaVersionRemote() {
        return this.metaVersionRemote;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDeletedRemote() {
        return this.deletedRemote;
    }

    public final CloudMeta copy(String id, String driveId, String mimeType, int metaVersionLocal, boolean deletedLocal, SyncState syncState, long lastModificationTime, int metaVersionRemote, boolean deletedRemote, CloudContentTag contentTag, long contentLength, long contentUploadTime, String driveObjectKey, long lastSyncTime, CloudMetaExtra extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(syncState, "syncState");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
        OooOOO0.OooO0oO(extra, "extra");
        return new CloudMeta(id, driveId, mimeType, metaVersionLocal, deletedLocal, syncState, lastModificationTime, metaVersionRemote, deletedRemote, contentTag, contentLength, contentUploadTime, driveObjectKey, lastSyncTime, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMeta)) {
            return false;
        }
        CloudMeta cloudMeta = (CloudMeta) other;
        return OooOOO0.OooO0O0(this.id, cloudMeta.id) && OooOOO0.OooO0O0(this.driveId, cloudMeta.driveId) && OooOOO0.OooO0O0(this.mimeType, cloudMeta.mimeType) && this.metaVersionLocal == cloudMeta.metaVersionLocal && this.deletedLocal == cloudMeta.deletedLocal && OooOOO0.OooO0O0(this.syncState, cloudMeta.syncState) && this.lastModificationTime == cloudMeta.lastModificationTime && this.metaVersionRemote == cloudMeta.metaVersionRemote && this.deletedRemote == cloudMeta.deletedRemote && OooOOO0.OooO0O0(this.contentTag, cloudMeta.contentTag) && this.contentLength == cloudMeta.contentLength && this.contentUploadTime == cloudMeta.contentUploadTime && OooOOO0.OooO0O0(this.driveObjectKey, cloudMeta.driveObjectKey) && this.lastSyncTime == cloudMeta.lastSyncTime && OooOOO0.OooO0O0(this.extra, cloudMeta.extra);
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    public final long getContentUploadTime() {
        return this.contentUploadTime;
    }

    public final boolean getDeletedLocal() {
        return this.deletedLocal;
    }

    public final boolean getDeletedRemote() {
        return this.deletedRemote;
    }

    public final String getDriveId() {
        return this.driveId;
    }

    public final String getDriveObjectKey() {
        return this.driveObjectKey;
    }

    public final CloudMetaExtra getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public final int getMetaVersionLocal() {
        return this.metaVersionLocal;
    }

    public final int getMetaVersionRemote() {
        return this.metaVersionRemote;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final SyncState getSyncState() {
        return this.syncState;
    }

    public int hashCode() {
        return this.extra.hashCode() + C20703o000000o.OooO0O0(OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0((this.contentTag.hashCode() + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.metaVersionRemote, C20703o000000o.OooO0O0((this.syncState.hashCode() + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.metaVersionLocal, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId), 31, this.mimeType), 31), 31, this.deletedLocal)) * 31, 31, this.lastModificationTime), 31), 31, this.deletedRemote)) * 31, 31, this.contentLength), 31, this.contentUploadTime), 31, this.driveObjectKey), 31, this.lastSyncTime);
    }

    public final void setDeletedLocal(boolean z) {
        this.deletedLocal = z;
    }

    public final void setDeletedRemote(boolean z) {
        this.deletedRemote = z;
    }

    public final void setMetaVersionLocal(int i) {
        this.metaVersionLocal = i;
    }

    public final void setMetaVersionRemote(int i) {
        this.metaVersionRemote = i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        String str3 = this.mimeType;
        int i = this.metaVersionLocal;
        boolean z = this.deletedLocal;
        SyncState syncState = this.syncState;
        long j = this.lastModificationTime;
        int i2 = this.metaVersionRemote;
        boolean z2 = this.deletedRemote;
        CloudContentTag cloudContentTag = this.contentTag;
        long j2 = this.contentLength;
        long j3 = this.contentUploadTime;
        String str4 = this.driveObjectKey;
        long j4 = this.lastSyncTime;
        CloudMetaExtra cloudMetaExtra = this.extra;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMeta(id=", str, ", driveId=", str2, ", mimeType=");
        OooO0O0.OooO0Oo(i, str3, ", metaVersionLocal=", ", deletedLocal=", sbOooO0O0);
        sbOooO0O0.append(z);
        sbOooO0O0.append(", syncState=");
        sbOooO0O0.append(syncState);
        sbOooO0O0.append(", lastModificationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", metaVersionRemote=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(", deletedRemote=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", contentTag=");
        sbOooO0O0.append(cloudContentTag);
        C22205OooOOo.OooO0OO(j2, ", contentLength=", ", contentUploadTime=", sbOooO0O0);
        sbOooO0O0.append(j3);
        sbOooO0O0.append(", driveObjectKey=");
        sbOooO0O0.append(str4);
        C22205OooOOo.OooO0OO(j4, ", lastSyncTime=", ", extra=", sbOooO0O0);
        sbOooO0O0.append(cloudMetaExtra);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
