package com.orion.notein.domain.models.note;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooO0OO;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006&"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/AudioFile;", "", "id", "", "filePath", "audioName", "duration", "", "playSpeed", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFJJ)V", "getId", "()Ljava/lang/String;", "getFilePath", "getAudioName", "getDuration", "()J", "getPlaySpeed", "()F", "getCreationTime", "getLastModificationTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AudioFile {
    private final String audioName;
    private final long creationTime;
    private final long duration;
    private final String filePath;
    private final String id;
    private final long lastModificationTime;
    private final float playSpeed;

    public AudioFile(String id, String filePath, String audioName, long j, float f, long j2, long j3) {
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

    public static /* synthetic */ AudioFile copy$default(AudioFile audioFile, String str, String str2, String str3, long j, float f, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioFile.id;
        }
        if ((i & 2) != 0) {
            str2 = audioFile.filePath;
        }
        if ((i & 4) != 0) {
            str3 = audioFile.audioName;
        }
        if ((i & 8) != 0) {
            j = audioFile.duration;
        }
        if ((i & 16) != 0) {
            f = audioFile.playSpeed;
        }
        if ((i & 32) != 0) {
            j2 = audioFile.creationTime;
        }
        if ((i & 64) != 0) {
            j3 = audioFile.lastModificationTime;
        }
        float f2 = f;
        long j4 = j;
        String str4 = str3;
        return audioFile.copy(str, str2, str4, j4, f2, j2, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAudioName() {
        return this.audioName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getPlaySpeed() {
        return this.playSpeed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final AudioFile copy(String id, String filePath, String audioName, long duration, float playSpeed, long creationTime, long lastModificationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(filePath, "filePath");
        OooOOO0.OooO0oO(audioName, "audioName");
        return new AudioFile(id, filePath, audioName, duration, playSpeed, creationTime, lastModificationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioFile)) {
            return false;
        }
        AudioFile audioFile = (AudioFile) other;
        return OooOOO0.OooO0O0(this.id, audioFile.id) && OooOOO0.OooO0O0(this.filePath, audioFile.filePath) && OooOOO0.OooO0O0(this.audioName, audioFile.audioName) && this.duration == audioFile.duration && Float.compare(this.playSpeed, audioFile.playSpeed) == 0 && this.creationTime == audioFile.creationTime && this.lastModificationTime == audioFile.lastModificationTime;
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

    public int hashCode() {
        return Long.hashCode(this.lastModificationTime) + C20703o000000o.OooO0O0(C20509OooO0oo.OooO0OO(this.playSpeed, C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.filePath), 31, this.audioName), 31, this.duration), 31), 31, this.creationTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.filePath;
        String str3 = this.audioName;
        long j = this.duration;
        float f = this.playSpeed;
        long j2 = this.creationTime;
        long j3 = this.lastModificationTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("AudioFile(id=", str, ", filePath=", str2, ", audioName=");
        OooO.OooO00o(j, str3, ", duration=", sbOooO0O0);
        sbOooO0O0.append(", playSpeed=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j2);
        return OooO0OO.OooO00o(j3, ", lastModificationTime=", ")", sbOooO0O0);
    }

    public /* synthetic */ AudioFile(String str, String str2, String str3, long j, float f, long j2, long j3, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, j, f, j2, j3);
    }
}
