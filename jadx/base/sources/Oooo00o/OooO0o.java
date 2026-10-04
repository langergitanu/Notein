package Oooo00o;

import OooooO0.C21284OooO;
import OooooO0.C21286OooO0O0;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import OooooO0.C21292OooO0oo;
import OooooOO.AbstractC21365o0OoOo0;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.EnumC24238OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends AbstractC20903OooO00o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(InterfaceC20904OooO0O0 topStart, InterfaceC20904OooO0O0 interfaceC20904OooO0O0, InterfaceC20904OooO0O0 bottomEnd, InterfaceC20904OooO0O0 interfaceC20904OooO0O02) {
        super(topStart, interfaceC20904OooO0O0, bottomEnd, interfaceC20904OooO0O02);
        OooOOO0.OooO0oO(topStart, "topStart");
        OooOOO0.OooO0oO(bottomEnd, "bottomEnd");
    }

    @Override // Oooo00o.AbstractC20903OooO00o
    public final AbstractC21365o0OoOo0 OooO0O0(long j, float f, float f2, float f3, float f4, EnumC24238OooOOO layoutDirection) {
        OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            return new AbstractC21365o0OoOo0.OooO0O0(C21292OooO0oo.OooO0Oo(C21290OooO0o0.f61718OooO0O0, j));
        }
        C21291OooO0oO c21291OooO0oOOooO0Oo = C21292OooO0oo.OooO0Oo(C21290OooO0o0.f61718OooO0O0, j);
        EnumC24238OooOOO enumC24238OooOOO = EnumC24238OooOOO.f81494OooOo0o;
        float f5 = layoutDirection == enumC24238OooOOO ? f : f2;
        long jOooO00o = C21286OooO0O0.OooO00o(f5, f5);
        float f6 = layoutDirection == enumC24238OooOOO ? f2 : f;
        long jOooO00o2 = C21286OooO0O0.OooO00o(f6, f6);
        float f7 = layoutDirection == enumC24238OooOOO ? f3 : f4;
        long jOooO00o3 = C21286OooO0O0.OooO00o(f7, f7);
        float f8 = layoutDirection == enumC24238OooOOO ? f4 : f3;
        return new AbstractC21365o0OoOo0.OooO0OO(new C21284OooO(c21291OooO0oOOooO0Oo.f61724OooO00o, c21291OooO0oOOooO0Oo.f61725OooO0O0, c21291OooO0oOOooO0Oo.f61726OooO0OO, c21291OooO0oOOooO0Oo.f61727OooO0Oo, jOooO00o, jOooO00o2, jOooO00o3, C21286OooO0O0.OooO00o(f8, f8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        if (!OooOOO0.OooO0O0(this.f60293OooO00o, oooO0o.f60293OooO00o)) {
            return false;
        }
        if (!OooOOO0.OooO0O0(this.f60294OooO0O0, oooO0o.f60294OooO0O0)) {
            return false;
        }
        if (OooOOO0.OooO0O0(this.f60295OooO0OO, oooO0o.f60295OooO0OO)) {
            return OooOOO0.OooO0O0(this.f60296OooO0Oo, oooO0o.f60296OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60296OooO0Oo.hashCode() + ((this.f60295OooO0OO.hashCode() + ((this.f60294OooO0O0.hashCode() + (this.f60293OooO00o.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f60293OooO00o + ", topEnd = " + this.f60294OooO0O0 + ", bottomEnd = " + this.f60295OooO0OO + ", bottomStart = " + this.f60296OooO0Oo + ')';
    }
}
