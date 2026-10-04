package o0ooOOO0;

import android.os.Bundle;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.global.R;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0ooOOO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31637OooOOo0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f113093OooO0OO;

    public C31637OooOOo0(int i, String accessToken, String openID) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(accessToken, "accessToken");
        kotlin.jvm.internal.OooOOO0.OooO0oO(openID, "openID");
        this.f113091OooO00o = i;
        this.f113092OooO0O0 = accessToken;
        this.f113093OooO0OO = openID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31637OooOOo0)) {
            return false;
        }
        C31637OooOOo0 c31637OooOOo0 = (C31637OooOOo0) obj;
        return this.f113091OooO00o == c31637OooOOo0.f113091OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113092OooO0O0, c31637OooOOo0.f113092OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113093OooO0OO, c31637OooOOo0.f113093OooO0OO);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57973xc97937c6;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("loginType", this.f113091OooO00o);
        bundle.putString(CommonConstant.KEY_ACCESS_TOKEN, this.f113092OooO0O0);
        bundle.putString("openID", this.f113093OooO0OO);
        return bundle;
    }

    public final int hashCode() {
        return this.f113093OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.f113091OooO00o) * 31, 31, this.f113092OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionPhoneVerificationRequestFragmentToBindPhoneNumberFragment(loginType=");
        sb.append(this.f113091OooO00o);
        sb.append(", accessToken=");
        sb.append(this.f113092OooO0O0);
        sb.append(", openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f113093OooO0OO, ")");
    }
}
