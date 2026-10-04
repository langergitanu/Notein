package oO0Ooo0;

import OoooOOo.C21197OooOO0O;
import androidx.datastore.preferences.protobuf.o000oOoO;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo.AbstractC33300OooO0oo;
import oO0OooO0.C33477OooO0OO;
import oO0o0O0.C33559OooO0o0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO0Ooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33361OooO0Oo implements InterfaceC33373OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f120641OooO0Oo = C33599OooOo0O.OooooOO(C33361OooO0Oo.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f120642OooO0o0 = new OooO00o("NO_LOCKS", C33360OooO0OO.f120640OooO00o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33372OooOO0o f120643OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC20315OooO0Oo.OooO00o f120644OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f120645OooO0OO;

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO */
    public static abstract class OooO<T> extends AbstractC33363OooO0oO<T> implements InterfaceC33370OooOO0<T> {
        public static /* synthetic */ void OooO00o(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oO0Ooo0.C33361OooO0Oo.AbstractC33363OooO0oO, oO0Ooo0.C33361OooO0Oo.OooO0o, oO0O000o.OooO00o
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            OooO00o(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO00o */
    public static class OooO00o extends C33361OooO0Oo {
        @Override // oO0Ooo0.C33361OooO0Oo
        public final OooOOO0 OooO0o(Object obj, String str) {
            return new OooOOO0(null, true);
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0O0 */
    public static class OooO0O0<K, V> extends OooO0OO<K, V> implements InterfaceC33358OooO00o<K, V> {
        public static /* synthetic */ void OooO00o(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0OO */
    public static class OooO0OO<K, V> extends OooOO0<C33362OooO0o0<K, V>, V> {
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public interface InterfaceC20315OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f120646OooO00o = new OooO00o();

        /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0Oo$OooO00o */
        public static class OooO00o implements InterfaceC20315OooO0Oo {
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0o */
    public static class OooO0o<T> implements InterfaceC33371OooOO0O<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final oO0O000o.OooO00o<? extends T> f120647OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33361OooO0Oo f120648OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile Object f120649OooOoO0;

        public OooO0o(C33361OooO0Oo c33361OooO0Oo, oO0O000o.OooO00o<? extends T> oooO00o) {
            if (c33361OooO0Oo == null) {
                OooO00o(0);
                throw null;
            }
            if (oooO00o == null) {
                OooO00o(1);
                throw null;
            }
            this.f120649OooOoO0 = EnumC33365OooOO0o.f120657OooOo0o;
            this.f120648OooOo0o = c33361OooO0Oo;
            this.f120647OooOo = oooO00o;
        }

        public static /* synthetic */ void OooO00o(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public void OooO0O0(T t) {
        }

        public OooOOO0<T> OooO0OO(boolean z) {
            OooOOO0<T> oooOOO0OooO0o = this.f120648OooOo0o.OooO0o(null, "in a lazy value");
            if (oooOOO0OooO0o != null) {
                return oooOOO0OooO0o;
            }
            OooO00o(2);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        @Override // oO0O000o.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public T invoke() throws Throwable {
            T t = (T) this.f120649OooOoO0;
            if (!(t instanceof EnumC33365OooOO0o)) {
                C33559OooO0o0.OooO00o(t);
                return t;
            }
            this.f120648OooOo0o.f120643OooO00o.lock();
            try {
                T tInvoke = (T) this.f120649OooOoO0;
                if (tInvoke instanceof EnumC33365OooOO0o) {
                    EnumC33365OooOO0o enumC33365OooOO0o = EnumC33365OooOO0o.f120656OooOo;
                    EnumC33365OooOO0o enumC33365OooOO0o2 = EnumC33365OooOO0o.f120659OooOoO0;
                    if (tInvoke == enumC33365OooOO0o) {
                        this.f120649OooOoO0 = enumC33365OooOO0o2;
                        OooOOO0<T> oooOOO0OooO0OO = OooO0OO(true);
                        if (!oooOOO0OooO0OO.f120661OooO0O0) {
                            tInvoke = oooOOO0OooO0OO.f120660OooO00o;
                        } else if (tInvoke == enumC33365OooOO0o2) {
                            OooOOO0<T> oooOOO0OooO0OO2 = OooO0OO(false);
                            if (oooOOO0OooO0OO2.f120661OooO0O0) {
                                this.f120649OooOoO0 = enumC33365OooOO0o;
                                try {
                                    tInvoke = this.f120647OooOo.invoke();
                                    OooO0O0(tInvoke);
                                    this.f120649OooOoO0 = tInvoke;
                                } catch (Throwable th) {
                                    if (C21197OooOO0O.OooO0Oo(th)) {
                                        this.f120649OooOoO0 = EnumC33365OooOO0o.f120657OooOo0o;
                                        throw th;
                                    }
                                    if (this.f120649OooOoO0 == enumC33365OooOO0o) {
                                        this.f120649OooOoO0 = new C33559OooO0o0.OooO0O0(th);
                                    }
                                    this.f120648OooOo0o.f120644OooO0O0.getClass();
                                    throw th;
                                }
                            } else {
                                tInvoke = oooOOO0OooO0OO2.f120660OooO00o;
                            }
                        }
                    }
                } else {
                    C33559OooO0o0.OooO00o(tInvoke);
                }
                return tInvoke;
            } finally {
                this.f120648OooOo0o.f120643OooO00o.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    public static class C33362OooO0o0<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C33477OooO0OO f120650OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOOO f120651OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public C33362OooO0o0(C33477OooO0OO c33477OooO0OO, oO0O000o.OooO00o oooO00o) {
            this.f120650OooO00o = c33477OooO0OO;
            this.f120651OooO0O0 = (OooOOOO) oooO00o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C33362OooO0o0.class == obj.getClass() && this.f120650OooO00o.equals(((C33362OooO0o0) obj).f120650OooO00o);
        }

        public final int hashCode() {
            return this.f120650OooO00o.hashCode();
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC33363OooO0oO<T> extends OooO0o<T> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public volatile C33374OooOOO0<T> f120652OooOoO;

        @Override // oO0Ooo0.C33361OooO0Oo.OooO0o
        public final void OooO0O0(T t) {
            this.f120652OooOoO = new C33374OooOOO0<>(t);
            try {
                C33366OooO0o c33366OooO0o = (C33366OooO0o) this;
                if (t != null) {
                    c33366OooO0o.f120663OooOoo0.invoke(t);
                } else {
                    C33366OooO0o.OooO00o(2);
                    throw null;
                }
            } finally {
                this.f120652OooOoO = null;
            }
        }

        @Override // oO0Ooo0.C33361OooO0Oo.OooO0o, oO0O000o.OooO00o
        public T invoke() {
            C33374OooOOO0<T> c33374OooOOO0 = this.f120652OooOoO;
            if (c33374OooOOO0 == null || c33374OooOOO0.f120665OooO0O0 != Thread.currentThread()) {
                return (T) super.invoke();
            }
            if (c33374OooOOO0.f120665OooO0O0 == Thread.currentThread()) {
                return c33374OooOOO0.f120664OooO00o;
            }
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooO0oo, reason: case insensitive filesystem */
    public static class C33364OooO0oo<T> extends OooO0o<T> implements InterfaceC33370OooOO0<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33364OooO0oo(C33361OooO0Oo c33361OooO0Oo, oO0O000o.OooO00o<? extends T> oooO00o) {
            super(c33361OooO0Oo, oooO00o);
            if (c33361OooO0Oo == null) {
                OooO00o(0);
                throw null;
            }
            if (oooO00o != null) {
            } else {
                OooO00o(1);
                throw null;
            }
        }

        public static /* synthetic */ void OooO00o(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // oO0Ooo0.C33361OooO0Oo.OooO0o, oO0O000o.OooO00o
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            OooO00o(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooOO0 */
    public static class OooOO0<K, V> implements InterfaceC33357OooO<K, V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ConcurrentHashMap f120653OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33361OooO0Oo f120654OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final InterfaceC32507OooOO0o<? super K, ? extends V> f120655OooOoO0;

        public OooOO0(C33361OooO0Oo c33361OooO0Oo, ConcurrentHashMap concurrentHashMap, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            if (c33361OooO0Oo == null) {
                OooO00o(0);
                throw null;
            }
            this.f120654OooOo0o = c33361OooO0Oo;
            this.f120653OooOo = concurrentHashMap;
            this.f120655OooOoO0 = interfaceC32507OooOO0o;
        }

        public static /* synthetic */ void OooO00o(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError OooO0O0(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f120654OooOo0o);
            C33361OooO0Oo.OooO0oO(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public V invoke(K k) throws Throwable {
            ConcurrentHashMap concurrentHashMap = this.f120653OooOo;
            V v = (V) concurrentHashMap.get(k);
            EnumC33365OooOO0o enumC33365OooOO0o = EnumC33365OooOO0o.f120656OooOo;
            Object obj = C33559OooO0o0.f121182OooO00o;
            RuntimeException runtimeException = (V) null;
            if (v != null && v != enumC33365OooOO0o) {
                C33559OooO0o0.OooO00o(v);
                if (v == obj) {
                    return null;
                }
                return v;
            }
            C33361OooO0Oo c33361OooO0Oo = this.f120654OooOo0o;
            InterfaceC33372OooOO0o interfaceC33372OooOO0o = c33361OooO0Oo.f120643OooO00o;
            InterfaceC33372OooOO0o interfaceC33372OooOO0o2 = c33361OooO0Oo.f120643OooO00o;
            interfaceC33372OooOO0o.lock();
            try {
                Object obj2 = concurrentHashMap.get(k);
                EnumC33365OooOO0o enumC33365OooOO0o2 = EnumC33365OooOO0o.f120659OooOoO0;
                if (obj2 == enumC33365OooOO0o) {
                    OooOOO0 oooOOO0OooO0o = c33361OooO0Oo.OooO0o(k, "");
                    if (oooOOO0OooO0o == null) {
                        OooO00o(3);
                        throw null;
                    }
                    if (!oooOOO0OooO0o.f120661OooO0O0) {
                        V v2 = (V) oooOOO0OooO0o.f120660OooO00o;
                        interfaceC33372OooOO0o2.unlock();
                        return v2;
                    }
                    obj2 = enumC33365OooOO0o2;
                }
                if (obj2 == enumC33365OooOO0o2) {
                    OooOOO0 oooOOO0OooO0o2 = c33361OooO0Oo.OooO0o(k, "");
                    if (oooOOO0OooO0o2 == null) {
                        OooO00o(3);
                        throw null;
                    }
                    if (!oooOOO0OooO0o2.f120661OooO0O0) {
                        V v3 = (V) oooOOO0OooO0o2.f120660OooO00o;
                        interfaceC33372OooOO0o2.unlock();
                        return v3;
                    }
                }
                if (obj2 != null) {
                    C33559OooO0o0.OooO00o(obj2);
                    Object obj3 = runtimeException;
                    if (obj2 != obj) {
                        obj3 = (V) obj2;
                    }
                    interfaceC33372OooOO0o2.unlock();
                    return (V) obj3;
                }
                try {
                    concurrentHashMap.put(k, enumC33365OooOO0o);
                    V vInvoke = this.f120655OooOoO0.invoke(k);
                    if (vInvoke != null) {
                        obj = vInvoke;
                    }
                    Object objPut = concurrentHashMap.put(k, obj);
                    if (objPut == enumC33365OooOO0o) {
                        interfaceC33372OooOO0o2.unlock();
                        return vInvoke;
                    }
                    runtimeException = (V) OooO0O0(k, objPut);
                    throw runtimeException;
                } catch (Throwable th) {
                    if (C21197OooOO0O.OooO0Oo(th)) {
                        concurrentHashMap.remove(k);
                        throw th;
                    }
                    InterfaceC20315OooO0Oo.OooO00o oooO00o = c33361OooO0Oo.f120644OooO0O0;
                    if (th == runtimeException) {
                        oooO00o.getClass();
                        throw th;
                    }
                    Object objPut2 = concurrentHashMap.put(k, new C33559OooO0o0.OooO0O0(th));
                    if (objPut2 != enumC33365OooOO0o) {
                        throw OooO0O0(k, objPut2);
                    }
                    oooO00o.getClass();
                    throw th;
                }
            } catch (Throwable th2) {
                interfaceC33372OooOO0o2.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooOO0O */
    public static class OooOO0O<K, V> extends OooOO0<K, V> implements InterfaceC33369OooO0oo<K, V> {
        @Override // oO0Ooo0.C33361OooO0Oo.OooOO0, oO0O000o.InterfaceC32507OooOO0o
        public final V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v != null) {
                return v;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooOO0o, reason: case insensitive filesystem */
    public static final class EnumC33365OooOO0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC33365OooOO0o f120656OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC33365OooOO0o f120657OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ EnumC33365OooOO0o[] f120658OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC33365OooOO0o f120659OooOoO0;

        static {
            EnumC33365OooOO0o enumC33365OooOO0o = new EnumC33365OooOO0o("NOT_COMPUTED", 0);
            f120657OooOo0o = enumC33365OooOO0o;
            EnumC33365OooOO0o enumC33365OooOO0o2 = new EnumC33365OooOO0o("COMPUTING", 1);
            f120656OooOo = enumC33365OooOO0o2;
            EnumC33365OooOO0o enumC33365OooOO0o3 = new EnumC33365OooOO0o("RECURSION_WAS_DETECTED", 2);
            f120659OooOoO0 = enumC33365OooOO0o3;
            f120658OooOoO = new EnumC33365OooOO0o[]{enumC33365OooOO0o, enumC33365OooOO0o2, enumC33365OooOO0o3};
        }

        public EnumC33365OooOO0o() {
            throw null;
        }

        public static EnumC33365OooOO0o valueOf(String str) {
            return (EnumC33365OooOO0o) Enum.valueOf(EnumC33365OooOO0o.class, str);
        }

        public static EnumC33365OooOO0o[] values() {
            return (EnumC33365OooOO0o[]) f120658OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0.OooO0Oo$OooOOO0 */
    public static class OooOOO0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f120660OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f120661OooO0O0;

        public OooOOO0(T t, boolean z) {
            this.f120660OooO00o = t;
            this.f120661OooO0O0 = z;
        }

        public final String toString() {
            return this.f120661OooO0O0 ? "FALL_THROUGH" : String.valueOf(this.f120660OooO00o);
        }
    }

    public C33361OooO0Oo() {
        throw null;
    }

    public C33361OooO0Oo(String str) {
        this(str, new C33359OooO0O0(0));
    }

    public static void OooO0oO(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f120641OooO0Oo)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    @Override // oO0Ooo0.InterfaceC33373OooOOO
    public final C33364OooO0oo OooO00o(oO0O000o.OooO00o oooO00o) {
        if (oooO00o != null) {
            return new C33364OooO0oo(this, oooO00o);
        }
        Object[] objArr = new Object[3];
        switch (23) {
            case 8:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 9:
            case 11:
            case 14:
            case 16:
            case 19:
            case 21:
                objArr[0] = "compute";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            case 12:
            case 17:
            case 25:
            case 27:
                objArr[0] = "onRecursiveCall";
                break;
            case 15:
            case 18:
            case 22:
                objArr[0] = "map";
                break;
            case 23:
            case 24:
            case 26:
            case 28:
            case 30:
            case 31:
            case 32:
            case 34:
                objArr[0] = "computable";
                break;
            case 29:
            case 33:
                objArr[0] = "postCompute";
                break;
            case 35:
                objArr[0] = "source";
                break;
            case 36:
                objArr[0] = "throwable";
                break;
            default:
                objArr[0] = "debugText";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        switch (23) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // oO0Ooo0.InterfaceC33373OooOOO
    public final C33366OooO0o OooO0O0(AbstractC33300OooO0oo.OooO0O0 oooO0O0, AbstractC33300OooO0oo.OooO0OO oooO0OO, AbstractC33300OooO0oo.C33301OooO0Oo c33301OooO0Oo) {
        return new C33366OooO0o(this, oooO0O0, oooO0OO, c33301OooO0Oo);
    }

    public final OooO0O0 OooO0OO() {
        return new OooO0O0(this, new ConcurrentHashMap(3, 1.0f, 2), new C33368OooO0oO());
    }

    public final OooOO0O OooO0Oo(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        return new OooOO0O(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC32507OooOO0o);
    }

    public OooOOO0 OooO0o(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : o000oOoO.OooO00o(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        OooO0oO(assertionError);
        throw assertionError;
    }

    public final OooOO0 OooO0o0(InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        return new OooOO0(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC32507OooOO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f120645OooO0OO, ")");
    }

    public C33361OooO0Oo(String str, InterfaceC33372OooOO0o interfaceC33372OooOO0o) {
        InterfaceC20315OooO0Oo.OooO00o oooO00o = InterfaceC20315OooO0Oo.f120646OooO00o;
        this.f120643OooO00o = interfaceC33372OooOO0o;
        this.f120644OooO0O0 = oooO00o;
        this.f120645OooO0OO = str;
    }
}
