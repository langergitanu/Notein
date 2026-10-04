package o0OOoO0;

import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteMeta;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.migration.MigrationMetaBuilder", m80623f = "MigrationMetaBuilder.kt", m80624l = {34}, m80625m = "build")
public final class C27717OooO0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteFile f97765OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudMetaRemote f97766OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NoteMeta f97767OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f97768OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f97769OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f97770OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f97771OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27718OooO0oo f97772OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f97773OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27717OooO0oO(C27718OooO0oo c27718OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97772OooOooO = c27718OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97770OooOoo = obj;
        this.f97773OooOooo |= Integer.MIN_VALUE;
        return this.f97772OooOooO.OooO00o(null, null, null, null, this);
    }
}
