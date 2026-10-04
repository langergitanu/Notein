package o0OO00o0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CommentLocalDataSource$deleteCommentByIds$2", m80623f = "CommentLocalDataSource.kt", m80624l = {68}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34739OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f90977OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f90978OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f90979OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f90980OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(List<String> list, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f90979OooOoO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f90979OooOoO, continuation);
        oooO0O0.f90980OooOoO0 = obj;
        return oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34739OoooOo0 interfaceC34739OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC34739OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        InterfaceC34739OoooOo0 interfaceC34739OoooOo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90977OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34739OoooOo0 interfaceC34739OoooOo02 = (InterfaceC34739OoooOo0) this.f90980OooOoO0;
            it = oOo000Oo.OooOo.oo0o0Oo(100, 100, this.f90979OooOoO).iterator();
            interfaceC34739OoooOo0 = interfaceC34739OoooOo02;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f90978OooOo0o;
            interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f90980OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            String[] strArr = (String[]) ((List) it.next()).toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f90980OooOoO0 = interfaceC34739OoooOo0;
            this.f90978OooOo0o = it;
            this.f90977OooOo = 1;
            if (interfaceC34739OoooOo0.OooO0oo(strArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
