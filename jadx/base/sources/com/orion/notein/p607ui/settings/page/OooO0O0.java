package com.orion.notein.p607ui.settings.page;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0o0Oo0O.C30623OooOOOO;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1", m80623f = "PageSettingsFragment.kt", m80624l = {152}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PageSettingsFragment f79226OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f79227OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1", m80623f = "PageSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PageSettingsFragment f79228OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f79229OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$1", m80623f = "PageSettingsFragment.kt", m80624l = {154}, m80625m = "invokeSuspend")
        public static final class C19494OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79230OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79231OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19495OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79232OooOo0o;

                public C19495OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79232OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    this.f79232OooOo0o.OooOoo(((Number) obj).intValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19494OooO00o(PageSettingsFragment pageSettingsFragment, Continuation<? super C19494OooO00o> continuation) {
                super(2, continuation);
                this.f79230OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19494OooO00o(this.f79230OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19494OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79231OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79230OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19495OooO00o c19495OooO00o = new C19495OooO00o(pageSettingsFragment);
                    this.f79231OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109583OooOOOo.f121747OooOo0o.collect(c19495OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$2", m80623f = "PageSettingsFragment.kt", m80624l = {160}, m80625m = "invokeSuspend")
        public static final class C19496OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79233OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79234OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19497OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79235OooOo0o;

                public C19497OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79235OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String string;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PageSettingsFragment pageSettingsFragment = this.f79235OooOo0o;
                    PageSettingsFragment.OooO0OO oooO0OO = pageSettingsFragment.f79257OooOooO;
                    if (oooO0OO == null) {
                        OooOOO0.OooOOOO("flipModeRow");
                        throw null;
                    }
                    if (zBooleanValue) {
                        string = pageSettingsFragment.getString(R.string.page_flip_mode_single);
                        OooOOO0.OooO0Oo(string);
                    } else {
                        string = pageSettingsFragment.getString(R.string.page_flip_mode_continuous);
                        OooOOO0.OooO0Oo(string);
                    }
                    oooO0OO.f79275OooO0O0.setText(string);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19496OooO0O0(PageSettingsFragment pageSettingsFragment, Continuation<? super C19496OooO0O0> continuation) {
                super(2, continuation);
                this.f79233OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19496OooO0O0(this.f79233OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19496OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79234OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79233OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19497OooO00o c19497OooO00o = new C19497OooO00o(pageSettingsFragment);
                    this.f79234OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109578OooOO0O.f121747OooOo0o.collect(c19497OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$3", m80623f = "PageSettingsFragment.kt", m80624l = {166}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79236OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79237OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C19498OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79238OooOo0o;

                public C19498OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79238OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String string;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PageSettingsFragment pageSettingsFragment = this.f79238OooOo0o;
                    PageSettingsFragment.OooO0OO oooO0OO = pageSettingsFragment.f79258OooOooo;
                    if (oooO0OO == null) {
                        OooOOO0.OooOOOO("addPageModeRow");
                        throw null;
                    }
                    if (zBooleanValue) {
                        string = pageSettingsFragment.getString(R.string.page_add_mode_manual);
                        OooOOO0.OooO0Oo(string);
                    } else {
                        string = pageSettingsFragment.getString(R.string.page_add_mode_auto);
                        OooOOO0.OooO0Oo(string);
                    }
                    oooO0OO.f79275OooO0O0.setText(string);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(PageSettingsFragment pageSettingsFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f79236OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f79236OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79237OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79236OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19498OooO00o c19498OooO00o = new C19498OooO00o(pageSettingsFragment);
                    this.f79237OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109581OooOOO0.f121747OooOo0o.collect(c19498OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$4", m80623f = "PageSettingsFragment.kt", m80624l = {172}, m80625m = "invokeSuspend")
        public static final class C23827OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79239OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79240OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            public static final class C19499OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79241OooOo0o;

                public C19499OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79241OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String string;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PageSettingsFragment pageSettingsFragment = this.f79241OooOo0o;
                    PageSettingsFragment.OooO0OO oooO0OO = pageSettingsFragment.f79260Oooo000;
                    if (oooO0OO == null) {
                        OooOOO0.OooOOOO("pageNumberPositionRow");
                        throw null;
                    }
                    if (zBooleanValue) {
                        string = pageSettingsFragment.getString(R.string.page_number_position_reverse);
                        OooOOO0.OooO0Oo(string);
                    } else {
                        string = pageSettingsFragment.getString(R.string.page_number_position_default);
                        OooOOO0.OooO0Oo(string);
                    }
                    oooO0OO.f79275OooO0O0.setText(string);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23827OooO0Oo(PageSettingsFragment pageSettingsFragment, Continuation<? super C23827OooO0Oo> continuation) {
                super(2, continuation);
                this.f79239OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23827OooO0Oo(this.f79239OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23827OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79240OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79239OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19499OooO00o c19499OooO00o = new C19499OooO00o(pageSettingsFragment);
                    this.f79240OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109577OooOO0.f121747OooOo0o.collect(c19499OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$6", m80623f = "PageSettingsFragment.kt", m80624l = {188}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79242OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79243OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
            public static final class C19500OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79244OooOo0o;

                public C19500OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79244OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(((Number) obj).floatValue() * 100);
                    PageSettingsFragment pageSettingsFragment = this.f79244OooOo0o;
                    if (!pageSettingsFragment.f79264Oooo0OO) {
                        PageSettingsFragment.OooO0O0 oooO0O0 = pageSettingsFragment.f79261Oooo00O;
                        if (oooO0O0 == null) {
                            OooOOO0.OooOOOO("pageFreeMoveCard");
                            throw null;
                        }
                        if (oooO0O0.f79272OooO0OO.getProgress() != iOooO0O0) {
                            PageSettingsFragment.OooO0O0 oooO0O02 = pageSettingsFragment.f79261Oooo00O;
                            if (oooO0O02 == null) {
                                OooOOO0.OooOOOO("pageFreeMoveCard");
                                throw null;
                            }
                            oooO0O02.f79272OooO0OO.setProgress(iOooO0O0);
                        }
                    }
                    PageSettingsFragment.OooO0O0 oooO0O03 = pageSettingsFragment.f79261Oooo00O;
                    if (oooO0O03 == null) {
                        OooOOO0.OooOOOO("pageFreeMoveCard");
                        throw null;
                    }
                    oooO0O03.f79273OooO0Oo.setText(PageSettingsFragment.OooOoO(oooO0O03.f79272OooO0OO.getProgress()));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(PageSettingsFragment pageSettingsFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f79242OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f79242OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79243OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79242OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19500OooO00o c19500OooO00o = new C19500OooO00o(pageSettingsFragment);
                    this.f79243OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109595OooOoo.f121747OooOo0o.collect(c19500OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$5", m80623f = "PageSettingsFragment.kt", m80624l = {178}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79245OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79246OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            public static final class C19501OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79247OooOo0o;

                public C19501OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79247OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PageSettingsFragment pageSettingsFragment = this.f79247OooOo0o;
                    PageSettingsFragment.OooO0O0 oooO0O0 = pageSettingsFragment.f79261Oooo00O;
                    if (oooO0O0 == null) {
                        OooOOO0.OooOOOO("pageFreeMoveCard");
                        throw null;
                    }
                    if (oooO0O0.f79271OooO0O0.OooO() != zBooleanValue) {
                        pageSettingsFragment.f79263Oooo0O0 = false;
                        PageSettingsFragment.OooO0O0 oooO0O02 = pageSettingsFragment.f79261Oooo00O;
                        if (oooO0O02 == null) {
                            OooOOO0.OooOOOO("pageFreeMoveCard");
                            throw null;
                        }
                        oooO0O02.f79271OooO0O0.setChecked(zBooleanValue);
                        pageSettingsFragment.f79263Oooo0O0 = true;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(PageSettingsFragment pageSettingsFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f79245OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f79245OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79246OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79245OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19501OooO00o c19501OooO00o = new C19501OooO00o(pageSettingsFragment);
                    this.f79246OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109579OooOO0o.f121747OooOo0o.collect(c19501OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$7", m80623f = "PageSettingsFragment.kt", m80624l = {198}, m80625m = "invokeSuspend")
        public static final class C23828OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79248OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79249OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0oO$OooO00o, reason: collision with other inner class name */
            public static final class C19502OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79250OooOo0o;

                public C19502OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79250OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int i;
                    int iIntValue = ((Number) obj).intValue();
                    PageSettingsFragment pageSettingsFragment = this.f79250OooOo0o;
                    PageSettingsFragment.OooO0OO oooO0OO = pageSettingsFragment.f79262Oooo00o;
                    if (oooO0OO == null) {
                        OooOOO0.OooOOOO("pdfTextSelectionRow");
                        throw null;
                    }
                    if (iIntValue == 0) {
                        i = R.string.pdf_selection_mode_disable;
                    } else if (iIntValue == 1) {
                        i = R.string.pdf_selection_mode_enable;
                    } else {
                        if (iIntValue != 2) {
                            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iIntValue, "Unknown mode: "));
                        }
                        i = R.string.pdf_selection_mode_finger_only;
                    }
                    oooO0OO.f79275OooO0O0.setText(pageSettingsFragment.getString(i));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23828OooO0oO(PageSettingsFragment pageSettingsFragment, Continuation<? super C23828OooO0oO> continuation) {
                super(2, continuation);
                this.f79248OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23828OooO0oO(this.f79248OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23828OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79249OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79248OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19502OooO00o c19502OooO00o = new C19502OooO00o(pageSettingsFragment);
                    this.f79249OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109573OooO0o.f121747OooOo0o.collect(c19502OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.PageSettingsFragment$bindState$1$1$8", m80623f = "PageSettingsFragment.kt", m80624l = {204}, m80625m = "invokeSuspend")
        public static final class C23829OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageSettingsFragment f79251OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79252OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.OooO0O0$OooO00o$OooO0oo$OooO00o, reason: collision with other inner class name */
            public static final class C19503OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PageSettingsFragment f79253OooOo0o;

                public C19503OooO00o(PageSettingsFragment pageSettingsFragment) {
                    this.f79253OooOo0o = pageSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PageSettingsFragment pageSettingsFragment = this.f79253OooOo0o;
                    SwitchListItemView switchListItemView = pageSettingsFragment.f79259Oooo0;
                    if (switchListItemView == null) {
                        OooOOO0.OooOOOO("penWithScaleToggle");
                        throw null;
                    }
                    if (switchListItemView.OooO() != zBooleanValue) {
                        pageSettingsFragment.f79265Oooo0o = false;
                        SwitchListItemView switchListItemView2 = pageSettingsFragment.f79259Oooo0;
                        if (switchListItemView2 == null) {
                            OooOOO0.OooOOOO("penWithScaleToggle");
                            throw null;
                        }
                        switchListItemView2.setChecked(zBooleanValue);
                        pageSettingsFragment.f79265Oooo0o = true;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23829OooO0oo(PageSettingsFragment pageSettingsFragment, Continuation<? super C23829OooO0oo> continuation) {
                super(2, continuation);
                this.f79251OooOo = pageSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23829OooO0oo(this.f79251OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23829OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79252OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PageSettingsFragment pageSettingsFragment = this.f79251OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    C19503OooO00o c19503OooO00o = new C19503OooO00o(pageSettingsFragment);
                    this.f79252OooOo0o = 1;
                    if (c30623OooOOOOOooOoOO.f109582OooOOOO.f121747OooOo0o.collect(c19503OooO00o, this) == enumC32485OooO00o) {
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
        public OooO00o(PageSettingsFragment pageSettingsFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79228OooOo = pageSettingsFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f79228OooOo, continuation);
            oooO00o.f79229OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79229OooOo0o;
            PageSettingsFragment pageSettingsFragment = this.f79228OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19494OooO00o(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19496OooO0O0(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23827OooO0Oo(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23828OooO0oO(pageSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23829OooO0oo(pageSettingsFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(PageSettingsFragment pageSettingsFragment, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f79226OooOo = pageSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f79226OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f79227OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PageSettingsFragment pageSettingsFragment = this.f79226OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = pageSettingsFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(pageSettingsFragment, null);
            this.f79227OooOo0o = 1;
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
