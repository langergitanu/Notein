package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class OooO implements SupportMenu {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private OooO00o mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private OooOO0O mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<OooOO0O> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<OooOOOO>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<OooOO0O> mItems = new ArrayList<>();
    private ArrayList<OooOO0O> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<OooOO0O> mActionItems = new ArrayList<>();
    private ArrayList<OooOO0O> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public interface OooO00o {
        boolean onMenuItemSelected(OooO oooO, MenuItem menuItem);

        void onMenuModeChange(OooO oooO);
    }

    public interface OooO0O0 {
        boolean OooO0OO(OooOO0O oooOO0O);
    }

    public OooO(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private OooOO0O createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new OooOO0O(this, i, i2, i3, i4, charSequence, i5);
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO = weakReference.get();
            if (oooOOOO == null) {
                this.mPresenters.remove(weakReference);
            } else {
                oooOOOO.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO = weakReference.get();
            if (oooOOOO == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = oooOOOO.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    oooOOOO.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO = weakReference.get();
            if (oooOOOO == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = oooOOOO.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = oooOOOO.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(OooOo00 oooOo00, OooOOOO oooOOOO) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = oooOOOO != null ? oooOOOO.onSubMenuSelected(oooOo00) : false;
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO2 = weakReference.get();
            if (oooOOOO2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = oooOOOO2.onSubMenuSelected(oooOo00);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<OooOO0O> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f62643OooO0Oo <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = ContextCompat.getDrawable(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setShortcutsVisibleInner(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mResources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z2;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        OooOO0O oooOO0OCreateNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            oooOO0OCreateNewMenuItem.f62668OooOooO = contextMenuInfo;
        }
        ArrayList<OooOO0O> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), oooOO0OCreateNewMenuItem);
        onItemsChanged(true);
        return oooOO0OCreateNewMenuItem;
    }

    public void addMenuPresenter(OooOOOO oooOOOO) {
        addMenuPresenter(oooOOOO, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        OooO00o oooO00o = this.mCallback;
        if (oooO00o != null) {
            oooO00o.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        OooOO0O oooOO0O = this.mExpandedItem;
        if (oooOO0O != null) {
            collapseItemActionView(oooOO0O);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO = weakReference.get();
            if (oooOOOO == null) {
                this.mPresenters.remove(weakReference);
            } else {
                oooOOOO.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(OooOO0O oooOO0O) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == oooOO0O) {
            stopDispatchingItemsChanged();
            for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
                OooOOOO oooOOOO = weakReference.get();
                if (oooOOOO != null) {
                    zCollapseItemActionView = oooOOOO.collapseItemActionView(this, oooOO0O);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(OooO oooO, MenuItem menuItem) {
        OooO00o oooO00o = this.mCallback;
        return oooO00o != null && oooO00o.onMenuItemSelected(oooO, menuItem);
    }

    public boolean expandItemActionView(OooOO0O oooOO0O) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO = weakReference.get();
            if (oooOOOO != null) {
                zExpandItemActionView = oooOOOO.expandItemActionView(this, oooOO0O);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = oooOO0O;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = this.mItems.get(i2);
            if (oooOO0O.f62640OooO00o == i) {
                return oooOO0O;
            }
            if (oooOO0O.hasSubMenu() && (menuItemFindItem = oooOO0O.f62653OooOOOO.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).f62640OooO00o == i) {
                return i2;
            }
        }
        return -1;
    }

    public OooOO0O findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        ArrayList<OooOO0O> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = arrayList.get(i2);
            char c = zIsQwertyMode ? oooOO0O.f62648OooOO0 : oooOO0O.f62647OooO0oo;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && c == '\b' && i == 67))) {
                return oooOO0O;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<OooOO0O> list, int i, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOO0O oooOO0O = this.mItems.get(i2);
                if (oooOO0O.hasSubMenu()) {
                    oooOO0O.f62653OooOOOO.findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char c = zIsQwertyMode ? oooOO0O.f62648OooOO0 : oooOO0O.f62647OooO0oo;
                if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((zIsQwertyMode ? oooOO0O.f62649OooOO0O : oooOO0O.f62639OooO) & SupportMenu.SUPPORTED_MODIFIERS_MASK) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zIsQwertyMode && c == '\b' && i == 67)) && oooOO0O.isEnabled()) {
                        list.add(oooOO0O);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<OooOO0O> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
                OooOOOO oooOOOO = weakReference.get();
                if (oooOOOO == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= oooOOOO.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    OooOO0O oooOO0O = visibleItems.get(i);
                    if ((oooOO0O.f62658OooOo & 32) == 32) {
                        this.mActionItems.add(oooOO0O);
                    } else {
                        this.mNonActionItems.add(oooOO0O);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<OooOO0O> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public OooOO0O getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    public ArrayList<OooOO0O> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public OooO getRootMenu() {
        return this;
    }

    public ArrayList<OooOO0O> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            OooOO0O oooOO0O = this.mItems.get(i);
            if (oooOO0O.isVisible()) {
                this.mVisibleItems.add(oooOO0O);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(OooOO0O oooOO0O) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(OooOO0O oooOO0O) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        OooOO0O oooOO0OFindItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean zPerformItemAction = oooOO0OFindItemWithShortcutForKey != null ? performItemAction(oooOO0OFindItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iFindGroupIndex = findGroupIndex(i);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(iFindGroupIndex).f62641OooO0O0 != i) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    public void removeMenuPresenter(OooOOOO oooOOOO) {
        for (WeakReference<OooOOOO> weakReference : this.mPresenters) {
            OooOOOO oooOOOO2 = weakReference.get();
            if (oooOOOO2 == null || oooOOOO2 == oooOOOO) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((OooOo00) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((OooOo00) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(OooO00o oooO00o) {
        this.mCallback = oooO00o;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public OooO setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            OooOO0O oooOO0O = this.mItems.get(i);
            if (oooOO0O.f62641OooO0O0 == groupId && (oooOO0O.f62658OooOo & 4) != 0 && oooOO0O.isCheckable()) {
                boolean z = oooOO0O == menuItem;
                int i2 = oooOO0O.f62658OooOo;
                int i3 = (z ? 2 : 0) | (i2 & (-3));
                oooOO0O.f62658OooOo = i3;
                if (i2 != i3) {
                    oooOO0O.f62651OooOOO.onItemsChanged(false);
                }
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = this.mItems.get(i2);
            if (oooOO0O.f62641OooO0O0 == i) {
                oooOO0O.OooO0Oo(z2);
                oooOO0O.setCheckable(z);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = this.mItems.get(i2);
            if (oooOO0O.f62641OooO0O0 == i) {
                oooOO0O.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = this.mItems.get(i2);
            if (oooOO0O.f62641OooO0O0 == i) {
                int i3 = oooOO0O.f62658OooOo;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                oooOO0O.f62658OooOo = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    public OooO setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public OooO setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public OooO setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        setShortcutsVisibleInner(z);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    public void addMenuPresenter(OooOOOO oooOOOO, Context context) {
        this.mPresenters.add(new WeakReference<>(oooOOOO));
        oooOOOO.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).f62641OooO0O0 == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performItemAction(MenuItem menuItem, OooOOOO oooOOOO, int i) {
        boolean zDispatchSubMenuSelected;
        OooOO0O oooOO0O = (OooOO0O) menuItem;
        if (oooOO0O == null || !oooOO0O.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oooOO0O.f62654OooOOOo;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oooOO0O)) {
            OooO oooO = oooOO0O.f62651OooOOO;
            if (!oooO.dispatchMenuItemSelected(oooO, oooOO0O)) {
                if (oooOO0O.f62646OooO0oO != null) {
                    try {
                        oooO.getContext().startActivity(oooOO0O.f62646OooO0oO);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        ActionProvider actionProvider = oooOO0O.f62665OooOoOO;
                        if (actionProvider == null) {
                        }
                        ActionProvider actionProvider2 = oooOO0O.f62665OooOoOO;
                        if (actionProvider2 == null) {
                        }
                        if (!oooOO0O.OooO0OO()) {
                        }
                        return zDispatchSubMenuSelected;
                    }
                } else {
                    ActionProvider actionProvider3 = oooOO0O.f62665OooOoOO;
                    zDispatchSubMenuSelected = actionProvider3 == null && actionProvider3.onPerformDefaultAction();
                }
            }
        }
        ActionProvider actionProvider22 = oooOO0O.f62665OooOoOO;
        boolean z = actionProvider22 == null && actionProvider22.hasSubMenu();
        if (!oooOO0O.OooO0OO()) {
            zDispatchSubMenuSelected |= oooOO0O.expandActionView();
            if (zDispatchSubMenuSelected) {
                close(true);
            }
        } else if (oooOO0O.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                close(false);
            }
            if (!oooOO0O.hasSubMenu()) {
                OooOo00 oooOo00 = new OooOo00(getContext(), this, oooOO0O);
                oooOO0O.f62653OooOOOO = oooOo00;
                oooOo00.setHeaderTitle(oooOO0O.f62645OooO0o0);
            }
            OooOo00 oooOo002 = oooOO0O.f62653OooOOOO;
            if (z) {
                actionProvider22.onPrepareSubMenu(oooOo002);
            }
            zDispatchSubMenuSelected |= dispatchSubMenuSelected(oooOo002, oooOOOO);
            if (!zDispatchSubMenuSelected) {
                close(true);
            }
        } else if ((i & 1) == 0) {
            close(true);
        }
        return zDispatchSubMenuSelected;
    }

    public OooO setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    public OooO setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        OooOO0O oooOO0O = (OooOO0O) addInternal(i, i2, i3, charSequence);
        OooOo00 oooOo00 = new OooOo00(this.mContext, this, oooOO0O);
        oooOO0O.f62653OooOOOO = oooOo00;
        oooOo00.setHeaderTitle(oooOO0O.f62645OooO0o0);
        return oooOo00;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
