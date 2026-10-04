package o0OO0o00;

import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import o0oo0Oo.C31243OooO0o;

/* JADX INFO: renamed from: o0OO0o00.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26885OooOoo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f93256OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f93257OooOo0o;

    public /* synthetic */ C26885OooOoo(Object obj, int i) {
        this.f93257OooOo0o = i;
        this.f93256OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f93257OooOo0o) {
            case 0:
                C26889Oooo c26889Oooo = (C26889Oooo) this.f93256OooOo;
                return HuaweiIdAuthManager.getService(c26889Oooo.f93264OooO00o, (HuaweiIdAuthParams) c26889Oooo.f93269OooO0o0.getValue());
            default:
                return Double.valueOf(C31243OooO0o.OooOOo0(((C31243OooO0o) this.f93256OooOo).f111451OooOOo, "pressure_correct"));
        }
    }
}
