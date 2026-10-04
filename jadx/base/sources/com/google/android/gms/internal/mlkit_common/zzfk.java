package com.google.android.gms.internal.mlkit_common;

import com.aspose.slides.C22217OooOooo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzfk implements ObjectEncoder {
    static final zzfk zza = new zzfk();
    private static final FieldDescriptor zzb = C22217OooOooo.OooO00o(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = C22217OooOooo.OooO00o(2, FieldDescriptor.builder("isSuccessful"));
    private static final FieldDescriptor zzd = C22217OooOooo.OooO00o(3, FieldDescriptor.builder("modelName"));

    private zzfk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzlo zzloVar = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzloVar.zza());
        objectEncoderContext2.add(zzc, zzloVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
