package o0OoO0;

import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.global.R;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0OoO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28506OooO implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101069OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101070OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f101071OooO0OO;

    public C28506OooO(int i, String accessToken, String openID) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(accessToken, "accessToken");
        kotlin.jvm.internal.OooOOO0.OooO0oO(openID, "openID");
        this.f101069OooO00o = i;
        this.f101070OooO0O0 = accessToken;
        this.f101071OooO0OO = openID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28506OooO)) {
            return false;
        }
        C28506OooO c28506OooO = (C28506OooO) obj;
        return this.f101069OooO00o == c28506OooO.f101069OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101070OooO0O0, c28506OooO.f101070OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101071OooO0OO, c28506OooO.f101071OooO0OO);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_passwordLoginFragment_to_bindPhoneNumberFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("loginType", this.f101069OooO00o);
        bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, this.f101070OooO0O0);
        bundle.putString("openID", this.f101071OooO0OO);
        return bundle;
    }

    public final int hashCode() {
        return this.f101071OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.f101069OooO00o) * 31, 31, this.f101070OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionPasswordLoginFragmentToBindPhoneNumberFragment(loginType=");
        sb.append(this.f101069OooO00o);
        sb.append(", accessToken=");
        sb.append(this.f101070OooO0O0);
        sb.append(", openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101071OooO0OO, ")");
    }
}
