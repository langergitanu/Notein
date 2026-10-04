package Ooooo0o;

import Oooo0.C20845OoooO0O;
import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25538OooooOO;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Ooooo0o.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21277OooOoO {

    /* JADX INFO: renamed from: Ooooo0o.OooOoO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<FocusTargetModifierNode, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f61682OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
            FocusTargetModifierNode it = focusTargetModifierNode;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(C21277OooOoO.OooO0OO(it));
        }
    }

    public static final boolean OooO00o(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(focusTargetModifierNode, "<this>");
        int iOrdinal = focusTargetModifierNode.f63337Oooo00O.ordinal();
        EnumC21278OooOoO0 enumC21278OooOoO0 = EnumC21278OooOoO0.f61685OooOoO;
        if (iOrdinal == 0) {
            focusTargetModifierNode.f63337Oooo00O = enumC21278OooOoO0;
            if (z2) {
                C21258OooO0o.OooO0O0(focusTargetModifierNode);
            }
        } else if (iOrdinal == 1) {
            FocusTargetModifierNode focusTargetModifierNodeOooO0OO = C21279OooOoOO.OooO0OO(focusTargetModifierNode);
            if (!(focusTargetModifierNodeOooO0OO != null ? OooO00o(focusTargetModifierNodeOooO0OO, z, z2) : true)) {
                return false;
            }
            focusTargetModifierNode.f63337Oooo00O = enumC21278OooOoO0;
            if (z2) {
                C21258OooO0o.OooO0O0(focusTargetModifierNode);
                return true;
            }
        } else {
            if (iOrdinal == 2) {
                if (z) {
                    focusTargetModifierNode.f63337Oooo00O = enumC21278OooOoO0;
                    if (z2) {
                        C21258OooO0o.OooO0O0(focusTargetModifierNode);
                    }
                }
                return z;
            }
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
        }
        return true;
    }

    public static final void OooO0O0(FocusTargetModifierNode focusTargetModifierNode) {
        C25538OooooOO.OooO00o(focusTargetModifierNode, new C20845OoooO0O(focusTargetModifierNode, 1));
        int iOrdinal = focusTargetModifierNode.f63337Oooo00O.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            focusTargetModifierNode.f63337Oooo00O = EnumC21278OooOoO0.f61684OooOo0o;
        }
    }

    public static final boolean OooO0OO(FocusTargetModifierNode focusTargetModifierNode) {
        C25503OooOoOO c25503OooOoOO;
        AndroidComposeView androidComposeView;
        kotlin.jvm.internal.OooOOO0.OooO0oO(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.f61604OooOo0o.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        if (!focusTargetModifierNode.Oooo00o().f61666OooO00o) {
            return Oooo000.OooO0oO(focusTargetModifierNode, 7, OooO00o.f61682OooOo0o);
        }
        int iOrdinal = focusTargetModifierNode.f63337Oooo00O.ordinal();
        boolean z = true;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetModifierNode focusTargetModifierNodeOooO0OO = C21279OooOoOO.OooO0OO(focusTargetModifierNode);
                if (focusTargetModifierNodeOooO0OO != null ? OooO00o(focusTargetModifierNodeOooO0OO, false, true) : true) {
                    OooO0O0(focusTargetModifierNode);
                } else {
                    z = false;
                }
                if (z) {
                    C21258OooO0o.OooO0O0(focusTargetModifierNode);
                }
                return z;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C32442OooOO0o();
                }
                InterfaceC21233OooO0o.OooO0OO OooO0OO2 = o00oO0O.OooO.OooO0OO(focusTargetModifierNode, 1024);
                if (!(OooO0OO2 instanceof FocusTargetModifierNode)) {
                    OooO0OO2 = null;
                }
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) OooO0OO2;
                if (focusTargetModifierNode2 != null) {
                    return OooO0Oo(focusTargetModifierNode2, focusTargetModifierNode);
                }
                AbstractC25521OoooO abstractC25521OoooO = focusTargetModifierNode.f61608OooOoo;
                if (abstractC25521OoooO == null || (c25503OooOoOO = abstractC25521OoooO.f87051OooOoo) == null || (androidComposeView = c25503OooOoOO.f86944OooOooO) == null) {
                    throw new IllegalStateException("Owner not initialized.");
                }
                if (androidComposeView.requestFocus()) {
                    OooO0O0(focusTargetModifierNode);
                } else {
                    z = false;
                }
                if (z) {
                    C21258OooO0o.OooO0O0(focusTargetModifierNode);
                }
                return z;
            }
        }
        C21258OooO0o.OooO0O0(focusTargetModifierNode);
        return true;
    }

    public static final boolean OooO0Oo(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        C25503OooOoOO c25503OooOoOO;
        AndroidComposeView androidComposeView;
        InterfaceC21233OooO0o.OooO0OO OooO0OO2 = o00oO0O.OooO.OooO0OO(focusTargetModifierNode2, 1024);
        if (!(OooO0OO2 instanceof FocusTargetModifierNode)) {
            OooO0OO2 = null;
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0((FocusTargetModifierNode) OooO0OO2, focusTargetModifierNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = focusTargetModifierNode.f63337Oooo00O.ordinal();
        EnumC21278OooOoO0 enumC21278OooOoO0 = EnumC21278OooOoO0.f61683OooOo;
        boolean z = true;
        if (iOrdinal == 0) {
            OooO0O0(focusTargetModifierNode2);
            focusTargetModifierNode.f63337Oooo00O = enumC21278OooOoO0;
            C21258OooO0o.OooO0O0(focusTargetModifierNode2);
            C21258OooO0o.OooO0O0(focusTargetModifierNode);
            return true;
        }
        if (iOrdinal == 1) {
            if (C21279OooOoOO.OooO0OO(focusTargetModifierNode) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            FocusTargetModifierNode focusTargetModifierNodeOooO0OO = C21279OooOoOO.OooO0OO(focusTargetModifierNode);
            if (focusTargetModifierNodeOooO0OO != null ? OooO00o(focusTargetModifierNodeOooO0OO, false, true) : true) {
                OooO0O0(focusTargetModifierNode2);
            } else {
                z = false;
            }
            if (z) {
                C21258OooO0o.OooO0O0(focusTargetModifierNode2);
            }
            return z;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
            InterfaceC21233OooO0o.OooO0OO OooO0OO3 = o00oO0O.OooO.OooO0OO(focusTargetModifierNode, 1024);
            FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) (OooO0OO3 instanceof FocusTargetModifierNode ? OooO0OO3 : null);
            if (focusTargetModifierNode3 == null) {
                AbstractC25521OoooO abstractC25521OoooO = focusTargetModifierNode.f61608OooOoo;
                if (abstractC25521OoooO == null || (c25503OooOoOO = abstractC25521OoooO.f87051OooOoo) == null || (androidComposeView = c25503OooOoOO.f86944OooOooO) == null) {
                    throw new IllegalStateException("Owner not initialized.");
                }
                if (androidComposeView.requestFocus()) {
                    focusTargetModifierNode.f63337Oooo00O = EnumC21278OooOoO0.f61684OooOo0o;
                    C21258OooO0o.OooO0O0(focusTargetModifierNode);
                    return OooO0Oo(focusTargetModifierNode, focusTargetModifierNode2);
                }
            }
            if (focusTargetModifierNode3 != null && OooO0Oo(focusTargetModifierNode3, focusTargetModifierNode)) {
                boolean zOooO0Oo = OooO0Oo(focusTargetModifierNode, focusTargetModifierNode2);
                if (focusTargetModifierNode.f63337Oooo00O == enumC21278OooOoO0) {
                    return zOooO0Oo;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
        return false;
    }
}
