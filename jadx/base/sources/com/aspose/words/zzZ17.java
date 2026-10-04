package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ17 extends zzZ0L {
    public zzZ17(zzZ14 zzz14, zzZ0M zzz0m, OfficeMath officeMath) {
        super(zzz14, zzz0m, officeMath);
    }

    private boolean zzYH3() {
        return zzQw().size() == 1;
    }

    private void zzYH4() {
        if (((zzZ18) zzYFl()).zzYH5()) {
            return;
        }
        if (zzYH3()) {
            ((zzZ18) zzYFl()).zzYr(Math.max(((zzZ18) zzYFl()).zzYH8(), zzQw().get(0).zzZj().getWidth()));
            return;
        }
        float width = zzQw().get(0).zzZj().getWidth();
        float width2 = zzQw().get(1).zzZj().getWidth();
        if (width + width2 < ((zzZ18) zzYFl()).zzYH6()) {
            return;
        }
        ((zzZ18) zzYFl()).zzYH7()[0] = width;
        ((zzZ18) zzYFl()).zzYH7()[1] = width2;
    }

    @Override // com.aspose.words.zzZ0L, com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        for (int i = 0; i < zzQw().size(); i++) {
            zzZ13 zzz13 = zzQw().get(i);
            zzz13.zzZE4();
            zzYFl().zzX(zzYH3() ? 0.0f : zzz13.zzZj().getWidth(), zzz13.zzYGo(), i);
            zzV(zzz13);
        }
        zzYH4();
    }

    @Override // com.aspose.words.zzZ0L
    public final float zzZ(int i, zzZ13 zzz13) {
        return zzYH3() ? Math.max(0.0f, (((zzZ18) zzYFl()).zzYH6() - zzz13.zzZj().getWidth()) / 2.0f) : super.zzZ(i, zzz13);
    }

    @Override // com.aspose.words.zzZ0L
    public final int zzuU(int i) {
        return (zzYH3() || i >= 2) ? super.zzuU(i) : i == 0 ? 3 : 2;
    }
}
