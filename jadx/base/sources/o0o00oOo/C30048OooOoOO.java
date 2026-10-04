package o0o00oOo;

import com.orion.notein.p607ui.notelist.NoteListFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o00oOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment", m80623f = "NoteListFragment.kt", m80624l = {611}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30048OooOoOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListFragment f106849OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f106850OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f106851OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30048OooOoOO(NoteListFragment noteListFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f106849OooOo = noteListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f106850OooOo0o = obj;
        this.f106851OooOoO0 |= Integer.MIN_VALUE;
        return NoteListFragment.OooOoO(this.f106849OooOo, 0, this);
    }
}
