package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.fragment.app.C21904OooOoo0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.huawei.hms.network.embedded.C18361t4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.OooO00o;
import oO0o0OO.C33614OooOOO0;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.InterfaceC33715OooOoO0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u0003*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m80612d2 = {"Lcom/google/android/play/core/review/ReviewManager;", "Landroid/app/Activity;", C18361t4.f56218b, "Lcom/google/android/play/core/review/ReviewInfo;", "reviewInfo", "LoO00ooO/OooOooO;", "launchReview", "(Lcom/google/android/play/core/review/ReviewManager;Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReview", "(Lcom/google/android/play/core/review/ReviewManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;LoO0O000o/OooO00o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "LoO0o0OOo/OooOoO0;", "element", "", "tryOffer", "(LoO0o0OOo/OooOoO0;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_review_ktx"}, m80613k = 2, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class ReviewManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", m80623f = "ReviewManagerKtx.kt", m80624l = {22}, m80625m = "requestReview")
    public static final class C163571 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C163571(Continuation<? super C163571> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewManagerKtxKt.requestReview(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$2 */
    @Metadata(m80611d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"T", "LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 7, 1})
    public static final class C163582 extends OooOOOO implements OooO00o<C32460OooOooO> {
        public static final C163582 INSTANCE = new C163582();

        public C163582() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // oO0O000o.OooO00o
        public final /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final Object launchReview(ReviewManager reviewManager, Activity activity, ReviewInfo reviewInfo, Continuation<? super C32460OooOooO> continuation) {
        Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        OooOOO0.OooO0o(taskLaunchReviewFlow, "launchReviewFlow(activity, reviewInfo)");
        Object objRunTask$default = runTask$default(taskLaunchReviewFlow, null, continuation, 2, null);
        return objRunTask$default == EnumC32485OooO00o.f116726OooOo0o ? objRunTask$default : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object requestReview(ReviewManager reviewManager, Continuation<? super ReviewInfo> continuation) {
        C163571 c163571;
        if (continuation instanceof C163571) {
            c163571 = (C163571) continuation;
            int i = c163571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c163571.label = i - Integer.MIN_VALUE;
            } else {
                c163571 = new C163571(continuation);
            }
        }
        Object objRunTask$default = c163571.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c163571.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objRunTask$default);
            Task<ReviewInfo> taskRequestReviewFlow = reviewManager.requestReviewFlow();
            OooOOO0.OooO0o(taskRequestReviewFlow, "requestReviewFlow()");
            c163571.label = 1;
            objRunTask$default = runTask$default(taskRequestReviewFlow, null, c163571, 2, null);
            if (objRunTask$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objRunTask$default);
        }
        OooOOO0.OooO0o(objRunTask$default, "runTask(requestReviewFlow())");
        return objRunTask$default;
    }

    public static final <T> Object runTask(Task<T> task, OooO00o<C32460OooOooO> oooO00o, Continuation<? super T> continuation) throws Throwable {
        final C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(continuation));
        c33614OooOOO0.OooOOoo();
        c33614OooOOO0.OooOo0(new ReviewManagerKtxKt$runTask$3$1(oooO00o));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
                    c33614OooOOO0.resumeWith(t);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception) {
                    OooOOO0.OooO0oO(exception, "exception");
                    c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(exception));
                }
            });
        } else if (task.isSuccessful()) {
            c33614OooOOO0.resumeWith(task.getResult());
        } else {
            Exception exception = task.getException();
            OooOOO0.OooO0Oo(exception);
            c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(exception));
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    public static /* synthetic */ Object runTask$default(Task task, OooO00o oooO00o, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            oooO00o = C163582.INSTANCE;
        }
        return runTask(task, oooO00o, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(InterfaceC33715OooOoO0<? super E> interfaceC33715OooOoO0, E e) {
        OooOOO0.OooO0oO(interfaceC33715OooOoO0, "<this>");
        return !(interfaceC33715OooOoO0.OooO0o0(e) instanceof C33702OooOOO.OooO0O0);
    }
}
