package o0Ooo;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.Insets;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.LassoSettingsBottomSheetDialog;
import com.orion.notein.p607ui.noteeditor.toolbox.bottomsheet.PencilGroupSettingsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenExtraVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo00oO.C28038OooO0Oo;
import o0o00Oo.C29906OooOOoo;
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
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33762OoooOO0;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29286Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103828OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f103829OooOo0o;

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$17", m80623f = "PenBoxChildFragment.kt", m80624l = {1259}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103830OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103831OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$17$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f103830OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO(this.f103830OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103831OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = this.f103830OooOo.Oooo0o();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f103831OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75195Oooooo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$1", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.ITALIAN_ITALY}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103832OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103833OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$1$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19978OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103834OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103835OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19978OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super C19978OooO00o> continuation) {
                super(2, continuation);
                this.f103834OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19978OooO00o c19978OooO00o = new C19978OooO00o(this.f103834OooOo, continuation);
                c19978OooO00o.f103835OooOo0o = obj;
                return c19978OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                return ((C19978OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                String str = (String) this.f103835OooOo0o;
                int i = PenBoxChildFragment.f75355o0000Ooo;
                this.f103834OooOo.Oooo0o().OooOOo(str, true);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103832OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103832OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103833OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103832OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBoxChildFragment.Oooo00O();
                C19978OooO00o c19978OooO00o = new C19978OooO00o(penBoxChildFragment, null);
                this.f103833OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73397OoooOoo, c19978OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$10", m80623f = "PenBoxChildFragment.kt", m80624l = {1193}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103836OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103837OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$10$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29920OooO0oo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103838OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103839OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103838OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103838OooOo, continuation);
                oooO00o.f103839OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C29920OooO0oo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C29920OooO0oo> list = (List) this.f103839OooOo0o;
                o0o00Ooo.OooOO0 oooOO02 = this.f103838OooOo.f75395o000000o;
                if (oooOO02 != null) {
                    oooOO02.OooOO0(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f103836OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f103836OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103837OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103836OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103837OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75190Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$11", m80623f = "PenBoxChildFragment.kt", m80624l = {1199}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103840OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103841OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$11$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103842OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103843OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103842OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103842OooOo, continuation);
                oooO00o.f103843OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103843OooOo0o;
                C34406OooO00o.f123390OooO00o.OooO0o0(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("isEraserSettingVisible: ", z), new Object[0]);
                View view = this.f103842OooOo.f75384Ooooo0o;
                if (view != null) {
                    view.setVisibility(z ? 0 : 8);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f103840OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f103840OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103841OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103840OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103841OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75168Oooo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$12", m80623f = "PenBoxChildFragment.kt", m80624l = {1206}, m80625m = "invokeSuspend")
    public static final class C29287OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103844OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103845OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$12$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103846OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103847OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103846OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103846OooOo, continuation);
                oooO00o.f103847OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103847OooOo0o;
                View view = this.f103846OooOo.f75390OoooooO;
                if (view != null) {
                    view.setVisibility(z ? 0 : 8);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29287OooO0Oo(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29287OooO0Oo> continuation) {
            super(2, continuation);
            this.f103844OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29287OooO0Oo(this.f103844OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29287OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103845OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103844OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103845OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75175Oooo0o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$14", m80623f = "PenBoxChildFragment.kt", m80624l = {1223}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103848OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103849OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$14$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103850OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103851OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103850OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103850OooOo, continuation);
                oooO00o.f103851OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean zBooleanValue = ((Boolean) ((C32443OooOOO) this.f103851OooOo0o).f116638OooOo0o).booleanValue();
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103850OooOo;
                Integer num = (Integer) penBoxChildFragment.Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iIntValue = num.intValue();
                if (zBooleanValue) {
                    View view = penBoxChildFragment.f75365Oooo00O;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    if (view.getVisibility() != 0) {
                        penBoxChildFragment.OoooO00(true, true);
                    }
                }
                if (!zBooleanValue || iIntValue == 0) {
                    View view2 = penBoxChildFragment.f75365Oooo00O;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view2.requestFocus();
                } else {
                    penBoxChildFragment.Oooo0o().OooOO0(0);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f103848OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f103848OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103849OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103848OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103849OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75185OoooOOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$13", m80623f = "PenBoxChildFragment.kt", m80624l = {CommonConstant.RETCODE.NEED_UPDATE_STATICKIT}, m80625m = "invokeSuspend")
    public static final class C29288OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103852OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103853OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$13$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103854OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103855OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103854OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103854OooOo, continuation);
                oooO00o.f103855OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                C29947OooO0OO c29947OooO0OO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f103855OooOo0o;
                if (c32443OooOOO != null) {
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                    PenBoxChildFragment penBoxChildFragment = this.f103854OooOo;
                    C29947OooO0OO c29947OooO0OO2 = penBoxChildFragment.f75392o00000;
                    if (c29947OooO0OO2 != null && c29947OooO0OO2.OooO00o() && (c29947OooO0OO = penBoxChildFragment.f75392o00000) != null) {
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
        public C29288OooO0o0(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29288OooO0o0> continuation) {
            super(2, continuation);
            this.f103852OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29288OooO0o0(this.f103852OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29288OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103853OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103852OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103853OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75167OooOooo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$15", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C29289OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103856OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f103857OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$15$1", m80623f = "PenBoxChildFragment.kt", m80624l = {1242}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103858OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f103859OooOo0o;

            /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$15$1$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19979OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PenBoxChildFragment f103860OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f103861OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19979OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super C19979OooO00o> continuation) {
                    super(2, continuation);
                    this.f103860OooOo = penBoxChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19979OooO00o c19979OooO00o = new C19979OooO00o(this.f103860OooOo, continuation);
                    c19979OooO00o.f103861OooOo0o = ((Boolean) obj).booleanValue();
                    return c19979OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19979OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Context context;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f103861OooOo0o;
                    PenBoxChildFragment penBoxChildFragment = this.f103860OooOo;
                    if (z) {
                        C29951OooO0oO c29951OooO0oO = penBoxChildFragment.f75397o00000O0;
                        if ((c29951OooO0oO == null || !c29951OooO0oO.OooO00o()) && (context = penBoxChildFragment.getContext()) != null && C28038OooO0Oo.OooO0O0(context)) {
                            List<T> list = penBoxChildFragment.f75375OoooO00.f66021OooO00o.f65811OooO0o;
                            kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                            Iterator it = list.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (((PenVO) it.next()).getType() == 4) {
                                    break;
                                }
                                i++;
                            }
                            View viewFindViewByPosition = null;
                            if (i != -1) {
                                RecyclerView recyclerView = penBoxChildFragment.f75362Oooo;
                                if (recyclerView == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
                                    throw null;
                                }
                                RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                                if (layoutManager != null) {
                                    viewFindViewByPosition = layoutManager.findViewByPosition(i);
                                }
                            }
                            if (viewFindViewByPosition != null) {
                                penBoxChildFragment.OoooooO(viewFindViewByPosition);
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        int i2 = PenBoxChildFragment.f75355o0000Ooo;
                        penBoxChildFragment.getClass();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103858OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f103858OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f103859OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    int i2 = PenBoxChildFragment.f75355o0000Ooo;
                    PenBoxChildFragment penBoxChildFragment = this.f103858OooOo;
                    C33772OooooOo c33772OooooOo = penBoxChildFragment.Oooo0o().f75187OoooOoO;
                    C19979OooO00o c19979OooO00o = new C19979OooO00o(penBoxChildFragment, null);
                    this.f103859OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19979OooO00o, this) == enumC32485OooO00o) {
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
        public C29289OooO0oO(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29289OooO0oO> continuation) {
            super(2, continuation);
            this.f103856OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C29289OooO0oO c29289OooO0oO = new C29289OooO0oO(this.f103856OooOo, continuation);
            c29289OooO0oO.f103857OooOo0o = obj;
            return c29289OooO0oO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29289OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f103857OooOo0o, null, null, new OooO00o(this.f103856OooOo, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$16", m80623f = "PenBoxChildFragment.kt", m80624l = {1253}, m80625m = "invokeSuspend")
    public static final class C29290OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103862OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103863OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$16$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103864OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f103865OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103864OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103864OooOo, continuation);
                oooO00o.f103865OooOo0o = ((Number) obj).intValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f103864OooOo.f75361OooOooo = this.f103865OooOo0o == 0;
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29290OooO0oo(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29290OooO0oo> continuation) {
            super(2, continuation);
            this.f103862OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29290OooO0oo(this.f103862OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29290OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103863OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103862OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103863OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75151OooOOOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$18", m80623f = "PenBoxChildFragment.kt", m80624l = {1265}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103866OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103867OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103868OooOo0o;

            public OooO00o(PenBoxChildFragment penBoxChildFragment) {
                this.f103868OooOo0o = penBoxChildFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                o0o00o0.OooO oooOOooO0Oo;
                o0o00o0.OooO oooOOooO0Oo2;
                PenExtraVO penExtraVO = (PenExtraVO) obj;
                Integer num = penExtraVO != null ? new Integer(penExtraVO.getType()) : null;
                PenBoxChildFragment penBoxChildFragment = this.f103868OooOo0o;
                if (num != null && num.intValue() == 3) {
                    String string = penExtraVO.getExtra().getString(C18437z2.f56754h);
                    C29947OooO0OO c29947OooO0OO = penBoxChildFragment.f75392o00000;
                    if (c29947OooO0OO != null) {
                        c29947OooO0OO.OooO0Oo(string == null ? "" : string);
                    }
                    ImageView imageView = penBoxChildFragment.f75385OooooO0;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("eraserPixel");
                        throw null;
                    }
                    imageView.setSelected(false);
                    ImageView imageView2 = penBoxChildFragment.f75386OooooOO;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("eraserStroke");
                        throw null;
                    }
                    imageView2.setSelected(false);
                    ImageView imageView3 = penBoxChildFragment.f75387OooooOo;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("eraserLasso");
                        throw null;
                    }
                    imageView3.setSelected(false);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(string, DrawToolFactory.ERASER_TYPE_PIXEL)) {
                        ImageView imageView4 = penBoxChildFragment.f75385OooooO0;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserPixel");
                            throw null;
                        }
                        imageView4.setSelected(true);
                    } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(string, DrawToolFactory.ERASER_TYPE_STROKE)) {
                        ImageView imageView5 = penBoxChildFragment.f75386OooooOO;
                        if (imageView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserStroke");
                            throw null;
                        }
                        imageView5.setSelected(true);
                    } else {
                        ImageView imageView6 = penBoxChildFragment.f75387OooooOo;
                        if (imageView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("eraserLasso");
                            throw null;
                        }
                        imageView6.setSelected(true);
                    }
                } else if (num != null && num.intValue() == 4) {
                    int i = PenBoxChildFragment.f75355o0000Ooo;
                    penBoxChildFragment.getClass();
                    if (penExtraVO != null && penExtraVO.getType() == 4) {
                        String string2 = penExtraVO.getExtra().getString(C18437z2.f56754h);
                        if (string2 == null) {
                            string2 = DrawToolFactory.LASSO_TYPE_FREE;
                        }
                        int iHashCode = string2.hashCode();
                        if (iHashCode != 3151468) {
                            if (iHashCode != 3496420) {
                                if (iHashCode == 552585030 && string2.equals(DrawToolFactory.LASSO_TYPE_CAPTURE)) {
                                    ImageView imageView7 = penBoxChildFragment.f75391Ooooooo;
                                    if (imageView7 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("lassoFree");
                                        throw null;
                                    }
                                    imageView7.setImageResource(R.drawable.ic_ni_toolbox_lasso_free_normal);
                                    ImageView imageView8 = penBoxChildFragment.f75414o0OoOo0;
                                    if (imageView8 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("lassoRect");
                                        throw null;
                                    }
                                    imageView8.setImageResource(R.drawable.ic_ni_toolbox_lasso_rect_normal);
                                    ImageView imageView9 = penBoxChildFragment.f75420ooOO;
                                    if (imageView9 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("lassoCapture");
                                        throw null;
                                    }
                                    imageView9.setImageResource(R.drawable.ic_ni_toolbox_lasso_capture_selected);
                                }
                            } else if (string2.equals(DrawToolFactory.LASSO_TYPE_RECT)) {
                                ImageView imageView10 = penBoxChildFragment.f75391Ooooooo;
                                if (imageView10 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("lassoFree");
                                    throw null;
                                }
                                imageView10.setImageResource(R.drawable.ic_ni_toolbox_lasso_free_normal);
                                ImageView imageView11 = penBoxChildFragment.f75414o0OoOo0;
                                if (imageView11 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("lassoRect");
                                    throw null;
                                }
                                imageView11.setImageResource(R.drawable.ic_ni_toolbox_lasso_rect_selected);
                                ImageView imageView12 = penBoxChildFragment.f75420ooOO;
                                if (imageView12 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("lassoCapture");
                                    throw null;
                                }
                                imageView12.setImageResource(R.drawable.ic_ni_toolbox_lasso_capture_normal);
                            }
                        } else if (string2.equals(DrawToolFactory.LASSO_TYPE_FREE)) {
                            ImageView imageView13 = penBoxChildFragment.f75391Ooooooo;
                            if (imageView13 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("lassoFree");
                                throw null;
                            }
                            imageView13.setImageResource(R.drawable.ic_ni_toolbox_lasso_free_selected);
                            ImageView imageView14 = penBoxChildFragment.f75414o0OoOo0;
                            if (imageView14 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("lassoRect");
                                throw null;
                            }
                            imageView14.setImageResource(R.drawable.ic_ni_toolbox_lasso_rect_normal);
                            ImageView imageView15 = penBoxChildFragment.f75420ooOO;
                            if (imageView15 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("lassoCapture");
                                throw null;
                            }
                            imageView15.setImageResource(R.drawable.ic_ni_toolbox_lasso_capture_normal);
                        }
                        String string3 = penExtraVO.getExtra().getString("filter");
                        List<String> listOoooOO0 = string3 != null ? C33599OooOo0O.OoooOO0(string3, new String[]{","}) : null;
                        if (listOoooOO0 == null) {
                            listOoooOO0 = C34434OooOoO.f123453OooOo0o;
                        }
                        C29951OooO0oO c29951OooO0oO = penBoxChildFragment.f75397o00000O0;
                        if (c29951OooO0oO != null) {
                            LassoSettingsBottomSheetDialog lassoSettingsBottomSheetDialog = c29951OooO0oO.f106367OooO0OO;
                            InterfaceC29933OooO0Oo interfaceC29933OooO0Oo = lassoSettingsBottomSheetDialog != null ? lassoSettingsBottomSheetDialog : null;
                            if (interfaceC29933OooO0Oo == null) {
                                interfaceC29933OooO0Oo = c29951OooO0oO.f106366OooO0O0;
                            }
                            if (interfaceC29933OooO0Oo != null) {
                                interfaceC29933OooO0Oo.OooOo0(listOoooOO0);
                            }
                        }
                    }
                } else {
                    if (num != null && num.intValue() == 8) {
                        String string4 = penExtraVO.getExtra().getString(C18437z2.f56754h);
                        int i2 = string4 != null ? Integer.parseInt(string4) : 7;
                        C29953OooOO0o c29953OooOO0o = penBoxChildFragment.f75396o00000O;
                        if (c29953OooOO0o != null && (oooOOooO0Oo2 = c29953OooOO0o.OooO0Oo()) != null) {
                            oooOOooO0Oo2.OooO(i2);
                        }
                        C29953OooOO0o c29953OooOO0o2 = penBoxChildFragment.f75396o00000O;
                        if (c29953OooOO0o2 != null && (oooOOooO0Oo = c29953OooOO0o2.OooO0Oo()) != null) {
                            oooOOooO0Oo.OooO00o();
                        }
                    } else if (num != null && num.intValue() == 7) {
                        String string5 = penExtraVO.getExtra().getString(C18437z2.f56754h);
                        C29949OooO0o c29949OooO0o = penBoxChildFragment.f75398o00000OO;
                        if (c29949OooO0o != null) {
                            if (string5 == null) {
                                string5 = "line";
                            }
                            InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo();
                            if (interfaceC29932OooO0OOOooO0Oo != null) {
                                interfaceC29932OooO0OOOooO0Oo.OooO0o0(string5);
                            }
                        }
                        new Integer((int) penExtraVO.getExtra().getDouble(PenInfo.LASER_DISAPPEAR_DURATION));
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f103866OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0(this.f103866OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103867OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103866OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment);
                this.f103867OooOo0o = 1;
                if (oooO0O0Oooo0o.f75194Oooooo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0O */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$19", m80623f = "PenBoxChildFragment.kt", m80624l = {1309}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103869OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103870OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0O$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$19$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f103869OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOO0O(this.f103869OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103870OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = this.f103869OooOo.Oooo0o();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f103870OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75178Oooo0oo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$2", m80623f = "PenBoxChildFragment.kt", m80624l = {1051}, m80625m = "invokeSuspend")
    public static final class C29291OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103871OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103872OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$2$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, Integer, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Integer>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ int f103873OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Boolean f103874OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Boolean bool, Integer num, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Integer>> continuation) {
                int iIntValue = num.intValue();
                OooO00o oooO00o = new OooO00o(3, continuation);
                oooO00o.f103874OooOo0o = bool;
                oooO00o.f103873OooOo = iIntValue;
                return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return new C32443OooOOO(this.f103874OooOo0o, new Integer(this.f103873OooOo));
            }
        }

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOO0o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$2$2", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103875OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103876OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f103875OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f103875OooOo, continuation);
                oooO0O0.f103876OooOo0o = obj;
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
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f103876OooOo0o;
                Boolean bool = (Boolean) c32443OooOOO.f116638OooOo0o;
                int iIntValue = ((Number) c32443OooOOO.f116637OooOo).intValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PenBoxChildFragment");
                c20358OooO00o.OooO0o0("isPenBoxVisible: " + bool + ", state: " + iIntValue, new Object[0]);
                if (bool == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                PenBoxChildFragment penBoxChildFragment = this.f103875OooOo;
                if (iIntValue == 3) {
                    boolean zBooleanValue = bool.booleanValue();
                    int i = PenBoxChildFragment.f75355o0000Ooo;
                    penBoxChildFragment.OoooO00(zBooleanValue, false);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (iIntValue == 0) {
                    View view = penBoxChildFragment.f75365Oooo00O;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view.setVisibility(4);
                    View view2 = penBoxChildFragment.f75365Oooo00O;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view2.requestLayout();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29291OooOO0o(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29291OooOO0o> continuation) {
            super(2, continuation);
            this.f103871OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29291OooOO0o(this.f103871OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29291OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103872OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103871OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBoxChildFragment.Oooo00O();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0OOOooo00O.f73373OooOoo, oooO0O0Oooo0o.f75154OooOOo0, new OooO00o(3, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBoxChildFragment, null);
                this.f103872OooOo0o = 1;
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$21", m80623f = "PenBoxChildFragment.kt", m80624l = {1325}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103877OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103878OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$21$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31045OooOOo>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103879OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103880OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103879OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103879OooOo, continuation);
                oooO00o.f103880OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31045OooOOo> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<C31045OooOOo> list = (List) this.f103880OooOo0o;
                C29949OooO0o c29949OooO0o = this.f103879OooOo.f75398o00000OO;
                if (c29949OooO0o != null) {
                    c29949OooO0o.OooO0o(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f103877OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOO(this.f103877OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103878OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103877OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103878OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75196OoooooO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$20", m80623f = "PenBoxChildFragment.kt", m80624l = {1314}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103881OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103882OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOO0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$20$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103883OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103884OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103883OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103883OooOo, continuation);
                oooO00o.f103884OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103884OooOo0o;
                PenBoxChildFragment penBoxChildFragment = this.f103883OooOo;
                if (z) {
                    ImageView imageView = penBoxChildFragment.f75380OoooOo0;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.ic_ni_star_2_selected);
                } else {
                    ImageView imageView2 = penBoxChildFragment.f75380OoooOo0;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                        throw null;
                    }
                    imageView2.setImageResource(R.drawable.ic_ni_star_2_normal);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f103881OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOO0(this.f103881OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103882OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103881OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103882OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75200o00Oo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOOO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$22", m80623f = "PenBoxChildFragment.kt", m80624l = {1331}, m80625m = "invokeSuspend")
    public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103885OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103886OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOOO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$22$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103887OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103888OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103887OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103887OooOo, continuation);
                oooO00o.f103888OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103888OooOo0o;
                PenBoxChildFragment penBoxChildFragment = this.f103887OooOo;
                C29950OooO0o0 c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O;
                if (c29950OooO0o0 != null) {
                    c29950OooO0o0.OooO0o0(z);
                }
                C29948OooO0Oo c29948OooO0Oo = penBoxChildFragment.f75394o000000O;
                if (c29948OooO0Oo != null) {
                    c29948OooO0Oo.OooO0o0(z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f103885OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOOO(this.f103885OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103886OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103885OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103886OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75191OooooO0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$23", m80623f = "PenBoxChildFragment.kt", m80624l = {1338}, m80625m = "invokeSuspend")
    public static final class C29292OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103889OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103890OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$23$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103891OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103892OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103891OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103891OooOo, continuation);
                oooO00o.f103892OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103892OooOo0o;
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103891OooOo;
                int iFloatValue = (int) (((Number) penBoxChildFragment.Oooo0o().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100);
                C29953OooOO0o c29953OooOO0o = penBoxChildFragment.f75396o00000O;
                if (c29953OooOO0o != null) {
                    c29953OooOO0o.OooO0o0(iFloatValue, z);
                }
                C29950OooO0o0 c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O;
                if (c29950OooO0o0 != null) {
                    c29950OooO0o0.OooO0o(iFloatValue, z);
                }
                C29948OooO0Oo c29948OooO0Oo = penBoxChildFragment.f75394o000000O;
                if (c29948OooO0Oo != null) {
                    c29948OooO0Oo.OooO0o(iFloatValue, z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29292OooOOOo(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29292OooOOOo> continuation) {
            super(2, continuation);
            this.f103889OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29292OooOOOo(this.f103889OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29292OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103890OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103889OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103890OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75180OoooO0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$25", m80623f = "PenBoxChildFragment.kt", m80624l = {1357}, m80625m = "invokeSuspend")
    public static final class C29293OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103893OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103894OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$25$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103895OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f103896OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103895OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103895OooOo, continuation);
                oooO00o.f103896OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f103896OooOo0o;
                o0o00Ooo.OooOO0 oooOO02 = this.f103895OooOo.f75395o000000o;
                if (oooOO02 != null) {
                    oooOO02.OooO0o0(z);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29293OooOOo(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29293OooOOo> continuation) {
            super(2, continuation);
            this.f103893OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29293OooOOo(this.f103893OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29293OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103894OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103893OooOo;
                C26320o0000OoO c26320o0000OoOOooo0o0 = penBoxChildFragment.Oooo0o0();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103894OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooo0o0.f90249OoooOOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$24", m80623f = "PenBoxChildFragment.kt", m80624l = {1347}, m80625m = "invokeSuspend")
    public static final class C29294OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103897OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103898OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOo0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$24$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Float, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103899OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ float f103900OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103899OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103899OooOo, continuation);
                oooO00o.f103900OooOo0o = ((Number) obj).floatValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Float f, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(Float.valueOf(f.floatValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                float f = this.f103900OooOo0o;
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103899OooOo;
                boolean zBooleanValue = ((Boolean) penBoxChildFragment.Oooo0o().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue();
                int i2 = (int) (f * 100);
                C29953OooOO0o c29953OooOO0o = penBoxChildFragment.f75396o00000O;
                if (c29953OooOO0o != null) {
                    c29953OooOO0o.OooO0o0(i2, zBooleanValue);
                }
                C29950OooO0o0 c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O;
                if (c29950OooO0o0 != null) {
                    c29950OooO0o0.OooO0o(i2, zBooleanValue);
                }
                C29948OooO0Oo c29948OooO0Oo = penBoxChildFragment.f75394o000000O;
                if (c29948OooO0Oo != null) {
                    c29948OooO0Oo.OooO0o(i2, zBooleanValue);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29294OooOOo0(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29294OooOOo0> continuation) {
            super(2, continuation);
            this.f103897OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29294OooOOo0(this.f103897OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29294OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103898OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103897OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103898OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75182OoooO0O, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOoo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$26", m80623f = "PenBoxChildFragment.kt", m80624l = {1363}, m80625m = "invokeSuspend")
    public static final class C29295OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103901OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103902OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOOoo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$26$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<PenVO, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103903OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103904OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103903OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103903OooOo, continuation);
                oooO00o.f103904OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(PenVO penVO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(penVO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                PenVO penVO = (PenVO) this.f103904OooOo0o;
                C34406OooO00o.f123390OooO00o.OooO0o0("curPenVO: " + penVO, new Object[0]);
                if (penVO != null) {
                    int i = PenBoxChildFragment.f75355o0000Ooo;
                    this.f103903OooOo.OooOoo(true);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29295OooOOoo(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29295OooOOoo> continuation) {
            super(2, continuation);
            this.f103901OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29295OooOOoo(this.f103901OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29295OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103902OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103901OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103902OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75176Oooo0o0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$5", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.PUNJABI_INDIA}, m80625m = "invokeSuspend")
    public static final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103905OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103906OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$5$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f103905OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOo(this.f103905OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103906OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = this.f103905OooOo.Oooo0o();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f103906OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75173Oooo0O0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$28", m80623f = "PenBoxChildFragment.kt", m80624l = {1390}, m80625m = "invokeSuspend")
    public static final class C29296OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103907OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103908OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$28$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103909OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103910OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103909OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103909OooOo, continuation);
                oooO00o.f103910OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Integer num = (Integer) this.f103910OooOo0o;
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iIntValue = num.intValue();
                int i = PenBoxChildFragment.f75355o0000Ooo;
                this.f103909OooOo.Oooo0oo(iIntValue, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29296OooOo0(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29296OooOo0> continuation) {
            super(2, continuation);
            this.f103907OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29296OooOo0(this.f103907OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29296OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103908OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103907OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103908OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75157OooOo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo00 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$27", m80623f = "PenBoxChildFragment.kt", m80624l = {1379}, m80625m = "invokeSuspend")
    public static final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103911OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103912OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo00$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$27$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32511OooOOoo<Integer, Insets, Boolean, Boolean, Continuation<? super C32449OooOOoo<? extends Integer, ? extends Boolean, ? extends Boolean>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ boolean f103913OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Integer f103914OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public /* synthetic */ boolean f103915OooOoO0;

            @Override // oO0O000o.InterfaceC32511OooOOoo
            public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                OooO00o oooO00o = new OooO00o(5, (Continuation) serializable);
                oooO00o.f103914OooOo0o = (Integer) obj;
                oooO00o.f103913OooOo = zBooleanValue;
                oooO00o.f103915OooOoO0 = zBooleanValue2;
                return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return new C32449OooOOoo(this.f103914OooOo0o, Boolean.valueOf(this.f103913OooOo), Boolean.valueOf(this.f103915OooOoO0));
            }
        }

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo00$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$27$2", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32449OooOOoo<? extends Integer, ? extends Boolean, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103916OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103917OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f103916OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f103916OooOo, continuation);
                oooO0O0.f103917OooOo0o = obj;
                return oooO0O0;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32449OooOOoo<? extends Integer, ? extends Boolean, ? extends Boolean> c32449OooOOoo, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(c32449OooOOoo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) this.f103917OooOo0o;
                Integer num = (Integer) c32449OooOOoo.f116648OooOo0o;
                boolean zBooleanValue = ((Boolean) c32449OooOOoo.f116647OooOo).booleanValue();
                boolean zBooleanValue2 = ((Boolean) c32449OooOOoo.f116649OooOoO0).booleanValue();
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int iIntValue = num.intValue();
                boolean z = zBooleanValue || zBooleanValue2;
                int i = PenBoxChildFragment.f75355o0000Ooo;
                this.f103916OooOo.Oooo(iIntValue, z, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f103911OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOo00(this.f103911OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103912OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103911OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = penBoxChildFragment.Oooo00O();
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O2 = penBoxChildFragment.Oooo00O();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o2 = penBoxChildFragment.Oooo0o();
                C33762OoooOO0 c33762OoooOO0OooO = C25252OooO0Oo.OooO(oooO0O0Oooo0o.f75160OooOo0o, oooO0OOOooo00O.f73365OooOo, oooO0OOOooo00O2.f73423o00o0O, oooO0O0Oooo0o2.f75199o00O0O, new OooO00o(5, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBoxChildFragment, null);
                this.f103912OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33762OoooOO0OooO, oooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo0O, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$3", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.SORBIAN}, m80625m = "invokeSuspend")
    public static final class C29297OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103918OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103919OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo0O$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$3$1", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.AFRIKAANS, 1084}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f103920OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f103921OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103922OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103922OooOoO0 = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103922OooOoO0, continuation);
                oooO00o.f103920OooOo = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
                int i = this.f103921OooOo0o;
                PenBoxChildFragment penBoxChildFragment = this.f103922OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    list = (List) this.f103920OooOo;
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
                        new C29263OooOO0o(penBoxChildFragment, penBoxChildFragment.f75375OoooO00.OooO0o(penVO), penVO.getType(), penBoxChildFragment.f75375OoooO00.OooO0oO(penVO), penVO.getColor()).invoke();
                    }
                    if (penVO == null) {
                        zBooleanValue = true;
                        if (zBooleanValue) {
                            int i2 = PenBoxChildFragment.f75355o0000Ooo;
                            Iterator it2 = ((List) penBoxChildFragment.Oooo0o().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
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
                            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                            this.f103920OooOo = null;
                            this.f103921OooOo0o = 2;
                        } else {
                            penBoxChildFragment.f75375OoooO00.OooO0Oo(list);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f103920OooOo = list;
                    this.f103921OooOo0o = 1;
                    obj = PenBoxChildFragment.OooOoO(penBoxChildFragment, penVO, this);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    list = (List) this.f103920OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29297OooOo0O(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29297OooOo0O> continuation) {
            super(2, continuation);
            this.f103918OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29297OooOo0O(this.f103918OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29297OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103919OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103918OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103919OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75174Oooo0OO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$4", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.TURKMEN}, m80625m = "invokeSuspend")
    public static final class C29298OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103923OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103924OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOo0o$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$4$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29298OooOo0o(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29298OooOo0o> continuation) {
            super(2, continuation);
            this.f103923OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29298OooOo0o(this.f103923OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29298OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103924OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = this.f103923OooOo.Oooo0o();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f103924OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75172Oooo00o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$7", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.KHMER}, m80625m = "invokeSuspend")
    public static final class C29299OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103925OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103926OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$7$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, List<? extends PenWidthVO>, Continuation<? super C32443OooOOO<? extends Integer, ? extends List<? extends PenWidthVO>>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ List f103927OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Integer f103928OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Integer num, List<? extends PenWidthVO> list, Continuation<? super C32443OooOOO<? extends Integer, ? extends List<? extends PenWidthVO>>> continuation) {
                OooO00o oooO00o = new OooO00o(3, continuation);
                oooO00o.f103928OooOo0o = num;
                oooO00o.f103927OooOo = list;
                return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return new C32443OooOOO(this.f103928OooOo0o, this.f103927OooOo);
            }
        }

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoO$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$7$2", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends List<? extends PenWidthVO>>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103929OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103930OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f103929OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f103929OooOo, continuation);
                oooO0O0.f103930OooOo0o = obj;
                return oooO0O0;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Integer, ? extends List<? extends PenWidthVO>> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object next;
                o0o00o0O.OooO oooO;
                C29948OooO0Oo c29948OooO0Oo;
                InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo;
                o0o00o0O.OooOO0O oooOO0O;
                C29950OooO0o0 c29950OooO0o0;
                InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f103930OooOo0o;
                Integer num = (Integer) c32443OooOOO.f116638OooOo0o;
                List<PenWidthVO> list = (List) c32443OooOOO.f116637OooOo;
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                PenBoxChildFragment penBoxChildFragment = this.f103929OooOo;
                penBoxChildFragment.f75383Ooooo00 = list;
                C29906OooOOoo c29906OooOOoo = penBoxChildFragment.f75382OoooOoo;
                c29906OooOOoo.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                c29906OooOOoo.OooO0Oo(list);
                Iterator<T> it = list.iterator();
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
                    C29950OooO0o0 c29950OooO0o02 = penBoxChildFragment.f75411o0OO00O;
                    if (c29950OooO0o02 != null && c29950OooO0o02.OooO00o() && (c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O) != null && (interfaceC29934OooO0oOooO0Oo2 = c29950OooO0o0.OooO0Oo()) != null) {
                        interfaceC29934OooO0oOooO0Oo2.OooOOOO(penWidthVO);
                    }
                    o0o00o0O.OooOO0O oooOO0O2 = penBoxChildFragment.f75410o0O0O00;
                    if (oooOO0O2 != null && oooOO0O2.OooO00o() && (oooOO0O = penBoxChildFragment.f75410o0O0O00) != null) {
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
                    C29948OooO0Oo c29948OooO0Oo2 = penBoxChildFragment.f75394o000000O;
                    if (c29948OooO0Oo2 != null && c29948OooO0Oo2.OooO00o() && (c29948OooO0Oo = penBoxChildFragment.f75394o000000O) != null && (interfaceC29934OooO0oOooO0Oo = c29948OooO0Oo.OooO0Oo()) != null) {
                        interfaceC29934OooO0oOooO0Oo.OooOOOO(penWidthVO);
                    }
                    o0o00o0O.OooO oooO2 = penBoxChildFragment.f75393o000000;
                    if (oooO2 != null && oooO2.OooO00o() && (oooO = penBoxChildFragment.f75393o000000) != null) {
                        PencilGroupSettingsBottomSheetDialog pencilGroupSettingsBottomSheetDialog = oooO.f106327OooO0o0;
                        InterfaceC29934OooO0o interfaceC29934OooO0o2 = pencilGroupSettingsBottomSheetDialog != null ? pencilGroupSettingsBottomSheetDialog : null;
                        if (interfaceC29934OooO0o2 == null) {
                            interfaceC29934OooO0o2 = oooO.f106326OooO0o;
                        }
                        if (interfaceC29934OooO0o2 != null) {
                            interfaceC29934OooO0o2.OooOOOO(penWidthVO);
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29299OooOoO(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29299OooOoO> continuation) {
            super(2, continuation);
            this.f103925OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29299OooOoO(this.f103925OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29299OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103926OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103925OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o2 = penBoxChildFragment.Oooo0o();
                C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0O0Oooo0o.f75160OooOo0o, oooO0O0Oooo0o2.f75193OooooOo, new OooO00o(3, null));
                OooO0O0 oooO0O0 = new OooO0O0(penBoxChildFragment, null);
                this.f103926OooOo0o = 1;
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoO0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$6", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.TELUGU}, m80625m = "invokeSuspend")
    public static final class C29300OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103931OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103932OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoO0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$6$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenVO>, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29300OooOoO0(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29300OooOoO0> continuation) {
            super(2, continuation);
            this.f103931OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29300OooOoO0(this.f103931OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29300OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103932OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = this.f103931OooOo.Oooo0o();
                OooO00o oooO00o = new OooO00o(2, null);
                this.f103932OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75169Oooo0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoOO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$8", m80623f = "PenBoxChildFragment.kt", m80624l = {EditingLanguage.LUXEMBOUGISH}, m80625m = "invokeSuspend")
    public static final class C29301OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103933OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103934OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoOO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$8$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends FavoritePenVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103935OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103935OooOo0o = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f103935OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends FavoritePenVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
                PenBoxChildFragment penBoxChildFragment = this.f103935OooOo0o;
                C29950OooO0o0 c29950OooO0o02 = penBoxChildFragment.f75411o0OO00O;
                if (c29950OooO0o02 != null && c29950OooO0o02.OooO00o() && (c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O) != null && (interfaceC29934OooO0oOooO0Oo2 = c29950OooO0o0.OooO0Oo()) != null) {
                    interfaceC29934OooO0oOooO0Oo2.OooO00o();
                }
                C29948OooO0Oo c29948OooO0Oo2 = penBoxChildFragment.f75394o000000O;
                if (c29948OooO0Oo2 != null && c29948OooO0Oo2.OooO00o() && (c29948OooO0Oo = penBoxChildFragment.f75394o000000O) != null && (interfaceC29934OooO0oOooO0Oo = c29948OooO0Oo.OooO0Oo()) != null) {
                    interfaceC29934OooO0oOooO0Oo.OooO00o();
                }
                o0o00o0O.OooOO0O oooOO0O2 = penBoxChildFragment.f75410o0O0O00;
                if (oooOO0O2 != null && oooOO0O2.OooO00o() && (oooOO0O = penBoxChildFragment.f75410o0O0O00) != null) {
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
                C29947OooO0OO c29947OooO0OO2 = penBoxChildFragment.f75392o00000;
                if (c29947OooO0OO2 != null && c29947OooO0OO2.OooO00o() && (c29947OooO0OO = penBoxChildFragment.f75392o00000) != null) {
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
                C29951OooO0oO c29951OooO0oO2 = penBoxChildFragment.f75397o00000O0;
                if (c29951OooO0oO2 != null && c29951OooO0oO2.OooO00o() && (c29951OooO0oO = penBoxChildFragment.f75397o00000O0) != null) {
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
                C29953OooOO0o c29953OooOO0o2 = penBoxChildFragment.f75396o00000O;
                if (c29953OooOO0o2 != null && c29953OooOO0o2.OooO00o() && (c29953OooOO0o = penBoxChildFragment.f75396o00000O) != null && (oooOOooO0Oo = c29953OooOO0o.OooO0Oo()) != null) {
                    oooOOooO0Oo.OooO00o();
                }
                C29949OooO0o c29949OooO0o2 = penBoxChildFragment.f75398o00000OO;
                if (c29949OooO0o2 != null && c29949OooO0o2.OooO00o() && (c29949OooO0o = penBoxChildFragment.f75398o00000OO) != null && (interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo()) != null) {
                    interfaceC29932OooO0OOOooO0Oo.OooO00o();
                }
                o0o00o0O.OooO oooO2 = penBoxChildFragment.f75393o000000;
                if (oooO2 != null && oooO2.OooO00o() && (oooO = penBoxChildFragment.f75393o000000) != null) {
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
        public C29301OooOoOO(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29301OooOoOO> continuation) {
            super(2, continuation);
            this.f103933OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29301OooOoOO(this.f103933OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29301OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103934OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103933OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103934OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75205ooOO, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$9", m80623f = "PenBoxChildFragment.kt", m80624l = {1163}, m80625m = "invokeSuspend")
    public static final class C29302OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103936OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103937OooOo0o;

        /* JADX INFO: renamed from: o0Ooo.Oooo0o0$OooOoo0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$onViewInitialed$14$9$1", m80623f = "PenBoxChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends PenColorVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBoxChildFragment f103938OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103939OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f103938OooOo = penBoxChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f103938OooOo, continuation);
                oooO00o.f103939OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends PenColorVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
                List<PenColorVO> list = (List) this.f103939OooOo0o;
                PenBoxChildFragment penBoxChildFragment = this.f103938OooOo;
                penBoxChildFragment.f75379OoooOOo.OooO0Oo(list);
                C29950OooO0o0 c29950OooO0o02 = penBoxChildFragment.f75411o0OO00O;
                if (c29950OooO0o02 != null && c29950OooO0o02.OooO00o() && (c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo = c29950OooO0o0.OooO0Oo();
                    if (interfaceC29934OooO0oOooO0Oo != null) {
                        interfaceC29934OooO0oOooO0Oo.OooO0O0(list);
                    }
                }
                o0o00o0O.OooOO0O oooOO0O3 = penBoxChildFragment.f75410o0O0O00;
                if (oooOO0O3 != null && oooOO0O3.OooO00o() && (oooOO0O2 = penBoxChildFragment.f75410o0O0O00) != null) {
                    oooOO0O2.OooO0Oo(list);
                }
                C29948OooO0Oo c29948OooO0Oo2 = penBoxChildFragment.f75394o000000O;
                if (c29948OooO0Oo2 != null && c29948OooO0Oo2.OooO00o() && (c29948OooO0Oo = penBoxChildFragment.f75394o000000O) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    InterfaceC29934OooO0o interfaceC29934OooO0oOooO0Oo2 = c29948OooO0Oo.OooO0Oo();
                    if (interfaceC29934OooO0oOooO0Oo2 != null) {
                        interfaceC29934OooO0oOooO0Oo2.OooO0O0(list);
                    }
                }
                o0o00o0O.OooOO0O oooOO0O4 = penBoxChildFragment.f75410o0O0O00;
                if (oooOO0O4 != null && oooOO0O4.OooO00o() && (oooOO0O = penBoxChildFragment.f75410o0O0O00) != null) {
                    oooOO0O.OooO0Oo(list);
                }
                C29953OooOO0o c29953OooOO0o2 = penBoxChildFragment.f75396o00000O;
                if (c29953OooOO0o2 != null && c29953OooOO0o2.OooO00o() && (c29953OooOO0o = penBoxChildFragment.f75396o00000O) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    o0o00o0.OooO oooOOooO0Oo = c29953OooOO0o.OooO0Oo();
                    if (oooOOooO0Oo != null) {
                        oooOOooO0Oo.OooO0O0(list);
                    }
                }
                C29949OooO0o c29949OooO0o2 = penBoxChildFragment.f75398o00000OO;
                if (c29949OooO0o2 != null && c29949OooO0o2.OooO00o() && (c29949OooO0o = penBoxChildFragment.f75398o00000OO) != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "colorList");
                    InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo();
                    if (interfaceC29932OooO0OOOooO0Oo != null) {
                        interfaceC29932OooO0OOOooO0Oo.OooO0O0(list);
                    }
                }
                C29951OooO0oO c29951OooO0oO2 = penBoxChildFragment.f75397o00000O0;
                if (c29951OooO0oO2 != null && c29951OooO0oO2.OooO00o() && (c29951OooO0oO = penBoxChildFragment.f75397o00000O0) != null) {
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
                o0o00o0O.OooO oooO2 = penBoxChildFragment.f75393o000000;
                if (oooO2 != null && oooO2.OooO00o() && (oooO = penBoxChildFragment.f75393o000000) != null) {
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
        public C29302OooOoo0(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29302OooOoo0> continuation) {
            super(2, continuation);
            this.f103936OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29302OooOoo0(this.f103936OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29302OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103937OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103936OooOo;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                OooO00o oooO00o = new OooO00o(penBoxChildFragment, null);
                this.f103937OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0O0Oooo0o.f75188OoooOoo, oooO00o, this) == enumC32485OooO00o) {
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
    public C29286Oooo0o0(PenBoxChildFragment penBoxChildFragment, Continuation<? super C29286Oooo0o0> continuation) {
        super(2, continuation);
        this.f103828OooOo = penBoxChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29286Oooo0o0 c29286Oooo0o0 = new C29286Oooo0o0(this.f103828OooOo, continuation);
        c29286Oooo0o0.f103829OooOo0o = obj;
        return c29286Oooo0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29286Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103829OooOo0o;
        PenBoxChildFragment penBoxChildFragment = this.f103828OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29291OooOO0o(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29297OooOo0O(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29298OooOo0o(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOo(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29300OooOoO0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29299OooOoO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29301OooOoOO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29302OooOoo0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29287OooO0Oo(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29288OooO0o0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29289OooO0oO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29290OooO0oo(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOOO(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29292OooOOOo(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29294OooOOo0(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29293OooOOo(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29295OooOOoo(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOo00(penBoxChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29296OooOo0(penBoxChildFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
