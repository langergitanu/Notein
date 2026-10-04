package o0oOoO0;

import android.os.Bundle;
import com.orion.notein.global.R;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0oOoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31000OooO0oo implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110717OooO0O0;

    public C31000OooO0oo(String str, String str2) {
        this.f110716OooO00o = str;
        this.f110717OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31000OooO0oo)) {
            return false;
        }
        C31000OooO0oo c31000OooO0oo = (C31000OooO0oo) obj;
        c31000OooO0oo.getClass();
        return this.f110716OooO00o.equals(c31000OooO0oo.f110716OooO00o) && this.f110717OooO0O0.equals(c31000OooO0oo.f110717OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_userSettingFragment_to_verifyCodeFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_type", 5);
        bundle.putString("country", this.f110716OooO00o);
        bundle.putString("phone", this.f110717OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f110717OooO0O0.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(5) * 31, 31, this.f110716OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionUserSettingFragmentToVerifyCodeFragment(fragmentType=5, country=");
        sb.append(this.f110716OooO00o);
        sb.append(", phone=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110717OooO0O0, ")");
    }
}
