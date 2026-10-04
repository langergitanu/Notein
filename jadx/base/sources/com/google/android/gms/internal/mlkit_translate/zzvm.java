package com.google.android.gms.internal.mlkit_translate;

import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class zzvm {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[ModelType.values().length];
        zza = iArr;
        try {
            iArr[ModelType.TRANSLATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[ModelType.DIGITAL_INK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[ModelType.CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[ModelType.BASE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
