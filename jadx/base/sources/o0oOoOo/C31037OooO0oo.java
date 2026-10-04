package o0oOoOo;

import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oOoOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31037OooO0oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final List<Integer> f110811OooO0OO = C34429OooOOo0.OooOO0o(0, 1, 2, 3);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110813OooO0O0;

    public C31037OooO0oo(int i, boolean z) {
        this.f110812OooO00o = i;
        this.f110813OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31037OooO0oo)) {
            return false;
        }
        C31037OooO0oo c31037OooO0oo = (C31037OooO0oo) obj;
        return this.f110812OooO00o == c31037OooO0oo.f110812OooO00o && this.f110813OooO0O0 == c31037OooO0oo.f110813OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110813OooO0O0) + (Integer.hashCode(this.f110812OooO00o) * 31);
    }

    public final String toString() {
        return "DoubleTapSettingVO(mode=" + this.f110812OooO00o + ", selected=" + this.f110813OooO0O0 + ")";
    }
}
