package Oooo0oO;

import Oooo0oO.C21101o0000ooO;
import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.C21200OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public interface oo000o extends o000O0, o00oO0O<Long> {
    @Override // Oooo0oO.o000O0
    default Object getValue() {
        C21101o0000ooO c21101o0000ooO = (C21101o0000ooO) this;
        return Long.valueOf(((C21101o0000ooO.OooO00o) C21200OooOOO0.OooOo00(c21101o0000ooO.f61208OooOo, c21101o0000ooO)).f61209OooO0OO);
    }

    @Override // Oooo0oO.o00oO0O
    default void setValue(Long l) {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        long jLongValue = l.longValue();
        C21101o0000ooO c21101o0000ooO = (C21101o0000ooO) this;
        C21101o0000ooO.OooO00o oooO00o = (C21101o0000ooO.OooO00o) C21200OooOOO0.OooO(c21101o0000ooO.f61208OooOo);
        if (oooO00o.f61209OooO0OO != jLongValue) {
            C21101o0000ooO.OooO00o oooO00o2 = c21101o0000ooO.f61208OooOo;
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                ((C21101o0000ooO.OooO00o) C21200OooOOO0.OooOOOO(oooO00o2, c21101o0000ooO, abstractC21194OooO0oOOooOO0O, oooO00o)).f61209OooO0OO = jLongValue;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21101o0000ooO);
        }
    }
}
