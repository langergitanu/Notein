package o0OoO0OO;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28606OooO0Oo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f101397OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f101398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f101399OooO0o0;

    public C28606OooO0Oo(int i, String country, String phone, String str, String str2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(country, "country");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phone, "phone");
        this.f101395OooO00o = country;
        this.f101396OooO0O0 = phone;
        this.f101397OooO0OO = str;
        this.f101398OooO0Oo = i;
        this.f101399OooO0o0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28606OooO0Oo)) {
            return false;
        }
        C28606OooO0Oo c28606OooO0Oo = (C28606OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101395OooO00o, c28606OooO0Oo.f101395OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101396OooO0O0, c28606OooO0Oo.f101396OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101397OooO0OO, c28606OooO0Oo.f101397OooO0OO) && this.f101398OooO0Oo == c28606OooO0Oo.f101398OooO0Oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101399OooO0o0, c28606OooO0Oo.f101399OooO0o0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_to_phoneCodeLoginFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("country", this.f101395OooO00o);
        bundle.putString("phone", this.f101396OooO0O0);
        bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, this.f101397OooO0OO);
        bundle.putInt("loginType", this.f101398OooO0Oo);
        bundle.putString("openID", this.f101399OooO0o0);
        return bundle;
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f101395OooO00o.hashCode() * 31, 31, this.f101396OooO0O0);
        String str = this.f101397OooO0OO;
        return this.f101399OooO0o0.hashCode() + C20785Oooo00o.OooO00o(this.f101398OooO0Oo, (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToPhoneCodeLoginFragment(country=");
        sb.append(this.f101395OooO00o);
        sb.append(", phone=");
        sb.append(this.f101396OooO0O0);
        sb.append(", accessToken=");
        sb.append(this.f101397OooO0OO);
        sb.append(", loginType=");
        sb.append(this.f101398OooO0Oo);
        sb.append(", openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101399OooO0o0, ")");
    }
}
