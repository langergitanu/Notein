package Oooo0oO;

import Oooo0oO.InterfaceC21033OooOOOO;
import java.util.Arrays;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: Oooo0oO.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21065OoooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C21060OoooO f61015OooO00o = new C21060OoooO();

    public static final void OooO00o(Object obj, InterfaceC32507OooOO0o interfaceC32507OooOO0o, InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(obj);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            objOooOo0 = new C21061OoooO0(interfaceC32507OooOO0o);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
    }

    public static final void OooO0O0(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Object obj, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOOo = interfaceC21033OooOOOO.OooOOOo();
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(obj);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            objOooOo0 = new C21076Oooooo0(interfaceC34415OooO0ooOooOOOo, interfaceC32508OooOOOo);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
    }

    public static final void OooO0OO(Object obj, Object obj2, InterfaceC32508OooOOOo interfaceC32508OooOOOo, InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOOo = interfaceC21033OooOOOO.OooOOOo();
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(obj) | interfaceC21033OooOOOO.OooO0oo(obj2);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            objOooOo0 = new C21076Oooooo0(interfaceC34415OooO0ooOooOOOo, interfaceC32508OooOOOo);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
    }

    public static final void OooO0Oo(Object[] objArr, InterfaceC32508OooOOOo interfaceC32508OooOOOo, InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOOo = interfaceC21033OooOOOO.OooOOOo();
        boolean zOooO0oo = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zOooO0oo |= interfaceC21033OooOOOO.OooO0oo(obj);
        }
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            interfaceC21033OooOOOO.OooOOo0(new C21076Oooooo0(interfaceC34415OooO0ooOooOOOo, interfaceC32508OooOOOo));
        }
    }

    public static final C33822OooO0OO OooO0o0(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        InterfaceC33672o00ooo.OooO00o oooO00o = InterfaceC33672o00ooo.OooO00o.f121379OooOo0o;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOOo = interfaceC21033OooOOOO.OooOOOo();
        return C33633Oooo0.OooO00o(interfaceC34415OooO0ooOooOOOo.plus(new C33671o00oO0o((InterfaceC33672o00ooo) interfaceC34415OooO0ooOooOOOo.get(oooO00o))).plus(oooO));
    }
}
