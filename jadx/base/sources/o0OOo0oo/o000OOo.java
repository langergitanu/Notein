package o0OOo0oo;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97581OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27661OoooOoO> f97582OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33898OooO0Oo f97583OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile String f97584OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile long f97585OooO0o0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f97586OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f97587OooOo0o;

        static {
            OooO00o oooO00o = new OooO00o("APP_START", 0);
            OooO00o oooO00o2 = new OooO00o("BEFORE_SYNC_ENABLE", 1);
            OooO00o oooO00o3 = new OooO00o("ERROR_RECOVERY", 2);
            f97587OooOo0o = oooO00o3;
            OooO00o[] oooO00oArr = {oooO00o, oooO00o2, oooO00o3};
            f97586OooOo = oooO00oArr;
            OooO.OooO00o.OooO0O0(oooO00oArr);
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f97586OooOo.clone();
        }
    }

    public /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97588OooO00o;

        static {
            int[] iArr = new int[SyncPhase.values().length];
            try {
                iArr[SyncPhase.PACKAGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncPhase.UPLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncPhase.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SyncPhase.RESTORING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SyncPhase.RESOLVING_CONFLICT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f97588OooO00o = iArr;
        }
    }

    public o000OOo(InterfaceC27605OooO00o cloudSyncRepo, Map<CloudMetaType, InterfaceC27661OoooOoO> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97581OooO00o = cloudSyncRepo;
        this.f97582OooO0O0 = map;
        this.f97583OooO0OO = C33900OooO0o0.OooO00o();
    }

    public static List OooO00o(CloudMetaLocal cloudMetaLocal, CloudMetaType cloudMetaType) {
        CloudSyncError.ResetStuck resetStuck = new CloudSyncError.ResetStuck(null, 1, null);
        int i = OooO0O0.f97588OooO00o[cloudMetaLocal.getSyncState().getPhase().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? C34434OooOoO.f123453OooOo0o : com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.ResolveFailed(cloudMetaLocal.getId(), resetStuck)) : com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.RestoreFailed(cloudMetaLocal.getId(), cloudMetaType, resetStuck)) : com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.DownloadFailed(cloudMetaLocal.getId(), resetStuck)) : com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.UploadFailed(cloudMetaLocal.getId(), resetStuck, null, 4, null)) : com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.PackageFailed(cloudMetaLocal.getId(), resetStuck));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.orion.notein.domain.models.cloudsync.CloudMetaRemote, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.orion.notein.domain.models.cloudsync.CloudMetaRemote] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.orion.notein.domain.models.cloudsync.CloudMetaRemote] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.orion.notein.domain.models.cloudsync.CloudMetaLocal] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v3, types: [o0OOo0oo.OoooOoO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(CloudMetaLocal cloudMetaLocal, CloudMetaRemote cloudMetaRemote, InterfaceC27661OoooOoO interfaceC27661OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000 o000000Var;
        Object objOooO00o;
        Object objOooO00o2;
        ?? r14;
        ?? r13;
        ?? r12;
        ?? r132;
        ?? r122;
        if (abstractC32479OooO0OO instanceof o000000) {
            o000000Var = (o000000) abstractC32479OooO0OO;
            int i = o000000Var.f97374OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000Var.f97374OooOoo = i - Integer.MIN_VALUE;
            } else {
                o000000Var = new o000000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = o000000Var.f97373OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000Var.f97374OooOoo;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        try {
            try {
            } catch (Throwable th) {
                objOooO00o2 = C32446OooOOOo.OooO00o(th);
                r12 = cloudMetaLocal;
                r13 = cloudMetaRemote;
                r14 = interfaceC27661OoooOoO;
            }
        } catch (Throwable th2) {
            objOooO00o = C32446OooOOOo.OooO00o(th2);
            r122 = cloudMetaLocal;
            r132 = cloudMetaRemote;
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            if (cloudMetaRemote != 0) {
                if (cloudMetaLocal.getDeleted() && (cloudMetaLocal.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.PACKAGING || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.UPLOADING || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.CONFLICT)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("RecomputeSyncState");
                    c20358OooO00o.OooO0o0(C20593OooO0Oo.OooO0O0("Skip CloudDeleted/CloudModified for ", cloudMetaLocal.getId(), ": delete already in progress"), new Object[0]);
                    return c34434OooOoO;
                }
                o000000Var.f97370OooOo0o = this;
                o000000Var.f97369OooOo = cloudMetaLocal;
                o000000Var.f97372OooOoO0 = cloudMetaRemote;
                o000000Var.f97371OooOoO = interfaceC27661OoooOoO;
                o000000Var.f97374OooOoo = 1;
                objOooO0OO = interfaceC27661OoooOoO.OooO0O0(cloudMetaRemote, cloudMetaLocal);
                cloudMetaLocal = cloudMetaLocal;
                cloudMetaRemote = cloudMetaRemote;
                interfaceC27661OoooOoO = interfaceC27661OoooOoO;
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return c34434OooOoO;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CloudMetaRemote cloudMetaRemote2 = (CloudMetaRemote) o000000Var.f97369OooOo;
            CloudMetaLocal cloudMetaLocal2 = (CloudMetaLocal) o000000Var.f97370OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            cloudMetaLocal = cloudMetaRemote2;
            cloudMetaRemote = cloudMetaLocal2;
            objOooO00o = (Boolean) objOooO0OO;
            objOooO00o.getClass();
            r122 = cloudMetaLocal;
            r132 = cloudMetaRemote;
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("RecomputeSyncState");
                c20358OooO00o2.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isCloudModified failed for ", r132.getId()), new Object[0]);
            }
            Boolean bool = Boolean.FALSE;
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = bool;
            }
            if (((Boolean) objOooO00o).booleanValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("RecomputeSyncState");
                c20358OooO00o3.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Cloud modified detected for ", r132.getId()), new Object[0]);
                return com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.CloudModified(r132.getId(), r122));
            }
            return c34434OooOoO;
        }
        InterfaceC27661OoooOoO interfaceC27661OoooOoO2 = o000000Var.f97371OooOoO;
        CloudMetaRemote cloudMetaRemote3 = o000000Var.f97372OooOoO0;
        CloudMetaLocal cloudMetaLocal3 = (CloudMetaLocal) o000000Var.f97369OooOo;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        cloudMetaLocal = cloudMetaLocal3;
        cloudMetaRemote = cloudMetaRemote3;
        interfaceC27661OoooOoO = interfaceC27661OoooOoO2;
        objOooO00o2 = (Boolean) objOooO0OO;
        objOooO00o2.getClass();
        r12 = cloudMetaLocal;
        r13 = cloudMetaRemote;
        r14 = interfaceC27661OoooOoO;
        ?? r10 = r13;
        ?? r133 = r12;
        ?? r123 = r10;
        Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
        if (thOooO00o2 != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("RecomputeSyncState");
            c20358OooO00o4.OooO0Oo(thOooO00o2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isCloudDeleted failed for ", r133.getId()), new Object[0]);
        }
        Boolean bool2 = Boolean.FALSE;
        if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
            objOooO00o2 = bool2;
        }
        if (((Boolean) objOooO00o2).booleanValue()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("RecomputeSyncState");
            c20358OooO00o5.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Cloud deleted detected for ", r133.getId()), new Object[0]);
            return com.facebook.soloader.OooOo.OooO0oO(new SyncEvent.CloudDeleted(r133.getId(), r123));
        }
        o000000Var.f97370OooOo0o = r133;
        o000000Var.f97369OooOo = r123;
        o000000Var.f97372OooOoO0 = null;
        o000000Var.f97371OooOoO = null;
        o000000Var.f97374OooOoo = 2;
        objOooO0OO = r14.OooO0OO(r123, r133);
        cloudMetaLocal = r123;
        cloudMetaRemote = r133;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(CloudMetaLocal cloudMetaLocal, OooO00o oooO00o, InterfaceC27661OoooOoO interfaceC27661OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000O o000000o2;
        CloudMetaType cloudMetaTypeFromMime;
        ArrayList arrayList;
        OooO00o oooO00o2;
        CloudMetaLocal cloudMetaLocal2;
        ArrayList arrayList2;
        OooO00o oooO00o3;
        Object objOooO00o;
        List list;
        CloudMetaType cloudMetaType;
        Throwable thOooO00o;
        CloudMetaLocal cloudMetaLocal3;
        boolean zBooleanValue;
        Object objOooO00o2;
        List list2;
        List list3;
        Throwable thOooO00o2;
        CloudMetaLocal cloudMetaLocal4 = cloudMetaLocal;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO2 = interfaceC27661OoooOoO;
        if (abstractC32479OooO0OO instanceof o000000O) {
            o000000o2 = (o000000O) abstractC32479OooO0OO;
            int i = o000000o2.f97384OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000o2.f97384OooOooo = i - Integer.MIN_VALUE;
            } else {
                o000000o2 = new o000000O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = o000000o2.f97381OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000o2.f97384OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal4.getMimeType());
            if (cloudMetaTypeFromMime == null) {
                return C34434OooOoO.f123453OooOo0o;
            }
            arrayList = new ArrayList();
            oooO00o.getClass();
            arrayList.addAll(OooO00o(cloudMetaLocal4, cloudMetaTypeFromMime));
            try {
                o000000o2.f97377OooOo0o = this;
                o000000o2.f97376OooOo = cloudMetaLocal4;
                oooO00o2 = oooO00o;
                try {
                    o000000o2.f97379OooOoO0 = oooO00o2;
                    o000000o2.f97378OooOoO = interfaceC27661OoooOoO2;
                    o000000o2.f97380OooOoOO = cloudMetaTypeFromMime;
                    o000000o2.f97382OooOoo0 = arrayList;
                    o000000o2.f97384OooOooo = 1;
                    objOooO0Oo = interfaceC27661OoooOoO2.OooO0Oo(cloudMetaLocal4, o000000o2);
                } catch (Throwable th) {
                    th = th;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    OooO00o oooO00o4 = oooO00o2;
                    cloudMetaLocal2 = cloudMetaLocal4;
                    list = arrayList;
                    oooO00o3 = oooO00o4;
                    CloudMetaType cloudMetaType2 = cloudMetaTypeFromMime;
                    InterfaceC27661OoooOoO interfaceC27661OoooOoO3 = interfaceC27661OoooOoO2;
                    cloudMetaType = cloudMetaType2;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o != null) {
                    }
                    Boolean bool = Boolean.FALSE;
                    if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                    }
                    if (!((Boolean) objOooO00o).booleanValue()) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                oooO00o2 = oooO00o;
            }
            if (objOooO0Oo != enumC32485OooO00o) {
                cloudMetaLocal2 = cloudMetaLocal4;
                arrayList2 = arrayList;
                oooO00o3 = oooO00o2;
                objOooO00o = (Boolean) objOooO0Oo;
                objOooO00o.getClass();
                list = arrayList2;
                CloudMetaType cloudMetaType22 = cloudMetaTypeFromMime;
                InterfaceC27661OoooOoO interfaceC27661OoooOoO32 = interfaceC27661OoooOoO2;
                cloudMetaType = cloudMetaType22;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Boolean bool2 = Boolean.FALSE;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                if (!((Boolean) objOooO00o).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            ArrayList arrayList3 = o000000o2.f97382OooOoo0;
            CloudMetaType cloudMetaType3 = o000000o2.f97380OooOoOO;
            InterfaceC27661OoooOoO interfaceC27661OoooOoO4 = o000000o2.f97378OooOoO;
            oooO00o3 = (OooO00o) o000000o2.f97379OooOoO0;
            cloudMetaLocal2 = (CloudMetaLocal) o000000o2.f97376OooOo;
            try {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                cloudMetaTypeFromMime = cloudMetaType3;
                interfaceC27661OoooOoO2 = interfaceC27661OoooOoO4;
                arrayList2 = arrayList3;
                try {
                    objOooO00o = (Boolean) objOooO0Oo;
                    objOooO00o.getClass();
                    list = arrayList2;
                } catch (Throwable th3) {
                    th = th3;
                    OooO00o oooO00o5 = oooO00o3;
                    arrayList = arrayList2;
                    cloudMetaLocal4 = cloudMetaLocal2;
                    oooO00o2 = oooO00o5;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    OooO00o oooO00o42 = oooO00o2;
                    cloudMetaLocal2 = cloudMetaLocal4;
                    list = arrayList;
                    oooO00o3 = oooO00o42;
                }
            } catch (Throwable th4) {
                th = th4;
                arrayList = arrayList3;
                cloudMetaLocal4 = cloudMetaLocal2;
                oooO00o2 = oooO00o3;
                cloudMetaTypeFromMime = cloudMetaType3;
                interfaceC27661OoooOoO2 = interfaceC27661OoooOoO4;
                objOooO00o = C32446OooOOOo.OooO00o(th);
                OooO00o oooO00o422 = oooO00o2;
                cloudMetaLocal2 = cloudMetaLocal4;
                list = arrayList;
                oooO00o3 = oooO00o422;
                CloudMetaType cloudMetaType222 = cloudMetaTypeFromMime;
                InterfaceC27661OoooOoO interfaceC27661OoooOoO322 = interfaceC27661OoooOoO2;
                cloudMetaType = cloudMetaType222;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Boolean bool22 = Boolean.FALSE;
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                }
                if (!((Boolean) objOooO00o).booleanValue()) {
                }
            }
            CloudMetaType cloudMetaType2222 = cloudMetaTypeFromMime;
            InterfaceC27661OoooOoO interfaceC27661OoooOoO3222 = interfaceC27661OoooOoO2;
            cloudMetaType = cloudMetaType2222;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("RecomputeSyncState");
                c20358OooO00o.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isLocalDeleted failed for ", cloudMetaLocal2.getId()), new Object[0]);
            }
            Boolean bool222 = Boolean.FALSE;
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = bool222;
            }
            if (!((Boolean) objOooO00o).booleanValue()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("RecomputeSyncState");
                c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Local deleted detected for ", cloudMetaLocal2.getId()), new Object[0]);
                if (cloudMetaLocal2.getDeleted() && (cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.DIRTY_LOCAL || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.CONFLICT || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.PACKAGING || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.UPLOADING)) {
                    c20358OooO00o2.OooOOO0("RecomputeSyncState");
                    c20358OooO00o2.OooO0o0(C20593OooO0Oo.OooO0O0("Skip LocalDeleted for ", cloudMetaLocal2.getId(), ": delete already in progress"), new Object[0]);
                    return list;
                }
                if (!cloudMetaLocal2.getDeletedRemote()) {
                    c20358OooO00o2.OooOOO0("RecomputeSyncState");
                    c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Notify local deleted for ", cloudMetaLocal2.getId()), new Object[0]);
                    list.add(new SyncEvent.LocalDeleted(cloudMetaLocal2.getId()));
                }
                return list;
            }
            int iOrdinal = oooO00o3.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                if (cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.CLEAN || cloudMetaLocal2.getSyncState().getPhase() == SyncPhase.DIRTY_CLOUD) {
                    try {
                        o000000o2.f97377OooOo0o = cloudMetaLocal2;
                        o000000o2.f97376OooOo = cloudMetaType;
                        o000000o2.f97379OooOoO0 = list;
                        o000000o2.f97378OooOoO = null;
                        o000000o2.f97380OooOoOO = null;
                        o000000o2.f97382OooOoo0 = null;
                        o000000o2.f97384OooOooo = 2;
                        objOooO0Oo = interfaceC27661OoooOoO3222.OooO00o(cloudMetaLocal2, o000000o2);
                    } catch (Throwable th5) {
                        th = th5;
                        cloudMetaLocal3 = cloudMetaLocal2;
                        objOooO00o2 = C32446OooOOOo.OooO00o(th);
                        list3 = list;
                    }
                    if (objOooO0Oo != enumC32485OooO00o) {
                        cloudMetaLocal3 = cloudMetaLocal2;
                        list = list;
                        objOooO00o2 = (Boolean) objOooO0Oo;
                        objOooO00o2.getClass();
                        list3 = list;
                        cloudMetaLocal2 = cloudMetaLocal3;
                        thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
                        if (thOooO00o2 != null) {
                        }
                        Boolean bool3 = Boolean.FALSE;
                        if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                        }
                        zBooleanValue = ((Boolean) objOooO00o2).booleanValue();
                        list2 = list3;
                    }
                    return enumC32485OooO00o;
                }
            } else if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
            zBooleanValue = false;
            list2 = list;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) o000000o2.f97379OooOoO0;
            cloudMetaType = (CloudMetaType) o000000o2.f97376OooOo;
            cloudMetaLocal3 = (CloudMetaLocal) o000000o2.f97377OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                list = list;
                objOooO00o2 = (Boolean) objOooO0Oo;
                objOooO00o2.getClass();
                list3 = list;
            } catch (Throwable th6) {
                th = th6;
                objOooO00o2 = C32446OooOOOo.OooO00o(th);
                list3 = list;
            }
            cloudMetaLocal2 = cloudMetaLocal3;
            thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o2);
            if (thOooO00o2 != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("RecomputeSyncState");
                c20358OooO00o3.OooO0Oo(thOooO00o2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isLocalModified failed for ", cloudMetaLocal2.getId()), new Object[0]);
            }
            Boolean bool32 = Boolean.FALSE;
            if (objOooO00o2 instanceof C32445OooOOOO.OooO00o) {
                objOooO00o2 = bool32;
            }
            zBooleanValue = ((Boolean) objOooO00o2).booleanValue();
            list2 = list3;
        }
        if (zBooleanValue) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("RecomputeSyncState");
            c20358OooO00o4.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Local modified detected for ", cloudMetaLocal2.getId()), new Object[0]);
            list2.add(new SyncEvent.LocalModified(cloudMetaLocal2.getId(), cloudMetaType));
        }
        return list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #4 {all -> 0x00bb, blocks: (B:34:0x00b6, B:47:0x0131, B:49:0x0135), top: B:100:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0246 A[Catch: all -> 0x0054, LOOP:0: B:72:0x0240->B:74:0x0246, LOOP_END, TryCatch #2 {all -> 0x0054, blocks: (B:16:0x004f, B:71:0x0220, B:72:0x0240, B:74:0x0246, B:75:0x0254), top: B:96:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27673o000000o c27673o000000o;
        String str2;
        o000OOo o000ooo2;
        OooO00o oooO00o2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str3;
        OooO00o oooO00o3;
        o000OOo o000ooo3;
        CloudMetaLocal cloudMetaLocal;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        String str4;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO;
        ArrayList arrayList;
        InterfaceC33895OooO00o interfaceC33895OooO00o4;
        String str5;
        o000OOo o000ooo4;
        CloudMetaLocal cloudMetaLocal2;
        List list;
        List list2;
        CloudMetaLocal cloudMetaLocal3;
        InterfaceC33895OooO00o interfaceC33895OooO00o5;
        List list3;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C27673o000000o) {
            c27673o000000o = (C27673o000000o) abstractC32479OooO0OO;
            int i = c27673o000000o.f97394Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27673o000000o.f97394Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c27673o000000o = new C27673o000000o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0 = c27673o000000o.f97392OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27673o000000o.f97394Oooo000;
        List list4 = C34434OooOoO.f123453OooOo0o;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooo0);
                c27673o000000o.f97386OooOo0o = this;
                str2 = str;
                c27673o000000o.f97385OooOo = str2;
                c27673o000000o.f97388OooOoO0 = oooO00o;
                C33898OooO0Oo c33898OooO0Oo = this.f97583OooO0OO;
                c27673o000000o.f97387OooOoO = c33898OooO0Oo;
                c27673o000000o.f97394Oooo000 = 1;
                if (c33898OooO0Oo.OooO00o(c27673o000000o) != enumC32485OooO00o) {
                    o000ooo2 = this;
                    oooO00o2 = oooO00o;
                    interfaceC33895OooO00o = c33898OooO0Oo;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c27673o000000o.f97387OooOoO;
                    oooO00o3 = (OooO00o) c27673o000000o.f97388OooOoO0;
                    str3 = (String) c27673o000000o.f97385OooOo;
                    o000ooo3 = (o000OOo) c27673o000000o.f97386OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooo0);
                        cloudMetaLocal = (CloudMetaLocal) objOooo0;
                        if (cloudMetaLocal != null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("RecomputeSyncState");
                            c20358OooO00o.OooOO0O("resetStuckState: meta not found: " + str3, new Object[0]);
                        } else {
                            try {
                                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal.getMimeType());
                                if (cloudMetaTypeFromMime == null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0("RecomputeSyncState");
                                    c20358OooO00o2.OooOO0O("Unknown mime " + cloudMetaLocal.getMimeType() + " for " + str3, new Object[0]);
                                } else {
                                    interfaceC27661OoooOoO = o000ooo3.f97582OooO0O0.get(cloudMetaTypeFromMime);
                                    if (interfaceC27661OoooOoO != null) {
                                        arrayList = new ArrayList();
                                        c27673o000000o.f97386OooOo0o = o000ooo3;
                                        c27673o000000o.f97385OooOo = str3;
                                        c27673o000000o.f97388OooOoO0 = interfaceC33895OooO00o2;
                                        c27673o000000o.f97387OooOoO = cloudMetaLocal;
                                        c27673o000000o.f97389OooOoOO = interfaceC27661OoooOoO;
                                        c27673o000000o.f97391OooOoo0 = arrayList;
                                        c27673o000000o.f97390OooOoo = arrayList;
                                        c27673o000000o.f97394Oooo000 = 3;
                                        Object objOooO0OO = o000ooo3.OooO0OO(cloudMetaLocal, oooO00o3, interfaceC27661OoooOoO, c27673o000000o);
                                        if (objOooO0OO != enumC32485OooO00o) {
                                            interfaceC33895OooO00o4 = interfaceC33895OooO00o2;
                                            str5 = str3;
                                            o000ooo4 = o000ooo3;
                                            cloudMetaLocal2 = cloudMetaLocal;
                                            objOooo0 = objOooO0OO;
                                            list = arrayList;
                                            arrayList.addAll((Collection) objOooo0);
                                            InterfaceC27605OooO00o interfaceC27605OooO00o = o000ooo4.f97581OooO00o;
                                            String id = cloudMetaLocal2.getId();
                                            c27673o000000o.f97386OooOo0o = o000ooo4;
                                            c27673o000000o.f97385OooOo = str5;
                                            c27673o000000o.f97388OooOoO0 = interfaceC33895OooO00o4;
                                            c27673o000000o.f97387OooOoO = cloudMetaLocal2;
                                            c27673o000000o.f97389OooOoOO = interfaceC27661OoooOoO;
                                            c27673o000000o.f97391OooOoo0 = list;
                                            c27673o000000o.f97390OooOoo = null;
                                            c27673o000000o.f97394Oooo000 = 4;
                                            objOooo0 = interfaceC27605OooO00o.Oooo0(id, c27673o000000o);
                                            if (objOooo0 != enumC32485OooO00o) {
                                            }
                                        }
                                        return enumC32485OooO00o;
                                    }
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOOO0("RecomputeSyncState");
                                    c20358OooO00o3.OooOO0O("No detector for " + cloudMetaLocal.getMimeType() + " (" + str3 + ")", new Object[0]);
                                }
                            } catch (Throwable th) {
                                th = th;
                                interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                                str4 = str3;
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("RecomputeSyncState");
                                c20358OooO00o4.OooO0Oo(th, "Failed to reset stuck state for " + str4, new Object[0]);
                            }
                        }
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return list4;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                if (i2 == 3) {
                    arrayList = c27673o000000o.f97390OooOoo;
                    List list5 = c27673o000000o.f97391OooOoo0;
                    InterfaceC27661OoooOoO interfaceC27661OoooOoO2 = c27673o000000o.f97389OooOoOO;
                    cloudMetaLocal2 = (CloudMetaLocal) c27673o000000o.f97387OooOoO;
                    interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) c27673o000000o.f97388OooOoO0;
                    str5 = (String) c27673o000000o.f97385OooOo;
                    o000OOo o000ooo5 = (o000OOo) c27673o000000o.f97386OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooo0);
                        list = list5;
                        interfaceC27661OoooOoO = interfaceC27661OoooOoO2;
                        o000ooo4 = o000ooo5;
                        arrayList.addAll((Collection) objOooo0);
                        InterfaceC27605OooO00o interfaceC27605OooO00o2 = o000ooo4.f97581OooO00o;
                        String id2 = cloudMetaLocal2.getId();
                        c27673o000000o.f97386OooOo0o = o000ooo4;
                        c27673o000000o.f97385OooOo = str5;
                        c27673o000000o.f97388OooOoO0 = interfaceC33895OooO00o4;
                        c27673o000000o.f97387OooOoO = cloudMetaLocal2;
                        c27673o000000o.f97389OooOoOO = interfaceC27661OoooOoO;
                        c27673o000000o.f97391OooOoo0 = list;
                        c27673o000000o.f97390OooOoo = null;
                        c27673o000000o.f97394Oooo000 = 4;
                        objOooo0 = interfaceC27605OooO00o2.Oooo0(id2, c27673o000000o);
                        if (objOooo0 != enumC32485OooO00o) {
                            list2 = list;
                            cloudMetaLocal3 = cloudMetaLocal2;
                            interfaceC33895OooO00o5 = interfaceC33895OooO00o4;
                            c27673o000000o.f97386OooOo0o = str5;
                            c27673o000000o.f97385OooOo = interfaceC33895OooO00o5;
                            c27673o000000o.f97388OooOoO0 = list2;
                            c27673o000000o.f97387OooOoO = list2;
                            c27673o000000o.f97389OooOoOO = null;
                            c27673o000000o.f97391OooOoo0 = null;
                            c27673o000000o.f97394Oooo000 = 5;
                            objOooo0 = o000ooo4.OooO0O0(cloudMetaLocal3, (CloudMetaRemote) objOooo0, interfaceC27661OoooOoO, c27673o000000o);
                            if (objOooo0 != enumC32485OooO00o) {
                            }
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC33895OooO00o3 = interfaceC33895OooO00o4;
                        str4 = str5;
                        C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o42.OooOOO0("RecomputeSyncState");
                        c20358OooO00o42.OooO0Oo(th, "Failed to reset stuck state for " + str4, new Object[0]);
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return list4;
                    }
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) c27673o000000o.f97387OooOoO;
                    list3 = (List) c27673o000000o.f97388OooOoO0;
                    interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) c27673o000000o.f97385OooOo;
                    str4 = (String) c27673o000000o.f97386OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooo0);
                        list2.addAll((Collection) objOooo0);
                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5.OooOOO0("RecomputeSyncState");
                        int size = list3.size();
                        List list6 = list3;
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list6, 10));
                        it = list6.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((SyncEvent) it.next()).getName());
                        }
                        c20358OooO00o5.OooO0o0("Computed " + size + " events for " + str4 + ": " + arrayList2, new Object[0]);
                        list4 = list3;
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            C34406OooO00o.C20358OooO00o c20358OooO00o422 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o422.OooOOO0("RecomputeSyncState");
                            c20358OooO00o422.OooO0Oo(th, "Failed to reset stuck state for " + str4, new Object[0]);
                        } catch (Throwable th5) {
                            th = th5;
                            interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                            interfaceC33895OooO00o2.OooOOO0(null);
                            throw th;
                        }
                    }
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return list4;
                }
                list2 = c27673o000000o.f97391OooOoo0;
                interfaceC27661OoooOoO = c27673o000000o.f97389OooOoOO;
                cloudMetaLocal3 = (CloudMetaLocal) c27673o000000o.f97387OooOoO;
                interfaceC33895OooO00o5 = (InterfaceC33895OooO00o) c27673o000000o.f97388OooOoO0;
                String str6 = (String) c27673o000000o.f97385OooOo;
                o000ooo4 = (o000OOo) c27673o000000o.f97386OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooo0);
                    str5 = str6;
                    try {
                        c27673o000000o.f97386OooOo0o = str5;
                        c27673o000000o.f97385OooOo = interfaceC33895OooO00o5;
                        c27673o000000o.f97388OooOoO0 = list2;
                        c27673o000000o.f97387OooOoO = list2;
                        c27673o000000o.f97389OooOoOO = null;
                        c27673o000000o.f97391OooOoo0 = null;
                        c27673o000000o.f97394Oooo000 = 5;
                        objOooo0 = o000ooo4.OooO0O0(cloudMetaLocal3, (CloudMetaRemote) objOooo0, interfaceC27661OoooOoO, c27673o000000o);
                    } catch (Throwable th6) {
                        th = th6;
                        interfaceC33895OooO00o3 = interfaceC33895OooO00o5;
                        str4 = str5;
                        C34406OooO00o.C20358OooO00o c20358OooO00o4222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4222.OooOOO0("RecomputeSyncState");
                        c20358OooO00o4222.OooO0Oo(th, "Failed to reset stuck state for " + str4, new Object[0]);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o5;
                    str4 = str6;
                    C34406OooO00o.C20358OooO00o c20358OooO00o42222 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o42222.OooOOO0("RecomputeSyncState");
                    c20358OooO00o42222.OooO0Oo(th, "Failed to reset stuck state for " + str4, new Object[0]);
                }
                if (objOooo0 != enumC32485OooO00o) {
                    list3 = list2;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o5;
                    str4 = str5;
                    list2.addAll((Collection) objOooo0);
                    C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o52.OooOOO0("RecomputeSyncState");
                    int size2 = list3.size();
                    List list62 = list3;
                    ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list62, 10));
                    it = list62.iterator();
                    while (it.hasNext()) {
                    }
                    c20358OooO00o52.OooO0o0("Computed " + size2 + " events for " + str4 + ": " + arrayList22, new Object[0]);
                    list4 = list3;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return list4;
                }
                return enumC32485OooO00o;
            }
            interfaceC33895OooO00o = (InterfaceC33895OooO00o) c27673o000000o.f97387OooOoO;
            oooO00o2 = (OooO00o) c27673o000000o.f97388OooOoO0;
            String str7 = (String) c27673o000000o.f97385OooOo;
            o000ooo2 = (o000OOo) c27673o000000o.f97386OooOo0o;
            C32446OooOOOo.OooO0O0(objOooo0);
            str2 = str7;
            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o6.OooOOO0("RecomputeSyncState");
            c20358OooO00o6.OooO0o0("Start resetStuckState for " + str2 + " [" + oooO00o2 + "]", new Object[0]);
            InterfaceC27605OooO00o interfaceC27605OooO00o3 = o000ooo2.f97581OooO00o;
            c27673o000000o.f97386OooOo0o = o000ooo2;
            c27673o000000o.f97385OooOo = str2;
            c27673o000000o.f97388OooOoO0 = oooO00o2;
            c27673o000000o.f97387OooOoO = interfaceC33895OooO00o;
            c27673o000000o.f97394Oooo000 = 2;
            Object objOooOO0O = interfaceC27605OooO00o3.OooOO0O(str2, null, c27673o000000o);
            if (objOooOO0O != enumC32485OooO00o) {
                str3 = str2;
                objOooo0 = objOooOO0O;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                oooO00o3 = oooO00o2;
                o000ooo3 = o000ooo2;
                cloudMetaLocal = (CloudMetaLocal) objOooo0;
                if (cloudMetaLocal != null) {
                }
                interfaceC33895OooO00o2.OooOOO0(null);
                return list4;
            }
            return enumC32485OooO00o;
        } catch (Throwable th8) {
            th = th8;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {all -> 0x0062, blocks: (B:21:0x0057, B:34:0x00a2, B:37:0x00a7, B:40:0x00ad, B:42:0x00bc, B:44:0x00c8, B:46:0x00d4, B:47:0x00fd, B:31:0x008d), top: B:69:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:21:0x0057, B:34:0x00a2, B:37:0x00a7, B:40:0x00ad, B:42:0x00bc, B:44:0x00c8, B:46:0x00d4, B:47:0x00fd, B:31:0x008d), top: B:69:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:51:0x0128, B:52:0x0137, B:54:0x013d, B:56:0x014d, B:57:0x0172, B:59:0x017e, B:60:0x01aa, B:62:0x01ba, B:63:0x01f7), top: B:70:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v7, types: [oO0o0oOo.OooO00o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00000 o00000Var;
        ?? r3;
        Set set2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        o000OOo o000ooo2;
        Object objOooO0Oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str;
        String str2;
        Set set3;
        o000OOo o000ooo3;
        Object obj;
        ?? r6;
        if (abstractC32479OooO0OO instanceof o00000) {
            o00000Var = (o00000) abstractC32479OooO0OO;
            int i = o00000Var.f97367OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00000Var.f97367OooOoo = i - Integer.MIN_VALUE;
            } else {
                o00000Var = new o00000(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = o00000Var.f97366OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r62 = o00000Var.f97367OooOoo;
        try {
            if (r62 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                C33898OooO0Oo c33898OooO0Oo = this.f97583OooO0OO;
                o00000Var.f97363OooOo0o = this;
                o00000Var.f97362OooOo = set;
                o00000Var.f97365OooOoO0 = c33898OooO0Oo;
                o00000Var.f97367OooOoo = 1;
                if (c33898OooO0Oo.OooO00o(o00000Var) != enumC32485OooO00o) {
                    set2 = set;
                    interfaceC33895OooO00o = c33898OooO0Oo;
                    o000ooo2 = this;
                }
                return enumC32485OooO00o;
            }
            if (r62 != 1) {
                if (r62 == 2) {
                    InterfaceC33895OooO00o interfaceC33895OooO00o3 = o00000Var.f97365OooOoO0;
                    set2 = o00000Var.f97362OooOo;
                    o000OOo o000ooo4 = o00000Var.f97363OooOo0o;
                    C32446OooOOOo.OooO0O0(obj2);
                    objOooO0Oo = ((C32445OooOOOO) obj2).f116639OooOo0o;
                    o000ooo2 = o000ooo4;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
                        objOooO0Oo = null;
                    }
                    str = (String) objOooO0Oo;
                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                    if (str != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("RecomputeSyncState");
                        c20358OooO00o.OooOO0O("resetStuckStates: driveId is null, skipping", new Object[0]);
                        r6 = interfaceC33895OooO00o2;
                        obj = c34434OooOoO;
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (!str.equals(o000ooo2.f97584OooO0Oo) || jCurrentTimeMillis - o000ooo2.f97585OooO0o0 >= 3000) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("RecomputeSyncState");
                            c20358OooO00o2.OooO0o0("Start resetStuckStates for driveId=".concat(str), new Object[0]);
                            InterfaceC27605OooO00o interfaceC27605OooO00o = o000ooo2.f97581OooO00o;
                            o00000Var.f97363OooOo0o = o000ooo2;
                            o00000Var.f97362OooOo = set2;
                            o00000Var.f97365OooOoO0 = interfaceC33895OooO00o2;
                            o00000Var.f97364OooOoO = str;
                            o00000Var.f97367OooOoo = 3;
                            Serializable serializableOooOOo0 = interfaceC27605OooO00o.OooOOo0(str, o00000Var);
                            if (serializableOooOOo0 != enumC32485OooO00o) {
                                str2 = str;
                                obj2 = serializableOooOOo0;
                                r3 = interfaceC33895OooO00o2;
                                set3 = set2;
                                o000ooo3 = o000ooo2;
                                List<CloudMetaLocal> list = (List) obj2;
                                ArrayList arrayList = new ArrayList();
                                int i2 = 0;
                                while (r6.hasNext()) {
                                }
                                o000ooo3.f97584OooO0Oo = str2;
                                o000ooo3.f97585OooO0o0 = System.currentTimeMillis();
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("RecomputeSyncState");
                                c20358OooO00o3.OooO0o0("Completed resetStuckStates: " + list.size() + " checked, " + i2 + " reset, " + arrayList.size() + " events", new Object[0]);
                                r6 = r3;
                                obj = arrayList;
                            }
                            return enumC32485OooO00o;
                        }
                        long j = jCurrentTimeMillis - o000ooo2.f97585OooO0o0;
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("RecomputeSyncState");
                        c20358OooO00o4.OooO0o0("Skipping resetStuckStates for driveId=" + str + " (already done " + j + "ms ago)", new Object[0]);
                        obj = c34434OooOoO;
                        r6 = interfaceC33895OooO00o2;
                    }
                    r6.OooOOO0(null);
                    return (Serializable) obj;
                }
                if (r62 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = o00000Var.f97364OooOoO;
                r3 = o00000Var.f97365OooOoO0;
                set3 = o00000Var.f97362OooOo;
                o000ooo3 = o00000Var.f97363OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj2);
                    r3 = r3;
                    List<CloudMetaLocal> list2 = (List) obj2;
                    ArrayList arrayList2 = new ArrayList();
                    int i22 = 0;
                    for (CloudMetaLocal cloudMetaLocal : list2) {
                        if (set3.contains(cloudMetaLocal.getId())) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o5.OooOOO0("RecomputeSyncState");
                            c20358OooO00o5.OooO00o("Skipping resetStuckStates for " + cloudMetaLocal.getId() + ": meta is in progress", new Object[0]);
                        } else {
                            CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal.getMimeType());
                            if (cloudMetaTypeFromMime == null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o6.OooOOO0("RecomputeSyncState");
                                c20358OooO00o6.OooOO0O("Unknown mime " + cloudMetaLocal.getMimeType() + " for " + cloudMetaLocal.getId(), new Object[0]);
                            } else {
                                o000ooo3.getClass();
                                List listOooO00o = OooO00o(cloudMetaLocal, cloudMetaTypeFromMime);
                                if (!listOooO00o.isEmpty()) {
                                    arrayList2.addAll(listOooO00o);
                                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o7.OooOOO0("RecomputeSyncState");
                                    c20358OooO00o7.OooO0o0("Reset stuck state for " + cloudMetaLocal.getId() + " (phase=" + cloudMetaLocal.getSyncState().getPhase() + ")", new Object[0]);
                                    i22++;
                                }
                            }
                        }
                    }
                    o000ooo3.f97584OooO0Oo = str2;
                    o000ooo3.f97585OooO0o0 = System.currentTimeMillis();
                    C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32.OooOOO0("RecomputeSyncState");
                    c20358OooO00o32.OooO0o0("Completed resetStuckStates: " + list2.size() + " checked, " + i22 + " reset, " + arrayList2.size() + " events", new Object[0]);
                    r6 = r3;
                    obj = arrayList2;
                    r6.OooOOO0(null);
                    return (Serializable) obj;
                } catch (Throwable th) {
                    th = th;
                    r3.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = o00000Var.f97365OooOoO0;
            set2 = o00000Var.f97362OooOo;
            o000ooo2 = o00000Var.f97363OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            InterfaceC27605OooO00o interfaceC27605OooO00o2 = o000ooo2.f97581OooO00o;
            o00000Var.f97363OooOo0o = o000ooo2;
            o00000Var.f97362OooOo = set2;
            o00000Var.f97365OooOoO0 = interfaceC33895OooO00o;
            o00000Var.f97367OooOoo = 2;
            objOooO0Oo = interfaceC27605OooO00o2.OooO0Oo(o00000Var);
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            if (objOooO0Oo != enumC32485OooO00o) {
                if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
                }
                str = (String) objOooO0Oo;
                C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
                if (str != null) {
                }
                r6.OooOOO0(null);
                return (Serializable) obj;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            r3 = r62;
        }
    }
}
