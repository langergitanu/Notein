package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33591OooOOO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33814OooOoO0;
import oO0o0Ooo.C33835OooOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33808OooOo<T> extends AbstractC32479OooO0OO implements InterfaceC33723OooO0oO<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121890OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33723OooO0oO<T> f121891OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC34415OooO0oo f121892OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f121893OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Continuation<? super C32460OooOooO> f121894OooOoOO;

    /* JADX WARN: Multi-variable type inference failed */
    public C33808OooOo(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        super(C33810OooOo00.f121896OooOo0o, oOo0000O.OooO.f123416OooOo0o);
        this.f121891OooOo0o = interfaceC33723OooO0oO;
        this.f121890OooOo = interfaceC34415OooO0oo;
        this.f121893OooOoO0 = ((Number) interfaceC34415OooO0oo.fold(0, new C33812OooOo0o())).intValue();
    }

    public final Object OooO00o(Continuation<? super C32460OooOooO> continuation, T t) {
        InterfaceC34415OooO0oo context = continuation.getContext();
        oO00o00.OooO0OO.OooO0OO(context);
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121892OooOoO;
        if (interfaceC34415OooO0oo != context) {
            if (interfaceC34415OooO0oo instanceof C33803OooOOOO) {
                throw new IllegalStateException(C33591OooOOO.OooO0oo("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C33803OooOOOO) interfaceC34415OooO0oo).f121883OooOo + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new InterfaceC32508OooOOOo() { // from class: oO0o0OoO.OooOoO
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                @Override // oO0O000o.InterfaceC32508OooOOOo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = (InterfaceC34415OooO0oo.OooO0O0) obj2;
                    InterfaceC34415OooO0oo.OooO0OO<?> key = oooO0O0.getKey();
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O02 = this.f121900OooOo0o.f121890OooOo.get(key);
                    if (key != InterfaceC33672o00ooo.OooO00o.f121379OooOo0o) {
                        iIntValue = oooO0O0 != oooO0O02 ? Integer.MIN_VALUE : iIntValue + 1;
                    } else {
                        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) oooO0O02;
                        InterfaceC33672o00ooo parent = (InterfaceC33672o00ooo) oooO0O0;
                        while (true) {
                            if (parent != null) {
                                if (parent == interfaceC33672o00ooo || !(parent instanceof C33835OooOOo)) {
                                    break;
                                }
                                parent = ((C33835OooOOo) parent).getParent();
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != interfaceC33672o00ooo) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC33672o00ooo + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (interfaceC33672o00ooo != null) {
                        }
                    }
                    return Integer.valueOf(iIntValue);
                }
            })).intValue() != this.f121893OooOoO0) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f121890OooOo + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f121892OooOoO = context;
        }
        this.f121894OooOoOO = continuation;
        C33814OooOoO0.OooO00o oooO00o = C33814OooOoO0.f121901OooO00o;
        InterfaceC33723OooO0oO<T> interfaceC33723OooO0oO = this.f121891OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC33723OooO0oO, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oooO00o.getClass();
        Object objEmit = interfaceC33723OooO0oO.emit(t, this);
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(objEmit, EnumC32485OooO00o.f116726OooOo0o)) {
            this.f121894OooOoOO = null;
        }
        return objEmit;
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        try {
            Object objOooO00o = OooO00o(continuation, t);
            return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            this.f121892OooOoO = new C33803OooOOOO(th, continuation.getContext());
            throw th;
        }
    }

    @Override // oO00ooo.AbstractC32477OooO00o, oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        Continuation<? super C32460OooOooO> continuation = this.f121894OooOoOO;
        if (continuation instanceof InterfaceC32480OooO0Oo) {
            return (InterfaceC32480OooO0Oo) continuation;
        }
        return null;
    }

    @Override // oO00ooo.AbstractC32479OooO0OO, kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121892OooOoO;
        return interfaceC34415OooO0oo == null ? oOo0000O.OooO.f123416OooOo0o : interfaceC34415OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o != null) {
            this.f121892OooOoO = new C33803OooOOOO(thOooO00o, getContext());
        }
        Continuation<? super C32460OooOooO> continuation = this.f121894OooOoOO;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}
