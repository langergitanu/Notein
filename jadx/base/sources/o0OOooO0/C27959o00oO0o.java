package o0OOooO0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import java.io.File;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {239, 242, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6}, m80625m = "requestPushContent-BWLJW6A$suspendImpl")
public final class C27959o00oO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f99048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f99049OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f99050OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudBundle f99051OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public File f99052OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f99053OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public CloudContentTag f99054OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f99055OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Object f99056OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99057Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f99058Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27959o00oO0o(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99057Oooo000 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99056OooOooo = obj;
        this.f99058Oooo00O |= Integer.MIN_VALUE;
        Object objO0OO00O = AbstractC27907OooOo0O.o0OO00O(this.f99057Oooo000, null, null, false, this);
        return objO0OO00O == EnumC32485OooO00o.f116726OooOo0o ? objO0OO00O : new C32445OooOOOO(objO0OO00O);
    }
}
