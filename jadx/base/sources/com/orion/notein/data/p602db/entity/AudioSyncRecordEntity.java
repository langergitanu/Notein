package com.orion.notein.data.p602db.entity;

import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/AudioSyncRecordEntity;", "", "id", "", "audioId", "audioPosition", "", "displayItemId", "displayItemType", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "deleted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IJJZ)V", "getId", "()Ljava/lang/String;", "getAudioId", "getAudioPosition", "()I", "getDisplayItemId", "getDisplayItemType", "getCreationTime", "()J", "getLastModificationTime", "getDeleted", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AudioSyncRecordEntity {
    private final String audioId;
    private final int audioPosition;
    private final long creationTime;
    private final boolean deleted;
    private final String displayItemId;
    private final int displayItemType;
    private final String id;
    private final long lastModificationTime;

    public AudioSyncRecordEntity(String id, String audioId, int i, String displayItemId, int i2, long j, long j2, boolean z) {
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
}
