package o0O0ooo0;

import Oooo0oO.o00oO0O;
import android.content.Context;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0o000oo.ViewOnClickListenerC29819OooOo;
import o0o00OO0.C29883OooO0OO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89682OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89683OooOo0o;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f89683OooOo0o = i;
        this.f89682OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f89683OooOo0o) {
            case 0:
                ((o00oO0O) this.f89682OooOo).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return C32460OooOooO.f116667OooO00o;
            default:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f89682OooOo;
                baseToolbarChildFragment.getClass();
                ViewOnClickListenerC29819OooOo viewOnClickListenerC29819OooOo = new ViewOnClickListenerC29819OooOo(baseToolbarChildFragment);
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                return new C29883OooO0OO(contextRequireContext, viewOnClickListenerC29819OooOo);
        }
    }
}
