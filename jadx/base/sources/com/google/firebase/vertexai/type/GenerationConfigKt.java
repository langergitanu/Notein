package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.GenerationConfig;
import com.huawei.hms.network.embedded.C18374u4;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lkotlin/Function1;", "Lcom/google/firebase/vertexai/type/GenerationConfig$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/vertexai/type/GenerationConfig;", "generationConfig", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/vertexai/type/GenerationConfig;", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerationConfigKt {
    public static final GenerationConfig generationConfig(InterfaceC32507OooOO0o<? super GenerationConfig.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(init, "init");
        GenerationConfig.Builder builder = GenerationConfig.INSTANCE.builder();
        init.invoke(builder);
        return builder.build();
    }
}
