package com.orion.notein.domain.mapper;

import android.net.Uri;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.huawei.hms.network.embedded.C18437z2;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/UriAdapter;", "Lcom/google/gson/JsonDeserializer;", "Landroid/net/Uri;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", C18437z2.f56754h, "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "src", "Lcom/google/gson/JsonSerializationContext;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UriAdapter implements JsonDeserializer<Uri>, JsonSerializer<Uri> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Uri deserialize(JsonElement json, Type type, JsonDeserializationContext context) {
        Object objOooO00o;
        OooOOO0.OooO0oO(json, "json");
        try {
            objOooO00o = Uri.parse(json.getAsString());
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Uri uri = Uri.EMPTY;
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = uri;
        }
        OooOOO0.OooO0o(objOooO00o, "getOrDefault(...)");
        return (Uri) objOooO00o;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Uri src, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(String.valueOf(src));
    }
}
