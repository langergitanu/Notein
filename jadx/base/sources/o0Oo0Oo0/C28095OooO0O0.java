package o0Oo0Oo0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0Oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.netdisk.CloudBackupWorker$doWork$2", m80623f = "CloudBackupWorker.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28095OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f99572OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99573OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28095OooO0O0(boolean z, Continuation<? super C28095OooO0O0> continuation) {
        super(2, continuation);
        this.f99572OooOo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28095OooO0O0 c28095OooO0O0 = new C28095OooO0O0(this.f99572OooOo, continuation);
        c28095OooO0O0.f99573OooOo0o = obj;
        return c28095OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C28095OooO0O0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f99573OooOo0o;
        if (this.f99572OooOo) {
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95006OooO0o, new Long(System.currentTimeMillis()));
        } else {
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = C27205OooO0OO.f95002OooO00o;
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95006OooO0o, new Long(-1L));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
