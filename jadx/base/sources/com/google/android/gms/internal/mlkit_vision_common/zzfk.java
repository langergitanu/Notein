package com.google.android.gms.internal.mlkit_vision_common;

import com.aspose.slides.C22224Oooo0o0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzfk implements ObjectEncoder {
    static final zzfk zza = new zzfk();
    private static final FieldDescriptor zzb = C22224Oooo0o0.OooO00o(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = C22224Oooo0o0.OooO00o(2, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzd = C22224Oooo0o0.OooO00o(4, FieldDescriptor.builder("captionCount"));
    private static final FieldDescriptor zze = C22224Oooo0o0.OooO00o(5, FieldDescriptor.builder("highestScore"));
    private static final FieldDescriptor zzf = C22224Oooo0o0.OooO00o(6, FieldDescriptor.builder("imageType"));

    private zzfk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
