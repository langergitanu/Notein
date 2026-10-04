package o0OO0o0;

import com.microsoft.identity.client.IAccount;
import com.microsoft.identity.client.ICurrentAccountResult;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OO0o0.C26837Oooo0OO;
import o0OOO00.C26988OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSessionManager$requireAuthContext$2", m80623f = "OneDriveDriveSessionManager.kt", m80624l = {112, 117, 119, 121}, m80625m = "invokeSuspend")
public final class o000oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26837Oooo0OO.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f93036OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f93037OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26837Oooo0OO f93038OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f93039OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(C26837Oooo0OO c26837Oooo0OO, Continuation<? super o000oOoO> continuation) {
        super(2, continuation);
        this.f93038OooOoO = c26837Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000oOoO(this.f93038OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26837Oooo0OO.OooO00o> continuation) {
        return ((o000oOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[Catch: Exception -> 0x001e, CancellationException -> 0x0021, TryCatch #2 {CancellationException -> 0x0021, Exception -> 0x001e, blocks: (B:9:0x0019, B:50:0x0098, B:18:0x002e, B:44:0x0084, B:46:0x0088, B:52:0x00a6, B:53:0x00ad, B:19:0x0032, B:38:0x0072, B:40:0x0076, B:54:0x00ae, B:55:0x00b5, B:20:0x0036, B:29:0x0054, B:31:0x0058, B:33:0x005e, B:35:0x0064, B:56:0x00b6, B:57:0x00bd, B:58:0x00be, B:59:0x00c5, B:23:0x003d, B:26:0x004f), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[Catch: Exception -> 0x001e, CancellationException -> 0x0021, TryCatch #2 {CancellationException -> 0x0021, Exception -> 0x001e, blocks: (B:9:0x0019, B:50:0x0098, B:18:0x002e, B:44:0x0084, B:46:0x0088, B:52:0x00a6, B:53:0x00ad, B:19:0x0032, B:38:0x0072, B:40:0x0076, B:54:0x00ae, B:55:0x00b5, B:20:0x0036, B:29:0x0054, B:31:0x0058, B:33:0x005e, B:35:0x0064, B:56:0x00b6, B:57:0x00bd, B:58:0x00be, B:59:0x00c5, B:23:0x003d, B:26:0x004f), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[Catch: Exception -> 0x001e, CancellationException -> 0x0021, TryCatch #2 {CancellationException -> 0x0021, Exception -> 0x001e, blocks: (B:9:0x0019, B:50:0x0098, B:18:0x002e, B:44:0x0084, B:46:0x0088, B:52:0x00a6, B:53:0x00ad, B:19:0x0032, B:38:0x0072, B:40:0x0076, B:54:0x00ae, B:55:0x00b5, B:20:0x0036, B:29:0x0054, B:31:0x0058, B:33:0x005e, B:35:0x0064, B:56:0x00b6, B:57:0x00bd, B:58:0x00be, B:59:0x00c5, B:23:0x003d, B:26:0x004f), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae A[Catch: Exception -> 0x001e, CancellationException -> 0x0021, TryCatch #2 {CancellationException -> 0x0021, Exception -> 0x001e, blocks: (B:9:0x0019, B:50:0x0098, B:18:0x002e, B:44:0x0084, B:46:0x0088, B:52:0x00a6, B:53:0x00ad, B:19:0x0032, B:38:0x0072, B:40:0x0076, B:54:0x00ae, B:55:0x00b5, B:20:0x0036, B:29:0x0054, B:31:0x0058, B:33:0x005e, B:35:0x0064, B:56:0x00b6, B:57:0x00bd, B:58:0x00be, B:59:0x00c5, B:23:0x003d, B:26:0x004f), top: B:63:0x000b }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        IAccount currentAccount;
        String str;
        String str2;
        String str3;
        String str4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93039OooOoO0;
        C26837Oooo0OO c26837Oooo0OO = this.f93038OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f93039OooOoO0 = 1;
                AbstractC24338OooO0o0.OooO00o<String> oooO00o = C26837Oooo0OO.f92904OooO0o;
                c26837Oooo0OO.getClass();
                Object objOooO00o = C26988OooO0Oo.f93785OooO00o.OooO00o(c26837Oooo0OO.f92905OooO00o, this);
                if (objOooO00o != enumC32485OooO00o) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = this.f93036OooOo;
                        str2 = this.f93037OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        C26837Oooo0OO.OooO00o oooO00o2 = new C26837Oooo0OO.OooO00o(str2, str4);
                        C33781o00o0O c33781o00o0O = c26837Oooo0OO.f92908OooO0Oo;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, oooO00o2);
                        return oooO00o2;
                    }
                    str2 = this.f93037OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    str3 = (String) obj;
                    if (str3 != null) {
                        throw new IllegalStateException("OneDrive driveId fetch failed");
                    }
                    C26800OooO c26800OooO = c26837Oooo0OO.f92907OooO0OO;
                    this.f93037OooOo0o = str2;
                    this.f93036OooOo = str3;
                    this.f93039OooOoO0 = 4;
                    if (c26800OooO.OooO0OO(str2, str3, this) != enumC32485OooO00o) {
                        str4 = str3;
                        C26837Oooo0OO.OooO00o oooO00o22 = new C26837Oooo0OO.OooO00o(str2, str4);
                        C33781o00o0O c33781o00o0O2 = c26837Oooo0OO.f92908OooO0Oo;
                        c33781o00o0O2.getClass();
                        c33781o00o0O2.OooOO0(null, oooO00o22);
                        return oooO00o22;
                    }
                    return enumC32485OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                str = (String) obj;
                if (str != null) {
                    throw new IllegalStateException("OneDrive token acquisition failed");
                }
                this.f93037OooOo0o = str;
                this.f93039OooOoO0 = 3;
                Object objOooO00o2 = C26837Oooo0OO.OooO00o(c26837Oooo0OO, str, this);
                if (objOooO00o2 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str2 = str;
                obj = objOooO00o2;
                str3 = (String) obj;
                if (str3 != null) {
                }
            }
            ISingleAccountPublicClientApplication iSingleAccountPublicClientApplication = C26988OooO0Oo.f93786OooO0O0;
            if (iSingleAccountPublicClientApplication == null) {
                throw new IllegalStateException("OneDrive client not initialized");
            }
            ICurrentAccountResult currentAccount2 = iSingleAccountPublicClientApplication.getCurrentAccount();
            if (currentAccount2 == null || (currentAccount = currentAccount2.getCurrentAccount()) == null) {
                throw new IllegalStateException("OneDrive account not found");
            }
            this.f93039OooOoO0 = 2;
            AbstractC24338OooO0o0.OooO00o<String> oooO00o3 = C26837Oooo0OO.f92904OooO0o;
            c26837Oooo0OO.getClass();
            obj = C26837Oooo0OO.OooO0O0(iSingleAccountPublicClientApplication, currentAccount);
            if (obj != enumC32485OooO00o) {
                str = (String) obj;
                if (str != null) {
                }
            }
            return enumC32485OooO00o;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            c26837Oooo0OO.f92908OooO0Oo.setValue(null);
            throw e2;
        }
    }
}
