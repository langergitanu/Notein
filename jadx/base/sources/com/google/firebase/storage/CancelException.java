package com.google.firebase.storage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
class CancelException extends IOException {
    public CancelException() {
        super("The operation was canceled.");
    }
}
