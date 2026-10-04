package o0Oo0o0o;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.export.C23108OooO0o0;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;

/* JADX INFO: renamed from: o0Oo0o0o.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28235OooOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100075OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100076OooOo0o;

    public /* synthetic */ C28235OooOOO(Fragment fragment, int i) {
        this.f100076OooOo0o = i;
        this.f100075OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f100076OooOo0o) {
            case 0:
                return ((C23108OooO0o0) ((ExportBottomSheetFragment) this.f100075OooOo).f71510OooOooO.getValue()).f71779OooO00o;
            default:
                Fragment fragmentRequireParentFragment = ((LabelListFragment) this.f100075OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
