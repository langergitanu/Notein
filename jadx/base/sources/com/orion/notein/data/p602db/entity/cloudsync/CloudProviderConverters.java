package com.orion.notein.data.p602db.entity.cloudsync;

import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.SyncState;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0OO00OO.OooO00o;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33599OooOo0O;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;
import oOo00O0O.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0014H\u0007¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/cloudsync/CloudProviderConverters;", "", "<init>", "()V", "toProvider", "Lcom/orion/notein/data/db/entity/cloudsync/CloudProvider;", "id", "", "fromProvider", "provider", "toCloudMetaExtra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "raw", "fromCloudMetaExtra", "extra", "toCloudContentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "fromCloudContentTag", "hashes", "toCloudSyncState", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", "fromCloudSyncState", "state", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudProviderConverters {
    private static final String EMPTY_CLOUD_SYNC_STATE = "{syncPhase:\"CLEAN\",sessionId:\"\"}";
    private static final String EMPTY_EXTRA_JSON = "{}";
    private static final AbstractC34457OooO0OO json = C34467OooOo0.OooO00o(new OooO00o(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO json$lambda$0(OooO0o Json) {
        OooOOO0.OooO0oO(Json, "$this$Json");
        Json.f123498OooO0OO = true;
        return C32460OooOooO.f116667OooO00o;
    }

    public final String fromCloudContentTag(CloudContentTag hashes) {
        if (hashes == null) {
            return null;
        }
        AbstractC34457OooO0OO abstractC34457OooO0OO = json;
        abstractC34457OooO0OO.getClass();
        return abstractC34457OooO0OO.OooO00o(CloudContentTag.INSTANCE.serializer(), hashes);
    }

    public final String fromCloudMetaExtra(CloudMetaExtra extra) {
        if (extra == null) {
            return EMPTY_EXTRA_JSON;
        }
        AbstractC34457OooO0OO abstractC34457OooO0OO = json;
        abstractC34457OooO0OO.getClass();
        return abstractC34457OooO0OO.OooO00o(CloudMetaExtra.INSTANCE.serializer(), extra);
    }

    public final String fromCloudSyncState(SyncState state) {
        OooOOO0.OooO0oO(state, "state");
        AbstractC34457OooO0OO abstractC34457OooO0OO = json;
        abstractC34457OooO0OO.getClass();
        return abstractC34457OooO0OO.OooO00o(SyncState.INSTANCE.serializer(), state);
    }

    public final String fromProvider(CloudProvider provider) {
        OooOOO0.OooO0oO(provider, "provider");
        return provider.getId();
    }

    public final CloudContentTag toCloudContentTag(String raw) {
        if (raw == null || C33599OooOo0O.Oooo0o0(raw)) {
            return null;
        }
        AbstractC34457OooO0OO abstractC34457OooO0OO = json;
        abstractC34457OooO0OO.getClass();
        return (CloudContentTag) abstractC34457OooO0OO.OooO0O0(raw, CloudContentTag.INSTANCE.serializer());
    }

    public final CloudMetaExtra toCloudMetaExtra(String raw) {
        if (raw != null && !C33599OooOo0O.Oooo0o0(raw)) {
            AbstractC34457OooO0OO abstractC34457OooO0OO = json;
            abstractC34457OooO0OO.getClass();
            return (CloudMetaExtra) abstractC34457OooO0OO.OooO0O0(raw, CloudMetaExtra.INSTANCE.serializer());
        }
        return new CloudMetaExtra((String) null, (String) null, (String) null, (Long) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (String) null, 131071, (C24018OooO0oo) null);
    }

    public final SyncState toCloudSyncState(String raw) {
        OooOOO0.OooO0oO(raw, "raw");
        AbstractC34457OooO0OO abstractC34457OooO0OO = json;
        abstractC34457OooO0OO.getClass();
        return (SyncState) abstractC34457OooO0OO.OooO0O0(raw, SyncState.INSTANCE.serializer());
    }

    public final CloudProvider toProvider(String id) {
        return CloudProvider.INSTANCE.fromId(id);
    }
}
