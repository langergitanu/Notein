package com.google.firebase.vertexai.type;

import com.google.firebase.vertexai.type.HarmBlockMethod;
import com.google.firebase.vertexai.type.HarmBlockThreshold;
import com.google.firebase.vertexai.type.HarmCategory;
import com.google.firebase.vertexai.type.SafetySetting;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o000000O;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO00o;
import oO0oO000.OooO0O0;
import oO0oO000.OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"com/google/firebase/vertexai/type/SafetySetting.Internal.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "<init>", "()V", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/google/firebase/vertexai/type/SafetySetting$Internal;", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/google/firebase/vertexai/type/SafetySetting$Internal;)V", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "descriptor", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SafetySetting$Internal$$serializer implements InterfaceC33966Oooo0OO<SafetySetting.Internal> {
    public static final SafetySetting$Internal$$serializer INSTANCE;
    private static final /* synthetic */ C34001o0ooOO0 descriptor;

    static {
        SafetySetting$Internal$$serializer safetySetting$Internal$$serializer = new SafetySetting$Internal$$serializer();
        INSTANCE = safetySetting$Internal$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.google.firebase.vertexai.type.SafetySetting.Internal", safetySetting$Internal$$serializer, 3);
        c34001o0ooOO0.OooOO0("category", false);
        c34001o0ooOO0.OooOO0("threshold", false);
        c34001o0ooOO0.OooOO0("method", true);
        descriptor = c34001o0ooOO0;
    }

    private SafetySetting$Internal$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] childSerializers() {
        InterfaceC33911OooO0OO<?>[] interfaceC33911OooO0OOArr = SafetySetting.Internal.$childSerializers;
        return new InterfaceC33911OooO0OO[]{HarmCategory.Internal.Serializer.INSTANCE, interfaceC33911OooO0OOArr[1], C33928OooO00o.OooO0OO(interfaceC33911OooO0OOArr[2])};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public SafetySetting.Internal deserialize(OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO00o OooO00o2 = decoder.OooO00o(descriptor2);
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = SafetySetting.Internal.$childSerializers;
        Object objOooOOO0 = null;
        boolean z = true;
        int i = 0;
        Object objOooOOO02 = null;
        Object objOooOOO = null;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(descriptor2);
            if (iOooOo0o == -1) {
                z = false;
            } else if (iOooOo0o == 0) {
                objOooOOO0 = OooO00o2.OooOOO0(descriptor2, 0, HarmCategory.Internal.Serializer.INSTANCE, objOooOOO0);
                i |= 1;
            } else if (iOooOo0o == 1) {
                objOooOOO02 = OooO00o2.OooOOO0(descriptor2, 1, interfaceC33911OooO0OOArr[1], objOooOOO02);
                i |= 2;
            } else {
                if (iOooOo0o != 2) {
                    throw new C33927OooOo00(iOooOo0o);
                }
                objOooOOO = OooO00o2.OooOOO(descriptor2, 2, interfaceC33911OooO0OOArr[2], objOooOOO);
                i |= 4;
            }
        }
        OooO00o2.OooO0O0(descriptor2);
        return new SafetySetting.Internal(i, (HarmCategory.Internal) objOooOOO0, (HarmBlockThreshold.Internal) objOooOOO02, (HarmBlockMethod.Internal) objOooOOO, (o000000O) null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public void serialize(InterfaceC34004OooO0Oo encoder, SafetySetting.Internal value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(descriptor2);
        SafetySetting.Internal.write$Self(value, oooO0O0OooO00o, descriptor2);
        oooO0O0OooO00o.OooO0O0(descriptor2);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
