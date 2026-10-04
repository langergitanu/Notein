package Ooooo0o;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: Ooooo0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21260OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21261OooO0oo f61651OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21260OooO0oO(C21261OooO0oo c21261OooO0oo) {
        super(0);
        this.f61651OooOo0o = c21261OooO0oo;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        EnumC21278OooOoO0 enumC21278OooOoO0;
        C21261OooO0oo c21261OooO0oo = this.f61651OooOo0o;
        Iterator it = c21261OooO0oo.f61655OooO0Oo.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashSet<FocusTargetModifierNode> linkedHashSet = c21261OooO0oo.f61653OooO0O0;
            int i = 16;
            int i2 = 1;
            if (!zHasNext) {
                LinkedHashSet linkedHashSet2 = c21261OooO0oo.f61655OooO0Oo;
                linkedHashSet2.clear();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet<InterfaceC21259OooO0o0> linkedHashSet4 = c21261OooO0oo.f61654OooO0OO;
                for (InterfaceC21259OooO0o0 interfaceC21259OooO0o0 : linkedHashSet4) {
                    boolean z = interfaceC21259OooO0o0.getNode().f61612Oooo000;
                    EnumC21278OooOoO0 enumC21278OooOoO0OooO00o = EnumC21278OooOoO0.f61685OooOoO;
                    if (!z) {
                        interfaceC21259OooO0o0.OooOOOo(enumC21278OooOoO0OooO00o);
                    } else {
                        if (!interfaceC21259OooO0o0.getNode().f61612Oooo000) {
                            throw new IllegalStateException("Check failed.");
                        }
                        Oooo.OooO0O0 oooO0O0 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[i]);
                        InterfaceC21233OooO0o.OooO0OO oooO0OO = interfaceC21259OooO0o0.getNode().f61607OooOoOO;
                        if (oooO0OO == null) {
                            o00oO0O.OooO.OooO00o(oooO0O0, interfaceC21259OooO0o0.getNode());
                        } else {
                            oooO0O0.OooO0O0(oooO0OO);
                        }
                        FocusTargetModifierNode focusTargetModifierNode = null;
                        int i3 = i2;
                        boolean z2 = false;
                        while (oooO0O0.OooOO0()) {
                            InterfaceC21233OooO0o.OooO0OO oooO0OO2 = (InterfaceC21233OooO0o.OooO0OO) oooO0O0.OooOO0o(oooO0O0.f59746OooOoO0 - i2);
                            if ((oooO0OO2.f61606OooOoO0 & 1024) == 0) {
                                o00oO0O.OooO.OooO00o(oooO0O0, oooO0OO2);
                            } else {
                                while (true) {
                                    if (oooO0OO2 == null) {
                                        break;
                                    }
                                    if ((oooO0OO2.f61603OooOo & 1024) == 0) {
                                        oooO0OO2 = oooO0OO2.f61607OooOoOO;
                                    } else if (oooO0OO2 instanceof FocusTargetModifierNode) {
                                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) oooO0OO2;
                                        if (focusTargetModifierNode != null) {
                                            z2 = true;
                                        }
                                        if (linkedHashSet.contains(focusTargetModifierNode2)) {
                                            linkedHashSet3.add(focusTargetModifierNode2);
                                            i3 = 0;
                                        }
                                        focusTargetModifierNode = focusTargetModifierNode2;
                                    }
                                }
                            }
                            i2 = 1;
                        }
                        if (i3 != 0) {
                            if (z2) {
                                enumC21278OooOoO0OooO00o = C21258OooO0o.OooO00o(interfaceC21259OooO0o0);
                            } else if (focusTargetModifierNode != null && (enumC21278OooOoO0 = focusTargetModifierNode.f63337Oooo00O) != null) {
                                enumC21278OooOoO0OooO00o = enumC21278OooOoO0;
                            }
                            interfaceC21259OooO0o0.OooOOOo(enumC21278OooOoO0OooO00o);
                        }
                    }
                    i = 16;
                    i2 = 1;
                }
                linkedHashSet4.clear();
                for (FocusTargetModifierNode focusTargetModifierNode3 : linkedHashSet) {
                    if (focusTargetModifierNode3.f61612Oooo000) {
                        EnumC21278OooOoO0 enumC21278OooOoO02 = focusTargetModifierNode3.f63337Oooo00O;
                        focusTargetModifierNode3.Oooo0();
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(enumC21278OooOoO02, focusTargetModifierNode3.f63337Oooo00O) || linkedHashSet3.contains(focusTargetModifierNode3)) {
                            C21258OooO0o.OooO0O0(focusTargetModifierNode3);
                        }
                    }
                }
                linkedHashSet.clear();
                linkedHashSet3.clear();
                if (!linkedHashSet2.isEmpty()) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!linkedHashSet4.isEmpty()) {
                    throw new IllegalStateException("Check failed.");
                }
                if (linkedHashSet.isEmpty()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                throw new IllegalStateException("Check failed.");
            }
            InterfaceC21270OooOOo0 interfaceC21270OooOOo0 = (InterfaceC21270OooOOo0) it.next();
            if (!interfaceC21270OooOOo0.getNode().f61612Oooo000) {
                throw new IllegalStateException("Check failed.");
            }
            Oooo.OooO0O0 oooO0O02 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
            InterfaceC21233OooO0o.OooO0OO oooO0OO3 = interfaceC21270OooOOo0.getNode().f61607OooOoOO;
            if (oooO0OO3 == null) {
                o00oO0O.OooO.OooO00o(oooO0O02, interfaceC21270OooOOo0.getNode());
            } else {
                oooO0O02.OooO0O0(oooO0OO3);
            }
            while (oooO0O02.OooOO0()) {
                InterfaceC21233OooO0o.OooO0OO oooO0OO4 = (InterfaceC21233OooO0o.OooO0OO) oooO0O02.OooOO0o(oooO0O02.f59746OooOoO0 - 1);
                if ((oooO0OO4.f61606OooOoO0 & 1024) == 0) {
                    o00oO0O.OooO.OooO00o(oooO0O02, oooO0OO4);
                } else {
                    while (true) {
                        if (oooO0OO4 == null) {
                            break;
                        }
                        if ((oooO0OO4.f61603OooOo & 1024) == 0) {
                            oooO0OO4 = oooO0OO4.f61607OooOoOO;
                        } else if (oooO0OO4 instanceof FocusTargetModifierNode) {
                            linkedHashSet.add((FocusTargetModifierNode) oooO0OO4);
                        }
                    }
                }
            }
        }
    }
}
