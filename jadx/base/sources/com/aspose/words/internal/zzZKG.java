package com.aspose.words.internal;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKG extends BufferedInputStream {
    public zzZKG(File file) throws FileNotFoundException {
        super(new FileInputStream(file), 4096);
    }
}
