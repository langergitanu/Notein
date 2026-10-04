package androidx.compose.p002ui.platform;

import OooooO0.C21291OooO0oO;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.EnumC24238OooOOO;
import o00oO0O.C25503OooOoOO;
import o0Oo0oo.C28378OooO;
import o0Oo0oo.C28379OooO00o;
import o0Oo0oo.C28387OooOO0;
import o0Oo0oo.C28388OooOO0O;
import o0Oo0oo.C28393OooOOOo;
import o0Oo0oo.C28396OooOOoo;
import o0Oo0oo.OooOo;
import o0ooOO0.C31575o0000o0;
import o0ooOO0.C31576o0000o0O;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00O.OooO00o;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static final boolean OooO00o(C28393OooOOOo c28393OooOOOo) {
        return C28388OooOO0O.OooO00o(c28393OooOOOo.OooO0oO(), C28396OooOOoo.f100661OooO) == null;
    }

    public static final boolean OooO0O0(C28393OooOOOo c28393OooOOOo) {
        return c28393OooOOOo.f100652OooO0OO.f86952Oooo0OO == EnumC24238OooOOO.f81493OooOo;
    }

    public static final C31575o0000o0 OooO0OO(int i, ArrayList arrayList) {
        OooOOO0.OooO0oO(arrayList, "<this>");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C31575o0000o0) arrayList.get(i2)).f112829OooOo0o == i) {
                return (C31575o0000o0) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final C25503OooOoOO OooO0Oo(C25503OooOoOO c25503OooOoOO, InterfaceC32507OooOO0o<? super C25503OooOoOO, Boolean> interfaceC32507OooOO0o) {
        for (C25503OooOoOO c25503OooOoOOOooOOoo = c25503OooOoOO.OooOOoo(); c25503OooOoOOOooOOoo != null; c25503OooOoOOOooOOoo = c25503OooOoOOOooOOoo.OooOOoo()) {
            if (interfaceC32507OooOO0o.invoke(c25503OooOoOOOooOOoo).booleanValue()) {
                return c25503OooOoOOOooOOoo;
            }
        }
        return null;
    }

    public static final boolean OooO0o(C28393OooOOOo c28393OooOOOo) {
        C28387OooOO0 c28387OooOO0 = c28393OooOOOo.f100654OooO0o;
        OooOo<C28379OooO00o<InterfaceC32507OooOO0o<List<C34695OooOOo0>, Boolean>>> oooOo = C28378OooO.f100617OooO00o;
        return c28387OooOO0.OooO0Oo(C28378OooO.f100623OooO0oO);
    }

    public static final void OooO0o0(Region region, C28393OooOOOo c28393OooOOOo, LinkedHashMap linkedHashMap, C28393OooOOOo c28393OooOOOo2) {
        C25503OooOoOO c25503OooOoOO;
        C25503OooOoOO c25503OooOoOO2 = c28393OooOOOo2.f100652OooO0OO;
        boolean z = (c25503OooOoOO2.f86953Oooo0o && c25503OooOoOO2.OooOoO()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i = c28393OooOOOo.f100656OooO0oO;
        int i2 = c28393OooOOOo2.f100656OooO0oO;
        if (!zIsEmpty || i2 == i) {
            if (!z || c28393OooOOOo2.f100653OooO0Oo) {
                Rect rect = new Rect(OooO00o.OooO0O0(c28393OooOOOo2.OooO().f61724OooO00o), OooO00o.OooO0O0(c28393OooOOOo2.OooO().f61725OooO0O0), OooO00o.OooO0O0(c28393OooOOOo2.OooO().f61726OooO0OO), OooO00o.OooO0O0(c28393OooOOOo2.OooO().f61727OooO0Oo));
                Region region2 = new Region();
                region2.set(rect);
                if (i2 == i) {
                    i2 = -1;
                }
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(i2);
                    Rect bounds = region2.getBounds();
                    OooOOO0.OooO0o(bounds, "region.bounds");
                    linkedHashMap.put(numValueOf, new C31576o0000o0O(c28393OooOOOo2, bounds));
                    List<C28393OooOOOo> listOooO0o = c28393OooOOOo2.OooO0o(false, true);
                    for (int size = listOooO0o.size() - 1; -1 < size; size--) {
                        OooO0o0(region, c28393OooOOOo, linkedHashMap, listOooO0o.get(size));
                    }
                    region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (c28393OooOOOo2.f100653OooO0Oo) {
                    C28393OooOOOo c28393OooOOOoOooO0oo = c28393OooOOOo2.OooO0oo();
                    C21291OooO0oO c21291OooO0oO = (c28393OooOOOoOooO0oo == null || (c25503OooOoOO = c28393OooOOOoOooO0oo.f100652OooO0OO) == null || !c25503OooOoOO.f86953Oooo0o) ? new C21291OooO0oO(0.0f, 0.0f, 10.0f, 10.0f) : c28393OooOOOoOooO0oo.OooO0Oo();
                    linkedHashMap.put(Integer.valueOf(i2), new C31576o0000o0O(c28393OooOOOo2, new Rect(OooO00o.OooO0O0(c21291OooO0oO.f61724OooO00o), OooO00o.OooO0O0(c21291OooO0oO.f61725OooO0O0), OooO00o.OooO0O0(c21291OooO0oO.f61726OooO0OO), OooO00o.OooO0O0(c21291OooO0oO.f61727OooO0Oo))));
                } else if (i2 == -1) {
                    Integer numValueOf2 = Integer.valueOf(i2);
                    Rect bounds2 = region2.getBounds();
                    OooOOO0.OooO0o(bounds2, "region.bounds");
                    linkedHashMap.put(numValueOf2, new C31576o0000o0O(c28393OooOOOo2, bounds2));
                }
            }
        }
    }
}
