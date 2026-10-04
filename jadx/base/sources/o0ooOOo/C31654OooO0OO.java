package o0ooOOo;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oo.C28387OooOO0;
import o0Oo0oo.C28388OooOO0O;
import o0Oo0oo.C28393OooOOOo;
import o0Oo0oo.C28396OooOOoo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0ooOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31654OooO0OO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    public static final boolean OooO00o(ArrayList arrayList) {
        ?? arrayList2;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                arrayList2 = C34434OooOoO.f123453OooOo0o;
            } else {
                arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
                int i = 0;
                while (i < iOooOO0O) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C28393OooOOOo c28393OooOOOo = (C28393OooOOOo) obj2;
                    C28393OooOOOo c28393OooOOOo2 = (C28393OooOOOo) obj;
                    arrayList2.add(new C21290OooO0o0(C21289OooO0o.OooO00o(Math.abs(C21290OooO0o0.OooO0OO(c28393OooOOOo2.OooO0Oo().OooO00o()) - C21290OooO0o0.OooO0OO(c28393OooOOOo.OooO0Oo().OooO00o())), Math.abs(C21290OooO0o0.OooO0Oo(c28393OooOOOo2.OooO0Oo().OooO00o()) - C21290OooO0o0.OooO0Oo(c28393OooOOOo.OooO0Oo().OooO00o())))));
                    obj = obj2;
                }
            }
            if (((Collection) arrayList2).size() == 1) {
                j = ((C21290OooO0o0) OooOo.Oooo0oO(arrayList2)).f61722OooO00o;
            } else {
                if (arrayList2.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object objOooo0oO = OooOo.Oooo0oO(arrayList2);
                int iOooOO0O2 = C34429OooOOo0.OooOO0O(arrayList2);
                if (1 <= iOooOO0O2) {
                    int i2 = 1;
                    while (true) {
                        objOooo0oO = new C21290OooO0o0(C21290OooO0o0.OooO0o(((C21290OooO0o0) objOooo0oO).f61722OooO00o, ((C21290OooO0o0) arrayList2.get(i2)).f61722OooO00o));
                        if (i2 == iOooOO0O2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C21290OooO0o0) objOooo0oO).f61722OooO00o;
            }
            if (C21290OooO0o0.OooO0Oo(j) >= C21290OooO0o0.OooO0OO(j)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean OooO0O0(C28393OooOOOo c28393OooOOOo) {
        OooOOO0.OooO0oO(c28393OooOOOo, "<this>");
        C28387OooOO0 c28387OooOO0OooO0oO = c28393OooOOOo.OooO0oO();
        o0Oo0oo.OooOo<List<String>> oooOo = C28396OooOOoo.f100662OooO00o;
        return (C28388OooOO0O.OooO00o(c28387OooOO0OooO0oO, C28396OooOOoo.f100666OooO0o) == null && C28388OooOO0O.OooO00o(c28393OooOOOo.OooO0oO(), C28396OooOOoo.f100667OooO0o0) == null) ? false : true;
    }
}
