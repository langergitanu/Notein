package o0o0O0OO;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.search.SearchListContainerFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o0O0o0.C30296OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListContainerFragment$initSmallTab$2", m80623f = "SearchListContainerFragment.kt", m80624l = {188}, m80625m = "invokeSuspend")
public final class C30277OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SearchListContainerFragment f107911OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107912OooOo0o;

    /* JADX INFO: renamed from: o0o0O0OO.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListContainerFragment$initSmallTab$2$1", m80623f = "SearchListContainerFragment.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ SearchListContainerFragment f107913OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107914OooOo0o;

        /* JADX INFO: renamed from: o0o0O0OO.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListContainerFragment$initSmallTab$2$1$1", m80623f = "SearchListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20062OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SearchListContainerFragment f107915OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107916OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20062OooO00o(SearchListContainerFragment searchListContainerFragment, Continuation<? super C20062OooO00o> continuation) {
                super(2, continuation);
                this.f107915OooOo = searchListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20062OooO00o c20062OooO00o = new C20062OooO00o(this.f107915OooOo, continuation);
                c20062OooO00o.f107916OooOo0o = obj;
                return c20062OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C20062OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Context context;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Integer num = (Integer) this.f107916OooOo0o;
                SearchListContainerFragment searchListContainerFragment = this.f107915OooOo;
                TextView textView = searchListContainerFragment.f77991Oooo000;
                if (textView != null && (context = searchListContainerFragment.getContext()) != null) {
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
        public OooO00o(SearchListContainerFragment searchListContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107913OooOo = searchListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107913OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107914OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                SearchListContainerFragment searchListContainerFragment = this.f107913OooOo;
                C30296OooO00o c30296OooO00oOooOoOO = searchListContainerFragment.OooOoOO();
                C20062OooO00o c20062OooO00o = new C20062OooO00o(searchListContainerFragment, null);
                this.f107914OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c30296OooO00oOooOoOO.f108002OooOOoo, c20062OooO00o, this) == enumC32485OooO00o) {
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
    public C30277OooO0Oo(SearchListContainerFragment searchListContainerFragment, Continuation<? super C30277OooO0Oo> continuation) {
        super(2, continuation);
        this.f107911OooOo = searchListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30277OooO0Oo(this.f107911OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30277OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107912OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            SearchListContainerFragment searchListContainerFragment = this.f107911OooOo;
            OooO00o oooO00o = new OooO00o(searchListContainerFragment, null);
            this.f107912OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(searchListContainerFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
