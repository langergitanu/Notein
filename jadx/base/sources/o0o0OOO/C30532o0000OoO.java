package o0o0OOO;

import android.content.Context;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOO.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$saveScratchTheme$1", m80623f = "StandardTemplateFragment.kt", m80624l = {466}, m80625m = "invokeSuspend")
public final class C30532o0000OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ StandardTemplateFragment f109145OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109146OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PaperTheme f109147OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30532o0000OoO(StandardTemplateFragment standardTemplateFragment, PaperTheme paperTheme, Continuation<? super C30532o0000OoO> continuation) {
        super(2, continuation);
        this.f109145OooOo = standardTemplateFragment;
        this.f109147OooOoO0 = paperTheme;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30532o0000OoO(this.f109145OooOo, this.f109147OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30532o0000OoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109146OooOo0o;
        StandardTemplateFragment standardTemplateFragment = this.f109145OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30520o000000o c30520o000000oOooOooo = standardTemplateFragment.OooOooo();
            this.f109146OooOo0o = 1;
            objOooOOoo = c30520o000000oOooOooo.OooOOoo(this.f109147OooOoO0, this);
            if (objOooOOoo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooOOoo = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        if (!(objOooOOoo instanceof C32445OooOOOO.OooO00o)) {
            Context context = standardTemplateFragment.getContext();
            if (context != null) {
                String string = standardTemplateFragment.getString(R.string.note_creation_save_scratch_theme);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
