package com.google.android.gms.internal.mlkit_vision_common;

import com.aspose.slides.C22224Oooo0o0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzex implements ObjectEncoder {
    static final zzex zza = new zzex();
    private static final FieldDescriptor zzb = C22224Oooo0o0.OooO00o(1, FieldDescriptor.builder("category"));
    private static final FieldDescriptor zzc = C22224Oooo0o0.OooO00o(2, FieldDescriptor.builder("classificationConfidence"));
    private static final FieldDescriptor zzd = C22224Oooo0o0.OooO00o(3, FieldDescriptor.builder("trackingId"));
    private static final FieldDescriptor zze = C22224Oooo0o0.OooO00o(4, FieldDescriptor.builder("labelCount"));

    private zzex() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
