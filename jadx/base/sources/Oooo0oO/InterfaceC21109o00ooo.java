package Oooo0oO;

import Oooo0oO.C21100o0000oo0;
import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.C21200OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: Oooo0oO.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21109o00ooo extends o000O0, o00oO0O<Integer> {
    @Override // Oooo0oO.o000O0
    default Object getValue() {
        C21100o0000oo0 c21100o0000oo0 = (C21100o0000oo0) this;
        return Integer.valueOf(((C21100o0000oo0.OooO00o) C21200OooOOO0.OooOo00(c21100o0000oo0.f61206OooOo, c21100o0000oo0)).f61207OooO0OO);
    }

    @Override // Oooo0oO.o00oO0O
    default void setValue(Integer num) {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        int iIntValue = num.intValue();
        C21100o0000oo0 c21100o0000oo0 = (C21100o0000oo0) this;
        C21100o0000oo0.OooO00o oooO00o = (C21100o0000oo0.OooO00o) C21200OooOOO0.OooO(c21100o0000oo0.f61206OooOo);
        if (oooO00o.f61207OooO0OO != iIntValue) {
            C21100o0000oo0.OooO00o oooO00o2 = c21100o0000oo0.f61206OooOo;
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                ((C21100o0000oo0.OooO00o) C21200OooOOO0.OooOOOO(oooO00o2, c21100o0000oo0, abstractC21194OooO0oOOooOO0O, oooO00o)).f61207OooO0OO = iIntValue;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21100o0000oo0);
        }
    }
}
