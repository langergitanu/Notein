package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AiOcrSessionEntity;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AiOcrSessionMapperImpl extends AiOcrSessionMapper {
    @Override // com.orion.notein.domain.mapper.AiOcrSessionMapper
    public AiOcrSession fromEntity(AiOcrSessionEntity aiOcrSessionEntity) {
        if (aiOcrSessionEntity == null) {
            return null;
        }
        AiOcrSession aiOcrSession = new AiOcrSession();
        aiOcrSession.setId(aiOcrSessionEntity.getId());
        aiOcrSession.setUserId(aiOcrSessionEntity.getUserId());
        aiOcrSession.setTitle(aiOcrSessionEntity.getTitle());
        List<String> pageIds = aiOcrSessionEntity.getPageIds();
        if (pageIds != null) {
            aiOcrSession.setPageIds(new ArrayList(pageIds));
        }
        aiOcrSession.setCreationTime(aiOcrSessionEntity.getCreationTime());
        aiOcrSession.setLastModificationTime(aiOcrSessionEntity.getLastModificationTime());
        fillModel(aiOcrSessionEntity, aiOcrSession);
        return aiOcrSession;
    }

    @Override // com.orion.notein.domain.mapper.AiOcrSessionMapper
    public AiOcrSessionEntity toEntity(AiOcrSession aiOcrSession) {
        if (aiOcrSession == null) {
            return null;
        }
        List<String> pageIds = aiOcrSession.getPageIds();
        AiOcrSessionEntity aiOcrSessionEntity = new AiOcrSessionEntity(aiOcrSession.getId(), aiOcrSession.getTitle(), aiOcrSession.getUserId(), pageIds != null ? new ArrayList(pageIds) : null, null, aiOcrSession.getCreationTime(), aiOcrSession.getLastModificationTime());
        fillEntity(aiOcrSession, aiOcrSessionEntity);
        return aiOcrSessionEntity;
    }
}
