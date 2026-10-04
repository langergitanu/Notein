package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* JADX INFO: renamed from: o00oO0O0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC25552OooO0OO extends C25556OooO0oo implements Runnable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f87148OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f87149OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f87150OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f87151OooOoo0;

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f87151OooOoo0;
        if (!this.f87149OooOoOO) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.f87150OooOoo) {
            return;
        }
        this.f87150OooOoo = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f87150OooOoo = false;
        this.f87151OooOoo0 += (int) ((20.0f / this.f87148OooOoO) * 360.0f);
        invalidateSelf();
    }
}
