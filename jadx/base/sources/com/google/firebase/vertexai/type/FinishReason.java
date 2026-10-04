package com.google.firebase.vertexai.type;

import OooOoOO.C20519OooO0Oo;
import com.google.firebase.vertexai.common.util.FirstOrdinalSerializer;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.OooO00o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FinishReason;", "", "name", "", "ordinal", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getOrdinal", "()I", "Companion", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FinishReason {
    private final String name;
    private final int ordinal;
    public static final FinishReason UNKNOWN = new FinishReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
    public static final FinishReason STOP = new FinishReason("STOP", 1);
    public static final FinishReason MAX_TOKENS = new FinishReason("MAX_TOKENS", 2);
    public static final FinishReason SAFETY = new FinishReason("SAFETY", 3);
    public static final FinishReason RECITATION = new FinishReason("RECITATION", 4);
    public static final FinishReason OTHER = new FinishReason("OTHER", 5);
    public static final FinishReason BLOCKLIST = new FinishReason("BLOCKLIST", 6);
    public static final FinishReason PROHIBITED_CONTENT = new FinishReason("PROHIBITED_CONTENT", 7);
    public static final FinishReason SPII = new FinishReason("SPII", 8);
    public static final FinishReason MALFORMED_FUNCTION_CALL = new FinishReason("MALFORMED_FUNCTION_CALL", 9);

    @InterfaceC33908OooO(with = Serializer.class)
    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0013"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "", "(Ljava/lang/String;I)V", "toPublic", "Lcom/google/firebase/vertexai/type/FinishReason;", "toPublic$com_google_firebase_firebase_vertexai", GrsBaseInfo.CountryCodeSource.UNKNOWN, "UNSPECIFIED", "STOP", "MAX_TOKENS", "SAFETY", "RECITATION", "OTHER", "BLOCKLIST", "PROHIBITED_CONTENT", "SPII", "MALFORMED_FUNCTION_CALL", "Companion", "Serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public enum Internal {
        UNKNOWN,
        UNSPECIFIED,
        STOP,
        MAX_TOKENS,
        SAFETY,
        RECITATION,
        OTHER,
        BLOCKLIST,
        PROHIBITED_CONTENT,
        SPII,
        MALFORMED_FUNCTION_CALL;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC32440OooOO0<InterfaceC33911OooO0OO<Object>> $cachedSerializer$delegate = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, Companion.C172591.INSTANCE);

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FinishReason$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.google.firebase.vertexai.type.FinishReason$Internal$Companion$1 */
            @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class C172591 extends OooOOOO implements OooO00o<InterfaceC33911OooO0OO<Object>> {
                public static final C172591 INSTANCE = new C172591();

                public C172591() {
                    super(0);
                }

                @Override // oO0O000o.OooO00o
                public final InterfaceC33911OooO0OO<Object> invoke() {
                    return Serializer.INSTANCE;
                }
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            private final /* synthetic */ InterfaceC33911OooO0OO get$cachedSerializer() {
                return (InterfaceC33911OooO0OO) Internal.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        @Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FinishReason$Internal$Serializer;", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "<init>", "()V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/google/firebase/vertexai/type/FinishReason$Internal;", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/google/firebase/vertexai/type/FinishReason$Internal;)V", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "descriptor", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Serializer implements InterfaceC33911OooO0OO<Internal> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ FirstOrdinalSerializer<Internal> $$delegate_0 = new FirstOrdinalSerializer<>(C24035Oooo00o.f80943OooO00o.OooO0O0(Internal.class));

            private Serializer() {
            }

            @Override // oO0o0ooO.InterfaceC33910OooO0O0
            public Internal deserialize(OooO0OO decoder) {
                OooOOO0.OooO0oO(decoder, "decoder");
                return (Internal) this.$$delegate_0.deserialize(decoder);
            }

            @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
            public InterfaceC33531OooO0o0 getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // oO0o0ooO.InterfaceC33911OooO0OO
            public void serialize(InterfaceC34004OooO0Oo encoder, Internal value) {
                OooOOO0.OooO0oO(encoder, "encoder");
                OooOOO0.OooO0oO(value, "value");
                this.$$delegate_0.serialize(encoder, value);
            }
        }

        @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Internal.values().length];
                try {
                    iArr[Internal.MAX_TOKENS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Internal.RECITATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Internal.SAFETY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Internal.STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Internal.OTHER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Internal.BLOCKLIST.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Internal.PROHIBITED_CONTENT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Internal.SPII.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Internal.MALFORMED_FUNCTION_CALL.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final FinishReason toPublic$com_google_firebase_firebase_vertexai() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return FinishReason.MAX_TOKENS;
                case 2:
                    return FinishReason.RECITATION;
                case 3:
                    return FinishReason.SAFETY;
                case 4:
                    return FinishReason.STOP;
                case 5:
                    return FinishReason.OTHER;
                case 6:
                    return FinishReason.BLOCKLIST;
                case 7:
                    return FinishReason.PROHIBITED_CONTENT;
                case 8:
                    return FinishReason.SPII;
                case 9:
                    return FinishReason.MALFORMED_FUNCTION_CALL;
                default:
                    return FinishReason.UNKNOWN;
            }
        }
    }

    private FinishReason(String str, int i) {
        this.name = str;
        this.ordinal = i;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }
}
