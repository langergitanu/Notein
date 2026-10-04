package com.google.firebase.vertexai.type;

import Oooo0oO.C21111o0ooOoO;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooO.InterfaceC33916OooO0oo;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InlineDataPart;", "Lcom/google/firebase/vertexai/type/Part;", "inlineData", "", "mimeType", "", "([BLjava/lang/String;)V", "getInlineData", "()[B", "getMimeType", "()Ljava/lang/String;", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class InlineDataPart implements Part {
    private final byte[] inlineData;
    private final String mimeType;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0003&%'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InlineDataPart$Internal;", "Lcom/google/firebase/vertexai/type/InternalPart;", "Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;", "inlineData", "<init>", "(Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/InlineDataPart$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;", "copy", "(Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;)Lcom/google/firebase/vertexai/type/InlineDataPart$Internal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;", "getInlineData", "getInlineData$annotations", "()V", "Companion", "$serializer", "InlineData", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal implements InternalPart {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InlineData inlineData;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/InlineDataPart$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return InlineDataPart$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00060\u0002j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010\u0016¨\u0006("}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;", "", "", "mimeType", "Lcom/google/firebase/vertexai/type/Base64;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "getMimeType$annotations", "()V", "getData", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class InlineData {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String data;
            private final String mimeType;

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/InlineDataPart$Internal$InlineData;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<InlineData> serializer() {
                    return InlineDataPart$Internal$InlineData$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ InlineData(int i, @InterfaceC33916OooO0oo("mime_type") String str, String str2, o000000O o000000o2) {
                if (3 != (i & 3)) {
                    C24242OooOOo.OooO0O0(i, 3, InlineDataPart$Internal$InlineData$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.mimeType = str;
                this.data = str2;
            }

            public static /* synthetic */ InlineData copy$default(InlineData inlineData, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inlineData.mimeType;
                }
                if ((i & 2) != 0) {
                    str2 = inlineData.data;
                }
                return inlineData.copy(str, str2);
            }

            @InterfaceC33916OooO0oo("mime_type")
            public static /* synthetic */ void getMimeType$annotations() {
            }

            public static final /* synthetic */ void write$Self(InlineData self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                output.OooOO0o(serialDesc, 0, self.mimeType);
                output.OooOO0o(serialDesc, 1, self.data);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getData() {
                return this.data;
            }

            public final InlineData copy(String mimeType, String data) {
                OooOOO0.OooO0oO(mimeType, "mimeType");
                OooOOO0.OooO0oO(data, "data");
                return new InlineData(mimeType, data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InlineData)) {
                    return false;
                }
                InlineData inlineData = (InlineData) other;
                return OooOOO0.OooO0O0(this.mimeType, inlineData.mimeType) && OooOOO0.OooO0O0(this.data, inlineData.data);
            }

            public final String getData() {
                return this.data;
            }

            public final String getMimeType() {
                return this.mimeType;
            }

            public int hashCode() {
                return this.data.hashCode() + (this.mimeType.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("InlineData(mimeType=");
                sb.append(this.mimeType);
                sb.append(", data=");
                return C21111o0ooOoO.OooO0OO(this.data, ')', sb);
            }

            public InlineData(String mimeType, String data) {
                OooOOO0.OooO0oO(mimeType, "mimeType");
                OooOOO0.OooO0oO(data, "data");
                this.mimeType = mimeType;
                this.data = data;
            }
        }

        public /* synthetic */ Internal(int i, @InterfaceC33916OooO0oo("inline_data") InlineData inlineData, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.inlineData = inlineData;
            } else {
                C24242OooOOo.OooO0O0(i, 1, InlineDataPart$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, InlineData inlineData, int i, Object obj) {
            if ((i & 1) != 0) {
                inlineData = internal.inlineData;
            }
            return internal.copy(inlineData);
        }

        @InterfaceC33916OooO0oo("inline_data")
        public static /* synthetic */ void getInlineData$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InlineData getInlineData() {
            return this.inlineData;
        }

        public final Internal copy(InlineData inlineData) {
            OooOOO0.OooO0oO(inlineData, "inlineData");
            return new Internal(inlineData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Internal) && OooOOO0.OooO0O0(this.inlineData, ((Internal) other).inlineData);
        }

        public final InlineData getInlineData() {
            return this.inlineData;
        }

        public int hashCode() {
            return this.inlineData.hashCode();
        }

        public String toString() {
            return "Internal(inlineData=" + this.inlineData + ')';
        }

        public Internal(InlineData inlineData) {
            OooOOO0.OooO0oO(inlineData, "inlineData");
            this.inlineData = inlineData;
        }
    }

    public InlineDataPart(byte[] inlineData, String mimeType) {
        OooOOO0.OooO0oO(inlineData, "inlineData");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        this.inlineData = inlineData;
        this.mimeType = mimeType;
    }

    public final byte[] getInlineData() {
        return this.inlineData;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}
