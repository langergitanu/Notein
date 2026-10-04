package com.huawei.cloud.base.json;

import com.huawei.cloud.base.util.ClassInfo;
import com.huawei.cloud.base.util.Data;
import com.huawei.cloud.base.util.DateTime;
import com.huawei.cloud.base.util.FieldInfo;
import com.huawei.cloud.base.util.GenericData;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.Types;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class JsonGenerator {
    private void serializeNumber(boolean z, Object obj) throws IOException {
        if (z) {
            writeString(obj.toString());
            return;
        }
        if (obj instanceof BigDecimal) {
            writeNumber((BigDecimal) obj);
            return;
        }
        if (obj instanceof BigInteger) {
            writeNumber((BigInteger) obj);
            return;
        }
        if (obj instanceof Long) {
            writeNumber(((Long) obj).longValue());
            return;
        }
        boolean z2 = false;
        if (obj instanceof Float) {
            float fFloatValue = ((Number) obj).floatValue();
            if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue)) {
                z2 = true;
            }
            Preconditions.checkArgument(z2);
            writeNumber(fFloatValue);
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            writeNumber(((Number) obj).intValue());
            return;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        writeNumber(dDoubleValue);
    }

    private void serializeObject(boolean z, Object obj) throws IOException {
        boolean z2;
        Class<?> cls = obj.getClass();
        writeStartObject();
        boolean z3 = (obj instanceof Map) && !(obj instanceof GenericData);
        ClassInfo classInfoM75684of = z3 ? null : ClassInfo.m75684of(cls);
        for (Map.Entry<String, Object> entry : Data.mapOf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (z3) {
                    z2 = z;
                } else {
                    Field field = classInfoM75684of != null ? classInfoM75684of.getField(key) : null;
                    z2 = (field == null || field.getAnnotation(JsonString.class) == null) ? false : true;
                }
                writeFieldName(key);
                serialize(z2, value);
            }
        }
        writeEndObject();
    }

    public abstract void close() throws IOException;

    public void enablePrettyPrint() throws IOException {
    }

    public abstract void flush() throws IOException;

    public abstract JsonFactory getFactory();

    public final void serialize(Object obj) throws IOException {
        serialize(false, obj);
    }

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeNull() throws IOException;

    public abstract void writeNumber(double d) throws IOException;

    public abstract void writeNumber(float f) throws IOException;

    public abstract void writeNumber(int i) throws IOException;

    public abstract void writeNumber(long j) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public abstract void writeStartArray() throws IOException;

    public abstract void writeStartObject() throws IOException;

    public abstract void writeString(String str) throws IOException;

    private void serialize(boolean z, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (Data.isNull(obj)) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            serializeNumber(z, obj);
            return;
        }
        if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof DateTime) {
            writeString(((DateTime) obj).toStringRfc3339());
            return;
        }
        if ((obj instanceof Iterable) || cls.isArray()) {
            writeStartArray();
            Iterator it = Types.iterableOf(obj).iterator();
            while (it.hasNext()) {
                serialize(z, it.next());
            }
            writeEndArray();
            return;
        }
        if (!cls.isEnum()) {
            serializeObject(z, obj);
            return;
        }
        String name = FieldInfo.m75686of((Enum<?>) obj).getName();
        if (name == null) {
            writeNull();
        } else {
            writeString(name);
        }
    }
}
