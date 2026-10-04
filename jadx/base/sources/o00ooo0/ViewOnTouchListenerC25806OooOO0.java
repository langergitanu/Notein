package o00ooo0;

import OooOoO.C20509OooO0oo;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.github.chrisbanes.photoview.PhotoView;

/* JADX INFO: renamed from: o00ooo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC25806OooOO0 implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final PhotoView f87992OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final GestureDetector f87993OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C25799OooO0O0 f87996Oooo000;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View.OnLongClickListener f88001Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View.OnClickListener f88002Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public RunnableC25807OooO0Oo f88003Oooo0oO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO00o f88007OoooO0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f87986OooOo0o = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f87985OooOo = 200;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f87988OooOoO0 = 1.0f;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f87987OooOoO = 1.75f;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f87989OooOoOO = 3.0f;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f87991OooOoo0 = true;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f87990OooOoo = false;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Matrix f87997Oooo00O = new Matrix();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Matrix f87998Oooo00o = new Matrix();

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Matrix f87995Oooo0 = new Matrix();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final RectF f87999Oooo0O0 = new RectF();

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final float[] f88000Oooo0OO = new float[9];

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f88004Oooo0oo = 2;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f87994Oooo = 2;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f88006OoooO00 = true;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageView.ScaleType f88005OoooO0 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: o00ooo0.OooOO0$OooO00o */
    public class OooO00o {
        public OooO00o() {
        }

        public final void OooO00o(float f, float f2, float f3) {
            ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = ViewOnTouchListenerC25806OooOO0.this;
            if (viewOnTouchListenerC25806OooOO0.OooO0Oo() < viewOnTouchListenerC25806OooOO0.f87989OooOoOO || f < 1.0f) {
                viewOnTouchListenerC25806OooOO0.getClass();
                viewOnTouchListenerC25806OooOO0.f87995Oooo0.postScale(f, f, f2, f3);
                viewOnTouchListenerC25806OooOO0.OooO00o();
            }
        }
    }

    /* JADX INFO: renamed from: o00ooo0.OooOO0$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f88009OooO00o;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f88009OooO00o = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88009OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88009OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88009OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: o00ooo0.OooOO0$OooO0OO */
    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final float f88010OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final float f88011OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final float f88012OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final long f88013OooOoO0 = System.currentTimeMillis();

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final float f88014OooOoOO;

        public OooO0OO(float f, float f2, float f3, float f4) {
            this.f88011OooOo0o = f3;
            this.f88010OooOo = f4;
            this.f88012OooOoO = f;
            this.f88014OooOoOO = f2;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [float, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v4, types: [float, void] */
        /* JADX WARN: Type inference failed for: r4v0, types: [byte[], float] */
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = ViewOnTouchListenerC25806OooOO0.this;
            float interpolation = viewOnTouchListenerC25806OooOO0.f87986OooOo0o.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f88013OooOoO0) * 1.0f) / viewOnTouchListenerC25806OooOO0.f87985OooOo));
            viewOnTouchListenerC25806OooOO0.f88007OoooO0O.OooO00o(Bundle.putByteArray(this.f88014OooOoOO, this.f88012OooOoO) / viewOnTouchListenerC25806OooOO0.OooO0Oo(), this.f88011OooOo0o, this.f88010OooOo);
            if (interpolation < 1.0f) {
                viewOnTouchListenerC25806OooOO0.f87992OooOooO.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: o00ooo0.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    public class RunnableC25807OooO0Oo implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f88016OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OverScroller f88017OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f88019OooOoO0;

        public RunnableC25807OooO0Oo(Context context) {
            this.f88017OooOo0o = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.f88017OooOo0o;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = ViewOnTouchListenerC25806OooOO0.this;
                viewOnTouchListenerC25806OooOO0.f87995Oooo0.postTranslate(this.f88016OooOo - currX, this.f88019OooOoO0 - currY);
                viewOnTouchListenerC25806OooOO0.OooO00o();
                this.f88016OooOo = currX;
                this.f88019OooOoO0 = currY;
                viewOnTouchListenerC25806OooOO0.f87992OooOooO.postOnAnimation(this);
            }
        }
    }

    public ViewOnTouchListenerC25806OooOO0(PhotoView photoView) {
        OooO00o oooO00o = new OooO00o();
        this.f88007OoooO0O = oooO00o;
        this.f87992OooOooO = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.f87996Oooo000 = new C25799OooO0O0(photoView.getContext(), oooO00o);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new C25808OooOO0O(this));
        this.f87993OooOooo = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC25809OooOO0o(this));
    }

    public final void OooO00o() {
        if (OooO0O0()) {
            this.f87992OooOooO.setImageMatrix(OooO0OO());
        }
    }

    public final boolean OooO0O0() {
        RectF rectF;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Matrix matrixOooO0OO = OooO0OO();
        float f6 = 0.0f;
        if (this.f87992OooOooO.getDrawable() != null) {
            rectF = this.f87999Oooo0O0;
            rectF.set(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            matrixOooO0OO.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        PhotoView photoView = this.f87992OooOooO;
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (fHeight <= height) {
            int i = OooO0O0.f88009OooO00o[this.f88005OoooO0.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (height - fHeight) / 2.0f;
                    f5 = rectF.top;
                } else {
                    f4 = height - fHeight;
                    f5 = rectF.top;
                }
                f = f4 - f5;
            } else {
                f = -rectF.top;
            }
            this.f87994Oooo = 2;
        } else {
            float f7 = rectF.top;
            if (f7 > 0.0f) {
                this.f87994Oooo = 0;
                f = -f7;
            } else {
                float f8 = rectF.bottom;
                if (f8 < height) {
                    this.f87994Oooo = 1;
                    f = height - f8;
                } else {
                    this.f87994Oooo = -1;
                    f = 0.0f;
                }
            }
        }
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (fWidth <= width) {
            int i2 = OooO0O0.f88009OooO00o[this.f88005OoooO0.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (width - fWidth) / 2.0f;
                    f3 = rectF.left;
                } else {
                    f2 = width - fWidth;
                    f3 = rectF.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -rectF.left;
            }
            this.f88004Oooo0oo = 2;
        } else {
            float f9 = rectF.left;
            if (f9 > 0.0f) {
                this.f88004Oooo0oo = 0;
                f6 = -f9;
            } else {
                float f10 = rectF.right;
                if (f10 < width) {
                    f6 = width - f10;
                    this.f88004Oooo0oo = 1;
                } else {
                    this.f88004Oooo0oo = -1;
                }
            }
        }
        this.f87995Oooo0.postTranslate(f6, f);
        return true;
    }

    public final Matrix OooO0OO() {
        Matrix matrix = this.f87998Oooo00o;
        matrix.set(this.f87997Oooo00O);
        matrix.postConcat(this.f87995Oooo0);
        return matrix;
    }

    public final float OooO0Oo() {
        Matrix matrix = this.f87995Oooo0;
        float[] fArr = this.f88000Oooo0OO;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void OooO0o() {
        if (this.f88006OoooO00) {
            OooO0oO(this.f87992OooOooO.getDrawable());
            return;
        }
        Matrix matrix = this.f87995Oooo0;
        matrix.reset();
        matrix.postRotate(0.0f);
        OooO00o();
        this.f87992OooOooO.setImageMatrix(OooO0OO());
        OooO0O0();
    }

    public final void OooO0o0(float f, float f2, float f3, boolean z) {
        if (f < this.f87988OooOoO0 || f > this.f87989OooOoOO) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f87992OooOooO.post(new OooO0OO(OooO0Oo(), f, f2, f3));
        } else {
            this.f87995Oooo0.setScale(f, f, f2, f3);
            OooO00o();
        }
    }

    public final void OooO0oO(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.f87992OooOooO;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f87997Oooo00O;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        ImageView.ScaleType scaleType = this.f88005OoooO0;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((width - (f * fMax)) / 2.0f, C20509OooO0oo.OooO0O0(f3, fMax, height, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((width - (f * fMin)) / 2.0f, C20509OooO0oo.OooO0O0(f3, fMin, height, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = OooO0O0.f88009OooO00o[this.f88005OoooO0.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f87995Oooo0;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        OooO00o();
        this.f87992OooOooO.setImageMatrix(OooO0OO());
        OooO0O0();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        OooO0oO(this.f87992OooOooO.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C25799OooO0O0 c25799OooO0O0;
        GestureDetector gestureDetector;
        boolean z2 = false;
        if (!this.f88006OoooO00 || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = null;
        if (action != 0) {
            if (action == 1 || action == 3) {
                float fOooO0Oo = OooO0Oo();
                float f = this.f87988OooOoO0;
                RectF rectF2 = this.f87999Oooo0O0;
                if (fOooO0Oo < f) {
                    OooO0O0();
                    Matrix matrixOooO0OO = OooO0OO();
                    if (this.f87992OooOooO.getDrawable() != null) {
                        rectF2.set(0.0f, 0.0f, r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
                        matrixOooO0OO.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF3 = rectF;
                        view.post(new OooO0OO(OooO0Oo(), this.f87988OooOoO0, rectF3.centerX(), rectF3.centerY()));
                        z = true;
                    }
                } else if (OooO0Oo() > this.f87989OooOoOO) {
                    OooO0O0();
                    Matrix matrixOooO0OO2 = OooO0OO();
                    if (this.f87992OooOooO.getDrawable() != null) {
                        rectF2.set(0.0f, 0.0f, r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
                        matrixOooO0OO2.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF4 = rectF;
                        view.post(new OooO0OO(OooO0Oo(), this.f87989OooOoOO, rectF4.centerX(), rectF4.centerY()));
                        z = true;
                    }
                }
            }
            c25799OooO0O0 = this.f87996Oooo000;
            if (c25799OooO0O0 != null) {
                ScaleGestureDetector scaleGestureDetector = c25799OooO0O0.f87978OooO0OO;
                boolean zIsInProgress = scaleGestureDetector.isInProgress();
                boolean z3 = c25799OooO0O0.f87981OooO0o0;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    c25799OooO0O0.OooO00o(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                boolean z4 = (zIsInProgress || scaleGestureDetector.isInProgress()) ? false : true;
                boolean z5 = (z3 || c25799OooO0O0.f87981OooO0o0) ? false : true;
                if (z4 && z5) {
                    z2 = true;
                }
                this.f87990OooOoo = z2;
                z = true;
            }
            gestureDetector = this.f87993OooOooo;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        RunnableC25807OooO0Oo runnableC25807OooO0Oo = this.f88003Oooo0oO;
        if (runnableC25807OooO0Oo != null) {
            runnableC25807OooO0Oo.f88017OooOo0o.forceFinished(true);
            this.f88003Oooo0oO = null;
        }
        z = false;
        c25799OooO0O0 = this.f87996Oooo000;
        if (c25799OooO0O0 != null) {
        }
        gestureDetector = this.f87993OooOooo;
        if (gestureDetector == null) {
        }
        return z;
    }
}
