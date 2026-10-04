package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.export.ExportProgressDialogFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.o000O00;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Oo0o0o.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28257Oooo0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100123OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100124OooOo0o;

    public /* synthetic */ C28257Oooo0o(Fragment fragment, int i) {
        this.f100124OooOo0o = i;
        this.f100123OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f100124OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((ExportProgressDialogFragment) this.f100123OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 1:
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f100123OooOo;
                String noteId = (String) noteEditorContainerFragment.Oooo00O().f73397OoooOoo.f121747OooOo0o.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new o000O00(noteId));
                return C32460OooOooO.f116667OooO00o;
            default:
                Fragment fragmentRequireParentFragment2 = ((NoteEditorSwitchFragment) this.f100123OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment2, "requireParentFragment(...)");
                return fragmentRequireParentFragment2;
        }
    }
}
