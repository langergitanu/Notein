package o0o0OO0;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27325OoooO00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0OO0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$special$$inlined$flatMapLatest$1", m80623f = "AiOcrViewModel.kt", m80624l = {193, 189}, m80625m = "invokeSuspend")
public final class C30405OooOoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Integer>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108579OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108580OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108581OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108582OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30405OooOoO(Continuation continuation, C30394OooOOOO c30394OooOOOO) {
        super(3, continuation);
        this.f108581OooOoO = c30394OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30405OooOoO c30405OooOoO = new C30405OooOoO(continuation, this.f108581OooOoO);
        c30405OooOoO.f108579OooOo = interfaceC33723OooO0oO;
        c30405OooOoO.f108582OooOoO0 = str;
        return c30405OooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r3, r5) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        Object c33716OooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108580OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f108579OooOo;
            String str = (String) this.f108582OooOoO0;
            if (str == null) {
                c33716OooO = new C33716OooO(new Integer(0));
                this.f108579OooOo = null;
                this.f108580OooOo0o = 2;
            } else {
                InterfaceC27325OoooO00 interfaceC27325OoooO00 = this.f108581OooOoO.f108493OooO0Oo;
                this.f108579OooOo = interfaceC33723OooO0oO;
                this.f108580OooOo0o = 1;
                obj = interfaceC27325OoooO00.OooO0Oo(str);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33723OooO0oO = this.f108579OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        c33716OooO = obj;
        this.f108579OooOo = null;
        this.f108580OooOo0o = 2;
    }
}
