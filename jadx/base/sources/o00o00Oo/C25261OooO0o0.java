package o00o00Oo;

import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import o00ooOO.C25769OooO0o;
import o0o0OO0O.C30442OooOo0O;

/* JADX INFO: renamed from: o00o00Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25261OooO0o0 implements InterfaceC25269OooOOOO {
    public static C30442OooOo0O OooO00o(String noteId, NavEditorLayoutInfo navEditorLayoutInfo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        return new C30442OooOo0O(noteId, navEditorLayoutInfo);
    }

    public static final Boolean OooO0O0(boolean z) {
        return Boolean.valueOf(z);
    }

    public static final Integer OooO0OO(int i) {
        return new Integer(i);
    }

    public static final Long OooO0Oo(long j) {
        return new Long(j);
    }

    public static final int OooO0o0(int i) {
        C25769OooO0o c25769OooO0o = C25769OooO0o.f87943OooO00o;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }
}
