package OooOoo0;

import OooOoo.C20589OooO;
import OooOoo.C20598OooOO0;
import OooOoo0.o00000OO;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: OooOoo0.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m80623f = "MutatorMutex.kt", m80624l = {173, 160}, m80625m = "invokeSuspend")
public final class C20704o00000Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f59443OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f59444OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o00000OO f59445OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C20598OooOO0.OooO00o f59446OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f59447OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ o00000O f59448OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f59449OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ o00000OO f59450OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C20589OooO.OooO00o f59451OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C20598OooOO0.OooO00o f59452Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20704o00000Oo(o00000O o00000o, o00000OO o00000oo2, C20589OooO.OooO00o oooO00o, C20598OooOO0.OooO00o oooO00o2, Continuation continuation) {
        super(2, continuation);
        this.f59448OooOoo = o00000o;
        this.f59450OooOooO = o00000oo2;
        this.f59451OooOooo = oooO00o;
        this.f59452Oooo000 = oooO00o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20704o00000Oo c20704o00000Oo = new C20704o00000Oo(this.f59448OooOoo, this.f59450OooOooO, this.f59451OooOooo, this.f59452Oooo000, continuation);
        c20704o00000Oo.f59449OooOoo0 = obj;
        return c20704o00000Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C20704o00000Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, oO0o0oOo.OooO00o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        o00000OO o00000oo2;
        C20598OooOO0.OooO00o oooO00o;
        o00000OO.OooO00o oooO00o2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC32508OooOOOo interfaceC32508OooOOOo;
        o00000OO o00000oo3;
        Throwable th;
        o00000OO.OooO00o oooO00o3;
        AtomicReference<o00000OO.OooO00o> atomicReference;
        AtomicReference<o00000OO.OooO00o> atomicReference2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f59447OooOoOO;
        try {
            try {
                if (r1 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = ((InterfaceC33636Oooo00o) this.f59449OooOoo0).OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                    o00000OO.OooO00o oooO00o4 = new o00000OO.OooO00o(this.f59448OooOoo, (InterfaceC33672o00ooo) oooO0O0);
                    while (true) {
                        o00000oo2 = this.f59450OooOooO;
                        AtomicReference<o00000OO.OooO00o> atomicReference3 = o00000oo2.f59439OooO00o;
                        o00000OO.OooO00o oooO00o5 = atomicReference3.get();
                        if (oooO00o5 != null && oooO00o4.f59441OooO00o.compareTo(oooO00o5.f59441OooO00o) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(oooO00o5, oooO00o4)) {
                            if (atomicReference3.get() != oooO00o5) {
                                break;
                            }
                        }
                        if (oooO00o5 != null) {
                            oooO00o5.f59442OooO0O0.cancel((CancellationException) null);
                        }
                        this.f59449OooOoo0 = oooO00o4;
                        C33898OooO0Oo c33898OooO0Oo = o00000oo2.f59440OooO0O0;
                        this.f59444OooOo0o = c33898OooO0Oo;
                        C20589OooO.OooO00o oooO00o6 = this.f59451OooOooo;
                        this.f59443OooOo = oooO00o6;
                        C20598OooOO0.OooO00o oooO00o7 = this.f59452Oooo000;
                        this.f59446OooOoO0 = oooO00o7;
                        this.f59445OooOoO = o00000oo2;
                        this.f59447OooOoOO = 1;
                        if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                            oooO00o = oooO00o7;
                            oooO00o2 = oooO00o4;
                            interfaceC33895OooO00o = c33898OooO0Oo;
                            interfaceC32508OooOOOo = oooO00o6;
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o00000oo3 = (o00000OO) this.f59443OooOo;
                    interfaceC33895OooO00o = this.f59444OooOo0o;
                    oooO00o3 = (o00000OO.OooO00o) this.f59449OooOoo0;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        atomicReference2 = o00000oo3.f59439OooO00o;
                        while (!atomicReference2.compareAndSet(oooO00o3, null) && atomicReference2.get() == oooO00o3) {
                        }
                        interfaceC33895OooO00o.OooOOO0(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = o00000oo3.f59439OooO00o;
                        while (!atomicReference.compareAndSet(oooO00o3, null)) {
                        }
                        throw th;
                    }
                }
                o00000OO o00000oo4 = this.f59445OooOoO;
                oooO00o = this.f59446OooOoO0;
                interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) this.f59443OooOo;
                InterfaceC33895OooO00o interfaceC33895OooO00o2 = this.f59444OooOo0o;
                oooO00o2 = (o00000OO.OooO00o) this.f59449OooOoo0;
                C32446OooOOOo.OooO0O0(obj);
                o00000oo2 = o00000oo4;
                interfaceC33895OooO00o = interfaceC33895OooO00o2;
                this.f59449OooOoo0 = oooO00o2;
                this.f59444OooOo0o = interfaceC33895OooO00o;
                this.f59443OooOo = o00000oo2;
                this.f59446OooOoO0 = null;
                this.f59445OooOoO = null;
                this.f59447OooOoOO = 2;
                Object objInvoke = interfaceC32508OooOOOo.invoke(oooO00o, this);
                if (objInvoke != enumC32485OooO00o) {
                    o00000oo3 = o00000oo2;
                    obj = objInvoke;
                    oooO00o3 = oooO00o2;
                    atomicReference2 = o00000oo3.f59439OooO00o;
                    while (!atomicReference2.compareAndSet(oooO00o3, null)) {
                    }
                    interfaceC33895OooO00o.OooOOO0(null);
                    return obj;
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                o00000oo3 = o00000oo2;
                th = th3;
                oooO00o3 = oooO00o2;
                atomicReference = o00000oo3.f59439OooO00o;
                while (!atomicReference.compareAndSet(oooO00o3, null) && atomicReference.get() == oooO00o3) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.OooOOO0(null);
            throw th4;
        }
    }
}
