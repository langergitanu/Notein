package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream.StreamCallback;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes8.dex */
public interface Stream<CallbackType extends StreamCallback> {

    public enum State {
        Initial,
        Starting,
        Open,
        Healthy,
        Error,
        Backoff
    }

    public interface StreamCallback {
        void onClose(o00Oo0 o00oo02);

        void onOpen();
    }

    void inhibitBackoff();

    boolean isOpen();

    boolean isStarted();

    void start();

    void stop();
}
