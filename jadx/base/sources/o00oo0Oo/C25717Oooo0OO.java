package o00oo0Oo;

import android.os.Build;
import com.facebook.imagepipeline.producers.C22286Oooo0oO;
import com.orion.niui.components.button.SymbolButtonView;
import oO00ooO.C32460OooOooO;
import oO0Oo.C33173OooOO0o;

/* JADX INFO: renamed from: o00oo0Oo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25717Oooo0OO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87776OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87777OooOo0o;

    public /* synthetic */ C25717Oooo0OO(Object obj, int i) {
        this.f87777OooOo0o = i;
        this.f87776OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() throws Throwable {
        switch (this.f87777OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) this.f87776OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                if (Build.VERSION.SDK_INT < 29) {
                    throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                }
                OooOo oooOo = this$0.f87785OooO0O0;
                return this$0.OooO0o0(new C22286Oooo0oO(oooOo.f87710OooO.OooO0O0(), oooOo.f87711OooO00o));
            case 1:
                ((SymbolButtonView) this.f87776OooOo).performClick();
                return C32460OooOooO.f116667OooO00o;
            default:
                return ((C33173OooOO0o) this.f87776OooOo).f120041OooO0O0.OooO0Oo();
        }
    }
}
