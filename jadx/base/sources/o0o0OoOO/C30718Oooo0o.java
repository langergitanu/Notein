package o0o0OoOO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o0OoOO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30718Oooo0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109849OooO00o;

    public C30718Oooo0o(String str) {
        this.f109849OooO00o = str;
    }

    public static final C30718Oooo0o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30718Oooo0o.class, "key")) {
            throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("key");
        if (string != null) {
            return new C30718Oooo0o(string);
        }
        throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30718Oooo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109849OooO00o, ((C30718Oooo0o) obj).f109849OooO00o);
    }

    public final int hashCode() {
        return this.f109849OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("SelectNoteDialogFragmentArgs(key="), this.f109849OooO00o, ")");
    }
}
