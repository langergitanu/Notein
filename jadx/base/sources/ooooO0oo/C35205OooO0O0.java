package ooooO0oo;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34524OooO0Oo.OooO0OO;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: ooooO0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35205OooO0O0<T> implements InterfaceC35214OooO0o<T, RequestBody> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final MediaType f126415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f126416OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Gson f126417OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TypeAdapter<T> f126418OooO0O0;

    static {
        MediaType.f124148OooO0o0.getClass();
        f126415OooO0OO = MediaType.Companion.OooO00o("application/json; charset=UTF-8");
        f126416OooO0Oo = Charset.forName("UTF-8");
    }

    public C35205OooO0O0(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f126417OooO00o = gson;
        this.f126418OooO0O0 = typeAdapter;
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final RequestBody convert(Object obj) throws IOException {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        JsonWriter jsonWriterNewJsonWriter = this.f126417OooO00o.newJsonWriter(new OutputStreamWriter(c34524OooO0Oo.new OooO0OO(), f126416OooO0Oo));
        this.f126418OooO0O0.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(f126415OooO0OO, c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo));
    }
}
