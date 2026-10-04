package o0OOoO0O;

import OooOoOO.C20519OooO0Oo;
import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.ConflictResolution;
import com.orion.notein.domain.models.cloudsync.SyncContext;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncPostAction;
import java.util.concurrent.ConcurrentHashMap;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27635OooOoO;
import o0OOo0oo.C27641OooOooo;
import o0OOo0oo.C27643Oooo0;
import o0OOo0oo.C27677o00000oo;
import o0OOo0oo.C27684o0000o0;
import o0OOo0oo.C27696o000Ooo;
import o0OOo0oo.o0000;
import o0OOo0oo.o00000O;
import o0OOo0oo.o000OO;
import o0OOo0oo.o0OOO0o;
import o0OOoO0.C27715OooO0o;
import o0OOoO00.C27722OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoO0O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27750OooOoO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97956OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27641OooOooo f97957OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f97958OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27696o000Ooo f97959OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OO f97960OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27643Oooo0 f97961OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27677o00000oo f97962OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000 f97963OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O f97964OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27684o0000o0 f97965OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C27635OooOoO f97966OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27715OooO0o f97967OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ConcurrentHashMap<String, SyncContext> f97968OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public C27722OooO00o f97969OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C27726OooO00o f97970OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C32447OooOOo f97971OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C32447OooOOo f97972OooOOo0;

    public C27750OooOoO0(C27641OooOooo c27641OooOooo, o0OOO0o o0ooo0o2, C27696o000Ooo c27696o000Ooo, o000OO o000oo2, C27677o00000oo resolveConflict, C27643Oooo0 c27643Oooo0, o0000 resolveRemoteNotFound, o00000O o00000o, InterfaceC27605OooO00o cloudSyncRepo, C27684o0000o0 notificationBus, C27635OooOoO c27635OooOoO, C27715OooO0o migrationGuard) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(resolveConflict, "resolveConflict");
        kotlin.jvm.internal.OooOOO0.OooO0oO(resolveRemoteNotFound, "resolveRemoteNotFound");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notificationBus, "notificationBus");
        kotlin.jvm.internal.OooOOO0.OooO0oO(migrationGuard, "migrationGuard");
        this.f97957OooO00o = c27641OooOooo;
        this.f97958OooO0O0 = o0ooo0o2;
        this.f97959OooO0OO = c27696o000Ooo;
        this.f97960OooO0Oo = o000oo2;
        this.f97962OooO0o0 = resolveConflict;
        this.f97961OooO0o = c27643Oooo0;
        this.f97963OooO0oO = resolveRemoteNotFound;
        this.f97964OooO0oo = o00000o;
        this.f97956OooO = cloudSyncRepo;
        this.f97965OooOO0 = notificationBus;
        this.f97966OooOO0O = c27635OooOoO;
        this.f97967OooOO0o = migrationGuard;
        this.f97968OooOOO = new ConcurrentHashMap<>();
        this.f97970OooOOOO = new C27726OooO00o();
        this.f97971OooOOOo = C20519OooO0Oo.OooO0OO(new C27745OooOo0(this, 0));
        this.f97972OooOOo0 = C20519OooO0Oo.OooO0OO(new o000OO00.OooOOO(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
    
        if (r14 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(SyncEvent syncEvent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27748OooOo0o c27748OooOo0o;
        C27750OooOoO0 c27750OooOoO0;
        Object objOooO0Oo;
        String str;
        Object objOooo000;
        if (abstractC32479OooO0OO instanceof C27748OooOo0o) {
            c27748OooOo0o = (C27748OooOo0o) abstractC32479OooO0OO;
            int i = c27748OooOo0o.f97951OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27748OooOo0o.f97951OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27748OooOo0o = new C27748OooOo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27748OooOo0o.f97950OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27748OooOo0o.f97951OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27748OooOo0o.f97948OooOo0o = this;
            c27748OooOo0o.f97947OooOo = syncEvent;
            c27748OooOo0o.f97951OooOoOO = 1;
            objOooO0o = this.f97956OooO.OooO0o(c27748OooOo0o);
            if (objOooO0o != enumC32485OooO00o) {
                c27750OooOoO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            syncEvent = c27748OooOo0o.f97947OooOo;
            c27750OooOoO0 = (C27750OooOoO0) c27748OooOo0o.f97948OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        } else {
            if (i2 == 2) {
                syncEvent = c27748OooOo0o.f97947OooOo;
                c27750OooOoO0 = (C27750OooOoO0) c27748OooOo0o.f97948OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                objOooO0Oo = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
                if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
                    objOooO0Oo = null;
                }
                str = (String) objOooO0Oo;
                if (str != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("SyncEventProcessor");
                    c20358OooO00o.OooO0OO("DriveId is null; skip event: " + syncEvent, new Object[0]);
                    return Boolean.FALSE;
                }
                C27715OooO0o c27715OooO0o = c27750OooOoO0.f97967OooOO0o;
                String id = syncEvent.getId();
                c27748OooOo0o.f97948OooOo0o = c27750OooOoO0;
                c27748OooOo0o.f97947OooOo = syncEvent;
                c27748OooOo0o.f97951OooOoOO = 3;
                objOooO0o = c27715OooO0o.OooO0O0(str, id, c27748OooOo0o);
                if (objOooO0o != enumC32485OooO00o) {
                    if (!((Boolean) objOooO0o).booleanValue()) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                syncEvent = c27748OooOo0o.f97947OooOo;
                c27750OooOoO0 = (C27750OooOoO0) c27748OooOo0o.f97948OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                if (!((Boolean) objOooO0o).booleanValue()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("SyncEventProcessor");
                    c20358OooO00o2.OooOO0O("Migration in progress; skip event: " + syncEvent, new Object[0]);
                    return Boolean.FALSE;
                }
                if ((syncEvent instanceof SyncEvent.RequestPush) || (syncEvent instanceof SyncEvent.RequestPull) || (syncEvent instanceof SyncEvent.RequestResolve)) {
                    C27635OooOoO c27635OooOoO = c27750OooOoO0.f97966OooOO0O;
                    c27748OooOo0o.f97948OooOo0o = c27750OooOoO0;
                    c27748OooOo0o.f97947OooOo = syncEvent;
                    c27748OooOo0o.f97951OooOoOO = 4;
                    objOooO0o = c27635OooOoO.OooO00o(c27748OooOo0o);
                    if (objOooO0o != enumC32485OooO00o) {
                        if (((Boolean) objOooO0o).booleanValue()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                return Boolean.TRUE;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                syncEvent = (SyncEvent) c27748OooOo0o.f97948OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                objOooo000 = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
                Object obj = objOooo000 instanceof C32445OooOOOO.OooO00o ? null : objOooo000;
                Boolean bool = Boolean.FALSE;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, bool)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("SyncEventProcessor");
                    c20358OooO00o3.OooOO0O("CloudSync not available; skip event: " + syncEvent, new Object[0]);
                    return bool;
                }
                return Boolean.TRUE;
            }
            syncEvent = c27748OooOo0o.f97947OooOo;
            c27750OooOoO0 = (C27750OooOoO0) c27748OooOo0o.f97948OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (((Boolean) objOooO0o).booleanValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("SyncEventProcessor");
                c20358OooO00o4.OooOO0O("Network strategy disallows cloud sync; skip event: " + syncEvent, new Object[0]);
                c27750OooOoO0.f97965OooOO0.OooO00o(new CloudSyncError.DisallowToUseCellular(null, 1, null));
                return Boolean.FALSE;
            }
            InterfaceC27605OooO00o interfaceC27605OooO00o = c27750OooOoO0.f97956OooO;
            c27748OooOo0o.f97948OooOo0o = syncEvent;
            c27748OooOo0o.f97947OooOo = null;
            c27748OooOo0o.f97951OooOoOO = 5;
            objOooo000 = interfaceC27605OooO00o.Oooo000(c27748OooOo0o);
        }
        if (((EnumC27285OooO) objOooO0o) == EnumC27285OooO.f95076OooOo0o) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("SyncEventProcessor");
            c20358OooO00o5.OooO0OO("CloudSync not authorized; skip event: " + syncEvent, new Object[0]);
            return Boolean.FALSE;
        }
        InterfaceC27605OooO00o interfaceC27605OooO00o2 = c27750OooOoO0.f97956OooO;
        c27748OooOo0o.f97948OooOo0o = c27750OooOoO0;
        c27748OooOo0o.f97947OooOo = syncEvent;
        c27748OooOo0o.f97951OooOoOO = 2;
        objOooO0Oo = interfaceC27605OooO00o2.OooO0Oo(c27748OooOo0o);
        if (objOooO0Oo != enumC32485OooO00o) {
            if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            }
            str = (String) objOooO0Oo;
            if (str != null) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0213, code lost:
    
        if (r4.OooO0OO(r1.f97953OooO0O0, r1.f97954OooO0OO, r7, r1.f97952OooO00o, r9) == r3) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0O0(SyncEvent syncEvent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27744OooOo c27744OooOo;
        C27750OooOoO0 c27750OooOoO0;
        String id;
        Object objOooO0O0;
        CloudMetaLocal cloudMetaLocal;
        C27749OooOoO c27749OooOoO;
        SyncEvent event = syncEvent;
        if (abstractC32479OooO0OO instanceof C27744OooOo) {
            c27744OooOo = (C27744OooOo) abstractC32479OooO0OO;
            int i = c27744OooOo.f97939OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27744OooOo.f97939OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27744OooOo = new C27744OooOo(this, abstractC32479OooO0OO);
            }
        }
        C27744OooOo c27744OooOo2 = c27744OooOo;
        Object objOooO00o = c27744OooOo2.f97936OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27744OooOo2.f97939OooOoo0;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c27744OooOo2.f97935OooOo0o = this;
            c27744OooOo2.f97934OooOo = event;
            c27744OooOo2.f97939OooOoo0 = 1;
            objOooO00o = OooO00o(event, c27744OooOo2);
            if (objOooO00o != enumC32485OooO00o) {
                c27750OooOoO0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            event = c27744OooOo2.f97934OooOo;
            c27750OooOoO0 = (C27750OooOoO0) c27744OooOo2.f97935OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c27749OooOoO = (C27749OooOoO) c27744OooOo2.f97935OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    return c27749OooOoO.f97954OooO0OO.getPhase();
                }
                event = c27744OooOo2.f97934OooOo;
                c27750OooOoO0 = (C27750OooOoO0) c27744OooOo2.f97935OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                SyncEvent syncEvent2 = event;
                c27749OooOoO = (C27749OooOoO) objOooO00o;
                if (c27749OooOoO.f97955OooO0Oo) {
                    C27740OooOOOo c27740OooOOOo = (C27740OooOOOo) c27750OooOoO0.f97972OooOOo0.getValue();
                    c27744OooOo2.f97935OooOo0o = c27749OooOoO;
                    c27744OooOo2.f97934OooOo = null;
                    c27744OooOo2.f97939OooOoo0 = 4;
                }
                return c27749OooOoO.f97954OooO0OO.getPhase();
            }
            String str = c27744OooOo2.f97937OooOoO0;
            SyncEvent syncEvent3 = c27744OooOo2.f97934OooOo;
            C27750OooOoO0 c27750OooOoO02 = (C27750OooOoO0) c27744OooOo2.f97935OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            id = str;
            event = syncEvent3;
            c27750OooOoO0 = c27750OooOoO02;
            objOooO0O0 = objOooO00o;
            cloudMetaLocal = (CloudMetaLocal) objOooO0O0;
            if (cloudMetaLocal != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "SyncEventProcessor", "CloudMeta for ", id, " not found; skip event: ");
                sbOooO00o.append(event);
                c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
                return null;
            }
            C27726OooO00o c27726OooO00o = c27750OooOoO0.f97970OooOOOO;
            c27726OooO00o.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            if (event instanceof SyncEvent.LocalDeleted) {
                if (cloudMetaLocal.getDeleted()) {
                    z = true ^ (cloudMetaLocal.getSyncState().getPhase() == SyncPhase.CLEAN && !cloudMetaLocal.getDeletedRemote());
                } else {
                    z = false;
                }
                if (!z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o2, "SyncEventProcessor", "Stale event for ", id, "; skip event: ");
                    sbOooO00o2.append(event);
                    c20358OooO00o2.OooOO0O(sbOooO00o2.toString(), new Object[0]);
                    return cloudMetaLocal.getSyncState().getPhase();
                }
                C27746OooOo00 c27746OooOo00 = (C27746OooOo00) c27750OooOoO0.f97971OooOOOo.getValue();
                c27744OooOo2.f97935OooOo0o = c27750OooOoO0;
                c27744OooOo2.f97934OooOo = event;
                c27744OooOo2.f97937OooOoO0 = null;
                c27744OooOo2.f97939OooOoo0 = 3;
                objOooO00o = c27746OooOo00.OooO00o(event, cloudMetaLocal, c27744OooOo2);
                if (objOooO00o != enumC32485OooO00o) {
                    SyncEvent syncEvent22 = event;
                    c27749OooOoO = (C27749OooOoO) objOooO00o;
                    if (c27749OooOoO.f97955OooO0Oo) {
                    }
                    return c27749OooOoO.f97954OooO0OO.getPhase();
                }
                return enumC32485OooO00o;
            }
            if (event instanceof SyncEvent.CloudDeleted) {
                SyncEvent.CloudDeleted cloudDeleted = (SyncEvent.CloudDeleted) event;
                SyncPhase phase = cloudMetaLocal.getSyncState().getPhase();
                if ((!cloudMetaLocal.getDeleted() || !c27726OooO00o.f97816OooO00o.contains(phase)) && ((!cloudMetaLocal.getDeletedRemote() || cloudMetaLocal.getMetaVersion() < cloudDeleted.getDirtyCloudMeta().getMetaVersion()) && cloudMetaLocal.getMetaVersion() < cloudDeleted.getDirtyCloudMeta().getMetaVersion())) {
                }
                if (!z) {
                }
            } else if (event instanceof SyncEvent.CloudModified) {
                if (cloudMetaLocal.getMetaVersion() < ((SyncEvent.CloudModified) event).getDirtyCloudMeta().getMetaVersion()) {
                }
                if (!z) {
                }
            } else if (event instanceof SyncEvent.RequestPush) {
                if (cloudMetaLocal.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL) {
                }
                if (!z) {
                }
            } else if (event instanceof SyncEvent.RequestPull) {
                SyncPhase phase2 = cloudMetaLocal.getSyncState().getPhase();
                if (phase2 != SyncPhase.DOWNLOADING && phase2 != SyncPhase.RESTORING && phase2 == SyncPhase.DIRTY_CLOUD) {
                }
                if (!z) {
                }
            } else {
                boolean z2 = event instanceof SyncEvent.ResolveSucceeded;
                if (z2 || (event instanceof SyncEvent.ResolveFailed)) {
                    SyncPhase phase3 = cloudMetaLocal.getSyncState().getPhase();
                    if (phase3 == SyncPhase.CONFLICT || phase3 == SyncPhase.RESOLVING_CONFLICT) {
                        if (z2) {
                            ConflictResolution resolvedResult = ((SyncEvent.ResolveSucceeded) event).getResolvedResult();
                            CloudMetaLocal resolvedMeta = resolvedResult.getResolvedMeta();
                            boolean z3 = resolvedMeta.getMetaVersion() == cloudMetaLocal.getMetaVersion() && resolvedMeta.getDeleted() == cloudMetaLocal.getDeleted();
                            boolean z4 = resolvedResult.getPostAction() instanceof SyncPostAction.None;
                            if (!z3 || !z4) {
                            }
                            if (!z) {
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        if (!((Boolean) objOooO00o).booleanValue()) {
            return null;
        }
        id = event.getId();
        C27641OooOooo c27641OooOooo = c27750OooOoO0.f97957OooO00o;
        c27744OooOo2.f97935OooOo0o = c27750OooOoO0;
        c27744OooOo2.f97934OooOo = event;
        c27744OooOo2.f97937OooOoO0 = id;
        c27744OooOo2.f97939OooOoo0 = 2;
        objOooO0O0 = c27641OooOooo.OooO0O0(event, c27744OooOo2);
        if (objOooO0O0 != enumC32485OooO00o) {
            cloudMetaLocal = (CloudMetaLocal) objOooO0O0;
            if (cloudMetaLocal != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
