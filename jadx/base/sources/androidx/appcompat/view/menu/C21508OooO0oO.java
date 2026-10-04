package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.view.menu.OooOOOO;
import com.orion.notein.global.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21508OooO0oO implements OooOOOO, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public LayoutInflater f62622OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Context f62623OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ExpandedMenuView f62624OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO f62625OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOOOO.OooO00o f62626OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO00o f62627OooOoo0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0oO$OooO00o */
    public class OooO00o extends BaseAdapter {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f62629OooOo0o = -1;

        public OooO00o() {
            OooO0O0();
        }

        public final void OooO0O0() {
            C21508OooO0oO c21508OooO0oO = C21508OooO0oO.this;
            OooOO0O expandedItem = c21508OooO0oO.f62625OooOoO0.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<OooOO0O> nonActionItems = c21508OooO0oO.f62625OooOoO0.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.f62629OooOo0o = i;
                        return;
                    }
                }
            }
            this.f62629OooOo0o = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooOO0O getItem(int i) {
            C21508OooO0oO c21508OooO0oO = C21508OooO0oO.this;
            ArrayList<OooOO0O> nonActionItems = c21508OooO0oO.f62625OooOoO0.getNonActionItems();
            c21508OooO0oO.getClass();
            int i2 = this.f62629OooOo0o;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return nonActionItems.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            C21508OooO0oO c21508OooO0oO = C21508OooO0oO.this;
            int size = c21508OooO0oO.f62625OooOoO0.getNonActionItems().size();
            c21508OooO0oO.getClass();
            return this.f62629OooOo0o < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C21508OooO0oO c21508OooO0oO = C21508OooO0oO.this;
                LayoutInflater layoutInflater = c21508OooO0oO.f62622OooOo;
                c21508OooO0oO.getClass();
                view = layoutInflater.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((InterfaceC21512OooOOOo.OooO00o) view).initialize(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            OooO0O0();
            super.notifyDataSetChanged();
        }
    }

    public C21508OooO0oO(Context context) {
        this.f62623OooOo0o = context;
        this.f62622OooOo = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean collapseItemActionView(OooO oooO, OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean expandItemActionView(OooO oooO, OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void initForMenu(Context context, OooO oooO) {
        if (this.f62623OooOo0o != null) {
            this.f62623OooOo0o = context;
            if (this.f62622OooOo == null) {
                this.f62622OooOo = LayoutInflater.from(context);
            }
        }
        this.f62625OooOoO0 = oooO;
        OooO00o oooO00o = this.f62627OooOoo0;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onCloseMenu(OooO oooO, boolean z) {
        OooOOOO.OooO00o oooO00o = this.f62626OooOoOO;
        if (oooO00o != null) {
            oooO00o.onCloseMenu(oooO, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f62625OooOoO0.performItemAction(this.f62627OooOoo0.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f62624OooOoO.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final Parcelable onSaveInstanceState() {
        if (this.f62624OooOoO == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f62624OooOoO;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final boolean onSubMenuSelected(OooOo00 oooOo00) {
        if (!oooOo00.hasVisibleItems()) {
            return false;
        }
        OooOO0 oooOO02 = new OooOO0();
        oooOO02.f62637OooOo0o = oooOo00;
        DialogInterfaceC21484OooO0oO.OooO00o oooO00o = new DialogInterfaceC21484OooO0oO.OooO00o(oooOo00.getContext());
        C21508OooO0oO c21508OooO0oO = new C21508OooO0oO(oooO00o.getContext());
        oooOO02.f62638OooOoO0 = c21508OooO0oO;
        c21508OooO0oO.f62626OooOoOO = oooOO02;
        oooOo00.addMenuPresenter(c21508OooO0oO);
        C21508OooO0oO c21508OooO0oO2 = oooOO02.f62638OooOoO0;
        if (c21508OooO0oO2.f62627OooOoo0 == null) {
            c21508OooO0oO2.f62627OooOoo0 = c21508OooO0oO2.new OooO00o();
        }
        oooO00o.setAdapter(c21508OooO0oO2.f62627OooOoo0, oooOO02);
        View headerView = oooOo00.getHeaderView();
        if (headerView != null) {
            oooO00o.setCustomTitle(headerView);
        } else {
            oooO00o.setIcon(oooOo00.getHeaderIcon()).setTitle(oooOo00.getHeaderTitle());
        }
        oooO00o.setOnKeyListener(oooOO02);
        DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = oooO00o.create();
        oooOO02.f62636OooOo = dialogInterfaceC21484OooO0oOCreate;
        dialogInterfaceC21484OooO0oOCreate.setOnDismissListener(oooOO02);
        WindowManager.LayoutParams attributes = oooOO02.f62636OooOo.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oooOO02.f62636OooOo.show();
        OooOOOO.OooO00o oooO00o2 = this.f62626OooOoOO;
        if (oooO00o2 == null) {
            return true;
        }
        oooO00o2.OooO00o(oooOo00);
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void setCallback(OooOOOO.OooO00o oooO00o) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void updateMenuView(boolean z) {
        OooO00o oooO00o = this.f62627OooOoo0;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }
}
