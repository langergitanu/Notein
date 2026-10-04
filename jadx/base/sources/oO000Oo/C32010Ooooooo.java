package oO000Oo;

import com.google.common.base.Preconditions;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: oO000Oo.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32010Ooooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f114310OooO00o = Logger.getLogger(C32010Ooooooo.class.getName());

    /* JADX INFO: renamed from: oO000Oo.Ooooooo$OooO00o */
    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f114311OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f114311OooO00o = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f114311OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f114311OooO00o[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f114311OooO00o[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f114311OooO00o[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f114311OooO00o[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object OooO00o(JsonReader jsonReader) throws IOException {
        Preconditions.checkState(jsonReader.hasNext(), "unexpected end of JSON");
        switch (OooO00o.f114311OooO00o[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(OooO00o(jsonReader));
                }
                Preconditions.checkState(jsonReader.peek() == JsonToken.END_ARRAY, "Bad token: " + jsonReader.getPath());
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), OooO00o(jsonReader));
                }
                Preconditions.checkState(jsonReader.peek() == JsonToken.END_OBJECT, "Bad token: " + jsonReader.getPath());
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + jsonReader.getPath());
        }
    }
}
