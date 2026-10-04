package OooOoo0;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: OooOoo0.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20701OoooooO extends EdgeEffect {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f59420OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f59421OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20701OoooooO(Context context) {
        super(context);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f59420OooO00o = OooO0O0.OooO0O0.OooO00o(context).f81476OooOo0o * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f59421OooO0O0 = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.f59421OooO0O0 = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f59421OooO0O0 = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f59421OooO0O0 = 0.0f;
        super.onPull(f);
    }
}
