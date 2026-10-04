package com.aspose.slides.internal.p314oc;

import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p234ko.C5891k4;
import com.aspose.slides.internal.p358qe.C9854x6;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14079na;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14060gf;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.oc.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C7019kk {

    /* JADX INFO: renamed from: k4 */
    private static final HashSet<Class<?>> f19082k4 = new HashSet<>();

    /* JADX INFO: renamed from: x1 */
    private static final HashMap<Class<?>, Constructor<?>> f19084x1 = new HashMap<>();

    /* JADX INFO: renamed from: kk */
    private static final HashMap<Class, InterfaceC7014c5> f19083kk = new HashMap<>();

    /* JADX INFO: renamed from: c5 */
    public static double m27433c5(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).doubleValue();
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).doubleValue();
            case 8:
                return ((Integer) obj).intValue() & 65535;
            case 9:
                return ((Integer) obj).doubleValue();
            case 10:
                return ((Long) obj).longValue() & 4294967295L;
            case 11:
                return ((Long) obj).doubleValue();
            case 12:
                return new C14060gf((Long) obj).doubleValue();
            case 13:
                return ((Float) obj).doubleValue();
            case 14:
                return ((Double) obj).doubleValue();
            case 15:
                return C14046bv.m66492up(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: ck */
    public static char m27434ck(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return (char) ((Byte) obj).intValue();
            case 6:
                return (char) (((Byte) obj).byteValue() & 255);
            case 7:
                return (char) (((Short) obj).shortValue() & 65535);
            case 8:
                return (char) ((Integer) obj).intValue();
            case 9:
                return (char) ((Integer) obj).intValue();
            case 10:
                return (char) ((Long) obj).intValue();
            case 11:
                return (char) ((Long) obj).intValue();
            case 12:
                return (char) ((Long) obj).intValue();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (C14064he.m66715kk(fFloatValue) || C14064he.m66717x1(fFloatValue) || fFloatValue > 4.2949673E9f) {
                    return (char) 0;
                }
                return (char) (r7.longValue() & C18177fb.f54859s);
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (C14044b3.m66437kk(dDoubleValue) || C14044b3.m66439x1(dDoubleValue) || dDoubleValue >= 9.223372036854776E18d) {
                    return (char) 0;
                }
                return (char) (r7.longValue() & C18177fb.f54859s);
            case 15:
                return C14046bv.m66449du(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: du */
    public static long m27435du(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).longValue() & 4294967295L;
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).longValue() & 4294967295L;
            case 8:
                return ((Integer) obj).longValue() & 4294967295L;
            case 9:
                return ((Integer) obj).longValue() & 4294967295L;
            case 10:
                return ((Long) obj).longValue() & 4294967295L;
            case 11:
                return ((Long) obj).longValue() & 4294967295L;
            case 12:
                return ((Long) obj).longValue() & 4294967295L;
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (!C14064he.m66717x1(fFloatValue) && !C14064he.m66715kk(fFloatValue)) {
                    double dFloor = fFloatValue > 0.0f ? Math.floor(fFloatValue) : Math.ceil(fFloatValue);
                    Double dValueOf = Double.valueOf(dFloor);
                    if (dFloor >= -4.294967295E9d && dFloor <= 4.294967295E9d) {
                        return dValueOf.longValue() & 4294967295L;
                    }
                }
                return 0L;
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (C14044b3.m66437kk(dDoubleValue) || C14044b3.m66439x1(dDoubleValue) || dDoubleValue >= 9.223372036854776E18d) {
                    return 0L;
                }
                return ((long) dDoubleValue) & 4294967295L;
            case 15:
                return C14046bv.m66504x6(((C14046bv) obj).Clone()) & 4294967295L;
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: dy */
    public static float m27437dy(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).floatValue();
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).floatValue();
            case 8:
                return ((Integer) obj).intValue() & 65535;
            case 9:
                return ((Integer) obj).floatValue();
            case 10:
                return ((Long) obj).longValue() & 4294967295L;
            case 11:
                return ((Long) obj).floatValue();
            case 12:
                return new C14060gf((Long) obj).floatValue();
            case 13:
                return ((Float) obj).floatValue();
            case 14:
                return ((Double) obj).floatValue();
            case 15:
                return C14046bv.m66491u4(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static long m27438h4(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).longValue();
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).longValue();
            case 8:
                return ((Integer) obj).intValue() & 65535;
            case 9:
                return ((Integer) obj).longValue();
            case 10:
                return ((Long) obj).longValue() & 4294967295L;
            case 11:
                return ((Long) obj).longValue();
            case 12:
                return ((Long) obj).longValue();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (!C14064he.m66717x1(fFloatValue) && !C14064he.m66715kk(fFloatValue)) {
                    double dFloor = fFloatValue > 0.0f ? Math.floor(fFloatValue) : Math.ceil(fFloatValue);
                    Double dValueOf = Double.valueOf(dFloor);
                    if (dFloor >= -9.223372036854776E18d && dFloor < 9.223372036854776E18d) {
                        return dValueOf.longValue();
                    }
                }
                return Long.MIN_VALUE;
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (!C14044b3.m66439x1(dDoubleValue) && !C14044b3.m66437kk(dDoubleValue)) {
                    double dFloor2 = dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue);
                    Double dValueOf2 = Double.valueOf(dFloor2);
                    if (dFloor2 > -9.223372036854776E18d && dFloor2 < 9.223372036854776E18d) {
                        return dValueOf2.longValue();
                    }
                }
                return Long.MIN_VALUE;
            case 15:
                return C14046bv.m66485ne(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: jd */
    public static C14046bv m27440jd(Object obj, int i) {
        switch (i) {
            case 4:
                return C14046bv.m66462k4(((Character) obj).charValue());
            case 5:
                return C14046bv.m66496x1(((Byte) obj).byteValue());
            case 6:
                return C14046bv.m66461k4(((Byte) obj).byteValue());
            case 7:
                return C14046bv.m66472k4(((Short) obj).shortValue());
            case 8:
                return C14046bv.m66499x1(((Integer) obj).intValue());
            case 9:
                return C14046bv.m66477kk(((Integer) obj).intValue());
            case 10:
                return C14046bv.m66488to(((Long) obj).longValue());
            case 11:
                return C14046bv.m66450du(((Long) obj).longValue());
            case 12:
                return C14046bv.m66457h4(((Long) obj).longValue());
            case 13:
                return C14046bv.m66498x1(((Float) obj).floatValue());
            case 14:
                return C14046bv.m66497x1(((Double) obj).doubleValue());
            case 15:
                return ((C14046bv) obj).Clone();
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m27441k4(int i) {
        switch (i) {
            case 3:
                return (byte) 1;
            case 4:
                return (byte) 2;
            case 5:
            case 6:
                return (byte) 1;
            case 7:
                return (byte) 2;
            case 8:
                throw new NotImplementedException();
            case 9:
                return (byte) 4;
            case 10:
                throw new NotImplementedException();
            case 11:
            case 12:
                return (byte) 8;
            case 13:
                return (byte) 4;
            case 14:
                return (byte) 8;
            case 15:
                throw new NotImplementedException();
            default:
                throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: kk */
    public static int m27457kk(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).intValue() & 65535;
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).shortValue() & 65535;
            case 8:
                return ((Integer) obj).intValue() & 65535;
            case 9:
                return ((Integer) obj).intValue() & 65535;
            case 10:
                return ((Long) obj).intValue() & 65535;
            case 11:
                return ((Long) obj).intValue() & 65535;
            case 12:
                return ((Long) obj).intValue() & 65535;
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (C14064he.m66717x1(fFloatValue) || C14064he.m66715kk(fFloatValue) || fFloatValue > 2.1474836E9f) {
                    return 0;
                }
                return (int) (((long) fFloatValue) & C18177fb.f54859s);
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (C14044b3.m66437kk(dDoubleValue) || C14044b3.m66439x1(dDoubleValue) || dDoubleValue >= 9.223372036854776E18d) {
                    return 0;
                }
                return (int) (((long) dDoubleValue) & C18177fb.f54859s);
            case 15:
                return C14046bv.m66481ks(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public static long m27461m9(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).longValue();
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).longValue();
            case 8:
                return ((Integer) obj).longValue();
            case 9:
                return ((Integer) obj).longValue();
            case 10:
                return ((Long) obj).longValue();
            case 11:
                return ((Long) obj).longValue();
            case 12:
                return ((Long) obj).longValue();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (C14064he.m66703du(fFloatValue)) {
                    return 0L;
                }
                if (C14064he.m66715kk(fFloatValue) || C14064he.m66716to(fFloatValue)) {
                    return Long.MIN_VALUE;
                }
                double dFloor = fFloatValue > 0.0f ? Math.floor(fFloatValue) : Math.ceil(fFloatValue);
                Double dValueOf = Double.valueOf(dFloor);
                if (dFloor <= -9.223372036854776E18d || dFloor == 9.223372036854776E18d) {
                    return Long.MIN_VALUE;
                }
                if (dFloor > 9.223372036854776E18d) {
                    return 0L;
                }
                return dValueOf.longValue();
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (C14044b3.m66424du(dDoubleValue)) {
                    return 0L;
                }
                if (C14044b3.m66437kk(dDoubleValue) || C14044b3.m66438to(dDoubleValue)) {
                    return Long.MIN_VALUE;
                }
                double dFloor2 = dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue);
                Double dValueOf2 = Double.valueOf(dFloor2);
                if (dFloor2 <= -9.223372036854776E18d || dFloor2 == 9.223372036854776E18d) {
                    return Long.MIN_VALUE;
                }
                if (dFloor2 > 9.223372036854776E18d) {
                    return 0L;
                }
                return dValueOf2.longValue();
            case 15:
                return C14046bv.m66459ix(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: to */
    public static int m27462to(Object obj, int i) {
        switch (i) {
            case 4:
                return ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).intValue();
            case 6:
                return ((Byte) obj).byteValue() & 255;
            case 7:
                return ((Short) obj).intValue();
            case 8:
                return ((Integer) obj).intValue() & 65535;
            case 9:
                return ((Integer) obj).intValue();
            case 10:
                return (int) (((Long) obj).longValue() & 4294967295L);
            case 11:
                return ((Long) obj).intValue();
            case 12:
                return ((Long) obj).intValue();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (!C14064he.m66717x1(fFloatValue) && !C14064he.m66715kk(fFloatValue)) {
                    double dFloor = fFloatValue > 0.0f ? Math.floor(fFloatValue) : Math.ceil(fFloatValue);
                    Double dValueOf = Double.valueOf(dFloor);
                    if (dFloor >= -2.147483647E9d && dFloor <= 2.147483647E9d) {
                        return dValueOf.intValue();
                    }
                }
                return Integer.MIN_VALUE;
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (!C14044b3.m66439x1(dDoubleValue) && !C14044b3.m66437kk(dDoubleValue)) {
                    double dFloor2 = dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue);
                    Double dValueOf2 = Double.valueOf(dFloor2);
                    if (dFloor2 >= -2.147483647E9d && dFloor2 <= 2.147483647E9d) {
                        return dValueOf2.intValue();
                    }
                }
                return Integer.MIN_VALUE;
            case 15:
                return C14046bv.m66486rv(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC14092to m27465x1(Object obj) {
        if (AbstractC14092to.class.isInstance(obj)) {
            return (AbstractC14092to) obj;
        }
        if (obj.getClass().isArray()) {
            return AbstractC14092to.m67208k4(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    private static Object m27436du(Object obj, Class cls) {
        if (AbstractC14092to.class.isInstance(obj)) {
            obj = AbstractC14092to.m67212k4((AbstractC14092to) obj);
        }
        if (obj.getClass().isArray() && cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m27439h4(Object obj, Class cls) {
        if (AbstractC14092to.class.isInstance(obj)) {
            obj = AbstractC14092to.m67212k4((AbstractC14092to) obj);
        }
        return obj.getClass().isArray() && cls.isInstance(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m27442k4(Object obj, int i) {
        switch (i) {
            case 4:
                return (byte) ((Character) obj).charValue();
            case 5:
            case 6:
                return ((Byte) obj).byteValue();
            case 7:
                return ((Short) obj).byteValue();
            case 8:
                return (byte) (((Integer) obj).intValue() & 255);
            case 9:
                return ((Integer) obj).byteValue();
            case 10:
                return (byte) (((Long) obj).longValue() & 255);
            case 11:
                return ((Long) obj).byteValue();
            case 12:
                return ((Long) obj).byteValue();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (C14064he.m66717x1(fFloatValue) || C14064he.m66715kk(fFloatValue) || fFloatValue > 2.1474836E9f) {
                    return (byte) 0;
                }
                return (byte) (((long) fFloatValue) & 255);
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (C14044b3.m66437kk(dDoubleValue) || C14044b3.m66439x1(dDoubleValue) || dDoubleValue >= 9.223372036854776E18d) {
                    return (byte) 0;
                }
                return (byte) (r7.longValue() & 255);
            case 15:
                return C14046bv.m66454fa(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public static <T> T m27458kk(Object obj, Class<T> cls) {
        if (obj == 0) {
            if (m27443k4((Class<?>) cls).m66758v4()) {
                throw new IllegalStateException("Value type object can't be null");
            }
            return null;
        }
        if (cls != null) {
            return (cls.equals(AbstractC14092to.class) && obj.getClass().isArray()) ? (T) AbstractC14092to.m67208k4(obj) : (cls.isArray() && (obj instanceof AbstractC14092to)) ? (T) AbstractC14092to.m67212k4((AbstractC14092to) obj) : obj;
        }
        throw new IllegalStateException("type can't be null");
    }

    /* JADX INFO: renamed from: to */
    private static InterfaceC7014c5 m27463to(Class<?> cls) {
        InterfaceC7014c5 interfaceC7014c5;
        HashMap<Class, InterfaceC7014c5> map = f19083kk;
        synchronized (map) {
            interfaceC7014c5 = map.get(cls);
        }
        return interfaceC7014c5;
    }

    /* JADX INFO: renamed from: x1 */
    public static Integer m27466x1(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14068j5 m27443k4(Class<?> cls) {
        return C9854x6.m48598k4(cls);
    }

    /* JADX INFO: renamed from: kk */
    private static <T> Constructor<T> m27459kk(Class<T> cls) {
        Constructor<T> constructor;
        HashMap<Class<?>, Constructor<?>> map = f19084x1;
        synchronized (map) {
            constructor = (Constructor) map.get(cls);
        }
        return constructor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public static <T> T m27464to(Object obj, Class<T> cls) {
        if (obj != 0) {
            return obj;
        }
        throw new NullReferenceException();
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> Object m27467x1(Class<T> cls) {
        boolean zContains;
        if (cls.equals(Byte.TYPE) || cls.equals(Byte.class)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE) || cls.equals(Short.class)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
            return 0;
        }
        if (cls.equals(Long.TYPE) || cls.equals(Long.class)) {
            return 0L;
        }
        if (cls.equals(Character.TYPE) || cls.equals(Character.class)) {
            return (char) 0;
        }
        if (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Float.TYPE) || cls.equals(Float.class)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Double.TYPE) || cls.equals(Double.class)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(C14046bv.class)) {
            return C14046bv.f47165du.Clone();
        }
        if (!AbstractC7020m9.class.isAssignableFrom(cls)) {
            return null;
        }
        HashSet<Class<?>> hashSet = f19082k4;
        synchronized (hashSet) {
            zContains = hashSet.contains(cls);
        }
        if (!zContains) {
            try {
                Class.forName(cls.getName());
            } catch (Exception unused) {
            }
            HashSet<Class<?>> hashSet2 = f19082k4;
            synchronized (hashSet2) {
                hashSet2.add(cls);
            }
        }
        try {
            InterfaceC7014c5 interfaceC7014c5M27463to = m27463to(cls);
            if (interfaceC7014c5M27463to != null) {
                return interfaceC7014c5M27463to.mo838x1();
            }
            Constructor<T> constructorM27459kk = m27459kk((Class) cls);
            if (constructorM27459kk == null && (constructorM27459kk = cls.getConstructor(new Class[0])) != null) {
                m27455k4((Class) cls, (Constructor) constructorM27459kk);
            }
            return constructorM27459kk != null ? constructorM27459kk.newInstance(new Object[0]) : cls.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Boolean m27444k4(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m27460kk(Object obj) {
        return AbstractC14092to.class.isInstance(obj) || obj.getClass().isArray();
    }

    /* JADX INFO: renamed from: x1 */
    public static short m27468x1(Object obj, int i) {
        switch (i) {
            case 4:
                return (short) ((Character) obj).charValue();
            case 5:
                return ((Byte) obj).shortValue();
            case 6:
                return (short) (((Byte) obj).byteValue() & 255);
            case 7:
                return ((Short) obj).shortValue();
            case 8:
                return (short) (((Integer) obj).intValue() & 65535);
            case 9:
                return ((Integer) obj).shortValue();
            case 10:
                return (short) (((Long) obj).longValue() & C18177fb.f54859s);
            case 11:
                return ((Long) obj).shortValue();
            case 12:
                return ((Long) obj).shortValue();
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                if (C14064he.m66717x1(fFloatValue) || C14064he.m66715kk(fFloatValue) || fFloatValue > 2.1474836E9f) {
                    return (short) 0;
                }
                return (short) (((long) fFloatValue) & C18177fb.f54859s);
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (C14044b3.m66437kk(dDoubleValue) || C14044b3.m66439x1(dDoubleValue) || dDoubleValue > 2.147483647E9d) {
                    return (short) 0;
                }
                return (short) dDoubleValue;
            case 15:
                return C14046bv.m66507yj(((C14046bv) obj).Clone());
            default:
                throw new InvalidCastException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Byte m27445k4(byte b) {
        return Byte.valueOf(b);
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> boolean m27469x1(Object obj, Class<T> cls) {
        if (obj == null) {
            return false;
        }
        if (cls == null) {
            throw new IllegalStateException("type can't be null");
        }
        if (cls == AbstractC14092to.class) {
            return m27460kk(obj);
        }
        if (cls.isArray()) {
            return m27439h4(obj, cls);
        }
        if (cls.isPrimitive()) {
            cls = C5891k4.m23725k4(cls);
        }
        return cls.isInstance(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static Character m27446k4(char c) {
        return Character.valueOf(c);
    }

    /* JADX INFO: renamed from: k4 */
    public static Double m27447k4(double d) {
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: k4 */
    public static Float m27448k4(float f) {
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: k4 */
    public static Long m27449k4(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> Object m27450k4(Class<T> cls, int... iArr) {
        return AbstractC14092to.m67212k4(AbstractC14092to.m67206k4(m27443k4((Class<?>) cls), iArr));
    }

    /* JADX INFO: renamed from: k4 */
    public static Object m27451k4(Object obj) {
        return obj instanceof AbstractC14079na ? ((AbstractC14079na) obj).Clone() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> T m27452k4(Object obj, Class<T> cls) {
        if (obj == 0) {
            return null;
        }
        if (cls == null) {
            throw new IllegalStateException("type can't be null");
        }
        if (cls == AbstractC14092to.class) {
            return (T) m27465x1(obj);
        }
        if (cls.isArray()) {
            return (T) m27436du(obj, cls);
        }
        if (cls.isPrimitive() || C5891k4.m23732x1(cls) != null) {
            throw new IllegalStateException("reference type or nullable type required");
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> T m27453k4(T t, T t2) {
        return t != null ? t : t2;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m27454k4(Class<T> cls, InterfaceC7014c5<T> interfaceC7014c5) {
        HashMap<Class, InterfaceC7014c5> map = f19083kk;
        synchronized (map) {
            map.put(cls, interfaceC7014c5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static <T> void m27455k4(Class<T> cls, Constructor<T> constructor) {
        HashMap<Class<?>, Constructor<?>> map = f19084x1;
        synchronized (map) {
            map.put(cls, constructor);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27456k4(Iterator it, Class<IDisposable> cls) {
        return cls.isInstance(it);
    }
}
