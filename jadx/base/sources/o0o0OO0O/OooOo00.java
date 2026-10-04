package o0o0OO0O;

import OooOooo.C20785Oooo00o;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108714OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f108715OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final NavEditorLayoutInfo f108716OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f108717OooO0Oo;

    public OooOo00(String str, int i, NavEditorLayoutInfo navEditorLayoutInfo, int i2) {
        this.f108714OooO00o = str;
        this.f108715OooO0O0 = i;
        this.f108716OooO0OO = navEditorLayoutInfo;
        this.f108717OooO0Oo = i2;
    }

    public static final OooOo00 fromBundle(Bundle bundle) {
        NavEditorLayoutInfo navEditorLayoutInfo;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", OooOo00.class, NoteMeta.PROPERTY_NOTE_ID)) {
            throw new IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("pageIndex")) {
            throw new IllegalArgumentException("Required argument \"pageIndex\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("pageIndex");
        if (!bundle.containsKey("editor_layout")) {
            navEditorLayoutInfo = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(NavEditorLayoutInfo.class) && !Serializable.class.isAssignableFrom(NavEditorLayoutInfo.class)) {
                throw new UnsupportedOperationException(NavEditorLayoutInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            navEditorLayoutInfo = (NavEditorLayoutInfo) bundle.get("editor_layout");
        }
        return new OooOo00(string, i, navEditorLayoutInfo, bundle.containsKey("pending_action") ? bundle.getInt("pending_action") : -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108714OooO00o, oooOo00.f108714OooO00o) && this.f108715OooO0O0 == oooOo00.f108715OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108716OooO0OO, oooOo00.f108716OooO0OO) && this.f108717OooO0Oo == oooOo00.f108717OooO0Oo;
    }

    public final int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.f108715OooO0O0, this.f108714OooO00o.hashCode() * 31, 31);
        NavEditorLayoutInfo navEditorLayoutInfo = this.f108716OooO0OO;
        return Integer.hashCode(this.f108717OooO0Oo) + ((iOooO00o + (navEditorLayoutInfo == null ? 0 : navEditorLayoutInfo.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TiledPageListContainerFragmentArgs(noteId=");
        sb.append(this.f108714OooO00o);
        sb.append(", pageIndex=");
        sb.append(this.f108715OooO0O0);
        sb.append(", editorLayout=");
        sb.append(this.f108716OooO0OO);
        sb.append(", pendingAction=");
        return C21023OooO0Oo.OooO0OO(")", this.f108717OooO0Oo, sb);
    }
}
