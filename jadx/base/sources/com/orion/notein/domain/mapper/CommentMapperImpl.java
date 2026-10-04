package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.CommentEntity;
import com.orion.notein.domain.models.note.Comment;

/* JADX INFO: loaded from: classes9.dex */
public class CommentMapperImpl implements CommentMapper {
    @Override // com.orion.notein.domain.mapper.CommentMapper
    public CommentEntity toEntity(Comment comment) {
        if (comment == null) {
            return null;
        }
        return new CommentEntity(comment.getId(), comment.getTitle(), comment.getPageId(), comment.getNoteId(), comment.getQuoteId(), comment.getCreationTime(), comment.getLastModificationTime(), comment.getSortKey());
    }

    @Override // com.orion.notein.domain.mapper.CommentMapper
    public Comment toModel(CommentEntity commentEntity) {
        if (commentEntity == null) {
            return null;
        }
        return new Comment(commentEntity.getId(), commentEntity.getTitle(), commentEntity.getPageId(), commentEntity.getNoteId(), commentEntity.getQuoteId(), commentEntity.getCreationTime(), commentEntity.getLastModificationTime(), commentEntity.getSortKey());
    }
}
