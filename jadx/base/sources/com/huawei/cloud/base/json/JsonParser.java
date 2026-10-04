package com.huawei.cloud.base.json;

import com.aspose.slides.internal.p097e0.OooO0O0;
import com.aspose.words.TableStyleOptions;
import com.huawei.cloud.base.json.JsonPolymorphicTypeMap;
import com.huawei.cloud.base.util.ClassInfo;
import com.huawei.cloud.base.util.Data;
import com.huawei.cloud.base.util.FieldInfo;
import com.huawei.cloud.base.util.GenericData;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.Types;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes8.dex */
public abstract class JsonParser {
    private static final Lock lock = new ReentrantLock();
    private static WeakHashMap<Class<?>, Field> cachedTypemapFields = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.huawei.cloud.base.json.JsonParser$1 */
    public static /* synthetic */ class C176861 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$cloud$base$json$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$huawei$cloud$base$json$JsonToken = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.END_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.END_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$huawei$cloud$base$json$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static Field getCachedTypemapFieldFor(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock2 = lock;
        lock2.lock();
        try {
            if (cachedTypemapFields.containsKey(cls)) {
                Field field2 = cachedTypemapFields.get(cls);
                lock2.unlock();
                return field2;
            }
            Iterator<FieldInfo> it = ClassInfo.m75684of(cls).getFieldInfos().iterator();
            while (it.hasNext()) {
                Field field3 = it.next().getField();
                JsonPolymorphicTypeMap jsonPolymorphicTypeMap = (JsonPolymorphicTypeMap) field3.getAnnotation(JsonPolymorphicTypeMap.class);
                if (jsonPolymorphicTypeMap != null) {
                    boolean z = true;
                    Preconditions.checkArgument(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    Preconditions.checkArgument(Data.isPrimitive(field3.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, field3.getType());
                    JsonPolymorphicTypeMap.TypeDef[] typeDefArrTypeDefinitions = jsonPolymorphicTypeMap.typeDefinitions();
                    HashSet hashSet = new HashSet();
                    if (typeDefArrTypeDefinitions.length <= 0) {
                        z = false;
                    }
                    Preconditions.checkArgument(z, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (JsonPolymorphicTypeMap.TypeDef typeDef : typeDefArrTypeDefinitions) {
                        Preconditions.checkArgument(hashSet.add(typeDef.key()), "Class contains two @TypeDef annotations with identical key: %s", typeDef.key());
                    }
                    field = field3;
                }
            }
            cachedTypemapFields.put(cls, field);
            return field;
        } finally {
            lock.unlock();
        }
    }

    private Object getObjectInstance(Field field, Object obj, CustomizeJsonParser customizeJsonParser, boolean z, Class<?> cls) {
        Object objNewInstanceForObject = (cls == null || customizeJsonParser == null) ? null : customizeJsonParser.newInstanceForObject(obj, cls);
        return field != null ? new GenericJson() : objNewInstanceForObject == null ? (z || cls == null) ? Data.newMapInstance(cls) : Types.newInstance(cls) : objNewInstanceForObject;
    }

    private Object parseArrayValue(Field field, Type type, ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser, Class<?> cls) throws IOException {
        boolean zIsArray = Types.isArray(type);
        Preconditions.checkArgument(type == null || zIsArray || (cls != null && Types.isAssignableToOrFrom(cls, Collection.class)), "expected collection or array type but got %s", type);
        Type iterableParameter = null;
        Collection<Object> collectionNewInstanceForArray = (customizeJsonParser == null || field == null) ? null : customizeJsonParser.newInstanceForArray(obj, field);
        if (collectionNewInstanceForArray == null) {
            collectionNewInstanceForArray = Data.newCollectionInstance(type);
        }
        Collection<Object> collection = collectionNewInstanceForArray;
        if (zIsArray) {
            iterableParameter = Types.getArrayComponentType(type);
        } else if (cls != null && Iterable.class.isAssignableFrom(cls)) {
            iterableParameter = Types.getIterableParameter(type);
        }
        Type typeResolveWildcardTypeOrTypeVariable = Data.resolveWildcardTypeOrTypeVariable(arrayList, iterableParameter);
        parseArray(field, collection, typeResolveWildcardTypeOrTypeVariable, arrayList, customizeJsonParser);
        return zIsArray ? Types.toArray(collection, Types.getRawArrayComponentType(arrayList, typeResolveWildcardTypeOrTypeVariable)) : collection;
    }

    private void parseMap(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) throws IOException {
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        while (jsonTokenStartParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser != null && customizeJsonParser.stopAt(map, text)) {
                return;
            }
            Field field2 = field;
            map.put(text, parseValue(field2, type, arrayList, map, customizeJsonParser, true));
            jsonTokenStartParsingObjectOrArray = nextToken();
            field = field2;
        }
    }

    private Object parseNullValue(ArrayList<Type> arrayList, Type type, Class<?> cls) {
        Preconditions.checkArgument(cls == null || !cls.isPrimitive(), "primitive number field but found a JSON null");
        if (cls != null && (cls.getModifiers() & TableStyleOptions.DEFAULT_2003) != 0) {
            if (Types.isAssignableToOrFrom(cls, Collection.class)) {
                return Data.nullOf(Data.newCollectionInstance(type).getClass());
            }
            if (Types.isAssignableToOrFrom(cls, Map.class)) {
                return Data.nullOf(Data.newMapInstance(cls).getClass());
            }
        }
        return Data.nullOf(Types.getRawArrayComponentType(arrayList, type));
    }

    private Object parseNumberFloatValue(Type type, Class<?> cls) throws IOException {
        if (cls == null || cls.isAssignableFrom(BigDecimal.class)) {
            return getDecimalValue();
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return Double.valueOf(getDoubleValue());
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(getFloatValue());
        }
        throw new IllegalArgumentException(OooO0O0.OooO0O0("expected numeric type but got ", type));
    }

    private Object parseNumberValue(Field field, Type type, Class<?> cls) throws IOException {
        Preconditions.checkArgument(field == null || field.getAnnotation(JsonString.class) == null, "number type formatted as a JSON number cannot use @JsonString annotation");
        return cls == BigInteger.class ? getBigIntegerValue() : (cls == Byte.class || cls == Byte.TYPE) ? Byte.valueOf(getByteValue()) : (cls == Long.class || cls == Long.TYPE) ? Long.valueOf(getLongValue()) : (cls == Integer.class || cls == Integer.TYPE) ? Integer.valueOf(getIntValue()) : (cls == Short.class || cls == Short.TYPE) ? Short.valueOf(getShortValue()) : parseNumberFloatValue(type, cls);
    }

    private Object parseObjectValue(Field field, Type type, ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser, boolean z, Class<?> cls) throws IOException {
        Preconditions.checkArgument(!Types.isArray(type), "expected object or map type but got %s", type);
        Class<?> clsRef = null;
        Field cachedTypemapFieldFor = z ? getCachedTypemapFieldFor(cls) : null;
        boolean z2 = cls != null && Types.isAssignableToOrFrom(cls, Map.class);
        Object objectInstance = getObjectInstance(cachedTypemapFieldFor, obj, customizeJsonParser, z2, cls);
        boolean z3 = z2;
        int size = arrayList.size();
        if (type != null) {
            arrayList.add(type);
        }
        if (z3 && !GenericData.class.isAssignableFrom(cls)) {
            Type mapValueParameter = Map.class.isAssignableFrom(cls) ? Types.getMapValueParameter(type) : null;
            if (mapValueParameter != null) {
                parseMap(field, (Map) objectInstance, mapValueParameter, arrayList, customizeJsonParser);
                return objectInstance;
            }
        }
        parse(arrayList, objectInstance, customizeJsonParser);
        if (type != null) {
            arrayList.remove(size);
        }
        if (cachedTypemapFieldFor == null) {
            return objectInstance;
        }
        Object obj2 = ((GenericJson) objectInstance).get(cachedTypemapFieldFor.getName());
        Preconditions.checkArgument(obj2 != null, "No value specified for @JsonPolymorphicTypeMap field");
        String string = obj2.toString();
        JsonPolymorphicTypeMap.TypeDef[] typeDefArrTypeDefinitions = ((JsonPolymorphicTypeMap) cachedTypemapFieldFor.getAnnotation(JsonPolymorphicTypeMap.class)).typeDefinitions();
        int length = typeDefArrTypeDefinitions.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            JsonPolymorphicTypeMap.TypeDef typeDef = typeDefArrTypeDefinitions[i];
            if (typeDef.key().equals(string)) {
                clsRef = typeDef.ref();
                break;
            }
            i++;
        }
        Preconditions.checkArgument(clsRef != null, "No TypeDef annotation found with key: " + string);
        JsonFactory factory = getFactory();
        JsonParser jsonParserCreateJsonParser = factory.createJsonParser(factory.toString(objectInstance));
        jsonParserCreateJsonParser.startParsing();
        return jsonParserCreateJsonParser.parseValue(field, clsRef, arrayList, null, null, false);
    }

    private Object parseStringValue(Field field, Type type, Class<?> cls) throws IOException {
        String lowerCase = getText().trim().toLowerCase(Locale.US);
        if ((cls != Float.TYPE && cls != Float.class && cls != Double.TYPE && cls != Double.class) || (!lowerCase.equals("nan") && !lowerCase.equals("infinity") && !lowerCase.equals("-infinity"))) {
            Preconditions.checkArgument((cls != null && Number.class.isAssignableFrom(cls) && (field == null || field.getAnnotation(JsonString.class) == null)) ? false : true, "number field formatted as a JSON string must use the @JsonString annotation");
        }
        return Data.parsePrimitiveValue(type, getText());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object parseValue(Field field, Type type, ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser, boolean z) throws IOException {
        ?? Ordinal;
        IllegalArgumentException illegalArgumentException;
        ?? r2;
        String currentName;
        int[] iArr;
        Type typeResolveWildcardTypeOrTypeVariable = Data.resolveWildcardTypeOrTypeVariable(arrayList, type);
        Class<?> rawClass = typeResolveWildcardTypeOrTypeVariable instanceof Class ? (Class) typeResolveWildcardTypeOrTypeVariable : null;
        if (typeResolveWildcardTypeOrTypeVariable instanceof ParameterizedType) {
            rawClass = Types.getRawClass((ParameterizedType) typeResolveWildcardTypeOrTypeVariable);
        }
        Class<?> cls = rawClass;
        if (cls == Void.class) {
            skipChildren();
            return null;
        }
        JsonToken currentToken = getCurrentToken();
        try {
            iArr = C176861.$SwitchMap$com$huawei$cloud$base$json$JsonToken;
            Ordinal = getCurrentToken().ordinal();
        } catch (IllegalArgumentException e) {
            e = e;
            Ordinal = field;
        }
        try {
            try {
                switch (iArr[Ordinal]) {
                    case 1:
                    case 4:
                    case 5:
                        return parseObjectValue(field, typeResolveWildcardTypeOrTypeVariable, arrayList, obj, customizeJsonParser, z, cls);
                    case 2:
                    case 3:
                        return parseArrayValue(field, typeResolveWildcardTypeOrTypeVariable, arrayList, obj, customizeJsonParser, cls);
                    case 6:
                    case 7:
                        Preconditions.checkArgument(typeResolveWildcardTypeOrTypeVariable == null || cls == Boolean.TYPE || (cls != null && cls.isAssignableFrom(Boolean.class)), "expected type Boolean or boolean but got %s", typeResolveWildcardTypeOrTypeVariable);
                        return currentToken == JsonToken.VALUE_TRUE ? Boolean.TRUE : Boolean.FALSE;
                    case 8:
                    case 9:
                        return parseNumberValue(field, typeResolveWildcardTypeOrTypeVariable, cls);
                    case 10:
                        return parseStringValue(field, typeResolveWildcardTypeOrTypeVariable, cls);
                    case 11:
                        return parseNullValue(arrayList, typeResolveWildcardTypeOrTypeVariable, cls);
                    default:
                        throw new IllegalArgumentException("unexpected JSON node type: " + currentToken);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                illegalArgumentException = e;
                r2 = Ordinal;
                ?? sb = new StringBuilder();
                currentName = getCurrentName();
                if (currentName != null) {
                    sb.append("key ");
                    sb.append(currentName);
                }
                if (r2 != 0) {
                    if (currentName != null) {
                        sb.append(", ");
                    }
                    sb.append("field ");
                    sb.append(r2);
                }
                throw new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        } catch (IllegalArgumentException e3) {
            illegalArgumentException = e3;
            r2 = field;
            ?? sb2 = new StringBuilder();
            currentName = getCurrentName();
            if (currentName != null) {
            }
            if (r2 != 0) {
            }
            throw new IllegalArgumentException(sb2.toString(), illegalArgumentException);
        }
    }

    private JsonToken startParsing() throws IOException {
        JsonToken currentToken = getCurrentToken();
        if (currentToken == null) {
            currentToken = nextToken();
        }
        Preconditions.checkArgument(currentToken != null, "no JSON input found");
        return currentToken;
    }

    private JsonToken startParsingObjectOrArray() throws IOException {
        JsonToken jsonTokenStartParsing = startParsing();
        int i = C176861.$SwitchMap$com$huawei$cloud$base$json$JsonToken[jsonTokenStartParsing.ordinal()];
        boolean z = true;
        if (i != 1) {
            return i != 2 ? jsonTokenStartParsing : nextToken();
        }
        JsonToken jsonTokenNextToken = nextToken();
        if (jsonTokenNextToken != JsonToken.FIELD_NAME && jsonTokenNextToken != JsonToken.END_OBJECT) {
            z = false;
        }
        Preconditions.checkArgument(z, jsonTokenNextToken);
        return jsonTokenNextToken;
    }

    public abstract void close() throws IOException;

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public abstract byte getByteValue() throws IOException;

    public abstract String getCurrentName() throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public abstract JsonFactory getFactory();

    public abstract float getFloatValue() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract long getLongValue() throws IOException;

    public abstract short getShortValue() throws IOException;

    public abstract String getText() throws IOException;

    public abstract JsonToken nextToken() throws IOException;

    public final <T> T parse(Class<T> cls) throws IOException {
        return (T) parse((Class) cls, (CustomizeJsonParser) null);
    }

    public final <T> T parseAndClose(Class<T> cls) throws IOException {
        return (T) parseAndClose((Class) cls, (CustomizeJsonParser) null);
    }

    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2) throws IOException {
        return parseArray(cls, cls2, (CustomizeJsonParser) null);
    }

    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2) throws IOException {
        return parseArrayAndClose(cls, cls2, (CustomizeJsonParser) null);
    }

    public abstract JsonParser skipChildren() throws IOException;

    public final void skipToKey(String str) throws IOException {
        skipToKey(Collections.singleton(str));
    }

    public final <T> T parse(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        return (T) parse((Type) cls, false, customizeJsonParser);
    }

    public final <T> T parseAndClose(Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return (T) parse((Class) cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final <T> Collection<T> parseArray(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        Collection<T> collection = (Collection<T>) Data.newCollectionInstance(cls);
        parseArray(collection, cls2, customizeJsonParser);
        return collection;
    }

    public final <T> Collection<T> parseArrayAndClose(Class<?> cls, Class<T> cls2, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            return parseArray(cls, cls2, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final String skipToKey(Set<String> set) throws IOException {
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        while (jsonTokenStartParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (set.contains(text)) {
                return text;
            }
            skipChildren();
            jsonTokenStartParsingObjectOrArray = nextToken();
        }
        return null;
    }

    public Object parse(Type type, boolean z) throws IOException {
        return parse(type, z, (CustomizeJsonParser) null);
    }

    public Object parse(Type type, boolean z, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                startParsing();
            }
            Object value = parseValue(null, type, new ArrayList<>(), null, customizeJsonParser, true);
            if (z) {
                close();
            }
            return value;
        } finally {
        }
    }

    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls) throws IOException {
        parseArray(collection, cls, (CustomizeJsonParser) null);
    }

    public final void parseAndClose(Object obj) throws IOException {
        parseAndClose(obj, (CustomizeJsonParser) null);
    }

    public final <T> void parseArray(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        parseArray(null, collection, cls, new ArrayList<>(), customizeJsonParser);
    }

    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls) throws IOException {
        parseArrayAndClose(collection, cls, (CustomizeJsonParser) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void parseArray(Field field, Collection<T> collection, Type type, ArrayList<Type> arrayList, CustomizeJsonParser customizeJsonParser) throws IOException {
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        while (jsonTokenStartParsingObjectOrArray != JsonToken.END_ARRAY) {
            Field field2 = field;
            collection.add(parseValue(field2, type, arrayList, collection, customizeJsonParser, true));
            jsonTokenStartParsingObjectOrArray = nextToken();
            field = field2;
        }
    }

    public final void parseAndClose(Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            parse(obj, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final <T> void parseArrayAndClose(Collection<? super T> collection, Class<T> cls, CustomizeJsonParser customizeJsonParser) throws IOException {
        try {
            parseArray(collection, cls, customizeJsonParser);
        } finally {
            close();
        }
    }

    public final void parse(Object obj) throws IOException {
        parse(obj, (CustomizeJsonParser) null);
    }

    public final void parse(Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        ArrayList<Type> arrayList = new ArrayList<>();
        arrayList.add(obj.getClass());
        parse(arrayList, obj, customizeJsonParser);
    }

    private void parse(ArrayList<Type> arrayList, Object obj, CustomizeJsonParser customizeJsonParser) throws IOException {
        if (obj instanceof GenericJson) {
            ((GenericJson) obj).setFactory(getFactory());
        }
        JsonToken jsonTokenStartParsingObjectOrArray = startParsingObjectOrArray();
        Class<?> cls = obj.getClass();
        ClassInfo classInfoM75684of = ClassInfo.m75684of(cls);
        boolean zIsAssignableFrom = GenericData.class.isAssignableFrom(cls);
        if (!zIsAssignableFrom && Map.class.isAssignableFrom(cls)) {
            parseMap(null, (Map) obj, Types.getMapValueParameter(cls), arrayList, customizeJsonParser);
            return;
        }
        while (jsonTokenStartParsingObjectOrArray == JsonToken.FIELD_NAME) {
            String text = getText();
            nextToken();
            if (customizeJsonParser != null && customizeJsonParser.stopAt(obj, text)) {
                return;
            }
            FieldInfo fieldInfo = classInfoM75684of.getFieldInfo(text);
            if (fieldInfo != null) {
                if (fieldInfo.isFinal() && !fieldInfo.isPrimitive()) {
                    throw new IllegalArgumentException("final array/object fields are not supported");
                }
                Field field = fieldInfo.getField();
                int size = arrayList.size();
                arrayList.add(field.getGenericType());
                Object value = parseValue(field, fieldInfo.getGenericType(), arrayList, obj, customizeJsonParser, true);
                arrayList.remove(size);
                fieldInfo.setValue(obj, value);
            } else if (zIsAssignableFrom) {
                ((GenericData) obj).set(text, parseValue(null, null, arrayList, obj, customizeJsonParser, true));
            } else {
                if (customizeJsonParser != null) {
                    customizeJsonParser.handleUnrecognizedKey(obj, text);
                }
                skipChildren();
            }
            jsonTokenStartParsingObjectOrArray = nextToken();
        }
    }
}
