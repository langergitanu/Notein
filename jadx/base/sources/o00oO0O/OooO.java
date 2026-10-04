package o00oO0O;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {
    public static final void OooO00o(Oooo.OooO0O0 oooO0O0, InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo0 = OooO0o0(oooO0OO).OooOo0();
        int i = oooO0O0OooOo0.f59746OooOoO0;
        if (i > 0) {
            int i2 = i - 1;
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo0.f59745OooOo0o;
            do {
                oooO0O0.OooO0O0(c25503OooOoOOArr[i2].f86970o000oOoO.f87088OooO0o0);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final ArrayList OooO0O0(InterfaceC25492OooO0oo interfaceC25492OooO0oo, int i) {
        C25527OoooO00 c25527OoooO00;
        if (!interfaceC25492OooO0oo.getNode().f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO = interfaceC25492OooO0oo.getNode().f61605OooOoO;
        C25503OooOoOO c25503OooOoOOOooO0o0 = OooO0o0(interfaceC25492OooO0oo);
        ArrayList arrayList = null;
        while (c25503OooOoOOOooO0o0 != null) {
            if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & i) != 0) {
                while (oooO0OO != null) {
                    if ((oooO0OO.f61603OooOo & i) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(oooO0OO);
                    }
                    oooO0OO = oooO0OO.f61605OooOoO;
                }
            }
            c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
            oooO0OO = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
        }
        return arrayList;
    }

    public static final InterfaceC21233OooO0o.OooO0OO OooO0OO(FocusTargetModifierNode focusTargetModifierNode, int i) {
        C25527OoooO00 c25527OoooO00;
        kotlin.jvm.internal.OooOOO0.OooO0oO(focusTargetModifierNode, "<this>");
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNode.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61605OooOoO;
        C25503OooOoOO c25503OooOoOOOooO0o0 = OooO0o0(focusTargetModifierNode);
        while (c25503OooOoOOOooO0o0 != null) {
            if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & i) != 0) {
                while (oooO0OO2 != null) {
                    if ((oooO0OO2.f61603OooOo & i) != 0) {
                        return oooO0OO2;
                    }
                    oooO0OO2 = oooO0OO2.f61605OooOoO;
                }
            }
            c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
            oooO0OO2 = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
        }
        return null;
    }

    public static final AbstractC25521OoooO OooO0Oo(InterfaceC25492OooO0oo requireCoordinator, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(requireCoordinator, "$this$requireCoordinator");
        AbstractC25521OoooO abstractC25521OoooO = requireCoordinator.getNode().f61608OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
        if (abstractC25521OoooO.o0000Oo0() != requireCoordinator || !C25532OoooOo0.OooO0OO(i)) {
            return abstractC25521OoooO;
        }
        AbstractC25521OoooO abstractC25521OoooO2 = abstractC25521OoooO.f87052OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO2);
        return abstractC25521OoooO2;
    }

    public static final InterfaceC25542OoooooO OooO0o(InterfaceC25492OooO0oo interfaceC25492OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC25492OooO0oo, "<this>");
        AndroidComposeView androidComposeView = OooO0o0(interfaceC25492OooO0oo).f86944OooOooO;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C25503OooOoOO OooO0o0(InterfaceC25492OooO0oo interfaceC25492OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC25492OooO0oo, "<this>");
        AbstractC25521OoooO abstractC25521OoooO = interfaceC25492OooO0oo.getNode().f61608OooOoo;
        if (abstractC25521OoooO != null) {
            return abstractC25521OoooO.f87051OooOoo;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
