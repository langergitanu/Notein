package o0OO0o0;

import com.aspose.words.StyleIdentifier;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend$downloadContentWithProgress$2$1", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_6}, m80625m = "invokeSuspend")
public final class o00O0O extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f93040OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93041OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f93042OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93043OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f93044OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Integer, C32460OooOooO> f93045OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ long f93046OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O(o00oO0O o00oo0o, String str, File file, String str2, long j, InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super o00O0O> continuation) {
        super(1, continuation);
        this.f93040OooOo = o00oo0o;
        this.f93043OooOoO0 = str;
        this.f93042OooOoO = file;
        this.f93044OooOoOO = str2;
        this.f93046OooOoo0 = j;
        this.f93045OooOoo = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new o00O0O(this.f93040OooOo, this.f93043OooOoO0, this.f93042OooOoO, this.f93044OooOoOO, this.f93046OooOoo0, this.f93045OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
        return ((o00O0O) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93041OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26800OooO c26800OooO = this.f93040OooOo.f93066OooO0OO;
            this.f93041OooOo0o = 1;
            c26800OooO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26813OooOOO(c26800OooO, this.f93044OooOoOO, this.f93043OooOoO0, this.f93042OooOoO, this.f93046OooOoo0, this.f93045OooOoo, null), this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
