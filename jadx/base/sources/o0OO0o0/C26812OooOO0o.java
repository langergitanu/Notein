package o0OO0o0;

import com.google.gson.Gson;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OO0o0.C26800OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$deleteItems$2", m80623f = "OneDriveCloudService.kt", m80624l = {478, 480}, m80625m = "invokeSuspend")
public final class C26812OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C26800OooO f92770OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26800OooO.OooO0OO f92771OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92772OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f92773OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Set<String> f92774OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92775OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26812OooOO0o(Set<String> set, C26800OooO c26800OooO, Continuation<? super C26812OooOO0o> continuation) {
        super(2, continuation);
        this.f92774OooOoOO = set;
        this.f92775OooOoo0 = c26800OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26812OooOO0o(this.f92774OooOoOO, this.f92775OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26812OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C26800OooO.OooO0OO oooO0OO;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92772OooOoO;
        Set<String> set = this.f92774OooOoOO;
        C26800OooO c26800OooO = this.f92775OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (set.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f92772OooOoO = 1;
            Gson gson = C26800OooO.f92718OooO0o0;
            obj = c26800OooO.OooO0o0(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f92773OooOoO0;
                C26800OooO c26800OooO2 = this.f92770OooOo;
                C26800OooO.OooO0OO oooO0OO2 = this.f92771OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                oooO0OO = oooO0OO2;
                c26800OooO = c26800OooO2;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
                    String str2 = oooO0OO.f92729OooO0OO;
                    this.f92771OooOo0o = oooO0OO;
                    this.f92770OooOo = c26800OooO;
                    this.f92773OooOoO0 = it;
                    this.f92772OooOoO = 2;
                    if (oneDriveApiService.deleteFile(str2, oooO0OO.f92728OooO0O0, str, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        oooO0OO = (C26800OooO.OooO0OO) obj;
        it = set.iterator();
        while (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
