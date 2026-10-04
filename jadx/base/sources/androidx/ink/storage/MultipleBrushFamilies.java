package androidx.ink.storage;

import androidx.ink.storage.MultipleBrushFamilies;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m80612d2 = {"Landroidx/ink/storage/MultipleBrushFamilies;", "", "Lkotlin/Function0;", "", "nativeAlloc", "<init>", "(LoO0O000o/OooO00o;)V", "", "Lo000OO00/OooOOo;", "releaseBrushFamilies$ink_storage", "()Ljava/util/List;", "releaseBrushFamilies", "nativePointer$delegate", "Lo000OOoO/OooO0O0;", "getNativePointer", "()J", "nativePointer", "Companion", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MultipleBrushFamilies {
    static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] $$delegatedProperties = {new C24028OooOoO0(MultipleBrushFamilies.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nativePointer$delegate, reason: from kotlin metadata */
    private final o000OOoO.OooO0O0 nativePointer;

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m80612d2 = {"Landroidx/ink/storage/MultipleBrushFamilies$Companion;", "", "<init>", "()V", "", "brushFamilyByteArray", "", "length", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "onDecodeTexture", "maxVersion", "", "Lo000OO00/OooOOo;", "decode", "([BILandroidx/ink/storage/OnDecodeTexturePngBytes;I)Ljava/util/List;", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long decode$lambda$0(byte[] bArr, int i, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i2) {
            long jCreateFromProto = MultipleBrushFamiliesNative.INSTANCE.createFromProto(bArr, i, onDecodeTexturePngBytes, i2);
            if (jCreateFromProto != 0) {
                return jCreateFromProto;
            }
            throw new IllegalStateException("Should have thrown exception if decoding failed.");
        }

        public final List<C24457OooOOo> decode(final byte[] brushFamilyByteArray, final int length, final OnDecodeTexturePngBytes onDecodeTexture, final int maxVersion) {
            OooOOO0.OooO0oO(brushFamilyByteArray, "brushFamilyByteArray");
            return new MultipleBrushFamilies(new oO0O000o.OooO00o() { // from class: androidx.ink.storage.OooO0o0
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(MultipleBrushFamilies.Companion.decode$lambda$0(brushFamilyByteArray, length, onDecodeTexture, maxVersion));
                }
            }, null).releaseBrushFamilies$ink_storage();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultipleBrushFamilies(oO0O000o.OooO00o oooO00o, C24018OooO0oo c24018OooO0oo) {
        this(oooO00o);
    }

    private final long getNativePointer() {
        return this.nativePointer.OooO00o(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long releaseBrushFamilies$lambda$0$0(MultipleBrushFamilies multipleBrushFamilies, int i) {
        long jReleaseBrushFamily = MultipleBrushFamiliesNative.INSTANCE.releaseBrushFamily(multipleBrushFamilies.getNativePointer(), i);
        if (jReleaseBrushFamily != 0) {
            return jReleaseBrushFamily;
        }
        throw new IllegalStateException("releaseBrushFamilies can only be called once.");
    }

    public final List<C24457OooOOo> releaseBrushFamilies$ink_storage() {
        int brushFamilyCount = MultipleBrushFamiliesNative.INSTANCE.getBrushFamilyCount(getNativePointer());
        ArrayList arrayList = new ArrayList(brushFamilyCount);
        for (final int i = 0; i < brushFamilyCount; i++) {
            C24457OooOOo.OooO00o oooO00o = C24457OooOOo.f82666OooO0oO;
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: androidx.ink.storage.OooO0Oo
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(MultipleBrushFamilies.releaseBrushFamilies$lambda$0$0(this.f65451OooOo0o, i));
                }
            };
            oooO00o.getClass();
            arrayList.add(new C24457OooOOo(oooO00o2, null, null));
        }
        return arrayList;
    }

    private MultipleBrushFamilies(oO0O000o.OooO00o<Long> oooO00o) {
        this.nativePointer = new o000OOoO.OooO0O0(oooO00o, new MultipleBrushFamilies$nativePointer$2(MultipleBrushFamiliesNative.INSTANCE));
    }
}
