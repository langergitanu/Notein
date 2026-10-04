package o00OO0o0;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import java.util.HashMap;
import o0000OoO.C24224OooO00o;
import o00Oo.C25025OooO00o;

/* JADX INFO: renamed from: o00OO0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25000OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84816OooO00o = 0;

    public static synchronized void OooO00o(Context context, String str) {
        if (!C24224OooO00o.OooO0O0(UmidSdkWrapper.UMIDTOKEN_FILE_NAME)) {
            if (!C24224OooO00o.OooO0O0(UmidSdkWrapper.UMIDTOKEN_KEY_NAME) && context != null) {
                try {
                    String strOooO0O0 = C25025OooO00o.OooO0O0(C25025OooO00o.OooO00o(), str);
                    HashMap map = new HashMap();
                    map.put(UmidSdkWrapper.UMIDTOKEN_KEY_NAME, strOooO0O0);
                    C25001OooO0o0.OooO00o(context, UmidSdkWrapper.UMIDTOKEN_FILE_NAME, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static final long OooO0O0(float f, boolean z) {
        return ((z ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f)) << 32);
    }
}
