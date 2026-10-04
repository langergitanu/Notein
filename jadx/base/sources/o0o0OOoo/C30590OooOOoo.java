package o0o0OOoo;

import androidx.lifecycle.o0OoOo0;
import com.android.billingclient.api.Purchase;
import com.orion.notein.p607ui.pay.State;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31042OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OOoo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$postProcessTransactionsStateChange$1", m80623f = "GooglePayViewModel.kt", m80624l = {848}, m80625m = "invokeSuspend")
public final class C30590OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ State f109467OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109468OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f109469OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30584OooOOOo f109470OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30590OooOOoo(State state, C30584OooOOOo c30584OooOOOo, Object obj, Continuation<? super C30590OooOOoo> continuation) {
        super(2, continuation);
        this.f109467OooOo = state;
        this.f109470OooOoO0 = c30584OooOOOo;
        this.f109469OooOoO = obj;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30590OooOOoo(this.f109467OooOo, this.f109470OooOoO0, this.f109469OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30590OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109468OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            State.C23770OooO0oo c23770OooO0oo = State.C23770OooO0oo.f78717OooO00o;
            State state = this.f109467OooOo;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(state, c23770OooO0oo);
            C30584OooOOOo c30584OooOOOo = this.f109470OooOoO0;
            if (!zOooO0O0) {
                c30584OooOOOo.getClass();
            }
            boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(state, State.OooO0O0.f78711OooO00o);
            Object obj2 = this.f109469OooOoO;
            if (!zOooO0O02) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(state, State.C23768OooO0o0.f78715OooO00o)) {
                    c30584OooOOOo.getClass();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30584OooOOOo);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30594OooOo0O(c30584OooOOOo, null), 2);
                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(state, State.OooO0o.f78714OooO00o)) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(state, State.C23769OooO0oO.f78716OooO00o)) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Pair<com.orion.notein.ui.vo.GoogleProductVO, com.android.billingclient.api.BillingFlowParams>");
                        c30584OooOOOo.f109415OooOo = ((Boolean) ((C31042OooOOO0) ((C32443OooOOO) obj2).f116638OooOo0o).f110834OooOO0.getValue()).booleanValue();
                    } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(state, c23770OooO0oo)) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.android.billingclient.api.Purchase>");
                        c30584OooOOOo.getClass();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c30584OooOOOo);
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30596OooOoO0((List) obj2, c30584OooOOOo, null), 2);
                    } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(state, State.C23767OooO0Oo.f78713OooO00o)) {
                        String str = (String) c30584OooOOOo.f109399OooO.getValue();
                        if (str != null) {
                            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type com.android.billingclient.api.Purchase");
                            c30584OooOOOo.f109400OooO0Oo.OooOO0o(str, (Purchase) obj2);
                        }
                        if (c30584OooOOOo.f109415OooOo) {
                            c30584OooOOOo.f109403OooO0oO.OooO00o();
                        }
                    } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(state, State.OooO0OO.f78712OooO00o)) {
                        throw new C32442OooOO0o();
                    }
                }
            }
            C33772OooooOo c33772OooooOo = c30584OooOOOo.f109408OooOOO;
            C32443OooOOO c32443OooOOO = new C32443OooOOO(state, obj2);
            this.f109468OooOo0o = 1;
            if (c33772OooooOo.emit(c32443OooOOO, this) == enumC32485OooO00o) {
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
