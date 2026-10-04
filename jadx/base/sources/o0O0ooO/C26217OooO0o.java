package o0O0ooO;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: o0O0ooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C26217OooO0o extends Animation {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f89581OooOo0o;

    public C26217OooO0o(SwipeRefreshLayout swipeRefreshLayout) {
        this.f89581OooOo0o = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f89581OooOo0o.setAnimationProgress(1.0f - f);
    }
}
