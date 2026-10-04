package o0OOooO0;

import com.aspose.words.EditingLanguage;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {EditingLanguage.TAMAZIGHT_LATIN, 2148, 2150}, m80625m = "commitCloudMetaLocked-hUnOzRk")
public final class C27921OooOooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98791OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98792OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f98793OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98794OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27921OooOooo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98794OooOoO0 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98791OooOo = obj;
        this.f98793OooOoO |= Integer.MIN_VALUE;
        Object objOooO0OO = AbstractC27907OooOo0O.OooO0OO(this.f98794OooOoO0, null, null, null, 0, null, this);
        return objOooO0OO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0OO : new C32445OooOOOO(objOooO0OO);
    }
}
