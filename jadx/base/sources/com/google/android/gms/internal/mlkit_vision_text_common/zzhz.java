package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzhz implements ObjectEncoder {
    static final zzhz zza = new zzhz();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(2, FieldDescriptor.builder("originalImageSize"));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("compressedImageSize"));
    private static final FieldDescriptor zze = C22225Oooo0oO.OooO00o(4, FieldDescriptor.builder("isOdmlImage"));

    private zzhz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzod zzodVar = (zzod) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzodVar.zza());
        objectEncoderContext2.add(zzc, zzodVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
