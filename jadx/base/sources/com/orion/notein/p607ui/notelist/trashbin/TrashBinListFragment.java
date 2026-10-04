package com.orion.notein.p607ui.notelist.trashbin;

import OooOoOO.C20519OooO0Oo;
import Oooo0O0.OooOO0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0OoO000.ViewOnClickListenerC28566Ooooo0o;
import o0OoO0oo.C28836o00O0O0o;
import o0o00oOo.C30035OooO0oO;
import o0o00ooO.ViewOnClickListenerC30140OooO0OO;
import o0o0O00.C30214OooOoOO;
import o0o0O0oO.C30351Oooo0oO;
import o0o0O0oo.C30360OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/trashbin/TrashBinListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TrashBinListFragment extends Hilt_TrashBinListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public NoteVOFilter f78117OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78118OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f78119OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public RecyclerView f78120OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C30035OooO0oO f78121Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C30360OooO00o f78122Oooo00O;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$onViewCreated$6$1", m80623f = "TrashBinListFragment.kt", m80624l = {153, 154}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78124OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f78125OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$onViewCreated$6$1$1", m80623f = "TrashBinListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19434OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TrashBinListFragment f78126OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19434OooO00o(TrashBinListFragment trashBinListFragment, Continuation<? super C19434OooO00o> continuation) {
                super(2, continuation);
                this.f78126OooOo0o = trashBinListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19434OooO00o(this.f78126OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19434OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Fragment parentFragment = this.f78126OooOo0o.getParentFragment();
                OooOOO0.OooO0o0(parentFragment, "null cannot be cast to non-null type com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment");
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) parentFragment;
                C30214OooOoOO c30214OooOoOO = trashBinContainerFragment.f78084OoooO00;
                if (c30214OooOoOO != null) {
                    c30214OooOoOO.f107606OooO0OO.OooO0OO(0, false);
                } else {
                    trashBinContainerFragment.OooOoOO().OooOOOo(Integer.valueOf(C30214OooOoOO.f107601OooO0o.getIndex()));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteVO noteVO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f78125OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TrashBinListFragment.this.new OooO00o(this.f78125OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
            int i = this.f78124OooOo0o;
            TrashBinListFragment trashBinListFragment = TrashBinListFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinListFragment.OooOoOO();
                this.f78124OooOo0o = 1;
                if (c30351Oooo0oOOooOoOO.OooOOOO(this.f78125OooOoO0, this) != enumC32485OooO00o) {
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
            C19434OooO00o c19434OooO00o = new C19434OooO00o(trashBinListFragment, null);
            this.f78124OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$onViewCreated$9", m80623f = "TrashBinListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78128OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$onViewCreated$9$1", m80623f = "TrashBinListFragment.kt", m80624l = {193}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TrashBinListFragment f78129OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78130OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19435OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TrashBinListFragment f78131OooOo0o;

                public C19435OooO00o(TrashBinListFragment trashBinListFragment) {
                    this.f78131OooOo0o = trashBinListFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        TrashBinListFragment trashBinListFragment = this.f78131OooOo0o;
                        if (!zHasNext) {
                            C30035OooO0oO c30035OooO0oO = trashBinListFragment.f78121Oooo000;
                            if (c30035OooO0oO == null) {
                                OooOOO0.OooOOOO("noteAdapter");
                                throw null;
                            }
                            c30035OooO0oO.OooO0Oo(arrayList);
                            View view = trashBinListFragment.f78119OooOooO;
                            if (view != null) {
                                view.setVisibility(list.isEmpty() ? 0 : 8);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            OooOOO0.OooOOOO("emptyBackground");
                            throw null;
                        }
                        T next = it.next();
                        NoteVO noteVO = (NoteVO) next;
                        NoteVOFilter noteVOFilter = trashBinListFragment.f78117OooOoo;
                        if (noteVOFilter == null) {
                            OooOOO0.OooOOOO("filter");
                            throw null;
                        }
                        if (noteVOFilter.getFilterFunction().invoke(noteVO).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TrashBinListFragment trashBinListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78129OooOo = trashBinListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78129OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78130OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TrashBinListFragment trashBinListFragment = this.f78129OooOo;
                    C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinListFragment.OooOoOO();
                    C19435OooO00o c19435OooO00o = new C19435OooO00o(trashBinListFragment);
                    this.f78130OooOo0o = 1;
                    if (c30351Oooo0oOOooOoOO.f108251OooOooO.f121747OooOo0o.collect(c19435OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$onViewCreated$9$2", m80623f = "TrashBinListFragment.kt", m80624l = {205}, m80625m = "invokeSuspend")
        public static final class C19436OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TrashBinListFragment f78132OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78133OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$onViewCreated$9$2$1", m80623f = "TrashBinListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TrashBinListFragment f78134OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78135OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TrashBinListFragment trashBinListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78134OooOo = trashBinListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78134OooOo, continuation);
                    oooO00o.f78135OooOo0o = obj;
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
                    Boolean bool = (Boolean) this.f78135OooOo0o;
                    if (bool == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    TrashBinListFragment trashBinListFragment = this.f78134OooOo;
                    RecyclerView recyclerView = trashBinListFragment.f78120OooOooo;
                    if (recyclerView == null) {
                        OooOOO0.OooOOOO("noteList");
                        throw null;
                    }
                    recyclerView.setVisibility(0);
                    C30035OooO0oO c30035OooO0oO = trashBinListFragment.f78121Oooo000;
                    if (c30035OooO0oO == null) {
                        OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    if (Boolean.valueOf(c30035OooO0oO.f106771OooO0Oo).equals(bool)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C30035OooO0oO c30035OooO0oO2 = trashBinListFragment.f78121Oooo000;
                    if (c30035OooO0oO2 == null) {
                        OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO2.f106771OooO0Oo = bool.booleanValue();
                    C30035OooO0oO c30035OooO0oO3 = trashBinListFragment.f78121Oooo000;
                    if (c30035OooO0oO3 == null) {
                        OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO3.notifyDataSetChanged();
                    trashBinListFragment.OooOoo0();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19436OooO0O0(TrashBinListFragment trashBinListFragment, Continuation<? super C19436OooO0O0> continuation) {
                super(2, continuation);
                this.f78132OooOo = trashBinListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19436OooO0O0(this.f78132OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19436OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78133OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TrashBinListFragment trashBinListFragment = this.f78132OooOo;
                    C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinListFragment.OooOoOO();
                    OooO00o oooO00o = new OooO00o(trashBinListFragment, null);
                    this.f78133OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30351Oooo0oOOooOoOO.f108248OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = TrashBinListFragment.this.new OooO0O0(continuation);
            oooO0O0.f78128OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78128OooOo0o;
            TrashBinListFragment trashBinListFragment = TrashBinListFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(trashBinListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19436OooO0O0(trashBinListFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28836o00O0O0o f78136OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C28836o00O0O0o c28836o00O0O0o) {
            super(0);
            this.f78136OooOo0o = c28836o00O0O0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78136OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23716OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78137OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23716OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78137OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78137OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78138OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78138OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78138OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TrashBinListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.trashbin.TrashBinListFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23717OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78140OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23717OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78140OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78140OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public TrashBinListFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new C28836o00O0O0o(this, 2)));
        this.f78118OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30351Oooo0oO.class), new C23716OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23717OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    public final int OooOoO(Context context) {
        if (OooOOO0.OooO0O0(OooOoOO().f108248OooOoOO.f121747OooOo0o.getValue(), Boolean.TRUE)) {
            return 1;
        }
        return Math.max(1, (context.getResources().getConfiguration().screenWidthDp - 56) / 143);
    }

    public final C30351Oooo0oO OooOoOO() {
        return (C30351Oooo0oO) this.f78118OooOoo0.getValue();
    }

    public final void OooOoo0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView recyclerView = this.f78120OooOooo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("noteList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iOooOoO = OooOoO(context);
        if (gridLayoutManager.f65751OooOo != iOooOoO) {
            RecyclerView recyclerView2 = this.f78120OooOooo;
            if (recyclerView2 == null) {
                OooOOO0.OooOOOO("noteList");
                throw null;
            }
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), iOooOoO);
            gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
            recyclerView2.setLayoutManager(gridLayoutManager2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_note_list, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C30360OooO00o c30360OooO00o = this.f78122Oooo00O;
        if (c30360OooO00o == null) {
            OooOOO0.OooOOOO("noteItemMoreMenu");
            throw null;
        }
        c30360OooO00o.OooO00o();
        OooOO0.OooO00o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OooOoo0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null) {
            this.f78117OooOoo = new NoteVOFilter(0, "All");
        } else {
            if (!arguments.containsKey("filter")) {
                arguments = null;
            }
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("filter");
                OooOOO0.OooO0o0(serializable, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVOFilter");
                this.f78117OooOoo = (NoteVOFilter) serializable;
            }
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f78122Oooo00O = new C30360OooO00o(contextRequireContext, new ViewOnClickListenerC28566Ooooo0o(this, 2));
        ((ImageView) view.findViewById(R.id.empty_bg)).setImageResource(R.drawable.bg_list_empty);
        this.f78119OooOooO = view.findViewById(R.id.empty_bg_wrapper);
        View viewFindViewById = view.findViewById(R.id.txt_empty_tips);
        OooOOO0.OooO0Oo(viewFindViewById);
        viewFindViewById.setVisibility(8);
        this.f78120OooOooo = (RecyclerView) view.findViewById(R.id.item_list);
        C30035OooO0oO c30035OooO0oO = new C30035OooO0oO();
        this.f78121Oooo000 = c30035OooO0oO;
        c30035OooO0oO.f106769OooO0O0 = new ViewOnClickListenerC30140OooO0OO(this, 1);
        c30035OooO0oO.f106770OooO0OO = new View.OnContextClickListener() { // from class: o0o0O0oO.OooOOO0
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
                C30360OooO00o c30360OooO00o = this.f108107OooO00o.f78122Oooo00O;
                if (c30360OooO00o != null) {
                    c30360OooO00o.OooO0OO(view2, noteVO);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                throw null;
            }
        };
        RecyclerView recyclerView = this.f78120OooOooo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("noteList");
            throw null;
        }
        Context context = recyclerView.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), OooOoO(context)));
        C30035OooO0oO c30035OooO0oO2 = this.f78121Oooo000;
        if (c30035OooO0oO2 == null) {
            OooOOO0.OooOOOO("noteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30035OooO0oO2);
        recyclerView.setItemAnimator(null);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
