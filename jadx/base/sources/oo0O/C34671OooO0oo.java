package oo0O;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.alipay.C18955b;

/* JADX INFO: renamed from: oo0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34671OooO0oo implements InterfaceC34663OooO, InterfaceC34672OooOO0 {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        r0 = new java.util.concurrent.ConcurrentHashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        r0 = new java.util.TreeMap();
     */
    @Override // oo0O.InterfaceC34663OooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Object obj, Type type) {
        Map properties;
        if (!obj.getClass().equals(C18955b.class)) {
            return null;
        }
        C18955b c18955b = (C18955b) obj;
        Type rawType = type;
        while (true) {
            if (rawType == Properties.class) {
                properties = new Properties();
                break;
            }
            if (rawType == Hashtable.class) {
                properties = new Hashtable();
                break;
            }
            if (rawType == IdentityHashMap.class) {
                properties = new IdentityHashMap();
                break;
            }
            if (rawType == SortedMap.class || rawType == TreeMap.class) {
                break;
            }
            if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                break;
            }
            if (rawType == Map.class || rawType == HashMap.class) {
                break;
            }
            if (rawType == LinkedHashMap.class) {
                properties = new LinkedHashMap();
                break;
            }
            if (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            } else {
                Class cls = (Class) rawType;
                if (cls.isInterface()) {
                    throw new IllegalArgumentException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("unsupport type ", rawType));
                }
                try {
                    properties = (Map) cls.newInstance();
                } catch (Exception e) {
                    throw new IllegalArgumentException(com.aspose.slides.internal.p097e0.OooO0O0.OooO0O0("unsupport type ", rawType), e);
                }
            }
        }
        properties = new HashMap();
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Deserialize Map must be Generics!");
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (String.class != type2) {
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        Iterator itM80652a = c18955b.m80652a();
        while (itM80652a.hasNext()) {
            String str = (String) itM80652a.next();
            properties.put(str, o00OO.OooO00o.OooO00o((Class) type3) ? c18955b.m80651a(str) : C34669OooO0o0.OooO00o(c18955b.m80651a(str), type3));
        }
        return properties;
    }

    @Override // oo0O.InterfaceC34672OooOO0
    /* JADX INFO: renamed from: a */
    public final Object mo80636a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new IllegalArgumentException("Map key must be String!");
            }
            treeMap.put((String) entry.getKey(), C34668OooO0o.OooO0O0(entry.getValue()));
        }
        return treeMap;
    }
}
