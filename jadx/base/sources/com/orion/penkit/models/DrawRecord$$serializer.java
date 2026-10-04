package com.orion.penkit.models;

import android.graphics.RectF;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0oo0O.C31219OooO0O0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C33971OoooO;
import oO0oO00.C33983OooooO0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"com/orion/penkit/models/DrawRecord.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/orion/penkit/models/DrawRecord;", "<init>", "()V", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/orion/penkit/models/DrawRecord;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/orion/penkit/models/DrawRecord;", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public /* synthetic */ class DrawRecord$$serializer implements InterfaceC33966Oooo0OO<DrawRecord> {
    public static final DrawRecord$$serializer INSTANCE;
    private static final InterfaceC33531OooO0o0 descriptor;

    static {
        DrawRecord$$serializer drawRecord$$serializer = new DrawRecord$$serializer();
        INSTANCE = drawRecord$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.penkit.models.DrawRecord", drawRecord$$serializer, 8);
        c34001o0ooOO0.OooOO0("id", false);
        c34001o0ooOO0.OooOO0(C18437z2.f56754h, false);
        c34001o0ooOO0.OooOO0("color", false);
        c34001o0ooOO0.OooOO0("width", false);
        c34001o0ooOO0.OooOO0("points", true);
        c34001o0ooOO0.OooOO0("bounds", true);
        c34001o0ooOO0.OooOO0("layerId", true);
        c34001o0ooOO0.OooOO0(C17625c.f52155b, true);
        descriptor = c34001o0ooOO0;
    }

    private DrawRecord$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] childSerializers() {
        InterfaceC33911OooO0OO<?> interfaceC33911OooO0OO = DrawRecord.$childSerializers[4];
        o00000OO o00000oo2 = o00000OO.f122230OooO00o;
        C33971OoooO c33971OoooO = C33971OoooO.f122193OooO00o;
        return new InterfaceC33911OooO0OO[]{o00000oo2, c33971OoooO, c33971OoooO, C33965Oooo0O0.f122189OooO00o, interfaceC33911OooO0OO, C31219OooO0O0.f111342OooO00o, o00000oo2, C33983OooooO0.f122206OooO00o};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final DrawRecord deserialize(oO0oO000.OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        oO0oO000.OooO00o OooO00o2 = decoder.OooO00o(interfaceC33531OooO0o0);
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = DrawRecord.$childSerializers;
        RectF rectF = null;
        int i = 0;
        int iOooOo0 = 0;
        int iOooOo02 = 0;
        String strOooo0 = null;
        List list = null;
        String strOooo02 = null;
        float fOooO0Oo = 0.0f;
        long jOooOo00 = 0;
        boolean z = true;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
            switch (iOooOo0o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 0);
                    i |= 1;
                    break;
                case 1:
                    iOooOo0 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 1);
                    i |= 2;
                    break;
                case 2:
                    iOooOo02 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 2);
                    i |= 4;
                    break;
                case 3:
                    fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 4, interfaceC33911OooO0OOArr[4], list);
                    i |= 16;
                    break;
                case 5:
                    rectF = (RectF) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 5, C31219OooO0O0.f111342OooO00o, rectF);
                    i |= 32;
                    break;
                case 6:
                    strOooo02 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 6);
                    i |= 64;
                    break;
                case 7:
                    jOooOo00 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 7);
                    i |= 128;
                    break;
                default:
                    throw new C33927OooOo00(iOooOo0o);
            }
        }
        OooO00o2.OooO0O0(interfaceC33531OooO0o0);
        return new DrawRecord(i, strOooo0, iOooOo0, iOooOo02, fOooO0Oo, list, rectF, strOooo02, jOooOo00, null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, DrawRecord value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
        DrawRecord.write$Self$ni_penkit_release(value, oooO0O0OooO00o, interfaceC33531OooO0o0);
        oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
