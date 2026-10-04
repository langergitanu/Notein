package o0OoO000;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101122OooO00o;

    public OooO(String str) {
        this.f101122OooO00o = str;
    }

    public static final OooO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", OooO.class, "email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("email");
        if (string != null) {
            return new OooO(string);
        }
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101122OooO00o, ((OooO) obj).f101122OooO00o);
    }

    public final int hashCode() {
        return this.f101122OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("FirebaseCreateUserPasswordFragmentArgs(email="), this.f101122OooO00o, ")");
    }
}
