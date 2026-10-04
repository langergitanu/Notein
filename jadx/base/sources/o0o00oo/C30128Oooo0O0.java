package o0o00oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o00oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30128Oooo0O0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f107266OooO00o;

    public C30128Oooo0O0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30128Oooo0O0)) {
            return false;
        }
        ((C30128Oooo0O0) obj).getClass();
        return true;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f107266OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("note_id", null);
        bundle.putInt("page_index", 0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "ActionNoteListContainerFragmentToTextRecognizeFragment(noteId=null, pageIndex=0)";
    }

    public C30128Oooo0O0(int i) {
        this.f107266OooO00o = R.id.action_noteListContainerFragment_to_textRecognizeFragment;
    }
}
