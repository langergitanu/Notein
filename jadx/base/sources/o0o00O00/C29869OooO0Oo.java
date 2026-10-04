package o0o00O00;

import Oooo0.o000000O;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28036OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o00O00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29869OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f105979OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f105980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Integer> f105981OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f105982OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f105983OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImageView f105984OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ImageView f105985OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ImageView f105986OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ImageView f105987OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f105988OooOO0;

    /* JADX INFO: renamed from: o0o00O00.OooO0Oo$OooO00o */
    public static final class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29869OooO0Oo f105989OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ View f105990OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f105991OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f105992OooOoO0;

        public OooO00o(int i, int i2, View view, C29869OooO0Oo c29869OooO0Oo) {
            this.f105990OooOo0o = view;
            this.f105989OooOo = c29869OooO0Oo;
            this.f105992OooOoO0 = i;
            this.f105991OooOoO = i2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f105990OooOo0o.removeOnAttachStateChangeListener(this);
            view.post(new OooO0O0(this.f105992OooOoO0, this.f105991OooOoO, view, this.f105989OooOo));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: o0o00O00.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ View f105993OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29869OooO0Oo f105994OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f105995OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f105996OooOoO0;

        public OooO0O0(int i, int i2, View view, C29869OooO0Oo c29869OooO0Oo) {
            this.f105994OooOo0o = c29869OooO0Oo;
            this.f105993OooOo = view;
            this.f105996OooOoO0 = i;
            this.f105995OooOoO = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f105994OooOo0o.OooO0o0(this.f105993OooOo, this.f105996OooOoO0, this.f105995OooOoO);
        }
    }

    public C29869OooO0Oo(Context context) {
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.btn_close), Integer.valueOf(R.id.btn_do_not_show_again));
        this.f105981OooO0O0 = listOooOO0o;
        this.f105988OooOO0 = -1;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_input_type_tips, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, false);
        this.f105980OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(viewInflate.findViewById(((Number) it.next()).intValue()));
        }
        this.f105982OooO0OO = arrayList;
        this.f105983OooO0Oo = viewInflate.findViewById(R.id.cv_guide_content);
        this.f105985OooO0o0 = (ImageView) viewInflate.findViewById(R.id.iv_arrow_up);
        this.f105984OooO0o = (ImageView) viewInflate.findViewById(R.id.iv_arrow_down);
        this.f105986OooO0oO = (ImageView) viewInflate.findViewById(R.id.iv_arrow_left);
        this.f105987OooO0oo = (ImageView) viewInflate.findViewById(R.id.iv_arrow_right);
        this.f105980OooO00o.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o00O00.OooO0O0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f105976OooOo0o.f105979OooO = System.currentTimeMillis();
            }
        });
    }

    public static int OooO0O0(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    public final synchronized void OooO00o() {
        this.f105980OooO00o.dismiss();
    }

    public final void OooO0OO(final PopupWindow.OnDismissListener onDismissListener) {
        this.f105980OooO00o.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o00O00.OooO0OO
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f105978OooOo0o.f105979OooO = System.currentTimeMillis();
                onDismissListener.onDismiss();
            }
        });
    }

    public final void OooO0Oo(View.OnClickListener onClickListener) {
        Iterator it = this.f105982OooO0OO.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean OooO0o0(final View anchor, final int i, final int i2) {
        int measuredWidth;
        int iCenterY;
        OooOOO0.OooO0oO(anchor, "anchor");
        if (this.f105980OooO00o.isShowing()) {
            return false;
        }
        Context context = anchor.getContext();
        if ((context instanceof Activity) && (((Activity) context).isFinishing() || ((Activity) context).isDestroyed())) {
            return false;
        }
        if (!ViewCompat.isAttachedToWindow(anchor)) {
            if (anchor.isAttachedToWindow()) {
                anchor.post(new OooO0O0(i, i2, anchor, this));
            } else {
                anchor.addOnAttachStateChangeListener(new OooO00o(i, i2, anchor, this));
            }
            return false;
        }
        if (anchor.getWindowToken() == null) {
            anchor.post(new Runnable() { // from class: o0o00O00.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    this.OooO0o0(anchor, i, i2);
                }
            });
            return false;
        }
        if (System.currentTimeMillis() - this.f105979OooO < 500) {
            return false;
        }
        this.f105988OooOO0 = i;
        View contentView = this.f105980OooO00o.getContentView();
        Context context2 = contentView.getContext();
        TextView textView = (TextView) contentView.findViewById(R.id.tv_title);
        if (textView != null) {
            if (i == 0) {
                textView.setText(context2.getString(R.string.beginner_guide_title_input_type_finger));
            } else if (i == 1) {
                textView.setText(context2.getString(R.string.beginner_guide_title_input_type_tap_reading));
            } else if (i == 2) {
                textView.setText(context2.getString(R.string.beginner_guide_title_movable_pen_box));
            } else if (i == 3) {
                textView.setText(context2.getString(R.string.beginner_guide_title_undo_redo));
            } else if (i == 4) {
                textView.setText(context2.getString(R.string.beginner_guide_title_fullscreen));
            }
        }
        TextView textView2 = (TextView) contentView.findViewById(R.id.tv_content);
        if (textView2 != null) {
            if (i == 0) {
                textView2.setText(context2.getString(R.string.beginner_guide_content_input_type_finger));
            } else if (i == 1) {
                textView2.setText(context2.getString(R.string.beginner_guide_content_input_type_tap_reading));
            } else if (i == 2) {
                textView2.setText(context2.getString(R.string.beginner_guide_content_movable_pen_box));
            } else if (i == 3) {
                textView2.setText(context2.getString(R.string.beginner_guide_content_undo_redo));
            } else if (i == 4) {
                textView2.setText(context2.getString(R.string.beginner_guide_content_fullscreen));
            }
        }
        Context context3 = anchor.getContext();
        OooOOO0.OooO0o(context3, "getContext(...)");
        Activity activityOooO00o = C28036OooO0O0.OooO00o(context3);
        Rect rect = new Rect();
        if (activityOooO00o == null) {
            contentView.getWindowVisibleDisplayFrame(rect);
        } else {
            activityOooO00o.getWindow().getDecorView().getGlobalVisibleRect(rect);
        }
        Rect rect2 = new Rect();
        anchor.getGlobalVisibleRect(rect2);
        ViewGroup.LayoutParams layoutParams = this.f105983OooO0Oo.getLayoutParams();
        OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = marginLayoutParams.getMarginStart();
        int i3 = marginLayoutParams.topMargin;
        int iOooO0o = o000000O.OooO0o(18);
        if (Gravity.isVertical(i2)) {
            if (i2 == 48) {
                this.f105985OooO0o0.setVisibility(8);
                this.f105984OooO0o.setVisibility(0);
                this.f105986OooO0oO.setVisibility(8);
                this.f105987OooO0oo.setVisibility(8);
                contentView.measure(OooO0O0(this.f105980OooO00o.getWidth()), OooO0O0(this.f105980OooO00o.getHeight()));
                measuredWidth = rect2.centerX() - (contentView.getMeasuredWidth() / 2);
                int i4 = -marginStart;
                if (measuredWidth < i4) {
                    measuredWidth = i4;
                }
                int iWidth = rect.width() - (contentView.getMeasuredWidth() + marginStart);
                if (measuredWidth > iWidth) {
                    measuredWidth = iWidth;
                }
                iCenterY = rect2.top - contentView.getMeasuredHeight();
                this.f105984OooO0o.setTranslationX((rect2.centerX() - measuredWidth) - (iOooO0o / 2.0f));
            } else {
                if (i2 != 80) {
                    throw new IllegalArgumentException("Invalid gravity: " + i2);
                }
                this.f105985OooO0o0.setVisibility(0);
                this.f105984OooO0o.setVisibility(8);
                this.f105986OooO0oO.setVisibility(8);
                this.f105987OooO0oo.setVisibility(8);
                contentView.measure(OooO0O0(this.f105980OooO00o.getWidth()), OooO0O0(this.f105980OooO00o.getHeight()));
                measuredWidth = rect2.centerX() - (contentView.getMeasuredWidth() / 2);
                int i5 = -marginStart;
                if (measuredWidth < i5) {
                    measuredWidth = i5;
                }
                int iWidth2 = (rect.width() - contentView.getMeasuredWidth()) - marginStart;
                if (measuredWidth > iWidth2) {
                    measuredWidth = iWidth2;
                }
                iCenterY = rect2.bottom;
                this.f105985OooO0o0.setTranslationX((rect2.centerX() - measuredWidth) - (iOooO0o / 2.0f));
            }
        } else if (i2 == 3) {
            this.f105985OooO0o0.setVisibility(8);
            this.f105984OooO0o.setVisibility(8);
            this.f105986OooO0oO.setVisibility(8);
            this.f105987OooO0oo.setVisibility(0);
            contentView.measure(OooO0O0(this.f105980OooO00o.getWidth()), OooO0O0(this.f105980OooO00o.getHeight()));
            measuredWidth = rect2.left - contentView.getMeasuredWidth();
            iCenterY = rect2.centerY() - (contentView.getMeasuredHeight() / 2);
            int i6 = -i3;
            if (iCenterY < i6) {
                iCenterY = i6;
            }
            int iHeight = rect.height() - (contentView.getMeasuredHeight() + i3);
            if (iCenterY > iHeight) {
                iCenterY = iHeight;
            }
            this.f105987OooO0oo.setTranslationY((rect2.centerY() - iCenterY) - (iOooO0o / 2.0f));
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException("Invalid gravity: " + i2);
            }
            this.f105985OooO0o0.setVisibility(8);
            this.f105984OooO0o.setVisibility(8);
            this.f105986OooO0oO.setVisibility(0);
            this.f105987OooO0oo.setVisibility(8);
            contentView.measure(OooO0O0(this.f105980OooO00o.getWidth()), OooO0O0(this.f105980OooO00o.getHeight()));
            measuredWidth = rect2.right;
            iCenterY = rect2.centerY() - (contentView.getMeasuredHeight() / 2);
            int i7 = -i3;
            if (iCenterY < i7) {
                iCenterY = i7;
            }
            int iHeight2 = rect.height() - (contentView.getMeasuredHeight() + i3);
            if (iCenterY > iHeight2) {
                iCenterY = iHeight2;
            }
            this.f105986OooO0oO.setTranslationY((rect2.centerY() - iCenterY) - (iOooO0o / 2.0f));
        }
        if (activityOooO00o != null) {
            try {
                if (!activityOooO00o.isDestroyed()) {
                    if (activityOooO00o == null || !activityOooO00o.isFinishing()) {
                        this.f105980OooO00o.showAtLocation(anchor, 0, measuredWidth, iCenterY);
                        return true;
                    }
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BeginnerGuidePopupWindow");
                c20358OooO00o.OooO0Oo(e, "Failed to show popup window", new Object[0]);
                return false;
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("BeginnerGuidePopupWindow");
        c20358OooO00o2.OooO0OO("Activity is destroyed or finishing", new Object[0]);
        return false;
    }
}
