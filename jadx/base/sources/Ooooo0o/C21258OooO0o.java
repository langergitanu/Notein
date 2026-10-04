package Ooooo0o;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25527OoooO00;

/* JADX INFO: renamed from: Ooooo0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21258OooO0o {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0024, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC21278OooOoO0 OooO00o(InterfaceC21259OooO0o0 interfaceC21259OooO0o0) {
        EnumC21278OooOoO0 enumC21278OooOoO0;
        int iOrdinal;
        if (!interfaceC21259OooO0o0.getNode().f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O0 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO = interfaceC21259OooO0o0.getNode().f61607OooOoOO;
        if (oooO0OO == null) {
            o00oO0O.OooO.OooO00o(oooO0O0, interfaceC21259OooO0o0.getNode());
        } else {
            oooO0O0.OooO0O0(oooO0OO);
        }
        while (oooO0O0.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO2 = (InterfaceC21233OooO0o.OooO0OO) oooO0O0.OooOO0o(oooO0O0.f59746OooOoO0 - 1);
            if ((oooO0OO2.f61606OooOoO0 & 1024) == 0) {
                o00oO0O.OooO.OooO00o(oooO0O0, oooO0OO2);
            } else {
                while (true) {
                    if (oooO0OO2 == null) {
                        break;
                    }
                    if ((oooO0OO2.f61603OooOo & 1024) == 0) {
                        oooO0OO2 = oooO0OO2.f61607OooOoOO;
                    } else if ((oooO0OO2 instanceof FocusTargetModifierNode) && ((iOrdinal = (enumC21278OooOoO0 = ((FocusTargetModifierNode) oooO0OO2).f63337Oooo00O).ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                        return enumC21278OooOoO0;
                    }
                }
            }
        }
        return EnumC21278OooOoO0.f61685OooOoO;
    }

    public static final void OooO0O0(FocusTargetModifierNode focusTargetModifierNode) {
        C25527OoooO00 c25527OoooO00;
        kotlin.jvm.internal.OooOOO0.OooO0oO(focusTargetModifierNode, "<this>");
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNode.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61605OooOoO;
        C25503OooOoOO c25503OooOoOOOooO0o0 = o00oO0O.OooO.OooO0o0(focusTargetModifierNode);
        while (c25503OooOoOOOooO0o0 != null) {
            if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & 5120) != 0) {
                while (oooO0OO2 != null) {
                    int i = oooO0OO2.f61603OooOo;
                    if ((i & 5120) != 0) {
                        if ((i & 1024) != 0) {
                            return;
                        }
                        if (!(oooO0OO2 instanceof InterfaceC21259OooO0o0)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        InterfaceC21259OooO0o0 interfaceC21259OooO0o0 = (InterfaceC21259OooO0o0) oooO0OO2;
                        interfaceC21259OooO0o0.OooOOOo(OooO00o(interfaceC21259OooO0o0));
                    }
                    oooO0OO2 = oooO0OO2.f61605OooOoO;
                }
            }
            c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
            oooO0OO2 = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
        }
    }
}
