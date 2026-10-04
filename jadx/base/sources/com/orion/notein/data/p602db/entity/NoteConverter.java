package com.orion.notein.data.p602db.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteConverter;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "outlineListToString", "", "outlines", "", "stringToOutlineList", "json", "fromJson", "Lcom/orion/notein/data/db/entity/PageOffSet;", "value", "toJson", "state", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteConverter {
    private final Gson gson = new Gson();

    public final PageOffSet fromJson(String value) {
        if (value == null || C33599OooOo0O.Oooo0o0(value)) {
            return null;
        }
        return (PageOffSet) this.gson.fromJson(value, PageOffSet.class);
    }

    public final String outlineListToString(List<String> outlines) {
        OooOOO0.OooO0oO(outlines, "outlines");
        String json = this.gson.toJson(outlines);
        OooOOO0.OooO0o(json, "toJson(...)");
        return json;
    }

    public final List<String> stringToOutlineList(String json) {
        OooOOO0.OooO0oO(json, "json");
        Type type = new TypeToken<List<? extends String>>() { // from class: com.orion.notein.data.db.entity.NoteConverter$stringToOutlineList$listType$1
        }.getType();
        OooOOO0.OooO0o(type, "getType(...)");
        try {
            Object objFromJson = this.gson.fromJson(json, type);
            OooOOO0.OooO0Oo(objFromJson);
            return (List) objFromJson;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteConverter");
            c20358OooO00o.OooO0Oo(e, "stringToOutlineList: ".concat(json), new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
    }

    public final String toJson(PageOffSet state) {
        String json = state != null ? this.gson.toJson(state) : null;
        return json == null ? "" : json;
    }
}
