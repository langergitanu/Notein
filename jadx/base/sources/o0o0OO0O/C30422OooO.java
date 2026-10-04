package o0o0OO0O;

import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OO0O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30422OooO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f108678OooO00o;

    public C30422OooO(int i) {
        this.f108678OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30422OooO) {
            return this.f108678OooO00o == ((C30422OooO) obj).f108678OooO00o;
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57968xf0e68c85;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", this.f108678OooO00o);
        bundle.putString("exclude_note", null);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108678OooO00o) * 31;
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(", excludeNote=null)", this.f108678OooO00o, new StringBuilder("ActionPageOperationTipsDialogFragmentToChooseNoteDialogFragment(action="));
    }
}
