package o0O0oooO;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27560o00oOOoO;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$downloadCorrectMeetingThemes$1", m80623f = "UserViewModel.kt", m80624l = {751, 752}, m80625m = "invokeSuspend")
public final class o0000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90150OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90151OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90150OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0000(continuation, this.f90150OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90151OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f90151OooOo0o = 1;
            if (C33644OoooO0.OooO00o(3000L, this) != obj2) {
            }
            return obj2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27570o00oOoo0 c27570o00oOoo0 = this.f90150OooOo.f90206OooO0o;
        this.f90151OooOo0o = 2;
        c27570o00oOoo0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27560o00oOOoO(c27570o00oOoo0, null), this);
        if (objOooO0o != obj2) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
    }
}
