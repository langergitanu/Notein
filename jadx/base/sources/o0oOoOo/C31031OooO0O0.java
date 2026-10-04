package o0oOoOo;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oOoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31031OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<C31031OooO0O0> f110777OooO0o0 = C34429OooOOo0.OooOO0o(new C31031OooO0O0(0, 0, false, false), new C31031OooO0O0(1, 1, false, false), new C31031OooO0O0(2, 2, false, false), new C31031OooO0O0(4, 3, false, false));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110779OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110780OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110781OooO0Oo;

    public C31031OooO0O0(int i, int i2, boolean z, boolean z2) {
        this.f110778OooO00o = i;
        this.f110779OooO0O0 = i2;
        this.f110780OooO0OO = z;
        this.f110781OooO0Oo = z2;
    }

    public static C31031OooO0O0 OooO00o(C31031OooO0O0 c31031OooO0O0, boolean z, int i) {
        int i2 = c31031OooO0O0.f110778OooO00o;
        int i3 = c31031OooO0O0.f110779OooO0O0;
        if ((i & 4) != 0) {
            z = c31031OooO0O0.f110780OooO0OO;
        }
        boolean z2 = (i & 8) != 0 ? c31031OooO0O0.f110781OooO0Oo : true;
        c31031OooO0O0.getClass();
        return new C31031OooO0O0(i2, i3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31031OooO0O0)) {
            return false;
        }
        C31031OooO0O0 c31031OooO0O0 = (C31031OooO0O0) obj;
        return this.f110778OooO00o == c31031OooO0O0.f110778OooO00o && this.f110779OooO0O0 == c31031OooO0O0.f110779OooO0O0 && this.f110780OooO0OO == c31031OooO0O0.f110780OooO0OO && this.f110781OooO0Oo == c31031OooO0O0.f110781OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110781OooO0Oo) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f110779OooO0O0, Integer.hashCode(this.f110778OooO00o) * 31, 31), 31, this.f110780OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeginnerGuide(type=");
        sb.append(this.f110778OooO00o);
        sb.append(", index=");
        sb.append(this.f110779OooO0O0);
        sb.append(", isReady=");
        sb.append(this.f110780OooO0OO);
        sb.append(", shown=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110781OooO0Oo);
    }
}
