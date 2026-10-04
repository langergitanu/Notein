package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public void enablePrettyPrint() throws IOException {
    }

    @Override // java.io.Flushable
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
        boolean z2;
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
        boolean z3 = false;
        if (obj instanceof Number) {
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
            if (obj instanceof Float) {
                float fFloatValue = ((Number) obj).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue)) {
                    z3 = true;
                }
                Preconditions.checkArgument(z3);
                writeNumber(fFloatValue);
                return;
            }
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                writeNumber(((Number) obj).intValue());
                return;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                z3 = true;
            }
            Preconditions.checkArgument(z3);
            writeNumber(dDoubleValue);
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
        if (((obj instanceof Iterable) || cls.isArray()) && !(obj instanceof Map) && !(obj instanceof GenericData)) {
            writeStartArray();
            Iterator it = Types.iterableOf(obj).iterator();
            while (it.hasNext()) {
                serialize(z, it.next());
            }
            writeEndArray();
            return;
        }
        if (cls.isEnum()) {
            String name = FieldInfo.m75069of((Enum<?>) obj).getName();
            if (name == null) {
                writeNull();
                return;
            } else {
                writeString(name);
                return;
            }
        }
        writeStartObject();
        boolean z4 = (obj instanceof Map) && !(obj instanceof GenericData);
        ClassInfo classInfoM75067of = z4 ? null : ClassInfo.m75067of(cls);
        for (Map.Entry<String, Object> entry : Data.mapOf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (z4) {
                    z2 = z;
                } else {
                    Field field = classInfoM75067of.getField(key);
                    z2 = (field == null || field.getAnnotation(JsonString.class) == null) ? false : true;
                }
                writeFieldName(key);
                serialize(z2, value);
            }
        }
        writeEndObject();
    }
}
