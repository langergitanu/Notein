package o0O0ooo0;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0O0ooo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26242OooO0oo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89670OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89671OooOo0o;

    public /* synthetic */ C26242OooO0oo(Object obj, int i) {
        this.f89671OooOo0o = i;
        this.f89670OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f89671OooOo0o) {
            case 0:
                ((oO0O000o.OooO00o) this.f89670OooOo).invoke();
                return C32460OooOooO.f116667OooO00o;
            default:
                Fragment fragmentRequireParentFragment = ((BaseToolbarChildFragment) this.f89670OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
