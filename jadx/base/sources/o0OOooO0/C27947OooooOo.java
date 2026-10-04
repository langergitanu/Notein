package o0OOooO0;

import com.aspose.words.EditingLanguage;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import kotlin.coroutines.Continuation;
import o0OO000.C26445OooOOo0;
import o0OO000.C26452OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOooO0.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$migrateHistoricalMeta$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {EditingLanguage.PORTUGUESE_PORTUGAL, 2075, 2078}, m80625m = "invokeSuspend")
public final class C27947OooooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super CloudMetaRemoteEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98930OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98931OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CloudMetaRemoteEntity f98932OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98933OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98934OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27947OooooOo(AbstractC27907OooOo0O abstractC27907OooOo0O, CloudMetaRemoteEntity cloudMetaRemoteEntity, String str, Continuation<? super C27947OooooOo> continuation) {
        super(2, continuation);
        this.f98933OooOoO0 = abstractC27907OooOo0O;
        this.f98932OooOoO = cloudMetaRemoteEntity;
        this.f98934OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27947OooooOo c27947OooooOo = new C27947OooooOo(this.f98933OooOoO0, this.f98932OooOoO, this.f98934OooOoOO, continuation);
        c27947OooooOo.f98930OooOo = obj;
        return c27947OooooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super CloudMetaRemoteEntity> continuation) {
        return ((C27947OooooOo) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws o0OO000.OooOO0 {
        Object objOooO0o;
        Object objOooO0o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98931OooOo0o;
        AbstractC27907OooOo0O abstractC27907OooOo0O = this.f98933OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = (String) this.f98930OooOo;
            o00Ooo.OooOOO oooOOO = abstractC27907OooOo0O.f98686OooOO0;
            CloudMetaRemoteEntity cloudMetaRemoteEntity = this.f98932OooOoO;
            C26445OooOOo0 c26445OooOOo0 = new C26445OooOOo0(cloudMetaRemoteEntity.getMetaVersion(), cloudMetaRemoteEntity.getMetaHash(), cloudMetaRemoteEntity.getMimeType(), cloudMetaRemoteEntity.getContentTag(), cloudMetaRemoteEntity.getDriveObjectKey(), Long.valueOf(cloudMetaRemoteEntity.getDeleted()), cloudMetaRemoteEntity.getExtra());
            String driveId = cloudMetaRemoteEntity.getDriveId();
            String id = cloudMetaRemoteEntity.getId();
            this.f98931OooOo0o = 1;
            objOooO0o = abstractC27907OooOo0O.f98682OooO0o.OooO0o(driveId, id, str, c26445OooOOo0, this);
            if (objOooO0o != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CloudMetaRemoteEntity cloudMetaRemoteEntity2 = (CloudMetaRemoteEntity) this.f98930OooOo;
                C32446OooOOOo.OooO0O0(obj);
                return cloudMetaRemoteEntity2;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o2 = obj;
            CloudMetaRemoteEntity meta = ((C26452OooOoOO) objOooO0o2).getMeta();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            int metaVersion = meta.getMetaVersion();
            CloudContentTag contentTag = meta.getContentTag();
            CloudMetaExtra extra = meta.getExtra();
            StringBuilder sb = new StringBuilder("migrateHistoricalMeta: migrated meta for ");
            OooOO0.OooO0O0.OooO0Oo(metaVersion, this.f98934OooOoOO, ", new version=", ", cTag=", sb);
            sb.append(contentTag);
            sb.append(", extra=");
            sb.append(extra);
            c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
            this.f98930OooOo = meta;
            this.f98931OooOo0o = 3;
            return abstractC27907OooOo0O.o000000O(meta, this) != enumC32485OooO00o ? enumC32485OooO00o : meta;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        this.f98931OooOo0o = 2;
        objOooO0o2 = C33074OooOoO.OooO0o((C35238OooOoO) objOooO0o, "updateMeta");
        if (objOooO0o2 != enumC32485OooO00o) {
            CloudMetaRemoteEntity meta2 = ((C26452OooOoOO) objOooO0o2).getMeta();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            int metaVersion2 = meta2.getMetaVersion();
            CloudContentTag contentTag2 = meta2.getContentTag();
            CloudMetaExtra extra2 = meta2.getExtra();
            StringBuilder sb2 = new StringBuilder("migrateHistoricalMeta: migrated meta for ");
            OooOO0.OooO0O0.OooO0Oo(metaVersion2, this.f98934OooOoOO, ", new version=", ", cTag=", sb2);
            sb2.append(contentTag2);
            sb2.append(", extra=");
            sb2.append(extra2);
            c20358OooO00o2.OooO0o0(sb2.toString(), new Object[0]);
            this.f98930OooOo = meta2;
            this.f98931OooOo0o = 3;
            if (abstractC27907OooOo0O.o000000O(meta2, this) != enumC32485OooO00o) {
            }
        }
    }
}
