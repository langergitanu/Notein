package com.google.android.gms.internal.mlkit_vision_common;

import com.aspose.slides.C22224Oooo0o0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzej implements ObjectEncoder {
    static final zzej zza = new zzej();
    private static final FieldDescriptor zzb = C22224Oooo0o0.OooO00o(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = C22224Oooo0o0.OooO00o(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = C22224Oooo0o0.OooO00o(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = C22224Oooo0o0.OooO00o(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = C22224Oooo0o0.OooO00o(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = C22224Oooo0o0.OooO00o(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = C22224Oooo0o0.OooO00o(7, FieldDescriptor.builder("rotationDegrees"));

    private zzej() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zziq zziqVar = (zziq) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zziqVar.zzg());
        objectEncoderContext2.add(zzc, zziqVar.zzb());
        objectEncoderContext2.add(zzd, zziqVar.zza());
        objectEncoderContext2.add(zze, zziqVar.zzc());
        objectEncoderContext2.add(zzf, zziqVar.zze());
        objectEncoderContext2.add(zzg, zziqVar.zzd());
        objectEncoderContext2.add(zzh, zziqVar.zzf());
    }
}
