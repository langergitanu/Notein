package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AiOcrTextPageMapper {
    public abstract AiOcrTextPage fromEntity(AiOcrTextPageEntity aiOcrTextPageEntity);

    public abstract AiOcrTextPageEntity toEntity(AiOcrTextPage aiOcrTextPage);
}
