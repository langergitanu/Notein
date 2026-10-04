package o0o0OOoo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o0OOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30572OooO0OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109379OooO00o;

    public C30572OooO0OO(String str) {
        this.f109379OooO00o = str;
    }

    public static final C30572OooO0OO fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C30572OooO0OO.class, "product_id")) {
            return new C30572OooO0OO(bundle.getString("product_id"));
        }
        throw new IllegalArgumentException("Required argument \"product_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30572OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109379OooO00o, ((C30572OooO0OO) obj).f109379OooO00o);
    }

    public final int hashCode() {
        String str = this.f109379OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("CancelSubscriptionAlertDialogArgs(productId="), this.f109379OooO00o, ")");
    }
}
