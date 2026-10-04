package com.aspose.slides;

import android.content.Intent;
import com.google.android.gms.internal.mlkit_translate.zzbo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.inappmessaging.internal.Logging;
import oO00o00o.InterfaceC32329OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo0 implements InterfaceC32329OooO00o {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i + i2) * i3) + i4;
    }

    public static FieldDescriptor OooO0O0(int i, FieldDescriptor.Builder builder) {
        zzbo zzboVar = new zzbo();
        zzboVar.zza(i);
        return builder.withProperty(zzboVar.zzb()).build();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Bundle, java.lang.String] */
    public static /* synthetic */ void OooO0OO(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(Intent.getExtras());
        kotlin.jvm.internal.OooOOO0.OooOO0o(kotlin.jvm.internal.OooOOO0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    @Override // oO00o00o.InterfaceC32329OooO00o
    public void run() {
        Logging.logd("Impression store write success");
    }
}
