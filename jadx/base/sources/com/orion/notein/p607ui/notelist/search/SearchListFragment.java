package com.orion.notein.p607ui.notelist.search;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.OooOo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.search.SearchListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000OO00.C24459OooOOo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24587OooOoo;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.o0O0O00;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o00.C28201OooooO0;
import o0Ooo0oo.C29439OooO00o;
import o0o00oOo.C30028OooO;
import o0o00oOo.C30030OooO0O0;
import o0o00oOo.C30035OooO0oO;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30214OooOoOO;
import o0o0O0OO.C30286OooOOO0;
import o0o0O0OO.C30288OooOOOo;
import o0o0O0OO.C30289OooOOo;
import o0o0O0OO.C30290OooOOo0;
import o0o0O0o0.C30296OooO00o;
import o0o0O0o0.C30297OooO0O0;
import o0o0O0o0.C30298OooO0OO;
import o0o0O0o0.C30299OooO0Oo;
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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/search/SearchListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SearchListFragment extends Hilt_SearchListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f78010OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78011OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f78012OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f78013OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public o0o0O0.OooO f78014Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public NoteVOFilter f78015Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RecyclerView f78016Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30035OooO0oO f78017Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C30030OooO0O0 f78018Oooo0O0;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78019OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78019OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78019OooOo0o.getValue()).getViewModelStore();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onResume$1$1", m80623f = "SearchListFragment.kt", m80624l = {93}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f78020OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78021OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ SearchListFragment f78022OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f78023OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f78024OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, SearchListFragment searchListFragment, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f78020OooOo = str;
            this.f78023OooOoO0 = str2;
            this.f78022OooOoO = searchListFragment;
            this.f78024OooOoOO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f78020OooOo, this.f78023OooOoO0, this.f78022OooOoO, this.f78024OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Context context;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78021OooOo0o;
            SearchListFragment searchListFragment = this.f78022OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f78020OooOo;
                if (str.length() > 0) {
                    String str2 = this.f78023OooOoO0;
                    if (str2.length() > 0) {
                        C30296OooO00o c30296OooO00oOooo000 = searchListFragment.Oooo000();
                        this.f78021OooOo0o = 1;
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30299OooO0Oo(this.f78024OooOoOO, c30296OooO00oOooo000, str, str2, null), this);
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
            if (!((Boolean) obj).booleanValue() && (context = searchListFragment.getContext()) != null) {
                String string = searchListFragment.getString(R.string.rename_fail);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onViewCreated$4$1", m80623f = "SearchListFragment.kt", m80624l = {173}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78026OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f78027OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteVO noteVO, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f78027OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return SearchListFragment.this.new OooO0O0(this.f78027OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78026OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30296OooO00o c30296OooO00oOooo000 = SearchListFragment.this.Oooo000();
                this.f78026OooOo0o = 1;
                if (c30296OooO00oOooo000.OooOO0O(this.f78027OooOoO0, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onViewCreated$4$2", m80623f = "SearchListFragment.kt", m80624l = {180, 183}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteVO f78028OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78029OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ SearchListFragment f78030OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(SearchListFragment searchListFragment, NoteVO noteVO, Continuation continuation) {
            super(2, continuation);
            this.f78028OooOo = noteVO;
            this.f78030OooOoO0 = searchListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f78030OooOoO0, this.f78028OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if (com.orion.notein.p607ui.notelist.search.SearchListFragment.OooOoO(r4, r6, r5) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            if (com.orion.notein.p607ui.notelist.search.SearchListFragment.OooOoOO(r4, r6, r5) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        
            return r0;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78029OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteVO noteVO = this.f78028OooOo;
                int type = noteVO.getType();
                SearchListFragment searchListFragment = this.f78030OooOoO0;
                if (type == 0) {
                    this.f78029OooOo0o = 1;
                } else if (type == 1) {
                    this.f78029OooOo0o = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onViewCreated$7", m80623f = "SearchListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23707OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78032OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onViewCreated$7$1", m80623f = "SearchListFragment.kt", m80624l = {206}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SearchListFragment f78033OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78034OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19432OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ SearchListFragment f78035OooOo0o;

                public C19432OooO00o(SearchListFragment searchListFragment) {
                    this.f78035OooOo0o = searchListFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) ((C32443OooOOO) obj).f116637OooOo;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        SearchListFragment searchListFragment = this.f78035OooOo0o;
                        if (!zHasNext) {
                            C30035OooO0oO c30035OooO0oO = searchListFragment.f78017Oooo00o;
                            if (c30035OooO0oO == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                                throw null;
                            }
                            c30035OooO0oO.OooO0Oo(arrayList);
                            View view = searchListFragment.f78013OooOooo;
                            if (view != null) {
                                view.setVisibility(arrayList.isEmpty() ? 0 : 8);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBackground");
                            throw null;
                        }
                        T next = it.next();
                        NoteVO noteVO = (NoteVO) next;
                        NoteVOFilter noteVOFilter = searchListFragment.f78015Oooo000;
                        if (noteVOFilter == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
                            throw null;
                        }
                        if (noteVOFilter.getFilterFunction().invoke(noteVO).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(SearchListFragment searchListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78033OooOo = searchListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78033OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78034OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SearchListFragment searchListFragment = this.f78033OooOo;
                    C30296OooO00o c30296OooO00oOooo000 = searchListFragment.Oooo000();
                    C19432OooO00o c19432OooO00o = new C19432OooO00o(searchListFragment);
                    this.f78034OooOo0o = 1;
                    if (c30296OooO00oOooo000.f108009OooOoO0.f121747OooOo0o.collect(c19432OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onViewCreated$7$2", m80623f = "SearchListFragment.kt", m80624l = {217}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SearchListFragment f78036OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78037OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0Oo$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListFragment$onViewCreated$7$2$1", m80623f = "SearchListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ SearchListFragment f78038OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78039OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(SearchListFragment searchListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78038OooOo = searchListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78038OooOo, continuation);
                    oooO00o.f78039OooOo0o = obj;
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
                    Boolean bool = (Boolean) this.f78039OooOo0o;
                    if (bool == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    SearchListFragment searchListFragment = this.f78038OooOo;
                    RecyclerView recyclerView = searchListFragment.f78016Oooo00O;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                        throw null;
                    }
                    recyclerView.setVisibility(0);
                    C30035OooO0oO c30035OooO0oO = searchListFragment.f78017Oooo00o;
                    if (c30035OooO0oO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    if (Boolean.valueOf(c30035OooO0oO.f106771OooO0Oo).equals(bool)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C30035OooO0oO c30035OooO0oO2 = searchListFragment.f78017Oooo00o;
                    if (c30035OooO0oO2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO2.f106771OooO0Oo = bool.booleanValue();
                    C30035OooO0oO c30035OooO0oO3 = searchListFragment.f78017Oooo00o;
                    if (c30035OooO0oO3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO3.notifyDataSetChanged();
                    searchListFragment.Oooo00O();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(SearchListFragment searchListFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78036OooOo = searchListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78036OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78037OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SearchListFragment searchListFragment = this.f78036OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOooo = searchListFragment.OooOooo();
                    OooO00o oooO00o = new OooO00o(searchListFragment, null);
                    this.f78037OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOooo.f77164OoooOOO, oooO00o, this) == enumC32485OooO00o) {
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

        public C23707OooO0Oo(Continuation<? super C23707OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23707OooO0Oo c23707OooO0Oo = SearchListFragment.this.new C23707OooO0Oo(continuation);
            c23707OooO0Oo.f78032OooOo0o = obj;
            return c23707OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23707OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78032OooOo0o;
            SearchListFragment searchListFragment = SearchListFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(searchListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(searchListFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return SearchListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23708OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23708OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return SearchListFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23709OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23709OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return SearchListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23710OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24459OooOOo0 f78043OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23710OooO0oo(C24459OooOOo0 c24459OooOOo0) {
            super(0);
            this.f78043OooOo0o = c24459OooOOo0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78043OooOo0o.invoke();
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78044OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78044OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78044OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78045OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78045OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78045OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? SearchListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23711OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29439OooO00o f78047OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23711OooOO0o(C29439OooO00o c29439OooO00o) {
            super(0);
            this.f78047OooOo0o = c29439OooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78047OooOo0o.invoke();
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78048OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78048OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78048OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78049OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78049OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78049OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78050OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78050OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78050OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? SearchListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public SearchListFragment() {
        C24459OooOOo0 c24459OooOOo0 = new C24459OooOOo0(this, 2);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23710OooO0oo(c24459OooOOo0));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78011OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30296OooO00o.class), new OooO(interfaceC32440OooOO0OooO0O0), new OooOO0O(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23711OooOO0o(new C29439OooO00o(this, 1)));
        this.f78010OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class), new OooOOO0(interfaceC32440OooOO0OooO0O02), new OooOOOO(interfaceC32440OooOO0OooO0O02), new OooOOO(interfaceC32440OooOO0OooO0O02));
        this.f78012OooOooO = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23708OooO0o0(), new C23709OooO0oO(), new OooO0o());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(SearchListFragment searchListFragment, NoteVO noteVO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30288OooOOOo c30288OooOOOo;
        if (abstractC32479OooO0OO instanceof C30288OooOOOo) {
            c30288OooOOOo = (C30288OooOOOo) abstractC32479OooO0OO;
            int i = c30288OooOOOo.f107939OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30288OooOOOo.f107939OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30288OooOOOo = new C30288OooOOOo(searchListFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c30288OooOOOo.f107938OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30288OooOOOo.f107939OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C30296OooO00o c30296OooO00oOooo000 = searchListFragment.Oooo000();
            String id = noteVO.getId();
            c30288OooOOOo.f107936OooOo0o = searchListFragment;
            c30288OooOOOo.f107935OooOo = noteVO;
            c30288OooOOOo.f107939OooOoOO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30297OooO0O0(c30296OooO00oOooo000, id, null), c30288OooOOOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteVO = c30288OooOOOo.f107935OooOo;
            searchListFragment = c30288OooOOOo.f107936OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        if (((Boolean) objOooO0o).booleanValue()) {
            String str = (String) searchListFragment.Oooo000().f107994OooOO0O.getValue();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "desktop")) {
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(searchListFragment), R.id.action_searchListFragment_to_noteListContainerFragment, BundleKt.bundleOf(new C32443OooOOO("initial_folder", noteVO.getId())));
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, NoteMeta.PROPERTY_FAVORITE)) {
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(searchListFragment), R.id.action_searchListFragment_to_favoriteListFragment, BundleKt.bundleOf(new C32443OooOOO("initial_folder", noteVO.getId())));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        Context context = searchListFragment.getContext();
        if (context != null) {
            String string = searchListFragment.getString(R.string.file_deleted);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(final SearchListFragment searchListFragment, final NoteVO noteVO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30290OooOOo0 c30290OooOOo0;
        if (abstractC32479OooO0OO instanceof C30290OooOOo0) {
            c30290OooOOo0 = (C30290OooOOo0) abstractC32479OooO0OO;
            int i = c30290OooOOo0.f107947OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30290OooOOo0.f107947OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30290OooOOo0 = new C30290OooOOo0(searchListFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c30290OooOOo0.f107946OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30290OooOOo0.f107947OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C30296OooO00o c30296OooO00oOooo000 = searchListFragment.Oooo000();
            String id = noteVO.getId();
            c30290OooOOo0.f107944OooOo0o = searchListFragment;
            c30290OooOOo0.f107943OooOo = noteVO;
            c30290OooOOo0.f107947OooOoOO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30298OooO0OO(c30296OooO00oOooo000, id, null), c30290OooOOo0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteVO = c30290OooOOo0.f107943OooOo;
            searchListFragment = c30290OooOOo0.f107944OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        if (((Boolean) objOooO0o).booleanValue()) {
            LockNoteFragment lockNoteFragmentOooOooO = searchListFragment.OooOooO();
            InterfaceC21987OooOoo viewLifecycleOwner = searchListFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LockNoteFragment.OooOoo(lockNoteFragmentOooOooO, C21989OooOooO.OooO00o(viewLifecycleOwner), OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O0OO.OooOO0O
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    String noteId = noteVO.getId();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                    C30280OooO0oO c30280OooO0oO = new C30280OooO0oO(noteId);
                    C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(searchListFragment);
                    o000o0O0.OooOO0 oooOO0OooOO0O = c24572OooOO0oOooO0OO.OooOO0O();
                    C24583OooOo0o c24583OooOo0o = oooOO0OooOO0O != null ? oooOO0OooOO0O.f83189OooOo : null;
                    if (c24583OooOo0o != null) {
                        c24572OooOO0oOooO0OO.OooOOO0(R.id.action_searchListFragment_to_noteEditorContainerFragment, c30280OooO0oO.getArguments(), new C24587OooOoo(false, false, c24583OooOo0o.f83302OooOooO, false, false, -1, -1, -1, -1));
                    } else {
                        c24572OooOO0oOooO0OO.OooOOOO(c30280OooO0oO);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            });
            return C32460OooOooO.f116667OooO00o;
        }
        Context context = searchListFragment.getContext();
        if (context != null) {
            String string = searchListFragment.getString(R.string.file_deleted);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(SearchListFragment searchListFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30289OooOOo c30289OooOOo;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30289OooOOo) {
            c30289OooOOo = (C30289OooOOo) abstractC32479OooO0OO;
            int i2 = c30289OooOOo.f107942OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30289OooOOo.f107942OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30289OooOOo = new C30289OooOOo(searchListFragment, abstractC32479OooO0OO);
            }
        }
        C30289OooOOo c30289OooOOo2 = c30289OooOOo;
        Object objShowNonVipFeatureLimitedDialog$default = c30289OooOOo2.f107941OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30289OooOOo2.f107942OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = searchListFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30289OooOOo2.f107942OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30289OooOOo2, 6, null);
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

    public final int OooOoo(Context context) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooOooo().f77164OoooOOO.f121747OooOo0o.getValue(), Boolean.TRUE)) {
            return 1;
        }
        return Math.max(1, (context.getResources().getConfiguration().screenWidthDp - 56) / 143);
    }

    public final LockNoteFragment OooOooO() {
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

    public final com.orion.notein.p607ui.notelist.OooO0OO OooOooo() {
        return (com.orion.notein.p607ui.notelist.OooO0OO) this.f78010OooOoo.getValue();
    }

    public final C30296OooO00o Oooo000() {
        return (C30296OooO00o) this.f78011OooOoo0.getValue();
    }

    public final void Oooo00O() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView recyclerView = this.f78016Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iOooOoo = OooOoo(context);
        if (gridLayoutManager.f65751OooOo != iOooOoo) {
            RecyclerView recyclerView2 = this.f78016Oooo00O;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                throw null;
            }
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), iOooOoo);
            gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
            recyclerView2.setLayoutManager(gridLayoutManager2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_note_list, viewGroup, false);
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
        Oooo00O();
        requireActivity().getSupportFragmentManager().Oooooo0("rename", this, new InterfaceC21912Oooo0o() { // from class: o0o0O0OO.OooO
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                int i = bundle.getInt(C18437z2.f56754h);
                String string = bundle.getString("id");
                String str2 = string == null ? "" : string;
                String string2 = bundle.getString("new_name");
                String str3 = string2 == null ? "" : string2;
                SearchListFragment searchListFragment = this.f107906OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = searchListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new SearchListFragment.OooO00o(str2, str3, searchListFragment, i, null), 2);
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
            this.f78015Oooo000 = C30214OooOoOO.f107601OooO0o;
        } else {
            if (!arguments.containsKey("filter")) {
                arguments = null;
            }
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("filter");
                kotlin.jvm.internal.OooOOO0.OooO0o0(serializable, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVOFilter");
                this.f78015Oooo000 = (NoteVOFilter) serializable;
            }
        }
        this.f78013OooOooo = view.findViewById(R.id.empty_bg_wrapper);
        kotlin.jvm.internal.OooOOO0.OooO0o(requireContext(), "requireContext(...)");
        C20519OooO0Oo.OooO0OO(new C30028OooO());
        new AtomicBoolean(false);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f78018Oooo0O0 = new C30030OooO0O0(contextRequireContext, new InterfaceC32508OooOOOo() { // from class: o0o0O0OO.OooOO0o
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                String folderId = (String) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
                SearchListFragment searchListFragment = this.f107924OooOo0o;
                C30287OooOOOO c30287OooOOOO = new C30287OooOOOO(searchListFragment, folderId, iIntValue, null);
                InterfaceC21987OooOoo viewLifecycleOwner = searchListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30285OooOOO(iIntValue, c30287OooOOOO, searchListFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        C30201OooOOO0 c30201OooOOO0 = new C30201OooOOO0(this, new C30286OooOOO0(this, 0), OooOooo(), (C28201OooooO0) this.f78012OooOooO.getValue());
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f78014Oooo0 = new o0o0O0.OooO(contextRequireContext2, c30201OooOOO0);
        this.f78016Oooo00O = (RecyclerView) view.findViewById(R.id.item_list);
        C30035OooO0oO c30035OooO0oO = new C30035OooO0oO();
        this.f78017Oooo00o = c30035OooO0oO;
        c30035OooO0oO.f106769OooO0O0 = new o0O0O00(this, 6);
        RecyclerView recyclerView = this.f78016Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), OooOoo(context)));
        C30035OooO0oO c30035OooO0oO2 = this.f78017Oooo00o;
        if (c30035OooO0oO2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30035OooO0oO2);
        recyclerView.setItemAnimator(null);
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = this.f78016Oooo00O;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0o0O0OO.OooOO0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f107921OooOo0o.Oooo00O();
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23707OooO0Oo(null), 3);
    }
}
