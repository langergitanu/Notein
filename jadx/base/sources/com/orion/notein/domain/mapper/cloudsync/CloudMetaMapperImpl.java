package com.orion.notein.domain.mapper.cloudsync;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;

/* JADX INFO: loaded from: classes9.dex */
public class CloudMetaMapperImpl extends CloudMetaMapper {
    @Override // com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper
    public CloudMetaLocal toLocalDomain(CloudMetaLocalEntity cloudMetaLocalEntity) {
        if (cloudMetaLocalEntity == null) {
            return null;
        }
        return new CloudMetaLocal(cloudMetaLocalEntity.getId(), cloudMetaLocalEntity.getDriveId(), cloudMetaLocalEntity.getMimeType(), cloudMetaLocalEntity.getMetaVersion(), cloudMetaLocalEntity.getContentTag(), cloudMetaLocalEntity.getMetaHash(), cloudMetaLocalEntity.getStagedContentTag(), cloudMetaLocalEntity.getSyncState(), cloudMetaLocalEntity.getDeleted(), cloudMetaLocalEntity.getDeletedRemote(), cloudMetaLocalEntity.getLastModificationTime(), cloudMetaLocalEntity.getLastErrorCode());
    }

    @Override // com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper
    public CloudMetaLocalEntity toLocalEntity(CloudMetaLocal cloudMetaLocal) {
        if (cloudMetaLocal == null) {
            return null;
        }
        return new CloudMetaLocalEntity(cloudMetaLocal.getId(), cloudMetaLocal.getDriveId(), cloudMetaLocal.getMimeType(), cloudMetaLocal.getMetaVersion(), cloudMetaLocal.getSyncState(), cloudMetaLocal.getLastModificationTime(), cloudMetaLocal.getMetaHash(), cloudMetaLocal.getContentTag(), cloudMetaLocal.getStagedContentTag(), cloudMetaLocal.getDeleted(), cloudMetaLocal.getDeletedRemote(), cloudMetaLocal.getLastErrorCode());
    }

    @Override // com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper
    public CloudMetaRemote toRemoteDomain(CloudMetaRemoteEntity cloudMetaRemoteEntity) {
        if (cloudMetaRemoteEntity == null) {
            return null;
        }
        CloudMetaExtra cloudMetaExtraEnsureExtra = ensureExtra(cloudMetaRemoteEntity.getExtra());
        return new CloudMetaRemote(cloudMetaRemoteEntity.getId(), cloudMetaRemoteEntity.getDriveId(), cloudMetaRemoteEntity.getMimeType(), cloudMetaRemoteEntity.getMetaVersion(), cloudMetaRemoteEntity.getContentTag(), cloudMetaRemoteEntity.getMetaHash(), cloudMetaRemoteEntity.getDeleted() == 1, cloudMetaRemoteEntity.getDriveObjectKey(), cloudMetaRemoteEntity.getLastSyncTime(), cloudMetaExtraEnsureExtra);
    }

    @Override // com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper
    public CloudMetaRemoteEntity toRemoteEntity(CloudMetaRemote cloudMetaRemote) {
        if (cloudMetaRemote == null) {
            return null;
        }
        return new CloudMetaRemoteEntity(cloudMetaRemote.getId(), cloudMetaRemote.getDriveId(), cloudMetaRemote.getMimeType(), cloudMetaRemote.getMetaVersion(), cloudMetaRemote.getMetaHash(), cloudMetaRemote.getDriveObjectKey(), cloudMetaRemote.getLastSyncTime(), cloudMetaRemote.getContentTag(), cloudMetaRemote.getDeleted() ? 1L : 0L, cloudMetaRemote.getExtra());
    }
}
