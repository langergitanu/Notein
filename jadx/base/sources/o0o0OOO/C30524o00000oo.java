package o0o0OOO;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.button.SelectableTextButtonView;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0OOO.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigTemplateFragment$observeChangeMethodState$1", m80623f = "PaperConfigTemplateFragment.kt", m80624l = {133}, m80625m = "invokeSuspend")
public final class C30524o00000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PaperConfigTemplateFragment f109092OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109093OooOo0o;

    /* JADX INFO: renamed from: o0o0OOO.o00000oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigTemplateFragment$observeChangeMethodState$1$1", m80623f = "PaperConfigTemplateFragment.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PaperConfigTemplateFragment f109094OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109095OooOo0o;

        /* JADX INFO: renamed from: o0o0OOO.o00000oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20094OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ PaperConfigTemplateFragment f109096OooOo0o;

            public C20094OooO00o(PaperConfigTemplateFragment paperConfigTemplateFragment) {
                this.f109096OooOo0o = paperConfigTemplateFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                PaperConfigTemplateFragment paperConfigTemplateFragment = this.f109096OooOo0o;
                for (C32443OooOOO c32443OooOOO : C34429OooOOo0.OooOO0o(new C32443OooOOO(1, paperConfigTemplateFragment.OooOoo()), new C32443OooOOO(0, paperConfigTemplateFragment.OooOooO()))) {
                    int iIntValue2 = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    SelectableTextButtonView selectableTextButtonView = (SelectableTextButtonView) c32443OooOOO.f116637OooOo;
                    if (selectableTextButtonView != null) {
                        selectableTextButtonView.setSelected(iIntValue == iIntValue2);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PaperConfigTemplateFragment paperConfigTemplateFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109094OooOo = paperConfigTemplateFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f109094OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109095OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            PaperConfigTemplateFragment paperConfigTemplateFragment = this.f109094OooOo;
            C33781o00o0O c33781o00o0O = paperConfigTemplateFragment.OooOooo().f109022OooOoo;
            C20094OooO00o c20094OooO00o = new C20094OooO00o(paperConfigTemplateFragment);
            this.f109095OooOo0o = 1;
            c33781o00o0O.collect(c20094OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30524o00000oo(PaperConfigTemplateFragment paperConfigTemplateFragment, Continuation<? super C30524o00000oo> continuation) {
        super(2, continuation);
        this.f109092OooOo = paperConfigTemplateFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30524o00000oo(this.f109092OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30524o00000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109093OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PaperConfigTemplateFragment paperConfigTemplateFragment = this.f109092OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = paperConfigTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(paperConfigTemplateFragment, null);
            this.f109093OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
