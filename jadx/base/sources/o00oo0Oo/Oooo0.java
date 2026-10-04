package o00oo0Oo;

import androidx.fragment.app.Fragment;
import com.facebook.imagepipeline.producers.C22287Oooo0oo;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class Oooo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87767OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87768OooOo0o;

    public /* synthetic */ Oooo0(Object obj, int i) {
        this.f87768OooOo0o = i;
        this.f87767OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f87768OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) this.f87767OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                OooOo oooOo = this$0.f87785OooO0O0;
                return this$0.OooO0o0(new C22287Oooo0oo(oooOo.f87710OooO.OooO0OO(), oooOo.f87711OooO00o));
            default:
                Fragment fragmentRequireParentFragment = ((FavoriteListFragment) this.f87767OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
