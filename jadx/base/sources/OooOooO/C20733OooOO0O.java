package OooOooO;

import Oooo0oO.C21065OoooOOO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o000O0O0;
import Oooo0oO.o00oO0O;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20733OooOO0O {
    public static final o00oO0O OooO00o(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC20736OooOOO0, "<this>");
        interfaceC21033OooOOOO.OooOo00(1206586544);
        interfaceC21033OooOOOO.OooOo00(-492369756);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        Object obj = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        if (objOooOo0 == obj) {
            objOooOo0 = C21105o000OoO.OooO0OO(Boolean.FALSE, o000O0O0.f61218OooO00o);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
        interfaceC21033OooOOOO.OooOoo();
        o00oO0O o00oo0o = (o00oO0O) objOooOo0;
        interfaceC21033OooOOOO.OooOo00(511388516);
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(interfaceC20736OooOOO0) | interfaceC21033OooOOOO.OooO0oo(o00oo0o);
        Object objOooOo02 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo02 == obj) {
            objOooOo02 = new C20732OooOO0(interfaceC20736OooOOO0, o00oo0o, null);
            interfaceC21033OooOOOO.OooOOo0(objOooOo02);
        }
        interfaceC21033OooOOOO.OooOoo();
        C21065OoooOOO.OooO0O0(interfaceC21033OooOOOO, interfaceC20736OooOOO0, (InterfaceC32508OooOOOo) objOooOo02);
        interfaceC21033OooOOOO.OooOoo();
        return o00oo0o;
    }

    public static String OooO0O0(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final void OooO0OO(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Object obj, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        if (interfaceC21033OooOOOO.OooOO0o() || !kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21033OooOOOO.OooOo0(), obj)) {
            interfaceC21033OooOOOO.OooOOo0(obj);
            interfaceC21033OooOOOO.OooOOOO(obj, interfaceC32508OooOOOo);
        }
    }
}
