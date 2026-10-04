package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("href", "notify-on-update-of-ranges", "actuate", "show", C18437z2.f56754h, "id");
    private String zzXOb;
    private zzYQ9 zzXOc;
    private zzYQ7 zzXQE;

    public zzYQS(zzYQ7 zzyq7) throws Exception {
        this.zzXQE = zzyq7;
        zzYvr();
        zzYvq();
        zzYQO zzyqoZzEn = this.zzXQE.zzYuU().zzEn(com.aspose.words.internal.zzZKN.format("/{0}/{1}", this.zzXOb, "content.xml"));
        if (zzyqoZzEn == null) {
            this.zzXQE.zzYuT().zzj();
        } else {
            this.zzXOc = new zzYQ9(zzyqoZzEn.zzYvo());
        }
    }

    private void zzP(CompositeNode compositeNode) {
        if (this.zzXOc == null) {
            return;
        }
        OfficeMath officeMath = new OfficeMath(this.zzXQE.getDocument(), new zzZ02());
        officeMath.appendChild(zzZ0R.zzZ(this.zzXOc, this.zzXQE.getDocument(), this.zzXQE.zzYyZ().getWarningCallback()));
        compositeNode.appendChild(officeMath);
    }

    private zzYQP zzU(zzYQ7 zzyq7, String str) throws Exception {
        zzYQP zzyqp = new zzYQP();
        zzYQO zzyqo = new zzYQO("/META-INF/manifest.xml");
        zzYTG zzytg = new zzYTG(zzyqo, true);
        zzytg.zzYxZ();
        zzytg.zzX("manifest:file-entry", "manifest:media-type", str, "manifest:full-path", "/");
        String str2 = com.aspose.words.internal.zzZKN.format("{0}/", this.zzXOb);
        for (zzYR5 zzyr5 : zzyq7.zzYux()) {
            String strZzYvG = zzyr5.zzYvG();
            int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
            if (!com.aspose.words.internal.zzZKN.zzW(strZzYvG, "manifest.xml", i) && com.aspose.words.internal.zzZKN.zzS(strZzYvG, str2, i)) {
                String strZzT = com.aspose.words.internal.zzZKN.zzT(strZzYvG, 0, str2.length());
                if (com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzS(strZzT, IOUtils.DIR_SEPARATOR_UNIX))) {
                    zzYQO zzyqoZzEl = zzyq7.zzYuU().zzYvp().zzEl(com.aspose.words.internal.zzZKN.format("/{0}", strZzYvG));
                    if (zzyqoZzEl != null) {
                        zzyqp.zzYvp().zzZ(new zzYQO(strZzT, zzyqoZzEl.zzYvo()));
                    }
                    zzytg.zzX("manifest:file-entry", "manifest:media-type", zzyr5.zzYZ5(), "manifest:full-path", strZzT);
                }
            }
        }
        zzytg.endDocument();
        zzyqp.zzYvp().zzZ(zzyqo);
        return zzyqp;
    }

    private void zzYvq() {
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        while (zzyq9ZzYuT.zzQ("object")) {
            if ("math".equals(zzyq9ZzYuT.getLocalName()) || "document".equals(zzyq9ZzYuT.getLocalName())) {
                this.zzXQE.zzZ(1, true, "draw:object");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private void zzYvr() {
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                this.zzXOb = com.aspose.words.internal.zzZKN.zzS(zzyq9ZzYuT.getValue().replace("ObjectReplacements/", "").replace("./", ""), IOUtils.DIR_SEPARATOR_UNIX);
            } else if (iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5) {
                this.zzXQE.zzZ(256, false, "draw:object");
            } else {
                this.zzXQE.zzYi("draw:object", zzyq9ZzYuT.getLocalName());
            }
        }
    }

    public final void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, Shape shape) throws Exception {
        if (this.zzXOc == null) {
            shape.setShapeType(-2);
            zzYTL.zzZ(zzyq7, compositeNode, shape);
            return;
        }
        String strZzN = zzYOU.zzN(zzyq7, com.aspose.words.internal.zzZKN.format("{0}/", this.zzXOb));
        if ("application/vnd.oasis.opendocument.formula".equals(strZzN)) {
            zzP(compositeNode);
        } else {
            zzZ(zzyq7, compositeNode, shape, strZzN);
        }
    }

    private void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, Shape shape, String str) throws Exception {
        if (compositeNode == null || !compositeNode.getChildNodes(0, false).contains(shape)) {
            zzyq7.zzZ(compositeNode, shape);
        }
        shape.setShapeType(-2);
        zzYQP zzyqpZzU = zzU(zzyq7, str);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzyqpZzU.zzZ(zzzor, str, null);
        String strZzFl = zzYS3.zzFl(str);
        shape.getOleFormat().setProgId(strZzFl);
        shape.getOleFormat().zzY(new zzYOC(zzYO6.zzU(strZzFl, zzzor)));
    }
}
