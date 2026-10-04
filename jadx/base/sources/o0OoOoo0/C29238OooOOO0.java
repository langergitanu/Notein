package o0OoOoo0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoOoo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment", m80623f = "LatestOpenedNoteTabFragment.kt", m80624l = {StyleIdentifier.SMART_HYPERLINK}, m80625m = "deleteLatestOpenedNote")
public final class C29238OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f103672OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LatestOpenedNoteTabFragment f103673OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f103674OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ LatestOpenedNoteTabFragment f103675OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29238OooOOO0(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f103675OooOoO0 = latestOpenedNoteTabFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f103672OooOo = obj;
        this.f103674OooOoO |= Integer.MIN_VALUE;
        return LatestOpenedNoteTabFragment.OooOoO(this.f103675OooOoO0, null, this);
    }
}
