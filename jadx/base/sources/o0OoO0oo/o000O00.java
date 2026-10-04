package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class o000O00 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101918OooO00o;

    public o000O00(String str) {
        this.f101918OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000O00) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101918OooO00o, ((o000O00) obj).f101918OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_to_noteLockedDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f101918OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f101918OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionToNoteLockedDialogFragment(noteId="), this.f101918OooO00o, ")");
    }
}
