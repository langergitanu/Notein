package o0o0OO0O;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OO0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30441OooOo0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108713OooO00o;

    public C30441OooOo0(String str) {
        this.f108713OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30441OooOo0)) {
            return false;
        }
        C30441OooOo0 c30441OooOo0 = (C30441OooOo0) obj;
        c30441OooOo0.getClass();
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108713OooO00o, c30441OooOo0.f108713OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_tiledPageEditorFragment_to_chooseNoteDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 1);
        bundle.putString("exclude_note", this.f108713OooO00o);
        return bundle;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(1) * 31;
        String str = this.f108713OooO00o;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionTiledPageEditorFragmentToChooseNoteDialogFragment(action=1, excludeNote="), this.f108713OooO00o, ")");
    }
}
