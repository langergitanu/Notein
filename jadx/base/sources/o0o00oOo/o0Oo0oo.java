package o0o00oOo;

import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.page.Page;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOO00.C27091OooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$flatMapLatest$9", m80623f = "NoteListViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class o0Oo0oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>>>, List<? extends Page>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f107129OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107130OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107131OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107132OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f107131OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>>> interfaceC33723OooO0oO, List<? extends Page> list, Continuation<? super C32460OooOooO> continuation) {
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(this.f107131OooOoO, continuation);
        o0oo0oo2.f107129OooOo = interfaceC33723OooO0oO;
        o0oo0oo2.f107132OooOoO0 = list;
        return o0oo0oo2.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107130OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f107129OooOo;
            C27091OooOOo c27091OooOOoOooO0Oo = this.f107131OooOoO.f77134OooOOo0.OooO0Oo((List) this.f107132OooOoO0);
            this.f107130OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c27091OooOOoOooO0Oo, this) == enumC32485OooO00o) {
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
