package o0o00oOo;

import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27306OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oOo.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$flatMapLatest$7", m80623f = "NoteListViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30091o0ooOoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Map<String, ? extends List<? extends Label>>>, List<? extends NoteMeta>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f107142OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107143OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107144OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107145OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30091o0ooOoO(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f107144OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Map<String, ? extends List<? extends Label>>> interfaceC33723OooO0oO, List<? extends NoteMeta> list, Continuation<? super C32460OooOooO> continuation) {
        C30091o0ooOoO c30091o0ooOoO = new C30091o0ooOoO(this.f107144OooOoO, continuation);
        c30091o0ooOoO.f107142OooOo = interfaceC33723OooO0oO;
        c30091o0ooOoO.f107145OooOoO0 = list;
        return c30091o0ooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107143OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f107142OooOo;
            List list = (List) this.f107145OooOoO0;
            InterfaceC27306OooOo00 interfaceC27306OooOo00 = this.f107144OooOoO.f77132OooOOOo;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((NoteMeta) it.next()).getId());
            }
            C33763OoooOOO c33763OoooOOOOooOO0O = interfaceC27306OooOo00.OooOO0O(arrayList);
            this.f107143OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33763OoooOOOOooOO0O, this) == enumC32485OooO00o) {
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
