package com.aspose.words;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.InputDeviceCompat;
import com.google.firebase.firestore.local.SQLitePersistence;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ShapeBase extends CompositeNode<Node> implements zzZ8X, zzZ9A, zzZ9B, zzZAM, zzZAV {
    static double zzXn6 = 216.0d;
    private ShadowFormat zzXmQ;
    private zzZAW zzXmR;
    private long zzXmS;
    private long zzXmT;
    private boolean zzXmU;
    private long zzXmV;
    private int zzXmW;
    private int zzXmX;
    private int zzXmY;
    private byte zzXmZ;
    private long zzXn0;
    private long zzXn1;
    private int zzXn2;
    private zzZLD zzXn3;
    private zzZ3V zzXn4;
    private zz2O zzXn5;
    private zz53 zzYYM;
    private zzYC3 zzZ59;
    private Font zzZsK;
    private zzYEF zzZsP;
    private Fill zzZyc;

    public ShapeBase(DocumentBase documentBase, byte b) {
        super(documentBase);
        this.zzZ59 = new zzYC3();
        this.zzZsP = new zzYEF();
        this.zzXn1 = 0L;
        this.zzXn0 = 0L;
        this.zzXmT = com.aspose.words.internal.zzZPX.zzZm(0, 0);
        this.zzXmS = com.aspose.words.internal.zzZPW.zzG(0.0f, 0.0f);
        this.zzXmZ = b;
        if (documentBase != null) {
            setId(documentBase.zzZq0());
        }
    }

    private void zzT(double d, boolean z) {
        zzY9h().zzT(d, z);
    }

    private void zzU(double d, boolean z) {
        zzY9h().zzU(d, z);
    }

    private void zzVN(int i, int i2) {
        this.zzZ59.remove(407);
        this.zzZ59.remove(443);
        if (i == 6 || i == 5) {
            zzY2X.zzZ(this.zzZ59, i, i2);
            this.zzZ59.zzO(384, Integer.valueOf(i != 5 ? 6 : 5));
        } else {
            this.zzZ59.zzO(395, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zzY2X.zziC(i))));
            this.zzZ59.zzO(384, 7);
        }
        this.zzZ59.remove(396);
        this.zzZ59.zzO(396, Integer.valueOf(zzY2X.zzV3(i, i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r4 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzW(PageSetup pageSetup) {
        double dZzYRW;
        Object directShapeAttr = getDirectShapeAttr(1985);
        if (directShapeAttr == null) {
            return;
        }
        double dIntValue = ((double) ((Integer) directShapeAttr).intValue()) / 1000.0d;
        if (dIntValue <= 0.0d) {
            return;
        }
        double height = getHeight();
        int relativeVerticalSize = getRelativeVerticalSize();
        if (relativeVerticalSize == 0) {
            dZzYRW = pageSetup.zzYRW();
        } else {
            if (relativeVerticalSize != 1) {
                if (relativeVerticalSize == 2) {
                    dZzYRW = pageSetup.getTopMargin();
                } else if (relativeVerticalSize != 3) {
                    if (relativeVerticalSize != 4) {
                    }
                    dZzYRW = pageSetup.getTopMargin();
                } else {
                    dZzYRW = pageSetup.getBottomMargin();
                }
                this.zzXmS = com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) this.zzXmS), (float) height);
                if (getMarkupLanguage() == 0) {
                    double dIntValue2 = ((double) ((Integer) fetchShapeAttr(4144)).intValue()) / 12700.0d;
                    double dIntValue3 = ((double) ((Integer) fetchShapeAttr(4146)).intValue()) / 12700.0d;
                    if (!com.aspose.words.internal.zzAN.zzZD(dIntValue2) || !com.aspose.words.internal.zzAN.zzZD(dIntValue3)) {
                        height = Math.max(0.75d, (height - dIntValue2) - dIntValue3);
                    }
                }
                zzWc(Math.abs(height));
            }
            dZzYRW = pageSetup.getPageHeight();
        }
        height = dZzYRW * dIntValue;
        this.zzXmS = com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) this.zzXmS), (float) height);
        if (getMarkupLanguage() == 0) {
        }
        zzWc(Math.abs(height));
    }

    private void zzWa(double d) throws Exception {
        double dZzZ = zzYBZ.zzZ(this, d, true, "height");
        if (getAspectRatioLocked()) {
            long jZzY9T = zzY9T();
            zzU(zzYBZ.zzZ(this, ((double) Float.intBitsToFloat((int) jZzY9T)) * (dZzZ / ((double) com.aspose.words.internal.zzZPW.zzYz(jZzY9T))), true, "width"), true);
        }
        zzT(dZzZ, true);
    }

    private void zzWb(double d) throws Exception {
        double dZzZ = zzYBZ.zzZ(this, d, true, "width");
        if (getAspectRatioLocked()) {
            long jZzY9T = zzY9T();
            zzT(zzYBZ.zzZ(this, ((double) com.aspose.words.internal.zzZPW.zzYz(jZzY9T)) * (dZzZ / ((double) Float.intBitsToFloat((int) jZzY9T))), true, "height"), true);
        }
        zzU(dZzZ, true);
    }

    private void zzWc(double d) {
        if (zzY93()) {
            zzU(d, false);
        } else {
            zzT(d, false);
        }
    }

    private void zzWd(double d) {
        if (zzY93()) {
            zzT(d, false);
        } else {
            zzU(d, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r4 != 5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzX(PageSetup pageSetup) {
        Object directShapeAttr;
        double dZzYRX;
        if (zzZ55() || (directShapeAttr = getDirectShapeAttr(1984)) == null) {
            return;
        }
        double dIntValue = ((double) ((Integer) directShapeAttr).intValue()) / 1000.0d;
        if (dIntValue <= 0.0d) {
            return;
        }
        double width = getWidth();
        int relativeHorizontalSize = getRelativeHorizontalSize();
        if (relativeHorizontalSize == 0) {
            dZzYRX = pageSetup.zzYRX();
        } else {
            if (relativeHorizontalSize != 1) {
                if (relativeHorizontalSize == 2) {
                    dZzYRX = pageSetup.getLeftMargin();
                } else if (relativeHorizontalSize == 3 || relativeHorizontalSize == 4) {
                    dZzYRX = pageSetup.getRightMargin();
                }
                this.zzXmS = com.aspose.words.internal.zzZPW.zzG((float) width, com.aspose.words.internal.zzZPW.zzYz(this.zzXmS));
                if (getMarkupLanguage() == 0) {
                    double dIntValue2 = ((double) ((Integer) fetchShapeAttr(4143)).intValue()) / 12700.0d;
                    double dIntValue3 = ((double) ((Integer) fetchShapeAttr(4145)).intValue()) / 12700.0d;
                    if (!com.aspose.words.internal.zzAN.zzZD(dIntValue2) || !com.aspose.words.internal.zzAN.zzZD(dIntValue3)) {
                        width = Math.max(0.75d, (width - dIntValue2) - dIntValue3);
                    }
                }
                zzWd(Math.abs(width));
            }
            dZzYRX = pageSetup.getPageWidth();
        }
        width = dZzYRX * dIntValue;
        this.zzXmS = com.aspose.words.internal.zzZPW.zzG((float) width, com.aspose.words.internal.zzZPW.zzYz(this.zzXmS));
        if (getMarkupLanguage() == 0) {
        }
        zzWd(Math.abs(width));
    }

    private long zzXl(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) - ((int) zzY9L());
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j) - ((int) (zzY9L() >> 32));
        if (!com.aspose.words.internal.zzAN.zzVb((int) zzY9K())) {
            fIntBitsToFloat = (float) ((getWidth() / ((double) ((int) zzY9K()))) * ((double) fIntBitsToFloat));
        }
        if (!com.aspose.words.internal.zzAN.zzVb((int) (zzY9K() >>> 32))) {
            fZzYC = (float) ((getHeight() / ((double) ((int) (zzY9K() >>> 32)))) * ((double) fZzYC));
        }
        return com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat + ((float) getLeft()), fZzYC + ((float) getTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzY(PageSetup pageSetup) {
        Object obj;
        if (getAncestor(5) == null && (obj = this.zzZ59.get(1987)) != null) {
            Integer num = (Integer) obj;
            if (num.intValue() == -10001) {
                return;
            }
            double dIntValue = ((double) num.intValue()) / 1000.0d;
            int relativeVerticalPosition = getRelativeVerticalPosition();
            if (relativeVerticalPosition == 0) {
                setTop(((double) pageSetup.zzYRW()) * dIntValue);
            } else if (relativeVerticalPosition == 1) {
                setTop(pageSetup.getPageHeight() * dIntValue);
            } else if (relativeVerticalPosition == 4) {
                setTop(pageSetup.getTopMargin() * dIntValue);
            } else if (relativeVerticalPosition == 5) {
                setTop(pageSetup.getBottomMargin() * dIntValue);
            } else if (relativeVerticalPosition == 6 || relativeVerticalPosition == 7) {
            }
            if (getMarkupLanguage() == 0) {
                double dIntValue2 = ((double) ((Integer) fetchShapeAttr(4144)).intValue()) / 12700.0d;
                if (com.aspose.words.internal.zzAN.zzZD(dIntValue2)) {
                    return;
                }
                setTop(getTop() + dIntValue2);
            }
        }
    }

    public static String zzY1(String str, String str2) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str2;
        }
        String str3 = com.aspose.words.internal.zzZKN.format("Title: {0}", str);
        return com.aspose.words.internal.zzZYD.zzXk(str2) ? com.aspose.words.internal.zzZKN.format("{0} - Description: {1}", str3, str2) : str3;
    }

    private float zzY9(float f) {
        return (!isTopLevel() || this.zzYYM == null) ? f : (float) ((Math.floor(((double) com.aspose.words.internal.zzSA.zzp(f)) / 635.0d) * 635.0d) / 12700.0d);
    }

    private boolean zzY93() {
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(getRotation());
        if (dZzZJ < 45.0d || dZzZJ >= 135.0d) {
            return dZzZJ >= 225.0d && dZzZJ < 315.0d;
        }
        return true;
    }

    private boolean zzY94() {
        return getShapeType() == 100;
    }

    private com.aspose.words.internal.zzZQ4 zzY9Q() {
        float fZzmc = zzmc(4143);
        float fZzmc2 = zzmc(4145);
        float fZzmc3 = zzmc(4144);
        float fZzmc4 = zzmc(4146);
        com.aspose.words.internal.zzZQ4 zzzq4ZzW9 = zzW9(getRotation());
        return new com.aspose.words.internal.zzZQ4(zzzq4ZzW9.getX() - fZzmc, zzzq4ZzW9.getY() - fZzmc3, zzzq4ZzW9.getWidth() + fZzmc + fZzmc2, zzzq4ZzW9.getHeight() + fZzmc3 + fZzmc4);
    }

    private com.aspose.words.internal.zzZQ4 zzY9R() {
        long[] jArrZzY = zzY((zzYM5[]) this.zzZ59.zzPk(StyleIdentifier.LIST_TABLE_4));
        return jArrZzY == null ? com.aspose.words.internal.zzZQ4.zz2T : com.aspose.words.internal.zzJ6.zzU(jArrZzY);
    }

    private long zzY9S() throws Exception {
        return ((((((((((((((((((((((((((((((((((((((((toString(70).hashCode() ^ 84696351) * 16777619) ^ getName().hashCode()) * 16777619) ^ getHRef().hashCode()) * 16777619) ^ getTarget().hashCode()) * 16777619) ^ getScreenTip().hashCode()) * 16777619) ^ getAlternativeText().hashCode()) * 16777619) ^ getZOrder()) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getWidth())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getHeight())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzYY(getAnchorLocked())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzYY(getAllowOverlap())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzYY(getBehindText())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getLeft())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getTop())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getRight())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getBottom())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getDistanceTop())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getDistanceBottom())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getDistanceLeft())) * 16777619) ^ com.aspose.words.internal.zzZKP.zzZ9(getDistanceRight())) * 16777619) ^ getWrapType();
    }

    private long zzY9T() throws Exception {
        double width = getWidth();
        double height = getHeight();
        if (com.aspose.words.internal.zzAN.zzZD(width) || com.aspose.words.internal.zzAN.zzZD(height)) {
            com.aspose.words.internal.zzEG zzegZzY9Y = zzY9Y();
            if (zzegZzY9Y != null && com.aspose.words.internal.zzAN.zzZD(width) && com.aspose.words.internal.zzAN.zzZD(height)) {
                width = zzegZzY9Y.getWidth();
                height = zzegZzY9Y.getHeight();
            } else {
                width = zzXn6;
                height = width;
            }
        }
        return com.aspose.words.internal.zzZPW.zzG((float) width, (float) height);
    }

    private boolean zzYab() throws Exception {
        Iterator<T> it = getChildNodes(18, true).iterator();
        while (it.hasNext()) {
            if (((Shape) it.next()).hasImage()) {
                return true;
            }
        }
        return false;
    }

    private boolean zzZH(com.aspose.words.internal.zzPV zzpv) {
        getMarkupLanguage();
        return (zzpv == null || !zzY9J().getOn() || zzY9J().getFillType() == 3 || zzY9J().getFillType() == 2) ? false : true;
    }

    private CompositeNode zzbR() {
        zzO zzoZzYdB = this.zzZsP.zzYdB();
        if (zzoZzYdB == null || zzoZzYdB.zzbR() == null) {
            return null;
        }
        return zzoZzYdB.zzbR();
    }

    private float zzmc(int i) {
        float fIntValue = (float) (((double) ((Integer) fetchShapeAttr(i)).intValue()) / 12700.0d);
        if (isInline()) {
            return fIntValue;
        }
        if (i == 4146) {
            boolean z = (getParentParagraph() == null || getParentParagraph().getParentNode() == null || getParentParagraph().getParentNode().getNodeType() != 7) ? false : true;
            boolean z2 = getWrapType() == 1;
            if (getDocument().zzZpV().zzYVg.getMswVersion() != 0 && getDocument().zzZpV().zzYVg.getMswVersion() < 15 && !z2 && z) {
                fIntValue = 0.0f;
            }
        }
        if (fIntValue < 0.05d) {
            return 0.0f;
        }
        return fIntValue;
    }

    private void zzmd(int i) {
        if (this.zzZ59.get(i) != null) {
            setShapeAttr(i, 0);
        }
    }

    public static boolean zzme(int i) {
        return (i == -2 || i == 0 || i == 100 || i == 201) ? false : true;
    }

    public RectF adjustWithEffects(RectF rectF) {
        return com.aspose.words.internal.zzZQ4.zz8(zzZ0(com.aspose.words.internal.zzZQ4.zzZ(rectF)));
    }

    public boolean canHaveImage() {
        return getShapeType() != -1;
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void clearRunAttrs() {
        this.zzZsP.clear();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedRunAttr(int i) {
        return zzZ7R.zzY(this, i);
    }

    @ReservedForInternalUse
    @Deprecated
    public Object fetchInheritedShapeAttr(int i) {
        zzYC3 zzyc3Zzm2 = zzYBW.zzm2(getShapeType());
        return zzyc3Zzm2 != null ? zzyc3Zzm2.zzPj(i) : zzYC3.zzOt(i);
    }

    @Override // com.aspose.words.zzZ9A
    @ReservedForInternalUse
    @Deprecated
    public Object fetchShapeAttr(int i) {
        Object directShapeAttr = getDirectShapeAttr(i);
        return directShapeAttr != null ? directShapeAttr : fetchInheritedShapeAttr(i);
    }

    public boolean getAllowOverlap() {
        return ((Boolean) fetchShapeAttr(950)).booleanValue();
    }

    public String getAlternativeText() {
        String alternativeText = zzY9h().getAlternativeText();
        return com.aspose.words.internal.zzZYD.zzXk(alternativeText) ? alternativeText : "";
    }

    public boolean getAnchorLocked() {
        return ((Boolean) fetchShapeAttr(4099)).booleanValue();
    }

    public boolean getAspectRatioLocked() {
        return zzY9h().getAspectRatioLocked();
    }

    public boolean getBehindText() {
        return ((Boolean) fetchShapeAttr(954)).booleanValue();
    }

    public double getBottom() {
        return getHeight() + getTop();
    }

    public RectF getBounds() {
        return com.aspose.words.internal.zzZQ4.zz8(zzY9O());
    }

    public RectF getBoundsInPoints() {
        return com.aspose.words.internal.zzZQ4.zz8(zzYzG());
    }

    public RectF getBoundsWithEffects() {
        return com.aspose.words.internal.zzZQ4.zz8(zzY9Q());
    }

    public Point getCoordOrigin() {
        return com.aspose.words.internal.zzZPZ.zzYD(zzY9L());
    }

    public PointF getCoordSize() {
        return com.aspose.words.internal.zzZPX.zzYB(zzY9K());
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getDeleteRevision() {
        return this.zzZsP.getDeleteRevision();
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i) {
        return this.zzZsP.zzPk(i);
    }

    @Override // com.aspose.words.zzZ9A
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectShapeAttr(int i) {
        return this.zzZ59.zzPk(i);
    }

    public double getDistanceBottom() {
        return ((double) ((Integer) fetchShapeAttr(903)).intValue()) / 12700.0d;
    }

    public double getDistanceLeft() {
        return ((double) ((Integer) fetchShapeAttr(SQLitePersistence.MAX_ARGS)).intValue()) / 12700.0d;
    }

    public double getDistanceRight() {
        return ((double) ((Integer) fetchShapeAttr(902)).intValue()) / 12700.0d;
    }

    public double getDistanceTop() {
        return ((double) ((Integer) fetchShapeAttr(901)).intValue()) / 12700.0d;
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public DocumentBase getDocument_IInline() {
        return getDocument();
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public zzYEF getExpandedRunPr_IInline(int i) {
        return zzZ7R.zzZ(this, i);
    }

    public Fill getFill() {
        if (this.zzZyc == null) {
            this.zzZyc = new Fill(this);
        }
        return this.zzZyc;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillType() {
        return zzY9J().getFillType();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackColor() {
        return zzY9J().zzZBx().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackThemeColor() throws Exception {
        if (getMarkupLanguage() == 1) {
            if (zzZH(zzY9J().zzZBx())) {
                return zzZO0.zzZ(zzY9J().zzZBx(), getDocument().zzZqI());
            }
            return -1;
        }
        zzBW zzbwZzZBm = ((zz7X) zzY9J()).zzZBm();
        if (zzbwZzZBm == null || zzbwZzZBm.zzZHs() != 5) {
            return -1;
        }
        return ((zz2Q) zzbwZzZBm).getValue();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableBackTintAndShade() {
        double value;
        int iIntValue;
        if (getMarkupLanguage() != 1) {
            zzBW zzbwZzZBm = ((zz7X) zzY9J()).zzZBm();
            if (zzbwZzZBm == null) {
                return 0.0d;
            }
            if (zzbwZzZBm.zzJw(27) == null) {
                if (zzbwZzZBm.zzJw(26) != null) {
                    return ((zz2P) zzbwZzZBm.zzJw(26)).getValue() - 1.0d;
                }
                return 0.0d;
            }
            value = ((zz0C) zzbwZzZBm.zzJw(27)).getValue();
        } else {
            if (!zzZH(zzY9J().zzZBx()) || this.zzZ59.get(418) == null || this.zzZ59.get(420) == null || (iIntValue = ((Integer) this.zzZ59.get(420)).intValue()) <= -256 || iIntValue >= 256) {
                return 0.0d;
            }
            if (iIntValue < 0) {
                return (-1.0d) - (((double) iIntValue) / 255.0d);
            }
            value = ((double) iIntValue) / 255.0d;
        }
        return 1.0d - value;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBaseForeColor() {
        return zzY9J().zzZBy().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeColor() {
        return zzY9J().zz8Q().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeThemeColor() throws Exception {
        if (getMarkupLanguage() == 1) {
            if (zzZH(zzY9J().zz8Q())) {
                return zzZO0.zzZ(zzY9J().zz8Q(), getDocument().zzZqI());
            }
            return -1;
        }
        zzBW zzbwZzZBn = ((zz7X) zzY9J()).zzZBn();
        if (zzbwZzZBn == null || zzbwZzZBn.zzZHs() != 5) {
            return -1;
        }
        return ((zz2Q) zzbwZzZBn).getValue();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableForeTintAndShade() {
        double value;
        int iIntValue;
        if (getMarkupLanguage() != 1) {
            zzBW zzbwZzZBn = ((zz7X) zzY9J()).zzZBn();
            if (zzbwZzZBn == null) {
                return 0.0d;
            }
            if (zzbwZzZBn.zzJw(27) == null) {
                if (zzbwZzZBn.zzJw(26) != null) {
                    return ((zz2P) zzbwZzZBn.zzJw(26)).getValue() - 1.0d;
                }
                return 0.0d;
            }
            value = ((zz0C) zzbwZzZBn.zzJw(27)).getValue();
        } else {
            if (!zzZH(zzY9J().zz8Q()) || this.zzZ59.get(414) == null || this.zzZ59.get(416) == null || (iIntValue = ((Integer) this.zzZ59.get(416)).intValue()) <= -256 || iIntValue >= 256) {
                return 0.0d;
            }
            if (iIntValue < 0) {
                return (-1.0d) - (((double) iIntValue) / 255.0d);
            }
            value = ((double) iIntValue) / 255.0d;
        }
        return 1.0d - value;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public byte[] getFillableImageBytes() throws Exception {
        return zzY9J().getImageBytes();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getFillableThemeProvider() {
        return getDocument().zzZqI();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableTransparency() {
        return 1.0d - zzY9J().getOpacity();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getFillableVisible() {
        return zzY9J().getOn();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFilledColor() {
        return zzY9J().zz8Q().zzPG();
    }

    public int getFlipOrientation() {
        return zzY9h().getFlipOrientation();
    }

    public Font getFont() {
        if (this.zzZsK == null) {
            this.zzZsK = new Font(this, getDocument());
        }
        return this.zzZsK;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getGradientAngle() {
        if (getMarkupLanguage() != 1) {
            return zzY9J().zzZBu();
        }
        throw new IllegalStateException("Object doesn't support this action.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public GradientStopCollection getGradientStops() {
        zz7C zz7c;
        if (getMarkupLanguage() != 0 || (zz7c = (zz7C) com.aspose.words.internal.zzZKW.zzZ(zzY9J(), zz7C.class)) == null) {
            throw new IllegalStateException("Object doesn't support this action.");
        }
        return zz7c.zzZAx();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientStyle() {
        return zzY9J().getGradientStyle();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientVariant() {
        return zzY9J().getGradientVariant();
    }

    public String getHRef() {
        return (String) fetchShapeAttr(898);
    }

    public double getHeight() {
        return ((Double) fetchShapeAttr(4132)).doubleValue();
    }

    public float getHeightRelative() {
        if (this.zzZ59.get(1985) == null) {
            return 0.0f;
        }
        return ((Integer) getDirectShapeAttr(1985)).intValue() / 10.0f;
    }

    public int getHorizontalAlignment() {
        return ((Integer) fetchShapeAttr(911)).intValue();
    }

    public final int getId() {
        return ((Integer) fetchShapeAttr(4124)).intValue();
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public zzZV8 getInsertRevision() {
        return this.zzZsP.getInsertRevision();
    }

    public final int getLayoutFlow() {
        if (getMarkupLanguage() != 0) {
            return ((Integer) this.zzZ59.zzPj(136)).intValue();
        }
        if (zzY9a() != null) {
            return zzZZZ.zz8(zzY9a().zzZTl().zzZtu(), zzY9a().zzZyd());
        }
        return 0;
    }

    public double getLeft() {
        return ((Double) fetchShapeAttr(4129)).doubleValue();
    }

    public float getLeftRelative() {
        if (this.zzZ59.get(1986) == null) {
            return 0.0f;
        }
        return ((Integer) getDirectShapeAttr(1986)).intValue() / 10.0f;
    }

    public byte getMarkupLanguage() {
        return this.zzXmZ;
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveFromRevision() {
        return this.zzZsP.getMoveFromRevision();
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public zzYX5 getMoveToRevision() {
        return this.zzZsP.getMoveToRevision();
    }

    public String getName() {
        String name = zzY9h().getName();
        return com.aspose.words.internal.zzZYD.zzXk(name) ? name : "";
    }

    @ReservedForInternalUse
    @Deprecated
    public boolean getOldOn() {
        return zzY9J().getOn();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getOldOpacity() {
        return zzY9J().getOpacity();
    }

    public Paragraph getParentParagraph() {
        return (Paragraph) com.aspose.words.internal.zzZKW.zzZ(getParentNode(), Paragraph.class);
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public Paragraph getParentParagraph_IInline() {
        return getParentParagraph();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPatternType() throws Exception {
        if (zzY9J().getFillType() != 1) {
            return -1;
        }
        if (getMarkupLanguage() != 1) {
            if (zzY9J() instanceof zz41) {
                return ((zz41) zzY9J()).zzZwL();
            }
            return -1;
        }
        int iZzYf = zzZO0.zzYf(zzY9J().getImageBytes());
        if (iZzYf == 13) {
            return 32;
        }
        return iZzYf;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPresetTexture() throws Exception {
        return zzZO0.zzBQ(com.aspose.words.internal.zzIL.zz3(zzY9J().getImageBytes()).hashCode());
    }

    public int getRelativeHorizontalPosition() {
        return ((Integer) fetchShapeAttr(912)).intValue();
    }

    public int getRelativeHorizontalSize() {
        return ((Integer) fetchShapeAttr(1988)).intValue();
    }

    public int getRelativeVerticalPosition() {
        return ((Integer) fetchShapeAttr(914)).intValue();
    }

    public int getRelativeVerticalSize() {
        return ((Integer) fetchShapeAttr(1989)).intValue();
    }

    public double getRight() {
        return getWidth() + getLeft();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getRotateWithObject() {
        return zzY9J().zzZQ5();
    }

    public double getRotation() {
        return zzY9h().getRotation();
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public zzYEF getRunPr_IInline() {
        return this.zzZsP;
    }

    public String getScreenTip() {
        return (String) fetchShapeAttr(909);
    }

    public ShadowFormat getShadowFormat() {
        if (this.zzXmQ == null) {
            this.zzXmQ = new ShadowFormat(this);
        }
        return this.zzXmQ;
    }

    public ShapeRenderer getShapeRenderer() throws Exception {
        return new ShapeRenderer(this);
    }

    public int getShapeType() {
        return zzY9h().getShapeType();
    }

    public final long getSize() {
        return com.aspose.words.internal.zzZPW.zzG((float) getWidth(), (float) getHeight());
    }

    public PointF getSizeInPoints() {
        return com.aspose.words.internal.zzZPW.zzYB(zzYzG().getSize());
    }

    public String getTarget() {
        return (String) fetchShapeAttr(4120);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getTextureAlignment() {
        zzH0 zzh0;
        zzGY zzgy;
        if (getMarkupLanguage() == 1 || (zzh0 = (zzH0) com.aspose.words.internal.zzZKW.zzZ(zzY9J(), zzH0.class)) == null || (zzgy = (zzGY) com.aspose.words.internal.zzZKW.zzZ(zzh0.zzZPY(), zzGY.class)) == null) {
            return 9;
        }
        return zzZO0.zzBJ(zzgy.getAlignment());
    }

    public String getTitle() {
        String title = zzY9h().getTitle();
        return com.aspose.words.internal.zzZYD.zzXk(title) ? title : "";
    }

    public double getTop() {
        return ((Double) fetchShapeAttr(4130)).doubleValue();
    }

    public float getTopRelative() {
        if (this.zzZ59.get(1987) == null) {
            return 0.0f;
        }
        return ((Integer) getDirectShapeAttr(1987)).intValue() / 10.0f;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getTransparency(zzBW zzbw) {
        if (zzbw.zzZFG() == null) {
            return 0.0d;
        }
        return 1.0d - zzbw.zzZFG().getValue();
    }

    public int getVerticalAlignment() {
        return ((Integer) fetchShapeAttr(913)).intValue();
    }

    public double getWidth() {
        return ((Double) fetchShapeAttr(4131)).doubleValue();
    }

    public float getWidthRelative() {
        if (this.zzZ59.get(1984) == null) {
            return 0.0f;
        }
        return ((Integer) getDirectShapeAttr(1984)).intValue() / 10.0f;
    }

    public int getWrapSide() {
        return ((Integer) fetchShapeAttr(InputDeviceCompat.SOURCE_TOUCHSCREEN)).intValue();
    }

    public int getWrapType() {
        return ((Integer) fetchShapeAttr(EditingLanguage.ARABIC_LIBYA)).intValue();
    }

    public int getZOrder() {
        return ((Integer) fetchShapeAttr(4154)).intValue();
    }

    @Override // com.aspose.words.zzZ9B
    @ReservedForInternalUse
    @Deprecated
    public int getZOrder_IShape() {
        return getZOrder();
    }

    public boolean isDecorative() {
        return zzY9h().zzZBM();
    }

    public boolean isDeleteRevision() {
        return zzZ7R.zzV(this);
    }

    public boolean isGroup() {
        return getShapeType() == -1;
    }

    public boolean isHorizontalRule() {
        return zzY9h().isHorizontalRule();
    }

    public boolean isImage() {
        return getShapeType() == 75;
    }

    public boolean isInline() {
        return getWrapType() == 0;
    }

    public boolean isInsertRevision() {
        return zzZ7R.zzW(this);
    }

    public boolean isLayoutInCell() {
        return ((Boolean) fetchShapeAttr(944)).booleanValue();
    }

    public boolean isMoveFromRevision() {
        return zzZ7R.zzU(this);
    }

    public boolean isMoveToRevision() {
        return zzZ7R.zzT(this);
    }

    public boolean isSignatureLine() {
        return ((Boolean) fetchShapeAttr(1983)).booleanValue();
    }

    public boolean isTopLevel() {
        if (getParentNode() != null) {
            return (getParentNode().getNodeType() == 17 || getParentNode().getNodeType() == 18) ? false : true;
        }
        return true;
    }

    public boolean isWordArt() {
        return zzY9h().isWordArt();
    }

    public PointF localToParent(PointF pointF) {
        return com.aspose.words.internal.zzZPY.zzYB(zzXl(com.aspose.words.internal.zzZPY.zzY(pointF)));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void oneColorGradient(int i, int i2, double d) {
        if (getMarkupLanguage() == 1) {
            if (this.zzZ59.get(385) == null) {
                zzY9J().zzm(com.aspose.words.internal.zzPV.zzI5);
            }
            com.aspose.words.internal.zzPV zzpv = new com.aspose.words.internal.zzPV(zzY9J().zz8Q().toArgb());
            if (com.aspose.words.internal.zzAN.zzL(d, 0.5d)) {
                zzY9J().zzi(zzpv);
            } else if (com.aspose.words.internal.zzAN.zzK(d, 0.5d)) {
                zzY9J().zzi(zzYOQ.zzU(zzpv, (int) Math.ceil(d * 510.0d)));
            } else {
                zzY9J().zzi(zzYOQ.zzV(zzpv, (int) Math.ceil((1.0d - d) * 510.0d)));
            }
            zzVN(i, i2);
        } else {
            zz7X zz7x = (zz7X) zzY9J();
            zzBW zzbwZzZHt = zz7x.zzZBn() != null ? zz7x.zzZBn().zzZHt() : zzBW.zzj(com.aspose.words.internal.zzPV.zzYR(getDocument().zzZqI().getColors().getAccent1()));
            zzBW zzbwZzZHt2 = zzbwZzZHt.zzZHt();
            if (!com.aspose.words.internal.zzAN.zzL(d, 0.5d)) {
                if (com.aspose.words.internal.zzAN.zzK(d, 0.5d)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz2P>) zzbwZzZHt2.zzZNX(), new zz2P(d * 2.0d));
                } else {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz0C>) zzbwZzZHt2.zzZNX(), new zz0C((1.0d - d) * 2.0d));
                }
            }
            setFill(new zz7C(zzbwZzZHt, zzbwZzZHt2, i, i2, getDocument().zzZqI()));
            this.zzZsP.remove(790);
        }
        zzY9J().zzY6(true);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void patterned(int i) {
        if (getMarkupLanguage() != 1) {
            zz41 zz41Var = new zz41();
            zz41Var.zzHf(i);
            zz7X zz7x = (zz7X) zzY9J();
            zz41Var.zzM(zz7x.zzZBn() != null ? zz7x.zzZBn().zzZHt().zzY0(1.0d) : zzBW.zzj(com.aspose.words.internal.zzPV.zzYR(getDocument().zzZqI().getColors().getAccent1())));
            zz41Var.zzN(zz7x.zzZBm() != null ? zz7x.zzZBm().zzZHt().zzY0(1.0d) : zzBW.zzj(com.aspose.words.internal.zzPV.zzI5));
            setFill(zz41Var);
            return;
        }
        zzY9J().zzIc(1);
        this.zzZ59.set(443, Boolean.TRUE);
        if (this.zzZ59.get(385) == null) {
            zzY9J().zzm(com.aspose.words.internal.zzPV.zzKa);
        }
        if (this.zzZ59.get(387) == null) {
            zzY9J().zzi(com.aspose.words.internal.zzPV.zzI5);
        }
        this.zzZ59.set(4110, zzZO0.zzLt(zzZO0.zzBO(i)));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void presetTextured(int i) {
        String strZzBP = zzZO0.zzBP(i);
        if (com.aspose.words.internal.zzZKN.equals(strZzBP, "")) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: The specified texture is out of range.");
        }
        if (getMarkupLanguage() != 1) {
            zzH0 zzh0 = new zzH0();
            zzh0.zzZ(new zzGY());
            zzh0.zzZQ1().zzYt(zzZO0.zzLu(strZzBP));
            setFill(zzh0);
            return;
        }
        zzY9J().zzIc(2);
        this.zzZ59.set(443, Boolean.TRUE);
        this.zzZ59.set(4110, zzZO0.zzLu(strZzBP));
        this.zzZ59.set(391, zzZO0.zzBN(i));
        com.aspose.words.internal.zzPV zzpvZzBM = zzZO0.zzBM(i);
        if (zzpvZzBM != null) {
            this.zzZ59.set(385, zzpvZzBM);
        } else {
            removeShapeAttr(385);
        }
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void removeMoveRevisions() {
        this.zzZsP.remove(13);
        this.zzZsP.remove(15);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void removeRunAttr(int i) {
        this.zzZsP.remove(i);
    }

    @Override // com.aspose.words.zzZ9A
    @ReservedForInternalUse
    @Deprecated
    public void removeShapeAttr(int i) {
        this.zzZ59.remove(i);
    }

    public void setAllowOverlap(boolean z) {
        setShapeAttr(950, Boolean.valueOf(z));
    }

    public void setAlternativeText(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzY9h().setAlternativeText(str);
    }

    public void setAnchorLocked(boolean z) {
        setShapeAttr(4099, Boolean.valueOf(z));
    }

    public void setAspectRatioLocked(boolean z) {
        zzY9h().setAspectRatioLocked(z);
    }

    public void setBehindText(boolean z) {
        setShapeAttr(954, Boolean.valueOf(z));
    }

    public void setBounds(RectF rectF) {
        zzZ1(com.aspose.words.internal.zzZQ4.zzZ(rectF));
    }

    public void setCoordOrigin(Point point) {
        zzXj(com.aspose.words.internal.zzZPZ.zzZ(point));
    }

    public void setCoordSize(PointF pointF) {
        zzXi(com.aspose.words.internal.zzZPX.zzY(pointF));
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setDeleteRevision(zzZV8 zzzv8) {
        this.zzZsP.zzQ(12, zzzv8);
    }

    public void setDistanceBottom(double d) {
        setShapeAttr(903, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    public void setDistanceLeft(double d) {
        setShapeAttr(SQLitePersistence.MAX_ARGS, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    public void setDistanceRight(double d) {
        setShapeAttr(902, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    public void setDistanceTop(double d) {
        setShapeAttr(901, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(d)));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zzZAW zzzaw) {
        if (zzzaw == null) {
            this.zzZyc = null;
            return;
        }
        if (((zzzaw instanceof zzY2X) && getMarkupLanguage() != 1) || ((zzzaw instanceof zz7X) && getMarkupLanguage() != 0)) {
            throw new IllegalStateException("Invalid fill type for this node.");
        }
        if (getMarkupLanguage() == 1) {
            this.zzXmR = zzzaw;
        } else {
            ((zzZCL) this.zzYYM).setFill((zz7X) zzzaw);
        }
        zzzaw.zzZ(this);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackColor(int i) {
        if (zzY9J() instanceof zz54) {
            setFill(new zz41());
        }
        zzY9J().zzi(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackThemeColor(int i) throws Exception {
        if (getMarkupLanguage() == 1) {
            if (zzY9J().getFillType() == 3 || zzY9J().getFillType() == 2) {
                throw new IllegalStateException("Cannot set BackThemeColor to this Fill.");
            }
            if (i == -1) {
                this.zzZ59.set(443, Boolean.FALSE);
            } else if (zzY9J().zzZBx() == null || !zzY9J().getOn()) {
                zzY9J().zzIc(1);
                this.zzZ59.set(443, Boolean.TRUE);
                zzY9J().zzm(zzZO0.zzZ(i, getDocument().zzZqI()));
            }
            zzY9J().zzi(zzZO0.zzZ(i, getDocument().zzZqI()));
            return;
        }
        zz7X zz7x = (zz7X) zzY9J();
        if (i == -1) {
            com.aspose.words.internal.zzPV zzpvZzZBx = zz7x.zzZBx();
            zz7x.zzi(com.aspose.words.internal.zzPV.zzHZ);
            zz7x.zzi(zzpvZzZBx);
            return;
        }
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(i);
        switch (zz7x.zzZQ4()) {
            case 1:
            case 4:
                zz7x.zzO(zz2q);
                return;
            case 2:
            case 3:
            case 5:
            case 6:
                zz41 zz41Var = new zz41();
                zz41Var.zzM(zz2q);
                zz41Var.zzN(zz2q);
                setFill(zz41Var);
                return;
            default:
                throw new IllegalStateException("Cannot set BackThemeColor to this Fill.");
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackTintAndShade(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "BackTintAndShade");
        if (getMarkupLanguage() == 1) {
            if (!zzZH(zzY9J().zzZBx())) {
                throw new IllegalStateException("Cannot apply BackTintAndShade to this Fill.");
            }
            com.aspose.words.internal.zzPV zzpvZzZBx = this.zzZ59.get(418) != null ? (com.aspose.words.internal.zzPV) this.zzZ59.get(418) : zzY9J().zzZBx();
            this.zzZ59.set(418, zzpvZzZBx);
            int iZzX8 = zzZO0.zzX8(d);
            this.zzZ59.set(420, Integer.valueOf(d > 0.0d ? iZzX8 : -iZzX8));
            if (d > 0.0d) {
                zzY9J().zzi(zzZO0.zzX(zzpvZzZBx, iZzX8));
            }
            if (d < 0.0d) {
                zzY9J().zzi(zzZO0.zzW(zzpvZzZBx, iZzX8));
                return;
            }
            return;
        }
        zzBW zzbwZzZBm = ((zz7X) zzY9J()).zzZBm();
        if (zzbwZzZBm == null) {
            throw new IllegalStateException("Cannot apply BackTintAndShade to this Fill.");
        }
        zzZCM zzzcmZzJw = zzbwZzZBm.zzJw(26);
        if (zzzcmZzJw != null) {
            zzbwZzZBm.zzZNX().remove(zzzcmZzJw);
        }
        zzZCM zzzcmZzJw2 = zzbwZzZBm.zzJw(27);
        if (zzzcmZzJw2 != null) {
            zzbwZzZBm.zzZNX().remove(zzzcmZzJw2);
        }
        if (d < 0.0d) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz2P>) zzbwZzZBm.zzZNX(), new zz2P(d + 1.0d));
        }
        if (d > 0.0d) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz0C>) zzbwZzZBm.zzZNX(), new zz0C(1.0d - d));
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeColor(int i) {
        zzY9J().zzm(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeThemeColor(int i) throws Exception {
        if (getMarkupLanguage() == 1) {
            if (zzY9J().getFillType() == 3 || zzY9J().getFillType() == 2) {
                throw new IllegalStateException("Cannot set ForeThemeColor to this Fill.");
            }
            if (i == -1) {
                this.zzZ59.set(443, Boolean.FALSE);
            } else if (zzY9J().zz8Q() == null || !zzY9J().getOn()) {
                zzY9J().zzIc(0);
                this.zzZ59.set(443, Boolean.TRUE);
            }
            zzY9J().zzm(zzZO0.zzZ(i, getDocument().zzZqI()));
            return;
        }
        zz7X zz7x = (zz7X) zzY9J();
        if (zz7x.zzZQ4() == 0) {
            throw new IllegalStateException("Cannot set ForeThemeColor to this Fill.");
        }
        if (i == -1) {
            com.aspose.words.internal.zzPV zzpvZz8Q = zz7x.zz8Q();
            zz7x.zzm(com.aspose.words.internal.zzPV.zzHZ);
            zz7x.zzm(zzpvZz8Q);
        } else {
            zz2Q zz2q = new zz2Q();
            zz2q.setValue(i);
            zz7x.zzP(zz2q);
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeTintAndShade(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "ForeTintAndShade");
        if (getMarkupLanguage() == 1) {
            if (!zzZH(zzY9J().zz8Q())) {
                throw new IllegalStateException("Cannot apply ForeTintAndShade to this Fill.");
            }
            com.aspose.words.internal.zzPV zzpvZz8Q = this.zzZ59.get(414) != null ? (com.aspose.words.internal.zzPV) this.zzZ59.get(414) : zzY9J().zz8Q();
            this.zzZ59.set(414, zzpvZz8Q);
            int iZzX8 = zzZO0.zzX8(d);
            this.zzZ59.set(416, Integer.valueOf(d >= 0.0d ? iZzX8 : -iZzX8));
            if (d > 0.0d) {
                zzY9J().zzm(zzZO0.zzX(zzpvZz8Q, iZzX8));
            }
            if (d < 0.0d) {
                zzY9J().zzm(zzZO0.zzW(zzpvZz8Q, iZzX8));
                return;
            }
            return;
        }
        zzBW zzbwZzZBn = ((zz7X) zzY9J()).zzZBn();
        if (zzbwZzZBn == null) {
            throw new IllegalStateException("Cannot apply ForeTintAndShade to this Fill.");
        }
        zzZCM zzzcmZzJw = zzbwZzZBn.zzJw(26);
        if (zzzcmZzJw != null) {
            zzbwZzZBn.zzZNX().remove(zzzcmZzJw);
        }
        zzZCM zzzcmZzJw2 = zzbwZzZBn.zzJw(27);
        if (zzzcmZzJw2 != null) {
            zzbwZzZBn.zzZNX().remove(zzzcmZzJw2);
        }
        if (d < 0.0d) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz2P>) zzbwZzZBn.zzZNX(), new zz2P(d + 1.0d));
        }
        if (d > 0.0d) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz0C>) zzbwZzZBn.zzZNX(), new zz0C(1.0d - d));
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableTransparency(double d) {
        if (zzY9J() instanceof zz54) {
            setFill(new zz41());
        }
        zzY9J().setOpacity(1.0d - d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableVisible(boolean z) {
        zzY9J().setOn(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFilledColor(int i) {
        zzY9J().zzm(com.aspose.words.internal.zzPV.zzYR(i));
        if ((com.aspose.words.internal.zzZQ1.zzZX(i) & 255) < 255) {
            zzY9J().setOpacity(((double) (com.aspose.words.internal.zzZQ1.zzZX(i) & 255)) / 255.0d);
        }
    }

    public void setFlipOrientation(int i) {
        zzY9h().setFlipOrientation(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setGradientAngle(double d) {
        if (getMarkupLanguage() == 1) {
            throw new IllegalStateException("Object doesn't support this action.");
        }
        zzY9J().zzXV(d);
    }

    public void setHRef(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzY9h().setHRef(str);
    }

    public void setHeight(double d) throws Exception {
        zzWa(d);
        zzmd(1985);
    }

    public void setHeightRelative(float f) {
        if (f < 0.0f) {
            throw new IllegalStateException("HeightRelative cannot be set to a negative value.");
        }
        if (f == 0.0f) {
            this.zzZ59.remove(1989);
            this.zzZ59.remove(1985);
        } else {
            setShapeAttr(1985, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZb(f * 10.0f)));
            if (this.zzZ59.get(1989) == null) {
                setRelativeVerticalSize(0);
            }
        }
    }

    public void setHorizontalAlignment(int i) {
        setShapeAttr(911, Integer.valueOf(i));
    }

    public final void setId(int i) {
        setShapeAttr(4124, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setImage(byte[] bArr) {
        if (getMarkupLanguage() == 0) {
            setFill(new zzH0());
        }
        zzY9J().setImageBytes(bArr);
    }

    @Override // com.aspose.words.zzZ8X
    @ReservedForInternalUse
    @Deprecated
    public void setInsertRevision(zzZV8 zzzv8) {
        this.zzZsP.zzQ(14, zzzv8);
    }

    public void setLeft(double d) {
        setShapeAttr(4129, Double.valueOf(d));
    }

    public void setLeftRelative(float f) {
        if (f == 0.0f) {
            this.zzZ59.remove(1986);
        } else {
            setShapeAttr(1986, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZb(f * 10.0f)));
        }
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveFromRevision(zzYX5 zzyx5) {
        this.zzZsP.zzQ(13, zzyx5);
    }

    @Override // com.aspose.words.zzZA6
    @ReservedForInternalUse
    @Deprecated
    public void setMoveToRevision(zzYX5 zzyx5) {
        this.zzZsP.zzQ(15, zzyx5);
    }

    public void setName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzY9h().setName(str);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOldOn(boolean z) {
        zzY9J().setOn(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setOldOpacity(double d) {
        if (com.aspose.words.internal.zzZQ1.zzRk(getFilledColor())) {
            setFilledColor(com.aspose.words.internal.zzZQ1.zz2p);
        }
        zzY9J().setOpacity(d);
    }

    public void setRelativeHorizontalPosition(int i) {
        setShapeAttr(912, Integer.valueOf(i));
    }

    public void setRelativeHorizontalSize(int i) {
        setShapeAttr(1988, Integer.valueOf(i));
    }

    public void setRelativeVerticalPosition(int i) {
        setShapeAttr(914, Integer.valueOf(i));
    }

    public void setRelativeVerticalSize(int i) {
        setShapeAttr(1989, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setRotateWithObject(boolean z) {
        zzY9J().zzY6(z);
    }

    public void setRotation(double d) {
        zzY9h().setRotation(d);
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public void setRunAttr(int i, Object obj) {
        this.zzZsP.zzQ(i, obj);
    }

    @Override // com.aspose.words.zzZAM
    @ReservedForInternalUse
    @Deprecated
    public void setRunPr_IInline(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    public void setScreenTip(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        setShapeAttr(909, str);
    }

    @Override // com.aspose.words.zzZ9A
    @ReservedForInternalUse
    @Deprecated
    public void setShapeAttr(int i, Object obj) {
        this.zzZ59.zzQ(i, obj);
    }

    public final void setShapeType(int i) {
        if (getMarkupLanguage() == 1) {
            zz84.zzIg(i);
        }
        setShapeAttr(EditingLanguage.LULE_SAMI_NORWAY, Integer.valueOf(i));
    }

    public void setTarget(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        setShapeAttr(4120, str);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTextureAlignment(int i) {
        if (i == 9) {
            throw new IllegalStateException("TextureNone cannot be applied directly.");
        }
        if (getMarkupLanguage() == 1) {
            throw new IllegalStateException("TextureAlignment cannot be applied to VML shapes.");
        }
        zzH0 zzh0 = (zzH0) com.aspose.words.internal.zzZKW.zzZ(zzY9J(), zzH0.class);
        if (zzh0 == null) {
            throw new IllegalStateException("TextureAlignment can be applied to texture fill only.");
        }
        zzGY zzgy = (zzGY) com.aspose.words.internal.zzZKW.zzZ(zzh0.zzZPY(), zzGY.class);
        if (zzgy == null) {
            throw new IllegalStateException("TextureAlignment can be applied to tile texture fill only.");
        }
        zzgy.setAlignment(zzZO0.zzBI(i));
    }

    public void setTitle(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzY9h().setTitle(str);
    }

    public void setTop(double d) {
        setShapeAttr(4130, Double.valueOf(d));
    }

    public void setTopRelative(float f) {
        if (f == 0.0f) {
            this.zzZ59.remove(1987);
        } else {
            setShapeAttr(1987, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZb(f * 10.0f)));
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTransparency(zzBW zzbw, double d) {
        zzbw.zzY0(1.0d - d);
    }

    public void setVerticalAlignment(int i) {
        setShapeAttr(913, Integer.valueOf(i));
    }

    public void setWidth(double d) throws Exception {
        zzWb(d);
        zzmd(1984);
    }

    public void setWidthRelative(float f) {
        if (f < 0.0f) {
            throw new IllegalStateException("WidthRelative cannot be set to a negative value.");
        }
        if (f == 0.0f) {
            this.zzZ59.remove(1988);
            this.zzZ59.remove(1984);
        } else {
            setShapeAttr(1984, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZb(f * 10.0f)));
            if (this.zzZ59.get(1988) == null) {
                setRelativeHorizontalSize(0);
            }
        }
    }

    public void setWrapSide(int i) {
        setShapeAttr(InputDeviceCompat.SOURCE_TOUCHSCREEN, Integer.valueOf(i));
    }

    public void setWrapType(int i) {
        setShapeAttr(EditingLanguage.ARABIC_LIBYA, Integer.valueOf(i));
    }

    public void setZOrder(int i) {
        setShapeAttr(4154, Integer.valueOf(i));
    }

    @ReservedForInternalUse
    @Deprecated
    public void setZOrder_IShape(int i) {
        setZOrder(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void solid() {
        if (getMarkupLanguage() == 1) {
            zzY9J().zzIc(0);
            return;
        }
        zz7X zz7x = (zz7X) zzY9J();
        if (zz7x.zzZQ4() == 5 || zz7x.zzZQ4() == 3) {
            return;
        }
        setFill(new zz1C(zz7x.zzZBn() != null ? zz7x.zzZBn().zzZHt().zzY0(1.0d) : zzBW.zzj(com.aspose.words.internal.zzPV.zzI5)));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void twoColorGradient(int i, int i2) {
        if (getMarkupLanguage() == 1) {
            if (this.zzZ59.get(385) == null) {
                zzY9J().zzm(com.aspose.words.internal.zzPV.zzKa);
            }
            if (this.zzZ59.get(387) == null) {
                zzY9J().zzi(com.aspose.words.internal.zzPV.zzI5);
            }
            zzVN(i, i2);
        } else {
            zz7X zz7x = (zz7X) zzY9J();
            setFill(new zz7C(zz7x.zzZBn() != null ? zz7x.zzZBn().zzZHt() : zzBW.zzj(com.aspose.words.internal.zzPV.zzYR(getDocument().zzZqI().getColors().getAccent1())), zz7x.zzZBm() != null ? zz7x.zzZBm().zzZHt() : zzBW.zzj(com.aspose.words.internal.zzPV.zzI5), i, i2, getDocument().zzZqI()));
            this.zzZsP.remove(790);
        }
        zzY9J().zzY6(true);
    }

    public final boolean zz5K() {
        return zzYbr() != 3;
    }

    public final void zzEk(int i) {
        setShapeAttr(128, Integer.valueOf(i));
    }

    public final void zzHC(int i) {
        zzY9h().zzHC(i);
    }

    public final void zzHD(int i) {
        zzY9h().zzHD(i);
    }

    public final void zzHv(int i) {
        zzY9h().zzHv(i);
    }

    public final void zzHw(int i) {
        zzY9h().zzHw(i);
    }

    public final void zzQT(boolean z) {
        setShapeAttr(945, Boolean.valueOf(z));
    }

    public final void zzS(zzYC3 zzyc3) {
        this.zzZ59 = zzyc3;
    }

    public final com.aspose.words.internal.zzZQ4 zzW9(double d) {
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzY9((float) getWidth()), zzY9((float) getHeight()));
        return (getDocument().zzZpV().zzYVg.getMswVersion() <= 12 || !zzYBX.zzY7((float) d)) ? zzzq4 : com.aspose.words.internal.zzJ6.zzY(zzzq4, 90.0f);
    }

    public final void zzWe(double d) {
        zzT(d, false);
    }

    public final void zzWf(double d) {
        zzU(d, false);
    }

    public final void zzXI(long j) {
        zzY9h().zzXI(j);
    }

    public final void zzXg(long j) {
        this.zzXn0 = j;
    }

    public final void zzXh(long j) {
        this.zzXn1 = j;
    }

    public final void zzXi(long j) {
        if (((int) j) < 0 || ((int) (j >>> 32)) < 0) {
            throw new IllegalArgumentException("Local coordinate space size cannot be less than zero.\r\nParameter name: value");
        }
        zzXI(j);
    }

    public final void zzXj(long j) {
        zzHw((int) j);
        zzHv((int) (j >> 32));
    }

    public final long zzXk(long j) {
        for (CompositeNode parentNode = getParentNode(); parentNode instanceof ShapeBase; parentNode = parentNode.getParentNode()) {
            j = ((ShapeBase) parentNode).zzXl(j);
        }
        return j;
    }

    public final long zzY95() {
        return this.zzXmS;
    }

    public final boolean zzY96() {
        return getName().contains("WordPictureWatermark") && isImage();
    }

    public final boolean zzY97() {
        return getName().contains("PowerPlusWaterMarkObject") && isWordArt();
    }

    public final boolean zzY98() {
        HeaderFooter headerFooter;
        if (getMarkupLanguage() != 1) {
            return false;
        }
        return (zzY97() || zzY96()) && (headerFooter = (HeaderFooter) com.aspose.words.internal.zzZKW.zzZ(zztB(4), HeaderFooter.class)) != null && headerFooter.isHeader();
    }

    public final boolean zzY99() {
        return (getShapeType() == 75 || getShapeType() == 100 || getShapeType() == 0 || zzZid()) ? false : true;
    }

    public final int zzY9A() {
        return ((Integer) fetchShapeAttr(138)).intValue();
    }

    public final int zzY9B() {
        return ((Integer) fetchShapeAttr(128)).intValue();
    }

    public final boolean zzY9C() {
        if (isInline() && com.aspose.words.internal.zzZYD.zzXk(getHRef())) {
            return isImage() || zzY9I();
        }
        return false;
    }

    public final boolean zzY9D() {
        return com.aspose.words.internal.zzZYD.zzXk(getHRef());
    }

    public final double zzY9E() {
        double rotation = 0.0d;
        CompositeNode parentNode = this;
        do {
            rotation += ((ShapeBase) parentNode).getRotation();
            parentNode = parentNode.getParentNode();
            if (parentNode == null) {
                break;
            }
        } while (parentNode.getNodeType() == 17);
        return rotation;
    }

    public final boolean zzY9F() {
        return (isImage() || zzZid() || isHorizontalRule() || isWordArt() || zzY94()) ? false : true;
    }

    public final boolean zzY9G() {
        return ((Boolean) fetchShapeAttr(946)).booleanValue();
    }

    public final boolean zzY9H() {
        return getShapeType() == 201;
    }

    public final boolean zzY9I() {
        return getShapeType() == -2;
    }

    public final zzZAW zzY9J() {
        if (getMarkupLanguage() != 1) {
            this.zzXmR = ((zzZCL) this.zzYYM).getFill();
        } else if (this.zzXmR == null) {
            this.zzXmR = new zzY2X();
        }
        this.zzXmR.zzZ(this);
        return this.zzXmR;
    }

    public final long zzY9K() {
        return com.aspose.words.internal.zzZPX.zzZm(zzY9h().zzZyj(), zzY9h().zzZyi());
    }

    public final long zzY9L() {
        return com.aspose.words.internal.zzZPZ.zzZm(zzY9h().zzZyh(), zzY9h().zzZyg());
    }

    public final boolean zzY9M() {
        return ((Integer) fetchShapeAttr(4143)).intValue() == 0 && ((Integer) fetchShapeAttr(4145)).intValue() == 0 && ((Integer) fetchShapeAttr(4144)).intValue() == 0 && ((Integer) fetchShapeAttr(4146)).intValue() == 0;
    }

    public final com.aspose.words.internal.zzZQ4 zzY9N() {
        return zzY9Q();
    }

    public final com.aspose.words.internal.zzZQ4 zzY9O() {
        return new com.aspose.words.internal.zzZQ4((float) getLeft(), (float) getTop(), (float) getWidth(), (float) getHeight());
    }

    public final boolean zzY9P() {
        return getShapeType() == 202;
    }

    public final void zzY9U() throws Exception {
        com.aspose.words.internal.zzEG zzegZzY9Y;
        if (com.aspose.words.internal.zzAN.zzZD(getWidth()) && com.aspose.words.internal.zzAN.zzZD(getHeight()) && (zzegZzY9Y = zzY9Y()) != null) {
            zzU(zzegZzY9Y.getWidthPoints(), false);
            zzT(zzegZzY9Y.getHeightPoints(), false);
        }
    }

    public final byte[] zzY9V() throws Exception {
        if (zzY9W()) {
            return ((zz3V) this.zzYYM).zzZwy().zzZQ1().getExtensions().get("{96DAC541-7B7A-43D3-8B79-37D633B846F1}").zzZBO().getImageBytes();
        }
        return null;
    }

    public final boolean zzY9W() {
        zz82 zz82Var;
        zz3V zz3v = (zz3V) com.aspose.words.internal.zzZKW.zzZ(this.zzYYM, zz3V.class);
        return (zz3v == null || zz3v.zzZwy() == null || !zz3v.zzZwy().zzZQ1().hasExtensions() || (zz82Var = zz3v.zzZwy().zzZQ1().getExtensions().get("{96DAC541-7B7A-43D3-8B79-37D633B846F1}")) == null || zz82Var.zzZBO() == null) ? false : true;
    }

    public final void zzY9X() {
        if (!isSignatureLine()) {
            setShapeAttr(1983, Boolean.TRUE);
            setShapeAttr(1922, com.aspose.words.internal.zzZOZ.zzZXP.toString("B").toUpperCase());
        }
    }

    public final com.aspose.words.internal.zzEG zzY9Y() throws Exception {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(this, Shape.class);
        if (shape == null || !shape.hasImage()) {
            return null;
        }
        ImageData imageData = shape.getImageData();
        byte[] imageBytes = shape.zzZjT() ? imageData.getImageBytes() : imageData.zzYW2();
        if (imageBytes != null) {
            return com.aspose.words.internal.zzEF.zzZT(imageBytes);
        }
        return null;
    }

    public final void zzY9Z() {
        if (zzbR() == null || zzbR().getDocument() == getDocument()) {
            return;
        }
        zzbR().zzYG(getDocument().zzZq3());
    }

    public final zz2O zzY9a() {
        zz2O zz2o = this.zzXn5;
        if (zz2o != null) {
            return zz2o;
        }
        zz2O zz2o2 = (zz2O) com.aspose.words.internal.zzZKW.zzZ(this.zzYYM, zz2O.class);
        this.zzXn5 = zz2o2;
        return zz2o2;
    }

    public final int zzY9b() {
        return (int) (zzY9d() >>> 32);
    }

    public final int zzY9c() {
        return (int) zzY9d();
    }

    public final long zzY9d() {
        if (zzY9h().zzZyj() > 0 && zzY9h().zzZyi() > 0) {
            return zzY9K();
        }
        if (com.aspose.words.internal.zzZPX.zzYF(this.zzXmT)) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzY9R = zzY9R();
            if (zzzq4ZzY9R.isEmpty()) {
                zzzq4ZzY9R = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, 1.0f, 1.0f);
            }
            this.zzXmT = com.aspose.words.internal.zzZPX.zzZm(zzY9h().zzZyj() <= 0 ? (int) zzzq4ZzY9R.getWidth() : zzY9h().zzZyj(), zzY9h().zzZyi() <= 0 ? (int) zzzq4ZzY9R.getHeight() : zzY9h().zzZyi());
        }
        return this.zzXmT;
    }

    public final void zzY9e() {
        this.zzXmU = true;
    }

    public final boolean zzY9f() {
        return this.zzXmU;
    }

    public final boolean zzY9g() {
        return this.zzZ59.contains(1988) || this.zzZ59.contains(1989);
    }

    public final zzZLD zzY9h() {
        if (this.zzXn3 == null) {
            this.zzXn3 = new zzY2L(this);
        }
        return this.zzXn3;
    }

    public final zz53 zzY9i() {
        return this.zzYYM;
    }

    public final long zzY9j() {
        return this.zzXn0;
    }

    public final long zzY9k() {
        return this.zzXn1;
    }

    public final int zzY9l() {
        return this.zzXn2;
    }

    public final boolean zzY9m() throws Exception {
        if (getMarkupLanguage() == 0 && getNodeType() == 18) {
            ImageData imageData = ((Shape) this).getImageData();
            return (imageData.zzZjT() && com.aspose.words.internal.zzEF.zzZC(imageData.getImageBytes())) ? false : true;
        }
        return true;
    }

    public final ShapeBase zzY9n() {
        if (zzbR() != null) {
            return (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzbR().getFirstChild(), ShapeBase.class);
        }
        return null;
    }

    public final boolean zzY9o() {
        if (this.zzXmY > 0 || this.zzXmX > 0) {
            return true;
        }
        Node nodeZzZYr = zzZYr();
        return nodeZzZYr != null && nodeZzZYr.zzYAY() == 3;
    }

    public final int zzY9p() {
        return this.zzXmW;
    }

    public final int zzY9q() {
        return this.zzXmX;
    }

    public final int zzY9r() {
        return this.zzXmY;
    }

    public final boolean zzY9s() {
        return zzY9a() != null;
    }

    public final boolean zzY9t() {
        int shapeType = getShapeType();
        return shapeType == 87 || shapeType == 88 || shapeType == 186;
    }

    public final boolean zzY9u() {
        int shapeType = getShapeType();
        return shapeType == 85 || shapeType == 86 || shapeType == 185;
    }

    public final boolean zzY9v() {
        int shapeType = getShapeType();
        if (shapeType == 120 || shapeType == 177) {
            return true;
        }
        switch (shapeType) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                return true;
            default:
                return false;
        }
    }

    public final boolean zzY9w() {
        int shapeType = getShapeType();
        if (shapeType == 106) {
            return true;
        }
        switch (shapeType) {
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                return true;
            default:
                switch (shapeType) {
                    case 61:
                    case 62:
                    case 63:
                        return true;
                    default:
                        switch (shapeType) {
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                                return true;
                            default:
                                switch (shapeType) {
                                    case 178:
                                    case 179:
                                    case 180:
                                    case 181:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public final long[] zzY9x() {
        return zzZLG.zzZ((zzYM5[]) fetchShapeAttr(899), (int[]) null);
    }

    public final boolean zzY9y() {
        return isInline() && zzY9F();
    }

    public final boolean zzY9z() {
        return ((Boolean) fetchShapeAttr(1855)).booleanValue();
    }

    public final void zzYa0() throws Exception {
        this.zzXmV = zzY9S();
    }

    public final boolean zzYa1() throws Exception {
        return this.zzXmV != zzY9S();
    }

    public final void zzYa2() {
        Section section;
        if (isTopLevel()) {
            if ((getMarkupLanguage() != 0 || this.zzYYM.zzZyo()) && (section = (Section) getAncestor(2)) != null) {
                PageSetup pageSetup = section.getPageSetup();
                zzZ(pageSetup);
                zzY(pageSetup);
                zzX(pageSetup);
                zzW(pageSetup);
            }
        }
    }

    public final void zzYa3() {
        if (isHorizontalRule() && this.zzZ59.contains(917)) {
            zzT(((double) ((Integer) getDirectShapeAttr(917)).intValue()) / 20.0d, false);
            removeShapeAttr(917);
        }
    }

    public final void zzYa4() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzY9R = zzY9R();
        if (com.aspose.words.internal.zzZPW.zzYF(zzzq4ZzY9R.getSize())) {
            return;
        }
        double width = ((double) zzzq4ZzY9R.getWidth()) / 20.0d;
        double height = ((double) zzzq4ZzY9R.getHeight()) / 20.0d;
        zzU(width, false);
        zzT(height, false);
        setLeft(((double) zzzq4ZzY9R.getX()) / 20.0d);
        setTop(((double) zzzq4ZzY9R.getY()) / 20.0d);
        zzYM5[] zzym5Arr = (zzYM5[]) this.zzZ59.get(StyleIdentifier.LIST_TABLE_4);
        for (int i = 0; i < zzym5Arr.length; i++) {
            zzym5Arr[i] = new zzYM5(zzym5Arr[i].zzYnG().getValue() - ((int) zzzq4ZzY9R.getX()), zzym5Arr[i].zzYnF().getValue() - ((int) zzzq4ZzY9R.getY()));
        }
        setShapeAttr(StyleIdentifier.LIST_TABLE_4, zzym5Arr);
    }

    public final boolean zzYa5() {
        zzYM5[] zzym5Arr = (zzYM5[]) this.zzZ59.zzPk(StyleIdentifier.LIST_TABLE_4);
        return getShapeType() == 0 && com.aspose.words.internal.zzAN.zzZD(getWidth()) && com.aspose.words.internal.zzAN.zzZD(getHeight()) && zzym5Arr != null && zzym5Arr.length > 0;
    }

    public final ShapeBase zzYa6() {
        ShapeBase shapeBase = this;
        while (!shapeBase.isTopLevel()) {
            shapeBase = (ShapeBase) shapeBase.getParentNode();
        }
        return shapeBase;
    }

    public final void zzYa7() throws Exception {
        zzY9U();
        zzU(getWidth(), false);
        zzT(getHeight(), false);
    }

    public final boolean zzYa8() {
        return getChildNodes(9, true).getCount() > 0;
    }

    public final boolean zzYa9() {
        if (getNodeType() == 18) {
            return !com.aspose.words.internal.zzZKN.zzU3(getHRef());
        }
        Iterator<T> it = getChildNodes(18, true).iterator();
        while (it.hasNext()) {
            it.next();
            if (!com.aspose.words.internal.zzZKN.zzU3(getHRef())) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYaa() {
        return getChildNodes(22, true).getCount() > 0;
    }

    public final boolean zzYac() {
        if (getNodeType() == 18) {
            return hasChildNodes();
        }
        Iterator<T> it = getChildNodes(18, true).iterator();
        while (it.hasNext()) {
            if (((Shape) it.next()).hasChildNodes()) {
                return true;
            }
        }
        return false;
    }

    public int zzYbr() {
        return ((Integer) fetchShapeAttr(771)).intValue();
    }

    public final zzZBL zzYrB() {
        return (zzZBL) fetchShapeAttr(4112);
    }

    public final zzYC3 zzYvW() {
        return this.zzZ59;
    }

    public final com.aspose.words.internal.zzZQ4 zzYzG() {
        return zzZ2(zzY9O());
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public Node zzZ(boolean z, zzZA5 zzza5) {
        ShapeBase shapeBase = (ShapeBase) super.zzZ(z, zzza5);
        shapeBase.zzZ59 = (zzYC3) this.zzZ59.zzbn();
        shapeBase.zzZsP = (zzYEF) this.zzZsP.zzbn();
        shapeBase.zzXn4 = null;
        shapeBase.zzZsK = null;
        shapeBase.zzXn3 = null;
        zz53 zz53Var = this.zzYYM;
        if (zz53Var != null) {
            shapeBase.zzU(zz53Var.zzY(z, zzza5));
            shapeBase.zzYYM.zzO(shapeBase);
        }
        return shapeBase;
    }

    public final com.aspose.words.internal.zzZQ4 zzZ0(com.aspose.words.internal.zzZQ4 zzzq4) {
        return com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzZm() - ((float) (((double) ((Integer) fetchShapeAttr(4143)).intValue()) / 12700.0d)), zzzq4.zzZo() - ((float) (((double) ((Integer) fetchShapeAttr(4144)).intValue()) / 12700.0d)), zzzq4.zzkw() + ((float) (((double) ((Integer) fetchShapeAttr(4145)).intValue()) / 12700.0d)), zzzq4.zzZn() + ((float) (((double) ((Integer) fetchShapeAttr(4146)).intValue()) / 12700.0d)));
    }

    public final void zzZ1(com.aspose.words.internal.zzZQ4 zzzq4) {
        setLeft(zzzq4.zzZm());
        setTop(zzzq4.zzZo());
        zzU(zzzq4.getWidth(), false);
        zzT(zzzq4.getHeight(), false);
    }

    public final com.aspose.words.internal.zzZQ4 zzZ2(com.aspose.words.internal.zzZQ4 zzzq4) {
        long jZzXk = zzXk(zzzq4.zzZE());
        long jZzXk2 = zzXk(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()));
        int i = (int) jZzXk;
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzXk), Float.intBitsToFloat((int) jZzXk2) - Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzXk2) - com.aspose.words.internal.zzZPY.zzYC(jZzXk));
    }

    public final boolean zzZ4E() {
        return zztB(4) != null;
    }

    public abstract boolean zzZ55();

    public final boolean zzZC2() throws Exception {
        if (zzY9o()) {
            return !com.aspose.words.internal.zzZYD.zzXh(getText()) || zzYab();
        }
        return false;
    }

    public final boolean zzZPF() {
        zz53 zz53Var = zzYa6().zzYYM;
        return zz53Var != null && zz53Var.zzZHY() == 5;
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }

    public final boolean zzZid() {
        return zzY9I() || zzY9H();
    }

    public final byte[] zzZik() {
        return (byte[]) getDirectShapeAttr(1792);
    }

    public final boolean zzZtk() {
        return ((Boolean) fetchShapeAttr(945)).booleanValue();
    }

    public final int zzZyg() {
        return zzY9h().zzZyg();
    }

    public final int zzZyh() {
        return zzY9h().zzZyh();
    }

    public final int zzZyi() {
        return zzY9h().zzZyi();
    }

    public final int zzZyj() {
        return zzY9h().zzZyj();
    }

    public final void zze(double d, double d2) throws Exception {
        zzZ(d, d2, (zzYB5) null, 0.0d);
    }

    public final void zzm7(int i) {
        this.zzXn2 = i;
    }

    public final void zzm8(int i) {
        this.zzXmW = i;
    }

    public final void zzm9(int i) {
        this.zzXmX = i;
    }

    public final void zzma(int i) {
        this.zzXmY = i;
    }

    public final void zzmb(int i) {
        setShapeAttr(138, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ9G
    @ReservedForInternalUse
    @Deprecated
    public Object getDirectRunAttr(int i, int i2) {
        return this.zzZsP.zzVQ(i, i2);
    }

    public void isDecorative(boolean z) {
        zzY9h().zzXh(z);
    }

    public void isLayoutInCell(boolean z) {
        setShapeAttr(944, Boolean.valueOf(z));
    }

    public final void zzU(zz53 zz53Var) {
        if (zz53Var != null) {
            zz53Var.zzO(this);
        }
        this.zzYYM = zz53Var;
        this.zzXn3 = zz53Var;
    }

    private static long[] zzY(zzYM5[] zzym5Arr) {
        if (zzym5Arr == null || zzym5Arr.length <= 0) {
            return null;
        }
        long[] jArr = new long[zzym5Arr.length];
        for (int i = 0; i < zzym5Arr.length; i++) {
            zzYM5 zzym5 = zzym5Arr[i];
            jArr[i] = com.aspose.words.internal.zzZPY.zzG(zzym5.zzYnG().getValue(), zzym5.zzYnF().getValue());
        }
        return jArr;
    }

    public final void zzZ(double d, double d2, zzYB5 zzyb5, double d3) throws Exception {
        zzYB5 zzyb5ZzZ = zzYBZ.zzZ(this, d, d2, zzyb5, d3);
        zzU(zzyb5ZzZ.getWidth(), false);
        zzT(zzyb5ZzZ.getHeight(), false);
    }

    public final void zzZ(zzYEF zzyef) {
        this.zzZsP = zzyef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(PageSetup pageSetup) {
        Object obj = this.zzZ59.get(1986);
        if (obj != null) {
            Integer num = (Integer) obj;
            if (num.intValue() == -10001) {
                return;
            }
            double dIntValue = ((double) num.intValue()) / 1000.0d;
            int relativeHorizontalPosition = getRelativeHorizontalPosition();
            if (relativeHorizontalPosition == 0) {
                setLeft(((double) pageSetup.zzYRX()) * dIntValue);
            } else if (relativeHorizontalPosition == 1) {
                setLeft(pageSetup.getPageWidth() * dIntValue);
            } else if (relativeHorizontalPosition == 4) {
                setLeft(pageSetup.getLeftMargin() * dIntValue);
            } else if (relativeHorizontalPosition == 5 || relativeHorizontalPosition == 6) {
                setLeft(pageSetup.getRightMargin() * dIntValue);
            } else if (relativeHorizontalPosition == 7) {
            }
            if (getMarkupLanguage() == 0) {
                double dIntValue2 = ((double) ((Integer) fetchShapeAttr(4143)).intValue()) / 12700.0d;
                if (com.aspose.words.internal.zzAN.zzZD(dIntValue2)) {
                    return;
                }
                setLeft(getLeft() + dIntValue2);
            }
        }
    }
}
