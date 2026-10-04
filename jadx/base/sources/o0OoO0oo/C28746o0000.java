package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.AiFeaturePublicTestingDialogFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: renamed from: o0OoO0oo.o0000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28746o0000 implements AiFeaturePublicTestingDialogFragment.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AiFeaturePublicTestingDialogFragment f101806OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f101807OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101808OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f101809OooO0Oo;

    public C28746o0000(AiFeaturePublicTestingDialogFragment aiFeaturePublicTestingDialogFragment, boolean z, NoteEditorContainerFragment noteEditorContainerFragment, boolean z2) {
        this.f101806OooO00o = aiFeaturePublicTestingDialogFragment;
        this.f101807OooO0O0 = z;
        this.f101808OooO0OO = noteEditorContainerFragment;
        this.f101809OooO0Oo = z2;
    }

    @Override // com.orion.notein.ui.AiFeaturePublicTestingDialogFragment.OooO00o
    public final void OooO00o() {
        this.f101806OooO00o.dismiss();
        boolean z = this.f101807OooO0O0;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101808OooO0OO;
        if (z) {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_firebaseUserAuthFragment));
        } else if (this.f101809OooO0Oo) {
            NoteEditorContainerFragment.OooOoOO(noteEditorContainerFragment);
        } else {
            NoteEditorContainerFragment.OooOoo(noteEditorContainerFragment);
        }
    }

    @Override // com.orion.notein.ui.AiFeaturePublicTestingDialogFragment.OooO00o
    public final void OooO0O0() {
        this.f101806OooO00o.dismiss();
    }
}
