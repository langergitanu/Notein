package o0OO0o00;

import com.huawei.hms.common.ApiException;
import o0O00OOO.InterfaceC25832OooO0Oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0o00.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26901OoooO0O implements InterfaceC25832OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C26889Oooo f93320OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oOo0000O.OooOO0 f93321OooO0O0;

    public C26901OoooO0O(C26889Oooo c26889Oooo, oOo0000O.OooOO0 oooOO02) {
        this.f93320OooO00o = c26889Oooo;
        this.f93321OooO0O0 = oooOO02;
    }

    @Override // o0O00OOO.InterfaceC25832OooO0Oo
    public final void onFailure(Exception exc) {
        ApiException apiException = exc instanceof ApiException ? (ApiException) exc : null;
        Integer numValueOf = apiException != null ? Integer.valueOf(apiException.getStatusCode()) : null;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("HuaweiDriveSession");
        c20358OooO00o.OooO0Oo(exc, "refreshAccessToken failed. statusCode: " + numValueOf, new Object[0]);
        if (numValueOf != null && numValueOf.intValue() == 907135003) {
            this.f93320OooO00o.f93267OooO0Oo.set(false);
        }
        this.f93321OooO0O0.resumeWith(null);
    }
}
