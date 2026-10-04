package o0OO0oO;

import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSPlainTextAKSKCredentialProvider;
import o0oo0OoO.C31274OooO0oO;
import o0oo0Ooo.C31278OooO00o;
import o0oo0Ooo.EnumC31282OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOO0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f93541OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f93542OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f93542OooOo0o = i;
        this.f93541OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f93542OooOo0o) {
            case 0:
                return new OSSClient(((OooOO0O) this.f93541OooOo).f93544OooO0O0.getApplicationContext(), "http://oss-accelerate.aliyuncs.com", new OSSPlainTextAKSKCredentialProvider("LTAI5tHMyPfH1b94DuMmrU9v", "Z4sb5lFLOSWOPUMJQZB05x8imJ4h9n"));
            default:
                C31278OooO00o c31278OooO00o = C31278OooO00o.f111677OooO00o;
                C31274OooO0oO c31274OooO0oO = (C31274OooO0oO) this.f93541OooOo;
                return c31278OooO00o.OooO00o(c31274OooO0oO.f111667OooOoo0, c31274OooO0oO.f111666OooOoo, EnumC31282OooO0o0.f111695OooOoO0);
        }
    }
}
