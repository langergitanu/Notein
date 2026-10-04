package com.aspose.words.internal;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWB implements zzGS {
    private zz08[] zz8d;
    private zz0J zz8e;
    private zzZXH zzA4;
    private int zzcs = 65536;
    private zzZYT<byte[]> zzcr = new zzZYT<>(true);

    public zzZWB(zzZXH zzzxh, zz0J zz0j, zz08[] zz08VarArr) {
        this.zzA4 = zzzxh;
        this.zz8e = zz0j;
        this.zz8d = zz08VarArr;
    }

    private static String zz5(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int iZzN = zzAN.zzN(bArr.length, 4);
        int i = 0;
        while (i < iZzN) {
            if (i > 0 && i % 36 == 0) {
                sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            zzZNH.zzZ(sb, "{0:x2}", Integer.valueOf((i < bArr.length ? bArr[i] : (byte) 0) & 255));
            i++;
        }
        return sb.toString();
    }

    private byte[] zznY() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzXZ zzxz = new zzXZ(zzzor);
            zzZZ1 zzzz1 = new zzZZ1();
            zzzz1.setVersion(this.zzcs);
            zzzz1.zzO((short) this.zzcr.getCount());
            zzzz1.zzX(zzxz);
            int position = (int) (zzzor.getPosition() + ((long) (this.zzcr.getCount() * 16)));
            Iterator<Map.Entry<K, V>> it = this.zzcr.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                byte[] bArr = (byte[]) entry.getValue();
                zzZYZ zzzyz = new zzZYZ();
                zzzyz.zzck = (String) entry.getKey();
                zzzyz.zzci = bArr.length;
                zzzyz.zzdZ = position;
                zzzyz.zzcj = zzZYZ.zzF(bArr, bArr.length);
                zzzyz.zzX(zzxz);
                position = (int) ((((long) position) & 4294967295L) + (((long) zzAN.zzN(bArr.length, 4)) & 4294967295L));
            }
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzC(zzZOP zzzop) throws Exception {
        zzZON zzzon = new zzZON(zzzop);
        zzzon.zzXB("%!PS-TrueType font");
        zzzon.zzXB("<<");
        zzzon.zzXB("/FontType 42");
        zzzon.zzXB("/FontMatrix [ 1 0 0 1 0 0 ]");
        zzzon.zzV("/FontName /{0}", this.zzA4.zzpQ());
        zzzon.zzZ("/FontBBox [{0} {1} {2} {3}]", zzJB.zzt(this.zzA4.zzpJ() / this.zzA4.zzpO()), zzJB.zzt(this.zzA4.zzpI() / this.zzA4.zzpO()), zzJB.zzt(this.zzA4.zzpH() / this.zzA4.zzpO()), zzJB.zzt(this.zzA4.zzpG() / this.zzA4.zzpO()));
        zzzon.zzXB("/PaintType 0");
        zzzon.zzXB("/FontInfo");
        zzzon.zzXB("<<");
        zzzon.zzV("/FamilyName ({0})", this.zzA4.zzPh());
        zzzon.zzV("/FullName ({0})", this.zzA4.getFullFontName());
        zzzon.zzV("/UnderlinePosition {0}", zzJB.zzt(this.zz8e.zzej / this.zzA4.zzpO()));
        zzzon.zzV("/UnderlineThickness {0}", zzJB.zzt(this.zz8e.zzei / this.zzA4.zzpO()));
        zzzon.zzV("/ItalicAngle {0}", zzJB.zzt(this.zz8e.zzek));
        zzzon.zzV("/isFixedPitch {0}", this.zz8e.zzeh > 0 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        zzzon.zzXB(">>");
        zzzon.zzXB("/Encoding ISOLatin1Encoding");
        zzzon.zzXB("/CharStrings <<");
        int i = 0;
        while (true) {
            zz08[] zz08VarArr = this.zz8d;
            if (i >= zz08VarArr.length) {
                break;
            }
            zz08 zz08Var = zz08VarArr[i];
            zzzon.zzZ("/{0} {1}", zzZZY.zzTb(zz08Var.getIndex() == 0 ? 0 : zz08Var.zzZD()), Integer.valueOf(zz08Var.getIndex()));
            i++;
        }
        zzzon.zzXB(">>");
        zzzon.zzXB("/sfnts [");
        zzZ(zzzon, zznY());
        Iterator<Map.Entry<K, V>> it = this.zzcr.iterator();
        while (it.hasNext()) {
            zzZ(zzzon, (byte[]) ((Map.Entry) it.next()).getValue());
        }
        zzzon.zzXB("]");
        zzzon.zzXB(">>");
        zzzon.zzXB("begin FontName currentdict end definefont pop");
        zzzon.flush();
    }

    @Override // com.aspose.words.internal.zzGS
    public final byte[] zzFA() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzC(zzzor);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzWg(int i) {
        this.zzcs = i;
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzZ(String str, byte[] bArr) {
        this.zzcr.zzB(str, bArr);
    }

    private static void zzZ(zzZON zzzon, byte[] bArr) throws Exception {
        zzzon.zzXB("<");
        zzzon.write(zz5(bArr));
        zzzon.zzXB(">");
    }
}
