package o0Ooo0oo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$initQuaternaryViews$onSelectedLassoTypeClickListener$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {EditingLanguage.ISI_ZULU}, m80625m = "invokeSuspend")
public final class C29479Oooo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f104567OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104568OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104569OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29479Oooo0oo(String str, PenBarChildFragment penBarChildFragment, Continuation<? super C29479Oooo0oo> continuation) {
        super(2, continuation);
        this.f104567OooOo = str;
        this.f104569OooOoO0 = penBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29479Oooo0oo(this.f104567OooOo, this.f104569OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29479Oooo0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104568OooOo0o;
        String str = this.f104567OooOo;
        PenBarChildFragment penBarChildFragment = this.f104569OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!str.equals(DrawToolFactory.LASSO_TYPE_CAPTURE)) {
                zBooleanValue = false;
                if (!zBooleanValue) {
                    int i2 = PenBarChildFragment.f75240o0000OOo;
                    penBarChildFragment.Oooo0oO().OooOOO0(str);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            this.f104568OooOo0o = 1;
            obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 11, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
