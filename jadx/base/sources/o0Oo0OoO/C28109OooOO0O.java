package o0Oo0OoO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.HyperLinkBackupTask", m80623f = "HyperLinkBackupTask.kt", m80624l = {75}, m80625m = RequestParameters.X_OSS_RESTORE)
public final class C28109OooOO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28110OooOO0o f99625OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99626OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99627OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28109OooOO0O(C28110OooOO0o c28110OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99625OooOo = c28110OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99626OooOo0o = obj;
        this.f99627OooOoO0 |= Integer.MIN_VALUE;
        return this.f99625OooOo.o00000Oo(null, null, null, this);
    }
}
