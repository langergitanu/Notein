package androidx.ink.storage;

import androidx.ink.nativeloader.UsedByNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tJ6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0083 ¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tJ6\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0083 ¢\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0087 ¨\u0006\u001a"}, m80612d2 = {"Landroidx/ink/storage/BrushFamilySerializationNative;", "", "<init>", "()V", "encode", "", "nativeBrushFamilyPointer", "", "textureMap", "", "", "textureMapKeys", "", "textureMapValues", "(J[Ljava/lang/String;[[B)[B", "encodeMultiple", "nativeBrushFamilyPointers", "", "([J[Ljava/lang/String;[[B)[B", "createFromProto", "brushFamilyByteArray", "length", "", "onDecodeTexture", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "maxVersion", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushFamilySerializationNative {
    public static final BrushFamilySerializationNative INSTANCE = new BrushFamilySerializationNative();

    static {
        o000OOoO.OooO00o.f82887OooO00o.OooO00o();
    }

    private BrushFamilySerializationNative() {
    }

    @UsedByNative
    private final native byte[] encode(long nativeBrushFamilyPointer, String[] textureMapKeys, byte[][] textureMapValues);

    @UsedByNative
    private final native byte[] encodeMultiple(long[] nativeBrushFamilyPointers, String[] textureMapKeys, byte[][] textureMapValues);

    @UsedByNative
    public final native long createFromProto(byte[] brushFamilyByteArray, int length, OnDecodeTexturePngBytes onDecodeTexture, int maxVersion);

    public final byte[] encode(long nativeBrushFamilyPointer, Map<String, byte[]> textureMap) {
        Set<String> setKeySet;
        Set<String> setKeySet2;
        byte[][] bArr = null;
        String[] strArr = (textureMap == null || (setKeySet2 = textureMap.keySet()) == null) ? null : (String[]) setKeySet2.toArray(new String[0]);
        if (textureMap != null && (setKeySet = textureMap.keySet()) != null) {
            Set<String> set = setKeySet;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = textureMap.get((String) it.next());
                OooOOO0.OooO0Oo(bArr2);
                arrayList.add(bArr2);
            }
            bArr = (byte[][]) arrayList.toArray(new byte[0][]);
        }
        return encode(nativeBrushFamilyPointer, strArr, bArr);
    }

    public final byte[] encodeMultiple(long[] nativeBrushFamilyPointers, Map<String, byte[]> textureMap) {
        Set<String> setKeySet;
        Set<String> setKeySet2;
        OooOOO0.OooO0oO(nativeBrushFamilyPointers, "nativeBrushFamilyPointers");
        byte[][] bArr = null;
        String[] strArr = (textureMap == null || (setKeySet2 = textureMap.keySet()) == null) ? null : (String[]) setKeySet2.toArray(new String[0]);
        if (textureMap != null && (setKeySet = textureMap.keySet()) != null) {
            Set<String> set = setKeySet;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = textureMap.get((String) it.next());
                OooOOO0.OooO0Oo(bArr2);
                arrayList.add(bArr2);
            }
            bArr = (byte[][]) arrayList.toArray(new byte[0][]);
        }
        return encodeMultiple(nativeBrushFamilyPointers, strArr, bArr);
    }
}
