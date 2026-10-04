package com.alipay.sdk.p011m.p012x;

import android.view.animation.Animation;
import com.alipay.sdk.p011m.p012x.C0200d;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends C0200d.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C0201e f66853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f66854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C0200d f66855OooO0OO;

    public OooO0O0(C0200d c0200d, C0201e c0201e, String str) {
        this.f66855OooO0OO = c0200d;
        this.f66853OooO00o = c0201e;
        this.f66854OooO0O0 = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0201e c0201e = this.f66853OooO00o;
        C0200d c0200d = this.f66855OooO0OO;
        c0200d.removeView(c0201e);
        c0200d.f66864OooOooo.OooO0O0(this.f66854OooO0O0);
        c0200d.f66862OooOoo0 = false;
    }
}
