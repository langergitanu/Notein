package o000O00O;

import android.hardware.HardwareBuffer;
import android.view.SurfaceView;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<o000OO0O.OooO0OO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000O00.OooO00o f82320OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0<Object> f82321OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ HardwareBuffer f82322OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOO0<Object> oooOOO0, o000O00.OooO00o oooO00o, HardwareBuffer hardwareBuffer) {
        super(1);
        this.f82321OooOo0o = oooOOO0;
        this.f82320OooOo = oooO00o;
        this.f82322OooOoO0 = hardwareBuffer;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(o000OO0O.OooO0OO oooO0OO) {
        o000OO0O.OooO0OO releaseFence = oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(releaseFence, "releaseFence");
        final OooOOO0<Object> oooOOO0 = this.f82321OooOo0o;
        oooOOO0.f82338OooOO0o.set(true);
        if (oooOOO0.f82341OooOOOO.updateAndGet(new OooO()) != 0) {
            SurfaceView surfaceView = oooOOO0.f82329OooO0O0;
            if (surfaceView != null) {
                surfaceView.post(new Runnable() { // from class: o000O00O.OooOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOO0 this$0 = oooOOO0;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                        this$0.OooO00o(null);
                    }
                });
            }
        } else {
            oooOOO0.OooO0O0();
        }
        o000O00.OooO00o oooO00o = this.f82320OooOo;
        oooO00o.getClass();
        oooO00o.f82169OooOo0o.Oooooo0(this.f82322OooOoO0, releaseFence);
        return C32460OooOooO.f116667OooO00o;
    }
}
