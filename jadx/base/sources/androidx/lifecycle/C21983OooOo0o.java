package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: androidx.lifecycle.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m80623f = "Lifecycle.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C21983OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOo f65555OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f65556OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21983OooOo0o(OooOo oooOo, Continuation<? super C21983OooOo0o> continuation) {
        super(2, continuation);
        this.f65555OooOo = oooOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C21983OooOo0o c21983OooOo0o = new C21983OooOo0o(this.f65555OooOo, continuation);
        c21983OooOo0o.f65556OooOo0o = obj;
        return c21983OooOo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C21983OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f65556OooOo0o;
        OooOo oooOo = this.f65555OooOo;
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = oooOo.f65548OooOo0o;
        if (abstractC21979OooOOo0.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65537OooOo) >= 0) {
            abstractC21979OooOOo0.OooO00o(oooOo);
        } else {
            oO00o00.OooO0OO.OooO0O0(interfaceC33636Oooo00o.OooOOO0(), null);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
