package o0o0O0OO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0O0OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment", m80623f = "SearchListFragment.kt", m80624l = {StyleIdentifier.SUBTLE_EMPHASIS}, m80625m = "jumpToNote")
public final class C30290OooOOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteVO f107943OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SearchListFragment f107944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ SearchListFragment f107945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107946OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f107947OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30290OooOOo0(SearchListFragment searchListFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f107945OooOoO = searchListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f107946OooOoO0 = obj;
        this.f107947OooOoOO |= Integer.MIN_VALUE;
        return SearchListFragment.OooOoOO(this.f107945OooOoO, null, this);
    }
}
