package com.orion.notein.domain.mapper;

import com.google.gson.Gson;
import com.orion.notein.data.p602db.entity.NoteinAiQuotaRecordEntityV2;
import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteinAiQuotaRecordMapper {
    private Gson gson = new Gson();

    public void fillEntity(NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2, NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2) {
        NoteinAiQuotaRecordV2.UsageMetadata usageMetadata = noteinAiQuotaRecordV2.getUsageMetadata();
        if (usageMetadata != null) {
            noteinAiQuotaRecordEntityV2.setUsageMetadataJson(this.gson.toJson(usageMetadata));
        }
    }

    public void fillModel(NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2, NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2) {
        String usageMetadataJson = noteinAiQuotaRecordEntityV2.getUsageMetadataJson();
        if (usageMetadataJson != null) {
            noteinAiQuotaRecordV2.setUsageMetadata((NoteinAiQuotaRecordV2.UsageMetadata) this.gson.fromJson(usageMetadataJson, NoteinAiQuotaRecordV2.UsageMetadata.class));
        }
    }

    public abstract NoteinAiQuotaRecordV2 fromEntity(NoteinAiQuotaRecordEntityV2 noteinAiQuotaRecordEntityV2);

    public abstract NoteinAiQuotaRecordEntityV2 toEntity(NoteinAiQuotaRecordV2 noteinAiQuotaRecordV2);
}
