package com.orion.notein.domain.models.p605ai;

import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33971OoooO;
import oO0oO00.C33983OooooO0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o000000O;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO00o;
import oO0oO000.OooO0O0;
import oO0oO000.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"com/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2.UsageMetadata.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2$UsageMetadata;", "<init>", "()V", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2$UsageMetadata;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2$UsageMetadata;", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public /* synthetic */ class NoteinAiQuotaRecordV2$UsageMetadata$$serializer implements InterfaceC33966Oooo0OO<NoteinAiQuotaRecordV2.UsageMetadata> {
    public static final NoteinAiQuotaRecordV2$UsageMetadata$$serializer INSTANCE;
    private static final InterfaceC33531OooO0o0 descriptor;

    static {
        NoteinAiQuotaRecordV2$UsageMetadata$$serializer noteinAiQuotaRecordV2$UsageMetadata$$serializer = new NoteinAiQuotaRecordV2$UsageMetadata$$serializer();
        INSTANCE = noteinAiQuotaRecordV2$UsageMetadata$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.domain.models.ai.NoteinAiQuotaRecordV2.UsageMetadata", noteinAiQuotaRecordV2$UsageMetadata$$serializer, 6);
        c34001o0ooOO0.OooOO0("aiOcrRequestCount", true);
        c34001o0ooOO0.OooOO0("aiOcrBillableChars", true);
        c34001o0ooOO0.OooOO0("aiSummaryRequestCount", true);
        c34001o0ooOO0.OooOO0("aiSummaryBillableChars", true);
        c34001o0ooOO0.OooOO0("aiChatRequestCount", true);
        c34001o0ooOO0.OooOO0("aiChatBillableChars", true);
        descriptor = c34001o0ooOO0;
    }

    private NoteinAiQuotaRecordV2$UsageMetadata$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] childSerializers() {
        C33971OoooO c33971OoooO = C33971OoooO.f122193OooO00o;
        C33983OooooO0 c33983OooooO0 = C33983OooooO0.f122206OooO00o;
        return new InterfaceC33911OooO0OO[]{c33971OoooO, c33983OooooO0, c33971OoooO, c33983OooooO0, c33971OoooO, c33983OooooO0};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final NoteinAiQuotaRecordV2.UsageMetadata deserialize(OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        OooO00o OooO00o2 = decoder.OooO00o(interfaceC33531OooO0o0);
        int i = 0;
        int iOooOo0 = 0;
        int iOooOo02 = 0;
        int iOooOo03 = 0;
        long jOooOo00 = 0;
        long jOooOo002 = 0;
        long jOooOo003 = 0;
        boolean z = true;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
            switch (iOooOo0o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iOooOo0 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 0);
                    i |= 1;
                    break;
                case 1:
                    jOooOo00 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 1);
                    i |= 2;
                    break;
                case 2:
                    iOooOo02 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 2);
                    i |= 4;
                    break;
                case 3:
                    jOooOo002 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 3);
                    i |= 8;
                    break;
                case 4:
                    iOooOo03 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 4);
                    i |= 16;
                    break;
                case 5:
                    jOooOo003 = OooO00o2.OooOo00(interfaceC33531OooO0o0, 5);
                    i |= 32;
                    break;
                default:
                    throw new C33927OooOo00(iOooOo0o);
            }
        }
        OooO00o2.OooO0O0(interfaceC33531OooO0o0);
        return new NoteinAiQuotaRecordV2.UsageMetadata(i, iOooOo0, jOooOo00, iOooOo02, jOooOo002, iOooOo03, jOooOo003, (o000000O) null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, NoteinAiQuotaRecordV2.UsageMetadata value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
        NoteinAiQuotaRecordV2.UsageMetadata.write$Self$app_google_playRelease(value, oooO0O0OooO00o, interfaceC33531OooO0o0);
        oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
