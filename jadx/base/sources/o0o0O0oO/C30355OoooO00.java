package o0o0O0oO;

import com.orion.notein.domain.models.note.NoteMeta;
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

/* JADX INFO: renamed from: o0o0O0oO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$special$$inlined$flatMapLatest$1", m80623f = "TrashBinListViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30355OoooO00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteMeta>>, InterfaceC33721OooO0o<? extends List<? extends NoteMeta>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108270OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108271OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108272OooOoO0;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, InterfaceC33721OooO0o<? extends List<? extends NoteMeta>> interfaceC33721OooO0o, Continuation<? super C32460OooOooO> continuation) {
        C30355OoooO00 c30355OoooO00 = new C30355OoooO00(3, continuation);
        c30355OoooO00.f108270OooOo = interfaceC33723OooO0oO;
        c30355OoooO00.f108272OooOoO0 = interfaceC33721OooO0o;
        return c30355OoooO00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108271OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f108270OooOo;
            InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f108272OooOoO0;
            this.f108271OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0o, this) == enumC32485OooO00o) {
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
