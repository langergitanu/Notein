package Ooooo0o;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo0o.C21264OooOO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import java.util.Arrays;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: renamed from: Ooooo0o.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21282OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61693OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f61694OooO0O0 = 0;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OooO00o(FocusTargetModifierNode focusTargetModifierNode, C21264OooOO0o.OooO0O0 oooO0O0) {
        int iOrdinal = focusTargetModifierNode.f63337Oooo00O.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetModifierNode focusTargetModifierNodeOooO0OO = C21279OooOoOO.OooO0OO(focusTargetModifierNode);
                if (focusTargetModifierNodeOooO0OO == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetModifierNodeOooO0OO.f63337Oooo00O.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new C32442OooOO0o();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (OooO00o(focusTargetModifierNodeOooO0OO, oooO0O0) || OooO0OO(focusTargetModifierNode, focusTargetModifierNodeOooO0OO, 2, oooO0O0) || (focusTargetModifierNodeOooO0OO.Oooo00o().f61666OooO00o && ((Boolean) oooO0O0.invoke(focusTargetModifierNodeOooO0OO)).booleanValue())) {
                        return true;
                    }
                }
                return OooO0OO(focusTargetModifierNode, focusTargetModifierNodeOooO0OO, 2, oooO0O0);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C32442OooOO0o();
                }
                if (!OooO0Oo(focusTargetModifierNode, oooO0O0)) {
                    if (!(focusTargetModifierNode.Oooo00o().f61666OooO00o ? ((Boolean) oooO0O0.invoke(focusTargetModifierNode)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return OooO0Oo(focusTargetModifierNode, oooO0O0);
    }

    public static final boolean OooO0O0(FocusTargetModifierNode focusTargetModifierNode, C21264OooOO0o.OooO0O0 oooO0O0) {
        int iOrdinal = focusTargetModifierNode.f63337Oooo00O.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetModifierNode focusTargetModifierNodeOooO0OO = C21279OooOoOO.OooO0OO(focusTargetModifierNode);
                if (focusTargetModifierNodeOooO0OO != null) {
                    return OooO0O0(focusTargetModifierNodeOooO0OO, oooO0O0) || OooO0OO(focusTargetModifierNode, focusTargetModifierNodeOooO0OO, 1, oooO0O0);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetModifierNode.Oooo00o().f61666OooO00o ? ((Boolean) oooO0O0.invoke(focusTargetModifierNode)).booleanValue() : OooO0o0(focusTargetModifierNode, oooO0O0);
                }
                throw new C32442OooOO0o();
            }
        }
        return OooO0o0(focusTargetModifierNode, oooO0O0);
    }

    public static final boolean OooO0OO(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C21264OooOO0o.OooO0O0 oooO0O0) {
        if (OooO0o(focusTargetModifierNode, focusTargetModifierNode2, i, oooO0O0)) {
            return true;
        }
        Boolean bool = (Boolean) C21254OooO00o.OooO00o(focusTargetModifierNode, i, new C21280OooOoo(focusTargetModifierNode, focusTargetModifierNode2, i, oooO0O0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean OooO0Oo(FocusTargetModifierNode focusTargetModifierNode, C21264OooOO0o.OooO0O0 oooO0O0) {
        Object[] objArrCopyOf = new FocusTargetModifierNode[16];
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNode.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O02 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61607OooOoOO;
        if (oooO0OO2 == null) {
            o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO);
        } else {
            oooO0O02.OooO0O0(oooO0OO2);
        }
        int i = 0;
        while (oooO0O02.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO3 = (InterfaceC21233OooO0o.OooO0OO) oooO0O02.OooOO0o(oooO0O02.f59746OooOoO0 - 1);
            if ((oooO0OO3.f61606OooOoO0 & 1024) == 0) {
                o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO3);
            } else {
                while (true) {
                    if (oooO0OO3 == null) {
                        break;
                    }
                    if ((oooO0OO3.f61603OooOo & 1024) == 0) {
                        oooO0OO3 = oooO0OO3.f61607OooOoOO;
                    } else if (oooO0OO3 instanceof FocusTargetModifierNode) {
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) oooO0OO3;
                        int i2 = i + 1;
                        if (objArrCopyOf.length < i2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i2, objArrCopyOf.length * 2));
                            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                        }
                        objArrCopyOf[i] = focusTargetModifierNode2;
                        i = i2;
                    }
                }
            }
        }
        C21281OooOoo0 c21281OooOoo0 = C21281OooOoo0.f61692OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i, c21281OooOoo0);
        if (i > 0) {
            int i3 = i - 1;
            do {
                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) objArrCopyOf[i3];
                if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode3) && OooO00o(focusTargetModifierNode3, oooO0O0)) {
                    return true;
                }
                i3--;
            } while (i3 >= 0);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OooO0o(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C21264OooOO0o.OooO0O0 oooO0O0) {
        InterfaceC21233OooO0o.OooO0OO OooO0OO2;
        if (focusTargetModifierNode.f63337Oooo00O != EnumC21278OooOoO0.f61683OooOo) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArrCopyOf = new FocusTargetModifierNode[16];
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNode.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O02 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61607OooOoOO;
        if (oooO0OO2 == null) {
            o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO);
        } else {
            oooO0O02.OooO0O0(oooO0OO2);
        }
        int i2 = 0;
        while (oooO0O02.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO3 = (InterfaceC21233OooO0o.OooO0OO) oooO0O02.OooOO0o(oooO0O02.f59746OooOoO0 - 1);
            if ((oooO0OO3.f61606OooOoO0 & 1024) == 0) {
                o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO3);
            } else {
                while (true) {
                    if (oooO0OO3 == null) {
                        break;
                    }
                    if ((oooO0OO3.f61603OooOo & 1024) == 0) {
                        oooO0OO3 = oooO0OO3.f61607OooOoOO;
                    } else if (oooO0OO3 instanceof FocusTargetModifierNode) {
                        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) oooO0OO3;
                        int i3 = i2 + 1;
                        if (objArrCopyOf.length < i3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i3, objArrCopyOf.length * 2));
                            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                        }
                        objArrCopyOf[i2] = focusTargetModifierNode3;
                        i2 = i3;
                    }
                }
            }
        }
        C21281OooOoo0 c21281OooOoo0 = C21281OooOoo0.f61692OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i2, c21281OooOoo0);
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i4 = new oO0O00oo.OooO(0, i2 - 1, 1).f116811OooOo;
            if (i4 >= 0) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) objArrCopyOf[i4];
                        if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode4) && OooO00o(focusTargetModifierNode4, oooO0O0)) {
                            break;
                        }
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(objArrCopyOf[i4], focusTargetModifierNode2)) {
                        z = true;
                    }
                    if (i4 == 0) {
                        break;
                    }
                    i4--;
                }
            }
            if (i != 1) {
                OooO0OO2 = o00oO0O.OooO.OooO0OO(focusTargetModifierNode, 1024);
                if (!(OooO0OO2 instanceof FocusTargetModifierNode)) {
                }
                if (((FocusTargetModifierNode) OooO0OO2) != null) {
                }
            }
            return false;
        }
        int i5 = new oO0O00oo.OooO(0, i2 - 1, 1).f116811OooOo;
        if (i5 >= 0) {
            boolean z2 = false;
            int i6 = 0;
            while (true) {
                if (z2) {
                    FocusTargetModifierNode focusTargetModifierNode5 = (FocusTargetModifierNode) objArrCopyOf[i6];
                    if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode5) && OooO0O0(focusTargetModifierNode5, oooO0O0)) {
                        break;
                    }
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(objArrCopyOf[i6], focusTargetModifierNode2)) {
                    z2 = true;
                }
                if (i6 == i5) {
                    break;
                }
                i6++;
            }
        }
        if (i != 1 && focusTargetModifierNode.Oooo00o().f61666OooO00o) {
            OooO0OO2 = o00oO0O.OooO.OooO0OO(focusTargetModifierNode, 1024);
            if (!(OooO0OO2 instanceof FocusTargetModifierNode)) {
                OooO0OO2 = null;
            }
            if (((FocusTargetModifierNode) OooO0OO2) != null) {
                return ((Boolean) oooO0O0.invoke(focusTargetModifierNode)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean OooO0o0(FocusTargetModifierNode focusTargetModifierNode, C21264OooOO0o.OooO0O0 oooO0O0) {
        Object[] objArrCopyOf = new FocusTargetModifierNode[16];
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNode.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O02 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61607OooOoOO;
        if (oooO0OO2 == null) {
            o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO);
        } else {
            oooO0O02.OooO0O0(oooO0OO2);
        }
        int i = 0;
        while (oooO0O02.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO3 = (InterfaceC21233OooO0o.OooO0OO) oooO0O02.OooOO0o(oooO0O02.f59746OooOoO0 - 1);
            if ((oooO0OO3.f61606OooOoO0 & 1024) == 0) {
                o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO3);
            } else {
                while (true) {
                    if (oooO0OO3 == null) {
                        break;
                    }
                    if ((oooO0OO3.f61603OooOo & 1024) == 0) {
                        oooO0OO3 = oooO0OO3.f61607OooOoOO;
                    } else if (oooO0OO3 instanceof FocusTargetModifierNode) {
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) oooO0OO3;
                        int i2 = i + 1;
                        if (objArrCopyOf.length < i2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i2, objArrCopyOf.length * 2));
                            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                        }
                        objArrCopyOf[i] = focusTargetModifierNode2;
                        i = i2;
                    }
                }
            }
        }
        C21281OooOoo0 c21281OooOoo0 = C21281OooOoo0.f61692OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(objArrCopyOf, "<this>");
        Arrays.sort(objArrCopyOf, 0, i, c21281OooOoo0);
        if (i > 0) {
            int i3 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) objArrCopyOf[i3];
                if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode3) && OooO0O0(focusTargetModifierNode3, oooO0O0)) {
                    return true;
                }
                i3++;
            } while (i3 < i);
        }
        return false;
    }

    public static final int OooO0oO(C32271OooO00o c32271OooO00o, C32271OooO00o other, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32271OooO00o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        int iMin = Math.min(other.f115946OooO0OO - other.f115945OooO0O0, i);
        int i2 = c32271OooO00o.f115949OooO0o0;
        int i3 = c32271OooO00o.f115946OooO0OO;
        int i4 = i2 - i3;
        if (i4 <= iMin) {
            int i5 = c32271OooO00o.f115948OooO0o;
            if ((i5 - i2) + i4 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i3 + iMin) - i2 > 0) {
                c32271OooO00o.f115949OooO0o0 = i5;
            }
        }
        C32250OooO0O0.OooO00o(other.f115944OooO00o, c32271OooO00o.f115944OooO00o, other.f115945OooO0O0, iMin, i3);
        other.OooO0OO(iMin);
        c32271OooO00o.OooO00o(iMin);
        return iMin;
    }
}
