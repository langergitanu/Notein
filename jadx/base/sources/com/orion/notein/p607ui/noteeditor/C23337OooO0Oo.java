package com.orion.notein.p607ui.noteeditor;

import com.orion.notein.p607ui.noteeditor.OooO0OO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$isTextStyleBarVisibleState$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23337OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<OooO0OO.OooO00o, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f73489OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ OooO0OO.OooO00o f73490OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(OooO0OO.OooO00o oooO00o, Boolean bool, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C23337OooO0Oo c23337OooO0Oo = new C23337OooO0Oo(3, continuation);
        c23337OooO0Oo.f73490OooOo0o = oooO00o;
        c23337OooO0Oo.f73489OooOo = zBooleanValue;
        return c23337OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(this.f73490OooOo0o == OooO0OO.OooO00o.f73440OooOo && !this.f73489OooOo);
    }
}
