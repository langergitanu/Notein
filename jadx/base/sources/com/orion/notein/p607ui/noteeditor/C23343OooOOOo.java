package com.orion.notein.p607ui.noteeditor;

import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onPageCleared$1", m80623f = "NoteEditorFragment.kt", m80624l = {477}, m80625m = "invokeSuspend")
public final class C23343OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73541OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73542OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f73543OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23343OooOOOo(NoteEditorFragment noteEditorFragment, String str, Continuation<? super C23343OooOOOo> continuation) {
        super(2, continuation);
        this.f73541OooOo = noteEditorFragment;
        this.f73543OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23343OooOOOo(this.f73541OooOo, this.f73543OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23343OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73542OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorFragment noteEditorFragment = this.f73541OooOo;
            C32443OooOOO c32443OooOOO = new C32443OooOOO(this.f73543OooOoO0, new Long(System.currentTimeMillis()));
            this.f73542OooOo0o = 1;
            C33781o00o0O c33781o00o0O = noteEditorFragment.f73061o0ooOOo;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c32443OooOOO);
            if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
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
