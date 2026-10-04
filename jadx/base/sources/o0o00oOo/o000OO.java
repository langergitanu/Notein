package o0o00oOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class o000OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f107083OooO0OO;

    public o000OO(String str, String str2, String str3) {
        this.f107081OooO00o = str;
        this.f107082OooO0O0 = str2;
        this.f107083OooO0OO = str3;
    }

    public static final o000OO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", o000OO.class, "dialog_title")) {
            throw new IllegalArgumentException("Required argument \"dialog_title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("dialog_title");
        if (string != null) {
            return new o000OO(string, bundle.containsKey("dialog_hint") ? bundle.getString("dialog_hint") : "", bundle.containsKey("dialog_text") ? bundle.getString("dialog_text") : "");
        }
        throw new IllegalArgumentException("Argument \"dialog_title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OO)) {
            return false;
        }
        o000OO o000oo2 = (o000OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107081OooO00o, o000oo2.f107081OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107082OooO0O0, o000oo2.f107082OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107083OooO0OO, o000oo2.f107083OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = this.f107081OooO00o.hashCode() * 31;
        String str = this.f107082OooO0O0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f107083OooO0OO;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleEditTextDialogFragmentArgs(dialogTitle=");
        sb.append(this.f107081OooO00o);
        sb.append(", dialogHint=");
        sb.append(this.f107082OooO0O0);
        sb.append(", dialogText=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f107083OooO0OO, ")");
    }
}
