package com.huawei.hms.network.base.util;

import OooO0O0.OooO0o;
import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public class TypeUtils {

    /* JADX INFO: renamed from: a */
    static final Type[] f54069a = new Type[0];

    public static final class GenericArrayTypeImpl implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        private final Type f54070a;

        public GenericArrayTypeImpl(Type type) {
            this.f54070a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && TypeUtils.m77766b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f54070a;
        }

        public int hashCode() {
            return this.f54070a.hashCode();
        }

        public String toString() {
            return TypeUtils.m77770d(this.f54070a) + C18416x7.f56644n;
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        private final Type f54071a;

        /* JADX INFO: renamed from: b */
        private final Type f54072b;

        /* JADX INFO: renamed from: c */
        private final Type[] f54073c;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                if (type3 == null) {
                    throw new NullPointerException("typeArgument == null");
                }
                TypeUtils.m77768c(type3);
            }
            this.f54071a = type;
            this.f54072b = type2;
            this.f54073c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && TypeUtils.m77766b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f54073c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f54071a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f54072b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f54073c) ^ this.f54072b.hashCode();
            Type type = this.f54071a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f54073c;
            if (typeArr.length == 0) {
                return TypeUtils.m77770d(this.f54072b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(TypeUtils.m77770d(this.f54072b));
            sb.append("<");
            sb.append(TypeUtils.m77770d(this.f54073c[0]));
            for (int i = 1; i < this.f54073c.length; i++) {
                sb.append(", ");
                sb.append(TypeUtils.m77770d(this.f54073c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType {

        /* JADX INFO: renamed from: a */
        private final Type f54074a;

        /* JADX INFO: renamed from: b */
        private final Type f54075b;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1 || typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                TypeUtils.m77768c(typeArr[0]);
                this.f54075b = null;
                this.f54074a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            TypeUtils.m77768c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f54075b = typeArr2[0];
            this.f54074a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && TypeUtils.m77766b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f54075b;
            return type != null ? new Type[]{type} : TypeUtils.f54069a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f54074a};
        }

        public int hashCode() {
            Type type = this.f54075b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f54074a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f54075b != null) {
                sb = new StringBuilder("? super ");
                type = this.f54075b;
            } else {
                if (this.f54074a == Object.class) {
                    return MsalUtils.QUERY_STRING_SYMBOL;
                }
                sb = new StringBuilder("? extends ");
                type = this.f54074a;
            }
            sb.append(TypeUtils.m77770d(type));
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m77758a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static Class<?> boxIfPrimitive(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: renamed from: c */
    private static Type m77767c(Type type, Class<?> cls, Type type2) {
        Type typeM77760a;
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            Type typeM77760a2 = m77760a(type, cls, lowerBounds[0]);
            if (typeM77760a2 != lowerBounds[0]) {
                return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{typeM77760a2});
            }
        } else if (upperBounds.length == 1 && (typeM77760a = m77760a(type, cls, upperBounds[0])) != upperBounds[0]) {
            return new WildcardTypeImpl(new Type[]{typeM77760a}, f54069a);
        }
        return wildcardType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m77770d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Index ", " not in range [0,");
        sbOooO0OO.append(actualTypeArguments.length);
        sbOooO0OO.append(") for ");
        sbOooO0OO.append(parameterizedType);
        throw new IllegalArgumentException(sbOooO0OO.toString());
    }

    public static Class<?> getRawType(Type type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type getSubmitResponseType(Type type) {
        if (type instanceof ParameterizedType) {
            return getParameterUpperBound(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Submit return type must be parameterized as Submit<Foo> or Submit<? extends Foo>");
    }

    public static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m77760a(type, cls, m77759a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean hasUnresolvableType(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (hasUnresolvableType(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return hasUnresolvableType(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: a */
    public static Type m77759a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m77759a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m77759a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: b */
    private static Type m77765b(Type type, Class<?> cls, Type type2) {
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        Type ownerType = parameterizedType.getOwnerType();
        Type typeM77760a = m77760a(type, cls, ownerType);
        boolean z = typeM77760a != ownerType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments.length;
        for (int i = 0; i < length; i++) {
            Type typeM77760a2 = m77760a(type, cls, actualTypeArguments[i]);
            if (typeM77760a2 != actualTypeArguments[i]) {
                if (!z) {
                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                    z = true;
                }
                actualTypeArguments[i] = typeM77760a2;
            }
        }
        return z ? new ParameterizedTypeImpl(typeM77760a, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m77768c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    private static Type m77760a(Type type, Class<?> cls, Type type2) {
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type typeM77761a = m77761a(type, cls, (TypeVariable<?>) typeVariable);
            return typeM77761a == typeVariable ? type2 : m77760a(type, cls, typeM77761a);
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType == null) {
                    return type2;
                }
                Type typeM77760a = m77760a(type, cls, (Type) componentType);
                return componentType == typeM77760a ? cls2 : new GenericArrayTypeImpl(typeM77760a);
            }
        }
        if (!(type2 instanceof GenericArrayType)) {
            return type2 instanceof ParameterizedType ? m77765b(type, cls, type2) : type2 instanceof WildcardType ? m77767c(type, cls, type2) : type2;
        }
        GenericArrayType genericArrayType = (GenericArrayType) type2;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        Type typeM77760a2 = m77760a(type, cls, genericComponentType);
        return genericComponentType == typeM77760a2 ? genericArrayType : new GenericArrayTypeImpl(typeM77760a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m77766b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        return type instanceof Class ? type.equals(type2) : m77769c(type, type2);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m77769c(Type type, Type type2) {
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m77766b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && m77766b(parameterizedType.getRawType(), parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m77766b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: a */
    private static Type m77761a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
        if (cls2 != null) {
            Type typeM77759a = m77759a(type, cls, (Class<?>) cls2);
            if (typeM77759a instanceof ParameterizedType) {
                return ((ParameterizedType) typeM77759a).getActualTypeArguments()[m77758a(cls2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }
}
