package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00OoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$requestUndo$1", m80623f = "NoteEditorFragment.kt", m80624l = {4684}, m80625m = "invokeSuspend")
public final class C28883o00OoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102340OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28883o00OoO0(NoteEditorFragment noteEditorFragment, Continuation<? super C28883o00OoO0> continuation) {
        super(2, continuation);
        this.f102339OooOo = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28883o00OoO0(this.f102339OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28883o00OoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102340OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f102340OooOo0o = 1;
            NoteEditorFragment noteEditorFragment = this.f102339OooOo;
            Object objOooOOOO = noteEditorFragment.OoooOO0().OooOOOO(new com.orion.notein.p607ui.noteeditor.OooOOOO(noteEditorFragment), this);
            if (objOooOOOO != enumC32485OooO00o) {
                objOooOOOO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOOOO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
