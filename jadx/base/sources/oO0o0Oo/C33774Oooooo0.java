package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: oO0o0Oo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.SharedFlowImpl", m80623f = "SharedFlow.kt", m80624l = {387, 394, 397}, m80625m = "collect$suspendImpl")
public final class C33774Oooooo0<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33723OooO0oO f121762OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33772OooooOo f121763OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC33672o00ooo f121764OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33775OoooooO f121765OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f121766OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f121767OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C33772OooooOo<T> f121768OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33774Oooooo0(C33772OooooOo<T> c33772OooooOo, Continuation<? super C33774Oooooo0> continuation) {
        super(continuation);
        this.f121768OooOoo0 = c33772OooooOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f121766OooOoOO = obj;
        this.f121767OooOoo |= Integer.MIN_VALUE;
        C33772OooooOo.OooOO0O(this.f121768OooOoo0, null, this);
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}
