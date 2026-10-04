package o0O0o0oo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.logging.type.LogSeverity;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.ClipboardData;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.notein.global.R;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.UUID;
import o0O0oooo.C26395Oooo0o0;
import o0oo0OOo.C31237OooO0O0;

/* JADX INFO: renamed from: o0O0o0oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26085OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final View f89046OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26075OooO0Oo f89047OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26089OooOOoo f89048OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final View f89049OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f89050OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f89051OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TextView f89052OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public QuoteInfo f89053OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final NoteInContextMenu f89054OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final View f89055OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final View f89056OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final View f89057OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final View f89058OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final View f89059OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final View f89060OooOOOO;

    public C26085OooOOOO(Context context, final C26090OooOo00 c26090OooOo00) {
        this.f89047OooO00o = new C26075OooO0Oo(context, new o00O00O.OooO0O0(this, c26090OooOo00));
        View viewInflate = View.inflate(context, R.layout.view_text_hightlight_style, null);
        viewInflate.setOnClickListener(new ViewOnClickListenerC26071OooO(this, c26090OooOo00));
        this.f89049OooO0OO = viewInflate.findViewById(R.id.v_highlight_color);
        this.f89050OooO0Oo = viewInflate.findViewById(R.id.v_underline_color);
        this.f89052OooO0o0 = (TextView) viewInflate.findViewById(R.id.tv_highlight_font);
        View viewFindViewById = viewInflate.findViewById(R.id.btn_show_popup);
        this.f89051OooO0o = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC26076OooO0o(this, 0));
        this.f89046OooO = viewInflate;
        View viewInflate2 = View.inflate(context, R.layout.view_text_stroke_line, null);
        viewInflate2.setOnClickListener(new ViewOnClickListenerC26080OooOO0(this, c26090OooOo00));
        this.f89055OooOO0 = viewInflate2;
        View viewInflate3 = View.inflate(context, R.layout.view_text_text_anno, null);
        viewInflate3.setOnClickListener(new ViewOnClickListenerC26081OooOO0O(this, c26090OooOo00));
        this.f89056OooOO0O = viewInflate3;
        View viewInflate4 = View.inflate(context, R.layout.view_text_outline, null);
        viewInflate4.setOnClickListener(new ViewOnClickListenerC26082OooOO0o(this, c26090OooOo00));
        this.f89057OooOO0o = viewInflate4;
        View viewInflate5 = View.inflate(context, R.layout.view_text_translate, null);
        viewInflate5.setOnClickListener(new ViewOnClickListenerC26084OooOOO0(this, c26090OooOo00));
        this.f89059OooOOO0 = viewInflate5;
        View viewInflate6 = View.inflate(context, R.layout.view_text_hyperlink, null);
        viewInflate6.setOnClickListener(new ViewOnClickListenerC26083OooOOO(this, c26090OooOo00));
        this.f89058OooOOO = viewInflate6;
        View viewInflate7 = View.inflate(context, R.layout.view_text_delete, null);
        viewInflate7.setOnClickListener(new ViewOnClickListenerC26078OooO0oO(this, c26090OooOo00));
        this.f89060OooOOOO = viewInflate7;
        NoteInContextMenu noteInContextMenu = new NoteInContextMenu(context);
        noteInContextMenu.OooO0O0(viewInflate);
        noteInContextMenu.OooO0O0(viewInflate2);
        noteInContextMenu.OooO0O0(viewInflate3);
        noteInContextMenu.OooO0O0(viewInflate4);
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_copy, new View.OnClickListener() { // from class: o0O0o0oo.OooO0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PDFView pDFView;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo;
                QuoteInfo quoteInfo = this.f89032OooOo0o.f89053OooO0oO;
                if (quoteInfo == null || (abstractC22830OooO0Oo = (pDFView = c26090OooOo00.f89074OooO00o).f69170OooOooO) == null) {
                    return;
                }
                ClipboardData clipboardData = new ClipboardData();
                TextPaint textPaint = new TextPaint();
                float f = 12;
                textPaint.setTextSize((int) TypedValue.applyDimension(2, f, pDFView.getContext().getResources().getDisplayMetrics()));
                C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
                Context context2 = pDFView.getContext();
                String text = quoteInfo.getText();
                int iMin = Math.min((int) quoteInfo.getContentBoundingBox().width(), LogSeverity.EMERGENCY_VALUE);
                c31237OooO0O0.getClass();
                StaticLayout staticLayoutOooO0OO = C31237OooO0O0.OooO0OO(context2, text, iMin, 1.0f, textPaint);
                float width = staticLayoutOooO0OO.getWidth();
                float height = staticLayoutOooO0OO.getHeight();
                TextBoxInfo textBoxInfo = new TextBoxInfo(UUID.randomUUID().toString(), quoteInfo.getText(), (int) TypedValue.applyDimension(2, f, pDFView.getContext().getResources().getDisplayMetrics()), width, height, new RectF(0.0f, 0.0f, width, height), 1.0f, 0, LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis(), ViewCompat.MEASURED_STATE_MASK, new Matrix());
                ArrayList arrayList = new ArrayList();
                clipboardData.f69321OooO00o = arrayList;
                arrayList.add(textBoxInfo);
                pDFView.setClipboardData(clipboardData);
                try {
                    ((ClipboardManager) pDFView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("notein_text_box", "", quoteInfo.getText()));
                } catch (Exception unused) {
                }
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                c26395Oooo0o0.f90558OooO0oO.OooOO0O(quoteInfo);
                pDFView.Oooo000();
                pDFView.invalidate();
            }
        });
        noteInContextMenu.OooO0O0(viewInflate5);
        noteInContextMenu.OooO0O0(viewInflate6);
        noteInContextMenu.OooO0O0(viewInflate7);
        this.f89054OooO0oo = noteInContextMenu;
        this.f89048OooO0O0 = new C26089OooOOoo(new C26079OooO0oo(this));
    }

    public final void OooO00o(QuoteInfo quoteInfo) {
        TextBasicStyleVO textBasicStyleVO;
        this.f89053OooO0oO = quoteInfo;
        if (quoteInfo.getBgColor() == 0 && quoteInfo.getUnderlineColor() == 0) {
            this.f89048OooO0O0.OooO0O0(quoteInfo.getBgColor(), quoteInfo.getUnderlineColor(), false);
            C26089OooOOoo c26089OooOOoo = this.f89048OooO0O0;
            synchronized (c26089OooOOoo.f89069OooO0OO) {
                textBasicStyleVO = c26089OooOOoo.f89069OooO0OO;
            }
            OooO0O0(textBasicStyleVO.highlightColor, textBasicStyleVO.underlineColor);
        } else {
            this.f89048OooO0O0.OooO0O0(quoteInfo.getBgColor(), quoteInfo.getUnderlineColor(), true);
        }
        int type = quoteInfo.getType();
        View view = this.f89060OooOOOO;
        View view2 = this.f89058OooOOO;
        View view3 = this.f89057OooOO0o;
        View view4 = this.f89056OooOO0O;
        View view5 = this.f89055OooOO0;
        View view6 = this.f89046OooO;
        if (type == -1) {
            view6.setVisibility(0);
            view5.setVisibility(0);
            view4.setVisibility(0);
            view3.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(8);
            return;
        }
        if (type == 2) {
            view6.setVisibility(8);
            view5.setVisibility(8);
            view4.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(0);
            return;
        }
        if (type == 3) {
            view6.setVisibility(8);
            view5.setVisibility(8);
            view4.setVisibility(8);
            view3.setVisibility(0);
            view2.setVisibility(8);
            view.setVisibility(0);
            return;
        }
        if (type == 4) {
            view6.setVisibility(0);
            view5.setVisibility(8);
            view4.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(0);
            return;
        }
        if (type != 5) {
            return;
        }
        view6.setVisibility(8);
        view5.setVisibility(8);
        view4.setVisibility(0);
        view3.setVisibility(8);
        view2.setVisibility(8);
        view.setVisibility(0);
    }

    public final void OooO0O0(int i, int i2) {
        Context context = this.f89052OooO0o0.getContext();
        TextView textView = this.f89052OooO0o0;
        if (textView != null) {
            if (i == 0) {
                textView.setTextColor(context.getColor(R.color.editor_text_color));
            } else {
                textView.setTextColor(context.getColor(R.color.editor_text_color_black));
            }
        }
        View view = this.f89049OooO0OO;
        if (view != null) {
            view.setBackgroundTintList(ColorStateList.valueOf(i));
        }
        View view2 = this.f89050OooO0Oo;
        if (view2 != null) {
            view2.setBackgroundColor(i2);
        }
    }
}
