package o0OoO000;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OoOo0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101364OooO00o;

    public o0OoOo0(String str) {
        this.f101364OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0OoOo0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101364OooO00o, ((o0OoOo0) obj).f101364OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57938xd111c511;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f101364OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f101364OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionFirebaseUserAuthFragmentToFirebaseCreateUserPasswordFragment(email="), this.f101364OooO00o, ")");
    }
}
