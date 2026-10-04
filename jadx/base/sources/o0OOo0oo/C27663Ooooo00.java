package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import java.util.Iterator;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.LegacyCloudSyncMigrationUseCase", m80623f = "LegacyCloudSyncMigrationUseCase.kt", m80624l = {93, 94, 97, 100, 115, 119, 124, 127, 141, 142, 151, 158, 164, 169, 171, 176, 185, 186}, m80625m = "doMigration")
public final class C27663Ooooo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97282OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97283OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f97284OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f97285OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C24033OooOooo f97286OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Iterator f97287OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f97288OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public CloudMetaRemote f97289OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Object f97290OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C27665OooooO0 f97291Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f97292Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27663Ooooo00(C27665OooooO0 c27665OooooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97291Oooo000 = c27665OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97290OooOooo = obj;
        this.f97292Oooo00O |= Integer.MIN_VALUE;
        return this.f97291Oooo000.OooO0O0(null, null, this);
    }
}
