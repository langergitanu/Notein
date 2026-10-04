package com.google.firebase.vertexai.type;

import OooOoOO.C20519OooO0Oo;
import com.google.firebase.vertexai.common.ExceptionsKt;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOOO;
import o00Oo0oO.C25050OooO0O0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.OooO00o;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/HarmBlockThreshold;", "", "ordinal", "", "(I)V", "getOrdinal", "()I", "toInternal", "Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Companion", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class HarmBlockThreshold {
    private final int ordinal;
    public static final HarmBlockThreshold LOW_AND_ABOVE = new HarmBlockThreshold(0);
    public static final HarmBlockThreshold MEDIUM_AND_ABOVE = new HarmBlockThreshold(1);
    public static final HarmBlockThreshold ONLY_HIGH = new HarmBlockThreshold(2);
    public static final HarmBlockThreshold NONE = new HarmBlockThreshold(3);

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;", "", "(Ljava/lang/String;I)V", "UNSPECIFIED", "BLOCK_LOW_AND_ABOVE", "BLOCK_MEDIUM_AND_ABOVE", "BLOCK_ONLY_HIGH", "BLOCK_NONE", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public enum Internal {
        UNSPECIFIED,
        BLOCK_LOW_AND_ABOVE,
        BLOCK_MEDIUM_AND_ABOVE,
        BLOCK_ONLY_HIGH,
        BLOCK_NONE;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC32440OooOO0<InterfaceC33911OooO0OO<Object>> $cachedSerializer$delegate = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, Companion.C172631.INSTANCE);

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/HarmBlockThreshold$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.google.firebase.vertexai.type.HarmBlockThreshold$Internal$Companion$1 */
            @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class C172631 extends OooOOOO implements OooO00o<InterfaceC33911OooO0OO<Object>> {
                public static final C172631 INSTANCE = new C172631();

                public C172631() {
                    super(0);
                }

                @Override // oO0O000o.OooO00o
                public final InterfaceC33911OooO0OO<Object> invoke() {
                    return C25050OooO0O0.OooO0OO("com.google.firebase.vertexai.type.HarmBlockThreshold.Internal", Internal.values(), new String[]{"HARM_BLOCK_THRESHOLD_UNSPECIFIED", null, null, null, null}, new Annotation[][]{null, null, null, null, null});
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
    }

    private HarmBlockThreshold(int i) {
        this.ordinal = i;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        if (equals(NONE)) {
            return Internal.BLOCK_NONE;
        }
        if (equals(ONLY_HIGH)) {
            return Internal.BLOCK_ONLY_HIGH;
        }
        if (equals(MEDIUM_AND_ABOVE)) {
            return Internal.BLOCK_MEDIUM_AND_ABOVE;
        }
        if (equals(LOW_AND_ABOVE)) {
            return Internal.BLOCK_LOW_AND_ABOVE;
        }
        throw ExceptionsKt.makeMissingCaseException("HarmBlockThreshold", this.ordinal);
    }
}
