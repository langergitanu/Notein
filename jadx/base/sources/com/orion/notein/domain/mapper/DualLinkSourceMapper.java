package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DualLinkSourceMapper {
    public void fillEntity(DualLinkSource dualLinkSource, DualLinkSourceEntity dualLinkSourceEntity) {
        RectF boundingBox;
        DualLinkRef ref = dualLinkSource.getRef();
        Objects.requireNonNull(ref);
        String id = ref.getId();
        DualLinkRef ref2 = dualLinkSource.getRef();
        Objects.requireNonNull(ref2);
        String noteId = ref2.getNoteId();
        dualLinkSourceEntity.setDualLinkRefId(id);
        dualLinkSourceEntity.setDualLinkRefNoteId(noteId);
        if (!dualLinkSource.isRegionLoadable() || (boundingBox = dualLinkSource.getBoundingBox(1.0f)) == null) {
            return;
        }
        dualLinkSourceEntity.setLeft(Float.valueOf(boundingBox.left));
        dualLinkSourceEntity.setTop(Float.valueOf(boundingBox.top));
        dualLinkSourceEntity.setRight(Float.valueOf(boundingBox.right));
        dualLinkSourceEntity.setBottom(Float.valueOf(boundingBox.bottom));
    }

    public void fillModel(DualLinkSourceEntity dualLinkSourceEntity, DualLinkSource dualLinkSource) {
        String dualLinkRefId = dualLinkSourceEntity.getDualLinkRefId();
        Objects.requireNonNull(dualLinkRefId);
        String dualLinkRefNoteId = dualLinkSourceEntity.getDualLinkRefNoteId();
        Objects.requireNonNull(dualLinkRefNoteId);
        dualLinkSource.setRef(new DualLinkRef(dualLinkRefId, dualLinkRefNoteId, "", new RectF(), null, dualLinkSource, true, 0L, 0L));
    }

    public abstract DualLinkSource toDualLinkSource(DualLinkSourceEntity dualLinkSourceEntity);

    public abstract DualLinkSourceEntity toDualLinkSourceEntity(DualLinkSource dualLinkSource);
}
