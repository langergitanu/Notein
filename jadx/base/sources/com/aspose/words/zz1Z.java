package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1Z extends com.aspose.words.internal.zzYC {
    public zz1Z(zz21 zz21Var, zzZ90 zzz90) {
        zzz(0);
        zzW(zz21Var.zzZQX().zzZ(zzz90, (zzZCM) null));
        double dCos = Math.cos(zz21Var.zzZuM().zzZQR()) * zz21Var.zzZuL();
        double dSin = Math.sin(zz21Var.zzZuM().zzZQR()) * zz21Var.zzZuL();
        zzXR().add(dCos);
        zzXQ().add(dSin);
        zzP(zz21Var.zzZuH());
        zzO(Math.tan(zz21Var.zzZuI().zzZQR()));
        zzN(Math.tan(zz21Var.zzZuJ().zzZQR()));
        zzM(zz21Var.zzZuG());
        long jZzGw = zzZZZ.zzGw(zz21Var.getAlignment());
        zzL(Float.intBitsToFloat((int) jZzGw));
        zzK(com.aspose.words.internal.zzZPY.zzYC(jZzGw));
        zzI(0.0d);
        zzJ(0.0d);
    }

    @Override // com.aspose.words.internal.zzYC
    public final boolean zzXS() {
        return true;
    }

    public final com.aspose.words.internal.zzP9 zzZt(com.aspose.words.internal.zzZQ4 zzzq4) {
        float fZzXX = (((float) zzXX()) + 0.5f) * zzzq4.getWidth();
        float fZzXW = (((float) zzXW()) + 0.5f) * zzzq4.getHeight();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((-fZzXX) - zzzq4.getX(), (-fZzXW) - zzzq4.getY(), 1);
        zzp9.zzZ(new com.aspose.words.internal.zzP9((float) zzY1(), (float) zzY0(), (float) zzXZ(), (float) zzXY(), 0.0f, 0.0f), 1);
        zzp9.zzY(zzzq4.getX() + fZzXX + ((float) zzC(0)), zzzq4.getY() + fZzXW + ((float) zzB(0)), 1);
        return zzp9;
    }
}
