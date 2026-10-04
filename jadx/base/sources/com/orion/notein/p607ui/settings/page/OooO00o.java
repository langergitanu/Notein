package com.orion.notein.p607ui.settings.page;

import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.BasePageOptionFragment$inflateOptions$1$3$1", m80623f = "BasePageOptionFragment.kt", m80624l = {80}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BasePageOptionFragment<Object> f79223OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f79224OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BasePageOptionFragment.OooO0O0<Object> f79225OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(BasePageOptionFragment<Object> basePageOptionFragment, BasePageOptionFragment.OooO0O0<Object> oooO0O0, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f79223OooOo = basePageOptionFragment;
        this.f79225OooOoO0 = oooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f79223OooOo, this.f79225OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f79224OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Object obj2 = this.f79225OooOoO0.f79192OooO0Oo;
            this.f79224OooOo0o = 1;
            if (this.f79223OooOo.OooOoO(obj2, this) == enumC32485OooO00o) {
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
