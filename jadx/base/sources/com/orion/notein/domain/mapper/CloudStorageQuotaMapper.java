package com.orion.notein.domain.mapper;

import com.orion.notein.domain.models.cloud.GoogleStorageQuota;
import com.orion.notein.domain.models.cloud.HuaweiStorageQuota;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;

/* JADX INFO: loaded from: classes9.dex */
public interface CloudStorageQuotaMapper {
    NoteCloudQuota toModel(GoogleStorageQuota googleStorageQuota);

    NoteCloudQuota toModel(HuaweiStorageQuota huaweiStorageQuota);
}
