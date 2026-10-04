package o0OOo0O;

import androidx.fragment.app.Fragment;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27279OooO00o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f95070OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95071OooOo0o;

    public /* synthetic */ C27279OooO00o(Object obj, int i) {
        this.f95071OooOo0o = i;
        this.f95070OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f95071OooOo0o) {
            case 0:
                return ((FirebaseUserMembership) this.f95070OooOo).initMembershipType();
            case 1:
                Fragment fragmentRequireParentFragment = ((BaseToolbarChildFragment) this.f95070OooOo).requireParentFragment();
                OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                Fragment fragmentRequireParentFragment2 = ((MoveToFolderFragment) this.f95070OooOo).requireParentFragment();
                OooOOO0.OooO0o(fragmentRequireParentFragment2, "requireParentFragment(...)");
                return fragmentRequireParentFragment2;
        }
    }
}
