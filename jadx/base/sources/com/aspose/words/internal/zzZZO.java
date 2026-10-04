package com.aspose.words.internal;

import com.aspose.words.internal.zzZHQ;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZO {
    private static HashMap<Class, Class> zzdc = new HashMap<>();
    private static HashMap<Class, Class> zzdb = new HashMap<>();
    private static HashMap<Class, Object> zzda = new HashMap<>();

    static {
        zzZ(Boolean.class, Boolean.TYPE, (Object) Boolean.FALSE);
        zzZ(Character.class, Character.TYPE, (Object) (byte) 0);
        zzZ(Byte.class, Byte.TYPE, (Object) new Byte((byte) 0));
        zzZ(Short.class, Short.TYPE, (Object) new Short((short) 0));
        zzZ(Integer.class, Integer.TYPE, (Object) new Integer(0));
        zzZ(Long.class, Long.TYPE, (Object) new Long(0L));
        zzZ(Float.class, Float.TYPE, (Object) new Float(0.0f));
        zzZ(Double.class, Double.TYPE, (Object) new Double(0.0d));
    }

    public static Class zzA(Class cls) {
        Class cls2 = zzdc.get(cls);
        return cls2 != null ? cls2 : cls;
    }

    public static boolean zzB(Class cls) {
        return zzdb.containsKey(cls);
    }

    public static boolean zzC(Class cls) {
        return cls == Iterable.class;
    }

    public static boolean zzD(Class cls) {
        return cls.isPrimitive();
    }

    public static boolean zzE(Class cls) {
        return cls.isPrimitive();
    }

    public static boolean zzF(Class cls) {
        return Modifier.isFinal(cls.getModifiers());
    }

    public static String zzG(Class cls) {
        return cls.getCanonicalName();
    }

    public static Object zzO(Object obj, int i) {
        try {
            return Array.get(obj, i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getLocalizedMessage());
        }
    }

    public static boolean zzW(Member member) {
        return (member instanceof Field) && !Modifier.isFinal(((Field) member).getModifiers());
    }

    public static boolean zzX(Member member) {
        return member instanceof Field;
    }

    public static int zzY(Class cls, Class cls2) {
        return (cls2.isAssignableFrom(cls) || zzZHQ.zzV(cls, cls2)) ? 2 : 0;
    }

    private static void zzZ(Class cls, Class cls2, Object obj) {
        zzdc.put(cls2, cls);
        zzdb.put(cls, cls2);
        zzda.put(cls2, obj);
    }

    public static Object zzg(Object obj) {
        return zzZKV.zzZY(obj);
    }

    public static boolean zzrH() {
        return false;
    }

    public static boolean zzrI() {
        return false;
    }

    public static boolean zzrJ() {
        return false;
    }

    public static boolean zzrK() {
        return false;
    }

    public static boolean zzrL() {
        return false;
    }

    public static int zzrM() {
        return 1;
    }

    public static Object zzrN() {
        throw new UnsupportedOperationException();
    }

    public static boolean zzrO() {
        return false;
    }

    public static Class zzw(Class cls) {
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static Object zzx(Class cls) {
        return zzda.get(cls);
    }

    public static Class zzy(Class cls) {
        return zzA(cls);
    }

    public static Class zzz(Class cls) {
        Class cls2 = zzdb.get(cls);
        return cls2 != null ? cls2 : cls;
    }

    public static Object zzY(Class cls, int i) {
        return Array.newInstance((Class<?>) cls, i);
    }

    public static zzZVP zzY(Class cls, Object obj, Object obj2) {
        final Type type = cls;
        if (obj != null) {
            type = (Type) obj;
        }
        return zzZVO.zzX(Iterable.class, obj2, new ParameterizedType() { // from class: com.aspose.words.internal.zzZZO.1
            public final boolean equals(Object obj3) {
                Type[] actualTypeArguments;
                if (!(obj3 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) obj3;
                return parameterizedType.getRawType() == Iterable.class && parameterizedType.getOwnerType() == null && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && type.equals(actualTypeArguments[0]);
            }

            @Override // java.lang.reflect.ParameterizedType
            public final Type[] getActualTypeArguments() {
                return new Type[]{type};
            }

            @Override // java.lang.reflect.ParameterizedType
            public final Type getOwnerType() {
                return null;
            }

            @Override // java.lang.reflect.ParameterizedType
            public final Type getRawType() {
                return Iterable.class;
            }

            public final int hashCode() {
                return Iterable.class.hashCode() ^ type.hashCode();
            }
        });
    }

    public static void zzZ(Object obj, int i, Object obj2) {
        try {
            Array.set(obj, i, obj2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getLocalizedMessage());
        }
    }

    public static boolean zzY(Member member) {
        return Modifier.isStatic(member.getModifiers());
    }

    public static zzZVP zzZ(Class cls, Object obj, Object obj2) {
        Type typeZzZ;
        Class<?> clsZzX;
        if (obj != null) {
            typeZzZ = zzZHQ.zzZ((Type) obj, (Class<?>) Iterable.class);
            cls = Iterable.class;
        } else {
            typeZzZ = zzZHQ.zzU(Iterable.class, cls);
        }
        if (typeZzZ == zzZHQ.zzZ.class || (clsZzX = zzZHQ.zzX(typeZzZ, cls)) == zzZHQ.zzZ.class) {
            return null;
        }
        if (typeZzZ instanceof Class) {
            typeZzZ = null;
        }
        return zzZVO.zzX(clsZzX, obj2, typeZzZ);
    }

    public static Object zzZ(Member member) {
        Type genericType;
        if (member instanceof Constructor) {
            return null;
        }
        if (member instanceof Method) {
            genericType = ((Method) member).getGenericReturnType();
        } else if (member instanceof Field) {
            genericType = ((Field) member).getGenericType();
        } else {
            throw new IllegalArgumentException("member");
        }
        if (genericType instanceof Class) {
            return null;
        }
        return genericType;
    }

    public static zz6P[] zzZ(Method method) {
        return zzZ(method.getParameterTypes(), method.getGenericParameterTypes(), method.isVarArgs());
    }

    public static zz6P[] zzZ(Constructor constructor) {
        return zzZ(constructor.getParameterTypes(), constructor.getGenericParameterTypes(), constructor.isVarArgs());
    }

    private static zz6P[] zzZ(Class[] clsArr, Type[] typeArr, boolean z) {
        if (clsArr.length == 0) {
            return zz6P.zzlP;
        }
        zz6P[] zz6pArr = new zz6P[clsArr.length];
        int i = 0;
        while (i < clsArr.length) {
            boolean z2 = i == clsArr.length + (-1) ? z : false;
            Type type = null;
            if (typeArr.length < i) {
                Type type2 = typeArr[i];
                if (!(type2 instanceof Class)) {
                    type = type2;
                }
            }
            zz6pArr[i] = zz6O.zzZ(clsArr[i], type, z2);
            i++;
        }
        return zz6pArr;
    }
}
