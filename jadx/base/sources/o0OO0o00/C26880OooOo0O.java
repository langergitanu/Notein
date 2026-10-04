package o0OO0o00;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0OO0o00.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService", m80623f = "HuaweiCloudService.kt", m80624l = {438}, m80625m = "requireDrive")
public final class C26880OooOo0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C33898OooO0Oo f93233OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f93234OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93235OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f93236OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93237OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26880OooOo0O(OooO00o oooO00o, Continuation<? super C26880OooOo0O> continuation) {
        super(continuation);
        this.f93235OooOoO = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93236OooOoO0 = obj;
        this.f93237OooOoOO |= Integer.MIN_VALUE;
        return OooO00o.OooO00o(this.f93235OooOoO, this);
    }
}
