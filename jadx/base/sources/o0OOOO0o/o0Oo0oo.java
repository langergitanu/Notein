package o0OOOO0o;

import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.tencent.p610mm.opensdk.modelbase.BaseReq;
import com.tencent.p610mm.opensdk.modelbase.BaseResp;
import com.tencent.p610mm.opensdk.modelmsg.SendAuth;
import com.tencent.p610mm.opensdk.openapi.IWXAPIEventHandler;
import o0OOOO0o.C27147o0ooOO0;
import o0OOOo0.C27174OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o0Oo0oo implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f94751OooOo0o;

    public o0Oo0oo(o0O0O00 o0o0o00) {
        this.f94751OooOo0o = o0o0o00;
    }

    @Override // com.tencent.p610mm.opensdk.openapi.IWXAPIEventHandler
    public final void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.p610mm.opensdk.openapi.IWXAPIEventHandler
    public final void onResp(BaseResp baseResp) {
        C27147o0ooOO0.OooO00o oooO00o;
        SendAuth.Resp resp = null;
        SendAuth.Resp resp2 = baseResp instanceof SendAuth.Resp ? (SendAuth.Resp) baseResp : null;
        if (resp2 != null) {
            String str = resp2.code;
            o0O0O00 o0o0o00 = this.f94751OooOo0o;
            if (str != null && str.length() != 0) {
                String str2 = resp2.state;
                C27147o0ooOO0.OooO00o oooO00o2 = o0o0o00.f94739OooO0OO;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str2, oooO00o2 != null ? oooO00o2.f94760OooO0O0 : null)) {
                    resp = resp2;
                }
            }
            if (resp == null || (oooO00o = o0o0o00.f94739OooO0OO) == null) {
                return;
            }
            String code = resp.code;
            kotlin.jvm.internal.OooOOO0.OooO0o(code, "code");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("WXAuthorizeService");
            c20358OooO00o.OooO0o0("get authCode success!", new Object[0]);
            oooO00o.f94759OooO00o.OooO0o0(new C27174OooO0O0<>(true, new AuthorizeInfo(null, code, null, 5, null), null, null, 12));
        }
    }
}
