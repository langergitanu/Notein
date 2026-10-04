package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.android.billingclient.api.C22172OooOoO;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class zbd implements Api.ApiOptions.Optional {
    public static final zbd zba = new zbd(new zbc());
    private final String zbb = null;
    private final boolean zbc;
    private final String zbd;

    public zbd(zbc zbcVar) {
        this.zbc = zbcVar.zba.booleanValue();
        this.zbd = zbcVar.zbb;
    }

    public static /* bridge */ /* synthetic */ String zbb(zbd zbdVar) {
        String str = zbdVar.zbb;
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        String str = zbdVar.zbb;
        return Objects.equal(null, null) && this.zbc == zbdVar.zbc && Objects.equal(this.zbd, zbdVar.zbd);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.zbc), this.zbd);
    }

    public final Bundle zba() {
        Bundle bundleOooO00o = C22172OooOoO.OooO00o("consumer_package", null);
        bundleOooO00o.putBoolean("force_save_dialog", this.zbc);
        bundleOooO00o.putString("log_session_id", this.zbd);
        return bundleOooO00o;
    }
}
