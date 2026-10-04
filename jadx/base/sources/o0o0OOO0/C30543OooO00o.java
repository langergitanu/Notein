package o0o0OOO0;

import OooOoo0.o00000;
import androidx.appcompat.app.OooOOO;
import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0OOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30543OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<Integer> f109251OooO0Oo = C34429OooOOo0.OooOO0o(0, 1, 2, 3, 4, 5, 6);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f109252OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f109253OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f109254OooO0OO;

    public C30543OooO00o(int i, boolean z, boolean z2) {
        this.f109252OooO00o = i;
        this.f109253OooO0O0 = z;
        this.f109254OooO0OO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30543OooO00o)) {
            return false;
        }
        C30543OooO00o c30543OooO00o = (C30543OooO00o) obj;
        return this.f109252OooO00o == c30543OooO00o.f109252OooO00o && this.f109253OooO0O0 == c30543OooO00o.f109253OooO0O0 && this.f109254OooO0OO == c30543OooO00o.f109254OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109254OooO0OO) + o00000.OooO0O0(Integer.hashCode(this.f109252OooO00o) * 31, 31, this.f109253OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageOperationVO(type=");
        sb.append(this.f109252OooO00o);
        sb.append(", isVipBadgeVisible=");
        sb.append(this.f109253OooO0O0);
        sb.append(", isEnable=");
        return OooOOO.OooO00o(sb, ")", this.f109254OooO0OO);
    }
}
