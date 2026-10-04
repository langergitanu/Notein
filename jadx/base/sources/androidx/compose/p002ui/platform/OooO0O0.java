package androidx.compose.p002ui.platform;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.p002ui.platform.OooO00o;
import kotlin.jvm.internal.OooOOOO;
import o0Oo0oo.C28386OooO0oo;
import o0ooOO0.C31575o0000o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooOOOO implements OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f63493OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31575o0000o0 f63494OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(C31575o0000o0 c31575o0000o0, OooO00o oooO00o) {
        super(0);
        this.f63494OooOo0o = c31575o0000o0;
        this.f63493OooOo = oooO00o;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        C31575o0000o0 c31575o0000o0 = this.f63494OooOo0o;
        C28386OooO0oo c28386OooO0oo = c31575o0000o0.f112832OooOoOO;
        C28386OooO0oo c28386OooO0oo2 = c31575o0000o0.f112833OooOoo0;
        Float f = c31575o0000o0.f112831OooOoO0;
        Float f2 = c31575o0000o0.f112830OooOoO;
        float fFloatValue = (c28386OooO0oo == null || f == null) ? 0.0f : ((Number) c28386OooO0oo.f100640OooO00o.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (c28386OooO0oo2 == null || f2 == null) ? 0.0f : ((Number) c28386OooO0oo2.f100640OooO00o.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int i = c31575o0000o0.f112829OooOo0o;
            OooO00o oooO00o = this.f63493OooOo;
            int iOooOOOO = oooO00o.OooOOOO(i);
            OooO00o.OooOOo(oooO00o, iOooOOOO, 2048, 1, 8);
            AccessibilityEvent accessibilityEventOooO0Oo = oooO00o.OooO0Oo(iOooOOOO, 4096);
            if (c28386OooO0oo != null) {
                accessibilityEventOooO0Oo.setScrollX((int) ((Number) c28386OooO0oo.f100640OooO00o.invoke()).floatValue());
                accessibilityEventOooO0Oo.setMaxScrollX((int) ((Number) c28386OooO0oo.f100641OooO0O0.invoke()).floatValue());
            }
            if (c28386OooO0oo2 != null) {
                accessibilityEventOooO0Oo.setScrollY((int) ((Number) c28386OooO0oo2.f100640OooO00o.invoke()).floatValue());
                accessibilityEventOooO0Oo.setMaxScrollY((int) ((Number) c28386OooO0oo2.f100641OooO0O0.invoke()).floatValue());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                OooO00o.OooO0OO.OooO00o(accessibilityEventOooO0Oo, (int) fFloatValue, (int) fFloatValue2);
            }
            oooO00o.OooOOOo(accessibilityEventOooO0Oo);
        }
        if (c28386OooO0oo != null) {
            c31575o0000o0.f112831OooOoO0 = (Float) c28386OooO0oo.f100640OooO00o.invoke();
        }
        if (c28386OooO0oo2 != null) {
            c31575o0000o0.f112830OooOoO = (Float) c28386OooO0oo2.f100640OooO00o.invoke();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
