package o0OOooO0;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OO000.C26447OooOo0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oo0ooO.InterfaceC35021OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$requestPushContent$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_3, StyleIdentifier.GRID_TABLE_5_DARK, StyleIdentifier.GRID_TABLE_2_ACCENT_2, 301, 308, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
public final class o00oO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super CloudMetaRemoteEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public DriveSnapshotCacheEntity f99035OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f99036OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f99037OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99038OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ CloudBundle f99039OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f99040OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ CloudMetaRemoteEntity f99041OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f99042OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ int f99043OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ File f99044Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ CloudContentTag f99045Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99046Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ boolean f99047Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0O(CloudBundle cloudBundle, CloudMetaRemoteEntity cloudMetaRemoteEntity, String str, String str2, int i, CloudContentTag cloudContentTag, AbstractC27907OooOo0O abstractC27907OooOo0O, boolean z, File file, Continuation<? super o00oO0O> continuation) {
        super(2, continuation);
        this.f99039OooOoOO = cloudBundle;
        this.f99041OooOoo0 = cloudMetaRemoteEntity;
        this.f99040OooOoo = str;
        this.f99042OooOooO = str2;
        this.f99043OooOooo = i;
        this.f99045Oooo000 = cloudContentTag;
        this.f99046Oooo00O = abstractC27907OooOo0O;
        this.f99047Oooo00o = z;
        this.f99044Oooo0 = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00oO0O o00oo0o = new o00oO0O(this.f99039OooOoOO, this.f99041OooOoo0, this.f99040OooOoo, this.f99042OooOooO, this.f99043OooOooo, this.f99045Oooo000, this.f99046Oooo00O, this.f99047Oooo00o, this.f99044Oooo0, continuation);
        o00oo0o.f99037OooOoO = obj;
        return o00oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super CloudMetaRemoteEntity> continuation) {
        return ((o00oO0O) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0289  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String driveObjectKey;
        Object objOooo0;
        CloudMetaRemoteEntity meta;
        String str2;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        C32445OooOOOO c32445OooOOOO;
        String driveObjectKey2;
        Object objOoooo0o;
        DriveSnapshotCacheEntity driveSnapshotCacheEntity;
        Object objOooOOO0;
        Object obj2;
        String str3;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        DriveSnapshotCacheEntity driveSnapshotCacheEntity2;
        DriveSnapshotCacheEntity driveSnapshotCacheEntityCopy$default;
        DriveSnapshotCacheEntity driveSnapshotCacheEntity3;
        Object objOooO0OO;
        CloudMetaRemoteEntity cloudMetaRemoteEntity3;
        String str4;
        CloudMetaRemoteEntity cloudMetaRemoteEntity4;
        InterfaceC35021OooOOo interfaceC35021OooOOo;
        CloudMetaRemoteEntity cloudMetaRemoteEntity5;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99038OooOoO0;
        String str5 = this.f99040OooOoo;
        CloudMetaRemoteEntity cloudMetaRemoteEntity6 = this.f99041OooOoo0;
        AbstractC27907OooOo0O abstractC27907OooOo0O = this.f99046Oooo00O;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                str = (String) this.f99037OooOoO;
                CloudBundle cloudBundle = this.f99039OooOoOO;
                String mimeType = cloudBundle.getMimeType();
                String metaHash = cloudBundle.getMetaHash();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(metaHash);
                if (cloudMetaRemoteEntity6 == null || (driveObjectKey = cloudMetaRemoteEntity6.getDriveObjectKey()) == null) {
                    driveObjectKey = "";
                }
                String str6 = driveObjectKey;
                long jCurrentTimeMillis = System.currentTimeMillis();
                CloudMetaExtra extra = cloudBundle.getExtra();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(extra);
                CloudMetaRemoteEntity cloudMetaRemoteEntity7 = new CloudMetaRemoteEntity(this.f99040OooOoo, this.f99042OooOooO, mimeType, this.f99043OooOooo, metaHash, str6, jCurrentTimeMillis, this.f99045Oooo000, 0L, extra);
                this.f99037OooOoO = str;
                this.f99038OooOoO0 = 1;
                objOooo0 = AbstractC27907OooOo0O.Oooo0(abstractC27907OooOo0O, str, cloudMetaRemoteEntity7, this);
                if (objOooo0 != enumC32485OooO00o) {
                    C32446OooOOOo.OooO0O0(objOooo0);
                    meta = ((C26447OooOo0) objOooo0).getMeta();
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    c20358OooO00o.OooO0o0("Preupload completed for " + meta.getId() + ", cTag: " + meta.getContentTag(), new Object[0]);
                    if (cloudMetaRemoteEntity6 != null || (driveObjectKey2 = cloudMetaRemoteEntity6.getDriveObjectKey()) == null) {
                        str2 = str;
                        cloudMetaRemoteEntity = meta;
                        c32445OooOOOO = null;
                        if (c32445OooOOOO == null) {
                            Object obj3 = c32445OooOOOO.f116639OooOo0o;
                            if (obj3 instanceof C32445OooOOOO.OooO00o) {
                                obj3 = null;
                            }
                            driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) obj3;
                        } else {
                            driveSnapshotCacheEntity = null;
                        }
                        if (c32445OooOOOO == null && (!(c32445OooOOOO.f116639OooOo0o instanceof C32445OooOOOO.OooO00o)) && driveSnapshotCacheEntity != null && driveSnapshotCacheEntity.getCTag().matches(cloudMetaRemoteEntity.getContentTag()) && !this.f99047Oooo00o) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("DriveCloudDS");
                            c20358OooO00o2.OooO0o0(C20593OooO0Oo.OooO0O0("Skipping content upload for ", cloudMetaRemoteEntity.getId(), ", content is consistent"), new Object[0]);
                            cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                            driveSnapshotCacheEntity2 = driveSnapshotCacheEntity;
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("DriveCloudDS");
                            String id = driveSnapshotCacheEntity2.getId();
                            CloudContentTag cTag = driveSnapshotCacheEntity2.getCTag();
                            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Content upload completed for ", str5, ", ", id, ". ");
                            sbOooO0O0.append(cTag);
                            c20358OooO00o3.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                            driveSnapshotCacheEntityCopy$default = DriveSnapshotCacheEntity.copy$default(driveSnapshotCacheEntity2, null, this.f99042OooOooO, this.f99040OooOoo, null, null, null, 0L, 0L, 0L, false, 0L, 2041, null);
                            DriveSnapshotCacheEntity driveSnapshotCacheEntity4 = driveSnapshotCacheEntity2;
                            this.f99037OooOoO = str2;
                            this.f99036OooOo0o = cloudMetaRemoteEntity2;
                            this.f99035OooOo = driveSnapshotCacheEntity4;
                            this.f99038OooOoO0 = 4;
                            if (abstractC27907OooOo0O.f98683OooO0o0.OooO0o(new DriveSnapshotCacheEntity[]{driveSnapshotCacheEntityCopy$default}, this) != enumC32485OooO00o) {
                            }
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o4.OooOOO0("DriveCloudDS");
                            c20358OooO00o4.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Uploading content for ", cloudMetaRemoteEntity.getId()), new Object[0]);
                            String absolutePath = this.f99044Oooo0.getAbsolutePath();
                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                            o00000O o00000o = new o00000O(cloudMetaRemoteEntity, absolutePath);
                            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
                            this.f99037OooOoO = str2;
                            this.f99036OooOo0o = cloudMetaRemoteEntity;
                            this.f99038OooOoO0 = 3;
                            objOooOOO0 = o00000Var.OooOOO0(o00000o, this);
                            if (objOooOOO0 != enumC32485OooO00o) {
                                String str7 = str2;
                                obj2 = objOooOOO0;
                                str3 = str7;
                                C32446OooOOOo.OooO0O0(obj2);
                                DriveSnapshotCacheEntity driveSnapshotCacheEntity5 = (DriveSnapshotCacheEntity) obj2;
                                str2 = str3;
                                driveSnapshotCacheEntity2 = driveSnapshotCacheEntity5;
                                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o32.OooOOO0("DriveCloudDS");
                                String id2 = driveSnapshotCacheEntity2.getId();
                                CloudContentTag cTag2 = driveSnapshotCacheEntity2.getCTag();
                                StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Content upload completed for ", str5, ", ", id2, ". ");
                                sbOooO0O02.append(cTag2);
                                c20358OooO00o32.OooO0o0(sbOooO0O02.toString(), new Object[0]);
                                driveSnapshotCacheEntityCopy$default = DriveSnapshotCacheEntity.copy$default(driveSnapshotCacheEntity2, null, this.f99042OooOooO, this.f99040OooOoo, null, null, null, 0L, 0L, 0L, false, 0L, 2041, null);
                                DriveSnapshotCacheEntity driveSnapshotCacheEntity42 = driveSnapshotCacheEntity2;
                                this.f99037OooOoO = str2;
                                this.f99036OooOo0o = cloudMetaRemoteEntity2;
                                this.f99035OooOo = driveSnapshotCacheEntity42;
                                this.f99038OooOoO0 = 4;
                                if (abstractC27907OooOo0O.f98683OooO0o0.OooO0o(new DriveSnapshotCacheEntity[]{driveSnapshotCacheEntityCopy$default}, this) != enumC32485OooO00o) {
                                    driveSnapshotCacheEntity3 = driveSnapshotCacheEntity42;
                                    CloudMetaRemoteEntity cloudMetaRemoteEntity8 = cloudMetaRemoteEntity2;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o5.OooOOO0("DriveCloudDS");
                                    c20358OooO00o5.OooO0o0(C22237OooO0o0.OooO00o("DriveSnapshot cached for ", str5, ", driveObjectKey=", driveSnapshotCacheEntity3.getId()), new Object[0]);
                                    String driveObjectKey3 = cloudMetaRemoteEntity6 == null ? cloudMetaRemoteEntity6.getDriveObjectKey() : null;
                                    String id3 = driveSnapshotCacheEntity3.getId();
                                    this.f99037OooOoO = cloudMetaRemoteEntity8;
                                    this.f99036OooOo0o = driveObjectKey3;
                                    this.f99035OooOo = null;
                                    this.f99038OooOoO0 = 5;
                                    objOooO0OO = AbstractC27907OooOo0O.OooO0OO(this.f99046Oooo00O, str2, this.f99042OooOooO, this.f99040OooOoo, this.f99043OooOooo, id3, this);
                                    if (objOooO0OO != enumC32485OooO00o) {
                                        cloudMetaRemoteEntity3 = cloudMetaRemoteEntity8;
                                        str4 = driveObjectKey3;
                                        C32446OooOOOo.OooO0O0(objOooO0OO);
                                        cloudMetaRemoteEntity4 = (CloudMetaRemoteEntity) objOooO0OO;
                                        if (str4 != null && !C33599OooOo0O.Oooo0o0(str4) && !str4.equals(cloudMetaRemoteEntity4.getDriveObjectKey())) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o6.OooOOO0("DriveCloudDS");
                                            c20358OooO00o6.OooO0o0(C22237OooO0o0.OooO00o("Cleaning up old driveSnapshot: ", str4, " -> ", cloudMetaRemoteEntity4.getDriveObjectKey()), new Object[0]);
                                            interfaceC35021OooOOo = abstractC27907OooOo0O.f98683OooO0o0;
                                            this.f99037OooOoO = cloudMetaRemoteEntity3;
                                            this.f99036OooOo0o = cloudMetaRemoteEntity4;
                                            this.f99038OooOoO0 = 6;
                                            if (interfaceC35021OooOOo.OooO00o(str4, this.f99042OooOooO, this) != enumC32485OooO00o) {
                                                cloudMetaRemoteEntity5 = cloudMetaRemoteEntity4;
                                                cloudMetaRemoteEntity4 = cloudMetaRemoteEntity5;
                                            }
                                        }
                                        C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o7.OooOOO0("DriveCloudDS");
                                        String id4 = cloudMetaRemoteEntity3.getId();
                                        int metaVersion = cloudMetaRemoteEntity4.getMetaVersion();
                                        String driveObjectKey4 = cloudMetaRemoteEntity4.getDriveObjectKey();
                                        CloudContentTag contentTag = cloudMetaRemoteEntity4.getContentTag();
                                        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(metaVersion, "Content commit completed for ", id4, ", new version=", ", driveObjectKey=");
                                        sbOooO0OO.append(driveObjectKey4);
                                        sbOooO0OO.append(", cTag=");
                                        sbOooO0OO.append(contentTag);
                                        c20358OooO00o7.OooO0o0(sbOooO0OO.toString(), new Object[0]);
                                        return cloudMetaRemoteEntity4;
                                    }
                                }
                            }
                        }
                    } else {
                        this.f99037OooOoO = str;
                        this.f99036OooOo0o = meta;
                        this.f99038OooOoO0 = 2;
                        objOoooo0o = abstractC27907OooOo0O.Ooooo0o(driveObjectKey2, this);
                        if (objOoooo0o != enumC32485OooO00o) {
                            str2 = str;
                            cloudMetaRemoteEntity = meta;
                            c32445OooOOOO = new C32445OooOOOO(objOoooo0o);
                            if (c32445OooOOOO == null) {
                            }
                            if (c32445OooOOOO == null) {
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o42.OooOOO0("DriveCloudDS");
                            c20358OooO00o42.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Uploading content for ", cloudMetaRemoteEntity.getId()), new Object[0]);
                            String absolutePath2 = this.f99044Oooo0.getAbsolutePath();
                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                            o00000O o00000o2 = new o00000O(cloudMetaRemoteEntity, absolutePath2);
                            o00000 o00000Var2 = abstractC27907OooOo0O.f98678OooO00o;
                            this.f99037OooOoO = str2;
                            this.f99036OooOo0o = cloudMetaRemoteEntity;
                            this.f99038OooOoO0 = 3;
                            objOooOOO0 = o00000Var2.OooOOO0(o00000o2, this);
                            if (objOooOOO0 != enumC32485OooO00o) {
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                str = (String) this.f99037OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                meta = ((C26447OooOo0) objOooo0).getMeta();
                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o8.OooOOO0("DriveCloudDS");
                c20358OooO00o8.OooO0o0("Preupload completed for " + meta.getId() + ", cTag: " + meta.getContentTag(), new Object[0]);
                if (cloudMetaRemoteEntity6 != null) {
                    break;
                }
                str2 = str;
                cloudMetaRemoteEntity = meta;
                c32445OooOOOO = null;
                if (c32445OooOOOO == null) {
                }
                if (c32445OooOOOO == null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o422 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o422.OooOOO0("DriveCloudDS");
                c20358OooO00o422.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Uploading content for ", cloudMetaRemoteEntity.getId()), new Object[0]);
                String absolutePath22 = this.f99044Oooo0.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath22, "getAbsolutePath(...)");
                o00000O o00000o22 = new o00000O(cloudMetaRemoteEntity, absolutePath22);
                o00000 o00000Var22 = abstractC27907OooOo0O.f98678OooO00o;
                this.f99037OooOoO = str2;
                this.f99036OooOo0o = cloudMetaRemoteEntity;
                this.f99038OooOoO0 = 3;
                objOooOOO0 = o00000Var22.OooOOO0(o00000o22, this);
                if (objOooOOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) this.f99036OooOo0o;
                str2 = (String) this.f99037OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOoooo0o = ((C32445OooOOOO) obj).f116639OooOo0o;
                c32445OooOOOO = new C32445OooOOOO(objOoooo0o);
                if (c32445OooOOOO == null) {
                }
                if (c32445OooOOOO == null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o4222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4222.OooOOO0("DriveCloudDS");
                c20358OooO00o4222.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Uploading content for ", cloudMetaRemoteEntity.getId()), new Object[0]);
                String absolutePath222 = this.f99044Oooo0.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath222, "getAbsolutePath(...)");
                o00000O o00000o222 = new o00000O(cloudMetaRemoteEntity, absolutePath222);
                o00000 o00000Var222 = abstractC27907OooOo0O.f98678OooO00o;
                this.f99037OooOoO = str2;
                this.f99036OooOo0o = cloudMetaRemoteEntity;
                this.f99038OooOoO0 = 3;
                objOooOOO0 = o00000Var222.OooOOO0(o00000o222, this);
                if (objOooOOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) this.f99036OooOo0o;
                str3 = (String) this.f99037OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                obj2 = ((C32445OooOOOO) obj).f116639OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                DriveSnapshotCacheEntity driveSnapshotCacheEntity52 = (DriveSnapshotCacheEntity) obj2;
                str2 = str3;
                driveSnapshotCacheEntity2 = driveSnapshotCacheEntity52;
                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o322.OooOOO0("DriveCloudDS");
                String id22 = driveSnapshotCacheEntity2.getId();
                CloudContentTag cTag22 = driveSnapshotCacheEntity2.getCTag();
                StringBuilder sbOooO0O022 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Content upload completed for ", str5, ", ", id22, ". ");
                sbOooO0O022.append(cTag22);
                c20358OooO00o322.OooO0o0(sbOooO0O022.toString(), new Object[0]);
                driveSnapshotCacheEntityCopy$default = DriveSnapshotCacheEntity.copy$default(driveSnapshotCacheEntity2, null, this.f99042OooOooO, this.f99040OooOoo, null, null, null, 0L, 0L, 0L, false, 0L, 2041, null);
                DriveSnapshotCacheEntity driveSnapshotCacheEntity422 = driveSnapshotCacheEntity2;
                this.f99037OooOoO = str2;
                this.f99036OooOo0o = cloudMetaRemoteEntity2;
                this.f99035OooOo = driveSnapshotCacheEntity422;
                this.f99038OooOoO0 = 4;
                if (abstractC27907OooOo0O.f98683OooO0o0.OooO0o(new DriveSnapshotCacheEntity[]{driveSnapshotCacheEntityCopy$default}, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                driveSnapshotCacheEntity3 = this.f99035OooOo;
                cloudMetaRemoteEntity2 = (CloudMetaRemoteEntity) this.f99036OooOo0o;
                str2 = (String) this.f99037OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                CloudMetaRemoteEntity cloudMetaRemoteEntity82 = cloudMetaRemoteEntity2;
                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o52.OooOOO0("DriveCloudDS");
                c20358OooO00o52.OooO0o0(C22237OooO0o0.OooO00o("DriveSnapshot cached for ", str5, ", driveObjectKey=", driveSnapshotCacheEntity3.getId()), new Object[0]);
                if (cloudMetaRemoteEntity6 == null) {
                }
                String id32 = driveSnapshotCacheEntity3.getId();
                this.f99037OooOoO = cloudMetaRemoteEntity82;
                this.f99036OooOo0o = driveObjectKey3;
                this.f99035OooOo = null;
                this.f99038OooOoO0 = 5;
                objOooO0OO = AbstractC27907OooOo0O.OooO0OO(this.f99046Oooo00O, str2, this.f99042OooOooO, this.f99040OooOoo, this.f99043OooOooo, id32, this);
                if (objOooO0OO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                str4 = (String) this.f99036OooOo0o;
                cloudMetaRemoteEntity3 = (CloudMetaRemoteEntity) this.f99037OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0OO = ((C32445OooOOOO) obj).f116639OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
                cloudMetaRemoteEntity4 = (CloudMetaRemoteEntity) objOooO0OO;
                if (str4 != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o62.OooOOO0("DriveCloudDS");
                    c20358OooO00o62.OooO0o0(C22237OooO0o0.OooO00o("Cleaning up old driveSnapshot: ", str4, " -> ", cloudMetaRemoteEntity4.getDriveObjectKey()), new Object[0]);
                    interfaceC35021OooOOo = abstractC27907OooOo0O.f98683OooO0o0;
                    this.f99037OooOoO = cloudMetaRemoteEntity3;
                    this.f99036OooOo0o = cloudMetaRemoteEntity4;
                    this.f99038OooOoO0 = 6;
                    if (interfaceC35021OooOOo.OooO00o(str4, this.f99042OooOooO, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o72 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o72.OooOOO0("DriveCloudDS");
                String id42 = cloudMetaRemoteEntity3.getId();
                int metaVersion2 = cloudMetaRemoteEntity4.getMetaVersion();
                String driveObjectKey42 = cloudMetaRemoteEntity4.getDriveObjectKey();
                CloudContentTag contentTag2 = cloudMetaRemoteEntity4.getContentTag();
                StringBuilder sbOooO0OO2 = C20485OooOoO.OooO0OO(metaVersion2, "Content commit completed for ", id42, ", new version=", ", driveObjectKey=");
                sbOooO0OO2.append(driveObjectKey42);
                sbOooO0OO2.append(", cTag=");
                sbOooO0OO2.append(contentTag2);
                c20358OooO00o72.OooO0o0(sbOooO0OO2.toString(), new Object[0]);
                return cloudMetaRemoteEntity4;
            case 6:
                cloudMetaRemoteEntity5 = (CloudMetaRemoteEntity) this.f99036OooOo0o;
                cloudMetaRemoteEntity3 = (CloudMetaRemoteEntity) this.f99037OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                cloudMetaRemoteEntity4 = cloudMetaRemoteEntity5;
                C34406OooO00o.C20358OooO00o c20358OooO00o722 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o722.OooOOO0("DriveCloudDS");
                String id422 = cloudMetaRemoteEntity3.getId();
                int metaVersion22 = cloudMetaRemoteEntity4.getMetaVersion();
                String driveObjectKey422 = cloudMetaRemoteEntity4.getDriveObjectKey();
                CloudContentTag contentTag22 = cloudMetaRemoteEntity4.getContentTag();
                StringBuilder sbOooO0OO22 = C20485OooOoO.OooO0OO(metaVersion22, "Content commit completed for ", id422, ", new version=", ", driveObjectKey=");
                sbOooO0OO22.append(driveObjectKey422);
                sbOooO0OO22.append(", cTag=");
                sbOooO0OO22.append(contentTag22);
                c20358OooO00o722.OooO0o0(sbOooO0OO22.toString(), new Object[0]);
                return cloudMetaRemoteEntity4;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
