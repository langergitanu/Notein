package o0O00O;

import android.content.Context;
import com.hihonor.honorid.core.data.HonorAccount;
import java.util.HashMap;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static OooO00o f88142OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f88143OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f88144OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public HonorAccount f88145OooO0O0;

    public static OooO00o OooO00o(Context context) {
        OooO00o oooO00o;
        synchronized (f88143OooO0Oo) {
            try {
                if (f88142OooO0OO == null) {
                    Context applicationContext = context.getApplicationContext();
                    OooO00o oooO00o2 = new OooO00o();
                    new HashMap();
                    oooO00o2.f88144OooO00o = applicationContext;
                    f88142OooO0OO = oooO00o2;
                }
                oooO00o = f88142OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooO00o;
    }

    public final void OooO0O0(HonorAccount honorAccount) {
        C34370OooO0o0.OooO0Oo("HnIDMemCache", "saveHnAccountToCache");
        if (o0O00O0.OooO00o.OooO0O0(honorAccount)) {
            this.f88145OooO0O0 = honorAccount;
        } else {
            C34370OooO0o0.OooO0OO("HnIDMemCache", "save honorAccount is null");
            this.f88145OooO0O0 = null;
        }
    }
}
