package o0ooOOO0;

import OooOooo.C20785Oooo00o;
import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: renamed from: o0ooOOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31623OooO0OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113051OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113052OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f113053OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f113054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f113055OooO0o0;

    public C31623OooO0OO(int i, String str, String str2, String str3, String str4) {
        this.f113051OooO00o = str;
        this.f113052OooO0O0 = str2;
        this.f113053OooO0OO = str3;
        this.f113054OooO0Oo = i;
        this.f113055OooO0o0 = str4;
    }

    public static final C31623OooO0OO fromBundle(Bundle bundle) {
        String string;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C31623OooO0OO.class, "country")) {
            throw new IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("country");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("phone")) {
            throw new IllegalArgumentException("Required argument \"phone\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("phone");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
        }
        String string4 = bundle.containsKey(CommonConstant.KEY_ACCESS_TOKEN) ? bundle.getString(CommonConstant.KEY_ACCESS_TOKEN) : null;
        int i = bundle.containsKey("loginType") ? bundle.getInt("loginType") : 0;
        if (bundle.containsKey("openID")) {
            string = bundle.getString("openID");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"openID\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C31623OooO0OO(i, string2, string3, string4, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31623OooO0OO)) {
            return false;
        }
        C31623OooO0OO c31623OooO0OO = (C31623OooO0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113051OooO00o, c31623OooO0OO.f113051OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113052OooO0O0, c31623OooO0OO.f113052OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113053OooO0OO, c31623OooO0OO.f113053OooO0OO) && this.f113054OooO0Oo == c31623OooO0OO.f113054OooO0Oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113055OooO0o0, c31623OooO0OO.f113055OooO0o0);
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f113051OooO00o.hashCode() * 31, 31, this.f113052OooO0O0);
        String str = this.f113053OooO0OO;
        return this.f113055OooO0o0.hashCode() + C20785Oooo00o.OooO00o(this.f113054OooO0Oo, (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneCodeLoginFragmentArgs(country=");
        sb.append(this.f113051OooO00o);
        sb.append(", phone=");
        sb.append(this.f113052OooO0O0);
        sb.append(", accessToken=");
        sb.append(this.f113053OooO0OO);
        sb.append(", loginType=");
        sb.append(this.f113054OooO0Oo);
        sb.append(", openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f113055OooO0o0, ")");
    }
}
