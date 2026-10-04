package o0oOO0Oo;

import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0oOO0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {179}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C30811OooOO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorSwitchFragment f110126OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f110127OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f110128OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30811OooOO0o(NoteEditorSwitchFragment noteEditorSwitchFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f110126OooOo = noteEditorSwitchFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f110127OooOo0o = obj;
        this.f110128OooOoO0 |= Integer.MIN_VALUE;
        return NoteEditorSwitchFragment.OooOoO(this.f110126OooOo, 0, this);
    }
}
