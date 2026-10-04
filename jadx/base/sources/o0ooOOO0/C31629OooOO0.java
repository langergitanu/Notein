package o0ooOOO0;

import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.C27133OoooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0ooOOO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$handleLogin$resultCode$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {124}, m80625m = "invokeSuspend")
public final class C31629OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.login.verificationcode.OooO0OO f113074OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f113075OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31626OooO0o0 f113076OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31629OooOO0(com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO, C31626OooO0o0 c31626OooO0o0, Continuation<? super C31629OooOO0> continuation) {
        super(2, continuation);
        this.f113074OooOo = oooO0OO;
        this.f113076OooOoO0 = c31626OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31629OooOO0(this.f113074OooOo, this.f113076OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C31629OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f113075OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OO = this.f113074OooOo;
        C31626OooO0o0 c31626OooO0o0 = this.f113076OooOoO0;
        String str = c31626OooO0o0.f113059OooO00o;
        String str2 = c31626OooO0o0.f113060OooO0O0;
        String str3 = c31626OooO0o0.f113061OooO0OO;
        this.f113075OooOo0o = 1;
        C27129OoooOOO c27129OoooOOO = oooO0OO.f72631OooO0Oo;
        c27129OoooOOO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27133OoooOoo(c27129OoooOOO, str, str2, str3, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
