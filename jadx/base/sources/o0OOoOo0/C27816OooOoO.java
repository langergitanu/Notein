package o0OOoOo0;

import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.LabelRef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26602o00O0oOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoOo0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findPagesByLabelColor$$inlined$flatMapLatest$1", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C27816OooOoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends LabelRef>>, List<? extends Label>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f98255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98256OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27819OooOoo f98257OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98258OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27816OooOoO(Continuation continuation, C27819OooOoo c27819OooOoo) {
        super(3, continuation);
        this.f98257OooOoO = c27819OooOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends LabelRef>> interfaceC33723OooO0oO, List<? extends Label> list, Continuation<? super C32460OooOooO> continuation) {
        C27816OooOoO c27816OooOoO = new C27816OooOoO(continuation, this.f98257OooOoO);
        c27816OooOoO.f98255OooOo = interfaceC33723OooO0oO;
        c27816OooOoO.f98258OooOoO0 = list;
        return c27816OooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98256OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f98255OooOo;
            List list = (List) this.f98258OooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((Label) it.next()).getId()));
            }
            C26602o00O0oOo c26602o00O0oOoOooO0OO = this.f98257OooOoO.f98267OooO00o.OooO0OO(arrayList);
            this.f98256OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c26602o00O0oOoOooO0OO, this) == enumC32485OooO00o) {
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
