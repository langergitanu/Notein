package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoO0oo.o0000O00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1933}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C28760o0000O00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101853OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f101854OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f101855OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28760o0000O00(NoteEditorContainerFragment noteEditorContainerFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f101853OooOo = noteEditorContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f101854OooOo0o = obj;
        this.f101855OooOoO0 |= Integer.MIN_VALUE;
        return NoteEditorContainerFragment.OooOoo0(this.f101853OooOo, 0, this);
    }
}
