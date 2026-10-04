package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.google.gson.Gson;
import com.orion.notein.data.p602db.entity.ImageEntity;
import com.orion.notein.domain.models.page.Image;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ImageMapper {
    public void fillEntity(Image image, ImageEntity imageEntity) {
        imageEntity.setBoundsJson(new Gson().toJson(image.getBounds()));
        if (image.isRegionLoadable()) {
            RectF boundingBox = image.getBoundingBox(1.0f);
            if (boundingBox.isEmpty()) {
                return;
            }
            imageEntity.setLeft(Float.valueOf(boundingBox.left));
            imageEntity.setTop(Float.valueOf(boundingBox.top));
            imageEntity.setRight(Float.valueOf(boundingBox.right));
            imageEntity.setBottom(Float.valueOf(boundingBox.bottom));
        }
    }

    public void fillModel(ImageEntity imageEntity, Image image) {
        image.setBounds((RectF) new Gson().fromJson(imageEntity.getBoundsJson(), RectF.class));
    }

    public abstract ImageEntity toEntity(Image image);

    public abstract Image toImage(ImageEntity imageEntity);
}
