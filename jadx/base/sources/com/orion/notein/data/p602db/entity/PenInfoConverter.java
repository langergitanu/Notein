package com.orion.notein.data.p602db.entity;

import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/PenInfoConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "colorListToString", "", "colors", "", "", "stringToColorList", "json", "widthListToString", "widthList", "", "stringToWidthList", "extraToString", "extra", "Landroid/os/Bundle;", "stringToExtra", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PenInfoConverter {
    private static final String TAG = "PenInfoConverter";
    private final Gson gson;

    public PenInfoConverter() {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new BundleTypeAdapterFactory()).create();
        OooOOO0.OooO0o(gsonCreate, "create(...)");
        this.gson = gsonCreate;
    }

    public final String colorListToString(List<Integer> colors) {
        OooOOO0.OooO0oO(colors, "colors");
        String json = this.gson.toJson(colors);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final String extraToString(Bundle extra) {
        OooOOO0.OooO0oO(extra, "extra");
        Log.d(TAG, "extraStr: " + this.gson.toJson(extra));
        String json = this.gson.toJson(extra);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final List<Integer> stringToColorList(String json) {
        OooOOO0.OooO0oO(json, "json");
        Type type = new TypeToken<List<? extends Integer>>() { // from class: com.orion.notein.data.db.entity.PenInfoConverter$stringToColorList$listType$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        Object objFromJson = this.gson.fromJson(json, type);
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    public final Bundle stringToExtra(String json) {
        OooOOO0.OooO0oO(json, "json");
        Bundle bundle = (Bundle) this.gson.fromJson(json, Bundle.class);
        Log.d(TAG, "bundle: " + bundle);
        OooOOO0.OooO0Oo(bundle);
        return bundle;
    }

    public final List<Float> stringToWidthList(String json) {
        OooOOO0.OooO0oO(json, "json");
        Type type = new TypeToken<List<? extends Float>>() { // from class: com.orion.notein.data.db.entity.PenInfoConverter$stringToWidthList$listType$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        Object objFromJson = this.gson.fromJson(json, type);
        OooOOO0.OooO0o(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    public final String widthListToString(List<Float> widthList) {
        OooOOO0.OooO0oO(widthList, "widthList");
        String json = this.gson.toJson(widthList);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }
}
