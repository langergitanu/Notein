package Oooo0;

import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;

/* JADX INFO: renamed from: Oooo0.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.TextController$update$2", m80623f = "CoreText.kt", m80624l = {192}, m80625m = "invokeSuspend")
public final class C20863o00000Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC25088OooOoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f60005OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f60006OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20861o000000o f60007OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20863o00000Oo(C20861o000000o c20861o000000o, Continuation<? super C20863o00000Oo> continuation) {
        super(2, continuation);
        this.f60007OooOoO0 = c20861o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20863o00000Oo c20863o00000Oo = new C20863o00000Oo(this.f60007OooOoO0, continuation);
        c20863o00000Oo.f60005OooOo = obj;
        return c20863o00000Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25088OooOoO interfaceC25088OooOoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C20863o00000Oo) create(interfaceC25088OooOoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60006OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC25088OooOoO interfaceC25088OooOoO = (InterfaceC25088OooOoO) this.f60005OooOo;
            o00000OO o00000oo2 = this.f60007OooOoO0.f59989OooOoO0;
            if (o00000oo2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("longPressDragObserver");
                throw null;
            }
            this.f60006OooOo0o = 1;
            if (C33074OooOoO.OooO0Oo(interfaceC25088OooOoO, o00000oo2, this) == enumC32485OooO00o) {
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
