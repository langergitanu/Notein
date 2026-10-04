package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import com.orion.notein.domain.models.page.DualLinkSource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DualLinkSourceMapperImpl extends DualLinkSourceMapper {
    @Override // com.orion.notein.domain.mapper.DualLinkSourceMapper
    public DualLinkSource toDualLinkSource(DualLinkSourceEntity dualLinkSourceEntity) {
        if (dualLinkSourceEntity == null) {
            return null;
        }
        List<RectF> textBounds = dualLinkSourceEntity.getTextBounds();
        DualLinkSource dualLinkSource = new DualLinkSource(dualLinkSourceEntity.getId(), dualLinkSourceEntity.getNoteId(), dualLinkSourceEntity.getPageId(), dualLinkSourceEntity.getType(), dualLinkSourceEntity.getBounds(), textBounds != null ? new ArrayList(textBounds) : null, null, false, dualLinkSourceEntity.getCreationTime(), dualLinkSourceEntity.getLastModificationTime());
        fillModel(dualLinkSourceEntity, dualLinkSource);
        return dualLinkSource;
    }

    @Override // com.orion.notein.domain.mapper.DualLinkSourceMapper
    public DualLinkSourceEntity toDualLinkSourceEntity(DualLinkSource dualLinkSource) {
        if (dualLinkSource == null) {
            return null;
        }
        List<RectF> textBounds = dualLinkSource.getTextBounds();
        DualLinkSourceEntity dualLinkSourceEntity = new DualLinkSourceEntity(dualLinkSource.getId(), dualLinkSource.getNoteId(), dualLinkSource.getPageId(), dualLinkSource.getType(), dualLinkSource.getBounds(), textBounds != null ? new ArrayList(textBounds) : null, null, null, dualLinkSource.getCreationTime(), dualLinkSource.getLastModificationTime(), null, null, null, null);
        fillEntity(dualLinkSource, dualLinkSourceEntity);
        return dualLinkSourceEntity;
    }
}
