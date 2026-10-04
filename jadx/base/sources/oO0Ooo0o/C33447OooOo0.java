package oO0Ooo0o;

import OooooO0.C21289OooO0o;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import oO00O0oO.OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;

/* JADX INFO: renamed from: oO0Ooo0o.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33447OooOo0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(oO00O0oO.OooO0OO oooO0OO, io.ktor.utils.p616io.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33446OooOOoo c33446OooOOoo;
        InterfaceC23990Oooooo interfaceC23990Oooooo;
        if (abstractC32479OooO0OO instanceof C33446OooOOoo) {
            c33446OooOOoo = (C33446OooOOoo) abstractC32479OooO0OO;
            int i = c33446OooOOoo.f120901OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33446OooOOoo.f120901OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33446OooOOoo = new C33446OooOOoo(abstractC32479OooO0OO);
            }
        }
        Object obj = c33446OooOOoo.f120902OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33446OooOOoo.f120901OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!(oooO0OO instanceof OooO0OO.OooO00o)) {
                if (oooO0OO instanceof OooO0OO.AbstractC20204OooO0OO) {
                    io.ktor.utils.p616io.OooO00o OooO00o2 = Ooooo00.OooOOO.OooO00o();
                    C21289OooO0o.OooO0OO(((OooO0OO.AbstractC20204OooO0OO) oooO0OO).OooO0o0(), oooO00o, OooO00o2);
                    return new C33433OooO0o(oooO0OO, OooO00o2);
                }
                if (!(oooO0OO instanceof OooO0OO.OooO0Oo)) {
                    C23992OoooooO.OooO0O0(oooO00o);
                    return oooO0OO;
                }
                io.ktor.utils.p616io.OooO00o OooO00o3 = Ooooo00.OooOOO.OooO00o();
                C21289OooO0o.OooO0OO(C24005o00o0O.OooO0Oo(C33662Ooooooo.f121350OooOo0o, C33649OoooOOo.f121328OooO00o, new C33448OooOo00((OooO0OO.OooO0Oo) oooO0OO, null), 2).f80790OooOo, oooO00o, OooO00o3);
                return new C33433OooO0o(oooO0OO, OooO00o3);
            }
            byte[] bArrOooO0o0 = ((OooO0OO.OooO00o) oooO0OO).OooO0o0();
            c33446OooOOoo.f120900OooOo0o = (OooO0OO.OooO00o) oooO0OO;
            c33446OooOOoo.f120899OooOo = oooO00o;
            c33446OooOOoo.f120901OooOoO = 1;
            Object objOooO0o = C23992OoooooO.OooO0o(oooO00o, bArrOooO0o0, c33446OooOOoo);
            interfaceC23990Oooooo = oooO00o;
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC23990Oooooo interfaceC23990Oooooo2 = c33446OooOOoo.f120899OooOo;
            oooO0OO = c33446OooOOoo.f120900OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC23990Oooooo = interfaceC23990Oooooo2;
        }
        C23992OoooooO.OooO0O0(interfaceC23990Oooooo);
        return oooO0OO;
    }
}
