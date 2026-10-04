package o0o0OO0O;

import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OO0O.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30443OooOo0o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f108720OooO00o;

    public C30443OooOo0o(int i) {
        this.f108720OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30443OooOo0o) && this.f108720OooO00o == ((C30443OooOo0o) obj).f108720OooO00o;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57980x47bf9df;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", this.f108720OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108720OooO00o);
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(")", this.f108720OooO00o, new StringBuilder("ActionTiledPageEditorFragmentToPageOperationProgressDialogFragment(action="));
    }
}
