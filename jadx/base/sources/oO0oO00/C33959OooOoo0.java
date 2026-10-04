package oO0oO00;

import OooOoo.C20593OooO0Oo;
import o0Ooo0oO.C29437OooOO0O;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O.C33549OooO00o;
import oO0o0O.C33550OooO0O0;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33959OooOoo0 implements InterfaceC33911OooO0OO<C33549OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33959OooOoo0 f122173OooO00o = new C33959OooOoo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f122174OooO0O0 = new oo0o0Oo("kotlin.time.Duration", AbstractC33526OooO0Oo.OooO.f121105OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        int i = C33549OooO00o.f121147OooOoO;
        String value = oooO0OO.OooOO0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        try {
            return new C33549OooO00o(C29437OooOO0O.OooO00o(value));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Invalid ISO duration string format: '", value, "'."), e);
        }
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122174OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        long j;
        long j2;
        int iOooO0oo;
        long j3 = ((C33549OooO00o) obj).f121149OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        int i = C33549OooO00o.f121147OooOoO;
        StringBuilder sb = new StringBuilder();
        if (j3 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z = true;
        if (j3 < 0) {
            j = ((-(j3 >> 1)) << 1) + ((long) (((int) j3) & 1));
            int i2 = C33550OooO0O0.f121150OooO00o;
        } else {
            j = j3;
        }
        long jOooO0oo = C33549OooO00o.OooO0oo(j, EnumC33551OooO0OO.f121156OooOoo0);
        if (C33549OooO00o.OooO0o(j)) {
            j2 = 0;
            iOooO0oo = 0;
        } else {
            j2 = 0;
            iOooO0oo = (int) (C33549OooO00o.OooO0oo(j, EnumC33551OooO0OO.f121154OooOoOO) % ((long) 60));
        }
        int iOooO0oo2 = C33549OooO00o.OooO0o(j) ? 0 : (int) (C33549OooO00o.OooO0oo(j, EnumC33551OooO0OO.f121152OooOoO) % ((long) 60));
        int iOooO0o0 = C33549OooO00o.OooO0o0(j);
        if (C33549OooO00o.OooO0o(j3)) {
            jOooO0oo = 9999999999999L;
        }
        boolean z2 = jOooO0oo != j2;
        boolean z3 = (iOooO0oo2 == 0 && iOooO0o0 == 0) ? false : true;
        if (iOooO0oo == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jOooO0oo);
            sb.append('H');
        }
        if (z) {
            sb.append(iOooO0oo);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C33549OooO00o.OooO0O0(sb, iOooO0oo2, iOooO0o0, 9, "S", true);
        }
        encoder.OooOOoo(sb.toString());
    }
}
