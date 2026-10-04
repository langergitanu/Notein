package o0OOooO0;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import kotlin.coroutines.Continuation;
import o0OO000.C26448OooOo0O;
import o0OO000.C26449OooOo0o;
import o0OO000.InterfaceC26441OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOooO0.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$reconcileContent$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2030, 2033, 2037}, m80625m = "invokeSuspend")
public final class C27958o00o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super CloudMetaRemoteEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f99028OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99029OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99030OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99031OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ DriveSnapshotCacheEntity f99032OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99033OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f99034OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27958o00o0O(String str, String str2, DriveSnapshotCacheEntity driveSnapshotCacheEntity, int i, AbstractC27907OooOo0O abstractC27907OooOo0O, Continuation<? super C27958o00o0O> continuation) {
        super(2, continuation);
        this.f99031OooOoO0 = str;
        this.f99030OooOoO = str2;
        this.f99032OooOoOO = driveSnapshotCacheEntity;
        this.f99034OooOoo0 = i;
        this.f99033OooOoo = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27958o00o0O c27958o00o0O = new C27958o00o0O(this.f99031OooOoO0, this.f99030OooOoO, this.f99032OooOoOO, this.f99034OooOoo0, this.f99033OooOoo, continuation);
        c27958o00o0O.f99028OooOo = obj;
        return c27958o00o0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super CloudMetaRemoteEntity> continuation) {
        return ((C27958o00o0O) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws o0OO000.OooOO0 {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99029OooOo0o;
        AbstractC27907OooOo0O abstractC27907OooOo0O = this.f99033OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = (String) this.f99028OooOo;
            DriveSnapshotCacheEntity driveSnapshotCacheEntity = this.f99032OooOoOO;
            C26448OooOo0O c26448OooOo0O = new C26448OooOo0O(this.f99031OooOoO0, this.f99030OooOoO, driveSnapshotCacheEntity.getCTag(), driveSnapshotCacheEntity.getId(), this.f99034OooOoo0);
            InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
            this.f99029OooOo0o = 1;
            obj = interfaceC26441OooO0oo.OooO0OO(str, c26448OooOo0O, this);
            if (obj != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) this.f99028OooOo;
                C32446OooOOOo.OooO0O0(obj);
                return cloudMetaRemoteEntity;
            }
            C32446OooOOOo.OooO0O0(obj);
            CloudMetaRemoteEntity meta = ((C26449OooOo0o) obj).getMeta();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            int metaVersion = meta.getMetaVersion();
            CloudContentTag contentTag = meta.getContentTag();
            StringBuilder sb = new StringBuilder("reconcileContent: reconciled content for ");
            OooOO0.OooO0O0.OooO0Oo(metaVersion, this.f99031OooOoO0, ", new version=", ", cTag=", sb);
            sb.append(contentTag);
            c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
            this.f99028OooOo = meta;
            this.f99029OooOo0o = 3;
            return abstractC27907OooOo0O.o000000O(meta, this) != enumC32485OooO00o ? enumC32485OooO00o : meta;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f99029OooOo0o = 2;
        obj = C33074OooOoO.OooO0o((C35238OooOoO) obj, "reconcileContent");
        if (obj != enumC32485OooO00o) {
            CloudMetaRemoteEntity meta2 = ((C26449OooOo0o) obj).getMeta();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            int metaVersion2 = meta2.getMetaVersion();
            CloudContentTag contentTag2 = meta2.getContentTag();
            StringBuilder sb2 = new StringBuilder("reconcileContent: reconciled content for ");
            OooOO0.OooO0O0.OooO0Oo(metaVersion2, this.f99031OooOoO0, ", new version=", ", cTag=", sb2);
            sb2.append(contentTag2);
            c20358OooO00o2.OooO0o0(sb2.toString(), new Object[0]);
            this.f99028OooOo = meta2;
            this.f99029OooOo0o = 3;
            if (abstractC27907OooOo0O.o000000O(meta2, this) != enumC32485OooO00o) {
            }
        }
    }
}
