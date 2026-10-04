package o00Oo0oO;

import com.alipay.sdk.app.APayEntranceActivity;

/* JADX INFO: renamed from: o00Oo0oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25054OooO0oO implements APayEntranceActivity.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f85058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f85059OooO0O0;

    public C25054OooO0oO(OooOO0 oooOO02, Object obj) {
        this.f85059OooO0O0 = oooOO02;
        this.f85058OooO00o = obj;
    }

    @Override // com.alipay.sdk.app.APayEntranceActivity.OooO00o
    /* JADX INFO: renamed from: a */
    public final void mo224a(String str) {
        this.f85059OooO0O0.f85069OooO0oo = str;
        synchronized (this.f85058OooO00o) {
            try {
                this.f85058OooO00o.notify();
            } finally {
            }
        }
    }
}
