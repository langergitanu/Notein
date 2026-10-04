package com.aspose.words.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHQ {

    public static final class zzZ {
        private zzZ() {
        }
    }

    public static Type zzU(Class cls, Class cls2) {
        return zzZ(zzZ((Class<?>) cls, (Type) cls2), (Class<?>) cls2);
    }

    public static boolean zzV(Class cls, Class cls2) {
        if (cls == null && cls2 == null) {
            return true;
        }
        if (cls == Boolean.TYPE && cls2.isAssignableFrom(Boolean.class)) {
            return true;
        }
        if (cls == Byte.TYPE && cls2.isAssignableFrom(Byte.class)) {
            return true;
        }
        if (cls == Short.TYPE && cls2.isAssignableFrom(Short.class)) {
            return true;
        }
        if (cls == Character.TYPE && cls2.isAssignableFrom(Character.class)) {
            return true;
        }
        if (cls == Integer.TYPE && cls2.isAssignableFrom(Integer.class)) {
            return true;
        }
        if (cls == Long.TYPE && cls2.isAssignableFrom(Long.class)) {
            return true;
        }
        if (cls == Float.TYPE && cls2.isAssignableFrom(Float.class)) {
            return true;
        }
        return cls == Double.TYPE && cls2.isAssignableFrom(Double.class);
    }

    public static Class<?> zzX(Type type, Class<?> cls) {
        while (!(type instanceof Class)) {
            if (!(type instanceof ParameterizedType)) {
                if (type instanceof GenericArrayType) {
                    return Array.newInstance(zzX(((GenericArrayType) type).getGenericComponentType(), cls), 0).getClass();
                }
                if (type instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) type;
                    Type type2 = zzq(cls).get(typeVariable);
                    type = type2 == null ? zzZ(typeVariable) : zzX(type2, cls);
                }
                return type instanceof Class ? (Class) type : zzZ.class;
            }
            type = ((ParameterizedType) type).getRawType();
        }
        return (Class) type;
    }

    private static Type[] zzY(Type type, Class<?> cls) {
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof TypeVariable) {
                return new Class[]{zzX(type, cls)};
            }
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        Class[] clsArr = new Class[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            clsArr[i] = zzX(actualTypeArguments[i], cls);
        }
        return clsArr;
    }

    public static Type zzZ(Type type, Class<?> cls) {
        Type[] typeArrZzY = zzY(type, cls);
        if (typeArrZzY == null) {
            return zzZ.class;
        }
        if (typeArrZzY.length == 1) {
            return typeArrZzY[0];
        }
        throw new IllegalArgumentException("Expected 1 type argument on generic type " + type + " but found " + typeArrZzY.length);
    }

    private static Map<TypeVariable<?>, Type> zzq(Class<?> cls) {
        HashMap map = new HashMap();
        zzZ(cls.getGenericInterfaces(), map);
        Type genericSuperclass = cls.getGenericSuperclass();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && !Object.class.equals(superclass); superclass = superclass.getSuperclass()) {
            if (genericSuperclass instanceof ParameterizedType) {
                zzZ((ParameterizedType) genericSuperclass, map);
            }
            zzZ(superclass.getGenericInterfaces(), map);
            genericSuperclass = superclass.getGenericSuperclass();
        }
        while (cls.isMemberClass()) {
            Type genericSuperclass2 = cls.getGenericSuperclass();
            if (genericSuperclass2 instanceof ParameterizedType) {
                zzZ((ParameterizedType) genericSuperclass2, map);
            }
            cls = cls.getEnclosingClass();
        }
        return map;
    }

    private static Type zzZ(Class<?> cls, Type type) {
        Class cls2;
        Type typeZzZ;
        Type typeZzZ2;
        if (type instanceof ParameterizedType) {
            cls2 = (Class) ((ParameterizedType) type).getRawType();
        } else {
            cls2 = (Class) type;
        }
        if (cls.equals(cls2)) {
            return type;
        }
        if (cls.isInterface()) {
            for (Type type2 : cls2.getGenericInterfaces()) {
                if (type2 != null && !type2.equals(Object.class) && (typeZzZ2 = zzZ(cls, type2)) != null) {
                    return typeZzZ2;
                }
            }
        }
        Type genericSuperclass = cls2.getGenericSuperclass();
        if (genericSuperclass == null || genericSuperclass.equals(Object.class) || (typeZzZ = zzZ(cls, genericSuperclass)) == null) {
            return null;
        }
        return typeZzZ;
    }

    private static Type zzZ(TypeVariable<?> typeVariable) {
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            return zzZ.class;
        }
        Type typeZzZ = bounds[0];
        if (typeZzZ instanceof TypeVariable) {
            typeZzZ = zzZ((TypeVariable) typeZzZ);
        }
        return typeZzZ == Object.class ? zzZ.class : typeZzZ;
    }

    private static void zzZ(Type[] typeArr, Map<TypeVariable<?>, Type> map) {
        for (Type type : typeArr) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                zzZ(parameterizedType, map);
                Type rawType = parameterizedType.getRawType();
                if (rawType instanceof Class) {
                    zzZ(((Class) rawType).getGenericInterfaces(), map);
                }
            } else if (type instanceof Class) {
                zzZ(((Class) type).getGenericInterfaces(), map);
            }
        }
    }

    private static void zzZ(ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (parameterizedType.getRawType() instanceof Class) {
            TypeVariable<?>[] typeParameters = ((Class) parameterizedType.getRawType()).getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (parameterizedType.getOwnerType() != null) {
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    zzZ((ParameterizedType) ownerType, map);
                }
            }
            for (int i = 0; i < actualTypeArguments.length; i++) {
                TypeVariable<?> typeVariable = typeParameters[i];
                Type type = actualTypeArguments[i];
                if (type instanceof Class) {
                    map.put(typeVariable, type);
                } else if (type instanceof GenericArrayType) {
                    map.put(typeVariable, type);
                } else if (type instanceof ParameterizedType) {
                    map.put(typeVariable, type);
                } else if (type instanceof TypeVariable) {
                    TypeVariable typeVariable2 = (TypeVariable) type;
                    Type typeZzZ = map.get(typeVariable2);
                    if (typeZzZ == null) {
                        typeZzZ = zzZ(typeVariable2);
                    }
                    map.put(typeVariable, typeZzZ);
                }
            }
        }
    }
}
