package io.ktor.utils.p616io;

import OooO0Oo.OooOo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OOo.C24217OooO0O0;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33627OooOoOO;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00oO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f80879OooO00o = OooO00o(Throwable.class, -1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ReentrantReadWriteLock f80880OooO0O0 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final WeakHashMap<Class<? extends Throwable>, InterfaceC32507OooOO0o<Throwable, Throwable>> f80881OooO0OO = new WeakHashMap<>();

    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32507OooOO0o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f80882OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Object obj) {
            Throwable it = (Throwable) obj;
            OooOOO0.OooO0oO(it, "it");
            return null;
        }
    }

    public static final class OooO0OO extends OooOOOO implements InterfaceC32507OooOO0o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f80883OooOo0o = new OooO0OO(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Object obj) {
            Throwable it = (Throwable) obj;
            OooOOO0.OooO0oO(it, "it");
            return null;
        }
    }

    public static final int OooO00o(Class<?> cls, int i) {
        Object objOooO00o;
        C24217OooO0O0.OooO0oO(cls);
        int i2 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                OooOOO0.OooO0o(declaredFields, "declaredFields");
                int i3 = 0;
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
        } while (cls != null);
        objOooO00o = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = objValueOf;
        }
        return ((Number) objOooO00o).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x010b A[EDGE_INSN: B:105:0x010b->B:64:0x010b BREAK  A[LOOP:3: B:41:0x00af->B:108:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[LOOP:3: B:41:0x00af->B:108:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E extends Throwable> E OooO0O0(E exception, Throwable cause) {
        Object objOooO00o;
        InterfaceC32507OooOO0o<Throwable, Throwable> c24006o00oO0o;
        int i = 1;
        OooOOO0.OooO0oO(exception, "exception");
        OooOOO0.OooO0oO(cause, "cause");
        if (exception instanceof InterfaceC33627OooOoOO) {
            try {
                objOooO00o = ((InterfaceC33627OooOoOO) exception).OooO00o();
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            return (E) (objOooO00o instanceof C32445OooOOOO.OooO00o ? null : objOooO00o);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f80880OooO0O0;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        WeakHashMap<Class<? extends Throwable>, InterfaceC32507OooOO0o<Throwable, Throwable>> weakHashMap = f80881OooO0OO;
        try {
            InterfaceC32507OooOO0o<Throwable, Throwable> interfaceC32507OooOO0o = weakHashMap.get(exception.getClass());
            if (interfaceC32507OooOO0o != null) {
                return (E) interfaceC32507OooOO0o.invoke(exception);
            }
            int i2 = 0;
            if (f80879OooO00o != OooO00o(exception.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    weakHashMap.put((Class<? extends Throwable>) exception.getClass(), OooO0O0.f80882OooOo0o);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    return null;
                } finally {
                    while (i2 < readHoldCount) {
                        lock2.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            OooOOO0.OooO0o(constructors, "exception.javaClass.constructors");
            InterfaceC32507OooOO0o<Throwable, Throwable> interfaceC32507OooOO0o2 = null;
            for (Constructor constructor : OooOOO.Oooo0oO(constructors, new OooO00o())) {
                OooOOO0.OooO0o(constructor, "constructor");
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length != 1) {
                        if (length == 2 && OooOOO0.OooO0O0(parameterTypes[0], String.class) && OooOOO0.OooO0O0(parameterTypes[1], Throwable.class)) {
                            c24006o00oO0o = new OooOo(constructor, i);
                        }
                        interfaceC32507OooOO0o2 = null;
                    } else {
                        Class<?> cls = parameterTypes[0];
                        if (OooOOO0.OooO0O0(cls, Throwable.class)) {
                            c24006o00oO0o = new C24007o00ooo(constructor);
                        } else {
                            if (OooOOO0.OooO0O0(cls, String.class)) {
                                c24006o00oO0o = new oo000o(constructor);
                            }
                            interfaceC32507OooOO0o2 = null;
                        }
                    }
                    if (interfaceC32507OooOO0o2 == null) {
                        break;
                    }
                } else {
                    c24006o00oO0o = new C24006o00oO0o(constructor);
                }
                interfaceC32507OooOO0o2 = c24006o00oO0o;
                if (interfaceC32507OooOO0o2 == null) {
                }
            }
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock.readLock();
            int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i4 = 0; i4 < readHoldCount2; i4++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                weakHashMap.put((Class<? extends Throwable>) exception.getClass(), interfaceC32507OooOO0o2 == null ? OooO0OO.f80883OooOo0o : interfaceC32507OooOO0o2);
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                while (i2 < readHoldCount2) {
                    lock3.lock();
                    i2++;
                }
                writeLock2.unlock();
                if (interfaceC32507OooOO0o2 != null) {
                    return (E) interfaceC32507OooOO0o2.invoke(cause);
                }
                return null;
            } catch (Throwable th2) {
                while (i2 < readHoldCount2) {
                    lock3.lock();
                    i2++;
                }
                writeLock2.unlock();
                throw th2;
            }
        } finally {
            lock.unlock();
        }
    }
}
