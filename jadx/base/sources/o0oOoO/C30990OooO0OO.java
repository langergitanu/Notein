package o0oOoO;

import android.os.Bundle;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0oOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30990OooO0OO implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110690OooO0O0;

    public C30990OooO0OO(String country, String phone) {
        OooOOO0.OooO0oO(country, "country");
        OooOOO0.OooO0oO(phone, "phone");
        this.f110689OooO00o = country;
        this.f110690OooO0O0 = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30990OooO0OO)) {
            return false;
        }
        C30990OooO0OO c30990OooO0OO = (C30990OooO0OO) obj;
        c30990OooO0OO.getClass();
        return OooOOO0.OooO0O0(this.f110689OooO00o, c30990OooO0OO.f110689OooO00o) && OooOOO0.OooO0O0(this.f110690OooO0O0, c30990OooO0OO.f110690OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_requestOldPhoneCodeFragment_to_verifyCodeFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_type", 1);
        bundle.putString("country", this.f110689OooO00o);
        bundle.putString("phone", this.f110690OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f110690OooO0O0.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(1) * 31, 31, this.f110689OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionRequestOldPhoneCodeFragmentToVerifyCodeFragment(fragmentType=1, country=");
        sb.append(this.f110689OooO00o);
        sb.append(", phone=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110690OooO0O0, ")");
    }
}
