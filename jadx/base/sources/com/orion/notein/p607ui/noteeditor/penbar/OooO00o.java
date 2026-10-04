package com.orion.notein.p607ui.noteeditor.penbar;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbar.OooO0O0;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.PencilGroupSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenExtraVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00O0oo0.C24969OooOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Ooo0oo.RunnableC29445OooO0oO;
import o0o00Ooo.C29920OooO0oo;
import o0o00o0.InterfaceC29931OooO0O0;
import o0o00o0.InterfaceC29932OooO0OO;
import o0o00o0.InterfaceC29933OooO0Oo;
import o0o00o0.InterfaceC29934OooO0o;
import o0o00o0O.C29947OooO0OO;
import o0o00o0O.C29948OooO0Oo;
import o0o00o0O.C29949OooO0o;
import o0o00o0O.C29950OooO0o0;
import o0o00o0O.C29951OooO0oO;
import o0o00o0O.C29953OooOO0o;
import o0oOoOo.C31045OooOOo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f75020OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f75021OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$17", m80623f = "PenBarChildFragment.kt", m80624l = {1461}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75022OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75023OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$17$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19313OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75024OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f75025OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19313OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19313OooO00o> continuation) {
                super(2, continuation);
                this.f75024OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19313OooO00o c19313OooO00o = new C19313OooO00o(this.f75024OooOo, continuation);
                c19313OooO00o.f75025OooOo0o = ((Number) obj).intValue();
                return c19313OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C19313OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f75024OooOo.f75318oo000o = this.f75025OooOo0o == 0;
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PenBarChildFragment penBarChildFragment, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f75022OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO(this.f75022OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75023OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75022OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19313OooO00o c19313OooO00o = new C19313OooO00o(penBarChildFragment, null);
                this.f75023OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75151OooOOOO, c19313OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {1247}, m80625m = "invokeSuspend")
    public static final class C19314OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75026OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75027OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$1$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19315OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75028OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75029OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19315OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19315OooO00o> continuation) {
                super(2, continuation);
                this.f75028OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19315OooO00o c19315OooO00o = new C19315OooO00o(this.f75028OooOo, continuation);
                c19315OooO00o.f75029OooOo0o = obj;
                return c19315OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                return ((C19315OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                String str = (String) this.f75029OooOo0o;
                int i = PenBarChildFragment.f75240o0000OOo;
                this.f75028OooOo.Oooo0oO().OooOOo(str, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19314OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19314OooO00o> continuation) {
            super(2, continuation);
            this.f75026OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19314OooO00o(this.f75026OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19314OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75027OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75026OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBarChildFragment.Oooo00O();
                C19315OooO00o c19315OooO00o = new C19315OooO00o(penBarChildFragment, null);
                this.f75027OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73397OoooOoo, c19315OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$10", m80623f = "PenBarChildFragment.kt", m80624l = {1354}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75030OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75031OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$10$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19316OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenColorVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75032OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75033OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19316OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19316OooO00o> continuation) {
                super(2, continuation);
                this.f75032OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19316OooO00o c19316OooO00o = new C19316OooO00o(this.f75032OooOo, continuation);
                c19316OooO00o.f75033OooOo0o = obj;
                return c19316OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenColorVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19316OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                o0o00o0O.OooO oooO;
                C29951OooO0oO c29951OooO0oO;
                C29949OooO0o c29949OooO0o;
                C29953OooOO0o c29953OooOO0o;
                o0o00o0O.OooOO0O oooOO0O;
                C29948OooO0Oo c29948OooO0Oo;
                o0o00o0O.OooOO0O oooOO0O2;
                C29950OooO0o0 c29950OooO0o0;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<PenColorVO> list = (List) this.f75033OooOo0o;
                PenBarChildFragment penBarChildFragment = this.f75032OooOo;
                penBarChildFragment.f75307o00oO0O.OooO0Oo(list);
                C29950OooO0o0 c29950OooO0o02 = penBarChildFragment.f75297o0000Ooo;
                if (c29950OooO0o02 != null && c29950OooO0o02.OooO00o() && (c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo = c29950OooO0o0.OooO0Oo();
                    if (interfaceC29934OooO0oOooO0Oo != null) {
                        interfaceC29934OooO0oOooO0Oo.OooO0O0(list);
                    }
                }
                o0o00o0O.OooOO0O oooOO0O3 = penBarChildFragment.f75290o00000oo;
                if (oooOO0O3 != null && oooOO0O3.OooO00o() && (oooOO0O2 = penBarChildFragment.f75290o00000oo) != null) {
                    oooOO0O2.OooO0Oo(list);
                }
                C29948OooO0Oo c29948OooO0Oo2 = penBarChildFragment.f75299o0000oo;
                if (c29948OooO0Oo2 != null && c29948OooO0Oo2.OooO00o() && (c29948OooO0Oo = penBarChildFragment.f75299o0000oo) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo2 = c29948OooO0Oo.OooO0Oo();
                    if (interfaceC29934OooO0oOooO0Oo2 != null) {
                        interfaceC29934OooO0oOooO0Oo2.OooO0O0(list);
                    }
                }
                o0o00o0O.OooOO0O oooOO0O4 = penBarChildFragment.f75290o00000oo;
                if (oooOO0O4 != null && oooOO0O4.OooO00o() && (oooOO0O = penBarChildFragment.f75290o00000oo) != null) {
                    oooOO0O.OooO0Oo(list);
                }
                C29953OooOO0o c29953OooOO0o2 = penBarChildFragment.f75300o000OO;
                if (c29953OooOO0o2 != null && c29953OooOO0o2.OooO00o() && (c29953OooOO0o = penBarChildFragment.f75300o000OO) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    o0o00o0.OooO oooOOooO0Oo = c29953OooOO0o.OooO0Oo();
                    if (oooOOooO0Oo != null) {
                        oooOOooO0Oo.OooO0O0(list);
                    }
                }
                C29949OooO0o c29949OooO0o2 = penBarChildFragment.f75291o0000O;
                if (c29949OooO0o2 != null && c29949OooO0o2.OooO00o() && (c29949OooO0o = penBarChildFragment.f75291o0000O) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "colorList");
                    InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo();
                    if (interfaceC29932OooO0OOOooO0Oo != null) {
                        interfaceC29932OooO0OOOooO0Oo.OooO0O0(list);
                    }
                }
                C29951OooO0oO c29951OooO0oO2 = penBarChildFragment.f75293o0000O0O;
                if (c29951OooO0oO2 != null && c29951OooO0oO2.OooO00o() && (c29951OooO0oO = penBarChildFragment.f75293o0000O0O) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    InterfaceC29933OooO0Oo interfaceC29933OooO0Oo = c29951OooO0oO.f106367OooO0OO;
                    if (interfaceC29933OooO0Oo == null) {
                        interfaceC29933OooO0Oo = null;
                    }
                    if (interfaceC29933OooO0Oo == null) {
                        interfaceC29933OooO0Oo = c29951OooO0oO.f106366OooO0O0;
                    }
                    if (interfaceC29933OooO0Oo != null) {
                        interfaceC29933OooO0Oo.OooO0O0(list);
                    }
                }
                o0o00o0O.OooO oooO2 = penBarChildFragment.f75292o0000O00;
                if (oooO2 != null && oooO2.OooO00o() && (oooO = penBarChildFragment.f75292o0000O00) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    PencilGroupSettingsBottomSheetDialog pencilGroupSettingsBottomSheetDialog = oooO.f106327OooO0o0;
                    InterfaceC29934OooO0o interfaceC29934OooO0o = pencilGroupSettingsBottomSheetDialog != null ? pencilGroupSettingsBottomSheetDialog : null;
                    if (interfaceC29934OooO0o == null) {
                        interfaceC29934OooO0o = oooO.f106326OooO0o;
                    }
                    if (interfaceC29934OooO0o != null) {
                        interfaceC29934OooO0o.OooO0O0(list);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f75030OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f75030OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75031OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75030OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19316OooO00o c19316OooO00o = new C19316OooO00o(penBarChildFragment, null);
                this.f75031OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75188OoooOoo, c19316OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$11", m80623f = "PenBarChildFragment.kt", m80624l = {1384}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75034OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75035OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$11$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19317OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29920OooO0oo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75036OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75037OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19317OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19317OooO00o> continuation) {
                super(2, continuation);
                this.f75036OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19317OooO00o c19317OooO00o = new C19317OooO00o(this.f75036OooOo, continuation);
                c19317OooO00o.f75037OooOo0o = obj;
                return c19317OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C29920OooO0oo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19317OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C29920OooO0oo> list = (List) this.f75037OooOo0o;
                o0o00Ooo.OooOO0 oooOO02 = this.f75036OooOo.f75298o0000oO;
                if (oooOO02 != null) {
                    oooOO02.OooOO0(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f75034OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f75034OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75035OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75034OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19317OooO00o c19317OooO00o = new C19317OooO00o(penBarChildFragment, null);
                this.f75035OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75190Ooooo0o, c19317OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$12", m80623f = "PenBarChildFragment.kt", m80624l = {1390}, m80625m = "invokeSuspend")
    public static final class C23452OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75038OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75039OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$12$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19318OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75040OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75041OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19318OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19318OooO00o> continuation) {
                super(2, continuation);
                this.f75040OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19318OooO00o c19318OooO00o = new C19318OooO00o(this.f75040OooOo, continuation);
                c19318OooO00o.f75041OooOo0o = ((Boolean) obj).booleanValue();
                return c19318OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19318OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75041OooOo0o;
                ConstraintLayout constraintLayout = this.f75040OooOo.f75263OoooO0O;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(z ? 0 : 8);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("clPenColorList");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23452OooO0Oo(PenBarChildFragment penBarChildFragment, Continuation<? super C23452OooO0Oo> continuation) {
            super(2, continuation);
            this.f75038OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23452OooO0Oo(this.f75038OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23452OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75039OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75038OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19318OooO00o c19318OooO00o = new C19318OooO00o(penBarChildFragment, null);
                this.f75039OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75181OoooO00, c19318OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$14", m80623f = "PenBarChildFragment.kt", m80624l = {1419}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75042OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75043OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$14$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19319OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, OooO0O0.OooO00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ OooO0O0.OooO00o f75044OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75045OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Boolean bool, OooO0O0.OooO00o oooO00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o>> continuation) {
                boolean zBooleanValue = bool.booleanValue();
                C19319OooO00o c19319OooO00o = new C19319OooO00o(3, continuation);
                c19319OooO00o.f75045OooOo0o = zBooleanValue;
                c19319OooO00o.f75044OooOo = oooO00o;
                return c19319OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75045OooOo0o;
                return new C32443OooOOO(Boolean.valueOf(z), this.f75044OooOo);
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$14$2", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75046OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75047OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75046OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f75046OooOo, continuation);
                oooO0O0.f75047OooOo0o = obj;
                return oooO0O0;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75047OooOo0o;
                boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) c32443OooOOO.f116637OooOo;
                if (oooO00o == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                boolean z = oooO00o.compareTo(OooO0O0.OooO00o.f75209OooOoO0) >= 0;
                PenBarChildFragment penBarChildFragment = this.f75046OooOo;
                ImageView imageView = penBarChildFragment.f75264OoooOO0;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivStarColor");
                    throw null;
                }
                imageView.setVisibility(!zBooleanValue && z ? 0 : 8);
                ConstraintLayout constraintLayout = penBarChildFragment.f75271Ooooo0o;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clLasso");
                    throw null;
                }
                constraintLayout.setVisibility(zBooleanValue ? 0 : 8);
                ImageView imageView2 = penBarChildFragment.f75305o00Ooo;
                if (imageView2 != null) {
                    PenBarChildFragment.OooOoo(penBarChildFragment, imageView2, zBooleanValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedLassoType");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f75042OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f75042OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75043OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75042OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO2 = penBarChildFragment.Oooo0oO();
                C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0O0Oooo0oO.f75175Oooo0o, oooO0O0Oooo0oO2.f75155OooOOoo, new C19319OooO00o(3, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBarChildFragment, null);
                this.f75043OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$13", m80623f = "PenBarChildFragment.kt", m80624l = {1401}, m80625m = "invokeSuspend")
    public static final class C23453OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75048OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75049OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$13$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19320OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, OooO0O0.OooO00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ OooO0O0.OooO00o f75050OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75051OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Boolean bool, OooO0O0.OooO00o oooO00o, Continuation<? super C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o>> continuation) {
                boolean zBooleanValue = bool.booleanValue();
                C19320OooO00o c19320OooO00o = new C19320OooO00o(3, continuation);
                c19320OooO00o.f75051OooOo0o = zBooleanValue;
                c19320OooO00o.f75050OooOo = oooO00o;
                return c19320OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75051OooOo0o;
                return new C32443OooOOO(Boolean.valueOf(z), this.f75050OooOo);
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0o0$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$13$2", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75052OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75053OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75052OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f75052OooOo, continuation);
                oooO0O0.f75053OooOo0o = obj;
                return oooO0O0;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends OooO0O0.OooO00o> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75053OooOo0o;
                boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) c32443OooOOO.f116637OooOo;
                if (oooO00o == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                boolean z = oooO00o.compareTo(OooO0O0.OooO00o.f75209OooOoO0) >= 0;
                PenBarChildFragment penBarChildFragment = this.f75052OooOo;
                ConstraintLayout constraintLayout = penBarChildFragment.f75302o000oOoO;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserSetting");
                    throw null;
                }
                constraintLayout.setVisibility(zBooleanValue && z ? 0 : 8);
                ImageView imageView = penBarChildFragment.f75304o00Oo0;
                if (imageView != null) {
                    PenBarChildFragment.OooOoo(penBarChildFragment, imageView, zBooleanValue && !z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedEraserType");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23453OooO0o0(PenBarChildFragment penBarChildFragment, Continuation<? super C23453OooO0o0> continuation) {
            super(2, continuation);
            this.f75048OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23453OooO0o0(this.f75048OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23453OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75049OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75048OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO2 = penBarChildFragment.Oooo0oO();
                C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0O0Oooo0oO.f75168Oooo, oooO0O0Oooo0oO2.f75155OooOOoo, new C19320OooO00o(3, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBarChildFragment, null);
                this.f75049OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$15", m80623f = "PenBarChildFragment.kt", m80624l = {1432}, m80625m = "invokeSuspend")
    public static final class C23454OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75054OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75055OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0oO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$15$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19321OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75056OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75057OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19321OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19321OooO00o> continuation) {
                super(2, continuation);
                this.f75056OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19321OooO00o c19321OooO00o = new C19321OooO00o(this.f75056OooOo, continuation);
                c19321OooO00o.f75057OooOo0o = obj;
                return c19321OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19321OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                C29947OooO0OO c29947OooO0OO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75057OooOo0o;
                if (c32443OooOOO != null) {
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                    PenBarChildFragment penBarChildFragment = this.f75056OooOo;
                    C29947OooO0OO c29947OooO0OO2 = penBarChildFragment.o0000O0;
                    if (c29947OooO0OO2 != null && c29947OooO0OO2.OooO00o() && (c29947OooO0OO = penBarChildFragment.o0000O0) != null) {
                        InterfaceC29931OooO0O0 interfaceC29931OooO0O0 = c29947OooO0OO.f106335OooO0OO;
                        if (interfaceC29931OooO0O0 == null) {
                            interfaceC29931OooO0O0 = null;
                        }
                        if (interfaceC29931OooO0O0 == null) {
                            interfaceC29931OooO0O0 = c29947OooO0OO.f106334OooO0O0;
                        }
                        if (interfaceC29931OooO0O0 != null) {
                            interfaceC29931OooO0O0.OooO0Oo(zBooleanValue, zBooleanValue2);
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23454OooO0oO(PenBarChildFragment penBarChildFragment, Continuation<? super C23454OooO0oO> continuation) {
            super(2, continuation);
            this.f75054OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23454OooO0oO(this.f75054OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23454OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75055OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75054OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19321OooO00o c19321OooO00o = new C19321OooO00o(penBarChildFragment, null);
                this.f75055OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75167OooOooo, c19321OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$16", m80623f = "PenBarChildFragment.kt", m80624l = {1443}, m80625m = "invokeSuspend")
    public static final class C23455OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75058OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75059OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooO0oo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$16$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19322OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75060OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75061OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19322OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19322OooO00o> continuation) {
                super(2, continuation);
                this.f75060OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19322OooO00o c19322OooO00o = new C19322OooO00o(this.f75060OooOo, continuation);
                c19322OooO00o.f75061OooOo0o = obj;
                return c19322OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19322OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75061OooOo0o;
                boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75060OooOo;
                Integer num = (Integer) penBarChildFragment.Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iIntValue = num.intValue();
                if (zBooleanValue) {
                    View view = penBarChildFragment.f75248OooOooo;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    if (view.getVisibility() != 0) {
                        penBarChildFragment.OoooO00(true, true);
                    }
                }
                if (!zBooleanValue || iIntValue == 0) {
                    penBarChildFragment.f75281o000000 = false;
                    View view2 = penBarChildFragment.f75248OooOooo;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view2.requestFocus();
                } else {
                    penBarChildFragment.f75281o000000 = true;
                    penBarChildFragment.Oooo0oO().OooOO0(0);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23455OooO0oo(PenBarChildFragment penBarChildFragment, Continuation<? super C23455OooO0oo> continuation) {
            super(2, continuation);
            this.f75058OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23455OooO0oo(this.f75058OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23455OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75059OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75058OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19322OooO00o c19322OooO00o = new C19322OooO00o(penBarChildFragment, null);
                this.f75059OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75185OoooOOo, c19322OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$18", m80623f = "PenBarChildFragment.kt", m80624l = {1467}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75062OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75063OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOO0$OooO00o, reason: collision with other inner class name */
        public static final class C19323OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75064OooOo0o;

            public C19323OooO00o(PenBarChildFragment penBarChildFragment) {
                this.f75064OooOo0o = penBarChildFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                o0o00o0.OooO oooOOooO0Oo;
                o0o00o0.OooO oooOOooO0Oo2;
                int i;
                int i2;
                PenExtraVO penExtraVO = (PenExtraVO) obj;
                Integer num = penExtraVO != null ? new Integer(penExtraVO.getType()) : null;
                PenBarChildFragment penBarChildFragment = this.f75064OooOo0o;
                if (num != null && num.intValue() == 3) {
                    String string = penExtraVO.getExtra().getString(C18437z2.f56754h);
                    C29947OooO0OO c29947OooO0OO = penBarChildFragment.o0000O0;
                    if (c29947OooO0OO != null) {
                        c29947OooO0OO.OooO0Oo(string == null ? "" : string);
                    }
                    ImageView imageView = penBarChildFragment.f75265OoooOOO;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserPx");
                        throw null;
                    }
                    imageView.setSelected(false);
                    ImageView imageView2 = penBarChildFragment.f75266OoooOOo;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserStroke");
                        throw null;
                    }
                    imageView2.setSelected(false);
                    ImageView imageView3 = penBarChildFragment.f75267OoooOo0;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserLasso");
                        throw null;
                    }
                    imageView3.setSelected(false);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(string, DrawToolFactory.ERASER_TYPE_PIXEL)) {
                        ImageView imageView4 = penBarChildFragment.f75265OoooOOO;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserPx");
                            throw null;
                        }
                        imageView4.setSelected(true);
                        i2 = R.drawable.ic_ni_toolbox_eraser_type_pixel_selected;
                    } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(string, DrawToolFactory.ERASER_TYPE_STROKE)) {
                        ImageView imageView5 = penBarChildFragment.f75266OoooOOo;
                        if (imageView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserStroke");
                            throw null;
                        }
                        imageView5.setSelected(true);
                        i2 = R.drawable.ic_ni_toolbox_eraser_type_stroke_selected;
                    } else {
                        ImageView imageView6 = penBarChildFragment.f75267OoooOo0;
                        if (imageView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivEraserLasso");
                            throw null;
                        }
                        imageView6.setSelected(true);
                        i2 = R.drawable.ic_ni_toolbox_eraser_type_lasso_selected;
                    }
                    ImageView imageView7 = penBarChildFragment.f75304o00Oo0;
                    if (imageView7 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedEraserType");
                        throw null;
                    }
                    imageView7.setTag(string);
                    Context context = penBarChildFragment.getContext();
                    if (context != null) {
                        imageView7.setImageDrawable(ContextCompat.getDrawable(context, i2));
                    }
                } else {
                    if (num != null && num.intValue() == 4) {
                        int i3 = PenBarChildFragment.f75240o0000OOo;
                        penBarChildFragment.getClass();
                        if (penExtraVO != null && penExtraVO.getType() == 4) {
                            String string2 = penExtraVO.getExtra().getString(C18437z2.f56754h);
                            if (string2 == null) {
                                string2 = DrawToolFactory.LASSO_TYPE_FREE;
                            }
                            ImageView imageView8 = penBarChildFragment.f75272OooooO0;
                            if (imageView8 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoFree");
                                throw null;
                            }
                            imageView8.setSelected(false);
                            ImageView imageView9 = penBarChildFragment.f75273OooooOO;
                            if (imageView9 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoRect");
                                throw null;
                            }
                            imageView9.setSelected(false);
                            ImageView imageView10 = penBarChildFragment.f75274OooooOo;
                            if (imageView10 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoCapture");
                                throw null;
                            }
                            imageView10.setSelected(false);
                            ImageView imageView11 = penBarChildFragment.f75272OooooO0;
                            if (imageView11 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoFree");
                                throw null;
                            }
                            boolean z = penBarChildFragment.f75311o0OO00O;
                            imageView11.setVisibility(z ? 0 : 8);
                            ImageView imageView12 = penBarChildFragment.f75273OooooOO;
                            if (imageView12 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoRect");
                                throw null;
                            }
                            imageView12.setVisibility(z ? 0 : 8);
                            ImageView imageView13 = penBarChildFragment.f75274OooooOo;
                            if (imageView13 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoCapture");
                                throw null;
                            }
                            imageView13.setVisibility(z ? 0 : 8);
                            if (string2.equals(DrawToolFactory.LASSO_TYPE_FREE)) {
                                ImageView imageView14 = penBarChildFragment.f75272OooooO0;
                                if (imageView14 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoFree");
                                    throw null;
                                }
                                imageView14.setSelected(true);
                                ImageView imageView15 = penBarChildFragment.f75272OooooO0;
                                if (imageView15 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoFree");
                                    throw null;
                                }
                                imageView15.setVisibility(0);
                                i = R.drawable.ic_ni_toolbox_lasso_free_selected;
                            } else if (string2.equals(DrawToolFactory.LASSO_TYPE_RECT)) {
                                ImageView imageView16 = penBarChildFragment.f75273OooooOO;
                                if (imageView16 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoRect");
                                    throw null;
                                }
                                imageView16.setSelected(true);
                                ImageView imageView17 = penBarChildFragment.f75273OooooOO;
                                if (imageView17 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoRect");
                                    throw null;
                                }
                                imageView17.setVisibility(0);
                                i = R.drawable.ic_ni_toolbox_lasso_rect_selected;
                            } else {
                                ImageView imageView18 = penBarChildFragment.f75274OooooOo;
                                if (imageView18 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoCapture");
                                    throw null;
                                }
                                imageView18.setSelected(true);
                                ImageView imageView19 = penBarChildFragment.f75274OooooOo;
                                if (imageView19 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLassoCapture");
                                    throw null;
                                }
                                imageView19.setVisibility(0);
                                i = R.drawable.ic_ni_toolbox_lasso_capture_selected;
                            }
                            ImageView imageView20 = penBarChildFragment.f75305o00Ooo;
                            if (imageView20 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedLassoType");
                                throw null;
                            }
                            imageView20.setTag(string2);
                            Context context2 = penBarChildFragment.getContext();
                            if (context2 != null) {
                                imageView20.setImageDrawable(ContextCompat.getDrawable(context2, i));
                            }
                        }
                    } else {
                        if (num != null && num.intValue() == 8) {
                            String string3 = penExtraVO.getExtra().getString(C18437z2.f56754h);
                            int i4 = string3 != null ? Integer.parseInt(string3) : 7;
                            C29953OooOO0o c29953OooOO0o = penBarChildFragment.f75300o000OO;
                            if (c29953OooOO0o != null && (oooOOooO0Oo2 = c29953OooOO0o.OooO0Oo()) != null) {
                                oooOOooO0Oo2.OooO(i4);
                            }
                            C29953OooOO0o c29953OooOO0o2 = penBarChildFragment.f75300o000OO;
                            if (c29953OooOO0o2 != null && (oooOOooO0Oo = c29953OooOO0o2.OooO0Oo()) != null) {
                                oooOOooO0Oo.OooO00o();
                            }
                            List<Integer> list = C29953OooOO0o.f106391OooOO0;
                            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                arrayList.add(new VectorVO(iIntValue, iIntValue == i4));
                            }
                            penBarChildFragment.f75316o0ooOOo.OooO0o0(arrayList, new RunnableC29445OooO0oO(arrayList, penBarChildFragment));
                        } else if (num != null && num.intValue() == 7) {
                            String string4 = penExtraVO.getExtra().getString(C18437z2.f56754h);
                            C29949OooO0o c29949OooO0o = penBarChildFragment.f75291o0000O;
                            if (c29949OooO0o != null) {
                                if (string4 == null) {
                                    string4 = "line";
                                }
                                InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo();
                                if (interfaceC29932OooO0OOOooO0Oo != null) {
                                    interfaceC29932OooO0OOOooO0Oo.OooO0o0(string4);
                                }
                            }
                            new Integer((int) penExtraVO.getExtra().getDouble(PenInfo.LASER_DISAPPEAR_DURATION));
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PenBarChildFragment penBarChildFragment, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f75062OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0(this.f75062OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75063OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75062OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19323OooO00o c19323OooO00o = new C19323OooO00o(penBarChildFragment);
                this.f75063OooOo0o = 1;
                if (oooO0O0Oooo0oO.f75194Oooooo.f121747OooOo0o.collect(c19323OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$19", m80623f = "PenBarChildFragment.kt", m80624l = {1525}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75065OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75066OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOO0O$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$19$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19324OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75067OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75068OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19324OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19324OooO00o> continuation) {
                super(2, continuation);
                this.f75067OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19324OooO00o c19324OooO00o = new C19324OooO00o(this.f75067OooOo, continuation);
                c19324OooO00o.f75068OooOo0o = obj;
                return c19324OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends PenVO> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19324OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Bundle extra;
                String string;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75068OooOo0o;
                boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                PenVO penVO = (PenVO) c32443OooOOO.f116637OooOo;
                PenBarChildFragment penBarChildFragment = this.f75067OooOo;
                ConstraintLayout constraintLayout = penBarChildFragment.f75276Oooooo0;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clVector");
                    throw null;
                }
                constraintLayout.setVisibility(zBooleanValue ? 0 : 8);
                if (zBooleanValue) {
                    int i = (penVO == null || (extra = penVO.getExtra()) == null || (string = extra.getString(C18437z2.f56754h)) == null) ? 7 : Integer.parseInt(string);
                    List<Integer> list = C29953OooOO0o.f106391OooOO0;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        arrayList.add(new VectorVO(iIntValue, i == iIntValue));
                    }
                    penBarChildFragment.f75316o0ooOOo.OooO0o0(arrayList, new RunnableC29445OooO0oO(arrayList, penBarChildFragment));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PenBarChildFragment penBarChildFragment, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f75065OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0O(this.f75065OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75066OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75065OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19324OooO00o c19324OooO00o = new C19324OooO00o(penBarChildFragment, null);
                this.f75066OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75177Oooo0oO, c19324OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$2", m80623f = "PenBarChildFragment.kt", m80624l = {1258}, m80625m = "invokeSuspend")
    public static final class C23456OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75069OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75070OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOO0o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$2$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19325OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, Integer, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Integer>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ int f75071OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Boolean f75072OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Boolean bool, Integer num, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Integer>> continuation) {
                int iIntValue = num.intValue();
                C19325OooO00o c19325OooO00o = new C19325OooO00o(3, continuation);
                c19325OooO00o.f75072OooOo0o = bool;
                c19325OooO00o.f75071OooOo = iIntValue;
                return c19325OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return new C32443OooOOO(this.f75072OooOo0o, new Integer(this.f75071OooOo));
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOO0o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$2$2", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75073OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75074OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75073OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f75073OooOo, continuation);
                oooO0O0.f75074OooOo0o = obj;
                return oooO0O0;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75074OooOo0o;
                Boolean bool = (Boolean) c32443OooOOO.f116638OooOo0o;
                int iIntValue = ((Number) c32443OooOOO.f116637OooOo).intValue();
                if (bool == null || iIntValue != 3) {
                    return C32460OooOooO.f116667OooO00o;
                }
                boolean zBooleanValue = bool.booleanValue();
                int i = PenBarChildFragment.f75240o0000OOo;
                this.f75073OooOo.OoooO00(zBooleanValue, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23456OooOO0o(PenBarChildFragment penBarChildFragment, Continuation<? super C23456OooOO0o> continuation) {
            super(2, continuation);
            this.f75069OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23456OooOO0o(this.f75069OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23456OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75070OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75069OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBarChildFragment.Oooo00O();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0OOOooo00O.f73373OooOoo, oooO0O0Oooo0oO.f75154OooOOo0, new C19325OooO00o(3, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBarChildFragment, null);
                this.f75070OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$21", m80623f = "PenBarChildFragment.kt", m80624l = {1544}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75075OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75076OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOO$OooO00o, reason: collision with other inner class name */
        public static final class C19326OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75077OooOo0o;

            public C19326OooO00o(PenBarChildFragment penBarChildFragment) {
                this.f75077OooOo0o = penBarChildFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ImageView imageView = this.f75077OooOo0o.f75264OoooOO0;
                if (imageView != null) {
                    imageView.setSelected(zBooleanValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("ivStarColor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(PenBarChildFragment penBarChildFragment, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f75075OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOO(this.f75075OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75076OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75075OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19326OooO00o c19326OooO00o = new C19326OooO00o(penBarChildFragment);
                this.f75076OooOo0o = 1;
                if (oooO0O0Oooo0oO.f75200o00Oo0.f121747OooOo0o.collect(c19326OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$20", m80623f = "PenBarChildFragment.kt", m80624l = {1538}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75078OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75079OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOO0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$20$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19327OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75080OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75081OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19327OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19327OooO00o> continuation) {
                super(2, continuation);
                this.f75080OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19327OooO00o c19327OooO00o = new C19327OooO00o(this.f75080OooOo, continuation);
                c19327OooO00o.f75081OooOo0o = ((Boolean) obj).booleanValue();
                return c19327OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19327OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75081OooOo0o;
                ConstraintLayout constraintLayout = this.f75080OooOo.f75270Ooooo00;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(z ? 0 : 8);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("clPenWidth");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(PenBarChildFragment penBarChildFragment, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f75078OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOO0(this.f75078OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75079OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75078OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19327OooO00o c19327OooO00o = new C19327OooO00o(penBarChildFragment, null);
                this.f75079OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75178Oooo0oo, c19327OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$22", m80623f = "PenBarChildFragment.kt", m80624l = {1550}, m80625m = "invokeSuspend")
    public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75082OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75083OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOOO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$22$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19328OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31045OooOOo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75084OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75085OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19328OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19328OooO00o> continuation) {
                super(2, continuation);
                this.f75084OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19328OooO00o c19328OooO00o = new C19328OooO00o(this.f75084OooOo, continuation);
                c19328OooO00o.f75085OooOo0o = obj;
                return c19328OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31045OooOOo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19328OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C31045OooOOo> list = (List) this.f75085OooOo0o;
                C29949OooO0o c29949OooO0o = this.f75084OooOo.f75291o0000O;
                if (c29949OooO0o != null) {
                    c29949OooO0o.OooO0o(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(PenBarChildFragment penBarChildFragment, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f75082OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOOO(this.f75082OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75083OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75082OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19328OooO00o c19328OooO00o = new C19328OooO00o(penBarChildFragment, null);
                this.f75083OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75196OoooooO, c19328OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$23", m80623f = "PenBarChildFragment.kt", m80624l = {1556}, m80625m = "invokeSuspend")
    public static final class C23457OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75086OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75087OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOOo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$23$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19329OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75088OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75089OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19329OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19329OooO00o> continuation) {
                super(2, continuation);
                this.f75088OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19329OooO00o c19329OooO00o = new C19329OooO00o(this.f75088OooOo, continuation);
                c19329OooO00o.f75089OooOo0o = ((Boolean) obj).booleanValue();
                return c19329OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19329OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75089OooOo0o;
                PenBarChildFragment penBarChildFragment = this.f75088OooOo;
                C29950OooO0o0 c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo;
                if (c29950OooO0o0 != null) {
                    c29950OooO0o0.OooO0o0(z);
                }
                C29948OooO0Oo c29948OooO0Oo = penBarChildFragment.f75299o0000oo;
                if (c29948OooO0Oo != null) {
                    c29948OooO0Oo.OooO0o0(z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23457OooOOOo(PenBarChildFragment penBarChildFragment, Continuation<? super C23457OooOOOo> continuation) {
            super(2, continuation);
            this.f75086OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23457OooOOOo(this.f75086OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23457OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75087OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75086OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19329OooO00o c19329OooO00o = new C19329OooO00o(penBarChildFragment, null);
                this.f75087OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75191OooooO0, c19329OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$25", m80623f = "PenBarChildFragment.kt", m80624l = {1572}, m80625m = "invokeSuspend")
    public static final class C23458OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75090OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75091OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$25$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19330OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Float, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75092OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ float f75093OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19330OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19330OooO00o> continuation) {
                super(2, continuation);
                this.f75092OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19330OooO00o c19330OooO00o = new C19330OooO00o(this.f75092OooOo, continuation);
                c19330OooO00o.f75093OooOo0o = ((Number) obj).floatValue();
                return c19330OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Float f, Continuation<? super C32460OooOooO> continuation) {
                return ((C19330OooO00o) create(Float.valueOf(f.floatValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                float f = this.f75093OooOo0o;
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75092OooOo;
                boolean zBooleanValue = ((Boolean) penBarChildFragment.Oooo0oO().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue();
                int i2 = (int) (f * 100);
                C29953OooOO0o c29953OooOO0o = penBarChildFragment.f75300o000OO;
                if (c29953OooOO0o != null) {
                    c29953OooOO0o.OooO0o0(i2, zBooleanValue);
                }
                C29950OooO0o0 c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo;
                if (c29950OooO0o0 != null) {
                    c29950OooO0o0.OooO0o(i2, zBooleanValue);
                }
                C29948OooO0Oo c29948OooO0Oo = penBarChildFragment.f75299o0000oo;
                if (c29948OooO0Oo != null) {
                    c29948OooO0Oo.OooO0o(i2, zBooleanValue);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23458OooOOo(PenBarChildFragment penBarChildFragment, Continuation<? super C23458OooOOo> continuation) {
            super(2, continuation);
            this.f75090OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23458OooOOo(this.f75090OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23458OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75091OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75090OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19330OooO00o c19330OooO00o = new C19330OooO00o(penBarChildFragment, null);
                this.f75091OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75182OoooO0O, c19330OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$24", m80623f = "PenBarChildFragment.kt", m80624l = {1563}, m80625m = "invokeSuspend")
    public static final class C23459OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75094OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75095OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOo0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$24$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19331OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75096OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75097OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19331OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19331OooO00o> continuation) {
                super(2, continuation);
                this.f75096OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19331OooO00o c19331OooO00o = new C19331OooO00o(this.f75096OooOo, continuation);
                c19331OooO00o.f75097OooOo0o = ((Boolean) obj).booleanValue();
                return c19331OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19331OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75097OooOo0o;
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75096OooOo;
                int iFloatValue = (int) (((Number) penBarChildFragment.Oooo0oO().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100);
                C29953OooOO0o c29953OooOO0o = penBarChildFragment.f75300o000OO;
                if (c29953OooOO0o != null) {
                    c29953OooOO0o.OooO0o0(iFloatValue, z);
                }
                C29950OooO0o0 c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo;
                if (c29950OooO0o0 != null) {
                    c29950OooO0o0.OooO0o(iFloatValue, z);
                }
                C29948OooO0Oo c29948OooO0Oo = penBarChildFragment.f75299o0000oo;
                if (c29948OooO0Oo != null) {
                    c29948OooO0Oo.OooO0o(iFloatValue, z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23459OooOOo0(PenBarChildFragment penBarChildFragment, Continuation<? super C23459OooOOo0> continuation) {
            super(2, continuation);
            this.f75094OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23459OooOOo0(this.f75094OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23459OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75095OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75094OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19331OooO00o c19331OooO00o = new C19331OooO00o(penBarChildFragment, null);
                this.f75095OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75180OoooO0, c19331OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOoo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$26", m80623f = "PenBarChildFragment.kt", m80624l = {1582}, m80625m = "invokeSuspend")
    public static final class C23460OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75098OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75099OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOOoo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$26$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19332OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75100OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f75101OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19332OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19332OooO00o> continuation) {
                super(2, continuation);
                this.f75100OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19332OooO00o c19332OooO00o = new C19332OooO00o(this.f75100OooOo, continuation);
                c19332OooO00o.f75101OooOo0o = ((Boolean) obj).booleanValue();
                return c19332OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19332OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f75101OooOo0o;
                o0o00Ooo.OooOO0 oooOO02 = this.f75100OooOo.f75298o0000oO;
                if (oooOO02 != null) {
                    oooOO02.OooO0o0(z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23460OooOOoo(PenBarChildFragment penBarChildFragment, Continuation<? super C23460OooOOoo> continuation) {
            super(2, continuation);
            this.f75098OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23460OooOOoo(this.f75098OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23460OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75099OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75098OooOo;
                C26320o0000OoO c26320o0000OoOOooo0o = penBarChildFragment.Oooo0o();
                C19332OooO00o c19332OooO00o = new C19332OooO00o(penBarChildFragment, null);
                this.f75099OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooo0o.f90249OoooOOo, c19332OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$4", m80623f = "PenBarChildFragment.kt", m80624l = {1287}, m80625m = "invokeSuspend")
    public static final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75102OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75103OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$4$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19333OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<PenVO, Continuation<? super C32460OooOooO>, Object> {
            public C19333OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19333OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(PenVO penVO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19333OooO00o) create(penVO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(PenBarChildFragment penBarChildFragment, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f75102OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOo(this.f75102OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75103OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = this.f75102OooOo.Oooo0oO();
                C19333OooO00o c19333OooO00o = new C19333OooO00o(2, null);
                this.f75103OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75176Oooo0o0, c19333OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$28", m80623f = "PenBarChildFragment.kt", m80624l = {1605}, m80625m = "invokeSuspend")
    public static final class C23461OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75104OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75105OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$28$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19334OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75106OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75107OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19334OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19334OooO00o> continuation) {
                super(2, continuation);
                this.f75106OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19334OooO00o c19334OooO00o = new C19334OooO00o(this.f75106OooOo, continuation);
                c19334OooO00o.f75107OooOo0o = obj;
                return c19334OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C19334OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Integer num = (Integer) this.f75107OooOo0o;
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iIntValue = num.intValue();
                int i = PenBarChildFragment.f75240o0000OOo;
                this.f75106OooOo.Oooo0oo(iIntValue, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23461OooOo0(PenBarChildFragment penBarChildFragment, Continuation<? super C23461OooOo0> continuation) {
            super(2, continuation);
            this.f75104OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23461OooOo0(this.f75104OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23461OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75105OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75104OooOo;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(penBarChildFragment.Oooo0oO().f75157OooOo0, 200L);
                C19334OooO00o c19334OooO00o = new C19334OooO00o(penBarChildFragment, null);
                this.f75105OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, c19334OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$27", m80623f = "PenBarChildFragment.kt", m80624l = {1593}, m80625m = "invokeSuspend")
    public static final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75108OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75109OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo00$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$27$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19335OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Insets, Integer, Continuation<? super C32443OooOOO<? extends Insets, ? extends Integer>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Integer f75110OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Insets f75111OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Insets insets, Integer num, Continuation<? super C32443OooOOO<? extends Insets, ? extends Integer>> continuation) {
                C19335OooO00o c19335OooO00o = new C19335OooO00o(3, continuation);
                c19335OooO00o.f75111OooOo0o = insets;
                c19335OooO00o.f75110OooOo = num;
                return c19335OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return new C32443OooOOO(this.f75111OooOo0o, this.f75110OooOo);
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$27$2", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Insets, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75112OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75113OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBarChildFragment penBarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75112OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f75112OooOo, continuation);
                oooO0O0.f75113OooOo0o = obj;
                return oooO0O0;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Insets, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75113OooOo0o;
                Integer num = (Integer) c32443OooOOO.f116637OooOo;
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iIntValue = num.intValue();
                int i = PenBarChildFragment.f75240o0000OOo;
                this.f75112OooOo.Oooo(iIntValue, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(PenBarChildFragment penBarChildFragment, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f75108OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOo00(this.f75108OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75109OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75108OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBarChildFragment.Oooo00O();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0OOOooo00O.f73365OooOo, oooO0O0Oooo0oO.f75160OooOo0o, new C19335OooO00o(3, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBarChildFragment, null);
                this.f75109OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo0O, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$29", m80623f = "PenBarChildFragment.kt", m80624l = {1616}, m80625m = "invokeSuspend")
    public static final class C23462OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75114OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75115OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo0O$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$29$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19336OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0O0.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75116OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75117OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19336OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19336OooO00o> continuation) {
                super(2, continuation);
                this.f75116OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19336OooO00o c19336OooO00o = new C19336OooO00o(this.f75116OooOo, continuation);
                c19336OooO00o.f75117OooOo0o = obj;
                return c19336OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0O0.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19336OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) this.f75117OooOo0o;
                if (oooO00o == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int i = PenBarChildFragment.f75240o0000OOo;
                this.f75116OooOo.OoooO0(oooO00o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23462OooOo0O(PenBarChildFragment penBarChildFragment, Continuation<? super C23462OooOo0O> continuation) {
            super(2, continuation);
            this.f75114OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23462OooOo0O(this.f75114OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23462OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75115OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75114OooOo;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(penBarChildFragment.Oooo0oO().f75155OooOOoo, 200L);
                C19336OooO00o c19336OooO00o = new C19336OooO00o(penBarChildFragment, null);
                this.f75115OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, c19336OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$3", m80623f = "PenBarChildFragment.kt", m80624l = {1267}, m80625m = "invokeSuspend")
    public static final class C23463OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75118OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75119OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOo0o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$3$1", m80623f = "PenBarChildFragment.kt", m80624l = {1275, 1281}, m80625m = "invokeSuspend")
        public static final class C19337OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f75120OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75121OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75122OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19337OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19337OooO00o> continuation) {
                super(2, continuation);
                this.f75122OooOoO0 = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19337OooO00o c19337OooO00o = new C19337OooO00o(this.f75122OooOoO0, continuation);
                c19337OooO00o.f75120OooOo = obj;
                return c19337OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19337OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
            
                if (r12 == r0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
            
                if (r12.OooOOO(r1, true, r11) == r0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
            
                return r0;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List list;
                Object next;
                boolean zBooleanValue;
                Object next2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75121OooOo0o;
                final PenBarChildFragment penBarChildFragment = this.f75122OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    list = (List) this.f75120OooOo;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((PenVO) next).getSelected()) {
                            break;
                        }
                    }
                    PenVO penVO = (PenVO) next;
                    if (penVO != null) {
                        final int iOooO0o = penBarChildFragment.f75308o00oO0o.OooO0o(penVO);
                        final int iOooO0oO = penBarChildFragment.f75308o00oO0o.OooO0oO(penVO);
                        final int color = penVO.getColor();
                        final int type = penVO.getType();
                        new oO0O000o.OooO00o() { // from class: o0Ooo0oo.OooOOOO
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                PenBarChildFragment penBarChildFragment2 = penBarChildFragment;
                                ImageView imageView = penBarChildFragment2.f75254Oooo0O0;
                                if (imageView == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIcon");
                                    throw null;
                                }
                                imageView.setImageResource(iOooO0o);
                                ImageView imageView2 = penBarChildFragment2.f75255Oooo0OO;
                                if (imageView2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxTapePenTint");
                                    throw null;
                                }
                                int i2 = type;
                                imageView2.setVisibility(i2 == 11 ? 0 : 8);
                                int i3 = iOooO0oO;
                                if (i3 != 0) {
                                    ImageView imageView3 = penBarChildFragment2.f75257Oooo0o0;
                                    if (imageView3 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconTint");
                                        throw null;
                                    }
                                    imageView3.setImageResource(i3);
                                    ImageView imageView4 = penBarChildFragment2.f75257Oooo0o0;
                                    if (imageView4 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconTint");
                                        throw null;
                                    }
                                    int i4 = color;
                                    imageView4.setColorFilter(C24969OooOO0.OooO0OO(i4));
                                    ImageView imageView5 = penBarChildFragment2.f75257Oooo0o0;
                                    if (imageView5 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconTint");
                                        throw null;
                                    }
                                    imageView5.setVisibility(0);
                                    if (i2 == 11) {
                                        ImageView imageView6 = penBarChildFragment2.f75257Oooo0o0;
                                        if (imageView6 == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconTint");
                                            throw null;
                                        }
                                        imageView6.clearColorFilter();
                                        ImageView imageView7 = penBarChildFragment2.f75255Oooo0OO;
                                        if (imageView7 == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxTapePenTint");
                                            throw null;
                                        }
                                        imageView7.setColorFilter(C24969OooOO0.OooO0OO(i4));
                                    }
                                } else {
                                    ImageView imageView8 = penBarChildFragment2.f75257Oooo0o0;
                                    if (imageView8 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconTint");
                                        throw null;
                                    }
                                    imageView8.setVisibility(8);
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                        }.invoke();
                    }
                    if (penVO == null) {
                        zBooleanValue = true;
                        if (zBooleanValue) {
                            int i2 = PenBarChildFragment.f75240o0000OOo;
                            Iterator it2 = ((List) penBarChildFragment.Oooo0oO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                if (((PenVO) next2).getType() == 0) {
                                    break;
                                }
                            }
                            PenVO penVO2 = (PenVO) next2;
                            if (penVO2 == null) {
                                return C32460OooOooO.f116667OooO00o;
                            }
                            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                            this.f75120OooOo = null;
                            this.f75121OooOo0o = 2;
                        } else {
                            penBarChildFragment.f75308o00oO0o.OooO0Oo(list);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f75120OooOo = list;
                    this.f75121OooOo0o = 1;
                    obj = PenBarChildFragment.OooOoO(penBarChildFragment, penVO, this);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    list = (List) this.f75120OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23463OooOo0o(PenBarChildFragment penBarChildFragment, Continuation<? super C23463OooOo0o> continuation) {
            super(2, continuation);
            this.f75118OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23463OooOo0o(this.f75118OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23463OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75119OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75118OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19337OooO00o c19337OooO00o = new C19337OooO00o(penBarChildFragment, null);
                this.f75119OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75174Oooo0OO, c19337OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$6", m80623f = "PenBarChildFragment.kt", m80624l = {1295}, m80625m = "invokeSuspend")
    public static final class C23464OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75123OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75124OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$6$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19338OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {
            public C19338OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19338OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19338OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23464OooOoO(PenBarChildFragment penBarChildFragment, Continuation<? super C23464OooOoO> continuation) {
            super(2, continuation);
            this.f75123OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23464OooOoO(this.f75123OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23464OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75124OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = this.f75123OooOo.Oooo0oO();
                C19338OooO00o c19338OooO00o = new C19338OooO00o(2, null);
                this.f75124OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75169Oooo0, c19338OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoO0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$5", m80623f = "PenBarChildFragment.kt", m80624l = {1291}, m80625m = "invokeSuspend")
    public static final class C23465OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75125OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75126OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoO0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$5$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19339OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {
            public C19339OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19339OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19339OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23465OooOoO0(PenBarChildFragment penBarChildFragment, Continuation<? super C23465OooOoO0> continuation) {
            super(2, continuation);
            this.f75125OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23465OooOoO0(this.f75125OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23465OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75126OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = this.f75125OooOo.Oooo0oO();
                C19339OooO00o c19339OooO00o = new C19339OooO00o(2, null);
                this.f75126OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75172Oooo00o, c19339OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoOO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$7", m80623f = "PenBarChildFragment.kt", m80624l = {1299}, m80625m = "invokeSuspend")
    public static final class C23466OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75127OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75128OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoOO$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$7$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19340OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {
            public C19340OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19340OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19340OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23466OooOoOO(PenBarChildFragment penBarChildFragment, Continuation<? super C23466OooOoOO> continuation) {
            super(2, continuation);
            this.f75127OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23466OooOoOO(this.f75127OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23466OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75128OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = this.f75127OooOo.Oooo0oO();
                C19340OooO00o c19340OooO00o = new C19340OooO00o(2, null);
                this.f75128OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75173Oooo0O0, c19340OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$9", m80623f = "PenBarChildFragment.kt", m80624l = {1325}, m80625m = "invokeSuspend")
    public static final class C23467OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75129OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75130OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoo$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$9$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19341OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends FavoritePenVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75131OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19341OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19341OooO00o> continuation) {
                super(2, continuation);
                this.f75131OooOo0o = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19341OooO00o(this.f75131OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends FavoritePenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19341OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                o0o00o0O.OooO oooO;
                C29949OooO0o c29949OooO0o;
                InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo;
                C29953OooOO0o c29953OooOO0o;
                o0o00o0.OooO oooOOooO0Oo;
                C29951OooO0oO c29951OooO0oO;
                C29947OooO0OO c29947OooO0OO;
                o0o00o0O.OooOO0O oooOO0O;
                C29948OooO0Oo c29948OooO0Oo;
                InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo;
                C29950OooO0o0 c29950OooO0o0;
                InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                PenBarChildFragment penBarChildFragment = this.f75131OooOo0o;
                C29950OooO0o0 c29950OooO0o02 = penBarChildFragment.f75297o0000Ooo;
                if (c29950OooO0o02 != null && c29950OooO0o02.OooO00o() && (c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo) != null && (interfaceC29934OooO0oOooO0Oo2 = c29950OooO0o0.OooO0Oo()) != null) {
                    interfaceC29934OooO0oOooO0Oo2.OooO00o();
                }
                C29948OooO0Oo c29948OooO0Oo2 = penBarChildFragment.f75299o0000oo;
                if (c29948OooO0Oo2 != null && c29948OooO0Oo2.OooO00o() && (c29948OooO0Oo = penBarChildFragment.f75299o0000oo) != null && (interfaceC29934OooO0oOooO0Oo = c29948OooO0Oo.OooO0Oo()) != null) {
                    interfaceC29934OooO0oOooO0Oo.OooO00o();
                }
                o0o00o0O.OooOO0O oooOO0O2 = penBarChildFragment.f75290o00000oo;
                if (oooOO0O2 != null && oooOO0O2.OooO00o() && (oooOO0O = penBarChildFragment.f75290o00000oo) != null) {
                    InterfaceC29934OooO0o interfaceC29934OooO0o = oooOO0O.f106387OooO0OO;
                    if (interfaceC29934OooO0o == null) {
                        interfaceC29934OooO0o = null;
                    }
                    if (interfaceC29934OooO0o == null) {
                        interfaceC29934OooO0o = oooOO0O.f106386OooO0O0;
                    }
                    if (interfaceC29934OooO0o != null) {
                        interfaceC29934OooO0o.OooO00o();
                    }
                }
                C29947OooO0OO c29947OooO0OO2 = penBarChildFragment.o0000O0;
                if (c29947OooO0OO2 != null && c29947OooO0OO2.OooO00o() && (c29947OooO0OO = penBarChildFragment.o0000O0) != null) {
                    InterfaceC29931OooO0O0 interfaceC29931OooO0O0 = c29947OooO0OO.f106335OooO0OO;
                    if (interfaceC29931OooO0O0 == null) {
                        interfaceC29931OooO0O0 = null;
                    }
                    if (interfaceC29931OooO0O0 == null) {
                        interfaceC29931OooO0O0 = c29947OooO0OO.f106334OooO0O0;
                    }
                    if (interfaceC29931OooO0O0 != null) {
                        interfaceC29931OooO0O0.OooO00o();
                    }
                }
                C29951OooO0oO c29951OooO0oO2 = penBarChildFragment.f75293o0000O0O;
                if (c29951OooO0oO2 != null && c29951OooO0oO2.OooO00o() && (c29951OooO0oO = penBarChildFragment.f75293o0000O0O) != null) {
                    InterfaceC29933OooO0Oo interfaceC29933OooO0Oo = c29951OooO0oO.f106367OooO0OO;
                    if (interfaceC29933OooO0Oo == null) {
                        interfaceC29933OooO0Oo = null;
                    }
                    if (interfaceC29933OooO0Oo == null) {
                        interfaceC29933OooO0Oo = c29951OooO0oO.f106366OooO0O0;
                    }
                    if (interfaceC29933OooO0Oo != null) {
                        interfaceC29933OooO0Oo.OooO00o();
                    }
                }
                C29953OooOO0o c29953OooOO0o2 = penBarChildFragment.f75300o000OO;
                if (c29953OooOO0o2 != null && c29953OooOO0o2.OooO00o() && (c29953OooOO0o = penBarChildFragment.f75300o000OO) != null && (oooOOooO0Oo = c29953OooOO0o.OooO0Oo()) != null) {
                    oooOOooO0Oo.OooO00o();
                }
                C29949OooO0o c29949OooO0o2 = penBarChildFragment.f75291o0000O;
                if (c29949OooO0o2 != null && c29949OooO0o2.OooO00o() && (c29949OooO0o = penBarChildFragment.f75291o0000O) != null && (interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo()) != null) {
                    interfaceC29932OooO0OOOooO0Oo.OooO00o();
                }
                o0o00o0O.OooO oooO2 = penBarChildFragment.f75292o0000O00;
                if (oooO2 != null && oooO2.OooO00o() && (oooO = penBarChildFragment.f75292o0000O00) != null) {
                    PencilGroupSettingsBottomSheetDialog pencilGroupSettingsBottomSheetDialog = oooO.f106327OooO0o0;
                    InterfaceC29934OooO0o interfaceC29934OooO0o2 = pencilGroupSettingsBottomSheetDialog != null ? pencilGroupSettingsBottomSheetDialog : null;
                    if (interfaceC29934OooO0o2 == null) {
                        interfaceC29934OooO0o2 = oooO.f106326OooO0o;
                    }
                    if (interfaceC29934OooO0o2 != null) {
                        interfaceC29934OooO0o2.OooO00o();
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23467OooOoo(PenBarChildFragment penBarChildFragment, Continuation<? super C23467OooOoo> continuation) {
            super(2, continuation);
            this.f75129OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23467OooOoo(this.f75129OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23467OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75130OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75129OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19341OooO00o c19341OooO00o = new C19341OooO00o(penBarChildFragment, null);
                this.f75130OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75205ooOO, c19341OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$8", m80623f = "PenBarChildFragment.kt", m80624l = {1303}, m80625m = "invokeSuspend")
    public static final class C23468OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBarChildFragment f75132OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75133OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO00o$OooOoo0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$onViewInitialed$1$8$1", m80623f = "PenBarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19342OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenWidthVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75134OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75135OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19342OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super C19342OooO00o> continuation) {
                super(2, continuation);
                this.f75134OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19342OooO00o c19342OooO00o = new C19342OooO00o(this.f75134OooOo, continuation);
                c19342OooO00o.f75135OooOo0o = obj;
                return c19342OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenWidthVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19342OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object next;
                o0o00o0O.OooO oooO;
                o0o00o0O.OooOO0O oooOO0O;
                C29948OooO0Oo c29948OooO0Oo;
                InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo;
                C29950OooO0o0 c29950OooO0o0;
                InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) this.f75135OooOo0o;
                PenBarChildFragment penBarChildFragment = this.f75134OooOo;
                penBarChildFragment.f75315o0ooOO0.OooO0Oo(list);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((PenWidthVO) next).getSelected()) {
                        break;
                    }
                }
                PenWidthVO penWidthVO = (PenWidthVO) next;
                if (penWidthVO != null) {
                    C29950OooO0o0 c29950OooO0o02 = penBarChildFragment.f75297o0000Ooo;
                    if (c29950OooO0o02 != null && c29950OooO0o02.OooO00o() && (c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo) != null && (interfaceC29934OooO0oOooO0Oo2 = c29950OooO0o0.OooO0Oo()) != null) {
                        interfaceC29934OooO0oOooO0Oo2.OooOOOO(penWidthVO);
                    }
                    C29948OooO0Oo c29948OooO0Oo2 = penBarChildFragment.f75299o0000oo;
                    if (c29948OooO0Oo2 != null && c29948OooO0Oo2.OooO00o() && (c29948OooO0Oo = penBarChildFragment.f75299o0000oo) != null && (interfaceC29934OooO0oOooO0Oo = c29948OooO0Oo.OooO0Oo()) != null) {
                        interfaceC29934OooO0oOooO0Oo.OooOOOO(penWidthVO);
                    }
                    o0o00o0O.OooOO0O oooOO0O2 = penBarChildFragment.f75290o00000oo;
                    if (oooOO0O2 != null && oooOO0O2.OooO00o() && (oooOO0O = penBarChildFragment.f75290o00000oo) != null) {
                        InterfaceC29934OooO0o interfaceC29934OooO0o = oooOO0O.f106387OooO0OO;
                        if (interfaceC29934OooO0o == null) {
                            interfaceC29934OooO0o = null;
                        }
                        if (interfaceC29934OooO0o == null) {
                            interfaceC29934OooO0o = oooOO0O.f106386OooO0O0;
                        }
                        if (interfaceC29934OooO0o != null) {
                            interfaceC29934OooO0o.OooOOOO(penWidthVO);
                        }
                    }
                    o0o00o0O.OooO oooO2 = penBarChildFragment.f75292o0000O00;
                    if (oooO2 != null && oooO2.OooO00o() && (oooO = penBarChildFragment.f75292o0000O00) != null) {
                        InterfaceC29934OooO0o interfaceC29934OooO0o2 = oooO.f106327OooO0o0;
                        if (interfaceC29934OooO0o2 == null) {
                            interfaceC29934OooO0o2 = null;
                        }
                        if (interfaceC29934OooO0o2 == null) {
                            interfaceC29934OooO0o2 = oooO.f106326OooO0o;
                        }
                        if (interfaceC29934OooO0o2 != null) {
                            interfaceC29934OooO0o2.OooOOOO(penWidthVO);
                        }
                    }
                    int iMin = Math.min((int) o000000O.OooO0Oo(penWidthVO.getWidthInMillimetre()), o000000O.OooO0o(18));
                    int color = penWidthVO.getType() == 3 ? ContextCompat.getColor(penBarChildFragment.requireContext(), R.color.toolbox_pen_width_un_selected_bg_color) : penWidthVO.getColor();
                    ImageView imageView = penBarChildFragment.f75320ooOO;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedPenWidth");
                        throw null;
                    }
                    Drawable drawableMutate = DrawableCompat.wrap(imageView.getDrawable()).mutate();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
                    gradientDrawable.setColor(color);
                    gradientDrawable.setSize(iMin, iMin);
                    TextView textView = penBarChildFragment.f75303o00O0O;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvSelectedPenWidth");
                        throw null;
                    }
                    textView.setText(penWidthVO.getType() == 3 ? String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVO.getWidthInMillimetre())}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVO.getWidthInMillimetre())}, 1)));
                    ConstraintLayout constraintLayout = penBarChildFragment.f75314o0OoOo0;
                    if (constraintLayout == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clSelectedPenWidth");
                        throw null;
                    }
                    constraintLayout.setTag(penWidthVO);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23468OooOoo0(PenBarChildFragment penBarChildFragment, Continuation<? super C23468OooOoo0> continuation) {
            super(2, continuation);
            this.f75132OooOo = penBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23468OooOoo0(this.f75132OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23468OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75133OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f75132OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                C19342OooO00o c19342OooO00o = new C19342OooO00o(penBarChildFragment, null);
                this.f75133OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0oO.f75193OooooOo, c19342OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f75020OooOo = penBarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO00o oooO00o = new OooO00o(this.f75020OooOo, continuation);
        oooO00o.f75021OooOo0o = obj;
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
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75021OooOo0o;
        PenBarChildFragment penBarChildFragment = this.f75020OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19314OooO00o(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23456OooOO0o(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23463OooOo0o(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23465OooOoO0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23464OooOoO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23466OooOoOO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23468OooOoo0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23467OooOoo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23452OooO0Oo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23453OooO0o0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23454OooO0oO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23455OooO0oo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOOO(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23457OooOOOo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23459OooOOo0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23458OooOOo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23460OooOOoo(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOo00(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23461OooOo0(penBarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23462OooOo0O(penBarChildFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
