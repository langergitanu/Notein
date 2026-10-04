package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinAiQuotaRecordEntityV2;
import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;

/* JADX INFO: loaded from: classes9.dex */
public class NoteinAiQuotaRecordMapperImpl extends NoteinAiQuotaRecordMapper {
    @Override // com.orion.notein.domain.mapper.NoteinAiQuotaRecordMapper
    public NoteinAiQuotaRecordV2 fromEntity(NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2) {
        if (noteinAiQuotaRecordEntityV2 == null) {
            return null;
        }
        NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2 = new NoteinAiQuotaRecordV2();
        noteinAiQuotaRecordV2.setId(noteinAiQuotaRecordEntityV2.getId());
        noteinAiQuotaRecordV2.setUserId(noteinAiQuotaRecordEntityV2.getUserId());
        noteinAiQuotaRecordV2.setAmount(noteinAiQuotaRecordEntityV2.getAmount());
        noteinAiQuotaRecordV2.setSourceType(noteinAiQuotaRecordEntityV2.getSourceType());
        noteinAiQuotaRecordV2.setLinkPurchaseToken(noteinAiQuotaRecordEntityV2.getLinkPurchaseToken());
        noteinAiQuotaRecordV2.setCreatedAt(noteinAiQuotaRecordEntityV2.getCreatedAt());
        fillModel(noteinAiQuotaRecordEntityV2, noteinAiQuotaRecordV2);
        return noteinAiQuotaRecordV2;
    }

    @Override // com.orion.notein.domain.mapper.NoteinAiQuotaRecordMapper
    public NoteinAiQuotaRecordEntityV2 toEntity(NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2) {
        if (noteinAiQuotaRecordV2 == null) {
            return null;
        }
        NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2 = new NoteinAiQuotaRecordEntityV2();
        noteinAiQuotaRecordEntityV2.setId(noteinAiQuotaRecordV2.getId());
        noteinAiQuotaRecordEntityV2.setUserId(noteinAiQuotaRecordV2.getUserId());
        noteinAiQuotaRecordEntityV2.setAmount(noteinAiQuotaRecordV2.getAmount());
        noteinAiQuotaRecordEntityV2.setSourceType(noteinAiQuotaRecordV2.getSourceType());
        noteinAiQuotaRecordEntityV2.setLinkPurchaseToken(noteinAiQuotaRecordV2.getLinkPurchaseToken());
        noteinAiQuotaRecordEntityV2.setCreatedAt(noteinAiQuotaRecordV2.getCreatedAt());
        fillEntity(noteinAiQuotaRecordV2, noteinAiQuotaRecordEntityV2);
        return noteinAiQuotaRecordEntityV2;
    }
}
