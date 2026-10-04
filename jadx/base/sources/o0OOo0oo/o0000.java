package o0OOo0oo;

import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncPostAction;
import java.util.Map;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27661OoooOoO> f97352OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SyncPostAction f97353OooO00o;

        public OooO00o(SyncPostAction postAction) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(postAction, "postAction");
            this.f97353OooO00o = postAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97353OooO00o, ((OooO00o) obj).f97353OooO00o);
        }

        public final int hashCode() {
            return this.f97353OooO00o.hashCode();
        }

        public final String toString() {
            return "RemoteNotFoundResolution(postAction=" + this.f97353OooO00o + ")";
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CloudMetaRemote f97354OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final DriveSnapshotCacheEntity f97355OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f97356OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f97357OooO0Oo;

        public OooO0O0(CloudMetaRemote cloudMetaRemote, DriveSnapshotCacheEntity driveSnapshotCacheEntity, boolean z) {
            this.f97354OooO00o = cloudMetaRemote;
            this.f97355OooO0O0 = driveSnapshotCacheEntity;
            this.f97356OooO0OO = z;
            boolean z2 = true;
            if (cloudMetaRemote != null && !cloudMetaRemote.getDeleted() && (driveSnapshotCacheEntity == null || !driveSnapshotCacheEntity.getRecycled())) {
                z2 = false;
            }
            this.f97357OooO0Oo = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97354OooO00o, oooO0O0.f97354OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97355OooO0O0, oooO0O0.f97355OooO0O0) && this.f97356OooO0OO == oooO0O0.f97356OooO0OO;
        }

        public final int hashCode() {
            CloudMetaRemote cloudMetaRemote = this.f97354OooO00o;
            int iHashCode = (cloudMetaRemote == null ? 0 : cloudMetaRemote.hashCode()) * 31;
            DriveSnapshotCacheEntity driveSnapshotCacheEntity = this.f97355OooO0O0;
            return Boolean.hashCode(this.f97356OooO0OO) + ((iHashCode + (driveSnapshotCacheEntity != null ? driveSnapshotCacheEntity.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteState(meta=");
            sb.append(this.f97354OooO00o);
            sb.append(", snapshot=");
            sb.append(this.f97355OooO0O0);
            sb.append(", snapshotNotFound=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f97356OooO0OO);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f97358OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f97359OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f97360OooOoO0;

        static {
            OooO0OO oooO0OO = new OooO0OO("UPSTREAM", 0);
            f97359OooOo0o = oooO0OO;
            OooO0OO oooO0OO2 = new OooO0OO("DOWNSTREAM", 1);
            f97358OooOo = oooO0OO2;
            OooO0OO[] oooO0OOArr = {oooO0OO, oooO0OO2};
            f97360OooOoO0 = oooO0OOArr;
            OooO.OooO00o.OooO0O0(oooO0OOArr);
        }

        public OooO0OO() {
            throw null;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f97360OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: o0OOo0oo.o0000$OooO0Oo, reason: case insensitive filesystem */
    public /* synthetic */ class C27672OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97361OooO00o;

        static {
            int[] iArr = new int[OooO0OO.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO0OO oooO0OO = OooO0OO.f97359OooOo0o;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SyncPhase.values().length];
            try {
                iArr2[SyncPhase.UPLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SyncPhase.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f97361OooO00o = iArr2;
        }
    }

    public o0000(InterfaceC27605OooO00o cloudSyncRepo, Map<CloudMetaType, InterfaceC27661OoooOoO> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97351OooO00o = cloudSyncRepo;
        this.f97352OooO0O0 = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000O00 o0000o00;
        Object objOooOo;
        o0000 o0000Var;
        Object obj;
        CloudMetaRemote cloudMetaRemote;
        if (abstractC32479OooO0OO instanceof o0000O00) {
            o0000o00 = (o0000O00) abstractC32479OooO0OO;
            int i = o0000o00.f97444OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o00.f97444OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o0000o00 = new o0000O00(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = o0000o00.f97443OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000o00.f97444OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            o0000o00.f97441OooOo0o = this;
            o0000o00.f97440OooOo = str;
            o0000o00.f97444OooOoOO = 1;
            objOooOo = this.f97351OooO00o.OooOo(str, o0000o00);
            if (objOooOo != enumC32485OooO00o) {
                o0000Var = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudMetaRemote = (CloudMetaRemote) o0000o00.f97441OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
            return new OooO0O0(cloudMetaRemote, (DriveSnapshotCacheEntity) (obj instanceof C32445OooOOOO.OooO00o ? null : obj), C32445OooOOOO.OooO00o(obj) instanceof CloudSyncError.ResourceNotFound);
        }
        str = o0000o00.f97440OooOo;
        o0000Var = (o0000) o0000o00.f97441OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        objOooOo = ((C32445OooOOOO) obj2).f116639OooOo0o;
        if (objOooOo instanceof C32445OooOOOO.OooO00o) {
            objOooOo = null;
        }
        CloudMetaRemote cloudMetaRemote2 = (CloudMetaRemote) objOooOo;
        InterfaceC27605OooO00o interfaceC27605OooO00o = o0000Var.f97351OooO00o;
        o0000o00.f97441OooOo0o = cloudMetaRemote2;
        o0000o00.f97440OooOo = null;
        o0000o00.f97444OooOoOO = 2;
        Object objOooOo0O = interfaceC27605OooO00o.OooOo0O(str, o0000o00);
        if (objOooOo0O != enumC32485OooO00o) {
            obj = objOooOo0O;
            cloudMetaRemote = cloudMetaRemote2;
            return new OooO0O0(cloudMetaRemote, (DriveSnapshotCacheEntity) (obj instanceof C32445OooOOOO.OooO00o ? null : obj), C32445OooOOOO.OooO00o(obj) instanceof CloudSyncError.ResourceNotFound);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r14 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(CloudMetaLocal cloudMetaLocal, SyncPhase syncPhase, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27691o0000oo c27691o0000oo;
        OooO0OO oooO0OO;
        OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C27691o0000oo) {
            c27691o0000oo = (C27691o0000oo) abstractC32479OooO0OO;
            int i = c27691o0000oo.f97560OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27691o0000oo.f97560OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27691o0000oo = new C27691o0000oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27691o0000oo.f97558OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27691o0000oo.f97560OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o0);
                int i3 = C27672OooO0Oo.f97361OooO00o[syncPhase.ordinal()];
                if (i3 == 1) {
                    oooO0OO = OooO0OO.f97359OooOo0o;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException(("ResolveRemoteNotFound called in unexpected phase: " + syncPhase).toString());
                    }
                    oooO0OO = OooO0OO.f97358OooOo;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ResolveRemoteNotFoundUseCase");
                c20358OooO00o.OooO0o0("Resolve remote not found: id=" + cloudMetaLocal.getId() + ", phase=" + syncPhase + ", direction=" + oooO0OO, new Object[0]);
                int iOrdinal = oooO0OO.ordinal();
                if (iOrdinal == 0) {
                    c27691o0000oo.f97559OooOo0o = cloudMetaLocal;
                    c27691o0000oo.f97560OooOoO = 1;
                    objOooO0o0 = OooO0o0(cloudMetaLocal, c27691o0000oo);
                } else {
                    if (iOrdinal != 1) {
                        throw new C32442OooOO0o();
                    }
                    c27691o0000oo.f97559OooOo0o = cloudMetaLocal;
                    c27691o0000oo.f97560OooOoO = 2;
                    objOooO0o0 = OooO0Oo(cloudMetaLocal, c27691o0000oo);
                    if (objOooO0o0 == obj) {
                    }
                    oooO00o = (OooO00o) objOooO0o0;
                }
                return obj;
            }
            if (i2 == 1) {
                cloudMetaLocal = c27691o0000oo.f97559OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                oooO00o = (OooO00o) objOooO0o0;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cloudMetaLocal = c27691o0000oo.f97559OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o0);
                oooO00o = (OooO00o) objOooO0o0;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ResolveRemoteNotFoundUseCase");
            c20358OooO00o2.OooO0o0("Resolved action: " + oooO00o.f97353OooO00o + " for " + cloudMetaLocal.getId(), new Object[0]);
            return oooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27687o0000oO c27687o0000oO;
        Object objOooO00o;
        InterfaceC27661OoooOoO interfaceC27661OoooOoO;
        if (abstractC32479OooO0OO instanceof C27687o0000oO) {
            c27687o0000oO = (C27687o0000oO) abstractC32479OooO0OO;
            int i = c27687o0000oO.f97543OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27687o0000oO.f97543OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27687o0000oO = new C27687o0000oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27687o0000oO.f97541OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27687o0000oO.f97543OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                if (cloudMetaLocal.getDeleted()) {
                    return Boolean.FALSE;
                }
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal.getMimeType());
                if (cloudMetaTypeFromMime == null || (interfaceC27661OoooOoO = this.f97352OooO0O0.get(cloudMetaTypeFromMime)) == null) {
                    return Boolean.TRUE;
                }
                c27687o0000oO.f97542OooOo0o = cloudMetaLocal;
                c27687o0000oO.f97543OooOoO = 1;
                objOooO0Oo = interfaceC27661OoooOoO.OooO0Oo(cloudMetaLocal, c27687o0000oO);
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cloudMetaLocal = c27687o0000oO.f97542OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
            }
            objOooO00o = (Boolean) objOooO0Oo;
            objOooO00o.getClass();
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ResolveRemoteNotFoundUseCase");
            c20358OooO00o.OooO0Oo(thOooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isLocalDeleted failed for ", cloudMetaLocal.getId()), new Object[0]);
        }
        Boolean bool = Boolean.FALSE;
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = bool;
        }
        return Boolean.valueOf(!((Boolean) objOooO00o).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r13 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        if (r13 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000O0 o0000o0;
        o0000 o0000Var;
        CloudMetaLocal cloudMetaLocal2;
        OooO0O0 oooO0O0;
        o0000 o0000Var2;
        Object objOooOO0o;
        Object objOooOO0o2;
        if (abstractC32479OooO0OO instanceof o0000O0) {
            o0000o0 = (o0000O0) abstractC32479OooO0OO;
            int i = o0000o0.f97439OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o0.f97439OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o0000o0 = new o0000O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o0000o0.f97436OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000o0.f97439OooOoo0;
        CloudMetaRemote cloudMetaRemote = null;
        cloudMetaRemote = null;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            String id = cloudMetaLocal.getId();
            o0000o0.f97435OooOo0o = this;
            o0000o0.f97434OooOo = cloudMetaLocal;
            o0000o0.f97439OooOoo0 = 1;
            objOooO00o = OooO00o(id, o0000o0);
            if (objOooO00o != enumC32485OooO00o) {
                o0000Var = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    objOooOO0o2 = ((C32445OooOOOO) objOooO00o).f116639OooOo0o;
                    boolean z = objOooOO0o2 instanceof C32445OooOOOO.OooO00o;
                    if (!z) {
                        return new OooO00o(new SyncPostAction.AcceptRemoteDelete((CloudMetaRemote) (z ? null : objOooOO0o2)));
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ResolveRemoteNotFoundUseCase");
                    c20358OooO00o.OooO0Oo(C32445OooOOOO.OooO00o(objOooOO0o2), "DOWNSTREAM: ensureRemoteMetaDeleted failed", new Object[0]);
                    return new OooO00o(SyncPostAction.None.INSTANCE);
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
                objOooOO0o = ((C32445OooOOOO) objOooO00o).f116639OooOo0o;
                boolean z2 = objOooOO0o instanceof C32445OooOOOO.OooO00o;
                if (!z2) {
                    return new OooO00o(new SyncPostAction.AcceptRemoteDelete((CloudMetaRemote) (z2 ? null : objOooOO0o)));
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("ResolveRemoteNotFoundUseCase");
                c20358OooO00o2.OooO0Oo(C32445OooOOOO.OooO00o(objOooOO0o), "DOWNSTREAM: ensureRemoteMetaDeleted failed", new Object[0]);
                return new OooO00o(SyncPostAction.None.INSTANCE);
            }
            oooO0O0 = o0000o0.f97437OooOoO0;
            cloudMetaLocal2 = o0000o0.f97434OooOo;
            o0000Var2 = o0000o0.f97435OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            boolean zBooleanValue = ((Boolean) objOooO00o).booleanValue();
            if (!oooO0O0.f97357OooO0Oo) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("ResolveRemoteNotFoundUseCase");
                c20358OooO00o3.OooO00o("DOWNSTREAM: remote marked deleted", new Object[0]);
                CloudMetaRemote cloudMetaRemote2 = oooO0O0.f97354OooO00o;
                if (cloudMetaRemote2 != null && cloudMetaRemote2.getDeleted()) {
                    cloudMetaRemote = cloudMetaRemote2;
                }
                return new OooO00o(new SyncPostAction.AcceptRemoteDelete(cloudMetaRemote));
            }
            boolean z3 = oooO0O0.f97356OooO0OO;
            if (z3 && zBooleanValue) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("ResolveRemoteNotFoundUseCase");
                c20358OooO00o4.OooO00o("DOWNSTREAM: snapshot missing, local exists, mark remote deleted", new Object[0]);
                InterfaceC27605OooO00o interfaceC27605OooO00o = o0000Var2.f97351OooO00o;
                String id2 = cloudMetaLocal2.getId();
                o0000o0.f97435OooOo0o = null;
                o0000o0.f97434OooOo = null;
                o0000o0.f97437OooOoO0 = null;
                o0000o0.f97439OooOoo0 = 3;
                objOooOO0o2 = interfaceC27605OooO00o.OooOO0o(id2, o0000o0);
            } else {
                if (!z3 || zBooleanValue) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("ResolveRemoteNotFoundUseCase");
                    c20358OooO00o5.OooO00o("DOWNSTREAM: remote exists, suggest retry pull", new Object[0]);
                    return new OooO00o(SyncPostAction.RetryPull.INSTANCE);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0("ResolveRemoteNotFoundUseCase");
                c20358OooO00o6.OooO00o("DOWNSTREAM: snapshot missing, local not exists, ensure remote deleted", new Object[0]);
                InterfaceC27605OooO00o interfaceC27605OooO00o2 = o0000Var2.f97351OooO00o;
                String id3 = cloudMetaLocal2.getId();
                o0000o0.f97435OooOo0o = null;
                o0000o0.f97434OooOo = null;
                o0000o0.f97437OooOoO0 = null;
                o0000o0.f97439OooOoo0 = 4;
                objOooOO0o = interfaceC27605OooO00o2.OooOO0o(id3, o0000o0);
            }
            return enumC32485OooO00o;
        }
        cloudMetaLocal = o0000o0.f97434OooOo;
        o0000Var = o0000o0.f97435OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        OooO0O0 oooO0O02 = (OooO0O0) objOooO00o;
        o0000o0.f97435OooOo0o = o0000Var;
        o0000o0.f97434OooOo = cloudMetaLocal;
        o0000o0.f97437OooOoO0 = oooO0O02;
        o0000o0.f97439OooOoo0 = 2;
        Object objOooO0OO = o0000Var.OooO0OO(cloudMetaLocal, o0000o0);
        if (objOooO0OO != enumC32485OooO00o) {
            o0000 o0000Var3 = o0000Var;
            cloudMetaLocal2 = cloudMetaLocal;
            oooO0O0 = oooO0O02;
            objOooO00o = objOooO0OO;
            o0000Var2 = o0000Var3;
            boolean zBooleanValue2 = ((Boolean) objOooO00o).booleanValue();
            if (!oooO0O0.f97357OooO0Oo) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(CloudMetaLocal cloudMetaLocal, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0000O0O o0000o0o2;
        o0000 o0000Var;
        Object objOooOO0o;
        if (abstractC32479OooO0OO instanceof o0000O0O) {
            o0000o0o2 = (o0000O0O) abstractC32479OooO0OO;
            int i = o0000o0o2.f97449OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o0o2.f97449OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o0000o0o2 = new o0000O0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = o0000o0o2.f97448OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0000o0o2.f97449OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            o0000o0o2.f97446OooOo0o = this;
            o0000o0o2.f97445OooOo = cloudMetaLocal;
            o0000o0o2.f97449OooOoOO = 1;
            objOooO0OO = OooO0OO(cloudMetaLocal, o0000o0o2);
            if (objOooO0OO != enumC32485OooO00o) {
                o0000Var = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0OO);
            objOooOO0o = ((C32445OooOOOO) objOooO0OO).f116639OooOo0o;
            boolean z = objOooOO0o instanceof C32445OooOOOO.OooO00o;
            if (!z) {
                return new OooO00o(new SyncPostAction.AcceptRemoteDelete((CloudMetaRemote) (z ? null : objOooOO0o)));
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ResolveRemoteNotFoundUseCase");
            c20358OooO00o.OooO0Oo(C32445OooOOOO.OooO00o(objOooOO0o), "UPSTREAM: ensureRemoteMetaDeleted failed", new Object[0]);
            return new OooO00o(SyncPostAction.None.INSTANCE);
        }
        cloudMetaLocal = o0000o0o2.f97445OooOo;
        o0000Var = o0000o0o2.f97446OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        boolean zBooleanValue = ((Boolean) objOooO0OO).booleanValue();
        if (!cloudMetaLocal.getDeleted()) {
            if (zBooleanValue) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("ResolveRemoteNotFoundUseCase");
                c20358OooO00o2.OooO00o("UPSTREAM: local exists, will push full content", new Object[0]);
                return new OooO00o(SyncPostAction.PushFull.INSTANCE);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ResolveRemoteNotFoundUseCase");
            c20358OooO00o3.OooOO0O("UPSTREAM: local missing but not deleted, noop", new Object[0]);
            return new OooO00o(SyncPostAction.None.INSTANCE);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("ResolveRemoteNotFoundUseCase");
        c20358OooO00o4.OooO00o("UPSTREAM: local deleted, ensure remote deleted", new Object[0]);
        InterfaceC27605OooO00o interfaceC27605OooO00o = o0000Var.f97351OooO00o;
        String id = cloudMetaLocal.getId();
        o0000o0o2.f97446OooOo0o = null;
        o0000o0o2.f97445OooOo = null;
        o0000o0o2.f97449OooOoOO = 2;
        objOooOO0o = interfaceC27605OooO00o.OooOO0o(id, o0000o0o2);
    }
}
