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

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkViewModel$postProcessUiStateChange$2", m80623f = "HyperLinkViewModel.kt", m80624l = {231}, m80625m = "invokeSuspend")
public final class C23427OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74603OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74604OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f74605OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO00o f74606OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31284OooO0O0 f74607OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31284OooO0O0 f74608OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23427OooO0o0(OooO0OO oooO0OO, OooO0OO.OooO00o oooO00o, OooO0OO.OooO0O0 oooO0O0, InterfaceC31284OooO0O0 interfaceC31284OooO0O0, InterfaceC31284OooO0O0 interfaceC31284OooO0O02, Continuation<? super C23427OooO0o0> continuation) {
        super(2, continuation);
        this.f74603OooOo = oooO0OO;
        this.f74606OooOoO0 = oooO00o;
        this.f74605OooOoO = oooO0O0;
        this.f74607OooOoOO = interfaceC31284OooO0O0;
        this.f74608OooOoo0 = interfaceC31284OooO0O02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23427OooO0o0(this.f74603OooOo, this.f74606OooOoO0, this.f74605OooOoO, this.f74607OooOoOO, this.f74608OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23427OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74604OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f74603OooOo.f74554OooO;
            C32449OooOOoo c32449OooOOoo = new C32449OooOOoo(this.f74606OooOoO0, this.f74605OooOoO, new C32443OooOOO(this.f74607OooOoOO, this.f74608OooOoo0));
            this.f74604OooOo0o = 1;
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
