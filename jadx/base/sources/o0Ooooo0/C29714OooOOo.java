package o0Ooooo0;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Ooooo0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29714OooOOo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f105358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f105359OooO0O0;

    public C29714OooOOo(String str, boolean z) {
        this.f105358OooO00o = str;
        this.f105359OooO0O0 = z;
    }

    public static final C29714OooOOo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29714OooOOo.class, "outlineId")) {
            throw new IllegalArgumentException("Required argument \"outlineId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("outlineId");
        if (string != null) {
            return new C29714OooOOo(string, bundle.containsKey("has_children") ? bundle.getBoolean("has_children") : false);
        }
        throw new IllegalArgumentException("Argument \"outlineId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29714OooOOo)) {
            return false;
        }
        C29714OooOOo c29714OooOOo = (C29714OooOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105358OooO00o, c29714OooOOo.f105358OooO00o) && this.f105359OooO0O0 == c29714OooOOo.f105359OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105359OooO0O0) + (this.f105358OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "OutlineDeleteAlertDialogFragmentArgs(outlineId=" + this.f105358OooO00o + ", hasChildren=" + this.f105359OooO0O0 + ")";
    }
}
