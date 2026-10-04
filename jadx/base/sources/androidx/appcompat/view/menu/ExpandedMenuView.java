package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.widget.C21565OoooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements OooO.OooO0O0, InterfaceC21512OooOOOo, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final int[] f62540OooOo = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO f62541OooOo0o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, f62540OooOo, R.attr.listViewStyle, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c21565OoooOO0OooO0o.OooO0O0(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c21565OoooOO0OooO0o.OooO0O0(1));
        }
        c21565OoooOO0OooO0o.OooO0oO();
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO0O0
    public final boolean OooO0OO(OooOO0O oooOO0O) {
        return this.f62541OooOo0o.performItemAction(oooOO0O, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21512OooOOOo
    public final void initialize(OooO oooO) {
        this.f62541OooOo0o = oooO;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OooO0OO((OooOO0O) getAdapter().getItem(i));
    }
}
