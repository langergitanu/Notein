package o0o0O0O;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recent.RecentViewModel$special$$inlined$flatMapLatest$1", m80623f = "RecentViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteMeta>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f107840OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107841OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30265OooOOOo f107842OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107843OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Continuation continuation, C30265OooOOOo c30265OooOOOo) {
        super(3, continuation);
        this.f107842OooOoO = c30265OooOOOo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        OooOOO oooOOO = new OooOOO(continuation, this.f107842OooOoO);
        oooOOO.f107840OooOo = interfaceC33723OooO0oO;
        oooOOO.f107843OooOoO0 = str;
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
        int i = this.f107841OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f107840OooOo;
            String str = (String) this.f107843OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = this.f107842OooOoO.f107853OooO0Oo;
            this.f107840OooOo = interfaceC33723OooO0oO;
            this.f107841OooOo0o = 1;
            obj = c27449o00O0OoO.OooOooo(str);
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
        interfaceC33723OooO0oO = this.f107840OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f107840OooOo = null;
        this.f107841OooOo0o = 2;
    }
}
