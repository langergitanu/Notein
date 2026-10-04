package o0000Ooo;

import OooooO0.C21294OooOO0O;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o0000OOo.C24217OooO0O0;
import o00O00Oo.InterfaceC24804OooO0OO;
import o00o00O0.C25252OooO0Oo;
import oO00OO.C32228OooO0Oo;
import oO00OO.C32229OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0Oo.C33724OooO0oo;
import oO0o0ooO.C33913OooO0o;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33914OooO0o0;
import oO0oO00.C33963Oooo00O;
import oO0oO00.InterfaceC33989Ooooooo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

/* JADX INFO: renamed from: o0000Ooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24239OooOOO0 implements InterfaceC24804OooO0OO {
    public static final long OooO(long j) {
        return C21294OooOO0O.OooO00o((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final long OooO00o(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC33911OooO0OO OooO0O0(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, InterfaceC33911OooO0OO... args) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        InterfaceC33911OooO0OO interfaceC33911OooO0OO;
        Class<?> cls;
        Object obj2;
        C33913OooO0o c33913OooO0o;
        Class<?> cls2;
        Object obj3;
        InterfaceC33911OooO0OO interfaceC33911OooO0OO2;
        C33913OooO0o c33913OooO0o2;
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(args, "args");
        Class clsOooO0Oo = C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo);
        InterfaceC33911OooO0OO[] args2 = (InterfaceC33911OooO0OO[]) Arrays.copyOf(args, args.length);
        kotlin.jvm.internal.OooOOO0.OooO0oO(args2, "args");
        if (clsOooO0Oo.isEnum() && clsOooO0Oo.getAnnotation(InterfaceC33908OooO.class) == null && clsOooO0Oo.getAnnotation(InterfaceC33914OooO0o0.class) == null) {
            Object[] enumConstants = clsOooO0Oo.getEnumConstants();
            String canonicalName = clsOooO0Oo.getCanonicalName();
            kotlin.jvm.internal.OooOOO0.OooO0o(canonicalName, "getCanonicalName(...)");
            kotlin.jvm.internal.OooOOO0.OooO0o0(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C33963Oooo00O(canonicalName, (Enum[]) enumConstants);
        }
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = (InterfaceC33911OooO0OO[]) Arrays.copyOf(args2, args2.length);
        try {
            Field declaredField = clsOooO0Oo.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0oO2 = obj == null ? null : OooO0oO(obj, (InterfaceC33911OooO0OO[]) Arrays.copyOf(interfaceC33911OooO0OOArr, interfaceC33911OooO0OOArr.length));
        if (interfaceC33911OooO0OOOooO0oO2 != null) {
            return interfaceC33911OooO0OOOooO0oO2;
        }
        String canonicalName2 = clsOooO0Oo.getCanonicalName();
        int i = 0;
        if (canonicalName2 == null || C33595OooOOo.OooOoO0(canonicalName2, "java.", false) || C33595OooOOo.OooOoO0(canonicalName2, "kotlin.", false)) {
            interfaceC33911OooO0OO = null;
        } else {
            Field[] declaredFields = clsOooO0Oo.getDeclaredFields();
            kotlin.jvm.internal.OooOOO0.OooO0o(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i2 = 0;
            boolean z = false;
            Field field = null;
            while (true) {
                if (i2 >= length) {
                    if (!z) {
                        break;
                    }
                } else {
                    Field field2 = declaredFields[i2];
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(field2.getName(), "INSTANCE") && kotlin.jvm.internal.OooOOO0.OooO0O0(field2.getType(), clsOooO0Oo) && Modifier.isStatic(field2.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field = field2;
                    }
                    i2++;
                }
            }
            if (field == null) {
                interfaceC33911OooO0OO = null;
            } else {
                Object obj4 = field.get(null);
                Method[] methods = clsOooO0Oo.getMethods();
                kotlin.jvm.internal.OooOOO0.OooO0o(methods, "getMethods(...)");
                int length2 = methods.length;
                int i3 = 0;
                boolean z2 = false;
                Method method = null;
                while (true) {
                    if (i3 >= length2) {
                        if (!z2) {
                            break;
                        }
                    } else {
                        Method method2 = methods[i3];
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            kotlin.jvm.internal.OooOOO0.OooO0o(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && kotlin.jvm.internal.OooOOO0.OooO0O0(method2.getReturnType(), InterfaceC33911OooO0OO.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object objInvoke = method.invoke(obj4, new Object[0]);
                    if (objInvoke instanceof InterfaceC33911OooO0OO) {
                        interfaceC33911OooO0OO = (InterfaceC33911OooO0OO) objInvoke;
                    }
                }
            }
        }
        if (interfaceC33911OooO0OO != null) {
            return interfaceC33911OooO0OO;
        }
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr2 = (InterfaceC33911OooO0OO[]) Arrays.copyOf(args2, args2.length);
        Class<?>[] declaredClasses = clsOooO0Oo.getDeclaredClasses();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i4];
            if (cls.getAnnotation(InterfaceC33989Ooooooo.class) != null) {
                break;
            }
            i4++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsOooO0Oo.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (interfaceC33911OooO0OOOooO0oO = OooO0oO(obj2, (InterfaceC33911OooO0OO[]) Arrays.copyOf(interfaceC33911OooO0OOArr2, interfaceC33911OooO0OOArr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsOooO0Oo.getDeclaredClasses();
                kotlin.jvm.internal.OooOOO0.OooO0o(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                boolean z3 = false;
                cls2 = null;
                while (true) {
                    if (i < length4) {
                        Class<?> cls3 = declaredClasses2[i];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            cls2 = cls3;
                        }
                        i++;
                    } else if (!z3) {
                    }
                }
                cls2 = null;
            } catch (NoSuchFieldException unused3) {
                c33913OooO0o = null;
            }
            if (cls2 != null) {
                Field field3 = cls2.getField("INSTANCE");
                if (field3 != null) {
                    c33913OooO0o = null;
                    try {
                        obj3 = field3.get(null);
                    } catch (NoSuchFieldException unused4) {
                    }
                } else {
                    c33913OooO0o = null;
                    obj3 = null;
                }
                interfaceC33911OooO0OO2 = obj3 instanceof InterfaceC33911OooO0OO ? (InterfaceC33911OooO0OO) obj3 : c33913OooO0o;
            }
        } else {
            interfaceC33911OooO0OO2 = interfaceC33911OooO0OOOooO0oO;
            c33913OooO0o = null;
        }
        if (interfaceC33911OooO0OO2 != null) {
            return interfaceC33911OooO0OO2;
        }
        if (clsOooO0Oo.getAnnotation(InterfaceC33914OooO0o0.class) == null) {
            InterfaceC33908OooO interfaceC33908OooO = (InterfaceC33908OooO) clsOooO0Oo.getAnnotation(InterfaceC33908OooO.class);
            if (interfaceC33908OooO != null) {
                Class<? extends InterfaceC33911OooO0OO<?>> clsWith = interfaceC33908OooO.with();
                Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
                if (oooo0.OooO0O0(clsWith).equals(oooo0.OooO0O0(C33913OooO0o.class))) {
                    c33913OooO0o2 = new C33913OooO0o(C24217OooO0O0.OooO0oO(clsOooO0Oo));
                }
            }
            c33913OooO0o2 = c33913OooO0o;
        }
        return c33913OooO0o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(ArrayList arrayList, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, oOOoOoOO.OooO00o oooO00o, Charset charset, AbstractC32479OooO0OO abstractC32479OooO0OO) throws oO00OO.OooO0O0 {
        C32229OooO0o0 c32229OooO0o0;
        if (abstractC32479OooO0OO instanceof C32229OooO0o0) {
            c32229OooO0o0 = (C32229OooO0o0) abstractC32479OooO0OO;
            int i = c32229OooO0o0.f115702OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32229OooO0o0.f115702OooOoO = i - Integer.MIN_VALUE;
            } else {
                c32229OooO0o0 = new C32229OooO0o0(abstractC32479OooO0OO);
            }
        }
        Object objOooOo0 = c32229OooO0o0.f115703OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32229OooO0o0.f115702OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0);
            C32228OooO0Oo c32228OooO0Oo = new C32228OooO0Oo(new C33724OooO0oo(arrayList), charset, oooO00o, interfaceC23986Ooooo0o);
            oO00OO.OooO0o oooO0o = new oO00OO.OooO0o(interfaceC23986Ooooo0o, null);
            c32229OooO0o0.f115701OooOo0o = interfaceC23986Ooooo0o;
            c32229OooO0o0.f115700OooOo = oooO00o;
            c32229OooO0o0.f115702OooOoO = 1;
            objOooOo0 = C25252OooO0Oo.OooOo0(c32228OooO0Oo, oooO0o, c32229OooO0o0);
            if (objOooOo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = c32229OooO0o0.f115700OooOo;
            interfaceC23986Ooooo0o = c32229OooO0o0.f115701OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0);
        }
        if (objOooOo0 != null) {
            return objOooOo0;
        }
        if (!interfaceC23986Ooooo0o.OooOoo()) {
            return interfaceC23986Ooooo0o;
        }
        InterfaceC34606OooOOOo interfaceC34606OooOOOo = oooO00o.f123415OooO0OO;
        if (interfaceC34606OooOOOo != null && interfaceC34606OooOOOo.OooO0oO()) {
            return oO00O0oO.OooO0O0.f115612OooO00o;
        }
        String message = "No suitable converter found for " + oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        throw new oO00OO.OooO0O0(message, null);
    }

    public static MessageDigest OooO0Oo() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static MessageDigest OooO0o() {
        try {
            return MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static MessageDigest OooO0o0() {
        try {
            return MessageDigest.getInstance(IDevicePopManager.SHA_1);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static final InterfaceC33911OooO0OO OooO0oO(Object obj, InterfaceC33911OooO0OO... interfaceC33911OooO0OOArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC33911OooO0OOArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC33911OooO0OOArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC33911OooO0OO.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC33911OooO0OOArr, interfaceC33911OooO0OOArr.length));
            if (objInvoke instanceof InterfaceC33911OooO0OO) {
                return (InterfaceC33911OooO0OO) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean OooO0oo(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        return C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo).isInterface();
    }

    @Override // o00O00Oo.InterfaceC24804OooO0OO
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
