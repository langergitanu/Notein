package o0Ooo0;

import android.view.MotionEvent;
import android.view.View;
import o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO;

/* JADX INFO: renamed from: o0Ooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29319OooO0O0 extends AbstractViewOnTouchListenerC29320OooO0OO {

    /* JADX INFO: renamed from: o0Ooo0.OooO0O0$OooO00o */
    public static class OooO00o extends AbstractViewOnTouchListenerC29320OooO0OO.OooO00o {
        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.OooO00o
        public final void OooO00o(View view) {
            this.f103982OooO0O0 = view.getTranslationX();
            this.f103983OooO0OO = view.getWidth();
        }
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19980OooO0O0 extends AbstractViewOnTouchListenerC29320OooO0OO.AbstractC29321OooO0o0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f103970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f103971OooO0o0;

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.AbstractC29321OooO0o0
        public final boolean OooO00o(View view, MotionEvent motionEvent) {
            if (motionEvent.getHistorySize() == 0) {
                this.f103970OooO0Oo = motionEvent.getRawX();
                this.f103971OooO0o0 = motionEvent.getRawY();
                return false;
            }
            float rawX = motionEvent.getRawX() - this.f103970OooO0Oo;
            float rawY = motionEvent.getRawY() - this.f103971OooO0o0;
            this.f103970OooO0Oo = motionEvent.getRawX();
            this.f103971OooO0o0 = motionEvent.getRawY();
            if (Math.abs(rawX) < Math.abs(rawY)) {
                return false;
            }
            this.f103994OooO00o = view.getTranslationX();
            this.f103995OooO0O0 = rawX;
            this.f103996OooO0OO = rawX > 0.0f;
            return true;
        }
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final AbstractViewOnTouchListenerC29320OooO0OO.OooO00o OooO00o() {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f103981OooO00o = View.TRANSLATION_X;
        return oooO00o;
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final AbstractViewOnTouchListenerC29320OooO0OO.AbstractC29321OooO0o0 OooO0O0() {
        C19980OooO0O0 c19980OooO0O0 = new C19980OooO0O0();
        c19980OooO0O0.f103970OooO0Oo = 0.0f;
        c19980OooO0O0.f103971OooO0o0 = 0.0f;
        return c19980OooO0O0;
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final void OooO0OO(View view, float f) {
        view.setTranslationX(f);
    }

    @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO
    public final void OooO0Oo(View view, float f, MotionEvent motionEvent) {
        view.setTranslationX(f);
        motionEvent.offsetLocation(f - motionEvent.getX(0), 0.0f);
    }
}
