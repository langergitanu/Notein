package com.orion.notein.domain.mapper;

import com.orion.notein.domain.models.cloud.GoogleStorageQuota;
import com.orion.notein.domain.models.cloud.HuaweiStorageQuota;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;

/* JADX INFO: loaded from: classes9.dex */
public class CloudStorageQuotaMapperImpl implements CloudStorageQuotaMapper {
    @Override // com.orion.notein.domain.mapper.CloudStorageQuotaMapper
    public NoteCloudQuota toModel(HuaweiStorageQuota huaweiStorageQuota) {
        if (huaweiStorageQuota == null) {
            return null;
        }
        return new NoteCloudQuota(huaweiStorageQuota.getUserCapacity(), huaweiStorageQuota.getUsedSpace());
    }

    @Override // com.orion.notein.domain.mapper.CloudStorageQuotaMapper
    public NoteCloudQuota toModel(GoogleStorageQuota googleStorageQuota) {
        if (googleStorageQuota == null) {
            return null;
        }
        return new NoteCloudQuota(googleStorageQuota.getUserCapacity(), googleStorageQuota.getUsedSpace());
    }
}
