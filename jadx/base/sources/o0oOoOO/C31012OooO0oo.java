package o0oOoOO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOoOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31012OooO0oo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110731OooO0OO;

    public C31012OooO0oo(int i, String str, String str2) {
        this.f110729OooO00o = i;
        this.f110730OooO0O0 = str;
        this.f110731OooO0OO = str2;
    }

    public static final C31012OooO0oo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C31012OooO0oo.class, "fragment_type")) {
            throw new IllegalArgumentException("Required argument \"fragment_type\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("fragment_type");
        if (!bundle.containsKey("country")) {
            throw new IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("country");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("phone")) {
            throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("phone");
        if (string2 != null) {
            return new C31012OooO0oo(i, string, string2);
        }
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31012OooO0oo)) {
            return false;
        }
        C31012OooO0oo c31012OooO0oo = (C31012OooO0oo) obj;
        return this.f110729OooO00o == c31012OooO0oo.f110729OooO00o && OooOOO0.OooO0O0(this.f110730OooO0O0, c31012OooO0oo.f110730OooO0O0) && OooOOO0.OooO0O0(this.f110731OooO0OO, c31012OooO0oo.f110731OooO0OO);
    }

    public final int hashCode() {
        return this.f110731OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.f110729OooO00o) * 31, 31, this.f110730OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyCodeFragmentArgs(fragmentType=");
        sb.append(this.f110729OooO00o);
        sb.append(", country=");
        sb.append(this.f110730OooO0O0);
        sb.append(", phone=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110731OooO0OO, ")");
    }
}
