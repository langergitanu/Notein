package o0Ooo0oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooo0oo.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$_globalToolBoxNoteId$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29556o00o0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, Boolean, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f104848OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ String f104849OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(String str, Boolean bool, Continuation<? super String> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C29556o00o0O c29556o00o0O = new C29556o00o0O(3, continuation);
        c29556o00o0O.f104849OooOo0o = str;
        c29556o00o0O.f104848OooOo = zBooleanValue;
        return c29556o00o0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f104849OooOo0o;
        return !this.f104848OooOo ? str == null ? "" : str : "global-toolbox";
    }
}
