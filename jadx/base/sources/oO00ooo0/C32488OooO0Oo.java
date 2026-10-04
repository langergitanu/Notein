package oO00ooo0;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32483OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO00ooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32488OooO0Oo extends AbstractC32483OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32508OooOOOo f116733OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f116734OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Continuation f116735OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32488OooO0Oo(Continuation continuation, Continuation continuation2, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        super(continuation);
        this.f116733OooOo = interfaceC32508OooOOOo;
        this.f116735OooOoO0 = continuation2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i = this.f116734OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f116734OooOo0o = 2;
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        this.f116734OooOo0o = 1;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32508OooOOOo interfaceC32508OooOOOo = this.f116733OooOo;
        OooOOO0.OooO0o0(interfaceC32508OooOOOo, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
        return interfaceC32508OooOOOo.invoke(this.f116735OooOoO0, this);
    }
}
