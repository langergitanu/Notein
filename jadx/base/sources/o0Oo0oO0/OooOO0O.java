package o0Oo0oO0;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C21650OooOoO;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0Oo0oO.C28285OooO00o;
import o0Oo0oO.C28287OooO0OO;
import o0oOoOo.C31038OooOO0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32437OooO0o0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1", m80623f = "FeedbackFragment.kt", m80624l = {235}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FeedbackFragment f100353OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100354OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1$1", m80623f = "FeedbackFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FeedbackFragment f100355OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f100356OooOo0o;

        /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1$1$1", m80623f = "FeedbackFragment.kt", m80624l = {236}, m80625m = "invokeSuspend")
        public static final class C19904OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FeedbackFragment f100357OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f100358OooOo0o;

            /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C19905OooO00o implements InterfaceC33723OooO0oO, kotlin.jvm.internal.OooO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FeedbackFragment f100359OooOo0o;

                public C19905OooO00o(FeedbackFragment feedbackFragment) {
                    this.f100359OooOo0o = feedbackFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    FeedbackFragment feedbackFragment = this.f100359OooOo0o;
                    View view = feedbackFragment.f71830Oooo0o0;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                        throw null;
                    }
                    view.setEnabled(zBooleanValue);
                    View view2 = feedbackFragment.f71830Oooo0o0;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                        throw null;
                    }
                    view2.setClickable(zBooleanValue);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    return c32460OooOooO;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC33723OooO0oO) && (obj instanceof kotlin.jvm.internal.OooO)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.OooO) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.OooO
                public final InterfaceC32437OooO0o0<?> getFunctionDelegate() {
                    return new kotlin.jvm.internal.OooO00o(2, this.f100359OooOo0o, FeedbackFragment.class, "renderCommitButtonState", "renderCommitButtonState(Z)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19904OooO00o(FeedbackFragment feedbackFragment, Continuation<? super C19904OooO00o> continuation) {
                super(2, continuation);
                this.f100357OooOo = feedbackFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19904OooO00o(this.f100357OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19904OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f100358OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FeedbackFragment feedbackFragment = this.f100357OooOo;
                    OooOOO OooOoO2 = feedbackFragment.OooOoO();
                    C19905OooO00o c19905OooO00o = new C19905OooO00o(feedbackFragment);
                    this.f100358OooOo0o = 1;
                    if (OooOoO2.f100383OooOOO0.f121747OooOo0o.collect(c19905OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1$1$2", m80623f = "FeedbackFragment.kt", m80624l = {237}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FeedbackFragment f100360OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f100361OooOo0o;

            /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C19906OooO00o implements InterfaceC33723OooO0oO, kotlin.jvm.internal.OooO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FeedbackFragment f100362OooOo0o;

                public C19906OooO00o(FeedbackFragment feedbackFragment) {
                    this.f100362OooOo0o = feedbackFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    FeedbackFragment feedbackFragment = this.f100362OooOo0o;
                    feedbackFragment.getClass();
                    SpannableString spannableString = new SpannableString(C21650OooOoO.OooO00o(iIntValue, "/600"));
                    if (iIntValue > 600) {
                        spannableString.setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), 0, String.valueOf(iIntValue).length(), 33);
                    }
                    TextView textView = feedbackFragment.f71822OooOooO;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("contentLength");
                        throw null;
                    }
                    textView.setText(spannableString);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    return c32460OooOooO;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC33723OooO0oO) && (obj instanceof kotlin.jvm.internal.OooO)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.OooO) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.OooO
                public final InterfaceC32437OooO0o0<?> getFunctionDelegate() {
                    return new kotlin.jvm.internal.OooO00o(2, this.f100362OooOo0o, FeedbackFragment.class, "renderContentLength", "renderContentLength(I)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(FeedbackFragment feedbackFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f100360OooOo = feedbackFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f100360OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f100361OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FeedbackFragment feedbackFragment = this.f100360OooOo;
                    OooOOO OooOoO2 = feedbackFragment.OooOoO();
                    C19906OooO00o c19906OooO00o = new C19906OooO00o(feedbackFragment);
                    this.f100361OooOo0o = 1;
                    if (OooOoO2.f100382OooOOO.f121747OooOo0o.collect(c19906OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1$1$3", m80623f = "FeedbackFragment.kt", m80624l = {238}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FeedbackFragment f100363OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f100364OooOo0o;

            /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C19907OooO00o implements InterfaceC33723OooO0oO, kotlin.jvm.internal.OooO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FeedbackFragment f100365OooOo0o;

                public C19907OooO00o(FeedbackFragment feedbackFragment) {
                    this.f100365OooOo0o = feedbackFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) obj;
                    FeedbackFragment feedbackFragment = this.f100365OooOo0o;
                    feedbackFragment.getClass();
                    int size = list.size();
                    TextView textView = feedbackFragment.f71825Oooo000;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackPicHint");
                        throw null;
                    }
                    textView.setText(feedbackFragment.getString(R.string.feedback_content_pic, Integer.valueOf(size)));
                    boolean z = size < 6;
                    ImageView imageView = feedbackFragment.f71826Oooo00O;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPic");
                        throw null;
                    }
                    imageView.setEnabled(z);
                    TextView textView2 = feedbackFragment.f71825Oooo000;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackPicHint");
                        throw null;
                    }
                    textView2.setEnabled(z);
                    C28285OooO00o c28285OooO00o = feedbackFragment.f71824Oooo0;
                    if (c28285OooO00o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackPicAdapter");
                        throw null;
                    }
                    c28285OooO00o.OooO0Oo(list);
                    RecyclerView recyclerView = feedbackFragment.f71827Oooo00o;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackPicList");
                        throw null;
                    }
                    recyclerView.setVisibility(list.isEmpty() ? 8 : 0);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    return c32460OooOooO;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC33723OooO0oO) && (obj instanceof kotlin.jvm.internal.OooO)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.OooO) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.OooO
                public final InterfaceC32437OooO0o0<?> getFunctionDelegate() {
                    return new kotlin.jvm.internal.OooO00o(2, this.f100365OooOo0o, FeedbackFragment.class, "renderFeedbackPics", "renderFeedbackPics(Ljava/util/List;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(FeedbackFragment feedbackFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f100363OooOo = feedbackFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f100363OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f100364OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                FeedbackFragment feedbackFragment = this.f100363OooOo;
                OooOOO OooOoO2 = feedbackFragment.OooOoO();
                C19907OooO00o c19907OooO00o = new C19907OooO00o(feedbackFragment);
                this.f100364OooOo0o = 1;
                OooOoO2.f100378OooO0oo.collect(c19907OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1$1$4", m80623f = "FeedbackFragment.kt", m80624l = {239}, m80625m = "invokeSuspend")
        public static final class C28297OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FeedbackFragment f100366OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f100367OooOo0o;

            /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C19908OooO00o implements InterfaceC33723OooO0oO, kotlin.jvm.internal.OooO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FeedbackFragment f100368OooOo0o;

                public C19908OooO00o(FeedbackFragment feedbackFragment) {
                    this.f100368OooOo0o = feedbackFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<C31038OooOO0> list = (List) obj;
                    C28287OooO0OO c28287OooO0OO = this.f100368OooOo0o.f71829Oooo0OO;
                    if (c28287OooO0OO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackTypeAdapter");
                        throw null;
                    }
                    c28287OooO0OO.OooO0Oo(list);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    return c32460OooOooO;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC33723OooO0oO) && (obj instanceof kotlin.jvm.internal.OooO)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.OooO) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.OooO
                public final InterfaceC32437OooO0o0<?> getFunctionDelegate() {
                    return new kotlin.jvm.internal.OooO00o(2, this.f100368OooOo0o, FeedbackFragment.class, "renderFeedbackTypes", "renderFeedbackTypes(Ljava/util/List;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28297OooO0Oo(FeedbackFragment feedbackFragment, Continuation<? super C28297OooO0Oo> continuation) {
                super(2, continuation);
                this.f100366OooOo = feedbackFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C28297OooO0Oo(this.f100366OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C28297OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f100367OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                FeedbackFragment feedbackFragment = this.f100366OooOo;
                OooOOO OooOoO2 = feedbackFragment.OooOoO();
                C19908OooO00o c19908OooO00o = new C19908OooO00o(feedbackFragment);
                this.f100367OooOo0o = 1;
                OooOoO2.f100375OooO0o.collect(c19908OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackFragment$observeViewModel$1$1$5", m80623f = "FeedbackFragment.kt", m80624l = {240}, m80625m = "invokeSuspend")
        public static final class C28298OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FeedbackFragment f100369OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f100370OooOo0o;

            /* JADX INFO: renamed from: o0Oo0oO0.OooOO0O$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            public static final class C19909OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FeedbackFragment f100371OooOo0o;

                public C19909OooO00o(FeedbackFragment feedbackFragment) {
                    this.f100371OooOo0o = feedbackFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    FeedbackFragment feedbackFragment = this.f100371OooOo0o;
                    if (iIntValue == 0) {
                        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = feedbackFragment.requireActivity();
                        kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                        String string = feedbackFragment.getString(R.string.submit_feedback_successfully);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(activityC21897OooOo0RequireActivity, string);
                    } else if (iIntValue != 1) {
                        View view = feedbackFragment.f71830Oooo0o0;
                        if (view == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                            throw null;
                        }
                        view.setEnabled(true);
                        View view2 = feedbackFragment.f71830Oooo0o0;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                            throw null;
                        }
                        view2.setClickable(true);
                        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity2 = feedbackFragment.requireActivity();
                        kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity2, "requireActivity(...)");
                        String string2 = feedbackFragment.getString(R.string.submit_feedback_failure);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(activityC21897OooOo0RequireActivity2, string2);
                    } else {
                        View view3 = feedbackFragment.f71830Oooo0o0;
                        if (view3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                            throw null;
                        }
                        view3.setEnabled(true);
                        View view4 = feedbackFragment.f71830Oooo0o0;
                        if (view4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                            throw null;
                        }
                        view4.setClickable(true);
                        LabeledTextFieldView labeledTextFieldView = feedbackFragment.f71823OooOooo;
                        if (labeledTextFieldView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emailField");
                            throw null;
                        }
                        labeledTextFieldView.setState(EnumC26248OooOo0.f89696OooOoO0);
                        String string3 = feedbackFragment.getString(R.string.feedback_contact_email_invalid);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        LabeledTextFieldView labeledTextFieldView2 = feedbackFragment.f71823OooOooo;
                        if (labeledTextFieldView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emailField");
                            throw null;
                        }
                        labeledTextFieldView2.setSupportingText(string3);
                        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity3 = feedbackFragment.requireActivity();
                        kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity3, "requireActivity(...)");
                        C25206OooO0Oo.OooO0oO(activityC21897OooOo0RequireActivity3, string3);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28298OooO0o0(FeedbackFragment feedbackFragment, Continuation<? super C28298OooO0o0> continuation) {
                super(2, continuation);
                this.f100369OooOo = feedbackFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C28298OooO0o0(this.f100369OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C28298OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f100370OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                FeedbackFragment feedbackFragment = this.f100369OooOo;
                C33772OooooOo c33772OooooOo = feedbackFragment.OooOoO().f100379OooOO0;
                C19909OooO00o c19909OooO00o = new C19909OooO00o(feedbackFragment);
                this.f100370OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, c19909OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FeedbackFragment feedbackFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f100355OooOo = feedbackFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f100355OooOo, continuation);
            oooO00o.f100356OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f100356OooOo0o;
            FeedbackFragment feedbackFragment = this.f100355OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19904OooO00o(feedbackFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(feedbackFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(feedbackFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28297OooO0Oo(feedbackFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28298OooO0o0(feedbackFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(FeedbackFragment feedbackFragment, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f100353OooOo = feedbackFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f100353OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100354OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            FeedbackFragment feedbackFragment = this.f100353OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = feedbackFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(feedbackFragment, null);
            this.f100354OooOo0o = 1;
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
