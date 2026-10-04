package o0o00oo;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o00oo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30130Oooo0o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107268OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107269OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f107270OooO0OO;

    public C30130Oooo0o(String noteId, String str, String str2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        this.f107268OooO00o = noteId;
        this.f107269OooO0O0 = str;
        this.f107270OooO0OO = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30130Oooo0o)) {
            return false;
        }
        C30130Oooo0o c30130Oooo0o = (C30130Oooo0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107268OooO00o, c30130Oooo0o.f107268OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107269OooO0O0, c30130Oooo0o.f107269OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107270OooO0OO, c30130Oooo0o.f107270OooO0OO);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteListFragment_to_noteEditorContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f107268OooO00o);
        bundle.putString("source_folder_id", this.f107269OooO0O0);
        if (Parcelable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putParcelable("layout", null);
        } else if (Serializable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putSerializable("layout", null);
        }
        bundle.putString("pageId", this.f107270OooO0OO);
        bundle.putString("page_id_string", null);
        return bundle;
    }

    public final int hashCode() {
        int iHashCode = this.f107268OooO00o.hashCode() * 31;
        String str = this.f107269OooO0O0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.f107270OooO0OO;
        return (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteListFragmentToNoteEditorContainerFragment(noteId=");
        sb.append(this.f107268OooO00o);
        sb.append(", sourceFolderId=");
        sb.append(this.f107269OooO0O0);
        sb.append(", layout=null, pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f107270OooO0OO, ", pageIdString=null)");
    }
}
