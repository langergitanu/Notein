package com.orion.notein.p607ui.p609vo;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OOooO0.C27905OooOo0;
import o0oOoOo.C31048OooOo;
import o0oOoOo.C31052OooOo0o;
import o0oOoOo.C31053OooOoO;
import o0oOoOo.C31054OooOoO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/ui/vo/NoteVOFilter;", "Ljava/io/Serializable;", "", FirebaseAnalytics.Param.INDEX, "", "description", "<init>", "(ILjava/lang/String;)V", "Lkotlin/Function1;", "Lcom/orion/notein/ui/vo/NoteVO;", "", "getFilterFunction", "()LoO0O000o/OooOO0o;", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/orion/notein/ui/vo/NoteVOFilter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/lang/String;", "getDescription", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteVOFilter implements Serializable {
    private final String description;
    private final int index;

    public NoteVOFilter(int i, String description) {
        OooOOO0.OooO0oO(description, "description");
        this.index = i;
        this.description = description;
    }

    public static /* synthetic */ NoteVOFilter copy$default(NoteVOFilter noteVOFilter, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = noteVOFilter.index;
        }
        if ((i2 & 2) != 0) {
            str = noteVOFilter.description;
        }
        return noteVOFilter.copy(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilterFunction$lambda$0(NoteVO noteVO) {
        OooOOO0.OooO0oO(noteVO, "<unused var>");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilterFunction$lambda$1(NoteVO vo) {
        OooOOO0.OooO0oO(vo, "vo");
        return vo.getType() == 0 && vo.isPdf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilterFunction$lambda$2(NoteVO vo) {
        OooOOO0.OooO0oO(vo, "vo");
        return vo.getType() == 0 && !vo.isPdf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilterFunction$lambda$3(NoteVO vo) {
        OooOOO0.OooO0oO(vo, "vo");
        return vo.getType() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilterFunction$lambda$4(NoteVO noteVO) {
        OooOOO0.OooO0oO(noteVO, "<unused var>");
        return true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final NoteVOFilter copy(int index, String description) {
        OooOOO0.OooO0oO(description, "description");
        return new NoteVOFilter(index, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteVOFilter)) {
            return false;
        }
        NoteVOFilter noteVOFilter = (NoteVOFilter) other;
        return this.index == noteVOFilter.index && OooOOO0.OooO0O0(this.description, noteVOFilter.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final InterfaceC32507OooOO0o<NoteVO, Boolean> getFilterFunction() {
        int i = this.index;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new C31053OooOoO() : new C31054OooOoO0() : new C31048OooOo() : new C27905OooOo0(1) : new C31052OooOo0o();
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return this.description.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        return "NoteVOFilter(index=" + this.index + ", description=" + this.description + ")";
    }
}
