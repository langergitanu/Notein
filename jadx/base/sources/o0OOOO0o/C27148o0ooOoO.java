package o0OOOO0o;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.domain.models.login.LoginInfo;
import com.tencent.p610mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p610mm.opensdk.diffdev.OAuthListener;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOOO0o.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.WXAuthorizeService$authorizeOnWechatIsNotInstalled$1", m80623f = "WXAuthorizeService.kt", m80624l = {134, 182}, m80625m = "invokeSuspend")
public final class C27148o0ooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94763OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94764OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94765OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f94766OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f94767OooOoOO;

    /* JADX INFO: renamed from: o0OOOO0o.o0ooOoO$OooO00o */
    public static final class OooO00o implements OAuthListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33712OooOo0O<C27174OooO0O0<AuthorizeInfo>> f94768OooO00o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33712OooOo0O) {
            this.f94768OooO00o = interfaceC33712OooOo0O;
        }

        @Override // com.tencent.p610mm.opensdk.diffdev.OAuthListener
        public final void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            if (oAuthErrCode != null) {
                C34406OooO00o.f123390OooO00o.OooO00o("onAuthGotQrcode: " + oAuthErrCode, new Object[0]);
            }
            this.f94768OooO00o.OooO0o0(new C27174OooO0O0<>(true, new AuthorizeInfo(null, str, null, 5, null), null, null, 12));
        }

        @Override // com.tencent.p610mm.opensdk.diffdev.OAuthListener
        public final void onAuthGotQrcode(String str, byte[] bArr) {
            if (str != null) {
                C34406OooO00o.f123390OooO00o.OooO00o("onAuthGotQrcode: ".concat(str), new Object[0]);
            }
            this.f94768OooO00o.OooO0o0(new C27174OooO0O0<>(true, new AuthorizeInfo(null, null, bArr, 3, null), null, null, 12));
        }

        @Override // com.tencent.p610mm.opensdk.diffdev.OAuthListener
        public final void onQrcodeScanned() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27148o0ooOoO(o0O0O00 o0o0o00, String str, String str2, Continuation<? super C27148o0ooOoO> continuation) {
        super(2, continuation);
        this.f94766OooOoO0 = o0o0o00;
        this.f94765OooOoO = str;
        this.f94767OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27148o0ooOoO c27148o0ooOoO = new C27148o0ooOoO(this.f94766OooOoO0, this.f94765OooOoO, this.f94767OooOoOO, continuation);
        c27148o0ooOoO.f94763OooOo = obj;
        return c27148o0ooOoO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C27148o0ooOoO) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (oO0o0OOo.C33711OooOo00.OooO00o(r7, r0, r18) != r2) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33712OooOo0O interfaceC33712OooOo0O;
        Object objOooO0Oo;
        String ticket;
        C27174OooO0O0 c27174OooO0O0;
        LoginInfo loginInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94764OooOo0o;
        String strOooO0Oo = "";
        o0O0O00 o0o0o00 = this.f94766OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O2 = (InterfaceC33712OooOo0O) this.f94763OooOo;
            try {
                o0OOOOO0.OooOOO0 oooOOO0 = o0o0o00.f94737OooO00o;
                this.f94763OooOo = interfaceC33712OooOo0O2;
                this.f94764OooOo0o = 1;
                objOooO0Oo = oooOOO0.OooO0Oo(this);
                if (objOooO0Oo != enumC32485OooO00o) {
                    interfaceC33712OooOo0O = interfaceC33712OooOo0O2;
                }
            } catch (Exception e) {
                e = e;
                interfaceC33712OooOo0O = interfaceC33712OooOo0O2;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("WXAuthorizeService");
                c20358OooO00o.OooO0Oo(e, "getTicket error", new Object[0]);
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f94763OooOo;
        try {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
        } catch (Exception e2) {
            e = e2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("WXAuthorizeService");
            c20358OooO00o2.OooO0Oo(e, "getTicket error", new Object[0]);
        }
        if (!((C35238OooOoO) objOooO0Oo).f126541OooO00o.OooO0OO()) {
            objOooO0Oo = null;
        }
        C35238OooOoO c35238OooOoO = (C35238OooOoO) objOooO0Oo;
        if (c35238OooOoO != null && (c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0) != null && (loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0()) != null) {
            ticket = loginInfo.getTicket();
            if (ticket == null) {
            }
            if (ticket.length() != 0) {
                interfaceC33712OooOo0O.OooO0o0(new C27174OooO0O0(false, null, LoginErrorCode.ERROR_CODE_OTHER, null, 10));
            } else {
                StringBuilder sb = new StringBuilder("appid=wxc4d946ffb632036e&noncestr=");
                OooOO0.OooO0OO.OooO0o0(sb, this.f94765OooOoO, "&sdk_ticket=", ticket, "&timestamp=");
                sb.append(this.f94767OooOoOO);
                String string = sb.toString();
                o0o0o00.getClass();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(IDevicePopManager.SHA_1);
                    messageDigest.reset();
                    Charset charsetForName = Charset.forName("UTF-8");
                    kotlin.jvm.internal.OooOOO0.OooO0o(charsetForName, "forName(...)");
                    byte[] bytes = string.getBytes(charsetForName);
                    kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                    byte[] bArrDigest = messageDigest.digest();
                    kotlin.jvm.internal.OooOOO0.OooO0o(bArrDigest, "digest(...)");
                    strOooO0Oo = o0O0O00.OooO0Oo(bArrDigest);
                } catch (UnsupportedEncodingException e3) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("WXAuthorizeService");
                    c20358OooO00o3.OooO0Oo(e3, "encrypt error2", new Object[0]);
                } catch (NoSuchAlgorithmException e4) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("WXAuthorizeService");
                    c20358OooO00o4.OooO0Oo(e4, "encrypt error1", new Object[0]);
                }
                String str = strOooO0Oo;
                o0O0O00.OooO0O0(o0o0o00).stopAuth();
                o0O0O00.OooO0O0(o0o0o00).auth("wxc4d946ffb632036e", "snsapi_userinfo", this.f94765OooOoO, this.f94767OooOoOO, str, new OooO00o(interfaceC33712OooOo0O));
            }
            o0ooOOo o0ooooo2 = new o0ooOOo(o0o0o00, 0);
            this.f94763OooOo = null;
            this.f94764OooOo0o = 2;
        }
        ticket = "";
        if (ticket.length() != 0) {
        }
        o0ooOOo o0ooooo22 = new o0ooOOo(o0o0o00, 0);
        this.f94763OooOo = null;
        this.f94764OooOo0o = 2;
    }
}
