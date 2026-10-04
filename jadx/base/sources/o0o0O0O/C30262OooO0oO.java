package o0o0O0O;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.notelist.recent.RecentFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o00oOo.C30035OooO0oO;
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

/* JADX INFO: renamed from: o0o0O0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recent.RecentFragment$initNoteList$5", m80623f = "RecentFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30262OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ RecentFragment f107824OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f107825OooOo0o;

    /* JADX INFO: renamed from: o0o0O0O.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recent.RecentFragment$initNoteList$5$1", m80623f = "RecentFragment.kt", m80624l = {208}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ RecentFragment f107826OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107827OooOo0o;

        /* JADX INFO: renamed from: o0o0O0O.OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20057OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ RecentFragment f107828OooOo0o;

            public C20057OooO00o(RecentFragment recentFragment) {
                this.f107828OooOo0o = recentFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<T> list = (List) obj;
                RecentFragment recentFragment = this.f107828OooOo0o;
                C30035OooO0oO c30035OooO0oO = recentFragment.f77874Oooo00o;
                if (c30035OooO0oO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                    throw null;
                }
                c30035OooO0oO.OooO0Oo(list);
                View view = recentFragment.f77872Oooo000;
                if (view != null) {
                    view.setVisibility(list.isEmpty() ? 0 : 8);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBackground");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RecentFragment recentFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107826OooOo = recentFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107826OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107827OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                RecentFragment recentFragment = this.f107826OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOooO = recentFragment.OooOooO();
                C20057OooO00o c20057OooO00o = new C20057OooO00o(recentFragment);
                this.f107827OooOo0o = 1;
                if (oooO0OOOooOooO.f77171OooooO0.f121747OooOo0o.collect(c20057OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o0O0O.OooO0oO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recent.RecentFragment$initNoteList$5$2", m80623f = "RecentFragment.kt", m80624l = {216}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ RecentFragment f107829OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107830OooOo0o;

        /* JADX INFO: renamed from: o0o0O0O.OooO0oO$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recent.RecentFragment$initNoteList$5$2$1", m80623f = "RecentFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ RecentFragment f107831OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107832OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RecentFragment recentFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f107831OooOo = recentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f107831OooOo, continuation);
                oooO00o.f107832OooOo0o = obj;
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
                Boolean bool = (Boolean) this.f107832OooOo0o;
                if (bool == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                RecentFragment recentFragment = this.f107831OooOo;
                RecyclerView recyclerView = recentFragment.f77873Oooo00O;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                    throw null;
                }
                recyclerView.setVisibility(0);
                C30035OooO0oO c30035OooO0oO = recentFragment.f77874Oooo00o;
                if (c30035OooO0oO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                    throw null;
                }
                if (Boolean.valueOf(c30035OooO0oO.f106771OooO0Oo).equals(bool)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C30035OooO0oO c30035OooO0oO2 = recentFragment.f77874Oooo00o;
                if (c30035OooO0oO2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                    throw null;
                }
                c30035OooO0oO2.f106771OooO0Oo = bool.booleanValue();
                C30035OooO0oO c30035OooO0oO3 = recentFragment.f77874Oooo00o;
                if (c30035OooO0oO3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                    throw null;
                }
                c30035OooO0oO3.notifyDataSetChanged();
                recentFragment.OooOooo();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RecentFragment recentFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f107829OooOo = recentFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f107829OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107830OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                RecentFragment recentFragment = this.f107829OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOooO = recentFragment.OooOooO();
                OooO00o oooO00o = new OooO00o(recentFragment, null);
                this.f107830OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooOooO.f77164OoooOOO, oooO00o, this) == enumC32485OooO00o) {
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
    public C30262OooO0oO(RecentFragment recentFragment, Continuation<? super C30262OooO0oO> continuation) {
        super(2, continuation);
        this.f107824OooOo = recentFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30262OooO0oO c30262OooO0oO = new C30262OooO0oO(this.f107824OooOo, continuation);
        c30262OooO0oO.f107825OooOo0o = obj;
        return c30262OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30262OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f107825OooOo0o;
        RecentFragment recentFragment = this.f107824OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(recentFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(recentFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
