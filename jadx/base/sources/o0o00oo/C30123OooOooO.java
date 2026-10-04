package o0o00oo;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.AiFeaturePublicTestingDialogFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import io.ktor.utils.p616io.C23968Oooo00o;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: renamed from: o0o00oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30123OooOooO implements AiFeaturePublicTestingDialogFragment.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AiFeaturePublicTestingDialogFragment f107251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f107252OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107253OooO0OO;

    public C30123OooOooO(AiFeaturePublicTestingDialogFragment aiFeaturePublicTestingDialogFragment, boolean z, NoteListContainerFragment noteListContainerFragment) {
        this.f107251OooO00o = aiFeaturePublicTestingDialogFragment;
        this.f107252OooO0O0 = z;
        this.f107253OooO0OO = noteListContainerFragment;
    }

    @Override // com.orion.notein.ui.AiFeaturePublicTestingDialogFragment.OooO00o
    public final void OooO00o() {
        this.f107251OooO00o.dismiss();
        NoteListContainerFragment noteListContainerFragment = this.f107253OooO0OO;
        if (this.f107252OooO0O0) {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), new C24564OooO00o(R.id.action_noteListFragment_to_firebaseUserAuthFragment));
        } else {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), C23968Oooo00o.OooO0Oo());
        }
    }

    @Override // com.orion.notein.ui.AiFeaturePublicTestingDialogFragment.OooO00o
    public final void OooO0O0() {
        this.f107251OooO00o.dismiss();
    }
}
