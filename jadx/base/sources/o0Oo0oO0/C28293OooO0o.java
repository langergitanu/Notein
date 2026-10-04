package o0Oo0oO0;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.OooOo;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import o0o00oo.C30107OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0oO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28293OooO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100346OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100347OooOo0o;

    public /* synthetic */ C28293OooO0o(Fragment fragment, int i) {
        this.f100347OooOo0o = i;
        this.f100346OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Fragment fragment = this.f100346OooOo;
        switch (this.f100347OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((FeedbackFragment) fragment).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            default:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) fragment;
                OooOo oooOoOooO00o = OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30107OooOOOO(noteListContainerFragment, null), 2);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
