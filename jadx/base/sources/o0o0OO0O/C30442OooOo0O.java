package o0o0OO0O;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0OO0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30442OooOo0O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108718OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NavEditorLayoutInfo f108719OooO0O0;

    public C30442OooOo0O(String noteId, NavEditorLayoutInfo navEditorLayoutInfo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        this.f108718OooO00o = noteId;
        this.f108719OooO0O0 = navEditorLayoutInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30442OooOo0O)) {
            return false;
        }
        C30442OooOo0O c30442OooOo0O = (C30442OooOo0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108718OooO00o, c30442OooOo0O.f108718OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108719OooO0O0, c30442OooOo0O.f108719OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_tiledPageEditorFragment_to_noteEditorContainerFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f108718OooO00o);
        bundle.putString("source_folder_id", null);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(NavEditorLayoutInfo.class);
        Parcelable parcelable = this.f108719OooO0O0;
        if (zIsAssignableFrom) {
            bundle.putParcelable("layout", parcelable);
        } else if (Serializable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
            bundle.putSerializable("layout", (Serializable) parcelable);
        }
        bundle.putString("pageId", null);
        bundle.putString("page_id_string", null);
        return bundle;
    }

    public final int hashCode() {
        int iHashCode = this.f108718OooO00o.hashCode() * 961;
        NavEditorLayoutInfo navEditorLayoutInfo = this.f108719OooO0O0;
        return (iHashCode + (navEditorLayoutInfo == null ? 0 : navEditorLayoutInfo.hashCode())) * 961;
    }

    public final String toString() {
        return "ActionTiledPageEditorFragmentToNoteEditorContainerFragment(noteId=" + this.f108718OooO00o + ", sourceFolderId=null, layout=" + this.f108719OooO0O0 + ", pageId=null, pageIdString=null)";
    }
}
