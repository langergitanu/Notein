package o0oOo0Oo;

import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.user.message.UserMessageFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31057OooOoo0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOo0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessageFragment$initMessageListView$2", m80623f = "UserMessageFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30967OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserMessageFragment f110649OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f110650OooOo0o;

    /* JADX INFO: renamed from: o0oOo0Oo.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessageFragment$initMessageListView$2$1", m80623f = "UserMessageFragment.kt", m80624l = {97}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ UserMessageFragment f110651OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110652OooOo0o;

        /* JADX INFO: renamed from: o0oOo0Oo.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20144OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ UserMessageFragment f110653OooOo0o;

            public C20144OooO00o(UserMessageFragment userMessageFragment) {
                this.f110653OooOo0o = userMessageFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                final List<T> list = (List) obj;
                final UserMessageFragment userMessageFragment = this.f110653OooOo0o;
                com.orion.notein.p607ui.user.message.OooO00o oooO00o = userMessageFragment.f79800OooOooo;
                if (oooO00o == null) {
                    OooOOO0.OooOOOO("messageListAdapter");
                    throw null;
                }
                final int itemCount = oooO00o.getItemCount();
                com.orion.notein.p607ui.user.message.OooO00o oooO00o2 = userMessageFragment.f79800OooOooo;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0o0(list, new Runnable() { // from class: o0oOo0Oo.OooO00o
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserMessageFragment userMessageFragment2 = userMessageFragment;
                            if (itemCount <= 2) {
                                RecyclerView recyclerView = userMessageFragment2.f79799OooOooO;
                                if (recyclerView == null) {
                                    OooOOO0.OooOOOO("messageListView");
                                    throw null;
                                }
                                recyclerView.scrollToPosition(0);
                            }
                            C30972OooO0oO c30972OooO0oO = (C30972OooO0oO) userMessageFragment2.f79798OooOoo0.getValue();
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C31057OooOoo0) it.next()).f110879OooO00o);
                            }
                            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30972OooO0oO);
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30969OooO0Oo(arrayList, c30972OooO0oO, null), 2);
                        }
                    });
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("messageListAdapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserMessageFragment userMessageFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110651OooOo = userMessageFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110651OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110652OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                UserMessageFragment userMessageFragment = this.f110651OooOo;
                C30972OooO0oO c30972OooO0oO = (C30972OooO0oO) userMessageFragment.f79798OooOoo0.getValue();
                C20144OooO00o c20144OooO00o = new C20144OooO00o(userMessageFragment);
                this.f110652OooOo0o = 1;
                if (c30972OooO0oO.f110668OooO0oO.f121747OooOo0o.collect(c20144OooO00o, this) == enumC32485OooO00o) {
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
    public C30967OooO0O0(UserMessageFragment userMessageFragment, Continuation<? super C30967OooO0O0> continuation) {
        super(2, continuation);
        this.f110649OooOo = userMessageFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30967OooO0O0 c30967OooO0O0 = new C30967OooO0O0(this.f110649OooOo, continuation);
        c30967OooO0O0.f110650OooOo0o = obj;
        return c30967OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30967OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f110650OooOo0o, null, null, new OooO00o(this.f110649OooOo, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
