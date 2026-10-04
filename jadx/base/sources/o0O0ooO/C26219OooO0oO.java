package o0O0ooO;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: o0O0ooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C26219OooO0oO extends Animation {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f89583OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89584OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f89585OooOoO0;

    public C26219OooO0oO(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f89585OooOoO0 = swipeRefreshLayout;
        this.f89584OooOo0o = i;
        this.f89583OooOo = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f89585OooOoO0.f66304OoooOO0.setAlpha((int) (((this.f89583OooOo - r0) * f) + this.f89584OooOo0o));
    }
}
