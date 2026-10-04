package o00Oo0oO;

import OooooO0.C21289OooO0o;
import android.content.Context;
import o00OOOOo.OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o0o0Oo.C30597OooO00o;
import o0o0Oo.C30599OooO0OO;

/* JADX INFO: renamed from: o00Oo0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25049OooO00o {
    public static C30597OooO00o OooO00o() {
        long jOooO00o;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C30599OooO0OO c30599OooO0OO = new C30599OooO0OO(C25048OooO0O0.OooO0O0().OooO00o());
            Context context = (Context) C25048OooO0O0.OooO0O0().f85047OooO00o;
            synchronized (OooO00o.OooO0OO.class) {
                jOooO00o = OooO00o.C25010OooO0Oo.OooO00o(context, "alipay_cashier_ap_seq_v");
            }
            return C30597OooO00o.OooO00o("NP", jCurrentTimeMillis, c30599OooO0OO, (short) jOooO00o, new C21289OooO0o());
        } catch (Exception unused) {
            try {
                return C30597OooO00o.OooO00o("EX", 0L, new C30599OooO0OO(""), (short) 0, new C21289OooO0o());
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}
