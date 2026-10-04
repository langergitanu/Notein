package com.orion.notein.domain.mapper.cloudsync;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000bH'J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0005¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/cloudsync/CloudMetaMapper;", "", "<init>", "()V", "toLocalEntity", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaLocalEntity;", "domain", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaLocal;", "toLocalDomain", "entity", "toRemoteEntity", "Lcom/orion/notein/data/db/entity/cloudsync/CloudMetaRemoteEntity;", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "toRemoteDomain", "ensureExtra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "extra", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class CloudMetaMapper {
    public final CloudMetaExtra ensureExtra(CloudMetaExtra extra) {
        return extra == null ? new CloudMetaExtra((String) null, (String) null, (String) null, (Long) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, 131071, (C24018OooO0oo) null) : extra;
    }

    public abstract CloudMetaLocal toLocalDomain(CloudMetaLocalEntity entity);

    public abstract CloudMetaLocalEntity toLocalEntity(CloudMetaLocal domain);

    public abstract CloudMetaRemote toRemoteDomain(CloudMetaRemoteEntity entity);

    public abstract CloudMetaRemoteEntity toRemoteEntity(CloudMetaRemote domain);
}
