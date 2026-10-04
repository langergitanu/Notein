package o0o0OOO;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.button.SelectableTextButtonView;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.notein.p607ui.paperconfig.components.PaperConfigPreview;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0OOOo.EnumC30545OooO00o;
import o0o0OOOo.EnumC30546OooO0O0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0OOO.o0000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1", m80623f = "StandardTemplateFragment.kt", m80624l = {171}, m80625m = "invokeSuspend")
public final class C30526o0000Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ StandardTemplateFragment f109114OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109115OooOo0o;

    /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1", m80623f = "StandardTemplateFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ StandardTemplateFragment f109116OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f109117OooOo0o;

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$1", m80623f = "StandardTemplateFragment.kt", m80624l = {174}, m80625m = "invokeSuspend")
        public static final class C20095OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109118OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109119OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C20096OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109120OooOo0o;

                public C20096OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109120OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    C30534o0000o0 c30534o0000o0 = this.f109120OooOo0o.f78675OooOoO;
                    if (c30534o0000o0 != null) {
                        c30534o0000o0.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("paperThemeCategoryAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20095OooO00o(StandardTemplateFragment standardTemplateFragment, Continuation<? super C20095OooO00o> continuation) {
                super(2, continuation);
                this.f109118OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20095OooO00o(this.f109118OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C20095OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109119OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    StandardTemplateFragment standardTemplateFragment = this.f109118OooOo;
                    C33769Ooooo0o c33769Ooooo0o = standardTemplateFragment.OooOooo().f109048Ooooo0o;
                    C20096OooO00o c20096OooO00o = new C20096OooO00o(standardTemplateFragment);
                    this.f109119OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20096OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$2", m80623f = "StandardTemplateFragment.kt", m80624l = {182}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109121OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109122OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C20097OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109123OooOo0o;

                public C20097OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109123OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    C30534o0000o0 c30534o0000o0 = this.f109123OooOo0o.f78677OooOoOO;
                    if (c30534o0000o0 != null) {
                        c30534o0000o0.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("coverThemeCategoryAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(StandardTemplateFragment standardTemplateFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f109121OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f109121OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109122OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    StandardTemplateFragment standardTemplateFragment = this.f109121OooOo;
                    C33769Ooooo0o c33769Ooooo0o = standardTemplateFragment.OooOooo().f109049OooooO0;
                    C20097OooO00o c20097OooO00o = new C20097OooO00o(standardTemplateFragment);
                    this.f109122OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20097OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$3", m80623f = "StandardTemplateFragment.kt", m80624l = {190}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109124OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109125OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C20098OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109126OooOo0o;

                public C20098OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109126OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    PaperTheme paperTheme = (PaperTheme) obj;
                    if (paperTheme != null) {
                        PaperConfigPreview paperConfigPreview = this.f109126OooOo0o.f78679OooOoo0;
                        if (paperConfigPreview == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paperPreview");
                            throw null;
                        }
                        paperConfigPreview.setSelectedPaperTheme(paperTheme);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(StandardTemplateFragment standardTemplateFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f109124OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f109124OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109125OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    StandardTemplateFragment standardTemplateFragment = this.f109124OooOo;
                    C33769Ooooo0o c33769Ooooo0o = standardTemplateFragment.OooOooo().f109044OoooOo0;
                    C20098OooO00o c20098OooO00o = new C20098OooO00o(standardTemplateFragment);
                    this.f109125OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20098OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$4", m80623f = "StandardTemplateFragment.kt", m80624l = {199}, m80625m = "invokeSuspend")
        public static final class C30527OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109127OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109128OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            public static final class C20099OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109129OooOo0o;

                public C20099OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109129OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    PaperTheme paperTheme = (PaperTheme) obj;
                    if (paperTheme != null) {
                        PaperConfigPreview paperConfigPreview = this.f109129OooOo0o.f78679OooOoo0;
                        if (paperConfigPreview == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paperPreview");
                            throw null;
                        }
                        paperConfigPreview.setSelectedCoverTheme(paperTheme);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30527OooO0Oo(StandardTemplateFragment standardTemplateFragment, Continuation<? super C30527OooO0Oo> continuation) {
                super(2, continuation);
                this.f109127OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30527OooO0Oo(this.f109127OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C30527OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109128OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    StandardTemplateFragment standardTemplateFragment = this.f109127OooOo;
                    C33769Ooooo0o c33769Ooooo0o = standardTemplateFragment.OooOooo().f109046OoooOoo;
                    C20099OooO00o c20099OooO00o = new C20099OooO00o(standardTemplateFragment);
                    this.f109128OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20099OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$6", m80623f = "StandardTemplateFragment.kt", m80624l = {215}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109130OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109131OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
            public static final class C20100OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109132OooOo0o;

                public C20100OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109132OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    StandardTemplateFragment standardTemplateFragment = this.f109132OooOo0o;
                    if (zBooleanValue) {
                        SelectableTextButtonView selectableTextButtonView = standardTemplateFragment.f78683Oooo000;
                        if (selectableTextButtonView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnInfiniteNote");
                            throw null;
                        }
                        selectableTextButtonView.setSelected(true);
                        SelectableTextButtonView selectableTextButtonView2 = standardTemplateFragment.f78681OooOooo;
                        if (selectableTextButtonView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnStandardNote");
                            throw null;
                        }
                        selectableTextButtonView2.setSelected(false);
                    } else {
                        SelectableTextButtonView selectableTextButtonView3 = standardTemplateFragment.f78681OooOooo;
                        if (selectableTextButtonView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnStandardNote");
                            throw null;
                        }
                        selectableTextButtonView3.setSelected(true);
                        SelectableTextButtonView selectableTextButtonView4 = standardTemplateFragment.f78683Oooo000;
                        if (selectableTextButtonView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnInfiniteNote");
                            throw null;
                        }
                        selectableTextButtonView4.setSelected(false);
                    }
                    boolean z = !zBooleanValue;
                    SelectableSymbolButtonView selectableSymbolButtonView = standardTemplateFragment.f78678OooOoo;
                    if (selectableSymbolButtonView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnPortraitTemplate");
                        throw null;
                    }
                    selectableSymbolButtonView.setEnabled(z);
                    SelectableSymbolButtonView selectableSymbolButtonView2 = standardTemplateFragment.f78680OooOooO;
                    if (selectableSymbolButtonView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnLandscapeTemplate");
                        throw null;
                    }
                    selectableSymbolButtonView2.setEnabled(z);
                    if (zBooleanValue) {
                        PaperConfigPreview paperConfigPreview = standardTemplateFragment.f78679OooOoo0;
                        if (paperConfigPreview == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paperPreview");
                            throw null;
                        }
                        paperConfigPreview.setDisplayMode(EnumC30545OooO00o.f109260OooOo);
                    } else {
                        PaperConfigPreview paperConfigPreview2 = standardTemplateFragment.f78679OooOoo0;
                        if (paperConfigPreview2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paperPreview");
                            throw null;
                        }
                        paperConfigPreview2.setDisplayMode(EnumC30545OooO00o.f109261OooOo0o);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(StandardTemplateFragment standardTemplateFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f109130OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f109130OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109131OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                StandardTemplateFragment standardTemplateFragment = this.f109130OooOo;
                C33781o00o0O c33781o00o0O = standardTemplateFragment.OooOooo().f109017OooOo0O;
                C20100OooO00o c20100OooO00o = new C20100OooO00o(standardTemplateFragment);
                this.f109131OooOo0o = 1;
                c33781o00o0O.collect(c20100OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$5", m80623f = "StandardTemplateFragment.kt", m80624l = {208}, m80625m = "invokeSuspend")
        public static final class C30528OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109133OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109134OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            public static final class C20101OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109135OooOo0o;

                public C20101OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109135OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    StandardTemplateFragment standardTemplateFragment = this.f109135OooOo0o;
                    standardTemplateFragment.getClass();
                    int i = StandardTemplateFragment.OooO00o.f78691OooO00o[((PaperOrientation) obj).ordinal()];
                    if (i == 1) {
                        SelectableSymbolButtonView selectableSymbolButtonView = standardTemplateFragment.f78678OooOoo;
                        if (selectableSymbolButtonView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPortraitTemplate");
                            throw null;
                        }
                        selectableSymbolButtonView.setSelected(true);
                        SelectableSymbolButtonView selectableSymbolButtonView2 = standardTemplateFragment.f78680OooOooO;
                        if (selectableSymbolButtonView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnLandscapeTemplate");
                            throw null;
                        }
                        selectableSymbolButtonView2.setSelected(false);
                    } else {
                        if (i != 2) {
                            throw new C32442OooOO0o();
                        }
                        SelectableSymbolButtonView selectableSymbolButtonView3 = standardTemplateFragment.f78678OooOoo;
                        if (selectableSymbolButtonView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPortraitTemplate");
                            throw null;
                        }
                        selectableSymbolButtonView3.setSelected(false);
                        SelectableSymbolButtonView selectableSymbolButtonView4 = standardTemplateFragment.f78680OooOooO;
                        if (selectableSymbolButtonView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnLandscapeTemplate");
                            throw null;
                        }
                        selectableSymbolButtonView4.setSelected(true);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30528OooO0o0(StandardTemplateFragment standardTemplateFragment, Continuation<? super C30528OooO0o0> continuation) {
                super(2, continuation);
                this.f109133OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30528OooO0o0(this.f109133OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C30528OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109134OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                StandardTemplateFragment standardTemplateFragment = this.f109133OooOo;
                C33781o00o0O c33781o00o0O = standardTemplateFragment.OooOooo().f109010OooOOOo;
                C20101OooO00o c20101OooO00o = new C20101OooO00o(standardTemplateFragment);
                this.f109134OooOo0o = 1;
                c33781o00o0O.collect(c20101OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$7", m80623f = "StandardTemplateFragment.kt", m80624l = {229}, m80625m = "invokeSuspend")
        public static final class C30529OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109136OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109137OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0oO$OooO00o, reason: collision with other inner class name */
            public static final class C20102OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109138OooOo0o;

                public C20102OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109138OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    EnumC30546OooO0O0 enumC30546OooO0O0 = (EnumC30546OooO0O0) obj;
                    StandardTemplateFragment standardTemplateFragment = this.f109138OooOo0o;
                    PaperConfigPreview paperConfigPreview = standardTemplateFragment.f78679OooOoo0;
                    if (paperConfigPreview == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("paperPreview");
                        throw null;
                    }
                    paperConfigPreview.setSelectedType(enumC30546OooO0O0);
                    int iOrdinal = enumC30546OooO0O0.ordinal();
                    if (iOrdinal == 0) {
                        RecyclerView recyclerView = standardTemplateFragment.f78674OooOo;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvPapers");
                            throw null;
                        }
                        recyclerView.setVisibility(8);
                        RecyclerView recyclerView2 = standardTemplateFragment.f78676OooOoO0;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvCovers");
                            throw null;
                        }
                        recyclerView2.setVisibility(0);
                    } else {
                        if (iOrdinal != 1) {
                            throw new C32442OooOO0o();
                        }
                        RecyclerView recyclerView3 = standardTemplateFragment.f78674OooOo;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvPapers");
                            throw null;
                        }
                        recyclerView3.setVisibility(0);
                        RecyclerView recyclerView4 = standardTemplateFragment.f78676OooOoO0;
                        if (recyclerView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvCovers");
                            throw null;
                        }
                        recyclerView4.setVisibility(8);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30529OooO0oO(StandardTemplateFragment standardTemplateFragment, Continuation<? super C30529OooO0oO> continuation) {
                super(2, continuation);
                this.f109136OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30529OooO0oO(this.f109136OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C30529OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109137OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                StandardTemplateFragment standardTemplateFragment = this.f109136OooOo;
                C33781o00o0O c33781o00o0O = standardTemplateFragment.OooOooo().f109030Oooo00o;
                C20102OooO00o c20102OooO00o = new C20102OooO00o(standardTemplateFragment);
                this.f109137OooOo0o = 1;
                c33781o00o0O.collect(c20102OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.StandardTemplateFragment$observeViewModel$1$1$8", m80623f = "StandardTemplateFragment.kt", m80624l = {237}, m80625m = "invokeSuspend")
        public static final class C30530OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StandardTemplateFragment f109139OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109140OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.o0000Oo$OooO00o$OooO0oo$OooO00o, reason: collision with other inner class name */
            public static final class C20103OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ StandardTemplateFragment f109141OooOo0o;

                public C20103OooO00o(StandardTemplateFragment standardTemplateFragment) {
                    this.f109141OooOo0o = standardTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PaperConfigPreview paperConfigPreview = this.f109141OooOo0o.f78679OooOoo0;
                    if (paperConfigPreview != null) {
                        paperConfigPreview.setMoreButtonVisible(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("paperPreview");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30530OooO0oo(StandardTemplateFragment standardTemplateFragment, Continuation<? super C30530OooO0oo> continuation) {
                super(2, continuation);
                this.f109139OooOo = standardTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30530OooO0oo(this.f109139OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C30530OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109140OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    StandardTemplateFragment standardTemplateFragment = this.f109139OooOo;
                    C33769Ooooo0o c33769Ooooo0o = standardTemplateFragment.OooOooo().f109045OoooOoO;
                    C20103OooO00o c20103OooO00o = new C20103OooO00o(standardTemplateFragment);
                    this.f109140OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20103OooO00o, this) == enumC32485OooO00o) {
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
        public OooO00o(StandardTemplateFragment standardTemplateFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109116OooOo = standardTemplateFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f109116OooOo, continuation);
            oooO00o.f109117OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f109117OooOo0o;
            StandardTemplateFragment standardTemplateFragment = this.f109116OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C20095OooO00o(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30527OooO0Oo(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30528OooO0o0(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30529OooO0oO(standardTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30530OooO0oo(standardTemplateFragment, null), 3);
            InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0000(standardTemplateFragment, null), 3);
            InterfaceC21987OooOoo viewLifecycleOwner2 = standardTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30524o00000oo(standardTemplateFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30526o0000Oo(StandardTemplateFragment standardTemplateFragment, Continuation<? super C30526o0000Oo> continuation) {
        super(2, continuation);
        this.f109114OooOo = standardTemplateFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30526o0000Oo(this.f109114OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30526o0000Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109115OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            StandardTemplateFragment standardTemplateFragment = this.f109114OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(standardTemplateFragment, null);
            this.f109115OooOo0o = 1;
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
