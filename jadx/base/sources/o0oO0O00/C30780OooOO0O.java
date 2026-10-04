package o0oO0O00;

import OooOoo0.o00000;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0ooo0.EnumC26248OooOo0;

/* JADX INFO: renamed from: o0oO0O00.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30780OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110051OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110052OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110053OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EnumC26248OooOo0 f110054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final EnumC30775OooO0o f110055OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Integer f110056OooO0o0;

    public C30780OooOO0O() {
        this(0);
    }

    public static C30780OooOO0O OooO00o(C30780OooOO0O c30780OooOO0O, String str, boolean z, boolean z2, EnumC26248OooOo0 enumC26248OooOo0, Integer num, int i) {
        if ((i & 1) != 0) {
            str = c30780OooOO0O.f110051OooO00o;
        }
        String password = str;
        if ((i & 4) != 0) {
            z2 = c30780OooOO0O.f110053OooO0OO;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            enumC26248OooOo0 = c30780OooOO0O.f110054OooO0Oo;
        }
        EnumC26248OooOo0 fieldState = enumC26248OooOo0;
        if ((i & 16) != 0) {
            num = c30780OooOO0O.f110056OooO0o0;
        }
        EnumC30775OooO0o mode = c30780OooOO0O.f110055OooO0o;
        c30780OooOO0O.getClass();
        OooOOO0.OooO0oO(password, "password");
        OooOOO0.OooO0oO(fieldState, "fieldState");
        OooOOO0.OooO0oO(mode, "mode");
        return new C30780OooOO0O(password, z, z3, fieldState, num, mode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30780OooOO0O)) {
            return false;
        }
        C30780OooOO0O c30780OooOO0O = (C30780OooOO0O) obj;
        return OooOOO0.OooO0O0(this.f110051OooO00o, c30780OooOO0O.f110051OooO00o) && this.f110052OooO0O0 == c30780OooOO0O.f110052OooO0O0 && this.f110053OooO0OO == c30780OooOO0O.f110053OooO0OO && this.f110054OooO0Oo == c30780OooOO0O.f110054OooO0Oo && OooOOO0.OooO0O0(this.f110056OooO0o0, c30780OooOO0O.f110056OooO0o0) && this.f110055OooO0o == c30780OooOO0O.f110055OooO0o;
    }

    public final int hashCode() {
        int iHashCode = (this.f110054OooO0Oo.hashCode() + o00000.OooO0O0(o00000.OooO0O0(this.f110051OooO00o.hashCode() * 31, 31, this.f110052OooO0O0), 31, this.f110053OooO0OO)) * 31;
        Integer num = this.f110056OooO0o0;
        return this.f110055OooO0o.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "SetPasswordUiState(password=" + this.f110051OooO00o + ", submitEnabled=" + this.f110052OooO0O0 + ", isSubmitting=" + this.f110053OooO0OO + ", fieldState=" + this.f110054OooO0Oo + ", supportingTextRes=" + this.f110056OooO0o0 + ", mode=" + this.f110055OooO0o + ")";
    }

    public C30780OooOO0O(String str, boolean z, boolean z2, EnumC26248OooOo0 enumC26248OooOo0, Integer num, EnumC30775OooO0o enumC30775OooO0o) {
        this.f110051OooO00o = str;
        this.f110052OooO0O0 = z;
        this.f110053OooO0OO = z2;
        this.f110054OooO0Oo = enumC26248OooOo0;
        this.f110056OooO0o0 = num;
        this.f110055OooO0o = enumC30775OooO0o;
    }

    public /* synthetic */ C30780OooOO0O(int i) {
        this("", false, false, EnumC26248OooOo0.f89694OooOo0o, Integer.valueOf(R.string.password_hint), EnumC30775OooO0o.f110045OooOo0o);
    }
}
