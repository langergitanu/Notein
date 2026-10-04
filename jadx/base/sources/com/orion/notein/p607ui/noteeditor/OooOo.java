package com.orion.notein.p607ui.noteeditor;

import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$throttleUpdatePageMeta$3$1", m80623f = "NoteEditorViewModel.kt", m80624l = {EditingLanguage.MANIPURI, 1117}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f73654OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73655OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo.C23346OooO0o0 f73656OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(C23344OooOOo c23344OooOOo, C23344OooOOo.C23346OooO0o0 c23346OooO0o0, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f73654OooOo = c23344OooOOo;
        this.f73656OooOoO0 = c23346OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f73654OooOo, this.f73656OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r2.f73545OooO0Oo.OoooOo0(r12, r11) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OooOo oooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73655OooOo0o;
        C23344OooOOo c23344OooOOo = this.f73654OooOo;
        C23344OooOOo.C23346OooO0o0 c23346OooO0o0 = this.f73656OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = c23346OooO0o0.f73632OooO0O0;
            this.f73655OooOo0o = 1;
            oooOo = this;
            if (c23344OooOOo.f73545OooO0Oo.Ooooo0o(str, c23346OooO0o0.f73633OooO0OO, c23346OooO0o0.f73631OooO00o, oooOo) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        oooOo = this;
        String str2 = c23346OooO0o0.f73631OooO00o;
        oooOo.f73655OooOo0o = 2;
    }
}
