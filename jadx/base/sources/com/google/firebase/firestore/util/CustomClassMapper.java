package com.google.firebase.firestore.util;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import android.net.Uri;
import com.aspose.slides.C22226Oooo0oo;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.IgnoreExtraProperties;
import com.google.firebase.firestore.PropertyName;
import com.google.firebase.firestore.ServerTimestamp;
import com.google.firebase.firestore.ThrowOnExtraProperties;
import com.google.firebase.firestore.VectorValue;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes8.dex */
public class CustomClassMapper {
    private static final int MAX_DEPTH = 500;
    private static final ConcurrentMap<Class<?>, BeanMapper<?>> mappers = new ConcurrentHashMap();

    public static class BeanMapper<T> {
        private final Class<T> clazz;
        private final Constructor<T> constructor;
        private final boolean throwOnUnknownProperties;
        private final boolean warnOnUnknownProperties;
        private final Map<String, String> properties = new HashMap();
        private final Map<String, Method> setters = new HashMap();
        private final Map<String, Method> getters = new HashMap();
        private final Map<String, Field> fields = new HashMap();
        private final HashSet<String> serverTimestamps = new HashSet<>();
        private final HashSet<String> documentIdPropertyNames = new HashSet<>();

        public BeanMapper(Class<T> cls) {
            Constructor<T> declaredConstructor;
            this.clazz = cls;
            this.throwOnUnknownProperties = cls.isAnnotationPresent(ThrowOnExtraProperties.class);
            this.warnOnUnknownProperties = !cls.isAnnotationPresent(IgnoreExtraProperties.class);
            try {
                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            this.constructor = declaredConstructor;
            for (Method method : cls.getMethods()) {
                if (shouldIncludeGetter(method)) {
                    String strPropertyName = propertyName(method);
                    addProperty(strPropertyName);
                    method.setAccessible(true);
                    if (this.getters.containsKey(strPropertyName)) {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                    this.getters.put(strPropertyName, method);
                    applyGetterAnnotations(method);
                }
            }
            for (Field field : cls.getFields()) {
                if (shouldIncludeField(field)) {
                    addProperty(propertyName(field));
                    applyFieldAnnotations(field);
                }
            }
            HashMap map = new HashMap();
            Class<T> superclass = cls;
            do {
                for (Method method2 : superclass.getDeclaredMethods()) {
                    if (shouldIncludeSetter(method2)) {
                        String strPropertyName2 = propertyName(method2);
                        String str = this.properties.get(strPropertyName2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(strPropertyName2)) {
                                throw new RuntimeException("Found setter on " + superclass.getName() + " with invalid case-sensitive name: " + method2.getName());
                            }
                            if (method2.isBridge()) {
                                map.put(strPropertyName2, method2);
                            } else {
                                Method method3 = this.setters.get(strPropertyName2);
                                Method method4 = (Method) map.get(strPropertyName2);
                                if (method3 == null) {
                                    method2.setAccessible(true);
                                    this.setters.put(strPropertyName2, method2);
                                    applySetterAnnotations(method2);
                                } else if (!isSetterOverride(method2, method3) && (method4 == null || !isSetterOverride(method2, method4))) {
                                    if (superclass == cls) {
                                        throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                    }
                                    throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                                }
                            }
                        }
                    }
                }
                for (Field field2 : superclass.getDeclaredFields()) {
                    String strPropertyName3 = propertyName(field2);
                    if (this.properties.containsKey(strPropertyName3.toLowerCase(Locale.US)) && !this.fields.containsKey(strPropertyName3)) {
                        field2.setAccessible(true);
                        this.fields.put(strPropertyName3, field2);
                        applyFieldAnnotations(field2);
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    break;
                }
            } while (!superclass.equals(Object.class));
            if (this.properties.isEmpty()) {
                throw new RuntimeException("No properties to serialize found on class ".concat(cls.getName()));
            }
            for (String str2 : this.documentIdPropertyNames) {
                if (!this.setters.containsKey(str2) && !this.fields.containsKey(str2)) {
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("@DocumentId is annotated on property ", str2, " of class ");
                    sbOooO0o0.append(cls.getName());
                    sbOooO0o0.append(" but no field or public setter was found");
                    throw new RuntimeException(sbOooO0o0.toString());
                }
            }
        }

        private void addProperty(String str) {
            Map<String, String> map = this.properties;
            Locale locale = Locale.US;
            String strPut = map.put(str.toLowerCase(locale), str);
            if (strPut == null || str.equals(strPut)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        private static String annotatedName(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(PropertyName.class)) {
                return ((PropertyName) accessibleObject.getAnnotation(PropertyName.class)).value();
            }
            return null;
        }

        private void applyFieldAnnotations(Field field) {
            if (field.isAnnotationPresent(ServerTimestamp.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != Timestamp.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.serverTimestamps.add(propertyName(field));
            }
            if (field.isAnnotationPresent(DocumentId.class)) {
                ensureValidDocumentIdType("Field", TranslateLanguage.ICELANDIC, field.getType());
                this.documentIdPropertyNames.add(propertyName(field));
            }
        }

        private void applyGetterAnnotations(Method method) {
            if (method.isAnnotationPresent(ServerTimestamp.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != Timestamp.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.serverTimestamps.add(propertyName(method));
            }
            if (method.isAnnotationPresent(DocumentId.class)) {
                ensureValidDocumentIdType("Method", "returns", method.getReturnType());
                this.documentIdPropertyNames.add(propertyName(method));
            }
        }

        private void applySetterAnnotations(Method method) {
            if (method.isAnnotationPresent(ServerTimestamp.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            }
            if (method.isAnnotationPresent(DocumentId.class)) {
                ensureValidDocumentIdType("Method", "accepts", method.getParameterTypes()[0]);
                this.documentIdPropertyNames.add(propertyName(method));
            }
        }

        private void ensureValidDocumentIdType(String str, String str2, Type type) {
            if (type == String.class || type == DocumentReference.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
        }

        private static boolean isSetterOverride(Method method, Method method2) {
            CustomClassMapper.hardAssert(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            CustomClassMapper.hardAssert(returnType.equals(cls), "Expected void return type");
            CustomClassMapper.hardAssert(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            CustomClassMapper.hardAssert(parameterTypes.length == 1, "Expected exactly one parameter");
            CustomClassMapper.hardAssert(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        private void populateDocumentIdProperties(Map<TypeVariable<Class<T>>, Type> map, DeserializeContext deserializeContext, T t, HashSet<String> hashSet) {
            for (String str : this.documentIdPropertyNames) {
                if (hashSet.contains(str)) {
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("'", str, "' was found from document ");
                    sbOooO0o0.append(deserializeContext.documentRef.getPath());
                    sbOooO0o0.append(", cannot apply @DocumentId on this property for class ");
                    sbOooO0o0.append(this.clazz.getName());
                    throw new RuntimeException(sbOooO0o0.toString());
                }
                ErrorPath errorPathChild = deserializeContext.errorPath.child(str);
                if (this.setters.containsKey(str)) {
                    Method method = this.setters.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw CustomClassMapper.deserializeError(errorPathChild, "Setter does not have exactly one parameter");
                    }
                    if (resolveType(genericParameterTypes[0], map) == String.class) {
                        ApiUtil.invoke(method, t, deserializeContext.documentRef.getId());
                    } else {
                        ApiUtil.invoke(method, t, deserializeContext.documentRef);
                    }
                } else {
                    Field field = this.fields.get(str);
                    try {
                        if (field.getType() == String.class) {
                            field.set(t, deserializeContext.documentRef.getId());
                        } else {
                            field.set(t, deserializeContext.documentRef);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String propertyName(Field field) {
            String strAnnotatedName = annotatedName(field);
            return strAnnotatedName != null ? strAnnotatedName : field.getName();
        }

        private Type resolveType(Type type, Map<TypeVariable<Class<T>>, Type> map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Could not resolve type ", type));
        }

        private static String serializedName(String str) {
            String[] strArr = {"get", "set", TranslateLanguage.ICELANDIC};
            String str2 = null;
            for (int i = 0; i < 3; i++) {
                String str3 = strArr[i];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown Bean prefix for method: ", str));
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
                charArray[i2] = Character.toLowerCase(charArray[i2]);
            }
            return new String(charArray);
        }

        private static boolean shouldIncludeField(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(Exclude.class)) ? false : true;
        }

        private static boolean shouldIncludeGetter(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith(TranslateLanguage.ICELANDIC)) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isBridge() || method.isAnnotationPresent(Exclude.class)) ? false : true;
        }

        private static boolean shouldIncludeSetter(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(Exclude.class);
        }

        public T deserialize(Map<String, Object> map, DeserializeContext deserializeContext) {
            return deserialize(map, Collections.EMPTY_MAP, deserializeContext);
        }

        public Map<String, Object> serialize(T t, ErrorPath errorPath) {
            Object objInvoke;
            if (!this.clazz.isAssignableFrom(t.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + t.getClass() + " with BeanMapper for class " + this.clazz);
            }
            HashMap map = new HashMap();
            for (String str : this.properties.values()) {
                if (!this.documentIdPropertyNames.contains(str)) {
                    if (this.getters.containsKey(str)) {
                        objInvoke = ApiUtil.invoke(this.getters.get(str), t, new Object[0]);
                    } else {
                        Field field = this.fields.get(str);
                        if (field == null) {
                            throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Bean property without field or getter: ", str));
                        }
                        try {
                            objInvoke = field.get(t);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    map.put(str, (this.serverTimestamps.contains(str) && objInvoke == null) ? FieldValue.serverTimestamp() : CustomClassMapper.serialize(objInvoke, errorPath.child(str)));
                }
            }
            return map;
        }

        public T deserialize(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2, DeserializeContext deserializeContext) {
            Constructor<T> constructor = this.constructor;
            if (constructor == null) {
                throw CustomClassMapper.deserializeError(deserializeContext.errorPath, "Class " + this.clazz.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped");
            }
            T t = (T) ApiUtil.newInstance(constructor);
            HashSet<String> hashSet = new HashSet<>();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                ErrorPath errorPathChild = deserializeContext.errorPath.child(key);
                if (this.setters.containsKey(key)) {
                    Method method = this.setters.get(key);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw CustomClassMapper.deserializeError(errorPathChild, "Setter does not have exactly one parameter");
                    }
                    ApiUtil.invoke(method, t, CustomClassMapper.deserializeToType(entry.getValue(), resolveType(genericParameterTypes[0], map2), deserializeContext.newInstanceWithErrorPath(errorPathChild)));
                    hashSet.add(key);
                } else if (this.fields.containsKey(key)) {
                    Field field = this.fields.get(key);
                    try {
                        field.set(t, CustomClassMapper.deserializeToType(entry.getValue(), resolveType(field.getGenericType(), map2), deserializeContext.newInstanceWithErrorPath(errorPathChild)));
                        hashSet.add(key);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("No setter/field for ", key, " found on class ");
                    sbOooO0o0.append(this.clazz.getName());
                    String string = sbOooO0o0.toString();
                    if (this.properties.containsKey(key.toLowerCase(Locale.US))) {
                        string = C21111o0ooOoO.OooO0Oo(string, " (fields/setters are case sensitive!)");
                    }
                    if (this.throwOnUnknownProperties) {
                        throw new RuntimeException(string);
                    }
                    if (this.warnOnUnknownProperties) {
                        Logger.warn("CustomClassMapper", "%s", string);
                    }
                }
            }
            populateDocumentIdProperties(map2, deserializeContext, t, hashSet);
            return t;
        }

        private static String propertyName(Method method) {
            String strAnnotatedName = annotatedName(method);
            return strAnnotatedName != null ? strAnnotatedName : serializedName(method.getName());
        }
    }

    public static class DeserializeContext {
        final DocumentReference documentRef;
        final ErrorPath errorPath;

        public DeserializeContext(ErrorPath errorPath, DocumentReference documentReference) {
            this.errorPath = errorPath;
            this.documentRef = documentReference;
        }

        public DeserializeContext newInstanceWithErrorPath(ErrorPath errorPath) {
            return new DeserializeContext(errorPath, this.documentRef);
        }
    }

    public static class ErrorPath {
        static final ErrorPath EMPTY = new ErrorPath(null, null, 0);
        private final int length;
        private final String name;
        private final ErrorPath parent;

        public ErrorPath(ErrorPath errorPath, String str, int i) {
            this.parent = errorPath;
            this.name = str;
            this.length = i;
        }

        public ErrorPath child(String str) {
            return new ErrorPath(this, str, this.length + 1);
        }

        public int getLength() {
            return this.length;
        }

        public String toString() {
            int i = this.length;
            if (i == 0) {
                return "";
            }
            if (i == 1) {
                return this.name;
            }
            return this.parent.toString() + "." + this.name;
        }
    }

    private static <T> T convertBean(Object obj, Class<T> cls, DeserializeContext deserializeContext) {
        BeanMapper beanMapperLoadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
        if (obj instanceof Map) {
            return (T) beanMapperLoadOrCreateBeanMapperForClass.deserialize(expectMap(obj, deserializeContext), deserializeContext);
        }
        throw deserializeError(deserializeContext.errorPath, "Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
    }

    private static Blob convertBlob(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Blob) {
            return (Blob) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to Blob");
    }

    private static Boolean convertBoolean(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to boolean");
    }

    private static Date convertDate(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Timestamp) {
            return ((Timestamp) obj).toDate();
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to Date");
    }

    private static DocumentReference convertDocumentReference(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof DocumentReference) {
            return (DocumentReference) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to DocumentReference");
    }

    private static Double convertDouble(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Long) {
            Long l = (Long) obj;
            Double dValueOf = Double.valueOf(l.doubleValue());
            if (dValueOf.longValue() == l.longValue()) {
                return dValueOf;
            }
            throw deserializeError(deserializeContext.errorPath, C20485OooOoO.OooO0O0("Loss of precision while converting number to double: ", obj, ". Did you mean to use a 64-bit long instead?"));
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert a value of type " + obj.getClass().getName() + " to double");
    }

    private static GeoPoint convertGeoPoint(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof GeoPoint) {
            return (GeoPoint) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to GeoPoint");
    }

    private static Integer convertInteger(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            throw deserializeError(deserializeContext.errorPath, "Failed to convert a value of type " + obj.getClass().getName() + " to int");
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
            return Integer.valueOf(number.intValue());
        }
        throw deserializeError(deserializeContext.errorPath, "Numeric value out of 32-bit integer range: " + dDoubleValue + ". Did you mean to use a long or double instead of an int?");
    }

    private static Long convertLong(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw deserializeError(deserializeContext.errorPath, "Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d = (Double) obj;
        if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d.longValue());
        }
        throw deserializeError(deserializeContext.errorPath, "Numeric value out of 64-bit long range: " + d + ". Did you mean to use a double instead of a long?");
    }

    private static String convertString(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof String) {
            return (String) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to String");
    }

    private static Timestamp convertTimestamp(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp((Date) obj);
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to Timestamp");
    }

    public static <T> T convertToCustomClass(Object obj, Class<T> cls, DocumentReference documentReference) {
        return (T) deserializeToClass(obj, cls, new DeserializeContext(ErrorPath.EMPTY, documentReference));
    }

    public static Object convertToPlainJavaTypes(Object obj) {
        return serialize(obj);
    }

    private static VectorValue convertVectorValue(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof VectorValue) {
            return (VectorValue) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Failed to convert value of type " + obj.getClass().getName() + " to VectorValue");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException deserializeError(ErrorPath errorPath, String str) {
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Could not deserialize object. ", str);
        if (errorPath.getLength() > 0) {
            strOooO00o = androidx.concurrent.futures.OooO00o.OooO0OO(C22226Oooo0oo.OooO0OO(strOooO00o, " (found in field '"), errorPath.toString(), "')");
        }
        return new RuntimeException(strOooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T deserializeToClass(Object obj, Class<T> cls, DeserializeContext deserializeContext) {
        if (obj == 0) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            return (T) deserializeToPrimitive(obj, cls, deserializeContext);
        }
        if (String.class.isAssignableFrom(cls)) {
            return (T) convertString(obj, deserializeContext);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return (T) convertDate(obj, deserializeContext);
        }
        if (Timestamp.class.isAssignableFrom(cls)) {
            return (T) convertTimestamp(obj, deserializeContext);
        }
        if (Blob.class.isAssignableFrom(cls)) {
            return (T) convertBlob(obj, deserializeContext);
        }
        if (GeoPoint.class.isAssignableFrom(cls)) {
            return (T) convertGeoPoint(obj, deserializeContext);
        }
        if (DocumentReference.class.isAssignableFrom(cls)) {
            return (T) convertDocumentReference(obj, deserializeContext);
        }
        if (VectorValue.class.isAssignableFrom(cls)) {
            return (T) convertVectorValue(obj, deserializeContext);
        }
        if (cls.isArray()) {
            throw deserializeError(deserializeContext.errorPath, "Converting to Arrays is not supported, please use Lists instead");
        }
        if (cls.getTypeParameters().length <= 0) {
            return cls.equals(Object.class) ? obj : cls.isEnum() ? (T) deserializeToEnum(obj, cls, deserializeContext) : (T) convertBean(obj, cls, deserializeContext);
        }
        throw deserializeError(deserializeContext.errorPath, "Class " + cls.getName() + " has generic type parameters");
    }

    private static <T> T deserializeToEnum(Object obj, Class<T> cls, DeserializeContext deserializeContext) {
        if (!(obj instanceof String)) {
            throw deserializeError(deserializeContext.errorPath, "Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
        }
        String name = (String) obj;
        Field[] fields = cls.getFields();
        int length = fields.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Field field = fields[i];
                if (field.isEnumConstant() && name.equals(BeanMapper.propertyName(field))) {
                    name = field.getName();
                    break;
                }
                i++;
            }
        }
        try {
            return (T) Enum.valueOf(cls, name);
        } catch (IllegalArgumentException unused) {
            throw deserializeError(deserializeContext.errorPath, "Could not find enum value of " + cls.getName() + " for value \"" + name + "\"");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList] */
    private static <T> T deserializeToParameterizedType(Object obj, ParameterizedType parameterizedType, DeserializeContext deserializeContext) {
        Class cls = (Class) parameterizedType.getRawType();
        int i = 0;
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw deserializeError(deserializeContext.errorPath, "Expected a List, but got a " + obj.getClass());
            }
            List list = (List) obj;
            ?? r0 = (T) new ArrayList(list.size());
            while (i < list.size()) {
                r0.add(deserializeToType(list.get(i), type, deserializeContext.newInstanceWithErrorPath(deserializeContext.errorPath.child(o0Oo0oo.OooO0O0(i, "[", "]")))));
                i++;
            }
            return r0;
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (!type2.equals(String.class)) {
                throw deserializeError(deserializeContext.errorPath, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Only Maps with string keys are supported, but found Map with key type ", type2));
            }
            Map<String, Object> mapExpectMap = expectMap(obj, deserializeContext);
            ?? r02 = (T) new HashMap();
            for (Map.Entry<String, Object> entry : mapExpectMap.entrySet()) {
                r02.put(entry.getKey(), deserializeToType(entry.getValue(), type3, deserializeContext.newInstanceWithErrorPath(deserializeContext.errorPath.child(entry.getKey()))));
            }
            return r02;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw deserializeError(deserializeContext.errorPath, "Collections are not supported, please use Lists instead");
        }
        Map<String, Object> mapExpectMap2 = expectMap(obj, deserializeContext);
        BeanMapper beanMapperLoadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
        HashMap map = new HashMap();
        TypeVariable<Class<T>>[] typeParameters = beanMapperLoadOrCreateBeanMapperForClass.clazz.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        while (i < typeParameters.length) {
            map.put(typeParameters[i], actualTypeArguments[i]);
            i++;
        }
        return (T) beanMapperLoadOrCreateBeanMapperForClass.deserialize(mapExpectMap2, map, deserializeContext);
    }

    private static <T> T deserializeToPrimitive(Object obj, Class<T> cls, DeserializeContext deserializeContext) {
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            return (T) convertInteger(obj, deserializeContext);
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            return (T) convertBoolean(obj, deserializeContext);
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return (T) convertDouble(obj, deserializeContext);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            return (T) convertLong(obj, deserializeContext);
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return (T) Float.valueOf(convertDouble(obj, deserializeContext).floatValue());
        }
        throw deserializeError(deserializeContext.errorPath, C20593OooO0Oo.OooO0O0("Deserializing values to ", cls.getSimpleName(), " is not supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T deserializeToType(Object obj, Type type, DeserializeContext deserializeContext) {
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return (T) deserializeToParameterizedType(obj, (ParameterizedType) type, deserializeContext);
        }
        if (type instanceof Class) {
            return (T) deserializeToClass(obj, (Class) type, deserializeContext);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length > 0) {
                throw deserializeError(deserializeContext.errorPath, "Generic lower-bounded wildcard types are not supported");
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            hardAssert(upperBounds.length > 0, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Unexpected type bounds on wildcard ", type));
            return (T) deserializeToType(obj, upperBounds[0], deserializeContext);
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            hardAssert(bounds.length > 0, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Unexpected type bounds on type variable ", type));
            return (T) deserializeToType(obj, bounds[0], deserializeContext);
        }
        if (type instanceof GenericArrayType) {
            throw deserializeError(deserializeContext.errorPath, "Generic Arrays are not supported, please use Lists instead");
        }
        throw deserializeError(deserializeContext.errorPath, com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("Unknown type encountered: ", type));
    }

    private static Map<String, Object> expectMap(Object obj, DeserializeContext deserializeContext) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw deserializeError(deserializeContext.errorPath, "Expected a Map while deserializing, but got a " + obj.getClass());
    }

    private static void hardAssert(boolean z) {
        hardAssert(z, "Internal inconsistency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> BeanMapper<T> loadOrCreateBeanMapperForClass(Class<T> cls) {
        ConcurrentMap<Class<?>, BeanMapper<?>> concurrentMap = mappers;
        BeanMapper<T> beanMapper = (BeanMapper) concurrentMap.get(cls);
        if (beanMapper != null) {
            return beanMapper;
        }
        BeanMapper<T> beanMapper2 = (BeanMapper<T>) new BeanMapper(cls);
        concurrentMap.put((Class<?>) cls, (BeanMapper<?>) beanMapper2);
        return beanMapper2;
    }

    private static <T> Object serialize(T t) {
        return serialize(t, ErrorPath.EMPTY);
    }

    private static IllegalArgumentException serializeError(ErrorPath errorPath, String str) {
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Could not serialize object. ", str);
        if (errorPath.getLength() > 0) {
            strOooO00o = androidx.concurrent.futures.OooO00o.OooO0OO(C22226Oooo0oo.OooO0OO(strOooO00o, " (found in field '"), errorPath.toString(), "')");
        }
        return new IllegalArgumentException(strOooO00o);
    }

    public static Map<String, Object> convertToPlainJavaTypes(Map<?, Object> map) {
        Object objSerialize = serialize(map);
        hardAssert(objSerialize instanceof Map);
        return (Map) objSerialize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hardAssert(boolean z, String str) {
        if (!z) {
            throw new RuntimeException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Hard assert failed: ", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Object serialize(T t, ErrorPath errorPath) {
        if (errorPath.getLength() > 500) {
            throw serializeError(errorPath, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (t == 0) {
            return null;
        }
        if (t instanceof Number) {
            if ((t instanceof Long) || (t instanceof Integer) || (t instanceof Double) || (t instanceof Float)) {
                return t;
            }
            throw serializeError(errorPath, C20593OooO0Oo.OooO0O0("Numbers of type ", t.getClass().getSimpleName(), " are not supported, please use an int, long, float or double"));
        }
        if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        }
        if (t instanceof Character) {
            throw serializeError(errorPath, "Characters are not supported, please use Strings");
        }
        if (t instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw serializeError(errorPath, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                map.put(str, serialize(entry.getValue(), errorPath.child(str)));
            }
            return map;
        }
        if (!(t instanceof Collection)) {
            if (t.getClass().isArray()) {
                throw serializeError(errorPath, "Serializing Arrays is not supported, please use Lists instead");
            }
            if (!(t instanceof Enum)) {
                return ((t instanceof Date) || (t instanceof Timestamp) || (t instanceof GeoPoint) || (t instanceof Blob) || (t instanceof DocumentReference) || (t instanceof FieldValue) || (t instanceof VectorValue)) ? t : ((t instanceof Uri) || (t instanceof URI) || (t instanceof URL)) ? t.toString() : loadOrCreateBeanMapperForClass(t.getClass()).serialize(t, errorPath);
            }
            String strName = ((Enum) t).name();
            try {
                return BeanMapper.propertyName(t.getClass().getField(strName));
            } catch (NoSuchFieldException unused) {
                return strName;
            }
        }
        if (!(t instanceof List)) {
            throw serializeError(errorPath, "Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) t;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(serialize(list.get(i), errorPath.child(o0Oo0oo.OooO0O0(i, "[", "]"))));
        }
        return arrayList;
    }
}
