package o0OoO0oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000o00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$inputType$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28809o000o00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, Boolean, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f102006OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f102007OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super Integer> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C28809o000o00o c28809o000o00o = new C28809o000o00o(3, continuation);
        c28809o000o00o.f102007OooOo0o = zBooleanValue;
        c28809o000o00o.f102006OooOo = zBooleanValue2;
        return c28809o000o00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new Integer(this.f102006OooOo ? 2 : this.f102007OooOo0o ? 1 : 0);
    }
}
