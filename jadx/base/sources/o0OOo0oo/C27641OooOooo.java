package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncState;
import kotlin.jvm.internal.C24018OooO0oo;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27641OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97209OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97210OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33898OooO0Oo f97211OooO0OO;

    public C27641OooOooo(InterfaceC27605OooO00o repo, InterfaceC27313OooOoo0 noteRepo, C28009OooOOOO c28009OooOOOO, C27095OooOo0O c27095OooOo0O, C27129OoooOOO c27129OoooOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(repo, "repo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteRepo, "noteRepo");
        this.f97209OooO00o = repo;
        this.f97210OooO0O0 = noteRepo;
        this.f97211OooO0OO = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, String str2, String str3, SyncPhase syncPhase, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27638OooOoo c27638OooOoo;
        if (abstractC32479OooO0OO instanceof C27638OooOoo) {
            c27638OooOoo = (C27638OooOoo) abstractC32479OooO0OO;
            int i = c27638OooOoo.f97199OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27638OooOoo.f97199OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27638OooOoo = new C27638OooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27638OooOoo.f97197OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27638OooOoo.f97199OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CloudMetaLocal cloudMetaLocal = c27638OooOoo.f97198OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return cloudMetaLocal;
        }
        C32446OooOOOo.OooO0O0(obj);
        CloudMetaLocal cloudMetaLocal2 = new CloudMetaLocal(str, str2, str3, 0, new CloudContentTag((String) null, (String) null, 0L, 7, (C24018OooO0oo) null), "", null, new SyncState(syncPhase, (String) null, 2, (C24018OooO0oo) null), false, false, 0L, null, 2048, null);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("EnsureCloudMetaLocalUseCase");
        c20358OooO00o.OooO00o("Create CloudMeta ➜ " + cloudMetaLocal2, new Object[0]);
        c27638OooOoo.f97198OooOo0o = cloudMetaLocal2;
        c27638OooOoo.f97199OooOoO = 1;
        return this.f97209OooO00o.OooOOOO(cloudMetaLocal2, c27638OooOoo) == enumC32485OooO00o ? enumC32485OooO00o : cloudMetaLocal2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:14:0x0037, B:82:0x01a3, B:19:0x0044, B:74:0x0174, B:22:0x004d, B:65:0x0140, B:30:0x0071, B:41:0x00b7, B:44:0x00bd, B:46:0x00c1, B:48:0x00d0), top: B:93:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:14:0x0037, B:82:0x01a3, B:19:0x0044, B:74:0x0174, B:22:0x004d, B:65:0x0140, B:30:0x0071, B:41:0x00b7, B:44:0x00bd, B:46:0x00c1, B:48:0x00d0), top: B:93:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #1 {all -> 0x010a, blocks: (B:52:0x00ec, B:54:0x00f0, B:59:0x0111, B:61:0x0115, B:68:0x0148, B:70:0x014c, B:76:0x0177, B:78:0x017b, B:84:0x01a6, B:37:0x00a0), top: B:92:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111 A[Catch: all -> 0x010a, TRY_ENTER, TryCatch #1 {all -> 0x010a, blocks: (B:52:0x00ec, B:54:0x00f0, B:59:0x0111, B:61:0x0115, B:68:0x0148, B:70:0x014c, B:76:0x0177, B:78:0x017b, B:84:0x01a6, B:37:0x00a0), top: B:92:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r14v1, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(SyncEvent syncEvent, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27640OooOooO c27640OooOooO;
        Throwable th;
        ?? r14;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C27641OooOooo c27641OooOooo;
        SyncEvent syncEvent2;
        Object objOooO0Oo;
        C27641OooOooo c27641OooOooo2;
        SyncEvent syncEvent3;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Object obj;
        String str;
        Object objOooOO0O;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        String str2;
        CloudMetaLocal cloudMetaLocal;
        SyncEvent syncEvent4;
        CloudMetaLocal cloudMetaLocal2;
        if (abstractC32479OooO0OO instanceof C27640OooOooO) {
            c27640OooOooO = (C27640OooOooO) abstractC32479OooO0OO;
            int i = c27640OooOooO.f97207OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27640OooOooO.f97207OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27640OooOooO = new C27640OooOooO(this, abstractC32479OooO0OO);
            }
        }
        C27640OooOooO c27640OooOooO2 = c27640OooOooO;
        Object obj2 = c27640OooOooO2.f97206OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
            switch (c27640OooOooO2.f97207OooOoo) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj2);
                    c27640OooOooO2.f97203OooOo0o = this;
                    c27640OooOooO2.f97202OooOo = syncEvent;
                    interfaceC33895OooO00o = this.f97211OooO0OO;
                    c27640OooOooO2.f97205OooOoO0 = interfaceC33895OooO00o;
                    c27640OooOooO2.f97207OooOoo = 1;
                    if (interfaceC33895OooO00o.OooO00o(c27640OooOooO2) != enumC32485OooO00o) {
                        c27641OooOooo = this;
                        syncEvent2 = syncEvent;
                        try {
                            InterfaceC27605OooO00o interfaceC27605OooO00o = c27641OooOooo.f97209OooO00o;
                            c27640OooOooO2.f97203OooOo0o = c27641OooOooo;
                            c27640OooOooO2.f97202OooOo = syncEvent2;
                            c27640OooOooO2.f97205OooOoO0 = interfaceC33895OooO00o;
                            c27640OooOooO2.f97207OooOoo = 2;
                            objOooO0Oo = interfaceC27605OooO00o.OooO0Oo(c27640OooOooO2);
                            if (objOooO0Oo != enumC32485OooO00o) {
                                c27641OooOooo2 = c27641OooOooo;
                                syncEvent3 = syncEvent2;
                                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                                obj = objOooO0Oo;
                                if (obj instanceof C32445OooOOOO.OooO00o) {
                                    obj = null;
                                }
                                str = (String) obj;
                                if (str != null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("EnsureCloudMetaLocalUseCase");
                                    c20358OooO00o.OooOO0O("EnsureCloudMetaLocal: driveId is null", new Object[0]);
                                    cloudMetaLocal = null;
                                    interfaceC33895OooO00o2.OooOOO0(null);
                                    return cloudMetaLocal;
                                }
                                InterfaceC27605OooO00o interfaceC27605OooO00o2 = c27641OooOooo2.f97209OooO00o;
                                String id = syncEvent3.getId();
                                c27640OooOooO2.f97203OooOo0o = c27641OooOooo2;
                                c27640OooOooO2.f97202OooOo = syncEvent3;
                                c27640OooOooO2.f97205OooOoO0 = interfaceC33895OooO00o2;
                                c27640OooOooO2.f97204OooOoO = str;
                                c27640OooOooO2.f97207OooOoo = 3;
                                objOooOO0O = interfaceC27605OooO00o2.OooOO0O(id, str, c27640OooOooO2);
                                if (objOooOO0O != enumC32485OooO00o) {
                                    interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                                    str2 = str;
                                    syncEvent4 = syncEvent3;
                                    cloudMetaLocal2 = (CloudMetaLocal) objOooOO0O;
                                    if (cloudMetaLocal2 == null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("EnsureCloudMetaLocalUseCase");
                                        c20358OooO00o2.OooO00o("Use CloudMetaLocal in DB ➜ " + cloudMetaLocal2, new Object[0]);
                                        interfaceC33895OooO00o3.OooOOO0(null);
                                        return cloudMetaLocal2;
                                    }
                                    if (syncEvent4 instanceof SyncEvent.CloudModified) {
                                        String id2 = ((SyncEvent.CloudModified) syncEvent4).getId();
                                        String mimeType = ((SyncEvent.CloudModified) syncEvent4).getDirtyCloudMeta().getMimeType();
                                        C27641OooOooo c27641OooOooo3 = c27641OooOooo2;
                                        SyncPhase syncPhase = SyncPhase.DIRTY_CLOUD;
                                        c27640OooOooO2.f97203OooOo0o = interfaceC33895OooO00o3;
                                        c27640OooOooO2.f97202OooOo = null;
                                        c27640OooOooO2.f97205OooOoO0 = null;
                                        c27640OooOooO2.f97204OooOoO = null;
                                        c27640OooOooO2.f97207OooOoo = 4;
                                        Object objOooO00o = c27641OooOooo3.OooO00o(id2, str2, mimeType, syncPhase, c27640OooOooO2);
                                        if (objOooO00o != enumC32485OooO00o) {
                                            InterfaceC33895OooO00o interfaceC33895OooO00o4 = interfaceC33895OooO00o3;
                                            obj2 = objOooO00o;
                                            interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                                            cloudMetaLocal = (CloudMetaLocal) obj2;
                                            interfaceC33895OooO00o2.OooOOO0(null);
                                            return cloudMetaLocal;
                                        }
                                    } else {
                                        String str3 = str2;
                                        C27641OooOooo c27641OooOooo4 = c27641OooOooo2;
                                        if (syncEvent4 instanceof SyncEvent.LocalModified) {
                                            String id3 = ((SyncEvent.LocalModified) syncEvent4).getId();
                                            String mime = ((SyncEvent.LocalModified) syncEvent4).getMetaType().getMime();
                                            SyncPhase syncPhase2 = SyncPhase.DIRTY_LOCAL;
                                            c27640OooOooO2.f97203OooOo0o = interfaceC33895OooO00o3;
                                            c27640OooOooO2.f97202OooOo = null;
                                            c27640OooOooO2.f97205OooOoO0 = null;
                                            c27640OooOooO2.f97204OooOoO = null;
                                            c27640OooOooO2.f97207OooOoo = 5;
                                            Object objOooO00o2 = c27641OooOooo4.OooO00o(id3, str3, mime, syncPhase2, c27640OooOooO2);
                                            if (objOooO00o2 != enumC32485OooO00o) {
                                                InterfaceC33895OooO00o interfaceC33895OooO00o5 = interfaceC33895OooO00o3;
                                                obj2 = objOooO00o2;
                                                interfaceC33895OooO00o2 = interfaceC33895OooO00o5;
                                                cloudMetaLocal = (CloudMetaLocal) obj2;
                                                interfaceC33895OooO00o2.OooOOO0(null);
                                                return cloudMetaLocal;
                                            }
                                        } else {
                                            if (!(syncEvent4 instanceof SyncEvent.RequestPush)) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o3.OooOOO0("EnsureCloudMetaLocalUseCase");
                                                c20358OooO00o3.OooOO0O("Unreachable branch for event: " + syncEvent4, new Object[0]);
                                                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                                                cloudMetaLocal = null;
                                                interfaceC33895OooO00o2.OooOOO0(null);
                                                return cloudMetaLocal;
                                            }
                                            String id4 = ((SyncEvent.RequestPush) syncEvent4).getId();
                                            String mime2 = ((SyncEvent.RequestPush) syncEvent4).getMetaType().getMime();
                                            SyncPhase syncPhase3 = SyncPhase.DIRTY_LOCAL;
                                            c27640OooOooO2.f97203OooOo0o = interfaceC33895OooO00o3;
                                            c27640OooOooO2.f97202OooOo = null;
                                            c27640OooOooO2.f97205OooOoO0 = null;
                                            c27640OooOooO2.f97204OooOoO = null;
                                            c27640OooOooO2.f97207OooOoo = 6;
                                            Object objOooO00o3 = c27641OooOooo4.OooO00o(id4, str3, mime2, syncPhase3, c27640OooOooO2);
                                            if (objOooO00o3 != enumC32485OooO00o) {
                                                InterfaceC33895OooO00o interfaceC33895OooO00o6 = interfaceC33895OooO00o3;
                                                obj2 = objOooO00o3;
                                                interfaceC33895OooO00o2 = interfaceC33895OooO00o6;
                                                cloudMetaLocal = (CloudMetaLocal) obj2;
                                                interfaceC33895OooO00o2.OooOOO0(null);
                                                return cloudMetaLocal;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            InterfaceC33895OooO00o interfaceC33895OooO00o7 = interfaceC33895OooO00o;
                            th = th2;
                            r14 = interfaceC33895OooO00o7;
                            r14.OooOOO0(null);
                            throw th;
                        }
                    }
                    return enumC32485OooO00o;
                case 1:
                    InterfaceC33895OooO00o interfaceC33895OooO00o8 = c27640OooOooO2.f97205OooOoO0;
                    SyncEvent syncEvent5 = c27640OooOooO2.f97202OooOo;
                    c27641OooOooo = (C27641OooOooo) c27640OooOooO2.f97203OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    interfaceC33895OooO00o = interfaceC33895OooO00o8;
                    syncEvent2 = syncEvent5;
                    InterfaceC27605OooO00o interfaceC27605OooO00o3 = c27641OooOooo.f97209OooO00o;
                    c27640OooOooO2.f97203OooOo0o = c27641OooOooo;
                    c27640OooOooO2.f97202OooOo = syncEvent2;
                    c27640OooOooO2.f97205OooOoO0 = interfaceC33895OooO00o;
                    c27640OooOooO2.f97207OooOoo = 2;
                    objOooO0Oo = interfaceC27605OooO00o3.OooO0Oo(c27640OooOooO2);
                    if (objOooO0Oo != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                case 2:
                    interfaceC33895OooO00o2 = c27640OooOooO2.f97205OooOoO0;
                    SyncEvent syncEvent6 = c27640OooOooO2.f97202OooOo;
                    C27641OooOooo c27641OooOooo5 = (C27641OooOooo) c27640OooOooO2.f97203OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
                    c27641OooOooo2 = c27641OooOooo5;
                    syncEvent3 = syncEvent6;
                    if (obj instanceof C32445OooOOOO.OooO00o) {
                    }
                    str = (String) obj;
                    if (str != null) {
                    }
                    break;
                case 3:
                    str2 = c27640OooOooO2.f97204OooOoO;
                    InterfaceC33895OooO00o interfaceC33895OooO00o9 = c27640OooOooO2.f97205OooOoO0;
                    SyncEvent syncEvent7 = c27640OooOooO2.f97202OooOo;
                    c27641OooOooo2 = (C27641OooOooo) c27640OooOooO2.f97203OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj2);
                        objOooOO0O = obj2;
                        interfaceC33895OooO00o3 = interfaceC33895OooO00o9;
                        syncEvent4 = syncEvent7;
                        cloudMetaLocal2 = (CloudMetaLocal) objOooOO0O;
                        if (cloudMetaLocal2 == null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r14 = interfaceC33895OooO00o9;
                        r14.OooOOO0(null);
                        throw th;
                    }
                    break;
                case 4:
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c27640OooOooO2.f97203OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    cloudMetaLocal = (CloudMetaLocal) obj2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return cloudMetaLocal;
                case 5:
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c27640OooOooO2.f97203OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    cloudMetaLocal = (CloudMetaLocal) obj2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return cloudMetaLocal;
                case 6:
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c27640OooOooO2.f97203OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    cloudMetaLocal = (CloudMetaLocal) obj2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return cloudMetaLocal;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th4) {
            th = th4;
            r14 = syncEvent;
        }
    }
}
