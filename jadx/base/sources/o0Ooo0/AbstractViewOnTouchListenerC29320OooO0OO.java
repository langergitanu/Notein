package o0Ooo0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.imagepipeline.producers.C22306Ooooooo;
import com.orion.editor.PDFView;
import o000ooo.C24746OooO00o;
import oO0oO0.InterfaceC33930OooO00o;
import oO0oO0.InterfaceC33931OooO0O0;

/* JADX INFO: renamed from: o0Ooo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractViewOnTouchListenerC29320OooO0OO implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C29318OooO00o f103972OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0Oo f103975OooOoO0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public InterfaceC19981OooO0OO f103978OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f103980OooOooo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0o f103973OooOo0o = new OooO0o();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InterfaceC33930OooO00o f103977OooOoo = new C22306Ooooooo();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public InterfaceC33931OooO0O0 f103979OooOooO = new C24746OooO00o();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0O0 f103976OooOoOO = new OooO0O0();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C29322OooO0oO f103974OooOoO = new C29322OooO0oO();

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO00o */
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Property<View, Float> f103981OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f103982OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f103983OooO0OO;

        public abstract void OooO00o(View view);
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO0O0 */
    public class OooO0O0 implements InterfaceC19981OooO0OO, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DecelerateInterpolator f103984OooO00o = new DecelerateInterpolator();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f103985OooO0O0 = -2.0f;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f103986OooO0OO = -4.0f;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f103987OooO0Oo;

        public OooO0O0() {
            this.f103987OooO0Oo = AbstractViewOnTouchListenerC29320OooO0OO.this.OooO00o();
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final int OooO00o() {
            return 3;
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final boolean OooO0O0() {
            return true;
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final boolean OooO0OO(MotionEvent motionEvent) {
            return true;
        }

        public final ObjectAnimator OooO0Oo(float f) {
            AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this;
            PDFView pDFViewOooO00o = abstractViewOnTouchListenerC29320OooO0OO.f103972OooOo.OooO00o();
            float fAbs = Math.abs(f);
            OooO00o oooO00o = this.f103987OooO0Oo;
            float f2 = (fAbs / oooO00o.f103983OooO0OO) * 800.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(pDFViewOooO00o, (Property<PDFView, Float>) oooO00o.f103981OooO00o, abstractViewOnTouchListenerC29320OooO0OO.f103973OooOo0o.f103992OooO0O0);
            objectAnimatorOfFloat.setDuration(Math.max((int) f2, 200));
            objectAnimatorOfFloat.setInterpolator(this.f103984OooO00o);
            objectAnimatorOfFloat.addUpdateListener(this);
            return objectAnimatorOfFloat;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0o0(InterfaceC19981OooO0OO interfaceC19981OooO0OO) {
            Animator animatorOooO0Oo;
            AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this;
            abstractViewOnTouchListenerC29320OooO0OO.f103977OooOoo.OooO00o(interfaceC19981OooO0OO.OooO00o(), 3);
            PDFView pDFViewOooO00o = abstractViewOnTouchListenerC29320OooO0OO.f103972OooOo.OooO00o();
            OooO00o oooO00o = this.f103987OooO0Oo;
            oooO00o.OooO00o(pDFViewOooO00o);
            float f = abstractViewOnTouchListenerC29320OooO0OO.f103980OooOooo;
            if (f != 0.0f) {
                OooO0o oooO0o = abstractViewOnTouchListenerC29320OooO0OO.f103973OooOo0o;
                if ((f >= 0.0f || !oooO0o.f103993OooO0OO) && (f <= 0.0f || oooO0o.f103993OooO0OO)) {
                    float f2 = -f;
                    float f3 = f2 / this.f103985OooO0O0;
                    float f4 = f3 >= 0.0f ? f3 : 0.0f;
                    float f5 = oooO00o.f103982OooO0O0 + ((f2 * f) / this.f103986OooO0OO);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(pDFViewOooO00o, (Property<PDFView, Float>) oooO00o.f103981OooO00o, f5);
                    objectAnimatorOfFloat.setDuration((int) f4);
                    objectAnimatorOfFloat.setInterpolator(this.f103984OooO00o);
                    objectAnimatorOfFloat.addUpdateListener(this);
                    ObjectAnimator objectAnimatorOooO0Oo = OooO0Oo(f5);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOooO0Oo);
                    animatorOooO0Oo = animatorSet;
                } else {
                    animatorOooO0Oo = OooO0Oo(oooO00o.f103982OooO0O0);
                }
            }
            animatorOooO0Oo.addListener(this);
            animatorOooO0Oo.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this;
            OooO0Oo oooO0Oo = abstractViewOnTouchListenerC29320OooO0OO.f103975OooOoO0;
            InterfaceC19981OooO0OO interfaceC19981OooO0OO = abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0;
            abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0 = oooO0Oo;
            oooO0Oo.OooO0Oo(interfaceC19981OooO0OO);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractViewOnTouchListenerC29320OooO0OO.this.f103979OooOooO.OooO00o(3, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC19981OooO0OO {
        int OooO00o();

        boolean OooO0O0();

        boolean OooO0OO(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO0Oo */
    public class OooO0Oo implements InterfaceC19981OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC29321OooO0o0 f103989OooO00o;

        public OooO0Oo() {
            this.f103989OooO00o = AbstractViewOnTouchListenerC29320OooO0OO.this.OooO0O0();
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final int OooO00o() {
            return 0;
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final boolean OooO0O0() {
            return false;
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final boolean OooO0OO(MotionEvent motionEvent) {
            AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this;
            C29318OooO00o c29318OooO00o = abstractViewOnTouchListenerC29320OooO0OO.f103972OooOo;
            boolean z = false;
            if (c29318OooO00o.f103968OooO0O0 && motionEvent.getToolType(0) != 2 && (c29318OooO00o.f103967OooO00o.getInputType() != 0 || c29318OooO00o.f103969OooO0OO ? motionEvent.getPointerCount() == 2 : motionEvent.getPointerCount() == 1)) {
                z = true;
            }
            if (z) {
                C29318OooO00o c29318OooO00o2 = abstractViewOnTouchListenerC29320OooO0OO.f103972OooOo;
                PDFView pDFViewOooO00o = c29318OooO00o2.OooO00o();
                AbstractC29321OooO0o0 abstractC29321OooO0o0 = this.f103989OooO00o;
                if (abstractC29321OooO0o0.OooO00o(pDFViewOooO00o, motionEvent)) {
                    c29318OooO00o2.getClass();
                    PDFView pDFView = c29318OooO00o2.f103967OooO00o;
                    boolean z2 = false;
                    if (!pDFView.f69186OoooO0O ? !pDFView.canScrollHorizontally(1) : !pDFView.canScrollVertically(1)) {
                        z2 = true;
                    }
                    if (z2 && !abstractC29321OooO0o0.f103996OooO0OO) {
                        OooO0o oooO0o = abstractViewOnTouchListenerC29320OooO0OO.f103973OooOo0o;
                        oooO0o.f103991OooO00o = motionEvent.getPointerId(0);
                        oooO0o.f103992OooO0O0 = abstractC29321OooO0o0.f103994OooO00o;
                        oooO0o.f103993OooO0OO = abstractC29321OooO0o0.f103996OooO0OO;
                        InterfaceC19981OooO0OO interfaceC19981OooO0OO = abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0;
                        C29322OooO0oO c29322OooO0oO = abstractViewOnTouchListenerC29320OooO0OO.f103974OooOoO;
                        abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0 = c29322OooO0oO;
                        AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO2 = AbstractViewOnTouchListenerC29320OooO0OO.this;
                        c29322OooO0oO.f104000OooO0Oo = abstractViewOnTouchListenerC29320OooO0OO2.f103973OooOo0o.f103993OooO0OO ? 1 : 2;
                        abstractViewOnTouchListenerC29320OooO0OO2.f103977OooOoo.OooO00o(interfaceC19981OooO0OO.OooO00o(), c29322OooO0oO.f104000OooO0Oo);
                        c29322OooO0oO.OooO0OO(motionEvent);
                        return true;
                    }
                }
            }
            return false;
        }

        public final void OooO0Oo(InterfaceC19981OooO0OO interfaceC19981OooO0OO) {
            AbstractViewOnTouchListenerC29320OooO0OO.this.f103977OooOoo.OooO00o(interfaceC19981OooO0OO.OooO00o(), 0);
        }
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO0o */
    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f103991OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f103992OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f103993OooO0OO;
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC29321OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f103994OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f103995OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f103996OooO0OO;

        public abstract boolean OooO00o(View view, MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: o0Ooo0.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public class C29322OooO0oO implements InterfaceC19981OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f103997OooO00o = 2.5f;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f103998OooO0O0 = 1.0f;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AbstractC29321OooO0o0 f103999OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f104000OooO0Oo;

        public C29322OooO0oO() {
            this.f103999OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this.OooO0O0();
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final int OooO00o() {
            return this.f104000OooO0Oo;
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final boolean OooO0O0() {
            AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this;
            OooO0O0 oooO0O0 = abstractViewOnTouchListenerC29320OooO0OO.f103976OooOoOO;
            InterfaceC19981OooO0OO interfaceC19981OooO0OO = abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0;
            abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0 = oooO0O0;
            oooO0O0.OooO0o0(interfaceC19981OooO0OO);
            return false;
        }

        @Override // o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO.InterfaceC19981OooO0OO
        public final boolean OooO0OO(MotionEvent motionEvent) {
            AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = AbstractViewOnTouchListenerC29320OooO0OO.this;
            if (abstractViewOnTouchListenerC29320OooO0OO.f103973OooOo0o.f103991OooO00o != motionEvent.getPointerId(0)) {
                InterfaceC19981OooO0OO interfaceC19981OooO0OO = abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0;
                OooO0O0 oooO0O0 = abstractViewOnTouchListenerC29320OooO0OO.f103976OooOoOO;
                abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0 = oooO0O0;
                oooO0O0.OooO0o0(interfaceC19981OooO0OO);
                return true;
            }
            PDFView pDFViewOooO00o = abstractViewOnTouchListenerC29320OooO0OO.f103972OooOo.OooO00o();
            AbstractC29321OooO0o0 abstractC29321OooO0o0 = this.f103999OooO0OO;
            if (!abstractC29321OooO0o0.OooO00o(pDFViewOooO00o, motionEvent)) {
                return true;
            }
            float f = abstractC29321OooO0o0.f103995OooO0O0;
            boolean z = abstractC29321OooO0o0.f103996OooO0OO;
            OooO0o oooO0o = abstractViewOnTouchListenerC29320OooO0OO.f103973OooOo0o;
            boolean z2 = oooO0o.f103993OooO0OO;
            float f2 = f / (z == z2 ? this.f103997OooO00o : this.f103998OooO0O0);
            float f3 = abstractC29321OooO0o0.f103994OooO00o + f2;
            if ((z2 && !z && f3 <= oooO0o.f103992OooO0O0) || (!z2 && z && f3 >= oooO0o.f103992OooO0O0)) {
                abstractViewOnTouchListenerC29320OooO0OO.OooO0Oo(pDFViewOooO00o, oooO0o.f103992OooO0O0, motionEvent);
                abstractViewOnTouchListenerC29320OooO0OO.f103979OooOooO.OooO00o(this.f104000OooO0Oo, 0.0f);
                InterfaceC19981OooO0OO interfaceC19981OooO0OO2 = abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0;
                OooO0Oo oooO0Oo = abstractViewOnTouchListenerC29320OooO0OO.f103975OooOoO0;
                abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0 = oooO0Oo;
                oooO0Oo.OooO0Oo(interfaceC19981OooO0OO2);
                return true;
            }
            if (pDFViewOooO00o.getParent() != null) {
                pDFViewOooO00o.getParent().requestDisallowInterceptTouchEvent(true);
            }
            long eventTime = motionEvent.getEventTime() - motionEvent.getHistoricalEventTime(0);
            if (eventTime > 0) {
                abstractViewOnTouchListenerC29320OooO0OO.f103980OooOooo = f2 / eventTime;
            }
            abstractViewOnTouchListenerC29320OooO0OO.OooO0OO(pDFViewOooO00o, f3);
            abstractViewOnTouchListenerC29320OooO0OO.f103979OooOooO.OooO00o(this.f104000OooO0Oo, f3);
            return true;
        }
    }

    public AbstractViewOnTouchListenerC29320OooO0OO(C29318OooO00o c29318OooO00o) {
        this.f103972OooOo = c29318OooO00o;
        OooO0Oo oooO0Oo = new OooO0Oo();
        this.f103975OooOoO0 = oooO0Oo;
        this.f103978OooOoo0 = oooO0Oo;
        c29318OooO00o.OooO00o().setOnTouchListener(this);
        c29318OooO00o.OooO00o().setOverScrollMode(2);
    }

    public abstract OooO00o OooO00o();

    public abstract AbstractC29321OooO0o0 OooO0O0();

    public abstract void OooO0OO(View view, float f);

    public abstract void OooO0Oo(View view, float f, MotionEvent motionEvent);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                return this.f103978OooOoo0.OooO0OO(motionEvent);
            }
            if (action != 3) {
                return false;
            }
        }
        return this.f103978OooOoo0.OooO0O0();
    }
}
