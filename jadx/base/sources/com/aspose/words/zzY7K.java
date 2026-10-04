package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7K {
    private zzY7X zzX7R;
    private zzY7J zzX7S;

    public zzY7K(com.aspose.words.internal.zzZOP zzzop, String str, zzZFF zzzff, zzZYQ zzzyq, ITextShaperFactory iTextShaperFactory) throws Exception {
        this.zzX7S = new zzY7J(str, zzzff, zzzyq, iTextShaperFactory, false, false);
        zzZ((zzZBM) null, new com.aspose.words.internal.zzO(zzzop, true, true));
    }

    private static String zzN(com.aspose.words.internal.zzO zzo) {
        return com.aspose.words.internal.zzZYD.zzXk(zzo.getNamespaceURI()) ? zzo.getNamespaceURI() : "http://www.w3.org/2000/svg";
    }

    private static HashMap<String, String> zzO(com.aspose.words.internal.zzO zzo) {
        Map<String, String> mapZze = zzo.zze();
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry<String, String> entry : mapZze.entrySet()) {
            if (com.aspose.words.internal.zzZYD.zzXk(entry.getKey()) && !"svg".equals(entry.getKey())) {
                com.aspose.words.internal.zzZQF.zzY(map, entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    private static HashMap<String, zzY7Z> zzP(com.aspose.words.internal.zzO zzo) {
        HashMap<String, zzY7Z> map = new HashMap<>();
        while (zzo.zzi()) {
            String strZzM = zzo.zzM(zzo.getPrefix());
            String localName = (zzXZ(zzo.getLocalName(), strZzM) || "http://www.w3.org/XML/1998/namespace".equals(strZzM)) ? zzo.getLocalName() : zzo.getName();
            if (!map.containsKey(localName)) {
                com.aspose.words.internal.zzZQF.zzY(map, localName, new zzY7Z(zzo.getName(), zzo.getValue()));
            }
        }
        return map;
    }

    private static boolean zzXZ(String str, String str2) {
        return "href".equals(str) && "http://www.w3.org/1999/xlink".equals(str2);
    }

    private void zzY(zzYB5 zzyb5, zzYB5 zzyb52) throws Exception {
        if (this.zzX7S.zzY0T() == null) {
            this.zzX7S.zzZ(this.zzX7R, zzyb5, zzyb52);
        }
    }

    public final byte[] zzPN(boolean z) throws Exception {
        zzY7X zzy7x = null;
        zzY((zzYB5) null, (zzYB5) null);
        if (this.zzX7S.zzY0S().size() > 0) {
            zzY7X zzy7x2 = new zzY7X("defs", "", new HashMap(), new HashMap(), this.zzX7R);
            Iterator<zzY7X> it = this.zzX7S.zzY0S().iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zzy7x2.zzQw(), it.next());
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzX7R.zzQw(), zzy7x2);
            zzy7x = zzy7x2;
        }
        byte[] bArrZzZ = zzY7W.zzZ(this.zzX7R, new com.aspose.words.internal.zzZNI(false), z);
        if (zzy7x != null) {
            this.zzX7R.zzQw().remove(zzy7x);
        }
        return bArrZzZ;
    }

    public final void zzY0V() throws Exception {
        zzY((zzYB5) null, (zzYB5) null);
        if (this.zzX7R.zzZWe().zzSx("font-size") == null) {
            this.zzX7R.setAttribute("font-size", com.aspose.words.internal.zzJB.zzs((float) ConvertUtil.pointToPixel(12.0d)));
        }
        if (this.zzX7R.zzZWe().zzSx("font-family") == null) {
            this.zzX7R.setAttribute("font-family", "Times New Roman");
        }
    }

    public final boolean zzY0W() {
        return this.zzX7R.hasAttribute("width") && this.zzX7R.hasAttribute("height");
    }

    public final void zzZ(com.aspose.words.internal.zzFL zzfl) throws Exception {
        zzY((zzYB5) null, (zzYB5) null);
        Iterator<zzY7X> it = this.zzX7R.zzQw().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzfl);
        }
    }

    public final void zzd(double d, double d2) throws Exception {
        zzY((zzYB5) null, (zzYB5) null);
        this.zzX7R.setAttribute("width", com.aspose.words.internal.zzJB.zzZU(ConvertUtil.pointToPixel(d)));
        this.zzX7R.setAttribute("height", com.aspose.words.internal.zzJB.zzZU(ConvertUtil.pointToPixel(d2)));
        zzPR zzpr = new zzPR(this.zzX7R.zzZWe());
        zzpr.remove("width");
        zzpr.remove("height");
        this.zzX7R.zzG(zzpr.zzZWe());
    }

    private void zzY(com.aspose.words.internal.zzO zzo, zzY7X zzy7x) {
        zzY7X zzy7x2;
        zzY7X zzy7xZzZ = zzZ(zzo, (zzZBM) zzy7x);
        if (zzy7x.zzQw().size() > 0) {
            zzy7x2 = zzy7x.zzQw().get(zzy7x.zzQw().size() - 1);
            zzy7x2.zzZ(zzy7xZzZ);
        } else {
            zzy7x2 = null;
        }
        zzy7xZzZ.zzY(zzy7x2);
        zzy7xZzZ.zzZ((zzY7X) null);
        com.aspose.words.internal.zzZQG.zzZ(zzy7x.zzQw(), zzy7xZzZ);
    }

    public zzY7K(String str, zzY7J zzy7j, zzZBM zzzbm) {
        this.zzX7S = zzy7j;
        try {
            zzZ(zzzbm, new com.aspose.words.internal.zzO(str, (Map<String, String>) null, true));
        } catch (IllegalStateException unused) {
            this.zzX7S.zzT(1, "Root SVG element is malformed and has been ignored.");
            this.zzX7R = new zzY7X("svg", "http://www.w3.org/2000/svg", new HashMap(), new HashMap(), null);
        }
    }

    public final zzY7R zzZ(zzYB5 zzyb5, zzYB5 zzyb52) throws Exception {
        zzY(zzyb5, zzyb52);
        zzY7S.zzW(this.zzX7S, this.zzX7R);
        float fZzY1z = (float) this.zzX7R.zzY1z();
        float fZzY1y = (float) this.zzX7R.zzY1y();
        if (com.aspose.words.internal.zzAN.zzZD(this.zzX7R.zzY1z()) || com.aspose.words.internal.zzAN.zzZD(this.zzX7R.zzY1y())) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) this.zzX7S.zzY0U());
            float fZzkw = zzzq4ZzZ.zzkw();
            fZzY1y = zzzq4ZzZ.zzZn();
            fZzY1z = fZzkw;
        }
        if (com.aspose.words.internal.zzAN.zzf(fZzY1z)) {
            this.zzX7S.zzT(65536, "Width is not specified or set to 0, using default value 100px.");
            fZzY1z = 75.0f;
        }
        if (com.aspose.words.internal.zzAN.zzf(fZzY1y)) {
            this.zzX7S.zzT(65536, "Height is not specified or set to 0, using default value 100px.");
            fZzY1y = 75.0f;
        }
        return new zzY7R(this.zzX7S.zzY0U(), com.aspose.words.internal.zzZPW.zzG(fZzY1z, fZzY1y), this.zzX7R.getVisible(), this.zzX7S.zzZqx());
    }

    private void zzZ(zzZBM zzzbm, com.aspose.words.internal.zzO zzo) {
        this.zzX7R = zzZ(zzo, zzzbm);
    }

    private void zzZ(zzY7X zzy7x, com.aspose.words.internal.zzFL zzfl) {
        if (zzy7x.isText()) {
            com.aspose.words.internal.zzPM zzpmZzZ = zzY7D.zzZ(zzy7x, zzY7D.zzT(zzy7x, this.zzX7S), this.zzX7S.zzZqx().zzZqy());
            zzfl.zzZ(zzy7x.getValue(), zzpmZzZ.zzPl(), zzY7D.zzP(zzy7x));
        } else {
            Iterator<zzY7X> it = zzy7x.zzQw().iterator();
            while (it.hasNext()) {
                zzZ(it.next(), zzfl);
            }
        }
    }

    private zzY7X zzZ(com.aspose.words.internal.zzO zzo, zzZBM zzzbm) {
        HashMap<String, zzY7Z> mapZzP = zzP(zzo);
        zzo.zzj();
        zzY7X zzy7x = new zzY7X(zzo.getName(), zzN(zzo), mapZzP, zzO(zzo), zzzbm);
        if ("".equals(zzo.getName())) {
            zzy7x.setValue(zzo.getValue());
            return zzy7x;
        }
        if (!zzo.zzc()) {
            try {
                zzZ(zzo, zzy7x);
                return zzy7x;
            } catch (IllegalStateException unused) {
                this.zzX7S.zzT(1, com.aspose.words.internal.zzZKN.format("A child SVG element of '{0}' is malformed and has been ignored.", zzy7x.zzZTQ()));
            }
        }
        return zzy7x;
    }

    private void zzZ(com.aspose.words.internal.zzO zzo, zzY7X zzy7x) {
        int i = ("text".equals(zzy7x.zzZTQ()) || "tspan".equals(zzy7x.zzZTQ())) ? 7 : 1;
        while (zzo.zzY(zzy7x.zzZTQ(), i)) {
            while (zzo.zzc() && com.aspose.words.internal.zzZKN.equals(zzy7x.zzZTQ(), zzo.getName())) {
                zzo.zzf();
            }
            if (zzo.zzP(zzy7x.zzZTQ())) {
                return;
            } else {
                zzY(zzo, zzy7x);
            }
        }
    }
}
