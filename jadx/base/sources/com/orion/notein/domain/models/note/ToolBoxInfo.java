package com.orion.notein.domain.models.note;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/ToolBoxInfo;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "pos", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getNoteId", "getPos", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ToolBoxInfo {
    private final String id;
    private final String noteId;
    private final int pos;

    public ToolBoxInfo(String id, String noteId, int i) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        this.id = id;
        this.noteId = noteId;
        this.pos = i;
    }

    public static /* synthetic */ ToolBoxInfo copy$default(ToolBoxInfo toolBoxInfo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = toolBoxInfo.id;
        }
        if ((i2 & 2) != 0) {
            str2 = toolBoxInfo.noteId;
        }
        if ((i2 & 4) != 0) {
            i = toolBoxInfo.pos;
        }
        return toolBoxInfo.copy(str, str2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPos() {
        return this.pos;
    }

    public final ToolBoxInfo copy(String id, String noteId, int pos) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        return new ToolBoxInfo(id, noteId, pos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolBoxInfo)) {
            return false;
        }
        ToolBoxInfo toolBoxInfo = (ToolBoxInfo) other;
        return OooOOO0.OooO0O0(this.id, toolBoxInfo.id) && OooOOO0.OooO0O0(this.noteId, toolBoxInfo.noteId) && this.pos == toolBoxInfo.pos;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final int getPos() {
        return this.pos;
    }

    public int hashCode() {
        return Integer.hashCode(this.pos) + OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId);
    }

    public String toString() {
        return C21023OooO0Oo.OooO0OO(")", this.pos, OooO0o.OooO0O0("ToolBoxInfo(id=", this.id, ", noteId=", this.noteId, ", pos="));
    }
}
