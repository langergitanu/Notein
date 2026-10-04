package ooooO0oo;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: ooooO0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35206OooO0OO<T> implements InterfaceC35214OooO0o<ResponseBody, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Gson f126419OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TypeAdapter<T> f126420OooO0O0;

    public C35206OooO0OO(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f126419OooO00o = gson;
        this.f126420OooO0O0 = typeAdapter;
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        JsonReader jsonReaderNewJsonReader = this.f126419OooO00o.newJsonReader(responseBody2.charStream());
        try {
            T t = this.f126420OooO0O0.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return t;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody2.close();
        }
    }
}
