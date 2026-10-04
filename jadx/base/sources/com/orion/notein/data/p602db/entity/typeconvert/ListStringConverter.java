package com.orion.notein.data.p602db.entity.typeconvert;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/typeconvert/ListStringConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "childrenToString", "", "list", "", "stringToChildren", "json", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ListStringConverter {
    private final Gson gson = new Gson();

    public final String childrenToString(List<String> list) {
        OooOOO0.OooO0oO(list, "list");
        String json = this.gson.toJson(list);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final List<String> stringToChildren(String json) {
        OooOOO0.OooO0oO(json, "json");
        Type type = new TypeToken<List<? extends String>>() { // from class: com.orion.notein.data.db.entity.typeconvert.ListStringConverter$stringToChildren$listType$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        Object objFromJson = this.gson.fromJson(json, type);
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }
}
