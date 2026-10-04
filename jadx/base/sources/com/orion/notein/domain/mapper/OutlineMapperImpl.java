package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import com.orion.notein.domain.models.note.Outline;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class OutlineMapperImpl implements OutlineMapper {
    @Override // com.orion.notein.domain.mapper.OutlineMapper
    public OutlineEntity toEntity(Outline outline) {
        if (outline == null) {
            return null;
        }
        List<String> children = outline.getChildren();
        return new OutlineEntity(outline.getId(), outline.getTitle(), outline.getParentId(), outline.getPageId(), outline.getNoteId(), outline.getQuoteId(), children != null ? new ArrayList(children) : null, outline.getCreationTime(), outline.getLastModificationTime());
    }

    @Override // com.orion.notein.domain.mapper.OutlineMapper
    public Outline toModel(OutlineEntity outlineEntity) {
        if (outlineEntity == null) {
            return null;
        }
        String parentId = outlineEntity.getParentId();
        List<String> children = outlineEntity.getChildren();
        return new Outline(outlineEntity.getId(), outlineEntity.getTitle(), parentId, outlineEntity.getPageId(), outlineEntity.getNoteId(), outlineEntity.getQuoteId(), children != null ? new ArrayList(children) : null, outlineEntity.getCreationTime(), outlineEntity.getLastModificationTime());
    }
}
