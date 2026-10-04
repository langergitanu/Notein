package o0oO0O00;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oO0O00.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30770OooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110037OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110038OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110039OooO0OO;

    public C30770OooO() {
        this("+86", "18310009230", "");
    }

    public static final C30770OooO fromBundle(Bundle bundle) {
        String string;
        String string2;
        String string3;
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C30770OooO.class, "countryCode")) {
            string = bundle.getString("countryCode");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"countryCode\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "+86";
        }
        if (bundle.containsKey("number")) {
            string2 = bundle.getString("number");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"number\" is marked as non-null but was passed a null value.");
            }
        } else {
            string2 = "18310009230";
        }
        if (bundle.containsKey("verificationCode")) {
            string3 = bundle.getString("verificationCode");
            if (string3 == null) {
                throw new IllegalArgumentException("Argument \"verificationCode\" is marked as non-null but was passed a null value.");
            }
        } else {
            string3 = "";
        }
        return new C30770OooO(string, string2, string3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30770OooO)) {
            return false;
        }
        C30770OooO c30770OooO = (C30770OooO) obj;
        return OooOOO0.OooO0O0(this.f110037OooO00o, c30770OooO.f110037OooO00o) && OooOOO0.OooO0O0(this.f110038OooO0O0, c30770OooO.f110038OooO0O0) && OooOOO0.OooO0O0(this.f110039OooO0OO, c30770OooO.f110039OooO0OO);
    }

    public final int hashCode() {
        return this.f110039OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110037OooO00o.hashCode() * 31, 31, this.f110038OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPasswordFragmentArgs(countryCode=");
        sb.append(this.f110037OooO00o);
        sb.append(", number=");
        sb.append(this.f110038OooO0O0);
        sb.append(", verificationCode=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110039OooO0OO, ")");
    }

    public C30770OooO(String countryCode, String number, String verificationCode) {
        OooOOO0.OooO0oO(countryCode, "countryCode");
        OooOOO0.OooO0oO(number, "number");
        OooOOO0.OooO0oO(verificationCode, "verificationCode");
        this.f110037OooO00o = countryCode;
        this.f110038OooO0O0 = number;
        this.f110039OooO0OO = verificationCode;
    }
}
