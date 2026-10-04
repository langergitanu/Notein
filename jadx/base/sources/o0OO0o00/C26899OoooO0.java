package o0OO0o00;

import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import o0O00OOO.InterfaceC25833OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0o00.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26899OoooO0<TResult> implements InterfaceC25833OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C26889Oooo f93313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oOo0000O.OooOO0 f93314OooO0O0;

    public C26899OoooO0(C26889Oooo c26889Oooo, oOo0000O.OooOO0 oooOO02) {
        this.f93313OooO00o = c26889Oooo;
        this.f93314OooO0O0 = oooOO02;
    }

    @Override // o0O00OOO.InterfaceC25833OooO0o0
    public final void onSuccess(Object obj) {
        AuthHuaweiId authHuaweiId = (AuthHuaweiId) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("HuaweiDriveSession");
        c20358OooO00o.OooO0o0("refreshAccessToken success", new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0);
        C26889Oooo c26889Oooo = this.f93313OooO00o;
        C33609OooO0oo.OooO0OO(c33822OooO0OOOooO00o, null, null, new C26900OoooO00(c26889Oooo, authHuaweiId, null), 3);
        c26889Oooo.f93267OooO0Oo.set(true);
        this.f93314OooO0O0.resumeWith(authHuaweiId.getAccessToken());
    }
}
