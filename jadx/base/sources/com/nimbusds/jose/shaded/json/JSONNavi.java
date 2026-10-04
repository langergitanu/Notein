package com.nimbusds.jose.shaded.json;

import OooO0o.C20424OooO0Oo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.nimbusds.jose.shaded.json.parser.ContainerFactory;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes9.dex */
public class JSONNavi<T> {
    private static final JSONStyle ERROR_COMPRESS = new JSONStyle(2);
    private Object current;
    private ContainerFactory factory;
    private boolean failure;
    private String failureMessage;
    private Object missingKey;
    private Stack<Object> path;
    private boolean readonly;
    private T root;
    private Stack<Object> stack;

    public JSONNavi() {
        this(ContainerFactory.FACTORY_ORDERED);
    }

    /* JADX INFO: renamed from: a */
    private List<Object> m80462a(Object obj) {
        return (List) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private JSONNavi<?> failure(String str, Object obj) {
        this.failure = true;
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Error: ", str, " at ");
        sbOooO0o0.append(getJPath());
        if (obj != null) {
            if (obj instanceof Integer) {
                sbOooO0o0.append('[');
                sbOooO0o0.append(obj);
                sbOooO0o0.append(']');
            } else {
                sbOooO0o0.append(IOUtils.DIR_SEPARATOR_UNIX);
                sbOooO0o0.append(obj);
            }
        }
        this.failureMessage = sbOooO0o0.toString();
        return this;
    }

    public static JSONNavi<JSONAwareEx> newInstance() {
        return new JSONNavi<>(ContainerFactory.FACTORY_SIMPLE);
    }

    public static JSONNavi<JSONArray> newInstanceArray() {
        JSONNavi<JSONArray> jSONNavi = new JSONNavi<>(ContainerFactory.FACTORY_SIMPLE);
        jSONNavi.array();
        return jSONNavi;
    }

    public static JSONNavi<JSONObject> newInstanceObject() {
        JSONNavi<JSONObject> jSONNavi = new JSONNavi<>(ContainerFactory.FACTORY_SIMPLE);
        jSONNavi.object();
        return jSONNavi;
    }

    public static JSONNavi<Collection<?>> newInstanceOrdered() {
        return new JSONNavi<>(ContainerFactory.FACTORY_ORDERED);
    }

    /* JADX INFO: renamed from: o */
    private Map<String, Object> m80463o(Object obj) {
        return (Map) obj;
    }

    private void store() {
        Object objPeek = this.stack.peek();
        if (isObject(objPeek)) {
            m80463o(objPeek).put((String) this.missingKey, this.current);
            return;
        }
        if (isArray(objPeek)) {
            int iIntValue = ((Number) this.missingKey).intValue();
            List<Object> listM80462a = m80462a(objPeek);
            while (listM80462a.size() <= iIntValue) {
                listM80462a.add(null);
            }
            listM80462a.set(iIntValue, this.current);
        }
    }

    public JSONNavi<T> add(Object... objArr) {
        array();
        if (!this.failure) {
            List<Object> listM80462a = m80462a(this.current);
            for (Object obj : objArr) {
                listM80462a.add(obj);
            }
        }
        return this;
    }

    public JSONNavi<T> array() {
        if (!this.failure) {
            if (this.current == null && this.readonly) {
                failure("Can not create Array child in readonly", null);
            }
            if (this.current == null) {
                this.current = this.factory.createArrayContainer();
            } else if (!isArray()) {
                if (isObject()) {
                    failure("can not use Object feature on Array.", null);
                }
                failure("Can not use current possition as Object", null);
            }
            if (this.root == null) {
                this.root = (T) this.current;
                return this;
            }
            store();
            return this;
        }
        return this;
    }

    public boolean asBoolean() {
        Object obj = this.current;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public Boolean asBooleanObj() {
        Object obj = this.current;
        if (obj != null && (obj instanceof Boolean)) {
            return (Boolean) obj;
        }
        return null;
    }

    public double asDouble() {
        Object obj = this.current;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return Double.NaN;
    }

    public Double asDoubleObj() {
        Object obj = this.current;
        if (obj == null) {
            return null;
        }
        return obj instanceof Number ? obj instanceof Double ? (Double) obj : Double.valueOf(((Number) obj).doubleValue()) : Double.valueOf(Double.NaN);
    }

    public double asFloat() {
        if (this.current instanceof Number) {
            return ((Number) r0).floatValue();
        }
        return Double.NaN;
    }

    public Float asFloatObj() {
        Object obj = this.current;
        if (obj == null) {
            return null;
        }
        return obj instanceof Number ? obj instanceof Float ? (Float) obj : Float.valueOf(((Number) obj).floatValue()) : Float.valueOf(Float.NaN);
    }

    public int asInt() {
        Object obj = this.current;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    public Integer asIntegerObj() {
        Object obj = this.current;
        if (obj != null && (obj instanceof Number)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (obj instanceof Long) {
                Long l = (Long) obj;
                if (l.longValue() == l.intValue()) {
                    return Integer.valueOf(l.intValue());
                }
            }
        }
        return null;
    }

    public long asLong() {
        Object obj = this.current;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    public Long asLongObj() {
        Object obj = this.current;
        if (obj != null && (obj instanceof Number)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Number) obj).longValue());
            }
        }
        return null;
    }

    public String asString() {
        Object obj = this.current;
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: at */
    public JSONNavi<?> m80465at(String str) {
        if (this.failure) {
            return this;
        }
        if (!isObject()) {
            object();
        }
        Object obj = this.current;
        if (!(obj instanceof Map)) {
            return failure("current node is not an Object", str);
        }
        if (m80463o(obj).containsKey(str)) {
            Object obj2 = m80463o(this.current).get(str);
            this.stack.add(this.current);
            this.path.add(str);
            this.current = obj2;
            return this;
        }
        if (this.readonly) {
            return failure(OooO00o.OooO00o("current Object have no key named ", str), str);
        }
        this.stack.add(this.current);
        this.path.add(str);
        this.current = null;
        this.missingKey = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONNavi<?> atNext() {
        if (this.failure) {
            return this;
        }
        Object obj = this.current;
        return !(obj instanceof List) ? failure("current node is not an Array", null) : m80464at(((List) obj).size());
    }

    public Object get(String str) {
        if (this.failure) {
            return this;
        }
        if (!isObject()) {
            object();
        }
        Object obj = this.current;
        return !(obj instanceof Map) ? failure("current node is not an Object", str) : m80463o(obj).get(str);
    }

    public Object getCurrentObject() {
        return this.current;
    }

    public String getJPath() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.path) {
            if (obj instanceof String) {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(obj.toString());
            } else {
                sb.append('[');
                sb.append(obj.toString());
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public Collection<String> getKeys() {
        Object obj = this.current;
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        return null;
    }

    public T getRoot() {
        return this.root;
    }

    public int getSize() {
        if (this.current == null) {
            return 0;
        }
        if (isArray()) {
            return ((List) this.current).size();
        }
        if (isObject()) {
            return ((Map) this.current).size();
        }
        return 1;
    }

    public boolean hasFailure() {
        return this.failure;
    }

    public boolean isArray() {
        return isArray(this.current);
    }

    public boolean isObject() {
        return isObject(this.current);
    }

    public JSONNavi<T> object() {
        if (!this.failure) {
            if (this.current == null && this.readonly) {
                failure("Can not create Object child in readonly", null);
            }
            if (this.current == null) {
                this.current = this.factory.createObjectContainer();
            } else if (!isObject()) {
                if (isArray()) {
                    failure("can not use Object feature on Array.", null);
                }
                failure("Can not use current possition as Object", null);
            }
            if (this.root == null) {
                this.root = (T) this.current;
                return this;
            }
            store();
            return this;
        }
        return this;
    }

    public JSONNavi<T> root() {
        this.current = this.root;
        this.stack.clear();
        this.path.clear();
        this.failure = false;
        this.missingKey = null;
        this.failureMessage = null;
        return this;
    }

    public JSONNavi<T> set(String str, String str2) {
        object();
        if (this.failure) {
            return this;
        }
        m80463o(this.current).put(str, str2);
        return this;
    }

    public String toString() {
        return this.failure ? JSONValue.toJSONString(this.failureMessage, ERROR_COMPRESS) : JSONValue.toJSONString(this.root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: up */
    public JSONNavi<?> m80467up(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || this.stack.size() <= 0) {
                break;
            }
            this.current = this.stack.pop();
            this.path.pop();
            i = i2;
        }
        return this;
    }

    public JSONNavi(String str) {
        this.stack = new Stack<>();
        this.path = new Stack<>();
        this.failure = false;
        this.readonly = false;
        this.missingKey = null;
        T t = (T) JSONValue.parse(str);
        this.root = t;
        this.current = t;
        this.readonly = true;
    }

    private boolean isArray(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List;
    }

    private boolean isObject(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof Map;
    }

    public JSONNavi<T> set(String str, Number number) {
        object();
        if (this.failure) {
            return this;
        }
        m80463o(this.current).put(str, number);
        return this;
    }

    public String toString(JSONStyle jSONStyle) {
        if (this.failure) {
            return JSONValue.toJSONString(this.failureMessage, jSONStyle);
        }
        return JSONValue.toJSONString(this.root, jSONStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: up */
    public JSONNavi<?> m80466up() {
        if (this.stack.size() > 0) {
            this.current = this.stack.pop();
            this.path.pop();
        }
        return this;
    }

    public Object get(int i) {
        if (this.failure) {
            return this;
        }
        if (!isArray()) {
            array();
        }
        Object obj = this.current;
        if (!(obj instanceof List)) {
            return failure("current node is not an List", Integer.valueOf(i));
        }
        return m80462a(obj).get(i);
    }

    public JSONNavi<T> set(String str, long j) {
        return set(str, Long.valueOf(j));
    }

    public JSONNavi<T> set(String str, int i) {
        return set(str, Integer.valueOf(i));
    }

    public JSONNavi<T> set(String str, double d) {
        return set(str, Double.valueOf(d));
    }

    public JSONNavi<T> set(String str, float f) {
        return set(str, Float.valueOf(f));
    }

    public JSONNavi(ContainerFactory containerFactory) {
        this.stack = new Stack<>();
        this.path = new Stack<>();
        this.failure = false;
        this.missingKey = null;
        this.factory = containerFactory;
        this.readonly = false;
    }

    public JSONNavi<T> set(Number number) {
        if (this.failure) {
            return this;
        }
        this.current = number;
        store();
        return this;
    }

    public JSONNavi<T> set(Boolean bool) {
        if (this.failure) {
            return this;
        }
        this.current = bool;
        store();
        return this;
    }

    public JSONNavi<T> set(String str) {
        if (this.failure) {
            return this;
        }
        this.current = str;
        store();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: at */
    public JSONNavi<?> m80464at(int i) {
        if (this.failure) {
            return this;
        }
        Object obj = this.current;
        if (!(obj instanceof List)) {
            return failure("current node is not an Array", Integer.valueOf(i));
        }
        List list = (List) obj;
        if (i < 0 && (i = i + list.size()) < 0) {
            i = 0;
        }
        if (i >= list.size()) {
            if (this.readonly) {
                return failure("Out of bound exception for index", Integer.valueOf(i));
            }
            this.stack.add(this.current);
            this.path.add(Integer.valueOf(i));
            this.current = null;
            this.missingKey = Integer.valueOf(i);
            return this;
        }
        Object obj2 = list.get(i);
        this.stack.add(this.current);
        this.path.add(Integer.valueOf(i));
        this.current = obj2;
        return this;
    }
}
