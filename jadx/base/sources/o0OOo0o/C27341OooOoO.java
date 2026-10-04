package o0OOo0o;

import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase", m80623f = "BackupUseCase.kt", m80624l = {523, 530, 538}, m80625m = "getRemoteBackupFiles")
public final class C27341OooOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f95185OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f95186OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f95187OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List f95188OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95189OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f95190OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27341OooOoO(C27351Oooo0O0 c27351Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95189OooOoOO = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95187OooOoO = obj;
        this.f95190OooOoo0 |= Integer.MIN_VALUE;
        return C27351Oooo0O0.OooOO0O(this.f95189OooOoOO, null, this);
    }
}
