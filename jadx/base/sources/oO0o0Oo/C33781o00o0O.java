package oO0o0Oo;

import androidx.fragment.app.C21904OooOoo0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OoO.AbstractC33791OooO0O0;
import oO0o0OoO.AbstractC33793OooO0Oo;
import oO0o0OoO.C33811OooOo0O;
import oO0o0OoO.InterfaceC33807OooOOoo;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33781o00o0O<T> extends AbstractC33791OooO0O0<C33787oo000o> implements InterfaceC33767OoooOoo<T>, InterfaceC33721OooO0o, InterfaceC33807OooOOoo<T> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121795OooOoo0 = AtomicReferenceFieldUpdater.newUpdater(C33781o00o0O.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f121796OooOoOO;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: oO0o0Oo.o00o0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.StateFlowImpl", m80623f = "StateFlow.kt", m80624l = {389, 401, 406}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121797OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33781o00o0O f121798OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public InterfaceC33672o00ooo f121799OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C33787oo000o f121800OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Object f121801OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O<T> f121802OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public /* synthetic */ Object f121803OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f121804OooOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33781o00o0O<T> c33781o00o0O, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f121802OooOoo = c33781o00o0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121803OooOoo0 = obj;
            this.f121804OooOooO |= Integer.MIN_VALUE;
            this.f121802OooOoo.collect(null, this);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public C33781o00o0O(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean OooO(T t, T t2) {
        C33839OooOo0 c33839OooOo0 = C33811OooOo0O.f121897OooO00o;
        if (t == null) {
            t = (T) c33839OooOo0;
        }
        if (t2 == null) {
            t2 = (T) c33839OooOo0;
        }
        return OooOO0(t, t2);
    }

    @Override // oO0o0OoO.InterfaceC33807OooOOoo
    public final InterfaceC33721OooO0o<T> OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return (((i < 0 || i >= 2) && i != -2) || enumC33692OooO0OO != EnumC33692OooO0OO.f121451OooOo) ? C33773Oooooo.OooO0Oo(this, interfaceC34415OooO0oo, i, enumC33692OooO0OO) : this;
    }

    @Override // oO0o0Oo.InterfaceC33766OoooOoO
    public final void OooO0OO() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // oO0o0Oo.InterfaceC33766OoooOoO
    public final boolean OooO0Oo(T t) {
        setValue(t);
        return true;
    }

    @Override // oO0o0OoO.AbstractC33791OooO0O0
    public final AbstractC33793OooO0Oo OooO0o0() {
        return new C33787oo000o();
    }

    @Override // oO0o0OoO.AbstractC33791OooO0O0
    public final AbstractC33793OooO0Oo[] OooO0oO() {
        return new C33787oo000o[2];
    }

    public final boolean OooOO0(Object obj, Object obj2) {
        int i;
        Object obj3;
        C33839OooOo0 c33839OooOo0;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121795OooOoo0;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.OooOOO0.OooO0O0(obj4, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f121796OooOoOO;
            if ((i2 & 1) != 0) {
                this.f121796OooOoOO = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f121796OooOoOO = i3;
            Object obj5 = this.f121823OooOo0o;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            while (true) {
                C33787oo000o[] c33787oo000oArr = (C33787oo000o[]) obj5;
                if (c33787oo000oArr != null) {
                    for (C33787oo000o c33787oo000o : c33787oo000oArr) {
                        if (c33787oo000o != null) {
                            AtomicReference<Object> atomicReference = c33787oo000o.f121817OooO00o;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (c33839OooOo0 = C33784o00ooo.f121811OooO0O0)) {
                                    C33839OooOo0 c33839OooOo02 = C33784o00ooo.f121810OooO00o;
                                    if (obj6 != c33839OooOo02) {
                                        while (!atomicReference.compareAndSet(obj6, c33839OooOo02)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        ((C33614OooOOO0) obj6).resumeWith(C32460OooOooO.f116667OooO00o);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, c33839OooOo0)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f121796OooOoOO;
                    if (i == i3) {
                        this.f121796OooOoOO = i3 + 1;
                        return true;
                    }
                    obj3 = this.f121823OooOo0o;
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (((oO0o0Oo.C33782o00oO0O) r14).OooO00o(r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (r14.equals(r15) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00a8, B:47:0x00ae], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:47:0x00ae, B:45:0x00a8], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:47:0x00ae, B:55:0x00c9], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0092, B:39:0x009a, B:42:0x00a1, B:43:0x00a5, B:45:0x00a8, B:55:0x00c9, B:58:0x00d9, B:59:0x00f3, B:65:0x0105, B:68:0x010e, B:62:0x00fa, B:64:0x0100, B:47:0x00ae, B:51:0x00b5, B:21:0x004d, B:24:0x0058, B:36:0x0083), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0092, B:39:0x009a, B:42:0x00a1, B:43:0x00a5, B:45:0x00a8, B:55:0x00c9, B:58:0x00d9, B:59:0x00f3, B:65:0x0105, B:68:0x010e, B:62:0x00fa, B:64:0x0100, B:47:0x00ae, B:51:0x00b5, B:21:0x004d, B:24:0x0058, B:36:0x0083), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0092, B:39:0x009a, B:42:0x00a1, B:43:0x00a5, B:45:0x00a8, B:55:0x00c9, B:58:0x00d9, B:59:0x00f3, B:65:0x0105, B:68:0x010e, B:62:0x00fa, B:64:0x0100, B:47:0x00ae, B:51:0x00b5, B:21:0x004d, B:24:0x0058, B:36:0x0083), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d8 -> B:37:0x0092). Please report as a decompilation issue!!! */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<?> continuation) {
        OooO00o oooO00o;
        C33781o00o0O<T> c33781o00o0O;
        C33787oo000o c33787oo000oOooO0O0;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        InterfaceC33672o00ooo interfaceC33672o00ooo;
        Object obj;
        Object andSet;
        Object obj2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121804OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121804OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        }
        Object obj3 = oooO00o.f121803OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121804OooOooO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj3);
                c33787oo000oOooO0O0 = OooO0O0();
                try {
                    if (interfaceC33723OooO0oO instanceof C33782o00oO0O) {
                        oooO00o.f121798OooOo0o = this;
                        oooO00o.f121797OooOo = interfaceC33723OooO0oO;
                        oooO00o.f121800OooOoO0 = c33787oo000oOooO0O0;
                        oooO00o.f121804OooOooO = 1;
                    }
                    c33781o00o0O = this;
                } catch (Throwable th) {
                    th = th;
                    c33781o00o0O = this;
                    c33781o00o0O.OooO0oo(c33787oo000oOooO0O0);
                    throw th;
                }
            } else if (i2 == 1) {
                c33787oo000oOooO0O0 = oooO00o.f121800OooOoO0;
                interfaceC33723OooO0oO = oooO00o.f121797OooOo;
                c33781o00o0O = oooO00o.f121798OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
            } else if (i2 == 2) {
                obj = oooO00o.f121801OooOoOO;
                interfaceC33672o00ooo = oooO00o.f121799OooOoO;
                c33787oo000oOooO0O0 = oooO00o.f121800OooOoO0;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = oooO00o.f121797OooOo;
                c33781o00o0O = oooO00o.f121798OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO3;
                AtomicReference<Object> atomicReference = c33787oo000oOooO0O0.f121817OooO00o;
                C33839OooOo0 c33839OooOo0 = C33784o00ooo.f121810OooO00o;
                andSet = atomicReference.getAndSet(c33839OooOo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(andSet);
                if (andSet == C33784o00ooo.f121811OooO0O0) {
                }
                Object obj4 = f121795OooOoo0.get(c33781o00o0O);
                if (interfaceC33672o00ooo != null) {
                }
                if (obj != null) {
                }
                if (obj4 != C33811OooOo0O.f121897OooO00o) {
                }
                oooO00o.f121798OooOo0o = c33781o00o0O;
                oooO00o.f121797OooOo = interfaceC33723OooO0oO2;
                oooO00o.f121800OooOoO0 = c33787oo000oOooO0O0;
                oooO00o.f121799OooOoO = interfaceC33672o00ooo;
                oooO00o.f121801OooOoOO = obj4;
                oooO00o.f121804OooOooO = 2;
                if (interfaceC33723OooO0oO2.emit(obj2, oooO00o) != enumC32485OooO00o) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = oooO00o.f121801OooOoOO;
                interfaceC33672o00ooo = oooO00o.f121799OooOoO;
                c33787oo000oOooO0O0 = oooO00o.f121800OooOoO0;
                interfaceC33723OooO0oO2 = oooO00o.f121797OooOo;
                c33781o00o0O = oooO00o.f121798OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
                Object obj42 = f121795OooOoo0.get(c33781o00o0O);
                if (interfaceC33672o00ooo != null && !interfaceC33672o00ooo.isActive()) {
                    throw interfaceC33672o00ooo.getCancellationException();
                }
                if (obj != null) {
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO2;
                }
                obj2 = obj42 != C33811OooOo0O.f121897OooO00o ? null : obj42;
                oooO00o.f121798OooOo0o = c33781o00o0O;
                oooO00o.f121797OooOo = interfaceC33723OooO0oO2;
                oooO00o.f121800OooOoO0 = c33787oo000oOooO0O0;
                oooO00o.f121799OooOoO = interfaceC33672o00ooo;
                oooO00o.f121801OooOoOO = obj42;
                oooO00o.f121804OooOooO = 2;
                if (interfaceC33723OooO0oO2.emit(obj2, oooO00o) != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = obj42;
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO2;
                AtomicReference<Object> atomicReference2 = c33787oo000oOooO0O0.f121817OooO00o;
                C33839OooOo0 c33839OooOo02 = C33784o00ooo.f121810OooO00o;
                andSet = atomicReference2.getAndSet(c33839OooOo02);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(andSet);
                if (andSet == C33784o00ooo.f121811OooO0O0) {
                    oooO00o.f121798OooOo0o = c33781o00o0O;
                    oooO00o.f121797OooOo = interfaceC33723OooO0oO2;
                    oooO00o.f121800OooOoO0 = c33787oo000oOooO0O0;
                    oooO00o.f121799OooOoO = interfaceC33672o00ooo;
                    oooO00o.f121801OooOoOO = obj;
                    oooO00o.f121804OooOooO = 3;
                    C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(oooO00o));
                    c33614OooOOO0.OooOOoo();
                    AtomicReference<Object> atomicReference3 = c33787oo000oOooO0O0.f121817OooO00o;
                    while (true) {
                        if (atomicReference3.compareAndSet(c33839OooOo02, c33614OooOOO0)) {
                            break;
                        }
                        if (atomicReference3.get() != c33839OooOo02) {
                            c33614OooOOO0.resumeWith(C32460OooOooO.f116667OooO00o);
                            break;
                        }
                    }
                    Object objOooOOo = c33614OooOOO0.OooOOo();
                    if (objOooOOo != EnumC32485OooO00o.f116726OooOo0o) {
                        if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    if (objOooOOo != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                Object obj422 = f121795OooOoo0.get(c33781o00o0O);
                if (interfaceC33672o00ooo != null) {
                    throw interfaceC33672o00ooo.getCancellationException();
                }
                if (obj != null) {
                }
                if (obj422 != C33811OooOo0O.f121897OooO00o) {
                }
                oooO00o.f121798OooOo0o = c33781o00o0O;
                oooO00o.f121797OooOo = interfaceC33723OooO0oO2;
                oooO00o.f121800OooOoO0 = c33787oo000oOooO0O0;
                oooO00o.f121799OooOoO = interfaceC33672o00ooo;
                oooO00o.f121801OooOoOO = obj422;
                oooO00o.f121804OooOooO = 2;
                if (interfaceC33723OooO0oO2.emit(obj2, oooO00o) != enumC32485OooO00o) {
                }
            }
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
            interfaceC33672o00ooo = (InterfaceC33672o00ooo) oooO00o.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
            obj = null;
            Object obj4222 = f121795OooOoo0.get(c33781o00o0O);
            if (interfaceC33672o00ooo != null) {
            }
            if (obj != null) {
            }
            if (obj4222 != C33811OooOo0O.f121897OooO00o) {
            }
            oooO00o.f121798OooOo0o = c33781o00o0O;
            oooO00o.f121797OooOo = interfaceC33723OooO0oO2;
            oooO00o.f121800OooOoO0 = c33787oo000oOooO0O0;
            oooO00o.f121799OooOoO = interfaceC33672o00ooo;
            oooO00o.f121801OooOoOO = obj4222;
            oooO00o.f121804OooOooO = 2;
            if (interfaceC33723OooO0oO2.emit(obj2, oooO00o) != enumC32485OooO00o) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        setValue(t);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0Oo.InterfaceC33767OoooOoo, oO0o0Oo.InterfaceC33780o00Ooo
    public final T getValue() {
        C33839OooOo0 c33839OooOo0 = C33811OooOo0O.f121897OooO00o;
        T t = (T) f121795OooOoo0.get(this);
        if (t == c33839OooOo0) {
            return null;
        }
        return t;
    }

    @Override // oO0o0Oo.InterfaceC33767OoooOoo
    public final void setValue(T t) {
        if (t == null) {
            t = (T) C33811OooOo0O.f121897OooO00o;
        }
        OooOO0(null, t);
    }
}
