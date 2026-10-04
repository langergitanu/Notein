package o0oOoOO;

import android.os.Bundle;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0oOoOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31004OooO implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f110722OooO0OO;

    public C31004OooO() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31004OooO)) {
            return false;
        }
        C31004OooO c31004OooO = (C31004OooO) obj;
        return OooOOO0.OooO0O0(this.f110720OooO00o, c31004OooO.f110720OooO00o) && OooOOO0.OooO0O0(this.f110721OooO0O0, c31004OooO.f110721OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f110722OooO0OO;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f110720OooO00o);
        bundle.putString("originalPassword", this.f110721OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f110721OooO0O0.hashCode() + (this.f110720OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionVerifyCodeFragmentToUserSetPasswordFragment(code=");
        sb.append(this.f110720OooO00o);
        sb.append(", originalPassword=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110721OooO0O0, ")");
    }

    public C31004OooO(String code) {
        OooOOO0.OooO0oO(code, "code");
        this.f110720OooO00o = code;
        this.f110721OooO0O0 = "";
        this.f110722OooO0OO = R.id.action_verifyCodeFragment_to_userSetPasswordFragment;
    }
}
