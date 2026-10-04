package com.orion.notein.p607ui.noteeditor.hyperlinkeditor;

import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import kotlin.coroutines.Continuation;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkViewModel$postProcessUiStateChange$5", m80623f = "HyperLinkViewModel.kt", m80624l = {245}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74597OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74598OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f74599OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO00o f74600OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31284OooO0O0 f74601OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31284OooO0O0 f74602OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO0OO oooO0OO, OooO0OO.OooO00o oooO00o, OooO0OO.OooO0O0 oooO0O0, InterfaceC31284OooO0O0 interfaceC31284OooO0O0, InterfaceC31284OooO0O0 interfaceC31284OooO0O02, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f74597OooOo = oooO0OO;
        this.f74600OooOoO0 = oooO00o;
        this.f74599OooOoO = oooO0O0;
        this.f74601OooOoOO = interfaceC31284OooO0O0;
        this.f74602OooOoo0 = interfaceC31284OooO0O02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f74597OooOo, this.f74600OooOoO0, this.f74599OooOoO, this.f74601OooOoOO, this.f74602OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74598OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f74597OooOo.f74554OooO;
            C32449OooOOoo c32449OooOOoo = new C32449OooOOoo(this.f74600OooOoO0, this.f74599OooOoO, new C32443OooOOO(this.f74601OooOoOO, this.f74602OooOoo0));
            this.f74598OooOo0o = 1;
            if (c33772OooooOo.emit(c32449OooOOoo, this) == enumC32485OooO00o) {
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
