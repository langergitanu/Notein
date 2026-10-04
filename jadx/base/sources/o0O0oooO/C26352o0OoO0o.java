package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooO.o0OoO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$user$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26352o0OoO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90448OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f90449OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26352o0OoO0o(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90448OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26352o0OoO0o c26352o0OoO0o = new C26352o0OoO0o(continuation, this.f90448OooOo);
        c26352o0OoO0o.f90449OooOo0o = obj;
        return c26352o0OoO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
        return ((C26352o0OoO0o) create(noteinFirebaseUser, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f90449OooOo0o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("UserViewModel");
        c20358OooO00o.OooO0o0("user: " + noteinFirebaseUser, new Object[0]);
        C26320o0000OoO c26320o0000OoO = this.f90448OooOo;
        c26320o0000OoO.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c26320o0000OoO);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C26323o0000o0(noteinFirebaseUser, c26320o0000OoO, null), 2);
        return C32460OooOooO.f116667OooO00o;
    }
}
