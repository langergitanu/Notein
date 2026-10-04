package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import com.orion.notein.data.p602db.entity.StickerEntity;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class StickerMapperImpl implements StickerMapper {
    @Override // com.orion.notein.domain.mapper.StickerMapper
    public Sticker toSticker(StickerEntity stickerEntity) {
        if (stickerEntity == null) {
            return null;
        }
        return new Sticker(stickerEntity.getId(), stickerEntity.getParentId(), stickerEntity.getPath(), stickerEntity.getLastUsedTime(), stickerEntity.getBuiltIn(), stickerEntity.getSvgAspectRatio());
    }

    @Override // com.orion.notein.domain.mapper.StickerMapper
    public StickerCollection toStickerCollection(StickerCollectionEntity stickerCollectionEntity) {
        if (stickerCollectionEntity == null) {
            return null;
        }
        List<String> children = stickerCollectionEntity.getChildren();
        return new StickerCollection(stickerCollectionEntity.getId(), stickerCollectionEntity.getUserId(), stickerCollectionEntity.getName(), children != null ? new ArrayList(children) : null, stickerCollectionEntity.getBuiltIn(), stickerCollectionEntity.getCreationTime(), stickerCollectionEntity.getLastModificationTime(), stickerCollectionEntity.getSortKey());
    }

    @Override // com.orion.notein.domain.mapper.StickerMapper
    public StickerCollectionEntity toStickerCollectionEntity(StickerCollection stickerCollection) {
        if (stickerCollection == null) {
            return null;
        }
        List<String> children = stickerCollection.getChildren();
        return new StickerCollectionEntity(stickerCollection.getId(), stickerCollection.getUserId(), stickerCollection.getName(), children != null ? new ArrayList(children) : null, stickerCollection.getBuiltIn(), stickerCollection.getCreationTime(), stickerCollection.getLastModificationTime(), stickerCollection.getSortKey());
    }

    @Override // com.orion.notein.domain.mapper.StickerMapper
    public StickerEntity toStickerEntity(Sticker sticker) {
        if (sticker == null) {
            return null;
        }
        return new StickerEntity(sticker.getId(), sticker.getParentId(), sticker.getPath(), sticker.getLastUsedTime(), sticker.getBuiltIn(), sticker.getSvgAspectRatio());
    }
}
