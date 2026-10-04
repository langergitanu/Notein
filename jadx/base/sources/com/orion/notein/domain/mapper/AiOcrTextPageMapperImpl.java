package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;

/* JADX INFO: loaded from: classes9.dex */
public class AiOcrTextPageMapperImpl extends AiOcrTextPageMapper {
    @Override // com.orion.notein.domain.mapper.AiOcrTextPageMapper
    public AiOcrTextPage fromEntity(AiOcrTextPageEntity aiOcrTextPageEntity) {
        if (aiOcrTextPageEntity == null) {
            return null;
        }
        return new AiOcrTextPage(aiOcrTextPageEntity.getId(), aiOcrTextPageEntity.getSourceType(), aiOcrTextPageEntity.getSourceUri(), aiOcrTextPageEntity.getContent(), aiOcrTextPageEntity.getCreationTime(), aiOcrTextPageEntity.getLastModificationTime(), aiOcrTextPageEntity.getExtras());
    }

    @Override // com.orion.notein.domain.mapper.AiOcrTextPageMapper
    public AiOcrTextPageEntity toEntity(AiOcrTextPage aiOcrTextPage) {
        if (aiOcrTextPage == null) {
            return null;
        }
        return new AiOcrTextPageEntity(aiOcrTextPage.getId(), aiOcrTextPage.getSourceType(), aiOcrTextPage.getSourceUri(), aiOcrTextPage.getContent(), aiOcrTextPage.getCreationTime(), aiOcrTextPage.getLastModificationTime(), aiOcrTextPage.getExtras());
    }
}
