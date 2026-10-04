package com.google.android.gms.common.api;

import OooOo.AbstractC20474OooO0o0;
import OooOo.OooO00o;
import OooOoo.C20593OooO0Oo;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class AvailabilityException extends Exception {
    private final OooOo.OooO00o zaa;

    public AvailabilityException(OooOo.OooO00o oooO00o) {
        this.zaa = oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        OooOo.OooO00o oooO00o = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        V v = oooO00o.get(apiKey);
        Preconditions.checkArgument(v != 0, C20593OooO0Oo.OooO0O0("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((OooO00o.OooO0OO) this.zaa.keySet()).iterator();
        boolean z = true;
        while (true) {
            AbstractC20474OooO0o0 abstractC20474OooO0o0 = (AbstractC20474OooO0o0) it;
            if (!abstractC20474OooO0o0.hasNext()) {
                break;
            }
            ApiKey apiKey = (ApiKey) abstractC20474OooO0o0.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        OooOo.OooO00o oooO00o = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        V v = oooO00o.get(apiKey);
        Preconditions.checkArgument(v != 0, C20593OooO0Oo.OooO0O0("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
