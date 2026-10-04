package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class Shape extends ShapeBase implements zzZ92, zzZ95 {
    private zzZ94 zzXno;
    private HorizontalRuleFormat zzXnp;
    private SignatureLine zzXnq;
    private Chart zzXnr;
    private ImageData zzXns;
    private TextBox zzXnt;
    private Stroke zzXnu;

    public Shape(DocumentBase documentBase) {
        this(documentBase, (byte) 1);
    }

    private zzZ94 zzYay() {
        if (this.zzXno == null) {
            if (getMarkupLanguage() == 1) {
                this.zzXno = new zzY2J(this);
            } else {
                zzZCL zzzcl = (zzZCL) zzY9i();
                zz4G outline = zzzcl.getOutline();
                if (zzzcl.zzZTj() != null) {
                    outline.zzX(zzYbv());
                }
                outline.getFill().zzZ(this);
                this.zzXno = outline;
            }
        }
        return this.zzXno;
    }

    private boolean zzYaz() {
        int layoutFlow = getLayoutFlow();
        return layoutFlow == 1 || layoutFlow == 2 || layoutFlow == 3 || layoutFlow == 5;
    }

    private zz4G zzYbv() {
        getMarkupLanguage();
        zz5U zz5uZzZu4 = ((zz2J) zzY9i()).zzZTj().zzZu4();
        int iZzZC7 = zz5uZzZu4.zzZC7();
        Theme themeZzZqI = getDocument().zzZqI();
        zz4G zz4g = (iZzZC7 == 0 || themeZzZqI == null) ? new zz4G() : themeZzZqI.getLineStyle(iZzZC7 - 1);
        zz4g.zzV(zz5uZzZu4.zzZQX());
        return zz4g;
    }

    public static boolean zzZG(Shape shape) throws Exception {
        if (shape != null) {
            return shape.getFilled() || shape.hasImage() || shape.getMarkupLanguage() == 0;
        }
        return false;
    }

    public static Shape zzZY(Document document) throws Exception {
        Shape shape = new Shape(document, 1);
        shape.setWrapType(0);
        shape.setFilled(true);
        shape.setFillColor(zzZKI.zzYtz.zzPG());
        shape.setStroked(false);
        shape.zzY9h().zzZyf().zzZ4y();
        shape.zzY9h().zzZyf().zzZ4x();
        shape.setHeight(1.5d);
        shape.zzWf(document.getFirstSection().getPageSetup().zzYRX());
        shape.zzY9h().zzZyf().zzX3(100.0d);
        return shape;
    }

    private static boolean zzmj(int i) {
        return i == 0 || i == 12 || i == 1 || zzmk(i);
    }

    private static boolean zzmk(int i) {
        return i == 3 || i == 2;
    }

    private static boolean zzml(int i) {
        return i == 0 || i == 1 || i == 8 || zzmk(i);
    }

    private static boolean zzmm(int i) {
        return i == 9 || i == 8 || zzmk(i);
    }

    @Override // com.aspose.words.Node
    public final boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitShapeEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public final int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitShapeStart(this);
    }

    public final Chart getChart() {
        if (!hasChart()) {
            throw new IllegalStateException("This Shape does not have a Chart.");
        }
        if (this.zzXnr == null) {
            this.zzXnr = new Chart((zzD8) zzY9i());
        }
        return this.zzXnr;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getDashStyle() {
        return zzYay().getDashStyle();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getEndArrowLength() {
        return zzYay().getEndArrowLength();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getEndArrowType() {
        return zzYay().getEndArrowType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getEndArrowWidth() {
        return zzYay().getEndArrowWidth();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getEndCap() {
        return zzYay().getEndCap();
    }

    public final boolean getExtrusionEnabled() {
        return zzY9h().getExtrusionEnabled();
    }

    public final int getFillColor() {
        return getFilledColor();
    }

    public final boolean getFilled() {
        return zzY9J().getOn();
    }

    public final Paragraph getFirstParagraph() {
        return (Paragraph) getChild(8, 0, false);
    }

    @Override // com.aspose.words.zzZ92
    @ReservedForInternalUse
    @Deprecated
    public final float getHorizontalMargins_ITextBox() {
        if (zzYaz()) {
            return 0.0f;
        }
        return (float) new zzYCG(this).zzYax();
    }

    public final HorizontalRuleFormat getHorizontalRuleFormat() {
        if (!isHorizontalRule()) {
            return null;
        }
        if (this.zzXnp == null) {
            this.zzXnp = new HorizontalRuleFormat(this);
        }
        return this.zzXnp;
    }

    public final ImageData getImageData() {
        if (!canHaveImage()) {
            return null;
        }
        if (this.zzXns == null) {
            this.zzXns = new ImageData(this, (Document) com.aspose.words.internal.zzZKW.zzZ(getDocument(), Document.class));
        }
        return this.zzXns;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getJoinStyle() {
        return zzYay().getJoinStyle();
    }

    public final Paragraph getLastParagraph() {
        return (Paragraph) getChild(8, -1, false);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getLineFillType() {
        return zzYay().getLineFillType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getLineStyle() {
        return zzYay().getLineStyle();
    }

    @Override // com.aspose.words.zzZ92
    @ReservedForInternalUse
    @Deprecated
    public final byte getMarkupLanguage_ITextBox() {
        return getMarkupLanguage();
    }

    @Override // com.aspose.words.Node
    public final int getNodeType() {
        return 18;
    }

    public final OleFormat getOleFormat() {
        return zzY9h().getOleFormat();
    }

    public final int getRenderMode() {
        return ((Integer) fetchShapeAttr(713)).intValue();
    }

    public final boolean getShadowEnabled() {
        return zzY9h().getShadowEnabled();
    }

    public final SignatureLine getSignatureLine() {
        if (getDirectShapeAttr(1983) == null) {
            return null;
        }
        if (this.zzXnq == null) {
            this.zzXnq = new SignatureLine(this);
        }
        return this.zzXnq;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getStartArrowLength() {
        return zzYay().getStartArrowLength();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getStartArrowType() {
        return zzYay().getStartArrowType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getStartArrowWidth() {
        return zzYay().getStartArrowWidth();
    }

    public final int getStoryType() {
        return 5;
    }

    public final Stroke getStroke() {
        if (this.zzXnu == null) {
            this.zzXnu = new Stroke(this);
        }
        return this.zzXnu;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final com.aspose.words.internal.zzPV getStrokeBackColor() {
        return zzYay().zzZBx();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getStrokeBackThemeColor() throws Exception {
        zzBW zzbwZzZBm;
        if (getMarkupLanguage() == 1) {
            return zzZO0.zzZ(zzYay().zzZBx(), getDocument().zzZqI());
        }
        zz7X strokeFill = zzYay().getStrokeFill();
        if (strokeFill == null || (zzbwZzZBm = strokeFill.zzZBm()) == null || zzbwZzZBm.zzZHs() != 5) {
            return -1;
        }
        return ((zz2Q) zzbwZzZBm).getValue();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final double getStrokeBackTintAndShade() {
        double value;
        int iIntValue;
        if (getMarkupLanguage() != 1) {
            zzBW zzbwZzZBm = zzYay().getStrokeFill().zzZBm();
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
            if (zzYvW().get(477) == null || zzYvW().get(479) == null || (iIntValue = ((Integer) zzYvW().get(479)).intValue()) <= -256 || iIntValue >= 256) {
                return 0.0d;
            }
            if (iIntValue < 0) {
                return (-1.0d) - (((double) iIntValue) / 255.0d);
            }
            value = ((double) iIntValue) / 255.0d;
        }
        return 1.0d - value;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final com.aspose.words.internal.zzPV getStrokeBaseForeColor() {
        return zzYay().zzZBy();
    }

    public final int getStrokeColor() {
        return getStroke().getColor();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final zz7X getStrokeFill() {
        return zzYay().getStrokeFill();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final com.aspose.words.internal.zzPV getStrokeForeColor() {
        return zzYay().zz8Q();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final int getStrokeForeThemeColor() throws Exception {
        zzBW zzbwZzZBn;
        if (getMarkupLanguage() == 1) {
            return zzZO0.zzZ(zzYay().zz8Q(), getDocument().zzZqI());
        }
        zz7X strokeFill = zzYay().getStrokeFill();
        if (strokeFill == null || (zzbwZzZBn = strokeFill.zzZBn()) == null || zzbwZzZBn.zzZHs() != 5) {
            return -1;
        }
        return ((zz2Q) zzbwZzZBn).getValue();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final double getStrokeForeTintAndShade() {
        double value;
        int iIntValue;
        if (getMarkupLanguage() != 1) {
            zzBW zzbwZzZBn = zzYay().getStrokeFill().zzZBn();
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
            if (zzYvW().get(473) == null || zzYvW().get(475) == null || (iIntValue = ((Integer) zzYvW().get(475)).intValue()) <= -256 || iIntValue >= 256) {
                return 0.0d;
            }
            if (iIntValue < 0) {
                return (-1.0d) - (((double) iIntValue) / 255.0d);
            }
            value = ((double) iIntValue) / 255.0d;
        }
        return 1.0d - value;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final byte[] getStrokeImageBytes() throws Exception {
        return zzYay().getImageBytes();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final zzZ90 getStrokeThemeProvider() {
        return getDocument().zzZqI();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final double getStrokeTransparency() {
        return 1.0d - zzYay().getOpacity();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final boolean getStrokeVisible() {
        return zzYay().getOn();
    }

    public final double getStrokeWeight() {
        return getStroke().getWeight();
    }

    public final boolean getStroked() {
        return getStroke().getOn();
    }

    public final TextBox getTextBox() {
        if (this.zzXnt == null) {
            this.zzXnt = new TextBox(this);
        }
        return this.zzXnt;
    }

    @Override // com.aspose.words.zzZ92
    @ReservedForInternalUse
    @Deprecated
    public final int getTextBoxWrapMode_ITextBox() {
        return getTextBox().getTextBoxWrapMode();
    }

    public final TextPath getTextPath() {
        return zzY9h().getTextPath();
    }

    @Override // com.aspose.words.zzZ92
    @ReservedForInternalUse
    @Deprecated
    public final int getTextboxLayoutFlow_ITextBox() {
        return getLayoutFlow();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final double getWeight() {
        return zzYay().getWeight();
    }

    public final boolean hasChart() {
        if (zzY9i() != null) {
            return zzY9i().zzZHY() == 6 || zzY9i().zzZHY() == 13;
        }
        return false;
    }

    public final boolean hasImage() throws Exception {
        return canHaveImage() && getImageData().hasImage();
    }

    public final boolean hasSmartArt() {
        return zzY9i() != null && zzY9i().zzZHY() == 7;
    }

    @Override // com.aspose.words.zzZ92
    @ReservedForInternalUse
    @Deprecated
    public final boolean hasVerticalTextFlow_ITextBox() {
        return zzYaz();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setDashStyle(int i) {
        zzYay().setDashStyle(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setEndArrowLength(int i) {
        zzYay().setEndArrowLength(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setEndArrowType(int i) {
        zzYay().setEndArrowType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setEndArrowWidth(int i) {
        zzYay().setEndArrowWidth(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setEndCap(int i) {
        zzYay().setEndCap(i);
    }

    public final void setFillColor(int i) {
        setFilledColor(i);
    }

    public final void setFilled(boolean z) {
        zzY9J().setOn(z);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setJoinStyle(int i) {
        zzYay().setJoinStyle(i);
    }

    @ReservedForInternalUse
    @Deprecated
    public final void setLineFillType(int i) {
        zzYay().setLineFillType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setLineStyle(int i) {
        zzYay().setLineStyle(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStartArrowLength(int i) {
        zzYay().setStartArrowLength(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStartArrowType(int i) {
        zzYay().setStartArrowType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStartArrowWidth(int i) {
        zzYay().setStartArrowWidth(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeBackColor(com.aspose.words.internal.zzPV zzpv) {
        zzYay().zzi(zzpv);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeBackThemeColor(int i) throws Exception {
        if (getMarkupLanguage() == 1) {
            zzYay().zzi(i != -1 ? zzZO0.zzZ(i, getDocument().zzZqI()) : zzYay().zzZBx());
            return;
        }
        if (i == -1) {
            zzBW zzbwZzZBm = zzYay().getStrokeFill().zzZBm();
            if (zzbwZzZBm == null || zzbwZzZBm.zzZHs() != 5) {
                return;
            }
            zzYay().zzi(((zz2Q) zzbwZzZBm).zzS(getDocument().zzZqI()).zzY(getDocument().zzZqI()));
            return;
        }
        zzYay().zzi(com.aspose.words.internal.zzPV.zzHZ);
        zz7X strokeFill = zzYay().getStrokeFill();
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(i);
        strokeFill.zzO(zz2q);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeBackTintAndShade(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "BackTintAndShade");
        if (getMarkupLanguage() == 1) {
            com.aspose.words.internal.zzPV zzpvZzZBx = zzYvW().get(477) != null ? (com.aspose.words.internal.zzPV) zzYvW().get(477) : zzYay().zzZBx();
            zzYvW().set(477, zzpvZzZBx);
            int iZzX8 = zzZO0.zzX8(d);
            zzYvW().set(479, Integer.valueOf(d >= 0.0d ? iZzX8 : -iZzX8));
            if (d > 0.0d) {
                zzYay().zzi(zzZO0.zzX(zzpvZzZBx, iZzX8));
            }
            if (d < 0.0d) {
                zzYay().zzi(zzZO0.zzW(zzpvZzZBx, iZzX8));
                return;
            }
            return;
        }
        zzBW zzbwZzZBm = zzYay().getStrokeFill().zzZBm();
        if (zzbwZzZBm != null) {
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
    }

    public final void setStrokeColor(int i) {
        getStroke().setColor(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeFill(zz7X zz7x) {
        zzYay().setStrokeFill(zz7x);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeForeColor(com.aspose.words.internal.zzPV zzpv) {
        zzYay().zzm(zzpv);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeForeThemeColor(int i) throws Exception {
        if (getMarkupLanguage() == 1) {
            zzYay().zzm(i != -1 ? zzZO0.zzZ(i, getDocument().zzZqI()) : zzYay().zz8Q());
            return;
        }
        if (i == -1) {
            zzBW zzbwZzZBn = zzYay().getStrokeFill().zzZBn();
            if (zzbwZzZBn.zzZHs() == 5) {
                zzYay().zzm(((zz2Q) zzbwZzZBn).zzS(getDocument().zzZqI()).zzY(getDocument().zzZqI()));
                return;
            }
            return;
        }
        zzYay().zzm(com.aspose.words.internal.zzPV.zzHZ);
        zz7X strokeFill = zzYay().getStrokeFill();
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(i);
        strokeFill.zzP(zz2q);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeForeTintAndShade(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, -1.0d, 1.0d, "ForeTintAndShade");
        if (getMarkupLanguage() == 1) {
            com.aspose.words.internal.zzPV zzpvZz8Q = zzYvW().get(473) != null ? (com.aspose.words.internal.zzPV) zzYvW().get(473) : zzYay().zz8Q();
            zzYvW().set(473, zzpvZz8Q);
            int iZzX8 = zzZO0.zzX8(d);
            zzYvW().set(475, Integer.valueOf(d >= 0.0d ? iZzX8 : -iZzX8));
            if (d > 0.0d) {
                zzYay().zzm(zzZO0.zzX(zzpvZz8Q, iZzX8));
            }
            if (d < 0.0d) {
                zzYay().zzm(zzZO0.zzW(zzpvZz8Q, iZzX8));
                return;
            }
            return;
        }
        zzBW zzbwZzZBn = zzYay().getStrokeFill().zzZBn();
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

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeTransparency(double d) {
        zzYay().setOpacity(1.0d - d);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setStrokeVisible(boolean z) {
        zzYay().setOn(z);
    }

    public final void setStrokeWeight(double d) {
        getStroke().setWeight(d);
    }

    public final void setStroked(boolean z) {
        getStroke().setOn(z);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public final void setWeight(double d) {
        zzYay().setWeight(d);
    }

    public final void updateSmartArtDrawing() throws Exception {
        zzAV zzav;
        if (hasSmartArt() && (zzav = (zzAV) com.aspose.words.internal.zzZKW.zzZ(zzY9i(), zzAV.class)) != null) {
            zz4I zz4i = new zz4I();
            zz4i.zzZ(new zzY21(getDocument().getWarningCallback()));
            zz50 zz50Var = new zz50(new zz34(getDocument(), zz4i));
            zz50Var.zzXT(zzYzG().getSize());
            zzav.zzW(zz50Var);
        }
    }

    public final void zzB6(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        setShapeAttr(919, str);
    }

    public final void zzB7(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        setShapeAttr(910, str);
    }

    public final void zzQW(boolean z) throws Exception {
        if (hasImage()) {
            if (z) {
                if (com.aspose.words.internal.zzAN.zzZD(getWidth())) {
                    zzWf(ShapeBase.zzXn6);
                }
                if (com.aspose.words.internal.zzAN.zzZD(getHeight())) {
                    zzWe(ShapeBase.zzXn6);
                    return;
                }
                return;
            }
            if (zzZjT() && com.aspose.words.internal.zzAN.zzZD(getWidth()) && com.aspose.words.internal.zzAN.zzZD(getHeight())) {
                zzWf(getImageData().getImageSize().getWidthPoints());
                zzWe(getImageData().getImageSize().getHeightPoints());
            }
        }
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        if (getMarkupLanguage() == 1) {
            return zzYVU.zzXR(node);
        }
        int iZzZHY = zzY9i().zzZHY();
        if (iZzZHY == 8 && zzYVU.zzXR(node)) {
            return true;
        }
        if (node.getNodeType() != 18 && node.getNodeType() != 17) {
            return false;
        }
        if (!(zzY9i() instanceof zzBK) && iZzZHY != 6 && iZzZHY != 13) {
            return false;
        }
        int iZzZHY2 = ((ShapeBase) node).zzY9i().zzZHY();
        if ((iZzZHY == 10 || iZzZHY == 9) && zzmm(iZzZHY2)) {
            return true;
        }
        if ((iZzZHY == 5 || iZzZHY == 3) && zzml(iZzZHY2)) {
            return true;
        }
        if ((iZzZHY == 6 || iZzZHY == 13) && zzmj(iZzZHY2)) {
            return true;
        }
        if (iZzZHY == 12 && (iZzZHY2 == 6 || iZzZHY2 == 13 || iZzZHY2 == 7)) {
            return true;
        }
        return (iZzZHY == 3 || iZzZHY == 9) && iZzZHY2 == 12;
    }

    public final int zzXT() {
        return ((Integer) fetchShapeAttr(512)).intValue();
    }

    public final boolean zzYaA() throws Exception {
        return zzY99() && com.aspose.words.internal.zzZ1.zzX(zzY9J().getImageBytes());
    }

    public final boolean zzYaB() {
        return zz5K() || getShapeType() == 20;
    }

    public final boolean zzYaC() {
        return ((Boolean) fetchShapeAttr(442)).booleanValue();
    }

    public final zzYM4[] zzYaD() {
        zzYM4[] zzym4Arr = (zzYM4[]) fetchShapeAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3);
        if (zzym4Arr != null && zzym4Arr.length > 0) {
            return zzym4Arr;
        }
        zzYM4 zzym4 = new zzYM4();
        zzym4.zzXFj = new zzYM2(-zzY9h().zzZyh(), false);
        zzym4.zzXFi = new zzYM2(-zzY9h().zzZyg(), false);
        zzym4.zzXFh = new zzYM2(zzY9h().zzZyj() - zzY9h().zzZyh(), false);
        zzym4.zzXFg = new zzYM2(zzY9h().zzZyi() - zzY9h().zzZyg(), false);
        return new zzYM4[]{zzym4};
    }

    public final zzZL3[] zzYaE() {
        return (zzZL3[]) fetchShapeAttr(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2);
    }

    public final boolean zzYaF() {
        return ((Boolean) fetchShapeAttr(701)).booleanValue();
    }

    public final int zzYaG() {
        return ((Integer) fetchShapeAttr(641)).intValue();
    }

    public final int zzYaH() {
        return ((Integer) fetchShapeAttr(640)).intValue();
    }

    public final int zzYaI() {
        return ((Integer) fetchShapeAttr(722)).intValue();
    }

    public final boolean zzYaJ() {
        return ((Boolean) fetchShapeAttr(767)).booleanValue();
    }

    public final int zzYaK() {
        return ((Integer) fetchShapeAttr(730)).intValue();
    }

    public final int zzYaL() {
        return ((Integer) fetchShapeAttr(729)).intValue();
    }

    public final int zzYaM() {
        return ((Integer) fetchShapeAttr(728)).intValue();
    }

    public final int zzYaN() {
        return ((Integer) fetchShapeAttr(727)).intValue();
    }

    public final boolean zzYaO() {
        return ((Boolean) fetchShapeAttr(766)).booleanValue();
    }

    public final int zzYaP() {
        return ((Integer) fetchShapeAttr(726)).intValue();
    }

    public final int zzYaQ() {
        return ((Integer) fetchShapeAttr(725)).intValue();
    }

    public final int zzYaR() {
        return ((Integer) fetchShapeAttr(724)).intValue();
    }

    public final int zzYaS() {
        return ((Integer) fetchShapeAttr(723)).intValue();
    }

    public final int zzYaT() {
        return ((Integer) fetchShapeAttr(704)).intValue();
    }

    public final int zzYaU() {
        return ((Integer) fetchShapeAttr(705)).intValue();
    }

    public final int zzYaV() {
        return ((Integer) fetchShapeAttr(719)).intValue();
    }

    public final int zzYaW() {
        return ((Integer) fetchShapeAttr(718)).intValue();
    }

    public final int zzYaX() {
        return ((Integer) fetchShapeAttr(717)).intValue();
    }

    public final int zzYaY() {
        return ((Integer) fetchShapeAttr(716)).intValue();
    }

    public final int zzYaZ() {
        return ((Integer) fetchShapeAttr(715)).intValue();
    }

    public final boolean zzYb0() {
        return !(getDirectShapeAttr(1984) == null && getDirectShapeAttr(1985) == null) && getExtrusionEnabled();
    }

    public final int zzYb1() {
        return ((Integer) fetchShapeAttr(645)).intValue();
    }

    public final int zzYb2() {
        return ((Integer) fetchShapeAttr(644)).intValue();
    }

    public final int zzYb3() {
        return ((Integer) fetchShapeAttr(720)).intValue();
    }

    public final boolean zzYb4() {
        return ((Boolean) fetchShapeAttr(765)).booleanValue();
    }

    public final int zzYb5() {
        return ((Integer) fetchShapeAttr(526)).intValue();
    }

    public final int zzYb6() {
        return ((Integer) fetchShapeAttr(525)).intValue();
    }

    public final int zzYb7() {
        return ((Integer) fetchShapeAttr(529)).intValue();
    }

    public final int zzYb8() {
        return ((Integer) fetchShapeAttr(528)).intValue();
    }

    public final int zzYb9() {
        return ((Integer) fetchShapeAttr(522)).intValue();
    }

    public final int zzYba() {
        return ((Integer) fetchShapeAttr(523)).intValue();
    }

    public final int zzYbb() {
        return ((Integer) fetchShapeAttr(524)).intValue();
    }

    public final int zzYbc() {
        return ((Integer) fetchShapeAttr(521)).intValue();
    }

    public final int zzYbd() {
        return ((Integer) fetchShapeAttr(520)).intValue();
    }

    public final int zzYbe() {
        return ((Integer) fetchShapeAttr(519)).intValue();
    }

    public final int zzYbf() {
        return ((Integer) fetchShapeAttr(518)).intValue();
    }

    public final int zzYbg() {
        return ((Integer) fetchShapeAttr(517)).intValue();
    }

    public final com.aspose.words.internal.zzPV zzYbh() {
        return zzZ7K.zzZ((com.aspose.words.internal.zzPV) fetchShapeAttr(514), this);
    }

    public final com.aspose.words.internal.zzPV zzYbi() {
        return zzZ7K.zzZ((com.aspose.words.internal.zzPV) fetchShapeAttr(InputDeviceCompat.SOURCE_DPAD), this);
    }

    public final int zzYbj() {
        return ((Integer) fetchShapeAttr(516)).intValue();
    }

    public final boolean zzYbk() {
        return ((Boolean) fetchShapeAttr(190)).booleanValue();
    }

    public final int zzYbl() {
        return ((Integer) fetchShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2)).intValue();
    }

    public final int zzYbm() {
        return ((Integer) fetchShapeAttr(StyleIdentifier.LIST_TABLE_4_ACCENT_2)).intValue();
    }

    public final com.aspose.words.internal.zzPV zzYbn() {
        Object directShapeAttr = getDirectShapeAttr(StyleIdentifier.GRID_TABLE_3_ACCENT_1);
        if (directShapeAttr != null) {
            Integer num = (Integer) directShapeAttr;
            if (num.intValue() != -1) {
                com.aspose.words.internal.zzPV zzpv = new com.aspose.words.internal.zzPV(num.intValue() | ViewCompat.MEASURED_STATE_MASK);
                return new com.aspose.words.internal.zzPV(zzpv.zzPA(), zzpv.zzPB(), zzpv.zzPC());
            }
        }
        return com.aspose.words.internal.zzPV.zzHZ;
    }

    public final zzZLU[] zzYbo() {
        return (zzZLU[]) fetchShapeAttr(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2);
    }

    public final zzYM5[] zzYbp() {
        return (zzYM5[]) fetchShapeAttr(StyleIdentifier.LIST_TABLE_4);
    }

    public final zzYM6[] zzYbq() {
        return (zzYM6[]) fetchShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK);
    }

    @Override // com.aspose.words.ShapeBase
    public final int zzYbr() {
        return super.zzYbr();
    }

    public final boolean zzYbs() {
        return zzY9H() && (zzYrB() instanceof zzYO2);
    }

    public final String zzYbt() {
        return (String) fetchShapeAttr(919);
    }

    public final String zzYbu() {
        return (String) fetchShapeAttr(910);
    }

    public final void zzYbw() throws Exception {
        getMarkupLanguage();
        zzY9J().setImageBytes(getImageData().getImageBytes());
        zzY9J().zzIc(3);
        setFilled(true);
        getImageData().setImageBytes(null);
    }

    public final int zzYyi() throws Exception {
        if (zzY9H()) {
            return 3;
        }
        if (zzY9I()) {
            return getOleFormat().isLink() ? 2 : 1;
        }
        return 0;
    }

    @Override // com.aspose.words.ShapeBase, com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Shape shape = (Shape) super.zzZ(z, zzza5);
        shape.zzXnu = null;
        shape.zzXno = null;
        shape.zzXnt = null;
        shape.zzXnq = null;
        shape.zzXnr = null;
        shape.zzXns = null;
        shape.setFill(null);
        return shape;
    }

    @Override // com.aspose.words.ShapeBase
    public final boolean zzZ55() {
        if (isInline()) {
            return true;
        }
        if (!zzY9o()) {
            return false;
        }
        int layoutFlow = getTextBox().getLayoutFlow();
        return layoutFlow == 5 || layoutFlow == 2 || layoutFlow == 3 || layoutFlow == 1;
    }

    public final com.aspose.words.internal.zzPV zzZhC() {
        return (com.aspose.words.internal.zzPV) fetchShapeAttr(647);
    }

    public final boolean zzZjT() throws Exception {
        return canHaveImage() && getImageData().zzZjT();
    }

    public final int zzmi(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = StyleIdentifier.LIST_TABLE_6_COLORFUL;
                break;
            case 2:
                i2 = StyleIdentifier.LIST_TABLE_7_COLORFUL;
                break;
            case 3:
                i2 = StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1;
                break;
            case 4:
                i2 = StyleIdentifier.LIST_TABLE_2_ACCENT_1;
                break;
            case 5:
                i2 = StyleIdentifier.LIST_TABLE_3_ACCENT_1;
                break;
            case 6:
                i2 = StyleIdentifier.LIST_TABLE_4_ACCENT_1;
                break;
            case 7:
                i2 = StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1;
                break;
            case 8:
                i2 = StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1;
                break;
            case 9:
                i2 = StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1;
                break;
            case 10:
                i2 = StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2;
                break;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return ((Integer) fetchShapeAttr(i2)).intValue();
    }

    public Shape(DocumentBase documentBase, byte b) {
        super(documentBase, b);
    }

    public Shape(DocumentBase documentBase, int i) {
        this(documentBase, (byte) 1);
        if (ShapeBase.zzme(i) && zz84.zzIg(i)) {
            setShapeType(i);
            return;
        }
        throw new UnsupportedOperationException("Cannot create shapes of this type.");
    }

    public static Shape zzZ(Document document, com.aspose.words.internal.zzZL zzzl, double d, double d2) throws Exception {
        Shape shape = new Shape(document, 75);
        shape.zzWf(d);
        shape.zzWe(d2);
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(101);
        imageSaveOptions.setResolution(200.0f);
        com.aspose.words.internal.zzXN zzxnZzZ = zzYDY.zzZ(zzzl, com.aspose.words.internal.zzZPW.zzG((float) d, (float) d2), imageSaveOptions, document.zzZqx());
        try {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                zzxnZzZ.zzV(zzzor);
                zzzor.zzH(0L);
                shape.getImageData().zzZ1(zzzor);
                zzxnZzZ.dispose();
                return shape;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            if (zzxnZzZ != null) {
                zzxnZzZ.dispose();
            }
            throw th;
        }
    }
}
