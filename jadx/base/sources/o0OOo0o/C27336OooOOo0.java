package o0OOo0o;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase", m80623f = "BackupUseCase.kt", m80624l = {659}, m80625m = "backupTemplate")
public final class C27336OooOOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public MyTemplate f95141OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27351Oooo0O0 f95142OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f95143OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f95144OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f95145OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f95146OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95147OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27336OooOOo0(C27351Oooo0O0 c27351Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95147OooOoo0 = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95145OooOoOO = obj;
        this.f95146OooOoo |= Integer.MIN_VALUE;
        return C27351Oooo0O0.OooO0OO(this.f95147OooOoo0, null, null, this);
    }
}
