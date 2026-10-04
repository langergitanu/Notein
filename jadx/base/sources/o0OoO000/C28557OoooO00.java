package o0OoO000;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$adoptOrphanUserData$1", m80623f = "FirebaseLoginViewModel.kt", m80624l = {110, 116, 117, 118}, m80625m = "invokeSuspend")
public final class C28557OoooO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101212OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f101213OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28560OoooOOO f101214OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28557OoooO00(C28560OoooOOO c28560OoooOOO, Continuation<? super C28557OoooO00> continuation) {
        super(2, continuation);
        this.f101214OooOoO0 = c28560OoooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28557OoooO00(this.f101214OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28557OoooO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r2.f101225OooO0o0.OooO0o0(r1, r8) != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[PHI: r1
      0x0079: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v8 java.lang.String) binds: [B:29:0x0076, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101212OooOo;
        C28560OoooOOO c28560OoooOOO = this.f101214OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f101212OooOo = 1;
            obj = c28560OoooOOO.f101223OooO0Oo.OooO0OO(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                str = this.f101213OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f101213OooOo0o = str;
                this.f101212OooOo = 3;
                if (c28560OoooOOO.f101222OooO.OooO00o(str, this) != enumC32485OooO00o) {
                    this.f101213OooOo0o = null;
                    this.f101212OooOo = 4;
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str = this.f101213OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f101213OooOo0o = null;
            this.f101212OooOo = 4;
        }
        NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) obj;
        String id = noteinFirebaseUser != null ? noteinFirebaseUser.getId() : null;
        if (id == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseLoginViewModel");
            c20358OooO00o.OooO0OO("adoptOrphanNotesAndFolders: uid is null", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        this.f101213OooOo0o = id;
        this.f101212OooOo = 2;
        if (c28560OoooOOO.f101227OooO0oo.OooO0o0(id, this) != enumC32485OooO00o) {
            str = id;
            this.f101213OooOo0o = str;
            this.f101212OooOo = 3;
            if (c28560OoooOOO.f101222OooO.OooO00o(str, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
