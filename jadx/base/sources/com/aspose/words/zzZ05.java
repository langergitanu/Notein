package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ05 {
    private int zzY0T;
    private int zzY0U;
    private int zzYlk;
    private DocumentBase zzZG3;
    private int zzY0V = 0;
    private boolean zzY0S = true;
    private com.aspose.words.internal.zz7D<OfficeMath> zzY0R = new com.aspose.words.internal.zz7D<>();

    public zzZ05(DocumentBase documentBase) {
        this.zzZG3 = documentBase;
    }

    private void zzYEG() {
        com.aspose.words.internal.zz7D<OfficeMath>.zzZ zzzZzxt = this.zzY0R.zzxt();
        while (zzzZzxt.moveNext()) {
            OfficeMath officeMathZzxv = zzzZzxt.zzxv();
            int iZzCL = this.zzY0T - zzzZzxt.zzCL();
            for (int i = 0; i < iZzCL; i++) {
                officeMathZzxv.zzZsL().getMathObjectType();
                officeMathZzxv.prependChild(new OfficeMath(this.zzZG3, new zzZ0H(8)));
            }
        }
    }

    public static boolean zzq(OfficeMath officeMath) {
        int mathObjectType = officeMath.zzZsL().getMathObjectType();
        return mathObjectType == 20 || mathObjectType == 8;
    }

    public final int visitOfficeMathEnd(OfficeMath officeMath) {
        int i = this.zzY0V;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("Please report exception");
                }
                if (officeMath.zzZsL().getMathObjectType() == 8) {
                    int i2 = this.zzY0U - 1;
                    this.zzY0U = i2;
                    if (i2 == 0) {
                        this.zzY0V = 1;
                    }
                }
            } else if (officeMath.zzZsL().getMathObjectType() == 20) {
                this.zzY0V = 0;
                int i3 = this.zzY0T;
                int i4 = this.zzYlk;
                if (i3 < i4) {
                    this.zzY0T = i4;
                }
                if (this.zzY0S) {
                    this.zzY0R.zzP(officeMath, i4);
                }
            }
        } else if (officeMath.zzZsL().getMathObjectType() == 19) {
            ((zzZ07) officeMath.zzZsL()).zzYEI().zzuJ(this.zzY0T);
            if (this.zzY0S) {
                zzYEG();
            }
        }
        return 0;
    }

    public final int visitOfficeMathStart(OfficeMath officeMath) {
        int i = this.zzY0V;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("Please report exception");
                }
                if (officeMath.zzZsL().getMathObjectType() == 8) {
                    this.zzY0U++;
                }
            } else if (officeMath.zzZsL().getMathObjectType() == 8) {
                this.zzYlk++;
                this.zzY0U = 1;
                this.zzY0V = 2;
            }
        } else if (officeMath.zzZsL().getMathObjectType() == 20) {
            this.zzY0V = 1;
            this.zzYlk = 0;
        }
        return 0;
    }
}
