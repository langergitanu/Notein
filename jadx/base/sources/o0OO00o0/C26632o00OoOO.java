package o0OO00o0;

import o000O00.C24378OooOoO0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO00o0.o00OoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteRepoImpl", m80623f = "QuoteRepoImpl.kt", m80624l = {52}, m80625m = "getQuotesByPageIdSync")
public final class C26632o00OoOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91917OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24378OooOoO0 f91918OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f91919OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24378OooOoO0 f91920OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26632o00OoOO(C24378OooOoO0 c24378OooOoO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f91920OooOoO0 = c24378OooOoO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f91917OooOo = obj;
        this.f91919OooOoO |= Integer.MIN_VALUE;
        return this.f91920OooOoO0.OooO0Oo(null, null, this);
    }
}
