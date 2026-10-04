package o0Oo0OoO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.TextBoxBackupTask", m80623f = "TextBoxBackupTask.kt", m80624l = {87}, m80625m = RequestParameters.X_OSS_RESTORE)
public final class C28133Oooo00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28130Oooo0 f99740OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99741OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99742OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28133Oooo00o(C28130Oooo0 c28130Oooo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99740OooOo = c28130Oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99741OooOo0o = obj;
        this.f99742OooOoO0 |= Integer.MIN_VALUE;
        return this.f99740OooOo.o00000Oo(null, null, null, this);
    }
}
