package o00ooo0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: o00ooo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class GestureDetectorOnDoubleTapListenerC25809OooOO0o implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC25806OooOO0 f88021OooO00o;

    public GestureDetectorOnDoubleTapListenerC25809OooOO0o(ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0) {
        this.f88021OooO00o = viewOnTouchListenerC25806OooOO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: ArrayIndexOutOfBoundsException -> 0x002c, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002c, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x001d, B:10:0x0023, B:11:0x0027), top: B:15:0x0003 }] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float fOooO0Oo;
        float x;
        float y;
        float f;
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f88021OooO00o;
        try {
            fOooO0Oo = viewOnTouchListenerC25806OooOO0.OooO0Oo();
            x = motionEvent.getX();
            y = motionEvent.getY();
            f = viewOnTouchListenerC25806OooOO0.f87987OooOoO;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (fOooO0Oo >= f) {
            if (fOooO0Oo >= f) {
                float f2 = viewOnTouchListenerC25806OooOO0.f87989OooOoOO;
                if (fOooO0Oo < f2) {
                    viewOnTouchListenerC25806OooOO0.OooO0o0(f2, x, y, true);
                } else {
                    viewOnTouchListenerC25806OooOO0.OooO0o0(viewOnTouchListenerC25806OooOO0.f87988OooOoO0, x, y, true);
                }
            }
            return true;
        }
        viewOnTouchListenerC25806OooOO0.OooO0o0(f, x, y, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectF;
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f88021OooO00o;
        View.OnClickListener onClickListener = viewOnTouchListenerC25806OooOO0.f88002Oooo0o0;
        if (onClickListener != null) {
            onClickListener.onClick(viewOnTouchListenerC25806OooOO0.f87992OooOooO);
        }
        viewOnTouchListenerC25806OooOO0.OooO0O0();
        Matrix matrixOooO0OO = viewOnTouchListenerC25806OooOO0.OooO0OO();
        if (viewOnTouchListenerC25806OooOO0.f87992OooOooO.getDrawable() != null) {
            rectF = viewOnTouchListenerC25806OooOO0.f87999Oooo0O0;
            rectF.set(0.0f, 0.0f, r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
            matrixOooO0OO.mapRect(rectF);
        } else {
            rectF = null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (rectF == null || !rectF.contains(x, y)) {
            return false;
        }
        rectF.width();
        rectF.height();
        return true;
    }
}
