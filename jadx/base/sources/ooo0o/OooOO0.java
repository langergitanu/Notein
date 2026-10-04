package ooo0o;

import java.util.Set;
import oO00ooO.C32443OooOOO;
import oO0O.OooO00o;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0OOO.C32934OooO0o0;
import oO0OOO.C32936OooO0oo;
import oO0OoO0.C33238OooO0oo;
import oO0OoO0.C33239OooOO0o;
import oO0OoO0.C33243OooOOoo;
import oO0OoOO.C33277OooOOO0;
import oO0OoOO.EnumC33259OooO;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<OooO00o.EnumC20235OooO00o> f126361OooO0O0 = C34449Oooo0oo.OooOO0(OooO00o.EnumC20235OooO00o.CLASS);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Set<OooO00o.EnumC20235OooO00o> f126362OooO0OO = oOo000Oo.OooOOO.OoooOo0(new OooO00o.EnumC20235OooO00o[]{OooO00o.EnumC20235OooO00o.FILE_FACADE, OooO00o.EnumC20235OooO00o.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C32934OooO0o0 f126363OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C32934OooO0o0 f126364OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C33239OooOO0o f126365OooO00o;

    static {
        new C32934OooO0o0(new int[]{1, 1, 2}, false);
        f126363OooO0Oo = new C32934OooO0o0(new int[]{1, 1, 11}, false);
        f126364OooO0o0 = new C32934OooO0o0(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C33277OooOOO0 OooO00o(InterfaceC32620Oooo00O descriptor, InterfaceC35196OooOOo0 kotlinClass) {
        String[] strArr;
        C32443OooOOO<oO0OOO.OooO0o, oO0OO00.OooOO0O> c32443OooOOOOooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinClass, "kotlinClass");
        oO0O.OooO00o oooO00oOooO0O0 = kotlinClass.OooO0O0();
        String[] strArr2 = oooO00oOooO0O0.f116742OooO0OO;
        if (strArr2 == null) {
            strArr2 = oooO00oOooO0O0.f116743OooO0Oo;
        }
        if (strArr2 != null) {
            if (!f126362OooO0OO.contains(oooO00oOooO0O0.f116740OooO00o)) {
                strArr2 = null;
            }
        }
        if (strArr2 != null && (strArr = kotlinClass.OooO0O0().f116745OooO0o0) != null) {
            try {
                try {
                    c32443OooOOOOooO0oo = C32936OooO0oo.OooO0oo(strArr2, strArr);
                } catch (oO0OOOO0.OooOO0 e) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e);
                }
            } catch (Throwable th) {
                OooO0OO().f120271OooO0OO.getClass();
                if (kotlinClass.OooO0O0().f116741OooO0O0.OooO0O0(C34449Oooo0oo.OooO0o0(OooO0OO().f120271OooO0OO))) {
                    throw th;
                }
                c32443OooOOOOooO0oo = null;
            }
            if (c32443OooOOOOooO0oo != null) {
                oO0OOO.OooO0o oooO0o = c32443OooOOOOooO0oo.f116638OooOo0o;
                oO0OO00.OooOO0O oooOO0O = c32443OooOOOOooO0oo.f116637OooOo;
                OooO0Oo(kotlinClass);
                OooO0o0(kotlinClass);
                C35193OooOO0o c35193OooOO0o = new C35193OooOO0o(kotlinClass, oooOO0O, oooO0o, OooO0O0(kotlinClass));
                return new C33277OooOOO0(descriptor, oooOO0O, oooO0o, kotlinClass.OooO0O0().f116741OooO0O0, c35193OooOO0o, OooO0OO(), "scope for " + c35193OooOO0o + " in " + descriptor, OooO.f126315OooOo0o);
            }
        }
        return null;
    }

    public final EnumC33259OooO OooO0O0(InterfaceC35196OooOOo0 interfaceC35196OooOOo0) {
        OooO0OO().f120271OooO0OO.getClass();
        EnumC33259OooO enumC33259OooO = EnumC33259OooO.f120388OooOo0o;
        int i = interfaceC35196OooOOo0.OooO0O0().f116746OooO0oO;
        if (((i & 64) != 0) && (i & 32) == 0) {
            return EnumC33259OooO.f120387OooOo;
        }
        int i2 = interfaceC35196OooOOo0.OooO0O0().f116746OooO0oO;
        return ((i2 & 16) == 0 || (i2 & 32) != 0) ? enumC33259OooO : EnumC33259OooO.f120390OooOoO0;
    }

    public final C33239OooOO0o OooO0OO() {
        C33239OooOO0o c33239OooOO0o = this.f126365OooO00o;
        if (c33239OooOO0o != null) {
            return c33239OooOO0o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("components");
        throw null;
    }

    public final C33243OooOOoo<C32934OooO0o0> OooO0Oo(InterfaceC35196OooOOo0 interfaceC35196OooOOo0) {
        OooO0OO().f120271OooO0OO.getClass();
        if (interfaceC35196OooOOo0.OooO0O0().f116741OooO0O0.OooO0O0(C34449Oooo0oo.OooO0o0(OooO0OO().f120271OooO0OO))) {
            return null;
        }
        C32934OooO0o0 c32934OooO0o0 = interfaceC35196OooOOo0.OooO0O0().f116741OooO0O0;
        C32934OooO0o0 c32934OooO0o02 = C32934OooO0o0.f118820OooO0oO;
        C32934OooO0o0 c32934OooO0o0OooO0o0 = C34449Oooo0oo.OooO0o0(OooO0OO().f120271OooO0OO);
        C32934OooO0o0 c32934OooO0o0OooO0o02 = C34449Oooo0oo.OooO0o0(OooO0OO().f120271OooO0OO);
        C32934OooO0o0 c32934OooO0o03 = interfaceC35196OooOOo0.OooO0O0().f116741OooO0O0;
        c32934OooO0o0OooO0o02.getClass();
        C32934OooO0o0 c32934OooO0o04 = c32934OooO0o03.f118822OooO0o ? c32934OooO0o02 : C32934OooO0o0.f118821OooO0oo;
        c32934OooO0o04.getClass();
        int i = c32934OooO0o0OooO0o02.f118753OooO0O0;
        int i2 = c32934OooO0o04.f118753OooO0O0;
        if (i2 > i || (i2 >= i && c32934OooO0o04.f118754OooO0OO > c32934OooO0o0OooO0o02.f118754OooO0OO)) {
            c32934OooO0o0OooO0o02 = c32934OooO0o04;
        }
        return new C33243OooOOoo<>(c32934OooO0o0, c32934OooO0o02, c32934OooO0o0OooO0o0, c32934OooO0o0OooO0o02, interfaceC35196OooOOo0.getLocation(), interfaceC35196OooOOo0.getClassId());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C33238OooO0oo OooO0o(InterfaceC35196OooOOo0 interfaceC35196OooOOo0) {
        String[] strArr;
        C32443OooOOO<oO0OOO.OooO0o, oO0OO00.OooO0O0> c32443OooOOOOooO0o;
        oO0O.OooO00o oooO00oOooO0O0 = interfaceC35196OooOOo0.OooO0O0();
        String[] strArr2 = oooO00oOooO0O0.f116742OooO0OO;
        if (strArr2 == null) {
            strArr2 = oooO00oOooO0O0.f116743OooO0Oo;
        }
        if (strArr2 != null) {
            if (!f126361OooO0O0.contains(oooO00oOooO0O0.f116740OooO00o)) {
                strArr2 = null;
            }
        }
        if (strArr2 != null && (strArr = interfaceC35196OooOOo0.OooO0O0().f116745OooO0o0) != null) {
            try {
                try {
                    c32443OooOOOOooO0o = C32936OooO0oo.OooO0o(strArr2, strArr);
                } catch (oO0OOOO0.OooOO0 e) {
                    throw new IllegalStateException("Could not read data from " + interfaceC35196OooOOo0.getLocation(), e);
                }
            } catch (Throwable th) {
                OooO0OO().f120271OooO0OO.getClass();
                if (interfaceC35196OooOOo0.OooO0O0().f116741OooO0O0.OooO0O0(C34449Oooo0oo.OooO0o0(OooO0OO().f120271OooO0OO))) {
                    throw th;
                }
                c32443OooOOOOooO0o = null;
            }
            if (c32443OooOOOOooO0o != null) {
                oO0OOO.OooO0o oooO0o = c32443OooOOOOooO0o.f116638OooOo0o;
                oO0OO00.OooO0O0 oooO0O0 = c32443OooOOOOooO0o.f116637OooOo;
                OooO0Oo(interfaceC35196OooOOo0);
                OooO0o0(interfaceC35196OooOOo0);
                return new C33238OooO0oo(oooO0o, oooO0O0, interfaceC35196OooOOo0.OooO0O0().f116741OooO0O0, new C35195OooOOo(interfaceC35196OooOOo0, OooO0O0(interfaceC35196OooOOo0)));
            }
        }
        return null;
    }

    public final boolean OooO0o0(InterfaceC35196OooOOo0 interfaceC35196OooOOo0) {
        OooO0OO().f120271OooO0OO.getClass();
        OooO0OO().f120271OooO0OO.getClass();
        return (interfaceC35196OooOOo0.OooO0O0().f116746OooO0oO & 2) != 0 && interfaceC35196OooOOo0.OooO0O0().f116741OooO0O0.equals(f126363OooO0Oo);
    }
}
