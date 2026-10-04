package o0Oo0oOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Oo0oOo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28350OoooO0O implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100507OooO00o;

    public C28350OoooO0O(String str) {
        this.f100507OooO00o = str;
    }

    public static final C28350OoooO0O fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28350OoooO0O.class, "searchMode")) {
            throw new IllegalArgumentException("Required argument \"searchMode\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("searchMode");
        if (string != null) {
            return new C28350OoooO0O(string);
        }
        throw new IllegalArgumentException("Argument \"searchMode\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28350OoooO0O) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100507OooO00o, ((C28350OoooO0O) obj).f100507OooO00o);
    }

    public final int hashCode() {
        return this.f100507OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("CreativeLibrarySearchFragmentArgs(searchMode="), this.f100507OooO00o, ")");
    }
}
