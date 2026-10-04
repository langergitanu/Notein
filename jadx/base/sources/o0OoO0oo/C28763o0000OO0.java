package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoO0oo.o0000OO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28763o0000OO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101860OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final NavEditorLayoutInfo f101861OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f101862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f101863OooO0o0;

    public C28763o0000OO0(String str, String str2, NavEditorLayoutInfo navEditorLayoutInfo, String str3, String str4) {
        this.f101859OooO00o = str;
        this.f101860OooO0O0 = str2;
        this.f101861OooO0OO = navEditorLayoutInfo;
        this.f101862OooO0Oo = str3;
        this.f101863OooO0o0 = str4;
    }

    public static final C28763o0000OO0 fromBundle(Bundle bundle) {
        NavEditorLayoutInfo navEditorLayoutInfo;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28763o0000OO0.class, NoteMeta.PROPERTY_NOTE_ID)) {
            throw new IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.");
        }
        String string2 = bundle.containsKey("source_folder_id") ? bundle.getString("source_folder_id") : null;
        if (!bundle.containsKey("layout")) {
            navEditorLayoutInfo = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(NavEditorLayoutInfo.class) && !Serializable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
                throw new UnsupportedOperationException(NavEditorLayoutInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            navEditorLayoutInfo = (NavEditorLayoutInfo) bundle.get("layout");
        }
        return new C28763o0000OO0(string, string2, navEditorLayoutInfo, bundle.containsKey("pageId") ? bundle.getString("pageId") : null, bundle.containsKey("page_id_string") ? bundle.getString("page_id_string") : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28763o0000OO0)) {
            return false;
        }
        C28763o0000OO0 c28763o0000OO0 = (C28763o0000OO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101859OooO00o, c28763o0000OO0.f101859OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101860OooO0O0, c28763o0000OO0.f101860OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101861OooO0OO, c28763o0000OO0.f101861OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101862OooO0Oo, c28763o0000OO0.f101862OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101863OooO0o0, c28763o0000OO0.f101863OooO0o0);
    }

    public final int hashCode() {
        int iHashCode = this.f101859OooO00o.hashCode() * 31;
        String str = this.f101860OooO0O0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        NavEditorLayoutInfo navEditorLayoutInfo = this.f101861OooO0OO;
        int iHashCode3 = (iHashCode2 + (navEditorLayoutInfo == null ? 0 : navEditorLayoutInfo.hashCode())) * 31;
        String str2 = this.f101862OooO0Oo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101863OooO0o0;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteEditorContainerFragmentArgs(noteId=");
        sb.append(this.f101859OooO00o);
        sb.append(", sourceFolderId=");
        sb.append(this.f101860OooO0O0);
        sb.append(", layout=");
        sb.append(this.f101861OooO0OO);
        sb.append(", pageId=");
        sb.append(this.f101862OooO0Oo);
        sb.append(", pageIdString=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101863OooO0o0, ")");
    }
}
