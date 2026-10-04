package o0oOoOoo;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOoOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31103OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f111000OooO0O0;

    public C31103OooO0O0(String noteId, boolean z) {
        OooOOO0.OooO0oO(noteId, "noteId");
        this.f110999OooO00o = noteId;
        this.f111000OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31103OooO0O0)) {
            return false;
        }
        C31103OooO0O0 c31103OooO0O0 = (C31103OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f110999OooO00o, c31103OooO0O0.f110999OooO00o) && this.f111000OooO0O0 == c31103OooO0O0.f111000OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111000OooO0O0) + (this.f110999OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "EditorRecentNoteVO(noteId=" + this.f110999OooO00o + ", isSelected=" + this.f111000OooO0O0 + ")";
    }
}
