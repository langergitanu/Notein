package o0o0OoOO;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OoOO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30710OooOooO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109834OooO00o;

    public C30710OooOooO(String str) {
        this.f109834OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30710OooOooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109834OooO00o, ((C30710OooOooO) obj).f109834OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_to_selectNoteDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f109834OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f109834OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionToSelectNoteDialogFragment(key="), this.f109834OooO00o, ")");
    }
}
