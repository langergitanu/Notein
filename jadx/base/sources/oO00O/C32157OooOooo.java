package oO00O;

import o00OooO.C25139OooOOOo;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0.C32269OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO00O.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32157OooOooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<oO00Oo0.OooO0OO, C32460OooOooO> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(oO00Oo0.OooO0OO oooO0OO) throws C32269OooO0oo {
        oO00Oo0.OooO0OO sendHandshakeRecord = oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sendHandshakeRecord, "$this$sendHandshakeRecord");
        oO00Oo0.OooO0OO oooO0OO2 = new oO00Oo0.OooO0OO(null);
        try {
            C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO2.ooOO();
            int iOooo0 = (int) c32266OooO0OoOoOO.Oooo0();
            sendHandshakeRecord.o00000oO((byte) ((iOooo0 >>> 16) & 255));
            C25139OooOOOo.OooO0o0(sendHandshakeRecord, (short) (iOooo0 & 65535));
            sendHandshakeRecord.o0000oO(c32266OooO0OoOoOO);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            oooO0OO2.close();
            throw th;
        }
    }
}
