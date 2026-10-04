package o0Oo0o00;

import android.view.View;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31035OooO0o0;
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
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Oo0o00.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initDownloadingQueueSection$2", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28170OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDetailsFragment f99828OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99829OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f99830OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.OooOo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initDownloadingQueueSection$2$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CloudSyncDetailsFragment f99831OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f99832OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f99833OooOoO0;

        /* JADX INFO: renamed from: o0Oo0o00.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19891OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ View f99834OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ CloudSyncDetailsFragment f99835OooOo0o;

            public C19891OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view) {
                this.f99835OooOo0o = cloudSyncDetailsFragment;
                this.f99834OooOo = view;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                ArrayList arrayList = new ArrayList();
                for (T t : (List) obj) {
                    if (!((C31035OooO0o0) t).f110807OooO0OO) {
                        arrayList.add(t);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                View view = this.f99834OooOo;
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99835OooOo0o;
                if (zIsEmpty) {
                    TextView textView = cloudSyncDetailsFragment.f71427Oooo0OO;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvDownloadingQueue");
                        throw null;
                    }
                    textView.setText("");
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    view.setVisibility(8);
                    cloudSyncDetailsFragment.f71432OoooO0.OooO0Oo(C34434OooOoO.f123453OooOo0o);
                } else {
                    TextView textView2 = cloudSyncDetailsFragment.f71427Oooo0OO;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tvDownloadingQueue");
                        throw null;
                    }
                    textView2.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_download_queue, new Integer(arrayList.size())));
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    view.setVisibility(0);
                    cloudSyncDetailsFragment.f71432OoooO0.OooO0Oo(arrayList);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f99831OooOo = cloudSyncDetailsFragment;
            this.f99833OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f99831OooOo, this.f99833OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f99832OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99831OooOo;
                C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
                C19891OooO00o c19891OooO00o = new C19891OooO00o(cloudSyncDetailsFragment, this.f99833OooOoO0);
                this.f99832OooOo0o = 1;
                if (c28201OooooO0OooOooo.f99966Oooo00o.f121747OooOo0o.collect(c19891OooO00o, this) == enumC32485OooO00o) {
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
    public C28170OooOo0o(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super C28170OooOo0o> continuation) {
        super(2, continuation);
        this.f99828OooOo = cloudSyncDetailsFragment;
        this.f99830OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28170OooOo0o c28170OooOo0o = new C28170OooOo0o(this.f99828OooOo, this.f99830OooOoO0, continuation);
        c28170OooOo0o.f99829OooOo0o = obj;
        return c28170OooOo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28170OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f99829OooOo0o, null, null, new OooO00o(this.f99828OooOo, this.f99830OooOoO0, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
