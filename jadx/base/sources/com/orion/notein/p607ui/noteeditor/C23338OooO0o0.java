package com.orion.notein.p607ui.noteeditor;

import com.orion.notein.p607ui.noteeditor.OooO0OO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$specialEditState$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23338OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<OooO0OO.OooO00o, Boolean, Continuation<? super OooO0OO.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f73496OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ OooO0OO.OooO00o f73497OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(OooO0OO.OooO00o oooO00o, Boolean bool, Continuation<? super OooO0OO.OooO00o> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C23338OooO0o0 c23338OooO0o0 = new C23338OooO0o0(3, continuation);
        c23338OooO0o0.f73497OooOo0o = oooO00o;
        c23338OooO0o0.f73496OooOo = zBooleanValue;
        return c23338OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return this.f73496OooOo ? OooO0OO.OooO00o.f73444OooOoOO : this.f73497OooOo0o;
    }
}
