package com.orion.notein.domain.models.note;

import OooOoo0.C20703o000000o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.facebook.soloader.OooO0OO;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteHistoryVersion;", "", "id", "", "name", "editedTime", "", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getId", "()Ljava/lang/String;", "getName", "getEditedTime", "()J", "getSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteHistoryVersion {
    private final long editedTime;
    private final String id;
    private final String name;
    private final long size;

    public NoteHistoryVersion(String id, String str, long j, long j2) {
        OooOOO0.OooO0oO(id, "id");
        this.id = id;
        this.name = str;
        this.editedTime = j;
        this.size = j2;
    }

    public static /* synthetic */ NoteHistoryVersion copy$default(NoteHistoryVersion noteHistoryVersion, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteHistoryVersion.id;
        }
        if ((i & 2) != 0) {
            str2 = noteHistoryVersion.name;
        }
        if ((i & 4) != 0) {
            j = noteHistoryVersion.editedTime;
        }
        if ((i & 8) != 0) {
            j2 = noteHistoryVersion.size;
        }
        long j3 = j2;
        return noteHistoryVersion.copy(str, str2, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEditedTime() {
        return this.editedTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final NoteHistoryVersion copy(String id, String name, long editedTime, long size) {
        OooOOO0.OooO0oO(id, "id");
        return new NoteHistoryVersion(id, name, editedTime, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteHistoryVersion)) {
            return false;
        }
        NoteHistoryVersion noteHistoryVersion = (NoteHistoryVersion) other;
        return OooOOO0.OooO0O0(this.id, noteHistoryVersion.id) && OooOOO0.OooO0O0(this.name, noteHistoryVersion.name) && this.editedTime == noteHistoryVersion.editedTime && this.size == noteHistoryVersion.size;
    }

    public final long getEditedTime() {
        return this.editedTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        return Long.hashCode(this.size) + C20703o000000o.OooO0O0((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.editedTime);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        long j = this.editedTime;
        long j2 = this.size;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteHistoryVersion(id=", str, ", name=", str2, ", editedTime=");
        sbOooO0O0.append(j);
        return OooO0OO.OooO00o(j2, ", size=", ")", sbOooO0O0);
    }

    public /* synthetic */ NoteHistoryVersion(String str, String str2, long j, long j2, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : str2, j, j2);
    }
}
