package o0o0OOO;

import android.content.Context;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$downloadPaperTheme$1", m80623f = "StandardTemplateFragment.kt", m80624l = {478}, m80625m = "invokeSuspend")
public final class o0000OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ StandardTemplateFragment f109105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109106OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ThemeVO f109107OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO(StandardTemplateFragment standardTemplateFragment, ThemeVO themeVO, Continuation<? super o0000OO> continuation) {
        super(2, continuation);
        this.f109105OooOo = standardTemplateFragment;
        this.f109107OooOoO0 = themeVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0000OO(this.f109105OooOo, this.f109107OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0000OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109106OooOo0o;
        StandardTemplateFragment standardTemplateFragment = this.f109105OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30520o000000o c30520o000000oOooOooo = standardTemplateFragment.OooOooo();
            PaperTheme paperTheme = this.f109107OooOoO0.getPaperTheme();
            this.f109106OooOo0o = 1;
            obj = c30520o000000oOooOooo.OooOOO0(paperTheme, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue() && (context = standardTemplateFragment.getContext()) != null) {
            String string = standardTemplateFragment.getString(R.string.download_failed);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
