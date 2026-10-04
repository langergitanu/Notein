package o0Oo0OoO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.PageLayerBackupTask", m80623f = "PageLayerBackupTask.kt", m80624l = {58}, m80625m = RequestParameters.X_OSS_RESTORE)
public final class C28118OooOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28124OooOoO0 f99676OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99677OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99678OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28118OooOo(C28124OooOoO0 c28124OooOoO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99676OooOo = c28124OooOoO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99677OooOo0o = obj;
        this.f99678OooOoO0 |= Integer.MIN_VALUE;
        return this.f99676OooOo.o00000Oo(null, null, null, this);
    }
}
