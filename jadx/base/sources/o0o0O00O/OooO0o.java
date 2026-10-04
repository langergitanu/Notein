package o0o0O00O;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initSmallTab$2", m80623f = "LabelContainerFragment.kt", m80624l = {422}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelContainerFragment f107738OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107739OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initSmallTab$2$1", m80623f = "LabelContainerFragment.kt", m80624l = {423}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LabelContainerFragment f107740OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107741OooOo0o;

        /* JADX INFO: renamed from: o0o0O00O.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$initSmallTab$2$1$1", m80623f = "LabelContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20054OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelContainerFragment f107742OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107743OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20054OooO00o(LabelContainerFragment labelContainerFragment, Continuation<? super C20054OooO00o> continuation) {
                super(2, continuation);
                this.f107742OooOo = labelContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20054OooO00o c20054OooO00o = new C20054OooO00o(this.f107742OooOo, continuation);
                c20054OooO00o.f107743OooOo0o = obj;
                return c20054OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C20054OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Context context;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Integer num = (Integer) this.f107743OooOo0o;
                LabelContainerFragment labelContainerFragment = this.f107742OooOo;
                TextView textView = labelContainerFragment.f77708Oooo0;
                if (textView != null && (context = labelContainerFragment.getContext()) != null) {
                    int i = R.string.note_list_tabs_all_doc;
                    if (num == null || num.intValue() != 0) {
                        if (num != null && num.intValue() == 1) {
                            i = R.string.note_list_tabs_pdf;
                        } else if (num != null && num.intValue() == 2) {
                            i = R.string.note_list_tabs_note;
                        } else if (num != null && num.intValue() == 3) {
                            i = R.string.note_list_tabs_folder;
                        }
                    }
                    textView.setText(context.getString(i));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LabelContainerFragment labelContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107740OooOo = labelContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107740OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107741OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LabelContainerFragment labelContainerFragment = this.f107740OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
                C20054OooO00o c20054OooO00o = new C20054OooO00o(labelContainerFragment, null);
                this.f107741OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77158Oooo0oo, c20054OooO00o, this) == enumC32485OooO00o) {
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
    public OooO0o(LabelContainerFragment labelContainerFragment, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f107738OooOo = labelContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f107738OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107739OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            LabelContainerFragment labelContainerFragment = this.f107738OooOo;
            OooO00o oooO00o = new OooO00o(labelContainerFragment, null);
            this.f107739OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(labelContainerFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
