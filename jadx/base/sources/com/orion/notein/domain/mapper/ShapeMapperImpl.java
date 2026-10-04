package com.orion.notein.domain.mapper;

import android.graphics.PointF;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import com.orion.notein.domain.models.page.Shape;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ShapeMapperImpl extends ShapeMapper {
    @Override // com.orion.notein.domain.mapper.ShapeMapper
    public ShapeEntity toEntity(Shape shape) {
        if (shape == null) {
            return null;
        }
        List<PointF> points = shape.getPoints();
        ShapeEntity shapeEntity = new ShapeEntity(shape.getId(), shape.getPageId(), shape.getColor(), shape.getWidth(), points != null ? new ArrayList(points) : null, shape.getType(), shape.getBlendMode(), shape.getLayerId(), shape.getTapeLike(), shape.getStyle(), shape.getOpacityOfFillColor(), shape.getCreationTime(), null, null, null, null);
        fillEntity(shape, shapeEntity);
        return shapeEntity;
    }

    @Override // com.orion.notein.domain.mapper.ShapeMapper
    public Shape toShape(ShapeEntity shapeEntity) {
        if (shapeEntity == null) {
            return null;
        }
        String layerId = shapeEntity.getLayerId() != null ? shapeEntity.getLayerId() : "default";
        List<PointF> points = shapeEntity.getPoints();
        return new Shape(shapeEntity.getId(), shapeEntity.getPageId(), shapeEntity.getColor(), shapeEntity.getWidth(), points != null ? new ArrayList(points) : null, shapeEntity.getType(), shapeEntity.getBlendMode(), shapeEntity.getStyle(), shapeEntity.getTapeLike(), shapeEntity.getOpacityOfFillColor(), layerId, shapeEntity.getCreationTime());
    }
}
