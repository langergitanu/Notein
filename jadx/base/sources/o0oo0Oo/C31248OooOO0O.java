package o0oo0Oo;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import com.orion.penkit.models.DrawResult;
import java.util.List;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31248OooOO0O<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111497OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Bundle f111499OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final float f111500OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f111502OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f111503OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ValueAnimator f111505OooOo0o;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final PointF f111498OooOOo = new PointF();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f111504OooOo0O = 1.0f;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f111501OooOo = 1.0f;

    public C31248OooOO0O(float f, int i, Bundle bundle, o0O0oo00.OooO00o oooO00o) {
        this.f111497OooOOOo = oooO00o;
        this.f111499OooOOo0 = bundle;
        this.f111500OooOOoo = f;
        this.f111503OooOo00 = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, 1.0f, 1, 0, false, 24);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PointF pointF = this.f111498OooOOo;
        if (i != 0) {
            if (i == 1) {
                return new DrawResult(4, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
            }
            if (i != 2) {
                return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
            pointF.set(f, f2);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        o0O0oo00.OooO00o<T> oooO00o = this.f111497OooOOOo;
        oooO00o.reset();
        OooO00o.C19734OooO00o.OooO00o(this.f111497OooOOOo, this.f111503OooOo00, 1.0f, 1, 0, false, 24);
        C26120OooO0Oo c26120OooO0Oo = (C26120OooO0Oo) oooO00o;
        c26120OooO0Oo.Oooo000();
        c26120OooO0Oo.moveTo(f, f2);
        this.f111501OooOo = 1.0f;
        pointF.set(f, f2);
        this.f111502OooOo0 = true;
        ValueAnimator valueAnimator = this.f111505OooOo0o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111503OooOo00;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111504OooOo0O;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return this.f111499OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 7;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111500OooOOoo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        Log.d("LaserPen", "render: " + z);
        if (!z || this.f111502OooOo0) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111497OooOOOo;
            oooO00o.OooOo00(target);
            C26120OooO0Oo c26120OooO0Oo = (C26120OooO0Oo) oooO00o;
            float f = 255;
            int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(this.f111501OooOo * f);
            int i = this.f111503OooOo00;
            c26120OooO0Oo.OooOO0O(Color.argb(iOooO0O0, Color.red(i), Color.green(i), Color.blue(i)));
            c26120OooO0Oo.Oooo000();
            PointF pointF = this.f111498OooOOo;
            float f2 = pointF.x;
            float f3 = pointF.y;
            float f4 = this.f111504OooOo0O;
            float f5 = this.f111500OooOOoo;
            c26120OooO0Oo.OooOOOo(f2, f3, f4 * f5);
            oooO00o.OooOOOO(this.f111504OooOo0O);
            oooO00o.OooOOOO(this.f111504OooOo0O);
            oooO00o.OooOOOO(this.f111504OooOo0O);
            c26120OooO0Oo.reset();
            c26120OooO0Oo.OooOO0O(Color.argb(oO0O00O.OooO00o.OooO0O0(this.f111501OooOo * f), Color.red(-1), Color.green(-1), Color.blue(-1)));
            c26120OooO0Oo.f89165OooO0Oo.setMaskFilter(null);
            c26120OooO0Oo.OooOOOo(pointF.x, pointF.y, (f5 * this.f111504OooOo0O) - C28460OooooO0.OooO00o(1.0f));
            oooO00o.OooOOOO(this.f111504OooOo0O);
            c26120OooO0Oo.reset();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111497OooOOOo.reset();
        this.f111502OooOo0 = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111504OooOo0O = f;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOOO0(ValueAnimator valueAnimator, float f) {
        o0O0oo00.OooO00o<T> oooO00o = this.f111497OooOOOo;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type com.orion.ni_render_engine.impl.android.AndroidRenderEngine");
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(255 * f);
        int i = this.f111503OooOo00;
        ((C26120OooO0Oo) oooO00o).OooOO0O(Color.argb(iOooO0O0, Color.red(i), Color.green(i), Color.blue(i)));
        this.f111501OooOo = f;
        this.f111505OooOo0o = valueAnimator;
    }
}
