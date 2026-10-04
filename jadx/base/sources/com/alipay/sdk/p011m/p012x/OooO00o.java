package com.alipay.sdk.p011m.p012x;

import android.view.animation.Animation;
import com.alipay.sdk.p011m.p012x.C0200d;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends C0200d.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C0201e f66851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C0200d f66852OooO0O0;

    public OooO00o(C0200d c0200d, C0201e c0201e) {
        this.f66852OooO0O0 = c0200d;
        this.f66851OooO00o = c0201e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f66851OooO00o.OooO0OO();
        this.f66852OooO0O0.f66862OooOoo0 = false;
    }
}
