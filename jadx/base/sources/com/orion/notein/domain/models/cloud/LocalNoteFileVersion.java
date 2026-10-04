package com.orion.notein.domain.models.cloud;

import OooOoo0.C20703o000000o;
import com.aspose.slides.OooOOO;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/LocalNoteFileVersion;", "", "id", "", "editedTime", "", "lastHistoryVersionId", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getEditedTime", "()J", "getLastHistoryVersionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LocalNoteFileVersion {
    private final long editedTime;
    private final String id;
    private final String lastHistoryVersionId;

    public LocalNoteFileVersion(String id, long j, String str) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.editedTime = j;
        this.lastHistoryVersionId = str;
    }

    public static /* synthetic */ LocalNoteFileVersion copy$default(LocalNoteFileVersion localNoteFileVersion, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localNoteFileVersion.id;
        }
        if ((i & 2) != 0) {
            j = localNoteFileVersion.editedTime;
        }
        if ((i & 4) != 0) {
            str2 = localNoteFileVersion.lastHistoryVersionId;
        }
        return localNoteFileVersion.copy(str, j, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEditedTime() {
        return this.editedTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastHistoryVersionId() {
        return this.lastHistoryVersionId;
    }

    public final LocalNoteFileVersion copy(String id, long editedTime, String lastHistoryVersionId) {
        OooOOO0.OooO0oO(id, "id");
        return new LocalNoteFileVersion(id, editedTime, lastHistoryVersionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalNoteFileVersion)) {
            return false;
        }
        LocalNoteFileVersion localNoteFileVersion = (LocalNoteFileVersion) other;
        return OooOOO0.OooO0O0(this.id, localNoteFileVersion.id) && this.editedTime == localNoteFileVersion.editedTime && OooOOO0.OooO0O0(this.lastHistoryVersionId, localNoteFileVersion.lastHistoryVersionId);
    }

    public final long getEditedTime() {
        return this.editedTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastHistoryVersionId() {
        return this.lastHistoryVersionId;
    }

    public int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(this.id.hashCode() * 31, 31, this.editedTime);
        String str = this.lastHistoryVersionId;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        long j = this.editedTime;
        String str2 = this.lastHistoryVersionId;
        StringBuilder sb = new StringBuilder("LocalNoteFileVersion(id=");
        sb.append(str);
        sb.append(", editedTime=");
        sb.append(j);
        return OooOOO.OooO0O0(sb, ", lastHistoryVersionId=", str2, ")");
    }

    public /* synthetic */ LocalNoteFileVersion(String str, long j, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, j, (i & 4) != 0 ? null : str2);
    }
}
