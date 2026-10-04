package o0OoO0oo;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00O0OO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102132OooOo0o;

    public /* synthetic */ o00O0OO(NoteEditorFragment noteEditorFragment) {
        this.f102132OooOo0o = noteEditorFragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Fragment fragmentRequireParentFragment = this.f102132OooOo0o.requireParentFragment();
        kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }
}
