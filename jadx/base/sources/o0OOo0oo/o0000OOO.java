package o0OOo0oo;

import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.C22205OooOOo;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOoO0.C27715OooO0o;
import o0OOoO00.C27723OooO0O0;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0000OOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27665OooooO0 f97456OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27723OooO0O0 f97457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97458OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97459OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C28009OooOOOO f97460OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27129OoooOOO f97461OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27095OooOo0O f97462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27661OoooOoO> f97463OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27715OooO0o f97464OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27639OooOoo0 f97465OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C27635OooOoO f97466OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27684o0000o0 f97467OooOO0o;

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97468OooO00o;

        static {
            int[] iArr = new int[CloudMetaType.values().length];
            try {
                iArr[CloudMetaType.NOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloudMetaType.FOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CloudMetaType.TEMPLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97468OooO00o = iArr;
        }
    }

    public o0000OOO(C27723OooO0O0 facade, InterfaceC27605OooO00o cloudSyncRepo, InterfaceC27313OooOoo0 noteMetaRepo, C28009OooOOOO c28009OooOOOO, C27095OooOo0O c27095OooOo0O, C27129OoooOOO c27129OoooOOO, Map map, C27715OooO0o migrationGuard, C27665OooooO0 legacyMigrationUseCase, C27639OooOoo0 cloudSyncRemoteConfig, C27635OooOoO c27635OooOoO, C27684o0000o0 notificationBus) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(facade, "facade");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(migrationGuard, "migrationGuard");
        kotlin.jvm.internal.OooOOO0.OooO0oO(legacyMigrationUseCase, "legacyMigrationUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRemoteConfig, "cloudSyncRemoteConfig");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notificationBus, "notificationBus");
        this.f97457OooO00o = facade;
        this.f97458OooO0O0 = cloudSyncRepo;
        this.f97459OooO0OO = noteMetaRepo;
        this.f97460OooO0Oo = c28009OooOOOO;
        this.f97462OooO0o0 = c27095OooOo0O;
        this.f97461OooO0o = c27129OoooOOO;
        this.f97463OooO0oO = map;
        this.f97464OooO0oo = migrationGuard;
        this.f97456OooO = legacyMigrationUseCase;
        this.f97465OooOO0 = cloudSyncRemoteConfig;
        this.f97466OooOO0O = c27635OooOoO;
        this.f97467OooOO0o = notificationBus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0151, code lost:
    
        if (r1 != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0202, code lost:
    
        if (r1.OooO0Oo(r5) == r3) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4 A[PHI: r1 r4
      0x00f4: PHI (r1v19 java.lang.Object) = (r1v18 java.lang.Object), (r1v26 java.lang.Object) binds: [B:35:0x00f0, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r4v6 o0OOo0oo.o0000OOO) = (r4v4 o0OOo0oo.o0000OOO), (r4v7 o0OOo0oo.o0000OOO) binds: [B:35:0x00f0, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01e4 -> B:77:0x01e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27678o0000OOo c27678o0000OOo;
        o0000OOO o0000ooo;
        Object objOooO0Oo;
        String str;
        String str2;
        o0000OOO o0000ooo2;
        List list;
        CloudMetaType[] cloudMetaTypeArrValues;
        String str3;
        o0000OOO o0000ooo3;
        List list2;
        List list3;
        int length;
        boolean z;
        int i;
        if (abstractC32479OooO0OO instanceof C27678o0000OOo) {
            c27678o0000OOo = (C27678o0000OOo) abstractC32479OooO0OO;
            int i2 = c27678o0000OOo.f97478Oooo000;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27678o0000OOo.f97478Oooo000 = i2 - Integer.MIN_VALUE;
            } else {
                c27678o0000OOo = new C27678o0000OOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27678o0000OOo.f97476OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        boolean z2 = true;
        int i3 = 0;
        switch (c27678o0000OOo.f97478Oooo000) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO00o);
                if (!this.f97465OooOO0.OooO00o()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("SyncAllUseCase");
                    c20358OooO00o.OooOO0O("syncAllCloudMetas: cloud sync is remotely disabled", new Object[0]);
                    this.f97467OooOO0o.OooO00o(new CloudSyncError.RemoteDisabled(null, 1, null));
                    return C32460OooOooO.f116667OooO00o;
                }
                c27678o0000OOo.f97470OooOo0o = this;
                c27678o0000OOo.f97478Oooo000 = 1;
                objOooO00o = this.f97466OooOO0O.OooO00o(c27678o0000OOo);
                if (objOooO00o != enumC32485OooO00o) {
                    o0000ooo = this;
                    if (((Boolean) objOooO00o).booleanValue()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("SyncAllUseCase");
                        c20358OooO00o2.OooOO0O("syncAllCloudMetas: network strategy does not allow sync now", new Object[0]);
                        o0000ooo.f97467OooOO0o.OooO00o(new CloudSyncError.DisallowToUseCellular(null, 1, null));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C27665OooooO0 c27665OooooO0 = o0000ooo.f97456OooO;
                    c27678o0000OOo.f97470OooOo0o = o0000ooo;
                    c27678o0000OOo.f97478Oooo000 = 2;
                    if (c27665OooooO0.OooO0OO(c27678o0000OOo) != enumC32485OooO00o) {
                        InterfaceC27605OooO00o interfaceC27605OooO00o = o0000ooo.f97458OooO0O0;
                        c27678o0000OOo.f97470OooOo0o = o0000ooo;
                        c27678o0000OOo.f97478Oooo000 = 3;
                        objOooO0Oo = interfaceC27605OooO00o.OooO0Oo(c27678o0000OOo);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            str = (String) (!(objOooO0Oo instanceof C32445OooOOOO.OooO00o) ? null : objOooO0Oo);
                            if (str != null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("SyncAllUseCase");
                                c20358OooO00o3.OooOO0O("syncAllCloudMetas: driveId is null, skip syncing", new Object[0]);
                                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0Oo);
                                if (thOooO00o != null && (thOooO00o instanceof CloudSyncError)) {
                                    c20358OooO00o3.OooOOO0("SyncAllUseCase");
                                    c20358OooO00o3.OooO0Oo(thOooO00o, "syncAllCloudMetas: failed to get driveId", new Object[0]);
                                    o0000ooo.f97467OooOO0o.OooO00o((CloudSyncError) thOooO00o);
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                            InterfaceC27605OooO00o interfaceC27605OooO00o2 = o0000ooo.f97458OooO0O0;
                            c27678o0000OOo.f97470OooOo0o = o0000ooo;
                            c27678o0000OOo.f97469OooOo = str;
                            c27678o0000OOo.f97478Oooo000 = 4;
                            objOooO00o = interfaceC27605OooO00o2.OooOOo0(str, c27678o0000OOo);
                            if (objOooO00o != enumC32485OooO00o) {
                                str2 = str;
                                o0000ooo2 = o0000ooo;
                                list = (List) objOooO00o;
                                InterfaceC27605OooO00o interfaceC27605OooO00o3 = o0000ooo2.f97458OooO0O0;
                                c27678o0000OOo.f97470OooOo0o = o0000ooo2;
                                c27678o0000OOo.f97469OooOo = str2;
                                c27678o0000OOo.f97472OooOoO0 = list;
                                c27678o0000OOo.f97478Oooo000 = 5;
                                objOooO00o = interfaceC27605OooO00o3.Oooo0o(str2, c27678o0000OOo);
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                o0000ooo = c27678o0000OOo.f97470OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                if (((Boolean) objOooO00o).booleanValue()) {
                }
                break;
            case 2:
                o0000ooo = c27678o0000OOo.f97470OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                InterfaceC27605OooO00o interfaceC27605OooO00o4 = o0000ooo.f97458OooO0O0;
                c27678o0000OOo.f97470OooOo0o = o0000ooo;
                c27678o0000OOo.f97478Oooo000 = 3;
                objOooO0Oo = interfaceC27605OooO00o4.OooO0Oo(c27678o0000OOo);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                o0000ooo = c27678o0000OOo.f97470OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                objOooO0Oo = ((C32445OooOOOO) objOooO00o).f116639OooOo0o;
                str = (String) (!(objOooO0Oo instanceof C32445OooOOOO.OooO00o) ? null : objOooO0Oo);
                if (str != null) {
                }
                break;
            case 4:
                String str4 = c27678o0000OOo.f97469OooOo;
                o0000OOO o0000ooo4 = c27678o0000OOo.f97470OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                o0000ooo2 = o0000ooo4;
                str2 = str4;
                list = (List) objOooO00o;
                InterfaceC27605OooO00o interfaceC27605OooO00o32 = o0000ooo2.f97458OooO0O0;
                c27678o0000OOo.f97470OooOo0o = o0000ooo2;
                c27678o0000OOo.f97469OooOo = str2;
                c27678o0000OOo.f97472OooOoO0 = list;
                c27678o0000OOo.f97478Oooo000 = 5;
                objOooO00o = interfaceC27605OooO00o32.Oooo0o(str2, c27678o0000OOo);
                break;
            case 5:
                list = c27678o0000OOo.f97472OooOoO0;
                str2 = c27678o0000OOo.f97469OooOo;
                o0000ooo2 = c27678o0000OOo.f97470OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                cloudMetaTypeArrValues = CloudMetaType.values();
                str3 = str2;
                o0000ooo3 = o0000ooo2;
                list2 = (List) objOooO00o;
                list3 = list;
                length = cloudMetaTypeArrValues.length;
                if (i3 < length) {
                    CloudMetaType cloudMetaType = cloudMetaTypeArrValues[i3];
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list3) {
                        boolean z3 = z2;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaLocal) obj).getMimeType(), cloudMetaType.getMime())) {
                            arrayList.add(obj);
                        }
                        z2 = z3;
                    }
                    z = z2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaRemote) obj2).getMimeType(), cloudMetaType.getMime())) {
                            arrayList2.add(obj2);
                        }
                    }
                    c27678o0000OOo.f97470OooOo0o = o0000ooo3;
                    c27678o0000OOo.f97469OooOo = str3;
                    c27678o0000OOo.f97472OooOoO0 = list3;
                    c27678o0000OOo.f97471OooOoO = list2;
                    c27678o0000OOo.f97473OooOoOO = cloudMetaTypeArrValues;
                    c27678o0000OOo.f97475OooOoo0 = i3;
                    c27678o0000OOo.f97474OooOoo = length;
                    c27678o0000OOo.f97478Oooo000 = 6;
                    C27678o0000OOo c27678o0000OOo2 = c27678o0000OOo;
                    if (o0000ooo3.OooO0Oo(str3, arrayList, arrayList2, cloudMetaType, c27678o0000OOo2) != enumC32485OooO00o) {
                        c27678o0000OOo = c27678o0000OOo2;
                        i = i3;
                        i3 = i + 1;
                        z2 = z;
                        if (i3 < length) {
                            C27678o0000OOo c27678o0000OOo3 = c27678o0000OOo;
                            C27723OooO0O0 c27723OooO0O0 = o0000ooo3.f97457OooO00o;
                            c27678o0000OOo3.f97470OooOo0o = null;
                            c27678o0000OOo3.f97469OooOo = null;
                            c27678o0000OOo3.f97472OooOoO0 = null;
                            c27678o0000OOo3.f97471OooOoO = null;
                            c27678o0000OOo3.f97473OooOoOO = null;
                            c27678o0000OOo3.f97478Oooo000 = 7;
                            break;
                        }
                    }
                }
                return enumC32485OooO00o;
            case 6:
                length = c27678o0000OOo.f97474OooOoo;
                i = c27678o0000OOo.f97475OooOoo0;
                CloudMetaType[] cloudMetaTypeArr = c27678o0000OOo.f97473OooOoOO;
                list2 = c27678o0000OOo.f97471OooOoO;
                List list4 = c27678o0000OOo.f97472OooOoO0;
                String str5 = c27678o0000OOo.f97469OooOo;
                o0000ooo3 = c27678o0000OOo.f97470OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                z = true;
                list3 = list4;
                str3 = str5;
                cloudMetaTypeArrValues = cloudMetaTypeArr;
                i3 = i + 1;
                z2 = z;
                if (i3 < length) {
                }
                return enumC32485OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(objOooO00o);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|(3:159|15|16)|155|129|133|(1:135)(1:136)|137|(1:139)|140|(1:142)(1:122)|(1:144)|145|117|(2:119|(6:121|122|(0)|145|117|(7:146|(1:148)|149|(2:152|150)|165|153|154)(0))(4:123|124|125|126))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x034e, code lost:
    
        if (r0 == r3) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0357, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x035c, code lost:
    
        r0 = oO00ooO.C32446OooOOOo.OooO00o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0324 A[PHI: r2 r5 r6 r7 r8 r9 r13 r14 r15 r16
      0x0324: PHI (r2v20 o0OOo0oo.o0000Oo0) = (r2v15 o0OOo0oo.o0000Oo0), (r2v23 o0OOo0oo.o0000Oo0) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r5v27 java.lang.Object) = (r5v25 java.lang.Object), (r5v28 java.lang.Object) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r6v19 java.util.Iterator) = (r6v17 java.util.Iterator), (r6v20 java.util.Iterator) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r7v17 com.orion.notein.domain.models.cloudsync.CloudMetaType) = 
      (r7v15 com.orion.notein.domain.models.cloudsync.CloudMetaType)
      (r7v18 com.orion.notein.domain.models.cloudsync.CloudMetaType)
     binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r8v22 java.util.Collection) = (r8v18 java.util.Collection), (r8v23 java.util.Collection) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r9v13 java.util.Map) = (r9v11 java.util.Map), (r9v14 java.util.Map) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r13v24 o0OOo0oo.o0000OOO) = (r13v22 o0OOo0oo.o0000OOO), (r13v25 o0OOo0oo.o0000OOO) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r14v25 java.util.Map) = (r14v23 java.util.Map), (r14v26 java.util.Map) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r15v13 o0OOo0oo.OoooOoO) = (r15v11 o0OOo0oo.OoooOoO), (r15v14 o0OOo0oo.OoooOoO) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r16v2 oO00ooo0.OooO00o) = (r16v0 oO00ooo0.OooO00o), (r16v4 oO00ooo0.OooO00o) binds: [B:121:0x0322, B:141:0x038f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183 A[LOOP:3: B:61:0x017d->B:63:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f9 A[LOOP:5: B:77:0x01f3->B:79:0x01f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239 A[PHI: r2 r5 r6 r7 r8 r9 r13 r14 r15
      0x0239: PHI (r2v7 o0OOo0oo.o0000Oo0) = (r2v5 o0OOo0oo.o0000Oo0), (r2v10 o0OOo0oo.o0000Oo0) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r5v19 java.lang.Object) = (r5v17 java.lang.Object), (r5v21 java.lang.Object) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r6v13 java.util.Iterator) = (r6v10 java.util.Iterator), (r6v14 java.util.Iterator) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r7v11 java.util.Collection) = (r7v6 java.util.Collection), (r7v12 java.util.Collection) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r8v14 o0OOo0oo.o0000OOO) = (r8v11 o0OOo0oo.o0000OOO), (r8v15 o0OOo0oo.o0000OOO) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r9v7 java.util.Map) = (r9v5 java.util.Map), (r9v8 java.util.Map) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r13v18 java.util.Map) = (r13v15 java.util.Map), (r13v19 java.util.Map) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r14v19 o0OOo0oo.OoooOoO) = (r14v16 o0OOo0oo.OoooOoO), (r14v20 o0OOo0oo.OoooOoO) binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r15v7 com.orion.notein.domain.models.cloudsync.CloudMetaType) = 
      (r15v4 com.orion.notein.domain.models.cloudsync.CloudMetaType)
      (r15v8 com.orion.notein.domain.models.cloudsync.CloudMetaType)
     binds: [B:84:0x0237, B:104:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0322 -> B:122:0x0324). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x034e -> B:155:0x0351). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0237 -> B:85:0x0239). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0263 -> B:161:0x0267). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(List list, CloudMetaType cloudMetaType, InterfaceC27661OoooOoO interfaceC27661OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27680o0000Oo0 c27680o0000Oo0;
        List list2;
        CloudMetaType cloudMetaType2;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO2;
        Object objOooO0Oo;
        o0000OOO o0000ooo;
        CloudMetaType cloudMetaType3;
        o0000OOO o0000ooo2;
        Map map;
        ArrayList<String> arrayList;
        Map map2;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO3;
        CloudMetaType cloudMetaType4;
        o0000OOO o0000ooo3;
        Map map3;
        Collection arrayList2;
        Iterator it;
        Object objOooO00o;
        Iterator it2;
        CloudMetaType cloudMetaType5;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO4;
        Map map4;
        o0000OOO o0000ooo4;
        Collection collection;
        boolean z;
        Throwable thOooO00o;
        C27680o0000Oo0 c27680o0000Oo02;
        Object obj;
        Object objOooO00o2;
        EnumC32485OooO00o enumC32485OooO00o;
        boolean z2;
        Throwable thOooO00o2;
        C27680o0000Oo0 c27680o0000Oo03;
        if (abstractC32479OooO0OO instanceof C27680o0000Oo0) {
            c27680o0000Oo0 = (C27680o0000Oo0) abstractC32479OooO0OO;
            int i = c27680o0000Oo0.f97502Oooo00o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27680o0000Oo0.f97502Oooo00o = i - Integer.MIN_VALUE;
            } else {
                c27680o0000Oo0 = new C27680o0000Oo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0o = c27680o0000Oo0.f97500Oooo000;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27680o0000Oo0.f97502Oooo00o;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0o);
            c27680o0000Oo0.f97492OooOo0o = this;
            list2 = list;
            c27680o0000Oo0.f97491OooOo = list2;
            cloudMetaType2 = cloudMetaType;
            c27680o0000Oo0.f97494OooOoO0 = cloudMetaType2;
            interfaceC27661OoooOoO2 = interfaceC27661OoooOoO;
            c27680o0000Oo0.f97493OooOoO = interfaceC27661OoooOoO2;
            c27680o0000Oo0.f97502Oooo00o = 1;
            objOooO0Oo = this.f97458OooO0O0.OooO0Oo(c27680o0000Oo0);
            if (objOooO0Oo != enumC32485OooO00o2) {
                o0000ooo = this;
            }
            return enumC32485OooO00o2;
        }
        if (i2 == 1) {
            InterfaceC27661OoooOoO interfaceC27661OoooOoO5 = (InterfaceC27661OoooOoO) c27680o0000Oo0.f97493OooOoO;
            CloudMetaType cloudMetaType6 = (CloudMetaType) c27680o0000Oo0.f97494OooOoO0;
            List list3 = (List) c27680o0000Oo0.f97491OooOo;
            o0000ooo = c27680o0000Oo0.f97492OooOo0o;
            C32446OooOOOo.OooO0O0(objOooo0o);
            objOooO0Oo = ((C32445OooOOOO) objOooo0o).f116639OooOo0o;
            list2 = list3;
            interfaceC27661OoooOoO2 = interfaceC27661OoooOoO5;
            cloudMetaType2 = cloudMetaType6;
        } else if (i2 == 2) {
            map = (Map) c27680o0000Oo0.f97493OooOoO;
            interfaceC27661OoooOoO2 = (InterfaceC27661OoooOoO) c27680o0000Oo0.f97494OooOoO0;
            cloudMetaType3 = (CloudMetaType) c27680o0000Oo0.f97491OooOo;
            o0000ooo2 = c27680o0000Oo0.f97492OooOo0o;
            C32446OooOOOo.OooO0O0(objOooo0o);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : (Iterable) objOooo0o) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaRemote) obj2).getMimeType(), cloudMetaType3.getMime())) {
                    arrayList3.add(obj2);
                }
            }
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList3, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo >= 16 ? iOooO0Oo : 16);
            for (Object obj3 : arrayList3) {
                linkedHashMap.put(((CloudMetaRemote) obj3).getId(), obj3);
            }
            Set setKeySet = linkedHashMap.keySet();
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet) {
                String str = (String) obj4;
                if (((CloudMetaLocal) map.get(str)) == null) {
                    Object obj5 = linkedHashMap.get(str);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj5);
                    if (!((CloudMetaRemote) obj5).getDeleted()) {
                        arrayList.add(obj4);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SyncAllUseCase");
                c20358OooO00o.OooO0o0("pullCloudMetas: found " + arrayList + " created cloud metas for " + cloudMetaType3, new Object[0]);
            }
            for (String str2 : arrayList) {
                C27723OooO0O0 c27723OooO0O0 = o0000ooo2.f97457OooO00o;
                Object obj6 = linkedHashMap.get(str2);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj6);
                c27723OooO0O0.OooO0O0(str2, (CloudMetaRemote) obj6);
            }
            Set setKeySet2 = linkedHashMap.keySet();
            map2 = map;
            interfaceC27661OoooOoO3 = interfaceC27661OoooOoO2;
            cloudMetaType4 = cloudMetaType3;
            o0000ooo3 = o0000ooo2;
            map3 = linkedHashMap;
            arrayList2 = new ArrayList();
            it = setKeySet2.iterator();
            if (!it.hasNext()) {
            }
        } else if (i2 == 3) {
            String str3 = (String) c27680o0000Oo0.f97499OooOooo;
            Object next = c27680o0000Oo0.f97498OooOooO;
            it = c27680o0000Oo0.f97496OooOoo;
            arrayList2 = c27680o0000Oo0.f97497OooOoo0;
            map3 = c27680o0000Oo0.f97495OooOoOO;
            map2 = (Map) c27680o0000Oo0.f97493OooOoO;
            interfaceC27661OoooOoO3 = (InterfaceC27661OoooOoO) c27680o0000Oo0.f97494OooOoO0;
            cloudMetaType4 = (CloudMetaType) c27680o0000Oo0.f97491OooOo;
            o0000ooo3 = c27680o0000Oo0.f97492OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooo0o);
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Boolean bool = Boolean.FALSE;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                c27680o0000Oo0 = c27680o0000Oo02;
                next = obj;
                if (((Boolean) objOooO00o).booleanValue()) {
                }
                if (z) {
                }
                if (!it.hasNext()) {
                }
            }
            try {
            } catch (Throwable th2) {
                objOooO00o = C32446OooOOOo.OooO00o(th2);
            }
            objOooO00o = (Boolean) objOooo0o;
            objOooO00o.getClass();
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c27680o0000Oo02 = c27680o0000Oo0;
                obj = next;
                c20358OooO00o2.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "SyncAllUseCase", "isCloudDeleted failed for ", str3), new Object[0]);
            } else {
                c27680o0000Oo02 = c27680o0000Oo0;
                obj = next;
            }
            Boolean bool2 = Boolean.FALSE;
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = bool2;
            }
            c27680o0000Oo0 = c27680o0000Oo02;
            next = obj;
            z = ((Boolean) objOooO00o).booleanValue();
            if (z) {
                arrayList2.add(next);
            }
            if (!it.hasNext()) {
                next = it.next();
                str3 = (String) next;
                CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) map2.get(str3);
                if (cloudMetaLocal != null) {
                    Object obj7 = map3.get(str3);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj7);
                    CloudMetaRemote cloudMetaRemote = (CloudMetaRemote) obj7;
                    c27680o0000Oo0.f97492OooOo0o = o0000ooo3;
                    c27680o0000Oo0.f97491OooOo = cloudMetaType4;
                    c27680o0000Oo0.f97494OooOoO0 = interfaceC27661OoooOoO3;
                    c27680o0000Oo0.f97493OooOoO = map2;
                    c27680o0000Oo0.f97495OooOoOO = map3;
                    c27680o0000Oo0.f97497OooOoo0 = arrayList2;
                    c27680o0000Oo0.f97496OooOoo = it;
                    c27680o0000Oo0.f97498OooOooO = next;
                    c27680o0000Oo0.f97499OooOooo = str3;
                    c27680o0000Oo0.f97502Oooo00o = 3;
                    objOooo0o = interfaceC27661OoooOoO3.OooO0O0(cloudMetaRemote, cloudMetaLocal);
                    if (objOooo0o == enumC32485OooO00o2) {
                        return enumC32485OooO00o2;
                    }
                    objOooO00o = (Boolean) objOooo0o;
                    objOooO00o.getClass();
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o != null) {
                    }
                    Boolean bool22 = Boolean.FALSE;
                    if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                    }
                    c27680o0000Oo0 = c27680o0000Oo02;
                    next = obj;
                    if (((Boolean) objOooO00o).booleanValue()) {
                    }
                    if (z) {
                    }
                    if (!it.hasNext()) {
                        List<String> list4 = (List) arrayList2;
                        if (!list4.isEmpty()) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("SyncAllUseCase");
                            c20358OooO00o3.OooO0o0("pullCloudMetas: found " + list4 + " deleted cloud metas for " + cloudMetaType4, new Object[0]);
                        }
                        for (String str4 : list4) {
                            C27723OooO0O0 c27723OooO0O02 = o0000ooo3.f97457OooO00o;
                            Object obj8 = map3.get(str4);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj8);
                            c27723OooO0O02.OooO00o(str4, (CloudMetaRemote) obj8);
                        }
                        Set setKeySet3 = map3.keySet();
                        ArrayList arrayList4 = new ArrayList();
                        it2 = setKeySet3.iterator();
                        cloudMetaType5 = cloudMetaType4;
                        interfaceC27661OoooOoO4 = interfaceC27661OoooOoO3;
                        map4 = map2;
                        o0000ooo4 = o0000ooo3;
                        collection = arrayList4;
                        if (!it2.hasNext()) {
                        }
                    }
                }
                if (z) {
                }
                if (!it.hasNext()) {
                }
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CloudMetaLocal cloudMetaLocal2 = (CloudMetaLocal) c27680o0000Oo0.f97499OooOooo;
            Object next2 = c27680o0000Oo0.f97498OooOooO;
            it2 = c27680o0000Oo0.f97496OooOoo;
            collection = c27680o0000Oo0.f97497OooOoo0;
            map3 = c27680o0000Oo0.f97495OooOoOO;
            map4 = (Map) c27680o0000Oo0.f97493OooOoO;
            interfaceC27661OoooOoO4 = (InterfaceC27661OoooOoO) c27680o0000Oo0.f97494OooOoO0;
            cloudMetaType5 = (CloudMetaType) c27680o0000Oo0.f97491OooOo;
            o0000ooo4 = c27680o0000Oo0.f97492OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooo0o);
            } catch (Throwable th3) {
                objOooO00o2 = C32446OooOOOo.OooO00o(th3);
                thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
                if (thOooO00o2 == null) {
                }
                Boolean bool3 = Boolean.FALSE;
                if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                }
                c27680o0000Oo0 = c27680o0000Oo03;
                if (!((Boolean) objOooO00o2).booleanValue()) {
                }
                if (z2) {
                }
                enumC32485OooO00o2 = enumC32485OooO00o;
                if (!it2.hasNext()) {
                }
            }
            objOooO00o2 = (Boolean) objOooo0o;
            objOooO00o2.getClass();
            thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
            if (thOooO00o2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("SyncAllUseCase");
                c27680o0000Oo03 = c27680o0000Oo0;
                enumC32485OooO00o = enumC32485OooO00o2;
                c20358OooO00o4.OooO0Oo(thOooO00o2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isCloudModified/isCloudDeleted failed for ", cloudMetaLocal2.getId()), new Object[0]);
            } else {
                c27680o0000Oo03 = c27680o0000Oo0;
                enumC32485OooO00o = enumC32485OooO00o2;
            }
            Boolean bool32 = Boolean.FALSE;
            if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                objOooO00o2 = bool32;
            }
            c27680o0000Oo0 = c27680o0000Oo03;
            z2 = !((Boolean) objOooO00o2).booleanValue();
            if (z2) {
                collection.add(next2);
            }
            enumC32485OooO00o2 = enumC32485OooO00o;
            if (!it2.hasNext()) {
                next2 = it2.next();
                String str5 = (String) next2;
                cloudMetaLocal2 = (CloudMetaLocal) map4.get(str5);
                if (cloudMetaLocal2 == null) {
                    enumC32485OooO00o = enumC32485OooO00o2;
                    if (z2) {
                    }
                    enumC32485OooO00o2 = enumC32485OooO00o;
                    if (!it2.hasNext()) {
                        List<String> list5 = (List) collection;
                        if (!list5.isEmpty()) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o5.OooOOO0("SyncAllUseCase");
                            c20358OooO00o5.OooO0o0("pullCloudMetas: found " + list5 + " updated cloud metas for " + cloudMetaType5, new Object[0]);
                        }
                        for (String metaId : list5) {
                            C27723OooO0O0 c27723OooO0O03 = o0000ooo4.f97457OooO00o;
                            c27723OooO0O03.getClass();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(metaId, "metaId");
                            c27723OooO0O03.f97800OooO00o.OooO0o0(new SyncEvent.RequestPull(metaId));
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                } else {
                    Object obj9 = map3.get(str5);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(obj9);
                    CloudMetaRemote cloudMetaRemote2 = (CloudMetaRemote) obj9;
                    c27680o0000Oo0.f97492OooOo0o = o0000ooo4;
                    c27680o0000Oo0.f97491OooOo = cloudMetaType5;
                    c27680o0000Oo0.f97494OooOoO0 = interfaceC27661OoooOoO4;
                    c27680o0000Oo0.f97493OooOoO = map4;
                    c27680o0000Oo0.f97495OooOoOO = map3;
                    c27680o0000Oo0.f97497OooOoo0 = collection;
                    c27680o0000Oo0.f97496OooOoo = it2;
                    c27680o0000Oo0.f97498OooOooO = next2;
                    c27680o0000Oo0.f97499OooOooo = cloudMetaLocal2;
                    c27680o0000Oo0.f97502Oooo00o = 4;
                    objOooo0o = interfaceC27661OoooOoO4.OooO0OO(cloudMetaRemote2, cloudMetaLocal2);
                }
            }
        }
        if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            objOooO0Oo = null;
        }
        String str6 = (String) objOooO0Oo;
        if (str6 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o6.OooOOO0("SyncAllUseCase");
            c20358OooO00o6.OooOO0O("pullCloudMetas: driveId is null, return empty list", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        List list6 = list2;
        int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list6, 10));
        if (iOooO0Oo2 < 16) {
            iOooO0Oo2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo2);
        for (Object obj10 : list6) {
            linkedHashMap2.put(((CloudMetaLocal) obj10).getId(), obj10);
        }
        InterfaceC27605OooO00o interfaceC27605OooO00o = o0000ooo.f97458OooO0O0;
        c27680o0000Oo0.f97492OooOo0o = o0000ooo;
        c27680o0000Oo0.f97491OooOo = cloudMetaType2;
        c27680o0000Oo0.f97494OooOoO0 = interfaceC27661OoooOoO2;
        c27680o0000Oo0.f97493OooOoO = linkedHashMap2;
        c27680o0000Oo0.f97502Oooo00o = 2;
        objOooo0o = interfaceC27605OooO00o.Oooo0o(str6, c27680o0000Oo0);
        if (objOooo0o != enumC32485OooO00o2) {
            cloudMetaType3 = cloudMetaType2;
            o0000ooo2 = o0000ooo;
            map = linkedHashMap2;
            ArrayList arrayList32 = new ArrayList();
            while (r0.hasNext()) {
            }
            int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList32, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo3 >= 16 ? iOooO0Oo3 : 16);
            while (r5.hasNext()) {
            }
            Set setKeySet4 = linkedHashMap3.keySet();
            arrayList = new ArrayList();
            while (r5.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
            while (r5.hasNext()) {
            }
            Set setKeySet22 = linkedHashMap3.keySet();
            map2 = map;
            interfaceC27661OoooOoO3 = interfaceC27661OoooOoO2;
            cloudMetaType4 = cloudMetaType3;
            o0000ooo3 = o0000ooo2;
            map3 = linkedHashMap3;
            arrayList2 = new ArrayList();
            it = setKeySet22.iterator();
            if (!it.hasNext()) {
            }
        }
        return enumC32485OooO00o2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:12|(3:201|13|14)|197|148|158|(1:160)(1:161)|162|(1:164)|165|(1:171)(1:170)|172|(1:174)(2:175|(1:177))|178|(1:180)(1:141)|(1:182)|183|136|(2:138|(6:140|141|(0)|183|136|(10:184|(2:187|185)|213|188|(1:190)|191|(2:194|192)|214|195|196)(0))(7:205|142|143|203|144|(18:147|197|148|158|(0)(0)|162|(0)|165|(1:167)|171|172|(0)(0)|178|(0)(0)|(0)|183|136|(0)(0))|146))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:205)|142|143|203|144|(18:147|197|148|158|(0)(0)|162|(0)|165|(1:167)|171|172|(0)(0)|178|(0)(0)|(0)|183|136|(0)(0))|146) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:211)|87|88|209|89|(14:92|207|93|94|103|(0)(0)|107|(0)|110|(1:112)|115|(0)|120|119)|146) */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03e2, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e4, code lost:
    
        r11 = r2;
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029d, code lost:
    
        r18 = r14;
        r14 = r5;
        r5 = r7;
        r7 = r8;
        r8 = r11;
        r11 = r18;
        r18 = r2;
        r2 = r10;
        r10 = r3;
        r3 = r15;
        r15 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Path cross not found for [B:112:0x02ed, B:115:0x02f5], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:115:0x02f5, B:112:0x02ed], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:117:0x02f8, B:120:0x0303], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:120:0x0303, B:117:0x02f8], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:167:0x0425, B:171:0x0434], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:171:0x0434, B:167:0x0425], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b4 A[PHI: r2 r3 r4 r5 r7 r8 r14 r15 r19 r22 r26
      0x03b4: PHI (r2v26 java.util.Set) = (r2v14 java.util.Set), (r2v33 java.util.Set) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r3v20 java.lang.Object) = (r3v18 java.lang.Object), (r3v24 java.lang.Object) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r4v37 com.orion.notein.domain.models.cloudsync.CloudMetaType) = 
      (r4v34 com.orion.notein.domain.models.cloudsync.CloudMetaType)
      (r4v42 com.orion.notein.domain.models.cloudsync.CloudMetaType)
     binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r5v16 o0OOo0oo.o0000Oo) = (r5v14 o0OOo0oo.o0000Oo), (r5v23 o0OOo0oo.o0000Oo) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r7v33 java.util.Iterator) = (r7v31 java.util.Iterator), (r7v36 java.util.Iterator) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r8v31 o0OOo0oo.o0000OOO) = (r8v29 o0OOo0oo.o0000OOO), (r8v34 o0OOo0oo.o0000OOO) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r14v28 java.util.Collection) = (r14v24 java.util.Collection), (r14v31 java.util.Collection) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r15v16 o0OOo0oo.OoooOoO) = (r15v14 o0OOo0oo.OoooOoO), (r15v18 o0OOo0oo.OoooOoO) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r19v2 oO00ooo0.OooO00o) = (r19v0 oO00ooo0.OooO00o), (r19v4 oO00ooo0.OooO00o) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r22v3 java.lang.String) = (r22v1 java.lang.String), (r22v5 java.lang.String) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]
      0x03b4: PHI (r26v3 java.lang.String) = (r26v1 java.lang.String), (r26v5 java.lang.String) binds: [B:140:0x03ae, B:179:0x0552] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02b1 -> B:94:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x03ae -> B:141:0x03b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x03d7 -> B:197:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x03ec -> B:158:0x03f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0222 -> B:121:0x030a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x025c -> B:121:0x030a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x027f -> B:207:0x028e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(C32463OooO c32463OooO, C32465OooO0O0 c32465OooO0O0, CloudMetaType cloudMetaType, InterfaceC27661OoooOoO interfaceC27661OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27679o0000Oo c27679o0000Oo;
        C27723OooO0O0 c27723OooO0O0;
        o0000OOO o0000ooo;
        Collection arrayList;
        Iterator it;
        CloudMetaType cloudMetaType2;
        C27679o0000Oo c27679o0000Oo2;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO2;
        List list;
        Set set;
        Set set2;
        List list2;
        Throwable th;
        Object objOooO00o;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO3;
        o0000OOO o0000ooo2;
        Collection arrayList2;
        Iterator it2;
        CloudMetaType cloudMetaType3;
        Throwable thOooO00o;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO4;
        CloudMetaLocal cloudMetaLocal;
        boolean zBooleanValue;
        Set set3;
        Throwable th2;
        CloudMetaType cloudMetaType4;
        Object objOooO00o2;
        EnumC32485OooO00o enumC32485OooO00o;
        String str;
        String str2;
        boolean z;
        Throwable thOooO00o2;
        CloudMetaLocal cloudMetaLocal2;
        Object obj;
        boolean zBooleanValue2;
        C27679o0000Oo c27679o0000Oo3;
        Iterator it3;
        o0000OOO o0000ooo3;
        Set set4;
        Collection collection;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO5;
        if (abstractC32479OooO0OO instanceof C27679o0000Oo) {
            c27679o0000Oo = (C27679o0000Oo) abstractC32479OooO0OO;
            int i = c27679o0000Oo.f97490Oooo00o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27679o0000Oo.f97490Oooo00o = i - Integer.MIN_VALUE;
            } else {
                c27679o0000Oo = new C27679o0000Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c27679o0000Oo.f97488Oooo000;
        EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27679o0000Oo.f97490Oooo00o;
        String str3 = "pushCloudMetas: found ";
        String str4 = "SyncAllUseCase";
        boolean z2 = false;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32465OooO0O0, 10));
            Iterator<E> it4 = c32465OooO0O0.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((CloudMetaLocal) it4.next()).getId());
            }
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList3);
            kotlin.jvm.internal.OooOOO0.OooO0oO(c32463OooO, "<this>");
            Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo(c32463OooO);
            C34431OooOo0.OooOo0o(setO0Oo0oo, setO0OO00O);
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(c32465OooO0O0, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj3 : c32465OooO0O0) {
                linkedHashMap.put(((CloudMetaLocal) obj3).getId(), obj3);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : setO0Oo0oo) {
                Object obj5 = (String) obj4;
                if (c32463OooO.f116671OooOo0o.containsKey(obj5) && ((CloudMetaLocal) linkedHashMap.get(obj5)) == null) {
                    arrayList4.add(obj4);
                }
            }
            if (!arrayList4.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SyncAllUseCase");
                c20358OooO00o.OooO0o0("pushCloudMetas: found " + arrayList4 + " created local metas for " + cloudMetaType, new Object[0]);
            }
            Iterator it5 = arrayList4.iterator();
            while (true) {
                boolean zHasNext = it5.hasNext();
                c27723OooO0O0 = this.f97457OooO00o;
                if (!zHasNext) {
                    break;
                }
                String str5 = (String) it5.next();
                c27723OooO0O0.OooO0OO(str5, cloudMetaType);
                C27723OooO0O0.OooO0o0(c27723OooO0O0, str5, cloudMetaType);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : c32465OooO0O0) {
                CloudMetaLocal cloudMetaLocal3 = (CloudMetaLocal) obj6;
                if (cloudMetaLocal3.getDeleted() && cloudMetaLocal3.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL) {
                    arrayList5.add(obj6);
                }
            }
            ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((CloudMetaLocal) it6.next()).getId());
            }
            if (!arrayList6.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("SyncAllUseCase");
                c20358OooO00o2.OooO0o0("pushCloudMetas: found " + arrayList6 + " deleted but dirty for " + cloudMetaType, new Object[0]);
            }
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                C27723OooO0O0.OooO0o0(c27723OooO0O0, (String) it7.next(), cloudMetaType);
            }
            o0000ooo = this;
            arrayList = new ArrayList();
            it = c32465OooO0O0.iterator();
            cloudMetaType2 = cloudMetaType;
            c27679o0000Oo2 = c27679o0000Oo;
            interfaceC27661OoooOoO2 = interfaceC27661OoooOoO;
            list = c32465OooO0O0;
            set = c32463OooO;
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            CloudMetaLocal cloudMetaLocal4 = c27679o0000Oo.f97487OooOooo;
            Object obj7 = c27679o0000Oo.f97486OooOooO;
            Iterator it8 = (Iterator) c27679o0000Oo.f97484OooOoo;
            Collection collection2 = (Collection) c27679o0000Oo.f97485OooOoo0;
            InterfaceC27661OoooOoO interfaceC27661OoooOoO6 = (InterfaceC27661OoooOoO) c27679o0000Oo.f97483OooOoOO;
            CloudMetaType cloudMetaType5 = (CloudMetaType) c27679o0000Oo.f97481OooOoO;
            List list3 = (List) c27679o0000Oo.f97482OooOoO0;
            Set set5 = c27679o0000Oo.f97479OooOo;
            o0000OOO o0000ooo4 = c27679o0000Oo.f97480OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj2);
                list2 = list3;
                set2 = set5;
            } catch (Throwable th3) {
                th = th3;
                list2 = list3;
                set2 = set5;
                objOooO00o = C32446OooOOOo.OooO00o(th);
                cloudMetaType3 = cloudMetaType5;
                Object next = obj7;
                InterfaceC27661OoooOoO interfaceC27661OoooOoO7 = interfaceC27661OoooOoO6;
                o0000ooo = o0000ooo4;
                arrayList = collection2;
                it = it8;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Boolean bool = Boolean.FALSE;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                zBooleanValue = ((Boolean) objOooO00o).booleanValue();
                if (cloudMetaLocal.getDeleted()) {
                }
                if (zBooleanValue) {
                }
                cloudMetaType2 = cloudMetaType3;
                c27679o0000Oo2 = c27679o0000Oo;
                list = list2;
                set = set2;
                z2 = false;
                interfaceC27661OoooOoO2 = interfaceC27661OoooOoO4;
                if (z2) {
                }
                z2 = false;
                if (!it.hasNext()) {
                }
            }
            try {
            } catch (Throwable th4) {
                th = th4;
                objOooO00o = C32446OooOOOo.OooO00o(th);
                cloudMetaType3 = cloudMetaType5;
                Object next2 = obj7;
                InterfaceC27661OoooOoO interfaceC27661OoooOoO72 = interfaceC27661OoooOoO6;
                o0000ooo = o0000ooo4;
                arrayList = collection2;
                it = it8;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Boolean bool2 = Boolean.FALSE;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                zBooleanValue = ((Boolean) objOooO00o).booleanValue();
                if (cloudMetaLocal.getDeleted()) {
                }
                if (zBooleanValue) {
                }
                cloudMetaType2 = cloudMetaType3;
                c27679o0000Oo2 = c27679o0000Oo;
                list = list2;
                set = set2;
                z2 = false;
                interfaceC27661OoooOoO2 = interfaceC27661OoooOoO4;
                if (z2) {
                }
                z2 = false;
                if (!it.hasNext()) {
                }
            }
            objOooO00o = (Boolean) obj2;
            objOooO00o.getClass();
            cloudMetaType3 = cloudMetaType5;
            Object next22 = obj7;
            InterfaceC27661OoooOoO interfaceC27661OoooOoO722 = interfaceC27661OoooOoO6;
            o0000ooo = o0000ooo4;
            arrayList = collection2;
            it = it8;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("SyncAllUseCase");
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO722;
                cloudMetaLocal = cloudMetaLocal4;
                c20358OooO00o3.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isLocalDeleted failed for ", cloudMetaLocal4.getId()), new Object[0]);
            } else {
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO722;
                cloudMetaLocal = cloudMetaLocal4;
            }
            Boolean bool22 = Boolean.FALSE;
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = bool22;
            }
            zBooleanValue = ((Boolean) objOooO00o).booleanValue();
            boolean z3 = !cloudMetaLocal.getDeleted() && cloudMetaLocal.getDeletedRemote();
            if (zBooleanValue || z3) {
                cloudMetaType2 = cloudMetaType3;
                c27679o0000Oo2 = c27679o0000Oo;
                list = list2;
                set = set2;
                z2 = false;
            } else {
                cloudMetaType2 = cloudMetaType3;
                c27679o0000Oo2 = c27679o0000Oo;
                list = list2;
                set = set2;
                z2 = true;
            }
            interfaceC27661OoooOoO2 = interfaceC27661OoooOoO4;
            if (z2) {
                arrayList.add(next22);
            }
            z2 = false;
            if (!it.hasNext()) {
                next22 = it.next();
                CloudMetaLocal cloudMetaLocal5 = (CloudMetaLocal) next22;
                if (!set.contains(cloudMetaLocal5.getId())) {
                    if (!cloudMetaLocal5.getDeleted() || (cloudMetaLocal5.getSyncState().getPhase() != SyncPhase.DIRTY_LOCAL && cloudMetaLocal5.getSyncState().getPhase() != SyncPhase.PACKAGING && cloudMetaLocal5.getSyncState().getPhase() != SyncPhase.UPLOADING && cloudMetaLocal5.getSyncState().getPhase() != SyncPhase.CONFLICT)) {
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        c27679o0000Oo2.f97480OooOo0o = o0000ooo;
                        c27679o0000Oo2.f97479OooOo = set;
                        c27679o0000Oo2.f97482OooOoO0 = list;
                        c27679o0000Oo2.f97481OooOoO = cloudMetaType2;
                        c27679o0000Oo2.f97483OooOoOO = interfaceC27661OoooOoO2;
                        c27679o0000Oo2.f97485OooOoo0 = arrayList;
                        c27679o0000Oo2.f97484OooOoo = it;
                        c27679o0000Oo2.f97486OooOooO = next22;
                        c27679o0000Oo2.f97487OooOooo = cloudMetaLocal5;
                        c27679o0000Oo2.f97490Oooo00o = 1;
                        Object objOooO0Oo = interfaceC27661OoooOoO2.OooO0Oo(cloudMetaLocal5, c27679o0000Oo2);
                        if (objOooO0Oo != enumC32485OooO00o2) {
                            o0000OOO o0000ooo5 = o0000ooo;
                            interfaceC27661OoooOoO6 = interfaceC27661OoooOoO2;
                            c27679o0000Oo = c27679o0000Oo2;
                            it8 = it;
                            collection2 = arrayList;
                            o0000ooo4 = o0000ooo5;
                            set2 = set;
                            cloudMetaLocal4 = cloudMetaLocal5;
                            list2 = list;
                            obj7 = next22;
                            cloudMetaType5 = cloudMetaType2;
                            obj2 = objOooO0Oo;
                            objOooO00o = (Boolean) obj2;
                            objOooO00o.getClass();
                            cloudMetaType3 = cloudMetaType5;
                            Object next222 = obj7;
                            InterfaceC27661OoooOoO interfaceC27661OoooOoO7222 = interfaceC27661OoooOoO6;
                            o0000ooo = o0000ooo4;
                            arrayList = collection2;
                            it = it8;
                            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                            if (thOooO00o != null) {
                            }
                            Boolean bool222 = Boolean.FALSE;
                            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                            }
                            zBooleanValue = ((Boolean) objOooO00o).booleanValue();
                            if (cloudMetaLocal.getDeleted()) {
                            }
                            if (zBooleanValue) {
                            }
                            cloudMetaType2 = cloudMetaType3;
                            c27679o0000Oo2 = c27679o0000Oo;
                            list = list2;
                            set = set2;
                            z2 = false;
                            interfaceC27661OoooOoO2 = interfaceC27661OoooOoO4;
                        }
                        return enumC32485OooO00o2;
                    }
                    z2 = false;
                }
                if (z2) {
                }
                z2 = false;
                if (!it.hasNext()) {
                    List list4 = (List) arrayList;
                    ArrayList<String> arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                    Iterator it9 = list4.iterator();
                    while (it9.hasNext()) {
                        arrayList7.add(((CloudMetaLocal) it9.next()).getId());
                    }
                    if (!arrayList7.isEmpty()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("SyncAllUseCase");
                        c20358OooO00o4.OooO0o0("pushCloudMetas: found " + arrayList7 + " deleted local metas for " + cloudMetaType2, new Object[0]);
                    }
                    for (String metaId : arrayList7) {
                        C27723OooO0O0 c27723OooO0O02 = o0000ooo.f97457OooO00o;
                        c27723OooO0O02.getClass();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(metaId, "metaId");
                        c27723OooO0O02.f97800OooO00o.OooO0o0(new SyncEvent.LocalDeleted(metaId));
                    }
                    interfaceC27661OoooOoO3 = interfaceC27661OoooOoO2;
                    c27679o0000Oo = c27679o0000Oo2;
                    o0000ooo2 = o0000ooo;
                    arrayList2 = new ArrayList();
                    it2 = list.iterator();
                    if (it2.hasNext()) {
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CloudMetaLocal cloudMetaLocal6 = (CloudMetaLocal) c27679o0000Oo.f97486OooOooO;
            Object next3 = c27679o0000Oo.f97484OooOoo;
            it2 = (Iterator) c27679o0000Oo.f97485OooOoo0;
            arrayList2 = (Collection) c27679o0000Oo.f97483OooOoOO;
            interfaceC27661OoooOoO3 = (InterfaceC27661OoooOoO) c27679o0000Oo.f97481OooOoO;
            CloudMetaType cloudMetaType6 = (CloudMetaType) c27679o0000Oo.f97482OooOoO0;
            Set set6 = c27679o0000Oo.f97479OooOo;
            o0000ooo2 = c27679o0000Oo.f97480OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj2);
                cloudMetaType4 = cloudMetaType6;
                set3 = set6;
            } catch (Throwable th6) {
                th2 = th6;
                cloudMetaType2 = cloudMetaType6;
                set3 = set6;
                cloudMetaType4 = cloudMetaType2;
                objOooO00o2 = C32446OooOOOo.OooO00o(th2);
                thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
                if (thOooO00o2 != null) {
                }
                Boolean bool3 = Boolean.FALSE;
                if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                }
                zBooleanValue2 = ((Boolean) objOooO00o2).booleanValue();
                boolean z4 = !zBooleanValue2 || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL;
                if (zBooleanValue2) {
                }
                next3 = obj;
                c27679o0000Oo = c27679o0000Oo3;
                cloudMetaType2 = cloudMetaType4;
                it2 = it3;
                o0000ooo2 = o0000ooo3;
                arrayList2 = collection;
                interfaceC27661OoooOoO3 = interfaceC27661OoooOoO5;
                set = set4;
                if (z4) {
                }
                if (z) {
                }
                enumC32485OooO00o2 = enumC32485OooO00o;
                str4 = str2;
                str3 = str;
                if (it2.hasNext()) {
                }
            }
            objOooO00o2 = (Boolean) obj2;
            objOooO00o2.getClass();
            thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
            if (thOooO00o2 != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0(str4);
                cloudMetaLocal2 = cloudMetaLocal6;
                obj = next3;
                c20358OooO00o5.OooO0Oo(thOooO00o2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isLocalModified failed for ", cloudMetaLocal6.getId()), new Object[0]);
            } else {
                cloudMetaLocal2 = cloudMetaLocal6;
                obj = next3;
            }
            Boolean bool32 = Boolean.FALSE;
            if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                objOooO00o2 = bool32;
            }
            zBooleanValue2 = ((Boolean) objOooO00o2).booleanValue();
            boolean z42 = !zBooleanValue2 || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL;
            if (zBooleanValue2) {
                c27679o0000Oo3 = c27679o0000Oo;
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0(str4);
                enumC32485OooO00o = enumC32485OooO00o2;
                String id = cloudMetaLocal2.getId();
                it3 = it2;
                int metaVersion = cloudMetaLocal2.getMetaVersion();
                o0000ooo3 = o0000ooo2;
                String metaHash = cloudMetaLocal2.getMetaHash();
                collection = arrayList2;
                interfaceC27661OoooOoO5 = interfaceC27661OoooOoO3;
                long lastModified = cloudMetaLocal2.getContentTag().getLastModified();
                set4 = set3;
                str2 = str4;
                long lastModificationTime = cloudMetaLocal2.getLastModificationTime();
                str = str3;
                boolean deleted = cloudMetaLocal2.getDeleted();
                SyncPhase phase = cloudMetaLocal2.getSyncState().getPhase();
                StringBuilder sb = new StringBuilder("pushCloudMetas: local modified detected id=");
                sb.append(id);
                sb.append(", type=");
                sb.append(cloudMetaType4);
                sb.append(", metaVersion=");
                C21036OooOOo0.OooO0Oo(metaVersion, ", metaHash=", metaHash, ", contentTag.lastModified=", sb);
                sb.append(lastModified);
                C22205OooOOo.OooO0OO(lastModificationTime, ", lastModificationTime=", ", deleted=", sb);
                sb.append(deleted);
                sb.append(", syncState=");
                sb.append(phase);
                c20358OooO00o6.OooO0o0(sb.toString(), new Object[0]);
            } else {
                c27679o0000Oo3 = c27679o0000Oo;
                enumC32485OooO00o = enumC32485OooO00o2;
                it3 = it2;
                o0000ooo3 = o0000ooo2;
                str = str3;
                set4 = set3;
                str2 = str4;
                collection = arrayList2;
                interfaceC27661OoooOoO5 = interfaceC27661OoooOoO3;
                if (cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o7.OooOOO0(str2);
                    String id2 = cloudMetaLocal2.getId();
                    int metaVersion2 = cloudMetaLocal2.getMetaVersion();
                    String metaHash2 = cloudMetaLocal2.getMetaHash();
                    long lastModified2 = cloudMetaLocal2.getContentTag().getLastModified();
                    long lastModificationTime2 = cloudMetaLocal2.getLastModificationTime();
                    boolean deleted2 = cloudMetaLocal2.getDeleted();
                    String lastErrorCode = cloudMetaLocal2.getLastErrorCode();
                    StringBuilder sb2 = new StringBuilder("pushCloudMetas: local already dirty id=");
                    sb2.append(id2);
                    sb2.append(", type=");
                    sb2.append(cloudMetaType4);
                    sb2.append(", metaVersion=");
                    C21036OooOOo0.OooO0Oo(metaVersion2, ", metaHash=", metaHash2, ", contentTag.lastModified=", sb2);
                    sb2.append(lastModified2);
                    C22205OooOOo.OooO0OO(lastModificationTime2, ", lastModificationTime=", ", deleted=", sb2);
                    sb2.append(deleted2);
                    sb2.append(", lastErrorCode=");
                    sb2.append(lastErrorCode);
                    c20358OooO00o7.OooO0o0(sb2.toString(), new Object[0]);
                }
            }
            next3 = obj;
            c27679o0000Oo = c27679o0000Oo3;
            cloudMetaType2 = cloudMetaType4;
            it2 = it3;
            o0000ooo2 = o0000ooo3;
            arrayList2 = collection;
            interfaceC27661OoooOoO3 = interfaceC27661OoooOoO5;
            set = set4;
            z = z42;
            if (z) {
                arrayList2.add(next3);
            }
            enumC32485OooO00o2 = enumC32485OooO00o;
            str4 = str2;
            str3 = str;
            if (it2.hasNext()) {
                next3 = it2.next();
                CloudMetaLocal cloudMetaLocal7 = (CloudMetaLocal) next3;
                if (set.contains(cloudMetaLocal7.getId())) {
                    try {
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                    c27679o0000Oo.f97480OooOo0o = o0000ooo2;
                    c27679o0000Oo.f97479OooOo = set;
                    c27679o0000Oo.f97482OooOoO0 = cloudMetaType2;
                    c27679o0000Oo.f97481OooOoO = interfaceC27661OoooOoO3;
                    c27679o0000Oo.f97483OooOoOO = arrayList2;
                    c27679o0000Oo.f97485OooOoo0 = it2;
                    c27679o0000Oo.f97484OooOoo = next3;
                    c27679o0000Oo.f97486OooOooO = cloudMetaLocal7;
                    c27679o0000Oo.f97487OooOooo = null;
                    c27679o0000Oo.f97490Oooo00o = 2;
                    Object objOooO00o3 = interfaceC27661OoooOoO3.OooO00o(cloudMetaLocal7, c27679o0000Oo);
                    if (objOooO00o3 != enumC32485OooO00o2) {
                        set3 = set;
                        cloudMetaLocal6 = cloudMetaLocal7;
                        cloudMetaType4 = cloudMetaType2;
                        obj2 = objOooO00o3;
                        objOooO00o2 = (Boolean) obj2;
                        objOooO00o2.getClass();
                        thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
                        if (thOooO00o2 != null) {
                        }
                        Boolean bool322 = Boolean.FALSE;
                        if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                        }
                        zBooleanValue2 = ((Boolean) objOooO00o2).booleanValue();
                        boolean z422 = !zBooleanValue2 || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL;
                        if (zBooleanValue2) {
                        }
                        next3 = obj;
                        c27679o0000Oo = c27679o0000Oo3;
                        cloudMetaType2 = cloudMetaType4;
                        it2 = it3;
                        o0000ooo2 = o0000ooo3;
                        arrayList2 = collection;
                        interfaceC27661OoooOoO3 = interfaceC27661OoooOoO5;
                        set = set4;
                        if (z422) {
                        }
                        if (z) {
                        }
                        enumC32485OooO00o2 = enumC32485OooO00o;
                        str4 = str2;
                        str3 = str;
                        if (it2.hasNext()) {
                        }
                    }
                    return enumC32485OooO00o2;
                }
                enumC32485OooO00o = enumC32485OooO00o2;
                str = str3;
                str2 = str4;
                if (z) {
                }
                enumC32485OooO00o2 = enumC32485OooO00o;
                str4 = str2;
                str3 = str;
                if (it2.hasNext()) {
                    String str6 = str3;
                    String str7 = str4;
                    List list5 = (List) arrayList2;
                    ArrayList<String> arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                    Iterator it10 = list5.iterator();
                    while (it10.hasNext()) {
                        arrayList8.add(((CloudMetaLocal) it10.next()).getId());
                    }
                    if (!arrayList8.isEmpty()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o8.OooOOO0(str7);
                        c20358OooO00o8.OooO0o0(str6 + arrayList8 + " updated local metas for " + cloudMetaType2, new Object[0]);
                    }
                    for (String str8 : arrayList8) {
                        o0000ooo2.f97457OooO00o.OooO0OO(str8, cloudMetaType2);
                        C27723OooO0O0.OooO0o0(o0000ooo2.f97457OooO00o, str8, cloudMetaType2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x05f3, code lost:
    
        if (r6.OooO0O0(r1, r3, r2, r11) != r5) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x037f A[LOOP:9: B:104:0x0379->B:106:0x037f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c7 A[LOOP:11: B:114:0x03c1->B:116:0x03c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[PHI: r1 r2 r3 r4 r6 r7
      0x006b: PHI (r1v44 java.util.Set) = (r1v39 java.util.Set), (r1v51 java.util.Set) binds: [B:170:0x0565, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r2v33 o0OOo0oo.OoooOoO) = (r2v27 o0OOo0oo.OoooOoO), (r2v39 o0OOo0oo.OoooOoO) binds: [B:170:0x0565, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r3v24 com.orion.notein.domain.models.cloudsync.CloudMetaType) = 
      (r3v19 com.orion.notein.domain.models.cloudsync.CloudMetaType)
      (r3v31 com.orion.notein.domain.models.cloudsync.CloudMetaType)
     binds: [B:170:0x0565, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r4v25 java.lang.Object) = (r4v22 java.lang.Object), (r4v1 java.lang.Object) binds: [B:170:0x0565, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r6v22 java.util.List) = (r6v17 java.util.List), (r6v29 java.util.List) binds: [B:170:0x0565, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r7v28 o0OOo0oo.o0000OOO) = (r7v23 o0OOo0oo.o0000OOO), (r7v30 o0OOo0oo.o0000OOO) binds: [B:170:0x0565, B:16:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0242 A[LOOP:2: B:62:0x023c->B:64:0x0242, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026a A[LOOP:3: B:66:0x0264->B:68:0x026a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d5 A[LOOP:6: B:80:0x02cf->B:82:0x02d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031d A[LOOP:8: B:90:0x0317->B:92:0x031d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, ArrayList arrayList, ArrayList arrayList2, CloudMetaType cloudMetaType, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27681o0000OoO c27681o0000OoO;
        String strOooO0Oo;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO;
        Set setO0OO00O;
        Set setO0OO00O2;
        Object objOooOOo0;
        o0000OOO o0000ooo;
        String str2;
        Set set;
        Object objOooO0oo;
        List list;
        CloudMetaType cloudMetaType2;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO2;
        Set set2;
        o0000OOO o0000ooo2;
        Iterator it;
        LinkedHashMap linkedHashMap;
        Set setO0OO00O3;
        Set set3;
        String str3;
        List<CloudMetaLocal> list2;
        String str4;
        int iOooO0Oo;
        Iterator it2;
        Set setOoooO0O;
        Set set4;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO3;
        o0000OOO o0000ooo3;
        String str5;
        NoteMeta noteMetaCopy$default;
        String str6;
        Folder folderCopy;
        int iOooO0Oo2;
        Iterator it3;
        Iterator it4;
        Set<String> set5;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO4;
        o0000OOO o0000ooo4;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO5;
        CloudMetaType cloudMetaType3;
        C32463OooO c32463OooOOooO0Oo;
        C32465OooO0O0 c32465OooO0O0OooO0O0;
        o0000OOO o0000ooo5;
        List list3;
        CloudMetaType cloudMetaType4;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO6;
        String str7 = str;
        List list4 = arrayList;
        CloudMetaType cloudMetaType5 = cloudMetaType;
        if (abstractC32479OooO0OO instanceof C27681o0000OoO) {
            c27681o0000OoO = (C27681o0000OoO) abstractC32479OooO0OO;
            int i = c27681o0000OoO.f97513Oooo00O;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27681o0000OoO.f97513Oooo00O = i - Integer.MIN_VALUE;
            } else {
                c27681o0000OoO = new C27681o0000OoO(this, abstractC32479OooO0OO);
            }
        }
        C27681o0000OoO c27681o0000OoO2 = c27681o0000OoO;
        Object objOooO0Oo = c27681o0000OoO2.f97511OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27681o0000OoO2.f97513Oooo00O) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                strOooO0Oo = this.f97461OooO0o.OooO0Oo();
                interfaceC27661OoooOoO = this.f97463OooO0oO.get(cloudMetaType5);
                if (interfaceC27661OoooOoO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("SyncAllUseCase");
                    c20358OooO00o.OooOO0O("syncAllCloudMetas: no detector for " + cloudMetaType5, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list4) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaLocal) obj).getMimeType(), cloudMetaType5.getMime())) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((CloudMetaLocal) it5.next()).getId());
                }
                setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaRemote) obj2).getMimeType(), cloudMetaType5.getMime())) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((CloudMetaRemote) it6.next()).getId());
                }
                setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList6);
                int i2 = OooO00o.f97468OooO00o[cloudMetaType5.ordinal()];
                if (i2 == 1) {
                    c27681o0000OoO2.f97504OooOo0o = this;
                    c27681o0000OoO2.f97503OooOo = str7;
                    c27681o0000OoO2.f97506OooOoO0 = list4;
                    c27681o0000OoO2.f97505OooOoO = cloudMetaType5;
                    c27681o0000OoO2.f97507OooOoOO = strOooO0Oo;
                    c27681o0000OoO2.f97509OooOoo0 = interfaceC27661OoooOoO;
                    c27681o0000OoO2.f97508OooOoo = setO0OO00O;
                    c27681o0000OoO2.f97510OooOooO = setO0OO00O2;
                    c27681o0000OoO2.f97513Oooo00O = 1;
                    objOooOOo0 = this.f97459OooO0OO.OooOOo0(c27681o0000OoO2);
                    if (objOooOOo0 != enumC32485OooO00o) {
                        o0000ooo = this;
                        str2 = str7;
                        set = setO0OO00O2;
                        List list5 = (List) objOooOOo0;
                        int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list5, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo3 >= 16 ? iOooO0Oo3 : 16);
                        for (Object obj3 : list5) {
                            linkedHashMap2.put(((NoteMeta) obj3).getId(), obj3);
                        }
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj4 : list5) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteMeta) obj4).getUserId(), strOooO0Oo)) {
                                arrayList7.add(obj4);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(arrayList7, 10));
                        it = arrayList7.iterator();
                        while (it.hasNext()) {
                            arrayList8.add(((NoteMeta) it.next()).getId());
                        }
                        linkedHashMap = linkedHashMap2;
                        setO0OO00O3 = oOo000Oo.OooOo.o0OO00O(arrayList8);
                        set3 = set;
                        str3 = strOooO0Oo;
                        list2 = list4;
                        set2 = setO0OO00O;
                        str4 = str2;
                        setOoooO0O = oOo000Oo.OooOo.OoooO0O(C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(set2, set3), setO0OO00O3), linkedHashMap.keySet());
                        if (!setOoooO0O.isEmpty()) {
                        }
                        set5 = setOoooO0O;
                        interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                        String str8 = str4;
                        o0000ooo4 = o0000ooo;
                        C27715OooO0o c27715OooO0o = o0000ooo4.f97464OooO0oo;
                        c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                        c27681o0000OoO2.f97503OooOo = list2;
                        c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                        c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                        c27681o0000OoO2.f97507OooOoOO = set5;
                        c27681o0000OoO2.f97509OooOoo0 = null;
                        c27681o0000OoO2.f97508OooOoo = null;
                        c27681o0000OoO2.f97510OooOooO = null;
                        c27681o0000OoO2.f97513Oooo00O = 6;
                        objOooO0Oo = c27715OooO0o.OooO0Oo(str8, c27681o0000OoO2);
                        if (objOooO0Oo != enumC32485OooO00o) {
                        }
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        throw new C32442OooOO0o();
                    }
                    c27681o0000OoO2.f97504OooOo0o = this;
                    c27681o0000OoO2.f97503OooOo = str7;
                    c27681o0000OoO2.f97506OooOoO0 = list4;
                    c27681o0000OoO2.f97505OooOoO = cloudMetaType5;
                    c27681o0000OoO2.f97507OooOoOO = strOooO0Oo;
                    c27681o0000OoO2.f97509OooOoo0 = interfaceC27661OoooOoO;
                    c27681o0000OoO2.f97508OooOoo = setO0OO00O;
                    c27681o0000OoO2.f97510OooOooO = setO0OO00O2;
                    c27681o0000OoO2.f97513Oooo00O = 3;
                    Serializable serializableOooO0o0 = this.f97462OooO0o0.OooO0o0(c27681o0000OoO2);
                    if (serializableOooO0o0 != enumC32485OooO00o) {
                        list = list4;
                        cloudMetaType2 = cloudMetaType5;
                        interfaceC27661OoooOoO2 = interfaceC27661OoooOoO;
                        set2 = setO0OO00O;
                        objOooO0Oo = serializableOooO0o0;
                        o0000ooo2 = this;
                        List list6 = (List) objOooO0Oo;
                        iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list6, 10));
                        if (iOooO0Oo2 < 16) {
                            iOooO0Oo2 = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iOooO0Oo2);
                        it3 = list6.iterator();
                        while (it3.hasNext()) {
                            linkedHashMap.put(((MyTemplate) it3.next()).getId(), C32460OooOooO.f116667OooO00o);
                        }
                        ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
                        it4 = list6.iterator();
                        while (it4.hasNext()) {
                            arrayList9.add(((MyTemplate) it4.next()).getId());
                        }
                        Set setO0OO00O4 = oOo000Oo.OooOo.o0OO00O(arrayList9);
                        set3 = setO0OO00O2;
                        setO0OO00O3 = setO0OO00O4;
                        interfaceC27661OoooOoO = interfaceC27661OoooOoO2;
                        cloudMetaType5 = cloudMetaType2;
                        o0000ooo = o0000ooo2;
                        str4 = str7;
                        str3 = strOooO0Oo;
                        list2 = list;
                        setOoooO0O = oOo000Oo.OooOo.OoooO0O(C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(set2, set3), setO0OO00O3), linkedHashMap.keySet());
                        if (!setOoooO0O.isEmpty()) {
                            int i3 = OooO00o.f97468OooO00o[cloudMetaType5.ordinal()];
                            if (i3 == 1) {
                                String str9 = str3;
                                ArrayList arrayList10 = new ArrayList();
                                Iterator it7 = setOoooO0O.iterator();
                                while (it7.hasNext()) {
                                    Object obj5 = linkedHashMap.get((String) it7.next());
                                    NoteMeta noteMeta = obj5 instanceof NoteMeta ? (NoteMeta) obj5 : null;
                                    if (noteMeta == null || kotlin.jvm.internal.OooOOO0.OooO0O0(noteMeta.getUserId(), str9)) {
                                        str5 = str9;
                                        noteMetaCopy$default = null;
                                    } else {
                                        str5 = str9;
                                        noteMetaCopy$default = NoteMeta.copy$default(noteMeta, null, str5, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524285, null);
                                    }
                                    if (noteMetaCopy$default != null) {
                                        arrayList10.add(noteMetaCopy$default);
                                    }
                                    str9 = str5;
                                }
                                InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = o0000ooo.f97459OooO0OO;
                                NoteMeta[] noteMetaArr = (NoteMeta[]) arrayList10.toArray(new NoteMeta[0]);
                                NoteMeta[] noteMetaArr2 = (NoteMeta[]) Arrays.copyOf(noteMetaArr, noteMetaArr.length);
                                c27681o0000OoO2.f97504OooOo0o = o0000ooo;
                                c27681o0000OoO2.f97503OooOo = str4;
                                c27681o0000OoO2.f97506OooOoO0 = list2;
                                c27681o0000OoO2.f97505OooOoO = cloudMetaType5;
                                c27681o0000OoO2.f97507OooOoOO = interfaceC27661OoooOoO;
                                c27681o0000OoO2.f97509OooOoo0 = setOoooO0O;
                                c27681o0000OoO2.f97508OooOoo = null;
                                c27681o0000OoO2.f97510OooOooO = null;
                                c27681o0000OoO2.f97513Oooo00O = 4;
                                if (interfaceC27313OooOoo0.OooOo0O(noteMetaArr2, c27681o0000OoO2) != enumC32485OooO00o) {
                                    set4 = setOoooO0O;
                                    interfaceC27661OoooOoO3 = interfaceC27661OoooOoO;
                                    o0000ooo3 = o0000ooo;
                                    interfaceC27661OoooOoO = interfaceC27661OoooOoO3;
                                    o0000ooo = o0000ooo3;
                                    setOoooO0O = set4;
                                }
                            } else if (i3 == 2) {
                                ArrayList arrayList11 = new ArrayList();
                                Iterator it8 = setOoooO0O.iterator();
                                while (it8.hasNext()) {
                                    Object obj6 = linkedHashMap.get((String) it8.next());
                                    Folder folder = obj6 instanceof Folder ? (Folder) obj6 : null;
                                    if (folder == null || kotlin.jvm.internal.OooOOO0.OooO0O0(folder.getUserId(), str3)) {
                                        str6 = str3;
                                        folderCopy = null;
                                    } else {
                                        String str10 = str3;
                                        folderCopy = folder.copy((3583 & 1) != 0 ? folder.id : null, (3583 & 2) != 0 ? folder.userId : str10, (3583 & 4) != 0 ? folder.parentId : null, (3583 & 8) != 0 ? folder.recoverParentId : null, (3583 & 16) != 0 ? folder.title : null, (3583 & 32) != 0 ? folder.favorite : false, (3583 & 64) != 0 ? folder.inTrashBin : false, (3583 & 128) != 0 ? folder.creationTime : 0L, (3583 & 256) != 0 ? folder.lastModificationTime : 0L, (3583 & 512) != 0 ? folder.tnPath : null, (3583 & 1024) != 0 ? folder.sortKey : null, (3583 & 2048) != 0 ? folder.coverColor : null);
                                        str6 = str10;
                                    }
                                    if (folderCopy != null) {
                                        arrayList11.add(folderCopy);
                                    }
                                    str3 = str6;
                                }
                                C28009OooOOOO c28009OooOOOO = o0000ooo.f97460OooO0Oo;
                                Folder[] folderArr = (Folder[]) arrayList11.toArray(new Folder[0]);
                                Folder[] folderArr2 = (Folder[]) Arrays.copyOf(folderArr, folderArr.length);
                                c27681o0000OoO2.f97504OooOo0o = o0000ooo;
                                c27681o0000OoO2.f97503OooOo = str4;
                                c27681o0000OoO2.f97506OooOoO0 = list2;
                                c27681o0000OoO2.f97505OooOoO = cloudMetaType5;
                                c27681o0000OoO2.f97507OooOoOO = interfaceC27661OoooOoO;
                                c27681o0000OoO2.f97509OooOoo0 = setOoooO0O;
                                c27681o0000OoO2.f97508OooOoo = null;
                                c27681o0000OoO2.f97510OooOooO = null;
                                c27681o0000OoO2.f97513Oooo00O = 5;
                                if (c28009OooOOOO.OooOO0(folderArr2, c27681o0000OoO2) != enumC32485OooO00o) {
                                    set4 = setOoooO0O;
                                    interfaceC27661OoooOoO3 = interfaceC27661OoooOoO;
                                    o0000ooo3 = o0000ooo;
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    interfaceC27661OoooOoO = interfaceC27661OoooOoO3;
                                    o0000ooo = o0000ooo3;
                                    setOoooO0O = set4;
                                }
                            } else {
                                if (i3 != 3) {
                                    throw new C32442OooOO0o();
                                }
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                            }
                        }
                        set5 = setOoooO0O;
                        interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                        String str82 = str4;
                        o0000ooo4 = o0000ooo;
                        C27715OooO0o c27715OooO0o2 = o0000ooo4.f97464OooO0oo;
                        c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                        c27681o0000OoO2.f97503OooOo = list2;
                        c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                        c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                        c27681o0000OoO2.f97507OooOoOO = set5;
                        c27681o0000OoO2.f97509OooOoo0 = null;
                        c27681o0000OoO2.f97508OooOoo = null;
                        c27681o0000OoO2.f97510OooOooO = null;
                        c27681o0000OoO2.f97513Oooo00O = 6;
                        objOooO0Oo = c27715OooO0o2.OooO0Oo(str82, c27681o0000OoO2);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            interfaceC27661OoooOoO5 = interfaceC27661OoooOoO4;
                            cloudMetaType3 = cloudMetaType5;
                            Set set6 = (Set) objOooO0Oo;
                            C32463OooO c32463OooO = new C32463OooO();
                            for (String str11 : set5) {
                                if (!set6.contains(str11)) {
                                    c32463OooO.add(str11);
                                }
                            }
                            c32463OooOOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO);
                            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                            for (CloudMetaLocal cloudMetaLocal : list2) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(cloudMetaLocal.getMimeType(), cloudMetaType3.getMime()) && !set6.contains(cloudMetaLocal.getId())) {
                                    c32465OooO0O0OooO0Oo.add(cloudMetaLocal);
                                }
                            }
                            c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                            c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                            c27681o0000OoO2.f97503OooOo = cloudMetaType3;
                            c27681o0000OoO2.f97506OooOoO0 = interfaceC27661OoooOoO5;
                            c27681o0000OoO2.f97505OooOoO = c32463OooOOooO0Oo;
                            c27681o0000OoO2.f97507OooOoOO = c32465OooO0O0OooO0O0;
                            c27681o0000OoO2.f97513Oooo00O = 7;
                            o0000ooo5 = o0000ooo4;
                            if (o0000ooo5.OooO0OO(c32463OooOOooO0Oo, c32465OooO0O0OooO0O0, cloudMetaType3, interfaceC27661OoooOoO5, c27681o0000OoO2) != enumC32485OooO00o) {
                                list3 = c32465OooO0O0OooO0O0;
                                cloudMetaType4 = cloudMetaType3;
                                interfaceC27661OoooOoO6 = interfaceC27661OoooOoO5;
                                c27681o0000OoO2.f97504OooOo0o = null;
                                c27681o0000OoO2.f97503OooOo = null;
                                c27681o0000OoO2.f97506OooOoO0 = null;
                                c27681o0000OoO2.f97505OooOoO = null;
                                c27681o0000OoO2.f97507OooOoOO = null;
                                c27681o0000OoO2.f97513Oooo00O = 8;
                            }
                        }
                    }
                    break;
                } else {
                    c27681o0000OoO2.f97504OooOo0o = this;
                    c27681o0000OoO2.f97503OooOo = str7;
                    c27681o0000OoO2.f97506OooOoO0 = list4;
                    c27681o0000OoO2.f97505OooOoO = cloudMetaType5;
                    c27681o0000OoO2.f97507OooOoOO = strOooO0Oo;
                    c27681o0000OoO2.f97509OooOoo0 = interfaceC27661OoooOoO;
                    c27681o0000OoO2.f97508OooOoo = setO0OO00O;
                    c27681o0000OoO2.f97510OooOooO = setO0OO00O2;
                    c27681o0000OoO2.f97513Oooo00O = 2;
                    objOooO0oo = this.f97460OooO0Oo.OooO0oo(c27681o0000OoO2);
                    if (objOooO0oo != enumC32485OooO00o) {
                        o0000ooo = this;
                        str2 = str7;
                        set = setO0OO00O2;
                        List list7 = (List) objOooO0oo;
                        iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list7, 10));
                        if (iOooO0Oo < 16) {
                            iOooO0Oo = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iOooO0Oo);
                        for (Object obj7 : list7) {
                            linkedHashMap.put(((Folder) obj7).getId(), obj7);
                        }
                        ArrayList arrayList12 = new ArrayList();
                        for (Object obj8 : list7) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Folder) obj8).getUserId(), strOooO0Oo)) {
                                arrayList12.add(obj8);
                            }
                        }
                        ArrayList arrayList13 = new ArrayList(C34428OooOOo.OooOOoo(arrayList12, 10));
                        it2 = arrayList12.iterator();
                        while (it2.hasNext()) {
                            arrayList13.add(((Folder) it2.next()).getId());
                        }
                        setO0OO00O3 = oOo000Oo.OooOo.o0OO00O(arrayList13);
                        set3 = set;
                        str3 = strOooO0Oo;
                        list2 = list4;
                        set2 = setO0OO00O;
                        str4 = str2;
                        setOoooO0O = oOo000Oo.OooOo.OoooO0O(C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(set2, set3), setO0OO00O3), linkedHashMap.keySet());
                        if (!setOoooO0O.isEmpty()) {
                        }
                        set5 = setOoooO0O;
                        interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                        String str822 = str4;
                        o0000ooo4 = o0000ooo;
                        C27715OooO0o c27715OooO0o22 = o0000ooo4.f97464OooO0oo;
                        c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                        c27681o0000OoO2.f97503OooOo = list2;
                        c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                        c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                        c27681o0000OoO2.f97507OooOoOO = set5;
                        c27681o0000OoO2.f97509OooOoo0 = null;
                        c27681o0000OoO2.f97508OooOoo = null;
                        c27681o0000OoO2.f97510OooOooO = null;
                        c27681o0000OoO2.f97513Oooo00O = 6;
                        objOooO0Oo = c27715OooO0o22.OooO0Oo(str822, c27681o0000OoO2);
                        if (objOooO0Oo != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                set = c27681o0000OoO2.f97510OooOooO;
                Set set7 = c27681o0000OoO2.f97508OooOoo;
                InterfaceC27661OoooOoO interfaceC27661OoooOoO7 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97509OooOoo0;
                strOooO0Oo = (String) c27681o0000OoO2.f97507OooOoOO;
                CloudMetaType cloudMetaType6 = (CloudMetaType) c27681o0000OoO2.f97505OooOoO;
                List list8 = (List) c27681o0000OoO2.f97506OooOoO0;
                str2 = (String) c27681o0000OoO2.f97503OooOo;
                o0000ooo = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                objOooOOo0 = objOooO0Oo;
                interfaceC27661OoooOoO = interfaceC27661OoooOoO7;
                cloudMetaType5 = cloudMetaType6;
                setO0OO00O = set7;
                list4 = list8;
                List list52 = (List) objOooOOo0;
                int iOooO0Oo32 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list52, 10));
                LinkedHashMap linkedHashMap22 = new LinkedHashMap(iOooO0Oo32 >= 16 ? iOooO0Oo32 : 16);
                while (r10.hasNext()) {
                }
                ArrayList arrayList72 = new ArrayList();
                while (r9.hasNext()) {
                }
                ArrayList arrayList82 = new ArrayList(C34428OooOOo.OooOOoo(arrayList72, 10));
                it = arrayList72.iterator();
                while (it.hasNext()) {
                }
                linkedHashMap = linkedHashMap22;
                setO0OO00O3 = oOo000Oo.OooOo.o0OO00O(arrayList82);
                set3 = set;
                str3 = strOooO0Oo;
                list2 = list4;
                set2 = setO0OO00O;
                str4 = str2;
                setOoooO0O = oOo000Oo.OooOo.OoooO0O(C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(set2, set3), setO0OO00O3), linkedHashMap.keySet());
                if (!setOoooO0O.isEmpty()) {
                }
                set5 = setOoooO0O;
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                String str8222 = str4;
                o0000ooo4 = o0000ooo;
                C27715OooO0o c27715OooO0o222 = o0000ooo4.f97464OooO0oo;
                c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                c27681o0000OoO2.f97503OooOo = list2;
                c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                c27681o0000OoO2.f97507OooOoOO = set5;
                c27681o0000OoO2.f97509OooOoo0 = null;
                c27681o0000OoO2.f97508OooOoo = null;
                c27681o0000OoO2.f97510OooOooO = null;
                c27681o0000OoO2.f97513Oooo00O = 6;
                objOooO0Oo = c27715OooO0o222.OooO0Oo(str8222, c27681o0000OoO2);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                set = c27681o0000OoO2.f97510OooOooO;
                Set set8 = c27681o0000OoO2.f97508OooOoo;
                InterfaceC27661OoooOoO interfaceC27661OoooOoO8 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97509OooOoo0;
                strOooO0Oo = (String) c27681o0000OoO2.f97507OooOoOO;
                CloudMetaType cloudMetaType7 = (CloudMetaType) c27681o0000OoO2.f97505OooOoO;
                List list9 = (List) c27681o0000OoO2.f97506OooOoO0;
                str2 = (String) c27681o0000OoO2.f97503OooOo;
                o0000ooo = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                objOooO0oo = objOooO0Oo;
                interfaceC27661OoooOoO = interfaceC27661OoooOoO8;
                cloudMetaType5 = cloudMetaType7;
                setO0OO00O = set8;
                list4 = list9;
                List list72 = (List) objOooO0oo;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list72, 10));
                if (iOooO0Oo < 16) {
                }
                linkedHashMap = new LinkedHashMap(iOooO0Oo);
                while (r8.hasNext()) {
                }
                ArrayList arrayList122 = new ArrayList();
                while (r9.hasNext()) {
                }
                ArrayList arrayList132 = new ArrayList(C34428OooOOo.OooOOoo(arrayList122, 10));
                it2 = arrayList122.iterator();
                while (it2.hasNext()) {
                }
                setO0OO00O3 = oOo000Oo.OooOo.o0OO00O(arrayList132);
                set3 = set;
                str3 = strOooO0Oo;
                list2 = list4;
                set2 = setO0OO00O;
                str4 = str2;
                setOoooO0O = oOo000Oo.OooOo.OoooO0O(C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(set2, set3), setO0OO00O3), linkedHashMap.keySet());
                if (!setOoooO0O.isEmpty()) {
                }
                set5 = setOoooO0O;
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                String str82222 = str4;
                o0000ooo4 = o0000ooo;
                C27715OooO0o c27715OooO0o2222 = o0000ooo4.f97464OooO0oo;
                c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                c27681o0000OoO2.f97503OooOo = list2;
                c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                c27681o0000OoO2.f97507OooOoOO = set5;
                c27681o0000OoO2.f97509OooOoo0 = null;
                c27681o0000OoO2.f97508OooOoo = null;
                c27681o0000OoO2.f97510OooOooO = null;
                c27681o0000OoO2.f97513Oooo00O = 6;
                objOooO0Oo = c27715OooO0o2222.OooO0Oo(str82222, c27681o0000OoO2);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                Set set9 = c27681o0000OoO2.f97510OooOooO;
                set2 = c27681o0000OoO2.f97508OooOoo;
                interfaceC27661OoooOoO2 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97509OooOoo0;
                strOooO0Oo = (String) c27681o0000OoO2.f97507OooOoOO;
                cloudMetaType2 = (CloudMetaType) c27681o0000OoO2.f97505OooOoO;
                list = (List) c27681o0000OoO2.f97506OooOoO0;
                String str12 = (String) c27681o0000OoO2.f97503OooOo;
                o0000OOO o0000ooo6 = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                setO0OO00O2 = set9;
                str7 = str12;
                o0000ooo2 = o0000ooo6;
                List list62 = (List) objOooO0Oo;
                iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list62, 10));
                if (iOooO0Oo2 < 16) {
                }
                linkedHashMap = new LinkedHashMap(iOooO0Oo2);
                it3 = list62.iterator();
                while (it3.hasNext()) {
                }
                ArrayList arrayList92 = new ArrayList(C34428OooOOo.OooOOoo(list62, 10));
                it4 = list62.iterator();
                while (it4.hasNext()) {
                }
                Set setO0OO00O42 = oOo000Oo.OooOo.o0OO00O(arrayList92);
                set3 = setO0OO00O2;
                setO0OO00O3 = setO0OO00O42;
                interfaceC27661OoooOoO = interfaceC27661OoooOoO2;
                cloudMetaType5 = cloudMetaType2;
                o0000ooo = o0000ooo2;
                str4 = str7;
                str3 = strOooO0Oo;
                list2 = list;
                setOoooO0O = oOo000Oo.OooOo.OoooO0O(C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(set2, set3), setO0OO00O3), linkedHashMap.keySet());
                if (!setOoooO0O.isEmpty()) {
                }
                set5 = setOoooO0O;
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                String str822222 = str4;
                o0000ooo4 = o0000ooo;
                C27715OooO0o c27715OooO0o22222 = o0000ooo4.f97464OooO0oo;
                c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                c27681o0000OoO2.f97503OooOo = list2;
                c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                c27681o0000OoO2.f97507OooOoOO = set5;
                c27681o0000OoO2.f97509OooOoo0 = null;
                c27681o0000OoO2.f97508OooOoo = null;
                c27681o0000OoO2.f97510OooOooO = null;
                c27681o0000OoO2.f97513Oooo00O = 6;
                objOooO0Oo = c27715OooO0o22222.OooO0Oo(str822222, c27681o0000OoO2);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                set4 = (Set) c27681o0000OoO2.f97509OooOoo0;
                interfaceC27661OoooOoO3 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97507OooOoOO;
                cloudMetaType5 = (CloudMetaType) c27681o0000OoO2.f97505OooOoO;
                list2 = (List) c27681o0000OoO2.f97506OooOoO0;
                str4 = (String) c27681o0000OoO2.f97503OooOo;
                o0000ooo3 = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                interfaceC27661OoooOoO = interfaceC27661OoooOoO3;
                o0000ooo = o0000ooo3;
                setOoooO0O = set4;
                set5 = setOoooO0O;
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                String str8222222 = str4;
                o0000ooo4 = o0000ooo;
                C27715OooO0o c27715OooO0o222222 = o0000ooo4.f97464OooO0oo;
                c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                c27681o0000OoO2.f97503OooOo = list2;
                c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                c27681o0000OoO2.f97507OooOoOO = set5;
                c27681o0000OoO2.f97509OooOoo0 = null;
                c27681o0000OoO2.f97508OooOoo = null;
                c27681o0000OoO2.f97510OooOooO = null;
                c27681o0000OoO2.f97513Oooo00O = 6;
                objOooO0Oo = c27715OooO0o222222.OooO0Oo(str8222222, c27681o0000OoO2);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                set4 = (Set) c27681o0000OoO2.f97509OooOoo0;
                interfaceC27661OoooOoO3 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97507OooOoOO;
                cloudMetaType5 = (CloudMetaType) c27681o0000OoO2.f97505OooOoO;
                list2 = (List) c27681o0000OoO2.f97506OooOoO0;
                str4 = (String) c27681o0000OoO2.f97503OooOo;
                o0000ooo3 = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                interfaceC27661OoooOoO = interfaceC27661OoooOoO3;
                o0000ooo = o0000ooo3;
                setOoooO0O = set4;
                set5 = setOoooO0O;
                interfaceC27661OoooOoO4 = interfaceC27661OoooOoO;
                String str82222222 = str4;
                o0000ooo4 = o0000ooo;
                C27715OooO0o c27715OooO0o2222222 = o0000ooo4.f97464OooO0oo;
                c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                c27681o0000OoO2.f97503OooOo = list2;
                c27681o0000OoO2.f97506OooOoO0 = cloudMetaType5;
                c27681o0000OoO2.f97505OooOoO = interfaceC27661OoooOoO4;
                c27681o0000OoO2.f97507OooOoOO = set5;
                c27681o0000OoO2.f97509OooOoo0 = null;
                c27681o0000OoO2.f97508OooOoo = null;
                c27681o0000OoO2.f97510OooOooO = null;
                c27681o0000OoO2.f97513Oooo00O = 6;
                objOooO0Oo = c27715OooO0o2222222.OooO0Oo(str82222222, c27681o0000OoO2);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                set5 = (Set) c27681o0000OoO2.f97507OooOoOO;
                interfaceC27661OoooOoO4 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97505OooOoO;
                cloudMetaType5 = (CloudMetaType) c27681o0000OoO2.f97506OooOoO0;
                list2 = (List) c27681o0000OoO2.f97503OooOo;
                o0000ooo4 = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                interfaceC27661OoooOoO5 = interfaceC27661OoooOoO4;
                cloudMetaType3 = cloudMetaType5;
                Set set62 = (Set) objOooO0Oo;
                C32463OooO c32463OooO2 = new C32463OooO();
                while (r1.hasNext()) {
                }
                c32463OooOOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO2);
                C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                while (r3.hasNext()) {
                }
                c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2);
                c27681o0000OoO2.f97504OooOo0o = o0000ooo4;
                c27681o0000OoO2.f97503OooOo = cloudMetaType3;
                c27681o0000OoO2.f97506OooOoO0 = interfaceC27661OoooOoO5;
                c27681o0000OoO2.f97505OooOoO = c32463OooOOooO0Oo;
                c27681o0000OoO2.f97507OooOoOO = c32465OooO0O0OooO0O0;
                c27681o0000OoO2.f97513Oooo00O = 7;
                o0000ooo5 = o0000ooo4;
                if (o0000ooo5.OooO0OO(c32463OooOOooO0Oo, c32465OooO0O0OooO0O0, cloudMetaType3, interfaceC27661OoooOoO5, c27681o0000OoO2) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                list3 = (List) c27681o0000OoO2.f97507OooOoOO;
                interfaceC27661OoooOoO6 = (InterfaceC27661OoooOoO) c27681o0000OoO2.f97506OooOoO0;
                cloudMetaType4 = (CloudMetaType) c27681o0000OoO2.f97503OooOo;
                o0000ooo5 = c27681o0000OoO2.f97504OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                c27681o0000OoO2.f97504OooOo0o = null;
                c27681o0000OoO2.f97503OooOo = null;
                c27681o0000OoO2.f97506OooOoO0 = null;
                c27681o0000OoO2.f97505OooOoO = null;
                c27681o0000OoO2.f97507OooOoOO = null;
                c27681o0000OoO2.f97513Oooo00O = 8;
                break;
            case 8:
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
