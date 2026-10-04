package o0O0oooO;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26524o00000o0;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.NightModeViewModel$isNightMode$2", m80623f = "NightModeViewModel.kt", m80624l = {19}, m80625m = "invokeSuspend")
public final class oo000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26350o00oO0o f90454OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90455OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(C26350o00oO0o c26350o00oO0o, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f90454OooOo = c26350o00oO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new oo000o(this.f90454OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((oo000o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90455OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26350o00oO0o c26350o00oO0o = this.f90454OooOo;
        AbstractC24338OooO0o0.OooO00o<Integer> key = App.f69556Oooo0oo;
        C26577o000oo0O c26577o000oo0O = c26350o00oO0o.f90433OooO0Oo;
        c26577o000oo0O.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        C26524o00000o0 c26524o00000o0 = new C26524o00000o0(new o0OO00o0.oo000o(c26577o000oo0O.f91598OooO00o.getData(), key), c26577o000oo0O, 0);
        this.f90455OooOo0o = 1;
        Object objOooOOo = C25252OooO0Oo.OooOOo(c26524o00000o0, this);
        return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
    }
}
