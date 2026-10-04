package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import Oooo0oO.C21022OooO0OO;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24766OooO0o;
import o0O0o0oO.o00O0O;
import o0O0o0oO.o0OO00O;
import o0O0o0oO.o0OOO0o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o0o.Oooo000;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0Oo0o0o.ViewOnClickListenerC28253Oooo00O;
import o0Oo0o0o.oo000o;
import o0OoO000.OooO0o;
import o0OoO0oo.C28766o0000Oo;
import o0OoO0oo.RunnableC28872o00Oo0;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29065OooOo00;
import o0OoOOOo.C29096OooO0Oo;
import o0OoOOOo.C29108OooOOo;
import o0OoOOOo.C29115OooOoO;
import o0OoOOOo.C29125OooOooo;
import o0OoOOOo.InterfaceC29093OooO00o;
import o0OoOOOo.ViewOnClickListenerC29113OooOo0O;
import o0OoOOOo.ViewOnClickListenerC29119OooOoo0;
import o0OoOOo0.C29185OooO0o;
import o0Ooo0oo.C29553o00O0O;
import o0o00Ooo.C29920OooO0oo;
import o0o00Ooo.OooOO0;
import oO00ooO.C32447OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addtext/textstylebox/TextStyleBox;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/orion/notein/ui/noteeditor/addtext/textstylebox/TextStyleBox$OooO00o;", "l", "LoO00ooO/OooOooO;", "setTextStyleBoxListener", "(Lcom/orion/notein/ui/noteeditor/addtext/textstylebox/TextStyleBox$OooO00o;)V", "", "visibility", "setVisibility", "(I)V", "Lo0o00Ooo/OooOO0;", "Oooo0O0", "LoO00ooO/OooOO0;", "getTextBoxColorPopupWindow", "()Lo0o00Ooo/OooOO0;", "textBoxColorPopupWindow", "Lcom/orion/notein/ui/noteeditor/addtext/textstylebox/OooO00o;", "Oooo0oO", "getTextFontPopupWindow", "()Lcom/orion/notein/ui/noteeditor/addtext/textstylebox/OooO00o;", "textFontPopupWindow", "Lo0OoOOOo/OooO0Oo;", "Oooo", "getTextBoxBgColorPopupWindow", "()Lo0OoOOOo/OooO0Oo;", "textBoxBgColorPopupWindow", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextStyleBox extends ConstraintLayout {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final /* synthetic */ int f74132o000oOoO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextView f74133OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f74134OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RecyclerView f74135OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f74136OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ImageView f74137OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ImageView f74138OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public RecyclerView f74139OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ImageView f74140OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ImageView f74141OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C32447OooOOo f74142Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C29553o00O0O f74143Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f74144Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f74145Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f74146Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C32447OooOOo f74147Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C23383OooO0Oo f74148Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C29108OooOOo f74149Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final OooO0OO f74150Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C32447OooOOo f74151Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C29185OooO0o f74152Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public C29051OooOO0o f74153OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final List<InterfaceC29093OooO00o> f74154OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO00o f74155OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f74156OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOo f74157OoooOO0;

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(C29920OooO0oo c29920OooO0oo);

        void OooO0OO();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStyleBox(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        OooOOO0.OooO0oO(context, "context");
        this.f74143Oooo0 = new C29553o00O0O(i, 3, i);
        this.f74147Oooo0O0 = C20519OooO0Oo.OooO0OO(new C29115OooOoO(context, i));
        C23383OooO0Oo c23383OooO0Oo = new C23383OooO0Oo(context);
        this.f74148Oooo0OO = c23383OooO0Oo;
        OooO0OO oooO0OO = new OooO0OO(context);
        this.f74150Oooo0o0 = oooO0OO;
        this.f74149Oooo0o = new C29108OooOOo(context);
        this.f74151Oooo0oO = C20519OooO0Oo.OooO0OO(new C24766OooO0o(context, 1));
        this.f74152Oooo0oo = new C29185OooO0o(R.layout.item_pen_bar_text_style);
        this.f74142Oooo = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0OoOOOo.OooOoOO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i2 = TextStyleBox.f74132o000oOoO;
                return new C29096OooO0Oo(context);
            }
        });
        this.f74154OoooO0 = C34429OooOOo0.OooOO0o(getTextBoxColorPopupWindow(), c23383OooO0Oo, oooO0OO);
        this.f74156OoooO0O = -1;
        View.inflate(context, R.layout.layout_text_style_box, this);
    }

    public static final void OooO(TextStyleBox textStyleBox) {
        Rect rect = new Rect();
        textStyleBox.getWindowVisibleDisplayFrame(rect);
        int i = textStyleBox.f74156OoooO0O;
        int i2 = rect.bottom;
        if (i == i2) {
            return;
        }
        textStyleBox.f74156OoooO0O = i2;
        textStyleBox.getLocationInWindow(new int[2]);
        textStyleBox.setTranslationY(Math.min(0.0f, textStyleBox.f74156OoooO0O - (textStyleBox.getHeight() + r0[1])));
        if (textStyleBox.getTextBoxColorPopupWindow().OooO00o()) {
            textStyleBox.post(new RunnableC28872o00Oo0(textStyleBox, 1));
        }
    }

    public static void OooO00o(TextStyleBox textStyleBox, View view) {
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetVO");
        C29920OooO0oo c29920OooO0oo = (C29920OooO0oo) tag;
        int id = view.getId();
        String id2 = c29920OooO0oo.f106158OooO00o;
        if (id == R.id.btn_delete) {
            C29051OooOO0o c29051OooOO0o = textStyleBox.f74153OoooO;
            if (c29051OooOO0o != null) {
                c29051OooOO0o.OooO0o0(id2);
                return;
            } else {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
        }
        if (id != R.id.btn_edit_name) {
            textStyleBox.getTextBoxColorPopupWindow().dismiss();
            OooO00o oooO00o = textStyleBox.f74155OoooO00;
            if (oooO00o != null) {
                oooO00o.OooO0O0(c29920OooO0oo);
                return;
            }
            return;
        }
        textStyleBox.getTextBoxColorPopupWindow().dismiss();
        String name = c29920OooO0oo.f106159OooO0O0;
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(id2, "id");
        C28026OooO0OO.OooO0O0(C21022OooO0OO.OooO0O0(textStyleBox), new C28766o0000Oo(name, id2));
    }

    public static void OooO0O0(TextStyleBox textStyleBox, View view) {
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
        PenColorVO penColorVO = (PenColorVO) tag;
        if (penColorVO.getSelected()) {
            textStyleBox.getTextBoxColorPopupWindow().OooO0oO(view, penColorVO);
            return;
        }
        C29051OooOO0o c29051OooOO0o = textStyleBox.f74153OoooO;
        if (c29051OooOO0o != null) {
            c29051OooOO0o.OooO(penColorVO.getColor());
        } else {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
    }

    public static void OooO0OO(TextStyleBox textStyleBox, View view) {
        C29096OooO0Oo textBoxBgColorPopupWindow = textStyleBox.getTextBoxBgColorPopupWindow();
        OooOOO0.OooO0Oo(view);
        textBoxBgColorPopupWindow.getClass();
        textBoxBgColorPopupWindow.f103115OooO00o.showAsDropDown(view);
    }

    public static void OooO0Oo(TextStyleBox textStyleBox) {
        OooOO0 textBoxColorPopupWindow = textStyleBox.getTextBoxColorPopupWindow();
        RecyclerView recyclerView = textStyleBox.f74135OooOoO;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvColorList");
            throw null;
        }
        int translationY = (int) textStyleBox.getTranslationY();
        textBoxColorPopupWindow.getClass();
        View contentView = textBoxColorPopupWindow.OooO0OO().getContentView();
        contentView.measure(OooOO0.OooO0Oo(textBoxColorPopupWindow.OooO0OO().getWidth()), OooOO0.OooO0Oo(textBoxColorPopupWindow.OooO0OO().getHeight()));
        Rect rect = new Rect();
        recyclerView.getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        recyclerView.getGlobalVisibleRect(rect2);
        int measuredWidth = ((rect.right - contentView.getMeasuredWidth()) - o000000O.OooO0o(10)) - rect2.right;
        textBoxColorPopupWindow.OooO0OO().update(recyclerView, Math.min(-((contentView.getMeasuredWidth() - recyclerView.getWidth()) / 2), measuredWidth), translationY, textBoxColorPopupWindow.OooO0OO().getWidth(), textBoxColorPopupWindow.OooO0OO().getHeight());
    }

    public static void OooO0o0(TextStyleBox textStyleBox, View view) {
        com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o textFontPopupWindow = textStyleBox.getTextFontPopupWindow();
        OooOOO0.OooO0Oo(view);
        textFontPopupWindow.getClass();
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(textFontPopupWindow.OooO0O0()), null, null, new OooO0O0(textFontPopupWindow, view, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29096OooO0Oo getTextBoxBgColorPopupWindow() {
        return (C29096OooO0Oo) this.f74142Oooo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OooOO0 getTextBoxColorPopupWindow() {
        return (OooOO0) this.f74147Oooo0O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o getTextFontPopupWindow() {
        return (com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f74151Oooo0oO.getValue();
    }

    public final void OooOO0(int i, int i2) {
        C29051OooOO0o c29051OooOO0o = this.f74153OoooO;
        if (c29051OooOO0o == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        c29051OooOO0o.OooOOO0(i);
        C29051OooOO0o c29051OooOO0o2 = this.f74153OoooO;
        if (c29051OooOO0o2 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        c29051OooOO0o2.OooO(i2);
        C29051OooOO0o c29051OooOO0o3 = this.f74153OoooO;
        if (c29051OooOO0o3 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0o3);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29065OooOo00(c29051OooOO0o3, i, null), 2);
    }

    public final void OooOO0O() {
        this.f74155OoooO00 = null;
        getTextFontPopupWindow().f74088OooO0O0 = null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        final View viewFindViewById = findViewById(R.id.cl_text_box_style_content);
        this.f74144Oooo000 = 0;
        this.f74145Oooo00O = 0;
        final C24033OooOooo c24033OooOooo = new C24033OooOooo();
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0OoOOOo.OooOo0o
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int id;
                int i9 = TextStyleBox.f74132o000oOoO;
                int width = view.getWidth();
                View view2 = viewFindViewById;
                int width2 = view2.getWidth();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
                int i10 = (width - width2) / 2;
                Integer numValueOf = Integer.valueOf(i10);
                if (i10 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                C24033OooOooo c24033OooOooo2 = c24033OooOooo;
                if (iIntValue != c24033OooOooo2.f80940OooOo0o) {
                    oooO00o.setMarginStart(iIntValue);
                    view2.setLayoutParams(oooO00o);
                    c24033OooOooo2.f80940OooOo0o = iIntValue;
                }
                TextStyleBox textStyleBox = this;
                if (textStyleBox.f74144Oooo000 != width && textStyleBox.f74145Oooo00O != width2) {
                    textStyleBox.f74146Oooo00o = false;
                }
                if (!textStyleBox.f74146Oooo00o) {
                    textStyleBox.f74146Oooo00o = true;
                    Rect rect = new Rect();
                    RecyclerView recyclerView = textStyleBox.f74139OooOoo0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvStyle");
                        throw null;
                    }
                    recyclerView.getGlobalVisibleRect(rect);
                    boolean z = o000000O.OooO0OO((((width - rect.left) - o000000O.OooO0o(24)) - o000000O.OooO0o(24)) - o000000O.OooO0o(14)) / 34 >= 6;
                    if (z) {
                        RecyclerView recyclerView2 = textStyleBox.f74139OooOoo0;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvStyle");
                            throw null;
                        }
                        recyclerView2.setVisibility(0);
                        ImageView imageView = textStyleBox.f74141OooOooo;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivFullStyleReplaceRV");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        ImageView imageView2 = textStyleBox.f74138OooOoo;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreStyle");
                            throw null;
                        }
                        imageView2.setVisibility(0);
                        int iOooO0o = o000000O.OooO0o(204);
                        RecyclerView recyclerView3 = textStyleBox.f74139OooOoo0;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvStyle");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams2 = recyclerView3.getLayoutParams();
                        layoutParams2.width = iOooO0o;
                        recyclerView3.setLayoutParams(layoutParams2);
                    } else {
                        RecyclerView recyclerView4 = textStyleBox.f74139OooOoo0;
                        if (recyclerView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rvStyle");
                            throw null;
                        }
                        recyclerView4.setVisibility(8);
                        ImageView imageView3 = textStyleBox.f74141OooOooo;
                        if (imageView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivFullStyleReplaceRV");
                            throw null;
                        }
                        imageView3.setVisibility(0);
                        ImageView imageView4 = textStyleBox.f74138OooOoo;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreStyle");
                            throw null;
                        }
                        imageView4.setVisibility(8);
                    }
                    ImageView imageView5 = textStyleBox.f74140OooOooO;
                    if (imageView5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivCloseTextBox");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams3 = imageView5.getLayoutParams();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams3;
                    if (z) {
                        ImageView imageView6 = textStyleBox.f74138OooOoo;
                        if (imageView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreStyle");
                            throw null;
                        }
                        id = imageView6.getId();
                    } else {
                        ImageView imageView7 = textStyleBox.f74141OooOooo;
                        if (imageView7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("ivFullStyleReplaceRV");
                            throw null;
                        }
                        id = imageView7.getId();
                    }
                    oooO00o2.f63894OooOOoo = id;
                    imageView5.setLayoutParams(oooO00o2);
                }
                textStyleBox.f74145Oooo00O = view2.getWidth();
                textStyleBox.f74144Oooo000 = width;
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.iv_text_box);
        imageView.setActivated(true);
        imageView.setOnClickListener(new OooO0o(this, 1));
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_close_text_box_style);
        int i = 2;
        imageView2.setOnClickListener(new oo000o(this, i));
        this.f74140OooOooO = imageView2;
        TextView textView = (TextView) findViewById(R.id.tv_text_box_font);
        textView.setOnClickListener(new o0OOO0o(this, i));
        this.f74134OooOo0o = textView;
        TextView textView2 = (TextView) findViewById(R.id.tv_text_box_font_size);
        textView2.setOnClickListener(new ViewOnClickListenerC29119OooOoo0(textView2, this, 0));
        this.f74133OooOo = textView2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_font_color_list);
        C29553o00O0O c29553o00O0O = this.f74143Oooo0;
        recyclerView.setAdapter(c29553o00O0O);
        c29553o00O0O.f104835OooO0Oo = new o0OO00O(this, 2);
        this.f74135OooOoO = recyclerView;
        recyclerView.setAdapter(c29553o00O0O);
        final TextView textView3 = (TextView) findViewById(R.id.tv_text_box_line_height);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOOo.OooOoo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextStyleBox textStyleBox = this.f103190OooOo0o;
                com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO oooO0OO = textStyleBox.f74150Oooo0o0;
                if (oooO0OO.f74109OooO00o.isShowing()) {
                    oooO0OO.dismiss();
                    return;
                }
                for (InterfaceC29093OooO00o interfaceC29093OooO00o : textStyleBox.f74154OoooO0) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC29093OooO00o, oooO0OO)) {
                        interfaceC29093OooO00o.dismiss();
                    }
                }
                C29051OooOO0o c29051OooOO0o = textStyleBox.f74153OoooO;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                float fFloatValue = ((Number) c29051OooOO0o.f102907OooOOo.f121747OooOo0o.getValue()).floatValue();
                TextView textView4 = textView3;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(textView4);
                oooO0OO.getClass();
                oooO0OO.OooO0O0(fFloatValue, false);
                oooO0OO.f74109OooO00o.showAsDropDown(textView4, 0, -(com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO.f74107OooO0o0 + com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO.f74106OooO0o));
                OooO0OO.OooO00o oooO00o = oooO0OO.f74111OooO0OO;
                if (oooO00o != null) {
                    oooO00o.OooO00o(0);
                }
            }
        });
        this.f74136OooOoO0 = textView3;
        final ImageView imageView3 = (ImageView) findViewById(R.id.iv_star_text_color);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOOo.OooOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextStyleBox textStyleBox = this.f103176OooOo0o;
                androidx.lifecycle.OooOo oooOo = textStyleBox.f74157OoooOO0;
                if (oooOo != null) {
                    C33609OooO0oo.OooO0OO(oooOo, null, null, new Oooo000(textStyleBox, imageView3, null), 3);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewScope");
                    throw null;
                }
            }
        });
        this.f74137OooOoOO = imageView3;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rv_text_style);
        C29185OooO0o c29185OooO0o = this.f74152Oooo0oo;
        recyclerView2.setAdapter(c29185OooO0o);
        c29185OooO0o.f103511OooO0OO = new ViewOnClickListenerC28251OooOooo(this, 1);
        this.f74139OooOoo0 = recyclerView2;
        ImageView imageView4 = (ImageView) findViewById(R.id.iv_more_style);
        imageView4.setOnClickListener(new Oooo000(this, 1));
        this.f74138OooOoo = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.iv_full_style_replace_rv);
        imageView5.setOnClickListener(new ViewOnClickListenerC29113OooOo0O(this, 0));
        this.f74141OooOooo = imageView5;
        getTextBoxColorPopupWindow().f106174OooO0oo = new C29125OooOooo(this);
        getTextBoxColorPopupWindow().f106173OooO0oO = new ViewOnClickListenerC28253Oooo00O(this, 1);
        this.f74148Oooo0OO.f74122OooO0oo = new OooO0o(this);
        this.f74150Oooo0o0.f74111OooO0OO = new C23385OooO0oO(this);
        getTextFontPopupWindow().f74088OooO0O0 = new C23386OooO0oo(this);
        getTextBoxBgColorPopupWindow().f103116OooO0O0.f103491OooO0O0 = new o00O0O(this, 2);
    }

    public final void setTextStyleBoxListener(OooO00o l) {
        OooOOO0.OooO0oO(l, "l");
        this.f74155OoooO00 = l;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility != 0) {
            for (InterfaceC29093OooO00o interfaceC29093OooO00o : this.f74154OoooO0) {
                if (interfaceC29093OooO00o.OooO00o()) {
                    interfaceC29093OooO00o.dismiss();
                }
            }
        }
        super.setVisibility(visibility);
    }
}
