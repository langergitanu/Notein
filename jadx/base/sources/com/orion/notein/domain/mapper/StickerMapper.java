package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.data.p602db.entity.StickerEntity;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;

/* JADX INFO: loaded from: classes9.dex */
public interface StickerMapper {
    Sticker toSticker(StickerEntity stickerEntity);

    StickerCollection toStickerCollection(StickerCollectionEntity stickerCollectionEntity);

    StickerCollectionEntity toStickerCollectionEntity(StickerCollection stickerCollection);

    StickerEntity toStickerEntity(Sticker sticker);
}
