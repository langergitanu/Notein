package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements ObjectEncoder {
    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ProtobufDataEncoderContext.lambda$static$0((Map.Entry) obj, objectEncoderContext);
    }
}
