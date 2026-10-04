package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 implements InterfaceC21513OooOOo, OooOOOO, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Rect f62692OooOo0o;

    public static int OooO0OO(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void OooO(PopupWindow.OnDismissListener onDismissListener);

    public abstract void OooO0O0(OooO oooO);

    public abstract void OooO0Oo(View view);

    public abstract void OooO0o0(boolean z);

    public abstract void OooO0oO(int i);

    public abstract void OooO0oo(int i);

    public abstract void OooOO0(boolean z);

    public abstract void OooOO0O(int i);

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean collapseItemActionView(OooO oooO, OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean expandItemActionView(OooO oooO, OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void initForMenu(Context context, OooO oooO) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C21509OooO0oo) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C21509OooO0oo) listAdapter).f62631OooOo0o.performItemAction((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC21506OooO0o0) ? 0 : 4);
    }
}
