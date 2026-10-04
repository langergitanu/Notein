package o00Oo0oO;

import OooOooO.C20741OooOOoo;
import com.alipay.sdk.app.AlipayResultActivity;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements AlipayResultActivity.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f85056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f85057OooO0O0;

    public OooO0o(OooOO0 oooOO02, CountDownLatch countDownLatch) {
        this.f85057OooO0O0 = oooOO02;
        this.f85056OooO00o = countDownLatch;
    }

    @Override // com.alipay.sdk.app.AlipayResultActivity.OooO00o
    public final void OooO00o(int i, String str, String str2) {
        this.f85057OooO0O0.f85068OooO0oO = C20741OooOOoo.OooO0OO(i, str, str2);
        this.f85056OooO00o.countDown();
    }
}
