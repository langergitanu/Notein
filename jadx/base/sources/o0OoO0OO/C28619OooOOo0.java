package o0OoO0OO;

import android.content.Context;
import android.view.View;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.login.thirdparty.LoginFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import o0oOoo0.C31113OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoO0OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28619OooOOo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101444OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101445OooOo0o;

    public /* synthetic */ C28619OooOOo0(Object obj, int i) {
        this.f101445OooOo0o = i;
        this.f101444OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f101444OooOo;
        switch (this.f101445OooOo0o) {
            case 0:
                LoginFragment loginFragment = (LoginFragment) obj;
                return new LoginByThirdPartyChildFragment(loginFragment, loginFragment);
            case 1:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) obj).OoooOOo();
                return C32460OooOooO.f116667OooO00o;
            default:
                Context context = ((View) obj).getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                return new C31113OooO0O0(context);
        }
    }
}
