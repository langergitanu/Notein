package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWM implements zzF8 {
    public static zzZWM zz8Q = new zzZWM();

    @Override // com.aspose.words.internal.zzF8
    public final Cluster[] zzZ(String str, zzPM zzpm, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList(str.length());
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            if (z && !zzZVS.zzS4(iIntValue)) {
                iIntValue = zzY7.zzW((char) iIntValue);
            }
            zzZX9 zzzx9ZzSx = zzpm.zzPl().zzpP().zzSx(iIntValue);
            zzZQG.zzZ((ArrayList<Cluster>) arrayList, new Cluster(new int[]{iIntValue}, new Glyph[]{new Glyph(zzzx9ZzSx.getGlyphIndex(), (short) zzzx9ZzSx.zzoZ(), (short) 0, (short) 0)}));
        }
        return (Cluster[]) arrayList.toArray(new Cluster[0]);
    }
}
