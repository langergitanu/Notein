package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntity;
import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntityWithoutElementsJson;
import com.orion.notein.domain.models.cache.PdfTextCache;
import com.orion.notein.domain.models.cache.PdfTextCacheWithoutElements;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33595OooOOo;
import oO0o0ooo.C33928OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\r\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H&¢\u0006\u0004\b\r\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/PdfTextCacheMapper;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/cache/PdfTextCache;", "cache", "Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntity;", "toEntity", "(Lcom/orion/notein/domain/models/cache/PdfTextCache;)Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntity;", "entity", "LoO00ooO/OooOooO;", "fillEntity", "(Lcom/orion/notein/domain/models/cache/PdfTextCache;Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntity;)V", "toModel", "(Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntity;)Lcom/orion/notein/domain/models/cache/PdfTextCache;", "fillModel", "(Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntity;Lcom/orion/notein/domain/models/cache/PdfTextCache;)V", "Lcom/orion/notein/domain/models/cache/PdfTextCacheWithoutElements;", "Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntityWithoutElementsJson;", "(Lcom/orion/notein/domain/models/cache/PdfTextCacheWithoutElements;)Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntityWithoutElementsJson;", "(Lcom/orion/notein/data/db/entity/cache/PdfTextCacheEntityWithoutElementsJson;)Lcom/orion/notein/domain/models/cache/PdfTextCacheWithoutElements;", "LoOo00O0O/OooO0OO;", "json", "LoOo00O0O/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class PdfTextCacheMapper {
    private final AbstractC34457OooO0OO json = C34467OooOo0.OooO00o(new C22976OooO0Oo(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO json$lambda$0(oOo00O0O.OooO0o Json) {
        OooOOO0.OooO0oO(Json, "$this$Json");
        Json.f123498OooO0OO = true;
        return C32460OooOooO.f116667OooO00o;
    }

    public void fillEntity(PdfTextCache cache, PdfTextCacheEntity entity) {
        OooOOO0.OooO0oO(cache, "cache");
        OooOOO0.OooO0oO(entity, "entity");
        List<RecognizedTextElement> elements = cache.getElements();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(elements, 10));
        for (RecognizedTextElement recognizedTextElement : elements) {
            arrayList.add(RecognizedTextElement.copy$default(recognizedTextElement, C33595OooOOo.OooOo0O(recognizedTextElement.getText(), "\r", ""), null, null, 6, null));
        }
        entity.setElementsJson(this.json.OooO00o(C33928OooO00o.OooO00o(RecognizedTextElement.INSTANCE.serializer()), arrayList));
    }

    public void fillModel(PdfTextCacheEntity entity, PdfTextCache cache) {
        List<RecognizedTextElement> list;
        OooOOO0.OooO0oO(entity, "entity");
        OooOOO0.OooO0oO(cache, "cache");
        String elementsJson = entity.getElementsJson();
        try {
            list = (List) this.json.OooO0O0(elementsJson, C33928OooO00o.OooO00o(RecognizedTextElement.INSTANCE.serializer()));
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PdfTextCacheMapper");
            c20358OooO00o.OooO0OO("fillModel: " + e + ", " + elementsJson, new Object[0]);
            list = C34434OooOoO.f123453OooOo0o;
        }
        cache.setElements(list);
    }

    public abstract PdfTextCacheEntity toEntity(PdfTextCache cache);

    public abstract PdfTextCacheEntityWithoutElementsJson toEntity(PdfTextCacheWithoutElements cache);

    public abstract PdfTextCache toModel(PdfTextCacheEntity entity);

    public abstract PdfTextCacheWithoutElements toModel(PdfTextCacheEntityWithoutElementsJson entity);
}
