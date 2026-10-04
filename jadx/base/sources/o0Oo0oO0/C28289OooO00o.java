package o0Oo0oO0;

import Oooo0oO.C21030OooOO0o;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.feedback.FeedbackContainerFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oo0oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackContainerFragment$observeFeedbackEvents$1", m80623f = "FeedbackContainerFragment.kt", m80624l = {46}, m80625m = "invokeSuspend")
public final class C28289OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FeedbackContainerFragment f100334OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100335OooOo0o;

    /* JADX INFO: renamed from: o0Oo0oO0.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackContainerFragment$observeFeedbackEvents$1$1", m80623f = "FeedbackContainerFragment.kt", m80624l = {47}, m80625m = "invokeSuspend")
    public static final class C19901OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FeedbackContainerFragment f100336OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f100337OooOo0o;

        /* JADX INFO: renamed from: o0Oo0oO0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19902OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FeedbackContainerFragment f100338OooOo0o;

            public C19902OooO00o(FeedbackContainerFragment feedbackContainerFragment) {
                this.f100338OooOo0o = feedbackContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                if (((Number) obj).intValue() == 0) {
                    C21030OooOO0o.OooO0OO(this.f100338OooOo0o).OooOOo0();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19901OooO00o(FeedbackContainerFragment feedbackContainerFragment, Continuation<? super C19901OooO00o> continuation) {
            super(2, continuation);
            this.f100336OooOo = feedbackContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19901OooO00o(this.f100336OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C19901OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f100337OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FeedbackContainerFragment feedbackContainerFragment = this.f100336OooOo;
            C33772OooooOo c33772OooooOo = ((OooOOO) feedbackContainerFragment.f71806OooOoo0.getValue()).f100379OooOO0;
            C19902OooO00o c19902OooO00o = new C19902OooO00o(feedbackContainerFragment);
            this.f100337OooOo0o = 1;
            c33772OooooOo.getClass();
            C33772OooooOo.OooOO0O(c33772OooooOo, c19902OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28289OooO00o(FeedbackContainerFragment feedbackContainerFragment, Continuation<? super C28289OooO00o> continuation) {
        super(2, continuation);
        this.f100334OooOo = feedbackContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28289OooO00o(this.f100334OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28289OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100335OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            FeedbackContainerFragment feedbackContainerFragment = this.f100334OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = feedbackContainerFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            C19901OooO00o c19901OooO00o = new C19901OooO00o(feedbackContainerFragment, null);
            this.f100335OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19901OooO00o, this) == enumC32485OooO00o) {
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
