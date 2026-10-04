package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface OooOOOO {

    public interface OooO00o {
        boolean OooO00o(OooO oooO);

        void onCloseMenu(OooO oooO, boolean z);
    }

    boolean collapseItemActionView(OooO oooO, OooOO0O oooOO0O);

    boolean expandItemActionView(OooO oooO, OooOO0O oooOO0O);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, OooO oooO);

    void onCloseMenu(OooO oooO, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(OooOo00 oooOo00);

    void setCallback(OooO00o oooO00o);

    void updateMenuView(boolean z);
}
