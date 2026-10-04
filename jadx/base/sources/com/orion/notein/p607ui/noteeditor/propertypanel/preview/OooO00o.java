package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0Ooooo.C29675OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$4$1$1", m80623f = "EditorPreviewFragment.kt", m80624l = {531}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EditorPreviewFragment f76059OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f76060OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f76061OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(EditorPreviewFragment editorPreviewFragment, String str, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f76059OooOo = editorPreviewFragment;
        this.f76061OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f76059OooOo, this.f76061OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f76060OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO0OO oooO0OOOooOoo = this.f76059OooOo.OooOoo();
            this.f76060OooOo0o = 1;
            o00000OO o00000oo2 = oooO0OOOooOoo.f76072OooOO0O;
            if (o00000oo2 != null) {
                o00000oo2.cancel((CancellationException) null);
            }
            oooO0OOOooOoo.f76072OooOO0O = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(getContext()), null, null, new C29675OooOOO0(oooO0OOOooOoo, this.f76061OooOoO0, null), 3);
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
