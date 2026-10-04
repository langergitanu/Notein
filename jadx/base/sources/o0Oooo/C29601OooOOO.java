package o0Oooo;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorChatFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;

/* JADX INFO: renamed from: o0Oooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29601OooOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104973OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104974OooOo0o;

    public /* synthetic */ C29601OooOOO(Fragment fragment, int i) {
        this.f104974OooOo0o = i;
        this.f104973OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f104974OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((EditorChatFragment) this.f104973OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                Fragment fragmentRequireParentFragment2 = ((BaseToolbarChildFragment) this.f104973OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment2, "requireParentFragment(...)");
                return fragmentRequireParentFragment2;
        }
    }
}
