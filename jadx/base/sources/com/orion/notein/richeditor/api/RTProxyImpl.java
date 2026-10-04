package com.orion.notein.richeditor.api;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.util.AndroidRuntimeException;
import android.widget.Toast;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes9.dex */
public class RTProxyImpl implements RTProxy {
    private final SoftReference<Activity> mActivity;

    public static class IncorrectInitializationException extends AndroidRuntimeException {
        private static final long serialVersionUID = 327389536289485672L;

        public IncorrectInitializationException(String str) {
            super(str);
        }
    }

    public RTProxyImpl(Activity activity) {
        this.mActivity = new SoftReference<>(activity);
    }

    private Activity getActivity() {
        SoftReference<Activity> softReference = this.mActivity;
        if (softReference == null && softReference.get() == null) {
            throw new IncorrectInitializationException("The RTApi was't initialized correctly or the Activity was released by Android (SoftReference)");
        }
        return this.mActivity.get();
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public Toast makeText(int i, int i2) {
        return Toast.makeText(RTApi.getApplicationContext(), i, i2);
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void openDialogFragment(String str, DialogFragment dialogFragment) {
        Activity activity = getActivity();
        if (activity != null) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            if (((DialogFragment) fragmentManager.findFragmentByTag(str)) == null) {
                dialogFragment.show(fragmentTransactionBeginTransaction, str);
            }
        }
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void removeFragment(String str) {
        Activity activity = getActivity();
        if (activity != null) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            fragmentManager.beginTransaction().remove(fragmentManager.findFragmentByTag(str)).commit();
        }
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void runOnUiThread(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void startActivityForResult(Intent intent, int i) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.startActivityForResult(intent, i);
        }
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public Toast makeText(CharSequence charSequence, int i) {
        return Toast.makeText(RTApi.getApplicationContext(), charSequence, i);
    }
}
