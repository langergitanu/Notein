package o0o0O0OO;

import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0O0OO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment", m80623f = "SearchListFragment.kt", m80624l = {148}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30289OooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SearchListFragment f107940OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107941OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f107942OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30289OooOOo(SearchListFragment searchListFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f107940OooOo = searchListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f107941OooOo0o = obj;
        this.f107942OooOoO0 |= Integer.MIN_VALUE;
        return SearchListFragment.OooOoo0(this.f107940OooOo, 0, this);
    }
}
