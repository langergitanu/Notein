package com.alipay.sdk.p011m.p012x;

import android.widget.FrameLayout;
import com.alipay.sdk.app.H5PayActivity;

/* JADX INFO: renamed from: com.alipay.sdk.m.x.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0199c extends FrameLayout {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f66856OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f66857OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final H5PayActivity f66858OooOo0o;

    public AbstractC0199c(H5PayActivity h5PayActivity, String str) {
        super(h5PayActivity);
        this.f66858OooOo0o = h5PayActivity;
        this.f66857OooOo = str;
    }

    public final boolean OooO00o() {
        return "v1".equals(this.f66857OooOo);
    }
}
