package o0o0OO;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$special$$inlined$flatMapLatest$4", m80623f = "TiledPageViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30377OooOo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Page>>, NoteContent, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108426OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108427OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108428OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108429OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30377OooOo0o(Continuation continuation, C30367OooO0o0 c30367OooO0o0) {
        super(3, continuation);
        this.f108428OooOoO = c30367OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, NoteContent noteContent, Continuation<? super C32460OooOooO> continuation) {
        C30377OooOo0o c30377OooOo0o = new C30377OooOo0o(continuation, this.f108428OooOoO);
        c30377OooOo0o.f108426OooOo = interfaceC33723OooO0oO;
        c30377OooOo0o.f108429OooOoO0 = noteContent;
        return c30377OooOo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108427OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f108426OooOo;
            NoteContent noteContent = (NoteContent) this.f108429OooOoO0;
            List<Page> pages = noteContent.getPages();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(((Page) it.next()).getId());
            }
            InterfaceC33721OooO0o interfaceC33721OooO0oOooo00O = this.f108428OooOoO.f108328OooO0Oo.Oooo00O(noteContent.getId(), oOo000Oo.OooOo.o0OO00O(arrayList));
            this.f108427OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooo00O, this) == enumC32485OooO00o) {
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
