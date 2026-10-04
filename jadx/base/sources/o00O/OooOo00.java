package o00O;

import com.airbnb.lottie.C22142OooO0oo;
import java.io.IOException;
import java.util.ArrayList;
import o00O0oO.C24942OooO00o;
import o00OO000.OooO0OO;
import o00OO00o.C24988OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84039OooO00o = OooO0OO.OooO00o.OooO00o("k");

    public static ArrayList OooO00o(o00OO000.OooO0OO oooO0OO, C22142OooO0oo c22142OooO0oo, float f, InterfaceC24795Oooo0OO interfaceC24795Oooo0OO, boolean z) throws IOException {
        o00OO000.OooO0OO oooO0OO2;
        C22142OooO0oo c22142OooO0oo2;
        float f2;
        InterfaceC24795Oooo0OO interfaceC24795Oooo0OO2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (oooO0OO.ooOO() == OooO0OO.OooO0O0.f84731OooOoo0) {
            c22142OooO0oo.OooO00o("Lottie doesn't support expressions.");
            return arrayList;
        }
        oooO0OO.OooO0OO();
        while (oooO0OO.OooOooo()) {
            if (oooO0OO.o0Oo0oo(f84039OooO00o) != 0) {
                oooO0OO.o00000oO();
            } else if (oooO0OO.ooOO() == OooO0OO.OooO0O0.f84726OooOo0o) {
                oooO0OO.OooO00o();
                if (oooO0OO.ooOO() == OooO0OO.OooO0O0.f84730OooOoo) {
                    o00OO000.OooO0OO oooO0OO3 = oooO0OO;
                    C22142OooO0oo c22142OooO0oo3 = c22142OooO0oo;
                    float f3 = f;
                    InterfaceC24795Oooo0OO interfaceC24795Oooo0OO3 = interfaceC24795Oooo0OO;
                    boolean z3 = z;
                    C24988OooO00o c24988OooO00oOooO0O0 = C24781OooOOoo.OooO0O0(oooO0OO3, c22142OooO0oo3, f3, interfaceC24795Oooo0OO3, false, z3);
                    oooO0OO2 = oooO0OO3;
                    c22142OooO0oo2 = c22142OooO0oo3;
                    f2 = f3;
                    interfaceC24795Oooo0OO2 = interfaceC24795Oooo0OO3;
                    z2 = z3;
                    arrayList.add(c24988OooO00oOooO0O0);
                } else {
                    oooO0OO2 = oooO0OO;
                    c22142OooO0oo2 = c22142OooO0oo;
                    f2 = f;
                    interfaceC24795Oooo0OO2 = interfaceC24795Oooo0OO;
                    z2 = z;
                    while (oooO0OO2.OooOooo()) {
                        arrayList.add(C24781OooOOoo.OooO0O0(oooO0OO2, c22142OooO0oo2, f2, interfaceC24795Oooo0OO2, true, z2));
                    }
                }
                oooO0OO2.OooOOO0();
                oooO0OO = oooO0OO2;
                c22142OooO0oo = c22142OooO0oo2;
                f = f2;
                interfaceC24795Oooo0OO = interfaceC24795Oooo0OO2;
                z = z2;
            } else {
                o00OO000.OooO0OO oooO0OO4 = oooO0OO;
                arrayList.add(C24781OooOOoo.OooO0O0(oooO0OO4, c22142OooO0oo, f, interfaceC24795Oooo0OO, false, z));
                oooO0OO = oooO0OO4;
            }
        }
        oooO0OO.OooOOo0();
        OooO0O0(arrayList);
        return arrayList;
    }

    public static void OooO0O0(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C24988OooO00o c24988OooO00o = (C24988OooO00o) arrayList.get(i2);
            i2++;
            C24988OooO00o c24988OooO00o2 = (C24988OooO00o) arrayList.get(i2);
            c24988OooO00o.f84768OooO0oO = Float.valueOf(c24988OooO00o2.f84766OooO0o);
            if (c24988OooO00o.f84763OooO0O0 == 0 && (t = c24988OooO00o2.f84762OooO00o) != 0) {
                c24988OooO00o.f84763OooO0O0 = t;
                if (c24988OooO00o instanceof C24942OooO00o) {
                    ((C24942OooO00o) c24988OooO00o).OooO0O0();
                }
            }
        }
        C24988OooO00o c24988OooO00o3 = (C24988OooO00o) arrayList.get(i);
        if ((c24988OooO00o3.f84762OooO00o == 0 || c24988OooO00o3.f84763OooO0O0 == 0) && arrayList.size() > 1) {
            arrayList.remove(c24988OooO00o3);
        }
    }
}
