package o0o0OO0O;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0OO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30426OooO0Oo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108685OooO00o;

    public C30426OooO0Oo(String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        this.f108685OooO00o = noteId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30426OooO0Oo) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108685OooO00o, ((C30426OooO0Oo) obj).f108685OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_chooseNoteDialogFragment_to_tiledPageEditorFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f108685OooO00o);
        bundle.putInt("pageIndex", -1);
        if (Parcelable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putParcelable("editor_layout", null);
        } else if (Serializable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putSerializable("editor_layout", null);
        }
        bundle.putInt("pending_action", -1);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + C20785Oooo00o.OooO00o(-1, this.f108685OooO00o.hashCode() * 31, 961);
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionChooseNoteDialogFragmentToTiledPageEditorFragment(noteId="), this.f108685OooO00o, ", pageIndex=-1, editorLayout=null, pendingAction=-1)");
    }
}
