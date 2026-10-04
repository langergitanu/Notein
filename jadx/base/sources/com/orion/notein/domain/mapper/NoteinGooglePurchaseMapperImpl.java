package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;

/* JADX INFO: loaded from: classes9.dex */
public class NoteinGooglePurchaseMapperImpl extends NoteinGooglePurchaseMapper {
    @Override // com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper
    public NoteinGoogleInAppPurchaseEntity toInAppEntity(NoteinGoogleInAppPurchase noteinGoogleInAppPurchase) {
        if (noteinGoogleInAppPurchase == null) {
            return null;
        }
        return new NoteinGoogleInAppPurchaseEntity(noteinGoogleInAppPurchase.getPurchaseToken(), noteinGoogleInAppPurchase.getUserId(), noteinGoogleInAppPurchase.getProductId(), noteinGoogleInAppPurchase.getAcknowledgementState(), noteinGoogleInAppPurchase.getPurchaseState(), noteinGoogleInAppPurchase.getStatus(), noteinGoogleInAppPurchase.getConsumptionState());
    }

    @Override // com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper
    public NoteinGoogleInAppPurchase toInAppModel(NoteinGoogleInAppPurchaseEntity noteinGoogleInAppPurchaseEntity) {
        if (noteinGoogleInAppPurchaseEntity == null) {
            return null;
        }
        return new NoteinGoogleInAppPurchase(noteinGoogleInAppPurchaseEntity.getPurchaseToken(), noteinGoogleInAppPurchaseEntity.getProductId(), noteinGoogleInAppPurchaseEntity.getUserId(), noteinGoogleInAppPurchaseEntity.getAcknowledgementState(), noteinGoogleInAppPurchaseEntity.getPurchaseState(), noteinGoogleInAppPurchaseEntity.getStatus(), noteinGoogleInAppPurchaseEntity.getConsumptionState());
    }

    @Override // com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper
    public NoteinGoogleSubscriptionPurchaseEntity toSubscriptionEntity(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase) {
        if (noteinGoogleSubscriptionPurchase == null) {
            return null;
        }
        NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity = new NoteinGoogleSubscriptionPurchaseEntity();
        noteinGoogleSubscriptionPurchaseEntity.setPurchaseToken(noteinGoogleSubscriptionPurchase.getPurchaseToken());
        noteinGoogleSubscriptionPurchaseEntity.setUserId(noteinGoogleSubscriptionPurchase.getUserId());
        noteinGoogleSubscriptionPurchaseEntity.setAcknowledgementState(noteinGoogleSubscriptionPurchase.getAcknowledgementState());
        noteinGoogleSubscriptionPurchaseEntity.setSubscriptionState(noteinGoogleSubscriptionPurchase.getSubscriptionState());
        noteinGoogleSubscriptionPurchaseEntity.setStatus(noteinGoogleSubscriptionPurchase.getStatus());
        fillEntity(noteinGoogleSubscriptionPurchase, noteinGoogleSubscriptionPurchaseEntity);
        return noteinGoogleSubscriptionPurchaseEntity;
    }

    @Override // com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper
    public NoteinGoogleSubscriptionPurchase toSubscriptionModel(NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity) {
        if (noteinGoogleSubscriptionPurchaseEntity == null) {
            return null;
        }
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = new NoteinGoogleSubscriptionPurchase();
        noteinGoogleSubscriptionPurchase.setPurchaseToken(noteinGoogleSubscriptionPurchaseEntity.getPurchaseToken());
        noteinGoogleSubscriptionPurchase.setUserId(noteinGoogleSubscriptionPurchaseEntity.getUserId());
        noteinGoogleSubscriptionPurchase.setAcknowledgementState(noteinGoogleSubscriptionPurchaseEntity.getAcknowledgementState());
        noteinGoogleSubscriptionPurchase.setSubscriptionState(noteinGoogleSubscriptionPurchaseEntity.getSubscriptionState());
        noteinGoogleSubscriptionPurchase.setStatus(noteinGoogleSubscriptionPurchaseEntity.getStatus());
        fillModel(noteinGoogleSubscriptionPurchaseEntity, noteinGoogleSubscriptionPurchase);
        return noteinGoogleSubscriptionPurchase;
    }
}
