package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleDeveloperOffer;

/* JADX INFO: loaded from: classes9.dex */
public class NoteinGoogleOfferMapperImpl extends NoteinGoogleOfferMapper {
    @Override // com.orion.notein.domain.mapper.NoteinGoogleOfferMapper
    public NoteinGoogleDeveloperOfferEntity toEntity(NoteinGoogleDeveloperOffer noteinGoogleDeveloperOffer) {
        if (noteinGoogleDeveloperOffer == null) {
            return null;
        }
        return new NoteinGoogleDeveloperOfferEntity(noteinGoogleDeveloperOffer.getId(), noteinGoogleDeveloperOffer.getUserId(), noteinGoogleDeveloperOffer.getProductId(), noteinGoogleDeveloperOffer.getBasePlanId(), noteinGoogleDeveloperOffer.getOfferId(), noteinGoogleDeveloperOffer.getCreatedAt(), noteinGoogleDeveloperOffer.getExpireAt(), noteinGoogleDeveloperOffer.getUsed());
    }

    @Override // com.orion.notein.domain.mapper.NoteinGoogleOfferMapper
    public NoteinGoogleDeveloperOffer toModel(NoteinGoogleDeveloperOfferEntity noteinGoogleDeveloperOfferEntity) {
        if (noteinGoogleDeveloperOfferEntity == null) {
            return null;
        }
        return new NoteinGoogleDeveloperOffer(noteinGoogleDeveloperOfferEntity.getId(), noteinGoogleDeveloperOfferEntity.getUserId(), noteinGoogleDeveloperOfferEntity.getProductId(), noteinGoogleDeveloperOfferEntity.getBasePlanId(), noteinGoogleDeveloperOfferEntity.getOfferId(), noteinGoogleDeveloperOfferEntity.getCreatedAt(), noteinGoogleDeveloperOfferEntity.getExpireAt(), noteinGoogleDeveloperOfferEntity.getUsed());
    }
}
