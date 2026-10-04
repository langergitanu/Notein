package o0OO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.analytics.AnalyticsRepoImpl", m80623f = "AnalyticsRepoImpl.kt", m80624l = {28}, m80625m = "getStatsEventCount")
public final class OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26436OooO0Oo f90809OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f90810OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f90811OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(C26436OooO0Oo c26436OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f90809OooOo = c26436OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f90810OooOo0o = obj;
        this.f90811OooOoO0 |= Integer.MIN_VALUE;
        return this.f90809OooOo.OooO00o(null, this);
    }
}
