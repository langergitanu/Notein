package o0oo0Oo;

import android.graphics.Color;
import android.os.Build;
import com.orion.penkit.models.DrawResult;
import java.util.List;
import o00O0oo0.C24969OooOO0;
import o0O0oOOO.C26121OooO0o0;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31245OooO0oO<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111468OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f111469OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111470OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f111471OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111472OooOo00 = 1.0f;

    public C31245OooO0oO(int i, float f, o0O0oo00.OooO00o<T> oooO00o) {
        this.f111468OooOOOo = oooO00o;
        this.f111470OooOOo0 = f;
        this.f111469OooOOo = i;
        this.f111469OooOOo = C24969OooOO0.OooO0OO(i);
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 13, false, 16);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        o0O0oo00.OooO00o<T> oooO00o = this.f111468OooOOOo;
        if (i == 0) {
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111468OooOOOo, this.f111469OooOOo, this.f111470OooOOo0 * this.f111472OooOo00, 0, 13, false, 16);
            oooO00o.moveTo(f, f2);
            this.f111471OooOOoo = true;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i == 1) {
            this.f111471OooOOoo = false;
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
        return this.f111469OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111472OooOo00;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 6;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111470OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111471OooOOoo) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111468OooOOOo;
            oooO00o.OooO0Oo();
            if (this.f111415OooO0O0 && !this.f111422OooOO0) {
                oooO00o.lineTo(this.f111416OooO0OO, this.f111417OooO0Oo);
            }
            oooO00o.OooOo00(target);
            if (target.OooO0O0()) {
                oooO00o.OooOoO0(-1);
            } else {
                oooO00o.OooOoO0(13);
                if (Build.VERSION.SDK_INT <= 27) {
                    if (z) {
                        oooO00o.OooOoO0(-1);
                        oooO00o.OooOO0O(Color.argb((int) (Color.alpha(this.f111469OooOOo) * 0.5f), Color.red(this.f111469OooOOo), Color.green(this.f111469OooOOo), Color.blue(this.f111469OooOOo)));
                    } else {
                        oooO00o.OooOoO0(13);
                        oooO00o.OooOO0O(this.f111469OooOOo);
                    }
                }
                if ((target instanceof C26121OooO0o0) && ((C26121OooO0o0) target).f89178OooO0o0) {
                    oooO00o.OooOoO0(16);
                }
            }
            oooO00o.OooOOOO(this.f111472OooOo00);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111468OooOOOo.reset();
        this.f111471OooOOoo = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111472OooOo00 = f;
    }
}
