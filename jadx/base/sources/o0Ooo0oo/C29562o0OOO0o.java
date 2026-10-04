package o0Ooo0oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooo0oo.o0OOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$eraseHLToEraseTapeOnly$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29562o0OOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, Boolean, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f104869OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f104870OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Boolean>> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C29562o0OOO0o c29562o0OOO0o = new C29562o0OOO0o(3, continuation);
        c29562o0OOO0o.f104870OooOo0o = zBooleanValue;
        c29562o0OOO0o.f104869OooOo = zBooleanValue2;
        return c29562o0OOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new C32443OooOOO(Boolean.valueOf(this.f104870OooOo0o), Boolean.valueOf(this.f104869OooOo));
    }
}
