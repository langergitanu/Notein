package com.orion.notein.p607ui.notelist.label;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.ui.notelist.label.LabelListFragment.OooO0O0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o0o.C28235OooOOO;
import o0Oo0o0o.ViewOnClickListenerC28232OooOO0;
import o0Oo0o0o.ViewOnClickListenerC28241OooOOoo;
import o0o00oOo.C30028OooO;
import o0o00oOo.C30030OooO0O0;
import o0o00oOo.C30031OooO0OO;
import o0o00oOo.C30035OooO0oO;
import o0o00oOo.C30051OooOooO;
import o0o00oOo.C30082o00000Oo;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30214OooOoOO;
import o0o0O00O.C30247OooOo0o;
import o0o0O00O.C30251OooOoo;
import o0o0O00O.C30253OooOooO;
import o0o0O00O.Oooo000;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/label/LabelListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelListFragment extends Hilt_LabelListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f77757OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f77758OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public NoteVOFilter f77759OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f77760OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO00o f77761Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public RecyclerView f77762Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C30035OooO0oO f77763Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30051OooOooO f77764Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public o0o0O0.OooO f77765Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C30082o00000Oo f77766Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public RecyclerView f77767Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C30030OooO0O0 f77768Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0o0O000.OooO0OO f77769Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C30031OooO0OO f77770Oooo0oo;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return LabelListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onResume$1$1", m80623f = "LabelListFragment.kt", m80624l = {130}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f77772OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77773OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ LabelListFragment f77774OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f77775OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f77776OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, LabelListFragment labelListFragment, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f77772OooOo = str;
            this.f77775OooOoO0 = str2;
            this.f77774OooOoO = labelListFragment;
            this.f77776OooOoOO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f77772OooOo, this.f77775OooOoO0, this.f77774OooOoO, this.f77776OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ActivityC21897OooOo0 activity;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77773OooOo0o;
            LabelListFragment labelListFragment = this.f77774OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f77772OooOo;
                if (str.length() > 0) {
                    String str2 = this.f77775OooOoO0;
                    if (str2.length() > 0) {
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                        this.f77773OooOo0o = 1;
                        obj = oooO0OOOooOoo.OooOo0O(str, this.f77776OooOoOO, str2, this);
                        if (obj == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue() && (activity = labelListFragment.getActivity()) != null) {
                String string = labelListFragment.getString(R.string.rename_fail);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(activity, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onResume$2$1", m80623f = "LabelListFragment.kt", m80624l = {148}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77778OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Bundle f77779OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f77780OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Bundle bundle, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f77780OooOoO0 = str;
            this.f77779OooOoO = bundle;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LabelListFragment.this.new OooO0O0(this.f77780OooOoO0, this.f77779OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77778OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = LabelListFragment.this.OooOoo();
                this.f77778OooOo0o = 1;
                if (oooO0OOOooOoo.OooOo00(this.f77779OooOoO, this.f77780OooOoO0) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$10$1$1", m80623f = "LabelListFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f77781OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C30251OooOoo f77782OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ LabelListFragment f77783OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f77784OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(View view, LabelListFragment labelListFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f77784OooOoO0 = view;
            this.f77783OooOoO = labelListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f77784OooOoO0, this.f77783OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [oO0O000o.OooO00o] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v2, types: [o0o0O00O.OooOoo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ?? r0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77781OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Object tag = this.f77784OooOoO0.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderColorVO");
                final LabelListFragment labelListFragment = this.f77783OooOoO;
                final int i2 = ((C31040OooOO0o) tag).f110821OooO00o;
                ?? r1 = new oO0O000o.OooO00o() { // from class: o0o0O00O.OooOoo
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        labelListFragment.OooOoo().OooOooO(i2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                };
                if (i2 == 0) {
                    r1.invoke();
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f77782OooOo0o = r1;
                this.f77781OooOo = 1;
                obj = LabelListFragment.OooOoO(labelListFragment, 24, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                r0 = r1;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C30251OooOoo c30251OooOoo = this.f77782OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r0 = c30251OooOoo;
            }
            if (!((Boolean) obj).booleanValue()) {
                r0.invoke();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11", m80623f = "LabelListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23684OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77786OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$1", m80623f = "LabelListFragment.kt", m80624l = {StyleIdentifier.UNRESOLVED_MENTION}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelListFragment f77787OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77788OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19415OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ LabelListFragment f77789OooOo0o;

                public C19415OooO00o(LabelListFragment labelListFragment) {
                    this.f77789OooOo0o = labelListFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = ((List) obj).iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        LabelListFragment labelListFragment = this.f77789OooOo0o;
                        if (!zHasNext) {
                            Iterator<T> it2 = ((Iterable) labelListFragment.OooOoo().f77159OoooO.f121747OooOo0o.getValue()).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it2.next();
                                if (((SortKeyVO) next).getSelected()) {
                                    break;
                                }
                            }
                            SortKeyVO sortKeyVO = next;
                            if ((sortKeyVO != null ? sortKeyVO.getKey() : null) == com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0) {
                                C30035OooO0oO c30035OooO0oO = labelListFragment.f77763Oooo00O;
                                if (c30035OooO0oO == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                                    throw null;
                                }
                                final C30253OooOooO c30253OooOooO = new C30253OooOooO();
                                c30035OooO0oO.OooO0Oo(OooOo.o00O0O(arrayList, new Comparator() { // from class: o0o0O00O.OooOooo
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj2, Object obj3) {
                                        return ((Number) c30253OooOooO.invoke(obj2, obj3)).intValue();
                                    }
                                }));
                            } else {
                                C30035OooO0oO c30035OooO0oO2 = labelListFragment.f77763Oooo00O;
                                if (c30035OooO0oO2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                                    throw null;
                                }
                                c30035OooO0oO2.OooO0Oo(arrayList);
                            }
                            View view = labelListFragment.f77760OooOooo;
                            if (view != null) {
                                view.setVisibility(arrayList.isEmpty() ? 0 : 8);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBackground");
                            throw null;
                        }
                        T next2 = it.next();
                        NoteVO noteVO = (NoteVO) next2;
                        NoteVOFilter noteVOFilter = labelListFragment.f77759OooOooO;
                        if (noteVOFilter == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
                            throw null;
                        }
                        if (noteVOFilter.getFilterFunction().invoke(noteVO).booleanValue()) {
                            arrayList.add(next2);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LabelListFragment labelListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77787OooOo = labelListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77787OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77788OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    LabelListFragment labelListFragment = this.f77787OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                    C19415OooO00o c19415OooO00o = new C19415OooO00o(labelListFragment);
                    this.f77788OooOo0o = 1;
                    if (oooO0OOOooOoo.f77170Ooooo0o.f121747OooOo0o.collect(c19415OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$2", m80623f = "LabelListFragment.kt", m80624l = {393}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelListFragment f77790OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77791OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$2$1", m80623f = "LabelListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31040OooOO0o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LabelListFragment f77792OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77793OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(LabelListFragment labelListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77792OooOo = labelListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77792OooOo, continuation);
                    oooO00o.f77793OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31040OooOO0o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f77793OooOo0o;
                    o0o0O000.OooO0OO oooO0OO = this.f77792OooOo.f77769Oooo0oO;
                    if (oooO0OO != null) {
                        oooO0OO.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(LabelListFragment labelListFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f77790OooOo = labelListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f77790OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77791OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    LabelListFragment labelListFragment = this.f77790OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(labelListFragment, null);
                    this.f77791OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77140OooOo0o, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$3", m80623f = "LabelListFragment.kt", m80624l = {400}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelListFragment f77794OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77795OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$3$1", m80623f = "LabelListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LabelListFragment f77796OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77797OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(LabelListFragment labelListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77796OooOo = labelListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77796OooOo, continuation);
                    oooO00o.f77797OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(bool, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Boolean bool = (Boolean) this.f77797OooOo0o;
                    if (bool == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    LabelListFragment labelListFragment = this.f77796OooOo;
                    if (zBooleanValue) {
                        RecyclerView recyclerView = labelListFragment.f77762Oooo000;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                            throw null;
                        }
                        recyclerView.addItemDecoration(labelListFragment.f77770Oooo0oo);
                    } else {
                        RecyclerView recyclerView2 = labelListFragment.f77762Oooo000;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                            throw null;
                        }
                        recyclerView2.removeItemDecoration(labelListFragment.f77770Oooo0oo);
                    }
                    RecyclerView recyclerView3 = labelListFragment.f77762Oooo000;
                    if (recyclerView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                        throw null;
                    }
                    recyclerView3.setVisibility(0);
                    C30051OooOooO c30051OooOooO = labelListFragment.f77764Oooo00o;
                    if (c30051OooOooO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("itemTouchCallback");
                        throw null;
                    }
                    c30051OooOooO.f106860OooO0oO = bool.booleanValue();
                    C30035OooO0oO c30035OooO0oO = labelListFragment.f77763Oooo00O;
                    if (c30035OooO0oO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    if (Boolean.valueOf(c30035OooO0oO.f106771OooO0Oo).equals(bool)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C30035OooO0oO c30035OooO0oO2 = labelListFragment.f77763Oooo00O;
                    if (c30035OooO0oO2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO2.f106771OooO0Oo = bool.booleanValue();
                    C30035OooO0oO c30035OooO0oO3 = labelListFragment.f77763Oooo00O;
                    if (c30035OooO0oO3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO3.notifyDataSetChanged();
                    labelListFragment.OooOooO();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(LabelListFragment labelListFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f77794OooOo = labelListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f77794OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77795OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    LabelListFragment labelListFragment = this.f77794OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(labelListFragment, null);
                    this.f77795OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77164OoooOOO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO0Oo, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$4", m80623f = "LabelListFragment.kt", m80624l = {428}, m80625m = "invokeSuspend")
        public static final class C19416OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelListFragment f77798OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77799OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0Oo$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$11$4$1", m80623f = "LabelListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ LabelListFragment f77800OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77801OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(LabelListFragment labelListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77800OooOo = labelListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77800OooOo, continuation);
                    oooO00o.f77801OooOo0o = obj;
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
                    Integer num = (Integer) this.f77801OooOo0o;
                    LabelListFragment labelListFragment = this.f77800OooOo;
                    if (num != null) {
                        RecyclerView recyclerView = labelListFragment.f77767Oooo0o;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorList");
                            throw null;
                        }
                        NoteVOFilter noteVOFilter = C30214OooOoOO.f107601OooO0o;
                        recyclerView.setVisibility(num.intValue() == C30214OooOoOO.f107602OooO0oO.getIndex() ? 0 : 8);
                    } else {
                        RecyclerView recyclerView2 = labelListFragment.f77767Oooo0o;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorList");
                            throw null;
                        }
                        NoteVOFilter noteVOFilter2 = labelListFragment.f77759OooOooO;
                        if (noteVOFilter2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
                            throw null;
                        }
                        int index = noteVOFilter2.getIndex();
                        NoteVOFilter noteVOFilter3 = C30214OooOoOO.f107601OooO0o;
                        recyclerView2.setVisibility(index == C30214OooOoOO.f107602OooO0oO.getIndex() ? 0 : 8);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19416OooO0Oo(LabelListFragment labelListFragment, Continuation<? super C19416OooO0Oo> continuation) {
                super(2, continuation);
                this.f77798OooOo = labelListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19416OooO0Oo(this.f77798OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19416OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77799OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    LabelListFragment labelListFragment = this.f77798OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(labelListFragment, null);
                    this.f77799OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77158Oooo0oo, oooO00o, this) == enumC32485OooO00o) {
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

        public C23684OooO0Oo(Continuation<? super C23684OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23684OooO0Oo c23684OooO0Oo = LabelListFragment.this.new C23684OooO0Oo(continuation);
            c23684OooO0Oo.f77786OooOo0o = obj;
            return c23684OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23684OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77786OooOo0o;
            LabelListFragment labelListFragment = LabelListFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(labelListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(labelListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(labelListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19416OooO0Oo(labelListFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$4$2", m80623f = "LabelListFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77803OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77804OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NoteVO noteVO, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f77804OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LabelListFragment.this.new OooO0o(this.f77804OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77803OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = LabelListFragment.this.OooOoo();
                this.f77803OooOo0o = 1;
                if (oooO0OOOooOoo.OooOo0(this.f77804OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$4$1", m80623f = "LabelListFragment.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_3}, m80625m = "invokeSuspend")
    public static final class C23685OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77806OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77807OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23685OooO0o0(NoteVO noteVO, Continuation<? super C23685OooO0o0> continuation) {
            super(2, continuation);
            this.f77807OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LabelListFragment.this.new C23685OooO0o0(this.f77807OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23685OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77806OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = LabelListFragment.this.OooOoo();
                this.f77806OooOo0o = 1;
                if (oooO0OOOooOoo.Oooo00o(this.f77807OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$4$3", m80623f = "LabelListFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class C23686OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77809OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77810OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onViewCreated$4$3$1", m80623f = "LabelListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LabelListFragment f77811OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LabelListFragment labelListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77811OooOo0o = labelListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77811OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Fragment parentFragment = this.f77811OooOo0o.getParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parentFragment, "null cannot be cast to non-null type com.orion.notein.ui.notelist.label.LabelContainerFragment");
                LabelContainerFragment labelContainerFragment = (LabelContainerFragment) parentFragment;
                C30214OooOoOO c30214OooOoOO = labelContainerFragment.f77711Oooo00o;
                if (c30214OooOoOO != null) {
                    c30214OooOoOO.f107606OooO0OO.OooO0OO(0, false);
                } else {
                    labelContainerFragment.OooOoo().OooOoo(Integer.valueOf(C30214OooOoOO.f107601OooO0o.getIndex()));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23686OooO0oO(NoteVO noteVO, Continuation<? super C23686OooO0oO> continuation) {
            super(2, continuation);
            this.f77810OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LabelListFragment.this.new C23686OooO0oO(this.f77810OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23686OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r6, r1, r5) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77809OooOo0o;
            LabelListFragment labelListFragment = LabelListFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                this.f77809OooOo0o = 1;
                if (oooO0OOOooOoo.OooOoO0(this.f77810OooOoO0, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(labelListFragment, null);
            this.f77809OooOo0o = 2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23687OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23687OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return LabelListFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return LabelListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28235OooOOO f77814OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(C28235OooOOO c28235OooOOO) {
            super(0);
            this.f77814OooOo0o = c28235OooOOO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77814OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.label.LabelListFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23688OooOO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77815OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23688OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77815OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77815OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOOO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77816OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77816OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77816OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LabelListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77818OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77818OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77818OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public LabelListFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooOO0O(new C28235OooOOO(this, 1)));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77758OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class), new C23688OooOO0o(interfaceC32440OooOO0OooO0O0), new OooOOO(interfaceC32440OooOO0OooO0O0), new OooOOO0(interfaceC32440OooOO0OooO0O0));
        this.f77757OooOoo = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23687OooO0oo(), new OooOO0(), new OooO());
        this.f77770Oooo0oo = new C30031OooO0OO(o000000O.OooO0o(300));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(LabelListFragment labelListFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i2 = oooo000.f107807OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooo000.f107807OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(labelListFragment, abstractC32479OooO0OO);
            }
        }
        Oooo000 oooo0002 = oooo000;
        Object objShowNonVipFeatureLimitedDialog$default = oooo0002.f107806OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooo0002.f107807OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = labelListFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            oooo0002.f107807OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, oooo0002, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public final int OooOoOO(Context context) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooOoo().f77164OoooOOO.f121747OooOo0o.getValue(), Boolean.TRUE)) {
            return 1;
        }
        return Math.max(1, (context.getResources().getConfiguration().screenWidthDp - 56) / 143);
    }

    public final com.orion.notein.p607ui.notelist.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.notelist.OooO0OO) this.f77758OooOoo0.getValue();
    }

    public final LockNoteFragment OooOoo0() {
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo("LockNoteFragment");
        if (fragmentOooOooo != null) {
            return (LockNoteFragment) fragmentOooOooo;
        }
        LockNoteFragment lockNoteFragment = new LockNoteFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
        oooO00oOooO0OO.OooOO0O();
        return lockNoteFragment;
    }

    public final void OooOooO() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView recyclerView = this.f77762Oooo000;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iOooOoOO = OooOoOO(context);
        if (gridLayoutManager.f65751OooOo != iOooOoOO) {
            RecyclerView recyclerView2 = this.f77762Oooo000;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                throw null;
            }
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), iOooOoOO);
            gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
            recyclerView2.setLayoutManager(gridLayoutManager2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_label_note_list, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Oooo0O0.OooOO0.OooO00o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OooOooO();
        requireActivity().getSupportFragmentManager().Oooooo0("rename", this, new InterfaceC21912Oooo0o() { // from class: o0o0O00O.OooOO0o
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                int i = bundle.getInt(C18437z2.f56754h);
                String string = bundle.getString("id");
                String str2 = string == null ? "" : string;
                String string2 = bundle.getString("new_name");
                String str3 = string2 == null ? "" : string2;
                LabelListFragment labelListFragment = this.f107752OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new LabelListFragment.OooO00o(str2, str3, labelListFragment, i, null), 3);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("pdf_password", this, new InterfaceC21912Oooo0o() { // from class: o0o0O00O.OooOOOO
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("id");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("password");
                Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("password", string2 != null ? string2 : ""));
                LabelListFragment labelListFragment = this.f107758OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, labelListFragment.new OooO0O0(string, bundleBundleOf, null), 3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null) {
            this.f77759OooOooO = C30214OooOoOO.f107601OooO0o;
        } else {
            if (!arguments.containsKey("filter")) {
                arguments = null;
            }
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("filter");
                kotlin.jvm.internal.OooOOO0.OooO0o0(serializable, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVOFilter");
                this.f77759OooOooO = (NoteVOFilter) serializable;
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(requireContext(), "requireContext(...)");
        C20519OooO0Oo.OooO0OO(new C30028OooO());
        new AtomicBoolean(false);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f77768Oooo0o0 = new C30030OooO0O0(contextRequireContext, new InterfaceC32508OooOOOo() { // from class: o0o0O00O.OooOOoo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                String folderId = (String) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
                LabelListFragment labelListFragment = this.f107762OooOo0o;
                C30246OooOo0O c30246OooOo0O = new C30246OooOo0O(labelListFragment, folderId, iIntValue, null);
                InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30245OooOo0(iIntValue, c30246OooOo0O, labelListFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f77761Oooo0 = new com.orion.notein.p607ui.notelist.OooO00o(contextRequireContext2, new C30247OooOo0o(this));
        C30201OooOOO0 c30201OooOOO0 = new C30201OooOOO0(this, new oO0O000o.OooO00o() { // from class: o0o0O00O.OooOo00
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return this.f107770OooOo0o.OooOoo0();
            }
        }, OooOoo(), (C28201OooooO0) this.f77757OooOoo.getValue());
        Context contextRequireContext3 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
        this.f77765Oooo0O0 = new o0o0O0.OooO(contextRequireContext3, c30201OooOOO0);
        Context contextRequireContext4 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext4, "requireContext(...)");
        this.f77766Oooo0OO = new C30082o00000Oo(contextRequireContext4, new ViewOnClickListenerC28232OooOO0(this, 3));
        this.f77760OooOooo = view.findViewById(R.id.empty_bg_wrapper);
        this.f77762Oooo000 = (RecyclerView) view.findViewById(R.id.item_list);
        C30035OooO0oO c30035OooO0oO = new C30035OooO0oO();
        this.f77763Oooo00O = c30035OooO0oO;
        c30035OooO0oO.f106769OooO0O0 = new ViewOnClickListenerC26035OooOooo(this, 3);
        c30035OooO0oO.f106770OooO0OO = new View.OnContextClickListener() { // from class: o0o0O00O.OooOOOo
            @Override // android.view.View.OnContextClickListener
            public final boolean onContextClick(View view2) {
                Object tag = view2.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                if (noteVO.getInSelectMode()) {
                    return false;
                }
                int type = noteVO.getType();
                if (type != 0 && type != 1) {
                    return false;
                }
                LabelListFragment labelListFragment = this.f107759OooO00o;
                o0o0O0.OooO oooO = labelListFragment.f77765Oooo0O0;
                if (oooO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                if (oooO.OooO0O0()) {
                    o0o0O0.OooO oooO2 = labelListFragment.f77765Oooo0O0;
                    if (oooO2 != null) {
                        oooO2.OooO00o();
                        return true;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                o0o0O0.OooO oooO3 = labelListFragment.f77765Oooo0O0;
                if (oooO3 != null) {
                    oooO3.OooO0OO(view2, noteVO);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                throw null;
            }
        };
        RecyclerView recyclerView = this.f77762Oooo000;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), OooOoOO(context)));
        C30035OooO0oO c30035OooO0oO2 = this.f77763Oooo00O;
        if (c30035OooO0oO2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30035OooO0oO2);
        recyclerView.setItemAnimator(null);
        C30051OooOooO c30051OooOooO = new C30051OooOooO();
        this.f77764Oooo00o = c30051OooOooO;
        c30051OooOooO.f106859OooO0o0 = new InterfaceC32510OooOOo0() { // from class: o0o0O00O.OooOOo0
            /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Object next;
                NoteVO src = (NoteVO) obj;
                NoteVO dst = (NoteVO) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
                kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
                LabelListFragment labelListFragment = this.f107761OooOo0o;
                int type = dst.getType();
                if (type != 0) {
                    if (type == 1) {
                        InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30248OooOoO(zBooleanValue, labelListFragment, src, dst, null), 3);
                    }
                } else if (zBooleanValue) {
                    Iterator it = ((Iterable) labelListFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((NoteVO) next).getType() != 0) {
                            break;
                        }
                    }
                    if (next != null) {
                        Context contextRequireContext5 = labelListFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext5, "requireContext(...)");
                        C25206OooO0Oo.OooO0Oo(contextRequireContext5, "暂不支持此操作");
                    } else {
                        InterfaceC21987OooOoo viewLifecycleOwner2 = labelListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30250OooOoOO(zBooleanValue, labelListFragment, dst, src, null), 2);
                    }
                } else if (src.getType() != 0) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
        };
        c30051OooOooO.f106858OooO0o = new InterfaceC32510OooOOo0() { // from class: o0o0O00O.OooOOo
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                NoteVO src = (NoteVO) obj;
                NoteVO noteVO = (NoteVO) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
                LabelListFragment labelListFragment = this.f107760OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30252OooOoo0(zBooleanValue, labelListFragment, noteVO, src, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        C22041OooOOo c22041OooOOo = new C22041OooOOo(c30051OooOooO);
        RecyclerView recyclerView2 = this.f77762Oooo000;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView2);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.rv_folder_color_list);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(recyclerView3);
        NoteVOFilter noteVOFilter = this.f77759OooOooO;
        if (noteVOFilter == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
            throw null;
        }
        recyclerView3.setVisibility(noteVOFilter.getIndex() != C30214OooOoOO.f107602OooO0oO.getIndex() ? 8 : 0);
        this.f77767Oooo0o = recyclerView3;
        o0o0O000.OooO0OO oooO0OO = new o0o0O000.OooO0OO(R.layout.item_list_folder_color);
        oooO0OO.f107632OooO0OO = new ViewOnClickListenerC28241OooOOoo(this, 2);
        this.f77769Oooo0oO = oooO0OO;
        RecyclerView recyclerView4 = this.f77767Oooo0o;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorList");
            throw null;
        }
        recyclerView4.setAdapter(oooO0OO);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23684OooO0Oo(null), 3);
    }
}
