package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import com.orion.notein.domain.models.page.HyperLink;

/* JADX INFO: loaded from: classes9.dex */
public class HyperLinkMapperImpl extends HyperLinkMapper {
    @Override // com.orion.notein.domain.mapper.HyperLinkMapper
    public HyperLinkEntity toEntity(HyperLink hyperLink) {
        if (hyperLink == null) {
            return null;
        }
        HyperLinkEntity hyperLinkEntity = new HyperLinkEntity(hyperLink.getId(), null, hyperLink.getPageId(), hyperLink.getType(), hyperLink.getDestination(), hyperLink.getExtras(), hyperLink.getCreationTime(), 0L, null, null, null, null);
        fillEntity(hyperLink, hyperLinkEntity);
        return hyperLinkEntity;
    }

    @Override // com.orion.notein.domain.mapper.HyperLinkMapper
    public HyperLink toHyperLink(HyperLinkEntity hyperLinkEntity) {
        if (hyperLinkEntity == null) {
            return null;
        }
        HyperLink hyperLink = new HyperLink(hyperLinkEntity.getId(), hyperLinkEntity.getPageId(), hyperLinkEntity.getType(), hyperLinkEntity.getDestination(), hyperLinkEntity.getExtras(), null, hyperLinkEntity.getCreationTime());
        fillModel(hyperLinkEntity, hyperLink);
        return hyperLink;
    }
}
