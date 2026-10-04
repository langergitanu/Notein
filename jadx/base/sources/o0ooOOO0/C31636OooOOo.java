package o0ooOOO0;

import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.global.R;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0ooOOO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31636OooOOo implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113088OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113089OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f113090OooO0OO;

    public C31636OooOOo(String country, String phone, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(country, "country");
        kotlin.jvm.internal.OooOOO0.OooO0oO(phone, "phone");
        this.f113088OooO00o = country;
        this.f113089OooO0O0 = phone;
        this.f113090OooO0OO = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31636OooOOo)) {
            return false;
        }
        C31636OooOOo c31636OooOOo = (C31636OooOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113088OooO00o, c31636OooOOo.f113088OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113089OooO0O0, c31636OooOOo.f113089OooO0O0) && this.f113090OooO0OO.equals(c31636OooOOo.f113090OooO0OO);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57975x9da3ef22;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("country", this.f113088OooO00o);
        bundle.putString("phone", this.f113089OooO0O0);
        bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, null);
        bundle.putInt("loginType", 0);
        bundle.putString("openID", this.f113090OooO0OO);
        return bundle;
    }

    public final int hashCode() {
        return this.f113090OooO0OO.hashCode() + C20785Oooo00o.OooO00o(0, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f113088OooO00o.hashCode() * 31, 961, this.f113089OooO0O0), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionPhoneVerificationRequestFragmentToPhoneCodeLoginFragment(country=");
        sb.append(this.f113088OooO00o);
        sb.append(", phone=");
        sb.append(this.f113089OooO0O0);
        sb.append(", accessToken=null, loginType=0, openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f113090OooO0OO, ")");
    }
}
