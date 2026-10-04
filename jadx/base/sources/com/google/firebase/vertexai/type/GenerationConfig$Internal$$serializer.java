package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.GenerationConfig;
import com.google.firebase.vertexai.type.Schema;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C33971OoooO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO00o;
import oO0oO000.OooO0O0;
import oO0oO000.OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"com/google/firebase/vertexai/type/GenerationConfig.Internal.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "<init>", "()V", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/google/firebase/vertexai/type/GenerationConfig$Internal;)V", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "descriptor", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerationConfig$Internal$$serializer implements InterfaceC33966Oooo0OO<GenerationConfig.Internal> {
    public static final GenerationConfig$Internal$$serializer INSTANCE;
    private static final /* synthetic */ C34001o0ooOO0 descriptor;

    static {
        GenerationConfig$Internal$$serializer generationConfig$Internal$$serializer = new GenerationConfig$Internal$$serializer();
        INSTANCE = generationConfig$Internal$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.google.firebase.vertexai.type.GenerationConfig.Internal", generationConfig$Internal$$serializer, 10);
        c34001o0ooOO0.OooOO0("temperature", false);
        c34001o0ooOO0.OooOO0("top_p", false);
        c34001o0ooOO0.OooOO0("top_k", false);
        c34001o0ooOO0.OooOO0("candidate_count", false);
        c34001o0ooOO0.OooOO0("max_output_tokens", false);
        c34001o0ooOO0.OooOO0("stop_sequences", false);
        c34001o0ooOO0.OooOO0("response_mime_type", true);
        c34001o0ooOO0.OooOO0("presence_penalty", true);
        c34001o0ooOO0.OooOO0("frequency_penalty", true);
        c34001o0ooOO0.OooOO0("response_schema", true);
        descriptor = c34001o0ooOO0;
    }

    private GenerationConfig$Internal$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] childSerializers() {
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = GenerationConfig.Internal.$childSerializers;
        C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
        InterfaceC33911OooO0OO<?> interfaceC33911OooO0OOOooO0OO = C33928OooO00o.OooO0OO(c33965Oooo0O0);
        InterfaceC33911OooO0OO<?> interfaceC33911OooO0OOOooO0OO2 = C33928OooO00o.OooO0OO(c33965Oooo0O0);
        C33971OoooO c33971OoooO = C33971OoooO.f122193OooO00o;
        return new InterfaceC33911OooO0OO[]{interfaceC33911OooO0OOOooO0OO, interfaceC33911OooO0OOOooO0OO2, C33928OooO00o.OooO0OO(c33971OoooO), C33928OooO00o.OooO0OO(c33971OoooO), C33928OooO00o.OooO0OO(c33971OoooO), C33928OooO00o.OooO0OO(interfaceC33911OooO0OOArr[5]), C33928OooO00o.OooO0OO(o00000OO.f122230OooO00o), C33928OooO00o.OooO0OO(c33965Oooo0O0), C33928OooO00o.OooO0OO(c33965Oooo0O0), C33928OooO00o.OooO0OO(Schema$Internal$$serializer.INSTANCE)};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public GenerationConfig.Internal deserialize(OooO0OO decoder) {
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr;
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO00o OooO00o2 = decoder.OooO00o(descriptor2);
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr2 = GenerationConfig.Internal.$childSerializers;
        Object objOooOOO = null;
        Object objOooOOO2 = null;
        Object objOooOOO3 = null;
        Object objOooOOO4 = null;
        Object objOooOOO5 = null;
        Object objOooOOO6 = null;
        Object objOooOOO7 = null;
        Object objOooOOO8 = null;
        Object objOooOOO9 = null;
        Object objOooOOO10 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(descriptor2);
            switch (iOooOo0o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO = OooO00o2.OooOOO(descriptor2, 0, C33965Oooo0O0.f122189OooO00o, objOooOOO);
                    i |= 1;
                    break;
                case 1:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO2 = OooO00o2.OooOOO(descriptor2, 1, C33965Oooo0O0.f122189OooO00o, objOooOOO2);
                    i |= 2;
                    break;
                case 2:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO3 = OooO00o2.OooOOO(descriptor2, 2, C33971OoooO.f122193OooO00o, objOooOOO3);
                    i |= 4;
                    break;
                case 3:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO4 = OooO00o2.OooOOO(descriptor2, 3, C33971OoooO.f122193OooO00o, objOooOOO4);
                    i |= 8;
                    break;
                case 4:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO5 = OooO00o2.OooOOO(descriptor2, 4, C33971OoooO.f122193OooO00o, objOooOOO5);
                    i |= 16;
                    break;
                case 5:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO6 = OooO00o2.OooOOO(descriptor2, 5, interfaceC33911OooO0OOArr[5], objOooOOO6);
                    i |= 32;
                    break;
                case 6:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO7 = OooO00o2.OooOOO(descriptor2, 6, o00000OO.f122230OooO00o, objOooOOO7);
                    i |= 64;
                    break;
                case 7:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO8 = OooO00o2.OooOOO(descriptor2, 7, C33965Oooo0O0.f122189OooO00o, objOooOOO8);
                    i |= 128;
                    break;
                case 8:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO9 = OooO00o2.OooOOO(descriptor2, 8, C33965Oooo0O0.f122189OooO00o, objOooOOO9);
                    i |= 256;
                    break;
                case 9:
                    interfaceC33911OooO0OOArr = interfaceC33911OooO0OOArr2;
                    objOooOOO10 = OooO00o2.OooOOO(descriptor2, 9, Schema$Internal$$serializer.INSTANCE, objOooOOO10);
                    i |= 512;
                    break;
                default:
                    throw new C33927OooOo00(iOooOo0o);
            }
            interfaceC33911OooO0OOArr2 = interfaceC33911OooO0OOArr;
        }
        OooO00o2.OooO0O0(descriptor2);
        return new GenerationConfig.Internal(i, (Float) objOooOOO, (Float) objOooOOO2, (Integer) objOooOOO3, (Integer) objOooOOO4, (Integer) objOooOOO5, (List) objOooOOO6, (String) objOooOOO7, (Float) objOooOOO8, (Float) objOooOOO9, (Schema.Internal) objOooOOO10, (o000000O) null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public void serialize(InterfaceC34004OooO0Oo encoder, GenerationConfig.Internal value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(descriptor2);
        GenerationConfig.Internal.write$Self(value, oooO0O0OooO00o, descriptor2);
        oooO0O0OooO00o.OooO0O0(descriptor2);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
