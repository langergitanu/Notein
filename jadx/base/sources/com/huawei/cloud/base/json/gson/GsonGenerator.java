package com.huawei.cloud.base.json.gson;

import com.huawei.cloud.base.json.JsonFactory;
import com.huawei.cloud.base.json.JsonGenerator;
import com.huawei.hms.drive.C17844d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
class GsonGenerator extends JsonGenerator {
    private final GsonFactory factory;
    private final C17844d writer;

    public static final class StringNumber extends Number {
        private static final long serialVersionUID = 1;
        private final String encodedValue;

        public StringNumber(String str) {
            this.encodedValue = str;
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return 0.0d;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return 0.0f;
        }

        @Override // java.lang.Number
        public int intValue() {
            return 0;
        }

        @Override // java.lang.Number
        public long longValue() {
            return 0L;
        }

        public String toString() {
            return this.encodedValue;
        }
    }

    public GsonGenerator(GsonFactory gsonFactory, C17844d c17844d) {
        this.factory = gsonFactory;
        this.writer = c17844d;
        c17844d.m76644a(true);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void close() throws IOException {
        this.writer.close();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void enablePrettyPrint() throws IOException {
        this.writer.m76643a("  ");
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public JsonFactory getFactory() {
        return this.factory;
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        this.writer.m76647b(z);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeEndArray() throws IOException {
        this.writer.m76645b();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeEndObject() throws IOException {
        this.writer.m76650d();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        this.writer.m76646b(str);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNull() throws IOException {
        this.writer.m76651e();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(int i) throws IOException {
        this.writer.m76641a(i);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeStartArray() throws IOException {
        this.writer.m76639a();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeStartObject() throws IOException {
        this.writer.m76648c();
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeString(String str) throws IOException {
        this.writer.m76649c(str);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(long j) throws IOException {
        this.writer.m76641a(j);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        this.writer.m76642a(bigInteger);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(double d) throws IOException {
        this.writer.m76640a(d);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(float f) throws IOException {
        this.writer.m76640a(f);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        this.writer.m76642a(bigDecimal);
    }

    @Override // com.huawei.cloud.base.json.JsonGenerator
    public void writeNumber(String str) throws IOException {
        this.writer.m76642a(new StringNumber(str));
    }
}
