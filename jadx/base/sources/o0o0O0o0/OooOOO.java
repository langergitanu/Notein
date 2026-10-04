package o0o0O0o0;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$special$$inlined$flatMapLatest$1", m80623f = "SearchViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super User>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108057OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108058OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30296OooO00o f108059OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108060OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Continuation continuation, C30296OooO00o c30296OooO00o) {
        super(3, continuation);
        this.f108059OooOoO = c30296OooO00o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super User> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        OooOOO oooOOO = new OooOOO(continuation, this.f108059OooOoO);
        oooOOO.f108057OooOo = interfaceC33723OooO0oO;
        oooOOO.f108060OooOoO0 = str;
        return oooOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r6, r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108058OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f108057OooOo;
            String str = (String) this.f108060OooOoO0;
            C27129OoooOOO c27129OoooOOO = this.f108059OooOoO.f107991OooO0oO;
            this.f108057OooOo = interfaceC33723OooO0oO;
            this.f108058OooOo0o = 1;
            obj = c27129OoooOOO.OooO0o0(str);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = this.f108057OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f108057OooOo = null;
        this.f108058OooOo0o = 2;
    }
}
