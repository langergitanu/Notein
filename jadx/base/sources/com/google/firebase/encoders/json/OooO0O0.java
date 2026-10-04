package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements ValueEncoder {
    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
        valueEncoderContext.add((String) obj);
    }
}
