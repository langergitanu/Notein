package com.google.firebase.inappmessaging.display.internal;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes8.dex */
public class RenewableTimer {
    private CountDownTimer mCountDownTimer;

    public interface Callback {
        void onFinish();
    }

    public void cancel() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mCountDownTimer = null;
        }
    }

    public void start(final Callback callback, long j, long j2) {
        this.mCountDownTimer = new CountDownTimer(j, j2) { // from class: com.google.firebase.inappmessaging.display.internal.RenewableTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                callback.onFinish();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j3) {
            }
        }.start();
    }
}
