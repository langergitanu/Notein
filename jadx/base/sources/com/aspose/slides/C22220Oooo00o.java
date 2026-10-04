package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.google.android.gms.internal.mlkit_language_id_common.zzai;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.inappmessaging.internal.Logging;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: com.aspose.slides.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22220Oooo00o implements InterfaceC32330OooO0O0 {
    public static FieldDescriptor OooO00o(int i, FieldDescriptor.Builder builder) {
        zzai zzaiVar = new zzai();
        zzaiVar.zza(i);
        return builder.withProperty(zzaiVar.zzb()).build();
    }

    public static void OooO0O0(int i, Dictionary dictionary, Integer num, Integer num2, Integer num3) {
        dictionary.addItem(num, num2);
        dictionary.addItem(num3, Integer.valueOf(i));
    }

    public static /* synthetic */ void OooO0OO(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(kotlin.jvm.internal.OooOOO0.OooOO0O(str));
        kotlin.jvm.internal.OooOOO0.OooOO0o(kotlin.jvm.internal.OooOOO0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        Logging.loge("Impression store write failure");
    }
}
