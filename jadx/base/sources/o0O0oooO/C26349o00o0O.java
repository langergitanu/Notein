package o0O0oooO;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0O0oooO.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26349o00o0O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteinGoogleSubscriptionPurchase f90428OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f90429OooO0O0;

    public C26349o00o0O() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26349o00o0O) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90428OooO00o, ((C26349o00o0O) obj).f90428OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f90429OooO0O0;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(NoteinGoogleSubscriptionPurchase.class);
        Parcelable parcelable = this.f90428OooO00o;
        if (zIsAssignableFrom) {
            bundle.putParcelable("old_sub_purchase", parcelable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(NoteinGoogleSubscriptionPurchase.class)) {
            bundle.putSerializable("old_sub_purchase", (Serializable) parcelable);
        }
        return bundle;
    }

    public final int hashCode() {
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = this.f90428OooO00o;
        if (noteinGoogleSubscriptionPurchase == null) {
            return 0;
        }
        return noteinGoogleSubscriptionPurchase.hashCode();
    }

    public final String toString() {
        return "ActionGlobalGooglePayDialogFragment(oldSubPurchase=" + this.f90428OooO00o + ")";
    }

    public C26349o00o0O(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase) {
        this.f90428OooO00o = noteinGoogleSubscriptionPurchase;
        this.f90429OooO0O0 = R.id.action_global_googlePayDialogFragment;
    }
}
