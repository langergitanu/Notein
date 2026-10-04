package oO0o0Oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0OoO.C33808OooOo;

/* JADX INFO: renamed from: oO0o0Oo.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m80623f = "Share.kt", m80624l = {418, 422}, m80625m = "onSubscription")
public final class C33783o00oO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C33808OooOo f121805OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33782o00oO0O f121806OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33782o00oO0O<Object> f121807OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f121808OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f121809OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33783o00oO0o(C33782o00oO0O c33782o00oO0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f121807OooOoO = c33782o00oO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f121808OooOoO0 = obj;
        this.f121809OooOoOO |= Integer.MIN_VALUE;
        return this.f121807OooOoO.OooO00o(this);
    }
}
