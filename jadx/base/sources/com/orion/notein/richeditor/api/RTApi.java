package com.orion.notein.richeditor.api;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.util.AndroidRuntimeException;
import android.widget.Toast;

/* JADX INFO: loaded from: classes9.dex */
public class RTApi implements RTProxy {
    private static Context sAppContext = null;
    private static final Object sTheLock = new Object();
    private static final long serialVersionUID = -3877685955074371741L;
    private final transient RTProxy mRTProxy;

    public static final class IncorrectInitializationException extends AndroidRuntimeException {
        private static final long serialVersionUID = 327389536289485672L;

        public IncorrectInitializationException(String str) {
            super(str);
        }
    }

    public RTApi(Context context, RTProxy rTProxy) {
        synchronized (sTheLock) {
            sAppContext = context.getApplicationContext();
        }
        this.mRTProxy = rTProxy;
    }

    public static Context getApplicationContext() {
        Context context;
        synchronized (sTheLock) {
            try {
                context = sAppContext;
                if (context == null) {
                    throw new IncorrectInitializationException("Create an RTApi object before calling RTApi.getApplicationContext()");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return context;
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public Toast makeText(int i, int i2) {
        return this.mRTProxy.makeText(i, i2);
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void openDialogFragment(String str, DialogFragment dialogFragment) {
        this.mRTProxy.openDialogFragment(str, dialogFragment);
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void removeFragment(String str) {
        this.mRTProxy.removeFragment(str);
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void runOnUiThread(Runnable runnable) {
        this.mRTProxy.runOnUiThread(runnable);
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public void startActivityForResult(Intent intent, int i) {
        this.mRTProxy.startActivityForResult(intent, i);
    }

    @Override // com.orion.notein.richeditor.api.RTProxy
    public Toast makeText(CharSequence charSequence, int i) {
        return this.mRTProxy.makeText(charSequence, i);
    }
}
