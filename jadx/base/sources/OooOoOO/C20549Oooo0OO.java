package OooOoOO;

import OooOoOO.C20548Oooo0O0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: OooOoOO.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.animation.core.MutatorMutex$mutate$2", m80623f = "InternalMutatorMutex.kt", m80624l = {171, 119}, m80625m = "invokeSuspend")
public final class C20549Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f58696OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f58697OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f58698OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C20548Oooo0O0 f58699OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f58700OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f58701OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C20548Oooo0O0 f58702OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20549Oooo0OO(C20548Oooo0O0 c20548Oooo0O0, InterfaceC32507OooOO0o interfaceC32507OooOO0o, Continuation continuation) {
        super(2, continuation);
        this.f58702OooOoo0 = c20548Oooo0O0;
        this.f58701OooOoo = (AbstractC32476OooO) interfaceC32507OooOO0o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20549Oooo0OO c20549Oooo0OO = new C20549Oooo0OO(this.f58702OooOoo0, this.f58701OooOoo, continuation);
        c20549Oooo0OO.f58700OooOoOO = obj;
        return c20549Oooo0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C20549Oooo0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C20548Oooo0O0 c20548Oooo0O0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        ?? r4;
        C20548Oooo0O0.OooO00o oooO00o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        C20548Oooo0O0 c20548Oooo0O02;
        Throwable th;
        C20548Oooo0O0.OooO00o oooO00o2;
        AtomicReference<C20548Oooo0O0.OooO00o> atomicReference;
        AtomicReference<C20548Oooo0O0.OooO00o> atomicReference2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f58698OooOoO;
        try {
            try {
                if (r1 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = ((InterfaceC33636Oooo00o) this.f58700OooOoOO).OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                    C20548Oooo0O0.OooO00o oooO00o3 = new C20548Oooo0O0.OooO00o((InterfaceC33672o00ooo) oooO0O0);
                    while (true) {
                        c20548Oooo0O0 = this.f58702OooOoo0;
                        AtomicReference<C20548Oooo0O0.OooO00o> atomicReference3 = c20548Oooo0O0.f58693OooO00o;
                        C20548Oooo0O0.OooO00o oooO00o4 = atomicReference3.get();
                        if (oooO00o4 != null) {
                            Oooo0 oooo0 = Oooo0.f58681OooOo0o;
                            if (oooo0.compareTo(oooo0) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(oooO00o4, oooO00o3)) {
                            if (atomicReference3.get() != oooO00o4) {
                                break;
                            }
                        }
                        if (oooO00o4 != null) {
                            oooO00o4.f58695OooO00o.cancel((CancellationException) null);
                        }
                        this.f58700OooOoOO = oooO00o3;
                        interfaceC33895OooO00o = c20548Oooo0O0.f58694OooO0O0;
                        this.f58697OooOo0o = interfaceC33895OooO00o;
                        AbstractC32476OooO abstractC32476OooO = this.f58701OooOoo;
                        this.f58696OooOo = abstractC32476OooO;
                        this.f58699OooOoO0 = c20548Oooo0O0;
                        this.f58698OooOoO = 1;
                        if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                            r4 = abstractC32476OooO;
                            oooO00o = oooO00o3;
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c20548Oooo0O02 = (C20548Oooo0O0) this.f58696OooOo;
                    interfaceC33895OooO00o2 = this.f58697OooOo0o;
                    oooO00o2 = (C20548Oooo0O0.OooO00o) this.f58700OooOoOO;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        atomicReference2 = c20548Oooo0O02.f58693OooO00o;
                        while (!atomicReference2.compareAndSet(oooO00o2, null) && atomicReference2.get() == oooO00o2) {
                        }
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c20548Oooo0O02.f58693OooO00o;
                        while (!atomicReference.compareAndSet(oooO00o2, null) && atomicReference.get() == oooO00o2) {
                        }
                        throw th;
                    }
                }
                C20548Oooo0O0 c20548Oooo0O03 = this.f58699OooOoO0;
                InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) this.f58696OooOo;
                interfaceC33895OooO00o = this.f58697OooOo0o;
                oooO00o = (C20548Oooo0O0.OooO00o) this.f58700OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                c20548Oooo0O0 = c20548Oooo0O03;
                r4 = interfaceC32507OooOO0o;
                this.f58700OooOoOO = oooO00o;
                this.f58697OooOo0o = interfaceC33895OooO00o2;
                this.f58696OooOo = c20548Oooo0O0;
                this.f58699OooOoO0 = null;
                this.f58698OooOoO = 2;
                Object objInvoke = r4.invoke(this);
                if (objInvoke != enumC32485OooO00o) {
                    c20548Oooo0O02 = c20548Oooo0O0;
                    obj = objInvoke;
                    oooO00o2 = oooO00o;
                    atomicReference2 = c20548Oooo0O02.f58693OooO00o;
                    while (!atomicReference2.compareAndSet(oooO00o2, null)) {
                    }
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return obj;
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                c20548Oooo0O02 = c20548Oooo0O0;
                th = th3;
                oooO00o2 = oooO00o;
                atomicReference = c20548Oooo0O02.f58693OooO00o;
                while (!atomicReference.compareAndSet(oooO00o2, null)) {
                }
                throw th;
            }
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
        } catch (Throwable th4) {
            r1.OooOOO0(null);
            throw th4;
        }
    }
}
