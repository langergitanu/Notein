package o0OoOOOo;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0OoOOOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFontPopupWindow$recalculateWindowHeightByItemCount$1", m80623f = "TextFontPopupWindow.kt", m80624l = {207}, m80625m = "invokeSuspend")
public final class C29101OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o f103122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103123OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f103124OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29101OooOO0(com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o, int i, Continuation<? super C29101OooOO0> continuation) {
        super(2, continuation);
        this.f103122OooOo = oooO00o;
        this.f103124OooOoO0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29101OooOO0(this.f103122OooOo, this.f103124OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29101OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103123OooOo0o;
        com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = this.f103122OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) oooO00o.f74091OooO0o.getValue();
            this.f103123OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(interfaceC33721OooO0o, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        oooO00o.f74089OooO0OO.update(oooO00o.f74095OooOO0, 0, -(kotlin.jvm.internal.OooOOO0.OooO0O0(obj, Boolean.TRUE) ? 50 : 0), oooO00o.f74086OooO, this.f103124OooOoO0);
        return C32460OooOooO.f116667OooO00o;
    }
}
