package o0o0OOoo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0OOoo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30582OooOOO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteinGoogleSubscriptionPurchase f109398OooO00o;

    public C30582OooOOO0() {
        this(null);
    }

    public static final C30582OooOOO0 fromBundle(Bundle bundle) {
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30582OooOOO0.class, "old_sub_purchase")) {
            noteinGoogleSubscriptionPurchase = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(NoteinGoogleSubscriptionPurchase.class) && !Serializable.class.isAssignableFrom(NoteinGoogleSubscriptionPurchase.class)) {
                throw new UnsupportedOperationException(NoteinGoogleSubscriptionPurchase.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) bundle.get("old_sub_purchase");
        }
        return new C30582OooOOO0(noteinGoogleSubscriptionPurchase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30582OooOOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109398OooO00o, ((C30582OooOOO0) obj).f109398OooO00o);
    }

    public final int hashCode() {
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = this.f109398OooO00o;
        if (noteinGoogleSubscriptionPurchase == null) {
            return 0;
        }
        return noteinGoogleSubscriptionPurchase.hashCode();
    }

    public final String toString() {
        return "GooglePayDialogFragmentArgs(oldSubPurchase=" + this.f109398OooO00o + ")";
    }

    public C30582OooOOO0(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase) {
        this.f109398OooO00o = noteinGoogleSubscriptionPurchase;
    }
}
