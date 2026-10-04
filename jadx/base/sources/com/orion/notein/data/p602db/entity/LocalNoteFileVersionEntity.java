package com.orion.notein.data.p602db.entity;

import OooOoo0.C20703o000000o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/LocalNoteFileVersionEntity;", "", "id", "", "editedTime", "", "lastHistoryVersionId", "syncType", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getEditedTime", "()J", "getLastHistoryVersionId", "getSyncType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LocalNoteFileVersionEntity {
    private final long editedTime;
    private final String id;
    private final String lastHistoryVersionId;
    private final int syncType;

    public LocalNoteFileVersionEntity(String id, long j, String str, int i) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.editedTime = j;
        this.lastHistoryVersionId = str;
        this.syncType = i;
    }

    public static /* synthetic */ LocalNoteFileVersionEntity copy$default(LocalNoteFileVersionEntity localNoteFileVersionEntity, String str, long j, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = localNoteFileVersionEntity.id;
        }
        if ((i2 & 2) != 0) {
            j = localNoteFileVersionEntity.editedTime;
        }
        if ((i2 & 4) != 0) {
            str2 = localNoteFileVersionEntity.lastHistoryVersionId;
        }
        if ((i2 & 8) != 0) {
            i = localNoteFileVersionEntity.syncType;
        }
        return localNoteFileVersionEntity.copy(str, j, str2, i);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSyncType() {
        return this.syncType;
    }

    public final LocalNoteFileVersionEntity copy(String id, long editedTime, String lastHistoryVersionId, int syncType) {
        OooOOO0.OooO0oO(id, "id");
        return new LocalNoteFileVersionEntity(id, editedTime, lastHistoryVersionId, syncType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalNoteFileVersionEntity)) {
            return false;
        }
        LocalNoteFileVersionEntity localNoteFileVersionEntity = (LocalNoteFileVersionEntity) other;
        return OooOOO0.OooO0O0(this.id, localNoteFileVersionEntity.id) && this.editedTime == localNoteFileVersionEntity.editedTime && OooOOO0.OooO0O0(this.lastHistoryVersionId, localNoteFileVersionEntity.lastHistoryVersionId) && this.syncType == localNoteFileVersionEntity.syncType;
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

    public final int getSyncType() {
        return this.syncType;
    }

    public int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(this.id.hashCode() * 31, 31, this.editedTime);
        String str = this.lastHistoryVersionId;
        return Integer.hashCode(this.syncType) + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "LocalNoteFileVersionEntity(id=" + this.id + ", editedTime=" + this.editedTime + ", lastHistoryVersionId=" + this.lastHistoryVersionId + ", syncType=" + this.syncType + ")";
    }

    public /* synthetic */ LocalNoteFileVersionEntity(String str, long j, String str2, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, j, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i);
    }
}
