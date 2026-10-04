package com.aspose.slides.p559ms.System;

import com.aspose.slides.Collections.Comparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p314oc.C7019kk;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.wy */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14106wy extends AbstractC14079na<AbstractC14106wy> {
    public static final char[] EnumSeparatorCharArray = {','};

    /* JADX INFO: renamed from: a */
    private static final x1 f47348a = new x1();

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.wy$du */
    public static abstract class du extends k4 {
        public du(Class<? extends AbstractC14106wy> cls, Class<? extends Number> cls2) {
            super(cls, cls2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.wy$k4 */
    public static abstract class k4 {

        /* JADX INFO: renamed from: a */
        String[] f47349a;

        /* JADX INFO: renamed from: b */
        long[] f47350b;

        /* JADX INFO: renamed from: c */
        private final Class<?> f47351c;
        protected final C19075k4 constants = new C19075k4();

        /* JADX INFO: renamed from: d */
        private final Class<? extends Number> f47352d;

        /* JADX INFO: renamed from: com.aspose.slides.ms.System.wy$k4$k4, reason: collision with other inner class name */
        public static class C19075k4 extends LinkedHashMap<String, Long> {
        }

        public k4(Class<? extends AbstractC14106wy> cls, Class<? extends Number> cls2) {
            this.f47351c = cls;
            this.f47352d = cls2;
        }

        /* JADX INFO: renamed from: a */
        private static int m67335a(long[] jArr, long j) {
            long[] jArr2 = new long[jArr.length];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            return AbstractC14092to.m67196k4(AbstractC14092to.m67208k4(jArr2), Long.valueOf(j));
        }

        public final void addConstant(String str, long j) {
            this.constants.put(str, Long.valueOf(j));
            this.f47349a = null;
        }

        public final Class<?> getEnumClass() {
            return this.f47351c;
        }

        public String getName(long j) {
            m67336a();
            int iM67335a = m67335a(this.f47350b, j);
            if (iM67335a >= 0) {
                return this.f47349a[iM67335a];
            }
            return null;
        }

        public final Class<? extends Number> getUnderlineClass() {
            return this.f47352d;
        }

        public final long getValue(String str, boolean z) {
            for (Map.Entry<String, Long> entry : this.constants.entrySet()) {
                if (C14113y2.m67382k4(entry.getKey(), str, z) == 0) {
                    return entry.getValue().longValue();
                }
            }
            throw new ArgumentException("Requested value '{0}' was not found.", str);
        }

        public String internalFlagsFormat(long j) {
            String name = getName(j);
            if (name != null) {
                return name;
            }
            if (j == 0) {
                return Long.toString(j);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m67336a();
            int i = 0;
            long j2 = j;
            while (true) {
                long[] jArr = this.f47350b;
                if (i >= jArr.length) {
                    break;
                }
                long j3 = jArr[i];
                String str = this.f47349a[i];
                if (j3 != 0 && (j2 & j3) == j3) {
                    linkedHashSet.add(str);
                    j2 ^= j3;
                }
                i++;
            }
            if (j2 != 0) {
                return Long.toString(j);
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
            return sb.toString();
        }

        public String internalFormat(long j) {
            if (this instanceof kk) {
                return internalFlagsFormat(j);
            }
            String name = getName(j);
            return name == null ? Long.toString(j) : name;
        }

        /* JADX INFO: renamed from: a */
        private void m67336a() {
            if (this.f47349a == null || this.f47350b == null) {
                int size = this.constants.size();
                long[] jArr = new long[size];
                String[] strArr = new String[this.constants.size()];
                int i = 0;
                for (Map.Entry<String, Long> entry : this.constants.entrySet()) {
                    jArr[i] = entry.getValue().longValue();
                    strArr[i] = entry.getKey();
                    i++;
                }
                Comparer comparer = Comparer.Default;
                for (int i2 = 1; i2 < size; i2++) {
                    String str = strArr[i2];
                    long j = jArr[i2];
                    boolean z = false;
                    int i3 = i2;
                    do {
                        int i4 = i3 - 1;
                        if (comparer.compare(Long.valueOf(jArr[i4]), Long.valueOf(j)) <= 0) {
                            break;
                        }
                        strArr[i3] = strArr[i4];
                        jArr[i3] = jArr[i4];
                        i3--;
                        z = true;
                    } while (i3 != 0);
                    if (z) {
                        strArr[i3] = str;
                        jArr[i3] = j;
                    }
                }
                this.f47349a = strArr;
                this.f47350b = jArr;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.wy$kk */
    public static abstract class kk extends k4 {
        public kk(Class<? extends AbstractC14106wy> cls, Class<? extends Number> cls2) {
            super(cls, cls2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.wy$to */
    public static abstract class to extends AbstractC14106wy {

        /* JADX INFO: renamed from: k4 */
        private long f47353k4;

        /* JADX INFO: renamed from: x1 */
        private String f47354x1;

        public boolean equals(Object obj) {
            if (obj instanceof to) {
                to toVar = (to) obj;
                if (toVar.f47353k4 == this.f47353k4 && C14113y2.m67363du(toVar.f47354x1, this.f47354x1)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (int) this.f47353k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.wy$x1 */
    public static class x1 extends HashMap<Class<?>, k4> {
    }

    /* JADX INFO: renamed from: a */
    private static k4 m67330a(Class<?> cls) {
        k4 k4Var;
        x1 x1Var = f47348a;
        synchronized (x1Var) {
            if (!x1Var.containsKey(cls)) {
                try {
                    Class.forName(cls.getName());
                } catch (Exception unused) {
                }
                if (!f47348a.containsKey(cls)) {
                    throw new IllegalStateException();
                }
            }
            k4Var = f47348a.get(cls);
        }
        return k4Var;
    }

    /* JADX INFO: renamed from: b */
    private static k4.C19075k4 m67334b(Class<?> cls) {
        return m67330a(cls).constants;
    }

    public static String format(AbstractC14068j5 abstractC14068j5, Object obj, String str) {
        long jM66847c5;
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("enumType");
        }
        if (!abstractC14068j5.m66763yd()) {
            throw new ArgumentException("Type provided must be an Enum.", "enumType");
        }
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (str == null) {
            throw new ArgumentNullException("format");
        }
        AbstractC14068j5 abstractC14068j5M27443k4 = C7019kk.m27443k4(obj.getClass());
        AbstractC14068j5 underlyingType = getUnderlyingType(abstractC14068j5);
        if (abstractC14068j5M27443k4.m66763yd()) {
            if (abstractC14068j5M27443k4 != abstractC14068j5) {
                throw new ArgumentException(C14113y2.m67402k4("Object must be the same type as the enum. The type passed in was '{0}'; the enum type was '{1}'.", abstractC14068j5M27443k4.toString(), abstractC14068j5.toString()));
            }
            jM66847c5 = abstractC14068j5M27443k4.mo48620k4().m66751kk(C7019kk.m27443k4((Class<?>) to.class)) ? ((AbstractC14106wy) obj).get_Value() : (abstractC14068j5M27443k4.m66751kk(C7019kk.m27443k4((Class<?>) Long.class)) || abstractC14068j5M27443k4.m66751kk(C7019kk.m27443k4((Class<?>) Long.TYPE))) ? ((Long) obj).longValue() : abstractC14068j5M27443k4.m66751kk(C7019kk.m27443k4((Class<?>) String.class)) ? getValue(abstractC14068j5.mo48624ks(), (String) obj) : 0L;
        } else {
            if (abstractC14068j5M27443k4 != underlyingType) {
                throw new ArgumentException(C14113y2.m67402k4("Enum underlying type and the object must be same type or object. Type passed in was '{0}'; the enum underlying type was '{1}'.", abstractC14068j5M27443k4.toString(), underlyingType.toString()));
            }
            jM66847c5 = C14080ne.m66847c5(obj);
        }
        if (str.length() != 1) {
            throw new FormatException("Format String can be only \"G\", \"g\", \"X\", \"x\", \"F\", \"f\", \"D\" or \"d\".");
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != 'D') {
            if (cCharAt != 'X') {
                if (cCharAt != 'd') {
                    if (cCharAt != 'x') {
                        if (cCharAt != 'F') {
                            if (cCharAt != 'G') {
                                if (cCharAt != 'f') {
                                    if (cCharAt != 'g') {
                                        throw new FormatException("Format String can be only \"G\", \"g\", \"X\", \"x\", \"F\", \"f\", \"D\" or \"d\".");
                                    }
                                }
                            }
                            return m67331a((Class<?>) abstractC14068j5.mo48624ks(), jM66847c5);
                        }
                        return m67332a((Class<?>) abstractC14068j5.mo48624ks(), Long.valueOf(jM66847c5));
                    }
                }
            }
            return m67333a(Long.valueOf(jM66847c5));
        }
        return C14091t6.m67191x1(jM66847c5);
    }

    public static String getName(AbstractC14068j5 abstractC14068j5, Object obj) {
        if (obj == null) {
            throw new ArgumentNullException();
        }
        return getName((Class<?>) abstractC14068j5.mo48624ks(), C7019kk.m27438h4(obj, AbstractC14068j5.m66733to(C14067j2.m66727k4(obj))));
    }

    public static Collection<String> getNames(Class<?> cls) {
        return m67334b(cls).keySet();
    }

    public static AbstractC14068j5 getUnderlyingType(AbstractC14068j5 abstractC14068j5) {
        return C7019kk.m27443k4((Class<?>) getUnderlyingType((Class<?>) abstractC14068j5.mo48624ks()));
    }

    public static long getValue(Class<?> cls, String str) {
        return m67330a(cls).getValue(str, false);
    }

    public static AbstractC14092to getValues(AbstractC14068j5 abstractC14068j5) {
        return AbstractC14092to.m67208k4((Object) m67334b(abstractC14068j5.mo48624ks()).values().toArray(new Long[0]));
    }

    public static boolean isDefined(AbstractC14068j5 abstractC14068j5, long j) {
        return isDefined((Class<?>) abstractC14068j5.mo48624ks(), j);
    }

    public static long parse(AbstractC14068j5 abstractC14068j5, String str) {
        return parse((Class<?>) abstractC14068j5.mo48624ks(), str);
    }

    public static void register(k4 k4Var) {
        x1 x1Var = f47348a;
        synchronized (x1Var) {
            x1Var.put(k4Var.getEnumClass(), k4Var);
        }
    }

    public static Object toObject(AbstractC14068j5 abstractC14068j5, Object obj) {
        throw new NotImplementedException();
    }

    public static String toString(Class<?> cls, long j) {
        return m67331a(cls, j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public AbstractC14106wy Clone() {
        return this;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public void CloneTo(AbstractC14106wy abstractC14106wy) {
    }

    public String get_Caption() {
        throw new InvalidOperationException("should be overrided");
    }

    public long get_Value() {
        throw new InvalidOperationException("should be overrided");
    }

    /* JADX INFO: renamed from: a */
    private static String m67331a(Class<?> cls, long j) {
        return m67330a(cls).internalFormat(j);
    }

    public static String format(Class<?> cls, long j, String str) {
        throw new NotImplementedException();
    }

    public static String getName(Class<?> cls, long j) {
        return m67330a(cls).getName(j);
    }

    public static String[] getNames(AbstractC14068j5 abstractC14068j5) {
        return (String[]) m67334b(abstractC14068j5.mo48624ks()).keySet().toArray(new String[0]);
    }

    public static Class<? extends Number> getUnderlyingType(Class<?> cls) {
        return m67330a(cls).getUnderlineClass();
    }

    public static boolean isDefined(AbstractC14068j5 abstractC14068j5, Object obj) {
        if (obj instanceof String) {
            return isDefined(abstractC14068j5, (String) obj);
        }
        if (obj instanceof Long) {
            return isDefined(abstractC14068j5, ((Long) obj).longValue());
        }
        if (obj instanceof Integer) {
            return isDefined(abstractC14068j5, ((Integer) obj).longValue());
        }
        if (obj instanceof Short) {
            return isDefined(abstractC14068j5, ((Short) obj).longValue());
        }
        if (obj instanceof Byte) {
            return isDefined(abstractC14068j5, ((Byte) obj).longValue());
        }
        return false;
    }

    public static long parse(AbstractC14068j5 abstractC14068j5, String str, Boolean bool) {
        return parse((Class<?>) abstractC14068j5.mo48624ks(), str, bool);
    }

    /* JADX INFO: renamed from: a */
    private static String m67332a(Class<?> cls, Long l) {
        return m67330a(cls).internalFlagsFormat(l.longValue());
    }

    public static boolean isDefined(AbstractC14068j5 abstractC14068j5, String str) {
        return m67334b(abstractC14068j5.mo48624ks()).containsKey(str);
    }

    public static long parse(Class<?> cls, String str) {
        return parse(cls, str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: a */
    private static String m67333a(Object obj) {
        switch (AbstractC14068j5.m66733to(C7019kk.m27443k4(obj.getClass()))) {
            case 5:
                return C14045bs.m66444k4(((Byte) obj).byteValue(), "X2", (InterfaceC14073kp) null);
            case 6:
                return C14098up.m67321k4(((Byte) obj).byteValue(), "X2", (InterfaceC14073kp) null);
            case 7:
                return C14088s7.m67176k4(((Short) obj).shortValue(), "X4", (InterfaceC14073kp) null);
            case 8:
                return C14081nv.m67067k4(((Integer) obj).intValue(), "X4", (InterfaceC14073kp) null);
            case 9:
                return C14057f9.m66588k4(((Integer) obj).intValue(), "X8", (InterfaceC14073kp) null);
            case 10:
                return C14114y9.m67461k4(((Long) obj).longValue(), "X8", (InterfaceC14073kp) null);
            case 11:
                return C14091t6.m67188k4(((Long) obj).longValue(), "X16", (InterfaceC14073kp) null);
            case 12:
                return C14065ig.m66723k4(((Long) obj).longValue(), "X16", (InterfaceC14073kp) null);
            default:
                throw new InvalidOperationException("Unknown enum type.");
        }
    }

    @Deprecated
    public static boolean isDefined(Class<?> cls, long j) {
        return m67334b(cls).containsValue(Long.valueOf(j));
    }

    public static long parse(Class<?> cls, String str, Boolean bool) {
        String[] strArrM67369h4 = C14113y2.m67369h4(str, EnumSeparatorCharArray);
        if (strArrM67369h4.length == 1) {
            long[] jArr = new long[1];
            if (C14091t6.m67189k4(str, 7, null, jArr)) {
                long j = jArr[0];
                if (j > 2147483647L || j < -2147483648L) {
                    throw new OverflowException();
                }
                return j;
            }
        }
        k4 k4VarM67330a = m67330a(cls);
        long value = 0;
        for (String str2 : strArrM67369h4) {
            value |= k4VarM67330a.getValue(str2.trim(), bool.booleanValue());
        }
        return value;
    }
}
