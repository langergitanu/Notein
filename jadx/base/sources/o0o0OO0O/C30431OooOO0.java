package o0o0OO0O;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0OO0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30431OooOO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108691OooO00o;

    public C30431OooOO0(String str) {
        this.f108691OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30431OooOO0) {
            return this.f108691OooO00o.equals(((C30431OooOO0) obj).f108691OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57969x153ef6e;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f108691OooO00o);
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
        return this.f108691OooO00o.hashCode() * 923521;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionPageOperationTipsDialogFragmentToNoteEditorContainerFragment(noteId="), this.f108691OooO00o, ", sourceFolderId=null, layout=null, pageId=null, pageIdString=null)");
    }
}
