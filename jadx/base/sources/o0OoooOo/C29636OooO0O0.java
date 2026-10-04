package o0OoooOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0OoooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29636OooO0O0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f105093OooO00o;

    public C29636OooO0O0(String str) {
        this.f105093OooO00o = str;
    }

    public static final C29636OooO0O0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29636OooO0O0.class, "commentId")) {
            throw new IllegalArgumentException("Required argument \"commentId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("commentId");
        if (string != null) {
            return new C29636OooO0O0(string);
        }
        throw new IllegalArgumentException("Argument \"commentId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29636OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105093OooO00o, ((C29636OooO0O0) obj).f105093OooO00o);
    }

    public final int hashCode() {
        return this.f105093OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("CommentDeleteAlertDialogFragmentArgs(commentId="), this.f105093OooO00o, ")");
    }
}
