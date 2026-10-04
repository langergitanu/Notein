package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00o0O00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$note$4", m80623f = "NoteEditorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28920o00o0O00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<NoteContent, String, Continuation<? super NoteContent>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f102458OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteContent f102459OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(NoteContent noteContent, String str, Continuation<? super NoteContent> continuation) {
        C28920o00o0O00 c28920o00o0O00 = new C28920o00o0O00(3, continuation);
        c28920o00o0O00.f102459OooOo0o = noteContent;
        c28920o00o0O00.f102458OooOo = str;
        return c28920o00o0O00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = this.f102459OooOo0o;
        String str = this.f102458OooOo;
        if (str == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO00o("No page ID provided; returning original content.", new Object[0]);
            return noteContent;
        }
        Iterator<Page> it = noteContent.getPages().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(it.next().getId(), str)) {
                break;
            }
            i++;
        }
        if (i <= 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o2, "NoteEditorViewModel", "Page ID not found or invalid index: ", i), new Object[0]);
            return noteContent;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o3, "NoteEditorViewModel", "Updated noteContent savedPageIndex to: ", i), new Object[0]);
        noteContent.setSavedPageIndex(i);
        return noteContent;
    }
}
