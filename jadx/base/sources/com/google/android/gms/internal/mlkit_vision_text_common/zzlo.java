package com.google.android.gms.internal.mlkit_vision_text_common;

import com.aspose.slides.C22225Oooo0oO;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzlo implements ObjectEncoder {
    static final zzlo zza = new zzlo();
    private static final FieldDescriptor zzb = C22225Oooo0oO.OooO00o(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = C22225Oooo0oO.OooO00o(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = C22225Oooo0oO.OooO00o(5, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));

    private zzlo() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, ((zzsd) obj).zza());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
