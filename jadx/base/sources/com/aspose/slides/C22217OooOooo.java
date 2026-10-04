package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;

/* JADX INFO: renamed from: com.aspose.slides.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22217OooOooo implements ObjectConstructor {
    public static FieldDescriptor OooO00o(int i, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return builder.withProperty(zzayVar.zzb()).build();
    }

    public static void OooO0O0(int i, Dictionary dictionary, Integer num, int i2, Integer num2) {
        dictionary.addItem(num, Integer.valueOf(i));
        dictionary.addItem(Integer.valueOf(i2), num2);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultImplementationConstructor$14();
    }
}
