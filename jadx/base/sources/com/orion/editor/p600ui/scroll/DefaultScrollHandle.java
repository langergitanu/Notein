package com.orion.editor.p600ui.scroll;

import Oooo0.C20857Oooooo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import o0O0o00.C25909OooO00o;
import o0O0oO0O.InterfaceC26093OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultScrollHandle extends RelativeLayout implements InterfaceC26093OooO00o {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static int f69404Oooo00O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextView f69405OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f69406OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f69407OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Context f69408OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public PDFView f69409OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Handler f69410OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f69411OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO00o f69412OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public PointF f69413OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f69414Oooo000;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DefaultScrollHandle.this.setVisibility(4);
        }
    }

    private int getAlignments() {
        return this.f69409OooOoOO.f69186OoooO0O ? this.f69407OooOoO ? 9 : 11 : this.f69407OooOoO ? 10 : 12;
    }

    private Drawable getScrollHandleBackground() {
        boolean z = this.f69409OooOoOO.f69186OoooO0O;
        Context context = this.f69408OooOoO0;
        return z ? this.f69407OooOoO ? ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_left) : ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_right) : this.f69407OooOoO ? ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_top) : ContextCompat.getDrawable(context, R.drawable.default_scroll_handle_bottom);
    }

    private void setPosition(float f) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            return;
        }
        PDFView pDFView = this.f69409OooOoOO;
        float height = pDFView.f69186OoooO0O ? pDFView.getHeight() : pDFView.getWidth();
        float fOooO0O0 = f - this.f69406OooOo0o;
        if (fOooO0O0 < 0.0f) {
            fOooO0O0 = 0.0f;
        } else {
            Context context = this.f69408OooOoO0;
            if (fOooO0O0 > height - C20857Oooooo.OooO0O0(context, 24)) {
                fOooO0O0 = height - C20857Oooooo.OooO0O0(context, 24);
            }
        }
        if (this.f69409OooOoOO.f69186OoooO0O) {
            int i = f69404Oooo00O;
            if (fOooO0O0 <= i) {
                fOooO0O0 = i;
            } else if (fOooO0O0 >= height - i) {
                fOooO0O0 = height - i;
            }
            setY(fOooO0O0);
        } else {
            setX(fOooO0O0);
        }
        if (this.f69409OooOoOO.f69186OoooO0O) {
            this.f69406OooOo0o = (((getY() - f69404Oooo00O) + this.f69406OooOo0o) / (this.f69409OooOoOO.getHeight() - (f69404Oooo00O * 2))) * getHeight();
        } else {
            this.f69406OooOo0o = ((getX() + this.f69406OooOo0o) / this.f69409OooOoOO.getWidth()) * getWidth();
        }
        invalidate();
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final void OooO00o() {
        this.f69409OooOoOO.removeView(this);
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final void OooO0O0() {
        this.f69407OooOoO = !this.f69407OooOoO;
        if (this.f69409OooOoOO == null) {
            return;
        }
        setBackground(getScrollHandleBackground());
        int alignments = getAlignments();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.removeRule(9);
        layoutParams.removeRule(11);
        layoutParams.removeRule(10);
        layoutParams.removeRule(12);
        layoutParams.addRule(alignments);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final boolean OooO0OO() {
        return this.f69407OooOoO;
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final void OooO0Oo() {
        this.f69410OooOoo.postDelayed(this.f69412OooOooO, 1000L);
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final boolean OooO0o0() {
        return getVisibility() == 0;
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final void hide() {
        setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PDFView pDFView = this.f69409OooOoOO;
        if (pDFView != null && pDFView.getPageCount() > 0) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69409OooOoOO.f69170OooOooO;
            if (!(abstractC22830OooO0Oo == null ? false : abstractC22830OooO0Oo.OooO0oO())) {
                int action = motionEvent.getAction();
                PointF pointF = this.f69413OooOooo;
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3) {
                                if (action != 5) {
                                    if (action != 6) {
                                        return super.onTouchEvent(motionEvent);
                                    }
                                }
                                pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
                                C25909OooO00o c25909OooO00o = this.f69409OooOoOO.f69167OooOoOO;
                                c25909OooO00o.f88446OooO0Oo = false;
                                c25909OooO00o.f88445OooO0OO.forceFinished(true);
                                this.f69410OooOoo.removeCallbacks(this.f69412OooOooO);
                                if (this.f69409OooOoOO.f69186OoooO0O) {
                                }
                            }
                        }
                    }
                    float fAbs = Math.abs(motionEvent.getRawX() - pointF.x);
                    float f = this.f69414Oooo000;
                    if (fAbs < f && Math.abs(motionEvent.getRawY() - pointF.y) < f) {
                        super.performClick();
                    }
                    OooO0Oo();
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = this.f69409OooOoOO.f69170OooOooO;
                    if (abstractC22830OooO0Oo2 == null) {
                        return true;
                    }
                    abstractC22830OooO0Oo2.Oooo00o();
                    return true;
                }
                pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
                C25909OooO00o c25909OooO00o2 = this.f69409OooOoOO.f69167OooOoOO;
                c25909OooO00o2.f88446OooO0Oo = false;
                c25909OooO00o2.f88445OooO0OO.forceFinished(true);
                this.f69410OooOoo.removeCallbacks(this.f69412OooOooO);
                if (this.f69409OooOoOO.f69186OoooO0O) {
                    this.f69411OooOoo0 = motionEvent.getRawX() - getX();
                } else {
                    this.f69411OooOoo0 = motionEvent.getRawY() - getY();
                }
                if (this.f69409OooOoOO.f69186OoooO0O) {
                    setPosition((motionEvent.getRawY() - this.f69411OooOoo0) + this.f69406OooOo0o);
                    this.f69409OooOoOO.OooooOo(this.f69406OooOo0o / getHeight(), false);
                    return true;
                }
                setPosition((motionEvent.getRawX() - this.f69411OooOoo0) + this.f69406OooOo0o);
                this.f69409OooOoOO.OooooOo(this.f69406OooOo0o / getWidth(), false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public void setPageNum(int i) {
        String strValueOf = String.valueOf(i);
        TextView textView = this.f69405OooOo;
        if (textView.getText().toString().equals(strValueOf)) {
            return;
        }
        textView.setText(strValueOf);
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public void setScroll(float f) {
        float width;
        if (OooO0o0()) {
            this.f69410OooOoo.removeCallbacks(this.f69412OooOooO);
        } else {
            setVisibility(0);
        }
        PDFView pDFView = this.f69409OooOoOO;
        if (pDFView != null) {
            if (pDFView.f69186OoooO0O) {
                int height = pDFView.getHeight();
                width = ((height - (r1 * 2)) * f) + f69404Oooo00O;
            } else {
                width = pDFView.getWidth() * f;
            }
            setPosition(width);
        }
    }

    public void setTextColor(int i) {
        this.f69405OooOo.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.f69405OooOo.setTextSize(1, i);
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public void setupLayout(PDFView pDFView) {
        this.f69409OooOoOO = pDFView;
        int i = 24;
        int i2 = 48;
        if (pDFView.f69186OoooO0O) {
            i2 = 24;
            i = 48;
        }
        setBackground(getScrollHandleBackground());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        View view = this.f69405OooOo;
        addView(view, layoutParams);
        if (!pDFView.f69186OoooO0O) {
            view.setRotation(90.0f);
        }
        Context context = this.f69408OooOoO0;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C20857Oooooo.OooO0O0(context, i), C20857Oooooo.OooO0O0(context, i2));
        int alignments = getAlignments();
        layoutParams2.setMargins(0, 0, 0, 0);
        layoutParams2.addRule(alignments);
        pDFView.addView(this, layoutParams2);
    }

    @Override // o0O0oO0O.InterfaceC26093OooO00o
    public final void show() {
        setVisibility(0);
    }
}
