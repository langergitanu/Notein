package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import com.orion.notein.domain.models.page.Shape;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ShapeMapper {
    public void fillEntity(Shape shape, ShapeEntity shapeEntity) {
        if (shape.isRegionLoadable()) {
            RectF boundingBox = shape.getBoundingBox(1.0f);
            if (boundingBox.isEmpty()) {
                return;
            }
            shapeEntity.setLeft(Float.valueOf(boundingBox.left));
            shapeEntity.setTop(Float.valueOf(boundingBox.top));
            shapeEntity.setRight(Float.valueOf(boundingBox.right));
            shapeEntity.setBottom(Float.valueOf(boundingBox.bottom));
        }
    }

    public abstract ShapeEntity toEntity(Shape shape);

    public abstract Shape toShape(ShapeEntity shapeEntity);
}
