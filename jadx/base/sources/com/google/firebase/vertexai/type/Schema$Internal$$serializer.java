package com.google.firebase.vertexai.type;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.vertexai.type.Schema;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.internal.fido.FidoChallenge;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33940OooO0oo;
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
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"com/google/firebase/vertexai/type/Schema.Internal.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "<init>", "()V", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/google/firebase/vertexai/type/Schema$Internal;", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/google/firebase/vertexai/type/Schema$Internal;)V", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "descriptor", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Schema$Internal$$serializer implements InterfaceC33966Oooo0OO<Schema.Internal> {
    public static final Schema$Internal$$serializer INSTANCE;
    private static final /* synthetic */ C34001o0ooOO0 descriptor;

    static {
        Schema$Internal$$serializer schema$Internal$$serializer = new Schema$Internal$$serializer();
        INSTANCE = schema$Internal$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.google.firebase.vertexai.type.Schema.Internal", schema$Internal$$serializer, 8);
        c34001o0ooOO0.OooOO0(C18437z2.f56754h, false);
        c34001o0ooOO0.OooOO0("description", true);
        c34001o0ooOO0.OooOO0("format", true);
        c34001o0ooOO0.OooOO0("nullable", true);
        c34001o0ooOO0.OooOO0("enum", true);
        c34001o0ooOO0.OooOO0("properties", true);
        c34001o0ooOO0.OooOO0(FidoChallenge.DEFAULT_USER_VERIFICATION_POLICY, true);
        c34001o0ooOO0.OooOO0(FirebaseAnalytics.Param.ITEMS, true);
        descriptor = c34001o0ooOO0;
    }

    private Schema$Internal$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] childSerializers() {
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = Schema.Internal.$childSerializers;
        o00000OO o00000oo2 = o00000OO.f122230OooO00o;
        return new InterfaceC33911OooO0OO[]{o00000oo2, C33928OooO00o.OooO0OO(o00000oo2), C33928OooO00o.OooO0OO(o00000oo2), C33928OooO00o.OooO0OO(C33940OooO0oo.f122144OooO00o), C33928OooO00o.OooO0OO(interfaceC33911OooO0OOArr[4]), C33928OooO00o.OooO0OO(interfaceC33911OooO0OOArr[5]), C33928OooO00o.OooO0OO(interfaceC33911OooO0OOArr[6]), C33928OooO00o.OooO0OO(INSTANCE)};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public Schema.Internal deserialize(OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO00o OooO00o2 = decoder.OooO00o(descriptor2);
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = Schema.Internal.$childSerializers;
        Object objOooOOO = null;
        boolean z = true;
        Object objOooOOO2 = null;
        Object objOooOOO3 = null;
        String strOooo0 = null;
        Object objOooOOO4 = null;
        Object objOooOOO5 = null;
        Object objOooOOO6 = null;
        Object objOooOOO7 = null;
        int i = 0;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(descriptor2);
            switch (iOooOo0o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strOooo0 = OooO00o2.Oooo0(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    objOooOOO = OooO00o2.OooOOO(descriptor2, 1, o00000OO.f122230OooO00o, objOooOOO);
                    i |= 2;
                    break;
                case 2:
                    objOooOOO2 = OooO00o2.OooOOO(descriptor2, 2, o00000OO.f122230OooO00o, objOooOOO2);
                    i |= 4;
                    break;
                case 3:
                    objOooOOO3 = OooO00o2.OooOOO(descriptor2, 3, C33940OooO0oo.f122144OooO00o, objOooOOO3);
                    i |= 8;
                    break;
                case 4:
                    objOooOOO4 = OooO00o2.OooOOO(descriptor2, 4, interfaceC33911OooO0OOArr[4], objOooOOO4);
                    i |= 16;
                    break;
                case 5:
                    objOooOOO5 = OooO00o2.OooOOO(descriptor2, 5, interfaceC33911OooO0OOArr[5], objOooOOO5);
                    i |= 32;
                    break;
                case 6:
                    objOooOOO6 = OooO00o2.OooOOO(descriptor2, 6, interfaceC33911OooO0OOArr[6], objOooOOO6);
                    i |= 64;
                    break;
                case 7:
                    objOooOOO7 = OooO00o2.OooOOO(descriptor2, 7, INSTANCE, objOooOOO7);
                    i |= 128;
                    break;
                default:
                    throw new C33927OooOo00(iOooOo0o);
            }
        }
        OooO00o2.OooO0O0(descriptor2);
        return new Schema.Internal(i, strOooo0, (String) objOooOOO, (String) objOooOOO2, (Boolean) objOooOOO3, (List) objOooOOO4, (Map) objOooOOO5, (List) objOooOOO6, (Schema.Internal) objOooOOO7, (o000000O) null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public void serialize(InterfaceC34004OooO0Oo encoder, Schema.Internal value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(descriptor2);
        Schema.Internal.write$Self(value, oooO0O0OooO00o, descriptor2);
        oooO0O0OooO00o.OooO0O0(descriptor2);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
