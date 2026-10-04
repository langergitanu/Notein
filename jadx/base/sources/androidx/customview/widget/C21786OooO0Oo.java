package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.customview.widget.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21786OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f64378OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int[] f64379OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f64380OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f64381OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[] f64383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float[] f64384OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f64385OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f64386OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int[] f64387OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int[] f64388OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f64389OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public VelocityTracker f64390OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f64391OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f64392OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f64393OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f64394OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final OverScroller f64395OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f64396OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO0OO f64397OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f64398OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public View f64399OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final ViewGroup f64400OooOo0O;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f64382OooO0OO = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f64401OooOo0o = new OooO0O0();

    /* JADX INFO: renamed from: androidx.customview.widget.OooO0Oo$OooO00o */
    public class OooO00o implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.OooO0Oo$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21786OooO0Oo.this.OooOOoo(0);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.OooO0Oo$OooO0OO */
    public static abstract class OooO0OO {
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(View view, int i);
    }

    public C21786OooO0Oo(Context context, ViewGroup viewGroup, OooO0OO oooO0OO) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (oooO0OO == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f64400OooOo0O = viewGroup;
        this.f64397OooOOoo = oooO0OO;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f64394OooOOOo = i;
        this.f64393OooOOOO = i;
        this.f64381OooO0O0 = viewConfiguration.getScaledTouchSlop();
        this.f64392OooOOO0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f64391OooOOO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f64395OooOOo = new OverScroller(context, f64378OooOo);
    }

    public static C21786OooO0Oo OooO(ViewGroup viewGroup, float f, OooO0OO oooO0OO) {
        C21786OooO0Oo c21786OooO0Oo = new C21786OooO0Oo(viewGroup.getContext(), viewGroup, oooO0OO);
        c21786OooO0Oo.f64381OooO0O0 = (int) ((1.0f / f) * c21786OooO0Oo.f64381OooO0O0);
        return c21786OooO0Oo;
    }

    public static boolean OooOOO0(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void OooO00o() {
        OooO0O0();
        if (this.f64380OooO00o == 2) {
            OverScroller overScroller = this.f64395OooOOo;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f64397OooOOoo.onViewPositionChanged(this.f64399OooOo00, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        OooOOoo(0);
    }

    public final void OooO0O0() {
        this.f64382OooO0OO = -1;
        float[] fArr = this.f64383OooO0Oo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f64385OooO0o0, 0.0f);
            Arrays.fill(this.f64384OooO0o, 0.0f);
            Arrays.fill(this.f64386OooO0oO, 0.0f);
            Arrays.fill(this.f64387OooO0oo, 0);
            Arrays.fill(this.f64379OooO, 0);
            Arrays.fill(this.f64388OooOO0, 0);
            this.f64389OooOO0O = 0;
        }
        VelocityTracker velocityTracker = this.f64390OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f64390OooOO0o = null;
        }
    }

    public final void OooO0OO(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f64400OooOo0O;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f64399OooOo00 = view;
        this.f64382OooO0OO = i;
        this.f64397OooOOoo.onViewCaptured(view, i);
        OooOOoo(1);
    }

    public final boolean OooO0Oo(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f64387OooO0oo[i] & i2) == i2 && (this.f64396OooOOo0 & i2) != 0 && (this.f64388OooOO0[i] & i2) != i2 && (this.f64379OooO[i] & i2) != i2) {
            float f3 = this.f64381OooO0O0;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f && this.f64397OooOOoo.onEdgeLock(i2)) {
                    int[] iArr = this.f64388OooOO0;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f64379OooO[i] & i2) == 0 && fAbs > this.f64381OooO0O0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooO0o(int i) {
        float[] fArr = this.f64383OooO0Oo;
        if (fArr != null) {
            int i2 = this.f64389OooOO0O;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f64385OooO0o0[i] = 0.0f;
                this.f64384OooO0o[i] = 0.0f;
                this.f64386OooO0oO[i] = 0.0f;
                this.f64387OooO0oo[i] = 0;
                this.f64379OooO[i] = 0;
                this.f64388OooOO0[i] = 0;
                this.f64389OooOO0O = (~i3) & i2;
            }
        }
    }

    public final boolean OooO0o0(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        OooO0OO oooO0OO = this.f64397OooOOoo;
        boolean z = oooO0OO.getViewHorizontalDragRange(view) > 0;
        boolean z2 = oooO0OO.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f64381OooO0O0) : z2 && Math.abs(f2) > ((float) this.f64381OooO0O0);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f64381OooO0O0;
        return f3 > ((float) (i * i));
    }

    public final int OooO0oO(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f64400OooOo0O.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean OooO0oo() {
        if (this.f64380OooO00o == 2) {
            OverScroller overScroller = this.f64395OooOOo;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f64399OooOo00.getLeft();
            int top = currY - this.f64399OooOo00.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f64399OooOo00, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.f64399OooOo00, top);
            }
            if (left != 0 || top != 0) {
                this.f64397OooOOoo.onViewPositionChanged(this.f64399OooOo00, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f64400OooOo0O.post(this.f64401OooOo0o);
            }
        }
        return this.f64380OooO00o == 2;
    }

    public final View OooOO0(int i, int i2) {
        ViewGroup viewGroup = this.f64400OooOo0O;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f64397OooOOoo.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean OooOO0O(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f64399OooOo00.getLeft();
        int top = this.f64399OooOo00.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f64395OooOOo;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            OooOOoo(0);
            return false;
        }
        View view = this.f64399OooOo00;
        int i7 = (int) this.f64391OooOOO;
        int i8 = (int) this.f64392OooOOO0;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f64391OooOOO;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        OooO0OO oooO0OO = this.f64397OooOOoo;
        overScroller.startScroll(left, top, i5, i6, (int) ((OooO0oO(i6, i4, oooO0OO.getViewVerticalDragRange(view)) * f6) + (OooO0oO(i5, i3, oooO0OO.getViewHorizontalDragRange(view)) * f5)));
        OooOOoo(2);
        return true;
    }

    public final boolean OooOO0o(int i) {
        if ((this.f64389OooOO0O & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void OooOOO(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO0O0();
        }
        if (this.f64390OooOO0o == null) {
            this.f64390OooOO0o = VelocityTracker.obtain();
        }
        this.f64390OooOO0o.addMovement(motionEvent);
        int i2 = 0;
        OooO0OO oooO0OO = this.f64397OooOOoo;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewOooOO0 = OooOO0((int) x, (int) y);
            OooOOo0(x, y, pointerId);
            OooOo0o(pointerId, viewOooOO0);
            int i3 = this.f64387OooO0oo[pointerId] & this.f64396OooOOo0;
            if (i3 != 0) {
                oooO0OO.onEdgeTouched(i3, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f64380OooO00o == 1) {
                OooOOOO();
            }
            OooO0O0();
            return;
        }
        if (actionMasked == 2) {
            if (this.f64380OooO00o != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (OooOO0o(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x2 - this.f64383OooO0Oo[pointerId2];
                        float f2 = y2 - this.f64385OooO0o0[pointerId2];
                        OooOOOo(f, f2, pointerId2);
                        if (this.f64380OooO00o != 1) {
                            View viewOooOO02 = OooOO0((int) x2, (int) y2);
                            if (OooO0o0(viewOooOO02, f, f2) && OooOo0o(pointerId2, viewOooOO02)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                OooOOo(motionEvent);
                return;
            }
            if (OooOO0o(this.f64382OooO0OO)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f64382OooO0OO);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f64384OooO0o;
                int i4 = this.f64382OooO0OO;
                int i5 = (int) (x3 - fArr[i4]);
                int i6 = (int) (y3 - this.f64386OooO0oO[i4]);
                int left = this.f64399OooOo00.getLeft() + i5;
                int top = this.f64399OooOo00.getTop() + i6;
                int left2 = this.f64399OooOo00.getLeft();
                int top2 = this.f64399OooOo00.getTop();
                if (i5 != 0) {
                    left = oooO0OO.clampViewPositionHorizontal(this.f64399OooOo00, left, i5);
                    ViewCompat.offsetLeftAndRight(this.f64399OooOo00, left - left2);
                }
                int i7 = left;
                if (i6 != 0) {
                    top = oooO0OO.clampViewPositionVertical(this.f64399OooOo00, top, i6);
                    ViewCompat.offsetTopAndBottom(this.f64399OooOo00, top - top2);
                }
                int i8 = top;
                if (i5 != 0 || i6 != 0) {
                    this.f64397OooOOoo.onViewPositionChanged(this.f64399OooOo00, i7, i8, i7 - left2, i8 - top2);
                }
                OooOOo(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f64380OooO00o == 1) {
                this.f64398OooOo0 = true;
                oooO0OO.onViewReleased(this.f64399OooOo00, 0.0f, 0.0f);
                this.f64398OooOo0 = false;
                if (this.f64380OooO00o == 1) {
                    OooOOoo(0);
                }
            }
            OooO0O0();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            OooOOo0(x4, y4, pointerId3);
            if (this.f64380OooO00o != 0) {
                if (OooOOO0(this.f64399OooOo00, (int) x4, (int) y4)) {
                    OooOo0o(pointerId3, this.f64399OooOo00);
                    return;
                }
                return;
            }
            OooOo0o(pointerId3, OooOO0((int) x4, (int) y4));
            int i9 = this.f64387OooO0oo[pointerId3] & this.f64396OooOOo0;
            if (i9 != 0) {
                oooO0OO.onEdgeTouched(i9, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f64380OooO00o == 1 && pointerId4 == this.f64382OooO0OO) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f64382OooO0OO) {
                    View viewOooOO03 = OooOO0((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f64399OooOo00;
                    if (viewOooOO03 == view && OooOo0o(pointerId5, view)) {
                        i = this.f64382OooO0OO;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                OooOOOO();
            }
        }
        OooO0o(pointerId4);
    }

    public final void OooOOOO() {
        VelocityTracker velocityTracker = this.f64390OooOO0o;
        float f = this.f64392OooOOO0;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f64390OooOO0o.getXVelocity(this.f64382OooO0OO);
        float f2 = this.f64391OooOOO;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f64390OooOO0o.getYVelocity(this.f64382OooO0OO);
        float f3 = this.f64391OooOOO;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f64398OooOo0 = true;
        this.f64397OooOOoo.onViewReleased(this.f64399OooOo00, xVelocity, f);
        this.f64398OooOo0 = false;
        if (this.f64380OooO00o == 1) {
            OooOOoo(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.OooO0Oo$OooO0OO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOOOo(float f, float f2, int i) {
        boolean zOooO0Oo = OooO0Oo(f, f2, i, 1);
        ?? r0 = zOooO0Oo;
        if (OooO0Oo(f2, f, i, 4)) {
            r0 = (zOooO0Oo ? 1 : 0) | 4;
        }
        ?? r02 = r0;
        if (OooO0Oo(f, f2, i, 2)) {
            r02 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r03 = r02;
        if (OooO0Oo(f2, f, i, 8)) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.f64379OooO;
            iArr[i] = iArr[i] | r03;
            this.f64397OooOOoo.onEdgeDragStarted(r03, i);
        }
    }

    public final void OooOOo(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (OooOO0o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f64384OooO0o[pointerId] = x;
                this.f64386OooO0oO[pointerId] = y;
            }
        }
    }

    public final void OooOOo0(float f, float f2, int i) {
        float[] fArr = this.f64383OooO0Oo;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f64385OooO0o0;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f64384OooO0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f64386OooO0oO;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f64387OooO0oo;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f64379OooO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f64388OooOO0;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f64383OooO0Oo = fArr2;
            this.f64385OooO0o0 = fArr3;
            this.f64384OooO0o = fArr4;
            this.f64386OooO0oO = fArr5;
            this.f64387OooO0oo = iArr;
            this.f64379OooO = iArr2;
            this.f64388OooOO0 = iArr3;
        }
        float[] fArr9 = this.f64383OooO0Oo;
        this.f64384OooO0o[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f64385OooO0o0;
        this.f64386OooO0oO[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f64387OooO0oo;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f64400OooOo0O;
        int i5 = i3 < viewGroup.getLeft() + this.f64393OooOOOO ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f64393OooOOOO) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f64393OooOOOO) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f64393OooOOOO) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f64389OooOO0O |= 1 << i;
    }

    public final void OooOOoo(int i) {
        this.f64400OooOo0O.removeCallbacks(this.f64401OooOo0o);
        if (this.f64380OooO00o != i) {
            this.f64380OooO00o = i;
            this.f64397OooOOoo.onViewDragStateChanged(i);
            if (this.f64380OooO00o == 0) {
                this.f64399OooOo00 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOo0(MotionEvent motionEvent) {
        View viewOooOO0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO0O0();
        }
        if (this.f64390OooOO0o == null) {
            this.f64390OooOO0o = VelocityTracker.obtain();
        }
        this.f64390OooOO0o.addMovement(motionEvent);
        OooO0OO oooO0OO = this.f64397OooOOoo;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            OooOOo0(x, y, pointerId);
            View viewOooOO02 = OooOO0((int) x, (int) y);
            if (viewOooOO02 == this.f64399OooOo00 && this.f64380OooO00o == 2) {
                OooOo0o(pointerId, viewOooOO02);
            }
            int i = this.f64387OooO0oo[pointerId] & this.f64396OooOOo0;
            if (i != 0) {
                oooO0OO.onEdgeTouched(i, pointerId);
            }
        } else if (actionMasked == 1) {
            OooO0O0();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    OooOOo0(x2, y2, pointerId2);
                    int i2 = this.f64380OooO00o;
                    if (i2 == 0) {
                        int i3 = this.f64387OooO0oo[pointerId2] & this.f64396OooOOo0;
                        if (i3 != 0) {
                            oooO0OO.onEdgeTouched(i3, pointerId2);
                        }
                    } else if (i2 == 2 && (viewOooOO0 = OooOO0((int) x2, (int) y2)) == this.f64399OooOo00) {
                        OooOo0o(pointerId2, viewOooOO0);
                    }
                } else if (actionMasked == 6) {
                    OooO0o(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f64383OooO0Oo != null && this.f64385OooO0o0 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (OooOO0o(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f64383OooO0Oo[pointerId3];
                    float f2 = y3 - this.f64385OooO0o0[pointerId3];
                    View viewOooOO03 = OooOO0((int) x3, (int) y3);
                    boolean z = viewOooOO03 != null && OooO0o0(viewOooOO03, f, f2);
                    if (z) {
                        int left = viewOooOO03.getLeft();
                        int i5 = (int) f;
                        int iClampViewPositionHorizontal = oooO0OO.clampViewPositionHorizontal(viewOooOO03, left + i5, i5);
                        int top = viewOooOO03.getTop();
                        int i6 = (int) f2;
                        int iClampViewPositionVertical = oooO0OO.clampViewPositionVertical(viewOooOO03, top + i6, i6);
                        int viewHorizontalDragRange = oooO0OO.getViewHorizontalDragRange(viewOooOO03);
                        int viewVerticalDragRange = oooO0OO.getViewVerticalDragRange(viewOooOO03);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        OooOOOo(f, f2, pointerId3);
                        if (this.f64380OooO00o == 1 || (z && OooOo0o(pointerId3, viewOooOO03))) {
                            break;
                        }
                    }
                }
            }
            OooOOo(motionEvent);
        }
        return this.f64380OooO00o == 1;
    }

    public final boolean OooOo00(int i, int i2) {
        if (this.f64398OooOo0) {
            return OooOO0O(i, i2, (int) this.f64390OooOO0o.getXVelocity(this.f64382OooO0OO), (int) this.f64390OooOO0o.getYVelocity(this.f64382OooO0OO));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean OooOo0O(View view, int i, int i2) {
        this.f64399OooOo00 = view;
        this.f64382OooO0OO = -1;
        boolean zOooOO0O = OooOO0O(i, i2, 0, 0);
        if (!zOooOO0O && this.f64380OooO00o == 0 && this.f64399OooOo00 != null) {
            this.f64399OooOo00 = null;
        }
        return zOooOO0O;
    }

    public final boolean OooOo0o(int i, View view) {
        if (view == this.f64399OooOo00 && this.f64382OooO0OO == i) {
            return true;
        }
        if (view == null || !this.f64397OooOOoo.tryCaptureView(view, i)) {
            return false;
        }
        this.f64382OooO0OO = i;
        OooO0OO(i, view);
        return true;
    }
}
