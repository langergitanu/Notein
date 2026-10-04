package oO00ooo0;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.InterfaceC32437OooO0o0;
import oO00ooo.AbstractC32483OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO00ooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32486OooO0O0 extends AbstractC32483OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24019OooOO0o f116729OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f116730OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32486OooO0O0(InterfaceC32507OooOO0o interfaceC32507OooOO0o, Continuation continuation) {
        super(continuation);
        this.f116729OooOo = (C24019OooOO0o) interfaceC32507OooOO0o;
        OooOOO0.OooO0o0(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i = this.f116730OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f116730OooOo0o = 2;
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        this.f116730OooOo0o = 1;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32437OooO0o0 interfaceC32437OooO0o0 = this.f116729OooOo;
        C24039Oooo0o0.OooO0o0(1, interfaceC32437OooO0o0);
        return ((InterfaceC32507OooOO0o) interfaceC32437OooO0o0).invoke(this);
    }
}
