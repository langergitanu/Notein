package com.orion.notein.data.p602db.entity;

import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/AudioFileEntity;", "", "id", "", "filePath", "audioName", "duration", "", "playSpeed", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFJJ)V", "getId", "()Ljava/lang/String;", "getFilePath", "getAudioName", "getDuration", "()J", "getPlaySpeed", "()F", "getCreationTime", "getLastModificationTime", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AudioFileEntity {
    private final String audioName;
    private final long creationTime;
    private final long duration;
    private final String filePath;
    private final String id;
    private final long lastModificationTime;
    private final float playSpeed;

    public AudioFileEntity(String id, String filePath, String audioName, long j, float f, long j2, long j3) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(filePath, "filePath");
        OooOOO0.OooO0oO(audioName, "audioName");
        this.id = id;
        this.filePath = filePath;
        this.audioName = audioName;
        this.duration = j;
        this.playSpeed = f;
        this.creationTime = j2;
        this.lastModificationTime = j3;
    }

    public final String getAudioName() {
        return this.audioName;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final float getPlaySpeed() {
        return this.playSpeed;
    }
}
