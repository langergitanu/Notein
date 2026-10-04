package androidx.fragment.app;

import OooO0Oo.C20418OooOoo;
import OooO0o.AbstractC20425OooO0o0;
import OooO0o0.InterfaceC20429OooO0O0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.ActivityCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21990OooOooo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o000o00O.AbstractC24558OooO00o;
import o000ooo0.InterfaceC24753OooO0o0;
import o000ooo0.OooO0OO;

/* JADX INFO: renamed from: androidx.fragment.app.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC21897OooOo0 extends OooO0Oo.OooOO0O implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C21990OooOooo mFragmentLifecycleRegistry;
    final OooOo mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.OooOo0$OooO00o */
    public class OooO00o extends AbstractC21900OooOoO<ActivityC21897OooOo0> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, InterfaceC22023o00ooo, OooO0Oo.Oooo000, OooO0o.OooO, InterfaceC24753OooO0o0, InterfaceC21913Oooo0o0, MenuHost {
        public OooO00o() {
            super(ActivityC21897OooOo0.this);
        }

        @Override // androidx.fragment.app.InterfaceC21913Oooo0o0
        public final void OooO00o(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC21897OooOo0.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO, androidx.fragment.app.AbstractC21899OooOo0o
        public final View OooO0O0(int i) {
            return ActivityC21897OooOo0.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO, androidx.fragment.app.AbstractC21899OooOo0o
        public final boolean OooO0OO() {
            Window window = ActivityC21897OooOo0.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO
        public final void OooO0Oo(PrintWriter printWriter, String[] strArr) {
            ActivityC21897OooOo0.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO
        public final LayoutInflater OooO0o() {
            ActivityC21897OooOo0 activityC21897OooOo0 = ActivityC21897OooOo0.this;
            return activityC21897OooOo0.getLayoutInflater().cloneInContext(activityC21897OooOo0);
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO
        public final ActivityC21897OooOo0 OooO0o0() {
            return ActivityC21897OooOo0.this;
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO
        public final boolean OooO0oO(String str) {
            return ActivityCompat.shouldShowRequestPermissionRationale(ActivityC21897OooOo0.this, str);
        }

        @Override // androidx.fragment.app.AbstractC21900OooOoO
        public final void OooO0oo() {
            invalidateMenu();
        }

        @Override // androidx.core.view.MenuHost
        public final void addMenuProvider(MenuProvider menuProvider) {
            ActivityC21897OooOo0.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void addOnConfigurationChangedListener(Consumer<Configuration> consumer) {
            ActivityC21897OooOo0.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
            ActivityC21897OooOo0.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
            ActivityC21897OooOo0.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void addOnTrimMemoryListener(Consumer<Integer> consumer) {
            ActivityC21897OooOo0.this.addOnTrimMemoryListener(consumer);
        }

        @Override // OooO0o.OooO
        public final AbstractC20425OooO0o0 getActivityResultRegistry() {
            return ActivityC21897OooOo0.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC21987OooOoo
        public final AbstractC21979OooOOo0 getLifecycle() {
            return ActivityC21897OooOo0.this.mFragmentLifecycleRegistry;
        }

        @Override // OooO0Oo.Oooo000
        public final C20418OooOoo getOnBackPressedDispatcher() {
            return ActivityC21897OooOo0.this.getOnBackPressedDispatcher();
        }

        @Override // o000ooo0.InterfaceC24753OooO0o0
        public final o000ooo0.OooO0OO getSavedStateRegistry() {
            return ActivityC21897OooOo0.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC22023o00ooo
        public final C22021o00o0O getViewModelStore() {
            return ActivityC21897OooOo0.this.getViewModelStore();
        }

        @Override // androidx.core.view.MenuHost
        public final void invalidateMenu() {
            ActivityC21897OooOo0.this.invalidateMenu();
        }

        @Override // androidx.core.view.MenuHost
        public final void removeMenuProvider(MenuProvider menuProvider) {
            ActivityC21897OooOo0.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void removeOnConfigurationChangedListener(Consumer<Configuration> consumer) {
            ActivityC21897OooOo0.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> consumer) {
            ActivityC21897OooOo0.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer) {
            ActivityC21897OooOo0.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void removeOnTrimMemoryListener(Consumer<Integer> consumer) {
            ActivityC21897OooOo0.this.removeOnTrimMemoryListener(consumer);
        }

        @Override // androidx.core.view.MenuHost
        public final void addMenuProvider(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo) {
            ActivityC21897OooOo0.this.addMenuProvider(menuProvider, interfaceC21987OooOoo);
        }

        @Override // androidx.core.view.MenuHost
        public final void addMenuProvider(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
            ActivityC21897OooOo0.this.addMenuProvider(menuProvider, interfaceC21987OooOoo, oooO0O0);
        }
    }

    public ActivityC21897OooOo0() {
        this.mFragments = new OooOo((AbstractC21900OooOoO) Preconditions.checkNotNull(new OooO00o(), "callbacks == null"));
        this.mFragmentLifecycleRegistry = new C21990OooOooo(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().OooO0OO(LIFECYCLE_TAG, new OooO0OO.OooO0O0() { // from class: androidx.fragment.app.OooOOo0
            @Override // o000ooo0.OooO0OO.OooO0O0
            public final Bundle OooO00o() {
                return this.f64978OooO00o.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new Consumer() { // from class: androidx.fragment.app.OooOOo
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f64977OooOo0o.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new Consumer() { // from class: androidx.fragment.app.OooOOoo
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f64979OooOo0o.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC20429OooO0O0() { // from class: androidx.fragment.app.OooOo00
            @Override // OooO0o0.InterfaceC20429OooO0O0
            public final void OooO00o(OooO0Oo.OooOO0O oooOO0O) {
                this.f64982OooO00o.lambda$init$3(oooOO0O);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mFragments.f64980OooO00o;
        abstractC21900OooOoO.f64992OooOoO.OooO0O0(abstractC21900OooOoO, abstractC21900OooOoO, null);
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), oooO0O0);
                }
                o000oOoO o000oooo2 = fragment.mViewLifecycleOwner;
                AbstractC21979OooOOo0.OooO0O0 oooO0O02 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                if (o000oooo2 != null) {
                    o000oooo2.OooO0O0();
                    if (o000oooo2.f65112OooOoOO.f65563OooO0Oo.OooO00o(oooO0O02)) {
                        fragment.mViewLifecycleOwner.f65112OooOoOO.OooO0oo(oooO0O0);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f65563OooO0Oo.OooO00o(oooO0O02)) {
                    fragment.mLifecycleRegistry.OooO0oo(oooO0O0);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f64980OooO00o.f64992OooOoO.f64802OooO0o.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC24558OooO00o.OooO00o(this).OooO0O0(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f64980OooO00o.f64992OooOoO.OooOo0O(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f64980OooO00o.f64992OooOoO;
    }

    @Deprecated
    public AbstractC24558OooO00o getSupportLoaderManager() {
        return AbstractC24558OooO00o.OooO00o(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC21979OooOOo0.OooO0O0.f65540OooOoO0)) {
        }
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.OooO00o();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
        C21910Oooo0O0 c21910Oooo0O0 = this.mFragments.f64980OooO00o.f64992OooOoO;
        c21910Oooo0O0.f64833Oooo0O0 = false;
        c21910Oooo0O0.f64834Oooo0OO = false;
        c21910Oooo0O0.f64840OoooO00.f65038OooO = false;
        c21910Oooo0O0.OooOo0(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f64980OooO00o.f64992OooOoO.OooOO0o();
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f64980OooO00o.f64992OooOoO.OooOO0(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f64980OooO00o.f64992OooOoO.OooOo0(5);
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.OooO00o();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.OooO00o();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f64980OooO00o.f64992OooOoO.OooOoO(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_RESUME);
        C21910Oooo0O0 c21910Oooo0O0 = this.mFragments.f64980OooO00o.f64992OooOoO;
        c21910Oooo0O0.f64833Oooo0O0 = false;
        c21910Oooo0O0.f64834Oooo0OO = false;
        c21910Oooo0O0.f64840OoooO00.f65038OooO = false;
        c21910Oooo0O0.OooOo0(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.OooO00o();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C21910Oooo0O0 c21910Oooo0O0 = this.mFragments.f64980OooO00o.f64992OooOoO;
            c21910Oooo0O0.f64833Oooo0O0 = false;
            c21910Oooo0O0.f64834Oooo0OO = false;
            c21910Oooo0O0.f64840OoooO00.f65038OooO = false;
            c21910Oooo0O0.OooOo0(4);
        }
        this.mFragments.f64980OooO00o.f64992OooOoO.OooOoO(true);
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_START);
        C21910Oooo0O0 c21910Oooo0O02 = this.mFragments.f64980OooO00o.f64992OooOoO;
        c21910Oooo0O02.f64833Oooo0O0 = false;
        c21910Oooo0O02.f64834Oooo0OO = false;
        c21910Oooo0O02.f64840OoooO00.f65038OooO = false;
        c21910Oooo0O02.OooOo0(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.OooO00o();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C21910Oooo0O0 c21910Oooo0O0 = this.mFragments.f64980OooO00o.f64992OooOoO;
        c21910Oooo0O0.f64834Oooo0OO = true;
        c21910Oooo0O0.f64840OoooO00.f65038OooO = true;
        c21910Oooo0O0.OooOo0(4);
        this.mFragmentLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            ActivityCompat.startActivityForResult(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public ActivityC21897OooOo0(int i) {
        super(i);
        this.mFragments = new OooOo((AbstractC21900OooOoO) Preconditions.checkNotNull(new OooO00o(), "callbacks == null"));
        this.mFragmentLifecycleRegistry = new C21990OooOooo(this);
        this.mStopped = true;
        init();
    }
}
