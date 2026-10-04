package com.google.firebase.firestore.core;

import OooO0o.C20424OooO0Oo;
import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class ActivityScope {
    private static final String FRAGMENT_TAG = "FirestoreOnStopObserverFragment";
    private static final String SUPPORT_FRAGMENT_TAG = "FirestoreOnStopObserverSupportFragment";

    public static class CallbackList {
        private final List<Runnable> callbacks;

        private CallbackList() {
            this.callbacks = new ArrayList();
        }

        public synchronized void add(Runnable runnable) {
            this.callbacks.add(runnable);
        }

        public void run() {
            for (Runnable runnable : this.callbacks) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class StopListenerFragment extends Fragment {
        CallbackList callbacks = new CallbackList();

        @Override // android.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.callbacks) {
                callbackList = this.callbacks;
                this.callbacks = new CallbackList();
            }
            callbackList.run();
        }
    }

    public static class StopListenerSupportFragment extends androidx.fragment.app.Fragment {
        CallbackList callbacks = new CallbackList();

        @Override // androidx.fragment.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.callbacks) {
                callbackList = this.callbacks;
                this.callbacks = new CallbackList();
            }
            callbackList.run();
        }
    }

    public static ListenerRegistration bind(Activity activity, final ListenerRegistration listenerRegistration) {
        if (activity != null) {
            if (activity instanceof ActivityC21897OooOo0) {
                Objects.requireNonNull(listenerRegistration);
                onFragmentActivityStopCallOnce((ActivityC21897OooOo0) activity, new Runnable() { // from class: com.google.firebase.firestore.core.OooO00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        listenerRegistration.remove();
                    }
                });
                return listenerRegistration;
            }
            Objects.requireNonNull(listenerRegistration);
            onActivityStopCallOnce(activity, new Runnable() { // from class: com.google.firebase.firestore.core.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    listenerRegistration.remove();
                }
            });
        }
        return listenerRegistration;
    }

    private static <T> T castFragment(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Fragment with tag '", str, "' is a ");
            sbOooO0o0.append(obj.getClass().getName());
            sbOooO0o0.append(" but should be a ");
            sbOooO0o0.append(cls.getName());
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityStopCallOnce$0(Activity activity, Runnable runnable) {
        StopListenerFragment stopListenerFragment = (StopListenerFragment) castFragment(StopListenerFragment.class, activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG), FRAGMENT_TAG);
        if (stopListenerFragment == null || stopListenerFragment.isRemoving()) {
            stopListenerFragment = new StopListenerFragment();
            activity.getFragmentManager().beginTransaction().add(stopListenerFragment, FRAGMENT_TAG).commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        stopListenerFragment.callbacks.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.fragment.app.OooO00o, int] */
    public static void lambda$onFragmentActivityStopCallOnce$1(ActivityC21897OooOo0 activityC21897OooOo0, Runnable runnable) {
        StopListenerSupportFragment stopListenerSupportFragment = (StopListenerSupportFragment) castFragment(StopListenerSupportFragment.class, activityC21897OooOo0.getSupportFragmentManager().OooOooo(SUPPORT_FRAGMENT_TAG), SUPPORT_FRAGMENT_TAG);
        if (stopListenerSupportFragment == null || stopListenerSupportFragment.isRemoving()) {
            stopListenerSupportFragment = new StopListenerSupportFragment();
            activityC21897OooOo0.getSupportFragmentManager();
            ?? length = String.length();
            length.OooO0Oo(0, stopListenerSupportFragment, SUPPORT_FRAGMENT_TAG, 1);
            length.OooO(true, true);
            FragmentManager supportFragmentManager = activityC21897OooOo0.getSupportFragmentManager();
            supportFragmentManager.OooOoO(true);
            supportFragmentManager.Oooo00O();
        }
        stopListenerSupportFragment.callbacks.add(runnable);
    }

    private static void onActivityStopCallOnce(final Activity activity, final Runnable runnable) {
        Assert.hardAssert(!(activity instanceof ActivityC21897OooOo0), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: com.google.firebase.firestore.core.OooO0OO
            @Override // java.lang.Runnable
            public final void run() {
                ActivityScope.lambda$onActivityStopCallOnce$0(activity, runnable);
            }
        });
    }

    private static void onFragmentActivityStopCallOnce(final ActivityC21897OooOo0 activityC21897OooOo0, final Runnable runnable) {
        activityC21897OooOo0.runOnUiThread(new Runnable() { // from class: com.google.firebase.firestore.core.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                ActivityScope.lambda$onFragmentActivityStopCallOnce$1(activityC21897OooOo0, runnable);
            }
        });
    }
}
