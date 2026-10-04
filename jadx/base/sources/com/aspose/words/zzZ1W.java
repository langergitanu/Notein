package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1W {
    private int zzY3K;
    private NodeCollection zzY3N;
    private NodeCollection zzY3O;
    private zzZ1M zzY4a;
    private ArrayList<zzZ> zzY3M = new ArrayList<>();
    private HashMap<ShapeBase, byte[]> zzY3L = new HashMap<>();

    public static class zzZ {
        String zzY3I;
        String zzY3J;
        String zzYro;

        public zzZ(String str, String str2, String str3) {
            this.zzY3J = str;
            this.zzY3I = str2;
            this.zzYro = str3;
        }
    }

    public zzZ1W(zzZ1M zzz1m) {
        this.zzY4a = zzz1m;
    }

    private byte[] zz5(ShapeBase shapeBase) throws Exception {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzY3L, shapeBase, ref);
        byte[] bArr = (byte[]) ref.get();
        if (zZzZ) {
            return bArr;
        }
        byte[] imageBytes = shapeBase.getNodeType() == 18 ? ((Shape) shapeBase).getImageData().getImageBytes() : null;
        if (imageBytes == null || imageBytes.length == 0) {
            ShapeRenderer shapeRenderer = shapeBase.getShapeRenderer();
            ImageSaveOptions imageSaveOptions = new ImageSaveOptions(101);
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                shapeRenderer.zzZ(zzzor, imageSaveOptions);
                imageBytes = zzzor.zziA();
            } finally {
                zzzor.close();
            }
        }
        byte[] bArrZzW = com.aspose.words.internal.zzIL.zzW(8, imageBytes, imageBytes.length);
        com.aspose.words.internal.zzZQF.zzY(this.zzY3L, shapeBase, bArrZzW);
        return bArrZzW;
    }

    private boolean zz6(ShapeBase shapeBase) throws Exception {
        int i;
        int iZzYHQ = this.zzY4a.zzYHF().zzYHQ();
        if (iZzYHQ == 1) {
            return false;
        }
        if (iZzYHQ == 2 || zzY(shapeBase, "").length() > 0) {
            return true;
        }
        if (shapeBase.getNodeType() == 18) {
            Shape shape = (Shape) shapeBase;
            i = 0;
            for (Shape shape2 : zzYIq()) {
                if (com.aspose.words.internal.zzZKN.equals(shape2.getImageData().getTitle(), shape.getImageData().getTitle()) && com.aspose.words.internal.zzZKN.equals(shape2.getTitle(), shape.getTitle()) && (shape2.getImageData().getImageBytes() == null || shape.getImageData().getImageBytes() == null || shape2.getImageData().getImageBytes().length == shape.getImageData().getImageBytes().length)) {
                    if ((com.aspose.words.internal.zzZYD.zzXk(shape2.getImageData().getSourceFullName()) && com.aspose.words.internal.zzZKN.equals(shape2.getImageData().getSourceFullName(), shape.getImageData().getSourceFullName())) || (!shape2.getImageData().isLinkOnly() && com.aspose.words.internal.zzZ1.zzZ(zz5(shape2), zz5(shape)))) {
                        i++;
                    }
                    if (i > 1) {
                        return true;
                    }
                }
            }
        } else {
            i = 0;
        }
        if (shapeBase.getNodeType() == 17) {
            ShapeBase shapeBase2 = (GroupShape) shapeBase;
            for (ShapeBase shapeBase3 : zzYIp()) {
                if (com.aspose.words.internal.zzZKN.equals(shapeBase3.getTitle(), shapeBase2.getTitle())) {
                    if (com.aspose.words.internal.zzZ1.zzZ(zz5(shapeBase3), zz5(shapeBase2))) {
                        i++;
                    }
                    if (i > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private zzZ zzC(String str, String str2, String str3) {
        for (zzZ zzz : this.zzY3M) {
            if (!com.aspose.words.internal.zzZKN.equals(str, "") && com.aspose.words.internal.zzZKN.equals(zzz.zzY3J, str) && com.aspose.words.internal.zzZKN.equals(zzz.zzYro, str3) && com.aspose.words.internal.zzZKN.equals(zzz.zzY3I, str2)) {
                return zzz;
            }
        }
        return null;
    }

    private static String zzIA(String str) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", '[', str, ']');
    }

    private static boolean zzIz(String str) {
        if (str.length() <= 2) {
            return false;
        }
        int i = com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzS(str, "[", i) && com.aspose.words.internal.zzZKN.zzW(str, "]", i);
    }

    private boolean zzW(zzZQX zzzqx) {
        int iZzYHQ = this.zzY4a.zzYHF().zzYHQ();
        if (iZzYHQ != 0) {
            if (iZzYHQ == 1) {
                return false;
            }
            if (iZzYHQ == 2) {
                return true;
            }
            throw new IllegalStateException("Unexpected link export mode.");
        }
        if (zzX(zzzqx).length() > 0) {
            return true;
        }
        Iterator<Field> it = this.zzY4a.getDocument().zzYBb().getRange().getFields().iterator();
        int i = 0;
        while (it.hasNext()) {
            FieldHyperlink fieldHyperlink = (FieldHyperlink) com.aspose.words.internal.zzZKW.zzZ(it.next(), FieldHyperlink.class);
            if (fieldHyperlink != null) {
                if (com.aspose.words.internal.zzZKN.equals(fieldHyperlink.getAddress(), zzzqx.getHRef()) && com.aspose.words.internal.zzZKN.equals(fieldHyperlink.getScreenTip(), zzzqx.getScreenTip())) {
                    i++;
                }
                if (i > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zzX(zzZQX zzzqx) {
        return zzIz(zzzqx.zzZfi()) ? zzzqx.zzZfi() : "";
    }

    private NodeCollection zzYIp() {
        if (this.zzY3N == null) {
            this.zzY3N = this.zzY4a.getDocument().getChildNodes(17, true);
        }
        return this.zzY3N;
    }

    private NodeCollection zzYIq() {
        if (this.zzY3O == null) {
            this.zzY3O = this.zzY4a.getDocument().getChildNodes(18, true);
        }
        return this.zzY3O;
    }

    private String zzYIr() {
        this.zzY3K++;
        Iterator<T> it = zzYIq().iterator();
        while (it.hasNext()) {
            if (com.aspose.words.internal.zzZKN.zzX(((Shape) it.next()).getName(), com.aspose.words.internal.zzZKN.format("ref{0}", Integer.valueOf(this.zzY3K)), com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                this.zzY3K++;
            }
        }
        return com.aspose.words.internal.zzZKN.format("ref{0}", Integer.valueOf(this.zzY3K));
    }

    private zzZ zzYN(String str, String str2) {
        for (zzZ zzz : this.zzY3M) {
            if (com.aspose.words.internal.zzZKN.equals(zzz.zzYro, str2) && com.aspose.words.internal.zzZKN.equals(zzz.zzY3I, str)) {
                return zzz;
            }
        }
        return null;
    }

    public final void zzD(String str, String str2, String str3) {
        zzZ zzzZzYN = zzYN(str2, str3);
        if (zzzZzYN != null) {
            zzzZzYN.zzY3J = str;
        }
    }

    public final boolean zzE(String str, String str2, String str3) {
        return zzC(str, str2, str3) != null;
    }

    public final void zzY(zzZQX zzzqx) {
        if (zzW(zzzqx)) {
            String strZzX = zzX(zzzqx);
            zzZ zzzZzYN = com.aspose.words.internal.zzZKN.equals(strZzX, "") ? zzYN(zzzqx.getHRef(), zzzqx.getScreenTip()) : zzC(strZzX, zzzqx.getHRef(), zzzqx.getScreenTip());
            if (zzzZzYN == null) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzY3M, new zzZ(strZzX, zzzqx.getHRef(), zzzqx.getScreenTip()));
            } else {
                if (com.aspose.words.internal.zzZYD.zzXk(zzzqx.zzZfi())) {
                    return;
                }
                zzzqx.zzM6(zzzZzYN.zzY3J);
            }
        }
    }

    public final boolean zzYO(String str, String str2) {
        return zzYN(str, str2) != null;
    }

    public final void zzZ(ShapeBase shapeBase, String str) throws Exception {
        if (zz6(shapeBase)) {
            String strZzY = zzY(shapeBase, str);
            String title = shapeBase.getTitle();
            if (shapeBase.getNodeType() == 18 && !com.aspose.words.internal.zzZYD.zzXk(title)) {
                title = ((Shape) shapeBase).getImageData().getTitle();
            }
            zzZ zzzZzYN = com.aspose.words.internal.zzZKN.equals(strZzY, "") ? zzYN(str, title) : zzC(strZzY, str, title);
            if (!com.aspose.words.internal.zzZYD.zzXk(strZzY)) {
                strZzY = com.aspose.words.internal.zzZYD.zzXk(shapeBase.getAlternativeText()) ? zzIA(shapeBase.getAlternativeText()) : zzIA(zzYIr());
            }
            if (zzzZzYN == null) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzY3M, new zzZ(strZzY, str, title));
            }
        }
    }

    public final String zzY(ShapeBase shapeBase, String str) {
        if (zzIz(shapeBase.getName())) {
            return shapeBase.getName();
        }
        if (zzYO(str, shapeBase.getTitle())) {
            return zzYN(str, shapeBase.getTitle()).zzY3J;
        }
        return "";
    }

    public final void zzZ(zzZ1M zzz1m) throws Exception {
        String str;
        if (this.zzY3M.size() > 0 && !com.aspose.words.internal.zzZKN.zzW(zzz1m.zzZeE().toString(), com.aspose.words.internal.zzZKN.format("{0}{0}", com.aspose.words.internal.zzZYD.getNewLine()), com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8)) {
            zzz1m.zzZeE().append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        for (zzZ zzz : this.zzY3M) {
            String str2 = zzz.zzY3J;
            if (com.aspose.words.internal.zzZYD.zzXe(zzz.zzY3I) < 0 && !com.aspose.words.internal.zzZYD.zzX(zzz.zzY3I, "%20", true)) {
                str = zzz.zzY3I;
            } else {
                str = com.aspose.words.internal.zzZKN.format("<{0}>", zzz.zzY3I);
            }
            String str3 = zzz.zzYro;
            if (str3.length() > 0) {
                str3 = com.aspose.words.internal.zzZKN.format(" \"{0}\"", str3);
            }
            com.aspose.words.internal.zzZNH.zzV(zzz1m.zzZeE(), com.aspose.words.internal.zzZKN.format("{0}: {1}{2}", str2, str, str3));
        }
    }
}
