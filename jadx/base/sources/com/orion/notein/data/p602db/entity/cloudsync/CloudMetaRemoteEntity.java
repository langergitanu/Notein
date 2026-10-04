package com.orion.notein.data.p602db.entity.cloudsync;

import OooOO0.OooO0O0;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMime;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32466OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030%J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003Jm\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00103\u001a\u00020'2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0007HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00067"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "", "id", "", "driveId", "mimeType", "metaVersion", "", "metaHash", "driveObjectKey", "lastSyncTime", "", "contentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "deleted", "extra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLcom/orion/notein/domain/models/cloudsync/CloudContentTag;JLcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;)V", "getId", "()Ljava/lang/String;", "getDriveId", "getMimeType", "getMetaVersion", "()I", "getMetaHash", "getDriveObjectKey", "getLastSyncTime", "()J", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getDeleted", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "setExtra", "(Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;)V", "toCloudProperties", "", "isDeleted", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudMetaRemoteEntity {

    @SerializedName(alternate = {"content_tag"}, value = "contentTag")
    private final CloudContentTag contentTag;

    @SerializedName("deleted")
    private final long deleted;

    @SerializedName(alternate = {"drive_id"}, value = "driveId")
    private final String driveId;

    @SerializedName(alternate = {"drive_object_key"}, value = "driveObjectKey")
    private final String driveObjectKey;

    @SerializedName("extra")
    private CloudMetaExtra extra;

    @SerializedName(alternate = {"note_id"}, value = NoteMeta.PROPERTY_NOTE_ID)
    private final String id;

    @SerializedName(alternate = {"last_sync_time"}, value = "lastSyncTime")
    private final long lastSyncTime;

    @SerializedName(alternate = {"meta_hash"}, value = "metaHash")
    private final String metaHash;

    @SerializedName(alternate = {"meta_version"}, value = "metaVersion")
    private final int metaVersion;

    @SerializedName(alternate = {"mime_type"}, value = "mimeType")
    private final String mimeType;

    public CloudMetaRemoteEntity(String id, String driveId, String mimeType, int i, String metaHash, String driveObjectKey, long j, CloudContentTag contentTag, long j2, CloudMetaExtra extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(metaHash, "metaHash");
        OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        OooOOO0.OooO0oO(extra, "extra");
        this.id = id;
        this.driveId = driveId;
        this.mimeType = mimeType;
        this.metaVersion = i;
        this.metaHash = metaHash;
        this.driveObjectKey = driveObjectKey;
        this.lastSyncTime = j;
        this.contentTag = contentTag;
        this.deleted = j2;
        this.extra = extra;
    }

    public static /* synthetic */ CloudMetaRemoteEntity copy$default(CloudMetaRemoteEntity cloudMetaRemoteEntity, String str, String str2, String str3, int i, String str4, String str5, long j, CloudContentTag cloudContentTag, long j2, CloudMetaExtra cloudMetaExtra, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cloudMetaRemoteEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = cloudMetaRemoteEntity.driveId;
        }
        if ((i2 & 4) != 0) {
            str3 = cloudMetaRemoteEntity.mimeType;
        }
        if ((i2 & 8) != 0) {
            i = cloudMetaRemoteEntity.metaVersion;
        }
        if ((i2 & 16) != 0) {
            str4 = cloudMetaRemoteEntity.metaHash;
        }
        if ((i2 & 32) != 0) {
            str5 = cloudMetaRemoteEntity.driveObjectKey;
        }
        if ((i2 & 64) != 0) {
            j = cloudMetaRemoteEntity.lastSyncTime;
        }
        if ((i2 & 128) != 0) {
            cloudContentTag = cloudMetaRemoteEntity.contentTag;
        }
        if ((i2 & 256) != 0) {
            j2 = cloudMetaRemoteEntity.deleted;
        }
        if ((i2 & 512) != 0) {
            cloudMetaExtra = cloudMetaRemoteEntity.extra;
        }
        CloudContentTag cloudContentTag2 = cloudContentTag;
        long j3 = j;
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i3 = i;
        return cloudMetaRemoteEntity.copy(str, str2, str8, i3, str6, str7, j3, cloudContentTag2, j2, cloudMetaExtra);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
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
    public final int getMetaVersion() {
        return this.metaVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMetaHash() {
        return this.metaHash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDriveObjectKey() {
        return this.driveObjectKey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getDeleted() {
        return this.deleted;
    }

    public final CloudMetaRemoteEntity copy(String id, String driveId, String mimeType, int metaVersion, String metaHash, String driveObjectKey, long lastSyncTime, CloudContentTag contentTag, long deleted, CloudMetaExtra extra) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(driveId, "driveId");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        OooOOO0.OooO0oO(metaHash, "metaHash");
        OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
        OooOOO0.OooO0oO(contentTag, "contentTag");
        OooOOO0.OooO0oO(extra, "extra");
        return new CloudMetaRemoteEntity(id, driveId, mimeType, metaVersion, metaHash, driveObjectKey, lastSyncTime, contentTag, deleted, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudMetaRemoteEntity)) {
            return false;
        }
        CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) other;
        return OooOOO0.OooO0O0(this.id, cloudMetaRemoteEntity.id) && OooOOO0.OooO0O0(this.driveId, cloudMetaRemoteEntity.driveId) && OooOOO0.OooO0O0(this.mimeType, cloudMetaRemoteEntity.mimeType) && this.metaVersion == cloudMetaRemoteEntity.metaVersion && OooOOO0.OooO0O0(this.metaHash, cloudMetaRemoteEntity.metaHash) && OooOOO0.OooO0O0(this.driveObjectKey, cloudMetaRemoteEntity.driveObjectKey) && this.lastSyncTime == cloudMetaRemoteEntity.lastSyncTime && OooOOO0.OooO0O0(this.contentTag, cloudMetaRemoteEntity.contentTag) && this.deleted == cloudMetaRemoteEntity.deleted && OooOOO0.OooO0O0(this.extra, cloudMetaRemoteEntity.extra);
    }

    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    public final long getDeleted() {
        return this.deleted;
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

    public final long getLastSyncTime() {
        return this.lastSyncTime;
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

    public int hashCode() {
        return this.extra.hashCode() + C20703o000000o.OooO0O0((this.contentTag.hashCode() + C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.metaVersion, OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.driveId), 31, this.mimeType), 31), 31, this.metaHash), 31, this.driveObjectKey), 31, this.lastSyncTime)) * 31, 31, this.deleted);
    }

    public final boolean isDeleted() {
        return this.deleted == 1;
    }

    public final void setExtra(CloudMetaExtra cloudMetaExtra) {
        OooOOO0.OooO0oO(cloudMetaExtra, "<set-?>");
        this.extra = cloudMetaExtra;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> toCloudProperties() {
        C32466OooO0OO c32466OooO0OO = new C32466OooO0OO();
        String str = this.mimeType;
        int iHashCode = str.hashCode();
        if (iHashCode != 393630974) {
            if (iHashCode != 1600536058) {
                if (iHashCode == 1883341446 && str.equals(CloudMime.TEMPLATE)) {
                    c32466OooO0OO.put(MyTemplate.PROPERTY_TEMPLATE_ID, this.id);
                } else {
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
            } else if (str.equals(CloudMime.FOLDER)) {
                c32466OooO0OO.put(Folder.PROPERTY_FOLDER_ID, this.id);
            }
        } else if (str.equals(CloudMime.NOTE)) {
            c32466OooO0OO.put(NoteMeta.PROPERTY_NOTE_ID, this.id);
        }
        c32466OooO0OO.put(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, String.valueOf(this.contentTag.getLastModified()));
        c32466OooO0OO.put("dbVersion", PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_SCOPES_AUTHORITY);
        String title = this.extra.getTitle();
        if (title == null) {
            title = "";
        }
        c32466OooO0OO.put(NoteMeta.PROPERTY_TITLE, title);
        c32466OooO0OO.put(NoteMeta.PROPERTY_FAVORITE, String.valueOf(this.extra.getFavorite()));
        c32466OooO0OO.put(NoteMeta.PROPERTY_IN_TRASH_BIN, String.valueOf(this.extra.getInTrashBin()));
        c32466OooO0OO.put(NoteMeta.PROPERTY_USING_OWN_PDF, String.valueOf(this.extra.getUsingOwnPdf()));
        c32466OooO0OO.put(NoteMeta.PROPERTY_LOCK_ADDED, String.valueOf(this.extra.getLockAdded()));
        String parentId = this.extra.getParentId();
        if (parentId != null) {
        }
        if (this.extra.getSortKey() != null) {
            c32466OooO0OO.put(NoteMeta.PROPERTY_SORT_KEY, String.valueOf(this.extra.getSortKey()));
        }
        return c32466OooO0OO.OooO0O0();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.driveId;
        String str3 = this.mimeType;
        int i = this.metaVersion;
        String str4 = this.metaHash;
        String str5 = this.driveObjectKey;
        long j = this.lastSyncTime;
        CloudContentTag cloudContentTag = this.contentTag;
        long j2 = this.deleted;
        CloudMetaExtra cloudMetaExtra = this.extra;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CloudMetaRemoteEntity(id=", str, ", driveId=", str2, ", mimeType=");
        OooO0O0.OooO0Oo(i, str3, ", metaVersion=", ", metaHash=", sbOooO0O0);
        OooO0OO.OooO0o0(sbOooO0O0, str4, ", driveObjectKey=", str5, ", lastSyncTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", contentTag=");
        sbOooO0O0.append(cloudContentTag);
        C22205OooOOo.OooO0OO(j2, ", deleted=", ", extra=", sbOooO0O0);
        sbOooO0O0.append(cloudMetaExtra);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ CloudMetaRemoteEntity(String str, String str2, String str3, int i, String str4, String str5, long j, CloudContentTag cloudContentTag, long j2, CloudMetaExtra cloudMetaExtra, int i2, C24018OooO0oo c24018OooO0oo) {
        CloudMetaExtra cloudMetaExtra2;
        if ((i2 & 512) != 0) {
            cloudMetaExtra2 = new CloudMetaExtra((String) null, (String) null, (String) null, (Long) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, 131071, (C24018OooO0oo) null);
        } else {
            cloudMetaExtra2 = cloudMetaExtra;
        }
        this(str, str2, str3, i, str4, str5, j, cloudContentTag, j2, cloudMetaExtra2);
    }
}
