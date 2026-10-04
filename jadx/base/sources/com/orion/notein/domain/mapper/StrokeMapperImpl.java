package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.StrokeEntity;
import com.orion.notein.domain.models.page.Stroke;

/* JADX INFO: loaded from: classes9.dex */
public class StrokeMapperImpl extends StrokeMapper {
    @Override // com.orion.notein.domain.mapper.StrokeMapper
    public StrokeEntity toEntity(Stroke stroke) {
        if (stroke == null) {
            return null;
        }
        StrokeEntity strokeEntity = new StrokeEntity(stroke.getId(), stroke.getPageId(), stroke.getLayerId(), stroke.getCreationTime(), null, null, null, null, null, null, null);
        fillEntity(stroke, strokeEntity);
        return strokeEntity;
    }

    @Override // com.orion.notein.domain.mapper.StrokeMapper
    public Stroke toStroke(StrokeEntity strokeEntity) {
        if (strokeEntity == null) {
            return null;
        }
        Stroke stroke = new Stroke(strokeEntity.getId(), strokeEntity.getPageId(), strokeEntity.getLayerId() != null ? strokeEntity.getLayerId() : "default", strokeEntity.getCreationTime(), null, null);
        fillModel(strokeEntity, stroke);
        return stroke;
    }
}
