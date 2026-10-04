package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYU7 extends ArrayList<zzYU8> {
    public final void zzZ(zzZ9Y zzz9y) {
        for (zzYU8 zzyu8 : this) {
            Style style = zzyu8.zzXSA;
            if (zzyu8.zzXSz != null && style.getStyleIdentifier() != 0) {
                style.zzl5(zzz9y.zzJ(zzyu8.zzXSz, StyleIdentifier.NIL));
            }
            Object obj = zzyu8.zzXSy;
            if (obj != null) {
                style.zzl4(zzz9y.zzJ(obj, style.zzZ7j()));
            }
            Object obj2 = zzyu8.zzXSx;
            if (obj2 != null) {
                style.zzl3(zzz9y.zzJ(obj2, StyleIdentifier.NIL));
            }
        }
    }
}
