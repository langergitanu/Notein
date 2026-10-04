package com.orion.notein.data.p602db.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteinMessageConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "stringToMap", "", "", "value", "mapToString", FirebaseAnalytics.Param.CONTENT, "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteinMessageConverter {
    private static final String TAG = "NoteinMessageConverter";
    private final Gson gson = new Gson();

    public final String mapToString(Map<String, String> content) {
        OooOOO0.OooO0oO(content, "content");
        String json = this.gson.toJson(content);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final Map<String, String> stringToMap(String value) {
        OooOOO0.OooO0oO(value, "value");
        Object objFromJson = this.gson.fromJson(value, new TypeToken<Map<String, ? extends String>>() { // from class: com.orion.notein.data.db.entity.NoteinMessageConverter.stringToMap.1
        }.getType());
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        return (Map) objFromJson;
    }
}
