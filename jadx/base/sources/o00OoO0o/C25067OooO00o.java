package o00OoO0o;

import android.content.Context;
import android.util.Log;
import com.alipay.share.sdk.Constant;

/* JADX INFO: renamed from: o00OoO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25067OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f85095OooO00o;

    public final boolean OooO00o() {
        try {
            if (this.f85095OooO00o.getPackageManager().getPackageInfo(Constant.ZFB_PACKAGE_NAME, 64) == null) {
                return false;
            }
            Log.d("APSDK.ZFBApiImlV1", "ignore alipay app signature validation");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
