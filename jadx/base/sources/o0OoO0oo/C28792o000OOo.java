package o0OoO0oo;

import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$handleAddLockButtonClicked$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1544}, m80625m = "invokeSuspend")
public final class C28792o000OOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LockNoteFragment f101955OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101956OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28792o000OOo(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28792o000OOo> continuation) {
        super(2, continuation);
        this.f101956OooOoO0 = noteEditorContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28792o000OOo(this.f101956OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28792o000OOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        LockNoteFragment lockNoteFragment;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101954OooOo;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101956OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LockNoteFragment lockNoteFragment2 = noteEditorContainerFragment.f72823OoooO0;
            if (lockNoteFragment2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooO0OO("handleLockButtonClicked lockNoteFragment is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            this.f101955OooOo0o = lockNoteFragment2;
            this.f101954OooOo = 1;
            Object objOooOoo0 = NoteEditorContainerFragment.OooOoo0(noteEditorContainerFragment, 28, this);
            if (objOooOoo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            lockNoteFragment = lockNoteFragment2;
            obj = objOooOoo0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lockNoteFragment = this.f101955OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            String str = (String) noteEditorContainerFragment.Oooo00O().f73397OoooOoo.f121747OooOo0o.getValue();
            InterfaceC21987OooOoo viewLifecycleOwner = noteEditorContainerFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
            lockNoteFragment.getClass();
            C33609OooO0oo.OooO0OO(oooOoOooO00o, null, null, new C28710OooOoOO(lockNoteFragment, oooOoOooO00o, str, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
