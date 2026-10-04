package com.google.android.gms.internal.mlkit_common;

import com.aspose.slides.C22219Oooo00O;
import com.aspose.slides.Oooo000;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzjp implements ObjectEncoder {
    static final zzjp zza = new zzjp();

    static {
        C22219Oooo00O.OooO0O0(5, Oooo000.OooO00o(4, Oooo000.OooO00o(3, FieldDescriptor.builder("languageOption"), "isUsingLegacyApi"), RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    }

    private zzjp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
