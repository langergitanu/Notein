package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoO0oo.o00OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment", m80623f = "NoteEditorFragment.kt", m80624l = {5735}, m80625m = "showNonVipFeatureLimitedDialog")
public final class C28882o00OoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102336OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102337OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f102338OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28882o00OoO(NoteEditorFragment noteEditorFragment, Continuation<? super C28882o00OoO> continuation) {
        super(continuation);
        this.f102336OooOo = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f102337OooOo0o = obj;
        this.f102338OooOoO0 |= Integer.MIN_VALUE;
        return NoteEditorFragment.Oooo000(0, this.f102336OooOo, this);
    }
}
