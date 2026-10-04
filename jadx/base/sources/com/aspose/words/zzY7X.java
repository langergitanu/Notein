package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzY7X implements zzZBM {
    private static String[] zzYr1 = new String[0];
    private String mValue;
    private double zzX8A;
    private double zzX8B;
    private zzPS zzX8C;
    private zzY7X zzX8D;
    private zzY7X zzX8E;
    private String zzX8F;
    private String[] zzX8t;
    private zzZBM zzX8u;
    private HashMap<String, zzY7Z> zzX8v;
    private HashMap<String, byte[]> zzX8w;
    private zzY7H zzX8x;
    private zzY7U zzX8y;
    private zzY7A zzX8z;
    private double zzXA;
    private String zzXLB;
    private double zzXy;
    private HashMap<String, String> zzYkm;
    private double zzYpp;
    private double zzYpr;
    private ArrayList<zzY7X> zzZc = new ArrayList<>();
    private zzPS zzZq9;

    public zzY7X(String str, String str2, HashMap<String, zzY7Z> map, HashMap<String, String> map2, zzZBM zzzbm) {
        this.zzXLB = str;
        this.zzX8F = str2;
        this.zzX8v = map;
        this.zzYkm = map2;
        this.zzX8u = zzzbm;
        zzPS zzps = zzPS.zzZqo;
        this.zzZq9 = zzps;
        this.zzX8C = zzps;
    }

    private static String zzX(zzY7X zzy7x) {
        while (true) {
            String attributeValue = zzy7x.getAttributeValue(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, null);
            if (attributeValue != null) {
                return attributeValue;
            }
            if (zzy7x.zzY1C() == null) {
                return "";
            }
            zzy7x = zzy7x.zzY1C();
        }
    }

    private String[] zzY1l() {
        String attributeValue = getAttributeValue("class", null);
        return !com.aspose.words.internal.zzZKN.zzU3(attributeValue) ? zzL5.zzS8(attributeValue) : zzYr1;
    }

    @Override // com.aspose.words.zzZBM
    public final String getAttributeValue(String str, String str2) {
        return this.zzX8v.containsKey(str) ? this.zzX8v.get(str).getValue() : str2;
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final String getId() {
        return getAttributeValue("id", null);
    }

    @Override // com.aspose.words.zzZBM
    public final String getLanguage() {
        return zzX(this);
    }

    public final String getValue() {
        return this.mValue;
    }

    public final boolean getVisible() {
        return (this.zzZq9.zzZy("visibility", "hidden") || this.zzZq9.zzZy("visibility", "collapse") || this.zzZq9.zzZy("display", "none")) ? false : true;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final boolean hasAttribute(String str) {
        return this.zzX8v.containsKey(str);
    }

    @Override // com.aspose.words.zzZBM
    public final boolean isImplicit() {
        return false;
    }

    public final boolean isText() {
        return com.aspose.words.internal.zzZKN.zzU3(this.zzXLB) && !com.aspose.words.internal.zzZKN.zzU3(this.mValue);
    }

    public final void setAttribute(String str, String str2) {
        if (this.zzX8v.containsKey(str)) {
            this.zzX8v.get(str).setValue(str2);
        } else {
            com.aspose.words.internal.zzZQF.zzY(this.zzX8v, str, new zzY7Z(str, str2));
        }
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public String toString() {
        return this.zzXLB + C18241k5.f55433h + getAttributeValue("id", null);
    }

    public final zzY7Z zzAx(String str) {
        if (this.zzX8v.containsKey(str)) {
            return this.zzX8v.get(str);
        }
        return null;
    }

    public final void zzF(zzPS zzps) {
        this.zzX8C = zzps;
    }

    public final void zzG(zzPS zzps) {
        this.zzZq9 = zzps;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzKM(String str) {
        return getAttributeValue(str, null);
    }

    public final zzY7X zzL(zzZBM zzzbm) {
        zzY7X zzy7x = new zzY7X(this.zzXLB, this.zzX8F, new HashMap(this.zzX8v), new HashMap(this.zzYkm), zzzbm);
        zzy7x.mValue = this.mValue;
        zzy7x.zzX8E = this.zzX8E;
        zzy7x.zzX8D = this.zzX8D;
        zzy7x.zzZq9 = this.zzX8C;
        Iterator<zzY7X> it = this.zzZc.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzy7x.zzZc, it.next().zzL(zzy7x));
        }
        return zzy7x;
    }

    public final void zzQ(String str, byte[] bArr) {
        if (this.zzX8w == null) {
            this.zzX8w = new HashMap<>();
        }
        if (this.zzX8w.containsKey(str)) {
            this.zzX8w.put(str, bArr);
        } else {
            com.aspose.words.internal.zzZQF.zzY(this.zzX8w, str, bArr);
        }
    }

    public final ArrayList<zzY7X> zzQw() {
        return this.zzZc;
    }

    public final void zzW3(double d) {
        this.zzX8A = d;
    }

    public final void zzW4(double d) {
        this.zzX8B = d;
    }

    public final void zzW5(double d) {
        this.zzYpp = d;
    }

    public final void zzW6(double d) {
        this.zzYpr = d;
    }

    public final void zzY(zzY7X zzy7x) {
        this.zzX8D = zzy7x;
    }

    public final double zzY1A() {
        return this.zzYpp;
    }

    public final double zzY1B() {
        return this.zzYpr;
    }

    public final zzY7X zzY1C() {
        return (zzY7X) com.aspose.words.internal.zzZKW.zzZ(this.zzX8u, zzY7X.class);
    }

    public final ArrayList<zzY7X> zzY1D() {
        ArrayList<zzY7X> arrayList = new ArrayList<>();
        for (zzY7X zzy7x : this.zzZc) {
            if (!zzy7x.isText()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzy7x);
            }
        }
        return arrayList;
    }

    public final HashMap<String, byte[]> zzY1m() {
        return this.zzX8w;
    }

    public final HashMap<String, String> zzY1n() {
        return this.zzYkm;
    }

    public final zzY7H zzY1o() {
        return this.zzX8x;
    }

    public final Iterable<String> zzY1p() {
        return this.zzX8v.keySet();
    }

    public final boolean zzY1q() {
        return zzY1w() || "symbol".equals(this.zzXLB) || RequestParameters.MARKER.equals(this.zzXLB) || "pattern".equals(this.zzXLB) || "view".equals(this.zzXLB);
    }

    public final zzY7U zzY1r() {
        return this.zzX8y;
    }

    public final zzY7A zzY1s() {
        return this.zzX8z;
    }

    public final boolean zzY1t() {
        return zzY1C() != null && AbstractJwtRequest.ClaimNames.USE.equals(zzY1C().zzXLB);
    }

    public final boolean zzY1u() {
        return zzY1C() != null && "defs".equals(zzY1C().zzXLB);
    }

    public final boolean zzY1v() {
        return zzY1w() && zzY1C() != null;
    }

    public final boolean zzY1w() {
        return "svg".equals(this.zzXLB);
    }

    public final boolean zzY1x() {
        return this.zzX8z != null || hasAttribute("viewBox");
    }

    public final double zzY1y() {
        return this.zzX8A;
    }

    public final double zzY1z() {
        return this.zzX8B;
    }

    public final boolean zzYDj() {
        return com.aspose.words.internal.zzZYD.zzXk(getId());
    }

    public final void zzZ(zzY7X zzy7x) {
        this.zzX8E = zzy7x;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2F() {
        StringBuilder sb = null;
        for (zzY7X zzy7x : this.zzZc) {
            if (zzy7x.isText()) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                com.aspose.words.internal.zzZNH.zzU(sb, zzy7x.mValue);
            }
        }
        return sb != null ? sb.toString() : "";
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZ2G() {
        return this.zzX8F;
    }

    @Override // com.aspose.words.zzZBM
    public final String[] zzZ2K() {
        if (this.zzX8t == null) {
            this.zzX8t = zzY1l();
        }
        return this.zzX8t;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM[] zzZ2M() {
        return (zzZBM[]) this.zzZc.toArray(new zzY7X[0]);
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2N() {
        for (zzY7X zzy7x = this.zzX8E; zzy7x != null; zzy7x = zzy7x.zzX8E) {
            if (!zzy7x.isText()) {
                return zzy7x;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2O() {
        for (zzY7X zzy7x = this.zzX8D; zzy7x != null; zzy7x = zzy7x.zzX8D) {
            if (!zzy7x.isText()) {
                return zzy7x;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2P() {
        for (zzY7X zzy7x : this.zzZc) {
            if (!zzy7x.isText()) {
                return zzy7x;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZBM
    public final zzZBM zzZ2Q() {
        return this.zzX8u;
    }

    @Override // com.aspose.words.zzZBM
    public final String zzZTQ() {
        return this.zzXLB;
    }

    public final zzPS zzZVr() {
        return this.zzX8C;
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }

    public final void zzZ(zzY7A zzy7a) {
        this.zzX8z = zzy7a;
    }

    public final void zzZ(zzY7U zzy7u) {
        this.zzX8y = zzy7u;
    }

    public final void zzZ(zzY7H zzy7h) {
        this.zzX8x = zzy7h;
    }
}
