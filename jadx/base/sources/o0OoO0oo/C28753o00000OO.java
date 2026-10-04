package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.EyeDropperView;
import o0o00Ooo.OooOO0;
import o0oo00oO.C31210OooO0OO;
import o0oo00oO.InterfaceC31209OooO0O0;
import o0oo00oO.InterfaceC31211OooO0Oo;

/* JADX INFO: renamed from: o0OoO0oo.o00000OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28753o00000OO implements OooOO0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101839OooO00o;

    public C28753o00000OO(NoteEditorContainerFragment noteEditorContainerFragment) {
        this.f101839OooO00o = noteEditorContainerFragment;
    }

    @Override // o0o00Ooo.OooOO0.OooO00o
    public final void OooO00o() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101839OooO00o;
        C31210OooO0OO c31210OooO0OO = noteEditorContainerFragment.f72826OoooOO0;
        if (c31210OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penCapabilityManager");
            throw null;
        }
        c31210OooO0OO.OooO00o();
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = c31210OooO0OO.f111297OooO00o;
        InterfaceC31209OooO0O0 interfaceC31209OooO0O0 = interfaceC31211OooO0Oo != null ? (InterfaceC31209OooO0O0) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111302OooOoO) : null;
        if (interfaceC31209OooO0O0 != null && interfaceC31209OooO0O0.isSupported()) {
            interfaceC31209OooO0O0.OooO00o();
            return;
        }
        EyeDropperView eyeDropperView = noteEditorContainerFragment.f72835OooooOO;
        if (eyeDropperView != null) {
            eyeDropperView.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eyeDropperView");
            throw null;
        }
    }
}
