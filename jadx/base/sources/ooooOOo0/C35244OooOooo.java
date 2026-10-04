package ooooOOo0;

import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.network.embedded.C18416x7;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: ooooOOo0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35244OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Type[] f126596OooO00o = new Type[0];

    /* JADX INFO: renamed from: ooooOOo0.OooOooo$OooO00o */
    public static final class OooO00o implements GenericArrayType {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Type f126597OooOo0o;

        public OooO00o(Type type) {
            this.f126597OooOo0o = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C35244OooOooo.OooO0O0(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f126597OooOo0o;
        }

        public final int hashCode() {
            return this.f126597OooOo0o.hashCode();
        }

        public final String toString() {
            return C35244OooOooo.OooOOO(this.f126597OooOo0o) + C18416x7.f56644n;
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOooo$OooO0O0 */
    public static final class OooO0O0 implements ParameterizedType {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Type f126598OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Type f126599OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final Type[] f126600OooOoO0;

        public OooO0O0(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C35244OooOooo.OooO00o(type3);
            }
            this.f126599OooOo0o = type;
            this.f126598OooOo = type2;
            this.f126600OooOoO0 = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C35244OooOooo.OooO0O0(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f126600OooOoO0.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f126599OooOo0o;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f126598OooOo;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f126600OooOoO0) ^ this.f126598OooOo.hashCode();
            Type type = this.f126599OooOo0o;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f126600OooOoO0;
            int length = typeArr.length;
            Type type = this.f126598OooOo;
            if (length == 0) {
                return C35244OooOooo.OooOOO(type);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C35244OooOooo.OooOOO(type));
            sb.append("<");
            sb.append(C35244OooOooo.OooOOO(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(C35244OooOooo.OooOOO(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooOooo$OooO0OO */
    public static final class OooO0OO implements WildcardType {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Type f126601OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Type f126602OooOo0o;

        public OooO0OO(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C35244OooOooo.OooO00o(typeArr[0]);
                this.f126601OooOo = null;
                this.f126602OooOo0o = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            C35244OooOooo.OooO00o(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f126601OooOo = typeArr2[0];
            this.f126602OooOo0o = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C35244OooOooo.OooO0O0(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f126601OooOo;
            return type != null ? new Type[]{type} : C35244OooOooo.f126596OooO00o;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f126602OooOo0o};
        }

        public final int hashCode() {
            Type type = this.f126601OooOo;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f126602OooOo0o.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f126601OooOo;
            if (type != null) {
                return "? super " + C35244OooOooo.OooOOO(type);
            }
            Type type2 = this.f126602OooOo0o;
            if (type2 == Object.class) {
                return MsalUtils.QUERY_STRING_SYMBOL;
            }
            return "? extends " + C35244OooOooo.OooOOO(type2);
        }
    }

    public static IllegalArgumentException OooO(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(String.format(str, objArr), "\n    for method ");
        sbOooO0OO.append(method.getDeclaringClass().getSimpleName());
        sbOooO0OO.append(".");
        sbOooO0OO.append(method.getName());
        return new IllegalArgumentException(sbOooO0OO.toString(), exc);
    }

    public static void OooO00o(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean OooO0O0(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return OooO0O0(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type OooO0Oo(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index ", " not in range [0,");
        sbOooO0OO.append(actualTypeArguments.length);
        sbOooO0OO.append(") for ");
        sbOooO0OO.append(parameterizedType);
        throw new IllegalArgumentException(sbOooO0OO.toString());
    }

    public static Type OooO0o(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return OooOO0o(type, cls, OooO0OO(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static Class<?> OooO0o0(Type type) {
        Objects.requireNonNull(type, "type == null");
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
            return Array.newInstance(OooO0o0(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return OooO0o0(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static boolean OooO0oO(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (OooO0oO(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return OooO0oO(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : type.getClass().getName()));
    }

    public static boolean OooO0oo(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException OooOO0(Method method, int i, String str, Object... objArr) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " (parameter #");
        sbOooO0OO.append(i + 1);
        sbOooO0OO.append(")");
        return OooO(method, null, sbOooO0OO.toString(), objArr);
    }

    public static IllegalArgumentException OooOO0O(Method method, Exception exc, int i, String str, Object... objArr) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " (parameter #");
        sbOooO0OO.append(i + 1);
        sbOooO0OO.append(")");
        return OooO(method, exc, sbOooO0OO.toString(), objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type OooOO0o(Type type, Class<?> cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type3 = typeVariable;
            } else {
                Type typeOooO0OO = OooO0OO(type, cls, cls2);
                if (typeOooO0OO instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    for (int i = 0; i < typeParameters.length; i++) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) typeOooO0OO).getActualTypeArguments()[i];
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
        if (type4 instanceof Class) {
            Class cls3 = (Class) type4;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeOooOO0o = OooOO0o(type, cls, componentType);
                return componentType == typeOooOO0o ? cls3 : new OooO00o(typeOooOO0o);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeOooOO0o2 = OooOO0o(type, cls, genericComponentType);
            return genericComponentType == typeOooOO0o2 ? genericArrayType : new OooO00o(typeOooOO0o2);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeOooOO0o3 = OooOO0o(type, cls, ownerType);
            boolean z = typeOooOO0o3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeOooOO0o4 = OooOO0o(type, cls, actualTypeArguments[i2]);
                if (typeOooOO0o4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeOooOO0o4;
                }
            }
            return z ? new OooO0O0(typeOooOO0o3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type4 instanceof WildcardType;
        Type type5 = type4;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeOooOO0o5 = OooOO0o(type, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (typeOooOO0o5 != lowerBounds[0]) {
                    return new OooO0OO(new Type[]{Object.class}, new Type[]{typeOooOO0o5});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeOooOO0o6 = OooOO0o(type, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (typeOooOO0o6 != upperBounds[0]) {
                        return new OooO0OO(new Type[]{typeOooOO0o6}, f126596OooO00o);
                    }
                }
            }
        }
        return type5;
    }

    public static String OooOOO(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static void OooOOO0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
