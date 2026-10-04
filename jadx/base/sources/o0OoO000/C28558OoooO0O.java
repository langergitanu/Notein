package o0OoO000;

import com.orion.notein.domain.models.backup.BackupFile;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$clearGoogleCredential$2", m80623f = "FirebaseLoginViewModel.kt", m80624l = {103, 104}, m80625m = "invokeSuspend")
public final class C28558OoooO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28560OoooOOO f101215OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101216OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28558OoooO0O(C28560OoooOOO c28560OoooOOO, Continuation<? super C28558OoooO0O> continuation) {
        super(2, continuation);
        this.f101215OooOo = c28560OoooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28558OoooO0O(this.f101215OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28558OoooO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r2.f101226OooO0oO.OooO0O0(null, r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101216OooOo0o;
        C28560OoooOOO c28560OoooOOO = this.f101215OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.GoogleDrive;
            this.f101216OooOo0o = 1;
            if (c28560OoooOOO.f101224OooO0o.OooO0O0(diskVendor, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            ((C32445OooOOOO) obj).getClass();
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f101216OooOo0o = 2;
    }
}
