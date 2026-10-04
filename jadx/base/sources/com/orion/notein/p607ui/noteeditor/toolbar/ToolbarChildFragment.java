package com.orion.notein.p607ui.noteeditor.toolbar;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.toolbar.ToolbarChildFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26298OoooOOO;
import o0OoO0oo.C28971o0OO00O;
import o0o00.C29719OooO00o;
import o0o000oo.C29849OoooOo0;
import o0o000oo.C29850OoooOoO;
import o0o000oo.C29851OoooOoo;
import o0o000oo.o00Ooo;
import o0o00Oo0.C29908OooO00o;
import o0o00Oo0.C29909OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbar/ToolbarChildFragment;", "Lcom/orion/notein/ui/noteeditor/toolbar/BaseToolbarChildFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ToolbarChildFragment extends Hilt_ToolbarChildFragment {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public View f76709OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public RecyclerView f76710Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public C29719OooO00o f76711o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public View f76712ooOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1", m80623f = "ToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76714OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1$1", m80623f = "ToolbarChildFragment.kt", m80624l = {50}, m80625m = "invokeSuspend")
        public static final class C19394OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolbarChildFragment f76715OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76716OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1$1$1", m80623f = "ToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19395OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29908OooO00o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ToolbarChildFragment f76717OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76718OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19395OooO00o(ToolbarChildFragment toolbarChildFragment, Continuation<? super C19395OooO00o> continuation) {
                    super(2, continuation);
                    this.f76717OooOo = toolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19395OooO00o c19395OooO00o = new C19395OooO00o(this.f76717OooOo, continuation);
                    c19395OooO00o.f76718OooOo0o = obj;
                    return c19395OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29908OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19395OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f76718OooOo0o;
                    C29719OooO00o c29719OooO00o = this.f76717OooOo.f76711o0OoOo0;
                    if (c29719OooO00o != null) {
                        c29719OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("secondaryToolsAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19394OooO00o(ToolbarChildFragment toolbarChildFragment, Continuation<? super C19394OooO00o> continuation) {
                super(2, continuation);
                this.f76715OooOo = toolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19394OooO00o(this.f76715OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19394OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76716OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolbarChildFragment toolbarChildFragment = this.f76715OooOo;
                    o00Ooo o00oooOooo0oo = toolbarChildFragment.Oooo0oo();
                    C19395OooO00o c19395OooO00o = new C19395OooO00o(toolbarChildFragment, null);
                    this.f76716OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(o00oooOooo0oo.f105939OooOo0, c19395OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1$2", m80623f = "ToolbarChildFragment.kt", m80624l = {56}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolbarChildFragment f76719OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76720OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1$2$1", m80623f = "ToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19396OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ToolbarChildFragment f76721OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76722OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19396OooO00o(ToolbarChildFragment toolbarChildFragment, Continuation<? super C19396OooO00o> continuation) {
                    super(2, continuation);
                    this.f76721OooOo = toolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19396OooO00o c19396OooO00o = new C19396OooO00o(this.f76721OooOo, continuation);
                    c19396OooO00o.f76722OooOo0o = ((Boolean) obj).booleanValue();
                    return c19396OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19396OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    int dimensionPixelSize;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f76722OooOo0o;
                    final ToolbarChildFragment toolbarChildFragment = this.f76721OooOo;
                    View view = toolbarChildFragment.f76709OoooooO;
                    if (view == null) {
                        OooOOO0.OooOOOO("clSecondaryTools");
                        throw null;
                    }
                    int height = view.getHeight();
                    if (z) {
                        View view2 = toolbarChildFragment.f76709OoooooO;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("clSecondaryTools");
                            throw null;
                        }
                        dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.toolbar_secondary_height);
                    } else {
                        dimensionPixelSize = 0;
                    }
                    View view3 = toolbarChildFragment.f76709OoooooO;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("clSecondaryTools");
                        throw null;
                    }
                    if ((view3.getVisibility() == 0) == z) {
                        View view4 = toolbarChildFragment.f76709OoooooO;
                        if (view4 == null) {
                            OooOOO0.OooOOOO("clSecondaryTools");
                            throw null;
                        }
                        view4.getLayoutParams().height = dimensionPixelSize;
                        View view5 = toolbarChildFragment.f76709OoooooO;
                        if (view5 == null) {
                            OooOOO0.OooOOOO("clSecondaryTools");
                            throw null;
                        }
                        view5.requestLayout();
                    } else {
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, dimensionPixelSize);
                        OooOOO0.OooO0Oo(valueAnimatorOfInt);
                        valueAnimatorOfInt.addListener(new C29851OoooOoo(toolbarChildFragment));
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0o000oo.OoooOOo
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                                ToolbarChildFragment toolbarChildFragment2 = toolbarChildFragment;
                                View view6 = toolbarChildFragment2.f76709OoooooO;
                                if (view6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("clSecondaryTools");
                                    throw null;
                                }
                                view6.getLayoutParams().height = iIntValue;
                                View view7 = toolbarChildFragment2.f76709OoooooO;
                                if (view7 != null) {
                                    view7.requestLayout();
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("clSecondaryTools");
                                    throw null;
                                }
                            }
                        });
                        valueAnimatorOfInt.addListener(new C29850OoooOoO(toolbarChildFragment, z));
                        valueAnimatorOfInt.addListener(new C29849OoooOo0(toolbarChildFragment, z));
                        valueAnimatorOfInt.setDuration(300L);
                        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfInt.start();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ToolbarChildFragment toolbarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f76719OooOo = toolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f76719OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76720OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolbarChildFragment toolbarChildFragment = this.f76719OooOo;
                    o00Ooo o00oooOooo0oo = toolbarChildFragment.Oooo0oo();
                    C19396OooO00o c19396OooO00o = new C19396OooO00o(toolbarChildFragment, null);
                    this.f76720OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(o00oooOooo0oo.f105941OooOo0O, c19396OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1$3", m80623f = "ToolbarChildFragment.kt", m80624l = {61}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolbarChildFragment f76723OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76724OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarChildFragment$initViews$1$3$1", m80623f = "ToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19397OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteMeta, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolbarChildFragment f76725OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19397OooO00o(ToolbarChildFragment toolbarChildFragment, Continuation<? super C19397OooO00o> continuation) {
                    super(2, continuation);
                    this.f76725OooOo0o = toolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19397OooO00o(this.f76725OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteMeta noteMeta, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19397OooO00o) create(noteMeta, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f76725OooOo0o.Ooooooo();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ToolbarChildFragment toolbarChildFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f76723OooOo = toolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f76723OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76724OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolbarChildFragment toolbarChildFragment = this.f76723OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = toolbarChildFragment.Oooo0OO();
                    C19397OooO00o c19397OooO00o = new C19397OooO00o(toolbarChildFragment, null);
                    this.f76724OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73395OoooOo0, c19397OooO00o, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = ToolbarChildFragment.this.new OooO00o(continuation);
            oooO00o.f76714OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76714OooOo0o;
            ToolbarChildFragment toolbarChildFragment = ToolbarChildFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19394OooO00o(toolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(toolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(toolbarChildFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OoooO0O(View view) {
        Ooooo0o();
        Oooo0oo().OooO0o(4, !((Set) Oooo0oo().f105934OooOOOO.getValue()).contains(4));
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OoooOOO(Integer num) {
        Oooo00O().setVisibility(num != null ? 0 : 8);
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            Oooo00O().setImageResource(R.drawable.ic_ni_syltus_selector);
        } else if (num.intValue() == 1) {
            Oooo00O().setImageResource(R.drawable.ic_ni_finger_selector);
        } else if (num.intValue() == 2) {
            Oooo00O().setImageResource(R.drawable.ic_ni_tools_tap_reading_normal);
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OoooOOo(List<C29909OooO0O0> items) {
        OooOOO0.OooO0oO(items, "items");
        super.OoooOOo(items);
        Ooooooo();
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void Ooooo00(View view) {
        this.f76709OoooooO = view.findViewById(R.id.cl_secondary_tools);
        this.f76710Ooooooo = (RecyclerView) view.findViewById(R.id.rv_secondary_tools);
        this.f76712ooOO = view.findViewById(R.id.v_secondary_tools_right);
        C29719OooO00o c29719OooO00o = new C29719OooO00o(false);
        this.f76711o0OoOo0 = c29719OooO00o;
        c29719OooO00o.f105372OooO0OO = new ViewOnClickListenerC26298OoooOOO(this, 1);
        RecyclerView recyclerView = this.f76710Ooooooo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvSecondaryTools");
            throw null;
        }
        recyclerView.setAdapter(c29719OooO00o);
        super.Ooooo00(view);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new OooO00o(null), 3);
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OooooO0(View view, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        o00Ooo o00oooOooo0oo = Oooo0oo();
        Boolean bool = Boolean.FALSE;
        C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105930OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool);
        this.f76482Oooo0 = interfaceC21987OooOoo;
        this.f76486Oooo0O0 = view;
        Ooooo00(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ooooooo() {
        Object next;
        Object next2;
        NoteMeta noteMeta = (NoteMeta) Oooo0OO().f73395OoooOo0.f121747OooOo0o.getValue();
        boolean z = noteMeta != null && noteMeta.getUnboundedNote();
        boolean z2 = Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73444OooOoOO;
        List list = (List) Oooo0oo().f105942OooOo0o.f121747OooOo0o.getValue();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C29909OooO0O0) next).f106118OooO00o == 1) {
                    break;
                }
            }
        }
        C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) next;
        ImageView imageView = this.f76488Oooo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnUndo");
            throw null;
        }
        imageView.setVisibility((c29909OooO0O0 != null ? c29909OooO0O0.f106121OooO0Oo : true) && !z2 ? 0 : 8);
        ImageView imageView2 = this.f76490Oooo0oO;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("btnRedo");
            throw null;
        }
        imageView2.setVisibility((c29909OooO0O0 != null ? c29909OooO0O0.f106121OooO0Oo : true) && !z2 ? 0 : 8);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((C29909OooO0O0) next2).f106118OooO00o == 0) {
                    break;
                }
            }
        }
        C29909OooO0O0 c29909OooO0O02 = (C29909OooO0O0) next2;
        ImageView imageView3 = this.f76487Oooo0OO;
        if (imageView3 != null) {
            imageView3.setVisibility((!(c29909OooO0O02 != null ? c29909OooO0O02.f106121OooO0Oo : true) || z2 || z) ? false : true ? 0 : 8);
        } else {
            OooOOO0.OooOOOO("btnTiledPage");
            throw null;
        }
    }
}
