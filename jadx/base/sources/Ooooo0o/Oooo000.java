package Ooooo0o;

import Oooo0.C20856OooooOo;
import OoooOoO.InterfaceC21233OooO0o;
import Ooooo0o.C21264OooOO0o;
import OooooO0.C21291OooO0oO;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import java.io.EOFException;
import o00oO0O.InterfaceC25492OooO0oo;
import o00oOooo.InterfaceC25632OooO00o;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f61699OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static InterfaceC25632OooO00o f61700OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f61701OooO0OO = 0;

    public static final boolean OooO(int i, C21291OooO0oO c21291OooO0oO, C21291OooO0oO c21291OooO0oO2) {
        float f = c21291OooO0oO.f61724OooO00o;
        float f2 = c21291OooO0oO.f61726OooO0OO;
        float f3 = c21291OooO0oO2.f61724OooO00o;
        float f4 = c21291OooO0oO2.f61726OooO0OO;
        if (i == 3) {
            return (f4 > f2 || f3 >= f2) && f3 > f;
        }
        if (i == 4) {
            return (f3 < f || f4 <= f) && f4 < f2;
        }
        float f5 = c21291OooO0oO.f61725OooO0O0;
        float f6 = c21291OooO0oO.f61727OooO0Oo;
        float f7 = c21291OooO0oO2.f61725OooO0O0;
        float f8 = c21291OooO0oO2.f61727OooO0Oo;
        if (i == 5) {
            return (f8 > f6 || f7 >= f6) && f7 > f5;
        }
        if (i == 6) {
            return (f7 < f5 || f8 <= f5) && f8 < f6;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean OooO00o(C21291OooO0oO c21291OooO0oO, C21291OooO0oO c21291OooO0oO2, C21291OooO0oO c21291OooO0oO3, int i) {
        float f;
        float f2;
        if (OooO0O0(i, c21291OooO0oO3, c21291OooO0oO) || !OooO0O0(i, c21291OooO0oO2, c21291OooO0oO)) {
            return false;
        }
        float f3 = c21291OooO0oO3.f61725OooO0O0;
        float f4 = c21291OooO0oO3.f61727OooO0Oo;
        float f5 = c21291OooO0oO3.f61724OooO00o;
        float f6 = c21291OooO0oO3.f61726OooO0OO;
        float f7 = c21291OooO0oO.f61727OooO0Oo;
        float f8 = c21291OooO0oO.f61725OooO0O0;
        float f9 = c21291OooO0oO.f61726OooO0OO;
        float f10 = c21291OooO0oO.f61724OooO00o;
        if (i == 3) {
            if (f10 < f6) {
                return true;
            }
        } else if (i == 4) {
            if (f9 > f5) {
                return true;
            }
        } else if (i == 5) {
            if (f8 < f4) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f7 > f3) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f10 - c21291OooO0oO2.f61726OooO0OO;
        } else if (i == 4) {
            f = c21291OooO0oO2.f61724OooO00o - f9;
        } else if (i == 5) {
            f = f8 - c21291OooO0oO2.f61727OooO0Oo;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = c21291OooO0oO2.f61725OooO0O0 - f7;
        }
        float fMax = Math.max(0.0f, f);
        if (i == 3) {
            f2 = f10 - f5;
        } else if (i == 4) {
            f2 = f6 - f9;
        } else if (i == 5) {
            f2 = f8 - f3;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = f4 - f7;
        }
        return fMax < Math.max(1.0f, f2);
    }

    public static final boolean OooO0O0(int i, C21291OooO0oO c21291OooO0oO, C21291OooO0oO c21291OooO0oO2) {
        if (i == 3 || i == 4) {
            return c21291OooO0oO.f61727OooO0Oo > c21291OooO0oO2.f61725OooO0O0 && c21291OooO0oO.f61725OooO0O0 < c21291OooO0oO2.f61727OooO0Oo;
        }
        if (i == 5 || i == 6) {
            return c21291OooO0oO.f61726OooO0OO > c21291OooO0oO2.f61724OooO00o && c21291OooO0oO.f61724OooO00o < c21291OooO0oO2.f61726OooO0OO;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final void OooO0OO(InterfaceC25492OooO0oo interfaceC25492OooO0oo, Oooo.OooO0O0 oooO0O0) {
        Oooo.OooO0O0<InterfaceC21275OooOo0O> oooO0O02;
        int i;
        if (!interfaceC25492OooO0oo.getNode().f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O03 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO = interfaceC25492OooO0oo.getNode().f61607OooOoOO;
        if (oooO0OO == null) {
            o00oO0O.OooO.OooO00o(oooO0O03, interfaceC25492OooO0oo.getNode());
        } else {
            oooO0O03.OooO0O0(oooO0OO);
        }
        while (oooO0O03.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO2 = (InterfaceC21233OooO0o.OooO0OO) oooO0O03.OooOO0o(oooO0O03.f59746OooOoO0 - 1);
            if ((oooO0OO2.f61606OooOoO0 & 1024) != 0) {
                for (InterfaceC21233OooO0o.OooO0OO oooO0OO3 = oooO0OO2; oooO0OO3 != null; oooO0OO3 = oooO0OO3.f61607OooOoOO) {
                    if ((oooO0OO3.f61603OooOo & 1024) != 0 && (oooO0OO3 instanceof FocusTargetModifierNode)) {
                        FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) oooO0OO3;
                        if (focusTargetModifierNode.f61612Oooo000) {
                            if (focusTargetModifierNode.Oooo00o().f61666OooO00o) {
                                oooO0O0.OooO0O0(focusTargetModifierNode);
                                break;
                            }
                            focusTargetModifierNode.Oooo00o().f61674OooOO0.getClass();
                            C21274OooOo00 c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, c21274OooOo00)) {
                                c21274OooOo00 = null;
                            }
                            if (c21274OooOo00 != null) {
                                if (!c21274OooOo00.equals(C21274OooOo00.f61679OooO0OO) && (i = (oooO0O02 = c21274OooOo00.f61680OooO00o).f59746OooOoO0) > 0) {
                                    InterfaceC21275OooOo0O[] interfaceC21275OooOo0OArr = oooO0O02.f59745OooOo0o;
                                    int i2 = 0;
                                    do {
                                        OooO0OO(interfaceC21275OooOo0OArr[i2], oooO0O0);
                                        i2++;
                                    } while (i2 < i);
                                }
                            }
                        }
                    }
                }
            }
            o00oO0O.OooO.OooO00o(oooO0O03, oooO0OO2);
        }
    }

    public static final void OooO0Oo(int i, int i2) {
        throw new EOFException(C20856OooooOo.OooO0O0("Unable to discard ", i, " bytes: only ", " available for writing", i2));
    }

    public static final FocusTargetModifierNode OooO0o(Oooo.OooO0O0 oooO0O0, C21291OooO0oO c21291OooO0oO, int i) {
        C21291OooO0oO c21291OooO0oOOooO0o0;
        if (i == 3) {
            c21291OooO0oOOooO0o0 = c21291OooO0oO.OooO0o0(c21291OooO0oO.OooO0OO() + 1, 0.0f);
        } else if (i == 4) {
            c21291OooO0oOOooO0o0 = c21291OooO0oO.OooO0o0(-(c21291OooO0oO.OooO0OO() + 1), 0.0f);
        } else if (i == 5) {
            c21291OooO0oOOooO0o0 = c21291OooO0oO.OooO0o0(0.0f, c21291OooO0oO.OooO0O0() + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c21291OooO0oOOooO0o0 = c21291OooO0oO.OooO0o0(0.0f, -(c21291OooO0oO.OooO0O0() + 1));
        }
        int i2 = oooO0O0.f59746OooOoO0;
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (i2 > 0) {
            Object[] objArr = oooO0O0.f59745OooOo0o;
            int i3 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) objArr[i3];
                if (C21279OooOoOO.OooO0Oo(focusTargetModifierNode2)) {
                    C21291OooO0oO c21291OooO0oOOooO0O0 = C21279OooOoOO.OooO0O0(focusTargetModifierNode2);
                    if (OooO(i, c21291OooO0oOOooO0O0, c21291OooO0oO) && (!OooO(i, c21291OooO0oOOooO0o0, c21291OooO0oO) || OooO00o(c21291OooO0oO, c21291OooO0oOOooO0O0, c21291OooO0oOOooO0o0, i) || (!OooO00o(c21291OooO0oO, c21291OooO0oOOooO0o0, c21291OooO0oOOooO0O0, i) && OooOO0(i, c21291OooO0oO, c21291OooO0oOOooO0O0) < OooOO0(i, c21291OooO0oO, c21291OooO0oOOooO0o0)))) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        c21291OooO0oOOooO0o0 = c21291OooO0oOOooO0O0;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return focusTargetModifierNode;
    }

    public static final void OooO0o0(int i, int i2) {
        throw new EOFException(C20856OooooOo.OooO0O0("Unable to discard ", i, " bytes: only ", " available for reading", i2));
    }

    public static final boolean OooO0oO(FocusTargetModifierNode findChildCorrespondingToFocusEnter, int i, InterfaceC32507OooOO0o onFound) {
        C21291OooO0oO c21291OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onFound, "onFound");
        findChildCorrespondingToFocusEnter.Oooo00o().f61674OooOO0.getClass();
        C21274OooOo00 c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, c21274OooOo00)) {
            c21274OooOo00 = null;
        }
        if (c21274OooOo00 == null) {
            Oooo.OooO0O0 oooO0O0 = new Oooo.OooO0O0(new FocusTargetModifierNode[16]);
            OooO0OO(findChildCorrespondingToFocusEnter, oooO0O0);
            if (oooO0O0.f59746OooOoO0 <= 1) {
                FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) (oooO0O0.OooO() ? null : oooO0O0.f59745OooOo0o[0]);
                if (focusTargetModifierNode != null) {
                    return ((Boolean) onFound.invoke(focusTargetModifierNode)).booleanValue();
                }
            } else {
                if (i == 7) {
                    i = 4;
                }
                if (i == 4 || i == 6) {
                    C21291OooO0oO c21291OooO0oOOooO0O0 = C21279OooOoOO.OooO0O0(findChildCorrespondingToFocusEnter);
                    float f = c21291OooO0oOOooO0O0.f61725OooO0O0;
                    float f2 = c21291OooO0oOOooO0O0.f61724OooO00o;
                    c21291OooO0oO = new C21291OooO0oO(f2, f, f2, f);
                } else {
                    if (i != 3 && i != 5) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    C21291OooO0oO c21291OooO0oOOooO0O02 = C21279OooOoOO.OooO0O0(findChildCorrespondingToFocusEnter);
                    float f3 = c21291OooO0oOOooO0O02.f61727OooO0Oo;
                    float f4 = c21291OooO0oOOooO0O02.f61726OooO0OO;
                    c21291OooO0oO = new C21291OooO0oO(f4, f3, f4, f3);
                }
                FocusTargetModifierNode focusTargetModifierNodeOooO0o = OooO0o(oooO0O0, c21291OooO0oO, i);
                if (focusTargetModifierNodeOooO0o != null) {
                    return ((Boolean) onFound.invoke(focusTargetModifierNodeOooO0o)).booleanValue();
                }
            }
        } else if (!c21274OooOo00.equals(C21274OooOo00.f61679OooO0OO)) {
            return c21274OooOo00.OooO00o(onFound);
        }
        return false;
    }

    public static final boolean OooO0oo(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C21264OooOO0o.OooO0O0 oooO0O0) {
        if (OooOO0O(focusTargetModifierNode, focusTargetModifierNode2, i, oooO0O0)) {
            return true;
        }
        Boolean bool = (Boolean) C21254OooO00o.OooO00o(focusTargetModifierNode, i, new C21283OooOooo(focusTargetModifierNode, focusTargetModifierNode2, i, oooO0O0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long OooOO0(int i, C21291OooO0oO c21291OooO0oO, C21291OooO0oO c21291OooO0oO2) {
        float f;
        float f2;
        float fOooO0O0;
        float f3 = c21291OooO0oO.f61725OooO0O0;
        float f4 = c21291OooO0oO.f61724OooO00o;
        float f5 = c21291OooO0oO2.f61725OooO0O0;
        float f6 = c21291OooO0oO2.f61724OooO00o;
        if (i == 3) {
            f = f4 - c21291OooO0oO2.f61726OooO0OO;
        } else if (i == 4) {
            f = f6 - c21291OooO0oO.f61726OooO0OO;
        } else if (i == 5) {
            f = f3 - c21291OooO0oO2.f61727OooO0Oo;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = f5 - c21291OooO0oO.f61727OooO0Oo;
        }
        long jAbs = (long) Math.abs(Math.max(0.0f, f));
        if (i == 3 || i == 4) {
            float fOooO0O02 = c21291OooO0oO.OooO0O0();
            float f7 = 2;
            f2 = (fOooO0O02 / f7) + f3;
            fOooO0O0 = (c21291OooO0oO2.OooO0O0() / f7) + f5;
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float fOooO0OO = c21291OooO0oO.OooO0OO();
            float f8 = 2;
            f2 = (fOooO0OO / f8) + f4;
            fOooO0O0 = (c21291OooO0oO2.OooO0OO() / f8) + f6;
        }
        long jAbs2 = (long) Math.abs(f2 - fOooO0O0);
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    public static final boolean OooOO0O(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C21264OooOO0o.OooO0O0 oooO0O0) {
        FocusTargetModifierNode focusTargetModifierNodeOooO0o;
        Oooo.OooO0O0 oooO0O02 = new Oooo.OooO0O0(new FocusTargetModifierNode[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNode.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O03 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61607OooOoOO;
        if (oooO0OO2 == null) {
            o00oO0O.OooO.OooO00o(oooO0O03, oooO0OO);
        } else {
            oooO0O03.OooO0O0(oooO0OO2);
        }
        while (oooO0O03.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO3 = (InterfaceC21233OooO0o.OooO0OO) oooO0O03.OooOO0o(oooO0O03.f59746OooOoO0 - 1);
            if ((oooO0OO3.f61606OooOoO0 & 1024) == 0) {
                o00oO0O.OooO.OooO00o(oooO0O03, oooO0OO3);
            } else {
                while (true) {
                    if (oooO0OO3 == null) {
                        break;
                    }
                    if ((oooO0OO3.f61603OooOo & 1024) == 0) {
                        oooO0OO3 = oooO0OO3.f61607OooOoOO;
                    } else if (oooO0OO3 instanceof FocusTargetModifierNode) {
                        oooO0O02.OooO0O0((FocusTargetModifierNode) oooO0OO3);
                    }
                }
            }
        }
        while (oooO0O02.OooOO0() && (focusTargetModifierNodeOooO0o = OooO0o(oooO0O02, C21279OooOoOO.OooO0O0(focusTargetModifierNode2), i)) != null) {
            if (focusTargetModifierNodeOooO0o.Oooo00o().f61666OooO00o) {
                return ((Boolean) oooO0O0.invoke(focusTargetModifierNodeOooO0o)).booleanValue();
            }
            focusTargetModifierNodeOooO0o.Oooo00o().f61674OooOO0.getClass();
            C21274OooOo00 c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, c21274OooOo00)) {
                c21274OooOo00 = null;
            }
            if (c21274OooOo00 != null) {
                if (c21274OooOo00.equals(C21274OooOo00.f61679OooO0OO)) {
                    return false;
                }
                return c21274OooOo00.OooO00o(oooO0O0);
            }
            if (OooO0oo(focusTargetModifierNodeOooO0o, focusTargetModifierNode2, i, oooO0O0)) {
                return true;
            }
            oooO0O02.OooOO0O(focusTargetModifierNodeOooO0o);
        }
        return false;
    }

    public static final Boolean OooOO0o(FocusTargetModifierNode twoDimensionalFocusSearch, int i, C21264OooOO0o.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        int iOrdinal = twoDimensionalFocusSearch.f63337Oooo00O.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetModifierNode focusTargetModifierNodeOooO0OO = C21279OooOoOO.OooO0OO(twoDimensionalFocusSearch);
                if (focusTargetModifierNodeOooO0OO == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetModifierNodeOooO0OO.f63337Oooo00O.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolOooOO0o = OooOO0o(focusTargetModifierNodeOooO0OO, i, oooO0O0);
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(boolOooOO0o, Boolean.FALSE)) {
                            return boolOooOO0o;
                        }
                        focusTargetModifierNodeOooO0OO.Oooo00o().f61675OooOO0O.getClass();
                        C21274OooOo00 c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, c21274OooOo00)) {
                            c21274OooOo00 = null;
                        }
                        if (c21274OooOo00 != null) {
                            if (c21274OooOo00.equals(C21274OooOo00.f61679OooO0OO)) {
                                return null;
                            }
                            return Boolean.valueOf(c21274OooOo00.OooO00o(oooO0O0));
                        }
                        if (focusTargetModifierNodeOooO0OO.f63337Oooo00O != EnumC21278OooOoO0.f61683OooOo) {
                            throw new IllegalStateException("Check failed.");
                        }
                        FocusTargetModifierNode focusTargetModifierNodeOooO00o = C21279OooOoOO.OooO00o(focusTargetModifierNodeOooO0OO);
                        if (focusTargetModifierNodeOooO00o != null) {
                            return Boolean.valueOf(OooO0oo(twoDimensionalFocusSearch, focusTargetModifierNodeOooO00o, i, oooO0O0));
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new C32442OooOO0o();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return Boolean.valueOf(OooO0oo(twoDimensionalFocusSearch, focusTargetModifierNodeOooO0OO, i, oooO0O0));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return twoDimensionalFocusSearch.Oooo00o().f61666OooO00o ? (Boolean) oooO0O0.invoke(twoDimensionalFocusSearch) : Boolean.FALSE;
                }
                throw new C32442OooOO0o();
            }
        }
        return Boolean.valueOf(OooO0oO(twoDimensionalFocusSearch, i, oooO0O0));
    }
}
