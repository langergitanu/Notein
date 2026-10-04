package o00Oo0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o00Oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m80623f = "NestedScrollModifier.kt", m80624l = {217}, m80625m = "dispatchPostFling-RZ2iAVY")
public final class C25028OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25027OooO0O0 f84976OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f84977OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f84978OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25028OooO0OO(C25027OooO0O0 c25027OooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f84976OooOo = c25027OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f84977OooOo0o = obj;
        this.f84978OooOoO0 |= Integer.MIN_VALUE;
        return this.f84976OooOo.OooO00o(0L, 0L, this);
    }
}
