package oO0Oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: oO0Oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33189Oooo00o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f120106OooO00o;

    public C33189Oooo00o(boolean z) {
        this.f120106OooO00o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33189Oooo00o) && this.f120106OooO00o == ((C33189Oooo00o) obj).f120106OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_textRecognizeFragment_to_selectNoteDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("used_to_create_session", this.f120106OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120106OooO00o);
    }

    public final String toString() {
        return "ActionTextRecognizeFragmentToSelectNoteDialogFragment(usedToCreateSession=" + this.f120106OooO00o + ")";
    }
}
