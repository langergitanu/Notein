package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26342o000Oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OoO0oo.o00o0O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$note$5", m80623f = "NoteEditorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28921o00o0O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContent, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102460OooOo0o;

    public C28921o00o0O0O() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28921o00o0O0O c28921o00o0O0O = new C28921o00o0O0O(2, continuation);
        c28921o00o0O0O.f102460OooOo0o = obj;
        return c28921o00o0O0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(NoteContent noteContent, Continuation<? super C32460OooOooO> continuation) {
        return ((C28921o00o0O0O) create(noteContent, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) this.f102460OooOo0o;
        C26342o000Oo0O c26342o000Oo0O = C26342o000Oo0O.f90392OooO00o;
        String str = "note content onEach: " + noteContent.getSavedPageIndex();
        c26342o000Oo0O.getClass();
        C26342o000Oo0O.OooO0o(str);
        C26342o000Oo0O.OooOO0(new C28919o00o0O0(noteContent, 0));
        return C32460OooOooO.f116667OooO00o;
    }
}
