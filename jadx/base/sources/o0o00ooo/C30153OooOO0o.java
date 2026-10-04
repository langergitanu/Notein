package o0o00ooo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o00ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30153OooOO0o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f107324OooO0O0;

    public C30153OooOO0o() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30153OooOO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107323OooO00o, ((C30153OooOO0o) obj).f107323OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f107324OooO0O0;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f107323OooO00o);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f107323OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionFavoriteListFragmentToPdfPasswordDialogFragment(id="), this.f107323OooO00o, ")");
    }

    public C30153OooOO0o(String str) {
        this.f107323OooO00o = str;
        this.f107324OooO0O0 = R.id.action_favoriteListFragment_to_pdfPasswordDialogFragment;
    }
}
