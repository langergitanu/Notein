package com.orion.notein.domain.models.note;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import androidx.appcompat.app.OooOOO;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/AudioSyncRecord;", "", "id", "", "audioId", "audioPosition", "", "displayItemId", "displayItemType", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "deleted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IJJZ)V", "getId", "()Ljava/lang/String;", "getAudioId", "getAudioPosition", "()I", "getDisplayItemId", "getDisplayItemType", "getCreationTime", "()J", "getLastModificationTime", "getDeleted", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AudioSyncRecord {
    private final String audioId;
    private final int audioPosition;
    private final long creationTime;
    private final boolean deleted;
    private final String displayItemId;
    private final int displayItemType;
    private final String id;
    private final long lastModificationTime;

    public AudioSyncRecord(String id, String audioId, int i, String displayItemId, int i2, long j, long j2, boolean z) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(audioId, "audioId");
        OooOOO0.OooO0oO(displayItemId, "displayItemId");
        this.id = id;
        this.audioId = audioId;
        this.audioPosition = i;
        this.displayItemId = displayItemId;
        this.displayItemType = i2;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.deleted = z;
    }

    public static /* synthetic */ AudioSyncRecord copy$default(AudioSyncRecord audioSyncRecord, String str, String str2, int i, String str3, int i2, long j, long j2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = audioSyncRecord.id;
        }
        if ((i3 & 2) != 0) {
            str2 = audioSyncRecord.audioId;
        }
        if ((i3 & 4) != 0) {
            i = audioSyncRecord.audioPosition;
        }
        if ((i3 & 8) != 0) {
            str3 = audioSyncRecord.displayItemId;
        }
        if ((i3 & 16) != 0) {
            i2 = audioSyncRecord.displayItemType;
        }
        if ((i3 & 32) != 0) {
            j = audioSyncRecord.creationTime;
        }
        if ((i3 & 64) != 0) {
            j2 = audioSyncRecord.lastModificationTime;
        }
        if ((i3 & 128) != 0) {
            z = audioSyncRecord.deleted;
        }
        boolean z2 = z;
        long j3 = j2;
        long j4 = j;
        int i4 = i2;
        int i5 = i;
        return audioSyncRecord.copy(str, str2, i5, str3, i4, j4, j3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAudioId() {
        return this.audioId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAudioPosition() {
        return this.audioPosition;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayItemId() {
        return this.displayItemId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDisplayItemType() {
        return this.displayItemType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final AudioSyncRecord copy(String id, String audioId, int audioPosition, String displayItemId, int displayItemType, long creationTime, long lastModificationTime, boolean deleted) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(audioId, "audioId");
        OooOOO0.OooO0oO(displayItemId, "displayItemId");
        return new AudioSyncRecord(id, audioId, audioPosition, displayItemId, displayItemType, creationTime, lastModificationTime, deleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSyncRecord)) {
            return false;
        }
        AudioSyncRecord audioSyncRecord = (AudioSyncRecord) other;
        return OooOOO0.OooO0O0(this.id, audioSyncRecord.id) && OooOOO0.OooO0O0(this.audioId, audioSyncRecord.audioId) && this.audioPosition == audioSyncRecord.audioPosition && OooOOO0.OooO0O0(this.displayItemId, audioSyncRecord.displayItemId) && this.displayItemType == audioSyncRecord.displayItemType && this.creationTime == audioSyncRecord.creationTime && this.lastModificationTime == audioSyncRecord.lastModificationTime && this.deleted == audioSyncRecord.deleted;
    }

    public final String getAudioId() {
        return this.audioId;
    }

    public final int getAudioPosition() {
        return this.audioPosition;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDisplayItemId() {
        return this.displayItemId;
    }

    public final int getDisplayItemType() {
        return this.displayItemType;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.displayItemType, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.audioPosition, OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.audioId), 31), 31, this.displayItemId), 31), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.audioId;
        int i = this.audioPosition;
        String str3 = this.displayItemId;
        int i2 = this.displayItemType;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        boolean z = this.deleted;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("AudioSyncRecord(id=", str, ", audioId=", str2, ", audioPosition=");
        C21036OooOOo0.OooO0Oo(i, ", displayItemId=", str3, ", displayItemType=", sbOooO0O0);
        sbOooO0O0.append(i2);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", deleted=", sbOooO0O0);
        return OooOOO.OooO00o(sbOooO0O0, ")", z);
    }

    public /* synthetic */ AudioSyncRecord(String str, String str2, int i, String str3, int i2, long j, long j2, boolean z, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, i, str3, i2, j, j2, (i3 & 128) != 0 ? false : z);
    }
}
