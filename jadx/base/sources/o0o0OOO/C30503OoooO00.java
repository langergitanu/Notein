package o0o0OOO;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0OOO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30503OoooO00 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108935OooO00o;

    public C30503OoooO00(String str) {
        this.f108935OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30503OoooO00) {
            return this.f108935OooO00o.equals(((C30503OoooO00) obj).f108935OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_paperConfigDialogFragment_to_noteEditorContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f108935OooO00o);
        bundle.putString("source_folder_id", null);
        if (Parcelable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putParcelable("layout", null);
        } else if (Serializable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putSerializable("layout", null);
        }
        bundle.putString("pageId", null);
        bundle.putString("page_id_string", null);
        return bundle;
    }

    public final int hashCode() {
        return this.f108935OooO00o.hashCode() * 923521;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionPaperConfigDialogFragmentToNoteEditorContainerFragment(noteId="), this.f108935OooO00o, ", sourceFolderId=null, layout=null, pageId=null, pageIdString=null)");
    }
}
