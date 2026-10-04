package o0Oo0o00;

import android.view.View;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0oOoOo.C31032OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Oo0o00.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initIssuesQueueSection$2", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28166OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDetailsFragment f99810OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99811OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f99812OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.OooOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initIssuesQueueSection$2$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CloudSyncDetailsFragment f99813OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f99814OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f99815OooOoO0;

        /* JADX INFO: renamed from: o0Oo0o00.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initIssuesQueueSection$2$1$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19890OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31032OooO0OO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CloudSyncDetailsFragment f99816OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f99817OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ View f99818OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19890OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super C19890OooO00o> continuation) {
                super(2, continuation);
                this.f99816OooOo = cloudSyncDetailsFragment;
                this.f99818OooOoO0 = view;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19890OooO00o c19890OooO00o = new C19890OooO00o(this.f99816OooOo, this.f99818OooOoO0, continuation);
                c19890OooO00o.f99817OooOo0o = obj;
                return c19890OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31032OooO0OO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19890OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) this.f99817OooOo0o;
                boolean zIsEmpty = list.isEmpty();
                View view = this.f99818OooOoO0;
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99816OooOo;
                if (zIsEmpty) {
                    TextView textView = cloudSyncDetailsFragment.f71430Oooo0oO;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvIssuesQueue");
                        throw null;
                    }
                    textView.setText("");
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    view.setVisibility(8);
                    cloudSyncDetailsFragment.f71434OoooO0O.OooO0Oo(C34434OooOoO.f123453OooOo0o);
                } else {
                    TextView textView2 = cloudSyncDetailsFragment.f71430Oooo0oO;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvIssuesQueue");
                        throw null;
                    }
                    textView2.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_issue_queue, new Integer(list.size())));
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    view.setVisibility(0);
                    cloudSyncDetailsFragment.f71434OoooO0O.OooO0Oo(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f99813OooOo = cloudSyncDetailsFragment;
            this.f99815OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f99813OooOo, this.f99815OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f99814OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99813OooOo;
                C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
                C19890OooO00o c19890OooO00o = new C19890OooO00o(cloudSyncDetailsFragment, this.f99815OooOoO0, null);
                this.f99814OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c28201OooooO0OooOooo.f99963Oooo0, c19890OooO00o, this) == enumC32485OooO00o) {
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
    public C28166OooOo(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super C28166OooOo> continuation) {
        super(2, continuation);
        this.f99810OooOo = cloudSyncDetailsFragment;
        this.f99812OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28166OooOo c28166OooOo = new C28166OooOo(this.f99810OooOo, this.f99812OooOoO0, continuation);
        c28166OooOo.f99811OooOo0o = obj;
        return c28166OooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28166OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f99811OooOo0o, null, null, new OooO00o(this.f99810OooOo, this.f99812OooOoO0, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
