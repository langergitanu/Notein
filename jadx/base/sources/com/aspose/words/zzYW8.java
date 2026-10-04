package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW8 implements com.aspose.words.internal.zzZOY, zzZB9 {
    private boolean zzPx;
    private Node zzXUV;
    private Node zzXUW;
    private int zzXUX;
    private zzX zzXUY;
    private boolean zzXUZ;
    private int zzXV0;
    private zzZKN zzYAE;
    private zzYWI zzYEv;
    private int zzYPC;
    private com.aspose.words.internal.zzZQC<FieldStart> zzYQt;

    public interface zzX {
        void zzX(zzYW8 zzyw8) throws Exception;

        boolean zzZgc();
    }

    public static class zzY implements zzX {
        private Field zzZz7;

        public zzY(Field field) {
            this.zzZz7 = field;
        }

        @Override // com.aspose.words.zzYW8.zzX
        public final void zzX(zzYW8 zzyw8) throws Exception {
            if (this.zzZz7.zzZgm()) {
                this.zzZz7.zzZgn().zzW((FieldStart) zzyw8.zzXUW, (FieldSeparator) zzyw8.zzXUV, (FieldEnd) zzyw8.getCurrentNode());
            }
        }

        @Override // com.aspose.words.zzYW8.zzX
        public final boolean zzZgc() {
            return this.zzZz7.zzZgm() && this.zzZz7.zzZgn().zzZgc();
        }
    }

    public static class zzZ implements zzX {
        private zzZR8 zzYBN;

        public zzZ(zzZR8 zzzr8) {
            this.zzYBN = zzzr8;
        }

        @Override // com.aspose.words.zzYW8.zzX
        public final void zzX(zzYW8 zzyw8) {
        }

        @Override // com.aspose.words.zzYW8.zzX
        public final boolean zzZgc() {
            return this.zzYBN.zzZgc();
        }
    }

    private zzYW8(Field field) {
        this(field, false);
    }

    private boolean isLocked() {
        return this.zzYPC > 0;
    }

    public static String zz3(Field field) {
        StringBuilder sb = new StringBuilder();
        zzYW8 zzyw8 = new zzYW8(field);
        while (zzyw8.zzSC()) {
            try {
                switch (zzyw8.zzXV0) {
                    case 0:
                        if (zzyw8.zzYEv.zzYWt().zzZot()) {
                            continue;
                        } else {
                            sb.append(zzyw8.zzIw());
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (Throwable th) {
                zzyw8.dispose();
                throw th;
            }
            zzyw8.dispose();
            throw th;
        }
        zzyw8.dispose();
        return sb.toString();
    }

    private boolean zzK(Inline inline) {
        return this.zzYAE.zzU(inline);
    }

    private boolean zzU(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        if (fieldStart == null) {
            return false;
        }
        if (zzK(fieldStart)) {
            return true;
        }
        if (fieldEnd == null) {
            fieldEnd = zzZR4.zzZ(new zzZR4(), fieldSeparator, true).getEnd();
        }
        return zzK(fieldEnd);
    }

    private static boolean zzY4(Node node) {
        return zzZOO.zzCK(((FieldChar) node).getFieldType());
    }

    private boolean zzY5(Node node) throws Exception {
        boolean z = node != null && this.zzYEv.next().zzYF(node);
        if (this.zzYEv.next() instanceof FieldChar) {
            return zzYzU() && !z;
        }
        if (z || isLocked()) {
            return false;
        }
        return zzYzS();
    }

    private boolean zzYAu() {
        Inline inline;
        while (this.zzYEv.zzF(true, zzYzR())) {
            if (this.zzXUZ || (this.zzYEv.next() instanceof FieldChar) || (inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYEv.next(), Inline.class)) == null || !zzK(inline)) {
                return true;
            }
        }
        return false;
    }

    private boolean zzYzP() {
        return this.zzXUX == 0;
    }

    private boolean zzYzQ() {
        return this.zzXUX == 1;
    }

    private boolean zzYzR() {
        if (this.zzYEv.next() == null) {
            return false;
        }
        int nodeType = this.zzYEv.next().getNodeType();
        if (nodeType == 9 || nodeType == 10 || nodeType == 27 || nodeType == 28 || nodeType == 33 || nodeType == 34) {
            return true;
        }
        switch (nodeType) {
        }
        return false;
    }

    private boolean zzYzS() {
        int nodeType = this.zzYEv.next().getNodeType();
        if (nodeType == 2) {
            this.zzXV0 = 3;
        } else {
            if (nodeType != 21) {
                if (nodeType != 25 && nodeType != 27 && nodeType != 28 && nodeType != 33 && nodeType != 34) {
                    switch (nodeType) {
                        case 8:
                            this.zzXV0 = 2;
                            break;
                        default:
                            switch (nodeType) {
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                    break;
                                default:
                                    this.zzXV0 = 1;
                                    break;
                            }
                        case 9:
                        case 10:
                            return false;
                    }
                }
                return false;
            }
            if (((Run) this.zzYEv.next()).getText().length() == 0) {
                return false;
            }
            this.zzXV0 = 0;
        }
        return true;
    }

    private void zzYzT() throws Exception {
        zzX zzx = this.zzXUY;
        if (zzx != null) {
            zzx.zzX(this);
        }
    }

    private boolean zzYzU() throws Exception {
        switch (this.zzYEv.next().getNodeType()) {
            case 22:
                this.zzYPC++;
                this.zzXUX++;
                this.zzYQt.push((FieldStart) this.zzYEv.next());
                if (zzYzQ()) {
                    this.zzXUW = this.zzYEv.next();
                    this.zzXV0 = 4;
                    if (!zzY4(this.zzYEv.next())) {
                        return true;
                    }
                }
                return false;
            case 23:
                if (zzYzQ()) {
                    this.zzXUV = this.zzYEv.next();
                }
                FieldSeparator fieldSeparator = (FieldSeparator) this.zzYEv.next();
                if (zzZOO.zzT(fieldSeparator)) {
                    return false;
                }
                if (zzU(this.zzYQt.size() > 0 ? this.zzYQt.peek() : null, fieldSeparator, null)) {
                    return false;
                }
                this.zzYPC--;
                if (zzYzQ()) {
                    this.zzXV0 = 5;
                    return !zzY4(this.zzYEv.next());
                }
                return false;
            case 24:
                if (zzYzQ()) {
                    zzYzT();
                    this.zzXUW = null;
                    this.zzXUV = null;
                }
                this.zzXUX--;
                FieldStart fieldStartPop = this.zzYQt.size() > 0 ? this.zzYQt.pop() : null;
                FieldEnd fieldEnd = (FieldEnd) this.zzYEv.next();
                boolean z = !fieldEnd.hasSeparator() || zzZOO.zzT(fieldEnd) || zzU(fieldStartPop, null, fieldEnd);
                if (z) {
                    this.zzYPC--;
                }
                if (zzYzP()) {
                    this.zzXV0 = z ? 5 : 6;
                    return !zzY4(this.zzYEv.next());
                }
                return false;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean zzZgc() {
        zzX zzx = this.zzXUY;
        return zzx != null && zzx.zzZgc();
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
    }

    @Override // com.aspose.words.zzZB9
    public final Node getCurrentNode() {
        return this.zzYEv.next();
    }

    @Override // com.aspose.words.zzZB9
    public final char zzIw() {
        return ((Run) this.zzYEv.next()).getText().charAt(this.zzYEv.zzYWt().getOffset());
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzSC() {
        try {
            if (zzYzP() && this.zzXV0 == 5 && this.zzYEv.next().getNodeType() == 24) {
                this.zzXV0 = 6;
                return true;
            }
            Node next = (this.zzYEv.next() == null || this.zzYEv.next().getNodeType() != 5 || zzZgc()) ? null : this.zzYEv.next();
            while (zzYAu()) {
                if (zzY5(next)) {
                    return true;
                }
            }
            this.zzPx = true;
            return false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzYC() {
        return this.zzPx;
    }

    @Override // com.aspose.words.zzZB9
    public final String zzYWm() {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYEv.next(), Inline.class);
        if (inline != null) {
            return inline.getFont().getName();
        }
        return null;
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzYWn() {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYEv.next(), Inline.class);
        return inline != null && inline.getFont().getBidi();
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWo() {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYEv.next(), Inline.class);
        if (inline != null) {
            return inline.getFont().getLocaleIdBi();
        }
        return 1024;
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWp() {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYEv.next(), Inline.class);
        if (inline != null) {
            return inline.getFont().getLocaleIdFarEast();
        }
        return 1024;
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWq() {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzYEv.next(), Inline.class);
        if (inline != null) {
            return inline.getFont().getLocaleId();
        }
        return 1024;
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzYWr() {
        return this.zzYEv.zzYWt().zzZot();
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWs() {
        return this.zzXV0;
    }

    @Override // com.aspose.words.zzZB9
    public final zzZYT zzYWt() {
        int i = this.zzXV0;
        if (i != 4) {
            if (i == 5) {
                return zzZYT.zzp(this.zzYEv.next());
            }
            if (i != 6) {
                return (!this.zzYEv.next().isComposite() || this.zzYEv.next().getNodeType() == 18) ? this.zzYEv.zzYWt().zzZop() : this.zzYEv.zzYWt().zzZou() ? this.zzYEv.next().zzYAV() : this.zzYEv.next().zzYAU();
            }
        }
        return zzZYT.zzq(this.zzYEv.next());
    }

    public zzYW8(Field field, boolean z) {
        this.zzYQt = new com.aspose.words.internal.zzZQC<>();
        this.zzXUY = new zzY(field);
        zzZ(field.getStart(), field.zzZgG(), z, field.zzZgm() ? field.zzZgo().zzZaN() : null);
    }

    private void zzZ(FieldStart fieldStart, zzYWB zzywb, boolean z, zzZKN zzzkn) {
        if (zzzkn == null) {
            zzzkn = new zzZKN();
        }
        this.zzYAE = zzzkn;
        this.zzXUZ = zzK(fieldStart);
        this.zzYEv = new zzYWI(zzywb);
        if (z) {
            zzSC();
        }
    }

    public zzYW8(zzZR8 zzzr8) {
        this.zzYQt = new com.aspose.words.internal.zzZQC<>();
        this.zzXUY = new zzZ(zzzr8);
        zzZ(zzzr8.getField().getStart(), zzzr8.zzZga(), true, zzzr8.getField().zzZgm() ? zzzr8.getField().zzZgo().zzZaN() : null);
        if (zzzr8.zzZgb()) {
            this.zzXUX++;
        }
    }

    public zzYW8(FieldStart fieldStart, FieldChar fieldChar) {
        this.zzYQt = new com.aspose.words.internal.zzZQC<>();
        this.zzXUY = null;
        zzZ(fieldStart, new zzYWB(fieldStart, false, fieldChar, false), true, null);
    }
}
