package com.orion.notein.domain.models.transactions;

import com.hihonor.honorid.core.data.UserAccountInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33983OooooO0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO00o;
import oO0oO000.OooO0O0;
import oO0oO000.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"com/orion/notein/domain/models/transactions/VipFreeTrial.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/orion/notein/domain/models/transactions/VipFreeTrial;", "<init>", "()V", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/orion/notein/domain/models/transactions/VipFreeTrial;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/orion/notein/domain/models/transactions/VipFreeTrial;", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public /* synthetic */ class VipFreeTrial$$serializer implements InterfaceC33966Oooo0OO<VipFreeTrial> {
    public static final VipFreeTrial$$serializer INSTANCE;
    private static final InterfaceC33531OooO0o0 descriptor;

    static {
        VipFreeTrial$$serializer vipFreeTrial$$serializer = new VipFreeTrial$$serializer();
        INSTANCE = vipFreeTrial$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.domain.models.transactions.VipFreeTrial", vipFreeTrial$$serializer, 5);
        c34001o0ooOO0.OooOO0("accountId", false);
        c34001o0ooOO0.OooOO0(UserAccountInfo.TAG_ACCOUNT_TYPE, false);
        c34001o0ooOO0.OooOO0("startTime", false);
        c34001o0ooOO0.OooOO0("endTime", false);
        c34001o0ooOO0.OooOO0("lastFetchTime", true);
        descriptor = c34001o0ooOO0;
    }

    private VipFreeTrial$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] childSerializers() {
        o00000OO o00000oo2 = o00000OO.f122230OooO00o;
        return new InterfaceC33911OooO0OO[]{o00000oo2, o00000oo2, o00000oo2, o00000oo2, C33983OooooO0.f122206OooO00o};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final VipFreeTrial deserialize(OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        OooO00o OooO00o2 = decoder.OooO00o(interfaceC33531OooO0o0);
        int i = 0;
        String strOooo0 = null;
        String strOooo02 = null;
        String strOooo03 = null;
        String strOooo04 = null;
        long jOooOo00 = 0;
        boolean z = true;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
            if (iOooOo0o == -1) {
                z = false;
            } else if (iOooOo0o == 0) {
                strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 0);
                i |= 1;
            } else if (iOooOo0o == 1) {
                strOooo02 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 1);
                i |= 2;
            } else if (iOooOo0o == 2) {
                strOooo03 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 2);
                i |= 4;
            } else if (iOooOo0o == 3) {
                strOooo04 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 3);
                i |= 8;
            } else {
                if (iOooOo0o != 4) {
                    throw new C33927OooOo00(iOooOo0o);
                }
                jOooOo00 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 4);
                i |= 16;
            }
        }
        OooO00o2.OooO0O0(interfaceC33531OooO0o0);
        return new VipFreeTrial(i, strOooo0, strOooo02, strOooo03, strOooo04, jOooOo00, (o000000O) null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, VipFreeTrial value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
        VipFreeTrial.write$Self$app_google_playRelease(value, oooO0O0OooO00o, interfaceC33531OooO0o0);
        oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
