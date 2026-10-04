package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ImageEntity;
import com.orion.notein.domain.models.page.Image;

/* JADX INFO: loaded from: classes9.dex */
public class ImageMapperImpl extends ImageMapper {
    @Override // com.orion.notein.domain.mapper.ImageMapper
    public ImageEntity toEntity(Image image) {
        if (image == null) {
            return null;
        }
        ImageEntity imageEntity = new ImageEntity(image.getId(), image.getUri(), 0, image.getLayerId(), null, image.getRotation(), image.getPageId(), image.getCreationTime(), image.getLastModificationTime(), null, null, null, null, image.getFixed());
        fillEntity(image, imageEntity);
        return imageEntity;
    }

    @Override // com.orion.notein.domain.mapper.ImageMapper
    public Image toImage(ImageEntity imageEntity) {
        if (imageEntity == null) {
            return null;
        }
        Image image = new Image(imageEntity.getId(), imageEntity.getPageId(), imageEntity.getUri(), imageEntity.getLayerId() != null ? imageEntity.getLayerId() : "default", null, imageEntity.getRotation(), imageEntity.getCreationTime(), imageEntity.getLastModificationTime(), imageEntity.getFixed());
        fillModel(imageEntity, image);
        return image;
    }
}
