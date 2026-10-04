package o000O0oo;

import android.view.SurfaceView;

/* JADX INFO: renamed from: o000O0oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24432OooOo0O implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOo f82456OooOo0o;

    public /* synthetic */ RunnableC24432OooOo0O(OooOo oooOo) {
        this.f82456OooOo0o = oooOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOo oooOo = this.f82456OooOo0o;
        int i = oooOo.f82450OooO0o + 1;
        oooOo.f82450OooO0o = i;
        if (i < 5) {
            oooOo.f82451OooO0o0.invoke(new RunnableC24432OooOo0O(oooOo));
            return;
        }
        SurfaceView surfaceView = oooOo.f82447OooO0O0;
        surfaceView.setTranslationX(0.0f);
        surfaceView.setTranslationY(0.0f);
        oooOo.f82446OooO00o.invalidate();
        oooOo.f82449OooO0Oo.invoke();
    }
}
