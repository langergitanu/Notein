package o0o0OOO;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27565o00oOoO;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$importPdfPageToMyTemplate$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1738}, m80625m = "invokeSuspend")
public final class o00Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109176OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30520o000000o f109177OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109178OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f109179OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f109180OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f109181OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Uri uri, C30520o000000o c30520o000000o, int i, String str, Continuation<? super o00Oo0> continuation) {
        super(2, continuation);
        this.f109179OooOoO0 = uri;
        this.f109178OooOoO = c30520o000000o;
        this.f109180OooOoOO = i;
        this.f109181OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00Oo0(this.f109179OooOoO0, this.f109178OooOoO, this.f109180OooOoOO, this.f109181OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((o00Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        C30520o000000o c30520o000000o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109176OooOo;
        boolean z = false;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Uri uri = this.f109179OooOoO0;
            if (uri != null) {
                C30520o000000o c30520o000000o2 = this.f109178OooOoO;
                int i2 = this.f109180OooOoOO;
                String str = this.f109181OooOoo0;
                C27570o00oOoo0 c27570o00oOoo0 = c30520o000000o2.f109000OooO0o;
                this.f109177OooOo0o = c30520o000000o2;
                this.f109176OooOo = 1;
                c27570o00oOoo0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27565o00oOoO(c27570o00oOoo0, i2, uri, str, null), this);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c30520o000000o = c30520o000000o2;
                obj = objOooO0o;
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c30520o000000o = this.f109177OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str2 = (String) obj;
        if (str2 != null) {
            c30520o000000o.f109008OooOOO0.OooO0o(str2);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
