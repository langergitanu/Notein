package com.aspose.words.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLT implements zzZQT {
    @Override // com.aspose.words.internal.zzZQT
    public final Object zzP(String str, String str2, String str3) throws zzZQS {
        try {
            return new FileInputStream(new File(new File(str3).getParentFile(), str2));
        } catch (FileNotFoundException e) {
            zzZHV.zzY(e);
            return null;
        }
    }
}
