package o0OOo0O;

import androidx.fragment.app.Fragment;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27280OooO0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f95072OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95073OooOo0o;

    public /* synthetic */ C27280OooO0O0(Object obj, int i) {
        this.f95073OooOo0o = i;
        this.f95072OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f95073OooOo0o) {
            case 0:
                return ((FirebaseUserMembership) this.f95072OooOo).initSubscriptionType();
            default:
                Fragment fragmentRequireParentFragment = ((BaseToolbarChildFragment) this.f95072OooOo).requireParentFragment();
                OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
