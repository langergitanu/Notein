package o0oo0Oo;

import com.orion.penkit.models.DrawResult;
import java.util.List;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31262OooOoO<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111608OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f111609OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111610OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f111611OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111612OooOo00 = 1.0f;

    public C31262OooOoO(int i, float f, o0O0oo00.OooO00o<T> oooO00o) {
        this.f111608OooOOOo = oooO00o;
        this.f111610OooOOo0 = f;
        this.f111609OooOOo = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        o0O0oo00.OooO00o<T> oooO00o = this.f111608OooOOOo;
        if (i == 0) {
            oooO00o.reset();
            float f4 = this.f111610OooOOo0 * this.f111612OooOo00;
            OooO00o.C19734OooO00o.OooO00o(this.f111608OooOOOo, this.f111609OooOOo, f4, 0, 0, false, 24);
            oooO00o.moveTo(f, f2);
            this.f111611OooOOoo = true;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i == 1) {
            this.f111611OooOOoo = false;
            oooO00o.lineTo(f, f2);
            return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        oooO00o.lineTo(f, f2);
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111609OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111612OooOo00;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 5;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111610OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111611OooOOoo) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111608OooOOOo;
            oooO00o.OooO0Oo();
            if (this.f111415OooO0O0 && !this.f111422OooOO0) {
                oooO00o.lineTo(this.f111416OooO0OO, this.f111417OooO0Oo);
            }
            oooO00o.OooOo00(target);
            oooO00o.OooOOOO(this.f111612OooOo00);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111608OooOOOo.reset();
        this.f111611OooOOoo = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111612OooOo00 = f;
    }
}
