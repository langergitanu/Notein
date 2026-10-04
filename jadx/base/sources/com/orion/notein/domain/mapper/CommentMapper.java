package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.CommentEntity;
import com.orion.notein.domain.models.note.Comment;

/* JADX INFO: loaded from: classes9.dex */
public interface CommentMapper {
    CommentEntity toEntity(Comment comment);

    Comment toModel(CommentEntity commentEntity);
}
