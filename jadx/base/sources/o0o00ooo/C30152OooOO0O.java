package o0o00ooo;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o00ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30152OooOO0O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107322OooO0O0;

    public C30152OooOO0O(String noteId, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        this.f107321OooO00o = noteId;
        this.f107322OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30152OooOO0O)) {
            return false;
        }
        C30152OooOO0O c30152OooOO0O = (C30152OooOO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107321OooO00o, c30152OooOO0O.f107321OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107322OooO0O0, c30152OooOO0O.f107322OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_favoriteListFragment_to_noteEditorContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f107321OooO00o);
        bundle.putString("source_folder_id", this.f107322OooO0O0);
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
        int iHashCode = this.f107321OooO00o.hashCode() * 31;
        String str = this.f107322OooO0O0;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionFavoriteListFragmentToNoteEditorContainerFragment(noteId=");
        sb.append(this.f107321OooO00o);
        sb.append(", sourceFolderId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f107322OooO0O0, ", layout=null, pageId=null, pageIdString=null)");
    }
}
