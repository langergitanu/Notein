package com.google.firebase.vertexai.type;

import Oooo0oO.C21111o0ooOoO;
import com.google.firebase.vertexai.type.CitationMetadata;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO00o;
import oO0oO000.OooO0O0;
import oO0oO000.OooO0OO;
import oOo00O0O.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"com/google/firebase/vertexai/type/CitationMetadata.Internal.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;", "<init>", "()V", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/google/firebase/vertexai/type/CitationMetadata$Internal;)V", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "descriptor", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CitationMetadata$Internal$$serializer implements InterfaceC33966Oooo0OO<CitationMetadata.Internal> {
    public static final CitationMetadata$Internal$$serializer INSTANCE;
    private static final /* synthetic */ C34001o0ooOO0 descriptor;

    static {
        CitationMetadata$Internal$$serializer citationMetadata$Internal$$serializer = new CitationMetadata$Internal$$serializer();
        INSTANCE = citationMetadata$Internal$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.google.firebase.vertexai.type.CitationMetadata.Internal", citationMetadata$Internal$$serializer, 1);
        c34001o0ooOO0.OooOO0("citationSources", false);
        final String[] strArr = {"citations"};
        OooOo oooOo = new OooOo(strArr) { // from class: com.google.firebase.vertexai.type.CitationMetadata$Internal$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
            private final /* synthetic */ String[] names;

            {
                OooOOO0.OooO0oO(strArr, "names");
                this.names = strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OooOo.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof OooOo) && Arrays.equals(names(), ((OooOo) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(this.names) ^ 397397176;
            }

            @Override // oOo00O0O.OooOo
            public final /* synthetic */ String[] names() {
                return this.names;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return C21111o0ooOoO.OooO0OO(Arrays.toString(this.names), ')', new StringBuilder("@kotlinx.serialization.json.JsonNames(names="));
            }
        };
        int i = c34001o0ooOO0.f122283OooO0Oo;
        List<Annotation>[] listArr = c34001o0ooOO0.f122284OooO0o;
        List<Annotation> arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            listArr[c34001o0ooOO0.f122283OooO0Oo] = arrayList;
        }
        arrayList.add(oooOo);
        descriptor = c34001o0ooOO0;
    }

    private CitationMetadata$Internal$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] childSerializers() {
        return new InterfaceC33911OooO0OO[]{CitationMetadata.Internal.$childSerializers[0]};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public CitationMetadata.Internal deserialize(OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO00o OooO00o2 = decoder.OooO00o(descriptor2);
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = CitationMetadata.Internal.$childSerializers;
        boolean z = true;
        int i = 0;
        Object objOooOOO0 = null;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(descriptor2);
            if (iOooOo0o == -1) {
                z = false;
            } else {
                if (iOooOo0o != 0) {
                    throw new C33927OooOo00(iOooOo0o);
                }
                objOooOOO0 = OooO00o2.OooOOO0(descriptor2, 0, interfaceC33911OooO0OOArr[0], objOooOOO0);
                i = 1;
            }
        }
        OooO00o2.OooO0O0(descriptor2);
        return new CitationMetadata.Internal(i, (List) objOooOOO0, null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public void serialize(InterfaceC34004OooO0Oo encoder, CitationMetadata.Internal value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 descriptor2 = getDescriptor();
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(descriptor2);
        oooO0O0OooO00o.OooOoo0(descriptor2, 0, CitationMetadata.Internal.$childSerializers[0], value.citationSources);
        oooO0O0OooO00o.OooO0O0(descriptor2);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
