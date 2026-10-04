package com.google.android.gms.internal.mlkit_vision_common;

import com.aspose.slides.C22224Oooo0o0;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzgk implements ObjectEncoder {
    static final zzgk zza = new zzgk();
    private static final FieldDescriptor zzb = C22224Oooo0o0.OooO00o(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = C22224Oooo0o0.OooO00o(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = C22224Oooo0o0.OooO00o(5, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));

    private zzgk() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
