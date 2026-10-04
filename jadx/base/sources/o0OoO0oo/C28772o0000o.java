package o0OoO0oo;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoO0oo.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28772o0000o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101896OooO00o;

    public C28772o0000o(String str) {
        this.f101896OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28772o0000o) {
            return this.f101896OooO00o.equals(((C28772o0000o) obj).f101896OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_loginTipsDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("message", this.f101896OooO00o);
        if (Parcelable.class.isAssignableFrom(Uri.class)) {
            bundle.putParcelable("imported_uri", null);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(Uri.class)) {
            bundle.putSerializable("imported_uri", null);
        }
        return bundle;
    }

    public final int hashCode() {
        return this.f101896OooO00o.hashCode() * 31;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionNoteEditorContainerFragmentToLoginTipsDialogFragment(message="), this.f101896OooO00o, ", importedUri=null)");
    }
}
