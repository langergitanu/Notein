package com.orion.notein.p607ui.notelist;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.orion.notein.domain.models.Label;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f77104OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC19403OooO00o f77105OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f77106OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ItemData f77107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f77108OooO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PopupWindow f77109OooO0o0;

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19403OooO00o {
        void OooO00o(ItemData itemData);
    }

    public OooO00o(Context context, InterfaceC19403OooO00o interfaceC19403OooO00o) {
        this.f77104OooO00o = context;
        this.f77105OooO0O0 = interfaceC19403OooO00o;
    }

    public static int OooO0OO(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f77109OooO0o0;
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
        Object systemService = this.f77104OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_item_label_list, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        viewInflate.setOnClickListener(new ViewOnClickListenerC29034OooO00o(this, 3));
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(200), -2, false);
        this.f77109OooO0o0 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f77109OooO0o0;
        if (popupWindow2 != null) {
            popupWindow2.setElevation(10.0f);
        } else {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO0Oo(List<ItemLabelVO> list) {
        PopupWindow popupWindow = this.f77109OooO0o0;
        if (popupWindow == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        TextView textView = (TextView) popupWindow.getContentView().findViewById(R.id.item_label_list);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (ItemLabelVO itemLabelVO : list) {
            Label.Companion companion = Label.INSTANCE;
            Context context = textView.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            spannableStringBuilder.append((CharSequence) companion.formatSpannableString(context, itemLabelVO.f80080OooOo, itemLabelVO.f80083OooOoO0));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) " ");
        }
        textView.setText(spannableStringBuilder);
    }

    public final synchronized void OooO0o0(View anchor, List<ItemLabelVO> labelList, ItemData itemData, int i) {
        try {
            OooOOO0.OooO0oO(anchor, "anchor");
            OooOOO0.OooO0oO(labelList, "labelList");
            this.f77107OooO0Oo = itemData;
            if (this.f77108OooO0o.compareAndSet(false, true)) {
                OooO0O0();
            }
            OooO0Oo(labelList);
            this.f77106OooO0OO = anchor;
            Rect rect = new Rect();
            anchor.getGlobalVisibleRect(rect);
            if (anchor.getId() == R.id.btn_label) {
                PopupWindow popupWindow = this.f77109OooO0o0;
                if (popupWindow == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                View contentView = popupWindow.getContentView();
                PopupWindow popupWindow2 = this.f77109OooO0o0;
                if (popupWindow2 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                int iOooO0OO = OooO0OO(popupWindow2.getWidth());
                PopupWindow popupWindow3 = this.f77109OooO0o0;
                if (popupWindow3 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                contentView.measure(iOooO0OO, OooO0OO(popupWindow3.getHeight()));
                int i2 = -(contentView.getMeasuredWidth() + o000000O.OooO0o(10));
                Rect rect2 = new Rect();
                Object parent = anchor.getParent();
                OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).getGlobalVisibleRect(rect2);
                PopupWindow popupWindow4 = this.f77109OooO0o0;
                if (popupWindow4 != null) {
                    popupWindow4.showAtLocation(anchor, 0, rect2.left + i2, rect2.top);
                    return;
                } else {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
            }
            if (i == 0) {
                PopupWindow popupWindow5 = this.f77109OooO0o0;
                if (popupWindow5 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow5.showAtLocation(anchor, 0, rect.centerX() - o000000O.OooO0o(100), rect.bottom);
            } else if (i == 1) {
                PopupWindow popupWindow6 = this.f77109OooO0o0;
                if (popupWindow6 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow6.showAtLocation(anchor, 0, rect.left, rect.bottom);
            } else if (i == 2) {
                PopupWindow popupWindow7 = this.f77109OooO0o0;
                if (popupWindow7 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                View contentView2 = popupWindow7.getContentView();
                PopupWindow popupWindow8 = this.f77109OooO0o0;
                if (popupWindow8 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                int iOooO0OO2 = OooO0OO(popupWindow8.getWidth());
                PopupWindow popupWindow9 = this.f77109OooO0o0;
                if (popupWindow9 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                contentView2.measure(iOooO0OO2, OooO0OO(popupWindow9.getHeight()));
                int i3 = -(contentView2.getMeasuredWidth() + o000000O.OooO0o(10));
                Rect rect3 = new Rect();
                Object parent2 = anchor.getParent();
                OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.View");
                ((View) parent2).getGlobalVisibleRect(rect3);
                PopupWindow popupWindow10 = this.f77109OooO0o0;
                if (popupWindow10 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow10.showAtLocation(anchor, 0, rect3.left + i3, rect3.top);
            }
        } finally {
        }
    }
}
