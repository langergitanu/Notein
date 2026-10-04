package o00oO0O;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo00.InterfaceC21250OooO0oO;
import Ooooo0o.InterfaceC21257OooO0Oo;
import Ooooo0o.InterfaceC21259OooO0o0;
import Ooooo0o.InterfaceC21262OooOO0;
import Ooooo0o.InterfaceC21270OooOOo0;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o00Ooo.InterfaceC25089OooOoO0;
import o00oO0o.InterfaceC25574OooO0Oo;
import o00oO0o.InterfaceC25577OooO0oO;
import o0Oo0oo.InterfaceC28389OooOO0o;
import oo000o.C34640OooOo0;
import oo000o.InterfaceC34621OooO;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34649OooOooo;
import oo000o.InterfaceC34651Oooo00O;
import oo000o.InterfaceC34652Oooo00o;
import oo000o.InterfaceC34653Oooo0O0;

/* JADX INFO: renamed from: o00oO0O.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25532OoooOo0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(InterfaceC21233OooO0o.OooO0OO oooO0OO, int i) {
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        if ((oooO0OO.f61603OooOo & 2) != 0 && (oooO0OO instanceof OooOo)) {
            OooO.OooO0o0((OooOo) oooO0OO).Oooo00o(false);
            if (i == 2) {
                AbstractC25521OoooO abstractC25521OoooOOooO0Oo = OooO.OooO0Oo(oooO0OO, 2);
                abstractC25521OoooOOooO0Oo.f87056Oooo000 = true;
                if (abstractC25521OoooOOooO0Oo.f87069OoooOO0 != null) {
                    abstractC25521OoooOOooO0Oo.o0000o(null, false);
                }
            }
        }
        if ((oooO0OO.f61603OooOo & 256) != 0 && (oooO0OO instanceof InterfaceC25494OooOOOo)) {
            OooO.OooO0o0(oooO0OO).Oooo00o(false);
        }
        if ((oooO0OO.f61603OooOo & 4) != 0 && (oooO0OO instanceof OooOOO0)) {
            OooOOO.OooO00o((OooOOO0) oooO0OO);
        }
        if ((oooO0OO.f61603OooOo & 8) != 0 && (oooO0OO instanceof o0Oo0oo)) {
            ((AndroidComposeView) OooO.OooO0o((o0Oo0oo) oooO0OO)).OooOOOo();
        }
        if ((oooO0OO.f61603OooOo & 64) != 0 && (oooO0OO instanceof o00oO0O)) {
            OooO.OooO0o0((o00oO0O) oooO0OO).f86962OoooOOO.f86993OooO0oo.f87002Oooo000 = true;
        }
        if ((oooO0OO.f61603OooOo & 1024) != 0 && (oooO0OO instanceof FocusTargetModifierNode)) {
            if (i == 2) {
                oooO0OO.Oooo00O();
            } else {
                OooO.OooO0o(oooO0OO).getFocusOwner().OooO0Oo((FocusTargetModifierNode) oooO0OO);
            }
        }
        if ((oooO0OO.f61603OooOo & 2048) != 0 && (oooO0OO instanceof InterfaceC21270OooOOo0)) {
            InterfaceC21270OooOOo0 interfaceC21270OooOOo0 = (InterfaceC21270OooOOo0) oooO0OO;
            C25487OooO0o.f86874OooO0O0 = null;
            interfaceC21270OooOOo0.OooOoo0(C25487OooO0o.f86873OooO00o);
            if (C25487OooO0o.f86874OooO0O0 != null) {
                if (i != 2) {
                    OooO.OooO0o(oooO0OO).getFocusOwner().OooO0oO(interfaceC21270OooOOo0);
                } else {
                    if (!interfaceC21270OooOOo0.getNode().f61612Oooo000) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Oooo.OooO0O0 oooO0O0 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
                    InterfaceC21233OooO0o.OooO0OO oooO0OO2 = interfaceC21270OooOOo0.getNode().f61607OooOoOO;
                    if (oooO0OO2 == null) {
                        OooO.OooO00o(oooO0O0, interfaceC21270OooOOo0.getNode());
                    } else {
                        oooO0O0.OooO0O0(oooO0OO2);
                    }
                    while (oooO0O0.OooOO0()) {
                        InterfaceC21233OooO0o.OooO0OO oooO0OO3 = (InterfaceC21233OooO0o.OooO0OO) oooO0O0.OooOO0o(oooO0O0.f59746OooOoO0 - 1);
                        if ((oooO0OO3.f61606OooOoO0 & 1024) == 0) {
                            OooO.OooO00o(oooO0O0, oooO0OO3);
                        } else {
                            while (true) {
                                if (oooO0OO3 == null) {
                                    break;
                                }
                                if ((oooO0OO3.f61603OooOo & 1024) == 0) {
                                    oooO0OO3 = oooO0OO3.f61607OooOoOO;
                                } else if (oooO0OO3 instanceof FocusTargetModifierNode) {
                                    OooO.OooO0o(interfaceC21270OooOOo0).getFocusOwner().OooO0Oo((FocusTargetModifierNode) oooO0OO3);
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((oooO0OO.f61603OooOo & 4096) == 0 || !(oooO0OO instanceof InterfaceC21259OooO0o0) || i == 2) {
            return;
        }
        OooO.OooO0o(oooO0OO).getFocusOwner().OooO0O0((InterfaceC21259OooO0o0) oooO0OO);
    }

    public static final int OooO0O0(InterfaceC21233OooO0o.OooO0O0 element) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        int i = element instanceof InterfaceC34637OooOOo ? 3 : 1;
        if (element instanceof InterfaceC34621OooO) {
            i |= 512;
        }
        if (element instanceof InterfaceC21250OooO0oO) {
            i |= 4;
        }
        if (element instanceof InterfaceC28389OooOO0o) {
            i |= 8;
        }
        if (element instanceof InterfaceC25089OooOoO0) {
            i |= 16;
        }
        if ((element instanceof InterfaceC25574OooO0Oo) || (element instanceof InterfaceC25577OooO0oO)) {
            i |= 32;
        }
        if (element instanceof InterfaceC21257OooO0Oo) {
            i |= 4096;
        }
        if (element instanceof InterfaceC21262OooOO0) {
            i |= 2048;
        }
        if (element instanceof InterfaceC34649OooOooo) {
            i |= 256;
        }
        if (element instanceof InterfaceC34653Oooo0O0) {
            i |= 64;
        }
        return ((element instanceof InterfaceC34651Oooo00O) || (element instanceof InterfaceC34652Oooo00o) || (element instanceof C34640OooOo0)) ? i | 128 : i;
    }

    public static final boolean OooO0OO(int i) {
        return (i & 128) != 0;
    }
}
