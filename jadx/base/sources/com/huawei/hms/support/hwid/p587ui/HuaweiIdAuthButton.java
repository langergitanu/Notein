package com.huawei.hms.support.hwid.p587ui;

import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.orion.notein.global.R;
import o0O00OO.OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdAuthButton extends RelativeLayout {
    public static final int COLOR_POLICY_BLACK = 3;
    public static final int COLOR_POLICY_GRAY = 4;
    public static final int COLOR_POLICY_RED = 0;
    public static final int COLOR_POLICY_WHITE = 1;
    public static final int COLOR_POLICY_WHITE_WITH_BORDER = 2;
    public static final int CORNER_RADIUS_LARGE = -1;
    public static final int CORNER_RADIUS_MEDIUM = -2;
    public static final int CORNER_RADIUS_SMALL = -3;
    public static final int THEME_FULL_TITLE = 1;
    public static final int THEME_NO_TITLE = 0;

    /* JADX INFO: renamed from: a */
    private static final PorterDuffColorFilter f56958a;

    /* JADX INFO: renamed from: b */
    private static final PorterDuffColorFilter f56959b;

    /* JADX INFO: renamed from: c */
    private static final PorterDuffColorFilter f56960c;

    /* JADX INFO: renamed from: d */
    private int f56961d;

    /* JADX INFO: renamed from: e */
    private int f56962e;

    /* JADX INFO: renamed from: f */
    private int f56963f;

    /* JADX INFO: renamed from: g */
    private GradientDrawable f56964g;

    /* JADX INFO: renamed from: h */
    private Button f56965h;

    /* JADX INFO: renamed from: i */
    private ImageView f56966i;

    /* JADX INFO: renamed from: j */
    private LinearLayout f56967j;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f56958a = new PorterDuffColorFilter(218103808, mode);
        f56959b = new PorterDuffColorFilter(436207616, mode);
        f56960c = new PorterDuffColorFilter(872415231, mode);
    }

    public HuaweiIdAuthButton(Context context) {
        super(context);
        m80161a((AttributeSet) null);
    }

    /* JADX INFO: renamed from: a */
    private void m80161a(AttributeSet attributeSet) {
        GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.hwid_auth_button_background);
        this.f56964g = gradientDrawable;
        setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f56967j = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        this.f56967j.setGravity(17);
        m80162b();
        m80158a();
        addView(this.f56967j);
        int iM80156a = m80156a(8.0f);
        int i2 = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO00o.f88149OooO00o);
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 1);
            i = typedArrayObtainStyledAttributes.getInt(1, 0);
            int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(2, m80156a(8.0f));
            typedArrayObtainStyledAttributes.recycle();
            i2 = i3;
            iM80156a = layoutDimension;
        }
        setLayoutParams(generateDefaultLayoutParams());
        setUIMode(i2, i, iM80156a);
    }

    /* JADX INFO: renamed from: b */
    private void m80162b() {
        if (this.f56965h == null) {
            this.f56965h = new Button(getContext());
        }
        this.f56965h.setStateListAnimator(null);
        this.f56965h.setBackground(null);
        int intrinsicWidth = m80157a(R.drawable.hwid_auth_button_white).getIntrinsicWidth();
        int iM80156a = m80156a(8.0f);
        this.f56965h.setCompoundDrawablePadding(iM80156a);
        m80159a(intrinsicWidth, iM80156a);
        this.f56965h.setLayoutParams(new ViewGroup.LayoutParams(-2, m80156a(36.0f)));
        this.f56967j.addView(this.f56965h);
    }

    private void setBackgroundCornerRadius(int i) {
        this.f56964g.mutate();
        this.f56964g.setCornerRadius(i);
    }

    private void setBackgroundDrawableColor(int i) {
        this.f56964g.mutate();
        this.f56964g.setColor(getResources().getColor(i));
    }

    public int getColorPolicy() {
        return this.f56962e;
    }

    public int getCornerRadius() {
        return this.f56963f;
    }

    public int getTheme() {
        return this.f56961d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GradientDrawable gradientDrawable;
        if (motionEvent.getAction() == 0) {
            if (this.f56964g != null && isEnabled()) {
                int i = this.f56962e;
                if (i == 0) {
                    this.f56964g.setColorFilter(f56959b);
                } else if (i == 1 || i == 2) {
                    this.f56964g.setColorFilter(f56958a);
                } else if (i == 3) {
                    this.f56964g.setColorFilter(f56960c);
                } else if (i == 4) {
                }
            }
        } else if (1 == motionEvent.getAction() && (gradientDrawable = this.f56964g) != null) {
            gradientDrawable.clearColorFilter();
        }
        if (hasOnClickListeners()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setColorPolicy(int i) {
        if (i == 0) {
            m80160a(i, R.color.hwid_auth_button_color_red, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.f56966i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
            return;
        }
        if (i == 1) {
            m80160a(i, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            this.f56966i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
            return;
        }
        if (i == 2) {
            m80160a(i, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            if (this.f56961d == 1) {
                m80163b(m80156a(1.0f), getResources().getColor(R.color.hwid_auth_button_color_border));
                return;
            }
            return;
        }
        if (i == 3) {
            m80160a(i, R.color.hwid_auth_button_color_black, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.f56966i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
        } else {
            if (i != 4) {
                return;
            }
            m80160a(i, R.color.hwid_auth_button_color_gray, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
        }
    }

    public void setCornerRadius(int i) {
        if (i == -3) {
            i = m80156a(3.0f);
        } else if (i == -2) {
            i = m80156a(8.0f);
        } else if (i == -1) {
            i = m80156a(24.0f);
        }
        if (i < 0) {
            return;
        }
        this.f56963f = i;
        setBackgroundCornerRadius(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.38f);
        }
    }

    public void setTheme(int i) {
        if (i == 0) {
            this.f56961d = i;
            this.f56966i.setVisibility(0);
            this.f56965h.setVisibility(8);
            setMinimumWidth(m80156a(48.0f));
            setMinimumHeight(m80156a(48.0f));
            this.f56967j.setMinimumWidth(m80156a(48.0f));
            this.f56967j.setMinimumHeight(m80156a(48.0f));
            return;
        }
        if (i != 1) {
            return;
        }
        this.f56961d = i;
        this.f56966i.setVisibility(8);
        this.f56965h.setVisibility(0);
        setMinimumWidth(m80156a(200.0f));
        setMinimumHeight(m80156a(36.0f));
        this.f56967j.setMinimumWidth(m80156a(200.0f));
        this.f56967j.setMinimumHeight(m80156a(36.0f));
    }

    public void setUIMode(int i, int i2, int i3) {
        setTheme(i);
        setColorPolicy(i2);
        setCornerRadius(i3);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80161a(attributeSet);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80161a(attributeSet);
    }

    /* JADX INFO: renamed from: b */
    private void m80163b(int i, int i2) {
        this.f56964g.mutate();
        this.f56964g.setStroke(i, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m80158a() {
        if (this.f56966i == null) {
            this.f56966i = new ImageView(getContext());
        }
        this.f56966i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
        this.f56967j.addView(this.f56966i);
    }

    /* JADX INFO: renamed from: a */
    private void m80159a(int i, int i2) {
        this.f56965h.setTextSize(16.0f);
        this.f56965h.setText(getResources().getText(R.string.hwid_huawei_login_button_text));
        this.f56965h.setSingleLine();
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int iM80156a = m80156a(16.0f);
        int i4 = iM80156a + iM80156a;
        int i5 = i3 - i4;
        this.f56965h.setMaxWidth(i5);
        float fMeasureText = this.f56965h.getPaint().measureText(this.f56965h.getText().toString());
        while (C21036OooOOo0.OooO00o((int) fMeasureText, i, i2, i4) > i5 && this.f56965h.getTextSize() > m80156a(9.0f)) {
            Button button = this.f56965h;
            button.setTextSize(0, button.getTextSize() - 1.0f);
            fMeasureText = this.f56965h.getPaint().measureText(this.f56965h.getText().toString());
        }
        this.f56965h.setEllipsize(TextUtils.TruncateAt.END);
        this.f56965h.setPadding(iM80156a, 0, iM80156a, 0);
    }

    /* JADX INFO: renamed from: a */
    private Drawable m80157a(int i) {
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f56965h.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        return drawable;
    }

    /* JADX INFO: renamed from: a */
    private void m80160a(int i, int i2, int i3, int i4) {
        this.f56962e = i;
        if (this.f56961d != 1 && i != 0 && i != 3 && i != 1) {
            setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
            this.f56966i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        } else {
            setBackgroundDrawableColor(i2);
        }
        m80163b(0, 0);
        this.f56965h.setTextColor(getResources().getColor(i3));
        m80157a(i4);
    }

    /* JADX INFO: renamed from: a */
    private int m80156a(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
