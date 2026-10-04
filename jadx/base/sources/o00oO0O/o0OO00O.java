package o00oO0O;

import OoooOoO.InterfaceC21233OooO0o;
import java.util.LinkedHashMap;
import java.util.Map;
import o0Oo0oo.C28379OooO00o;
import o0Oo0oo.C28387OooOO0;
import oO00ooO.InterfaceC32437OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {
    public static final C28387OooOO0 OooO00o(o0Oo0oo o0oo0oo2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(o0oo0oo2, "<this>");
        InterfaceC21233OooO0o.OooO0OO oooO0OO = o0oo0oo2.getNode().f61607OooOoOO;
        if (oooO0OO == null || (oooO0OO.f61606OooOoO0 & 8) == 0) {
            oooO0OO = null;
        } else {
            while (oooO0OO != null) {
                if ((oooO0OO.f61603OooOo & 8) != 0) {
                    break;
                }
                oooO0OO = oooO0OO.f61607OooOoOO;
            }
            oooO0OO = null;
        }
        o0Oo0oo o0oo0oo3 = (o0Oo0oo) (oooO0OO instanceof o0Oo0oo ? oooO0OO : null);
        if (o0oo0oo3 == null || o0oo0oo2.OooOoO().f100644OooOoO0) {
            return o0oo0oo2.OooOoO();
        }
        C28387OooOO0 c28387OooOO0OooOoO = o0oo0oo2.OooOoO();
        c28387OooOO0OooOoO.getClass();
        C28387OooOO0 c28387OooOO0 = new C28387OooOO0();
        c28387OooOO0.f100642OooOo = c28387OooOO0OooOoO.f100642OooOo;
        c28387OooOO0.f100644OooOoO0 = c28387OooOO0OooOoO.f100644OooOoO0;
        LinkedHashMap linkedHashMap = c28387OooOO0.f100643OooOo0o;
        linkedHashMap.putAll(c28387OooOO0OooOoO.f100643OooOo0o);
        C28387OooOO0 peer = OooO00o(o0oo0oo3);
        kotlin.jvm.internal.OooOOO0.OooO0oO(peer, "peer");
        if (peer.f100642OooOo) {
            c28387OooOO0.f100642OooOo = true;
        }
        if (peer.f100644OooOoO0) {
            c28387OooOO0.f100644OooOoO0 = true;
        }
        for (Map.Entry entry : peer.f100643OooOo0o.entrySet()) {
            o0Oo0oo.OooOo oooOo = (o0Oo0oo.OooOo) entry.getKey();
            Object value = entry.getValue();
            if (!linkedHashMap.containsKey(oooOo)) {
                linkedHashMap.put(oooOo, value);
            } else if (value instanceof C28379OooO00o) {
                Object obj = linkedHashMap.get(oooOo);
                kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C28379OooO00o c28379OooO00o = (C28379OooO00o) obj;
                String str = c28379OooO00o.f100635OooO00o;
                if (str == null) {
                    str = ((C28379OooO00o) value).f100635OooO00o;
                }
                InterfaceC32437OooO0o0 interfaceC32437OooO0o0 = c28379OooO00o.f100636OooO0O0;
                if (interfaceC32437OooO0o0 == null) {
                    interfaceC32437OooO0o0 = ((C28379OooO00o) value).f100636OooO0O0;
                }
                linkedHashMap.put(oooOo, new C28379OooO00o(str, interfaceC32437OooO0o0));
            }
        }
        return c28387OooOO0;
    }
}
