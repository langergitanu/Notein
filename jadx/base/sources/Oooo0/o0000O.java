package Oooo0;

import Oooo0O0.C20935Oooo00o;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", m80623f = "TextFieldGestureModifiers.kt", m80624l = {35}, m80625m = "invokeSuspend")
public final class o0000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC25088OooOoO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f60023OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f60024OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20935Oooo00o.C20938OooO0oO f60025OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(C20935Oooo00o.C20938OooO0oO c20938OooO0oO, Continuation continuation) {
        super(2, continuation);
        this.f60025OooOoO0 = c20938OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0000O o0000o2 = new o0000O(this.f60025OooOoO0, continuation);
        o0000o2.f60023OooOo = obj;
        return o0000o2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25088OooOoO interfaceC25088OooOoO, Continuation<? super C32460OooOooO> continuation) {
        return ((o0000O) create(interfaceC25088OooOoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60024OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC25088OooOoO interfaceC25088OooOoO = (InterfaceC25088OooOoO) this.f60023OooOo;
            this.f60024OooOo0o = 1;
            if (C33074OooOoO.OooO0Oo(interfaceC25088OooOoO, this.f60025OooOoO0, this) == enumC32485OooO00o) {
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
