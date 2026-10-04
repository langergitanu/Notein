package com.orion.notein.data.p602db.entity;

import android.graphics.RectF;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0007J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/QuoteConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "labelRectToString", "", "rectF", "Landroid/graphics/RectF;", "stringToLabelRect", "json", "annoItemIdListToString", "idList", "", "stringToAnnoItemIdList", "rectListToString", "rectList", "stringToRectList", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class QuoteConverter {
    private final Gson gson;

    public QuoteConverter() {
        Gson gsonCreate = new GsonBuilder().create();
        OooOOO0.OooO0o(gsonCreate, "create(...)");
        this.gson = gsonCreate;
    }

    public final String annoItemIdListToString(List<String> idList) {
        if (idList != null) {
            return this.gson.toJson(idList);
        }
        return null;
    }

    public final String labelRectToString(RectF rectF) {
        OooOOO0.OooO0oO(rectF, "rectF");
        String json = this.gson.toJson(rectF);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final String rectListToString(List<? extends RectF> rectList) {
        OooOOO0.OooO0oO(rectList, "rectList");
        String json = this.gson.toJson(rectList);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final List<String> stringToAnnoItemIdList(String json) {
        if (json == null) {
            return null;
        }
        Type type = new TypeToken<List<? extends String>>() { // from class: com.orion.notein.data.db.entity.QuoteConverter$stringToAnnoItemIdList$1$type$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        return (List) this.gson.fromJson(json, type);
    }

    public final RectF stringToLabelRect(String json) {
        OooOOO0.OooO0oO(json, "json");
        Type type = new TypeToken<RectF>() { // from class: com.orion.notein.data.db.entity.QuoteConverter$stringToLabelRect$type$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        Object objFromJson = this.gson.fromJson(json, type);
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        return (RectF) objFromJson;
    }

    public final List<RectF> stringToRectList(String json) {
        OooOOO0.OooO0oO(json, "json");
        Type type = new TypeToken<List<? extends RectF>>() { // from class: com.orion.notein.data.db.entity.QuoteConverter$stringToRectList$listType$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        Object objFromJson = this.gson.fromJson(json, type);
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }
}
