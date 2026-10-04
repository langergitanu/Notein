package o0oo0OoO;

import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.penkit.models.DrawResult;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.OooO0O0;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32444OooOOO0;

/* JADX INFO: renamed from: o0oo0OoO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31276OooOO0<T> extends AbstractC31268OooO00o<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f111673OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111674OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f111675OooOoO = 1.0f;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f111676OooOoO0;

    public C31276OooOO0(int i, float f, o0O0oo00.OooO00o oooO00o) {
        this.f111674OooOo0o = oooO00o;
        this.f111673OooOo = f;
        this.f111676OooOoO0 = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        OooOOO0.OooO0oO(displayItems, "displayItems");
        throw new C32444OooOOO0("onDrawEvent is not implemented in InkPencil");
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111676OooOoO0;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111675OooOoO;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 101;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111673OooOo;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111674OooOo0o.reset();
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111675OooOoO = f;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o
    public final o000OO00.OooO0O0 OooOOOo() {
        C24457OooOOo brushFamily = BrushFamilyProvider.INSTANCE.getBrushFamily("notein-rainbow-v2");
        OooO0O0.OooO00o oooO00o = o000OO00.OooO0O0.f82629OooO0Oo;
        int i = this.f111676OooOoO0;
        float f = this.f111673OooOo;
        oooO00o.getClass();
        return OooO0O0.OooO00o.OooO00o(brushFamily, i, f, 0.1f);
    }
}
