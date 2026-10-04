package o0Oo0o00;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0o00.o00Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel", m80623f = "CloudSyncViewModel.kt", m80624l = {654, 659, 667}, m80625m = "loadMissingTitles")
public final class C28210o00Oo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Map f99997OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28201OooooO0 f99998OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f99999OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f100000OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f100001OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f100002OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f100003OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f100004OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f100005OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28210o00Oo0(C28201OooooO0 c28201OooooO0, Continuation<? super C28210o00Oo0> continuation) {
        super(continuation);
        this.f100004OooOooO = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100002OooOoo = obj;
        this.f100005OooOooo |= Integer.MIN_VALUE;
        return C28201OooooO0.OooO0o0(this.f100004OooOooO, null, this);
    }
}
