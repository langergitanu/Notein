package o000O0oo;

import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.ink.authoring.InProgressShapesView;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo<CompletedShapeT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InProgressShapesView f82446OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SurfaceView f82447OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24423OooO0oo f82448OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24415OooO f82449OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f82450OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<Runnable, C32460OooOooO> f82451OooO0o0;

    public OooOo(InProgressShapesView mainView, SurfaceView surfaceView, C24423OooO0oo c24423OooO0oo, C24415OooO c24415OooO) {
        C24433OooOo0o c24433OooOo0o = new C24433OooOo0o(1, mainView, ViewGroup.class, "postOnAnimation", "postOnAnimation(Ljava/lang/Runnable;)V", 0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(mainView, "mainView");
        this.f82446OooO00o = mainView;
        this.f82447OooO0O0 = surfaceView;
        this.f82448OooO0OO = c24423OooO0oo;
        this.f82449OooO0Oo = c24415OooO;
        this.f82451OooO0o0 = c24433OooOo0o;
    }
}
