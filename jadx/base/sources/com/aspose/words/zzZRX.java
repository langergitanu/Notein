package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRX extends zzZRS {
    private Shape zzZ2R;

    public zzZRX(Document document, Shape shape) {
        super(document);
        this.zzZ2R = shape;
        zzz(document);
    }

    private void zzZ(Document document, ChartAxis chartAxis) {
        if (chartAxis == null || chartAxis.zz48() == null) {
            return;
        }
        appendChild(new zzZRW(document, chartAxis.zz48()));
    }

    private void zzZhg() {
        zzZRT zzzrt = (zzZRT) getFirstChild();
        zzzrt.zzX(this.zzZ2R.getChart().getTitle().zz3F());
        Node nextSibling = zzzrt.getNextSibling();
        for (zzGK zzgk : zzYJL.zzZS(this.zzZ2R)) {
            nextSibling = zzZ(zzgk.getAxisZ(), zzZ(zzgk.getAxisY(), zzZ(zzgk.getAxisX(), nextSibling)));
            Iterator<ChartSeries> it = zzgk.zzZPj().iterator();
            while (it.hasNext()) {
                ((zzZRV) nextSibling).zzA(it.next());
                nextSibling = nextSibling.getNextSibling();
            }
        }
    }

    private void zzz(Document document) {
        appendChild(new zzZRT(document, this.zzZ2R.getChart().getTitle().zz3F()));
        for (zzGK zzgk : zzYJL.zzZS(this.zzZ2R)) {
            zzZ(document, zzgk.getAxisX());
            zzZ(document, zzgk.getAxisY());
            zzZ(document, zzgk.getAxisZ());
            Iterator<ChartSeries> it = zzgk.zzZPj().iterator();
            while (it.hasNext()) {
                appendChild(new zzZRV(document, it.next()));
            }
        }
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return node instanceof zzZRU;
    }

    @Override // com.aspose.words.zzZRS
    public final int zzZhe() {
        return 0;
    }

    @Override // com.aspose.words.zzZRS
    public final Node zzZhf() {
        return this.zzZ2R;
    }

    @Override // com.aspose.words.zzZRS
    public final void zzf(Node node) {
        this.zzZ2R = (Shape) node;
        zzZhg();
    }

    private static Node zzZ(ChartAxis chartAxis, Node node) {
        if (chartAxis == null || chartAxis.zz48() == null) {
            return node;
        }
        ((zzZRT) node).zzX(chartAxis.zz48());
        return node.getNextSibling();
    }
}
