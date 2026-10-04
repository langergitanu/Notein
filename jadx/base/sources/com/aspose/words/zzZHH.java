package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHH {
    private zzZHJ zzYpO;
    private zzZE7 zzZEa;

    public zzZHH(zzZE7 zzze7, zzZHJ zzzhj) {
        this.zzZEa = zzze7;
        this.zzYpO = zzzhj;
    }

    private static String zzU(Frameset frameset) {
        int iZzZ5D = frameset.zzZ5D();
        if (iZzZ5D == 0) {
            return com.aspose.words.internal.zzJB.zzWD(frameset.zzZ5C());
        }
        if (iZzZ5D == 1) {
            return com.aspose.words.internal.zzJB.zzWD(frameset.zzZ5C()) + "px";
        }
        if (iZzZ5D != 2) {
            return C18358t1.g.f56183c;
        }
        return com.aspose.words.internal.zzJB.zzWD(frameset.zzZ5C()) + "%";
    }

    private void zzV(Frameset frameset) throws Exception {
        this.zzZEa.zzZN("frame", 1);
        if (com.aspose.words.internal.zzZYD.zzXk(frameset.getTitle())) {
            this.zzZEa.zzX(NoteMeta.PROPERTY_TITLE, frameset.getTitle());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(frameset.getName())) {
            this.zzZEa.zzX("name", frameset.getName());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(frameset.getFrameDefaultUrl())) {
            this.zzZEa.zzX("src", com.aspose.words.internal.zzZOQ.zzVh(this.zzYpO.zzX(frameset)));
        }
        if (frameset.zzZ5B() > 0) {
            this.zzZEa.zzZD("marginwidth", frameset.zzZ5B());
        }
        if (frameset.zzZ5A() > 0) {
            this.zzZEa.zzZD("marginheight", frameset.zzZ5A());
        }
        if (frameset.zzZ5w() != 0 && frameset.zzZ5u() > 0) {
            this.zzZEa.zzZD("frameborder", 1);
        }
        if (frameset.zzZ5y()) {
            this.zzZEa.zzX("noresize", "noresize");
        }
        int iZzZ5z = frameset.zzZ5z();
        if (iZzZ5z == 1) {
            this.zzZEa.zzX("scrolling", "yes");
        } else if (iZzZ5z == 2) {
            this.zzZEa.zzX("scrolling", TranslateLanguage.NORWEGIAN);
        }
        this.zzZEa.endElement("frame");
    }

    private void zzW(Frameset frameset) throws Exception {
        frameset.zzZ5x();
        this.zzZEa.zzZN("frameset", 0);
        zzZDN zzzdnZzYXX = this.zzZEa.zzYXX();
        String strZzZI = "";
        for (Frameset frameset2 : frameset.getChildFramesets()) {
            String strZzU = zzU(frameset2);
            if (strZzZI.length() != 0) {
                strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, ",");
            }
            strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, strZzU);
            if (frameset2.zzZ5x()) {
                zzW(frameset2);
            } else {
                zzV(frameset2);
            }
        }
        int iZz6y = frameset.zz6y();
        if (iZz6y == 0) {
            zzzdnZzYXX.zzYXj().zzZ(new zzZDQ("rows", strZzZI));
        } else if (iZz6y == 1) {
            zzzdnZzYXX.zzYXj().zzZ(new zzZDQ("cols", strZzZI));
        }
        this.zzZEa.endElement("frameset");
    }

    public final void zzp(Document document) throws Exception {
        document.getFrameset();
        zzW(document.getFrameset());
    }
}
