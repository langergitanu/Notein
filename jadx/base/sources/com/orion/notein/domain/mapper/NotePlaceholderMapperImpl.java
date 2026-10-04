package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.domain.models.note.NotePlaceHolder;

/* JADX INFO: loaded from: classes9.dex */
public class NotePlaceholderMapperImpl extends NotePlaceholderMapper {
    @Override // com.orion.notein.domain.mapper.NotePlaceholderMapper
    public NotePlaceholderEntity toEntity(NotePlaceHolder notePlaceHolder) {
        if (notePlaceHolder == null) {
            return null;
        }
        return new NotePlaceholderEntity(notePlaceHolder.getId(), notePlaceHolder.getParentId(), notePlaceHolder.getTitle(), notePlaceHolder.getCreationTime(), notePlaceHolder.getFilePath(), notePlaceHolder.getUri(), notePlaceHolder.getState(), notePlaceHolder.getExtras());
    }

    @Override // com.orion.notein.domain.mapper.NotePlaceholderMapper
    public NotePlaceHolder toNotePlaceholder(NotePlaceholderEntity notePlaceholderEntity) {
        if (notePlaceholderEntity == null) {
            return null;
        }
        NotePlaceHolder notePlaceHolder = new NotePlaceHolder();
        notePlaceHolder.setId(notePlaceholderEntity.getId());
        notePlaceHolder.setParentId(notePlaceholderEntity.getParentId());
        notePlaceHolder.setTitle(notePlaceholderEntity.getTitle());
        notePlaceHolder.setCreationTime(notePlaceholderEntity.getCreationTime());
        notePlaceHolder.setFilePath(notePlaceholderEntity.getFilePath());
        notePlaceHolder.setUri(notePlaceholderEntity.getUri());
        notePlaceHolder.setState(notePlaceholderEntity.getState());
        notePlaceHolder.setExtras(notePlaceholderEntity.getExtras());
        return notePlaceHolder;
    }
}
