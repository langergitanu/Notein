package OooOoOO;

import OoooOoO.InterfaceC21233OooO0o;
import o0Oo0oo.C28391OooOOO0;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32448OooOOo0;
import oO00ooO.C32455OooOoO;
import oO00ooO.C32461OooOooo;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: OooOoOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C20519OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f58609OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f58610OooO0O0 = 0;

    public static C20518OooO0OO OooO00o(float f) {
        return new C20518OooO0OO(Float.valueOf(f), C20580ooOO.f58832OooO00o, Float.valueOf(0.01f), "Animatable");
    }

    public static InterfaceC32440OooOO0 OooO0O0(EnumC32441OooOO0O enumC32441OooOO0O, oO0O000o.OooO00o initializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initializer, "initializer");
        int iOrdinal = enumC32441OooOO0O.ordinal();
        if (iOrdinal == 0) {
            return new C32447OooOOo(initializer);
        }
        C32455OooOoO c32455OooOoO = C32455OooOoO.f116659OooO00o;
        if (iOrdinal == 1) {
            C32448OooOOo0 c32448OooOOo0 = new C32448OooOOo0();
            c32448OooOOo0.f116646OooOo0o = initializer;
            c32448OooOOo0.f116645OooOo = c32455OooOoO;
            return c32448OooOOo0;
        }
        if (iOrdinal != 2) {
            throw new C32442OooOO0o();
        }
        C32461OooOooo c32461OooOooo = new C32461OooOooo();
        c32461OooOooo.f116669OooOo0o = initializer;
        c32461OooOooo.f116668OooOo = c32455OooOoO;
        return c32461OooOooo;
    }

    public static C32447OooOOo OooO0OO(oO0O000o.OooO00o initializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(initializer, "initializer");
        return new C32447OooOOo(initializer);
    }

    public static void OooO0Oo(int i, InterfaceC34352OooO0O0 interfaceC34352OooO0O0, String str, Object obj) {
        int iOooO00o = Oooo0.o0OoOo0.OooO00o(i);
        if (iOooO00o == 0) {
            interfaceC34352OooO0O0.OooOOO(obj, str);
            return;
        }
        if (iOooO00o == 1) {
            interfaceC34352OooO0O0.OooOOo0(obj, str);
            return;
        }
        if (iOooO00o == 2) {
            interfaceC34352OooO0O0.OooO0O0(obj, str);
        } else if (iOooO00o == 3) {
            interfaceC34352OooO0O0.OooOo00(obj, str);
        } else {
            if (iOooO00o != 4) {
                return;
            }
            interfaceC34352OooO0O0.OooO0OO(obj, str);
        }
    }

    public static final InterfaceC21233OooO0o OooO0o(InterfaceC21233OooO0o interfaceC21233OooO0o, boolean z, InterfaceC32507OooOO0o properties) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21233OooO0o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(properties, "properties");
        return interfaceC21233OooO0o.o00ooo(new C28391OooOOO0(properties, C31604o0ooOoO.f112933OooO00o, z));
    }

    public static void OooO0o0(int i, InterfaceC34352OooO0O0 interfaceC34352OooO0O0, String str, Object obj, Object obj2) {
        int iOooO00o = Oooo0.o0OoOo0.OooO00o(i);
        if (iOooO00o == 0) {
            interfaceC34352OooO0O0.OooO0o0(obj, str, obj2);
            return;
        }
        if (iOooO00o == 1) {
            interfaceC34352OooO0O0.OooOOOO(obj, str, obj2);
            return;
        }
        if (iOooO00o == 2) {
            interfaceC34352OooO0O0.OooO0o(obj, str, obj2);
        } else if (iOooO00o == 3) {
            interfaceC34352OooO0O0.OooOOOo(obj, str, obj2);
        } else {
            if (iOooO00o != 4) {
                return;
            }
            interfaceC34352OooO0O0.OooOOO0(obj, str, obj2);
        }
    }
}
