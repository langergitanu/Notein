package Oooo0O0;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20530OooOOOo;
import OooOoOO.C20555OoooO0;
import OooooO0.C21290OooO0o0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: Oooo0O0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", m80623f = "SelectionMagnifier.kt", m80624l = {102}, m80625m = "invokeSuspend")
public final class C20927OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> f60378OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f60379OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f60380OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20927OooOoO0(C20518OooO0OO<C21290OooO0o0, C20530OooOOOo> c20518OooO0OO, long j, Continuation<? super C20927OooOoO0> continuation) {
        super(2, continuation);
        this.f60378OooOo = c20518OooO0OO;
        this.f60380OooOoO0 = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20927OooOoO0(this.f60378OooOo, this.f60380OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20927OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60379OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C21290OooO0o0 c21290OooO0o0 = new C21290OooO0o0(this.f60380OooOoO0);
            C20555OoooO0<C21290OooO0o0> c20555OoooO0 = C20923OooOo0.f60369OooO0Oo;
            this.f60379OooOo0o = 1;
            if (C20518OooO0OO.OooO0O0(this.f60378OooOo, c21290OooO0o0, c20555OoooO0, this) == enumC32485OooO00o) {
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
