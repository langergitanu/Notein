package Oooo0oO;

import Oooo0oO.C21098o0000oOo;
import OoooOOo.AbstractC21194OooO0oO;
import OoooOOo.C21200OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: Oooo0oO.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21107o00o0O extends o000O0, o00oO0O<Float> {
    @Override // Oooo0oO.o000O0
    default Object getValue() {
        C21098o0000oOo c21098o0000oOo = (C21098o0000oOo) this;
        return Float.valueOf(((C21098o0000oOo.OooO00o) C21200OooOOO0.OooOo00(c21098o0000oOo.f61203OooOo, c21098o0000oOo)).f61204OooO0OO);
    }

    @Override // Oooo0oO.o00oO0O
    default void setValue(Float f) {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        float fFloatValue = f.floatValue();
        C21098o0000oOo c21098o0000oOo = (C21098o0000oOo) this;
        C21098o0000oOo.OooO00o oooO00o = (C21098o0000oOo.OooO00o) C21200OooOOO0.OooO(c21098o0000oOo.f61203OooOo);
        if (oooO00o.f61204OooO0OO == fFloatValue) {
            return;
        }
        C21098o0000oOo.OooO00o oooO00o2 = c21098o0000oOo.f61203OooOo;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
            ((C21098o0000oOo.OooO00o) C21200OooOOO0.OooOOOO(oooO00o2, c21098o0000oOo, abstractC21194OooO0oOOooOO0O, oooO00o)).f61204OooO0OO = fFloatValue;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21098o0000oOo);
    }
}
