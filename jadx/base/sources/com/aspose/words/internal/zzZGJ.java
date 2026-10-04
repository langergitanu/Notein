package com.aspose.words.internal;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZGJ extends zzYF6 implements zzZEU {
    protected zzZGZ[] zzWNU;
    protected boolean zzWNW;
    final Map<String, zzZG3> zzWNX;
    final Map<zzZDZ, zzZGZ> zzWNY;
    final zzYFC zzWNZ;
    final zzZGN zzWO0;
    final boolean zzWOl;
    protected static final HashMap<zzZDZ, zzZH1> zzWO2 = new HashMap<>();
    protected static final HashMap<String, zzZG3> zzWO1 = new HashMap<>();
    protected zzZGZ zzWNV = null;
    protected int zzWNT = 0;
    protected HashMap<zzZDZ, zzZH1> zzWNS = null;
    protected zzZH1[] zzWNR = new zzZH1[16];
    protected int zzWZQ = 0;
    protected int zzWNQ = -1;
    protected final transient zzZDZ zzWNP = new zzZDZ(null, null);
    char[] zzWNO = null;

    public zzZGJ(zzZGN zzzgn, zzYFC zzyfc, boolean z, Map<zzZDZ, zzZGZ> map, Map<String, zzZG3> map2) {
        this.zzWNU = null;
        this.zzWO0 = zzzgn;
        this.zzWNZ = zzyfc;
        this.zzWOl = z;
        if (map == null || map.size() == 0) {
            this.zzWNY = Collections.EMPTY_MAP;
        } else {
            this.zzWNY = map;
        }
        this.zzWNX = map2;
        this.zzWNW = true;
        this.zzWNU = new zzZGZ[16];
    }

    private void zzY(String str, zzZQY zzzqy) throws zzZQS {
        if (zzzqy == null) {
            zzzqy = zzlj();
        }
        zzYF8 zzyf8 = new zzYF8(zzzqy, str, 2);
        zzyf8.zzY(this);
        this.zzWNZ.zzY(zzyf8);
    }

    public final void zzK(String str, Object obj) throws zzZQS {
        zzY(MessageFormat.format(str, obj), null);
    }

    public final void zzW(String str, Object obj, Object obj2) throws zzZQS {
        zzY(MessageFormat.format(str, obj, obj2), null);
    }

    public final boolean zzXOK() {
        return this.zzWOl;
    }

    public final zzZDZ zzXOu() {
        return this.zzWNU[this.zzWNT - 1].zzWOF;
    }

    public abstract zzZE2 zzXOw();

    public void zzXOy() {
        this.zzWNW = true;
    }

    public abstract boolean zzXOz();

    @Override // com.aspose.words.internal.zzZEU
    public final boolean zzXR(String str, String str2) {
        this.zzWNP.zzXw(str, str2);
        zzZGZ zzzgz = this.zzWNY.get(this.zzWNP);
        this.zzWNV = zzzgz;
        return zzzgz != null && zzzgz.zzXOK();
    }

    @Override // com.aspose.words.internal.zzZEU
    public final void zzZ(zzZEW zzzew) throws zzZQS {
        HashMap<String, zzZH1> map = this.zzWNV.zzWOq;
        if (map != null) {
            for (Map.Entry<String, zzZH1> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!zzzew.zzxK(key)) {
                    zzzew.zzXK(key, entry.getValue().zzZ(this.zzWNZ, this));
                }
            }
        }
    }

    public final char[] zzgX(int i) {
        char[] cArr = this.zzWNO;
        if (cArr == null || cArr.length < i) {
            if (i < 100) {
                i = 100;
            }
            this.zzWNO = new char[i];
        }
        return this.zzWNO;
    }

    public final zzZQY zzlj() {
        return this.zzWNZ.zzXMu();
    }

    public final void zzy4(String str) throws zzZQS {
        zzY(str, null);
    }

    public final void zzZ(String str, zzZQY zzzqy) throws zzZQS {
        zzY(str, zzzqy);
    }

    public final void zzZ(zzZH1 zzzh1) throws zzZQS {
        String strZzZ = zzzh1.zzZ(this.zzWNZ, this);
        if (strZzZ == null) {
            zzZE1.zzx1("null default attribute value");
        }
        zzZDZ zzzdzZzXOU = zzzh1.zzXOU();
        String prefix = zzzdzZzXOU.getPrefix();
        String str = "";
        if (prefix != null && prefix.length() > 0) {
            String namespaceURI = this.zzWNZ.getNamespaceURI(prefix);
            if (namespaceURI == null || namespaceURI.length() == 0) {
                zzW("Unbound namespace prefix \"{0}\" for default attribute \"{1}\"", prefix, zzzh1);
            } else {
                str = namespaceURI;
            }
        }
        int iZzN = this.zzWNZ.zzN(zzzdzZzXOU.getLocalName(), str, prefix, strZzZ);
        if (iZzN < 0) {
            return;
        }
        while (true) {
            zzZH1[] zzzh1Arr = this.zzWNR;
            if (iZzN < zzzh1Arr.length) {
                break;
            } else {
                this.zzWNR = (zzZH1[]) zzZE5.zzYH(zzzh1Arr);
            }
        }
        while (true) {
            int i = this.zzWZQ;
            if (i < iZzN) {
                zzZH1[] zzzh1Arr2 = this.zzWNR;
                this.zzWZQ = i + 1;
                zzzh1Arr2[i] = null;
            } else {
                this.zzWNR[iZzN] = zzzh1;
                this.zzWZQ = iZzN + 1;
                return;
            }
        }
    }
}
