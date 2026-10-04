package o0o00oo;

import Oooo0.C20860Ooooooo;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.aspose.words.StyleIdentifier;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$showInAppReviewIfNeeded$1", m80623f = "NoteListContainerFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6}, m80625m = "invokeSuspend")
public final class C30125Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f107255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ActivityC21897OooOo0 f107256OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f107257OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ReviewInfo f107258OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107259OooOoOO;

    /* JADX INFO: renamed from: o0o00oo.Oooo000$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$showInAppReviewIfNeeded$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107260OooOo0o;

        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(2, continuation);
            oooO00o.f107260OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f107260OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95012OooOO0o, Boolean.TRUE);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30125Oooo000(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30125Oooo000> continuation) {
        super(2, continuation);
        this.f107259OooOoOO = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30125Oooo000(this.f107259OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30125Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o;
        ActivityC21897OooOo0 activityC21897OooOo0;
        ReviewManager reviewManager;
        ReviewInfo reviewInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107257OooOoO;
        try {
        } catch (Exception e) {
            if (e instanceof ReviewException) {
                int errorCode = ((ReviewException) e).getErrorCode();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o, "NoteListContainerFragment", "review error: ", errorCode), new Object[0]);
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteListContainerFragment");
                c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("review error: ", e.getMessage()), new Object[0]);
            }
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ActivityC21897OooOo0 activity = this.f107259OooOoOO.getActivity();
            if (activity == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            oooOO0OooO00o = C28051OooO00o.OooO00o(activity);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = oooOO0OooO00o.getData();
            this.f107256OooOo0o = activity;
            this.f107255OooOo = oooOO0OooO00o;
            this.f107257OooOoO = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(data, this);
            if (objOooOOo != enumC32485OooO00o) {
                activityC21897OooOo0 = activity;
                obj = objOooOOo;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reviewInfo = this.f107258OooOoO0;
            reviewManager = (ReviewManager) this.f107255OooOo;
            activityC21897OooOo0 = this.f107256OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activityC21897OooOo0, reviewInfo);
            kotlin.jvm.internal.OooOOO0.OooO0o(taskLaunchReviewFlow, "launchReviewFlow(...)");
            kotlin.jvm.internal.OooOOO0.OooO0Oo(taskLaunchReviewFlow.addOnCompleteListener(new C30124OooOooo()));
            return C32460OooOooO.f116667OooO00o;
        }
        oooOO0OooO00o = (o0000o0O.OooOO0) this.f107255OooOo;
        activityC21897OooOo0 = this.f107256OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
        Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(C27205OooO0OO.f95011OooOO0O);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (!zBooleanValue) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NoteListContainerFragment");
            c20358OooO00o3.OooO0o0("hasOpenedNote: " + zBooleanValue, new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Boolean bool2 = (Boolean) abstractC24338OooO0o0.OooO0OO(C27205OooO0OO.f95012OooOO0o);
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (zBooleanValue2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("NoteListContainerFragment");
            c20358OooO00o4.OooO0o0("hasReviewed: " + zBooleanValue2, new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        ReviewManager reviewManagerCreate = ReviewManagerFactory.create(activityC21897OooOo0);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(reviewManagerCreate);
        Task<ReviewInfo> taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow();
        kotlin.jvm.internal.OooOOO0.OooO0o(taskRequestReviewFlow, "requestReviewFlow(...)");
        ReviewInfo reviewInfo2 = (ReviewInfo) Tasks.await(taskRequestReviewFlow);
        OooO00o oooO00o = new OooO00o(2, null);
        this.f107256OooOo0o = activityC21897OooOo0;
        this.f107255OooOo = reviewManagerCreate;
        this.f107258OooOoO0 = reviewInfo2;
        this.f107257OooOoO = 2;
        if (C24332OooO.OooO00o(oooOO0OooO00o, oooO00o, this) != enumC32485OooO00o) {
            reviewManager = reviewManagerCreate;
            reviewInfo = reviewInfo2;
            Task<Void> taskLaunchReviewFlow2 = reviewManager.launchReviewFlow(activityC21897OooOo0, reviewInfo);
            kotlin.jvm.internal.OooOOO0.OooO0o(taskLaunchReviewFlow2, "launchReviewFlow(...)");
            kotlin.jvm.internal.OooOOO0.OooO0Oo(taskLaunchReviewFlow2.addOnCompleteListener(new C30124OooOooo()));
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
