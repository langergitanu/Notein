package o0OOoO0O;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.SyncContext;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncState;
import com.orion.notein.domain.models.cloudsync.SyncStateKt;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoO0O.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27746OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<String, SyncContext> f97943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<SyncPhase> f97944OooO0OO;

    public C27746OooOo00(InterfaceC27605OooO00o cloudSyncRepo, ConcurrentHashMap<String, SyncContext> sessionContexts) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionContexts, "sessionContexts");
        this.f97942OooO00o = cloudSyncRepo;
        this.f97943OooO0O0 = sessionContexts;
        this.f97944OooO0OO = oOo000Oo.OooOOO.OoooOo0(new SyncPhase[]{SyncPhase.CLEAN, SyncPhase.PACKAGING, SyncPhase.DOWNLOADING, SyncPhase.RESOLVING_CONFLICT});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(SyncEvent syncEvent, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27742OooOOo0 c27742OooOOo0;
        SyncState syncStateReduce$default;
        SyncState syncState;
        SyncState syncState2;
        CloudMetaLocal cloudMetaLocal2;
        C27746OooOo00 c27746OooOo00;
        SyncEvent syncEvent2;
        C32443OooOOO c32443OooOOO;
        int i;
        SyncState syncState3;
        int i2;
        int i3;
        int i4;
        SyncState syncState4;
        ?? r12;
        ?? r7;
        if (abstractC32479OooO0OO instanceof C27742OooOOo0) {
            c27742OooOOo0 = (C27742OooOOo0) abstractC32479OooO0OO;
            int i5 = c27742OooOOo0.f97926Oooo00O;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c27742OooOOo0.f97926Oooo00O = i5 - Integer.MIN_VALUE;
            } else {
                c27742OooOOo0 = new C27742OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        C27742OooOOo0 c27742OooOOo02 = c27742OooOOo0;
        Object objOooO0O0 = c27742OooOOo02.f97924OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i6 = c27742OooOOo02.f97926Oooo00O;
        if (i6 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            SyncState syncState5 = cloudMetaLocal.getSyncState();
            if ((syncEvent instanceof SyncEvent.LocalDeleted) && cloudMetaLocal.getDeletedRemote()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("StateTransition");
                c20358OooO00o.OooO0o0(C20593OooO0Oo.OooO0O0("LocalDeleted: remote already deleted for ", cloudMetaLocal.getId(), ", mark CLEAN"), new Object[0]);
                syncStateReduce$default = syncState5.withPhase(SyncPhase.CLEAN);
            } else if ((syncEvent instanceof SyncEvent.RequestPush) && cloudMetaLocal.getDeleted() && cloudMetaLocal.getDeletedRemote()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("StateTransition");
                c20358OooO00o2.OooO0o0(C20593OooO0Oo.OooO0O0("RequestPush: already deleted remotely for ", cloudMetaLocal.getId(), ", mark CLEAN"), new Object[0]);
                syncStateReduce$default = syncState5.withPhase(SyncPhase.CLEAN);
            } else {
                syncStateReduce$default = SyncStateKt.reduce$default(syncState5, syncEvent, null, 4, null);
            }
            SyncState syncState6 = syncStateReduce$default;
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("StateTransition");
            c20358OooO00o3.OooO0o0("CloudMeta " + cloudMetaLocal.getId() + " state: " + syncState5 + " -> " + syncState6 + " on event: " + syncEvent, new Object[0]);
            String id = cloudMetaLocal.getId();
            c27742OooOOo02.f97917OooOo0o = this;
            c27742OooOOo02.f97916OooOo = syncEvent;
            c27742OooOOo02.f97919OooOoO0 = cloudMetaLocal;
            c27742OooOOo02.f97918OooOoO = syncState5;
            c27742OooOOo02.f97920OooOoOO = syncState6;
            c27742OooOOo02.f97926Oooo00O = 1;
            if (OooO0OO(id, syncState5, syncState6, syncEvent, c27742OooOOo02) != enumC32485OooO00o) {
                syncState = syncState5;
                syncState2 = syncState6;
                cloudMetaLocal2 = cloudMetaLocal;
                c27746OooOo00 = this;
                syncEvent2 = syncEvent;
            }
            return enumC32485OooO00o;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c27742OooOOo02.f97923OooOooO;
            i2 = c27742OooOOo02.f97921OooOoo;
            i4 = c27742OooOOo02.f97922OooOoo0;
            syncState3 = (SyncState) c27742OooOOo02.f97916OooOo;
            syncState4 = (SyncState) c27742OooOOo02.f97917OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            r12 = i3;
            r7 = i2;
            i = i4;
            syncState2 = syncState3;
            cloudMetaLocal2 = (CloudMetaLocal) objOooO0O0;
            syncState = syncState4;
            return new C27749OooOoO(cloudMetaLocal2, syncState, syncState2, (i != 0 && r7 == 0 && r12 == 0) ? false : true);
        }
        syncState2 = c27742OooOOo02.f97920OooOoOO;
        SyncState syncState7 = c27742OooOOo02.f97918OooOoO;
        cloudMetaLocal2 = c27742OooOOo02.f97919OooOoO0;
        syncEvent2 = (SyncEvent) c27742OooOOo02.f97916OooOo;
        C27746OooOo00 c27746OooOo002 = (C27746OooOo00) c27742OooOOo02.f97917OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        syncState = syncState7;
        c27746OooOo00 = c27746OooOo002;
        String id2 = cloudMetaLocal2.getId();
        String lastErrorCode = cloudMetaLocal2.getLastErrorCode();
        c27746OooOo00.getClass();
        Throwable error = syncEvent2 instanceof SyncEvent.UploadFailed ? ((SyncEvent.UploadFailed) syncEvent2).getError() : syncEvent2 instanceof SyncEvent.DownloadFailed ? ((SyncEvent.DownloadFailed) syncEvent2).getError() : syncEvent2 instanceof SyncEvent.PackageFailed ? ((SyncEvent.PackageFailed) syncEvent2).getError() : syncEvent2 instanceof SyncEvent.RestoreFailed ? ((SyncEvent.RestoreFailed) syncEvent2).getError() : syncEvent2 instanceof SyncEvent.ResolveFailed ? ((SyncEvent.ResolveFailed) syncEvent2).getError() : null;
        if (error instanceof CloudSyncError.ResetStuck) {
            c32443OooOOO = new C32443OooOOO(Boolean.FALSE, lastErrorCode);
        } else {
            String errorCode = error instanceof CloudSyncError ? ((CloudSyncError) error).getErrorCode() : error == null ? null : CloudSyncError.CODE_INTERNAL;
            if (errorCode != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o4, "StateTransition", "Error recorded for ", id2, ": ");
                sbOooO00o.append(errorCode);
                c20358OooO00o4.OooOO0O(sbOooO00o.toString(), new Object[0]);
                c32443OooOOO = new C32443OooOOO(Boolean.TRUE, errorCode);
            } else if (c27746OooOo00.f97944OooO0OO.contains(syncState2.getPhase())) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOO0(androidx.core.app.OooO.OooO0O0(c20358OooO00o5, "StateTransition", "Error cleared for ", id2), new Object[0]);
                c32443OooOOO = new C32443OooOOO(Boolean.TRUE, null);
            } else {
                c32443OooOOO = new C32443OooOOO(Boolean.FALSE, lastErrorCode);
            }
        }
        boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
        String str = (String) c32443OooOOO.f116637OooOo;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(syncState2, syncState);
        i = !zOooO0O0 ? 1 : 0;
        boolean z = syncEvent2 instanceof SyncEvent.LocalDeleted;
        boolean z2 = syncEvent2 instanceof SyncEvent.CloudDeleted;
        r7 = z;
        r12 = z2;
        if (zBooleanValue || !zOooO0O0 || z) {
            c27742OooOOo02.f97917OooOo0o = syncState;
            c27742OooOOo02.f97916OooOo = syncState2;
            c27742OooOOo02.f97919OooOoO0 = null;
            c27742OooOOo02.f97918OooOoO = null;
            c27742OooOOo02.f97920OooOoOO = null;
            c27742OooOOo02.f97922OooOoo0 = i;
            c27742OooOOo02.f97921OooOoo = z ? 1 : 0;
            c27742OooOOo02.f97923OooOooO = z2 ? 1 : 0;
            c27742OooOOo02.f97926Oooo00O = 2;
            SyncState syncState8 = syncState2;
            objOooO0O0 = c27746OooOo00.OooO0O0(cloudMetaLocal2, syncState8, str, z, c27742OooOOo02);
            if (objOooO0O0 != enumC32485OooO00o) {
                syncState3 = syncState8;
                i2 = z ? 1 : 0;
                i3 = z2 ? 1 : 0;
                i4 = i;
                syncState4 = syncState;
                r12 = i3;
                r7 = i2;
                i = i4;
                syncState2 = syncState3;
                cloudMetaLocal2 = (CloudMetaLocal) objOooO0O0;
                syncState = syncState4;
            }
            return enumC32485OooO00o;
        }
        return new C27749OooOoO(cloudMetaLocal2, syncState, syncState2, (i != 0 && r7 == 0 && r12 == 0) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(CloudMetaLocal cloudMetaLocal, SyncState syncState, String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27741OooOOo c27741OooOOo;
        if (abstractC32479OooO0OO instanceof C27741OooOOo) {
            c27741OooOOo = (C27741OooOOo) abstractC32479OooO0OO;
            int i = c27741OooOOo.f97914OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27741OooOOo.f97914OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27741OooOOo = new C27741OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27741OooOOo.f97912OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27741OooOOo.f97914OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CloudMetaLocal cloudMetaLocal2 = c27741OooOOo.f97913OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return cloudMetaLocal2;
        }
        C32446OooOOOo.OooO0O0(obj);
        CloudMetaLocal cloudMetaLocalCopy$default = z ? CloudMetaLocal.copy$default(cloudMetaLocal, null, null, null, 0, null, null, null, syncState, true, false, 0L, str, 1663, null) : CloudMetaLocal.copy$default(cloudMetaLocal, null, null, null, 0, null, null, null, syncState, false, false, 0L, str, 1919, null);
        c27741OooOOo.f97913OooOo0o = cloudMetaLocalCopy$default;
        c27741OooOOo.f97914OooOoO = 1;
        return this.f97942OooO00o.OooOOOO(cloudMetaLocalCopy$default, c27741OooOOo) == enumC32485OooO00o ? enumC32485OooO00o : cloudMetaLocalCopy$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, SyncState syncState, SyncState syncState2, SyncEvent syncEvent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27743OooOOoo c27743OooOOoo;
        String sessionId;
        SyncContext empty;
        CloudMetaRemote dirtyCloudMeta;
        C27746OooOo00 c27746OooOo00;
        String str2;
        String str3 = str;
        if (abstractC32479OooO0OO instanceof C27743OooOOoo) {
            c27743OooOOoo = (C27743OooOOoo) abstractC32479OooO0OO;
            int i = c27743OooOOoo.f97932OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27743OooOOoo.f97932OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27743OooOOoo = new C27743OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27743OooOOoo.f97931OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27743OooOOoo.f97932OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            SyncPhase phase = syncState2.getPhase();
            SyncPhase syncPhase = SyncPhase.CLEAN;
            ConcurrentHashMap<String, SyncContext> concurrentHashMap = this.f97943OooO0O0;
            if (phase == syncPhase) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "StateTransition", "SessionContext cleared for ", str3), new Object[0]);
                concurrentHashMap.remove(syncState.getSessionId());
                return C32460OooOooO.f116667OooO00o;
            }
            sessionId = syncState2.getSessionId();
            if (C33599OooOo0O.Oooo0o0(sessionId)) {
                sessionId = syncState.getSessionId();
            }
            if (C33599OooOo0O.Oooo0o0(sessionId)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOO0O(C22201OooO0oO.OooO0O0(c20358OooO00o2, "StateTransition", "sessionId missing for ", str3, ", context update skipped"), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            empty = concurrentHashMap.get(sessionId);
            if (empty == null) {
                empty = SyncContext.INSTANCE.getEmpty();
            }
            dirtyCloudMeta = syncEvent.getPayload().getDirtyCloudMeta();
            if (dirtyCloudMeta == null && (dirtyCloudMeta = empty.getDirtyCloudMeta()) == null) {
                if (syncEvent instanceof SyncEvent.RequestPull) {
                    c27743OooOOoo.f97928OooOo0o = this;
                    c27743OooOOoo.f97927OooOo = str3;
                    c27743OooOOoo.f97930OooOoO0 = sessionId;
                    c27743OooOOoo.f97929OooOoO = empty;
                    c27743OooOOoo.f97932OooOoo = 1;
                    Object objOooo0 = this.f97942OooO00o.Oooo0(str3, c27743OooOOoo);
                    if (objOooo0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str2 = sessionId;
                    obj = objOooo0;
                    c27746OooOo00 = this;
                } else {
                    dirtyCloudMeta = null;
                }
            }
            c27746OooOo00 = this;
            CloudMetaRemote cloudMetaRemote = dirtyCloudMeta;
            c27746OooOo00.f97943OooO0O0.put(sessionId, SyncContext.copy$default(empty, cloudMetaRemote, 0, 0L, 0, 14, null));
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("StateTransition");
            c20358OooO00o3.OooO00o("SessionContext updated for " + str3 + ". dirtyCloudMeta=" + (cloudMetaRemote != null), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SyncContext syncContext = c27743OooOOoo.f97929OooOoO;
        str2 = c27743OooOOoo.f97930OooOoO0;
        String str4 = c27743OooOOoo.f97927OooOo;
        c27746OooOo00 = c27743OooOOoo.f97928OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        empty = syncContext;
        str3 = str4;
        dirtyCloudMeta = (CloudMetaRemote) obj;
        sessionId = str2;
        CloudMetaRemote cloudMetaRemote2 = dirtyCloudMeta;
        c27746OooOo00.f97943OooO0O0.put(sessionId, SyncContext.copy$default(empty, cloudMetaRemote2, 0, 0L, 0, 14, null));
        C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o32.OooOOO0("StateTransition");
        if (cloudMetaRemote2 != null) {
        }
        c20358OooO00o32.OooO00o("SessionContext updated for " + str3 + ". dirtyCloudMeta=" + (cloudMetaRemote2 != null), new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
