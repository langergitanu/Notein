package o0o0OOO;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.viewpager2.widget.ViewPager2;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0OOO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$observeViewModel$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
public final class C30493Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108887OooOo0o;

    /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$observeViewModel$1$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PaperConfigDialogFragment f108888OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f108889OooOo0o;

        /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$observeViewModel$1$1$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
        public static final class C20086OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PaperConfigDialogFragment f108890OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108891OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C20087OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public static final C20087OooO00o<T> f108892OooOo0o = new C20087OooO00o<>();

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20086OooO00o(PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super C20086OooO00o> continuation) {
                super(2, continuation);
                this.f108890OooOo = paperConfigDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20086OooO00o(this.f108890OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C20086OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108891OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C30520o000000o c30520o000000oOooOoo = this.f108890OooOo.OooOoo();
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO = C20087OooO00o.f108892OooOo0o;
                    this.f108891OooOo0o = 1;
                    if (c30520o000000oOooOoo.f109048Ooooo0o.f121747OooOo0o.collect(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$observeViewModel$1$1$2", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_4}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PaperConfigDialogFragment f108893OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108894OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C20088OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PaperConfigDialogFragment f108895OooOo0o;

                public C20088OooO00o(PaperConfigDialogFragment paperConfigDialogFragment) {
                    this.f108895OooOo0o = paperConfigDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PaperConfigDialogFragment paperConfigDialogFragment = this.f108895OooOo0o;
                    C30523o00000oO c30523o00000oO = paperConfigDialogFragment.f78657Oooo0;
                    if (c30523o00000oO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pagerAdapter");
                        throw null;
                    }
                    boolean z = c30523o00000oO.f109091OooO;
                    if (z != zBooleanValue) {
                        if (z != zBooleanValue) {
                            c30523o00000oO.f109091OooO = zBooleanValue;
                            c30523o00000oO.notifyDataSetChanged();
                        }
                        TabLayoutMediator tabLayoutMediator = paperConfigDialogFragment.f78661Oooo0O0;
                        if (tabLayoutMediator != null) {
                            tabLayoutMediator.detach();
                            TabLayoutMediator tabLayoutMediator2 = paperConfigDialogFragment.f78661Oooo0O0;
                            if (tabLayoutMediator2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tabMediator");
                                throw null;
                            }
                            tabLayoutMediator2.attach();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f108893OooOo = paperConfigDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f108893OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108894OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PaperConfigDialogFragment paperConfigDialogFragment = this.f108893OooOo;
                    C30520o000000o c30520o000000oOooOoo = paperConfigDialogFragment.OooOoo();
                    C20088OooO00o c20088OooO00o = new C20088OooO00o(paperConfigDialogFragment);
                    this.f108894OooOo0o = 1;
                    if (c30520o000000oOooOoo.f109042OoooOOO.f121747OooOo0o.collect(c20088OooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$observeViewModel$1$1$3", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PaperConfigDialogFragment f108896OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108897OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.Oooo00O$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C20089OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PaperConfigDialogFragment f108898OooOo0o;

                public C20089OooO00o(PaperConfigDialogFragment paperConfigDialogFragment) {
                    this.f108898OooOo0o = paperConfigDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    PaperConfigDialogFragment paperConfigDialogFragment = this.f108898OooOo0o;
                    ViewPager2 viewPager2 = paperConfigDialogFragment.f78660Oooo00o;
                    if (viewPager2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                        throw null;
                    }
                    if (viewPager2.getCurrentItem() != iIntValue) {
                        ViewPager2 viewPager22 = paperConfigDialogFragment.f78660Oooo00o;
                        if (viewPager22 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                            throw null;
                        }
                        viewPager22.OooO0OO(iIntValue, false);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f108896OooOo = paperConfigDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f108896OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108897OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PaperConfigDialogFragment paperConfigDialogFragment = this.f108896OooOo;
                    C30520o000000o c30520o000000oOooOoo = paperConfigDialogFragment.OooOoo();
                    C20089OooO00o c20089OooO00o = new C20089OooO00o(paperConfigDialogFragment);
                    this.f108897OooOo0o = 1;
                    if (c30520o000000oOooOoo.f109043OoooOOo.f121747OooOo0o.collect(c20089OooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f108888OooOo = paperConfigDialogFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f108888OooOo, continuation);
            oooO00o.f108889OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f108889OooOo0o;
            PaperConfigDialogFragment paperConfigDialogFragment = this.f108888OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C20086OooO00o(paperConfigDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(paperConfigDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(paperConfigDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30493Oooo00O(PaperConfigDialogFragment paperConfigDialogFragment, Continuation<? super C30493Oooo00O> continuation) {
        super(2, continuation);
        this.f108886OooOo = paperConfigDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30493Oooo00O(this.f108886OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30493Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108887OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PaperConfigDialogFragment paperConfigDialogFragment = this.f108886OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = paperConfigDialogFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(paperConfigDialogFragment, null);
            this.f108887OooOo0o = 1;
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
