package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZC extends zzZZA {
    private boolean zzYUA;
    private Document zzYUB;
    private boolean zzYUu;
    private zzZTI zzYUv;
    private zzYMY zzYUw;
    private zzYEC zzYUx;
    private zzYCY zzYUy;
    private zzZBV zzYUz;
    private LoadOptions zzYWO;
    private DocumentBase zzZG3;

    public zzZZC(com.aspose.words.internal.zzKD zzkd, Document document, LoadOptions loadOptions, boolean z) throws Exception {
        super(zzkd, loadOptions.getPassword(), loadOptions.getWarningCallback());
        this.zzYUA = false;
        this.zzZG3 = document;
        this.zzYUz = new zzYXH(document, zzZrw(), loadOptions);
        this.zzYWO = loadOptions;
        this.zzYUA = z;
    }

    private zzYOC zzGg(int i) throws Exception {
        long position = zzZrx().zzq().getPosition();
        zzZrx().zzq().zzH(i);
        if (zzZrx().zzXa() != 8) {
            zzY("Unrecognized binary data.", new Object[0]);
            return null;
        }
        int iZzXa = zzZrx().zzXa() & 1;
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(zzZrx().zzn(zzZrx().zzXc() - 8));
        zzZrx().zzq().zzH(position);
        if (iZzXa > 0) {
            zzzor = zzT(zzzor);
        }
        return new zzYOC(new com.aspose.words.internal.zzKD(zzzor).zzIf());
    }

    private String zzL(ArrayList<String> arrayList, int i) {
        if (i >= 0 && i <= arrayList.size() - 1) {
            return arrayList.get(i);
        }
        zzY1Z.zzZ(this.zzYWO.getWarningCallback(), 10, "Invalid associated string requested for 0x{0:x4}, replaced with empty string.", Integer.valueOf(i));
        return "";
    }

    private static com.aspose.words.internal.zzZOR zzT(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        zzzor.zzH(4L);
        byte[] bArrZzZ = com.aspose.words.internal.zzZRV.zzZ(zzzor, 0, 1);
        zzzor.dispose();
        return new com.aspose.words.internal.zzZOR(bArrZzZ);
    }

    private void zzY(String str, Object... objArr) {
        zzY1Z.zzZ(this.zzYWO.getWarningCallback(), 10, str, objArr);
    }

    private void zzZrG() throws Exception {
        if (zzZrw().zzYGE.zzXza.zzYHJ == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        zzY91.zzY(zzZry(), zzZrw().zzYGE.zzXza, arrayList);
        this.zzZG3.zzZpV().zzYUO = arrayList.size();
    }

    private void zzZrH() throws Exception {
        if (zzZrw().zzYGE.zzXA9.zzYHJ == 0) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        zzY91.zzY(zzZry(), zzZrw().zzYGE.zzXA9, arrayList);
        zzZZF zzzzfZzZpV = this.zzZG3.zzZpV();
        zzzzfZzZpV.zzYWn = zzL(arrayList, 1);
        if (zzZrw().zzYHp) {
            zzzzfZzZpV.zzYW5.setPassword(zzL(arrayList, 17));
        }
    }

    private void zzZrI() throws Exception {
        if (zzZrw().zzYGB.zzXyo.zzYHJ == 0) {
            return;
        }
        zzZry().zzq().zzH(zzZrw().zzYGB.zzXyo.zzYHK);
        this.zzZG3.zzZpV().zzYVo = com.aspose.words.internal.zzZO0.zzhU().zzZn(zzZry().zzn(zzZrw().zzYGB.zzXyo.zzYHJ));
    }

    private void zzZrJ() throws Exception {
        if (zzZrw().zzYGC.zzXyP.zzYHJ == 0) {
            return;
        }
        zzZry().zzq().zzH(zzZrw().zzYGC.zzXyP.zzYHK);
        int iZzXc = zzZry().zzXc();
        zzZry().zzXc();
        zzZry().zzXc();
        zzZry().zzXc();
        zzZry().zzXc();
        zzZry().zzXc();
        for (int i = 0; i < iZzXc; i++) {
            zzZrE().zzZpV().zzYVj.add(Integer.valueOf(zzZry().zzXc()));
        }
    }

    private void zzZrK() {
        Iterator<T> it = zzZrE().getSections().iterator();
        while (it.hasNext()) {
            this.zzZG3.zzZpV().zzYVh.zzY(((Section) it.next()).zzYvR());
        }
    }

    public final DocumentBase getDocument() {
        return this.zzZG3;
    }

    public final IDocumentLoadingCallback getProgressCallback() {
        return this.zzYWO.getProgressCallback();
    }

    public final zzYOC zzGh(int i) throws Exception {
        com.aspose.words.internal.zzAA<Map.Entry> zzaaZzYr = zzZrA().zzIf().zzYr("ObjectPool");
        if (zzaaZzYr == null) {
            if (this.zzYUA) {
                return zzGg(i);
            }
            zzY("Document 'ObjectPool' stream is missed, OLE objects will be lost.", new Object[0]);
            return null;
        }
        for (Map.Entry entry : zzaaZzYr) {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(com.aspose.words.internal.zzZKN.zzU((String) entry.getKey(), '_'));
            if (iZzZo != Integer.MIN_VALUE && iZzZo == i) {
                return new zzYOC(i, (com.aspose.words.internal.zzAA) entry.getValue());
            }
        }
        zzY(com.aspose.words.internal.zzZKN.format("Embedded OLE object data is missed for ObjectID: 0x{0:x4}.", Integer.valueOf(i)), new Object[0]);
        return null;
    }

    public final Shape zzGi(int i) throws Exception {
        return zzZT1.zzZ(this.zzYUv, zzZrx(), i, this.zzYWO.getWarningCallback());
    }

    public final zzYCZ zzGj(int i) throws Exception {
        int iZzTh = zzZrn().zzTh(i);
        if (iZzTh < 0) {
            return null;
        }
        zzYCQ zzycq = zzZrn().get(iZzTh);
        zzYCZ zzycz = new zzYCZ();
        zzYE1 zzye1 = zzycq.zzXnH;
        if (zzye1 != null) {
            this.zzYUy.zzZ(zzye1.getData(), zzycz);
        }
        int iZzMT = zzZrv().zzMT(zzZrn().zzTe(iZzTh + 1) - 1);
        if (iZzMT != -1) {
            this.zzYUy.zzZ(zzZrv().zzMS(iZzMT).zzZYF().getData(), zzycz);
        }
        return zzycz;
    }

    public final void zzIh() throws Exception {
        while (true) {
            if (!this.zzYWO.zzZrB()) {
                zzZN4.zzZ(this.zzZG3.getFontInfos(), zzZrw(), zzZry(), zzZrz(), this.zzYWO.getWarningCallback());
            }
            zzZZB zzzzbZzZ = zzZZB.zzZ(zzZrx(), this.zzZG3.getFontInfos(), new zzYJD(zzZrw(), zzZry()), zzZrw().zzYHB, this.zzYWO.getWarningCallback());
            zzzzbZzZ.zzYUp = this.zzYWO;
            this.zzYUy = new zzYCY(zzzzbZzZ);
            this.zzYUx = new zzYEC(zzzzbZzZ);
            this.zzYUw = new zzYMY(zzzzbZzZ);
            zzZTI zzzti = new zzZTI(zzZrE(), this.zzYWO.getWarningCallback());
            this.zzYUv = zzzti;
            zzzti.zzZ(zzZry(), zzZrw().zzYGE.zzXzR.zzYHK, zzZrw().zzYGE.zzXzR.zzYHJ, zzZrz());
            if (Shape.zzZG(this.zzYUv.getBackgroundShape())) {
                this.zzZG3.zzO(this.zzYUv.getBackgroundShape());
            }
            if (!this.zzYWO.zzZrB()) {
                new zzY8K(zzzzbZzZ, this.zzZG3.getStyles()).zzZ(zzZry(), zzZrw());
                zzZ44 zzz44 = new zzZ44(zzzzbZzZ, this.zzZG3.getLists());
                zzz44.zzZ(zzZrw(), zzZry());
                zzZrE().zzZ(zzZW0.zzZ(zzZrw(), zzZry(), this.zzZG3.getLists()));
                zzz44.zzYNU();
                zzZZJ.zzZ(zzZrw(), zzZry(), this.zzZG3.zzZq2());
            }
            if (this.zzZG3.getNodeType() == 1) {
                zzZZE.zzZ(zzZry(), zzZrw().zzYGE.zzXAa, (Document) this.zzZG3, zzzzbZzZ);
            }
            this.zzZG3.zzZpV().zzYW5.setReadOnlyRecommended(zzZrw().zzYHq);
            if (zzZrw().zzYGE.zzYkI() && !zzZRA.zzDL(zzZrw().zzYHB)) {
                zzZrE().zzZ(new zzYII(zzZrw(), zzZry(), this.zzZG3.zzZpV().zzYVi));
            }
            zzY92 zzy92 = new zzY92();
            zzy92.zzT(zzZry(), zzZrw().zzYGE.zzXzv.zzYHK, zzZrw().zzYGE.zzXzv.zzYHJ);
            new zzZ2J().zzZ(zzZry(), zzZrw(), zzy92, this.zzZG3.zzZpV().zzYWd);
            zzZrj().zzZ(zzy92, zzZrE().getOriginalFileName());
            if (this.zzZG3.getNodeType() == 1) {
                new zzZZD(this.zzYWO.getWarningCallback()).zzZ(zzZrA().zzIf(), zzZrE().getBuiltInDocumentProperties(), zzZrE().getCustomDocumentProperties());
            }
            zzZrI();
            zzZrH();
            zzZrG();
            zzZry().zzq().zzH(zzZrw().zzYGE.zzXzW.zzYHK);
            zzZrE().zzYr(zzZry().zzn(zzZrw().zzYGE.zzXzW.zzYHJ));
            zzZry().zzq().zzH(zzZrw().zzYGE.zzXAh.zzYHK);
            zzY67 zzy67 = new zzY67();
            if (zzZry().zzq().getPosition() < zzZry().zzq().getLength() && !zzZRA.zzDL(zzZrw().zzYHB)) {
                zzy67.zzZ(zzZry(), zzZrw().zzYGE.zzXAh.zzYHJ, zzZrE());
            }
            byte[] bArrZzZ = !zzZRA.zzDL(zzZrw().zzYHB) ? zzY3O.zzZ(zzZrw(), zzZry(), zzZrE()) : null;
            zzZrE().zzS(zzZrA().zzIf().zzYu("\u0001CompObj"));
            zzZrE().zzZ(zzZrA().zzIf().zzYr("Macros"), bArrZzZ);
            if (zzZrE().getVbaProject() != null && zzy67.zzXWD().size() > 0) {
                zzZrE().getVbaProject().zzYU(zzy67.zzXWD());
            }
            if (zzZrw().zzYGD.zzXz5.zzYHJ > 0) {
                zzZRG zzzrg = zzZrw().zzYGD.zzXz5;
                zzZry().zzq().zzH(zzzrg.zzYHK);
                zzZrE().zzYq(zzZry().zzn(zzzrg.zzYHJ));
            }
            zzZrJ();
            if (this.zzYWO.zzYNE() && zzZrw().zzYGA.zzXxK.zzYHJ > 0) {
                zzZry().zzq().zzH(zzZrw().zzYGA.zzXxK.zzYHK);
                zzZ5X.zzY(zzZrE(), zzZry().zzn(zzZrw().zzYGA.zzXxK.zzYHJ));
            }
            if (zzZRA.zzDL(zzZrw().zzYHB) && zzZrw().zzYHz == 1033) {
                zzYEF zzyefZzZYh = this.zzZG3.getStyles().getByStyleIdentifier(0).zzZYh();
                if (zzyefZzZYh.contains(380)) {
                    zzT(com.aspose.words.internal.zzZO0.zzQz(com.aspose.words.internal.zzT8.zzYS(zzyefZzZYh.getLocaleId())));
                }
            }
            new zzYME(this).zz0P();
            if (zzZrw().zzYHB <= 217) {
                zzZrK();
            }
            zzYBF.zzZ(zzZrA(), zzZrE().getDigitalSignatures(), this.zzYWO.getWarningCallback());
            zzKN.zzZ(zzZrA(), zzZrE().getCustomXmlParts(), this.zzYWO.getWarningCallback());
            if (zzZrw().zzYHy <= 0) {
                return;
            }
            Document document = (Document) this.zzZG3;
            this.zzYUB = document;
            document.setGlossaryDocument(new GlossaryDocument());
            zzE(zzZrw().zzYHy * 512, this.zzYWO.getPassword());
            this.zzZG3 = this.zzYUB.getGlossaryDocument();
            this.zzYUz = new zzYXH(this.zzYUB.getGlossaryDocument(), zzZrw(), this.zzYWO);
        }
    }

    public final void zzWC(boolean z) {
        this.zzYUu = z;
    }

    public final ShapeBase zzXX(int i, int i2) {
        return this.zzYUv.zzXX(i, i2);
    }

    public final zzYMW zzZ(int i, zzZLN zzzln) throws Exception {
        this.zzYUw.zzZ(zzZrm().get(zzZrm().zzTi(i)), zzzln.getData());
        return new zzYMW(this.zzYUw.zzZYj(), this.zzYUw.zzYpO(), this.zzYUw.zzZYf());
    }

    public final boolean zzZrC() {
        return this.zzYUu;
    }

    public final zzZBV zzZrD() {
        return this.zzYUz;
    }

    public final Document zzZrE() {
        Document document = this.zzYUB;
        return document != null ? document : (Document) this.zzZG3;
    }

    public final boolean zzZrF() {
        return zzZrn().getItemCount() > 0 && zzZrn().get(zzZrn().getItemCount() - 1).zzXnJ == 1;
    }

    public final int zzZ(int i, zzZLN zzzln, Ref<zzYEF> ref, Ref<zzYE5> ref2) throws Exception {
        ref.set(new zzYEF());
        ref2.set(new zzYE5());
        if (!zzZrl().isValid()) {
            return zzZrw().zzYH9;
        }
        int iZzTi = zzZrl().zzTi(i);
        this.zzYUx.zzZ(zzZrl().get(iZzTi).getData(), ref.get(), ref2.get());
        this.zzYUx.zzZ(zzzln.getData(), ref.get(), ref2.get());
        return zzZrl().zzTe(iZzTi + 1);
    }
}
