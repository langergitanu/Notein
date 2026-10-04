package o000OoOo;

import android.content.Context;
import android.view.MotionEvent;
import o000Oo.InterfaceC24508OooO00o;
import o000OoOO.C24538OooO0O0;

/* JADX INFO: renamed from: o000OoOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24542OooO0OO implements InterfaceC24508OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24543OooO0Oo f83020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24538OooO0O0 f83021OooO0O0;

    public C24542OooO0OO(Context context, int i) {
        this.f83021OooO0O0 = new C24538OooO0O0(context);
        this.f83020OooO00o = new C24543OooO0Oo(i);
    }

    @Override // o000Oo.InterfaceC24508OooO00o
    public final void OooO00o(MotionEvent motionEvent) {
        C24538OooO0O0 c24538OooO0O0 = this.f83021OooO0O0;
        c24538OooO0O0.getClass();
        c24538OooO0O0.f82996OooO00o = motionEvent.getEventTime();
        this.f83020OooO00o.OooO00o(motionEvent);
    }

    @Override // o000Oo.InterfaceC24508OooO00o
    public final MotionEvent OooO0O0() {
        return this.f83020OooO00o.OooO0O0(this.f83021OooO0O0.OooO00o());
    }
}
