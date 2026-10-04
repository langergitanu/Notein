package o0OOooO0;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOooO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource$ensureCloudMetaRemoteDeleted$2$updateDeleted$2", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {674}, m80625m = "invokeSuspend")
public final class C27927Oooo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super CloudMetaRemoteEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98821OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98822OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f98823OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98824OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98825OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f98826OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27927Oooo0O0(int i, String str, String str2, Continuation continuation, AbstractC27907OooOo0O abstractC27907OooOo0O) {
        super(2, continuation);
        this.f98824OooOoO0 = abstractC27907OooOo0O;
        this.f98823OooOoO = i;
        this.f98825OooOoOO = str;
        this.f98826OooOoo0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27927Oooo0O0 c27927Oooo0O0 = new C27927Oooo0O0(this.f98823OooOoO, this.f98825OooOoOO, this.f98826OooOoo0, continuation, this.f98824OooOoO0);
        c27927Oooo0O0.f98821OooOo = obj;
        return c27927Oooo0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super CloudMetaRemoteEntity> continuation) {
        return ((C27927Oooo0O0) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98822OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = (String) this.f98821OooOo;
            AbstractC27907OooOo0O abstractC27907OooOo0O = this.f98824OooOoO0;
            o00Ooo.OooOOO oooOOO = abstractC27907OooOo0O.f98686OooOO0;
            o0OO000.OooOOO0 oooOOO0 = new o0OO000.OooOOO0(this.f98823OooOoO);
            this.f98822OooOo0o = 1;
            objOooo00o = AbstractC27907OooOo0O.Oooo00o(abstractC27907OooOo0O, str, this.f98825OooOoOO, this.f98826OooOoo0, oooOOO0, this);
            if (objOooo00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooo00o = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(objOooo00o);
        return objOooo00o;
    }
}
