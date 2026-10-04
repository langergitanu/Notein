package OoooOOO;

import Oooo0oO.C21060OoooO;
import Oooo0oO.C21065OoooOOO;
import Oooo0oO.InterfaceC21033OooOOOO;
import io.ktor.utils.p616io.Oooo000;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OoooOOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21179OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61428OooO00o = 0;

    public static final String OooO00o(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object OooO0O0(Object[] objArr, C21185OooOO0 c21185OooOO0, oO0O000o.OooO00o oooO00o, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object objOooO0OO;
        if ((i2 & 2) != 0) {
            c21185OooOO0 = C21176OooO.f61418OooO00o;
        }
        C21185OooOO0 c21185OooOO02 = c21185OooOO0;
        int iOooOoOO = interfaceC21033OooOOOO.OooOoOO();
        Oooo000.OooO0O0(36);
        String string = Integer.toString(iOooOoOO, 36);
        OooOOO0.OooO0o(string, "toString(this, checkRadix(radix))");
        OooOOO0.OooO0o0(c21185OooOO02, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        InterfaceC21182OooO0o0 interfaceC21182OooO0o0 = (InterfaceC21182OooO0o0) interfaceC21033OooOOOO.OooO0o0(C21184OooO0oo.f61443OooO00o);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        Object obj2 = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        if (objOooOo0 == obj2) {
            Object objInvoke = (interfaceC21182OooO0o0 == null || (objOooO0OO = interfaceC21182OooO0o0.OooO0OO(string)) == null) ? null : c21185OooOO02.f61446OooO0O0.invoke(objOooO0OO);
            if (objInvoke == null) {
                objInvoke = oooO00o.invoke();
            }
            objArr2 = objArr;
            Object c21180OooO0Oo = new C21180OooO0Oo(c21185OooOO02, interfaceC21182OooO0o0, string, objInvoke, objArr2);
            interfaceC21033OooOOOO.OooOOo0(c21180OooO0Oo);
            objOooOo0 = c21180OooO0Oo;
        } else {
            objArr2 = objArr;
        }
        C21180OooO0Oo c21180OooO0Oo2 = (C21180OooO0Oo) objOooOo0;
        Object objInvoke2 = Arrays.equals(objArr2, c21180OooO0Oo2.f61433OooOoOO) ? c21180OooO0Oo2.f61431OooOoO : null;
        if (objInvoke2 == null) {
            objInvoke2 = oooO00o.invoke();
        }
        boolean zOooOo0o = interfaceC21033OooOOOO.OooOo0o(c21180OooO0Oo2) | (((i & 112) ^ 48) > 32 && interfaceC21033OooOOOO.OooOo0o(c21185OooOO02)) | interfaceC21033OooOOOO.OooOo0o(interfaceC21182OooO0o0) | interfaceC21033OooOOOO.OooO0oo(string) | interfaceC21033OooOOOO.OooOo0o(objInvoke2) | interfaceC21033OooOOOO.OooOo0o(objArr2);
        Object objOooOo02 = interfaceC21033OooOOOO.OooOo0();
        if (zOooOo0o || objOooOo02 == obj2) {
            Object obj3 = objInvoke2;
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object c21178OooO0O0 = new C21178OooO0O0(c21180OooO0Oo2, c21185OooOO02, interfaceC21182OooO0o0, string, obj, objArr3);
            interfaceC21033OooOOOO.OooOOo0(c21178OooO0O0);
            objOooOo02 = c21178OooO0O0;
        } else {
            obj = objInvoke2;
        }
        C21060OoooO c21060OoooO = C21065OoooOOO.f61015OooO00o;
        interfaceC21033OooOOOO.OooO0oO((oO0O000o.OooO00o) objOooOo02);
        return obj;
    }
}
