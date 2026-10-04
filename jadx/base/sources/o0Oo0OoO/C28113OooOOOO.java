package o0Oo0OoO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.MyTemplateBackupTask", m80623f = "MyTemplateBackupTask.kt", m80624l = {107}, m80625m = RequestParameters.X_OSS_RESTORE)
public final class C28113OooOOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28114OooOOOo f99647OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99648OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99649OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28113OooOOOO(C28114OooOOOo c28114OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99647OooOo = c28114OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99648OooOo0o = obj;
        this.f99649OooOoO0 |= Integer.MIN_VALUE;
        return this.f99647OooOo.o00000Oo(null, this);
    }
}
