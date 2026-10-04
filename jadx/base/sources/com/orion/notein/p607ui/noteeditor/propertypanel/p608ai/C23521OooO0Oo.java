package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$vectorizePdfFile$1", m80623f = "EditorAiViewModel.kt", m80624l = {697}, m80625m = "invokeSuspend")
public final class C23521OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f75699OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f75700OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23521OooO0Oo(OooO00o oooO00o, Continuation<? super C23521OooO0Oo> continuation) {
        super(2, continuation);
        this.f75699OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23521OooO0Oo(this.f75699OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23521OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f75700OooOo0o;
        OooO00o oooO00o = this.f75699OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (oooO00o.f75600OooOOO == null) {
                oooO00o.OooOOO(OooO00o.OooO0O0.OooO0OO.f75644OooO00o, "400001");
                return C32460OooOooO.f116667OooO00o;
            }
            this.f75700OooOo0o = 1;
            obj = Boolean.TRUE;
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            oooO00o.OooOOO(OooO00o.OooO0O0.OooO0o.f75646OooO00o, null);
        } else {
            oooO00o.OooOOO(OooO00o.OooO0O0.OooO0o0.f75647OooO00o, "400007");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
