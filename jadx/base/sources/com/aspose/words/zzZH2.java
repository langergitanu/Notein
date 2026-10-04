package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZH2 {
    private zzZHJ zzYpO;
    private String zzYpu;
    private String zzYpv;
    private zzZDT zzYrZ;
    private zzZE7 zzZEa;

    public zzZH2(zzZE7 zzze7, zzZHJ zzzhj, zzZDT zzzdt, String str, String str2) {
        this.zzZEa = zzze7;
        this.zzYpO = zzzhj;
        this.zzYrZ = zzzdt;
        this.zzYpv = str;
        this.zzYpu = str2;
    }

    private void zzS(Frameset frameset) throws Exception {
        frameset.zzZ5x();
        this.zzZEa.zzZN(TranslateLanguage.TURKISH, 0);
        for (int i = 0; i < frameset.getChildFramesets().getCount(); i++) {
            Frameset frameset2 = frameset.getChildFramesets().get(i);
            this.zzZEa.zzZN("td", 0);
            zzLU zzlu = new zzLU();
            zzlu.zzZs("vertical-align", "top");
            zzZ(frameset2, zzlu);
            double dZzZ = zzZ(frameset.getChildFramesets(), i);
            if (!com.aspose.words.internal.zzAN.zzZD(dZzZ)) {
                zzlu.zzY(zzL4.zzZlv, new zzOI(dZzZ, 4));
            }
            if (zzlu.getCount() != 0) {
                this.zzZEa.zzH(zzlu.zzZWe());
            }
            if (frameset2.zzZ5x()) {
                zzW(frameset2);
            } else {
                zzV(frameset2);
            }
            this.zzZEa.endElement("td");
        }
        this.zzZEa.endElement(TranslateLanguage.TURKISH);
    }

    private void zzT(Frameset frameset) throws Exception {
        frameset.zzZ5x();
        for (int i = 0; i < frameset.getChildFramesets().getCount(); i++) {
            Frameset frameset2 = frameset.getChildFramesets().get(i);
            this.zzZEa.zzZN(TranslateLanguage.TURKISH, 0);
            this.zzZEa.zzZN("td", 0);
            zzLU zzlu = new zzLU();
            zzlu.zzZs("vertical-align", "top");
            zzY(frameset2, zzlu);
            double dZzZ = zzZ(frameset.getChildFramesets(), i);
            if (!com.aspose.words.internal.zzAN.zzZD(dZzZ)) {
                zzlu.zzX(zzL4.zzZlv, new zzOI(dZzZ, 4));
            }
            if (zzlu.getCount() != 0) {
                this.zzZEa.zzH(zzlu.zzZWe());
            }
            if (frameset2.zzZ5x()) {
                zzW(frameset2);
            } else {
                zzV(frameset2);
            }
            this.zzZEa.endElement("td");
            this.zzZEa.endElement(TranslateLanguage.TURKISH);
        }
    }

    private void zzV(Frameset frameset) throws Exception {
        this.zzZEa.zzZN("iframe", 0);
        this.zzZEa.zzX("class", this.zzYpu);
        zzLU zzlu = new zzLU();
        zzlu.zzZs("border", "none");
        if (com.aspose.words.internal.zzZYD.zzXk(frameset.getTitle())) {
            this.zzZEa.zzX(NoteMeta.PROPERTY_TITLE, frameset.getTitle());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(frameset.getName())) {
            this.zzZEa.zzX("name", frameset.getName());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(frameset.getFrameDefaultUrl())) {
            this.zzZEa.zzX("src", com.aspose.words.internal.zzZOQ.zzVh(zzZDZ.zzJX(this.zzYpO.zzX(frameset))));
        }
        if (frameset.zzZ5B() > 0) {
            zzlu.zzZ("margin-left", com.aspose.words.internal.zzSA.pixelToPoint(frameset.zzZ5B()), 4);
            zzlu.zzZ("margin-right", com.aspose.words.internal.zzSA.pixelToPoint(frameset.zzZ5B()), 4);
        }
        if (frameset.zzZ5A() > 0) {
            zzlu.zzZ("margin-top", com.aspose.words.internal.zzSA.pixelToPoint(frameset.zzZ5A()), 4);
            zzlu.zzZ("margin-bottom", com.aspose.words.internal.zzSA.pixelToPoint(frameset.zzZ5A()), 4);
        }
        if (!frameset.zzZ5y()) {
            this.zzYrZ.zzT(WarningType.HINT, "Frame.NoResize property doesn't have a counterpart in iframe HTML element and has been ignored.");
        }
        if (frameset.zzZ5z() != 0) {
            this.zzYrZ.zzT(WarningType.HINT, "Frame.ScrollType property doesn't have a counterpart in iframe HTML5 element and has been ignored.");
        }
        this.zzZEa.zzH(zzlu.zzZWe());
        this.zzZEa.endElement("iframe");
    }

    private void zzW(Frameset frameset) throws Exception {
        frameset.zzZ5x();
        this.zzZEa.zzZN("table", 0);
        this.zzZEa.zzX("class", this.zzYpv);
        int iZz6y = frameset.zz6y();
        if (iZz6y == 0) {
            zzT(frameset);
        } else if (iZz6y == 1) {
            zzS(frameset);
        }
        this.zzZEa.endElement("table");
    }

    private static void zzY(Frameset frameset, zzLU zzlu) {
        int iZzZ5D = frameset.zzZ5D();
        if (iZzZ5D == 0 || iZzZ5D == 1) {
            zzlu.zzZ("height", frameset.zzZ5C(), 6);
        } else {
            if (iZzZ5D != 2) {
                return;
            }
            zzlu.zzU("height", frameset.zzZ5C());
        }
    }

    private static void zzZ(Frameset frameset, zzLU zzlu) {
        int iZzZ5D = frameset.zzZ5D();
        if (iZzZ5D == 0 || iZzZ5D == 1) {
            zzlu.zzZ("width", frameset.zzZ5C(), 6);
        } else {
            if (iZzZ5D != 2) {
                return;
            }
            zzlu.zzU("width", frameset.zzZ5C());
        }
    }

    public final void zzp(Document document) throws Exception {
        document.getFrameset();
        zzW(document.getFrameset());
    }

    private static double zzZ(FramesetCollection framesetCollection, int i) {
        int iZzZ5u;
        double d = 0.0d;
        if (i == framesetCollection.getCount() - 1) {
            return 0.0d;
        }
        Frameset frameset = framesetCollection.get(i);
        if (frameset.zzZ5t()) {
            iZzZ5u = frameset.zzZ5u();
        } else {
            int i2 = i + 1;
            if (i2 < framesetCollection.getCount()) {
                Frameset frameset2 = framesetCollection.get(i2);
                if (frameset2.zzZ5t()) {
                    iZzZ5u = frameset2.zzZ5u();
                }
            }
            return d / 20.0d;
        }
        d = iZzZ5u;
        return d / 20.0d;
    }
}
