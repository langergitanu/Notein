package o0o0OOoo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OOoo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30581OooOOO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109397OooO00o;

    public C30581OooOOO(String str) {
        this.f109397OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30581OooOOO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109397OooO00o, ((C30581OooOOO) obj).f109397OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_googlePayFragment_to_cancelSubscriptionAlertDialog;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("product_id", this.f109397OooO00o);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f109397OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionGooglePayFragmentToCancelSubscriptionAlertDialog(productId="), this.f109397OooO00o, ")");
    }
}
