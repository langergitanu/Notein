package o0o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.orion.notein.global.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0o000oO.ViewOnClickListenerC29781OooO0o;
import o0o0OoO0.C30675OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ImageView f107377OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC29781OooO0o f107379OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f107380OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C30675OooO0Oo f107381OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f107382OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ViewGroup f107383OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ImageView f107384OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ImageView f107385OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ImageView f107386OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ImageView f107387OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ImageView f107388OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f107389OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f107390OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f107391OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f107392OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f107393OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public View f107394OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public View f107395OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final AtomicBoolean f107396OooOo0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f107397OooOo00;

    public OooO(Context context, ViewOnClickListenerC29781OooO0o viewOnClickListenerC29781OooO0o) {
        this.f107378OooO00o = context;
        this.f107379OooO0O0 = viewOnClickListenerC29781OooO0o;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107380OooO0OO;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO0O0() {
        Object systemService = this.f107378OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_text_style_menu, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f107380OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.f107380OooO0OO;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        this.f107383OooO0o0 = (ViewGroup) viewInflate.findViewById(R.id.cl_more_styles);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.btn_text_bold);
        ViewOnClickListenerC29781OooO0o viewOnClickListenerC29781OooO0o = this.f107379OooO0O0;
        imageView.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107382OooO0o = imageView;
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.btn_text_italic);
        imageView2.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107384OooO0oO = imageView2;
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.btn_text_underline);
        imageView3.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107385OooO0oo = imageView3;
        ImageView imageView4 = (ImageView) viewInflate.findViewById(R.id.btn_text_strikethrough);
        imageView4.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107377OooO = imageView4;
        ImageView imageView5 = (ImageView) viewInflate.findViewById(R.id.btn_text_align_left);
        imageView5.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107386OooOO0 = imageView5;
        ImageView imageView6 = (ImageView) viewInflate.findViewById(R.id.btn_text_align_center);
        imageView6.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107387OooOO0O = imageView6;
        ImageView imageView7 = (ImageView) viewInflate.findViewById(R.id.btn_text_align_right);
        imageView7.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107388OooOO0o = imageView7;
        TextView textView = (TextView) viewInflate.findViewById(R.id.btn_text_heading_1);
        textView.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107390OooOOO0 = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.btn_text_heading_2);
        textView2.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107389OooOOO = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_text_heading_3);
        textView3.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107391OooOOOO = textView3;
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_text_heading_body);
        textView4.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107392OooOOOo = textView4;
        View viewFindViewById = viewInflate.findViewById(R.id.btn_text_bullet);
        viewFindViewById.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107394OooOOo0 = viewFindViewById;
        this.f107393OooOOo = (TextView) viewFindViewById.findViewById(R.id.tv_text_bullet);
        View viewFindViewById2 = viewInflate.findViewById(R.id.btn_text_number);
        viewFindViewById2.setOnClickListener(viewOnClickListenerC29781OooO0o);
        this.f107395OooOOoo = viewFindViewById2;
        this.f107397OooOo00 = (TextView) viewFindViewById2.findViewById(R.id.tv_text_number);
        PopupWindow popupWindow3 = this.f107380OooO0OO;
        if (popupWindow3 != null) {
            popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o0O.OooO0oo
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C30675OooO0Oo c30675OooO0Oo = this.f107433OooOo0o.f107381OooO0Oo;
                    if (c30675OooO0Oo != null) {
                        c30675OooO0Oo.onDismiss();
                    }
                }
            });
        } else {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO0OO(TextView textView) {
        if (textView.isActivated()) {
            TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, (Drawable) null, (Drawable) null, this.f107378OooO00o.getDrawable(R.drawable.ic_checked_white), (Drawable) null);
        } else {
            textView.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void OooO0Oo(Map<Integer, ? extends Object> newStyles) {
        OooOOO0.OooO0oO(newStyles, "newStyles");
        if (this.f107396OooOo0.compareAndSet(false, true)) {
            OooO0O0();
        }
        for (Map.Entry<Integer, ? extends Object> entry : newStyles.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Object value = entry.getValue();
            if (iIntValue == 0) {
                ImageView imageView = this.f107382OooO0o;
                if (imageView == null) {
                    OooOOO0.OooOOOO("btnBold");
                    throw null;
                }
                imageView.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 1) {
                ImageView imageView2 = this.f107384OooO0oO;
                if (imageView2 == null) {
                    OooOOO0.OooOOOO("btnItalic");
                    throw null;
                }
                imageView2.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 2) {
                ImageView imageView3 = this.f107385OooO0oo;
                if (imageView3 == null) {
                    OooOOO0.OooOOOO("btnUnderline");
                    throw null;
                }
                imageView3.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 3) {
                View view = this.f107394OooOOo0;
                if (view == null) {
                    OooOOO0.OooOOOO("btnBullet");
                    throw null;
                }
                view.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
                TextView textView = this.f107393OooOOo;
                if (textView == null) {
                    OooOOO0.OooOOOO("textBullet");
                    throw null;
                }
                OooO0OO(textView);
            } else if (iIntValue == 4) {
                View view2 = this.f107395OooOOoo;
                if (view2 == null) {
                    OooOOO0.OooOOOO("btnNumber");
                    throw null;
                }
                view2.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
                TextView textView2 = this.f107397OooOo00;
                if (textView2 == null) {
                    OooOOO0.OooOOOO("textNumber");
                    throw null;
                }
                OooO0OO(textView2);
            } else if (iIntValue == 7) {
                ImageView imageView4 = this.f107386OooOO0;
                if (imageView4 == null) {
                    OooOOO0.OooOOOO("btnAlignLeft");
                    throw null;
                }
                imageView4.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 8) {
                ImageView imageView5 = this.f107387OooOO0O;
                if (imageView5 == null) {
                    OooOOO0.OooOOOO("btnAlignCenter");
                    throw null;
                }
                imageView5.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 9) {
                ImageView imageView6 = this.f107388OooOO0o;
                if (imageView6 == null) {
                    OooOOO0.OooOOOO("btnAlignRight");
                    throw null;
                }
                imageView6.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 14) {
                ImageView imageView7 = this.f107377OooO;
                if (imageView7 == null) {
                    OooOOO0.OooOOOO("btnStrikethrough");
                    throw null;
                }
                imageView7.setActivated(OooOOO0.OooO0O0(value, Boolean.TRUE));
            } else if (iIntValue == 19) {
                TextView textView3 = this.f107390OooOOO0;
                if (textView3 == null) {
                    OooOOO0.OooOOOO("btnHeading1");
                    throw null;
                }
                textView3.setActivated(OooOOO0.OooO0O0(value, 1));
                TextView textView4 = this.f107390OooOOO0;
                if (textView4 == null) {
                    OooOOO0.OooOOOO("btnHeading1");
                    throw null;
                }
                OooO0OO(textView4);
                TextView textView5 = this.f107389OooOOO;
                if (textView5 == null) {
                    OooOOO0.OooOOOO("btnHeading2");
                    throw null;
                }
                textView5.setActivated(OooOOO0.OooO0O0(value, 2));
                TextView textView6 = this.f107389OooOOO;
                if (textView6 == null) {
                    OooOOO0.OooOOOO("btnHeading2");
                    throw null;
                }
                OooO0OO(textView6);
                TextView textView7 = this.f107391OooOOOO;
                if (textView7 == null) {
                    OooOOO0.OooOOOO("btnHeading3");
                    throw null;
                }
                textView7.setActivated(OooOOO0.OooO0O0(value, 3));
                TextView textView8 = this.f107391OooOOOO;
                if (textView8 == null) {
                    OooOOO0.OooOOOO("btnHeading3");
                    throw null;
                }
                OooO0OO(textView8);
                TextView textView9 = this.f107392OooOOOo;
                if (textView9 == null) {
                    OooOOO0.OooOOOO("btnHeadingBody");
                    throw null;
                }
                textView9.setActivated(OooOOO0.OooO0O0(value, 0));
                TextView textView10 = this.f107392OooOOOo;
                if (textView10 == null) {
                    OooOOO0.OooOOOO("btnHeadingBody");
                    throw null;
                }
                OooO0OO(textView10);
            } else {
                continue;
            }
        }
    }
}
