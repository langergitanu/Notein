package o0OoO0OO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: renamed from: o0OoO0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28605OooO0OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101392OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101393OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f101394OooO0OO;

    public C28605OooO0OO(int i, String str, String str2) {
        this.f101392OooO00o = i;
        this.f101393OooO0O0 = str;
        this.f101394OooO0OO = str2;
    }

    public static final C28605OooO0OO fromBundle(Bundle bundle) {
        String string;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28605OooO0OO.class, "loginType")) {
            throw new IllegalArgumentException("Required argument \"loginType\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("loginType");
        if (!bundle.containsKey(CommonConstant.KEY_ACCESS_TOKEN)) {
            throw new IllegalArgumentException("Required argument \"accessToken\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(CommonConstant.KEY_ACCESS_TOKEN);
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"accessToken\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("openID")) {
            string = bundle.getString("openID");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"openID\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C28605OooO0OO(i, string2, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28605OooO0OO)) {
            return false;
        }
        C28605OooO0OO c28605OooO0OO = (C28605OooO0OO) obj;
        return this.f101392OooO00o == c28605OooO0OO.f101392OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101393OooO0O0, c28605OooO0OO.f101393OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101394OooO0OO, c28605OooO0OO.f101394OooO0OO);
    }

    public final int hashCode() {
        return this.f101394OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.f101392OooO00o) * 31, 31, this.f101393OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginBindPhoneNumberFragmentArgs(loginType=");
        sb.append(this.f101392OooO00o);
        sb.append(", accessToken=");
        sb.append(this.f101393OooO0O0);
        sb.append(", openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101394OooO0OO, ")");
    }
}
