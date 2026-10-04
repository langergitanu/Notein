package Oooo0oO;

import OooOo.C20483OooOo0O;
import Oooo0oO.InterfaceC21033OooOOOO;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f61061OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC21090o0000Ooo f61062OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C21025OooO0o0 f61063OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public InterfaceC32508OooOOOo<? super InterfaceC21033OooOOOO, ? super Integer, C32460OooOooO> f61064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C20483OooOo0O<Object> f61065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f61066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOo.OooOo<InterfaceC21050Oooo<?>, Object> f61067OooO0oO;

    public static final class OooO00o {
        public static void OooO00o(C21096o0000oO0 c21096o0000oO0, List list, InterfaceC21090o0000Ooo interfaceC21090o0000Ooo) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int iOooO0OO = c21096o0000oO0.OooO0OO((C21025OooO0o0) list.get(i));
                int iOooo00O = c21096o0000oO0.Oooo00O(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooO0OO));
                Object obj = iOooo00O < c21096o0000oO0.OooO0o(c21096o0000oO0.f61180OooO0O0, c21096o0000oO0.OooOOOo(iOooO0OO + 1)) ? c21096o0000oO0.f61181OooO0OO[c21096o0000oO0.OooO0oO(iOooo00O)] : InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
                o00000OO o00000oo2 = obj instanceof o00000OO ? (o00000OO) obj : null;
                if (o00000oo2 != null) {
                    o00000oo2.f61062OooO0O0 = interfaceC21090o0000Ooo;
                }
            }
        }
    }

    public o00000OO(C21047OooOoo0 c21047OooOoo0) {
        this.f61062OooO0O0 = c21047OooOoo0;
    }

    public static boolean OooO00o(InterfaceC21050Oooo interfaceC21050Oooo, OooOo.OooOo oooOo) {
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC21050Oooo, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        o000O000 o000o000OooO00o = interfaceC21050Oooo.OooO00o();
        if (o000o000OooO00o == null) {
            o000o000OooO00o = o000O0O0.f61218OooO00o;
        }
        return !o000o000OooO00o.OooO00o(interfaceC21050Oooo.OooO0oO().f61005OooO0o, oooOo.OooO0O0(interfaceC21050Oooo));
    }

    public final boolean OooO0O0() {
        if (this.f61062OooO0O0 != null) {
            C21025OooO0o0 c21025OooO0o0 = this.f61063OooO0OO;
            if (c21025OooO0o0 != null ? c21025OooO0o0.OooO00o() : false) {
                return true;
            }
        }
        return false;
    }

    public final EnumC21071Ooooo0o OooO0OO(Object obj) {
        EnumC21071Ooooo0o enumC21071Ooooo0oOooO0oo;
        InterfaceC21090o0000Ooo interfaceC21090o0000Ooo = this.f61062OooO0O0;
        return (interfaceC21090o0000Ooo == null || (enumC21071Ooooo0oOooO0oo = interfaceC21090o0000Ooo.OooO0oo(this, obj)) == null) ? EnumC21071Ooooo0o.f61030OooOo0o : enumC21071Ooooo0oOooO0oo;
    }

    public final void OooO0Oo() {
        InterfaceC21090o0000Ooo interfaceC21090o0000Ooo = this.f61062OooO0O0;
        if (interfaceC21090o0000Ooo != null) {
            interfaceC21090o0000Ooo.OooO();
        }
        this.f61062OooO0O0 = null;
        this.f61065OooO0o = null;
        this.f61067OooO0oO = null;
    }

    public final void OooO0o0(boolean z) {
        if (z) {
            this.f61061OooO00o |= 32;
        } else {
            this.f61061OooO00o &= -33;
        }
    }

    @Override // Oooo0oO.o00000O
    public final void invalidate() {
        InterfaceC21090o0000Ooo interfaceC21090o0000Ooo = this.f61062OooO0O0;
        if (interfaceC21090o0000Ooo != null) {
            interfaceC21090o0000Ooo.OooO0oo(this, null);
        }
    }
}
