package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.google.android.gms.internal.mlkit_translate.zzbo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.inappmessaging.internal.Logging;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: com.aspose.slides.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22221Oooo0O0 implements InterfaceC32330OooO0O0 {
    public static /* synthetic */ int OooO00o(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        throw null;
    }

    public static int OooO0O0(float f, float f2, float f3, int i) {
        return C7019kk.m27462to(Float.valueOf((f * f2) + f3), i);
    }

    public static FieldDescriptor.Builder OooO0OO(int i, FieldDescriptor.Builder builder, String str) {
        zzbo zzboVar = new zzbo();
        zzboVar.zza(i);
        builder.withProperty(zzboVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.String] */
    public static int[] _values() {
        return String.substring(4, 4);
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        Logging.loge("Rate limiter client write failure");
    }
}
