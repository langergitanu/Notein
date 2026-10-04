package o0oOO0Oo;

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

/* JADX INFO: renamed from: o0oOO0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteSwitchViewModel$special$$inlined$flatMapLatest$1", m80623f = "NoteSwitchViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C30818OooOOoo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteMeta>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f110145OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110146OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30821OooOo0O f110147OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f110148OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30818OooOOoo(Continuation continuation, C30821OooOo0O c30821OooOo0O) {
        super(3, continuation);
        this.f110147OooOoO = c30821OooOo0O;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30818OooOOoo c30818OooOOoo = new C30818OooOOoo(continuation, this.f110147OooOoO);
        c30818OooOOoo.f110145OooOo = interfaceC33723OooO0oO;
        c30818OooOOoo.f110148OooOoO0 = str;
        return c30818OooOOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
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
        int i = this.f110146OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f110145OooOo;
            String str = (String) this.f110148OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = this.f110147OooOoO.f110160OooO0Oo;
            this.f110145OooOo = interfaceC33723OooO0oO;
            this.f110146OooOo0o = 1;
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
        interfaceC33723OooO0oO = this.f110145OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f110145OooOo = null;
        this.f110146OooOo0o = 2;
    }
}
