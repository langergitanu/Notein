package o0oo0o0;

import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.client.internal.MsalUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o0oo0o00.C31320OooOoOO;

/* JADX INFO: renamed from: o0oo0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31286OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<Annotation> f111706OooO00o = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Type[] f111707OooO0O0 = new Type[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Class<? extends Annotation> f111708OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f111709OooO0Oo;

    /* JADX INFO: renamed from: o0oo0o0.OooO0O0$OooO00o */
    public static final class OooO00o implements GenericArrayType {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Type f111710OooOo0o;

        public OooO00o(Type type) {
            this.f111710OooOo0o = C31286OooO0O0.OooO00o(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C31320OooOoOO.OooO0O0(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f111710OooOo0o;
        }

        public final int hashCode() {
            return this.f111710OooOo0o.hashCode();
        }

        public final String toString() {
            return C31286OooO0O0.OooO0oo(this.f111710OooOo0o) + C18416x7.f56644n;
        }
    }

    /* JADX INFO: renamed from: o0oo0o0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20169OooO0O0 implements ParameterizedType {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Type f111711OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Type f111712OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Type[] f111713OooOoO0;

        public C20169OooO0O0(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C31320OooOoOO.OooO0OO(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f111712OooOo0o = type == null ? null : C31286OooO0O0.OooO00o(type);
            this.f111711OooOo = C31286OooO0O0.OooO00o(type2);
            this.f111713OooOoO0 = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f111713OooOoO0;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                C31286OooO0O0.OooO0O0(this.f111713OooOoO0[i]);
                Type[] typeArr3 = this.f111713OooOoO0;
                typeArr3[i] = C31286OooO0O0.OooO00o(typeArr3[i]);
                i++;
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C31320OooOoOO.OooO0O0(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f111713OooOoO0.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f111712OooOo0o;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f111711OooOo;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f111713OooOoO0) ^ this.f111711OooOo.hashCode();
            Set<Annotation> set = C31286OooO0O0.f111706OooO00o;
            Type type = this.f111712OooOo0o;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f111713OooOoO0;
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C31286OooO0O0.OooO0oo(this.f111711OooOo));
            if (typeArr.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C31286OooO0O0.OooO0oo(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(C31286OooO0O0.OooO0oo(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o0oo0o0.OooO0O0$OooO0OO */
    public static final class OooO0OO implements WildcardType {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Type f111714OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Type f111715OooOo0o;

        public OooO0OO(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C31286OooO0O0.OooO0O0(typeArr[0]);
                this.f111714OooOo = null;
                this.f111715OooOo0o = C31286OooO0O0.OooO00o(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            C31286OooO0O0.OooO0O0(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f111714OooOo = C31286OooO0O0.OooO00o(typeArr2[0]);
            this.f111715OooOo0o = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C31320OooOoOO.OooO0O0(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f111714OooOo;
            return type != null ? new Type[]{type} : C31286OooO0O0.f111707OooO0O0;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f111715OooOo0o};
        }

        public final int hashCode() {
            Type type = this.f111714OooOo;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f111715OooOo0o.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f111714OooOo;
            if (type != null) {
                return "? super " + C31286OooO0O0.OooO0oo(type);
            }
            Type type2 = this.f111715OooOo0o;
            if (type2 == Object.class) {
                return MsalUtils.QUERY_STRING_SYMBOL;
            }
            return "? extends " + C31286OooO0O0.OooO0oo(type2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f111708OooO0OO = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f111709OooO0Oo = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type OooO00o(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new OooO00o(OooO00o(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C20169OooO0O0) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C20169OooO0O0(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof OooO00o ? type : new OooO00o(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof OooO0OO)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new OooO0OO(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void OooO0O0(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Type OooO0OO(Type type, Class<?> cls, Class<?> cls2) {
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
                    return OooO0OO(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return OooO0OO(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean OooO0Oo(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static void OooO0o(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type OooO0o0(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type2 = typeVariable;
            } else {
                Type typeOooO0OO = OooO0OO(type, cls, cls2);
                if (typeOooO0OO instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    for (int i = 0; i < typeParameters.length; i++) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeOooO0OO).getActualTypeArguments()[i];
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls3 = (Class) type2;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeOooO0o0 = OooO0o0(type, cls, componentType, linkedHashSet);
                return componentType == typeOooO0o0 ? cls3 : new OooO00o(typeOooO0o0);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeOooO0o02 = OooO0o0(type, cls, genericComponentType, linkedHashSet);
            return genericComponentType == typeOooO0o02 ? genericArrayType : new OooO00o(typeOooO0o02);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeOooO0o03 = OooO0o0(type, cls, ownerType, linkedHashSet);
            boolean z = typeOooO0o03 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeOooO0o04 = OooO0o0(type, cls, actualTypeArguments[i2], linkedHashSet);
                if (typeOooO0o04 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeOooO0o04;
                }
            }
            return z ? new C20169OooO0O0(typeOooO0o03, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeOooO0o05 = OooO0o0(type, cls, lowerBounds[0], linkedHashSet);
                type3 = wildcardType;
                if (typeOooO0o05 != lowerBounds[0]) {
                    return new OooO0OO(new Type[]{Object.class}, typeOooO0o05 instanceof WildcardType ? ((WildcardType) typeOooO0o05).getLowerBounds() : new Type[]{typeOooO0o05});
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeOooO0o06 = OooO0o0(type, cls, upperBounds[0], linkedHashSet);
                    type3 = wildcardType;
                    if (typeOooO0o06 != upperBounds[0]) {
                        return new OooO0OO(typeOooO0o06 instanceof WildcardType ? ((WildcardType) typeOooO0o06).getUpperBounds() : new Type[]{typeOooO0o06}, f111707OooO0O0);
                    }
                }
            }
        }
        return type3;
    }

    public static String OooO0oO(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String OooO0oo(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }
}
