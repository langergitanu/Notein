package o0Ooo0oO;

import com.aspose.words.EditingLanguage;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Ooo0oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$updatePagePaddingColor$1", m80623f = "PagePaddingViewModel.kt", m80624l = {EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT}, m80625m = "invokeSuspend")
public final class C29436OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29423OooO00o f104479OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104480OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f104481OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f104482OooOoO0;

    /* JADX INFO: renamed from: o0Ooo0oO.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$updatePagePaddingColor$1$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f104483OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104484OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f104483OooOo = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104483OooOo, continuation);
            oooO00o.f104484OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ((C24334OooO0O0) this.f104484OooOo0o).OooO0oO(C29423OooO00o.f104359OooOooO, OooOo.o000oOoO(this.f104483OooOo, ",", null, null, null, 62));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29436OooOO0(C29423OooO00o c29423OooO00o, int i, int i2, Continuation<? super C29436OooOO0> continuation) {
        super(2, continuation);
        this.f104479OooOo = c29423OooO00o;
        this.f104482OooOoO0 = i;
        this.f104481OooOoO = i2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29436OooOO0(this.f104479OooOo, this.f104482OooOoO0, this.f104481OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29436OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104480OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C29423OooO00o c29423OooO00o = this.f104479OooOo;
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((Collection) c29423OooO00o.f104370OooOOO0.f121747OooOo0o.getValue());
            int iIndexOf = arrayListO0ooOoO.indexOf(new Integer(this.f104482OooOoO0));
            if (iIndexOf == -1) {
                return C32460OooOooO.f116667OooO00o;
            }
            arrayListO0ooOoO.set(iIndexOf, new Integer(this.f104481OooOoO));
            OooO00o oooO00o = new OooO00o(arrayListO0ooOoO, null);
            this.f104480OooOo0o = 1;
            if (C24332OooO.OooO00o(c29423OooO00o.f104362OooO0o, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
