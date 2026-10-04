package o0OoO0oo;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$removeMarkTimeIfNotReachLimit$1$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28757o00000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101847OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Fragment f101848OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28757o00000oo(Fragment fragment, NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28757o00000oo> continuation) {
        super(2, continuation);
        this.f101848OooOo0o = fragment;
        this.f101847OooOo = noteEditorContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28757o00000oo(this.f101848OooOo0o, this.f101847OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28757o00000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Fragment fragment = this.f101848OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(fragment, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.LockNoteFragment");
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101847OooOo;
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28718Oooo00O((LockNoteFragment) fragment, noteEditorContainerFragment.OooOooo().f101859OooO00o, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
