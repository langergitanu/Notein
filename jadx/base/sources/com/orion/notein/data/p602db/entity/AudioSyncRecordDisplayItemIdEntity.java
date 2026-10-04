package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/AudioSyncRecordDisplayItemIdEntity;", "", "id", "", "displayItemId", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "deleted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZ)V", "getId", "()Ljava/lang/String;", "getDisplayItemId", "getLastModificationTime", "()J", "getDeleted", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AudioSyncRecordDisplayItemIdEntity {
    private final boolean deleted;
    private final String displayItemId;
    private final String id;
    private final long lastModificationTime;

    public AudioSyncRecordDisplayItemIdEntity(String id, String displayItemId, long j, boolean z) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(displayItemId, "displayItemId");
        this.id = id;
        this.displayItemId = displayItemId;
        this.lastModificationTime = j;
        this.deleted = z;
    }

    public static /* synthetic */ AudioSyncRecordDisplayItemIdEntity copy$default(AudioSyncRecordDisplayItemIdEntity audioSyncRecordDisplayItemIdEntity, String str, String str2, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioSyncRecordDisplayItemIdEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = audioSyncRecordDisplayItemIdEntity.displayItemId;
        }
        if ((i & 4) != 0) {
            j = audioSyncRecordDisplayItemIdEntity.lastModificationTime;
        }
        if ((i & 8) != 0) {
            z = audioSyncRecordDisplayItemIdEntity.deleted;
        }
        boolean z2 = z;
        return audioSyncRecordDisplayItemIdEntity.copy(str, str2, j, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayItemId() {
        return this.displayItemId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final AudioSyncRecordDisplayItemIdEntity copy(String id, String displayItemId, long lastModificationTime, boolean deleted) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(displayItemId, "displayItemId");
        return new AudioSyncRecordDisplayItemIdEntity(id, displayItemId, lastModificationTime, deleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSyncRecordDisplayItemIdEntity)) {
            return false;
        }
        AudioSyncRecordDisplayItemIdEntity audioSyncRecordDisplayItemIdEntity = (AudioSyncRecordDisplayItemIdEntity) other;
        return OooOOO0.OooO0O0(this.id, audioSyncRecordDisplayItemIdEntity.id) && OooOOO0.OooO0O0(this.displayItemId, audioSyncRecordDisplayItemIdEntity.displayItemId) && this.lastModificationTime == audioSyncRecordDisplayItemIdEntity.lastModificationTime && this.deleted == audioSyncRecordDisplayItemIdEntity.deleted;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDisplayItemId() {
        return this.displayItemId;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + C20703o000000o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.displayItemId), 31, this.lastModificationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.displayItemId;
        long j = this.lastModificationTime;
        boolean z = this.deleted;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("AudioSyncRecordDisplayItemIdEntity(id=", str, ", displayItemId=", str2, ", lastModificationTime=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", deleted=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
