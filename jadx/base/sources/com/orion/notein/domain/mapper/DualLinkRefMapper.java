package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.Image;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DualLinkRefMapper {
    public void fillEntity(DualLinkRef dualLinkRef, DualLinkRefEntity dualLinkRefEntity) {
        RectF boundingBox;
        DualLinkSource source = dualLinkRef.getSource();
        Objects.requireNonNull(source);
        String id = source.getId();
        DualLinkSource source2 = dualLinkRef.getSource();
        Objects.requireNonNull(source2);
        String noteId = source2.getNoteId();
        dualLinkRefEntity.setDualLinkSourceId(id);
        dualLinkRefEntity.setDualLinkSourceNoteId(noteId);
        Image item = dualLinkRef.getItem();
        if (item != null) {
            dualLinkRefEntity.setItemId(item.getId());
        }
        if (!dualLinkRef.isRegionLoadable() || (boundingBox = dualLinkRef.getBoundingBox(1.0f)) == null) {
            return;
        }
        dualLinkRefEntity.setLeft(Float.valueOf(boundingBox.left));
        dualLinkRefEntity.setTop(Float.valueOf(boundingBox.top));
        dualLinkRefEntity.setRight(Float.valueOf(boundingBox.right));
        dualLinkRefEntity.setBottom(Float.valueOf(boundingBox.bottom));
    }

    public void fillModel(DualLinkRefEntity dualLinkRefEntity, DualLinkRef dualLinkRef) {
        String dualLinkSourceId = dualLinkRefEntity.getDualLinkSourceId();
        Objects.requireNonNull(dualLinkSourceId);
        String dualLinkSourceNoteId = dualLinkRefEntity.getDualLinkSourceNoteId();
        Objects.requireNonNull(dualLinkSourceNoteId);
        dualLinkRef.setSource(new DualLinkSource(dualLinkSourceId, dualLinkSourceNoteId, "", 0, new RectF(), Collections.EMPTY_LIST, dualLinkRef, true, 0L, 0L));
    }

    public abstract DualLinkRef toDualLinkRef(DualLinkRefEntity dualLinkRefEntity);

    public abstract DualLinkRefEntity toDualLinkRefEntity(DualLinkRef dualLinkRef);
}
