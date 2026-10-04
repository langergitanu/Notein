package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import com.orion.notein.domain.models.page.DualLinkRef;

/* JADX INFO: loaded from: classes9.dex */
public class DualLinkRefMapperImpl extends DualLinkRefMapper {
    @Override // com.orion.notein.domain.mapper.DualLinkRefMapper
    public DualLinkRef toDualLinkRef(DualLinkRefEntity dualLinkRefEntity) {
        if (dualLinkRefEntity == null) {
            return null;
        }
        DualLinkRef dualLinkRef = new DualLinkRef(dualLinkRefEntity.getId(), dualLinkRefEntity.getNoteId(), dualLinkRefEntity.getPageId(), dualLinkRefEntity.getBounds(), null, null, false, dualLinkRefEntity.getCreationTime(), dualLinkRefEntity.getLastModificationTime());
        fillModel(dualLinkRefEntity, dualLinkRef);
        return dualLinkRef;
    }

    @Override // com.orion.notein.domain.mapper.DualLinkRefMapper
    public DualLinkRefEntity toDualLinkRefEntity(DualLinkRef dualLinkRef) {
        if (dualLinkRef == null) {
            return null;
        }
        DualLinkRefEntity dualLinkRefEntity = new DualLinkRefEntity(dualLinkRef.getId(), dualLinkRef.getNoteId(), dualLinkRef.getPageId(), dualLinkRef.getBounds(), null, null, null, dualLinkRef.getCreationTime(), dualLinkRef.getLastModificationTime(), null, null, null, null);
        fillEntity(dualLinkRef, dualLinkRefEntity);
        return dualLinkRefEntity;
    }
}
