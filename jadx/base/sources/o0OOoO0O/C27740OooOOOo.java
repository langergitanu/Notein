package o0OOoO0O;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22212OooOoO0;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.ConflictResolution;
import com.orion.notein.domain.models.cloudsync.SyncContext;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncPostAction;
import com.orion.notein.domain.models.cloudsync.SyncState;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27643Oooo0;
import o0OOo0oo.C27677o00000oo;
import o0OOo0oo.C27684o0000o0;
import o0OOo0oo.C27696o000Ooo;
import o0OOo0oo.o0000;
import o0OOo0oo.o00000O;
import o0OOo0oo.o000OO;
import o0OOo0oo.o0OOO0o;
import o0OOoO00.C27722OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoO0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27740OooOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27684o0000o0 f97899OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f97900OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27696o000Ooo f97901OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OO f97902OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27677o00000oo f97903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000 f97904OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27643Oooo0 f97905OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O f97906OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97907OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ConcurrentHashMap<String, SyncContext> f97908OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000OO00.OooOOOO f97909OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27747OooOo0O f97910OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Set<SyncPhase> f97911OooOOO0;

    public C27740OooOOOo(o0OOO0o o0ooo0o2, C27696o000Ooo c27696o000Ooo, o000OO o000oo2, C27677o00000oo resolveConflict, C27643Oooo0 c27643Oooo0, o0000 resolveRemoteNotFound, o00000O o00000o, InterfaceC27605OooO00o cloudSyncRepo, C27684o0000o0 notificationBus, ConcurrentHashMap sessionContexts, o000OO00.OooOOOO oooOOOO, C27747OooOo0O c27747OooOo0O) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(resolveConflict, "resolveConflict");
        kotlin.jvm.internal.OooOOO0.OooO0oO(resolveRemoteNotFound, "resolveRemoteNotFound");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notificationBus, "notificationBus");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionContexts, "sessionContexts");
        this.f97900OooO00o = o0ooo0o2;
        this.f97901OooO0O0 = c27696o000Ooo;
        this.f97902OooO0OO = o000oo2;
        this.f97903OooO0Oo = resolveConflict;
        this.f97905OooO0o0 = c27643Oooo0;
        this.f97904OooO0o = resolveRemoteNotFound;
        this.f97906OooO0oO = o00000o;
        this.f97907OooO0oo = cloudSyncRepo;
        this.f97899OooO = notificationBus;
        this.f97908OooOO0 = sessionContexts;
        this.f97909OooOO0O = oooOOOO;
        this.f97910OooOO0o = c27747OooOo0O;
        this.f97911OooOOO0 = oOo000Oo.OooOOO.OoooOo0(new SyncPhase[]{SyncPhase.CONFLICT, SyncPhase.RESOLVING_CONFLICT});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(SyncState syncState, SyncState syncState2, SyncEvent.DownloadSucceeded downloadSucceeded, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27733OooO0oo c27733OooO0oo;
        Object objOooO00o;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27733OooO0oo) {
            c27733OooO0oo = (C27733OooO0oo) abstractC32479OooO0OO;
            int i = c27733OooO0oo.f97863OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27733OooO0oo.f97863OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27733OooO0oo = new C27733OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27733OooO0oo.f97862OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27733OooO0oo.f97863OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (syncState.getPhase() != SyncPhase.DOWNLOADING || syncState2.getPhase() != SyncPhase.RESTORING) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SideEffectRunner");
                c20358OooO00o.OooOO0O("DownloadSucceeded: from=" + syncState + ", to=" + syncState2 + " skip restore", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            CloudMetaRemote cloudMetaRemote = (CloudMetaRemote) this.f97910OooOO0o.invoke(syncState2);
            if (cloudMetaRemote == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("SideEffectRunner");
                c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("DownloadSucceeded: dirtyCloudMeta is null for ", downloadSucceeded.getId()), new Object[0]);
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(downloadSucceeded.getBundle().getMimeType());
                kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaTypeFromMime);
                OooOOOo(new SyncEvent.RestoreFailed(downloadSucceeded.getId(), cloudMetaTypeFromMime, new CloudSyncError.Internal(new IllegalArgumentException("dirtyCloudMeta is null"))));
                return C32460OooOooO.f116667OooO00o;
            }
            CloudBundle bundle = downloadSucceeded.getBundle();
            c27733OooO0oo.f97860OooOo0o = this;
            c27733OooO0oo.f97859OooOo = downloadSucceeded;
            c27733OooO0oo.f97863OooOoOO = 1;
            objOooO00o = this.f97902OooO0OO.OooO00o(cloudMetaLocal, bundle, cloudMetaRemote, c27733OooO0oo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27740OooOOOo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            downloadSucceeded = c27733OooO0oo.f97859OooOo;
            c27740OooOOOo = c27733OooO0oo.f97860OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o == null) {
            c27740OooOOOo.OooOOOo(new SyncEvent.RestoreSucceeded(downloadSucceeded.getId(), (CloudMetaLocal) objOooO00o));
        } else {
            CloudMetaType cloudMetaTypeFromMime2 = CloudMetaType.INSTANCE.fromMime(downloadSucceeded.getBundle().getMimeType());
            kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaTypeFromMime2);
            c27740OooOOOo.OooOOOo(new SyncEvent.RestoreFailed(downloadSucceeded.getId(), cloudMetaTypeFromMime2, thOooO00o));
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final SyncPostAction OooO00o(SyncPostAction syncPostAction, SyncState syncState) {
        SyncContext syncContext;
        if (!(syncPostAction instanceof SyncPostAction.RetryPull)) {
            return syncPostAction;
        }
        String sessionId = syncState.getSessionId();
        boolean zOooo0o0 = C33599OooOo0O.Oooo0o0(sessionId);
        ConcurrentHashMap<String, SyncContext> concurrentHashMap = this.f97908OooOO0;
        int autoRetryDownloadCount = (zOooo0o0 || (syncContext = concurrentHashMap.get(sessionId)) == null) ? 0 : syncContext.getAutoRetryDownloadCount();
        if (autoRetryDownloadCount >= 3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SideEffectRunner");
            c20358OooO00o.OooOO0O("Max pull retry reached (" + autoRetryDownloadCount + " >= 3), giving up", new Object[0]);
            return SyncPostAction.None.INSTANCE;
        }
        String sessionId2 = syncState.getSessionId();
        if (C33599OooOo0O.Oooo0o0(sessionId2)) {
            return syncPostAction;
        }
        SyncContext empty = concurrentHashMap.get(sessionId2);
        if (empty == null) {
            empty = SyncContext.INSTANCE.getEmpty();
        }
        SyncContext syncContext2 = empty;
        concurrentHashMap.put(sessionId2, SyncContext.copy$default(syncContext2, null, 0, 0L, syncContext2.getAutoRetryDownloadCount() + 1, 7, null));
        return syncPostAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27727OooO0O0 c27727OooO0O0;
        C27740OooOOOo c27740OooOOOo;
        CloudMetaLocal cloudMetaLocal2;
        Object obj;
        String str2;
        Object obj2;
        Throwable thOooO00o;
        String str3 = str;
        if (abstractC32479OooO0OO instanceof C27727OooO0O0) {
            c27727OooO0O0 = (C27727OooO0O0) abstractC32479OooO0OO;
            int i = c27727OooO0O0.f97822OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27727OooO0O0.f97822OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27727OooO0O0 = new C27727OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj3 = c27727OooO0O0.f97819OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27727OooO0O0.f97822OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj3);
            if (cloudMetaLocal.getDeleted() || cloudMetaLocal.getStagedContentTag() == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SideEffectRunner");
            c20358OooO00o.OooO0o0("RequestPush: found staged content " + cloudMetaLocal.getStagedContentTag() + " for " + str3 + ", compensating", new Object[0]);
            c27727OooO0O0.f97818OooOo0o = this;
            c27727OooO0O0.f97817OooOo = str3;
            c27727OooO0O0.f97820OooOoO0 = cloudMetaLocal;
            c27727OooO0O0.f97822OooOoo0 = 1;
            Object objOooO0o0 = this.f97903OooO0Oo.OooO0o0(str3, false, c27727OooO0O0);
            if (objOooO0o0 != enumC32485OooO00o) {
                c27740OooOOOo = this;
                cloudMetaLocal2 = cloudMetaLocal;
                obj = objOooO0o0;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c27727OooO0O0.f97817OooOo;
            str2 = (String) c27727OooO0O0.f97818OooOo0o;
            C32446OooOOOo.OooO0O0(obj3);
            obj = obj2;
            str3 = str2;
            thOooO00o = C32445OooOOOO.OooO00o(obj);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "SideEffectRunner", "RequestPush: staged compensation failed for ", str3), new Object[0]);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        CloudMetaLocal cloudMetaLocal3 = c27727OooO0O0.f97820OooOoO0;
        String str4 = (String) c27727OooO0O0.f97817OooOo;
        c27740OooOOOo = (C27740OooOOOo) c27727OooO0O0.f97818OooOo0o;
        C32446OooOOOo.OooO0O0(obj3);
        obj = ((C32445OooOOOO) obj3).f116639OooOo0o;
        cloudMetaLocal2 = cloudMetaLocal3;
        str3 = str4;
        if (!(obj instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o3, "SideEffectRunner", "RequestPush: staged compensation succeeded for ", str3), new Object[0]);
            CloudMetaLocal resolvedMeta = ((ConflictResolution) obj).getResolvedMeta();
            CloudMetaLocal cloudMetaLocalCopy$default = CloudMetaLocal.copy$default(cloudMetaLocal2, null, null, null, resolvedMeta.getMetaVersion(), resolvedMeta.getContentTag(), resolvedMeta.getMetaHash(), null, null, false, resolvedMeta.getDeletedRemote(), resolvedMeta.getLastModificationTime(), null, 2439, null);
            InterfaceC27605OooO00o interfaceC27605OooO00o = c27740OooOOOo.f97907OooO0oo;
            c27727OooO0O0.f97818OooOo0o = str3;
            c27727OooO0O0.f97817OooOo = obj;
            c27727OooO0O0.f97820OooOoO0 = null;
            c27727OooO0O0.f97822OooOoo0 = 2;
            if (interfaceC27605OooO00o.OooOOOO(cloudMetaLocalCopy$default, c27727OooO0O0) != enumC32485OooO00o) {
                str2 = str3;
                obj2 = obj;
                obj = obj2;
                str3 = str2;
            }
            return enumC32485OooO00o;
        }
        thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o != null) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0259, code lost:
    
        if (r1.OooOOO(r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0278, code lost:
    
        if (r1.OooOOO0(r2, (com.orion.notein.domain.models.cloudsync.SyncEvent.RequestResolve) r11, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0295, code lost:
    
        if (r1.OooOOO(r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b5, code lost:
    
        if (r1.OooO0oo(r2, r3, (com.orion.notein.domain.models.cloudsync.SyncEvent.AutoResolveSucceeded) r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f9, code lost:
    
        if (r1.OooOOOO((com.orion.notein.domain.models.cloudsync.SyncEvent.UploadFailed) r11, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0387, code lost:
    
        if (r9 == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
    
        if (r1.OooOO0o(r2, r3, (com.orion.notein.domain.models.cloudsync.SyncEvent.RequestPush) r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
    
        if (r1.OooOO0(r2, r3, (com.orion.notein.domain.models.cloudsync.SyncEvent.PackageSucceeded) r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
    
        if (r1.OooOOO(r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x021e, code lost:
    
        if (r1.OooOO0O(r2, r3, (com.orion.notein.domain.models.cloudsync.SyncEvent.RequestPull) r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r1.OooO(r2, r3, (com.orion.notein.domain.models.cloudsync.SyncEvent.DownloadSucceeded) r11, r5, r6) == r0) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(SyncState syncState, SyncState syncState2, SyncEvent syncEvent, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27728OooO0OO c27728OooO0OO;
        SyncState syncState3;
        SyncState syncState4;
        CloudMetaLocal cloudMetaLocal2;
        C27740OooOOOo c27740OooOOOo;
        SyncEvent syncEvent2;
        CloudSyncError cloudSyncError;
        if (abstractC32479OooO0OO instanceof C27728OooO0OO) {
            c27728OooO0OO = (C27728OooO0OO) abstractC32479OooO0OO;
            int i = c27728OooO0OO.f97830OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27728OooO0OO.f97830OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27728OooO0OO = new C27728OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        C27728OooO0OO c27728OooO0OO2 = c27728OooO0OO;
        Object objOooOOo0 = c27728OooO0OO2.f97829OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27728OooO0OO2.f97830OooOooO) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                c27728OooO0OO2.f97824OooOo0o = this;
                c27728OooO0OO2.f97823OooOo = syncState;
                c27728OooO0OO2.f97826OooOoO0 = syncState2;
                c27728OooO0OO2.f97825OooOoO = syncEvent;
                c27728OooO0OO2.f97827OooOoOO = cloudMetaLocal;
                c27728OooO0OO2.f97830OooOooO = 1;
                syncState3 = syncState;
                syncState4 = syncState2;
                cloudMetaLocal2 = cloudMetaLocal;
                objOooOOo0 = OooOOo0(syncState3, syncState4, syncEvent, cloudMetaLocal2, c27728OooO0OO2);
                if (objOooOOo0 != enumC32485OooO00o) {
                    c27740OooOOOo = this;
                    syncEvent2 = syncEvent;
                    if (!((Boolean) objOooOOo0).booleanValue()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("SideEffectRunner");
                        c20358OooO00o.OooO0o0(C20593OooO0Oo.OooO0O0("AutoResolveConflict executed for ", syncEvent2.getId(), ", skip sideEffect"), new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (!(syncEvent2 instanceof SyncEvent.LocalDeleted)) {
                        if (!(syncEvent2 instanceof SyncEvent.LocalModified)) {
                            if (!(syncEvent2 instanceof SyncEvent.RequestPush)) {
                                if (!(syncEvent2 instanceof SyncEvent.PackageSucceeded)) {
                                    if (!(syncEvent2 instanceof SyncEvent.UploadSucceeded)) {
                                        if (!(syncEvent2 instanceof SyncEvent.CloudModified)) {
                                            if (!(syncEvent2 instanceof SyncEvent.CloudDeleted)) {
                                                if (!(syncEvent2 instanceof SyncEvent.RequestPull)) {
                                                    if (!(syncEvent2 instanceof SyncEvent.DownloadSucceeded)) {
                                                        if (!(syncEvent2 instanceof SyncEvent.RestoreSucceeded)) {
                                                            if (!(syncEvent2 instanceof SyncEvent.RequestResolve)) {
                                                                if (!(syncEvent2 instanceof SyncEvent.ResolveSucceeded)) {
                                                                    if (!(syncEvent2 instanceof SyncEvent.AutoResolveSucceeded)) {
                                                                        if (!(syncEvent2 instanceof SyncEvent.PackageFailed)) {
                                                                            if (!(syncEvent2 instanceof SyncEvent.UploadFailed)) {
                                                                                if (!(syncEvent2 instanceof SyncEvent.DownloadFailed)) {
                                                                                    if (!(syncEvent2 instanceof SyncEvent.RestoreFailed)) {
                                                                                        if (syncEvent2 instanceof SyncEvent.RemoteNotFoundResolved) {
                                                                                            SyncEvent.RemoteNotFoundResolved remoteNotFoundResolved = (SyncEvent.RemoteNotFoundResolved) syncEvent2;
                                                                                            c27728OooO0OO2.f97824OooOo0o = null;
                                                                                            c27728OooO0OO2.f97823OooOo = null;
                                                                                            c27728OooO0OO2.f97826OooOoO0 = null;
                                                                                            c27728OooO0OO2.f97825OooOoO = null;
                                                                                            c27728OooO0OO2.f97827OooOoOO = null;
                                                                                            c27728OooO0OO2.f97830OooOooO = 12;
                                                                                            c27740OooOOOo.getClass();
                                                                                            Object objOooO0o0 = c27740OooOOOo.OooO0o0(remoteNotFoundResolved.getId(), cloudMetaLocal2, remoteNotFoundResolved.getPostAction(), c27728OooO0OO2);
                                                                                            if (objOooO0o0 != enumC32485OooO00o) {
                                                                                                objOooO0o0 = C32460OooOooO.f116667OooO00o;
                                                                                            }
                                                                                        } else if (!(syncEvent2 instanceof SyncEvent.ResolveFailed) && !(syncEvent2 instanceof SyncEvent.ContentConflict)) {
                                                                                            throw new C32442OooOO0o();
                                                                                        }
                                                                                        break;
                                                                                    } else {
                                                                                        SyncEvent.RestoreFailed restoreFailed = (SyncEvent.RestoreFailed) syncEvent2;
                                                                                        c27740OooOOOo.getClass();
                                                                                        Throwable error = restoreFailed.getError();
                                                                                        cloudSyncError = error instanceof CloudSyncError ? (CloudSyncError) error : null;
                                                                                        if (cloudSyncError != null) {
                                                                                            if (cloudSyncError.getRequiresConflictResolution()) {
                                                                                                c27740OooOOOo.OooOOOo(new SyncEvent.LocalModified(restoreFailed.getId(), restoreFailed.getMetaType()));
                                                                                            } else if (cloudSyncError.getIsGlobalError()) {
                                                                                                c27740OooOOOo.f97899OooO.OooO00o(cloudSyncError);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    c27740OooOOOo.getClass();
                                                                                    Throwable error2 = ((SyncEvent.DownloadFailed) syncEvent2).getError();
                                                                                    cloudSyncError = error2 instanceof CloudSyncError ? (CloudSyncError) error2 : null;
                                                                                    if (cloudSyncError != null && cloudSyncError.getIsGlobalError()) {
                                                                                        c27740OooOOOo.f97899OooO.OooO00o(cloudSyncError);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c27728OooO0OO2.f97824OooOo0o = null;
                                                                                c27728OooO0OO2.f97823OooOo = null;
                                                                                c27728OooO0OO2.f97826OooOoO0 = null;
                                                                                c27728OooO0OO2.f97825OooOoO = null;
                                                                                c27728OooO0OO2.f97827OooOoOO = null;
                                                                                c27728OooO0OO2.f97830OooOooO = 11;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            c27740OooOOOo.getClass();
                                                                            Throwable error3 = ((SyncEvent.PackageFailed) syncEvent2).getError();
                                                                            cloudSyncError = error3 instanceof CloudSyncError ? (CloudSyncError) error3 : null;
                                                                            if (cloudSyncError != null && cloudSyncError.getIsGlobalError()) {
                                                                                c27740OooOOOo.f97899OooO.OooO00o(cloudSyncError);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c27728OooO0OO2.f97824OooOo0o = null;
                                                                        c27728OooO0OO2.f97823OooOo = null;
                                                                        c27728OooO0OO2.f97826OooOoO0 = null;
                                                                        c27728OooO0OO2.f97825OooOoO = null;
                                                                        c27728OooO0OO2.f97827OooOoOO = null;
                                                                        c27728OooO0OO2.f97830OooOooO = 10;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c27728OooO0OO2.f97824OooOo0o = null;
                                                                    c27728OooO0OO2.f97823OooOo = null;
                                                                    c27728OooO0OO2.f97826OooOoO0 = null;
                                                                    c27728OooO0OO2.f97825OooOoO = null;
                                                                    c27728OooO0OO2.f97827OooOoOO = null;
                                                                    c27728OooO0OO2.f97830OooOooO = 9;
                                                                    break;
                                                                }
                                                            } else {
                                                                c27728OooO0OO2.f97824OooOo0o = null;
                                                                c27728OooO0OO2.f97823OooOo = null;
                                                                c27728OooO0OO2.f97826OooOoO0 = null;
                                                                c27728OooO0OO2.f97825OooOoO = null;
                                                                c27728OooO0OO2.f97827OooOoOO = null;
                                                                c27728OooO0OO2.f97830OooOooO = 8;
                                                                break;
                                                            }
                                                        } else {
                                                            c27728OooO0OO2.f97824OooOo0o = null;
                                                            c27728OooO0OO2.f97823OooOo = null;
                                                            c27728OooO0OO2.f97826OooOoO0 = null;
                                                            c27728OooO0OO2.f97825OooOoO = null;
                                                            c27728OooO0OO2.f97827OooOoOO = null;
                                                            c27728OooO0OO2.f97830OooOooO = 7;
                                                            break;
                                                        }
                                                    } else {
                                                        c27728OooO0OO2.f97824OooOo0o = null;
                                                        c27728OooO0OO2.f97823OooOo = null;
                                                        c27728OooO0OO2.f97826OooOoO0 = null;
                                                        c27728OooO0OO2.f97825OooOoO = null;
                                                        c27728OooO0OO2.f97827OooOoOO = null;
                                                        c27728OooO0OO2.f97830OooOooO = 6;
                                                        break;
                                                    }
                                                } else {
                                                    c27728OooO0OO2.f97824OooOo0o = null;
                                                    c27728OooO0OO2.f97823OooOo = null;
                                                    c27728OooO0OO2.f97826OooOoO0 = null;
                                                    c27728OooO0OO2.f97825OooOoO = null;
                                                    c27728OooO0OO2.f97827OooOoOO = null;
                                                    c27728OooO0OO2.f97830OooOooO = 5;
                                                    break;
                                                }
                                            } else {
                                                SyncEvent.CloudDeleted cloudDeleted = (SyncEvent.CloudDeleted) syncEvent2;
                                                c27740OooOOOo.getClass();
                                                if (syncState4.getPhase() == SyncPhase.DIRTY_CLOUD) {
                                                    c27740OooOOOo.OooOOOo(new SyncEvent.RequestPull(cloudDeleted.getId()));
                                                } else {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o2.OooOOO0("SideEffectRunner");
                                                    c20358OooO00o2.OooOO0O("CloudDeleted: to=" + syncState4 + " skip RequestPull", new Object[0]);
                                                }
                                            }
                                        } else {
                                            SyncEvent.CloudModified cloudModified = (SyncEvent.CloudModified) syncEvent2;
                                            c27740OooOOOo.getClass();
                                            if (cloudMetaLocal2.getMetaVersion() == 0) {
                                                SyncPhase phase = syncState3.getPhase();
                                                SyncPhase syncPhase = SyncPhase.DIRTY_CLOUD;
                                                boolean z = phase == syncPhase && syncState4.getPhase() == syncPhase;
                                                if ((syncState3.getPhase() == SyncPhase.CLEAN && syncState4.getPhase() == SyncPhase.DIRTY_CLOUD) || z) {
                                                    c27740OooOOOo.OooOOOo(new SyncEvent.RequestPull(cloudModified.getId()));
                                                } else {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o3.OooOOO0("SideEffectRunner");
                                                    c20358OooO00o3.OooOO0O("CloudModified: from=" + syncState3 + ", to=" + syncState4 + " skip RequestPull", new Object[0]);
                                                }
                                            }
                                        }
                                    } else {
                                        c27728OooO0OO2.f97824OooOo0o = null;
                                        c27728OooO0OO2.f97823OooOo = null;
                                        c27728OooO0OO2.f97826OooOoO0 = null;
                                        c27728OooO0OO2.f97825OooOoO = null;
                                        c27728OooO0OO2.f97827OooOoOO = null;
                                        c27728OooO0OO2.f97830OooOooO = 4;
                                        break;
                                    }
                                } else {
                                    c27728OooO0OO2.f97824OooOo0o = null;
                                    c27728OooO0OO2.f97823OooOo = null;
                                    c27728OooO0OO2.f97826OooOoO0 = null;
                                    c27728OooO0OO2.f97825OooOoO = null;
                                    c27728OooO0OO2.f97827OooOoOO = null;
                                    c27728OooO0OO2.f97830OooOooO = 3;
                                    break;
                                }
                            } else {
                                c27728OooO0OO2.f97824OooOo0o = null;
                                c27728OooO0OO2.f97823OooOo = null;
                                c27728OooO0OO2.f97826OooOoO0 = null;
                                c27728OooO0OO2.f97825OooOoO = null;
                                c27728OooO0OO2.f97827OooOoOO = null;
                                c27728OooO0OO2.f97830OooOooO = 2;
                                break;
                            }
                        }
                    } else {
                        SyncEvent.LocalDeleted localDeleted = (SyncEvent.LocalDeleted) syncEvent2;
                        c27740OooOOOo.getClass();
                        if (syncState4.getPhase() == SyncPhase.DIRTY_LOCAL) {
                            CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal2.getMimeType());
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaTypeFromMime);
                            c27740OooOOOo.OooOOOo(new SyncEvent.RequestPush(localDeleted.getId(), cloudMetaTypeFromMime, false, 4, null));
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o4.OooOOO0("SideEffectRunner");
                            c20358OooO00o4.OooOO0O("LocalDeleted: to=" + syncState4 + " skip RequestPush", new Object[0]);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            case 1:
                CloudMetaLocal cloudMetaLocal3 = c27728OooO0OO2.f97827OooOoOO;
                syncEvent2 = c27728OooO0OO2.f97825OooOoO;
                SyncState syncState5 = c27728OooO0OO2.f97826OooOoO0;
                SyncState syncState6 = c27728OooO0OO2.f97823OooOo;
                c27740OooOOOo = c27728OooO0OO2.f97824OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOo0);
                syncState3 = syncState6;
                syncState4 = syncState5;
                cloudMetaLocal2 = cloudMetaLocal3;
                if (!((Boolean) objOooOOo0).booleanValue()) {
                }
                break;
            case 2:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 5:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 6:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 9:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 10:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 11:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            case 12:
                C32446OooOOOo.OooO0O0(objOooOOo0);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, CloudMetaLocal cloudMetaLocal, Throwable th, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27729OooO0Oo c27729OooO0Oo;
        C27740OooOOOo c27740OooOOOo;
        String str2;
        Throwable th2;
        if (abstractC32479OooO0OO instanceof C27729OooO0Oo) {
            c27729OooO0Oo = (C27729OooO0Oo) abstractC32479OooO0OO;
            int i = c27729OooO0Oo.f97836OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27729OooO0Oo.f97836OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27729OooO0Oo = new C27729OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        C27729OooO0Oo c27729OooO0Oo2 = c27729OooO0Oo;
        Object objOooO0o = c27729OooO0Oo2.f97833OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27729OooO0Oo2.f97836OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            SyncPhase syncPhase = SyncPhase.DOWNLOADING;
            c27729OooO0Oo2.f97832OooOo0o = this;
            c27729OooO0Oo2.f97831OooOo = str;
            c27729OooO0Oo2.f97834OooOoO0 = th;
            c27729OooO0Oo2.f97836OooOoo0 = 1;
            objOooO0o = OooO0o(str, syncPhase, cloudMetaLocal, th, c27729OooO0Oo2);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27740OooOOOo = this;
            str2 = str;
            th2 = th;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = c27729OooO0Oo2.f97834OooOoO0;
            str2 = c27729OooO0Oo2.f97831OooOo;
            c27740OooOOOo = c27729OooO0Oo2.f97832OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        if (!((Boolean) objOooO0o).booleanValue()) {
            c27740OooOOOo.OooOOOo(new SyncEvent.DownloadFailed(str2, th2));
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, SyncPhase syncPhase, CloudMetaLocal cloudMetaLocal, Throwable th, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27731OooO0o0 c27731OooO0o0;
        boolean z;
        Object objOooO0O0;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27731OooO0o0) {
            c27731OooO0o0 = (C27731OooO0o0) abstractC32479OooO0OO;
            int i = c27731OooO0o0.f97849OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27731OooO0o0.f97849OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27731OooO0o0 = new C27731OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27731OooO0o0.f97846OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27731OooO0o0.f97849OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if ((th instanceof CloudSyncError.ResourceNotFound) || (th instanceof CloudSyncError.MetaNotFound)) {
                z = true;
                if (z) {
                    return Boolean.FALSE;
                }
                c27731OooO0o0.f97845OooOo0o = this;
                c27731OooO0o0.f97844OooOo = str;
                c27731OooO0o0.f97847OooOoO0 = cloudMetaLocal;
                c27731OooO0o0.f97849OooOoo0 = 1;
                objOooO0O0 = this.f97904OooO0o.OooO0O0(cloudMetaLocal, syncPhase, c27731OooO0o0);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27740OooOOOo = this;
            } else {
                if (th instanceof CloudSyncError.Internal) {
                    z = ((CloudSyncError.Internal) th).getCause() instanceof FileNotFoundException;
                } else if (!(th instanceof FileNotFoundException)) {
                    z = false;
                }
                if (z) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudMetaLocal = c27731OooO0o0.f97847OooOoO0;
            str = c27731OooO0o0.f97844OooOo;
            c27740OooOOOo = c27731OooO0o0.f97845OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0O0);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "SideEffectRunner", "resolveRemoteNotFound failed for ", str), new Object[0]);
        }
        if (objOooO0O0 instanceof C32445OooOOOO.OooO00o) {
            objOooO0O0 = null;
        }
        o0000.OooO00o oooO00o = (o0000.OooO00o) objOooO0O0;
        if (oooO00o == null) {
            return Boolean.FALSE;
        }
        c27740OooOOOo.OooOOOo(new SyncEvent.RemoteNotFoundResolved(str, c27740OooOOOo.OooO00o(oooO00o.f97353OooO00o, cloudMetaLocal.getSyncState())));
        return Boolean.TRUE;
    }

    public final Object OooO0o0(String str, CloudMetaLocal cloudMetaLocal, SyncPostAction syncPostAction, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        SyncContext syncContext;
        SyncPostAction syncPostActionOooO00o = syncPostAction;
        SyncState syncState = cloudMetaLocal.getSyncState();
        if (syncPostActionOooO00o instanceof SyncPostAction.RetryPull) {
            syncPostActionOooO00o = OooO00o(syncPostActionOooO00o, syncState);
        } else if ((syncPostActionOooO00o instanceof SyncPostAction.PushFull) && syncPostActionOooO00o != null) {
            String sessionId = syncState.getSessionId();
            boolean zOooo0o0 = C33599OooOo0O.Oooo0o0(sessionId);
            ConcurrentHashMap<String, SyncContext> concurrentHashMap = this.f97908OooOO0;
            int autoRetryUploadCount = (zOooo0o0 || (syncContext = concurrentHashMap.get(sessionId)) == null) ? 0 : syncContext.getAutoRetryUploadCount();
            if (autoRetryUploadCount >= 1) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SideEffectRunner");
                c20358OooO00o.OooOO0O("Max push retry reached (" + autoRetryUploadCount + " >= 1), giving up", new Object[0]);
                syncPostActionOooO00o = SyncPostAction.None.INSTANCE;
            } else {
                String sessionId2 = syncState.getSessionId();
                if (!C33599OooOo0O.Oooo0o0(sessionId2)) {
                    SyncContext empty = concurrentHashMap.get(sessionId2);
                    if (empty == null) {
                        empty = SyncContext.INSTANCE.getEmpty();
                    }
                    SyncContext syncContext2 = empty;
                    concurrentHashMap.put(sessionId2, SyncContext.copy$default(syncContext2, null, syncContext2.getAutoRetryUploadCount() + 1, 0L, 0, 13, null));
                }
            }
        }
        if (!(syncPostActionOooO00o instanceof SyncPostAction.None)) {
            if (syncPostActionOooO00o instanceof SyncPostAction.AcceptRemoteDelete) {
                CloudMetaRemote deletedRemoteMeta = ((SyncPostAction.AcceptRemoteDelete) syncPostActionOooO00o).getDeletedRemoteMeta();
                CloudMetaLocal cloudMetaLocalCopy$default = (deletedRemoteMeta == null || (cloudMetaLocal.getDeletedRemote() && cloudMetaLocal.getMetaVersion() == deletedRemoteMeta.getMetaVersion())) ? !cloudMetaLocal.getDeletedRemote() ? CloudMetaLocal.copy$default(cloudMetaLocal, null, null, null, 0, null, null, null, null, false, true, 0L, null, 1471, null) : null : CloudMetaLocal.copy$default(cloudMetaLocal, null, null, null, deletedRemoteMeta.getMetaVersion(), null, null, null, null, false, true, 0L, null, 1463, null);
                if (cloudMetaLocalCopy$default != null) {
                    Object objOooOOOO = this.f97907OooO0oo.OooOOOO(cloudMetaLocalCopy$default, abstractC32479OooO0OO);
                    return objOooOOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOO : C32460OooOooO.f116667OooO00o;
                }
            } else if (syncPostActionOooO00o instanceof SyncPostAction.RetryPull) {
                OooOOOo(new SyncEvent.RequestPull(str));
            } else if (syncPostActionOooO00o instanceof SyncPostAction.PushFull) {
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal.getMimeType());
                if (cloudMetaTypeFromMime == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOOo(new SyncEvent.RequestPush(str, cloudMetaTypeFromMime, true));
            } else {
                if (!(syncPostActionOooO00o instanceof SyncPostAction.PushDuplicateFull)) {
                    throw new C32442OooOO0o();
                }
                SyncPostAction.PushDuplicateFull pushDuplicateFull = (SyncPostAction.PushDuplicateFull) syncPostActionOooO00o;
                String targetId = pushDuplicateFull.getTargetId();
                if (C33599OooOo0O.Oooo0o0(targetId)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOOo(new SyncEvent.LocalModified(targetId, pushDuplicateFull.getTargetType()));
                OooOOOo(new SyncEvent.RequestPush(targetId, pushDuplicateFull.getTargetType(), true));
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, CloudBundle.BundleType bundleType, CloudMetaLocal cloudMetaLocal, Throwable th, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27730OooO0o c27730OooO0o;
        C27740OooOOOo c27740OooOOOo;
        Throwable th2;
        Object objOooO0o0;
        String str2;
        Throwable th3;
        if (abstractC32479OooO0OO instanceof C27730OooO0o) {
            c27730OooO0o = (C27730OooO0o) abstractC32479OooO0OO;
            int i = c27730OooO0o.f97842OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27730OooO0o.f97842OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27730OooO0o = new C27730OooO0o(this, abstractC32479OooO0OO);
            }
        }
        C27730OooO0o c27730OooO0o2 = c27730OooO0o;
        Object obj = c27730OooO0o2.f97841OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27730OooO0o2.f97842OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(th, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "SideEffectRunner", "Upload failed for ", str), new Object[0]);
            SyncPhase syncPhase = SyncPhase.UPLOADING;
            c27730OooO0o2.f97838OooOo0o = this;
            c27730OooO0o2.f97837OooOo = str;
            c27730OooO0o2.f97840OooOoO0 = bundleType;
            c27730OooO0o2.f97839OooOoO = th;
            c27730OooO0o2.f97842OooOoo = 1;
            Object objOooO0o = OooO0o(str, syncPhase, cloudMetaLocal, th, c27730OooO0o2);
            if (objOooO0o != enumC32485OooO00o) {
                c27740OooOOOo = this;
                obj = objOooO0o;
                th2 = th;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th3 = c27730OooO0o2.f97839OooOoO;
            bundleType = c27730OooO0o2.f97840OooOoO0;
            str2 = c27730OooO0o2.f97837OooOo;
            c27740OooOOOo = c27730OooO0o2.f97838OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            if (!(objOooO0o0 instanceof C32445OooOOOO.OooO00o)) {
                c27740OooOOOo.OooOOOo(new SyncEvent.AutoResolveSucceeded(str2, (ConflictResolution) objOooO0o0));
            }
            if (C32445OooOOOO.OooO00o(objOooO0o0) != null) {
                c27740OooOOOo.OooOOOo(new SyncEvent.UploadFailed(str2, th3, bundleType));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        Throwable th4 = c27730OooO0o2.f97839OooOoO;
        bundleType = c27730OooO0o2.f97840OooOoO0;
        String str3 = c27730OooO0o2.f97837OooOo;
        c27740OooOOOo = c27730OooO0o2.f97838OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        th2 = th4;
        str = str3;
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        CloudSyncError cloudSyncError = th2 instanceof CloudSyncError ? (CloudSyncError) th2 : null;
        if (cloudSyncError == null || !cloudSyncError.getRequiresConflictResolution()) {
            c27740OooOOOo.OooOOOo(new SyncEvent.UploadFailed(str, th2, bundleType));
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "SideEffectRunner", "Upload failed requires conflict resolution for ", str), new Object[0]);
        C27677o00000oo c27677o00000oo = c27740OooOOOo.f97903OooO0Oo;
        c27730OooO0o2.f97838OooOo0o = c27740OooOOOo;
        c27730OooO0o2.f97837OooOo = str;
        c27730OooO0o2.f97840OooOoO0 = bundleType;
        c27730OooO0o2.f97839OooOoO = th2;
        c27730OooO0o2.f97842OooOoo = 2;
        objOooO0o0 = c27677o00000oo.OooO0o0(str, false, c27730OooO0o2);
        if (objOooO0o0 != enumC32485OooO00o) {
            Throwable th5 = th2;
            str2 = str;
            th3 = th5;
            if (!(objOooO0o0 instanceof C32445OooOOOO.OooO00o)) {
            }
            if (C32445OooOOOO.OooO00o(objOooO0o0) != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(SyncState syncState, SyncState syncState2, SyncEvent.AutoResolveSucceeded autoResolveSucceeded, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27732OooO0oO c27732OooO0oO;
        SyncState syncState3;
        SyncState syncState4;
        SyncEvent.AutoResolveSucceeded autoResolveSucceeded2;
        C27740OooOOOo c27740OooOOOo;
        SyncState syncState5;
        SyncState syncState6;
        C27740OooOOOo c27740OooOOOo2;
        SyncPostAction postAction;
        String id;
        CloudMetaLocal cloudMetaLocal2;
        SyncPostAction syncPostAction;
        SyncState syncState7;
        SyncState syncState8;
        C27740OooOOOo c27740OooOOOo3;
        CloudMetaLocal cloudMetaLocal3 = cloudMetaLocal;
        if (abstractC32479OooO0OO instanceof C27732OooO0oO) {
            c27732OooO0oO = (C27732OooO0oO) abstractC32479OooO0OO;
            int i = c27732OooO0oO.f97858OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27732OooO0oO.f97858OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27732OooO0oO = new C27732OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27732OooO0oO.f97855OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27732OooO0oO.f97858OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CloudMetaLocal resolvedMeta = autoResolveSucceeded.getResolvedResult().getResolvedMeta();
            c27732OooO0oO.f97851OooOo0o = this;
            c27732OooO0oO.f97850OooOo = syncState;
            syncState3 = syncState2;
            c27732OooO0oO.f97853OooOoO0 = syncState3;
            c27732OooO0oO.f97852OooOoO = autoResolveSucceeded;
            c27732OooO0oO.f97854OooOoOO = cloudMetaLocal3;
            c27732OooO0oO.f97858OooOooo = 1;
            if (OooOOo(cloudMetaLocal3, resolvedMeta, c27732OooO0oO) != enumC32485OooO00o) {
                syncState4 = syncState;
                autoResolveSucceeded2 = autoResolveSucceeded;
                c27740OooOOOo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                cloudMetaLocal3 = c27732OooO0oO.f97854OooOoOO;
                autoResolveSucceeded2 = c27732OooO0oO.f97852OooOoO;
                syncState5 = c27732OooO0oO.f97853OooOoO0;
                syncState6 = c27732OooO0oO.f97850OooOo;
                c27740OooOOOo2 = c27732OooO0oO.f97851OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                postAction = autoResolveSucceeded2.getResolvedResult().getPostAction();
                id = autoResolveSucceeded2.getId();
                c27732OooO0oO.f97851OooOo0o = c27740OooOOOo2;
                c27732OooO0oO.f97850OooOo = syncState6;
                c27732OooO0oO.f97853OooOoO0 = syncState5;
                c27732OooO0oO.f97852OooOoO = autoResolveSucceeded2;
                c27732OooO0oO.f97854OooOoOO = cloudMetaLocal3;
                c27732OooO0oO.f97856OooOoo0 = postAction;
                c27732OooO0oO.f97858OooOooo = 3;
                if (c27740OooOOOo2.OooO0o0(id, cloudMetaLocal3, postAction, c27732OooO0oO) != enumC32485OooO00o) {
                    cloudMetaLocal2 = cloudMetaLocal3;
                    syncPostAction = postAction;
                    syncState7 = syncState5;
                    syncState8 = syncState6;
                    c27740OooOOOo3 = c27740OooOOOo2;
                    if (syncPostAction instanceof SyncPostAction.None) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            syncPostAction = c27732OooO0oO.f97856OooOoo0;
            cloudMetaLocal2 = c27732OooO0oO.f97854OooOoOO;
            autoResolveSucceeded2 = c27732OooO0oO.f97852OooOoO;
            syncState7 = c27732OooO0oO.f97853OooOoO0;
            syncState8 = c27732OooO0oO.f97850OooOo;
            c27740OooOOOo3 = c27732OooO0oO.f97851OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (syncPostAction instanceof SyncPostAction.None) {
                String id2 = autoResolveSucceeded2.getId();
                c27740OooOOOo3.getClass();
                if (syncState8.getPhase() == SyncPhase.UPLOADING && syncState7.getPhase() == SyncPhase.DIRTY_LOCAL) {
                    String sessionId = syncState7.getSessionId();
                    if (C33599OooOo0O.Oooo0o0(sessionId)) {
                        sessionId = syncState8.getSessionId();
                    }
                    if (C33599OooOo0O.Oooo0o0(sessionId)) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOO0O(C22201OooO0oO.OooO0O0(c20358OooO00o, "SideEffectRunner", "Auto retry upload skipped for ", id2, ": sessionId missing"), new Object[0]);
                    } else {
                        ConcurrentHashMap<String, SyncContext> concurrentHashMap = c27740OooOOOo3.f97908OooOO0;
                        SyncContext empty = concurrentHashMap.get(sessionId);
                        if (empty == null) {
                            empty = SyncContext.INSTANCE.getEmpty();
                        }
                        SyncContext syncContext = empty;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean z = jCurrentTimeMillis - syncContext.getLastAutoRetryAt() >= 1000;
                        if (syncContext.getAutoRetryUploadCount() >= 1 || !z) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("SideEffectRunner");
                            c20358OooO00o2.OooO0o0(C22212OooOoO0.OooO0OO(syncContext.getAutoRetryUploadCount(), "Auto retry upload skipped for ", id2, " (count=", ")"), new Object[0]);
                        } else {
                            concurrentHashMap.put(sessionId, SyncContext.copy$default(syncContext, null, syncContext.getAutoRetryUploadCount() + 1, jCurrentTimeMillis, 0, 9, null));
                            CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal2.getMimeType());
                            if (cloudMetaTypeFromMime != null) {
                                c27740OooOOOo3.OooOOOo(new SyncEvent.RequestPush(id2, cloudMetaTypeFromMime, false, 4, null));
                            }
                        }
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        cloudMetaLocal3 = c27732OooO0oO.f97854OooOoOO;
        autoResolveSucceeded2 = c27732OooO0oO.f97852OooOoO;
        syncState3 = c27732OooO0oO.f97853OooOoO0;
        syncState4 = c27732OooO0oO.f97850OooOo;
        c27740OooOOOo = c27732OooO0oO.f97851OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o00000O o00000o = c27740OooOOOo.f97906OooO0oO;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c27732OooO0oO.f97851OooOo0o = c27740OooOOOo;
        c27732OooO0oO.f97850OooOo = syncState4;
        c27732OooO0oO.f97853OooOoO0 = syncState3;
        c27732OooO0oO.f97852OooOoO = autoResolveSucceeded2;
        c27732OooO0oO.f97854OooOoOO = cloudMetaLocal3;
        c27732OooO0oO.f97858OooOooo = 2;
        if (o00000o.OooO00o(jCurrentTimeMillis2, c27732OooO0oO) != enumC32485OooO00o) {
            syncState5 = syncState3;
            syncState6 = syncState4;
            c27740OooOOOo2 = c27740OooOOOo;
            postAction = autoResolveSucceeded2.getResolvedResult().getPostAction();
            id = autoResolveSucceeded2.getId();
            c27732OooO0oO.f97851OooOo0o = c27740OooOOOo2;
            c27732OooO0oO.f97850OooOo = syncState6;
            c27732OooO0oO.f97853OooOoO0 = syncState5;
            c27732OooO0oO.f97852OooOoO = autoResolveSucceeded2;
            c27732OooO0oO.f97854OooOoOO = cloudMetaLocal3;
            c27732OooO0oO.f97856OooOoo0 = postAction;
            c27732OooO0oO.f97858OooOooo = 3;
            if (c27740OooOOOo2.OooO0o0(id, cloudMetaLocal3, postAction, c27732OooO0oO) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r1.OooO0oO(r2, r3, r4, r5, r6) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(SyncState syncState, SyncState syncState2, SyncEvent.PackageSucceeded packageSucceeded, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27725OooO c27725OooO;
        Object objOooO00o;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27725OooO) {
            c27725OooO = (C27725OooO) abstractC32479OooO0OO;
            int i = c27725OooO.f97815OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27725OooO.f97815OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27725OooO = new C27725OooO(this, abstractC32479OooO0OO);
            }
        }
        C27725OooO c27725OooO2 = c27725OooO;
        Object obj = c27725OooO2.f97812OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27725OooO2.f97815OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (syncState.getPhase() != SyncPhase.PACKAGING || syncState2.getPhase() != SyncPhase.UPLOADING) {
                return C32460OooOooO.f116667OooO00o;
            }
            CloudBundle bundle = packageSucceeded.getBundle();
            boolean forceFullContent = packageSucceeded.getForceFullContent();
            c27725OooO2.f97811OooOo0o = this;
            c27725OooO2.f97810OooOo = packageSucceeded;
            c27725OooO2.f97813OooOoO0 = cloudMetaLocal;
            c27725OooO2.f97815OooOoo0 = 1;
            objOooO00o = this.f97901OooO0O0.OooO00o(cloudMetaLocal, bundle, forceFullContent, c27725OooO2);
            if (objOooO00o != enumC32485OooO00o) {
                c27740OooOOOo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        cloudMetaLocal = c27725OooO2.f97813OooOoO0;
        packageSucceeded = c27725OooO2.f97810OooOo;
        C27740OooOOOo c27740OooOOOo2 = (C27740OooOOOo) c27725OooO2.f97811OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO00o = ((C32445OooOOOO) obj).f116639OooOo0o;
        c27740OooOOOo = c27740OooOOOo2;
        CloudMetaLocal cloudMetaLocal2 = cloudMetaLocal;
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            c27740OooOOOo.OooOOOo(new SyncEvent.UploadSucceeded(packageSucceeded.getId(), (CloudMetaLocal) objOooO00o));
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            String id = packageSucceeded.getId();
            CloudBundle.BundleType type = packageSucceeded.getBundle().getType();
            c27725OooO2.f97811OooOo0o = objOooO00o;
            c27725OooO2.f97810OooOo = null;
            c27725OooO2.f97813OooOoO0 = null;
            c27725OooO2.f97815OooOoo0 = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
    
        if (r7.OooO0Oo(r9, r10, r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(SyncState syncState, SyncState syncState2, SyncEvent.RequestPull requestPull, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27734OooOO0 c27734OooOO0;
        Object objOooO0O0;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27734OooOO0) {
            c27734OooOO0 = (C27734OooOO0) abstractC32479OooO0OO;
            int i = c27734OooOO0.f97869OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27734OooOO0.f97869OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27734OooOO0 = new C27734OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27734OooOO0.f97866OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27734OooOO0.f97869OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (syncState.getPhase() != SyncPhase.DIRTY_CLOUD || syncState2.getPhase() != SyncPhase.DOWNLOADING) {
                return C32460OooOooO.f116667OooO00o;
            }
            CloudMetaRemote cloudMetaRemote = (CloudMetaRemote) this.f97910OooOO0o.invoke(syncState2);
            if (cloudMetaRemote == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SideEffectRunner");
                c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("RequestPull: dirtyCloudMeta is null for ", requestPull.getId()), new Object[0]);
                OooOOOo(new SyncEvent.DownloadFailed(requestPull.getId(), new CloudSyncError.Internal(null, 1, null)));
                return C32460OooOooO.f116667OooO00o;
            }
            c27734OooOO0.f97865OooOo0o = this;
            c27734OooOO0.f97864OooOo = requestPull;
            c27734OooOO0.f97867OooOoO0 = cloudMetaLocal;
            c27734OooOO0.f97869OooOoo0 = 1;
            objOooO0O0 = this.f97905OooO0o0.OooO0O0(cloudMetaRemote, c27734OooOO0);
            if (objOooO0O0 != enumC32485OooO00o) {
                c27740OooOOOo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        cloudMetaLocal = c27734OooOO0.f97867OooOoO0;
        requestPull = c27734OooOO0.f97864OooOo;
        c27740OooOOOo = (C27740OooOOOo) c27734OooOO0.f97865OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (!(objOooO0O0 instanceof C32445OooOOOO.OooO00o)) {
            c27740OooOOOo.OooOOOo(new SyncEvent.DownloadSucceeded(requestPull.getId(), (CloudBundle) objOooO0O0));
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0O0);
        if (thOooO00o != null) {
            String id = requestPull.getId();
            c27734OooOO0.f97865OooOo0o = objOooO0O0;
            c27734OooOO0.f97864OooOo = null;
            c27734OooOO0.f97867OooOoO0 = null;
            c27734OooOO0.f97869OooOoo0 = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(SyncState syncState, SyncState syncState2, SyncEvent.RequestPush requestPush, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27735OooOO0O c27735OooOO0O;
        C27740OooOOOo c27740OooOOOo;
        Object objOooO00o;
        C27740OooOOOo c27740OooOOOo2;
        int i;
        SyncEvent.RequestPush requestPush2;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof C27735OooOO0O) {
            c27735OooOO0O = (C27735OooOO0O) abstractC32479OooO0OO;
            int i2 = c27735OooOO0O.f97875OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27735OooOO0O.f97875OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                c27735OooOO0O = new C27735OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27735OooOO0O.f97874OooOoOO;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27735OooOO0O.f97875OooOoo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (syncState.getPhase() != SyncPhase.DIRTY_LOCAL || syncState2.getPhase() != SyncPhase.PACKAGING) {
                return C32460OooOooO.f116667OooO00o;
            }
            String id = requestPush.getId();
            c27735OooOO0O.f97871OooOo0o = this;
            c27735OooOO0O.f97870OooOo = requestPush;
            c27735OooOO0O.f97873OooOoO0 = cloudMetaLocal;
            c27735OooOO0O.f97875OooOoo = 1;
            if (OooO0O0(id, cloudMetaLocal, c27735OooOO0O) != obj2) {
                c27740OooOOOo = this;
            }
            return obj2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c27735OooOO0O.f97872OooOoO;
            requestPush2 = c27735OooOO0O.f97870OooOo;
            c27740OooOOOo2 = c27735OooOO0O.f97871OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = ((C32445OooOOOO) obj).f116639OooOo0o;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                c27740OooOOOo2.OooOOOo(new SyncEvent.PackageSucceeded(requestPush2.getId(), (CloudBundle) objOooO00o, i != 0));
            } else {
                c27740OooOOOo2.OooOOOo(new SyncEvent.PackageFailed(requestPush2.getId(), thOooO00o));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        cloudMetaLocal = c27735OooOO0O.f97873OooOoO0;
        requestPush = c27735OooOO0O.f97870OooOo;
        c27740OooOOOo = c27735OooOO0O.f97871OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i4 = (requestPush.getForceFullContent() || cloudMetaLocal.getDeletedRemote()) ? 1 : 0;
        c27735OooOO0O.f97871OooOo0o = c27740OooOOOo;
        c27735OooOO0O.f97870OooOo = requestPush;
        c27735OooOO0O.f97873OooOoO0 = null;
        c27735OooOO0O.f97872OooOoO = i4;
        c27735OooOO0O.f97875OooOoo = 2;
        objOooO00o = c27740OooOOOo.f97900OooO00o.OooO00o(requestPush.getId(), i4 ^ 1, c27735OooOO0O);
        if (objOooO00o != obj2) {
            SyncEvent.RequestPush requestPush3 = requestPush;
            c27740OooOOOo2 = c27740OooOOOo;
            i = i4;
            requestPush2 = requestPush3;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (OooOOo(r11, r10, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (OooOOo(r11, r10, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (r10.OooO00o(r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(SyncEvent syncEvent, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27738OooOOO0 c27738OooOOO0;
        CloudMetaLocal cloudMetaLocal2;
        SyncEvent syncEvent2;
        C27740OooOOOo c27740OooOOOo;
        String id;
        SyncPostAction postAction;
        if (abstractC32479OooO0OO instanceof C27738OooOOO0) {
            c27738OooOOO0 = (C27738OooOOO0) abstractC32479OooO0OO;
            int i = c27738OooOOO0.f97892OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27738OooOOO0.f97892OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27738OooOOO0 = new C27738OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27738OooOOO0.f97889OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27738OooOOO0.f97892OooOoo0;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    CloudMetaLocal cloudMetaLocal3 = c27738OooOOO0.f97890OooOoO0;
                    SyncEvent.ResolveSucceeded resolveSucceeded = c27738OooOOO0.f97887OooOo;
                    C27740OooOOOo c27740OooOOOo2 = c27738OooOOO0.f97888OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    cloudMetaLocal2 = cloudMetaLocal3;
                    syncEvent2 = resolveSucceeded;
                    c27740OooOOOo = c27740OooOOOo2;
                    SyncEvent.ResolveSucceeded resolveSucceeded2 = (SyncEvent.ResolveSucceeded) syncEvent2;
                    id = resolveSucceeded2.getId();
                    postAction = resolveSucceeded2.getResolvedResult().getPostAction();
                    c27738OooOOO0.f97888OooOo0o = c27740OooOOOo;
                    c27738OooOOO0.f97887OooOo = null;
                    c27738OooOOO0.f97890OooOoO0 = null;
                    c27738OooOOO0.f97892OooOoo0 = 4;
                    if (c27740OooOOOo.OooO0o0(id, cloudMetaLocal2, postAction, c27738OooOOO0) != enumC32485OooO00o) {
                        o00000O o00000o = c27740OooOOOo.f97906OooO0oO;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c27738OooOOO0.f97888OooOo0o = null;
                        c27738OooOOO0.f97892OooOoo0 = 5;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }
            c27740OooOOOo = c27738OooOOO0.f97888OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            o00000O o00000o2 = c27740OooOOOo.f97906OooO0oO;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c27738OooOOO0.f97888OooOo0o = null;
            c27738OooOOO0.f97892OooOoo0 = 5;
        } else {
            C32446OooOOOo.OooO0O0(obj);
            if (!(syncEvent instanceof SyncEvent.UploadSucceeded)) {
                if (syncEvent instanceof SyncEvent.RestoreSucceeded) {
                    CloudMetaLocal restoreResult = ((SyncEvent.RestoreSucceeded) syncEvent).getRestoreResult();
                    c27738OooOOO0.f97888OooOo0o = this;
                    c27738OooOOO0.f97892OooOoo0 = 2;
                } else {
                    if (!(syncEvent instanceof SyncEvent.ResolveSucceeded)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    CloudMetaLocal resolvedMeta = ((SyncEvent.ResolveSucceeded) syncEvent).getResolvedResult().getResolvedMeta();
                    c27738OooOOO0.f97888OooOo0o = this;
                    c27738OooOOO0.f97887OooOo = (SyncEvent.ResolveSucceeded) syncEvent;
                    c27738OooOOO0.f97890OooOoO0 = cloudMetaLocal;
                    c27738OooOOO0.f97892OooOoo0 = 3;
                    if (OooOOo(cloudMetaLocal, resolvedMeta, c27738OooOOO0) != enumC32485OooO00o) {
                        cloudMetaLocal2 = cloudMetaLocal;
                        syncEvent2 = syncEvent;
                        c27740OooOOOo = this;
                        SyncEvent.ResolveSucceeded resolveSucceeded22 = (SyncEvent.ResolveSucceeded) syncEvent2;
                        id = resolveSucceeded22.getId();
                        postAction = resolveSucceeded22.getResolvedResult().getPostAction();
                        c27738OooOOO0.f97888OooOo0o = c27740OooOOOo;
                        c27738OooOOO0.f97887OooOo = null;
                        c27738OooOOO0.f97890OooOoO0 = null;
                        c27738OooOOO0.f97892OooOoo0 = 4;
                        if (c27740OooOOOo.OooO0o0(id, cloudMetaLocal2, postAction, c27738OooOOO0) != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            }
            CloudMetaLocal uploadResult = ((SyncEvent.UploadSucceeded) syncEvent).getUploadResult();
            c27738OooOOO0.f97888OooOo0o = this;
            c27738OooOOO0.f97892OooOoo0 = 1;
            o00000O o00000o22 = c27740OooOOOo.f97906OooO0oO;
            long jCurrentTimeMillis22 = System.currentTimeMillis();
            c27738OooOOO0.f97888OooOo0o = null;
            c27738OooOOO0.f97892OooOoo0 = 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(SyncState syncState, SyncEvent.RequestResolve requestResolve, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27736OooOO0o c27736OooOO0o;
        Object objOooO0o0;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27736OooOO0o) {
            c27736OooOO0o = (C27736OooOO0o) abstractC32479OooO0OO;
            int i = c27736OooOO0o.f97881OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27736OooOO0o.f97881OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27736OooOO0o = new C27736OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27736OooOO0o.f97880OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27736OooOO0o.f97881OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (syncState.getPhase() != SyncPhase.CONFLICT) {
                return C32460OooOooO.f116667OooO00o;
            }
            String id = requestResolve.getId();
            c27736OooOO0o.f97878OooOo0o = this;
            c27736OooOO0o.f97877OooOo = requestResolve;
            c27736OooOO0o.f97881OooOoOO = 1;
            objOooO0o0 = this.f97903OooO0Oo.OooO0o0(id, true, c27736OooOO0o);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27740OooOOOo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requestResolve = c27736OooOO0o.f97877OooOo;
            c27740OooOOOo = c27736OooOO0o.f97878OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        if (!(objOooO0o0 instanceof C32445OooOOOO.OooO00o)) {
            c27740OooOOOo.OooOOOo(new SyncEvent.ResolveSucceeded(requestResolve.getId(), (ConflictResolution) objOooO0o0));
        }
        if (C32445OooOOOO.OooO00o(objOooO0o0) != null) {
            c27740OooOOOo.OooOOOo(new SyncEvent.ResolveFailed(requestResolve.getId(), new Throwable("Resolve conflict failed")));
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(SyncEvent.UploadFailed uploadFailed, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27737OooOOO c27737OooOOO;
        Object objOooOo;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27737OooOOO) {
            c27737OooOOO = (C27737OooOOO) abstractC32479OooO0OO;
            int i = c27737OooOOO.f97886OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27737OooOOO.f97886OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27737OooOOO = new C27737OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27737OooOOO.f97885OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27737OooOOO.f97886OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Throwable error = uploadFailed.getError();
            CloudSyncError cloudSyncError = error instanceof CloudSyncError ? (CloudSyncError) error : null;
            if (cloudSyncError == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (!cloudSyncError.getRequiresConflictResolution()) {
                if (cloudSyncError.getIsGlobalError()) {
                    this.f97899OooO.OooO00o(cloudSyncError);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            String id = uploadFailed.getId();
            c27737OooOOO.f97883OooOo0o = this;
            c27737OooOOO.f97882OooOo = uploadFailed;
            c27737OooOOO.f97886OooOoOO = 1;
            objOooOo = this.f97907OooO0oo.OooOo(id, c27737OooOOO);
            if (objOooOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27740OooOOOo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uploadFailed = c27737OooOOO.f97882OooOo;
            c27740OooOOOo = c27737OooOOO.f97883OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        CloudMetaRemote cloudMetaRemote = (CloudMetaRemote) (objOooOo instanceof C32445OooOOOO.OooO00o ? null : objOooOo);
        if (cloudMetaRemote != null) {
            c27740OooOOOo.OooOOOo(new SyncEvent.CloudModified(uploadFailed.getId(), cloudMetaRemote));
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SideEffectRunner");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("UploadFailed: cannot fetch cloudMeta for ", uploadFailed.getId()), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final void OooOOOo(SyncEvent syncEvent) {
        C27722OooO00o c27722OooO00o = ((C27750OooOoO0) this.f97909OooOO0O.f82662OooOo).f97969OooOOO0;
        if (c27722OooO00o != null) {
            c27722OooO00o.invoke(syncEvent);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("SideEffectRunner");
        c20358OooO00o.OooO0OO("eventSender not set, cannot send event: " + syncEvent, new Object[0]);
    }

    public final Object OooOOo(CloudMetaLocal cloudMetaLocal, CloudMetaLocal cloudMetaLocal2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("SideEffectRunner");
        String id = cloudMetaLocal.getId();
        int metaVersion = cloudMetaLocal.getMetaVersion();
        String metaHash = cloudMetaLocal.getMetaHash();
        CloudContentTag contentTag = cloudMetaLocal.getContentTag();
        int metaVersion2 = cloudMetaLocal2.getMetaVersion();
        String metaHash2 = cloudMetaLocal2.getMetaHash();
        CloudContentTag contentTag2 = cloudMetaLocal2.getContentTag();
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(metaVersion, "updateMetaAfterSuccess: metaId=", id, ", before=[version=", ", hash=");
        sbOooO0OO.append(metaHash);
        sbOooO0OO.append(", contentTag=");
        sbOooO0OO.append(contentTag);
        sbOooO0OO.append("], after=[version=");
        C21036OooOOo0.OooO0Oo(metaVersion2, ", hash=", metaHash2, ", contentTag=", sbOooO0OO);
        sbOooO0OO.append(contentTag2);
        sbOooO0OO.append("]");
        c20358OooO00o.OooO0o0(sbOooO0OO.toString(), new Object[0]);
        Object objOooOOOO = this.f97907OooO0oo.OooOOOO(CloudMetaLocal.copy$default(cloudMetaLocal, null, null, null, cloudMetaLocal2.getMetaVersion(), cloudMetaLocal2.getContentTag(), cloudMetaLocal2.getMetaHash(), null, null, cloudMetaLocal2.getDeleted(), cloudMetaLocal2.getDeletedRemote(), cloudMetaLocal2.getLastModificationTime(), null, 2183, null), abstractC32479OooO0OO);
        return objOooOOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOO : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r4.OooOOOO(r5, r2) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(SyncState syncState, SyncState syncState2, SyncEvent syncEvent, CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27739OooOOOO c27739OooOOOO;
        SyncEvent syncEvent2;
        Object objOooO0o0;
        CloudMetaLocal cloudMetaLocal2;
        C27740OooOOOo c27740OooOOOo;
        if (abstractC32479OooO0OO instanceof C27739OooOOOO) {
            c27739OooOOOO = (C27739OooOOOO) abstractC32479OooO0OO;
            int i = c27739OooOOOO.f97898OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27739OooOOOO.f97898OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27739OooOOOO = new C27739OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27739OooOOOO.f97895OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27739OooOOOO.f97898OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            SyncPhase phase = syncState.getPhase();
            Set<SyncPhase> set = this.f97911OooOOO0;
            if (set.contains(phase) || !set.contains(syncState2.getPhase())) {
                return Boolean.FALSE;
            }
            String id = syncEvent.getId();
            c27739OooOOOO.f97894OooOo0o = this;
            syncEvent2 = syncEvent;
            c27739OooOOOO.f97893OooOo = syncEvent2;
            c27739OooOOOO.f97896OooOoO0 = cloudMetaLocal;
            c27739OooOOOO.f97898OooOoo0 = 1;
            objOooO0o0 = this.f97903OooO0Oo.OooO0o0(id, false, c27739OooOOOO);
            if (objOooO0o0 != enumC32485OooO00o) {
                cloudMetaLocal2 = cloudMetaLocal;
                c27740OooOOOo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return Boolean.FALSE;
        }
        CloudMetaLocal cloudMetaLocal3 = c27739OooOOOO.f97896OooOoO0;
        SyncEvent syncEvent3 = c27739OooOOOO.f97893OooOo;
        c27740OooOOOo = (C27740OooOOOo) c27739OooOOOO.f97894OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        cloudMetaLocal2 = cloudMetaLocal3;
        syncEvent2 = syncEvent3;
        if (!(objOooO0o0 instanceof C32445OooOOOO.OooO00o)) {
            c27740OooOOOo.OooOOOo(new SyncEvent.AutoResolveSucceeded(syncEvent2.getId(), (ConflictResolution) objOooO0o0));
            return Boolean.TRUE;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0o0);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SideEffectRunner");
            c20358OooO00o.OooO0o0(C20593OooO0Oo.OooO0O0("AutoResolve failed for ", syncEvent2.getId(), ", waiting for manual resolve"), new Object[0]);
            if (thOooO00o instanceof CloudSyncError.ContentConflict) {
                InterfaceC27605OooO00o interfaceC27605OooO00o = c27740OooOOOo.f97907OooO0oo;
                CloudMetaLocal cloudMetaLocalCopy$default = CloudMetaLocal.copy$default(cloudMetaLocal2, null, null, null, 0, null, null, null, null, false, false, 0L, CloudSyncError.CODE_CONTENT_CONFLICT, 2047, null);
                c27739OooOOOO.f97894OooOo0o = objOooO0o0;
                c27739OooOOOO.f97893OooOo = null;
                c27739OooOOOO.f97896OooOoO0 = null;
                c27739OooOOOO.f97898OooOoo0 = 2;
            }
        }
        return Boolean.FALSE;
    }
}
