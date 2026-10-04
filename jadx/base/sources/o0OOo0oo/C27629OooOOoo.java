package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import java.util.Iterator;
import java.util.List;
import o0OOoO00.C27723OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27629OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo f97153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27723OooO0O0 f97154OooO0O0;

    public C27629OooOOoo(o000OOo recomputeSyncState, C27723OooO0O0 cloudSyncFacade) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recomputeSyncState, "recomputeSyncState");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncFacade, "cloudSyncFacade");
        this.f97153OooO00o = recomputeSyncState;
        this.f97154OooO0O0 = cloudSyncFacade;
    }

    public static final void OooO00o(C27629OooOOoo c27629OooOOoo, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SyncEvent syncEvent = (SyncEvent) it.next();
            boolean z = syncEvent instanceof SyncEvent.PackageFailed;
            C27723OooO0O0 c27723OooO0O0 = c27629OooOOoo.f97154OooO0O0;
            if (z) {
                SyncEvent.PackageFailed packageFailed = (SyncEvent.PackageFailed) syncEvent;
                String metaId = packageFailed.getId();
                Throwable error = packageFailed.getError();
                c27723OooO0O0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId, "metaId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(error, "error");
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.PackageFailed(metaId, error));
            } else if (syncEvent instanceof SyncEvent.UploadFailed) {
                SyncEvent.UploadFailed uploadFailed = (SyncEvent.UploadFailed) syncEvent;
                String metaId2 = uploadFailed.getId();
                Throwable error2 = uploadFailed.getError();
                c27723OooO0O0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId2, "metaId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(error2, "error");
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.UploadFailed(metaId2, error2, null, 4, null));
            } else if (syncEvent instanceof SyncEvent.DownloadFailed) {
                SyncEvent.DownloadFailed downloadFailed = (SyncEvent.DownloadFailed) syncEvent;
                String metaId3 = downloadFailed.getId();
                Throwable error3 = downloadFailed.getError();
                c27723OooO0O0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId3, "metaId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(error3, "error");
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.DownloadFailed(metaId3, error3));
            } else if (syncEvent instanceof SyncEvent.RestoreFailed) {
                SyncEvent.RestoreFailed restoreFailed = (SyncEvent.RestoreFailed) syncEvent;
                String metaId4 = restoreFailed.getId();
                CloudMetaType metaType = restoreFailed.getMetaType();
                Throwable error4 = restoreFailed.getError();
                c27723OooO0O0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId4, "metaId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaType, "metaType");
                kotlin.jvm.internal.OooOOO0.OooO0oO(error4, "error");
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.RestoreFailed(metaId4, metaType, error4));
            } else if (syncEvent instanceof SyncEvent.ResolveFailed) {
                SyncEvent.ResolveFailed resolveFailed = (SyncEvent.ResolveFailed) syncEvent;
                String metaId5 = resolveFailed.getId();
                Throwable error5 = resolveFailed.getError();
                c27723OooO0O0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId5, "metaId");
                kotlin.jvm.internal.OooOOO0.OooO0oO(error5, "error");
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.ResolveFailed(metaId5, error5));
            } else if (syncEvent instanceof SyncEvent.LocalDeleted) {
                String metaId6 = ((SyncEvent.LocalDeleted) syncEvent).getId();
                c27723OooO0O0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId6, "metaId");
                c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.LocalDeleted(metaId6));
            } else if (syncEvent instanceof SyncEvent.LocalModified) {
                SyncEvent.LocalModified localModified = (SyncEvent.LocalModified) syncEvent;
                c27723OooO0O0.OooO0OO(localModified.getId(), localModified.getMetaType());
            } else if (syncEvent instanceof SyncEvent.CloudDeleted) {
                SyncEvent.CloudDeleted cloudDeleted = (SyncEvent.CloudDeleted) syncEvent;
                c27723OooO0O0.OooO00o(cloudDeleted.getId(), cloudDeleted.getDirtyCloudMeta());
            } else if (syncEvent instanceof SyncEvent.CloudModified) {
                SyncEvent.CloudModified cloudModified = (SyncEvent.CloudModified) syncEvent;
                c27723OooO0O0.OooO0O0(cloudModified.getId(), cloudModified.getDirtyCloudMeta());
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncHealth");
                c20358OooO00o.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unexpected event type from RecomputeSyncStateUseCase: ", syncEvent.getName()), new Object[0]);
            }
        }
    }
}
