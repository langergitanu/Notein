package o0oOO0Oo;

import android.graphics.PointF;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOO0Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$initNoteMorePopupWindow$1$2", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {202, 204}, m80625m = "invokeSuspend")
public final class C30809OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorSwitchFragment f110112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110113OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30809OooOO0(NoteEditorSwitchFragment noteEditorSwitchFragment, Continuation<? super C30809OooOO0> continuation) {
        super(2, continuation);
        this.f110112OooOo = noteEditorSwitchFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30809OooOO0(this.f110112OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30809OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r8 == r0) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110113OooOo0o;
        NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110112OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110113OooOo0o = 1;
            obj = NoteEditorSwitchFragment.OooOoO(noteEditorSwitchFragment, 37, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            noteEditorSwitchFragment.OooOoo().OooOo0O((String) obj, "", new PointF(0.0f, 0.0f), null, false);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (!((Boolean) obj).booleanValue()) {
            C30821OooOo0O c30821OooOo0OOooOooO = noteEditorSwitchFragment.OooOooO();
            String string = noteEditorSwitchFragment.requireContext().getString(R.string.note_title_scratch);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String str = noteEditorSwitchFragment.OooOoo().f73368OooOo0O;
            this.f110113OooOo0o = 2;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30812OooOOO(c30821OooOo0OOooOooO, string, str, null), this);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
