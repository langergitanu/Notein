package com.aspose.words;

import androidx.appcompat.widget.C21559Oooo0oO;
import com.aspose.words.ref.Ref;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldMergeField extends Field implements zzZBA {
    private MergeFieldImageDimension zzYDn;
    private MergeFieldImageDimension zzYDo;
    private int zzYDp;
    private boolean zzYDq;
    private String zzYDr;
    private String zzZpC;
    private static com.aspose.words.internal.zzZNR zzYDm = new com.aspose.words.internal.zzZNR("\\Aimage(\\s*\\(\\s*(((.+?)\\s*(pt|%|)\\s*;\\s*(.+?)\\s*(pt|%|))|.*?)\\s*\\)\\s*)??\\z", 66);
    private static char[] zzYDl = {':', '_'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\m", "\\v", "\\b", "\\f");

    public FieldMergeField() {
        this(false);
    }

    public static zzZAA zzL(Field field) throws Exception {
        zzZAA zzzaa = (zzZAA) com.aspose.words.internal.zzZKW.zzZ(field, zzZAA.class);
        if (zzzaa == null || !zzzaa.canWorkAsMergeField()) {
            return null;
        }
        return zzzaa;
    }

    public static boolean zzLT(String str) {
        return com.aspose.words.internal.zzZKN.zzZ(str, zzYDl) != -1;
    }

    private zzZP6 zzY(zzZ2H zzz2h, MailMerge mailMerge) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzZ = null;
        Ref<ImageFieldMergingArgs> ref = new Ref<>(null);
        boolean zZzY = zzz2h.zzY(this, ref);
        ImageFieldMergingArgs imageFieldMergingArgs = ref.get();
        Object fieldValue = imageFieldMergingArgs.getFieldValue();
        if (isRemoved()) {
            return null;
        }
        if (imageFieldMergingArgs.getShape() != null) {
            zzYZH.zzY(this, mailMerge);
            return new zzZP0(this, imageFieldMergingArgs.getShape());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(imageFieldMergingArgs.getImageFileName())) {
            zzzopZzZ = zzZ8I.zzY(imageFieldMergingArgs.getImageFileName(), getStart().getDocument());
        } else if (imageFieldMergingArgs.zzYVV() != null) {
            zzzopZzZ = imageFieldMergingArgs.zzYVV();
        } else if (imageFieldMergingArgs.getImage() != null) {
            zzzopZzZ = new com.aspose.words.internal.zzZOR();
            com.aspose.words.internal.zzXN.zzZ(imageFieldMergingArgs.getImage(), zzzopZzZ);
        } else {
            if (!zZzY) {
                return zzZ(mailMerge);
            }
            if (fieldValue != null && !com.aspose.words.internal.zzZQB.zz1(fieldValue)) {
                try {
                    zzzopZzZ = zzZ(fieldValue, imageFieldMergingArgs);
                    if (zzzopZzZ == null) {
                        return zzZ(mailMerge);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Cannot load image from field '{0}'. The field contains data in unsupported format. {1}", imageFieldMergingArgs.getDocumentFieldName(), e.getMessage()));
                }
            }
        }
        zzYZH.zzY(this, mailMerge);
        return new zzZP1(this, zzzopZzZ, imageFieldMergingArgs.getImageWidth(), imageFieldMergingArgs.getImageHeight());
    }

    public static FieldMergeField zzZ(zzZAA zzzaa) throws Exception {
        FieldMergeField fieldMergeField = new FieldMergeField(true);
        fieldMergeField.zzZ(zzzaa.getStart(), zzzaa.getSeparator(), zzzaa.getEnd());
        fieldMergeField.zzYDr = zzzaa.getMergeFieldName();
        if (fieldMergeField.zzZgS() == 6302) {
            fieldMergeField.zzYDp = 2;
        }
        return fieldMergeField;
    }

    public static String zzZa(String str, String str2) {
        return com.aspose.words.internal.zzZKN.zzU3(str) ? str2 : com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2);
    }

    private boolean zzZd9() {
        return (com.aspose.words.internal.zzZKN.zzU3(getTextBefore()) && com.aspose.words.internal.zzZKN.zzU3(getTextAfter())) ? false : true;
    }

    private zzZ2H zzZda() {
        return (zzZ2H) zzZgo().zzZav().zzA(this);
    }

    private zzTL zzZv(Object obj) {
        if (obj instanceof Byte) {
            return new zzZVZ(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new zzZVZ(((Short) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new zzZVZ(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new zzZVZ(((Long) obj).longValue());
        }
        if (obj instanceof Float) {
            return new zzZVZ(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new zzZVZ(((Double) obj).doubleValue());
        }
        if (obj instanceof com.aspose.words.internal.zzZQ9) {
            return new zzKF((com.aspose.words.internal.zzZQ9) obj);
        }
        if (obj instanceof Date) {
            return new zzKF(com.aspose.words.internal.zzZQ9.zzZ((Date) obj));
        }
        if (obj instanceof BigDecimal) {
            return new zzZVZ(((BigDecimal) obj).doubleValue());
        }
        if (obj instanceof byte[]) {
            return new zzY94(new String((byte[]) obj));
        }
        String string = obj.toString();
        if (getStart().zzYBb().getMailMerge().getTrimWhitespaces()) {
            string = com.aspose.words.internal.zzZKN.zzV(string, ControlChar.SPACE_CHAR, '\t');
        }
        return new zzY94(string);
    }

    public String getFieldName() {
        return zzZgq().zzDG(0);
    }

    public String getFieldNameNoPrefix() {
        return this.zzYDr;
    }

    public final String getPrefix() {
        return this.zzZpC;
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 1;
        if (iZzTP != 0 && iZzTP != 1) {
            i = 2;
            if (iZzTP != 2 && iZzTP != 3) {
                return 0;
            }
        }
        return i;
    }

    public String getTextAfter() {
        return zzZgq().zzt("\\f", false);
    }

    public String getTextBefore() {
        return zzZgq().zzt("\\b", false);
    }

    @Override // com.aspose.words.Field
    public int getType() {
        return 59;
    }

    public boolean isMapped() {
        return zzZgq().zzMj("\\m");
    }

    public boolean isVerticalFormatting() {
        return zzZgq().zzMj("\\v");
    }

    public void setFieldName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setTextAfter(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setTextBefore(String str) throws Exception {
        zzZgq().zzZf("\\b", str);
    }

    public final boolean zzZd5() {
        return this.zzYDp == 4;
    }

    public final boolean zzZd6() {
        return this.zzYDp == 3;
    }

    public final MergeFieldImageDimension zzZd7() {
        return zzZ(this.zzYDn);
    }

    public final MergeFieldImageDimension zzZd8() {
        return zzZ(this.zzYDo);
    }

    @Override // com.aspose.words.Field
    public final com.aspose.words.internal.zzHH zzZgE() {
        com.aspose.words.internal.zzHH zzhhZzZgE = super.zzZgE();
        zzZ2H zzz2hZzZda = zzZda();
        if (zzz2hZzZda != null) {
            Iterator<zzZPC> it = zzZgq().zzZfC().iterator();
            while (it.hasNext()) {
                if (zzZPC.zzLK(it.next().getName())) {
                }
            }
            return new zzYZJ(zzz2hZzZda, zzhhZzZgE);
        }
        return zzhhZzZgE;
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZ2H zzz2hZzZda = zzZda();
        if (zzz2hZzZda == null && getStart().zzYBb().getMailMerge().zzYKg()) {
            return new zzZP5((Field) this, com.aspose.words.internal.zzZKN.format("{0}«{1}»{2}", getTextBefore(), zzZgq().zzDG(0), getTextAfter()), false);
        }
        int i = this.zzYDp;
        if (i == 0 || i == 1 || i == 2) {
            return zzZ(zzz2hZzZda);
        }
        if (i == 3 || i == 4) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.Field
    public final void zzZgO() throws Exception {
        if (zzZgS() == 6302) {
            zzZR6.zzT(this);
        }
        super.zzZgO();
    }

    @Override // com.aspose.words.Field
    public final void zzZgV() {
        super.zzZgV();
        if (this.zzYDq) {
            return;
        }
        zzY(zzZgq());
    }

    private FieldMergeField(boolean z) {
        this.zzYDq = z;
    }

    public void isMapped(boolean z) throws Exception {
        zzZgq().zzs("\\m", z);
    }

    public void isVerticalFormatting(boolean z) throws Exception {
        zzZgq().zzs("\\v", z);
    }

    @Override // com.aspose.words.Field
    public final void zzZ(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        super.zzZ(fieldStart, fieldSeparator, fieldEnd);
        zzZgV();
    }

    private static zzZPZ zzZ(zzZR1 zzzr1, MailMerge mailMerge) {
        String strZzDG = zzzr1.zzDG(0);
        if (strZzDG == null) {
            return null;
        }
        zzZPZ zzzpz = new zzZPZ();
        zzzpz.setPrefix("");
        zzzpz.setFieldName(strZzDG);
        zzzpz.zzDe(0);
        zzzpz.setImageWidth(null);
        zzzpz.setImageHeight(null);
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(strZzDG, zzYDl);
        if (iZzZ != -1) {
            String strSubstring = strZzDG.substring(0, iZzZ);
            if (com.aspose.words.internal.zzZYD.zzh(strSubstring, mailMerge.getRegionStartTag())) {
                zzzpz.zzDe(3);
            } else if (com.aspose.words.internal.zzZYD.zzh(strSubstring, mailMerge.getRegionEndTag())) {
                zzzpz.zzDe(4);
            } else if (zzZ(strSubstring, zzzpz)) {
                zzzpz.zzDe(1);
            }
            zzzpz.setPrefix(strSubstring);
            zzzpz.setFieldName(strZzDG.substring(iZzZ + 1));
        }
        return zzzpz;
    }

    public static zzZPZ zzZ(String str, MailMerge mailMerge) {
        return zzZ(new zzZR1(str, new FieldMergeField()), mailMerge);
    }

    private void zzY(zzZR1 zzzr1) {
        zzZPZ zzzpzZzZ = zzZ(zzzr1, getStart().zzYBb().getMailMerge());
        if (zzzpzZzZ != null) {
            this.zzZpC = zzzpzZzZ.getPrefix();
            this.zzYDr = zzzpzZzZ.getFieldName();
            this.zzYDp = zzzpzZzZ.zzZd4();
            this.zzYDo = zzzpzZzZ.getImageWidth();
            this.zzYDn = zzzpzZzZ.getImageHeight();
        }
    }

    private static boolean zzZ(String str, zzZPZ zzzpz) {
        MergeFieldImageDimension mergeFieldImageDimensionZzYJ;
        MergeFieldImageDimension mergeFieldImageDimensionZzYJ2;
        com.aspose.words.internal.zzZNT zzzntZzUX = zzYDm.zzUX(str);
        if (!zzzntZzUX.zzhL()) {
            return false;
        }
        if (!C21559Oooo0oO.OooO0OO(zzzntZzUX, 3) || (mergeFieldImageDimensionZzYJ = MergeFieldImageDimension.zzYJ(OooO0O0.OooO00o(zzzntZzUX, 4), zzzntZzUX.zzhJ().zzQx(5).getValue())) == null || (mergeFieldImageDimensionZzYJ2 = MergeFieldImageDimension.zzYJ(OooO0O0.OooO00o(zzzntZzUX, 6), zzzntZzUX.zzhJ().zzQx(7).getValue())) == null) {
            return true;
        }
        zzzpz.setImageWidth(mergeFieldImageDimensionZzYJ);
        zzzpz.setImageHeight(mergeFieldImageDimensionZzYJ2);
        return true;
    }

    private zzZP6 zzZ(zzZ2H zzz2h, MailMerge mailMerge) throws Exception {
        zzTL zzy94;
        Ref<FieldMergingArgs> ref = new Ref<>(null);
        boolean zZzZ = zzz2h.zzZ(this, ref);
        FieldMergingArgs fieldMergingArgs = ref.get();
        Object fieldValue = fieldMergingArgs.getFieldValue();
        if (isRemoved()) {
            return null;
        }
        boolean z = false;
        if (fieldMergingArgs.getText() != null) {
            zzy94 = new zzY94(fieldMergingArgs.getText());
        } else {
            if (!zZzZ) {
                return zzZ(mailMerge);
            }
            if (fieldValue != null && !com.aspose.words.internal.zzZQB.zz1(fieldValue)) {
                zzy94 = zzZv(fieldValue);
                z = true;
                if (this.zzYDp != 2 && zzZd9()) {
                    String strZz8W = zzy94.zz8W();
                    if (!com.aspose.words.internal.zzZKN.zzU3(strZz8W)) {
                        zzy94 = new zzY94(com.aspose.words.internal.zzZKN.format("{0}{1}{2}", getTextBefore(), strZz8W, getTextAfter()));
                    }
                }
            } else {
                zzy94 = new zzY94("");
            }
        }
        zzYZH.zzY(this, mailMerge);
        return new zzZP5(this, zzy94, z);
    }

    private static com.aspose.words.internal.zzZOP zzZ(Object obj, ImageFieldMergingArgs imageFieldMergingArgs) throws Exception {
        byte[] bArr = (byte[]) com.aspose.words.internal.zzZKW.zzZ(obj, byte[].class);
        if (bArr != null) {
            return new com.aspose.words.internal.zzZOR(bArr);
        }
        String str = (String) com.aspose.words.internal.zzZKW.zzZ(obj, String.class);
        if (str != null) {
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                return zzZ8I.zzY(str, imageFieldMergingArgs.getDocument());
            }
            return null;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("The data field {0} is expected to be byte[] or string, but it was {1}.", imageFieldMergingArgs.getDocumentFieldName(), obj.getClass()));
    }

    private zzZP6 zzZ(MailMerge mailMerge) {
        if (!mailMerge.zzYKb()) {
            return null;
        }
        zzYZH.zzZ(this, mailMerge);
        return null;
    }

    private static MergeFieldImageDimension zzZ(MergeFieldImageDimension mergeFieldImageDimension) {
        return mergeFieldImageDimension == null ? new MergeFieldImageDimension() : mergeFieldImageDimension.zzYDQ();
    }

    private zzZP6 zzZ(zzZ2H zzz2h) throws Exception {
        MailMerge mailMerge = getStart().zzYBb().getMailMerge();
        if (zzz2h == null) {
            return zzZ(mailMerge);
        }
        if (zzz2h.zzYJy()) {
            return null;
        }
        int i = this.zzYDp;
        if (i != 0) {
            if (i == 1) {
                return zzY(zzz2h, mailMerge);
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
        }
        return zzZ(zzz2h, mailMerge);
    }
}
