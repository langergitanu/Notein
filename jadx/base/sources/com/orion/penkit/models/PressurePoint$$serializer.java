package com.orion.penkit.models;

import com.facebook.common.callercontext.ContextChain;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C33971OoooO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"com/orion/penkit/models/PressurePoint.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/orion/penkit/models/PressurePoint;", "<init>", "()V", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/orion/penkit/models/PressurePoint;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/orion/penkit/models/PressurePoint;", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public /* synthetic */ class PressurePoint$$serializer implements InterfaceC33966Oooo0OO<PressurePoint> {
    public static final PressurePoint$$serializer INSTANCE;
    private static final InterfaceC33531OooO0o0 descriptor;

    static {
        PressurePoint$$serializer pressurePoint$$serializer = new PressurePoint$$serializer();
        INSTANCE = pressurePoint$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.models.PressurePoint", pressurePoint$$serializer, 4);
        c34001o0ooOO0.OooOO0("x", false);
        c34001o0ooOO0.OooOO0("y", false);
        c34001o0ooOO0.OooOO0(ContextChain.TAG_PRODUCT, false);
        c34001o0ooOO0.OooOO0("action", false);
        descriptor = c34001o0ooOO0;
    }

    private PressurePoint$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] childSerializers() {
        C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
        return new InterfaceC33911OooO0OO[]{c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, C33971OoooO.f122193OooO00o};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final PressurePoint deserialize(oO0oO000.OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        oO0oO000.OooO00o OooO00o2 = decoder.OooO00o(interfaceC33531OooO0o0);
        int i = 0;
        int iOooOo0 = 0;
        float fOooO0Oo = 0.0f;
        float fOooO0Oo2 = 0.0f;
        float fOooO0Oo3 = 0.0f;
        boolean z = true;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
            if (iOooOo0o == -1) {
                z = false;
            } else if (iOooOo0o == 0) {
                fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 0);
                i |= 1;
            } else if (iOooOo0o == 1) {
                fOooO0Oo2 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 1);
                i |= 2;
            } else if (iOooOo0o == 2) {
                fOooO0Oo3 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 2);
                i |= 4;
            } else {
                if (iOooOo0o != 3) {
                    throw new C33927OooOo00(iOooOo0o);
                }
                iOooOo0 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 3);
                i |= 8;
            }
        }
        OooO00o2.OooO0O0(interfaceC33531OooO0o0);
        return new PressurePoint(i, fOooO0Oo, fOooO0Oo2, fOooO0Oo3, iOooOo0, null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, PressurePoint value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
        PressurePoint.write$Self$ni_penkit_release(value, oooO0O0OooO00o, interfaceC33531OooO0o0);
        oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
