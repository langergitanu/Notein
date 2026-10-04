package oO00ooo0;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00ooo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32490OooO0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32508OooOOOo f116736OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f116737OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Continuation f116738OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32490OooO0o0(Continuation continuation, InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo interfaceC32508OooOOOo, Continuation continuation2) {
        super(continuation, interfaceC34415OooO0oo);
        this.f116736OooOo = interfaceC32508OooOOOo;
        this.f116738OooOoO0 = continuation2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i = this.f116737OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f116737OooOo0o = 2;
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        this.f116737OooOo0o = 1;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32508OooOOOo interfaceC32508OooOOOo = this.f116736OooOo;
        OooOOO0.OooO0o0(interfaceC32508OooOOOo, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
        return interfaceC32508OooOOOo.invoke(this.f116738OooOoO0, this);
    }
}
