package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.parser.ContainerFactory;
import com.nimbusds.jose.shaded.json.parser.ContentHandler;
import com.nimbusds.jose.shaded.json.parser.ContentHandlerCompressor;
import com.nimbusds.jose.shaded.json.parser.FakeContainerFactory;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import com.nimbusds.jose.shaded.json.parser.ParseException;
import com.nimbusds.jose.shaded.json.reader.JsonWriter;
import com.nimbusds.jose.shaded.json.reader.JsonWriterI;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes9.dex */
public class JSONValue {
    public static JSONStyle COMPRESSION = JSONStyle.NO_COMPRESS;
    private static final FakeContainerFactory FACTORY_FAKE_COINTAINER = new FakeContainerFactory();
    public static JsonWriter defaultWriter = new JsonWriter();

    public static void SAXParse(InputStream inputStream, ContentHandler contentHandler) throws ParseException, IOException {
        new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream, FACTORY_FAKE_COINTAINER, contentHandler);
    }

    public static String compress(String str, JSONStyle jSONStyle) {
        try {
            StringBuilder sb = new StringBuilder();
            new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, FACTORY_FAKE_COINTAINER, new ContentHandlerCompressor(sb, jSONStyle));
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String escape(String str) {
        return escape(str, COMPRESSION);
    }

    public static boolean isValidJson(Reader reader) throws IOException {
        try {
            new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, FACTORY_FAKE_COINTAINER);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean isValidJsonStrict(Reader reader) throws IOException {
        try {
            new JSONParser(400).parse(reader, FACTORY_FAKE_COINTAINER);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static Object parse(byte[] bArr) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(byte[] bArr) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(InputStream inputStream) throws ParseException, IOException {
        return new JSONParser(400).parse(inputStream, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(byte[] bArr) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, ContainerFactory.FACTORY_SIMPLE);
    }

    public static String toJSONString(Object obj) {
        return toJSONString(obj, COMPRESSION);
    }

    public static String uncompress(String str) {
        return compress(str, JSONStyle.NO_COMPRESS);
    }

    public static void writeJSONString(Object obj, Appendable appendable) throws IOException {
        writeJSONString(obj, appendable, COMPRESSION);
    }

    public static String escape(String str, JSONStyle jSONStyle) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        jSONStyle.escape(str, sb);
        return sb.toString();
    }

    public static boolean isValidJson(String str) {
        try {
            new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, FACTORY_FAKE_COINTAINER);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean isValidJsonStrict(String str) {
        try {
            new JSONParser(400).parse(str, FACTORY_FAKE_COINTAINER);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static Object parse(byte[] bArr, int i, int i2) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, i, i2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(byte[] bArr, int i, int i2) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, i, i2, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(Reader reader) throws ParseException, IOException {
        return new JSONParser(400).parse(reader, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(byte[] bArr, int i, int i2) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, i, i2, ContainerFactory.FACTORY_SIMPLE);
    }

    public static String toJSONString(Object obj, JSONStyle jSONStyle) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSONString(obj, sb, jSONStyle);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (obj == null) {
            appendable.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
            return;
        }
        Class<?> cls = obj.getClass();
        JsonWriterI<Object> write = defaultWriter.getWrite(cls);
        if (write == null) {
            if (cls.isArray()) {
                write = JsonWriter.arrayWriter;
            } else {
                write = defaultWriter.getWriterByInterface(obj.getClass());
                if (write == null) {
                    write = JsonWriter.beansWriter;
                }
            }
            defaultWriter.registerWriter(write, cls);
        }
        write.writeJSONString(obj, appendable, jSONStyle);
    }

    public static void SAXParse(Reader reader, ContentHandler contentHandler) throws ParseException, IOException {
        new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, FACTORY_FAKE_COINTAINER, contentHandler);
    }

    public static Object parse(InputStream inputStream) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(InputStream inputStream) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(String str) throws ParseException {
        return new JSONParser(400).parse(str, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(InputStream inputStream) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parse(Reader reader) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(Reader reader) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(byte[] bArr) throws ParseException {
        return new JSONParser(400).parse(bArr, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(Reader reader) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, ContainerFactory.FACTORY_SIMPLE);
    }

    public static void SAXParse(String str, ContentHandler contentHandler) throws ParseException {
        new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, FACTORY_FAKE_COINTAINER, contentHandler);
    }

    public static void escape(String str, Appendable appendable) {
        escape(str, appendable, COMPRESSION);
    }

    public static Object parse(String str) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(String str) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(byte[] bArr, int i, int i2) throws ParseException {
        return new JSONParser(400).parse(bArr, i, i2, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(String str) throws ParseException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, ContainerFactory.FACTORY_SIMPLE);
    }

    public static String compress(String str) {
        return compress(str, JSONStyle.MAX_COMPRESS);
    }

    public static void escape(String str, Appendable appendable, JSONStyle jSONStyle) {
        if (str == null) {
            return;
        }
        jSONStyle.escape(str, appendable);
    }
}
