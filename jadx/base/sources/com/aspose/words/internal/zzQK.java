package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQK {
    private void zzY(zzQF zzqf, ArrayList<zzQG> arrayList) {
        while (true) {
            if (zzqf.zzQs() != null) {
                zzY(zzqf.zzQs(), arrayList);
            }
            Iterator<zzQG> it = zzqf.zzQu().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            if (zzqf.zzQt() == null) {
                return;
            } else {
                zzqf = zzqf.zzQt();
            }
        }
    }

    public final void zzZ(zzQF zzqf, ArrayList<zzQG> arrayList) {
        zzQF zzqfZzQs = zzqf;
        ArrayList<zzQG> arrayList2 = arrayList;
        while (true) {
            zzQG zzqg = arrayList2.get(0);
            zzqfZzQs.zzQu().add(zzqg);
            ArrayList<zzQG> arrayList3 = new ArrayList<>();
            ArrayList<zzQG> arrayList4 = new ArrayList<>();
            for (int i = 1; i < arrayList2.size(); i++) {
                zzQG zzqg2 = arrayList2.get(i);
                int iZzZ = zzZ(zzqg, zzqg2);
                if (iZzZ == 0) {
                    zzqfZzQs.zzQu().add(arrayList2.get(i));
                } else if (iZzZ == 1) {
                    arrayList3.add(arrayList2.get(i));
                } else if (iZzZ == 2) {
                    arrayList4.add(arrayList2.get(i));
                } else {
                    if (iZzZ != 3) {
                        throw new IllegalStateException("Unknown face/edge location relative to surface.");
                    }
                    zzQG zzqg3 = new zzQG(zzqg2.zzQv(), zzqg2.getType(), zzqg2.getOrder(), zzqg2.zzZ2(), zzqg2.zzZ1());
                    zzQG zzqg4 = new zzQG(zzqg2.zzQv(), zzqg2.getType(), zzqg2.getOrder(), zzqg2.zzZ2(), zzqg2.zzZ1());
                    zzZ(zzqg, zzqg2, zzqg3, zzqg4);
                    arrayList4.add(zzqg3);
                    arrayList3.add(zzqg4);
                }
            }
            if (arrayList3.size() > 0) {
                zzqfZzQs.zzZ(new zzQF());
                zzZ(zzqfZzQs.zzQt(), arrayList3);
            }
            if (arrayList4.size() <= 0) {
                return;
            }
            zzqfZzQs.zzY(new zzQF());
            zzqfZzQs = zzqfZzQs.zzQs();
            arrayList2 = arrayList4;
        }
    }

    public final void zzZ(ArrayList<zzQG> arrayList, zzQF zzqf) {
        zzY(zzqf, arrayList);
    }

    private static void zzZ(zzQG zzqg, zzQG zzqg2, zzQG zzqg3, zzQG zzqg4) {
        zzQG zzqg5;
        zzQD zzqd = new zzQD();
        zzQD zzqd2 = new zzQD();
        int i = 0;
        zzQD zzqdZzYi = zzqg2.zzYi(0);
        int i2 = 0;
        while (i2 < zzqdZzYi.getCount()) {
            int iZzZ = zzZ(zzqg, zzqdZzYi.zzYi(i2));
            if (iZzZ == 0) {
                zzqg5 = zzqg;
                zzqd.zzZ(zzqdZzYi.zzYi(i2));
                zzqd2.zzZ(zzqdZzYi.zzYi(i2));
            } else if (iZzZ == 1) {
                zzqg5 = zzqg;
                if (i == 2) {
                    zzZ(zzqdZzYi.zzYi(i2 - 1), zzqdZzYi.zzYi(i2), zzqg5, 0.03d, zzqd, zzqd2);
                }
                zzqd.zzZ(zzqdZzYi.zzYi(i2));
            } else if (iZzZ == 2) {
                if (i == 1) {
                    zzqg5 = zzqg;
                    zzZ(zzqdZzYi.zzYi(i2 - 1), zzqdZzYi.zzYi(i2), zzqg5, -0.03d, zzqd, zzqd2);
                } else {
                    zzqg5 = zzqg;
                }
                zzqd2.zzZ(zzqdZzYi.zzYi(i2));
            } else {
                throw new IllegalStateException("Unknown point location relative to surface.");
            }
            i2++;
            zzqg = zzqg5;
            i = iZzZ;
        }
        zzqg3.zzZ(zzqd2);
        zzqg4.zzZ(zzqd);
    }

    private static void zzZ(zzQ9 zzq9, zzQ9 zzq92, zzQG zzqg, double d, zzQD zzqd, zzQD zzqd2) {
        double dZzZ = zzZ(zzq9, zzq92, zzqg.zzYi(0).zzYi(0), zzqg.zzQv());
        if (dZzZ < 0.0d) {
            return;
        }
        zzQ9 zzq9ZzZ = zzZ(zzq9, zzq92, dZzZ, -d);
        zzQ9 zzq9ZzZ2 = zzZ(zzq9, zzq92, dZzZ, d);
        zzqd.zzZ(zzq9ZzZ);
        zzqd2.zzZ(zzq9ZzZ2);
    }

    private static zzQ9 zzZ(zzQ9 zzq9, zzQ9 zzq92, double d, double d2) {
        double d3 = d + d2;
        return new zzQ9((float) (((zzq92.zzQb() - zzq9.zzQb()) * d3) + zzq9.zzQb()), (float) (((zzq92.zzYm() - zzq9.zzYm()) * d3) + zzq9.zzYm()), (float) (((zzq92.zzQa() - zzq9.zzQa()) * d3) + zzq9.zzQa()));
    }

    private static double zzZ(zzQ9 zzq9, zzQ9 zzq92, zzQ9 zzq93, zzQ6 zzq6) {
        double dZzQa = ((zzq92.zzQa() - zzq9.zzQa()) * zzq6.zzQa()) + ((zzq92.zzYm() - zzq9.zzYm()) * zzq6.zzYm()) + ((zzq92.zzQb() - zzq9.zzQb()) * zzq6.zzQb());
        if (dZzQa == 0.0d) {
            return -1.0d;
        }
        double dZzQa2 = (((((zzq93.zzQa() * zzq6.zzQa()) + ((zzq93.zzYm() * zzq6.zzYm()) + (zzq93.zzQb() * zzq6.zzQb()))) - (zzq9.zzQb() * zzq6.zzQb())) - (zzq9.zzYm() * zzq6.zzYm())) - (zzq9.zzQa() * zzq6.zzQa())) / dZzQa;
        if (dZzQa2 < 0.0d || dZzQa2 > 1.0d) {
            return -1.0d;
        }
        return dZzQa2;
    }

    private static int zzZ(zzQG zzqg, zzQ9 zzq9) {
        zzQD zzqdZzYi = zzqg.zzYi(0);
        double dZzQa = ((zzq9.zzQa() - zzqdZzYi.zzYi(0).zzQa()) * zzqg.zzQv().zzQa()) + ((zzq9.zzYm() - zzqdZzYi.zzYi(0).zzYm()) * zzqg.zzQv().zzYm()) + ((zzq9.zzQb() - zzqdZzYi.zzYi(0).zzQb()) * zzqg.zzQv().zzQb());
        if (dZzQa >= 0.10000000149011612d) {
            return 1;
        }
        return dZzQa <= -0.10000000149011612d ? 2 : 0;
    }

    private static int zzZ(zzQG zzqg, zzQG zzqg2) {
        zzQD zzqdZzYi = zzqg2.zzYi(0);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < zzqdZzYi.getCount(); i++) {
            int iZzZ = zzZ(zzqg, zzqdZzYi.zzYi(i));
            if (iZzZ == 1) {
                z = true;
            }
            if (iZzZ == 2) {
                z2 = true;
            }
            if (z && z2) {
                return zzqg2.getType() == 12 ? 0 : 3;
            }
        }
        if (z || z2) {
            return z ? 1 : 2;
        }
        return 0;
    }
}
