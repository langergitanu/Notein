package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;

/* JADX INFO: renamed from: com.aspose.slides.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22219Oooo00O implements ObjectConstructor {
    public static void OooO00o(int i, Dictionary dictionary, Integer num, Integer num2, Integer num3) {
        dictionary.addItem(num, num2);
        dictionary.addItem(Integer.valueOf(i), num3);
    }

    public static void OooO0O0(int i, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$16();
    }
}
