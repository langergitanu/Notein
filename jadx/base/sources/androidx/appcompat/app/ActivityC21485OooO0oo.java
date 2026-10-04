package androidx.appcompat.app;

import OooO0o0.InterfaceC20429OooO0O0;
import OooOO0o.AbstractC20443OooO00o;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.appcompat.widget.C21571Ooooo00;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.LocaleListCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import o000ooo0.OooO0OO;

/* JADX INFO: renamed from: androidx.appcompat.app.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC21485OooO0oo extends ActivityC21897OooOo0 implements OooO, TaskStackBuilder.SupportParentable {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC21486OooOO0o mDelegate;
    private Resources mResources;

    /* JADX INFO: renamed from: androidx.appcompat.app.OooO0oo$OooO00o */
    public class OooO00o implements OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // o000ooo0.OooO0OO.OooO0O0
        public final Bundle OooO00o() {
            Bundle bundle = new Bundle();
            ActivityC21485OooO0oo.this.getDelegate().getClass();
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooO0oo$OooO0O0 */
    public class OooO0O0 implements InterfaceC20429OooO0O0 {
        public OooO0O0() {
        }

        @Override // OooO0o0.InterfaceC20429OooO0O0
        public final void OooO00o(OooO0Oo.OooOO0O oooOO0O) {
            ActivityC21485OooO0oo activityC21485OooO0oo = ActivityC21485OooO0oo.this;
            AbstractC21486OooOO0o delegate = activityC21485OooO0oo.getDelegate();
            delegate.OooOOO0();
            activityC21485OooO0oo.getSavedStateRegistry().OooO00o(ActivityC21485OooO0oo.DELEGATE_TAG);
            delegate.OooOOo0();
        }
    }

    public ActivityC21485OooO0oo() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().OooO0OO(DELEGATE_TAG, new OooO00o());
        addOnContextAvailableListener(new OooO0O0());
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().OooO00o(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().OooO0Oo(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.OooO00o supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.OooO00o()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.OooO00o supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.OooOO0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().OooO0o0(i);
    }

    public AbstractC21486OooOO0o getDelegate() {
        if (this.mDelegate == null) {
            AbstractC21486OooOO0o.OooO0OO oooO0OO = AbstractC21486OooOO0o.f62445OooOo0o;
            this.mDelegate = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.OooO0O0 getDrawerToggleDelegate() {
        return getDelegate().OooO0oo();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().OooOO0O();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = C21571Ooooo00.f63117OooO00o;
        }
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.OooO00o getSupportActionBar() {
        return getDelegate().OooOO0o();
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().OooOOO();
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().OooOOOo(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack(this);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().OooOOo();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(LocaleListCompat localeListCompat) {
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        androidx.appcompat.app.OooO00o supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.OooO0Oo() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().OooOOoo();
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().OooOo00();
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().OooOo0();
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().OooOo0O();
    }

    @Override // androidx.appcompat.app.OooO
    public void onSupportActionModeFinished(AbstractC20443OooO00o abstractC20443OooO00o) {
    }

    @Override // androidx.appcompat.app.OooO
    public void onSupportActionModeStarted(AbstractC20443OooO00o abstractC20443OooO00o) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this);
        onCreateSupportNavigateUpTaskStack(taskStackBuilderCreate);
        onPrepareSupportNavigateUpTaskStack(taskStackBuilderCreate);
        taskStackBuilderCreate.startActivities();
        try {
            ActivityCompat.finishAffinity(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().OooOooo(charSequence);
    }

    @Override // androidx.appcompat.app.OooO
    public AbstractC20443OooO00o onWindowStartingSupportActionMode(AbstractC20443OooO00o.InterfaceC18960OooO00o interfaceC18960OooO00o) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.OooO00o supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.OooOO0O()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().OooOoO0(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().OooOoo(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().OooOooO(i);
    }

    public AbstractC20443OooO00o startSupportActionMode(AbstractC20443OooO00o.InterfaceC18960OooO00o interfaceC18960OooO00o) {
        return getDelegate().Oooo000(interfaceC18960OooO00o);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0
    public void supportInvalidateOptionsMenu() {
        getDelegate().OooOOO();
    }

    public void supportNavigateUpTo(Intent intent) {
        NavUtils.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().OooOo(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }

    public ActivityC21485OooO0oo(int i) {
        super(i);
        initDelegate();
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().OooOoO(view);
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().OooOoOO(view, layoutParams);
    }
}
