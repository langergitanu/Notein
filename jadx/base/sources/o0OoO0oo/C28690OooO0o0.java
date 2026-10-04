package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0OoO0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28690OooO0o0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101649OooO00o;

    public C28690OooO0o0(String str) {
        this.f101649OooO00o = str;
    }

    public static final C28690OooO0o0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28690OooO0o0.class, "pageId")) {
            throw new IllegalArgumentException("Required argument \"pageId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("pageId");
        if (string != null) {
            return new C28690OooO0o0(string);
        }
        throw new IllegalArgumentException("Argument \"pageId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28690OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101649OooO00o, ((C28690OooO0o0) obj).f101649OooO00o);
    }

    public final int hashCode() {
        return this.f101649OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ClearPageAlertDialogFragmentArgs(pageId="), this.f101649OooO00o, ")");
    }
}
