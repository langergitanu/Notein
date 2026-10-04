package o0O0OoO0;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.internal.ClientSettings;

/* JADX INFO: renamed from: o0O0OoO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25897OooO0OO extends Api.AbstractClientBuilder {
    @Override // com.oplus.ocs.base.common.api.Api.AbstractClientBuilder
    public final Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj) {
        Log.d("PMClientBuilder", "buildClient");
        return new C25896OooO0O0(context, looper);
    }
}
