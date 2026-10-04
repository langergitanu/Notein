package o0o000oo;

import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o000oo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment", m80623f = "BaseToolbarChildFragment.kt", m80624l = {2044}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C29845OoooO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105875OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f105876OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f105877OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29845OoooO0O(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29845OoooO0O> continuation) {
        super(continuation);
        this.f105875OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f105876OooOo0o = obj;
        this.f105877OooOoO0 |= Integer.MIN_VALUE;
        return BaseToolbarChildFragment.OooOooo(this.f105875OooOo, 0, this);
    }
}
