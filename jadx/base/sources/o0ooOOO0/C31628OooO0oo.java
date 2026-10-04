package o0ooOOO0;

import com.orion.notein.domain.models.login.LoginInfo;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0ooOOO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$handleBindPhoneNumber$response$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {170}, m80625m = "invokeSuspend")
public final class C31628OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<LoginInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.login.verificationcode.OooO0OO f113071OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f113072OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31626OooO0o0 f113073OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31628OooO0oo(com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO, C31626OooO0o0 c31626OooO0o0, Continuation<? super C31628OooO0oo> continuation) {
        super(2, continuation);
        this.f113071OooOo = oooO0OO;
        this.f113073OooOoO0 = c31626OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31628OooO0oo(this.f113071OooOo, this.f113073OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<LoginInfo>> continuation) {
        return ((C31628OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f113072OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO = this.f113071OooOo;
        C31623OooO0OO c31623OooO0OO = oooO0OO.f72634OooO0oO;
        int i2 = c31623OooO0OO.f113054OooO0Oo;
        C31626OooO0o0 c31626OooO0o0 = this.f113073OooOoO0;
        String str = c31626OooO0o0.f113059OooO00o;
        String str2 = c31626OooO0o0.f113060OooO0O0;
        String str3 = c31626OooO0o0.f113061OooO0OO;
        String str4 = c31623OooO0OO.f113053OooO0OO;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = c31623OooO0OO.f113055OooO0o0;
        this.f113072OooOo0o = 1;
        Object objOooO00o = oooO0OO.f72631OooO0Oo.OooO00o(i2, str, str2, str3, str4, str5, this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
