package o0O0o0OO;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.concurrent.CancellationException;
import o00o0o0o.C25446OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.o00000OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26006OooO0Oo implements InterfaceC26008OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f88821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f88822OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000OO f88823OooO0OO;

    public C26006OooO0Oo(C25446OooO0Oo c25446OooO0Oo, Context context) {
        this.f88821OooO00o = context;
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public final boolean OooO00o() {
        o00000OO o00000oo2 = this.f88823OooO0OO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        boolean z = !this.f88822OooO0O0;
        C34406OooO00o.f123390OooO00o.OooO00o(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("shouldTakeDoubleTapEvent: ", z), new Object[0]);
        this.f88822OooO0O0 = false;
        return z;
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public final void OooO0O0(MotionEvent motionEvent) {
        Activity activity;
        Context baseContext = this.f88821OooO00o;
        DisplayMetrics displayMetrics = baseContext.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        while (!(baseContext instanceof Activity)) {
            ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
            if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
                activity = null;
                break;
            }
        }
        activity = (Activity) baseContext;
        if (activity == null || !activity.isInMultiWindowMode()) {
            float f = rawX / i;
            float f2 = rawY / i2;
            if (motionEvent.getAction() == 0) {
                boolean z = f < 0.1f || f > 0.9f || f2 < 0.1f || f2 > 0.9f;
                if (!this.f88822OooO0O0) {
                    this.f88822OooO0O0 = z;
                }
            }
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f88822OooO0O0) {
                o00000OO o00000oo2 = this.f88823OooO0OO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                this.f88823OooO0OO = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C26005OooO0OO(this, null), 3);
            }
        }
    }
}
