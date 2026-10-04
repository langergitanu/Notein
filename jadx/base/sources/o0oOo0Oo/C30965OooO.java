package o0oOo0Oo;

import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.user.message.UserMessagesDialogFragment;
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

/* JADX INFO: renamed from: o0oOo0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessagesDialogFragment$initMessageListView$2", m80623f = "UserMessagesDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30965OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserMessagesDialogFragment f110641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f110642OooOo0o;

    /* JADX INFO: renamed from: o0oOo0Oo.OooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessagesDialogFragment$initMessageListView$2$1", m80623f = "UserMessagesDialogFragment.kt", m80624l = {74}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ UserMessagesDialogFragment f110643OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110644OooOo0o;

        /* JADX INFO: renamed from: o0oOo0Oo.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20143OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ UserMessagesDialogFragment f110645OooOo0o;

            public C20143OooO00o(UserMessagesDialogFragment userMessagesDialogFragment) {
                this.f110645OooOo0o = userMessagesDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                final List<T> list = (List) obj;
                final UserMessagesDialogFragment userMessagesDialogFragment = this.f110645OooOo0o;
                com.orion.notein.p607ui.user.message.OooO00o oooO00o = userMessagesDialogFragment.f79811Oooo0;
                if (oooO00o == null) {
                    OooOOO0.OooOOOO("messageListAdapter");
                    throw null;
                }
                final int itemCount = oooO00o.getItemCount();
                com.orion.notein.p607ui.user.message.OooO00o oooO00o2 = userMessagesDialogFragment.f79811Oooo0;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0o0(list, new Runnable() { // from class: o0oOo0Oo.OooO0oo
                        @Override // java.lang.Runnable
                        public final void run() {
                            UserMessagesDialogFragment userMessagesDialogFragment2 = userMessagesDialogFragment;
                            if (itemCount <= 2) {
                                RecyclerView recyclerView = userMessagesDialogFragment2.f79814Oooo00o;
                                if (recyclerView == null) {
                                    OooOOO0.OooOOOO("messageListView");
                                    throw null;
                                }
                                recyclerView.scrollToPosition(0);
                            }
                            C30972OooO0oO c30972OooO0oO = (C30972OooO0oO) userMessagesDialogFragment2.f79812Oooo000.getValue();
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
        public OooO00o(UserMessagesDialogFragment userMessagesDialogFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110643OooOo = userMessagesDialogFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110643OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110644OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                UserMessagesDialogFragment userMessagesDialogFragment = this.f110643OooOo;
                C30972OooO0oO c30972OooO0oO = (C30972OooO0oO) userMessagesDialogFragment.f79812Oooo000.getValue();
                C20143OooO00o c20143OooO00o = new C20143OooO00o(userMessagesDialogFragment);
                this.f110644OooOo0o = 1;
                if (c30972OooO0oO.f110668OooO0oO.f121747OooOo0o.collect(c20143OooO00o, this) == enumC32485OooO00o) {
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
    public C30965OooO(UserMessagesDialogFragment userMessagesDialogFragment, Continuation<? super C30965OooO> continuation) {
        super(2, continuation);
        this.f110641OooOo = userMessagesDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30965OooO c30965OooO = new C30965OooO(this.f110641OooOo, continuation);
        c30965OooO.f110642OooOo0o = obj;
        return c30965OooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30965OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f110642OooOo0o, null, null, new OooO00o(this.f110641OooOo, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
