package o0OoO0Oo;

import android.os.Bundle;
import com.orion.notein.global.R;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0OoO0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28630OooO0OO implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101496OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f101497OooO0OO;

    public C28630OooO0OO() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28630OooO0OO)) {
            return false;
        }
        C28630OooO0OO c28630OooO0OO = (C28630OooO0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101495OooO00o, c28630OooO0OO.f101495OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101496OooO0O0, c28630OooO0OO.f101496OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f101497OooO0OO;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("product_code", this.f101495OooO00o);
        bundle.putString("coupon_id", this.f101496OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f101495OooO00o;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f101496OooO0O0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionMembershipPlansToMembershipPurchase(productCode=");
        sb.append(this.f101495OooO00o);
        sb.append(", couponId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f101496OooO0O0, ")");
    }

    public C28630OooO0OO(String str, String str2) {
        this.f101495OooO00o = str;
        this.f101496OooO0O0 = str2;
        this.f101497OooO0OO = R.id.action_membership_plans_to_membership_purchase;
    }
}
