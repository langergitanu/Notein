package Oooo0oO;

import Oooo0oO.C21097o0000oOO;
import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.C21200OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public interface o00Ooo extends o000O0, o00oO0O<Double> {
    @Override // Oooo0oO.o000O0
    default Object getValue() {
        C21097o0000oOO c21097o0000oOO = (C21097o0000oOO) this;
        return Double.valueOf(((C21097o0000oOO.OooO00o) C21200OooOOO0.OooOo00(c21097o0000oOO.f61201OooOo, c21097o0000oOO)).f61202OooO0OO);
    }

    @Override // Oooo0oO.o00oO0O
    default void setValue(Double d) {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        double dDoubleValue = d.doubleValue();
        C21097o0000oOO c21097o0000oOO = (C21097o0000oOO) this;
        C21097o0000oOO.OooO00o oooO00o = (C21097o0000oOO.OooO00o) C21200OooOOO0.OooO(c21097o0000oOO.f61201OooOo);
        if (oooO00o.f61202OooO0OO == dDoubleValue) {
            return;
        }
        C21097o0000oOO.OooO00o oooO00o2 = c21097o0000oOO.f61201OooOo;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
            ((C21097o0000oOO.OooO00o) C21200OooOOO0.OooOOOO(oooO00o2, c21097o0000oOO, abstractC21194OooO0oOOooOO0O, oooO00o)).f61202OooO0OO = dDoubleValue;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21097o0000oOO);
    }
}
