package o0OoO0oo;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinListFragment;

/* JADX INFO: renamed from: o0OoO0oo.o00O0O0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28836o00O0O0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f102130OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102131OooOo0o;

    public /* synthetic */ C28836o00O0O0o(Fragment fragment, int i) {
        this.f102131OooOo0o = i;
        this.f102130OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Fragment fragment = this.f102130OooOo;
        switch (this.f102131OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((NoteEditorFragment) fragment).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 1:
                int i = PenBarChildFragment.f75240o0000OOo;
                Fragment fragmentRequireParentFragment2 = ((PenBarChildFragment) fragment).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment2, "requireParentFragment(...)");
                return fragmentRequireParentFragment2;
            default:
                Fragment fragmentRequireParentFragment3 = ((TrashBinListFragment) fragment).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment3, "requireParentFragment(...)");
                return fragmentRequireParentFragment3;
        }
    }
}
