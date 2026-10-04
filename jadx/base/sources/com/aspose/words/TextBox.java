package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class TextBox {
    private TextBox zzX3X;
    private TextBox zzX3Y;
    private Shape zzXel;

    public TextBox(Shape shape) {
        this.zzXel = shape;
    }

    private boolean zzR(ShapeBase shapeBase, int i) {
        return (this.zzXel.getAncestor(i) != null) != (shapeBase.getAncestor(i) != null);
    }

    public static boolean zzY(Shape shape, Shape shape2) {
        if (shape.getMarkupLanguage() != shape2.getMarkupLanguage()) {
            return false;
        }
        if (shape.getDocument() != null && shape.getDocument() != shape2.getDocument()) {
            return false;
        }
        if (shape.getMarkupLanguage() != 0) {
            return shape.zzY9A() == shape2.getId();
        }
        int iZzY9r = shape.zzY9r();
        int iZzY9q = shape.zzY9q();
        if (iZzY9r <= 0 && iZzY9q <= 0) {
            return false;
        }
        if (iZzY9r > 0) {
            iZzY9q = iZzY9r;
        }
        return shape2.zzY9q() == iZzY9q && shape2.zzY9p() == (iZzY9r > 0 ? 1 : shape.zzY9p() + 1);
    }

    private static boolean zzYg(ShapeBase shapeBase) {
        return shapeBase.getShapeType() == 202 || shapeBase.hasChildNodes();
    }

    private void zzZ(com.aspose.words.internal.zzZYV<ShapeBase> zzzyv, int i, int i2) {
        if (i == i2) {
            ShapeBase shapeBase = zzzyv.get(i);
            shapeBase.zzma(0);
            shapeBase.zzm9(0);
            shapeBase.zzm8(0);
            return;
        }
        int iZzZpY = this.zzXel.getDocument().zzZpY();
        ShapeBase shapeBase2 = zzzyv.get(i);
        shapeBase2.zzma(iZzZpY);
        shapeBase2.zzm9(0);
        shapeBase2.zzm8(0);
        if (!shapeBase2.hasChildNodes()) {
            shapeBase2.appendChild(new Paragraph(this.zzXel.getDocument()));
        }
        for (int i3 = 1; i3 <= i2 - i; i3++) {
            ShapeBase shapeBase3 = zzzyv.get(i + i3);
            shapeBase3.zzma(0);
            shapeBase3.zzm9(iZzZpY);
            shapeBase3.zzm8(i3);
        }
    }

    private static TextBox zzZl(Shape shape) {
        if (shape.zzY9n() == null) {
            return null;
        }
        return ((Shape) shape.zzY9n()).getTextBox();
    }

    public void breakForwardLink() {
        if (this.zzXel.getMarkupLanguage() != 0) {
            this.zzXel.removeShapeAttr(138);
            return;
        }
        com.aspose.words.internal.zzZYV<ShapeBase> zzzyv = new com.aspose.words.internal.zzZYV<>();
        int iZzY9r = this.zzXel.zzY9r() > 0 ? this.zzXel.zzY9r() : this.zzXel.zzY9q();
        Iterator<T> it = new zzYCB(this.zzXel.getDocument()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Shape shape = (Shape) it.next();
            if (shape.zzY9q() == iZzY9r || shape.zzY9r() == iZzY9r) {
                zzzyv.add(shape.zzY9r() <= 0 ? shape.zzY9p() : 0, shape);
            }
        }
        int iZzY9p = this.zzXel.zzY9r() > 0 ? 0 : this.zzXel.zzY9p();
        if (zzzyv.getCount() <= 1) {
            return;
        }
        zzZ(zzzyv, 0, iZzY9p);
        zzZ(zzzyv, iZzY9p + 1, zzzyv.getCount() - 1);
        this.zzXel.removeShapeAttr(138);
        Shape shape2 = (Shape) this.zzXel.zzY9n();
        if (shape2 != null) {
            shape2.getTextBox().breakForwardLink();
        }
    }

    public boolean getFitShapeToText() {
        return this.zzXel.zzY9h().getFitShapeToText();
    }

    public double getInternalMarginBottom() {
        return this.zzXel.zzY9h().getInternalMarginBottom();
    }

    public double getInternalMarginLeft() {
        return this.zzXel.zzY9h().getInternalMarginLeft();
    }

    public double getInternalMarginRight() {
        return this.zzXel.zzY9h().getInternalMarginRight();
    }

    public double getInternalMarginTop() {
        return this.zzXel.zzY9h().getInternalMarginTop();
    }

    public int getLayoutFlow() {
        return this.zzXel.zzY9h().getLayoutFlow();
    }

    public TextBox getNext() {
        if (!zzZ(this, this.zzX3X)) {
            this.zzX3X = null;
            Iterator<T> it = new zzYCB(this.zzXel.getDocument()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Shape shape = (Shape) it.next();
                if (zzY(this.zzXel, shape)) {
                    this.zzX3X = shape.getTextBox();
                    break;
                }
            }
        }
        return this.zzX3X;
    }

    public boolean getNoTextRotation() {
        return this.zzXel.zzY9h().zzZyl();
    }

    public Shape getParent() {
        return this.zzXel;
    }

    public TextBox getPrevious() {
        if (!zzZ(this.zzX3Y, this)) {
            this.zzX3Y = null;
            Iterator<T> it = new zzYCB(this.zzXel.getDocument()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Shape shape = (Shape) it.next();
                if (zzY(shape, this.zzXel)) {
                    this.zzX3Y = shape.getTextBox();
                    break;
                }
            }
        }
        return this.zzX3Y;
    }

    public int getTextBoxWrapMode() {
        return this.zzXel.zzY9h().getTextBoxWrapMode();
    }

    public int getVerticalAnchor() {
        return zzZyk();
    }

    public boolean isValidLinkTarget(TextBox textBox) {
        return com.aspose.words.internal.zzZKN.zzU3(zzY(textBox));
    }

    public void setFitShapeToText(boolean z) {
        this.zzXel.zzY9h().setFitShapeToText(z);
    }

    public void setInternalMarginBottom(double d) {
        this.zzXel.zzY9h().setInternalMarginBottom(d);
    }

    public void setInternalMarginLeft(double d) {
        this.zzXel.zzY9h().setInternalMarginLeft(d);
    }

    public void setInternalMarginRight(double d) {
        this.zzXel.zzY9h().setInternalMarginRight(d);
    }

    public void setInternalMarginTop(double d) {
        this.zzXel.zzY9h().setInternalMarginTop(d);
    }

    public void setLayoutFlow(int i) {
        this.zzXel.zzY9h().setLayoutFlow(i);
    }

    public void setNext(TextBox textBox) {
        if (textBox == null) {
            breakForwardLink();
        } else {
            zzZ(textBox);
        }
    }

    public void setNoTextRotation(boolean z) {
        this.zzXel.zzY9h().zzWZ(z);
    }

    public void setTextBoxWrapMode(int i) {
        this.zzXel.zzY9h().setTextBoxWrapMode(i);
    }

    public void setVerticalAnchor(int i) {
        if (i == 0 || i == 1 || i == 2) {
            zzHx(i);
        } else {
            zzHx(0);
        }
    }

    public final void zzHx(int i) {
        this.zzXel.zzY9h().zzHx(i);
    }

    public final int zzZyk() {
        return this.zzXel.zzY9h().zzZyk();
    }

    private String zzY(TextBox textBox) {
        TextBox textBoxZzZl = this;
        do {
            Shape shape = textBoxZzZl.zzXel;
            Shape parent = textBox.getParent();
            if (textBoxZzZl.zzXel == null || textBox.getParent() == null || textBoxZzZl.zzXel.getId() == parent.getId()) {
                return "Invalid target textbox.";
            }
            if (shape.getDocument() != null && shape.getDocument() == parent.getDocument()) {
                if (!zzYg(shape) || !zzYg(parent)) {
                    return "Please, make sure both shapes are able to store a text.";
                }
                String text = parent.getText();
                if (!com.aspose.words.internal.zzZKN.equals(text, "") && !"\r".equals(text)) {
                    return "Target textbox must be empty.";
                }
                if (shape.getMarkupLanguage() != parent.getMarkupLanguage()) {
                    return "Source and target textboxes must use the same markup language (DML/VML).";
                }
                if (textBoxZzZl.getNext() != null) {
                    return "This textbox already has a link.";
                }
                if (textBox.getPrevious() != null) {
                    return "Target textbox must not be a part of another linked chain.";
                }
                if (!textBoxZzZl.zzR(parent, 3) && !textBoxZzZl.zzR(parent, 4)) {
                    if (textBoxZzZl.zzXel.getMarkupLanguage() != 0) {
                        break;
                    }
                    textBoxZzZl = zzZl(shape);
                    textBox = zzZl(parent);
                    if (textBoxZzZl == null) {
                        break;
                    }
                } else {
                    return "Different story types of textboxes.";
                }
            } else {
                return "Parent document of the linked textboxes must be the same.";
            }
        } while (textBox != null);
        return "";
    }

    private static boolean zzZ(TextBox textBox, TextBox textBox2) {
        return !com.aspose.words.internal.zzZ4.zzZ(textBox, textBox2) && zzY(textBox.getParent(), textBox2.getParent());
    }

    private void zzZ(TextBox textBox) {
        String strZzY = zzY(textBox);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzY)) {
            Shape shape = this.zzXel;
            Shape parent = textBox.getParent();
            if (shape.getMarkupLanguage() == 0) {
                int iZzY9r = this.zzXel.zzY9r();
                int iZzY9q = this.zzXel.zzY9q();
                if (iZzY9r > 0) {
                    parent.zzm9(iZzY9r);
                    parent.zzm8(1);
                } else if (iZzY9q > 0) {
                    parent.zzm9(iZzY9q);
                    parent.zzm8(this.zzXel.zzY9p() + 1);
                } else {
                    int iZzZpY = this.zzXel.getDocument().zzZpY();
                    this.zzXel.zzma(iZzZpY);
                    parent.zzm9(iZzZpY);
                    parent.zzm8(1);
                }
                parent.removeAllChildren();
                TextBox textBoxZzZl = zzZl(shape);
                TextBox textBoxZzZl2 = zzZl(parent);
                if (textBoxZzZl == null || textBoxZzZl2 == null) {
                    return;
                }
                textBoxZzZl.setNext(textBoxZzZl2);
                return;
            }
            shape.zzmb(parent.getId());
            return;
        }
        throw new IllegalArgumentException(strZzY);
    }
}
