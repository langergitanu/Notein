package com.google.android.gms.internal.mlkit_language_id_common;

import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzft implements ObjectEncoder {
    static final zzft zza = new zzft();
    private static final FieldDescriptor zzb = C22220Oooo00o.OooO00o(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = C22220Oooo00o.OooO00o(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = C22220Oooo00o.OooO00o(5, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));

    private zzft() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
