package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.ArrayValueMap;
import com.huawei.cloud.base.util.Charsets;
import com.huawei.cloud.base.util.ClassInfo;
import com.huawei.cloud.base.util.Data;
import com.huawei.cloud.base.util.FieldInfo;
import com.huawei.cloud.base.util.GenericData;
import com.huawei.cloud.base.util.ObjectParser;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.Throwables;
import com.huawei.cloud.base.util.Types;
import com.huawei.cloud.base.util.escape.CharEscapers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class UrlEncodedParser implements ObjectParser {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String MEDIA_TYPE = new HttpMediaType("application/x-www-form-urlencoded").setCharsetParameter(Charsets.UTF_8).build();

    public static void parse(String str, Object obj) {
        if (str == null) {
            return;
        }
        try {
            parse(new StringReader(str), obj);
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    private static void parseFieldInfo(Object obj, List<Type> list, ArrayValueMap arrayValueMap, FieldInfo fieldInfo, String str) {
        Type typeResolveWildcardTypeOrTypeVariable = Data.resolveWildcardTypeOrTypeVariable(list, fieldInfo.getGenericType());
        if (Types.isArray(typeResolveWildcardTypeOrTypeVariable)) {
            Class<?> rawArrayComponentType = Types.getRawArrayComponentType(list, Types.getArrayComponentType(typeResolveWildcardTypeOrTypeVariable));
            arrayValueMap.put(fieldInfo.getField(), rawArrayComponentType, parseValue(rawArrayComponentType, list, str));
        } else {
            if (!Types.isAssignableToOrFrom(Types.getRawArrayComponentType(list, typeResolveWildcardTypeOrTypeVariable), Iterable.class)) {
                fieldInfo.setValue(obj, parseValue(typeResolveWildcardTypeOrTypeVariable, list, str));
                return;
            }
            Collection<Object> collectionNewCollectionInstance = (Collection) fieldInfo.getValue(obj);
            if (collectionNewCollectionInstance == null) {
                collectionNewCollectionInstance = Data.newCollectionInstance(typeResolveWildcardTypeOrTypeVariable);
                fieldInfo.setValue(obj, collectionNewCollectionInstance);
            }
            collectionNewCollectionInstance.add(parseValue(typeResolveWildcardTypeOrTypeVariable == Object.class ? null : Types.getIterableParameter(typeResolveWildcardTypeOrTypeVariable), list, str));
        }
    }

    private static Object parseValue(Type type, List<Type> list, String str) {
        return Data.parsePrimitiveValue(Data.resolveWildcardTypeOrTypeVariable(list, type), str);
    }

    private static void parseValuesIntoMap(GenericData genericData, Map<Object, Object> map, ArrayList<String> arrayList, String str, String str2) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            if (genericData != null) {
                genericData.set(str, arrayList);
            } else {
                map.put(str, arrayList);
            }
        }
        arrayList.add(str2);
    }

    @Override // com.huawei.cloud.base.util.ObjectParser
    public <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) parseAndClose((Reader) new InputStreamReader(inputStream, charset), (Class) cls);
    }

    public static void parse(Reader reader, Object obj) throws IOException {
        int i;
        Class<?> cls = obj.getClass();
        ClassInfo classInfoM75684of = ClassInfo.m75684of(cls);
        List listAsList = Arrays.asList(cls);
        GenericData genericData = GenericData.class.isAssignableFrom(cls) ? (GenericData) obj : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj : null;
        ArrayValueMap arrayValueMap = new ArrayValueMap(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z = true;
            while (true) {
                i = reader.read();
                if (i == -1 || i == 38) {
                    break;
                }
                if (i != 61) {
                    if (z) {
                        stringWriter.write(i);
                    } else {
                        stringWriter2.write(i);
                    }
                } else if (z) {
                    z = false;
                } else {
                    stringWriter2.write(i);
                }
            }
            String strDecodeUri = CharEscapers.decodeUri(stringWriter.toString());
            if (strDecodeUri.length() != 0) {
                String strDecodeUri2 = CharEscapers.decodeUri(stringWriter2.toString());
                FieldInfo fieldInfo = classInfoM75684of.getFieldInfo(strDecodeUri);
                if (fieldInfo != null) {
                    parseFieldInfo(obj, listAsList, arrayValueMap, fieldInfo, strDecodeUri2);
                } else if (map != null) {
                    parseValuesIntoMap(genericData, map, (ArrayList) map.get(strDecodeUri), strDecodeUri, strDecodeUri2);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (i != -1);
        arrayValueMap.setValues();
    }

    @Override // com.huawei.cloud.base.util.ObjectParser
    public Object parseAndClose(InputStream inputStream, Charset charset, Type type) throws IOException {
        return parseAndClose(new InputStreamReader(inputStream, charset), type);
    }

    @Override // com.huawei.cloud.base.util.ObjectParser
    public <T> T parseAndClose(Reader reader, Class<T> cls) throws IOException {
        return (T) parseAndClose(reader, (Type) cls);
    }

    @Override // com.huawei.cloud.base.util.ObjectParser
    public Object parseAndClose(Reader reader, Type type) throws IOException {
        Preconditions.checkArgument(type instanceof Class, "dataType has to be of type Class<?>");
        Object objNewInstance = Types.newInstance((Class) type);
        parse(new BufferedReader(reader), objNewInstance);
        return objNewInstance;
    }
}
