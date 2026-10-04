package o0o000oo;

import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnHyperlinkBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1512}, m80625m = "invokeSuspend")
public final class C29834Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f105835OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105836OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105837OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29834Oooo00O(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29834Oooo00O> continuation) {
        super(2, continuation);
        this.f105837OooOoO0 = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29834Oooo00O(this.f105837OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29834Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        OooO0OO.OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f105835OooOo;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105837OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            i = baseToolbarChildFragment.Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73443OooOoO0 ? 1 : 0;
            if (i != 0) {
                oooO00o = OooO0OO.OooO00o.f73441OooOo0o;
                baseToolbarChildFragment.Ooooo0o();
                baseToolbarChildFragment.Oooo0OO().Oooo0oO(oooO00o);
                baseToolbarChildFragment.OooooOO(24, Boolean.valueOf(i == 0));
                return C32460OooOooO.f116667OooO00o;
            }
            this.f105836OooOo0o = i;
            this.f105835OooOo = 1;
            Object objOooOooo = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 29, this);
            if (objOooOooo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            i2 = i;
            obj = objOooOooo;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f105836OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        int i4 = i2;
        oooO00o = OooO0OO.OooO00o.f73443OooOoO0;
        i = i4;
        baseToolbarChildFragment.Ooooo0o();
        baseToolbarChildFragment.Oooo0OO().Oooo0oO(oooO00o);
        baseToolbarChildFragment.OooooOO(24, Boolean.valueOf(i == 0));
        return C32460OooOooO.f116667OooO00o;
    }
}
