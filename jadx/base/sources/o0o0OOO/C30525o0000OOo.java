package o0o0OOO;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
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

/* JADX INFO: renamed from: o0o0OOO.o0000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$handleAddToMyTemplate$1$1", m80623f = "StandardTemplateFragment.kt", m80624l = {585}, m80625m = "invokeSuspend")
public final class C30525o0000OOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ StandardTemplateFragment f109112OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109113OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30525o0000OOo(StandardTemplateFragment standardTemplateFragment, Continuation<? super C30525o0000OOo> continuation) {
        super(2, continuation);
        this.f109112OooOo = standardTemplateFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30525o0000OOo(this.f109112OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30525o0000OOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109113OooOo0o;
        StandardTemplateFragment standardTemplateFragment = this.f109112OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30520o000000o c30520o000000oOooOooo = standardTemplateFragment.OooOooo();
            this.f109113OooOo0o = 1;
            c30520o000000oOooOooo.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30512Ooooo0o(null, c30520o000000oOooOooo), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Context context = standardTemplateFragment.getContext();
            if (context != null) {
                String string = standardTemplateFragment.getString(R.string.import_template_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        } else {
            Context context2 = standardTemplateFragment.getContext();
            if (context2 != null) {
                String string2 = standardTemplateFragment.getString(R.string.import_template_fail);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0oO(context2, string2);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
