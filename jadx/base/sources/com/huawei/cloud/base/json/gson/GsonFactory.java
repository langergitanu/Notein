package com.huawei.cloud.base.json.gson;

import com.huawei.cloud.base.json.JsonFactory;
import com.huawei.cloud.base.json.JsonGenerator;
import com.huawei.cloud.base.json.JsonParser;
import com.huawei.cloud.base.util.Charsets;
import com.huawei.hms.drive.C17790b;
import com.huawei.hms.drive.C17844d;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public class GsonFactory extends JsonFactory {

    public static class InstanceHolder {
        static final GsonFactory INSTANCE = new GsonFactory();
    }

    public static GsonFactory getDefaultInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override // com.huawei.cloud.base.json.JsonFactory
    public JsonGenerator createJsonGenerator(OutputStream outputStream, Charset charset) {
        return createJsonGenerator(new OutputStreamWriter(outputStream, charset));
    }

    @Override // com.huawei.cloud.base.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream) {
        return createJsonParser(new InputStreamReader(inputStream, Charsets.UTF_8));
    }

    @Override // com.huawei.cloud.base.json.JsonFactory
    public JsonGenerator createJsonGenerator(Writer writer) {
        return new GsonGenerator(this, new C17844d(writer));
    }

    @Override // com.huawei.cloud.base.json.JsonFactory
    public JsonParser createJsonParser(InputStream inputStream, Charset charset) {
        return charset == null ? createJsonParser(inputStream) : createJsonParser(new InputStreamReader(inputStream, charset));
    }

    @Override // com.huawei.cloud.base.json.JsonFactory
    public JsonParser createJsonParser(String str) {
        return createJsonParser(new StringReader(str));
    }

    @Override // com.huawei.cloud.base.json.JsonFactory
    public JsonParser createJsonParser(Reader reader) {
        return new GsonParser(this, new C17790b(reader));
    }
}
