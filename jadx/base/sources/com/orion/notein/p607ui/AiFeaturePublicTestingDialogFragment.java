package com.orion.notein.p607ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0o0o.ViewOnClickListenerC28243OooOo0O;
import o0OoOOOo.ViewOnClickListenerC29099OooO0oO;
import o0o0OOo0.C30547OooO00o;
import o0oOoOo.C31058OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/AiFeaturePublicTestingDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AiFeaturePublicTestingDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f70426OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public RecyclerView f70427OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public TextView f70428OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C30547OooO00o f70429OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f70430OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f70431Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final List<C31058OooOooO> f70432Oooo00O = C34429OooOOo0.OooOO0o(new C31058OooOooO(R.drawable.ic_privilege_handwriting_to_text, R.string.title_vip_feature_handwriting_to_text), new C31058OooOooO(R.drawable.ic_privilege_image_to_text, R.string.title_vip_feature_image_to_text), new C31058OooOooO(R.drawable.ic_privilege_pdf_to_text, R.string.title_vip_feature_pdf_to_text), new C31058OooOooO(R.drawable.ic_privilege_edit_in_app, R.string.title_vip_feature_edit_in_app), new C31058OooOooO(R.drawable.ic_privilege_ai_summarization, R.string.title_vip_feature_ai_summarization));

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooO00o f70433Oooo00o;

    public interface OooO00o {
        void OooO00o();

        void OooO0O0();
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.AiFeaturePublicTestingDialogFragment$onViewCreated$2$1", m80623f = "AiFeaturePublicTestingDialogFragment.kt", m80624l = {73}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70435OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.AiFeaturePublicTestingDialogFragment$onViewCreated$2$1$1$1", m80623f = "AiFeaturePublicTestingDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f70436OooOo0o;

            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(2, continuation);
                oooO00o.f70436OooOo0o = obj;
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
                C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f70436OooOo0o;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
                c24334OooO0O0.OooO0oO(C27205OooO0OO.f95017OooOOo, Boolean.TRUE);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AiFeaturePublicTestingDialogFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooO00o oooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70435OooOo0o;
            AiFeaturePublicTestingDialogFragment aiFeaturePublicTestingDialogFragment = AiFeaturePublicTestingDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Context context = aiFeaturePublicTestingDialogFragment.getContext();
                if (context != null) {
                    OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(context);
                    OooO00o oooO00o2 = new OooO00o(2, null);
                    this.f70435OooOo0o = 1;
                    obj = C24332OooO.OooO00o(oooOO0OooO00o, oooO00o2, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                oooO00o = aiFeaturePublicTestingDialogFragment.f70433Oooo00o;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = aiFeaturePublicTestingDialogFragment.f70433Oooo00o;
            if (oooO00o != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public AiFeaturePublicTestingDialogFragment(boolean z) {
        this.f70426OooOoOO = z;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_ai_feature_public_testing_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f70428OooOoo0 = (TextView) view.findViewById(R.id.dialog_title);
        this.f70430OooOooo = (TextView) view.findViewById(R.id.btn_cancel);
        this.f70431Oooo000 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f70427OooOoo = (RecyclerView) view.findViewById(R.id.privilege_list);
        C30547OooO00o c30547OooO00o = new C30547OooO00o();
        this.f70429OooOooO = c30547OooO00o;
        RecyclerView recyclerView = this.f70427OooOoo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("privilegeList");
            throw null;
        }
        recyclerView.setAdapter(c30547OooO00o);
        C30547OooO00o c30547OooO00o2 = this.f70429OooOooO;
        if (c30547OooO00o2 == null) {
            OooOOO0.OooOOOO("privilegeAdapter");
            throw null;
        }
        c30547OooO00o2.OooO0Oo(this.f70432Oooo00O);
        if (this.f70426OooOoOO) {
            TextView textView = this.f70428OooOoo0;
            if (textView == null) {
                OooOOO0.OooOOOO("tvTitle");
                throw null;
            }
            textView.setText(getString(R.string.title_ai_feature_public_testing_for_guest));
            TextView textView2 = this.f70431Oooo000;
            if (textView2 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView2.setText(getString(R.string.sign_in_now));
        } else {
            TextView textView3 = this.f70428OooOoo0;
            if (textView3 == null) {
                OooOOO0.OooOOOO("tvTitle");
                throw null;
            }
            textView3.setText(getString(R.string.title_ai_feature_public_testing));
            TextView textView4 = this.f70431Oooo000;
            if (textView4 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView4.setText(getString(R.string.try_it_now));
        }
        TextView textView5 = this.f70430OooOooo;
        if (textView5 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView5, 500L, new ViewOnClickListenerC29099OooO0oO(this, 4));
        TextView textView6 = this.f70431Oooo000;
        if (textView6 != null) {
            C28050OooO0OO.OooO00o(textView6, 500L, new ViewOnClickListenerC28243OooOo0O(this, 5));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
