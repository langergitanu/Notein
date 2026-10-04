package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IInterruptionTokenSource {
    IInterruptionToken getToken();

    void interrupt();

    boolean isInterruptionRequested();
}
