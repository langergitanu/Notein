package o00Oo0oo;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25052OooO0Oo;

/* JADX INFO: renamed from: o00Oo0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC25064OooO0oO implements Callable<String> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f85090OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f85091OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C25047OooO00o f85092OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f85093OooOoO0;

    public CallableC25064OooO0oO(Context context, String str, String str2, C25047OooO00o c25047OooO00o) {
        this.f85091OooOo0o = str;
        this.f85090OooOo = str2;
        this.f85093OooOoO0 = context;
        this.f85092OooOoO = c25047OooO00o;
    }

    @Override // java.util.concurrent.Callable
    public final String call() throws Exception {
        C25047OooO00o c25047OooO00o = this.f85092OooOoO;
        HashMap map = new HashMap();
        map.put("tid", this.f85091OooOo0o);
        map.put("utdid", this.f85090OooOo);
        String[] strArr = {""};
        try {
            APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f85093OooOoO0);
            ConditionVariable conditionVariable = new ConditionVariable();
            aPSecuritySdk.initToken(0, map, new C25062OooO0o(strArr, conditionVariable));
            conditionVariable.block(3000L);
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
            o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "third", "GetApdidEx", th.getClass().getName());
        }
        if (TextUtils.isEmpty(strArr[0])) {
            o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "third", "GetApdidNull", "missing token");
        }
        return strArr[0];
    }
}
