package o0Ooooo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.C27020OooOoO0;
import o0OOO0OO.C27021OooOoOO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34887o00o00O0;

/* JADX INFO: renamed from: o0Ooooo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$special$$inlined$flatMapLatest$4", m80623f = "EditorPreviewViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C29686OooOoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Page>>, NoteContent, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105240OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105241OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105242OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105243OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29686OooOoO(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f105242OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, NoteContent noteContent, Continuation<? super C32460OooOooO> continuation) {
        C29686OooOoO c29686OooOoO = new C29686OooOoO(this.f105242OooOoO, continuation);
        c29686OooOoO.f105240OooOo = interfaceC33723OooO0oO;
        c29686OooOoO.f105243OooOoO0 = noteContent;
        return c29686OooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105241OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f105240OooOo;
            NoteContent noteContent = (NoteContent) this.f105243OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = this.f105242OooOoO.f76066OooO0Oo;
            String noteId = noteContent.getId();
            List<Page> pages = noteContent.getPages();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(((Page) it.next()).getId());
            }
            c27449o00O0OoO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
            C27015OooOOoo c27015OooOOoo = c27020OooOoO0.f94064OooO00o;
            c27015OooOOoo.getClass();
            C26454OooO0Oo c26454OooO0Oo = c27015OooOOoo.f94033OooO00o;
            c26454OooO0Oo.getClass();
            c26454OooO0Oo.OooO0O0(noteId);
            InterfaceC34887o00o00O0 it2 = c26454OooO0Oo.OooO0o(noteId).OooOoo();
            kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
            o00O o00o2 = new o00O(new C27021OooOoOO(new C33734OooOOoo(it2.OooOO0(noteId), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), c27020OooOoO0), arrayList);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOo0O = C25252OooO0Oo.OooOo0O(o00o2, ExecutorC33873OooO0O0.f122045OooOoO0);
            this.f105241OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooOo0O, this) == enumC32485OooO00o) {
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
