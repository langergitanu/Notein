package oO000Oo;

import oO000Oo.AbstractC31936OooO0Oo;
import oO0OO0OO.C32909OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC31936OooO0Oo.OooO00o f113947OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f113948OooOo0o;

    public OooO0OO(AbstractC31936OooO0Oo.OooO00o oooO00o, int i) {
        this.f113947OooOo = oooO00o;
        this.f113948OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC31936OooO0Oo.OooO00o oooO00o = this.f113947OooOo;
        try {
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO00o oooO00o2 = oO00o00.OooO0O0.f116246OooO00o;
                oooO00o2.getClass();
                oooO00o.f113949OooO00o.OooO00o(this.f113948OooOo0o);
                oooO00o2.getClass();
            } catch (Throwable th) {
                try {
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((C32909OooO0oo.OooO0O0) oooO00o).OooOOOO(th3);
        }
    }
}
