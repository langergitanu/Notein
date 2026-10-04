package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21843o00ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Unsafe f64582OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class<?> f64583OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AbstractC21845OooO0o0 f64584OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f64585OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final long f64586OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f64587OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f64588OooO0oO;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00ooo$OooO00o */
    public class OooO00o implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe OooO00o() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return OooO00o();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00ooo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC21845OooO0o0 {
        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooO0OO(Object obj, long j) {
            return C21843o00ooo.f64588OooO0oO ? C21843o00ooo.OooO0O0(obj, j) : C21843o00ooo.OooO0OO(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final double OooO0Oo(Object obj, long j) {
            return Double.longBitsToDouble(OooO0oO(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final float OooO0o0(Object obj, long j) {
            return Float.intBitsToFloat(OooO0o(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0(Object obj, long j, boolean z) {
            if (C21843o00ooo.f64588OooO0oO) {
                C21843o00ooo.OooOO0O(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                C21843o00ooo.OooOO0o(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0O(Object obj, long j, byte b) {
            if (C21843o00ooo.f64588OooO0oO) {
                C21843o00ooo.OooOO0O(obj, j, b);
            } else {
                C21843o00ooo.OooOO0o(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0o(Object obj, long j, double d) {
            OooOOOO(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOOO0(Object obj, long j, float f) {
            OooOOO(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooOOo() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00ooo$OooO0OO */
    public static final class OooO0OO extends AbstractC21845OooO0o0 {
        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooO0OO(Object obj, long j) {
            return C21843o00ooo.f64588OooO0oO ? C21843o00ooo.OooO0O0(obj, j) : C21843o00ooo.OooO0OO(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final double OooO0Oo(Object obj, long j) {
            return Double.longBitsToDouble(OooO0oO(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final float OooO0o0(Object obj, long j) {
            return Float.intBitsToFloat(OooO0o(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0(Object obj, long j, boolean z) {
            if (C21843o00ooo.f64588OooO0oO) {
                C21843o00ooo.OooOO0O(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                C21843o00ooo.OooOO0o(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0O(Object obj, long j, byte b) {
            if (C21843o00ooo.f64588OooO0oO) {
                C21843o00ooo.OooOO0O(obj, j, b);
            } else {
                C21843o00ooo.OooOO0o(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0o(Object obj, long j, double d) {
            OooOOOO(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOOO0(Object obj, long j, float f) {
            OooOOO(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooOOo() {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00ooo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21844OooO0Oo extends AbstractC21845OooO0o0 {
        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooO0OO(Object obj, long j) {
            return this.f64589OooO00o.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final double OooO0Oo(Object obj, long j) {
            return this.f64589OooO00o.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final float OooO0o0(Object obj, long j) {
            return this.f64589OooO00o.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0(Object obj, long j, boolean z) {
            this.f64589OooO00o.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0O(Object obj, long j, byte b) {
            this.f64589OooO00o.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOO0o(Object obj, long j, double d) {
            this.f64589OooO00o.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final void OooOOO0(Object obj, long j, float f) {
            this.f64589OooO00o.putFloat(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooOOo() {
            Unsafe unsafe = this.f64589OooO00o;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (C21843o00ooo.OooO0oO() != null) {
                        try {
                            Class<?> cls3 = this.f64589OooO00o.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            C21843o00ooo.OooO00o(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    C21843o00ooo.OooO00o(th2);
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.C21843o00ooo.AbstractC21845OooO0o0
        public final boolean OooOOo0() {
            if (!super.OooOOo0()) {
                return false;
            }
            try {
                Class<?> cls = this.f64589OooO00o.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                C21843o00ooo.OooO00o(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00ooo$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC21845OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Unsafe f64589OooO00o;

        public AbstractC21845OooO0o0(Unsafe unsafe) {
            this.f64589OooO00o = unsafe;
        }

        public final long OooO(Field field) {
            return this.f64589OooO00o.objectFieldOffset(field);
        }

        public final int OooO00o(Class<?> cls) {
            return this.f64589OooO00o.arrayBaseOffset(cls);
        }

        public final int OooO0O0(Class<?> cls) {
            return this.f64589OooO00o.arrayIndexScale(cls);
        }

        public abstract boolean OooO0OO(Object obj, long j);

        public abstract double OooO0Oo(Object obj, long j);

        public final int OooO0o(Object obj, long j) {
            return this.f64589OooO00o.getInt(obj, j);
        }

        public abstract float OooO0o0(Object obj, long j);

        public final long OooO0oO(Object obj, long j) {
            return this.f64589OooO00o.getLong(obj, j);
        }

        public final Object OooO0oo(Object obj, long j) {
            return this.f64589OooO00o.getObject(obj, j);
        }

        public abstract void OooOO0(Object obj, long j, boolean z);

        public abstract void OooOO0O(Object obj, long j, byte b);

        public abstract void OooOO0o(Object obj, long j, double d);

        public final void OooOOO(Object obj, long j, int i) {
            this.f64589OooO00o.putInt(obj, j, i);
        }

        public abstract void OooOOO0(Object obj, long j, float f);

        public final void OooOOOO(Object obj, long j, long j2) {
            this.f64589OooO00o.putLong(obj, j, j2);
        }

        public final void OooOOOo(Object obj, long j, Object obj2) {
            this.f64589OooO00o.putObject(obj, j, obj2);
        }

        public abstract boolean OooOOo();

        public boolean OooOOo0() {
            Unsafe unsafe = this.f64589OooO00o;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                C21843o00ooo.OooO00o(th);
                return false;
            }
        }
    }

    static {
        Unsafe unsafeOooO = OooO();
        f64582OooO00o = unsafeOooO;
        f64583OooO0O0 = C21790OooO0Oo.f64410OooO00o;
        boolean zOooO0oo = OooO0oo(Long.TYPE);
        boolean zOooO0oo2 = OooO0oo(Integer.TYPE);
        AbstractC21845OooO0o0 c21844OooO0Oo = null;
        if (unsafeOooO != null) {
            if (!C21790OooO0Oo.OooO00o()) {
                c21844OooO0Oo = new C21844OooO0Oo(unsafeOooO);
            } else if (zOooO0oo) {
                c21844OooO0Oo = new OooO0OO(unsafeOooO);
            } else if (zOooO0oo2) {
                c21844OooO0Oo = new OooO0O0(unsafeOooO);
            }
        }
        f64584OooO0OO = c21844OooO0Oo;
        f64585OooO0Oo = c21844OooO0Oo == null ? false : c21844OooO0Oo.OooOOo();
        f64587OooO0o0 = c21844OooO0Oo == null ? false : c21844OooO0Oo.OooOOo0();
        f64586OooO0o = OooO0o0(byte[].class);
        OooO0o0(boolean[].class);
        OooO0o(boolean[].class);
        OooO0o0(int[].class);
        OooO0o(int[].class);
        OooO0o0(long[].class);
        OooO0o(long[].class);
        OooO0o0(float[].class);
        OooO0o(float[].class);
        OooO0o0(double[].class);
        OooO0o(double[].class);
        OooO0o0(Object[].class);
        OooO0o(Object[].class);
        Field fieldOooO0oO = OooO0oO();
        if (fieldOooO0oO != null && c21844OooO0Oo != null) {
            c21844OooO0Oo.OooO(fieldOooO0oO);
        }
        f64588OooO0oO = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Unsafe OooO() {
        try {
            return (Unsafe) AccessController.doPrivileged(new OooO00o());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void OooO00o(Throwable th) {
        Logger.getLogger(C21843o00ooo.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean OooO0O0(Object obj, long j) {
        return ((byte) ((f64584OooO0OO.OooO0o(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean OooO0OO(Object obj, long j) {
        return ((byte) ((f64584OooO0OO.OooO0o(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static <T> T OooO0Oo(Class<T> cls) {
        try {
            return (T) f64582OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void OooO0o(Class cls) {
        if (f64587OooO0o0) {
            f64584OooO0OO.OooO0O0(cls);
        }
    }

    public static int OooO0o0(Class<?> cls) {
        if (f64587OooO0o0) {
            return f64584OooO0OO.OooO00o(cls);
        }
        return -1;
    }

    public static Field OooO0oO() {
        Field declaredField;
        Field declaredField2;
        if (C21790OooO0Oo.OooO00o()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean OooO0oo(Class<?> cls) {
        if (!C21790OooO0Oo.OooO00o()) {
            return false;
        }
        try {
            Class<?> cls2 = f64583OooO0O0;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void OooOO0(byte[] bArr, long j, byte b) {
        f64584OooO0OO.OooOO0O(bArr, f64586OooO0o + j, b);
    }

    public static void OooOO0O(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iOooO0o = f64584OooO0OO.OooO0o(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        OooOOO0(obj, j2, ((255 & b) << i) | (iOooO0o & (~(255 << i))));
    }

    public static void OooOO0o(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        OooOOO0(obj, j2, ((255 & b) << i) | (f64584OooO0OO.OooO0o(obj, j2) & (~(255 << i))));
    }

    public static void OooOOO(Object obj, long j, long j2) {
        f64584OooO0OO.OooOOOO(obj, j, j2);
    }

    public static void OooOOO0(Object obj, long j, int i) {
        f64584OooO0OO.OooOOO(obj, j, i);
    }

    public static void OooOOOO(Object obj, long j, Object obj2) {
        f64584OooO0OO.OooOOOo(obj, j, obj2);
    }
}
