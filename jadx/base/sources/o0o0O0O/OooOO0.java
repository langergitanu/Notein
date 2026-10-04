package o0o0O0O;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;
import o000o0O0.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107839OooO00o;

    public OooOO0(String str) {
        this.f107839OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOO0) {
            return this.f107839OooO00o.equals(((OooOO0) obj).f107839OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_recentListFragment_to_noteEditorContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f107839OooO00o);
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
        return this.f107839OooO00o.hashCode() * 923521;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionRecentListFragmentToNoteEditorContainerFragment(noteId="), this.f107839OooO00o, ", sourceFolderId=null, layout=null, pageId=null, pageIdString=null)");
    }
}
