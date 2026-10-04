package o0oOoOo;

import java.util.List;

/* JADX INFO: renamed from: o0oOoOo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31080OoooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f110926OooO0O0;

    public C31080OoooOoo(int i, List<C31062Oooo000> list) {
        this.f110925OooO00o = i;
        this.f110926OooO0O0 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31080OoooOoo)) {
            return false;
        }
        C31080OoooOoo c31080OoooOoo = (C31080OoooOoo) obj;
        return this.f110925OooO00o == c31080OoooOoo.f110925OooO00o && this.f110926OooO0O0.equals(c31080OoooOoo.f110926OooO0O0);
    }

    public final int hashCode() {
        return this.f110926OooO0O0.hashCode() + (Integer.hashCode(this.f110925OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StylusShortcutSection(titleRes=");
        sb.append(this.f110925OooO00o);
        sb.append(", options=");
        return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f110926OooO0O0, ")");
    }
}
