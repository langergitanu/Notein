package o0OOooO0;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import kotlin.coroutines.Continuation;
import o0OO000.C26453OooOoo0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$requestDeleteFile$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2255, 2266}, m80625m = "invokeSuspend")
public final class oo000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super CloudMetaRemoteEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f99127OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99128OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99129OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f99130OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99131OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f99132OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(int i, String str, String str2, Continuation continuation, AbstractC27907OooOo0O abstractC27907OooOo0O) {
        super(2, continuation);
        this.f99130OooOoO0 = i;
        this.f99129OooOoO = str;
        this.f99131OooOoOO = abstractC27907OooOo0O;
        this.f99132OooOoo0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        AbstractC27907OooOo0O abstractC27907OooOo0O = this.f99131OooOoOO;
        oo000o oo000oVar = new oo000o(this.f99130OooOoO0, this.f99129OooOoO, this.f99132OooOoo0, continuation, abstractC27907OooOo0O);
        oo000oVar.f99127OooOo = obj;
        return oo000oVar;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super CloudMetaRemoteEntity> continuation) {
        return ((oo000o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        if (r1 == r6) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooo0O0;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        Object objOooOOOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99128OooOo0o;
        String str = this.f99129OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str2 = (String) this.f99127OooOo;
            C26453OooOoo0 c26453OooOoo0 = new C26453OooOoo0(this.f99130OooOoO0, null, null, null, new Long(1L), null, 94);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "DriveCloudDS", "requestDeleteFile: Uploading meta-only for ", str), new Object[0]);
            this.f99128OooOo0o = 1;
            objOooo0O0 = AbstractC27907OooOo0O.Oooo0O0(this.f99131OooOoOO, str2, this.f99132OooOoo0, this.f99129OooOoO, c26453OooOoo0, this);
            if (objOooo0O0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) this.f99127OooOo;
            C32446OooOOOo.OooO0O0(obj);
            objOooOOOo = ((C32445OooOOOO) obj).f116639OooOo0o;
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOOo);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOO0o(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "DriveCloudDS", "Failed to upload Drive properties for meta-only upload: ", str), new Object[0]);
            }
            return cloudMetaRemoteEntity;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooo0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        C32446OooOOOo.OooO0O0(objOooo0O0);
        cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooo0O0;
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("DriveCloudDS");
        c20358OooO00o3.OooO0o0("requestDeleteFile: Meta-only upload completed for " + str + ", new version=" + cloudMetaRemoteEntity.getMetaVersion(), new Object[0]);
        if (!C33599OooOo0O.Oooo0o0(cloudMetaRemoteEntity.getDriveObjectKey())) {
            o00000 o00000Var = this.f99131OooOoOO.f98678OooO00o;
            String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
            this.f99127OooOo = cloudMetaRemoteEntity;
            this.f99128OooOo0o = 2;
            objOooOOOo = o00000Var.OooOOOo(driveObjectKey, this);
        }
        return cloudMetaRemoteEntity;
    }
}
