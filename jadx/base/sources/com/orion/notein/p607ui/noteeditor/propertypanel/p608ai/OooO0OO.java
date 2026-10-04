package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o;
import kotlin.coroutines.Continuation;
import o0OoooO.C29629OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$uploadPdfFile$2", m80623f = "EditorAiViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_3}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f75697OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f75698OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO00o oooO00o, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f75697OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f75697OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f75698OooOo0o;
        OooO00o oooO00o = this.f75697OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C29629OooOOo0 c29629OooOOo0 = oooO00o.f75600OooOOO;
            if (c29629OooOOo0 == null) {
                oooO00o.OooOOO(OooO00o.OooO0O0.OooO0OO.f75644OooO00o, "400001");
                return C32460OooOooO.f116667OooO00o;
            }
            this.f75698OooOo0o = 1;
            obj = c29629OooOOo0.OooOOO0(this);
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
            oooO00o.OooOOO(OooO00o.OooO0O0.C23515OooO0Oo.f75645OooO00o, null);
        } else {
            oooO00o.OooOOO(OooO00o.OooO0O0.OooO0OO.f75644OooO00o, "400006");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
