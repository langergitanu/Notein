package o000O00O;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.core.view.RunnableC21717Oooo0OO;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0<Object> f82304OooOo0o;

    public OooO0o(OooOOO0<Object> oooOOO0) {
        this.f82304OooOo0o = oooOOO0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        OooOOO0<Object> oooOOO0 = this.f82304OooOo0o;
        SurfaceView surfaceView = oooOOO0.f82329OooO0O0;
        if (surfaceView != null) {
            oooOOO0.OooO0o0(surfaceView, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder p0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder p0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        this.f82304OooOo0o.OooO0OO(null);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder holder) throws InterruptedException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        OooOOO0.OooO0Oo(this.f82304OooOo0o, new RunnableC21717Oooo0OO(countDownLatch, 1), 1);
        countDownLatch.await();
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder holder, Runnable drawingFinished) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawingFinished, "drawingFinished");
        OooOOO0.OooO0Oo(this.f82304OooOo0o, drawingFinished, 1);
    }
}
