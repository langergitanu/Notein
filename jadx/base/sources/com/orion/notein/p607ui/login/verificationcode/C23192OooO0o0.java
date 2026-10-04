package com.orion.notein.p607ui.login.verificationcode;

import com.orion.notein.p607ui.login.verificationcode.AbstractC23191OooO0Oo;
import kotlin.coroutines.Continuation;
import o0ooOOO0.C31639OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestViewModel$onRequestVerificationCode$1", m80623f = "PhoneVerificationRequestViewModel.kt", m80624l = {51}, m80625m = "invokeSuspend")
public final class C23192OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31639OooOo0 f72640OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f72641OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23192OooO0o0(C31639OooOo0 c31639OooOo0, Continuation<? super C23192OooO0o0> continuation) {
        super(2, continuation);
        this.f72640OooOo = c31639OooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23192OooO0o0(this.f72640OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23192OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f72641OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f72640OooOo.f113095OooO0o;
            AbstractC23191OooO0Oo.OooO00o oooO00o = AbstractC23191OooO0Oo.OooO00o.f72639OooO00o;
            this.f72641OooOo0o = 1;
            if (c33772OooooOo.emit(oooO00o, this) == enumC32485OooO00o) {
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
