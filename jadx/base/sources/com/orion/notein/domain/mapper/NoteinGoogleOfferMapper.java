package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleDeveloperOffer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteinGoogleOfferMapper {
    public abstract NoteinGoogleDeveloperOfferEntity toEntity(NoteinGoogleDeveloperOffer noteinGoogleDeveloperOffer);

    public abstract NoteinGoogleDeveloperOffer toModel(NoteinGoogleDeveloperOfferEntity noteinGoogleDeveloperOfferEntity);
}
