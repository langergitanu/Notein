package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzln implements ObjectEncoder {
    static final zzln zza = new zzln();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(2, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("recognizerOptions"));

    private zzln() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzrz zzrzVar = (zzrz) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzrzVar.zzb());
        objectEncoderContext2.add(zzc, zzrzVar.zza());
        objectEncoderContext2.add(zzd, zzrzVar.zzc());
    }
}
