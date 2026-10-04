package com.google.android.gms.internal.mlkit_vision_common;

import com.aspose.slides.C22224Oooo0o0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzdy implements ObjectEncoder {
    static final zzdy zza = new zzdy();
    private static final FieldDescriptor zzb = C22224Oooo0o0.OooO00o(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = C22224Oooo0o0.OooO00o(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = C22224Oooo0o0.OooO00o(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = C22224Oooo0o0.OooO00o(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = C22224Oooo0o0.OooO00o(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = C22224Oooo0o0.OooO00o(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzdy() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
