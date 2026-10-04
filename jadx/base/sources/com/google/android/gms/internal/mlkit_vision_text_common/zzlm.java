package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzlm implements ObjectEncoder {
    static final zzlm zza = new zzlm();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(1, FieldDescriptor.builder("errorCode"));

    private zzlm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(zzb, ((zzrw) obj).zza());
    }
}
