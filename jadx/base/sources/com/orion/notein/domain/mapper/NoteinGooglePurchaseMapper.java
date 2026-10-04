package com.orion.notein.domain.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteinGooglePurchaseMapper {
    private Gson gson = new Gson();

    public void fillEntity(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase, NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity) {
        noteinGoogleSubscriptionPurchaseEntity.setLineItemsJson(this.gson.toJson(noteinGoogleSubscriptionPurchase.getLineItems()));
    }

    public void fillModel(NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity, NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase) {
        noteinGoogleSubscriptionPurchase.setLineItems((List) this.gson.fromJson(noteinGoogleSubscriptionPurchaseEntity.getLineItemsJson(), new TypeToken<ArrayList<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem>>() { // from class: com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper.1
        }.getType()));
    }

    public abstract NoteinGoogleInAppPurchaseEntity toInAppEntity(NoteinGoogleInAppPurchase noteinGoogleInAppPurchase);

    public abstract NoteinGoogleInAppPurchase toInAppModel(NoteinGoogleInAppPurchaseEntity noteinGoogleInAppPurchaseEntity);

    public abstract NoteinGoogleSubscriptionPurchaseEntity toSubscriptionEntity(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase);

    public abstract NoteinGoogleSubscriptionPurchase toSubscriptionModel(NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity);
}
