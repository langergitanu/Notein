package o0OoO0oo;

import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28775o0000o0o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101900OooO00o;

    public C28775o0000o0o(int i) {
        this.f101900OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28775o0000o0o) && this.f101900OooO00o == ((C28775o0000o0o) obj).f101900OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_jumpToPageDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("pageNum", this.f101900OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101900OooO00o);
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(")", this.f101900OooO00o, new StringBuilder("ActionNoteEditorContainerFragmentToJumpToPageDialogFragment(pageNum="));
    }
}
