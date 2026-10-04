package o0OOoOo0;

import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.LabelRef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26601o00O0oOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoOo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findNotesByLabelColor$$inlined$flatMapLatest$1", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C27812OooOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends LabelRef>>, List<? extends Label>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f98241OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98242OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27819OooOoo f98243OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98244OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27812OooOo0(Continuation continuation, C27819OooOoo c27819OooOoo) {
        super(3, continuation);
        this.f98243OooOoO = c27819OooOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends LabelRef>> interfaceC33723OooO0oO, List<? extends Label> list, Continuation<? super C32460OooOooO> continuation) {
        C27812OooOo0 c27812OooOo0 = new C27812OooOo0(continuation, this.f98243OooOoO);
        c27812OooOo0.f98241OooOo = interfaceC33723OooO0oO;
        c27812OooOo0.f98244OooOoO0 = list;
        return c27812OooOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98242OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f98241OooOo;
            List list = (List) this.f98244OooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((Label) it.next()).getId()));
            }
            C26601o00O0oOO c26601o00O0oOOOooO00o = this.f98243OooOoO.f98267OooO00o.OooO00o(arrayList);
            this.f98242OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c26601o00O0oOOOooO00o, this) == enumC32485OooO00o) {
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
