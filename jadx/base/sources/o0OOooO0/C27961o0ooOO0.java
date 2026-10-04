package o0OOooO0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_1, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3}, m80625m = "requestPushMetaOnly-BWLJW6A$suspendImpl")
public final class C27961o0ooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f99105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f99106OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f99107OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudBundle f99108OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public CloudMetaLocalEntity f99109OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f99110OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f99111OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f99112OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99113OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f99114Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27961o0ooOO0(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99113OooOooo = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99112OooOooO = obj;
        this.f99114Oooo000 |= Integer.MIN_VALUE;
        Object objOo0o0Oo = AbstractC27907OooOo0O.oo0o0Oo(this.f99113OooOooo, null, null, false, this);
        return objOo0o0Oo == EnumC32485OooO00o.f116726OooOo0o ? objOo0o0Oo : new C32445OooOOOO(objOo0o0Oo);
    }
}
