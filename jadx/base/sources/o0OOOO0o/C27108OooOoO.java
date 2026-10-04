package o0OOOO0o;

import com.orion.notein.App;
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

/* JADX INFO: renamed from: o0OOOO0o.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.NoteinFirebaseUserRepoImpl$signOut$2", m80623f = "NoteinFirebaseUserRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27108OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f94502OooOo0o;

    public C27108OooOoO() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27108OooOoO c27108OooOoO = new C27108OooOoO(2, continuation);
        c27108OooOoO.f94502OooOo0o = obj;
        return c27108OooOoO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27108OooOoO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f94502OooOo0o;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = App.f69545OooOooo;
        String str = (String) c24334OooO0O0.OooO0OO(oooO00o);
        AbstractC24338OooO0o0.OooO00o<Integer> oooO00o2 = C27205OooO0OO.f95003OooO0O0;
        Integer num = (Integer) c24334OooO0O0.OooO0OO(oooO00o2);
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o3 = App.f69543OooOoo0;
        Boolean bool = (Boolean) c24334OooO0O0.OooO0OO(oooO00o3);
        c24334OooO0O0.OooO0o0();
        c24334OooO0O0.f81915OooO00o.clear();
        if (str != null && str.length() != 0) {
            c24334OooO0O0.OooO0oo(oooO00o, str);
        }
        if (num != null) {
            c24334OooO0O0.OooO0oo(oooO00o2, new Integer(num.intValue()));
        }
        c24334OooO0O0.OooO0oO(C27205OooO0OO.f95002OooO00o, Boolean.FALSE);
        c24334OooO0O0.OooO0oO(C27205OooO0OO.f95005OooO0Oo, Boolean.TRUE);
        c24334OooO0O0.OooO0oo(oooO00o3, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return C32460OooOooO.f116667OooO00o;
    }
}
