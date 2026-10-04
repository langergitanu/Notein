package o00ooo0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.github.chrisbanes.photoview.PhotoView;
import o00ooo0.ViewOnTouchListenerC25806OooOO0;
import o00ooo0.ViewOnTouchListenerC25806OooOO0.RunnableC25807OooO0Oo;

/* JADX INFO: renamed from: o00ooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25799OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f87975OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f87976OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f87977OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScaleGestureDetector f87978OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public VelocityTracker f87979OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f87980OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f87981OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f87982OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f87983OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ViewOnTouchListenerC25806OooOO0.OooO00o f87984OooOO0;

    public C25799OooO0O0(Context context, ViewOnTouchListenerC25806OooOO0.OooO00o oooO00o) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f87975OooO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f87983OooO0oo = viewConfiguration.getScaledTouchSlop();
        this.f87984OooOO0 = oooO00o;
        this.f87978OooO0OO = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC25798OooO00o(this));
    }

    public final void OooO00o(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        RectF rectF;
        int iRound;
        int i;
        int iRound2;
        int i2;
        float x3;
        float y3;
        int i3;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            ViewOnTouchListenerC25806OooOO0.OooO00o oooO00o = this.f87984OooOO0;
            if (action == 1) {
                this.f87976OooO00o = -1;
                if (this.f87981OooO0o0 && this.f87979OooO0Oo != null) {
                    try {
                        x2 = motionEvent.getX(this.f87977OooO0O0);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f87980OooO0o = x2;
                    try {
                        y2 = motionEvent.getY(this.f87977OooO0O0);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.f87982OooO0oO = y2;
                    this.f87979OooO0Oo.addMovement(motionEvent);
                    this.f87979OooO0Oo.computeCurrentVelocity(1000);
                    float xVelocity = this.f87979OooO0Oo.getXVelocity();
                    float yVelocity = this.f87979OooO0Oo.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f87975OooO) {
                        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = ViewOnTouchListenerC25806OooOO0.this;
                        ViewOnTouchListenerC25806OooOO0.RunnableC25807OooO0Oo runnableC25807OooO0Oo = viewOnTouchListenerC25806OooOO0.new RunnableC25807OooO0Oo(viewOnTouchListenerC25806OooOO0.f87992OooOooO.getContext());
                        viewOnTouchListenerC25806OooOO0.f88003Oooo0oO = runnableC25807OooO0Oo;
                        PhotoView photoView = viewOnTouchListenerC25806OooOO0.f87992OooOooO;
                        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
                        int height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
                        int i4 = (int) (-xVelocity);
                        int i5 = (int) (-yVelocity);
                        viewOnTouchListenerC25806OooOO0.OooO0O0();
                        Matrix matrixOooO0OO = viewOnTouchListenerC25806OooOO0.OooO0OO();
                        if (viewOnTouchListenerC25806OooOO0.f87992OooOooO.getDrawable() != null) {
                            rectF = viewOnTouchListenerC25806OooOO0.f87999Oooo0O0;
                            rectF.set(0.0f, 0.0f, r12.getIntrinsicWidth(), r12.getIntrinsicHeight());
                            matrixOooO0OO.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int iRound3 = Math.round(-rectF.left);
                            float f = width;
                            if (f < rectF.width()) {
                                iRound = Math.round(rectF.width() - f);
                                i = 0;
                            } else {
                                iRound = iRound3;
                                i = iRound;
                            }
                            int iRound4 = Math.round(-rectF.top);
                            float f2 = height;
                            if (f2 < rectF.height()) {
                                iRound2 = Math.round(rectF.height() - f2);
                                i2 = 0;
                            } else {
                                iRound2 = iRound4;
                                i2 = iRound2;
                            }
                            runnableC25807OooO0Oo.f88016OooOo = iRound3;
                            runnableC25807OooO0Oo.f88019OooOoO0 = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                runnableC25807OooO0Oo.f88017OooOo0o.fling(iRound3, iRound4, i4, i5, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        photoView.post(viewOnTouchListenerC25806OooOO0.f88003Oooo0oO);
                    }
                }
                VelocityTracker velocityTracker = this.f87979OooO0Oo;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f87979OooO0Oo = null;
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.f87977OooO0O0);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.f87977OooO0O0);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f87980OooO0o;
                float f4 = y3 - this.f87982OooO0oO;
                if (!this.f87981OooO0o0) {
                    this.f87981OooO0o0 = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.f87983OooO0oo);
                }
                if (this.f87981OooO0o0) {
                    ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO02 = ViewOnTouchListenerC25806OooOO0.this;
                    if (!viewOnTouchListenerC25806OooOO02.f87996Oooo000.f87978OooO0OO.isInProgress()) {
                        viewOnTouchListenerC25806OooOO02.f87995Oooo0.postTranslate(f3, f4);
                        viewOnTouchListenerC25806OooOO02.OooO00o();
                        ViewParent parent = viewOnTouchListenerC25806OooOO02.f87992OooOooO.getParent();
                        if (viewOnTouchListenerC25806OooOO02.f87991OooOoo0 && !viewOnTouchListenerC25806OooOO02.f87996Oooo000.f87978OooO0OO.isInProgress() && !viewOnTouchListenerC25806OooOO02.f87990OooOoo) {
                            int i6 = viewOnTouchListenerC25806OooOO02.f88004Oooo0oo;
                            if ((i6 == 2 || ((i6 == 0 && f3 >= 1.0f) || ((i6 == 1 && f3 <= -1.0f) || (((i3 = viewOnTouchListenerC25806OooOO02.f87994Oooo) == 0 && f4 >= 1.0f) || (i3 == 1 && f4 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f87980OooO0o = x3;
                    this.f87982OooO0oO = y3;
                    VelocityTracker velocityTracker2 = this.f87979OooO0Oo;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f87976OooO00o = -1;
                VelocityTracker velocityTracker3 = this.f87979OooO0Oo;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f87979OooO0Oo = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f87976OooO00o) {
                    int i7 = action2 != 0 ? 0 : 1;
                    this.f87976OooO00o = motionEvent.getPointerId(i7);
                    this.f87980OooO0o = motionEvent.getX(i7);
                    this.f87982OooO0oO = motionEvent.getY(i7);
                }
            }
        } else {
            this.f87976OooO00o = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f87979OooO0Oo = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.f87977OooO0O0);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f87980OooO0o = x;
            try {
                y = motionEvent.getY(this.f87977OooO0O0);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.f87982OooO0oO = y;
            this.f87981OooO0o0 = false;
        }
        int i8 = this.f87976OooO00o;
        this.f87977OooO0O0 = motionEvent.findPointerIndex(i8 != -1 ? i8 : 0);
    }
}
