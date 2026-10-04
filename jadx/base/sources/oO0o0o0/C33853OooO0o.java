package oO0o0o0;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: oO0o0o0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.reactive.FlowSubscription", m80623f = "ReactiveFlow.kt", m80624l = {205}, m80625m = "flowProcessing")
public final class C33853OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121973OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33855OooO0oO f121974OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f121975OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33855OooO0oO<Object> f121976OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33853OooO0o(C33855OooO0oO<Object> c33855OooO0oO, Continuation<? super C33853OooO0o> continuation) {
        super(continuation);
        this.f121976OooOoO0 = c33855OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f121973OooOo = obj;
        this.f121975OooOoO |= Integer.MIN_VALUE;
        return C33855OooO0oO.o0OoOo0(this.f121976OooOoO0, this);
    }
}
