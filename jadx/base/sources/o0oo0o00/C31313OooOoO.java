package o0oo0o00;

import OooOo.C20485OooOoO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o000oo0.C24684Oooo;
import o0oo0o0.C31285OooO00o;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;
import o0oo0o00.AbstractC31304OooOOo0;
import oO0o0O0o.C33580OooO00o;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: o0oo0o00.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31313OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f111819OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f111820OooO0O0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C31314OooO0Oo f111821OooO0OO = new C31314OooO0Oo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C31315OooO0o0 f111822OooO0Oo = new C31315OooO0o0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0o f111824OooO0o0 = new OooO0o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C31316OooO0oO f111823OooO0o = new C31316OooO0oO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C31317OooO0oo f111825OooO0oO = new C31317OooO0oo();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO f111826OooO0oo = new OooO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooOO0 f111818OooO = new OooOO0();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f111827OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO */
    public class OooO extends AbstractC31298OooOO0o<Long> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            long jLongValueExact;
            int iOooo000 = c31303OooOOo.f111742OooOoo;
            if (iOooo000 == 0) {
                iOooo000 = c31303OooOOo.Oooo000();
            }
            if (iOooo000 == 16) {
                c31303OooOOo.f111742OooOoo = 0;
                int[] iArr = c31303OooOOo.f111749OooOoO;
                int i = c31303OooOOo.f111748OooOo0o - 1;
                iArr[i] = iArr[i] + 1;
                jLongValueExact = c31303OooOOo.f111744OooOooO;
            } else {
                if (iOooo000 == 17) {
                    long j = c31303OooOOo.f111745OooOooo;
                    C34524OooO0Oo c34524OooO0Oo = c31303OooOOo.f111743OooOoo0;
                    c34524OooO0Oo.getClass();
                    c31303OooOOo.f111746Oooo000 = c34524OooO0Oo.o0Oo0oo(j, C33580OooO00o.f121231OooO0O0);
                } else if (iOooo000 == 9 || iOooo000 == 8) {
                    String strO0000Oo0 = iOooo000 == 9 ? c31303OooOOo.o0000Oo0(C31303OooOOo.f111740Oooo00o) : c31303OooOOo.o0000Oo0(C31303OooOOo.f111739Oooo00O);
                    c31303OooOOo.f111746Oooo000 = strO0000Oo0;
                    try {
                        jLongValueExact = Long.parseLong(strO0000Oo0);
                        c31303OooOOo.f111742OooOoo = 0;
                        int[] iArr2 = c31303OooOOo.f111749OooOoO;
                        int i2 = c31303OooOOo.f111748OooOo0o - 1;
                        iArr2[i2] = iArr2[i2] + 1;
                    } catch (NumberFormatException unused) {
                        c31303OooOOo.f111742OooOoo = 11;
                        jLongValueExact = new BigDecimal(c31303OooOOo.f111746Oooo000).longValueExact();
                        c31303OooOOo.f111746Oooo000 = null;
                        c31303OooOOo.f111742OooOoo = 0;
                        int[] iArr3 = c31303OooOOo.f111749OooOoO;
                        int i3 = c31303OooOOo.f111748OooOo0o - 1;
                        iArr3[i3] = iArr3[i3] + 1;
                    }
                } else if (iOooo000 != 11) {
                    throw new C31299OooOOO("Expected a long but was " + c31303OooOOo.o000O00O() + " at path " + c31303OooOOo.OooO00o());
                }
                c31303OooOOo.f111742OooOoo = 11;
                try {
                    jLongValueExact = new BigDecimal(c31303OooOOo.f111746Oooo000).longValueExact();
                    c31303OooOOo.f111746Oooo000 = null;
                    c31303OooOOo.f111742OooOoo = 0;
                    int[] iArr32 = c31303OooOOo.f111749OooOoO;
                    int i32 = c31303OooOOo.f111748OooOo0o - 1;
                    iArr32[i32] = iArr32[i32] + 1;
                } catch (ArithmeticException | NumberFormatException unused2) {
                    throw new C31299OooOOO("Expected a long but was " + c31303OooOOo.f111746Oooo000 + " at path " + c31303OooOOo.OooO00o());
                }
            }
            return Long.valueOf(jLongValueExact);
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000OO(((Long) obj).longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO00o */
    public class OooO00o extends AbstractC31298OooOO0o<String> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            return c31303OooOOo.o0000o0();
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000oO((String) obj);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0O0 */
    public class OooO0O0 implements AbstractC31298OooOO0o.OooO00o {
        @Override // o0oo0o00.AbstractC31298OooOO0o.OooO00o
        public final AbstractC31298OooOO0o<?> OooO00o(Type type, Set<? extends Annotation> set, C31306OooOo c31306OooOo) {
            C31285OooO00o c31285OooO00oOooO0O0;
            Class<?> cls;
            Constructor<?> declaredConstructor;
            Object[] objArr;
            Class<?> cls2 = null;
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return C31313OooOoO.f111820OooO0O0;
                }
                if (type == Byte.TYPE) {
                    return C31313OooOoO.f111821OooO0OO;
                }
                if (type == Character.TYPE) {
                    return C31313OooOoO.f111822OooO0Oo;
                }
                if (type == Double.TYPE) {
                    return C31313OooOoO.f111824OooO0o0;
                }
                if (type == Float.TYPE) {
                    return C31313OooOoO.f111823OooO0o;
                }
                if (type == Integer.TYPE) {
                    return C31313OooOoO.f111825OooO0oO;
                }
                if (type == Long.TYPE) {
                    return C31313OooOoO.f111826OooO0oo;
                }
                if (type == Short.TYPE) {
                    return C31313OooOoO.f111818OooO;
                }
                if (type == Boolean.class) {
                    return C31313OooOoO.f111820OooO0O0.OooO0O0();
                }
                if (type == Byte.class) {
                    return C31313OooOoO.f111821OooO0OO.OooO0O0();
                }
                if (type == Character.class) {
                    return C31313OooOoO.f111822OooO0Oo.OooO0O0();
                }
                if (type == Double.class) {
                    return C31313OooOoO.f111824OooO0o0.OooO0O0();
                }
                if (type == Float.class) {
                    return C31313OooOoO.f111823OooO0o.OooO0O0();
                }
                if (type == Integer.class) {
                    return C31313OooOoO.f111825OooO0oO.OooO0O0();
                }
                if (type == Long.class) {
                    return C31313OooOoO.f111826OooO0oo.OooO0O0();
                }
                if (type == Short.class) {
                    return C31313OooOoO.f111818OooO.OooO0O0();
                }
                if (type == String.class) {
                    return C31313OooOoO.f111827OooOO0.OooO0O0();
                }
                if (type == Object.class) {
                    return new C31318OooOO0o(c31306OooOo).OooO0O0();
                }
                Class<?> clsOooO0OO = C31320OooOoOO.OooO0OO(type);
                Set<Annotation> set2 = C31286OooO0O0.f111706OooO00o;
                InterfaceC31300OooOOO0 interfaceC31300OooOOO0 = (InterfaceC31300OooOOO0) clsOooO0OO.getAnnotation(InterfaceC31300OooOOO0.class);
                if (interfaceC31300OooOOO0 == null || !interfaceC31300OooOOO0.generateAdapter()) {
                    c31285OooO00oOooO0O0 = null;
                } else {
                    try {
                        try {
                            cls = Class.forName(clsOooO0OO.getName().replace("$", C18115b5.CONNECTOR) + "JsonAdapter", true, clsOooO0OO.getClassLoader());
                        } catch (NoSuchMethodException e) {
                            e = e;
                        }
                        try {
                            if (type instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                try {
                                    declaredConstructor = cls.getDeclaredConstructor(C31306OooOo.class, Type[].class);
                                    objArr = new Object[]{c31306OooOo, actualTypeArguments};
                                } catch (NoSuchMethodException unused) {
                                    declaredConstructor = cls.getDeclaredConstructor(Type[].class);
                                    objArr = new Object[]{actualTypeArguments};
                                }
                            } else {
                                try {
                                    declaredConstructor = cls.getDeclaredConstructor(C31306OooOo.class);
                                    objArr = new Object[]{c31306OooOo};
                                } catch (NoSuchMethodException unused2) {
                                    declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                                    objArr = new Object[0];
                                }
                            }
                            declaredConstructor.setAccessible(true);
                            c31285OooO00oOooO0O0 = ((AbstractC31298OooOO0o) declaredConstructor.newInstance(objArr)).OooO0O0();
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            cls2 = cls;
                            if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                                throw new RuntimeException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Failed to find the generated JsonAdapter constructor for ", type), e);
                            }
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Failed to find the generated JsonAdapter class for ", type), e3);
                    } catch (IllegalAccessException e4) {
                        throw new RuntimeException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Failed to access the generated JsonAdapter for ", type), e4);
                    } catch (InstantiationException e5) {
                        throw new RuntimeException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Failed to instantiate the generated JsonAdapter for ", type), e5);
                    } catch (InvocationTargetException e6) {
                        C31286OooO0O0.OooO0o(e6);
                        throw null;
                    }
                }
                if (c31285OooO00oOooO0O0 != null) {
                    return c31285OooO00oOooO0O0;
                }
                if (clsOooO0OO.isEnum()) {
                    return new OooOO0O(clsOooO0OO).OooO0O0();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0OO */
    public class OooO0OO extends AbstractC31298OooOO0o<Boolean> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            int iOooo000 = c31303OooOOo.f111742OooOoo;
            if (iOooo000 == 0) {
                iOooo000 = c31303OooOOo.Oooo000();
            }
            boolean z = false;
            if (iOooo000 == 5) {
                c31303OooOOo.f111742OooOoo = 0;
                int[] iArr = c31303OooOOo.f111749OooOoO;
                int i = c31303OooOOo.f111748OooOo0o - 1;
                iArr[i] = iArr[i] + 1;
                z = true;
            } else {
                if (iOooo000 != 6) {
                    throw new C31299OooOOO("Expected a boolean but was " + c31303OooOOo.o000O00O() + " at path " + c31303OooOOo.OooO00o());
                }
                c31303OooOOo.f111742OooOoo = 0;
                int[] iArr2 = c31303OooOOo.f111749OooOoO;
                int i2 = c31303OooOOo.f111748OooOo0o - 1;
                iArr2[i2] = iArr2[i2] + 1;
            }
            return Boolean.valueOf(z);
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (c31305OooOOoo.f111784OooOoOO) {
                throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c31305OooOOoo.OooO00o());
            }
            c31305OooOOoo.o0000oO();
            c31305OooOOoo.OooOOo0();
            c31305OooOOoo.f111765OooOoo.o000Oo0o(zBooleanValue ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
            int[] iArr = c31305OooOOoo.f111782OooOoO;
            int i = c31305OooOOoo.f111781OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0Oo, reason: case insensitive filesystem */
    public class C31314OooO0Oo extends AbstractC31298OooOO0o<Byte> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            return Byte.valueOf((byte) C31313OooOoO.OooO00o(c31303OooOOo, "a byte", -128, 255));
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000OO(((Byte) obj).intValue() & 255);
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0o */
    public class OooO0o extends AbstractC31298OooOO0o<Double> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            return Double.valueOf(c31303OooOOo.o00000OO());
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
            }
            if (c31305OooOOoo.f111784OooOoOO) {
                c31305OooOOoo.f111784OooOoOO = false;
                c31305OooOOoo.Oooo0OO(Double.toString(dDoubleValue));
                return;
            }
            c31305OooOOoo.o0000oO();
            c31305OooOOoo.OooOOo0();
            c31305OooOOoo.f111765OooOoo.o000Oo0o(Double.toString(dDoubleValue));
            int[] iArr = c31305OooOOoo.f111782OooOoO;
            int i = c31305OooOOoo.f111781OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0o0, reason: case insensitive filesystem */
    public class C31315OooO0o0 extends AbstractC31298OooOO0o<Character> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            String strO0000o0 = c31303OooOOo.o0000o0();
            if (strO0000o0.length() <= 1) {
                return Character.valueOf(strO0000o0.charAt(0));
            }
            throw new C31299OooOOO(C22237OooO0o0.OooO00o("Expected a char but was ", C24684Oooo.OooO00o('\"', "\"", strO0000o0), " at path ", c31303OooOOo.OooO00o()));
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000oO(((Character) obj).toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0oO, reason: case insensitive filesystem */
    public class C31316OooO0oO extends AbstractC31298OooOO0o<Float> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            float fO00000OO = (float) c31303OooOOo.o00000OO();
            if (!Float.isInfinite(fO00000OO)) {
                return Float.valueOf(fO00000OO);
            }
            throw new C31299OooOOO("JSON forbids NaN and infinities: " + fO00000OO + " at path " + c31303OooOOo.OooO00o());
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            Float f = (Float) obj;
            f.getClass();
            String string = f.toString();
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
            }
            if (c31305OooOOoo.f111784OooOoOO) {
                c31305OooOOoo.f111784OooOoOO = false;
                c31305OooOOoo.Oooo0OO(string);
                return;
            }
            c31305OooOOoo.o0000oO();
            c31305OooOOoo.OooOOo0();
            c31305OooOOoo.f111765OooOoo.o000Oo0o(string);
            int[] iArr = c31305OooOOoo.f111782OooOoO;
            int i = c31305OooOOoo.f111781OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooO0oo, reason: case insensitive filesystem */
    public class C31317OooO0oo extends AbstractC31298OooOO0o<Integer> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            return Integer.valueOf(c31303OooOOo.o00000oO());
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000OO(((Integer) obj).intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooOO0 */
    public class OooOO0 extends AbstractC31298OooOO0o<Short> {
        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            return Short.valueOf((short) C31313OooOoO.OooO00o(c31303OooOOo, "a short", -32768, 32767));
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000OO(((Short) obj).intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooOO0O */
    public static final class OooOO0O<T extends Enum<T>> extends AbstractC31298OooOO0o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f111828OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String[] f111829OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final T[] f111830OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AbstractC31304OooOOo0.OooO00o f111831OooO0Oo;

        public OooOO0O(Class<T> cls) {
            this.f111828OooO00o = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f111830OooO0OO = enumConstants;
                this.f111829OooO0O0 = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.f111830OooO0OO;
                    if (i >= tArr.length) {
                        this.f111831OooO0Oo = AbstractC31304OooOOo0.OooO00o.OooO00o(this.f111829OooO0O0);
                        return;
                    }
                    String strName = tArr[i].name();
                    String[] strArr = this.f111829OooO0O0;
                    Field field = cls.getField(strName);
                    Set<Annotation> set = C31286OooO0O0.f111706OooO00o;
                    InterfaceC31297OooOO0O interfaceC31297OooOO0O = (InterfaceC31297OooOO0O) field.getAnnotation(InterfaceC31297OooOO0O.class);
                    if (interfaceC31297OooOO0O != null) {
                        String strName2 = interfaceC31297OooOO0O.name();
                        if (!"\u0000".equals(strName2)) {
                            strName = strName2;
                        }
                    }
                    strArr[i] = strName;
                    i++;
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in ".concat(cls.getName()), e);
            }
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            int iO0OOO0o;
            int iOooo000 = c31303OooOOo.f111742OooOoo;
            if (iOooo000 == 0) {
                iOooo000 = c31303OooOOo.Oooo000();
            }
            if (iOooo000 < 8 || iOooo000 > 11) {
                iO0OOO0o = -1;
            } else {
                AbstractC31304OooOOo0.OooO00o oooO00o = this.f111831OooO0Oo;
                if (iOooo000 == 11) {
                    iO0OOO0o = c31303OooOOo.ooOO(c31303OooOOo.f111746Oooo000, oooO00o);
                } else {
                    iO0OOO0o = c31303OooOOo.f111741OooOoOO.o0OOO0o(oooO00o.f111752OooO0O0);
                    if (iO0OOO0o != -1) {
                        c31303OooOOo.f111742OooOoo = 0;
                        int[] iArr = c31303OooOOo.f111749OooOoO;
                        int i = c31303OooOOo.f111748OooOo0o - 1;
                        iArr[i] = iArr[i] + 1;
                    } else {
                        String strO0000o0 = c31303OooOOo.o0000o0();
                        int iOoOO = c31303OooOOo.ooOO(strO0000o0, oooO00o);
                        if (iOoOO == -1) {
                            c31303OooOOo.f111742OooOoo = 11;
                            c31303OooOOo.f111746Oooo000 = strO0000o0;
                            c31303OooOOo.f111749OooOoO[c31303OooOOo.f111748OooOo0o - 1] = r0[r1] - 1;
                        }
                        iO0OOO0o = iOoOO;
                    }
                }
            }
            if (iO0OOO0o != -1) {
                return this.f111830OooO0OO[iO0OOO0o];
            }
            String strOooO00o = c31303OooOOo.OooO00o();
            throw new C31299OooOOO("Expected one of " + Arrays.asList(this.f111829OooO0O0) + " but was " + c31303OooOOo.o0000o0() + " at path " + strOooO00o);
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            c31305OooOOoo.o00000oO(this.f111829OooO0O0[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return "JsonAdapter(" + this.f111828OooO00o.getName() + ")";
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOoO$OooOO0o, reason: case insensitive filesystem */
    public static final class C31318OooOO0o extends AbstractC31298OooOO0o<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31306OooOo f111832OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC31298OooOO0o<List> f111833OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AbstractC31298OooOO0o<Map> f111834OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AbstractC31298OooOO0o<String> f111835OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AbstractC31298OooOO0o<Boolean> f111836OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AbstractC31298OooOO0o<Double> f111837OooO0o0;

        public C31318OooOO0o(C31306OooOo c31306OooOo) {
            this.f111832OooO00o = c31306OooOo;
            this.f111833OooO0O0 = c31306OooOo.OooO00o(List.class);
            this.f111834OooO0OO = c31306OooOo.OooO00o(Map.class);
            this.f111835OooO0Oo = c31306OooOo.OooO00o(String.class);
            this.f111837OooO0o0 = c31306OooOo.OooO00o(Double.class);
            this.f111836OooO0o = c31306OooOo.OooO00o(Boolean.class);
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            int iOrdinal = c31303OooOOo.o000O00O().ordinal();
            if (iOrdinal == 0) {
                return this.f111833OooO0O0.OooO00o(c31303OooOOo);
            }
            if (iOrdinal == 2) {
                return this.f111834OooO0OO.OooO00o(c31303OooOOo);
            }
            if (iOrdinal == 5) {
                return this.f111835OooO0Oo.OooO00o(c31303OooOOo);
            }
            if (iOrdinal == 6) {
                return this.f111837OooO0o0.OooO00o(c31303OooOOo);
            }
            if (iOrdinal == 7) {
                return this.f111836OooO0o.OooO00o(c31303OooOOo);
            }
            if (iOrdinal == 8) {
                c31303OooOOo.o0000O();
                return null;
            }
            throw new IllegalStateException("Expected a value but was " + c31303OooOOo.o000O00O() + " at path " + c31303OooOOo.OooO00o());
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r1
          0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // o0oo0o00.AbstractC31298OooOO0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                c31305OooOOoo.OooOooo();
                c31305OooOOoo.Oooo0();
                return;
            }
            Class<?> cls2 = Map.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            } else {
                cls2 = Collection.class;
                if (cls2.isAssignableFrom(cls)) {
                }
            }
            this.f111832OooO00o.OooO0O0(cls, C31286OooO0O0.f111706OooO00o, null).OooO0OO(c31305OooOOoo, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int OooO00o(C31303OooOOo c31303OooOOo, String str, int i, int i2) throws IOException {
        int iO00000oO = c31303OooOOo.o00000oO();
        if (iO00000oO >= i && iO00000oO <= i2) {
            return iO00000oO;
        }
        String strOooO00o = c31303OooOOo.OooO00o();
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(iO00000oO, "Expected ", str, " but was ", " at path ");
        sbOooO0OO.append(strOooO00o);
        throw new C31299OooOOO(sbOooO0OO.toString());
    }
}
