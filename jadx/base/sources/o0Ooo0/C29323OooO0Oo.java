package o0Ooo0;

import android.view.MotionEvent;
import android.view.View;
import o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO;

/* JADX INFO: renamed from: o0Ooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29323OooO0Oo extends AbstractViewOnTouchListenerC29320OooO0OO {

    /* JADX INFO: renamed from: o0Ooo0.OooO0Oo$OooO00o */
    public static class OooO00o extends AbstractViewOnTouchListenerC29320OooO0OO.OooO00o {
        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.OooO00o
        public final void OooO00o(View view) {
            this.f103982OooO0O0 = view.getTranslationY();
            this.f103983OooO0OO = view.getHeight();
        }
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0Oo$OooO0O0 */
    public static class OooO0O0 extends AbstractViewOnTouchListenerC29320OooO0OO.AbstractC29321OooO0o0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f104002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f104003OooO0o0;

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.AbstractC29321OooO0o0
        public final boolean OooO00o(View view, MotionEvent motionEvent) {
            if (motionEvent.getHistorySize() == 0) {
                this.f104002OooO0Oo = motionEvent.getRawX();
                this.f104003OooO0o0 = motionEvent.getRawY();
                return false;
            }
            float rawX = motionEvent.getRawX() - this.f104002OooO0Oo;
            float rawY = motionEvent.getRawY() - this.f104003OooO0o0;
            this.f104002OooO0Oo = motionEvent.getRawX();
            this.f104003OooO0o0 = motionEvent.getRawY();
            if (Math.abs(rawX) > Math.abs(rawY)) {
                return false;
            }
            this.f103994OooO00o = view.getTranslationY();
            this.f103995OooO0O0 = rawY;
            this.f103996OooO0OO = rawY > 0.0f;
            return true;
        }
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final AbstractViewOnTouchListenerC29320OooO0OO.OooO00o OooO00o() {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f103981OooO00o = View.TRANSLATION_Y;
        return oooO00o;
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final AbstractViewOnTouchListenerC29320OooO0OO.AbstractC29321OooO0o0 OooO0O0() {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f104002OooO0Oo = 0.0f;
        oooO0O0.f104003OooO0o0 = 0.0f;
        return oooO0O0;
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final void OooO0OO(View view, float f) {
        view.setTranslationY(f);
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final void OooO0Oo(View view, float f, MotionEvent motionEvent) {
        view.setTranslationY(f);
        motionEvent.offsetLocation(f - motionEvent.getY(0), 0.0f);
    }
}
