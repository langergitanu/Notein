package o0O0oooO;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0O0oooO.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26351o00ooo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f90434OooO00o;

    public C26351o00ooo(String str) {
        this.f90434OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26351o00ooo) {
            return this.f90434OooO00o.equals(((C26351o00ooo) obj).f90434OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_global_to_loginTipsDialog;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("message", this.f90434OooO00o);
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
        return this.f90434OooO00o.hashCode() * 31;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionGlobalToLoginTipsDialog(message="), this.f90434OooO00o, ", importedUri=null)");
    }
}
