package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AdEntity;
import com.orion.notein.domain.models.ads.C18877Ad;

/* JADX INFO: loaded from: classes9.dex */
public interface AdMapper {
    AdEntity toEntity(C18877Ad c18877Ad);

    C18877Ad toModel(AdEntity adEntity);
}
