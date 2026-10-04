package o0o00oo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$15", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30110OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107196OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107197OooOo0o;

    /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$15$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1331}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f107198OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107199OooOo0o;

        /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20042OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f107200OooOo0o;

            public C20042OooO00o(NoteListContainerFragment noteListContainerFragment) {
                this.f107200OooOo0o = noteListContainerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
                NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
                NoteListContainerFragment noteListContainerFragment = this.f107200OooOo0o;
                if (noteVO == null) {
                    View view = noteListContainerFragment.f77344Oooo0O0;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                        throw null;
                    }
                    view.setVisibility(0);
                    View view2 = noteListContainerFragment.f77346Oooo0o;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("creativeLibraryEntry");
                        throw null;
                    }
                    view2.setVisibility(0);
                    TextView textView = noteListContainerFragment.f77349Oooo0oo;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                        throw null;
                    }
                    textView.setVisibility(8);
                    View view3 = noteListContainerFragment.f77339Oooo;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                        throw null;
                    }
                    view3.setVisibility(8);
                    ViewGroup viewGroup = noteListContainerFragment.f77370o00O0O;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                    }
                } else {
                    View view4 = noteListContainerFragment.f77344Oooo0O0;
                    if (view4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                        throw null;
                    }
                    view4.setVisibility(0);
                    View view5 = noteListContainerFragment.f77346Oooo0o;
                    if (view5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("creativeLibraryEntry");
                        throw null;
                    }
                    view5.setVisibility(8);
                    TextView textView2 = noteListContainerFragment.f77349Oooo0oo;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                        throw null;
                    }
                    textView2.setVisibility(0);
                    View view6 = noteListContainerFragment.f77339Oooo;
                    if (view6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                        throw null;
                    }
                    view6.setVisibility(0);
                    TextView textView3 = noteListContainerFragment.f77349Oooo0oo;
                    if (textView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                        throw null;
                    }
                    textView3.setText(noteVO.getName());
                    if (noteVO2 == null) {
                        TextView textView4 = noteListContainerFragment.f77352OoooO00;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackParentFolderName");
                            throw null;
                        }
                        textView4.setText(noteListContainerFragment.getString(R.string.desktop));
                    } else {
                        TextView textView5 = noteListContainerFragment.f77352OoooO00;
                        if (textView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackParentFolderName");
                            throw null;
                        }
                        textView5.setText(noteVO2.getName());
                    }
                    ViewGroup viewGroup2 = noteListContainerFragment.f77370o00O0O;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                }
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                Integer num = new Integer(0);
                C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f77149Oooo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, num);
                View view7 = noteListContainerFragment.f77366Oooooo0;
                if (view7 != null) {
                    view7.setVisibility(noteVO == null ? 0 : 8);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("labelColorFilterSection");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107198OooOo = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107198OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107199OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            NoteListContainerFragment noteListContainerFragment = this.f107198OooOo;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
            C20042OooO00o c20042OooO00o = new C20042OooO00o(noteListContainerFragment);
            this.f107199OooOo0o = 1;
            oooO0OOOooOoo.f77161OoooO00.collect(c20042OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$15$2", m80623f = "NoteListContainerFragment.kt", m80624l = {1366}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f107201OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107202OooOo0o;

        /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f107203OooOo0o;

            public OooO00o(NoteListContainerFragment noteListContainerFragment) {
                this.f107203OooOo0o = noteListContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                NoteListContainerFragment noteListContainerFragment = this.f107203OooOo0o;
                if (iIntValue == 0) {
                    View view = noteListContainerFragment.f77343Oooo00o;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("atbNormal");
                        throw null;
                    }
                    view.setVisibility(0);
                    View view2 = noteListContainerFragment.f77351OoooO0;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
                        throw null;
                    }
                    view2.setVisibility(8);
                    View view3 = noteListContainerFragment.f77354OoooOO0;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
                        throw null;
                    }
                    view3.setVisibility(8);
                } else if (iIntValue == 1) {
                    View view4 = noteListContainerFragment.f77343Oooo00o;
                    if (view4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("atbNormal");
                        throw null;
                    }
                    view4.setVisibility(8);
                    View view5 = noteListContainerFragment.f77351OoooO0;
                    if (view5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
                        throw null;
                    }
                    view5.setVisibility(0);
                    View view6 = noteListContainerFragment.f77354OoooOO0;
                    if (view6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
                        throw null;
                    }
                    view6.setVisibility(0);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f107201OooOo = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f107201OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107202OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            NoteListContainerFragment noteListContainerFragment = this.f107201OooOo;
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
            OooO00o oooO00o = new OooO00o(noteListContainerFragment);
            this.f107202OooOo0o = 1;
            oooO0OOOooOoo.f77147OooOooo.collect(oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$15$3", m80623f = "NoteListContainerFragment.kt", m80624l = {1383}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f107204OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107205OooOo0o;

        /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f107206OooOo0o;

            public OooO00o(NoteListContainerFragment noteListContainerFragment) {
                this.f107206OooOo0o = noteListContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List list = (List) obj;
                boolean zIsEmpty = list.isEmpty();
                NoteListContainerFragment noteListContainerFragment = this.f107206OooOo0o;
                if (zIsEmpty) {
                    TextView textView = noteListContainerFragment.f77350OoooO;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                        throw null;
                    }
                    textView.setText(noteListContainerFragment.getResources().getString(R.string.action_bar_select_all));
                } else {
                    TextView textView2 = noteListContainerFragment.f77350OoooO;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                        throw null;
                    }
                    textView2.setText(noteListContainerFragment.getResources().getString(R.string.action_bar_cancel_select));
                }
                TextView textView3 = noteListContainerFragment.f77350OoooO;
                if (textView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                    throw null;
                }
                textView3.requestLayout();
                List list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((NoteVO) it.next()).getType()));
                }
                if (oOo000Oo.OooOo.Oooo0(arrayList).isEmpty()) {
                    ImageView imageView = noteListContainerFragment.f77369o000oOoO;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
                        throw null;
                    }
                    imageView.setEnabled(false);
                    ImageView imageView2 = noteListContainerFragment.f77355OoooOOO;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
                        throw null;
                    }
                    imageView2.setEnabled(false);
                    ImageView imageView3 = noteListContainerFragment.f77356OoooOOo;
                    if (imageView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnMove");
                        throw null;
                    }
                    imageView3.setEnabled(false);
                    ImageView imageView4 = noteListContainerFragment.f77357OoooOo0;
                    if (imageView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
                        throw null;
                    }
                    imageView4.setEnabled(false);
                    ImageView imageView5 = noteListContainerFragment.f77358OoooOoO;
                    if (imageView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnLabel");
                        throw null;
                    }
                    imageView5.setEnabled(false);
                } else {
                    ImageView imageView6 = noteListContainerFragment.f77369o000oOoO;
                    if (imageView6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
                        throw null;
                    }
                    imageView6.setEnabled(!r9.contains(new Integer(1)));
                    ImageView imageView7 = noteListContainerFragment.f77355OoooOOO;
                    if (imageView7 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
                        throw null;
                    }
                    imageView7.setEnabled(true);
                    ImageView imageView8 = noteListContainerFragment.f77356OoooOOo;
                    if (imageView8 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnMove");
                        throw null;
                    }
                    imageView8.setEnabled(true);
                    ImageView imageView9 = noteListContainerFragment.f77357OoooOo0;
                    if (imageView9 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
                        throw null;
                    }
                    imageView9.setEnabled(true);
                    ImageView imageView10 = noteListContainerFragment.f77358OoooOoO;
                    if (imageView10 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnLabel");
                        throw null;
                    }
                    imageView10.setEnabled(true);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f107204OooOo = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f107204OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107205OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteListContainerFragment noteListContainerFragment = this.f107204OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(noteListContainerFragment);
                this.f107205OooOo0o = 1;
                if (oooO0OOOooOoo.f77172OooooOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initActionBar$15$4", m80623f = "NoteListContainerFragment.kt", m80624l = {1415}, m80625m = "invokeSuspend")
    public static final class C30111OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f107207OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107208OooOo0o;

        /* JADX INFO: renamed from: o0o00oo.OooOOo0$OooO0Oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f107209OooOo0o;

            public OooO00o(NoteListContainerFragment noteListContainerFragment) {
                this.f107209OooOo0o = noteListContainerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                Folder folder = (Folder) obj;
                NoteListContainerFragment noteListContainerFragment = this.f107209OooOo0o;
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue()).f116637OooOo;
                NoteVO noteVOCopy$default = null;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO != null ? noteVO.getId() : null, folder != null ? folder.getId() : null)) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO != null ? noteVO.getName() : null, folder != null ? folder.getTitle() : null)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                if (noteVO2 != null) {
                    noteVOCopy$default = NoteVO.copy$default(noteVO2, null, null, null, null, folder != null ? folder.getId() : null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, 0, null, false, false, 0L, false, null, false, 2147483631, null);
                }
                Object objOooOoO0 = noteListContainerFragment.OooOoo().OooOoO0(noteVOCopy$default, continuation);
                return objOooOoO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOoO0 : C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30111OooO0Oo(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30111OooO0Oo> continuation) {
            super(2, continuation);
            this.f107207OooOo = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C30111OooO0Oo(this.f107207OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C30111OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107208OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteListContainerFragment noteListContainerFragment = this.f107207OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(noteListContainerFragment);
                this.f107208OooOo0o = 1;
                if (oooO0OOOooOoo.f77160OoooO0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
    public C30110OooOOo0(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30110OooOOo0> continuation) {
        super(2, continuation);
        this.f107196OooOo = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30110OooOOo0 c30110OooOOo0 = new C30110OooOOo0(this.f107196OooOo, continuation);
        c30110OooOOo0.f107197OooOo0o = obj;
        return c30110OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30110OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f107197OooOo0o;
        NoteListContainerFragment noteListContainerFragment = this.f107196OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteListContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteListContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteListContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C30111OooO0Oo(noteListContainerFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
