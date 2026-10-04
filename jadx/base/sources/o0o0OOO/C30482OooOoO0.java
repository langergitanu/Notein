package o0o0OOO;

import Oooo0.C20860Ooooooo;
import android.view.View;
import android.widget.ScrollView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22201OooO0oO;
import com.google.firebase.firestore.local.RunnableC22692ooOO;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.paperconfig.components.PaperConfigPreview;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OoO0oO.C28675OooO0Oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33758OoooO;
import oO0o0Oo.C33762OoooOO0;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OOO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1", m80623f = "MyTemplateFragment.kt", m80624l = {681}, m80625m = "invokeSuspend")
public final class C30482OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MyTemplateFragment f108834OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108835OooOo0o;

    /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1", m80623f = "MyTemplateFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ MyTemplateFragment f108836OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f108837OooOo0o;

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$1", m80623f = "MyTemplateFragment.kt", m80624l = {684}, m80625m = "invokeSuspend")
        public static final class C20076OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108838OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108839OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C20077OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108840OooOo0o;

                public C20077OooO00o(MyTemplateFragment myTemplateFragment) {
                    this.f108840OooOo0o = myTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<ThemeVO> list = (List) obj;
                    C30465OooO0oo c30465OooO0oo = this.f108840OooOo0o.f78617OooOoo0;
                    if (c30465OooO0oo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("myTemplateAdapter");
                        throw null;
                    }
                    if (list == null) {
                        list = C34434OooOoO.f123453OooOo0o;
                    }
                    c30465OooO0oo.f108795OooO0oo = list;
                    c30465OooO0oo.notifyDataSetChanged();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20076OooO00o(MyTemplateFragment myTemplateFragment, Continuation<? super C20076OooO00o> continuation) {
                super(2, continuation);
                this.f108838OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20076OooO00o(this.f108838OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C20076OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108839OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplateFragment myTemplateFragment = this.f108838OooOo;
                    C33769Ooooo0o c33769Ooooo0o = myTemplateFragment.OooOooo().f109052Oooooo;
                    C20077OooO00o c20077OooO00o = new C20077OooO00o(myTemplateFragment);
                    this.f108839OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20077OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$2", m80623f = "MyTemplateFragment.kt", m80624l = {691}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108841OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108842OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C20078OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108843OooOo0o;

                public C20078OooO00o(MyTemplateFragment myTemplateFragment) {
                    this.f108843OooOo0o = myTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<ThemeVO> list = (List) obj;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    int size = list.size();
                    MyTemplateFragment myTemplateFragment = this.f108843OooOo0o;
                    c20358OooO00o.OooO00o("materialTemplates update: size=" + size + ", selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue() + ", tempOrientation=" + myTemplateFragment.OooOooo().f109035Oooo0oO.getValue() + ", tempColor=" + myTemplateFragment.OooOooo().f109026Oooo.getValue(), new Object[0]);
                    C30465OooO0oo c30465OooO0oo = myTemplateFragment.f78616OooOoo;
                    if (c30465OooO0oo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("materialTemplateAdapter");
                        throw null;
                    }
                    c30465OooO0oo.f108795OooO0oo = list;
                    c30465OooO0oo.notifyDataSetChanged();
                    View viewFindViewById = myTemplateFragment.requireView().findViewById(R.id.tv_material_center_title);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
                    List<ThemeVO> list2 = list;
                    viewFindViewById.setVisibility(!list2.isEmpty() ? 0 : 8);
                    RecyclerView recyclerView = myTemplateFragment.f78613OooOoO;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvMaterialTemplates");
                        throw null;
                    }
                    recyclerView.setVisibility(!list2.isEmpty() ? 0 : 8);
                    View viewFindViewById2 = myTemplateFragment.requireView().findViewById(R.id.divider_section_1_2);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
                    viewFindViewById2.setVisibility(list2.isEmpty() ? 8 : 0);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MyTemplateFragment myTemplateFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f108841OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f108841OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108842OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplateFragment myTemplateFragment = this.f108841OooOo;
                    C33769Ooooo0o c33769Ooooo0o = myTemplateFragment.OooOooo().f109051OooooOo;
                    C20078OooO00o c20078OooO00o = new C20078OooO00o(myTemplateFragment);
                    this.f108842OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20078OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$3", m80623f = "MyTemplateFragment.kt", m80624l = {713}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108844OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108845OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C20079OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108846OooOo0o;

                public C20079OooO00o(MyTemplateFragment myTemplateFragment) {
                    this.f108846OooOo0o = myTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<ThemeVO> list = (List) obj;
                    MyTemplateFragment myTemplateFragment = this.f108846OooOo0o;
                    C30465OooO0oo c30465OooO0oo = myTemplateFragment.f78618OooOooO;
                    if (c30465OooO0oo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("templateBookAdapter");
                        throw null;
                    }
                    c30465OooO0oo.f108795OooO0oo = list == null ? C34434OooOoO.f123453OooOo0o : list;
                    c30465OooO0oo.notifyDataSetChanged();
                    View viewFindViewById = myTemplateFragment.requireView().findViewById(R.id.tv_template_book_title);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
                    List<ThemeVO> list2 = list;
                    viewFindViewById.setVisibility(!list2.isEmpty() ? 0 : 8);
                    RecyclerView recyclerView = myTemplateFragment.f78615OooOoOO;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvTemplateBooks");
                        throw null;
                    }
                    recyclerView.setVisibility(!list2.isEmpty() ? 0 : 8);
                    View viewFindViewById2 = myTemplateFragment.requireView().findViewById(R.id.divider_section_2_3);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
                    viewFindViewById2.setVisibility(list2.isEmpty() ? 8 : 0);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MyTemplateFragment myTemplateFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f108844OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f108844OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108845OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplateFragment myTemplateFragment = this.f108844OooOo;
                    C33769Ooooo0o c33769Ooooo0o = myTemplateFragment.OooOooo().f109053Oooooo0;
                    C20079OooO00o c20079OooO00o = new C20079OooO00o(myTemplateFragment);
                    this.f108845OooOo0o = 1;
                    if (c33769Ooooo0o.f121747OooOo0o.collect(c20079OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$4", m80623f = "MyTemplateFragment.kt", m80624l = {757}, m80625m = "invokeSuspend")
        public static final class C30483OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108847OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108848OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$4$1", m80623f = "MyTemplateFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C20080OooO00o extends AbstractC32476OooO implements InterfaceC32511OooOOoo<MyTemplate, Orientation, String, String, Continuation<? super PaperTheme>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ Orientation f108849OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ MyTemplate f108850OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public /* synthetic */ String f108851OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public /* synthetic */ String f108852OooOoO0;

                @Override // oO0O000o.InterfaceC32511OooOOoo
                public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
                    C20080OooO00o c20080OooO00o = new C20080OooO00o(5, (Continuation) serializable);
                    c20080OooO00o.f108850OooOo0o = (MyTemplate) obj;
                    c20080OooO00o.f108849OooOo = (Orientation) obj2;
                    c20080OooO00o.f108852OooOoO0 = (String) obj3;
                    c20080OooO00o.f108851OooOoO = (String) obj4;
                    return c20080OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    PaperTheme paperTheme;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplate myTemplate = this.f108850OooOo0o;
                    Orientation orientation = this.f108849OooOo;
                    String str = this.f108852OooOoO0;
                    String str2 = this.f108851OooOoO;
                    if (myTemplate == null || (paperTheme = myTemplate.getPaperTheme()) == null) {
                        return null;
                    }
                    return (!(paperTheme instanceof TemplateMaterialPaperTheme) || !kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate.getId(), str2) || orientation == null || str == null) ? (!(paperTheme instanceof TemplateBookPaperTheme) || !kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate.getId(), str2) || orientation == null || str == null) ? paperTheme : TemplateBookPaperTheme.copy$default((TemplateBookPaperTheme) paperTheme, null, null, null, 0, orientation, str, null, null, null, 463, null) : TemplateMaterialPaperTheme.copy$default((TemplateMaterialPaperTheme) paperTheme, null, null, null, orientation, str, null, null, null, null, 487, null);
                }
            }

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0Oo$OooO0O0 */
            public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108853OooOo0o;

                public OooO0O0(MyTemplateFragment myTemplateFragment) {
                    this.f108853OooOo0o = myTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    PaperTheme paperTheme = (PaperTheme) obj;
                    if (paperTheme != null) {
                        PaperConfigPreview paperConfigPreview = this.f108853OooOo0o.f78612OooOo;
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
            public C30483OooO0Oo(MyTemplateFragment myTemplateFragment, Continuation<? super C30483OooO0Oo> continuation) {
                super(2, continuation);
                this.f108847OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30483OooO0Oo(this.f108847OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C30483OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108848OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplateFragment myTemplateFragment = this.f108847OooOo;
                    C33762OoooOO0 c33762OoooOO0OooO = C25252OooO0Oo.OooO(myTemplateFragment.OooOooo().f109037OoooO, myTemplateFragment.OooOooo().f109035Oooo0oO, myTemplateFragment.OooOooo().f109026Oooo, myTemplateFragment.OooOooo().f109034Oooo0o0, new C20080OooO00o(5, null));
                    OooO0O0 oooO0O0 = new OooO0O0(myTemplateFragment);
                    this.f108848OooOo0o = 1;
                    if (c33762OoooOO0OooO.collect(oooO0O0, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$6", m80623f = "MyTemplateFragment.kt", m80624l = {790}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108854OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108855OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
            public static final class C20081OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108856OooOo0o;

                public C20081OooO00o(MyTemplateFragment myTemplateFragment) {
                    this.f108856OooOo0o = myTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Orientation orientation = (Orientation) obj;
                    if (orientation != null) {
                        MyTemplateFragment myTemplateFragment = this.f108856OooOo0o;
                        int iOrdinal = myTemplateFragment.f78636OoooOOO.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                SelectableSymbolButtonView selectableSymbolButtonView = myTemplateFragment.f78629Oooo0oO;
                                if (selectableSymbolButtonView == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPortraitVariant");
                                    throw null;
                                }
                                selectableSymbolButtonView.setSelected(orientation == Orientation.PORTRAIT);
                                SelectableSymbolButtonView selectableSymbolButtonView2 = myTemplateFragment.f78630Oooo0oo;
                                if (selectableSymbolButtonView2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnLandscapeVariant");
                                    throw null;
                                }
                                selectableSymbolButtonView2.setSelected(orientation == Orientation.LANDSCAPE);
                            } else {
                                if (iOrdinal != 2) {
                                    throw new C32442OooOO0o();
                                }
                                SelectableSymbolButtonView selectableSymbolButtonView3 = myTemplateFragment.f78634OoooO0O;
                                if (selectableSymbolButtonView3 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPortraitVariantBooks");
                                    throw null;
                                }
                                selectableSymbolButtonView3.setSelected(orientation == Orientation.PORTRAIT);
                                SelectableSymbolButtonView selectableSymbolButtonView4 = myTemplateFragment.f78631OoooO;
                                if (selectableSymbolButtonView4 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnLandscapeVariantBooks");
                                    throw null;
                                }
                                selectableSymbolButtonView4.setSelected(orientation == Orientation.LANDSCAPE);
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(MyTemplateFragment myTemplateFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f108854OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f108854OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108855OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                MyTemplateFragment myTemplateFragment = this.f108854OooOo;
                C33781o00o0O c33781o00o0O = myTemplateFragment.OooOooo().f109035Oooo0oO;
                C20081OooO00o c20081OooO00o = new C20081OooO00o(myTemplateFragment);
                this.f108855OooOo0o = 1;
                c33781o00o0O.collect(c20081OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$5", m80623f = "MyTemplateFragment.kt", m80624l = {778}, m80625m = "invokeSuspend")
        public static final class C30484OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108857OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108858OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$5$1", m80623f = "MyTemplateFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C20082OooO00o extends AbstractC32476OooO implements InterfaceC32509OooOOo<String, List<? extends ThemeVO>, List<? extends ThemeVO>, Continuation<? super C32449OooOOoo<? extends String, ? extends List<? extends ThemeVO>, ? extends List<? extends ThemeVO>>>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ List f108859OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ String f108860OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public /* synthetic */ List f108861OooOoO0;

                @Override // oO0O000o.InterfaceC32509OooOOo
                public final Object invoke(String str, List<? extends ThemeVO> list, List<? extends ThemeVO> list2, Continuation<? super C32449OooOOoo<? extends String, ? extends List<? extends ThemeVO>, ? extends List<? extends ThemeVO>>> continuation) {
                    C20082OooO00o c20082OooO00o = new C20082OooO00o(4, continuation);
                    c20082OooO00o.f108860OooOo0o = str;
                    c20082OooO00o.f108859OooOo = list;
                    c20082OooO00o.f108861OooOoO0 = list2;
                    return c20082OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C32449OooOOoo(this.f108860OooOo0o, this.f108859OooOo, this.f108861OooOoO0);
                }
            }

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0o0$OooO0O0 */
            public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108862OooOo0o;

                public OooO0O0(MyTemplateFragment myTemplateFragment) {
                    this.f108862OooOo0o = myTemplateFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    T next2;
                    C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) obj;
                    String str = (String) c32449OooOOoo.f116648OooOo0o;
                    List list = (List) c32449OooOOoo.f116647OooOo;
                    List list2 = (List) c32449OooOOoo.f116649OooOoO0;
                    MyTemplateFragment myTemplateFragment = this.f108862OooOo0o;
                    if (str != null && (!list.isEmpty() || !list2.isEmpty())) {
                        Iterator<T> it = ((Iterable) myTemplateFragment.OooOooo().f109051OooooOo.f121747OooOo0o.getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ThemeVO) next).getMyTemplateId(), str)) {
                                break;
                            }
                        }
                        ThemeVO themeVO = next;
                        if ((themeVO != null ? themeVO.getPaperTheme() : null) instanceof TemplateMaterialPaperTheme) {
                            PaperTheme paperTheme = themeVO.getPaperTheme();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme");
                            myTemplateFragment.Oooo0oO(str, (TemplateMaterialPaperTheme) paperTheme);
                        } else {
                            Iterator<T> it2 = ((Iterable) myTemplateFragment.OooOooo().f109053Oooooo0.f121747OooOo0o.getValue()).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it2.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ThemeVO) next2).getMyTemplateId(), str)) {
                                    break;
                                }
                            }
                            ThemeVO themeVO2 = next2;
                            if ((themeVO2 != null ? themeVO2.getPaperTheme() : null) instanceof TemplateBookPaperTheme) {
                                PaperTheme paperTheme2 = themeVO2.getPaperTheme();
                                kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme2, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme");
                                TemplateBookPaperTheme templateBookPaperTheme = (TemplateBookPaperTheme) paperTheme2;
                                if (templateBookPaperTheme.hasVariants()) {
                                    myTemplateFragment.Oooo0o(str, templateBookPaperTheme);
                                } else {
                                    myTemplateFragment.Oooo0O0();
                                }
                            } else {
                                myTemplateFragment.Oooo0O0();
                            }
                        }
                    } else if (str == null) {
                        myTemplateFragment.Oooo0O0();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30484OooO0o0(MyTemplateFragment myTemplateFragment, Continuation<? super C30484OooO0o0> continuation) {
                super(2, continuation);
                this.f108857OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30484OooO0o0(this.f108857OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C30484OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108858OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplateFragment myTemplateFragment = this.f108857OooOo;
                    C33758OoooO c33758OoooOOooO0oo = C25252OooO0Oo.OooO0oo(myTemplateFragment.OooOooo().f109034Oooo0o0, myTemplateFragment.OooOooo().f109051OooooOo, myTemplateFragment.OooOooo().f109053Oooooo0, new C20082OooO00o(4, null));
                    OooO0O0 oooO0O0 = new OooO0O0(myTemplateFragment);
                    this.f108858OooOo0o = 1;
                    if (c33758OoooOOooO0oo.collect(oooO0O0, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$7", m80623f = "MyTemplateFragment.kt", m80624l = {799}, m80625m = "invokeSuspend")
        public static final class C30485OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108863OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108864OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0oO$OooO00o, reason: collision with other inner class name */
            public static final class C20083OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108865OooOo0o;

                public C20083OooO00o(MyTemplateFragment myTemplateFragment) {
                    this.f108865OooOo0o = myTemplateFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    if (str != null) {
                        MyTemplateFragment myTemplateFragment = this.f108865OooOo0o;
                        String strOooo0OO = MyTemplateFragment.Oooo0OO(str);
                        int iOrdinal = myTemplateFragment.f78636OoooOOO.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                C28675OooO0Oo c28675OooO0Oo = myTemplateFragment.f78633OoooO00;
                                List<T> list = c28675OooO0Oo.f66021OooO00o.f65811OooO0o;
                                kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                                List<T> list2 = list;
                                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                                for (T t : list2) {
                                    arrayList.add(PageColorThemeVO.copy$default(t, 0, kotlin.jvm.internal.OooOOO0.OooO0O0(MyTemplateFragment.Oooo0OO(MyTemplateFragment.Oooo00O(t.getColor())), strOooo0OO), false, false, false, 29, null));
                                }
                                c28675OooO0Oo.OooO0Oo(arrayList);
                            } else {
                                if (iOrdinal != 2) {
                                    throw new C32442OooOO0o();
                                }
                                C28675OooO0Oo c28675OooO0Oo2 = myTemplateFragment.f78640o000oOoO;
                                List<T> list3 = c28675OooO0Oo2.f66021OooO00o.f65811OooO0o;
                                kotlin.jvm.internal.OooOOO0.OooO0o(list3, "getCurrentList(...)");
                                List<T> list4 = list3;
                                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                                for (T t2 : list4) {
                                    arrayList2.add(PageColorThemeVO.copy$default(t2, 0, kotlin.jvm.internal.OooOOO0.OooO0O0(MyTemplateFragment.Oooo0OO(MyTemplateFragment.Oooo00O(t2.getColor())), strOooo0OO), false, false, false, 29, null));
                                }
                                c28675OooO0Oo2.OooO0Oo(arrayList2);
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30485OooO0oO(MyTemplateFragment myTemplateFragment, Continuation<? super C30485OooO0oO> continuation) {
                super(2, continuation);
                this.f108863OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30485OooO0oO(this.f108863OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C30485OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108864OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                MyTemplateFragment myTemplateFragment = this.f108863OooOo;
                C33781o00o0O c33781o00o0O = myTemplateFragment.OooOooo().f109026Oooo;
                C20083OooO00o c20083OooO00o = new C20083OooO00o(myTemplateFragment);
                this.f108864OooOo0o = 1;
                c33781o00o0O.collect(c20083OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$8", m80623f = "MyTemplateFragment.kt", m80624l = {815}, m80625m = "invokeSuspend")
        public static final class C30486OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ MyTemplateFragment f108866OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108867OooOo0o;

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$observeViewModel$1$1$8$1", m80623f = "MyTemplateFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C20084OooO00o extends AbstractC32476OooO implements InterfaceC32509OooOOo<String, List<? extends ThemeVO>, List<? extends ThemeVO>, Continuation<? super C32449OooOOoo<? extends String, ? extends List<? extends ThemeVO>, ? extends List<? extends ThemeVO>>>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ List f108868OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ String f108869OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public /* synthetic */ List f108870OooOoO0;

                @Override // oO0O000o.InterfaceC32509OooOOo
                public final Object invoke(String str, List<? extends ThemeVO> list, List<? extends ThemeVO> list2, Continuation<? super C32449OooOOoo<? extends String, ? extends List<? extends ThemeVO>, ? extends List<? extends ThemeVO>>> continuation) {
                    C20084OooO00o c20084OooO00o = new C20084OooO00o(4, continuation);
                    c20084OooO00o.f108869OooOo0o = str;
                    c20084OooO00o.f108868OooOo = list;
                    c20084OooO00o.f108870OooOoO0 = list2;
                    return c20084OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C32449OooOOoo(this.f108869OooOo0o, this.f108868OooOo, this.f108870OooOoO0);
                }
            }

            /* JADX INFO: renamed from: o0o0OOO.OooOoO0$OooO00o$OooO0oo$OooO0O0 */
            public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ MyTemplateFragment f108871OooOo0o;

                public OooO0O0(MyTemplateFragment myTemplateFragment) {
                    this.f108871OooOo0o = myTemplateFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    ScrollView scrollView;
                    final int i;
                    C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) obj;
                    String str = (String) c32449OooOOoo.f116648OooOo0o;
                    List list = (List) c32449OooOOoo.f116647OooOo;
                    List list2 = (List) c32449OooOOoo.f116649OooOoO0;
                    if (str != null && (!list.isEmpty() || !list2.isEmpty())) {
                        final MyTemplateFragment myTemplateFragment = this.f108871OooOo0o;
                        View view = myTemplateFragment.getView();
                        if (view != null && (scrollView = (ScrollView) view.findViewById(R.id.template_scroll_view)) != null) {
                            Iterator it = list.iterator();
                            final int i2 = 0;
                            while (true) {
                                i = -1;
                                if (!it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                PaperTheme paperTheme = ((ThemeVO) it.next()).getPaperTheme();
                                if ((paperTheme instanceof TemplateMaterialPaperTheme) && kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateMaterialPaperTheme) paperTheme).getMaterialId(), str)) {
                                    break;
                                }
                                i2++;
                            }
                            if (i2 >= 0) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooO00o(C20860Ooooooo.OooO0OO(c20358OooO00o, "MyTemplateFragment", "scrollToMaterialTemplate: found in materialTemplates at index=", i2), new Object[0]);
                                scrollView.post(new RunnableC22692ooOO(scrollView, 1));
                                RecyclerView recyclerView = myTemplateFragment.f78613OooOoO;
                                if (recyclerView == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvMaterialTemplates");
                                    throw null;
                                }
                                recyclerView.post(new Runnable() { // from class: o0o0OOO.OooOo0o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        RecyclerView recyclerView2 = myTemplateFragment.f78613OooOoO;
                                        if (recyclerView2 == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvMaterialTemplates");
                                            throw null;
                                        }
                                        RecyclerView.OooOOOO layoutManager = recyclerView2.getLayoutManager();
                                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                        if (linearLayoutManager != null) {
                                            linearLayoutManager.scrollToPositionWithOffset(i2, 0);
                                        }
                                    }
                                });
                            } else {
                                Iterator it2 = list2.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    PaperTheme paperTheme2 = ((ThemeVO) it2.next()).getPaperTheme();
                                    if ((paperTheme2 instanceof TemplateBookPaperTheme) && kotlin.jvm.internal.OooOOO0.OooO0O0(((TemplateBookPaperTheme) paperTheme2).getMaterialId(), str)) {
                                        i = i3;
                                        break;
                                    }
                                    i3++;
                                }
                                if (i >= 0) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooO00o(C20860Ooooooo.OooO0OO(c20358OooO00o2, "MyTemplateFragment", "scrollToMaterialTemplate: found in templateBooks at index=", i), new Object[0]);
                                    scrollView.post(new androidx.appcompat.widget.o000oOoO(scrollView, 1));
                                    RecyclerView recyclerView2 = myTemplateFragment.f78615OooOoOO;
                                    if (recyclerView2 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvTemplateBooks");
                                        throw null;
                                    }
                                    recyclerView2.post(new Runnable() { // from class: o0o0OOO.OooOo
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            RecyclerView recyclerView3 = myTemplateFragment.f78615OooOoOO;
                                            if (recyclerView3 == null) {
                                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvTemplateBooks");
                                                throw null;
                                            }
                                            RecyclerView.OooOOOO layoutManager = recyclerView3.getLayoutManager();
                                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                            if (linearLayoutManager != null) {
                                                linearLayoutManager.scrollToPositionWithOffset(i, 0);
                                            }
                                        }
                                    });
                                } else {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOO0O(C22201OooO0oO.OooO0O0(c20358OooO00o3, "MyTemplateFragment", "scrollToMaterialTemplate: materialId=", str, " not found in any list"), new Object[0]);
                                }
                            }
                        }
                        myTemplateFragment.OooOooo().f109054OoooooO.setValue(null);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30486OooO0oo(MyTemplateFragment myTemplateFragment, Continuation<? super C30486OooO0oo> continuation) {
                super(2, continuation);
                this.f108866OooOo = myTemplateFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C30486OooO0oo(this.f108866OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C30486OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108867OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    MyTemplateFragment myTemplateFragment = this.f108866OooOo;
                    C33758OoooO c33758OoooOOooO0oo = C25252OooO0Oo.OooO0oo(myTemplateFragment.OooOooo().f109055Ooooooo, myTemplateFragment.OooOooo().f109051OooooOo, myTemplateFragment.OooOooo().f109053Oooooo0, new C20084OooO00o(4, null));
                    OooO0O0 oooO0O0 = new OooO0O0(myTemplateFragment);
                    this.f108867OooOo0o = 1;
                    if (c33758OoooOOooO0oo.collect(oooO0O0, this) == enumC32485OooO00o) {
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
        public OooO00o(MyTemplateFragment myTemplateFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f108836OooOo = myTemplateFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f108836OooOo, continuation);
            oooO00o.f108837OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f108837OooOo0o;
            MyTemplateFragment myTemplateFragment = this.f108836OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C20076OooO00o(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30483OooO0Oo(myTemplateFragment, null), 3);
            InterfaceC21987OooOoo viewLifecycleOwner = myTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0000(myTemplateFragment, null), 3);
            InterfaceC21987OooOoo viewLifecycleOwner2 = myTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30524o00000oo(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30484OooO0o0(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30485OooO0oO(myTemplateFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30486OooO0oo(myTemplateFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30482OooOoO0(MyTemplateFragment myTemplateFragment, Continuation<? super C30482OooOoO0> continuation) {
        super(2, continuation);
        this.f108834OooOo = myTemplateFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30482OooOoO0(this.f108834OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30482OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108835OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            MyTemplateFragment myTemplateFragment = this.f108834OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = myTemplateFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(myTemplateFragment, null);
            this.f108835OooOo0o = 1;
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
