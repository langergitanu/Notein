package o0o0OOO;

import android.content.Context;
import android.net.Uri;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
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

/* JADX INFO: renamed from: o0o0OOO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$setupFragmentResultListeners$1$1", m80623f = "MyTemplateFragment.kt", m80624l = {157}, m80625m = "invokeSuspend")
public final class C30481OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MyTemplateFragment f108829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108830OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Uri f108831OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f108832OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108833OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30481OooOoO(MyTemplateFragment myTemplateFragment, int i, Uri uri, String str, Continuation<? super C30481OooOoO> continuation) {
        super(2, continuation);
        this.f108829OooOo = myTemplateFragment;
        this.f108832OooOoO0 = i;
        this.f108831OooOoO = uri;
        this.f108833OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30481OooOoO(this.f108829OooOo, this.f108832OooOoO0, this.f108831OooOoO, this.f108833OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30481OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108830OooOo0o;
        MyTemplateFragment myTemplateFragment = this.f108829OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30520o000000o c30520o000000oOooOooo = myTemplateFragment.OooOooo();
            this.f108830OooOo0o = 1;
            c30520o000000oOooOooo.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00Oo0(this.f108831OooOoO, c30520o000000oOooOooo, this.f108832OooOoO0, this.f108833OooOoOO, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue() && (context = myTemplateFragment.getContext()) != null) {
            String string = myTemplateFragment.getString(R.string.import_template_from_pdf_failed);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
