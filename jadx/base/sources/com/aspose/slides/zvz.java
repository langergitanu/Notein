package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
class zvz {

    /* JADX INFO: renamed from: du */
    private final IGenericList<oju> f50755du;

    /* JADX INFO: renamed from: k4 */
    private final String[] f50756k4;

    /* JADX INFO: renamed from: kk */
    private oju f50757kk;

    /* JADX INFO: renamed from: to */
    private oju f50758to;

    /* JADX INFO: renamed from: x1 */
    private int f50759x1 = 0;

    private zvz(String[] strArr, IGenericList<oju> iGenericList) {
        oju ojuVar = oju.f47834kk;
        this.f50757kk = ojuVar.Clone();
        this.f50758to = ojuVar.Clone();
        this.f50756k4 = strArr;
        this.f50755du = iGenericList;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m74846k4(String str) {
        return C14064he.m66707k4(str, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    private int m74847k4(oju ojuVar, boolean z, boolean z2) {
        if (z) {
            oju.m68619k4(ojuVar, this.f50758to).CloneTo(ojuVar);
        }
        ojuVar.CloneTo(this.f50757kk);
        if (z2) {
            this.f50757kk.CloneTo(this.f50758to);
        }
        this.f50755du.addItem(ojuVar.Clone());
        return this.f50755du.size() - 1;
    }

    /* JADX INFO: renamed from: k4 */
    private int m74848k4(boolean z) {
        return m74849k4(z, true);
    }

    /* JADX INFO: renamed from: k4 */
    private int m74849k4(boolean z, boolean z2) {
        return m74847k4(new oju(m74846k4(m74850k4()), m74846k4(m74850k4())).Clone(), z, z2);
    }

    /* JADX INFO: renamed from: k4 */
    private String m74850k4() {
        String[] strArr = this.f50756k4;
        int i = this.f50759x1;
        this.f50759x1 = i + 1;
        return strArr[i];
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74851k4(char c, odu[] oduVarArr) {
        boolean zM67517dy = C14117yj.m67517dy(c);
        if (c != 'H') {
            if (c != 'Q') {
                if (c != 'T') {
                    if (c != 'V') {
                        if (c != 'Z') {
                            if (c != 'h') {
                                if (c != 'q') {
                                    if (c != 't') {
                                        if (c != 'v') {
                                            if (c != 'z') {
                                                if (c != 'L') {
                                                    if (c != 'M') {
                                                        if (c != 'l') {
                                                            if (c != 'm') {
                                                                oduVarArr[0] = null;
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                    oduVarArr[0] = new odu(0, m74848k4(zM67517dy));
                                                    return true;
                                                }
                                                oduVarArr[0] = new odu(2, m74848k4(zM67517dy));
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        oduVarArr[0] = new odu(4);
                        return true;
                    }
                    oduVarArr[0] = new odu(6, m74847k4(new oju(0.0f, m74846k4(m74850k4())).Clone(), zM67517dy, true));
                    return true;
                }
                oduVarArr[0] = new odu(3, m74848k4(zM67517dy));
                return true;
            }
            oduVarArr[0] = new odu(1, m74849k4(zM67517dy, false), m74848k4(zM67517dy));
            return true;
        }
        oduVarArr[0] = new odu(5, m74847k4(new oju(m74846k4(m74850k4()), 0.0f).Clone(), zM67517dy, true));
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74852k4(String[] strArr) {
        int i = this.f50759x1;
        String[] strArr2 = this.f50756k4;
        if (i >= strArr2.length) {
            strArr[0] = null;
            return false;
        }
        this.f50759x1 = i + 1;
        strArr[0] = strArr2[i];
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return (com.aspose.slides.odu[]) r0.toArray(new com.aspose.slides.odu[0]);
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static odu[] m74853k4(String str, IGenericList<oju> iGenericList) {
        List list = new List();
        zvz zvzVar = new zvz(C14113y2.m67433to(str), iGenericList);
        char c = ' ';
        while (true) {
            String[] strArr = {null};
            boolean zM74852k4 = zvzVar.m74852k4(strArr);
            String str2 = strArr[0];
            if (!zM74852k4) {
                break;
            }
            char cCharAt = str2.length() == 1 ? str2.charAt(0) : ' ';
            odu[] oduVarArr = {null};
            boolean zM74851k4 = zvzVar.m74851k4(cCharAt, oduVarArr);
            odu oduVar = oduVarArr[0];
            if (!zM74851k4) {
                zvzVar.f50759x1--;
                oduVarArr[0] = oduVar;
                boolean zM74851k42 = zvzVar.m74851k4(c, oduVarArr);
                odu oduVar2 = oduVarArr[0];
                if (!zM74851k42) {
                    throw new NotImplementedException();
                }
                list.addItem(oduVar2);
            } else {
                if (oduVar == null) {
                    break;
                }
                list.addItem(oduVar);
                c = cCharAt;
            }
        }
    }
}
