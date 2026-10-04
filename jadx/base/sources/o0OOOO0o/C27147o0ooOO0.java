package o0OOOO0o;

import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.tencent.p610mm.opensdk.modelmsg.SendAuth;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: o0OOOO0o.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.WXAuthorizeService$authorizeOnWechatIsInstalled$1", m80623f = "WXAuthorizeService.kt", m80624l = {127}, m80625m = "invokeSuspend")
public final class C27147o0ooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94755OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94756OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f94757OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94758OooOoO0;

    /* JADX INFO: renamed from: o0OOOO0o.o0ooOO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33712OooOo0O<C27174OooO0O0<AuthorizeInfo>> f94759OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f94760OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33712OooOo0O, String str) {
            this.f94759OooO00o = interfaceC33712OooOo0O;
            this.f94760OooO0O0 = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27147o0ooOO0(String str, o0O0O00 o0o0o00, Continuation<? super C27147o0ooOO0> continuation) {
        super(2, continuation);
        this.f94758OooOoO0 = str;
        this.f94757OooOoO = o0o0o00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27147o0ooOO0 c27147o0ooOO0 = new C27147o0ooOO0(this.f94758OooOoO0, this.f94757OooOoO, continuation);
        c27147o0ooOO0.f94755OooOo = obj;
        return c27147o0ooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C27147o0ooOO0) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94756OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f94755OooOo;
            SendAuth.Req req = new SendAuth.Req();
            req.scope = "snsapi_userinfo";
            String str = this.f94758OooOoO0;
            req.state = str;
            OooO00o oooO00o = new OooO00o(interfaceC33712OooOo0O, str);
            o0O0O00 o0o0o00 = this.f94757OooOoO;
            o0o0o00.f94739OooO0OO = oooO00o;
            o0o0o00.OooO0o0().sendReq(req);
            interfaceC33712OooOo0O.OooO0o0(new C27174OooO0O0(false, null, "50000", null, 11));
            o00oO0O o00oo0o = new o00oO0O();
            this.f94756OooOo0o = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, o00oo0o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
