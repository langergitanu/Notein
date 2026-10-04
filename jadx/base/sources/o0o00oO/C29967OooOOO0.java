package o0o00oO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o00oO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29967OooOOO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f106428OooO00o;

    public C29967OooOOO0(String str) {
        this.f106428OooO00o = str;
    }

    public static final C29967OooOOO0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29967OooOOO0.class, "text")) {
            throw new IllegalArgumentException("Required argument \"text\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("text");
        if (string != null) {
            return new C29967OooOOO0(string);
        }
        throw new IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29967OooOOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f106428OooO00o, ((C29967OooOOO0) obj).f106428OooO00o);
    }

    public final int hashCode() {
        return this.f106428OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("TranslateDialogFragmentArgs(text="), this.f106428OooO00o, ")");
    }
}
