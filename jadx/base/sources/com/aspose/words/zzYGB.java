package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGB extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\bkmkcolf", "\\bkmkcoll");
    private zzYX9 zzXud;
    private zzYX6 zzXue;
    private zzYX9 zzXuf;
    private zzYX6 zzXug;

    public zzYGB(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 55) {
            zzZ(zzyet, this.zzXug);
        } else if (type != 57) {
            super.zzT(zzyet);
        } else {
            zzZ(zzyet, this.zzXue);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        switch (zzYiN().getType()) {
            case 55:
                zzZ(zzyet.zzYR(), this.zzXug);
                break;
            case 56:
                zzZ(zzyet.zzYR(), this.zzXuf, 1);
                break;
            case 57:
                zzZ(zzyet.zzYR(), this.zzXue);
                break;
            case 58:
                zzZ(zzyet.zzYR(), this.zzXud, 0);
                break;
            default:
                super.zzY(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        switch (zzYiN().getType()) {
            case 55:
                this.zzXug = new zzYX3(getDocument(), 0, "", "", com.aspose.words.internal.zzZQ9.zz35, 2);
                zzYiM().zzV(this.zzXug);
                break;
            case 56:
                this.zzXuf = new zzYX4(getDocument(), 0, 2);
                zzYiM().zzX(this.zzXuf);
                break;
            case 57:
                this.zzXue = new zzYXB(getDocument(), 0, "", "", com.aspose.words.internal.zzZQ9.zz35, 2);
                zzYiM().zzV(this.zzXue);
                break;
            case 58:
                this.zzXud = new zzYXC(getDocument(), 0, 2);
                zzYiM().zzX(this.zzXud);
                break;
            default:
                super.zzZ(zzyet);
                break;
        }
    }

    private static void zzZ(zzYET zzyet, zzYX6 zzyx6) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            zzyx6.zzOX(zzyet.zzYeT());
        } else {
            if (iZzTP != 1) {
                return;
            }
            zzyx6.zzOW(zzyet.zzYeT() - 1);
        }
    }

    private void zzZ(String str, zzYX6 zzyx6) {
        String[] strArrZzU = com.aspose.words.internal.zzZKN.zzU(str, (char[]) null);
        if (strArrZzU.length == 2) {
            zzyx6.setName(strArrZzU[0]);
            zzYGY zzygy = new zzYGY(strArrZzU[1]);
            zzyx6.setAuthor(this.zzXw4.zzYgv().get(zzygy.zzXa()));
            zzyx6.zz9(zzYEO.zzM4(zzygy.zzXc()));
        }
    }

    private void zzZ(String str, zzYX9 zzyx9, int i) {
        zzYX6 zzyx6ZzY = zzYX8.zzY(getDocument(), str, i);
        if (zzyx6ZzY != null) {
            zzyx9.setId(zzyx6ZzY.getId());
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        switch (zzyhp.getType()) {
            case 55:
            case 56:
            case 57:
            case 58:
                return this;
            default:
                return super.zzZ(zzyhp);
        }
    }
}
