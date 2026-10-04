package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC21513OooOOo;

/* JADX INFO: renamed from: androidx.appcompat.widget.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC21553Oooo00O implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f63040OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f63041OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final View f63042OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f63043OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO00o f63044OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f63045OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO0O0 f63046OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f63047OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int[] f63048OooOooo = new int[2];

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo00O$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractViewOnTouchListenerC21553Oooo00O.this.f63042OooOoO.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo00O$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC21553Oooo00O abstractViewOnTouchListenerC21553Oooo00O = AbstractViewOnTouchListenerC21553Oooo00O.this;
            abstractViewOnTouchListenerC21553Oooo00O.OooO00o();
            View view = abstractViewOnTouchListenerC21553Oooo00O.f63042OooOoO;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC21553Oooo00O.OooO0OO()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC21553Oooo00O.f63045OooOoo = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC21553Oooo00O(View view) {
        this.f63042OooOoO = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f63041OooOo0o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f63040OooOo = tapTimeout;
        this.f63043OooOoO0 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void OooO00o() {
        OooO0O0 oooO0O0 = this.f63046OooOoo0;
        View view = this.f63042OooOoO;
        if (oooO0O0 != null) {
            view.removeCallbacks(oooO0O0);
        }
        OooO00o oooO00o = this.f63044OooOoOO;
        if (oooO00o != null) {
            view.removeCallbacks(oooO00o);
        }
    }

    public abstract InterfaceC21513OooOOo OooO0O0();

    public abstract boolean OooO0OO();

    public boolean OooO0Oo() {
        InterfaceC21513OooOOo interfaceC21513OooOOoOooO0O0 = OooO0O0();
        if (interfaceC21513OooOOoOooO0O0 == null || !interfaceC21513OooOOoOooO0O0.OooO00o()) {
            return true;
        }
        interfaceC21513OooOOoOooO0O0.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C21546OooOooo c21546OooOoooOooO0o;
        boolean z2 = this.f63045OooOoo;
        View view2 = this.f63042OooOoO;
        if (z2) {
            InterfaceC21513OooOOo interfaceC21513OooOOoOooO0O0 = OooO0O0();
            if (interfaceC21513OooOOoOooO0O0 == null || !interfaceC21513OooOOoOooO0O0.OooO00o() || (c21546OooOoooOooO0o = interfaceC21513OooOOoOooO0O0.OooO0o()) == null || !c21546OooOoooOooO0o.isShown()) {
                z = !OooO0Oo();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f63048OooOooo;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c21546OooOoooOooO0o.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zOooO0O0 = c21546OooOoooOooO0o.OooO0O0(motionEventObtainNoHistory, this.f63047OooOooO);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zOooO0O0 || !z3) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f63047OooOooO = motionEvent.getPointerId(0);
                if (this.f63044OooOoOO == null) {
                    this.f63044OooOoOO = new OooO00o();
                }
                view2.postDelayed(this.f63044OooOoOO, this.f63040OooOo);
                if (this.f63046OooOoo0 == null) {
                    this.f63046OooOoo0 = new OooO0O0();
                }
                view2.postDelayed(this.f63046OooOoo0, this.f63043OooOoO0);
            } else if (actionMasked2 == 1) {
                OooO00o();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f63047OooOooO);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.f63041OooOo0o;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                        OooO00o();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (OooO0OO()) {
                            z = true;
                        }
                        if (z) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z = false;
            if (z) {
            }
        } else {
            z = false;
            if (z) {
            }
        }
        this.f63045OooOoo = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f63045OooOoo = false;
        this.f63047OooOooO = -1;
        OooO00o oooO00o = this.f63044OooOoOO;
        if (oooO00o != null) {
            this.f63042OooOoO.removeCallbacks(oooO00o);
        }
    }
}
