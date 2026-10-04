package o000oOoO;

import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000O;
import Oooo0oO.o00000OO;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.InterfaceC32437OooO0o0;

/* JADX INFO: renamed from: o000oOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24636OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f83455OooO00o = new Object();

    public static final int OooO00o(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final C24633OooO00o OooO0O0(InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i, InterfaceC32437OooO0o0 interfaceC32437OooO0o0) {
        C24633OooO00o c24633OooO00o;
        interfaceC21033OooOOOO.OooOoO0(Integer.rotateLeft(i, 1), f83455OooO00o);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        if (objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            c24633OooO00o = new C24633OooO00o(i, true, interfaceC32437OooO0o0);
            interfaceC21033OooOOOO.OooOOo0(c24633OooO00o);
        } else {
            OooOOO0.OooO0o0(objOooOo0, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c24633OooO00o = (C24633OooO00o) objOooOo0;
            if (!OooOOO0.OooO0O0(c24633OooO00o.f83420OooOoO0, interfaceC32437OooO0o0)) {
                boolean z = c24633OooO00o.f83420OooOoO0 == null;
                c24633OooO00o.f83420OooOoO0 = interfaceC32437OooO0o0;
                if (!z && c24633OooO00o.f83417OooOo) {
                    o00000O o00000o = c24633OooO00o.f83419OooOoO;
                    if (o00000o != null) {
                        o00000o.invalidate();
                        c24633OooO00o.f83419OooOoO = null;
                    }
                    ArrayList arrayList = c24633OooO00o.f83421OooOoOO;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((o00000O) arrayList.get(i2)).invalidate();
                        }
                        arrayList.clear();
                    }
                }
            }
        }
        interfaceC21033OooOOOO.OooOoo0();
        return c24633OooO00o;
    }

    public static final boolean OooO0OO(o00000O o00000o, o00000O o00000o2) {
        if (o00000o == null) {
            return true;
        }
        if (!(o00000o instanceof o00000OO) || !(o00000o2 instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) o00000o;
        return !o00000oo2.OooO0O0() || o00000o.equals(o00000o2) || OooOOO0.OooO0O0(o00000oo2.f61063OooO0OO, ((o00000OO) o00000o2).f61063OooO0OO);
    }
}
