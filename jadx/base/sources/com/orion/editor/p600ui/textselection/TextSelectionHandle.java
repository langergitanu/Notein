package com.orion.editor.p600ui.textselection;

import Oooo0.C20857Oooooo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.core.internal.view.SupportMenu;
import com.orion.editor.OooO0o;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.penkit.models.PdfTextInfo;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collections;
import java.util.UUID;
import o0O0o00.EnumC25982o0000oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class TextSelectionHandle extends RelativeLayout {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static int f69416OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static int f69417OooOooO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f69418OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PDFView f69419OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final PointF f69420OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f69421OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final PointF f69422OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final PDFView.OooO00o f69423OooOoo0;

    public TextSelectionHandle(Context context, PDFView.OooO00o oooO00o) {
        super(context);
        this.f69418OooOo = 0;
        this.f69421OooOoO0 = false;
        this.f69420OooOoO = new PointF();
        this.f69422OooOoOO = new PointF();
        this.f69423OooOoo0 = oooO00o;
        f69416OooOoo = C20857Oooooo.OooO0O0(context, 24);
        f69417OooOooO = C20857Oooooo.OooO0O0(context, 24);
        setVisibility(8);
    }

    public final void OooO00o(int i, float f, float f2, boolean z) {
        this.f69418OooOo = i;
        this.f69421OooOoO0 = z;
        if (z) {
            if (i == 2) {
                setBackgroundResource(R.drawable.text_selection_handle_top);
            } else if (i == 3) {
                setBackgroundResource(R.drawable.text_selection_handle_bottom);
            }
        } else if (i == 0) {
            setBackgroundResource(R.drawable.text_selection_handle_left);
        } else if (i == 1) {
            setBackgroundResource(R.drawable.text_selection_handle_right);
        }
        if (this.f69421OooOoO0) {
            int i2 = this.f69418OooOo;
            if (i2 == 2) {
                setX(f - (f69416OooOoo / 2));
                setY(f2 - f69417OooOooO);
            } else if (i2 == 3) {
                setX(f - (f69416OooOoo / 2));
                setY(f2);
            }
        } else {
            int i3 = this.f69418OooOo;
            if (i3 == 0) {
                setX(f - f69416OooOoo);
                setY(f2 - (f69417OooOooO / 2));
            } else if (i3 == 1) {
                setX(f);
                setY(f2 - (f69417OooOooO / 2));
            }
        }
        setVisibility(0);
    }

    public PointF getTextPosition() {
        float x;
        float y;
        float x2;
        if (this.f69421OooOoO0) {
            x2 = getX() + (f69416OooOoo / 2);
            int i = this.f69418OooOo;
            if (i == 2) {
                y = getY() + f69417OooOooO;
            } else if (i == 3) {
                y = getY();
            } else {
                y = (f69417OooOooO / 2) + getY();
            }
        } else {
            float y2 = getY() + (f69417OooOooO / 2);
            int i2 = this.f69418OooOo;
            if (i2 == 0) {
                x = getX() + f69416OooOoo;
            } else if (i2 == 1) {
                x = getX();
            } else {
                x = (f69416OooOoo / 2) + getX();
            }
            float f = x;
            y = y2;
            x2 = f;
        }
        return new PointF(x2, y);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        QuoteInfo quoteInfoOooO0O0;
        QuoteInfo quoteInfoCopy;
        float f;
        PointF textPosition;
        PointF pointF;
        float f2;
        int action = motionEvent.getAction();
        QuoteInfo quoteInfoCopy2 = null;
        if (action == 0) {
            this.f69420OooOoO.set(motionEvent.getRawX(), motionEvent.getRawY());
            this.f69422OooOoOO.set(getX(), getY());
            PDFView pDFView = PDFView.this;
            OooO0o oooO0o = pDFView.f69168OooOoo;
            oooO0o.f69126OooO0Oo = null;
            OooO0o.OooO00o oooO00o = oooO0o.f69128OooO0o0;
            if (oooO00o != null && (quoteInfoOooO0O0 = oooO00o.OooO0O0(oooO0o.f69125OooO0OO)) != null) {
                oooO0o.f69126OooO0Oo = (QuoteInfo) quoteInfoOooO0O0.deepCopy(quoteInfoOooO0O0.getId());
            }
            Boolean bool = Boolean.FALSE;
            pDFView.Oooo00O(bool, bool);
            return true;
        }
        if (action == 1) {
            this.f69420OooOoO.set(0.0f, 0.0f);
            PDFView.OooO00o oooO00o2 = this.f69423OooOoo0;
            PointF textPosition2 = PDFView.this.f69236o000O.getTextPosition();
            PointF textPosition3 = PDFView.this.f69249o000OO00.getTextPosition();
            OooO0o oooO0o2 = PDFView.this.f69168OooOoo;
            if (oooO0o2.f69125OooO0OO.f69170OooOooO != null) {
                PdfTextInfo pdfTextInfoOooO0OO = oooO0o2.OooO0OO(textPosition2, textPosition3, true);
                synchronized (oooO0o2.f69127OooO0o) {
                    try {
                        OooO0o.OooO00o oooO00o3 = oooO0o2.f69128OooO0o0;
                        if (oooO00o3 != null) {
                            QuoteInfo quoteInfo = oooO00o3.f69129OooO00o;
                            if (oooO0o2.f69125OooO0OO.getEditMode() == PDFView.EnumC22832OooO0Oo.f69318OooOoOO) {
                                quoteInfoCopy = quoteInfo.copy(quoteInfo.getId(), quoteInfo.getBgColor(), quoteInfo.getUnderlineColor(), new RectF(), quoteInfo.getType(), pdfTextInfoOooO0OO.getRects(), pdfTextInfoOooO0OO.getText(), quoteInfo.getLinkCommentId(), quoteInfo.getLayerId(), quoteInfo.getCreationTime(), quoteInfo.getAnnoItemIdList(), quoteInfo.getIconBoundingBox(), pdfTextInfoOooO0OO.isVerticalText(), pdfTextInfoOooO0OO.isRtlOrBttText());
                                quoteInfoCopy.recreateIconBounds(oooO0o2.f69125OooO0OO.getZoomLevel());
                                oooO0o2.f69126OooO0Oo = null;
                                oooO0o2.f69128OooO0o0 = OooO0o.OooO00o.OooO00o(oooO0o2.f69125OooO0OO, quoteInfoCopy);
                            } else {
                                quoteInfoCopy = quoteInfo.copy(UUID.randomUUID().toString(), quoteInfo.getBgColor(), quoteInfo.getUnderlineColor(), new RectF(), quoteInfo.getType(), pdfTextInfoOooO0OO.getRects(), pdfTextInfoOooO0OO.getText(), quoteInfo.getLinkCommentId(), quoteInfo.getLayerId(), quoteInfo.getCreationTime(), quoteInfo.getAnnoItemIdList(), quoteInfo.getIconBoundingBox(), pdfTextInfoOooO0OO.isVerticalText(), pdfTextInfoOooO0OO.isRtlOrBttText());
                                quoteInfoCopy.recreateIconBounds(oooO0o2.f69125OooO0OO.getZoomLevel());
                                QuoteInfo quoteInfo2 = oooO0o2.f69126OooO0Oo;
                                if (quoteInfoCopy.getType() != -1) {
                                    oooO0o2.f69125OooO0OO.o00oO0O(quoteInfo2 != null ? Collections.singletonList(quoteInfo2) : Collections.EMPTY_LIST, Collections.singletonList(quoteInfoCopy), EnumC25982o0000oO.f88734OooOo);
                                }
                                oooO0o2.f69126OooO0Oo = null;
                                oooO0o2.f69128OooO0o0 = OooO0o.OooO00o.OooO00o(oooO0o2.f69125OooO0OO, quoteInfoCopy);
                            }
                            quoteInfoCopy2 = quoteInfoCopy;
                        }
                    } finally {
                    }
                }
            }
            if (quoteInfoCopy2 == null || TextUtils.isEmpty(quoteInfoCopy2.getText())) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PDFView");
                c20358OooO00o.OooO0OO("PDFView.onHandleMoveEnd text isEmpty,textSelected: " + quoteInfoCopy2, new Object[0]);
                return true;
            }
            PDFView pDFView2 = PDFView.this;
            if (pDFView2.f69251o000OO0o == PDFView.EnumC22832OooO0Oo.f69318OooOoOO) {
                pDFView2.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOOOO(quoteInfoCopy2);
                return true;
            }
            pDFView2.o00ooo(quoteInfoCopy2);
            return true;
        }
        if (action != 2) {
            return true;
        }
        float rawX = motionEvent.getRawX() - this.f69420OooOoO.x;
        float rawY = motionEvent.getRawY() - this.f69420OooOoO.y;
        PointF pointF2 = this.f69422OooOoOO;
        float f3 = pointF2.x + rawX;
        float f4 = pointF2.y + rawY;
        if (this.f69421OooOoO0) {
            f3 += f69416OooOoo / 2;
            int i = this.f69418OooOo;
            if (i == 2) {
                f2 = f69417OooOooO;
            } else if (i != 3) {
                f2 = f69417OooOooO / 2;
            }
            f4 += f2;
        } else {
            f4 += f69417OooOooO / 2;
            int i2 = this.f69418OooOo;
            if (i2 == 0) {
                f = f69416OooOoo;
            } else if (i2 != 1) {
                f = f69416OooOoo / 2;
            }
            f3 += f;
        }
        PDFView.OooO00o oooO00o4 = this.f69423OooOoo0;
        PDFView pDFView3 = PDFView.this;
        TextSelectionHandle textSelectionHandle = pDFView3.f69236o000O;
        if (this == textSelectionHandle) {
            textPosition = new PointF(f3, f4);
            pointF = PDFView.this.f69249o000OO00.getTextPosition();
        } else {
            if (this != pDFView3.f69249o000OO00) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PDFView");
                c20358OooO00o2.OooO0OO("onHandleMove: unknown handle", new Object[0]);
                return true;
            }
            textPosition = textSelectionHandle.getTextPosition();
            pointF = new PointF(f3, f4);
        }
        OooO0o oooO0o3 = PDFView.this.f69168OooOoo;
        if (oooO0o3.f69125OooO0OO.f69170OooOooO != null) {
            PdfTextInfo pdfTextInfoOooO0OO2 = oooO0o3.OooO0OO(textPosition, pointF, true);
            synchronized (oooO0o3.f69127OooO0o) {
                try {
                    OooO0o.OooO00o oooO00o5 = oooO0o3.f69128OooO0o0;
                    if (oooO00o5 != null) {
                        QuoteInfo quoteInfo3 = oooO00o5.f69129OooO00o;
                        quoteInfoCopy2 = quoteInfo3.copy(quoteInfo3.getId(), quoteInfo3.getBgColor(), quoteInfo3.getUnderlineColor(), new RectF(), quoteInfo3.getType(), pdfTextInfoOooO0OO2.getRects(), pdfTextInfoOooO0OO2.getText(), quoteInfo3.getLinkCommentId(), quoteInfo3.getLayerId(), quoteInfo3.getCreationTime(), quoteInfo3.getAnnoItemIdList(), quoteInfo3.getIconBoundingBox(), pdfTextInfoOooO0OO2.isVerticalText(), pdfTextInfoOooO0OO2.isRtlOrBttText());
                        oooO0o3.f69128OooO0o0 = OooO0o.OooO00o.OooO00o(oooO0o3.f69125OooO0OO, quoteInfoCopy2);
                    }
                } finally {
                }
            }
        }
        PDFView pDFView4 = PDFView.this;
        OooO0o oooO0o4 = pDFView4.f69168OooOoo;
        TextSelectionHandle textSelectionHandle2 = pDFView4.f69236o000O;
        TextSelectionHandle textSelectionHandle3 = pDFView4.f69249o000OO00;
        oooO0o4.getClass();
        OooO0o.OooO0o(quoteInfoCopy2, textSelectionHandle2, textSelectionHandle3, true);
        PDFView.this.invalidate();
        return true;
    }

    public void setupLayout(PDFView pDFView) {
        this.f69419OooOo0o = pDFView;
        setBackgroundColor(SupportMenu.CATEGORY_MASK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(f69416OooOoo, f69417OooOooO);
        layoutParams.setMargins(0, 0, 0, 0);
        pDFView.addView(this, layoutParams);
    }
}
