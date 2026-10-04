package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYHS extends zzYHQ {
    private String zzXw6;
    private String zzXw7;
    private String zzXw8;
    private CustomXmlPropertyCollection zzXw9;
    private String zzXwa;
    private zzYF8 zzXwb;
    private zzYH5 zzXwc;
    private Shape zzZ2R;
    private BookmarkEnd zzZCS;
    private BookmarkStart zzZCT;
    private static char[] zzXwd = {5, 2, 3, 4, ControlChar.DEFAULT_TEXT_INPUT_CHAR};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\xmlns", "\\xmlsdttregular", "\\xmlsdttpara", "\\xmlsdttunknown", "\\xmlsdttcell", "\\xmlsdttrow", "\\xmlattr", "\\xmlname", "\\factoidname", "\\bkmkcolf", "\\bkmkcoll");

    public zzYHS(zzYFT zzyft) {
        super(zzyft);
        this.zzXwc = new zzYH5(zzyft);
        this.zzXwb = new zzYF8(zzyft);
    }

    private void zzCx(String str) throws Exception {
        zzYiM().zzCe(str);
    }

    private void zzP(zzYET zzyet) throws Exception {
        String strZzYR = zzyet.zzYR();
        int length = 0;
        for (String str : com.aspose.words.internal.zzZKN.zzU(strZzYR, zzXwd)) {
            if (!"".equals(str)) {
                zzCx(str);
                length += str.length();
            }
            if (strZzYR.length() > length) {
                int i = length + 1;
                char cCharAt = strZzYR.charAt(length);
                if (zzXW(cCharAt)) {
                    zzYiM().zzXV(cCharAt);
                }
                length = i;
            }
        }
    }

    private void zzQ(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 9) {
            this.zzZCT.zzOX(zzyet.zzYeT());
        } else {
            if (iZzTP != 10) {
                return;
            }
            this.zzZCT.zzOW(zzyet.zzYeT() - 1);
        }
    }

    private void zzR(zzYET zzyet) throws Exception {
        if (this.zzXwc.zzX(zzyet) || this.zzXwb.zzX(zzyet)) {
            return;
        }
        zzO(zzyet);
    }

    private boolean zzXW(char c) {
        return c != 5 || zzYiL().zzYiN().getType() == 72;
    }

    private boolean zzXX(char c) {
        Node lastChild = zzYiM().getContainer().getLastChild();
        if (lastChild == null || lastChild.getNodeType() != 26 || lastChild.getText().charAt(0) != c) {
            return false;
        }
        lastChild.remove();
        return true;
    }

    private zzYHQ zzYiS() {
        if (zzYiL().zzYiN().getType() != 89 && zzYiL().zzYiN().getType() != 90) {
            if (zzYiL().zzYiN().getType() == 91 && zzYiL().zzYih().zzYiN().getType() == 89) {
                ((zzYFF) zzYiL().zzYih().zzYim()).zzYfY();
            }
            Shape shape = new Shape(getDocument());
            this.zzZ2R = shape;
            shape.setShapeType(75);
            this.zzZ2R.setWrapType(0);
            zzYiM().zzZ4(this.zzZ2R);
        }
        return new zzYFW(this.zzXw4, this.zzZ2R, true);
    }

    private zzYHQ zzYiT() {
        this.zzZ2R = new Shape(getDocument());
        zzYiM().zzZ4(this.zzZ2R);
        return new zzYGR(this.zzXw4, this.zzZ2R);
    }

    private zzYHQ zzYiU() {
        this.zzZ2R = new Shape(getDocument());
        if (zzYiL().zzYiN().getType() != 105) {
            return zzZ6(this.zzZ2R);
        }
        getDocument().zzO(this.zzZ2R);
        return new zzYFF(this.zzXw4, this.zzZ2R, true);
    }

    private boolean zzYiV() {
        for (zzYH3 zzyh3ZzYiL = this.zzXw4.zzYgo().zzYiL(); zzyh3ZzYiL != null; zzyh3ZzYiL = zzyh3ZzYiL.zzYih()) {
            if (zzyh3ZzYiL.zzYiN().getType() == 130) {
                return true;
            }
        }
        return false;
    }

    private static void zzZ5(ShapeBase shapeBase) {
        if (shapeBase.isTopLevel()) {
            shapeBase.zzYvW().zzQ(912, 0);
            shapeBase.zzYvW().zzQ(914, 0);
        }
    }

    private zzYHQ zzZ6(ShapeBase shapeBase) {
        zzYiM().zzZ4(shapeBase);
        zzZ5(shapeBase);
        return new zzYFF(this.zzXw4, shapeBase, true);
    }

    @Override // com.aspose.words.zzYHQ
    public void zzT(zzYET zzyet) throws Exception {
        int type = zzYiL().zzYiN().getType();
        if (type == 59) {
            zzQ(zzyet);
            return;
        }
        if (type != 60) {
            if (type != 123) {
                if (type != 127) {
                    zzR(zzyet);
                    return;
                } else {
                    if ("\\xmlattrns".equals(zzyet.getName())) {
                        this.zzXw8 = this.zzXw4.zzok(zzyet.zzYeT());
                        return;
                    }
                    return;
                }
            }
            switch (zzUR.zzTP(zzyet.getName())) {
                case 0:
                    this.zzXwa = this.zzXw4.zzok(zzyet.zzYeT());
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return;
                case 6:
                    throw new IllegalStateException("Don't know how to handle \\xmlattr.");
                case 7:
                    this.zzXw4.zzYgo().zzX(new zzYHP("\\xmlname", 126));
                    return;
                case 8:
                    this.zzXw4.zzYgo().zzX(new zzYHP("\\factoidname", 125));
                    return;
                default:
                    this.zzXw4.zzY(zzyet.getName(), new Object[0]);
                    return;
            }
        }
    }

    @Override // com.aspose.words.zzYHQ
    public void zzY(zzYET zzyet) throws Exception {
        int type = zzYiL().zzYiN().getType();
        if (type == 59) {
            this.zzZCT.zzTh(zzyet.zzYR());
            return;
        }
        if (type == 60) {
            this.zzZCS.zzTh(zzyet.zzYR());
            return;
        }
        if (type == 73) {
            this.zzXw4.zzBY(zzyet.zzYR());
            return;
        }
        if (type == 74) {
            this.zzXw4.zzBX(zzyet.zzYR());
            return;
        }
        if (type == 77) {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR());
            if (iZzZo != Integer.MIN_VALUE) {
                zzYiM().zzWI(new CommentRangeStart(getDocument(), iZzZo));
                return;
            }
            return;
        }
        if (type == 78) {
            int iZzZo2 = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR());
            if (iZzZo2 != Integer.MIN_VALUE) {
                zzYiM().zzWJ(new CommentRangeEnd(getDocument(), iZzZo2));
                return;
            }
            return;
        }
        if (type == 100) {
            this.zzXw4.zzT(1, "Picture properties in an unexpected place, ignored");
            return;
        }
        if (type == 256) {
            byte[] bArrZzYeZ = zzyet.zzYeZ();
            if (bArrZzYeZ.length == 0) {
                this.zzXw4.zzT(1, "Empty themedata, ignored.");
                return;
            } else {
                zzZ5X.zzY(this.zzXw4.getDocument(), bArrZzYeZ);
                return;
            }
        }
        if (type == 258) {
            zzKN.zzZ(zzyet.zzYeZ(), getDocument().getCustomXmlParts(), this.zzXw4.getWarningCallback());
            return;
        }
        if (type == 125) {
            if (zzYiL().zzYih().zzYiN().getType() == 123) {
                SmartTag smartTag = new SmartTag(getDocument());
                smartTag.setElement(zzyet.zzYR());
                smartTag.setUri(this.zzXwa);
                this.zzXw9 = smartTag.getProperties();
                zzYiM().zzWI(smartTag);
                return;
            }
            return;
        }
        if (type == 126) {
            if (zzYiL().zzYih().zzYiN().getType() == 123) {
                this.zzXw4.zzT(1, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
            }
        } else if (type == 128) {
            this.zzXw7 = zzyet.zzYR();
        } else if (type != 129) {
            zzP(zzyet);
        } else {
            this.zzXw6 = zzyet.zzYR();
        }
    }

    public final void zzYiQ() throws Exception {
        this.zzXwc.zzYiQ();
    }

    public final void zzYiR() throws Exception {
        this.zzXwc.zzYiR();
    }

    @Override // com.aspose.words.zzYHQ
    public boolean zzYiX() {
        return true;
    }

    @Override // com.aspose.words.zzYHQ
    public void zzYjb() throws Exception {
        CustomXmlPropertyCollection customXmlPropertyCollection;
        int type = zzYiL().zzYiN().getType();
        if (type == 105) {
            if (getDocument().getBackgroundShape().getWrapType() == 0) {
                getDocument().getBackgroundShape().setWrapType(3);
            }
        } else {
            if (type != 127 || "placeholder".equals(this.zzXw7) || (customXmlPropertyCollection = this.zzXw9) == null) {
                return;
            }
            customXmlPropertyCollection.zzZ(new CustomXmlProperty(this.zzXw7, this.zzXw8, this.zzXw6));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[FALL_THROUGH, RETURN] */
    @Override // com.aspose.words.zzYHQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        if (type == 0) {
            return new zzYHF(this.zzXw4);
        }
        if (type == 40) {
            return new zzYHI(this.zzXw4);
        }
        if (type == 43) {
            return new zzYH6(this.zzXw4);
        }
        if (type == 80) {
            return new zzYH8(this.zzXw4, zzXX((char) 2));
        }
        if (type != 87) {
            if (type == 103) {
                return zzYiS();
            }
            if (type == 106) {
                return new zzYG7(this.zzXw4);
            }
            if (type == 118) {
                return new zzYGS(this.zzXw4);
            }
            if (type != 77 && type != 78) {
                if (type == 89) {
                    return zzYiU();
                }
                if (type == 90) {
                    return zzZ6(new GroupShape(getDocument()));
                }
                if (type != 100) {
                    if (type == 101) {
                        return zzYiT();
                    }
                    if (type != 138 && type != 139) {
                        switch (type) {
                            case 52:
                            case 53:
                            case 54:
                                return new zzYHK(this.zzXw4);
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                                return new zzYGB(this.zzXw4);
                            default:
                                switch (type) {
                                    case 72:
                                        zzXX((char) 5);
                                        return new zzYI3(this.zzXw4);
                                    default:
                                        switch (type) {
                                            case 123:
                                            case 124:
                                            case 125:
                                            case 126:
                                            case 127:
                                            case 128:
                                            case 129:
                                                break;
                                            case 130:
                                                return !zzYiV() ? new zzYEU(this.zzXw4, false) : new zzYFA(this.zzXw4);
                                            case 131:
                                                return new zzYEU(this.zzXw4, true);
                                            case 132:
                                                return new zzYGX(this.zzXw4);
                                            default:
                                                switch (type) {
                                                    case 232:
                                                    case 233:
                                                    case 234:
                                                    case 235:
                                                        return new zzYG8(this.zzXw4);
                                                    case 236:
                                                        return new zzYGJ(this.zzXw4);
                                                    default:
                                                        switch (type) {
                                                            case 256:
                                                            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                                                                break;
                                                            case 257:
                                                                return new zzYFA(this.zzXw4);
                                                            default:
                                                                return null;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    case 73:
                                    case 74:
                                        return this;
                                }
                            case 59:
                            case 60:
                                break;
                        }
                    } else {
                        return new zzYGG(this.zzXw4);
                    }
                }
            }
        }
        return this;
    }

    @Override // com.aspose.words.zzYHQ
    public void zzZ(zzYET zzyet) throws Exception {
        int type = zzYiL().zzYiN().getType();
        if (type == 0) {
            zzYiL().zzZYh().clear();
            return;
        }
        if (type == 127) {
            this.zzXw8 = "";
            this.zzXw7 = "";
            this.zzXw6 = "";
            return;
        }
        if (type == 59) {
            this.zzZCT = new BookmarkStart(getDocument());
            zzYiM().zzU(this.zzZCT);
            return;
        }
        if (type == 60) {
            this.zzZCS = new BookmarkEnd(getDocument());
            zzYiM().zzU(this.zzZCS);
        } else if (type == 123) {
            this.zzXwa = "";
            this.zzXw9 = null;
        } else {
            if (type != 124) {
                return;
            }
            zzYiM().zzYhu();
        }
    }
}
