package o0ooo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0ooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31701OooOo0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113239OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113240OooO0O0;

    public C31701OooOo0(String str, String str2) {
        this.f113239OooO00o = str;
        this.f113240OooO0O0 = str2;
    }

    public static final C31701OooOo0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C31701OooOo0.class, "session_id")) {
            throw new IllegalArgumentException("Required argument \"session_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("session_id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"session_id\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("suggested_name")) {
            throw new IllegalArgumentException("Required argument \"suggested_name\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("suggested_name");
        if (string2 != null) {
            return new C31701OooOo0(string, string2);
        }
        throw new IllegalArgumentException("Argument \"suggested_name\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31701OooOo0)) {
            return false;
        }
        C31701OooOo0 c31701OooOo0 = (C31701OooOo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113239OooO00o, c31701OooOo0.f113239OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113240OooO0O0, c31701OooOo0.f113240OooO0O0);
    }

    public final int hashCode() {
        return this.f113240OooO0O0.hashCode() + (this.f113239OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRenameDialogFragmentArgs(sessionId=");
        sb.append(this.f113239OooO00o);
        sb.append(", suggestedName=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f113240OooO0O0, ")");
    }
}
