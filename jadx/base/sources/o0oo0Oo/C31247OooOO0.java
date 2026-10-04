package o0oo0Oo;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import com.orion.penkit.models.DrawResult;
import java.util.List;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31247OooOO0<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f111486OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Bundle f111487OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111488OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final float f111491OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f111493OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f111494OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ValueAnimator f111496OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final PointF f111489OooOOoo = new PointF();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final PointF f111492OooOo00 = new PointF();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f111490OooOo = 1.0f;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f111495OooOoO = 1.0f;

    public C31247OooOO0(int i, int i2, float f, Bundle bundle, o0O0oo00.OooO00o oooO00o) {
        this.f111486OooOOOo = i2;
        this.f111488OooOOo0 = oooO00o;
        this.f111487OooOOo = bundle;
        this.f111491OooOo0 = f;
        this.f111493OooOo0O = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f * 1.0f, 0, 0, false, 24);
        ((C26120OooO0Oo) oooO00o).Oooo000();
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PointF pointF = this.f111489OooOOoo;
        int i2 = this.f111486OooOOOo;
        o0O0oo00.OooO00o<T> oooO00o = this.f111488OooOOo0;
        if (i != 0) {
            if (i == 1) {
                return i2 == 0 ? new DrawResult(4, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null) : new DrawResult(1, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
            }
            if (i != 2) {
                return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
            float f4 = pointF.x;
            float f5 = pointF.y;
            float f6 = 2;
            oooO00o.OooO0O0(f4, f5, (f4 + f) / f6, (f5 + f2) / f6);
            pointF.set(f, f2);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i2 == 1) {
            oooO00o.reset();
        }
        oooO00o.moveTo(f, f2);
        pointF.set(f, f2);
        this.f111492OooOo00.set(f, f2);
        this.f111494OooOo0o = true;
        this.f111495OooOoO = 1.0f;
        oooO00o.OooOO0O(this.f111493OooOo0O);
        ValueAnimator valueAnimator = this.f111496OooOoO0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111493OooOo0O;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111490OooOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return this.f111487OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 7;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111491OooOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111494OooOo0o) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111488OooOOo0;
            oooO00o.OooOo00(target);
            oooO00o.OooO0Oo();
            if (this.f111415OooO0O0 && !this.f111422OooOO0) {
                oooO00o.lineTo(this.f111416OooO0OO, this.f111417OooO0Oo);
            }
            C26120OooO0Oo c26120OooO0Oo = (C26120OooO0Oo) oooO00o;
            float f = this.f111490OooOo;
            float f2 = this.f111491OooOo0;
            c26120OooO0Oo.OooO(f * f2);
            float f3 = 255;
            int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(this.f111495OooOoO * f3);
            int i = this.f111493OooOo0O;
            c26120OooO0Oo.OooOO0O(Color.argb(iOooO0O0, Color.red(i), Color.green(i), Color.blue(i)));
            c26120OooO0Oo.Oooo000();
            oooO00o.OooOOOO(this.f111490OooOo);
            oooO00o.OooOOOO(this.f111490OooOo);
            oooO00o.OooOOOO(this.f111490OooOo);
            c26120OooO0Oo.f89165OooO0Oo.setMaskFilter(null);
            c26120OooO0Oo.OooO((f2 * this.f111490OooOo) - C28460OooooO0.OooO00o(2.0f));
            c26120OooO0Oo.OooOO0O(Color.argb(oO0O00O.OooO00o.OooO0O0(this.f111495OooOoO * f3), Color.red(-1), Color.green(-1), Color.blue(-1)));
            oooO00o.OooOOOO(this.f111490OooOo);
            c26120OooO0Oo.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        if (this.f111486OooOOOo == 1) {
            this.f111488OooOOo0.reset();
            this.f111494OooOo0o = false;
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111490OooOo = f;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOOO0(ValueAnimator valueAnimator, float f) {
        o0O0oo00.OooO00o<T> oooO00o = this.f111488OooOOo0;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type com.orion.ni_render_engine.impl.android.AndroidRenderEngine");
        C26120OooO0Oo c26120OooO0Oo = (C26120OooO0Oo) oooO00o;
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(255 * f);
        int i = this.f111493OooOo0O;
        c26120OooO0Oo.OooOO0O(Color.argb(iOooO0O0, Color.red(i), Color.green(i), Color.blue(i)));
        this.f111495OooOoO = f;
        if (f == 0.0f) {
            c26120OooO0Oo.reset();
        }
        this.f111496OooOoO0 = valueAnimator;
    }
}
