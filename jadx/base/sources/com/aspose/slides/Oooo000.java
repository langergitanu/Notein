package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo000 implements ObjectConstructor {
    public static FieldDescriptor.Builder OooO00o(int i, FieldDescriptor.Builder builder, String str) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.withProperty(zzayVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static void OooO0O0(int i, Dictionary dictionary, Integer num, int i2, Integer num2) {
        dictionary.addItem(num, Integer.valueOf(i));
        dictionary.addItem(num2, Integer.valueOf(i2));
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$15();
    }
}
