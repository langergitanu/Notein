package com.orion.notein.p607ui.feedback;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.C22797OooO0Oo;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO.C28285OooO00o;
import o0Oo0oO.C28287OooO0OO;
import o0Oo0oO0.C28293OooO0o;
import o0Oo0oO0.OooOO0;
import o0Oo0oO0.OooOO0O;
import o0Oo0oO0.OooOOO;
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0Oo0oO0.ViewOnClickListenerC28296OooO0oo;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oo0oO0.o000O000;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/feedback/FeedbackFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FeedbackFragment extends Hilt_FeedbackFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public EditText f71820OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f71821OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f71822OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public LabeledTextFieldView f71823OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C28285OooO00o f71824Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f71825Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ImageView f71826Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RecyclerView f71827Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public OooO0o.OooO0O0<Intent> f71828Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C28287OooO0OO f71829Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f71830Oooo0o0;

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            OooOOO OooOoO2 = FeedbackFragment.this.OooOoO();
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            C33781o00o0O c33781o00o0O = OooOoO2.f100380OooOO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, string);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28293OooO0o f71832OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C28293OooO0o c28293OooO0o) {
            super(0);
            this.f71832OooOo0o = c28293OooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71832OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71833OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71833OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71833OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.feedback.FeedbackFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23115OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71834OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23115OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71834OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71834OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.feedback.FeedbackFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23116OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71835OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23116OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71835OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71835OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? FeedbackFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FeedbackFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0O0(new C28293OooO0o(this, 0)));
        this.f71821OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(OooOOO.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C23116OooO0o0(interfaceC32440OooOO0OooO0O0), new C23115OooO0Oo(interfaceC32440OooOO0OooO0O0));
    }

    public final OooOOO OooOoO() {
        return (OooOOO) this.f71821OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.feedback_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f71822OooOooO = (TextView) view.findViewById(R.id.tv_feedback_content_len);
        EditText editText = (EditText) view.findViewById(R.id.et_feedback_content);
        OooOOO0.OooO0Oo(editText);
        editText.addTextChangedListener(new OooO00o());
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: o0Oo0oO0.OooO0oO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (view2.getId() == R.id.et_feedback_content) {
                    FeedbackFragment feedbackFragment = this.f100348OooOo0o;
                    EditText editText2 = feedbackFragment.f71820OooOoo;
                    if (editText2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
                        throw null;
                    }
                    int lineCount = editText2.getLineCount();
                    EditText editText3 = feedbackFragment.f71820OooOoo;
                    if (editText3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
                        throw null;
                    }
                    if (lineCount < editText3.getMaxLines()) {
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getAction() == 1) {
                            view2.getParent().requestDisallowInterceptTouchEvent(false);
                            view2.performClick();
                        }
                    }
                }
                return false;
            }
        });
        this.f71820OooOoo = editText;
        this.f71828Oooo0O0 = registerForActivityResult(new C20439OooO0oo(), new com.google.android.datatransport.runtime.scheduling.jobscheduling.OooOOOO(this, 1));
        TextView textView = (TextView) view.findViewById(R.id.feedback_content_pic_hint);
        this.f71825Oooo000 = textView;
        ViewOnClickListenerC28288OooO viewOnClickListenerC28288OooO = new ViewOnClickListenerC28288OooO(this, 0);
        if (textView == null) {
            OooOOO0.OooOOOO("feedbackPicHint");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, viewOnClickListenerC28288OooO);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_feedback_add_pic);
        OooOOO0.OooO0Oo(imageView);
        C28050OooO0OO.OooO00o(imageView, 500L, viewOnClickListenerC28288OooO);
        this.f71826Oooo00O = imageView;
        C28285OooO00o c28285OooO00o = new C28285OooO00o(C28285OooO00o.C19900OooO00o.f100322OooO00o);
        c28285OooO00o.f100321OooO0O0 = new C22797OooO0Oo(this, 2);
        this.f71824Oooo0 = c28285OooO00o;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_feedback_content_pic);
        C28285OooO00o c28285OooO00o2 = this.f71824Oooo0;
        if (c28285OooO00o2 == null) {
            OooOOO0.OooOOOO("feedbackPicAdapter");
            throw null;
        }
        recyclerView.setAdapter(c28285OooO00o2);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setHasFixedSize(true);
        this.f71827Oooo00o = recyclerView;
        C28287OooO0OO c28287OooO0OO = new C28287OooO0OO(C28287OooO0OO.OooO00o.f100329OooO00o);
        this.f71829Oooo0OO = c28287OooO0OO;
        c28287OooO0OO.f100328OooO0O0 = new OooOO0(this, 0);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_feedback_type);
        C28287OooO0OO c28287OooO0OO2 = this.f71829Oooo0OO;
        if (c28287OooO0OO2 == null) {
            OooOOO0.OooOOOO("feedbackTypeAdapter");
            throw null;
        }
        recyclerView2.setAdapter(c28287OooO0OO2);
        recyclerView2.setItemAnimator(null);
        recyclerView2.setOverScrollMode(2);
        View viewFindViewById = view.findViewById(R.id.btn_commit);
        this.f71830Oooo0o0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("commit");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 1500L, new ViewOnClickListenerC28296OooO0oo(this, 0));
        LabeledTextFieldView labeledTextFieldView = (LabeledTextFieldView) view.findViewById(R.id.feedback_email_field);
        labeledTextFieldView.setOnValueChangeListener(new o000O000(2, labeledTextFieldView, this));
        this.f71823OooOooo = labeledTextFieldView;
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooOO0O(this, null), 3);
    }
}
