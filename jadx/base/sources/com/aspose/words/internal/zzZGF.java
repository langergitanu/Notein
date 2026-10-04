package com.aspose.words.internal;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import OoooooO.C21445Oooo;
import com.aspose.slides.OooOOO;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18385v2;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGF extends zzZGD {
    static final Boolean zzWNA = Boolean.FALSE;
    static final Boolean zzWNz = Boolean.TRUE;
    final zzZDZ zzWNb;
    transient zzZDU zzWNc;
    final zzZGV zzWNd;
    zzZGI zzWNe;
    String zzWNf;
    boolean zzWNg;
    String zzWNh;
    boolean zzWNi;
    int zzWNj;
    zzZDU zzWNk;
    boolean zzWNl;
    zzZGH zzWNm;
    HashMap<String, String> zzWNn;
    LinkedHashMap<zzZDZ, zzZGZ> zzWNo;
    HashMap<zzZDZ, zzZDZ> zzWNp;
    HashMap<String, zzZQY> zzWNq;
    boolean zzWNr;
    final HashMap<String, zzZQO> zzWNs;
    boolean zzWNt;
    final HashMap<String, zzZG3> zzWNu;
    final HashMap<String, zzZG3> zzWNv;
    HashMap<String, zzZG3> zzWNw;
    final boolean zzWNx;
    final boolean zzWNy;
    HashMap<String, zzZQO> zzWOf;
    Set<String> zzWOg;
    Set<String> zzWOi;
    HashMap<String, zzZG3> zzWOk;
    final int zzWQl;
    HashMap<String, String> zzYkm;

    private zzZGF(zzZF1 zzzf1, zzZHC zzzhc, boolean z, int i) {
        this(zzzf1, zzzhc, false, null, z, i);
    }

    private void zzJ(String str, Object obj) throws zzZQS {
        zzxX(OooOOO.OooO0O0(new StringBuilder(), zzYI(obj), ": ", str));
    }

    private static char zzM(char c, char c2) {
        if (c != c2) {
            if (c == ' ') {
                return c2;
            }
            if (c2 != ' ') {
                return '*';
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r3 == '\n') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r0 != '\r') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        zzXc(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r7 = true;
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.aspose.words.internal.zzZF3, com.aspose.words.internal.zzZGF] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.aspose.words.internal.zzZF3] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.aspose.words.internal.zzZER, com.aspose.words.internal.zzZF3, com.aspose.words.internal.zzZGD, com.aspose.words.internal.zzZGF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzP5(boolean z) throws Throwable {
        boolean z2;
        ?? r5;
        ?? r52;
        char cZzXOe;
        zzYFX zzyfx;
        String str;
        zzZG3 zzzg1;
        ?? r53;
        HashMap linkedHashMap;
        Object obj;
        boolean zIsSpaceChar;
        char cZzXNY = zzXNY();
        boolean z3 = false;
        while (true) {
            if (cZzXNY != '%') {
                if (!zzZF3.isSpaceChar(cZzXNY)) {
                    z2 = false;
                    r5 = zIsSpaceChar;
                    break;
                } else {
                    cZzXNY = zzXNY();
                    z3 = true;
                }
            } else {
                char cZzXOg = zzXOg();
                if (cZzXOg == 0 || (zIsSpaceChar = zzZF3.isSpaceChar(cZzXOg))) {
                    break;
                }
                if (!zzXn(cZzXOg)) {
                    zzf(cZzXOg, "; expected a space (for PE declaration) or PE reference name");
                }
                this.zzWMi--;
                zzXOd();
                cZzXNY = zzXNX();
                z3 = true;
            }
        }
        if (!z3) {
            zzf(cZzXNY, "; expected a space separating ENTITY keyword and entity name");
        }
        if (z2) {
            cZzXNY = zzP6(true);
        }
        if (z && !z2) {
            this.zzWNe.zzgW(this.zzWMi);
            this.zzWNe.zzy3("<!ENTITY ");
            this.zzWNe.zzXx(cZzXNY);
        }
        String strZzXv = zzXv(cZzXNY);
        zzYFX zzyfxZzXMp = zzXMp();
        try {
            cZzXOe = zzXOe();
        } catch (Throwable th) {
            th = th;
            r52 = this;
        }
        try {
            if (cZzXOe == '\'' || cZzXOe == '\"') {
                r5 = this;
                zzXNY();
                zzZF2 zzzf2ZzXMq = zzXMq();
                r5.zzWMi--;
                char[] cArrZzZ = zzZ(strZzXv, zzzf2ZzXMq, cZzXOe);
                zzyfx = zzyfxZzXMp;
                str = strZzXv;
                try {
                    zzzg1 = new zzZG1(zzyfx, str, zzXNH(), cArrZzZ, zzzf2ZzXMq);
                    r53 = r5;
                } catch (IOException e) {
                    throw new zzZFU(e);
                }
            } else {
                if (!zzXn(cZzXOe)) {
                    zzf(cZzXOe, "; expected either quoted value, or keyword 'PUBLIC' or 'SYSTEM'");
                }
                zzZGF zzzgf = this;
                zzzg1 = zzzgf.zzZ(this.zzWKK, z2, strZzXv, cZzXOe, zzyfxZzXMp);
                zzyfx = zzyfxZzXMp;
                str = strZzXv;
                r53 = zzzgf;
            }
            if (r53.zzmO) {
                zzzg1.zzXNM();
            }
            if (z && z2) {
                r53.zzWNe.zzgW(r53.zzWMi);
            }
            if (z2) {
                linkedHashMap = r53.zzWNw;
                if (linkedHashMap == null) {
                    linkedHashMap = new HashMap();
                    r53.zzWNw = linkedHashMap;
                }
            } else {
                linkedHashMap = r53.zzWOk;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    r53.zzWOk = linkedHashMap;
                }
            }
            if (linkedHashMap.size() <= 0 || (obj = linkedHashMap.get(str)) == null) {
                linkedHashMap.put(str, zzzg1);
            } else {
                zzZQU zzzquZzXPv = r53.zzWML.zzXPv();
                if (zzzquZzXPv != null) {
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0(" entity '", str, "' defined more than once: first declaration at ");
                    sbOooO0o0.append(((zzZG3) obj).zzlj());
                    String string = sbOooO0o0.toString();
                    zzZ(zzzquZzXPv, zzZH9.zzWPW, z2 ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Parameter", string) : com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("General", string), zzyfx);
                }
            }
            if (r53.zzWNd == null || zzzg1.zzXNK()) {
                return;
            }
            try {
                r53.zzWKK.zzXNH();
            } catch (IOException e2) {
                throw new zzZFU(e2);
            }
        } catch (Throwable th2) {
            th = th2;
            r52 = r5;
            if (z && z2) {
                r52.zzWNe.zzgW(r52.zzWMi);
            }
            throw th;
        }
    }

    private char zzP6(boolean z) throws zzZQS {
        char cZzxF;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxF = cArr[i];
            } else {
                cZzxF = zzxF(zzXNQ());
            }
            if (cZzxF > ' ') {
                if (cZzxF != '%' || !z) {
                    break;
                }
                zzXOd();
            } else if (cZzxF == '\n' || cZzxF == '\r') {
                zzXc(cZzxF);
            } else if (cZzxF != ' ' && cZzxF != '\t') {
                zzgs(cZzxF);
            }
        }
        return cZzxF;
    }

    private void zzX(zzZF1 zzzf1) throws zzZQS {
        if (this.zzWNx) {
            zzxX(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzZ(zzzf1), ": Unbalanced PE: has to be fully contained in a declaration (as per xml 1.0.3, section 2.8, VC 'Proper Declaration/PE Nesting')"));
        }
    }

    private LinkedHashMap<zzZDZ, zzZGZ> zzXO1() {
        LinkedHashMap<zzZDZ, zzZGZ> linkedHashMap = this.zzWNo;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap<zzZDZ, zzZGZ> linkedHashMap2 = new LinkedHashMap<>();
        this.zzWNo = linkedHashMap2;
        return linkedHashMap2;
    }

    private void zzXO2() throws zzZQS {
        String strZzXb;
        this.zzWNg = true;
        char cZzXOe = zzXOe();
        if (zzXn(cZzXOe)) {
            strZzXb = zzXb(cZzXOe);
            cZzXOe = zzXOe();
        } else {
            strZzXb = null;
        }
        if (cZzXOe != '\"' && cZzXOe != '\'') {
            if (cZzXOe == '>') {
                zzxX("Missing namespace URI for TARGETNS directive");
            }
            zzf(cZzXOe, "; expected a single or double quote to enclose the namespace URI");
        }
        String strZzZ = zzZ(cZzXOe, false, "in namespace URI");
        if ((this.zzWQl & 2048) != 0) {
            strZzZ = zzZE0.zzXLD().zzx0(strZzZ);
        }
        char cZzP6 = zzP6(true);
        if (cZzP6 != '>') {
            zzf(cZzP6, "; expected '>' to end TARGETNS directive");
        }
        if (strZzXb == null) {
            this.zzWNf = strZzZ;
            return;
        }
        if (this.zzYkm == null) {
            this.zzYkm = new HashMap<>();
        }
        this.zzYkm.put(strZzXb, strZzZ);
    }

    private void zzXO3() throws zzZQS {
        boolean z;
        String strZzW;
        zzZQO zzzqo;
        String strZzXv = zzXv(zzXOe());
        boolean zZzXw = zzXw(zzXOe());
        char cZzXOe = zzXOe();
        String strZzZ = null;
        if (zZzXw) {
            if (cZzXOe != '\"' && cZzXOe != '\'') {
                zzf(cZzXOe, "; expected a quote to start the public identifier");
            }
            strZzW = zzW(cZzXOe, zzXNQ());
            cZzXOe = zzP6(true);
            z = true;
        } else {
            z = true;
            strZzW = null;
        }
        if (cZzXOe == '\"' || cZzXOe == '\'') {
            strZzZ = zzZ(cZzXOe, this.zzWKF, zzXNQ());
            cZzXOe = zzP6(z);
        } else if (!zZzXw) {
            zzf(cZzXOe, "; expected a quote to start the system identifier");
        }
        String str = strZzZ;
        if (cZzXOe != '>') {
            zzf(cZzXOe, "; expected closing '>' after NOTATION declaration");
        }
        try {
            zzZFX zzzfx = new zzZFX(zzXMp(), strZzXv, strZzW, str, this.zzWKK.zzXNH());
            HashMap<String, zzZQO> map = this.zzWNs;
            if (map != null && (zzzqo = map.get(strZzXv)) != null) {
                zzZGM.zzZ(zzzqo, zzzfx);
            }
            HashMap linkedHashMap = this.zzWOf;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.zzWOf = linkedHashMap;
            } else {
                zzZQO zzzqo2 = (zzZQO) linkedHashMap.get(strZzXv);
                if (zzzqo2 != null) {
                    zzZGM.zzZ(zzzqo2, zzzfx);
                }
            }
            HashMap<String, zzZQY> map2 = this.zzWNq;
            if (map2 != null) {
                map2.remove(strZzXv);
            }
            linkedHashMap.put(strZzXv, zzzfx);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }

    private void zzXO4() throws zzZQS {
        zzZG6 zzzg6ZzXOn;
        String strZzy0;
        zzZGZ zzzgzZzZ;
        zzZDZ zzzdzZzXt = zzXt(zzXOe());
        zzYFX zzyfxZzXMp = zzXMp();
        char cZzXOe = zzXOe();
        int i = 4;
        if (cZzXOe != '(') {
            if (zzXn(cZzXOe)) {
                if (cZzXOe == 'A') {
                    String strZzy1 = zzy1("NY");
                    if (strZzy1 != null) {
                        strZzy0 = C18385v2.f56336h.concat(strZzy1);
                    }
                } else if (cZzXOe == 'E') {
                    String strZzy12 = zzy1("MPTY");
                    if (strZzy12 == null) {
                        zzzg6ZzXOn = zzZGG.zzXOn();
                        i = 0;
                    } else {
                        strZzy0 = "E".concat(strZzy12);
                    }
                } else {
                    this.zzWMi--;
                    strZzy0 = zzy0(String.valueOf(cZzXOe));
                }
                zzxX("Unrecognized DTD content spec keyword '" + strZzy0 + "' (for element <" + zzzdzZzXt + ">); expected ANY or EMPTY");
            } else {
                zzf(cZzXOe, ": excepted '(' to start content specification for element <" + zzzdzZzXt + ">");
            }
            zzzg6ZzXOn = null;
        } else if (zzP6(true) == '#') {
            zzzg6ZzXOn = zzZ(zzzdzZzXt, this.zzWNx);
        } else {
            this.zzWMi--;
            zzZH4 zzzh4ZzY = zzY(zzzdzZzXt, this.zzWNx);
            zzZG6 zzzg6ZzXP2 = zzzh4ZzY.zzXP2();
            if (zzzg6ZzXP2 == null) {
                zzzg6ZzXP2 = new zzZH2(zzZH3.zzZ(zzzh4ZzY));
            }
            zzzg6ZzXOn = zzzg6ZzXP2;
            i = 1;
        }
        char cZzP6 = zzP6(true);
        if (cZzP6 != '>') {
            zzf(cZzP6, "; expected '>' to finish the element declaration for <" + zzzdzZzXt + ">");
        }
        LinkedHashMap<zzZDZ, zzZGZ> linkedHashMapZzXO1 = zzXO1();
        zzZGZ zzzgz = linkedHashMapZzXO1.get(zzzdzZzXt);
        if (zzzgz != null) {
            if (zzzgz.isDefined()) {
                if (!this.zzWNx) {
                    return;
                } else {
                    zzZGM.zzZ(zzzgz, zzyfxZzXMp);
                }
            }
            zzzgzZzZ = zzzgz.zzZ(zzyfxZzXMp, zzzg6ZzXOn, i);
        } else {
            zzzgzZzZ = zzZGZ.zzZ(this.zzWML, zzyfxZzXMp, zzzdzZzXt, zzzg6ZzXOn, i);
        }
        linkedHashMapZzXO1.put(zzzdzZzXt, zzzgzZzZ);
    }

    private void zzXO5() throws zzZQS {
        zzZDZ zzzdzZzXt = zzXt(zzXOe());
        zzYFX zzyfxZzXMp = zzXMp();
        LinkedHashMap<zzZDZ, zzZGZ> linkedHashMapZzXO1 = zzXO1();
        zzZGZ zzzgzZzZ = linkedHashMapZzXO1.get(zzzdzZzXt);
        if (zzzgzZzZ == null) {
            zzzgzZzZ = zzZGZ.zzZ(this.zzWML, zzyfxZzXMp, zzzdzZzXt);
            linkedHashMapZzXO1.put(zzzdzZzXt, zzzgzZzZ);
        }
        while (true) {
            char cZzXOf = zzXOf();
            if (zzZF3.isSpaceChar(cZzXOf)) {
                this.zzWMi--;
                cZzXOf = zzP6(true);
            }
            if (cZzXOf == '>') {
                return;
            } else {
                zzZ(zzzgzZzZ, cZzXOf, zzyfxZzXMp);
            }
        }
    }

    private void zzXO6() throws Throwable {
        String strZzy0;
        char cZzXNY = zzXNY();
        if (cZzXNY == 'N') {
            String strZzy1 = zzy1("TITY");
            if (strZzy1 == null) {
                zzP5(true);
                return;
            } else {
                strZzy0 = "EN".concat(strZzy1);
                this.zzWNe.zzgW(this.zzWMi);
            }
        } else {
            this.zzWNe.zzgW(this.zzWMi);
            this.zzWNe.zzy3("<!E");
            this.zzWNe.zzXx(cZzXNY);
            if (cZzXNY == 'L') {
                String strZzy12 = zzy1("EMENT");
                if (strZzy12 == null) {
                    zzXO4();
                    return;
                }
                strZzy0 = "EL".concat(strZzy12);
            } else {
                strZzy0 = zzy0("E");
            }
        }
        zzxZ(strZzy0);
    }

    private void zzXO7() throws zzZQS {
        int size = this.zzWNq.size();
        String next = this.zzWNq.keySet().iterator().next();
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        sb.append(" referenced notation");
        zzxY(C21445Oooo.OooO0O0(sb, size == 1 ? "" : "s", " undefined: first one '", next, "'"));
    }

    private void zzXO8() throws zzZQS {
        char cZzxF;
        char cZzP6 = zzP6(false);
        if (cZzP6 != '[') {
            zzf(cZzP6, "; expected '[' to follow 'IGNORE' directive");
        }
        String strZzXNQ = zzXNQ();
        int i = 1;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxF = cArr[i2];
            } else {
                cZzxF = zzxF(strZzXNQ);
            }
            if (cZzxF < ' ') {
                if (cZzxF == '\n' || cZzxF == '\r') {
                    zzXc(cZzxF);
                } else if (cZzxF != '\t') {
                    zzgs(cZzxF);
                }
            } else if (cZzxF == ']') {
                if (zzxF(strZzXNQ) == ']' && zzxF(strZzXNQ) == '>') {
                    i--;
                    if (i <= 0) {
                        return;
                    }
                } else {
                    this.zzWMi--;
                }
            } else if (cZzxF == '<') {
                if (zzxF(strZzXNQ) == '!' && zzxF(strZzXNQ) == '[') {
                    i++;
                } else {
                    this.zzWMi--;
                }
            }
        }
    }

    private void zzXO9() throws zzZQS {
        char cZzP6 = zzP6(false);
        if (cZzP6 != '[') {
            zzf(cZzP6, "; expected '[' to follow 'INCLUDE' directive");
        }
        this.zzWNj++;
    }

    private void zzXOa() throws zzZQS {
        String strZzy0;
        if (!this.zzmO && this.zzWKK == this.zzWKJ) {
            zzV("Internal DTD subset can not use (INCLUDE/IGNORE) directives (except via external entities)", null, null);
        }
        char cZzP6 = zzP6(true);
        if (cZzP6 != 'I') {
            strZzy0 = zzy0(String.valueOf(cZzP6));
        } else {
            char cZzXNY = zzXNY();
            if (cZzXNY == 'G') {
                String strZzy1 = zzy1("NORE");
                if (strZzy1 == null) {
                    zzXO8();
                    return;
                }
                strZzy0 = "IG".concat(strZzy1);
            } else if (cZzXNY == 'N') {
                String strZzy12 = zzy1("CLUDE");
                if (strZzy12 == null) {
                    zzXO9();
                    return;
                }
                strZzy0 = "IN".concat(strZzy12);
            } else {
                this.zzWMi--;
                strZzy0 = zzy0("I");
            }
        }
        zzV(C20593OooO0Oo.OooO0O0("Unrecognized directive '", strZzy0, "'; expected either 'IGNORE' or 'INCLUDE'"), null, null);
    }

    private void zzXOb() throws zzZQS {
        char cZzXNY;
        char cZzXNY2;
        String strZzXMe = zzXMe();
        if (strZzXMe.length() == 0) {
            zzV(zzZH9.zzWPw, null, null);
        }
        if (strZzXMe.equalsIgnoreCase("xml")) {
            zzV(zzZH9.zzWPv, strZzXMe, null);
        }
        char cZzXNY3 = zzXNY();
        if (!zzZF3.isSpaceChar(cZzXNY3)) {
            if (cZzXNY3 == '?' && zzXNY() == '>') {
                return;
            }
            zzd(cZzXNY3, zzZH9.zzWPu);
            return;
        }
        if (this.zzWNd == null) {
            while (true) {
                int i = this.zzWMi;
                if (i < this.zzWMh) {
                    char[] cArr = this.zzWLX;
                    this.zzWMi = i + 1;
                    cZzXNY2 = cArr[i];
                } else {
                    cZzXNY2 = zzXNY();
                }
                if (cZzXNY2 == '?') {
                    do {
                        int i2 = this.zzWMi;
                        if (i2 < this.zzWMh) {
                            char[] cArr2 = this.zzWLX;
                            this.zzWMi = i2 + 1;
                            cZzXNY2 = cArr2[i2];
                        } else {
                            cZzXNY2 = zzXNY();
                        }
                    } while (cZzXNY2 == '?');
                    if (cZzXNY2 == '>') {
                        return;
                    }
                }
                if (cZzXNY2 < ' ') {
                    if (cZzXNY2 == '\n' || cZzXNY2 == '\r') {
                        zzXc(cZzXNY2);
                    } else if (cZzXNY2 != '\t') {
                        zzgs(cZzXNY2);
                    }
                }
            }
        } else {
            while (cZzXNY3 <= ' ') {
                if (cZzXNY3 == '\n' || cZzXNY3 == '\r') {
                    zzXc(cZzXNY3);
                } else if (cZzXNY3 != '\t' && cZzXNY3 != ' ') {
                    zzgs(cZzXNY3);
                }
                int i3 = this.zzWMi;
                if (i3 < this.zzWMh) {
                    char[] cArr3 = this.zzWLX;
                    this.zzWMi = i3 + 1;
                    cZzXNY3 = cArr3[i3];
                } else {
                    cZzXNY3 = zzXNY();
                }
            }
            zzZDU zzzduZzXOm = zzXOm();
            char[] cArrZzXLk = zzzduZzXOm.zzXLk();
            int i4 = 0;
            while (true) {
                if (cZzXNY3 == '?') {
                    while (true) {
                        int i5 = this.zzWMi;
                        if (i5 < this.zzWMh) {
                            char[] cArr4 = this.zzWLX;
                            this.zzWMi = i5 + 1;
                            cZzXNY = cArr4[i5];
                        } else {
                            cZzXNY = zzXNY();
                        }
                        if (cZzXNY != '?') {
                            break;
                        }
                        if (i4 >= cArrZzXLk.length) {
                            cArrZzXLk = zzzduZzXOm.zzXLi();
                            i4 = 0;
                        }
                        cArrZzXLk[i4] = cZzXNY;
                        i4++;
                    }
                    if (cZzXNY == '>') {
                        zzzduZzXOm.zzge(i4);
                        zzzduZzXOm.zzXLp();
                        return;
                    } else {
                        this.zzWMi--;
                        cZzXNY3 = '?';
                    }
                } else if (cZzXNY3 < ' ') {
                    if (cZzXNY3 == '\n' || cZzXNY3 == '\r') {
                        zzXc(cZzXNY3);
                        cZzXNY3 = '\n';
                    } else if (cZzXNY3 != '\t') {
                        zzgs(cZzXNY3);
                    }
                }
                if (i4 >= cArrZzXLk.length) {
                    cArrZzXLk = zzzduZzXOm.zzXLi();
                    i4 = 0;
                }
                int i6 = i4 + 1;
                cArrZzXLk[i4] = cZzXNY3;
                int i7 = this.zzWMi;
                if (i7 < this.zzWMh) {
                    char[] cArr5 = this.zzWLX;
                    this.zzWMi = i7 + 1;
                    cZzXNY3 = cArr5[i7];
                } else {
                    cZzXNY3 = zzXNY();
                }
                i4 = i6;
            }
        }
    }

    private char zzXOc() throws zzZQS {
        char cZzxF;
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzxF = cArr[i];
        } else {
            cZzxF = zzxF(zzXNQ());
        }
        if (cZzxF == '?' || cZzxF == '*' || cZzxF == '+') {
            return cZzxF;
        }
        this.zzWMi--;
        return ControlChar.SPACE_CHAR;
    }

    private void zzXOd() throws zzZQS {
        char cZzXNY;
        String strZzXv;
        char cZzXNY2;
        char cZzXNY3;
        if (this.zzWNi) {
            zzV("Can not have parameter entities in the internal subset, except for defining complete declarations (XML 1.0, #2.8, WFC 'PEs In Internal Subset')", null, null);
        }
        zzZGI zzzgi = this.zzWNe;
        if (zzzgi != null) {
            zzzgi.zzU(this.zzWLX, this.zzWMi - 1);
            this.zzWNe.zzXOt();
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzXNY3 = cArr[i];
            } else {
                cZzXNY3 = zzXNY();
            }
            strZzXv = zzXv(cZzXNY3);
            try {
                int i2 = this.zzWMi;
                if (i2 < this.zzWMh) {
                    char[] cArr2 = this.zzWLX;
                    this.zzWMi = i2 + 1;
                    cZzXNY2 = cArr2[i2];
                } else {
                    cZzXNY2 = zzXNY();
                }
                this.zzWNe.zzgW(this.zzWMi);
            } catch (Throwable th) {
                this.zzWNe.zzgW(this.zzWMi);
                throw th;
            }
        } else {
            int i3 = this.zzWMi;
            if (i3 < this.zzWMh) {
                char[] cArr3 = this.zzWLX;
                this.zzWMi = i3 + 1;
                cZzXNY = cArr3[i3];
            } else {
                cZzXNY = zzXNY();
            }
            strZzXv = zzXv(cZzXNY);
            int i4 = this.zzWMi;
            if (i4 < this.zzWMh) {
                char[] cArr4 = this.zzWLX;
                this.zzWMi = i4 + 1;
                cZzXNY2 = cArr4[i4];
            } else {
                cZzXNY2 = zzXNY();
            }
        }
        if (cZzXNY2 != ';') {
            zzf(cZzXNY2, "; expected ';' to end parameter entity name");
        }
        this.zzWNl = true;
        zzZ(strZzXv, true, (Object) zzWNz);
    }

    private char zzXOe() throws zzZQS {
        char cZzxF;
        if (zzXMl() == -1) {
            cZzxF = zzxF(zzXNQ());
            if (cZzxF > ' ' && cZzxF != '%') {
                return cZzxF;
            }
        } else {
            char[] cArr = this.zzWLX;
            int i = this.zzWMi;
            this.zzWMi = i + 1;
            cZzxF = cArr[i];
            if (cZzxF > ' ' && cZzxF != '%') {
                zzf(cZzxF, "; expected a separating white space");
            }
        }
        while (true) {
            if (cZzxF == '%') {
                zzXOd();
            } else {
                if (cZzxF > ' ') {
                    return cZzxF;
                }
                if (cZzxF == '\n' || cZzxF == '\r') {
                    zzXc(cZzxF);
                } else if (cZzxF != ' ' && cZzxF != '\t') {
                    zzgs(cZzxF);
                }
            }
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr2 = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxF = cArr2[i2];
            } else {
                cZzxF = zzxF(zzXNQ());
            }
        }
    }

    private char zzXOf() throws zzZQS {
        char cZzxF;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxF = cArr[i];
            } else {
                cZzxF = zzxF(zzXNQ());
            }
            if (cZzxF != '%') {
                return cZzxF;
            }
            zzXOd();
        }
    }

    private char zzXOg() throws zzZQS {
        char c;
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            c = cArr[i];
        } else {
            int iZzXMl = zzXMl();
            if (iZzXMl < 0) {
                return (char) 0;
            }
            this.zzWMi++;
            c = (char) iZzXMl;
        }
        if (c == 0) {
            zzXMn();
        }
        return c;
    }

    private void zzXOj() throws Throwable {
        this.zzWNe.zzU(this.zzWLX, this.zzWMi - 1);
        this.zzWNe.zzXOt();
        char cZzXNY = zzXNY();
        if (cZzXNY == '?') {
            this.zzWNe.zzgW(this.zzWMi);
            this.zzWNe.zzy3("<?");
            zzXOb();
            return;
        }
        if (cZzXNY != '!') {
            zzf(cZzXNY, zzZH9.zzWPj);
        }
        char cZzXNY2 = zzXNY();
        if (cZzXNY2 == '-') {
            char cZzXNY3 = zzXNY();
            if (cZzXNY3 != '-') {
                zzf(cZzXNY3, "; expected '-' for a comment");
            }
            zzZGI zzzgi = this.zzWNe;
            boolean z = zzzgi.zzWNN;
            if (z) {
                zzzgi.zzgW(this.zzWMi);
                this.zzWNe.zzy3("<!--");
            }
            try {
                zzXNU();
                if (z) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (!z) {
                    this.zzWNe.zzgW(this.zzWMi);
                }
            }
        }
        if (cZzXNY2 == '[') {
            zzZGI zzzgi2 = this.zzWNe;
            boolean z2 = zzzgi2.zzWNM;
            if (z2) {
                zzzgi2.zzgW(this.zzWMi);
                this.zzWNe.zzy3("<![");
            }
            try {
                zzXOa();
                if (z2) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (!z2) {
                    this.zzWNe.zzgW(this.zzWMi);
                }
            }
        }
        if (cZzXNY2 == 'E' && !this.zzWNe.zzWNL) {
            zzXO6();
            return;
        }
        if (cZzXNY2 < 'A' || cZzXNY2 > 'Z') {
            zzf(cZzXNY2, zzZH9.zzWPj);
            return;
        }
        this.zzWNe.zzgW(this.zzWMi);
        this.zzWNe.zzy3("<!");
        this.zzWNe.zzXx(cZzXNY2);
        zzXs(cZzXNY2);
    }

    private void zzXOk() throws zzZQS {
        char cZzXNY = zzXNY();
        if (cZzXNY == '?') {
            zzXOb();
            return;
        }
        if (cZzXNY != '!') {
            zzf(cZzXNY, "; expected '!' to start a directive");
        }
        char cZzXNY2 = zzXNY();
        if (cZzXNY2 != '-') {
            if (cZzXNY2 == '[') {
                zzXOa();
                return;
            } else if (cZzXNY2 < 'A' || cZzXNY2 > 'Z') {
                zzf(cZzXNY2, zzZH9.zzWPj);
                return;
            } else {
                zzXs(cZzXNY2);
                return;
            }
        }
        char cZzXNY3 = zzXNY();
        if (cZzXNY3 != '-') {
            zzf(cZzXNY3, "; expected '-' for a comment");
        }
        zzZGV zzzgv = this.zzWNd;
        if (zzzgv == null || !zzzgv.zzXOH()) {
            zzXNU();
        } else {
            zzZ(this.zzWNd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzZGN zzXOl() throws Throwable {
        while (true) {
            boolean z = false;
            this.zzWNi = false;
            int iZzXMk = zzXMk();
            if (iZzXMk < 0) {
                if (this.zzmO) {
                    break;
                }
                zzxH(" in internal DTD subset");
                if (iZzXMk != 37) {
                }
            } else if (iZzXMk != 37) {
                zzXOd();
            } else {
                long j = this.zzWLW;
                int i = this.zzWMi;
                this.zzWKC = j + ((long) i);
                this.zzWKB = this.zzWLV;
                this.zzWKA = i - this.zzWLU;
                if (iZzXMk == 60) {
                    if (!this.zzmO && this.zzWKK == this.zzWKJ) {
                        z = true;
                    }
                    this.zzWNi = z;
                    if (this.zzWNe == null) {
                        zzXOk();
                    } else {
                        zzXOj();
                    }
                } else {
                    if (iZzXMk == 93) {
                        int i2 = this.zzWNj;
                        if (i2 == 0 && !this.zzmO) {
                            break;
                        }
                        if (i2 > 0) {
                            zzZGI zzzgi = this.zzWNe;
                            boolean z2 = (zzzgi == null || zzzgi.zzWNM) ? false : true;
                            if (z2) {
                                zzzgi.zzU(this.zzWLX, i - 1);
                                this.zzWNe.zzXOt();
                            }
                            try {
                                char cZzXNY = zzXNY();
                                if (cZzXNY == ']' && (cZzXNY = zzXNY()) == '>') {
                                    this.zzWNj--;
                                    if (z2) {
                                        this.zzWNe.zzgW(this.zzWMi);
                                    }
                                } else {
                                    zzf(cZzXNY, "; expected ']]>' to close conditional include section");
                                }
                            } finally {
                                if (z2) {
                                    this.zzWNe.zzgW(this.zzWMi);
                                }
                            }
                        }
                    }
                    if (this.zzmO) {
                        zzf(iZzXMk, "; expected a '<' to start a directive");
                    }
                    zzf(iZzXMk, "; expected a '<' to start a directive, or \"]>\" to end internal subset");
                }
            }
        }
        int i3 = this.zzWNj;
        if (i3 > 0) {
            zzxH(zzXNQ() + "; expected closing marker for " + (i3 == 1 ? "an INCLUDE block" : C21023OooO0Oo.OooO0OO(" INCLUDE blocks", this.zzWNj, new StringBuilder())));
        }
        HashMap<String, zzZQY> map = this.zzWNq;
        if (map != null && map.size() > 0) {
            zzXO7();
        }
        if (this.zzmO) {
            return zzZGM.zzZ((this.zzWNt || this.zzWNr) ? false : true, this.zzWOk, this.zzWOi, null, this.zzWOg, this.zzWOf, this.zzWNo, this.zzWNx);
        }
        return zzZGM.zzZ(false, this.zzWOk, null, this.zzWNw, null, this.zzWOf, this.zzWNo, this.zzWNx);
    }

    private zzZDU zzXOm() {
        zzZDU zzzdu = this.zzWNc;
        if (zzzdu == null) {
            zzZDU zzzduZzXLt = zzZDU.zzXLt();
            this.zzWNc = zzzduZzXLt;
            zzzduZzXLt.zzXLr();
        } else {
            zzzdu.zzXLs();
        }
        return this.zzWNc;
    }

    private zzZDZ zzXQ(String str, String str2) {
        HashMap<zzZDZ, zzZDZ> map = this.zzWNp;
        if (map == null) {
            map = new HashMap<>();
            this.zzWNp = map;
        } else {
            zzZDZ zzzdz = this.zzWNb;
            zzzdz.zzXw(str, str2);
            zzZDZ zzzdz2 = map.get(zzzdz);
            if (zzzdz2 != null) {
                return zzzdz2;
            }
        }
        zzZDZ zzzdz3 = new zzZDZ(str, str2);
        map.put(zzzdz3, zzzdz3);
        return zzzdz3;
    }

    private void zzXs(char c) throws zzZQS {
        String strZzy0;
        this.zzWKI = 1;
        try {
            if (c == 'A') {
                String strZzy1 = zzy1("TTLIST");
                if (strZzy1 == null) {
                    this.zzWNh = "ATTLIST";
                    zzXO5();
                } else {
                    strZzy0 = C18385v2.f56336h.concat(strZzy1);
                    zzxZ(strZzy0);
                }
            } else if (c == 'E') {
                char cZzXNY = zzXNY();
                if (cZzXNY == 'N') {
                    String strZzy12 = zzy1("TITY");
                    if (strZzy12 == null) {
                        this.zzWNh = "ENTITY";
                        zzP5(false);
                    } else {
                        strZzy0 = "EN".concat(strZzy12);
                        zzxZ(strZzy0);
                    }
                } else {
                    if (cZzXNY == 'L') {
                        String strZzy13 = zzy1("EMENT");
                        if (strZzy13 == null) {
                            this.zzWNh = "ELEMENT";
                            zzXO4();
                        } else {
                            strZzy0 = "EL".concat(strZzy13);
                        }
                    } else {
                        strZzy0 = zzy0("E");
                    }
                    zzxZ(strZzy0);
                }
            } else if (c == 'N') {
                String strZzy14 = zzy1("OTATION");
                if (strZzy14 == null) {
                    this.zzWNh = "NOTATION";
                    zzXO3();
                } else {
                    strZzy0 = "N".concat(strZzy14);
                    zzxZ(strZzy0);
                }
            } else {
                if (c == 'T' && this.zzWNy) {
                    String strZzy15 = zzy1("ARGETNS");
                    if (strZzy15 == null) {
                        this.zzWNh = "TARGETNS";
                        zzXO2();
                    } else {
                        strZzy0 = "T".concat(strZzy15);
                    }
                } else {
                    strZzy0 = zzy0(String.valueOf(c));
                }
                zzxZ(strZzy0);
            }
            if (this.zzWKK.getScopeId() > 0) {
                zzX(this.zzWKK);
            }
            this.zzWKI = 0;
            this.zzWNh = null;
        } catch (Throwable th) {
            this.zzWKI = 0;
            this.zzWNh = null;
            throw th;
        }
    }

    private zzZDZ zzXt(char c) throws zzZQS {
        String strZzXb;
        String str = null;
        if (this.zzWKN) {
            strZzXb = zzXb(c);
            char cZzXOg = zzXOg();
            if (cZzXOg != 0) {
                if (cZzXOg == ':') {
                    str = strZzXb;
                    strZzXb = zzXb(zzXNY());
                } else {
                    this.zzWMi--;
                }
            }
        } else {
            strZzXb = zzXa(c);
        }
        return zzXQ(str, strZzXb);
    }

    private String zzXu(char c) throws zzZQS {
        char[] cArrZzgp = zzgp(64);
        int length = cArrZzgp.length;
        int i = 0;
        while (true) {
            if (zzXm(c) || c == ':') {
                if (i >= length) {
                    cArrZzgp = zzZER.zzJ(cArrZzgp);
                    length = cArrZzgp.length;
                }
                int i2 = i + 1;
                cArrZzgp[i] = c;
                int i3 = this.zzWMi;
                if (i3 < this.zzWMh) {
                    char[] cArr = this.zzWLX;
                    this.zzWMi = i3 + 1;
                    c = cArr[i3];
                    i = i2;
                } else {
                    c = zzXOg();
                    i = i2;
                    if (c == 0) {
                        break;
                    }
                }
            } else {
                if (i == 0) {
                    zzf(c, "; expected a NMTOKEN character to start a NMTOKEN");
                }
                this.zzWMi--;
            }
        }
        return new String(cArrZzgp, 0, i);
    }

    private String zzXv(char c) throws zzZQS {
        if (!zzXn(c)) {
            zzf(c, "; expected an identifier");
        }
        return zzXa(c);
    }

    private boolean zzXw(char c) throws zzZQS {
        String strZzy0;
        if (c == 'P') {
            String strZzy1 = zzy1("UBLIC");
            if (strZzy1 == null) {
                return true;
            }
            strZzy0 = "P".concat(strZzy1);
        } else if (c == 'S') {
            String strZzy12 = zzy1("YSTEM");
            if (strZzy12 == null) {
                return false;
            }
            strZzy0 = "S".concat(strZzy12);
        } else {
            if (!zzXn(c)) {
                zzf(c, "; expected 'PUBLIC' or 'SYSTEM' keyword");
            }
            strZzy0 = zzy0(String.valueOf(c));
        }
        zzV(C20593OooO0Oo.OooO0O0("Unrecognized keyword '", strZzy0, "'; expected 'PUBLIC' or 'SYSTEM'"), null, null);
        return false;
    }

    private zzZH4 zzY(zzZDZ zzzdz, boolean z) throws zzZQS {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            char cZzP6 = zzP6(true);
            if (cZzP6 == ')') {
                break;
            }
            if (cZzP6 == '|' || cZzP6 == ',') {
                boolean z4 = cZzP6 == '|';
                if (!z2) {
                    z2 = true;
                    z3 = z4;
                } else if (z3 != z4) {
                    zzxX("Can not mix content spec separators ('|' and ','); need to use parenthesis groups");
                }
                cZzP6 = zzP6(true);
            } else if (!arrayList.isEmpty()) {
                zzf(cZzP6, " (missing separator '|' or ','?)");
            }
            if (cZzP6 == '(') {
                arrayList.add(zzY(zzzdz, z));
            } else {
                if (cZzP6 == '|' || cZzP6 == ',') {
                    zzf(cZzP6, " (missing element name?)");
                }
                arrayList.add(z ? zzZG5.zzZ(zzXOc(), zzXt(cZzP6)) : zzZG5.zzXNO());
            }
        }
        if (arrayList.isEmpty()) {
            zzxX("Empty content specification for '" + zzzdz + "' (need at least one entry)");
        }
        char cZzXOc = zzXOc();
        if (!z) {
            return zzZG5.zzXNO();
        }
        if (arrayList.size() != 1) {
            return z3 ? zzZH7.zzZ(this.zzWKN, cZzXOc, arrayList) : zzZG9.zzY(this.zzWKN, cZzXOc, arrayList);
        }
        zzZH4 zzzh4 = (zzZH4) arrayList.get(0);
        char cZzXOW = zzzh4.zzXOW();
        if (cZzXOc != cZzXOW) {
            zzzh4.zzXy(zzM(cZzXOc, cZzXOW));
        }
        return zzzh4;
    }

    private static String zzYI(Object obj) {
        return C20485OooOoO.OooO0O0("Element <", obj, ">)");
    }

    public static zzZGN zzZ(zzZF3 zzzf3, zzZF1 zzzf1, zzZHC zzzhc, boolean z, int i) throws zzZQS {
        zzZGF zzzgf = new zzZGF(zzzf1, zzzhc, z, i);
        zzzgf.zzV(zzzf3);
        try {
            return zzzgf.zzXOl();
        } finally {
            zzzf3.zzV(zzzgf);
        }
    }

    private void zzf(int i, String str) throws zzZQS {
        if (str == null) {
            zzd(i, zzXNQ());
        }
        zzd(i, zzXNQ() + str);
    }

    private void zzgU(int i) throws zzZQS {
        if (i != 2) {
            zzxY(zzZH9.zzWPc);
        }
    }

    private void zzxX(String str) throws zzZQS {
        zzV(str, null, null);
    }

    private void zzxY(String str) throws zzZQS {
        if (this.zzWNx) {
            zzYS(str, 2);
        } else {
            zzYS(str, 1);
        }
    }

    private void zzxZ(String str) throws zzZQS {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("Unrecognized DTD directive '<!", str, " >'; expected ATTLIST, ELEMENT, ENTITY or NOTATION");
        if (this.zzWNy) {
            strOooO0O0 = C21111o0ooOoO.OooO0Oo(strOooO0O0, " (or, for DTD++, TARGETNS)");
        }
        zzV(strOooO0O0, null, null);
    }

    private String zzy0(String str) throws zzZQS {
        char cZzXOg;
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            int i = this.zzWMi;
            if (i >= this.zzWMh) {
                cZzXOg = zzXOg();
                if (cZzXOg == 0) {
                    break;
                }
            } else {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzXOg = cArr[i];
            }
            if (!zzXm(cZzXOg) && cZzXOg != ':') {
                this.zzWMi--;
                break;
            }
            sb.append(cZzXOg);
        }
        return sb.toString();
    }

    private String zzy1(String str) throws zzZQS {
        int length = str.length();
        char cZzXOg = ControlChar.SPACE_CHAR;
        int i = 0;
        while (i < length) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzXOg = cArr[i2];
            } else {
                cZzXOg = zzXOg();
                if (cZzXOg == 0) {
                    return str.substring(0, i);
                }
            }
            if (cZzXOg != str.charAt(i)) {
                break;
            }
            i++;
        }
        if (i == length) {
            cZzXOg = zzXOg();
            if (cZzXOg == 0) {
                return null;
            }
            if (!zzXm(cZzXOg)) {
                this.zzWMi--;
                return null;
            }
        }
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        sb.append(cZzXOg);
        while (true) {
            char cZzXOg2 = zzXOg();
            if (cZzXOg2 != 0) {
                if (!zzXm(cZzXOg2) && cZzXOg2 != ':') {
                    this.zzWMi--;
                    break;
                }
                sb.append(cZzXOg2);
            } else {
                break;
            }
        }
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzZGD, com.aspose.words.internal.zzZER
    public final zzZG3 zzI(String str, Object obj) {
        if (obj == zzWNz) {
            HashMap<String, zzZG3> map = this.zzWNv;
            zzZG3 zzzg3 = map == null ? null : map.get(str);
            if (zzzg3 != null) {
                this.zzWNt = true;
                this.zzWOg = null;
                return zzzg3;
            }
            HashMap<String, zzZG3> map2 = this.zzWNw;
            if (map2 != null && (zzzg3 = map2.get(str)) != null && !this.zzWNt) {
                Set hashSet = this.zzWOg;
                if (hashSet == null) {
                    hashSet = new HashSet();
                    this.zzWOg = hashSet;
                }
                hashSet.add(str);
            }
            return zzzg3;
        }
        if (obj != zzWNA) {
            throw new IllegalStateException(zzZH9.zzWPK);
        }
        HashMap<String, zzZG3> map3 = this.zzWNu;
        zzZG3 zzzg32 = map3 == null ? null : map3.get(str);
        if (zzzg32 != null) {
            this.zzWNt = true;
            this.zzWOi = null;
            return zzzg32;
        }
        HashMap<String, zzZG3> map4 = this.zzWOk;
        if (map4 != null && (zzzg32 = map4.get(str)) != null && !this.zzWNt) {
            if (this.zzWOi == null) {
                this.zzWOi = new HashSet();
            }
            this.zzWOi.add(str);
        }
        return zzzg32;
    }

    @Override // com.aspose.words.internal.zzZER
    public final boolean zzXOh() throws zzZQS {
        zzZGI zzzgi = this.zzWNe;
        if (zzzgi != null) {
            zzzgi.zzU(this.zzWLX, this.zzWMh);
        }
        long j = this.zzWLW;
        int i = this.zzWMh;
        this.zzWLW = j + ((long) i);
        this.zzWLU -= i;
        try {
            if (this.zzWKK.zzW(this) <= 0) {
                return false;
            }
            zzZGI zzzgi2 = this.zzWNe;
            if (zzzgi2 == null) {
                return true;
            }
            zzzgi2.zzWNJ = this.zzWMi;
            return true;
        } catch (IOException e) {
            zzZER.zzX(e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r0.zzWNJ = r6.zzWMi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r0 = r6.zzWNe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // com.aspose.words.internal.zzZER
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzXOi() throws zzZQS {
        zzZF1 zzzf1 = this.zzWKK;
        zzZGI zzzgi = this.zzWNe;
        if (zzzgi != null) {
            zzzgi.zzU(this.zzWLX, this.zzWMh);
        }
        while (true) {
            long j = this.zzWLW;
            int i = this.zzWMh;
            this.zzWLW = j + ((long) i);
            this.zzWLU -= i;
            try {
                if (zzzf1.zzW(this) > 0) {
                    break;
                }
                zzzf1.close();
                if (zzzf1 == this.zzWKJ) {
                    return false;
                }
                zzZF1 zzzf1ZzXN7 = zzzf1.zzXN7();
                if (zzzf1ZzXN7 == null) {
                    zzZER.zzXMh();
                }
                if (this.zzWKI != zzzf1.getScopeId()) {
                    zzY(zzzf1);
                }
                this.zzWKK = zzzf1ZzXN7;
                zzzf1ZzXN7.zzX(this);
                zzZGI zzzgi2 = this.zzWNe;
                if (zzzgi2 != null) {
                    zzzgi2.zzWNJ = this.zzWMi;
                }
                this.zzWKH = zzzf1ZzXN7.getScopeId();
                if (!this.zzWKF) {
                    this.zzWKF = !zzzf1ZzXN7.zzXNB();
                }
                if (this.zzWMi < this.zzWMh) {
                    return true;
                }
                zzzf1 = zzzf1ZzXN7;
            } catch (IOException e) {
                throw zzZER.zzY(e);
            }
        }
    }

    @Override // com.aspose.words.internal.zzZER
    public final boolean zzgV(int i) throws zzZQS {
        int i2 = this.zzWMh;
        int i3 = i2 - this.zzWMi;
        if (i3 >= i) {
            return true;
        }
        zzZGI zzzgi = this.zzWNe;
        if (zzzgi != null) {
            zzzgi.zzU(this.zzWLX, i2);
        }
        try {
            if (!this.zzWKK.zzZ(this, i)) {
                return false;
            }
            zzZGI zzzgi2 = this.zzWNe;
            if (zzzgi2 != null) {
                zzzgi2.zzWNJ = i3;
            }
            return true;
        } catch (IOException e) {
            zzZER.zzX(e);
            return false;
        }
    }

    @Override // com.aspose.words.internal.zzZGD, com.aspose.words.internal.zzZER
    public final void zzxW(String str) throws zzZQS {
        zzxY(C20593OooO0Oo.OooO0O0("Undeclared parameter entity '", str, "'."));
        if (this.zzWNm != null) {
            zzZF2 zzzf2ZzXMq = zzXMq();
            if (this.zzWNl) {
                this.zzWNm.zzX(str, zzzf2ZzXMq);
            } else {
                this.zzWNm.zzW(str, zzzf2ZzXMq);
            }
        }
    }

    @Override // com.aspose.words.internal.zzZGD
    public final zzZG3 zzy2(String str) {
        zzZG3 zzzg3;
        HashMap<String, zzZG3> map = this.zzWNu;
        return (map == null || (zzzg3 = map.get(str)) == null) ? this.zzWOk.get(str) : zzzg3;
    }

    private zzZGF(zzZF1 zzzf1, zzZHC zzzhc, zzZGN zzzgn, boolean z, int i) {
        this(zzzf1, zzzhc, true, zzzgn, z, i);
        zzzf1.zzZ(this, this.zzWKI, 0);
    }

    private zzZGF(zzZF1 zzzf1, zzZHC zzzhc, boolean z, zzZGN zzzgn, boolean z2, int i) {
        super(zzzf1, zzzhc, z);
        this.zzWNt = false;
        this.zzWNr = false;
        this.zzWNp = null;
        this.zzWNn = null;
        this.zzWNm = null;
        this.zzWNl = false;
        this.zzWNk = null;
        this.zzWNj = 0;
        this.zzWNi = false;
        this.zzWNg = false;
        this.zzWNf = "";
        this.zzYkm = null;
        this.zzWNe = null;
        this.zzWNc = null;
        this.zzWNb = new zzZDZ(null, null);
        this.zzWKx = i;
        this.zzWQ6 = zzzhc.zzXPo();
        int iZzXPQ = zzzhc.zzXPQ();
        this.zzWQl = iZzXPQ;
        this.zzWNy = (iZzXPQ & 524288) != 0;
        this.zzWNx = z2;
        this.zzWNt = false;
        this.zzWNw = null;
        this.zzWOg = null;
        this.zzWOi = null;
        this.zzWOk = null;
        HashMap<String, zzZG3> mapZzXOD = zzzgn == null ? null : zzzgn.zzXOD();
        if (mapZzXOD != null && !mapZzXOD.isEmpty()) {
            this.zzWNv = mapZzXOD;
        } else {
            this.zzWNv = null;
        }
        HashMap<String, zzZG3> mapZzXOF = zzzgn == null ? null : zzzgn.zzXOF();
        if (mapZzXOF != null && !mapZzXOF.isEmpty()) {
            this.zzWNu = mapZzXOF;
        } else {
            this.zzWNu = null;
        }
        HashMap<String, zzZQO> mapZzXOC = zzzgn == null ? null : zzzgn.zzXOC();
        if (mapZzXOC != null && !mapZzXOC.isEmpty()) {
            this.zzWNs = mapZzXOC;
        } else {
            this.zzWNs = null;
        }
        this.zzWNd = this.zzWML.zzXPn();
    }

    public static zzZGN zzZ(zzZF1 zzzf1, zzZHC zzzhc, zzZGN zzzgn, boolean z, int i) throws zzZQS {
        return new zzZGF(zzzf1, zzzhc, zzzgn, z, i).zzXOl();
    }

    @Override // com.aspose.words.internal.zzZER
    public final void zzZ(zzZF1 zzzf1, boolean z, String str) throws zzZQS {
        zzZGI zzzgi = this.zzWNe;
        if (zzzgi != null) {
            zzzgi.zzU(this.zzWLX, this.zzWMi);
            this.zzWNe.zzXOt();
            try {
                super.zzZ(zzzf1, z, str);
                return;
            } finally {
                this.zzWNe.zzgW(this.zzWMi);
            }
        }
        super.zzZ(zzzf1, z, str);
    }

    private void zzZ(zzZF1 zzzf1, String str, zzZQY zzzqy) throws zzZQS {
        boolean z = this.zzWKK == zzzf1;
        zzxB(zzXNQ());
        if (!z || this.zzWKK == zzzf1) {
            return;
        }
        zzV("Unterminated entity value for entity '" + str + "' (definition started at " + zzzqy + ")", null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[PHI: r5
      0x00b3: PHI (r5v7 boolean) = (r5v5 boolean), (r5v8 boolean) binds: [B:44:0x00b1, B:41:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private char[] zzZ(String str, zzZQY zzzqy, char c) throws zzZQS {
        int i;
        zzZF1 zzzf1 = this.zzWKK;
        zzZDU zzzduZzXLt = this.zzWNk;
        if (zzzduZzXLt == null) {
            zzzduZzXLt = zzZDU.zzXLt();
        }
        zzzduZzXLt.zzXLr();
        char[] cArrZzXLk = zzzduZzXLt.zzXLk();
        int iZzXLj = zzzduZzXLt.zzXLj();
        while (true) {
            if (this.zzWMi >= this.zzWMh) {
                zzZ(zzzf1, str, zzzqy);
            }
            char[] cArr = this.zzWLX;
            int i2 = this.zzWMi;
            this.zzWMi = i2 + 1;
            char c2 = cArr[i2];
            int i3 = 0;
            if (c2 < '?') {
                boolean z = true;
                if (c2 == c) {
                    if (this.zzWKK == zzzf1) {
                        break;
                    }
                } else if (c2 == '&') {
                    int iZzOX = zzOX(false);
                    if (iZzOX == 0) {
                        while (true) {
                            if (iZzXLj >= cArrZzXLk.length) {
                                cArrZzXLk = zzzduZzXLt.zzXLi();
                                iZzXLj = 0;
                            }
                            i = iZzXLj + 1;
                            cArrZzXLk[iZzXLj] = c2;
                            if (this.zzWMi >= this.zzWMh) {
                                zzZ(zzzf1, str, zzzqy);
                            }
                            char[] cArr2 = this.zzWLX;
                            int i4 = this.zzWMi;
                            this.zzWMi = i4 + 1;
                            c2 = cArr2[i4];
                            if (c2 == ';') {
                                break;
                            }
                            if (z) {
                                z = false;
                                if (!zzXn(c2)) {
                                    if (c2 != ':' || this.zzWKN) {
                                        if (z) {
                                            zzf(c2, "; expected entity name after '&'");
                                        }
                                        zzf(c2, "; expected semi-colon after entity name");
                                    }
                                }
                            } else if (!zzXm(c2)) {
                            }
                            iZzXLj = i;
                        }
                        iZzXLj = i;
                    } else if (iZzOX <= 65535) {
                        c2 = (char) iZzOX;
                    } else {
                        if (iZzXLj >= cArrZzXLk.length) {
                            cArrZzXLk = zzzduZzXLt.zzXLi();
                            iZzXLj = 0;
                        }
                        int i5 = iZzOX - 65536;
                        cArrZzXLk[iZzXLj] = (char) ((i5 >> 10) + 55296);
                        c2 = (char) ((i5 & 1023) + 56320);
                        iZzXLj++;
                    }
                } else if (c2 == '%') {
                    zzXOd();
                } else if (c2 < ' ') {
                    if (c2 == '\n') {
                        zzXMj();
                    } else if (c2 == '\r') {
                        if (zzXc(c2)) {
                            if (!this.zzWKF) {
                                if (iZzXLj >= cArrZzXLk.length) {
                                    cArrZzXLk = zzzduZzXLt.zzXLi();
                                    iZzXLj = 0;
                                }
                                cArrZzXLk[iZzXLj] = c2;
                                iZzXLj++;
                            }
                        } else if (this.zzWKF) {
                        }
                        c2 = '\n';
                    } else if (c2 != '\t') {
                        zzgs(c2);
                    }
                }
            }
            if (iZzXLj >= cArrZzXLk.length) {
                cArrZzXLk = zzzduZzXLt.zzXLi();
            } else {
                i3 = iZzXLj;
            }
            iZzXLj = i3 + 1;
            cArrZzXLk[i3] = c2;
        }
        zzzduZzXLt.zzge(iZzXLj);
        char cZzP6 = zzP6(true);
        if (cZzP6 != '>') {
            zzf(cZzP6, "; expected closing '>' after ENTITY declaration");
        }
        char[] cArrZzXLo = zzzduZzXLt.zzXLo();
        this.zzWNk = zzzduZzXLt;
        return cArrZzXLo;
    }

    @Override // com.aspose.words.internal.zzZGD, com.aspose.words.internal.zzZER
    public final void zzY(zzZF1 zzzf1) throws zzZQS {
        if (zzzf1.getScopeId() == 0) {
            zzxX(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzZ(zzzf1), ": Incomplete PE: has to fully contain a declaration (as per xml 1.0.3, section 2.8, WFC 'PE Between Declarations')"));
        } else if (this.zzWNx) {
            zzxY(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzZ(zzzf1), ": Incomplete PE: has to be fully contained in a declaration (as per xml 1.0.3, section 2.8, VC 'Proper Declaration/PE Nesting')"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZGH zzzgh, char c, zzZDZ zzzdz, zzZQY zzzqy, boolean z) throws zzZQS {
        int i;
        int iZzOX;
        String str;
        if (c != '\"' && c != '\'') {
            if (!z) {
                str = "; expected a single or double quote to enclose the default value, or one of keywords (#REQUIRED, #IMPLIED, #FIXED)";
            } else {
                str = "; expected a single or double quote to enclose the default value";
            }
            zzf(c, str + " (for attribute '" + zzzdz + "')");
        }
        zzZF1 zzzf1 = this.zzWKK;
        zzZDU zzzduZzXLt = this.zzWNk;
        if (zzzduZzXLt == null) {
            zzzduZzXLt = zzZDU.zzXLt();
        }
        zzzduZzXLt.zzXLr();
        char[] cArrZzXLk = zzzduZzXLt.zzXLk();
        int length = cArrZzXLk.length;
        int i2 = 0;
        while (true) {
            if (this.zzWMi >= this.zzWMh) {
                boolean z2 = this.zzWKK == zzzf1;
                zzxB(zzXNQ());
                if (z2 && this.zzWKK != zzzf1) {
                    zzV("Unterminated attribute default value for attribute '" + zzzdz + "' (definition started at " + zzzqy + ")", null, null);
                }
            }
            char[] cArr = this.zzWLX;
            int i3 = this.zzWMi;
            this.zzWMi = i3 + 1;
            char c2 = cArr[i3];
            if (c2 < '?') {
                if (c2 <= ' ') {
                    if (c2 == '\n') {
                        zzXMj();
                    } else if (c2 == '\r') {
                        if (zzxF(" in attribute default value") != '\n') {
                            this.zzWMi--;
                        }
                        zzXMj();
                    } else if (c2 != ' ' && c2 != '\t') {
                        zzgs(c2);
                    }
                    c2 = ' ';
                } else if (c2 == c) {
                    if (this.zzWKK == zzzf1) {
                        zzzduZzXLt.zzge(i2);
                        zzzgh.setValue(zzzduZzXLt.zzXLp());
                        this.zzWNk = zzzduZzXLt;
                        return;
                    }
                } else {
                    if (c2 == '&') {
                        if (zzXMm() >= 3) {
                            iZzOX = zzXMg();
                        } else {
                            iZzOX = zzOX(true);
                        }
                        if (iZzOX == 0) {
                            String strZzX9 = zzX9(zzxF(" in entity reference"));
                            try {
                                this.zzWNm = zzzgh;
                                this.zzWNl = false;
                                zzZ(strZzX9, false, (Object) zzWNA);
                            } finally {
                                this.zzWNm = null;
                            }
                        } else {
                            i = 0;
                            if (c2 > 65535) {
                                if (iZzOX <= 65535) {
                                    c2 = (char) iZzOX;
                                } else {
                                    if (i2 >= cArrZzXLk.length) {
                                        cArrZzXLk = zzzduZzXLt.zzXLi();
                                        i2 = 0;
                                    }
                                    int i4 = iZzOX - 65536;
                                    cArrZzXLk[i2] = (char) ((i4 >> 10) + 55296);
                                    i2++;
                                    c2 = (char) ((i4 & 1023) + 56320);
                                }
                            }
                        }
                    } else {
                        i = 0;
                        if (c2 == '<') {
                            zzf(c2, " in attribute default value");
                        }
                    }
                    if (i2 >= length) {
                        cArrZzXLk = zzzduZzXLt.zzXLi();
                        length = cArrZzXLk.length;
                        i2 = i;
                    }
                    cArrZzXLk[i2] = c2;
                    i2++;
                }
            }
            i = 0;
            if (i2 >= length) {
            }
            cArrZzXLk[i2] = c2;
            i2++;
        }
    }

    private void zzZ(zzZGV zzzgv) throws zzZQS {
        char cZzXNY;
        char c;
        zzZDU zzzduZzXOm = zzXOm();
        char[] cArrZzXLk = zzzduZzXOm.zzXLk();
        int i = 0;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzXNY = cArr[i2];
            } else {
                cZzXNY = zzXNY();
            }
            if (cZzXNY < ' ') {
                c = '\n';
                if (cZzXNY == '\n' || cZzXNY == '\r') {
                    zzXc(cZzXNY);
                    cZzXNY = c;
                } else if (cZzXNY != '\t') {
                    zzgs(cZzXNY);
                }
            } else {
                c = '-';
                if (cZzXNY == '-') {
                    if (zzXNY() == '-') {
                        break;
                    }
                    this.zzWMi--;
                    cZzXNY = c;
                }
            }
            if (i >= cArrZzXLk.length) {
                cArrZzXLk = zzzduZzXOm.zzXLi();
                i = 0;
            }
            cArrZzXLk[i] = cZzXNY;
            i++;
        }
        if (zzXNY() != '>') {
            zzV(zzZH9.zzWPz, null, null);
        }
        zzzduZzXOm.zzge(i);
        zzzduZzXOm.zzXLn();
    }

    private void zzZ(String str, zzZGZ zzzgz, zzZDZ zzzdz) throws zzZQS {
        zzxX(OooOOO.OooO0O0(new StringBuilder(), zzZ(zzzgz, zzzdz), ": ", str));
    }

    private static String zzZ(Object obj, zzZDZ zzzdz) {
        return "Attribute '" + zzzdz + "' (of element <" + obj + ">)";
    }

    private static String zzZ(zzZF1 zzzf1) {
        return "Entity &" + zzzf1.zzXN6() + ";";
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZGZ zzzgz, char c, zzZQY zzzqy) throws zzZQS {
        int i;
        zzZDR zzzdrZzZ;
        zzZGH zzzgh;
        int i2;
        char cZzXOe;
        zzZGH zzzghZzXOp;
        zzZGF zzzgf;
        zzZGH zzzgh2;
        zzZH1 zzzh1ZzZ;
        zzZGH zzzghZzXOs;
        zzZDZ zzzdzZzXt = zzXt(c);
        char cZzXOe2 = zzXOe();
        int i3 = 1;
        if (cZzXOe2 == '(') {
            zzzdrZzZ = zzZ(zzzgz, zzzdzZzXt, false);
        } else {
            String strZzXv = zzXv(cZzXOe2);
            char cCharAt = strZzXv.charAt(0);
            if (cCharAt == 'C') {
                if (strZzXv != "CDATA") {
                }
                i = 0;
                zzzdrZzZ = null;
                zzzgh = null;
                cZzXOe = zzXOe();
                if (cZzXOe != '#') {
                }
                zzzgh2 = zzzghZzXOp;
                if (i != 2) {
                }
                if (zzzdzZzXt.zzW(zzzgf.zzWKN, "space")) {
                }
                if (!zzzgf.zzWKN) {
                }
                if (zzzh1ZzZ != null) {
                }
            } else {
                if (cCharAt == 'E') {
                    if (strZzXv == "ENTITY") {
                        i2 = 5;
                    } else if (strZzXv == "ENTITIES") {
                        i2 = 6;
                    }
                    i = i2;
                    zzzdrZzZ = null;
                    zzzgh = null;
                } else if (cCharAt != 'I') {
                    if (cCharAt == 'N') {
                        if (strZzXv == "NOTATION") {
                            char cZzXOe3 = zzXOe();
                            if (cZzXOe3 != '(') {
                                zzf(cZzXOe3, "Excepted '(' to start the list of NOTATION ids");
                            }
                            zzzdrZzZ = zzZ(zzzgz, zzzdzZzXt, true);
                            i3 = 7;
                        } else {
                            if (strZzXv == "NMTOKEN") {
                                i2 = 8;
                            } else if (strZzXv == "NMTOKENS") {
                                i2 = 9;
                            }
                            i = i2;
                            zzzdrZzZ = null;
                            zzzgh = null;
                        }
                    }
                } else if (strZzXv == "ID") {
                    zzzdrZzZ = null;
                    zzzgh = null;
                    i = 2;
                } else {
                    if (strZzXv == "IDREF") {
                        i2 = 3;
                    } else if (strZzXv == "IDREFS") {
                        i2 = 4;
                    }
                    i = i2;
                    zzzdrZzZ = null;
                    zzzgh = null;
                }
                cZzXOe = zzXOe();
                if (cZzXOe != '#') {
                    String strZzXv2 = zzXv(zzXOf());
                    if (strZzXv2 == "REQUIRED") {
                        zzzghZzXOs = zzZGH.zzXOr();
                    } else if (strZzXv2 == "IMPLIED") {
                        zzzghZzXOs = zzZGH.zzXOs();
                    } else if (strZzXv2 == "FIXED") {
                        zzzghZzXOp = zzZGH.zzXOq();
                        zzzgf = this;
                        zzzgf.zzZ(zzzghZzXOp, zzXOe(), zzzdzZzXt, zzzqy, true);
                    } else {
                        zzZ("Unrecognized attribute default value directive #" + strZzXv2 + zzZH9.zzWPh, zzzgz, zzzdzZzXt);
                        zzZGH zzzgh3 = zzzgh;
                        zzzgf = this;
                        zzzqy = zzzqy;
                        zzzgh2 = zzzgh3;
                        if (i != 2 && zzzgh2.zzXOP()) {
                            if (zzzgf.zzWNx) {
                                zzZ("has type ID; can not have a default (or #FIXED) value (XML 1.0/#3.3.1)", zzzgz, zzzdzZzXt);
                            }
                        } else if (zzzgf.zzWML.zzXPL() && zzzdzZzXt.zzW(zzzgf.zzWKN, "id")) {
                            zzgU(i);
                        }
                        if (zzzdzZzXt.zzW(zzzgf.zzWKN, "space")) {
                            zzZ(i, zzzdrZzZ);
                        }
                        if (!zzzgf.zzWKN && zzzdzZzXt.zzXLC()) {
                            if (!zzzgh2.zzXOP()) {
                                return;
                            } else {
                                zzzh1ZzZ = zzzgz.zzZ(zzzdzZzXt, i, zzzgh2);
                            }
                        } else {
                            zzZGF zzzgf2 = zzzgf;
                            zzzh1ZzZ = zzzgz.zzZ(zzzgf2, zzzdzZzXt, i, zzzgh2, zzzdrZzZ, zzzgf.zzWNx);
                            zzzgf = zzzgf2;
                            zzzdzZzXt = zzzdzZzXt;
                        }
                        if (zzzh1ZzZ != null) {
                            zzZQU zzzquZzXPv = zzzgf.zzWML.zzXPv();
                            if (zzzquZzXPv != null) {
                                zzZ(zzzquZzXPv, zzZH9.zzWPU, MessageFormat.format(zzZH9.zzWPL, zzzdzZzXt, zzzgz), zzzqy);
                                return;
                            }
                            return;
                        }
                        if (zzzgh2.zzXOP()) {
                            zzzh1ZzZ.zzXOO();
                            if (zzzgf.zzWNx) {
                                zzzh1ZzZ.zzZ(this);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    zzzgf = this;
                    zzzgh2 = zzzghZzXOs;
                    if (i != 2) {
                        if (zzzgf.zzWML.zzXPL()) {
                            zzgU(i);
                        }
                    }
                    if (zzzdzZzXt.zzW(zzzgf.zzWKN, "space")) {
                    }
                    if (!zzzgf.zzWKN) {
                        zzZGF zzzgf22 = zzzgf;
                        zzzh1ZzZ = zzzgz.zzZ(zzzgf22, zzzdzZzXt, i, zzzgh2, zzzdrZzZ, zzzgf.zzWNx);
                        zzzgf = zzzgf22;
                        zzzdzZzXt = zzzdzZzXt;
                    }
                    if (zzzh1ZzZ != null) {
                    }
                } else {
                    zzzghZzXOp = zzZGH.zzXOp();
                    zzzgf = this;
                    zzzgf.zzZ(zzzghZzXOp, cZzXOe, zzzdzZzXt, zzzqy, false);
                    zzzqy = zzzqy;
                }
                zzzgh2 = zzzghZzXOp;
                if (i != 2) {
                }
                if (zzzdzZzXt.zzW(zzzgf.zzWKN, "space")) {
                }
                if (!zzzgf.zzWKN) {
                }
                if (zzzh1ZzZ != null) {
                }
            }
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Unrecognized attribute type '", strZzXv, "'");
            sbOooO0o0.append(zzZH9.zzWPi);
            zzZ(sbOooO0o0.toString(), zzzgz, zzzdzZzXt);
            i = 0;
            zzzdrZzZ = null;
            zzzgh = null;
            cZzXOe = zzXOe();
            if (cZzXOe != '#') {
            }
            zzzgh2 = zzzghZzXOp;
            if (i != 2) {
            }
            if (zzzdzZzXt.zzW(zzzgf.zzWKN, "space")) {
            }
            if (!zzzgf.zzWKN) {
            }
            if (zzzh1ZzZ != null) {
            }
        }
        i = i3;
        zzzgh = null;
        cZzXOe = zzXOe();
        if (cZzXOe != '#') {
        }
        zzzgh2 = zzzghZzXOp;
        if (i != 2) {
        }
        if (zzzdzZzXt.zzW(zzzgf.zzWKN, "space")) {
        }
        if (!zzzgf.zzWKN) {
        }
        if (zzzh1ZzZ != null) {
        }
    }

    private zzZDR zzZ(zzZGZ zzzgz, zzZDZ zzzdz, boolean z) throws zzZQS {
        HashMap<String, String> map;
        String strZzZ;
        String strZzZ2;
        TreeSet treeSet = new TreeSet();
        char cZzP6 = zzP6(true);
        if (cZzP6 == ')') {
            zzf(cZzP6, " (empty list; missing identifier(s))?");
        }
        if (z) {
            map = null;
        } else {
            map = this.zzWNn;
            if (map == null && !z) {
                map = new HashMap<>();
                this.zzWNn = map;
            }
        }
        if (z) {
            strZzZ = zzZ(cZzP6, zzzgz.zzWOA);
        } else {
            strZzZ = zzZ(cZzP6, map);
        }
        treeSet.add(strZzZ);
        while (true) {
            char cZzP62 = zzP6(true);
            if (cZzP62 != ')') {
                if (cZzP62 != '|') {
                    zzf(cZzP62, "; missing '|' separator?");
                }
                char cZzP63 = zzP6(true);
                if (z) {
                    strZzZ2 = zzZ(cZzP63, zzzgz.zzWOA);
                } else {
                    strZzZ2 = zzZ(cZzP63, map);
                }
                if (!treeSet.add(strZzZ2) && this.zzWNx) {
                    zzZ(C20593OooO0Oo.OooO0O0("Duplicate enumeration value '", strZzZ2, "'"), zzzgz, zzzdz);
                }
            } else {
                return zzZDR.zzZ(treeSet);
            }
        }
    }

    private String zzZ(char c, zzZQY zzzqy) throws zzZQS {
        zzZQO zzzqo;
        String strZzXv = zzXv(c);
        HashMap<String, zzZQO> map = this.zzWNs;
        if (map != null && (zzzqo = map.get(strZzXv)) != null) {
            this.zzWNr = true;
            return zzzqo.getName();
        }
        HashMap<String, zzZQO> map2 = this.zzWOf;
        zzZQO zzzqo2 = map2 == null ? null : map2.get(strZzXv);
        if (zzzqo2 == null) {
            if (this.zzWNx) {
                if (this.zzWNq == null) {
                    this.zzWNq = new LinkedHashMap();
                }
                this.zzWNq.put(strZzXv, zzzqy);
            }
            return strZzXv;
        }
        return zzzqo2.getName();
    }

    private String zzZ(char c, HashMap<String, String> map) throws zzZQS {
        String strZzXu = zzXu(c);
        String str = map.get(strZzXu);
        if (str != null) {
            return str;
        }
        map.put(strZzXu, strZzXu);
        return strZzXu;
    }

    private zzZG6 zzZ(zzZDZ zzzdz, boolean z) throws zzZQS {
        char cZzxF;
        String strZzy1 = zzy1("PCDATA");
        if (strZzy1 != null) {
            zzxX(C20593OooO0Oo.OooO0O0("Unrecognized directive #", strZzy1, "'; expected #PCDATA (or element name)"));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            char cZzP6 = zzP6(true);
            if (cZzP6 == ')') {
                break;
            }
            if (cZzP6 == '|') {
                cZzP6 = zzP6(true);
            } else if (cZzP6 == ',') {
                zzf(cZzP6, " (sequences not allowed within mixed content)");
            } else if (cZzP6 == '(') {
                zzf(cZzP6, " (sub-content specs not allowed within mixed content)");
            } else {
                zzf(cZzP6, "; expected either '|' to separate elements, or ')' to close the list");
            }
            zzZDZ zzzdzZzXt = zzXt(cZzP6);
            if (linkedHashMap.put(zzzdzZzXt, zzZG5.zzZ(ControlChar.SPACE_CHAR, zzzdzZzXt)) != null && this.zzWNx) {
                zzJ("duplicate child element <" + zzzdzZzXt + "> in mixed content model", zzzdz);
            }
        }
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzxF = cArr[i];
        } else {
            cZzxF = zzxF(zzXNQ());
        }
        if (cZzxF != '*') {
            if (linkedHashMap.size() > 0) {
                zzxX("Missing trailing '*' after a non-empty mixed content specification");
            }
            this.zzWMi--;
        }
        if (!z) {
            return null;
        }
        if (linkedHashMap.isEmpty()) {
            return zzZGG.zzXOn();
        }
        zzZH7 zzzh7ZzZ = zzZH7.zzZ(this.zzWKN, (Collection<zzZH4>) linkedHashMap.values());
        zzZG6 zzzg6ZzXP2 = zzzh7ZzZ.zzXP2();
        return zzzg6ZzXP2 == null ? new zzZH2(zzZH3.zzZ(zzzh7ZzZ)) : zzzg6ZzXP2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzZG3 zzZ(zzZF1 zzzf1, boolean z, String str, char c, zzZQY zzzqy) throws zzZQS {
        char cZzXOe;
        String str2;
        char cZzP6;
        zzZQY zzzqy2;
        String str3;
        String strZzZ = null;
        if (zzXw(c)) {
            char cZzXOe2 = zzXOe();
            if (cZzXOe2 != '\"' && cZzXOe2 != '\'') {
                zzf(cZzXOe2, "; expected a quote to start the public identifier");
            }
            String strZzW = zzW(cZzXOe2, zzXNQ());
            cZzXOe = zzXOf();
            if (cZzXOe <= ' ') {
                cZzXOe = zzP6(true);
            } else if (cZzXOe != '>') {
                this.zzWMi--;
                cZzXOe = zzXOe();
            }
            if (cZzXOe == '>') {
                zzxX("Unexpected end of ENTITY declaration (expected a system id after public id): trying to use an SGML DTD instead of XML one?");
            }
            str2 = strZzW;
        } else {
            cZzXOe = zzXOe();
            str2 = null;
        }
        if (cZzXOe != '\"' && cZzXOe != '\'') {
            zzf(cZzXOe, "; expected a quote to start the system identifier");
        }
        String strZzZ2 = zzZ(cZzXOe, this.zzWKF, zzXNQ());
        try {
            if (z) {
                cZzP6 = zzP6(true);
            } else {
                int iZzXMl = zzXMl();
                if (iZzXMl == 62) {
                    this.zzWMi++;
                    cZzP6 = '>';
                } else {
                    if (iZzXMl < 0) {
                        cZzP6 = zzP6(true);
                    } else if (iZzXMl == 37) {
                        cZzP6 = zzXOf();
                    } else {
                        this.zzWMi++;
                        char c2 = (char) iZzXMl;
                        if (!zzZF3.isSpaceChar(c2)) {
                            zzf(c2, "; expected a separating space or closing '>'");
                        }
                        cZzP6 = zzP6(true);
                    }
                    str3 = strZzZ;
                    if (cZzP6 != '>') {
                        zzf(cZzP6, "; expected closing '>'");
                    }
                    URL urlZzXNH = zzzf1.zzXNH();
                    if (str3 == null) {
                        return new zzZG0(zzzqy2, str, urlZzXNH, str2, strZzZ2);
                    }
                    return new zzZFZ(zzzqy, str, urlZzXNH, str2, strZzZ2, str3);
                }
                if (cZzP6 != '>') {
                    if (!zzXn(cZzP6)) {
                        zzf(cZzP6, "; expected either NDATA keyword, or closing '>'");
                    }
                    String strZzy1 = zzy1("DATA");
                    if (strZzy1 != null) {
                        zzxX(C20593OooO0Oo.OooO0O0("Unrecognized keyword '", strZzy1, "'; expected NOTATION (or closing '>')"));
                    }
                    zzzqy2 = zzzqy;
                    strZzZ = zzZ(zzXOe(), zzzqy2);
                    cZzP6 = zzP6(true);
                }
                str3 = strZzZ;
                if (cZzP6 != '>') {
                }
                URL urlZzXNH2 = zzzf1.zzXNH();
                if (str3 == null) {
                }
            }
            URL urlZzXNH22 = zzzf1.zzXNH();
            if (str3 == null) {
            }
        } catch (IOException e) {
            throw new zzZFU(e);
        }
        zzzqy2 = zzzqy;
        str3 = strZzZ;
        if (cZzP6 != '>') {
        }
    }

    private void zzZ(int i, zzZDR zzzdr) throws zzZQS {
        boolean z = false;
        boolean z2 = i == 1;
        if (z2) {
            int size = zzzdr.size();
            if (size == 1 ? zzzdr.zzwU("preserve") != null || zzzdr.zzwU("default") != null : size == 2 && zzzdr.zzwU("preserve") != null && zzzdr.zzwU("default") != null) {
                z = true;
            }
        } else {
            z = z2;
        }
        if (z) {
            return;
        }
        zzxY(zzZH9.zzWPd);
    }

    private static void zzZ(zzZQU zzzqu, String str, String str2, zzZQY zzzqy) throws zzZQS {
        if (zzzqu != null) {
            new zzYF8(zzzqy, str2, 1, str);
        }
    }
}
