package OooOooo;

import OooOooo.AbstractC20742OooO;
import OooOooo.C20745OooO00o;
import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.C21230OooO0O0;
import OoooOoO.InterfaceC21229OooO00o;
import java.io.Serializable;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32511OooOOoo;
import oo000o.InterfaceC34642OooOo0o;

/* JADX INFO: renamed from: OooOooo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20793OoooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20788Oooo0o f59714OooO00o;

    /* JADX INFO: renamed from: OooOooo.OoooO0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32511OooOOoo<Integer, int[], EnumC24238OooOOO, InterfaceC24229OooO0OO, int[], C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f59715OooOo0o = new OooO00o(5);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            int[] size = (int[]) obj2;
            EnumC24238OooOOO layoutDirection = (EnumC24238OooOOO) obj3;
            InterfaceC24229OooO0OO density = (InterfaceC24229OooO0OO) obj4;
            kotlin.jvm.internal.OooOOO0.OooO0oO(size, "size");
            kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
            C20745OooO00o.f59598OooO00o.OooO00o(density, ((Number) obj).intValue(), size, layoutDirection, (int[]) serializable);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    static {
        EnumC20779OooOooO enumC20779OooOooO = EnumC20779OooOooO.f59666OooOo0o;
        C20745OooO00o.C20747OooO0o0 c20747OooO0o0 = C20745OooO00o.f59598OooO00o;
        int i = AbstractC20742OooO.f59592OooO00o;
        f59714OooO00o = C20790Oooo0oO.OooO0o0(enumC20779OooOooO, OooO00o.f59715OooOo0o, 0, new AbstractC20742OooO.C20744OooO0o0(InterfaceC21229OooO00o.C18984OooO00o.f61590OooO0Oo));
    }

    public static final InterfaceC34642OooOo0o OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
        InterfaceC34642OooOo0o interfaceC34642OooOo0o;
        Object obj = C20745OooO00o.f59598OooO00o;
        C21230OooO0O0.C18985OooO0O0 c18985OooO0O0 = InterfaceC21229OooO00o.C18984OooO00o.f61592OooO0o0;
        interfaceC21033OooOOOO.OooOo00(-837807694);
        if (obj.equals(obj) && c18985OooO0O0.equals(InterfaceC21229OooO00o.C18984OooO00o.f61590OooO0Oo)) {
            interfaceC34642OooOo0o = f59714OooO00o;
        } else {
            interfaceC21033OooOOOO.OooOo00(511388516);
            boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(obj) | interfaceC21033OooOOOO.OooO0oo(c18985OooO0O0);
            Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
            if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                int i = AbstractC20742OooO.f59592OooO00o;
                objOooOo0 = C20790Oooo0oO.OooO0o0(EnumC20779OooOooO.f59666OooOo0o, new C20795OoooO0O(5), 0, new AbstractC20742OooO.C20744OooO0o0(c18985OooO0O0));
                interfaceC21033OooOOOO.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO.OooOoo();
            interfaceC34642OooOo0o = (InterfaceC34642OooOo0o) objOooOo0;
        }
        interfaceC21033OooOOOO.OooOoo();
        return interfaceC34642OooOo0o;
    }
}
