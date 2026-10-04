package com.orion.notein.p607ui.noteeditor.textannoeditor;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapePath;
import com.google.android.material.shape.TriangleEdgeTreatment;
import com.orion.notein.global.R;
import com.orion.penkit.models.QuoteInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o000OO.C29764OooOoO0;
import o0o000OO.OooOO0O;
import o0o000Oo.C29774OooO0O0;
import o0o000o0.C29775OooO00o;
import oO00ooO.C32443OooOOO;
import oO0O00oo.OooOO0;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/textannoeditor/TextAnnoTextEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextAnnoTextEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f76394OoooO0O = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f76395OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f76396OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public FrameLayout f76397OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ConstraintLayout f76398OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Guideline f76399OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Guideline f76400OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Guideline f76401OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public RecyclerView f76402OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C29774OooO0O0 f76403OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f76404Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public CardView f76405Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ViewGroup f76406Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f76407Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f76408Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f76409Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f76410Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ViewGroup f76411Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f76412Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f76413Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO00o f76414Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f76415OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final List<C32443OooOOO<Integer, Integer>> f76416OoooO00;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EditText f76417OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C29775OooO00o f76418OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C19386OooO00o f76419OooO0OO;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19386OooO00o implements TextWatcher {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextAnnoTextEditor f76420OooOo;

            public C19386OooO00o(TextAnnoTextEditor textAnnoTextEditor) {
                this.f76420OooOo = textAnnoTextEditor;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                boolean z = OooO00o.this.f76418OooO0O0.f105679OooO0oO;
                TextAnnoTextEditor textAnnoTextEditor = this.f76420OooOo;
                if (z) {
                    OooOO0O oooOO0O = textAnnoTextEditor.f76396OooOo0o;
                    if (oooOO0O == null) {
                        OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    oooOO0O.f105547OooOo0 = editable != null ? editable.toString() : null;
                }
                String string = editable != null ? editable.toString() : null;
                int i = TextAnnoTextEditor.f76394OoooO0O;
                textAnnoTextEditor.OooO0oO(string);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        public OooO00o(TextAnnoTextEditor textAnnoTextEditor, EditText editText, C29775OooO00o c29775OooO00o) {
            this.f76417OooO00o = editText;
            this.f76418OooO0O0 = c29775OooO00o;
            this.f76419OooO0OO = new C19386OooO00o(textAnnoTextEditor);
        }
    }

    public static final class OooO0O0 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ QuoteInfo f76422OooOo;

        public OooO0O0(QuoteInfo quoteInfo) {
            this.f76422OooOo = quoteInfo;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            TextAnnoTextEditor.OooO00o(TextAnnoTextEditor.this, this.f76422OooOo);
        }
    }

    public static final class OooO0OO extends TriangleEdgeTreatment {
        @Override // com.google.android.material.shape.TriangleEdgeTreatment, com.google.android.material.shape.EdgeTreatment
        public final void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
            OooOOO0.OooO0oO(shapePath, "shapePath");
            super.getEdgePath(f, f2, f3, shapePath);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23564OooO0Oo extends TriangleEdgeTreatment {
        @Override // com.google.android.material.shape.TriangleEdgeTreatment, com.google.android.material.shape.EdgeTreatment
        public final void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
            OooOOO0.OooO0oO(shapePath, "shapePath");
            super.getEdgePath(f, f2, f3, shapePath);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnoTextEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        o000000O.OooO0o(StyleIdentifier.LIST_TABLE_4_ACCENT_5);
        this.f76395OooOo = o000000O.OooO0o(StyleIdentifier.PLAIN_TABLE_2);
        this.f76403OooOooo = new C29774OooO0O0(C29774OooO0O0.C20022OooO0O0.f105672OooO00o);
        this.f76404Oooo = true;
        this.f76416OoooO00 = C34429OooOOo0.OooOO0o(new C32443OooOOO(Integer.valueOf(R.id.fl_clear_color), 0), new C32443OooOOO(Integer.valueOf(R.id.fl_color_1), Integer.valueOf(Color.parseColor("#FFFEFCA4"))), new C32443OooOOO(Integer.valueOf(R.id.fl_color_2), Integer.valueOf(Color.parseColor("#FFDAF7F1"))), new C32443OooOOO(Integer.valueOf(R.id.fl_color_3), Integer.valueOf(Color.parseColor("#FFCCE9FF"))), new C32443OooOOO(Integer.valueOf(R.id.fl_color_4), Integer.valueOf(Color.parseColor("#FFE0D7FF"))), new C32443OooOOO(Integer.valueOf(R.id.fl_color_5), Integer.valueOf(Color.parseColor("#FFF9D3D3"))));
        View.inflate(context, R.layout.layout_text_anno_editor, this);
    }

    public static final void OooO00o(TextAnnoTextEditor textAnnoTextEditor, QuoteInfo quoteInfo) {
        RectF contentBoundingBox;
        int width = textAnnoTextEditor.getWidth();
        int height = textAnnoTextEditor.getHeight();
        if (width == 0 || height == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextAnnoTextEditor");
            c20358OooO00o.OooO0OO("updateEditorLocationByQuoteInfo: width or height is 0", new Object[0]);
            return;
        }
        if (quoteInfo.getType() == 6) {
            RectF iconBoundingBox = quoteInfo.getIconBoundingBox();
            if (iconBoundingBox == null) {
                iconBoundingBox = quoteInfo.getBoundingBox(1.0f);
            }
            contentBoundingBox = new RectF(iconBoundingBox.centerX() - (iconBoundingBox.width() * 0.6f), iconBoundingBox.centerY() - (iconBoundingBox.height() * 0.6f), (iconBoundingBox.width() * 0.6f) + iconBoundingBox.centerX(), (iconBoundingBox.height() * 0.6f) + iconBoundingBox.centerY());
        } else {
            contentBoundingBox = quoteInfo.getContentBoundingBox();
        }
        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
        ConstraintLayout constraintLayout = textAnnoTextEditor.f76398OooOoO0;
        if (constraintLayout == null) {
            OooOOO0.OooOOOO("rootView");
            throw null;
        }
        oooO0OO.OooO0o0(constraintLayout);
        float fCenterX = contentBoundingBox.centerX();
        float f = textAnnoTextEditor.f76395OooOo;
        float f2 = width;
        float fOooO0o0 = OooOO0.OooO0o0(fCenterX - (f / 2.0f), 0.0f, (f2 * 1.0f) - f) / f2;
        Guideline guideline = textAnnoTextEditor.f76400OooOoo;
        if (guideline == null) {
            OooOOO0.OooOOOO("leftGuideline");
            throw null;
        }
        oooO0OO.OooOOoo(guideline.getId(), fOooO0o0);
        float f3 = contentBoundingBox.top;
        float f4 = height;
        float f5 = f4 - contentBoundingBox.bottom;
        int iOooO0o = quoteInfo.getType() == 6 ? o000000O.OooO0o(4) : o000000O.OooO0o(6);
        int iOooO0o2 = quoteInfo.getType() == 6 ? o000000O.OooO0o(20) : o000000O.OooO0o(24);
        if (f3 > f5) {
            float f6 = ((contentBoundingBox.top - iOooO0o) * 1.0f) / f4;
            Guideline guideline2 = textAnnoTextEditor.f76399OooOoOO;
            if (guideline2 == null) {
                OooOOO0.OooOOOO("topGuideline");
                throw null;
            }
            oooO0OO.OooOOoo(guideline2.getId(), 0.0f);
            Guideline guideline3 = textAnnoTextEditor.f76401OooOoo0;
            if (guideline3 == null) {
                OooOOO0.OooOOOO("bottomGuideline");
                throw null;
            }
            oooO0OO.OooOOoo(guideline3.getId(), f6);
            FrameLayout frameLayout = textAnnoTextEditor.f76397OooOoO;
            if (frameLayout == null) {
                OooOOO0.OooOOOO("cardEditor");
                throw null;
            }
            oooO0OO.OooOO0(frameLayout.getId()).f64014OooO0o0.f64055OooOoO0 = 1.0f;
            textAnnoTextEditor.f76415OoooO0 = false;
        } else {
            float f7 = ((contentBoundingBox.bottom + iOooO0o2) * 1.0f) / f4;
            Guideline guideline4 = textAnnoTextEditor.f76399OooOoOO;
            if (guideline4 == null) {
                OooOOO0.OooOOOO("topGuideline");
                throw null;
            }
            oooO0OO.OooOOoo(guideline4.getId(), f7);
            Guideline guideline5 = textAnnoTextEditor.f76401OooOoo0;
            if (guideline5 == null) {
                OooOOO0.OooOOOO("bottomGuideline");
                throw null;
            }
            oooO0OO.OooOOoo(guideline5.getId(), 1.0f);
            FrameLayout frameLayout2 = textAnnoTextEditor.f76397OooOoO;
            if (frameLayout2 == null) {
                OooOOO0.OooOOOO("cardEditor");
                throw null;
            }
            oooO0OO.OooOO0(frameLayout2.getId()).f64014OooO0o0.f64055OooOoO0 = 0.0f;
            textAnnoTextEditor.f76415OoooO0 = true;
        }
        ConstraintLayout constraintLayout2 = textAnnoTextEditor.f76398OooOoO0;
        if (constraintLayout2 == null) {
            OooOOO0.OooOOOO("rootView");
            throw null;
        }
        oooO0OO.OooO0O0(constraintLayout2);
        OooOO0O oooOO0O = textAnnoTextEditor.f76396OooOo0o;
        if (oooOO0O == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        QuoteInfo quoteInfo2 = (QuoteInfo) oooOO0O.f105543OooOOo.getValue();
        if (quoteInfo2 != null) {
            textAnnoTextEditor.OooO0oo(quoteInfo2.getBgColor());
        }
    }

    public final void OooO0O0() {
        C29775OooO00o c29775OooO00o;
        ViewGroup viewGroup = this.f76411Oooo0o;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnDoneContainer");
            throw null;
        }
        viewGroup.setVisibility(0);
        OooO00o oooO00o = this.f76414Oooo0oo;
        OooO0oO((oooO00o == null || (c29775OooO00o = oooO00o.f76418OooO0O0) == null) ? null : c29775OooO00o.f105676OooO0Oo);
        ViewGroup viewGroup2 = this.f76406Oooo000;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        viewGroup2.setVisibility(8);
        OooO00o oooO00o2 = this.f76414Oooo0oo;
        if (oooO00o2 != null) {
            Object systemService = getContext().getSystemService("input_method");
            OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(oooO00o2.f76417OooO00o, 1);
        }
    }

    public final void OooO0OO() {
        EditText editText;
        View view = this.f76413Oooo0oO;
        if (view == null) {
            OooOOO0.OooOOOO("btnDone");
            throw null;
        }
        view.setEnabled(false);
        ViewGroup viewGroup = this.f76411Oooo0o;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnDoneContainer");
            throw null;
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f76406Oooo000;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        viewGroup2.setVisibility(0);
        OooO00o oooO00o = this.f76414Oooo0oo;
        if (oooO00o != null && (editText = oooO00o.f76417OooO00o) != null) {
            editText.clearFocus();
        }
        Object systemService = getContext().getSystemService("input_method");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final void OooO0Oo() {
        OooO00o oooO00o = this.f76414Oooo0oo;
        if (oooO00o != null) {
            String string = oooO00o.f76417OooO00o.getText().toString();
            OooOO0O oooOO0O = this.f76396OooOo0o;
            if (oooOO0O == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooOO0O), null, null, new C29764OooOoO0(oooOO0O, C29775OooO00o.OooO00o(oooO00o.f76418OooO0O0, string), null), 3);
        }
    }

    public final void OooO0o(QuoteInfo quoteInfo) {
        this.f76414Oooo0oo = null;
        View view = this.f76413Oooo0oO;
        if (view == null) {
            OooOOO0.OooOOOO("btnDone");
            throw null;
        }
        view.setEnabled(false);
        ViewGroup viewGroup = this.f76411Oooo0o;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnDoneContainer");
            throw null;
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f76406Oooo000;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        viewGroup2.setVisibility(8);
        CardView cardView = this.f76405Oooo0;
        if (cardView == null) {
            OooOOO0.OooOOOO("cardColorPicker");
            throw null;
        }
        cardView.setVisibility(8);
        List<String> annoItemIdList = quoteInfo.getAnnoItemIdList();
        if (annoItemIdList == null || annoItemIdList.isEmpty()) {
            OooO0O0();
        } else {
            OooO0OO();
        }
        setVisibility(0);
        requestLayout();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new OooO0O0(quoteInfo));
        } else {
            OooO00o(this, quoteInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(int i) {
        Iterator<T> it = this.f76416OoooO00.iterator();
        while (it.hasNext()) {
            C32443OooOOO c32443OooOOO = (C32443OooOOO) it.next();
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
            CardView cardView = this.f76405Oooo0;
            if (cardView == null) {
                OooOOO0.OooOOOO("cardColorPicker");
                throw null;
            }
            cardView.findViewById(iIntValue).setSelected(iIntValue2 == i);
        }
    }

    public final void OooO0oO(String str) {
        List<String> annoItemIdList;
        OooOO0O oooOO0O = this.f76396OooOo0o;
        if (oooOO0O == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        QuoteInfo quoteInfo = (QuoteInfo) oooOO0O.f105543OooOOo.getValue();
        boolean z = ((quoteInfo == null || (annoItemIdList = quoteInfo.getAnnoItemIdList()) == null) ? 0 : annoItemIdList.size()) > 1;
        View view = this.f76413Oooo0oO;
        if (view != null) {
            view.setEnabled(!(str == null || str.length() == 0) || z);
        } else {
            OooOOO0.OooOOOO("btnDone");
            throw null;
        }
    }

    public final void OooO0oo(int i) {
        ShapeAppearanceModel.Builder allCornerSizes = ShapeAppearanceModel.builder().setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(o000000O.OooO0o0(8.0f));
        OooOOO0.OooO0o(allCornerSizes, "setAllCornerSizes(...)");
        if (this.f76415OoooO0) {
            allCornerSizes.setTopEdge(new OooO0OO(o000000O.OooO0o0(16.0f), false));
        } else {
            allCornerSizes.setBottomEdge(new C23564OooO0Oo(o000000O.OooO0o0(16.0f), false));
        }
        ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
        OooOOO0.OooO0o(shapeAppearanceModelBuild, "build(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        if (i == 0) {
            materialShapeDrawable.setTint(-1);
        } else {
            materialShapeDrawable.setTint(i);
        }
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        FrameLayout frameLayout = this.f76397OooOoO;
        if (frameLayout != null) {
            frameLayout.setBackground(materialShapeDrawable);
        } else {
            OooOOO0.OooOOOO("cardEditor");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f76398OooOoO0 = (ConstraintLayout) findViewById(R.id.cl_root);
        this.f76397OooOoO = (FrameLayout) findViewById(R.id.cv_editor);
        this.f76399OooOoOO = (Guideline) findViewById(R.id.top_guideline);
        this.f76401OooOoo0 = (Guideline) findViewById(R.id.bottom_guideline);
        this.f76400OooOoo = (Guideline) findViewById(R.id.left_guideline);
        this.f76406Oooo000 = (ViewGroup) findViewById(R.id.cl_tools);
        this.f76407Oooo00O = findViewById(R.id.btn_reply);
        this.f76408Oooo00o = findViewById(R.id.btn_color);
        this.f76405Oooo0 = (CardView) findViewById(R.id.cv_color_picker);
        this.f76409Oooo0O0 = findViewById(R.id.btn_delete);
        this.f76410Oooo0OO = findViewById(R.id.btn_prev);
        this.f76412Oooo0o0 = findViewById(R.id.btn_next);
        this.f76411Oooo0o = (ViewGroup) findViewById(R.id.cl_btn_done);
        View viewFindViewById = findViewById(R.id.btn_done);
        this.f76413Oooo0oO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnDone");
            throw null;
        }
        viewFindViewById.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_text_list);
        this.f76402OooOooO = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f76403OooOooo);
        } else {
            OooOOO0.OooOOOO("rvTextList");
            throw null;
        }
    }
}
