package com.google.android.gms.internal.mlkit_translate;

import com.aspose.slides.Oooo0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzhf implements ObjectEncoder {
    static final zzhf zza = new zzhf();
    private static final FieldDescriptor zzb = Oooo0.OooO0O0(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = Oooo0.OooO0O0(2, FieldDescriptor.builder("isSuccessful"));
    private static final FieldDescriptor zzd = Oooo0.OooO0O0(3, FieldDescriptor.builder("modelName"));

    private zzhf() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zznj zznjVar = (zznj) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zznjVar.zza());
        objectEncoderContext2.add(zzc, zznjVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
