package o0o0OO0O;

import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o0OO0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30427OooO0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f108686OooO00o;

    public C30427OooO0o(int i) {
        this.f108686OooO00o = i;
    }

    public static final C30427OooO0o fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C30427OooO0o.class, "action")) {
            return new C30427OooO0o(bundle.getInt("action"));
        }
        throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30427OooO0o) && this.f108686OooO00o == ((C30427OooO0o) obj).f108686OooO00o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108686OooO00o);
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(")", this.f108686OooO00o, new StringBuilder("PageOperationProgressDialogFragmentArgs(action="));
    }
}
