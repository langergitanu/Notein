package o0Oo0o00;

import android.view.View;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import o00o00O0.C25252OooO0Oo;
import o0Oo0o0O.C28222OooO0O0;
import o0oOoOo.C31035OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Oo0o00.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initUploadingQueueSection$2", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28172OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDetailsFragment f99838OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99839OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f99840OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.OooOoO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initUploadingQueueSection$2$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {257}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CloudSyncDetailsFragment f99841OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f99842OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f99843OooOoO0;

        /* JADX INFO: renamed from: o0Oo0o00.OooOoO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initUploadingQueueSection$2$1$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {StyleIdentifier.COLORFUL_GRID_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class C19892OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31035OooO0o0>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f99844OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f99845OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ CloudSyncDetailsFragment f99846OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C24030OooOoo f99847OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ View f99848OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19892OooO00o(C24030OooOoo c24030OooOoo, CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super C19892OooO00o> continuation) {
                super(2, continuation);
                this.f99847OooOoO0 = c24030OooOoo;
                this.f99846OooOoO = cloudSyncDetailsFragment;
                this.f99848OooOoOO = view;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19892OooO00o c19892OooO00o = new C19892OooO00o(this.f99847OooOoO0, this.f99846OooOoO, this.f99848OooOoOO, continuation);
                c19892OooO00o.f99844OooOo = obj;
                return c19892OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C31035OooO0o0> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19892OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List list;
                List list2;
                boolean zIsEmpty;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f99845OooOo0o;
                C24030OooOoo c24030OooOoo = this.f99847OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    list = (List) this.f99844OooOo;
                    if (!c24030OooOoo.f80938OooOo0o) {
                        this.f99844OooOo = list;
                        this.f99845OooOo0o = 1;
                        if (C33644OoooO0.OooO00o(300L, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        list2 = list;
                    }
                    c24030OooOoo.f80938OooOo0o = false;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((C31035OooO0o0) obj2).f110807OooO0OO) {
                            arrayList.add(obj2);
                        }
                    }
                    zIsEmpty = arrayList.isEmpty();
                    CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99846OooOoO;
                    View view = this.f99848OooOoOO;
                    C28222OooO0O0 c28222OooO0O0 = cloudSyncDetailsFragment.f71433OoooO00;
                    if (zIsEmpty) {
                        TextView textView = cloudSyncDetailsFragment.f71425Oooo00o;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvUploadingQueue");
                            throw null;
                        }
                        textView.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_upload_queue, new Integer(arrayList.size())));
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                        view.setVisibility(0);
                        c28222OooO0O0.OooO0Oo(arrayList);
                    } else {
                        TextView textView2 = cloudSyncDetailsFragment.f71425Oooo00o;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvUploadingQueue");
                            throw null;
                        }
                        textView2.setText("");
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                        view.setVisibility(8);
                        c28222OooO0O0.OooO0Oo(C34434OooOoO.f123453OooOo0o);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f99844OooOo;
                C32446OooOOOo.OooO0O0(obj);
                list = list2;
                c24030OooOoo.f80938OooOo0o = false;
                ArrayList arrayList2 = new ArrayList();
                while (r8.hasNext()) {
                }
                zIsEmpty = arrayList2.isEmpty();
                CloudSyncDetailsFragment cloudSyncDetailsFragment2 = this.f99846OooOoO;
                View view2 = this.f99848OooOoOO;
                C28222OooO0O0 c28222OooO0O02 = cloudSyncDetailsFragment2.f71433OoooO00;
                if (zIsEmpty) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f99841OooOo = cloudSyncDetailsFragment;
            this.f99843OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f99841OooOo, this.f99843OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f99842OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24030OooOoo c24030OooOoo = new C24030OooOoo();
                c24030OooOoo.f80938OooOo0o = true;
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f99841OooOo;
                C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
                C19892OooO00o c19892OooO00o = new C19892OooO00o(c24030OooOoo, cloudSyncDetailsFragment, this.f99843OooOoO0, null);
                this.f99842OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c28201OooooO0OooOooo.f99966Oooo00o, c19892OooO00o, this) == enumC32485OooO00o) {
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
    public C28172OooOoO0(CloudSyncDetailsFragment cloudSyncDetailsFragment, View view, Continuation<? super C28172OooOoO0> continuation) {
        super(2, continuation);
        this.f99838OooOo = cloudSyncDetailsFragment;
        this.f99840OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28172OooOoO0 c28172OooOoO0 = new C28172OooOoO0(this.f99838OooOo, this.f99840OooOoO0, continuation);
        c28172OooOoO0.f99839OooOo0o = obj;
        return c28172OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28172OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f99839OooOo0o, null, null, new OooO00o(this.f99838OooOo, this.f99840OooOoO0, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
