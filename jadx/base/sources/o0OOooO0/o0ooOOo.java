package o0OOooO0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import kotlin.coroutines.Continuation;
import o0OO000.C26453OooOoo0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$requestPushMetaOnly$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_5, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
public final class o0ooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super CloudMetaRemoteEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f99115OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99116OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CloudMetaLocalEntity f99117OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ CloudBundle f99118OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f99119OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f99120OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f99121OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99122OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f99123OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(CloudBundle cloudBundle, CloudMetaLocalEntity cloudMetaLocalEntity, int i, String str, String str2, AbstractC27907OooOo0O abstractC27907OooOo0O, String str3, Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
        this.f99118OooOoO0 = cloudBundle;
        this.f99117OooOoO = cloudMetaLocalEntity;
        this.f99119OooOoOO = i;
        this.f99121OooOoo0 = str;
        this.f99120OooOoo = str2;
        this.f99122OooOooO = abstractC27907OooOo0O;
        this.f99123OooOooo = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0ooOOo o0ooooo2 = new o0ooOOo(this.f99118OooOoO0, this.f99117OooOoO, this.f99119OooOoOO, this.f99121OooOoo0, this.f99120OooOoo, this.f99122OooOooO, this.f99123OooOooo, continuation);
        o0ooooo2.f99115OooOo = obj;
        return o0ooooo2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super CloudMetaRemoteEntity> continuation) {
        return ((o0ooOOo) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r1 == r6) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        String str2;
        Object objOooo0O0;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        Object objOooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f99116OooOo0o;
        String str3 = this.f99121OooOoo0;
        String str4 = this.f99120OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str5 = (String) this.f99115OooOo;
            CloudBundle cloudBundle = this.f99118OooOoO0;
            String mimeType = cloudBundle.getMimeType();
            C26453OooOoo0 c26453OooOoo0 = new C26453OooOoo0(this.f99119OooOoOO, cloudBundle.getMetaHash(), mimeType, str3, new Long(this.f99117OooOoO.getDeletedRemote() ? 1L : 0L), cloudBundle.getExtra(), 8);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "DriveCloudDS", "requestPushMetaOnly: Uploading meta-only for ", str4), new Object[0]);
            this.f99116OooOo0o = 1;
            str = str4;
            i = 0;
            str2 = "DriveCloudDS";
            objOooo0O0 = AbstractC27907OooOo0O.Oooo0O0(this.f99122OooOooO, str5, this.f99123OooOooo, this.f99120OooOoo, c26453OooOoo0, this);
            if (objOooo0O0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) this.f99115OooOo;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0oO = ((C32445OooOOOO) obj).f116639OooOo0o;
            i = 0;
            str = str4;
            str2 = "DriveCloudDS";
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0oO);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOO0o(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o2, str2, "Failed to upload Drive properties for meta-only upload: ", str), new Object[i]);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(str2);
            c20358OooO00o3.OooO0o0("Meta-only upload completed for " + str + ", new version=" + cloudMetaRemoteEntity.getMetaVersion(), new Object[i]);
            return cloudMetaRemoteEntity;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooo0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        i = 0;
        str = str4;
        str2 = "DriveCloudDS";
        C32446OooOOOo.OooO0O0(objOooo0O0);
        cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooo0O0;
        o00000 o00000Var = this.f99122OooOooO.f98678OooO00o;
        this.f99115OooOo = cloudMetaRemoteEntity;
        this.f99116OooOo0o = 2;
        objOooO0oO = o00000Var.OooO0oO(str3, cloudMetaRemoteEntity, this);
    }
}
