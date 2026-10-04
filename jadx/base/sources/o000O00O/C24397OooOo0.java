package o000O00O;

import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0Oo0o0o.C28257Oooo0o;
import o0OoO0oo.C28713OooOooO;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28982oo0o0Oo;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o000O00O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24397OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f82371OooO00o;

    public void OooO00o(View view) {
        NoteEditorContainerFragment noteEditorContainerFragment;
        LockNoteFragment lockNoteFragment;
        C28755o00000o0 c28755o00000o0;
        BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f82371OooO00o;
        baseToolbarChildFragment.Ooooo0o();
        baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
        int id = view.getId();
        if (id != R.id.cl_lock_note) {
            if (id == R.id.cl_remove_lock_for_note && (c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO) != null) {
                c28755o00000o0.OooO0OO();
                return;
            }
            return;
        }
        C28755o00000o0 c28755o00000o02 = baseToolbarChildFragment.f76506o000oOoO;
        if (c28755o00000o02 == null || (lockNoteFragment = (noteEditorContainerFragment = c28755o00000o02.f101844OooO00o).f72823OoooO0) == null) {
            return;
        }
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28713OooOooO(lockNoteFragment, new C28257Oooo0o(noteEditorContainerFragment, 1), null), 3);
    }
}
