package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.view.menu.OooOo00;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationBarPresenter implements OooOOOO {

    /* JADX INFO: renamed from: id */
    private int f51387id;
    private OooO menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        public SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public boolean collapseItemActionView(OooO oooO, OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public boolean expandItemActionView(OooO oooO, OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public int getId() {
        return this.f51387id;
    }

    public InterfaceC21512OooOOOo getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public void initForMenu(Context context, OooO oooO) {
        this.menu = oooO;
        this.menuView.initialize(oooO);
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public void onCloseMenu(OooO oooO, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public boolean onSubMenuSelected(OooOo00 oooOo00) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public void setCallback(OooOOOO.OooO00o oooO00o) {
    }

    public void setId(int i) {
        this.f51387id = i;
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public void updateMenuView(boolean z) {
        if (this.updateSuspended) {
            return;
        }
        if (z) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }
}
