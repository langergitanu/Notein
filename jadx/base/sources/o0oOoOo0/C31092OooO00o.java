package o0oOoOo0;

import android.os.Bundle;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0oOoOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31092OooO00o implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110979OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110980OooO0O0;

    public C31092OooO00o(String country, String phone) {
        OooOOO0.OooO0oO(country, "country");
        OooOOO0.OooO0oO(phone, "phone");
        this.f110979OooO00o = country;
        this.f110980OooO0O0 = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31092OooO00o)) {
            return false;
        }
        C31092OooO00o c31092OooO00o = (C31092OooO00o) obj;
        c31092OooO00o.getClass();
        return OooOOO0.OooO0O0(this.f110979OooO00o, c31092OooO00o.f110979OooO00o) && OooOOO0.OooO0O0(this.f110980OooO0O0, c31092OooO00o.f110980OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_userBindPhoneFragment_to_verifyCodeFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_type", 3);
        bundle.putString("country", this.f110979OooO00o);
        bundle.putString("phone", this.f110980OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f110980OooO0O0.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(3) * 31, 31, this.f110979OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionUserBindPhoneFragmentToVerifyCodeFragment(fragmentType=3, country=");
        sb.append(this.f110979OooO00o);
        sb.append(", phone=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110980OooO0O0, ")");
    }
}
