package o0O0oooO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0O0oooO.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26313o00000Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC26277OooOoOO f90158OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26313o00000Oo(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C26320o0000OoO c26320o0000OoO, Continuation continuation) {
        super(2, continuation);
        this.f90158OooOo0o = abstractApplicationC26277OooOoOO;
        this.f90157OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26313o00000Oo(this.f90158OooOo0o, this.f90157OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26313o00000Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean zOooO00o = C26256OooO0o.OooO00o(this.f90158OooOo0o);
        C33781o00o0O c33781o00o0O = this.f90157OooOo.f90230OooOooO;
        Boolean boolValueOf = Boolean.valueOf(zOooO00o);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
        return C32460OooOooO.f116667OooO00o;
    }
}
