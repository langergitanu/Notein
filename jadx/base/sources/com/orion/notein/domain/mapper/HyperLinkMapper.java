package com.orion.notein.domain.mapper;

import android.graphics.RectF;
import com.google.gson.Gson;
import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import com.orion.notein.domain.models.page.HyperLink;

/* JADX INFO: loaded from: classes9.dex */
public abstract class HyperLinkMapper {
    public void fillEntity(HyperLink hyperLink, HyperLinkEntity hyperLinkEntity) {
        hyperLinkEntity.setBoundsJson(new Gson().toJson(hyperLink.getBounds()));
        if (hyperLink.isRegionLoadable()) {
            RectF boundingBox = hyperLink.getBoundingBox(1.0f);
            if (boundingBox.isEmpty()) {
                return;
            }
            hyperLinkEntity.setLeft(Float.valueOf(boundingBox.left));
            hyperLinkEntity.setTop(Float.valueOf(boundingBox.top));
            hyperLinkEntity.setRight(Float.valueOf(boundingBox.right));
            hyperLinkEntity.setBottom(Float.valueOf(boundingBox.bottom));
        }
    }

    public void fillModel(HyperLinkEntity hyperLinkEntity, HyperLink hyperLink) {
        hyperLink.setBounds((RectF) new Gson().fromJson(hyperLinkEntity.getBoundsJson(), RectF.class));
    }

    public abstract HyperLinkEntity toEntity(HyperLink hyperLink);

    public abstract HyperLink toHyperLink(HyperLinkEntity hyperLinkEntity);
}
