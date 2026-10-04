package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVO extends zzZVS {
    @Override // com.aspose.words.zzZVS
    public final com.aspose.words.internal.zzQD zzZ(com.aspose.words.internal.zzQ9 zzq9, com.aspose.words.internal.zzQ9 zzq92, com.aspose.words.internal.zzQ9 zzq93, com.aspose.words.internal.zzQ9 zzq94) {
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD();
        zzqd.zzZ(zzq9);
        zzqd.zzZ(zzq92);
        zzqd.zzZ(zzq94);
        zzqd.zzZ(zzq93);
        return zzqd;
    }

    @Override // com.aspose.words.zzZVS
    public final com.aspose.words.internal.zzQG zzZ(int i, com.aspose.words.internal.zzQG zzqg, com.aspose.words.internal.zzQG zzqg2) {
        com.aspose.words.internal.zzQ6 zzq6ZzW = zzqg.zzQv().zzW(zzqg2.zzQv());
        zzq6ZzW.normalize();
        com.aspose.words.internal.zzQG zzqg3 = new com.aspose.words.internal.zzQG(zzq6ZzW, 12, i, (com.aspose.words.internal.zzOU) null, (com.aspose.words.internal.zzPY) null);
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD();
        com.aspose.words.internal.zzQ9 zzq9ZzYi = zzqg.zzYi(0).zzYi(0);
        com.aspose.words.internal.zzQ9 zzq9ZzYi2 = zzqg.zzYi(0).zzYi(1);
        com.aspose.words.internal.zzQ9 zzq9ZzYi3 = zzqg.zzYi(0).zzYi(2);
        com.aspose.words.internal.zzQ9 zzq9ZzYi4 = zzqg2.zzYi(0).zzYi(1);
        double dZzQb = zzq9ZzYi2.zzQb() - zzq9ZzYi.zzQb();
        double dZzYm = zzq9ZzYi2.zzYm() - zzq9ZzYi.zzYm();
        double dSqrt = Math.sqrt(Math.pow(dZzYm, 2.0d) + Math.pow(dZzQb, 2.0d));
        double d = dZzQb / dSqrt;
        double d2 = dZzYm / dSqrt;
        double dZzQb2 = zzq9ZzYi4.zzQb() - zzq9ZzYi2.zzQb();
        double dZzYm2 = zzq9ZzYi4.zzYm() - zzq9ZzYi2.zzYm();
        double dSqrt2 = Math.sqrt(Math.pow(dZzYm2, 2.0d) + Math.pow(dZzQb2, 2.0d));
        double d3 = dZzQb2 / dSqrt2;
        double d4 = dZzYm2 / dSqrt2;
        double dMin = Math.min(dSqrt, dSqrt2);
        double dMin2 = Math.min(dMin > 12700.0d ? 12700.0f : 0.5f, dMin);
        double d5 = d * dMin2;
        double d6 = d2 * dMin2;
        zzqd.zzZ(new com.aspose.words.internal.zzQ9(zzq9ZzYi2.zzQb() - d5, zzq9ZzYi2.zzYm() - d6, zzq9ZzYi2.zzQa()));
        zzqd.zzZ(new com.aspose.words.internal.zzQ9(zzq9ZzYi3.zzQb() - d5, zzq9ZzYi3.zzYm() - d6, zzq9ZzYi3.zzQa()));
        double d7 = d3 * dMin2;
        double d8 = dMin2 * d4;
        zzqd.zzZ(new com.aspose.words.internal.zzQ9(zzq9ZzYi3.zzQb() + d7, zzq9ZzYi3.zzYm() + d8, zzq9ZzYi3.zzQa()));
        zzqd.zzZ(new com.aspose.words.internal.zzQ9(zzq9ZzYi2.zzQb() + d7, zzq9ZzYi2.zzYm() + d8, zzq9ZzYi2.zzQa()));
        zzqg3.zzZ(zzqd);
        return zzqg3;
    }
}
