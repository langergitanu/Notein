package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.AdEntity;
import com.orion.notein.domain.models.ads.C18877Ad;

/* JADX INFO: loaded from: classes9.dex */
public class AdMapperImpl implements AdMapper {
    @Override // com.orion.notein.domain.mapper.AdMapper
    public AdEntity toEntity(C18877Ad c18877Ad) {
        if (c18877Ad == null) {
            return null;
        }
        AdEntity adEntity = new AdEntity();
        adEntity.setId(c18877Ad.getId());
        adEntity.setType(c18877Ad.getType());
        adEntity.setImageUrlEnUS(c18877Ad.getImageUrlEnUS());
        adEntity.setImageUrlZhCN(c18877Ad.getImageUrlZhCN());
        adEntity.setImageUrlZhTW(c18877Ad.getImageUrlZhTW());
        adEntity.setTarget(c18877Ad.getTarget());
        adEntity.setVisible(c18877Ad.getVisible());
        adEntity.setAdStartTime(c18877Ad.getAdStartTime());
        adEntity.setAdEndTime(c18877Ad.getAdEndTime());
        adEntity.setPeriod(c18877Ad.getPeriod());
        adEntity.setCreateTime(c18877Ad.getCreateTime());
        adEntity.setToastTime(c18877Ad.getToastTime());
        return adEntity;
    }

    @Override // com.orion.notein.domain.mapper.AdMapper
    public C18877Ad toModel(AdEntity adEntity) {
        if (adEntity == null) {
            return null;
        }
        C18877Ad c18877Ad = new C18877Ad();
        c18877Ad.setId(adEntity.getId());
        c18877Ad.setType(adEntity.getType());
        c18877Ad.setImageUrlEnUS(adEntity.getImageUrlEnUS());
        c18877Ad.setImageUrlZhCN(adEntity.getImageUrlZhCN());
        c18877Ad.setImageUrlZhTW(adEntity.getImageUrlZhTW());
        c18877Ad.setTarget(adEntity.getTarget());
        c18877Ad.setVisible(adEntity.getVisible());
        c18877Ad.setAdStartTime(adEntity.getAdStartTime());
        c18877Ad.setAdEndTime(adEntity.getAdEndTime());
        c18877Ad.setPeriod(adEntity.getPeriod());
        c18877Ad.setCreateTime(adEntity.getCreateTime());
        c18877Ad.setToastTime(adEntity.getToastTime());
        return c18877Ad;
    }
}
