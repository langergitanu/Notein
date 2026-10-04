package o0oOoo00;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0oOoo00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel", m80623f = "CloudBackupViewModel.kt", m80624l = {515}, m80625m = "checkCloudBackupWorkInternal")
public final class C31133OooOOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f111091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.backup.OooO00o f111092OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f111093OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f111094OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31133OooOOoo(com.orion.notein.p607ui.backup.OooO00o oooO00o, Continuation<? super C31133OooOOoo> continuation) {
        super(continuation);
        this.f111094OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f111091OooOo = obj;
        this.f111093OooOoO |= Integer.MIN_VALUE;
        return com.orion.notein.p607ui.backup.OooO00o.OooO0o(this.f111094OooOoO0, null, this);
    }
}
