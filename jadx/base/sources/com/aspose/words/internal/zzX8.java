package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzX8 extends IllegalStateException {
    public zzX8(Exception exc) {
        super("Could not create the bitmap with the specified parameters. Possible lack of system resources.", exc);
    }

    public zzX8(String str) {
        super(zzZKN.format("{0}: {1}", "Could not create the bitmap with the specified parameters. Possible lack of system resources.", str));
    }
}
