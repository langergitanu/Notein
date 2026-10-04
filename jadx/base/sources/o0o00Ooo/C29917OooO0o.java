package o0o00Ooo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o00Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29917OooO0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f106153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f106154OooO0O0;

    public C29917OooO0o(String str, String str2) {
        this.f106153OooO00o = str;
        this.f106154OooO0O0 = str2;
    }

    public static final C29917OooO0o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29917OooO0o.class, "name")) {
            throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("name");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("id");
        if (string2 != null) {
            return new C29917OooO0o(string, string2);
        }
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29917OooO0o)) {
            return false;
        }
        C29917OooO0o c29917OooO0o = (C29917OooO0o) obj;
        return OooOOO0.OooO0O0(this.f106153OooO00o, c29917OooO0o.f106153OooO00o) && OooOOO0.OooO0O0(this.f106154OooO0O0, c29917OooO0o.f106154OooO0O0);
    }

    public final int hashCode() {
        return this.f106154OooO0O0.hashCode() + (this.f106153OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorSetRenameDialogFragmentArgs(name=");
        sb.append(this.f106153OooO00o);
        sb.append(", id=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f106154OooO0O0, ")");
    }
}
