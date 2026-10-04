package o0Oo0ooo;

import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.coroutines.Continuation;
import o0Oo.C28022OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$onRequestCodeClick$1", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {169}, m80625m = "invokeSuspend")
public final class C28472OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseGetPhoneVerificationFragment f100872OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100873OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f100874OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100875OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28472OooO0oo(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, String str, String str2, Continuation<? super C28472OooO0oo> continuation) {
        super(2, continuation);
        this.f100872OooOo = baseGetPhoneVerificationFragment;
        this.f100875OooOoO0 = str;
        this.f100874OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28472OooO0oo(this.f100872OooOo, this.f100875OooOoO0, this.f100874OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28472OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100873OooOo0o;
        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100872OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28489OooOoO0 c28489OooOoO0OooOoOO = baseGetPhoneVerificationFragment.OooOoOO();
            this.f100873OooOo0o = 1;
            obj = c28489OooOoO0OooOoOO.OooO0o(this.f100875OooOoO0, this.f100874OooOoO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C28489OooOoO0.OooO0oo(baseGetPhoneVerificationFragment.OooOoOO(), (String) ((C28022OooOOO0) baseGetPhoneVerificationFragment.f72105OooOoOO.getValue()).f99369OooO0o.getValue(), BaseGetPhoneVerificationFragment.OooOooo(baseGetPhoneVerificationFragment.OooOoO().getText()), 4);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
