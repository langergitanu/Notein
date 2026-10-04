package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21509OooO0oo extends BaseAdapter {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f62630OooOo = -1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO f62631OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f62632OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f62633OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final LayoutInflater f62634OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f62635OooOoo0;

    public C21509OooO0oo(OooO oooO, LayoutInflater layoutInflater, boolean z, int i) {
        this.f62632OooOoO = z;
        this.f62634OooOoOO = layoutInflater;
        this.f62631OooOo0o = oooO;
        this.f62635OooOoo0 = i;
        OooO0O0();
    }

    public final void OooO0O0() {
        OooO oooO = this.f62631OooOo0o;
        OooOO0O expandedItem = oooO.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<OooOO0O> nonActionItems = oooO.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.f62630OooOo = i;
                    return;
                }
            }
        }
        this.f62630OooOo = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final OooOO0O getItem(int i) {
        OooO oooO = this.f62631OooOo0o;
        ArrayList<OooOO0O> nonActionItems = this.f62632OooOoO ? oooO.getNonActionItems() : oooO.getVisibleItems();
        int i2 = this.f62630OooOo;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        OooO oooO = this.f62631OooOo0o;
        return this.f62630OooOo < 0 ? (this.f62632OooOoO ? oooO.getNonActionItems() : oooO.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f62634OooOoOO.inflate(this.f62635OooOoo0, viewGroup, false);
        }
        int i2 = getItem(i).f62641OooO0O0;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f62631OooOo0o.isGroupDividerEnabled() && i2 != (i3 >= 0 ? getItem(i3).f62641OooO0O0 : i2));
        InterfaceC21512OooOOOo.OooO00o oooO00o = (InterfaceC21512OooOOOo.OooO00o) view;
        if (this.f62633OooOoO0) {
            listMenuItemView.setForceShowIcon(true);
        }
        oooO00o.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO0O0();
        super.notifyDataSetChanged();
    }
}
