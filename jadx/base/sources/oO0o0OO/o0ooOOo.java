package oO0o0OO;

import androidx.fragment.app.C21904OooOoo0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0O.AbstractC33570OooOO0;
import oO0o0O0O.C33571OooOO0O;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33819OooO;
import oO0o0Ooo.C33828OooOO0;
import oO0o0Ooo.C33829OooOO0O;
import oO0o0Ooo.C33839OooOo0;
import oO0o0oO0.C33887OooO0Oo;
import oO0o0oO0.InterfaceC33883OooO;
import oO0o0oO0.InterfaceC33886OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public class o0ooOOo implements InterfaceC33672o00ooo, InterfaceC33619OooOOoo, InterfaceC33663o000000o {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121392OooOo0o = AtomicReferenceFieldUpdater.newUpdater(o0ooOOo.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121391OooOo = AtomicReferenceFieldUpdater.newUpdater(o0ooOOo.class, Object.class, "_parentHandle$volatile");

    public static final class OooO00o<T> extends C33614OooOOO0<T> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final o0ooOOo f121393OooOooo;

        public OooO00o(Continuation<? super T> continuation, o0ooOOo o0ooooo2) {
            super(1, continuation);
            this.f121393OooOooo = o0ooooo2;
        }

        @Override // oO0o0OO.C33614OooOOO0
        public final Throwable OooOOo0(o0ooOOo o0ooooo2) {
            Throwable thOooO0OO;
            o0ooOOo o0ooooo3 = this.f121393OooOooo;
            o0ooooo3.getClass();
            Object obj = o0ooOOo.f121392OooOo0o.get(o0ooooo3);
            return (!(obj instanceof OooO0OO) || (thOooO0OO = ((OooO0OO) obj).OooO0OO()) == null) ? obj instanceof C33620OooOo ? ((C33620OooOo) obj).f121304OooO00o : o0ooooo2.getCancellationException() : thOooO0OO;
        }

        @Override // oO0o0OO.C33614OooOOO0
        public final String OooOoOO() {
            return "AwaitContinuation";
        }
    }

    public static final class OooO0O0 extends AbstractC33673o0ooOO0 {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final o0ooOOo f121394OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final C33617OooOOo f121395OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final OooO0OO f121396OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final Object f121397OooOooO;

        public OooO0O0(o0ooOOo o0ooooo2, OooO0OO oooO0OO, C33617OooOOo c33617OooOOo, Object obj) {
            this.f121394OooOoOO = o0ooooo2;
            this.f121396OooOoo0 = oooO0OO;
            this.f121395OooOoo = c33617OooOOo;
            this.f121397OooOooO = obj;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final boolean OooO() {
            return false;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final void OooOO0(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o0ooOOo.f121392OooOo0o;
            o0ooOOo o0ooooo2 = this.f121394OooOoOO;
            o0ooooo2.getClass();
            C33617OooOOo c33617OooOOo = this.f121395OooOoo;
            C33617OooOOo c33617OooOOoOoooO = o0ooOOo.OoooO(c33617OooOOo);
            OooO0OO oooO0OO = this.f121396OooOoo0;
            Object obj = this.f121397OooOooO;
            if (c33617OooOOoOoooO == null || !o0ooooo2.Oooooo0(oooO0OO, c33617OooOOoOoooO, obj)) {
                oooO0OO.f121401OooOo0o.OooO0O0(new C33819OooO(2), 2);
                C33617OooOOo c33617OooOOoOoooO2 = o0ooOOo.OoooO(c33617OooOOo);
                if (c33617OooOOoOoooO2 == null || !o0ooooo2.Oooooo0(oooO0OO, c33617OooOOoOoooO2, obj)) {
                    o0ooooo2.OooOOo(o0ooooo2.OooOoo0(oooO0OO, obj));
                }
            }
        }
    }

    public static final class OooO0OO implements InterfaceC33678ooOO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final o0O0O00 f121401OooOo0o;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f121398OooOo = AtomicIntegerFieldUpdater.newUpdater(OooO0OO.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f121400OooOoO0 = AtomicReferenceFieldUpdater.newUpdater(OooO0OO.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f121399OooOoO = AtomicReferenceFieldUpdater.newUpdater(OooO0OO.class, Object.class, "_exceptionsHolder$volatile");

        public OooO0OO(o0O0O00 o0o0o00, Throwable th) {
            this.f121401OooOo0o = o0o0o00;
            this._rootCause$volatile = th;
        }

        @Override // oO0o0OO.InterfaceC33678ooOO
        public final o0O0O00 OooO00o() {
            return this.f121401OooOo0o;
        }

        public final void OooO0O0(Throwable th) {
            Throwable thOooO0OO = OooO0OO();
            if (thOooO0OO == null) {
                f121400OooOoO0.set(this, th);
                return;
            }
            if (th == thOooO0OO) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121399OooOoO;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        public final Throwable OooO0OO() {
            return (Throwable) f121400OooOoO0.get(this);
        }

        public final boolean OooO0Oo() {
            return OooO0OO() != null;
        }

        public final ArrayList OooO0o0(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121399OooOoO;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thOooO0OO = OooO0OO();
            if (thOooO0OO != null) {
                arrayList.add(0, thOooO0OO);
            }
            if (th != null && !th.equals(thOooO0OO)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, o0Oo0oo.f121387OooO0o0);
            return arrayList;
        }

        @Override // oO0o0OO.InterfaceC33678ooOO
        public final boolean isActive() {
            return OooO0OO() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(OooO0Oo());
            sb.append(", completing=");
            sb.append(f121398OooOo.get(this) != 0);
            sb.append(", rootCause=");
            sb.append(OooO0OO());
            sb.append(", exceptions=");
            sb.append(f121399OooOoO.get(this));
            sb.append(", list=");
            sb.append(this.f121401OooOo0o);
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.o0ooOOo$OooO0Oo, reason: case insensitive filesystem */
    public final class C33674OooO0Oo extends AbstractC33673o0ooOO0 {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final InterfaceC33883OooO<?> f121402OooOoOO;

        public C33674OooO0Oo(InterfaceC33883OooO<?> interfaceC33883OooO) {
            this.f121402OooOoOO = interfaceC33883OooO;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final boolean OooO() {
            return false;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final void OooOO0(Throwable th) {
            o0ooOOo o0ooooo2 = o0ooOOo.this;
            o0ooooo2.getClass();
            Object objOooO00o = o0ooOOo.f121392OooOo0o.get(o0ooooo2);
            if (!(objOooO00o instanceof C33620OooOo)) {
                objOooO00o = o0Oo0oo.OooO00o(objOooO00o);
            }
            this.f121402OooOoOO.OooO0o0(o0ooooo2, objOooO00o);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.JobSupport$children$1", m80623f = "JobSupport.kt", m80624l = {1003, 1005}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<AbstractC33570OooOO0<? super InterfaceC33672o00ooo>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C33829OooOO0O f121404OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33828OooOO0 f121405OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f121406OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f121407OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f121408OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Continuation continuation, o0ooOOo o0ooooo2) {
            super(2, continuation);
            this.f121408OooOoOO = o0ooooo2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(continuation, this.f121408OooOoOO);
            oooO0o.f121406OooOoO = obj;
            return oooO0o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(AbstractC33570OooOO0<? super InterfaceC33672o00ooo> abstractC33570OooOO0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(abstractC33570OooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o0O0O00 o0o0o00OooO00o;
            C33828OooOO0 c33828OooOO0;
            C33829OooOO0O c33829OooOO0OOooO0o0;
            AbstractC33570OooOO0 abstractC33570OooOO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121407OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC33570OooOO0 abstractC33570OooOO02 = (AbstractC33570OooOO0) this.f121406OooOoO;
                o0ooOOo o0ooooo2 = this.f121408OooOoOO;
                o0ooooo2.getClass();
                Object obj2 = o0ooOOo.f121392OooOo0o.get(o0ooooo2);
                if (obj2 instanceof C33617OooOOo) {
                    InterfaceC33619OooOOoo interfaceC33619OooOOoo = ((C33617OooOOo) obj2).f121302OooOoOO;
                    this.f121407OooOoO0 = 1;
                    abstractC33570OooOO02.OooO00o(interfaceC33619OooOOoo, this);
                    return enumC32485OooO00o;
                }
                if ((obj2 instanceof InterfaceC33678ooOO) && (o0o0o00OooO00o = ((InterfaceC33678ooOO) obj2).OooO00o()) != null) {
                    Object obj3 = C33829OooOO0O.f121935OooOo0o.get(o0o0o00OooO00o);
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    C33829OooOO0O c33829OooOO0O = (C33829OooOO0O) obj3;
                    c33828OooOO0 = o0o0o00OooO00o;
                    c33829OooOO0OOooO0o0 = c33829OooOO0O;
                    abstractC33570OooOO0 = abstractC33570OooOO02;
                    if (!c33829OooOO0OOooO0o0.equals(c33828OooOO0)) {
                    }
                }
            } else if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c33829OooOO0OOooO0o0 = this.f121404OooOo;
                c33828OooOO0 = this.f121405OooOo0o;
                abstractC33570OooOO0 = (AbstractC33570OooOO0) this.f121406OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                c33829OooOO0OOooO0o0 = c33829OooOO0OOooO0o0.OooO0o0();
                if (!c33829OooOO0OOooO0o0.equals(c33828OooOO0)) {
                    if (c33829OooOO0OOooO0o0 instanceof C33617OooOOo) {
                        this.f121406OooOoO = abstractC33570OooOO0;
                        this.f121405OooOo0o = c33828OooOO0;
                        this.f121404OooOo = c33829OooOO0OOooO0o0;
                        this.f121407OooOoO0 = 2;
                        abstractC33570OooOO0.OooO00o(((C33617OooOOo) c33829OooOO0OOooO0o0).f121302OooOoOO, this);
                        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                        return enumC32485OooO00o;
                    }
                    c33829OooOO0OOooO0o0 = c33829OooOO0OOooO0o0.OooO0o0();
                    if (!c33829OooOO0OOooO0o0.equals(c33828OooOO0)) {
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.o0ooOOo$OooO0o0, reason: case insensitive filesystem */
    public final class C33675OooO0o0 extends AbstractC33673o0ooOO0 {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final InterfaceC33883OooO<?> f121409OooOoOO;

        public C33675OooO0o0(InterfaceC33883OooO<?> interfaceC33883OooO) {
            this.f121409OooOoOO = interfaceC33883OooO;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final boolean OooO() {
            return false;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final void OooOO0(Throwable th) {
            this.f121409OooOoOO.OooO0o0(o0ooOOo.this, C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.o0ooOOo$OooO0oO, reason: case insensitive filesystem */
    public /* synthetic */ class C33676OooO0oO extends C24019OooOO0o implements InterfaceC32510OooOOo0<o0ooOOo, InterfaceC33883OooO<?>, Object, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C33676OooO0oO f121411OooOo0o = new C33676OooO0oO(3, o0ooOOo.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final C32460OooOooO invoke(o0ooOOo o0ooooo2, InterfaceC33883OooO<?> interfaceC33883OooO, Object obj) {
            o0ooOOo o0ooooo3 = o0ooooo2;
            InterfaceC33883OooO<?> interfaceC33883OooO2 = interfaceC33883OooO;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o0ooOOo.f121392OooOo0o;
            o0ooooo3.getClass();
            while (true) {
                Object obj2 = o0ooOOo.f121392OooOo0o.get(o0ooooo3);
                if (!(obj2 instanceof InterfaceC33678ooOO)) {
                    interfaceC33883OooO2.OooO0Oo(C32460OooOooO.f116667OooO00o);
                    break;
                }
                if (o0ooooo3.Ooooo0o(obj2) >= 0) {
                    interfaceC33883OooO2.OooO0O0(oO00o00.OooO0OO.OooO0o0(o0ooooo3, o0ooooo3.new C33675OooO0o0(interfaceC33883OooO2)));
                    break;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public o0ooOOo(boolean z) {
        this._state$volatile = z ? o0Oo0oo.f121388OooO0oO : o0Oo0oo.f121386OooO0o;
    }

    public static C33617OooOOo OoooO(C33829OooOO0O c33829OooOO0O) {
        while (c33829OooOO0O.OooO0o()) {
            C33829OooOO0O c33829OooOO0OOooO0OO = c33829OooOO0O.OooO0OO();
            if (c33829OooOO0OOooO0OO == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33829OooOO0O.f121934OooOo;
                Object obj = atomicReferenceFieldUpdater.get(c33829OooOO0O);
                while (true) {
                    c33829OooOO0O = (C33829OooOO0O) obj;
                    if (!c33829OooOO0O.OooO0o()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c33829OooOO0O);
                }
            } else {
                c33829OooOO0O = c33829OooOO0OOooO0OO;
            }
        }
        while (true) {
            c33829OooOO0O = c33829OooOO0O.OooO0o0();
            if (!c33829OooOO0O.OooO0o()) {
                if (c33829OooOO0O instanceof C33617OooOOo) {
                    return (C33617OooOOo) c33829OooOO0O;
                }
                if (c33829OooOO0O instanceof o0O0O00) {
                    return null;
                }
            }
        }
    }

    public static String OooooO0(Object obj) {
        if (!(obj instanceof OooO0OO)) {
            return obj instanceof InterfaceC33678ooOO ? ((InterfaceC33678ooOO) obj).isActive() ? "Active" : "New" : obj instanceof C33620OooOo ? "Cancelled" : "Completed";
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return oooO0OO.OooO0Oo() ? "Cancelling" : OooO0OO.f121398OooOo.get(oooO0OO) != 0 ? "Completing" : "Active";
    }

    public static CancellationException OooooOO(o0ooOOo o0ooooo2, Throwable th) {
        o0ooooo2.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new oo000o(o0ooooo2.OooOo(), th, o0ooooo2) : cancellationException;
    }

    public void OooOOo(Object obj) {
    }

    public void OooOOoo(Object obj) {
        OooOOo(obj);
    }

    public String OooOo() {
        return "Job was cancelled";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r0
      0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOo0(Object obj) {
        C33839OooOo0 c33839OooOo0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objOooooOo = o0Oo0oo.f121382OooO00o;
        if (Oooo00o()) {
            do {
                Object obj2 = f121392OooOo0o.get(this);
                if (obj2 instanceof InterfaceC33678ooOO) {
                    if (obj2 instanceof OooO0OO) {
                        OooO0OO oooO0OO = (OooO0OO) obj2;
                        oooO0OO.getClass();
                        if (OooO0OO.f121398OooOo.get(oooO0OO) != 0) {
                        }
                    }
                    objOooooOo = OooooOo(obj2, new C33620OooOo(false, OooOoOO(obj)));
                }
                objOooooOo = o0Oo0oo.f121382OooO00o;
                break;
            } while (objOooooOo == o0Oo0oo.f121384OooO0OO);
            if (objOooooOo != o0Oo0oo.f121383OooO0O0) {
                if (objOooooOo == o0Oo0oo.f121382OooO00o) {
                    Throwable thOooOoOO = null;
                    loop1: while (true) {
                        Object obj3 = f121392OooOo0o.get(this);
                        if (!(obj3 instanceof OooO0OO)) {
                            if (!(obj3 instanceof InterfaceC33678ooOO)) {
                                c33839OooOo0 = o0Oo0oo.f121385OooO0Oo;
                                break;
                            }
                            if (thOooOoOO == null) {
                                thOooOoOO = OooOoOO(obj);
                            }
                            InterfaceC33678ooOO interfaceC33678ooOO = (InterfaceC33678ooOO) obj3;
                            if (interfaceC33678ooOO.isActive()) {
                                o0O0O00 o0o0o00Oooo0O0 = Oooo0O0(interfaceC33678ooOO);
                                if (o0o0o00Oooo0O0 == null) {
                                    continue;
                                } else {
                                    OooO0OO oooO0OO2 = new OooO0OO(o0o0o00Oooo0O0, thOooOoOO);
                                    do {
                                        atomicReferenceFieldUpdater = f121392OooOo0o;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC33678ooOO, oooO0OO2)) {
                                            OoooOO0(o0o0o00Oooo0O0, thOooOoOO);
                                            c33839OooOo0 = o0Oo0oo.f121382OooO00o;
                                            break loop1;
                                        }
                                    } while (atomicReferenceFieldUpdater.get(this) == interfaceC33678ooOO);
                                }
                            } else {
                                Object objOooooOo2 = OooooOo(obj3, new C33620OooOo(false, thOooOoOO));
                                if (objOooooOo2 == o0Oo0oo.f121382OooO00o) {
                                    throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                                }
                                if (objOooooOo2 != o0Oo0oo.f121384OooO0OO) {
                                    objOooooOo = objOooooOo2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                try {
                                    OooO0OO oooO0OO3 = (OooO0OO) obj3;
                                    oooO0OO3.getClass();
                                    if (OooO0OO.f121399OooOoO.get(oooO0OO3) == o0Oo0oo.f121387OooO0o0) {
                                        c33839OooOo0 = o0Oo0oo.f121385OooO0Oo;
                                    } else {
                                        boolean zOooO0Oo = ((OooO0OO) obj3).OooO0Oo();
                                        if (obj != null || !zOooO0Oo) {
                                            if (thOooOoOO == null) {
                                                thOooOoOO = OooOoOO(obj);
                                            }
                                            ((OooO0OO) obj3).OooO0O0(thOooOoOO);
                                        }
                                        Throwable thOooO0OO = zOooO0Oo ? null : ((OooO0OO) obj3).OooO0OO();
                                        if (thOooO0OO != null) {
                                            OoooOO0(((OooO0OO) obj3).f121401OooOo0o, thOooO0OO);
                                        }
                                        c33839OooOo0 = o0Oo0oo.f121382OooO00o;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                    objOooooOo = c33839OooOo0;
                }
                if (objOooooOo != o0Oo0oo.f121382OooO00o && objOooooOo != o0Oo0oo.f121383OooO0O0) {
                    if (objOooooOo == o0Oo0oo.f121385OooO0Oo) {
                        return false;
                    }
                    OooOOo(objOooooOo);
                    return true;
                }
            }
        }
        return true;
    }

    public final Object OooOo00(Continuation<Object> continuation) throws Throwable {
        Object obj;
        do {
            obj = f121392OooOo0o.get(this);
            if (!(obj instanceof InterfaceC33678ooOO)) {
                if (obj instanceof C33620OooOo) {
                    throw ((C33620OooOo) obj).f121304OooO00o;
                }
                return o0Oo0oo.OooO00o(obj);
            }
        } while (Ooooo0o(obj) < 0);
        OooO00o oooO00o = new OooO00o(C21904OooOoo0.OooO0o0(continuation), this);
        oooO00o.OooOOoo();
        oooO00o.OooOo0O(new C33652OoooOoo(oO00o00.OooO0OO.OooO0o0(this, new o00000(oooO00o))));
        Object objOooOOo = oooO00o.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    public void OooOo0O(CancellationException cancellationException) {
        OooOo0(cancellationException);
    }

    public final boolean OooOo0o(Throwable th) {
        if (!Oooo()) {
            boolean z = th instanceof CancellationException;
            InterfaceC33618OooOOo0 interfaceC33618OooOOo0 = (InterfaceC33618OooOOo0) f121391OooOo.get(this);
            return (interfaceC33618OooOOo0 == null || interfaceC33618OooOOo0 == o000000.f121353OooOo0o) ? z : interfaceC33618OooOOo0.OooOOo0(th) || z;
        }
        return true;
    }

    public final void OooOoO(InterfaceC33678ooOO interfaceC33678ooOO, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121391OooOo;
        InterfaceC33618OooOOo0 interfaceC33618OooOOo0 = (InterfaceC33618OooOOo0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC33618OooOOo0 != null) {
            interfaceC33618OooOOo0.dispose();
            atomicReferenceFieldUpdater.set(this, o000000.f121353OooOo0o);
        }
        C33626OooOoO0 c33626OooOoO0 = null;
        C33620OooOo c33620OooOo = obj instanceof C33620OooOo ? (C33620OooOo) obj : null;
        Throwable th = c33620OooOo != null ? c33620OooOo.f121304OooO00o : null;
        if (interfaceC33678ooOO instanceof AbstractC33673o0ooOO0) {
            try {
                ((AbstractC33673o0ooOO0) interfaceC33678ooOO).OooOO0(th);
                return;
            } catch (Throwable th2) {
                Oooo0o(new C33626OooOoO0("Exception in completion handler " + interfaceC33678ooOO + " for " + this, th2));
                return;
            }
        }
        o0O0O00 o0o0o00OooO00o = interfaceC33678ooOO.OooO00o();
        if (o0o0o00OooO00o != null) {
            o0o0o00OooO00o.OooO0O0(new C33819OooO(1), 1);
            Object obj2 = C33829OooOO0O.f121935OooOo0o.get(o0o0o00OooO00o);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C33829OooOO0O c33829OooOO0OOooO0o0 = (C33829OooOO0O) obj2; !c33829OooOO0OOooO0o0.equals(o0o0o00OooO00o); c33829OooOO0OOooO0o0 = c33829OooOO0OOooO0o0.OooO0o0()) {
                if (c33829OooOO0OOooO0o0 instanceof AbstractC33673o0ooOO0) {
                    try {
                        ((AbstractC33673o0ooOO0) c33829OooOO0OOooO0o0).OooOO0(th);
                    } catch (Throwable th3) {
                        if (c33626OooOoO0 != null) {
                            C32435OooO0Oo.OooO00o(c33626OooOoO0, th3);
                        } else {
                            c33626OooOoO0 = new C33626OooOoO0("Exception in completion handler " + c33829OooOO0OOooO0o0 + " for " + this, th3);
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
            }
            if (c33626OooOoO0 != null) {
                Oooo0o(c33626OooOoO0);
            }
        }
    }

    public boolean OooOoO0(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return OooOo0(th) && Oooo00O();
    }

    public final Throwable OooOoOO(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new oo000o(OooOo(), null, this) : th;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC33663o000000o) obj).o0000oO();
    }

    public final Object OooOoo() throws Throwable {
        Object obj = f121392OooOo0o.get(this);
        if (obj instanceof InterfaceC33678ooOO) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C33620OooOo) {
            throw ((C33620OooOo) obj).f121304OooO00o;
        }
        return o0Oo0oo.OooO00o(obj);
    }

    public final Object OooOoo0(OooO0OO oooO0OO, Object obj) {
        boolean zOooO0Oo;
        Throwable thOooOooo;
        C33620OooOo c33620OooOo = obj instanceof C33620OooOo ? (C33620OooOo) obj : null;
        Throwable th = c33620OooOo != null ? c33620OooOo.f121304OooO00o : null;
        synchronized (oooO0OO) {
            zOooO0Oo = oooO0OO.OooO0Oo();
            ArrayList<Throwable> arrayListOooO0o0 = oooO0OO.OooO0o0(th);
            thOooOooo = OooOooo(oooO0OO, arrayListOooO0o0);
            if (thOooOooo != null && arrayListOooO0o0.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListOooO0o0.size()));
                for (Throwable th2 : arrayListOooO0o0) {
                    if (th2 != thOooOooo && th2 != thOooOooo && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C32435OooO0Oo.OooO00o(thOooOooo, th2);
                    }
                }
            }
        }
        if (thOooOooo != null && thOooOooo != th) {
            obj = new C33620OooOo(false, thOooOooo);
        }
        if (thOooOooo != null && (OooOo0o(thOooOooo) || Oooo0o0(thOooOooo))) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C33620OooOo.f121303OooO0O0.compareAndSet((C33620OooOo) obj, 0, 1);
        }
        if (!zOooO0Oo) {
            o000oOoO(thOooOooo);
        }
        OoooOOO(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121392OooOo0o;
        Object o00o0o2 = obj instanceof InterfaceC33678ooOO ? new o00O0O((InterfaceC33678ooOO) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, oooO0OO, o00o0o2) && atomicReferenceFieldUpdater.get(this) == oooO0OO) {
        }
        OooOoO(oooO0OO, obj);
        return obj;
    }

    public final Throwable OooOooo(OooO0OO oooO0OO, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (oooO0OO.OooO0Oo()) {
                return new oo000o(OooOo(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof o0000) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof o0000)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean Oooo() {
        return this instanceof C33606OooO0o;
    }

    public boolean Oooo0(Object obj) {
        return OoooO00(obj);
    }

    public boolean Oooo00O() {
        return true;
    }

    public boolean Oooo00o() {
        return this instanceof C33621OooOo0;
    }

    public final o0O0O00 Oooo0O0(InterfaceC33678ooOO interfaceC33678ooOO) {
        o0O0O00 o0o0o00OooO00o = interfaceC33678ooOO.OooO00o();
        if (o0o0o00OooO00o != null) {
            return o0o0o00OooO00o;
        }
        if (interfaceC33678ooOO instanceof C33654Ooooo0o) {
            return new o0O0O00();
        }
        if (interfaceC33678ooOO instanceof AbstractC33673o0ooOO0) {
            Ooooo00((AbstractC33673o0ooOO0) interfaceC33678ooOO);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC33678ooOO).toString());
    }

    public void Oooo0o(C33626OooOoO0 c33626OooOoO0) {
        throw c33626OooOoO0;
    }

    public boolean Oooo0o0(Throwable th) {
        return false;
    }

    public final void Oooo0oO(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        o000000 o000000Var = o000000.f121353OooOo0o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121391OooOo;
        if (interfaceC33672o00ooo == null) {
            atomicReferenceFieldUpdater.set(this, o000000Var);
            return;
        }
        interfaceC33672o00ooo.start();
        InterfaceC33618OooOOo0 interfaceC33618OooOOo0AttachChild = interfaceC33672o00ooo.attachChild(this);
        atomicReferenceFieldUpdater.set(this, interfaceC33618OooOOo0AttachChild);
        if (isCompleted()) {
            interfaceC33618OooOOo0AttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, o000000Var);
        }
    }

    public final InterfaceC33651OoooOoO Oooo0oo(boolean z, AbstractC33673o0ooOO0 abstractC33673o0ooOO0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o000000 o000000Var;
        boolean z2;
        boolean zOooO0O0;
        abstractC33673o0ooOO0.f121390OooOoO = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f121392OooOo0o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C33654Ooooo0o;
            o000000Var = o000000.f121353OooOo0o;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC33678ooOO)) {
                    z2 = false;
                    break;
                }
                InterfaceC33678ooOO interfaceC33678ooOO = (InterfaceC33678ooOO) obj;
                o0O0O00 o0o0o00OooO00o = interfaceC33678ooOO.OooO00o();
                if (o0o0o00OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Ooooo00((AbstractC33673o0ooOO0) obj);
                } else {
                    if (abstractC33673o0ooOO0.OooO()) {
                        OooO0OO oooO0OO = interfaceC33678ooOO instanceof OooO0OO ? (OooO0OO) interfaceC33678ooOO : null;
                        Throwable thOooO0OO = oooO0OO != null ? oooO0OO.OooO0OO() : null;
                        if (thOooO0OO == null) {
                            zOooO0O0 = o0o0o00OooO00o.OooO0O0(abstractC33673o0ooOO0, 5);
                        } else if (z) {
                            abstractC33673o0ooOO0.OooOO0(thOooO0OO);
                            return o000000Var;
                        }
                    } else {
                        zOooO0O0 = o0o0o00OooO00o.OooO0O0(abstractC33673o0ooOO0, 1);
                    }
                    if (zOooO0O0) {
                        break;
                    }
                }
            } else {
                C33654Ooooo0o c33654Ooooo0o = (C33654Ooooo0o) obj;
                if (c33654Ooooo0o.f121333OooOo0o) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC33673o0ooOO0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                OoooOoo(c33654Ooooo0o);
            }
        }
        if (z2) {
            return abstractC33673o0ooOO0;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C33620OooOo c33620OooOo = obj2 instanceof C33620OooOo ? (C33620OooOo) obj2 : null;
            abstractC33673o0ooOO0.OooOO0(c33620OooOo != null ? c33620OooOo.f121304OooO00o : null);
        }
        return o000000Var;
    }

    public final Object OoooO0(Object obj) {
        Object objOooooOo;
        do {
            objOooooOo = OooooOo(f121392OooOo0o.get(this), obj);
            if (objOooooOo == o0Oo0oo.f121382OooO00o) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C33620OooOo c33620OooOo = obj instanceof C33620OooOo ? (C33620OooOo) obj : null;
                throw new IllegalStateException(str, c33620OooOo != null ? c33620OooOo.f121304OooO00o : null);
            }
        } while (objOooooOo == o0Oo0oo.f121384OooO0OO);
        return objOooooOo;
    }

    public final boolean OoooO00(Object obj) {
        Object objOooooOo;
        do {
            objOooooOo = OooooOo(f121392OooOo0o.get(this), obj);
            if (objOooooOo == o0Oo0oo.f121382OooO00o) {
                return false;
            }
            if (objOooooOo == o0Oo0oo.f121383OooO0O0) {
                return true;
            }
        } while (objOooooOo == o0Oo0oo.f121384OooO0OO);
        OooOOo(objOooooOo);
        return true;
    }

    public String OoooO0O() {
        return getClass().getSimpleName();
    }

    public final void OoooOO0(o0O0O00 o0o0o00, Throwable th) {
        o000oOoO(th);
        o0o0o00.OooO0O0(new C33819OooO(4), 4);
        Object obj = C33829OooOO0O.f121935OooOo0o.get(o0o0o00);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C33626OooOoO0 c33626OooOoO0 = null;
        for (C33829OooOO0O c33829OooOO0OOooO0o0 = (C33829OooOO0O) obj; !c33829OooOO0OOooO0o0.equals(o0o0o00); c33829OooOO0OOooO0o0 = c33829OooOO0OOooO0o0.OooO0o0()) {
            if ((c33829OooOO0OOooO0o0 instanceof AbstractC33673o0ooOO0) && ((AbstractC33673o0ooOO0) c33829OooOO0OOooO0o0).OooO()) {
                try {
                    ((AbstractC33673o0ooOO0) c33829OooOO0OOooO0o0).OooOO0(th);
                } catch (Throwable th2) {
                    if (c33626OooOoO0 != null) {
                        C32435OooO0Oo.OooO00o(c33626OooOoO0, th2);
                    } else {
                        c33626OooOoO0 = new C33626OooOoO0("Exception in completion handler " + c33829OooOO0OOooO0o0 + " for " + this, th2);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        }
        if (c33626OooOoO0 != null) {
            Oooo0o(c33626OooOoO0);
        }
        OooOo0o(th);
    }

    public void OoooOOO(Object obj) {
    }

    public void OoooOoO() {
    }

    public final void OoooOoo(C33654Ooooo0o c33654Ooooo0o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o0O0O00 o0o0o00 = new o0O0O00();
        Object o0oooo02 = o0o0o00;
        if (!c33654Ooooo0o.f121333OooOo0o) {
            o0oooo02 = new o0OoOo0(o0o0o00);
        }
        do {
            atomicReferenceFieldUpdater = f121392OooOo0o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c33654Ooooo0o, o0oooo02)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c33654Ooooo0o);
    }

    public final void Ooooo00(AbstractC33673o0ooOO0 abstractC33673o0ooOO0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o0O0O00 o0o0o00 = new o0O0O00();
        abstractC33673o0ooOO0.getClass();
        C33829OooOO0O.f121934OooOo.set(o0o0o00, abstractC33673o0ooOO0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C33829OooOO0O.f121935OooOo0o;
        atomicReferenceFieldUpdater2.set(o0o0o00, abstractC33673o0ooOO0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC33673o0ooOO0) == abstractC33673o0ooOO0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC33673o0ooOO0, abstractC33673o0ooOO0, o0o0o00)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC33673o0ooOO0) != abstractC33673o0ooOO0) {
                        break;
                    }
                }
                o0o0o00.OooO0Oo(abstractC33673o0ooOO0);
                break loop0;
            }
            break;
        }
        C33829OooOO0O c33829OooOO0OOooO0o0 = abstractC33673o0ooOO0.OooO0o0();
        do {
            atomicReferenceFieldUpdater = f121392OooOo0o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC33673o0ooOO0, c33829OooOO0OOooO0o0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC33673o0ooOO0);
    }

    public final int Ooooo0o(Object obj) {
        boolean z = obj instanceof C33654Ooooo0o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121392OooOo0o;
        if (z) {
            if (((C33654Ooooo0o) obj).f121333OooOo0o) {
                return 0;
            }
            C33654Ooooo0o c33654Ooooo0o = o0Oo0oo.f121388OooO0oO;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33654Ooooo0o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            OoooOoO();
            return 1;
        }
        if (!(obj instanceof o0OoOo0)) {
            return 0;
        }
        o0O0O00 o0o0o00 = ((o0OoOo0) obj).f121389OooOo0o;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0o0o00)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        OoooOoO();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final Object OooooOo(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC33678ooOO)) {
            return o0Oo0oo.f121382OooO00o;
        }
        if (((obj instanceof C33654Ooooo0o) || (obj instanceof AbstractC33673o0ooOO0)) && !(obj instanceof C33617OooOOo) && !(obj2 instanceof C33620OooOo)) {
            InterfaceC33678ooOO interfaceC33678ooOO = (InterfaceC33678ooOO) obj;
            Object o00o0o2 = obj2 instanceof InterfaceC33678ooOO ? new o00O0O((InterfaceC33678ooOO) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f121392OooOo0o;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC33678ooOO, o00o0o2)) {
                    o000oOoO(null);
                    OoooOOO(obj2);
                    OooOoO(interfaceC33678ooOO, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC33678ooOO);
            return o0Oo0oo.f121384OooO0OO;
        }
        InterfaceC33678ooOO interfaceC33678ooOO2 = (InterfaceC33678ooOO) obj;
        o0O0O00 o0o0o00Oooo0O0 = Oooo0O0(interfaceC33678ooOO2);
        if (o0o0o00Oooo0O0 == null) {
            return o0Oo0oo.f121384OooO0OO;
        }
        OooO0OO oooO0OO = interfaceC33678ooOO2 instanceof OooO0OO ? (OooO0OO) interfaceC33678ooOO2 : null;
        if (oooO0OO == null) {
            oooO0OO = new OooO0OO(o0o0o00Oooo0O0, null);
        }
        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        synchronized (oooO0OO) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = OooO0OO.f121398OooOo;
                if (atomicIntegerFieldUpdater.get(oooO0OO) != 0) {
                    return o0Oo0oo.f121382OooO00o;
                }
                atomicIntegerFieldUpdater.set(oooO0OO, 1);
                if (oooO0OO != interfaceC33678ooOO2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f121392OooOo0o;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC33678ooOO2, oooO0OO)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC33678ooOO2) {
                            return o0Oo0oo.f121384OooO0OO;
                        }
                    }
                }
                boolean zOooO0Oo = oooO0OO.OooO0Oo();
                C33620OooOo c33620OooOo = obj2 instanceof C33620OooOo ? (C33620OooOo) obj2 : null;
                if (c33620OooOo != null) {
                    oooO0OO.OooO0O0(c33620OooOo.f121304OooO00o);
                }
                ?? OooO0OO2 = zOooO0Oo ? 0 : oooO0OO.OooO0OO();
                c24034Oooo00O.f80942OooOo0o = OooO0OO2;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                if (OooO0OO2 != 0) {
                    OoooOO0(o0o0o00Oooo0O0, OooO0OO2);
                }
                C33617OooOOo c33617OooOOoOoooO = OoooO(o0o0o00Oooo0O0);
                if (c33617OooOOoOoooO != null && Oooooo0(oooO0OO, c33617OooOOoOoooO, obj2)) {
                    return o0Oo0oo.f121383OooO0O0;
                }
                o0o0o00Oooo0O0.OooO0O0(new C33819OooO(2), 2);
                C33617OooOOo c33617OooOOoOoooO2 = OoooO(o0o0o00Oooo0O0);
                return (c33617OooOOoOoooO2 == null || !Oooooo0(oooO0OO, c33617OooOOoOoooO2, obj2)) ? OooOoo0(oooO0OO, obj2) : o0Oo0oo.f121383OooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Oooooo0(OooO0OO oooO0OO, C33617OooOOo c33617OooOOo, Object obj) {
        do {
            OooO0O0 oooO0O0 = new OooO0O0(this, oooO0OO, c33617OooOOo, obj);
            InterfaceC33619OooOOoo interfaceC33619OooOOoo = c33617OooOOo.f121302OooOoOO;
            if ((interfaceC33619OooOOoo instanceof o0ooOOo ? ((o0ooOOo) interfaceC33619OooOOoo).Oooo0oo(false, oooO0O0) : interfaceC33619OooOOoo.invokeOnCompletion(false, false, new o00oO0O(1, oooO0O0, AbstractC33673o0ooOO0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0))) != o000000.f121353OooOo0o) {
                return true;
            }
            c33617OooOOo = OoooO(c33617OooOOo);
        } while (c33617OooOOo != null);
        return false;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33618OooOOo0 attachChild(InterfaceC33619OooOOoo interfaceC33619OooOOoo) {
        C33617OooOOo c33617OooOOo = new C33617OooOOo(interfaceC33619OooOOoo);
        c33617OooOOo.f121390OooOoO = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121392OooOo0o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C33654Ooooo0o) {
                C33654Ooooo0o c33654Ooooo0o = (C33654Ooooo0o) obj;
                if (c33654Ooooo0o.f121333OooOo0o) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33617OooOOo)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                OoooOoo(c33654Ooooo0o);
            } else {
                boolean z = obj instanceof InterfaceC33678ooOO;
                o000000 o000000Var = o000000.f121353OooOo0o;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C33620OooOo c33620OooOo = obj2 instanceof C33620OooOo ? (C33620OooOo) obj2 : null;
                    c33617OooOOo.OooOO0(c33620OooOo != null ? c33620OooOo.f121304OooO00o : null);
                    return o000000Var;
                }
                o0O0O00 o0o0o00OooO00o = ((InterfaceC33678ooOO) obj).OooO00o();
                if (o0o0o00OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Ooooo00((AbstractC33673o0ooOO0) obj);
                } else if (!o0o0o00OooO00o.OooO0O0(c33617OooOOo, 7)) {
                    boolean zOooO0O0 = o0o0o00OooO00o.OooO0O0(c33617OooOOo, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof OooO0OO) {
                        thOooO0OO = ((OooO0OO) obj3).OooO0OO();
                    } else {
                        C33620OooOo c33620OooOo2 = obj3 instanceof C33620OooOo ? (C33620OooOo) obj3 : null;
                        if (c33620OooOo2 != null) {
                            thOooO0OO = c33620OooOo2.f121304OooO00o;
                        }
                    }
                    c33617OooOOo.OooOO0(thOooO0OO);
                    if (zOooO0O0) {
                        break loop0;
                    }
                    return o000000Var;
                }
            }
        }
        return c33617OooOOo;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return (R) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO00o(this, r, interfaceC32508OooOOOo);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, oooO0OO);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final CancellationException getCancellationException() {
        Object obj = f121392OooOo0o.get(this);
        if (!(obj instanceof OooO0OO)) {
            if (!(obj instanceof InterfaceC33678ooOO)) {
                return obj instanceof C33620OooOo ? OooooOO(this, ((C33620OooOo) obj).f121304OooO00o) : new oo000o(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thOooO0OO = ((OooO0OO) obj).OooO0OO();
        if (thOooO0OO == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException oo000oVar = thOooO0OO instanceof CancellationException ? (CancellationException) thOooO0OO : null;
        if (oo000oVar == null) {
            if (strConcat == null) {
                strConcat = OooOo();
            }
            oo000oVar = new oo000o(strConcat, thOooO0OO, this);
        }
        return oo000oVar;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33569OooO0oo<InterfaceC33672o00ooo> getChildren() {
        return new C33571OooOO0O(new OooO0o(null, this));
    }

    public Object getCompleted() {
        return OooOoo();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f121392OooOo0o.get(this);
        if (obj instanceof InterfaceC33678ooOO) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C33620OooOo c33620OooOo = obj instanceof C33620OooOo ? (C33620OooOo) obj : null;
        if (c33620OooOo != null) {
            return c33620OooOo.f121304OooO00o;
        }
        return null;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO<?> getKey() {
        return InterfaceC33672o00ooo.OooO00o.f121379OooOo0o;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33886OooO0OO getOnJoin() {
        C33676OooO0oO c33676OooO0oO = C33676OooO0oO.f121411OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(c33676OooO0oO, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        C24039Oooo0o0.OooO0o0(3, c33676OooO0oO);
        return new C33887OooO0Oo(this, c33676OooO0oO);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo getParent() {
        InterfaceC33618OooOOo0 interfaceC33618OooOOo0 = (InterfaceC33618OooOOo0) f121391OooOo.get(this);
        if (interfaceC33618OooOOo0 != null) {
            return interfaceC33618OooOOo0.getParent();
        }
        return null;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        return Oooo0oo(true, new C33670o00o0O(interfaceC32507OooOO0o));
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public boolean isActive() {
        Object obj = f121392OooOo0o.get(this);
        return (obj instanceof InterfaceC33678ooOO) && ((InterfaceC33678ooOO) obj).isActive();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCancelled() {
        Object obj = f121392OooOo0o.get(this);
        if (obj instanceof C33620OooOo) {
            return true;
        }
        return (obj instanceof OooO0OO) && ((OooO0OO) obj).OooO0Oo();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean isCompleted() {
        return !(f121392OooOo0o.get(this) instanceof InterfaceC33678ooOO);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final Object join(Continuation<? super C32460OooOooO> continuation) throws Throwable {
        Object obj;
        do {
            obj = f121392OooOo0o.get(this);
            if (!(obj instanceof InterfaceC33678ooOO)) {
                oO00o00.OooO0OO.OooO0OO(continuation.getContext());
                return C32460OooOooO.f116667OooO00o;
            }
        } while (Ooooo0o(obj) < 0);
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        c33614OooOOO0.OooOo0O(new C33652OoooOoo(oO00o00.OooO0OO.OooO0o0(this, new o00000O0(c33614OooOOO0))));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooOOo != enumC32485OooO00o) {
            objOooOOo = C32460OooOooO.f116667OooO00o;
        }
        return objOooOOo == enumC32485OooO00o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, oooO0OO);
    }

    @Override // oO0o0OO.InterfaceC33619OooOOoo
    public final void o0000O0O(o0ooOOo o0ooooo2) {
        OooOo0(o0ooooo2);
    }

    @Override // oO0o0OO.InterfaceC33663o000000o
    public final CancellationException o0000oO() {
        Throwable thOooO0OO;
        Object obj = f121392OooOo0o.get(this);
        if (obj instanceof OooO0OO) {
            thOooO0OO = ((OooO0OO) obj).OooO0OO();
        } else if (obj instanceof C33620OooOo) {
            thOooO0OO = ((C33620OooOo) obj).f121304OooO00o;
        } else {
            if (obj instanceof InterfaceC33678ooOO) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            thOooO0OO = null;
        }
        CancellationException cancellationException = thOooO0OO instanceof CancellationException ? (CancellationException) thOooO0OO : null;
        return cancellationException == null ? new oo000o("Parent job is ".concat(OooooO0(obj)), thOooO0OO, this) : cancellationException;
    }

    public void o000oOoO(Throwable th) {
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33672o00ooo plus(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        return interfaceC33672o00ooo;
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final boolean start() {
        int iOoooo0o;
        do {
            iOoooo0o = Ooooo0o(f121392OooOo0o.get(this));
            if (iOoooo0o == 0) {
                return false;
            }
        } while (iOoooo0o != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OoooO0O() + '{' + OooooO0(f121392OooOo0o.get(this)) + '}');
        sb.append('@');
        sb.append(C33640Oooo0o0.OooO00o(this));
        return sb.toString();
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public /* synthetic */ boolean cancel(Throwable th) {
        OooOo0O(th != null ? OooooOO(this, th) : new oo000o(OooOo(), null, this));
        return true;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public final InterfaceC33651OoooOoO invokeOnCompletion(boolean z, boolean z2, InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        AbstractC33673o0ooOO0 c33670o00o0O;
        if (z) {
            c33670o00o0O = new o00Ooo(interfaceC32507OooOO0o);
        } else {
            c33670o00o0O = new C33670o00o0O(interfaceC32507OooOO0o);
        }
        return Oooo0oo(z2, c33670o00o0O);
    }

    @Override // oO0o0OO.InterfaceC33672o00ooo
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new oo000o(OooOo(), null, this);
        }
        OooOo0O(cancellationException);
    }
}
