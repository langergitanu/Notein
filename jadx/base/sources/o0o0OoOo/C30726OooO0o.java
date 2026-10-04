package o0o0OoOo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26686o00ooo;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OoOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$getDisableInkPenSync$2", m80623f = "DebugViewModel.kt", m80624l = {795}, m80625m = "invokeSuspend")
public final class C30726OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109897OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109898OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30726OooO0o(C30722OooO00o c30722OooO00o, Continuation<? super C30726OooO0o> continuation) {
        super(2, continuation);
        this.f109897OooOo = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30726OooO0o(this.f109897OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30726OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109898OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C30722OooO00o c30722OooO00o = this.f109897OooOo;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95022OooOo0O;
        this.f109898OooOo0o = 1;
        Object objOooOOo = C25252OooO0Oo.OooOOo(new C26686o00ooo(c30722OooO00o.f109875OooOo0.f91598OooO00o.getData(), oooO00o), this);
        return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
    }
}
