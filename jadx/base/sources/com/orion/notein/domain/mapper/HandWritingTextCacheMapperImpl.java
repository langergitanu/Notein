package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntity;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntityWithoutElementsJson;
import com.orion.notein.domain.models.cache.HandWritingTextCache;
import com.orion.notein.domain.models.cache.HandWritingTextCacheWithoutElements;

/* JADX INFO: loaded from: classes9.dex */
public class HandWritingTextCacheMapperImpl extends HandWritingTextCacheMapper {
    @Override // com.orion.notein.domain.mapper.HandWritingTextCacheMapper
    public HandWritingTextCacheEntity toEntity(HandWritingTextCache handWritingTextCache) {
        if (handWritingTextCache == null) {
            return null;
        }
        HandWritingTextCacheEntity handWritingTextCacheEntity = new HandWritingTextCacheEntity();
        handWritingTextCacheEntity.setPageId(handWritingTextCache.getPageId());
        handWritingTextCacheEntity.setPageGridX(handWritingTextCache.getPageGridX());
        handWritingTextCacheEntity.setPageGridY(handWritingTextCache.getPageGridY());
        handWritingTextCacheEntity.setTrajectoryHash(handWritingTextCache.getTrajectoryHash());
        handWritingTextCacheEntity.setCreationTime(handWritingTextCache.getCreationTime());
        handWritingTextCacheEntity.setText(handWritingTextCache.getText());
        fillEntity(handWritingTextCache, handWritingTextCacheEntity);
        return handWritingTextCacheEntity;
    }

    @Override // com.orion.notein.domain.mapper.HandWritingTextCacheMapper
    public HandWritingTextCache toModel(HandWritingTextCacheEntity handWritingTextCacheEntity) {
        if (handWritingTextCacheEntity == null) {
            return null;
        }
        HandWritingTextCache handWritingTextCache = new HandWritingTextCache();
        handWritingTextCache.setPageId(handWritingTextCacheEntity.getPageId());
        handWritingTextCache.setPageGridX(handWritingTextCacheEntity.getPageGridX());
        handWritingTextCache.setPageGridY(handWritingTextCacheEntity.getPageGridY());
        handWritingTextCache.setTrajectoryHash(handWritingTextCacheEntity.getTrajectoryHash());
        handWritingTextCache.setCreationTime(handWritingTextCacheEntity.getCreationTime());
        handWritingTextCache.setText(handWritingTextCacheEntity.getText());
        fillModel(handWritingTextCacheEntity, handWritingTextCache);
        return handWritingTextCache;
    }

    @Override // com.orion.notein.domain.mapper.HandWritingTextCacheMapper
    public HandWritingTextCacheEntityWithoutElementsJson toEntity(HandWritingTextCacheWithoutElements handWritingTextCacheWithoutElements) {
        if (handWritingTextCacheWithoutElements == null) {
            return null;
        }
        HandWritingTextCacheEntityWithoutElementsJson handWritingTextCacheEntityWithoutElementsJson = new HandWritingTextCacheEntityWithoutElementsJson();
        handWritingTextCacheEntityWithoutElementsJson.setPageId(handWritingTextCacheWithoutElements.getPageId());
        handWritingTextCacheEntityWithoutElementsJson.setPageGridX(handWritingTextCacheWithoutElements.getPageGridX());
        handWritingTextCacheEntityWithoutElementsJson.setPageGridY(handWritingTextCacheWithoutElements.getPageGridY());
        handWritingTextCacheEntityWithoutElementsJson.setTrajectoryHash(handWritingTextCacheWithoutElements.getTrajectoryHash());
        handWritingTextCacheEntityWithoutElementsJson.setCreationTime(handWritingTextCacheWithoutElements.getCreationTime());
        handWritingTextCacheEntityWithoutElementsJson.setText(handWritingTextCacheWithoutElements.getText());
        return handWritingTextCacheEntityWithoutElementsJson;
    }

    @Override // com.orion.notein.domain.mapper.HandWritingTextCacheMapper
    public HandWritingTextCacheWithoutElements toModel(HandWritingTextCacheEntityWithoutElementsJson handWritingTextCacheEntityWithoutElementsJson) {
        if (handWritingTextCacheEntityWithoutElementsJson == null) {
            return null;
        }
        HandWritingTextCacheWithoutElements handWritingTextCacheWithoutElements = new HandWritingTextCacheWithoutElements();
        handWritingTextCacheWithoutElements.setPageId(handWritingTextCacheEntityWithoutElementsJson.getPageId());
        handWritingTextCacheWithoutElements.setPageGridX(handWritingTextCacheEntityWithoutElementsJson.getPageGridX());
        handWritingTextCacheWithoutElements.setPageGridY(handWritingTextCacheEntityWithoutElementsJson.getPageGridY());
        handWritingTextCacheWithoutElements.setTrajectoryHash(handWritingTextCacheEntityWithoutElementsJson.getTrajectoryHash());
        handWritingTextCacheWithoutElements.setCreationTime(handWritingTextCacheEntityWithoutElementsJson.getCreationTime());
        handWritingTextCacheWithoutElements.setText(handWritingTextCacheEntityWithoutElementsJson.getText());
        return handWritingTextCacheWithoutElements;
    }
}
