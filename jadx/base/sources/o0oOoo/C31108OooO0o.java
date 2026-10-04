package o0oOoo;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: o0oOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31108OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31111OooO0oo f111011OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f111012OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ScaleGestureDetector f111013OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final GestureDetector f111014OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final GestureDetector f111015OooO0o0;

    public C31108OooO0o(Context context, C31111OooO0oo c31111OooO0oo) {
        this.f111011OooO00o = c31111OooO0oo;
        C31109OooO0o0 c31109OooO0o0 = new C31109OooO0o0(this);
        C31106OooO0OO c31106OooO0OO = new C31106OooO0OO(this);
        this.f111013OooO0OO = new ScaleGestureDetector(context, new C31107OooO0Oo(this));
        this.f111014OooO0Oo = new GestureDetector(context, c31109OooO0o0);
        this.f111015OooO0o0 = new GestureDetector(context, c31106OooO0OO);
    }
}
