package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntity;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntityWithoutElementsJson;
import com.orion.notein.domain.models.cache.HandWritingTextCache;
import com.orion.notein.domain.models.cache.HandWritingTextCacheWithoutElements;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0o0ooo.C33928OooO00o;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\r\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H&¢\u0006\u0004\b\r\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/HandWritingTextCacheMapper;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/cache/HandWritingTextCache;", "cache", "Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntity;", "toEntity", "(Lcom/orion/notein/domain/models/cache/HandWritingTextCache;)Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntity;", "entity", "LoO00ooO/OooOooO;", "fillEntity", "(Lcom/orion/notein/domain/models/cache/HandWritingTextCache;Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntity;)V", "toModel", "(Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntity;)Lcom/orion/notein/domain/models/cache/HandWritingTextCache;", "fillModel", "(Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntity;Lcom/orion/notein/domain/models/cache/HandWritingTextCache;)V", "Lcom/orion/notein/domain/models/cache/HandWritingTextCacheWithoutElements;", "Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntityWithoutElementsJson;", "(Lcom/orion/notein/domain/models/cache/HandWritingTextCacheWithoutElements;)Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntityWithoutElementsJson;", "(Lcom/orion/notein/data/db/entity/cache/HandWritingTextCacheEntityWithoutElementsJson;)Lcom/orion/notein/domain/models/cache/HandWritingTextCacheWithoutElements;", "LoOo00O0O/OooO0OO;", "json", "LoOo00O0O/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class HandWritingTextCacheMapper {
    private final AbstractC34457OooO0OO json = C34467OooOo0.OooO00o(new OooO00o(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO json$lambda$0(oOo00O0O.OooO0o Json) {
        OooOOO0.OooO0oO(Json, "$this$Json");
        Json.f123498OooO0OO = true;
        return C32460OooOooO.f116667OooO00o;
    }

    public void fillEntity(HandWritingTextCache cache, HandWritingTextCacheEntity entity) {
        OooOOO0.OooO0oO(cache, "cache");
        OooOOO0.OooO0oO(entity, "entity");
        entity.setElementsJson(this.json.OooO00o(C33928OooO00o.OooO00o(RecognizedTextElement.INSTANCE.serializer()), cache.getElements()));
    }

    public void fillModel(HandWritingTextCacheEntity entity, HandWritingTextCache cache) {
        OooOOO0.OooO0oO(entity, "entity");
        OooOOO0.OooO0oO(cache, "cache");
        cache.setElements((List) this.json.OooO0O0(entity.getElementsJson(), C33928OooO00o.OooO00o(RecognizedTextElement.INSTANCE.serializer())));
    }

    public abstract HandWritingTextCacheEntity toEntity(HandWritingTextCache cache);

    public abstract HandWritingTextCacheEntityWithoutElementsJson toEntity(HandWritingTextCacheWithoutElements cache);

    public abstract HandWritingTextCache toModel(HandWritingTextCacheEntity entity);

    public abstract HandWritingTextCacheWithoutElements toModel(HandWritingTextCacheEntityWithoutElementsJson entity);
}
