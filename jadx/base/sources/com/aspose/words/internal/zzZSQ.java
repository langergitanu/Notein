package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.ref.Ref;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSQ extends zzCO {
    static ArrayList<zzEZ> zz6d = new ArrayList<>();
    private static final zzZHW zzUR = new zzZHW("#text", "#cdata-section", "#whitespace", "#significant-whitespace", "$values", "$id", "$ref", "$type", "$value", "@version", "@encoding", "@standalone", "@name", "@public", "@system", "@internalSubset");
    private zzZYG<zzZ> zz6e;
    private boolean zztl;
    private boolean zztm;
    private boolean zztn;
    private String zzto;
    private boolean zzu5;

    public static class zzZ {
        private String mValue;
        private boolean zz6c;
        private int zzL4;

        public zzZ(String str, int i) {
            this(str, i, false);
        }

        public final int getType() {
            return this.zzL4;
        }

        public final String getValue() {
            return this.mValue;
        }

        public final boolean zzmx() {
            return this.zz6c;
        }

        public zzZ(String str, int i, boolean z) {
            this.mValue = str;
            this.zzL4 = i;
            this.zz6c = z;
        }
    }

    public zzZSQ() {
        this(new zzC5());
    }

    private static int zzRM(int i) {
        if (i == 16) {
            return 6;
        }
        if (i == 17) {
            return 3;
        }
        switch (i) {
            case 7:
                return 2;
            case 8:
                return 4;
            case 9:
                return 1;
            case 10:
                return 5;
            case 11:
                return 7;
            default:
                throw new IllegalStateException("Wrong JSON token.");
        }
    }

    private static boolean zzRN(int i) {
        if (i == 16 || i == 17) {
            return true;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    private zzZYG<zzZ> zzT(zzZYG<zzZ> zzzyg) {
        if (zzzyg == null) {
            zzZYG<zzZ> zzzyg2 = this.zz6e;
            if (zzzyg2 != null) {
                return zzzyg2;
            }
            zzzyg = new zzZYG<>();
            this.zz6e = zzzyg;
        }
        zzzyg.zzW("xml:space", new zzZ("preserve", 9, true));
        return zzzyg;
    }

    private static boolean zzX(zzCF zzcf) {
        int iZzYb = zzcf.zzYb();
        if (iZzYb == 3 || iZzYb == 16 || iZzYb == 17) {
            return false;
        }
        switch (iZzYb) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return false;
            default:
                return true;
        }
    }

    private void zzY(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str, zzZN6 zzzn6, String str2, zzZYG<zzZ> zzzyg, boolean z) {
        zzEZ zzezZzw;
        zzF2 zzf22 = zzf2;
        zzF0 zzf0ZzZ = zzZ(str, zzf22, str2, zzzn6);
        zzez.zzY(zzf0ZzZ);
        if (zzzyg != null) {
            for (String str3 : zzzyg.zzxs()) {
                zzZ zzz = zzzyg.get(str3);
                String strZzUC = zzZN9.zzUC(str3);
                String prefix = zz7Z.getPrefix(str3);
                if (zzZKN.zzU3(prefix)) {
                    zzezZzw = zzf22.zzw(strZzUC, zzz.getValue());
                } else {
                    String strZzM = zzzn6.zzM(prefix);
                    if (strZzM == null) {
                        strZzM = "";
                    }
                    zzezZzw = zzf22.zzU(strZzUC, strZzM, zzz.getValue());
                }
                zzEZ zzez2 = zzezZzw;
                if (!zzz.zzmx()) {
                    zzZ(zzcf, zzf22, zzf0ZzZ, strZzUC, zzz.getType());
                }
                zzf0ZzZ.zzZ(zzez2);
                zzf22 = zzf2;
            }
        }
        if (zzRN(zzcf.zzYb())) {
            zzZ(zzcf, zzf2, zzez, str, zzzn6, str2, z, zzf0ZzZ);
            return;
        }
        if (zzcf.zzYb() != 13) {
            zzzn6.zzhc();
            zzZ(zzcf, zzf2, zzzn6, zzf0ZzZ);
            zzzn6.zzhb();
        }
        zzzn6.zzZO("", zzzn6.zzhd());
    }

    @Override // com.aspose.words.internal.zzCO
    public final Object zzZ(zzCF zzcf, Class cls) {
        int iZzYb = zzcf.zzYb();
        if (iZzYb != 1) {
            if (iZzYb == 11) {
                return null;
            }
            throw zzCD.zzY(zzcf, "The converter can only convert JSON that begins with an object.");
        }
        zzZN6 zzzn6 = new zzZN6(new zzZNB());
        if (!Node.class.isAssignableFrom(cls)) {
            throw zzCD.zzY(zzcf, C21111o0ooOoO.OooO0O0(cls, "Unexpected type when converting XML: "));
        }
        if (cls != Document.class && cls != Element.class && cls != Node.class) {
            throw zzCD.zzY(zzcf, "The converter only supports deserializing XmlDocument, XmlElement or XmlNode.");
        }
        zzZSS zzzss = new zzZSS(zzZSN.zzms());
        if (zzZKN.zzU3(this.zzto)) {
            zzcf.zzCn();
            zzZ(zzcf, zzzss, zzzn6, zzzss);
        } else {
            zzZ(zzcf, (zzF2) zzzss, (zzEZ) zzzss, this.zzto, zzzn6, false);
        }
        return cls == Element.class ? zzzss.zzEo().zzEl() : zzzss.zzEl();
    }

    public zzZSQ(zzC5 zzc5) {
        zzZ4.zzY((Object) zzc5, "settings");
        this.zzto = zzc5.zzBS();
        this.zztn = zzc5.zzBR();
        this.zztm = zzc5.zzBP();
        this.zztl = zzc5.zzBO();
        this.zzu5 = zzc5.getPreserveSpaces();
    }

    private static boolean zzX(String str, Ref<String> ref) {
        if (zzZYD.zzg(str, "xmlns")) {
            if (str.length() == 5) {
                ref.set("");
                return true;
            }
            if (str.charAt(5) == ':') {
                ref.set(str.substring(6, str.length()));
                return true;
            }
        }
        ref.set(null);
        return false;
    }

    private static boolean zzX(zzEZ zzez) {
        return zzez != null && zzez.getNodeType() == 9;
    }

    private static String zzY(zzCF zzcf) {
        int iZzYb = zzcf.zzYb();
        if (iZzYb == 16) {
            Object value = zzcf.getValue();
            zzZP1.zzj8();
            zzZQ9 zzzq9Zz4 = zzZQB.zz4(value);
            return zzZN9.zzW(zzzq9Zz4, zzR0.zzC(zzzq9Zz4.zzkR()));
        }
        if (iZzYb != 17) {
            switch (iZzYb) {
                case 7:
                    Object value2 = zzcf.getValue();
                    zzZP1.zzj8();
                    return zzZN9.zzR(Integer.valueOf(zzZQB.zz2(value2)));
                case 8:
                    if (zzcf.getValue() != null) {
                        zzcf.getValue().getClass();
                    }
                    if (zzcf.getValue() instanceof Float) {
                        return zzZN9.zzZ((Float) zzcf.getValue());
                    }
                    Object value3 = zzcf.getValue();
                    zzZP1.zzj8();
                    return zzZN9.zzZ(Double.valueOf(zzZQB.zz3(value3)));
                case 9:
                    if (zzcf.getValue() != null) {
                        return zzcf.getValue().toString();
                    }
                    return null;
                case 10:
                    Object value4 = zzcf.getValue();
                    zzZP1.zzj8();
                    return zzZN9.zzZ(zzZQB.zz6(value4));
                case 11:
                    return null;
                default:
                    throw zzCD.zzY(zzcf, zzZKN.format("Cannot get an XML string value from token type '{0}'.", Integer.valueOf(zzcf.zzYb())));
            }
        }
        Object value5 = zzcf.getValue();
        zzZP1.zzj8();
        return zzZN9.zzZ(zzZQB.zz5(value5));
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str, zzZN6 zzzn6, boolean z) {
        String str2;
        zzZ(str, zzcf);
        if (!this.zztm) {
            zzZYG<zzZ> zzzygZzZ = zzX(zzcf) ? zzZ(zzcf, zzzn6) : null;
            String prefix = zz7Z.getPrefix(str);
            if (zzZYB.zzW(str, '@')) {
                String strSubstring = str.substring(1);
                zzZ(zzcf, zzf2, zzez, str, strSubstring, zzzn6, zz7Z.getPrefix(strSubstring));
                return;
            }
            if (zzZYB.zzW(str, '$')) {
                switch (zzUR.zzTP(str)) {
                    case 4:
                        zzZ(zzcf, zzf2, zzez, str.substring(1), zzzn6, zzzn6.lookupPrefix("http://james.newtonking.com/projects/json"), zzzygZzZ, false);
                        return;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        zzZ(zzcf, zzf2, zzez, str, str.substring(1), zzzn6, zzzn6.lookupPrefix("http://james.newtonking.com/projects/json"));
                        return;
                }
            }
            str2 = prefix;
            zzzygZzT = zzzygZzZ;
        } else {
            if (zzX(zzcf)) {
                zzcf.zzCn();
            }
            str2 = null;
        }
        if (zzZ(zzcf)) {
            zzzygZzT = zzT(zzzygZzT);
        }
        zzZ(zzcf, zzf2, zzez, str, zzzn6, str2, zzzygZzT, z);
    }

    private static void zzY(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str) {
        if ("?xml".equals(str)) {
            String strZzY = null;
            String strZzY2 = null;
            String strZzY3 = null;
            while (zzcf.read() && zzcf.zzYb() != 13) {
                switch (zzUR.zzTP(zzcf.getValue().toString())) {
                    case 9:
                        zzcf.zzCn();
                        strZzY = zzY(zzcf);
                        break;
                    case 10:
                        zzcf.zzCn();
                        strZzY2 = zzY(zzcf);
                        break;
                    case 11:
                        zzcf.zzCn();
                        strZzY3 = zzY(zzcf);
                        break;
                    default:
                        throw zzCD.zzY(zzcf, "Unexpected property name encountered while deserializing XmlDeclaration: " + zzcf.getValue());
                }
            }
            zzez.zzY(zzf2.zzV(strZzY, strZzY2, strZzY3));
            return;
        }
        zzez.zzY(zzf2.zzy(str.substring(1), zzY(zzcf)));
    }

    private static void zzZ(String str, zzCF zzcf) {
        if (zzZKN.zzU3(str)) {
            throw zzCD.zzY(zzcf, "The converter cannot convert JSON with an empty property name to XML.");
        }
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str, zzZN6 zzzn6, String str2, zzZYG<zzZ> zzzyg, boolean z) {
        String strZzM = !zzZKN.zzU3(str2) ? zzzn6.zzM(str2) : "";
        if (!z && (zzez instanceof zzF0) && zzzyg == null && zzRN(zzcf.zzYb()) && zzZKN.equals(zzez.getLocalName(), str) && zzZKN.zzU(strZzM, zzez.zzEm(), zzZOF.ORDINAL$4894b8c8) == 0) {
            zzZ(zzf2, (zzF0) zzez, zzzn6, str2, str, zzcf.zzYb() != 11 ? zzY(zzcf) : null);
            zzZ(zzcf, zzf2, zzez, str);
        } else {
            zzY(zzcf, zzf2, zzez, str, zzzn6, str2, zzzyg, z);
        }
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str, zzZN6 zzzn6, String str2, boolean z, zzF0 zzf0) {
        zzF0 zzf0ZzZ;
        if (z) {
            str = zzZKN.zzZI(str, "_Text");
        }
        if (zzcf.zzYb() != 11 || z) {
            String strZzY = zzY(zzcf);
            if (z) {
                zzf0ZzZ = zzZ(str, zzf2, str2, zzzn6);
                zzf0.zzY(zzf0ZzZ);
            } else {
                zzf0ZzZ = zzf0;
            }
            if (strZzY != null) {
                zzf0ZzZ.zzY(zzf2.zzYR(strZzY));
            }
        }
        if (z) {
            zzez = zzf0;
        }
        zzZ(zzcf, zzf2, zzez, str);
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str) {
        zzZ(zzcf, zzf2, zzez, str, zzcf.zzYb());
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str, String str2, zzZN6 zzzn6, String str3) {
        if (!zzX(zzez)) {
            String strZzUC = zzZN9.zzUC(str2);
            String strZzY = zzY(zzcf);
            zzZ(zzcf, zzf2, zzez, strZzUC);
            zzZ(zzf2, (zzF0) zzez, zzzn6, str3, strZzUC, strZzY);
            return;
        }
        throw zzCD.zzY(zzcf, zzZKN.format("JSON root object has property '{0}' that will be converted to an attribute. A root object cannot have any attribute properties. Consider specifying a DeserializeRootElementName.", str));
    }

    private static zzEZ zzZ(zzF2 zzf2, zzF0 zzf0, zzZN6 zzzn6, String str, String str2, String str3) {
        zzEZ zzezZzw;
        if (!zzZKN.zzU3(str)) {
            zzezZzw = zzf2.zzZ(str, str2, zzzn6.zzM(str), str3);
        } else {
            zzezZzw = zzf2.zzw(str2, str3);
        }
        zzf0.zzZ(zzezZzw);
        return zzezZzw;
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, String str, zzEZ zzez, zzZN6 zzzn6) {
        zzF0 zzf0ZzZ = zzZ(str, zzf2, zz7Z.getPrefix(str), zzzn6);
        zzez.zzY(zzf0ZzZ);
        int i = 0;
        while (zzcf.read() && zzcf.zzYb() != 14) {
            zzF0 zzf0 = zzf0ZzZ;
            zzZ(zzcf, zzf2, zzzn6, str, (zzEZ) zzf0, true);
            i++;
            zzf0ZzZ = zzf0;
        }
        String str2 = str;
        zzF0 zzf02 = zzf0ZzZ;
        if (this.zztn) {
            zzZ(zzf02, zzf2, false);
        }
        if (i == 0) {
            zzZ(str2, zzf2, zzf02, zzcf, zzzn6);
            str2 = str2;
            zzf02 = zzf02;
        }
        if (i == 1 && this.zztn) {
            Iterator<zzEZ> it = zzf02.zzEn().iterator();
            while (it.hasNext()) {
                zzF0 zzf03 = (zzF0) zzZKW.zzZ(it.next(), zzF0.class);
                if (zzf03 != null && zzZKN.equals(zzf03.getLocalName(), str2)) {
                    zzZ(zzf03, zzf2, false);
                    return;
                }
            }
        }
    }

    private static void zzZ(zzF0 zzf0, zzF2 zzf2, boolean z) {
        String str;
        if (z) {
            str = "EmptyArray";
        } else {
            str = "Array";
        }
        zzf0.zzZ(zzf2.zzw("_3CEA27C9-DD7D-4935-9FD9-79B0CE397135", str));
    }

    private static zzZYG<zzZ> zzZ(zzCF zzcf, zzZN6 zzzn6) {
        zzZYG<zzZ> zzzyg = null;
        boolean z = false;
        while (!z && zzcf.read()) {
            int iZzYb = zzcf.zzYb();
            if (iZzYb == 4) {
                String string = zzcf.getValue().toString();
                if (!zzZKN.zzU3(string)) {
                    char cCharAt = string.charAt(0);
                    if (cCharAt == '$') {
                        switch (zzUR.zzTP(string)) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                String strLookupPrefix = zzzn6.lookupPrefix("http://james.newtonking.com/projects/json");
                                if (strLookupPrefix == null) {
                                    if (zzzyg == null) {
                                        zzzyg = new zzZYG<>();
                                    }
                                    int i = 0;
                                    String strOooO0OO = "json";
                                    while (zzzn6.zzM(strOooO0OO) != null) {
                                        i++;
                                        strOooO0OO = C21532OooOOo.OooO0OO(i, "json");
                                    }
                                    zzzyg.zzW(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("xmlns:", strOooO0OO), new zzZ("http://james.newtonking.com/projects/json", 0, true));
                                    zzzn6.zzZN(strOooO0OO, "http://james.newtonking.com/projects/json");
                                    strLookupPrefix = strOooO0OO;
                                }
                                if (!"$values".equals(string)) {
                                    String strSubstring = string.substring(1);
                                    zzcf.zzCn();
                                    if (!zzC3.zzVo(zzcf.zzYb())) {
                                        throw zzCD.zzY(zzcf, "Unexpected JsonToken: " + zzC4.toString(zzcf.zzYb()));
                                    }
                                    if (zzzyg == null) {
                                        zzzyg = new zzZYG<>();
                                    }
                                    zzzyg.zzW(o0Oo0oo.OooO0Oo(strLookupPrefix, C18241k5.f55433h, strSubstring), new zzZ(zzcf.getValue() != null ? zzcf.getValue().toString() : null, zzcf.zzYb()));
                                }
                                break;
                        }
                    } else if (cCharAt == '@') {
                        if (zzzyg == null) {
                            zzzyg = new zzZYG<>();
                        }
                        String strSubstring2 = string.substring(1);
                        zzcf.zzCn();
                        String strZzY = zzY(zzcf);
                        zzzyg.zzW(strSubstring2, new zzZ(strZzY, zzcf.zzYb()));
                        Ref ref = new Ref(null);
                        boolean zZzX = zzX(strSubstring2, ref);
                        String str = (String) ref.get();
                        if (zZzX) {
                            zzzn6.zzZN(str, strZzY);
                        }
                    }
                }
            } else if (iZzYb != 5 && iZzYb != 13) {
                throw zzCD.zzY(zzcf, "Unexpected JsonToken: " + zzcf.zzYb());
            }
            z = true;
        }
        return zzzyg;
    }

    private static void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez) {
        while (zzcf.read() && zzcf.zzYb() != 13) {
            switch (zzUR.zzTP(zzcf.getValue().toString())) {
                case 12:
                    zzcf.zzCn();
                    zzY(zzcf);
                    break;
                case 13:
                    zzcf.zzCn();
                    zzY(zzcf);
                    break;
                case 14:
                    zzcf.zzCn();
                    zzY(zzcf);
                    break;
                case 15:
                    zzcf.zzCn();
                    zzY(zzcf);
                    break;
                default:
                    throw zzCD.zzY(zzcf, "Unexpected property name encountered while deserializing XmlDeclaration: " + zzcf.getValue());
            }
        }
        zzez.zzY(zzf2.zzEp());
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzZN6 zzzn6, zzEZ zzez) {
        do {
            int iZzYb = zzcf.zzYb();
            if (iZzYb == 3) {
                String string = zzcf.getValue().toString();
                while (zzcf.read() && zzcf.zzYb() != 15) {
                    zzZ(zzcf, zzf2, zzzn6, string, zzez, false);
                }
            } else if (iZzYb != 4) {
                if (iZzYb != 5) {
                    if (iZzYb == 13 || iZzYb == 14) {
                        return;
                    }
                    throw zzCD.zzY(zzcf, "Unexpected JsonToken when deserializing node: " + zzcf.zzYb());
                }
                zzez.zzY(zzf2.zzYS((String) zzcf.getValue()));
            } else {
                if (zzX(zzez) && zzf2.zzEo() != null) {
                    throw zzCD.zzY(zzcf, "JSON root object has multiple properties. The root object must have a single property in order to create a valid XML document. Consider specifying a DeserializeRootElementName.");
                }
                String string2 = zzcf.getValue().toString();
                zzcf.zzCn();
                if (zzcf.zzYb() == 2) {
                    int i = 0;
                    while (zzcf.read() && zzcf.zzYb() != 14) {
                        zzZ(zzcf, zzf2, zzzn6, string2, zzez, true);
                        i++;
                    }
                    if (i == 0) {
                        zzZ(string2, zzf2, zzez, zzcf, zzzn6);
                        string2 = string2;
                    }
                    if (i == 1 && this.zztn) {
                        Ref ref = new Ref(null);
                        Ref ref2 = new Ref(null);
                        zz7Z.zzZ(string2, (Ref<String>) ref, (Ref<String>) ref2);
                        String str = (String) ref.get();
                        String str2 = (String) ref2.get();
                        String strZzhd = zzZKN.zzU3(str) ? zzzn6.zzhd() : zzzn6.zzM(str);
                        Iterator<zzEZ> it = zzez.zzEn().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            zzF0 zzf0 = (zzF0) zzZKW.zzZ(it.next(), zzF0.class);
                            if (zzf0 != null && zzZKN.equals(zzf0.getLocalName(), str2) && zzZKN.equals(zzf0.zzEm(), strZzhd)) {
                                zzZ(zzf0, zzf2, false);
                                break;
                            }
                        }
                    }
                } else {
                    zzZ(zzcf, zzf2, zzzn6, string2, zzez, false);
                }
            }
        } while (zzcf.read());
    }

    private void zzZ(String str, zzF2 zzf2, zzEZ zzez, zzCF zzcf, zzZN6 zzzn6) {
        zzZ(str, zzcf);
        char cCharAt = str.charAt(0);
        if (!Character.isLetter(cCharAt) && cCharAt != '_') {
            throw zzCD.zzY(zzcf, zzZKN.format("Unsupported syntax of the element {0}.", str));
        }
        zzF0 zzf0ZzZ = zzZ(str, zzf2, (String) null, zzzn6);
        zzez.zzY(zzf0ZzZ);
        if (this.zztn) {
            zzZ(zzf0ZzZ, zzf2, true);
        }
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzZN6 zzzn6, String str, zzEZ zzez, boolean z) {
        if (!this.zztm) {
            int iZzTP = zzUR.zzTP(str);
            if (iZzTP == 0) {
                zzez.zzY(zzf2.zzYR(zzY(zzcf)));
                return;
            }
            if (iZzTP == 1) {
                zzez.zzY(zzf2.zzYQ(zzY(zzcf)));
                return;
            }
            if (iZzTP == 2) {
                zzez.zzY(zzf2.zzYP(zzY(zzcf)));
                return;
            }
            if (iZzTP != 3) {
                if (!zzZKN.zzU3(str) && str.charAt(0) == '?') {
                    zzY(zzcf, zzf2, zzez, str);
                    return;
                } else if (zzZYD.zzh(str, "!DOCTYPE")) {
                    zzZ(zzcf, zzf2, zzez);
                    return;
                }
            } else {
                zzez.zzY(zzf2.zzYO(zzY(zzcf)));
                return;
            }
        }
        if (zzcf.zzYb() == 2) {
            zzZ(zzcf, zzf2, str, zzez, zzzn6);
        } else {
            zzZ(zzcf, zzf2, zzez, str, zzzn6, z);
        }
    }

    private boolean zzZ(zzCF zzcf) {
        String strZzY;
        if (!this.zzu5 || zzcf.zzYb() != 9 || (strZzY = zzY(zzcf)) == null || zzZKN.equals(strZzY, "")) {
            return false;
        }
        return zzZKU.zzG(strZzY.charAt(0)) || zzZKU.zzG(strZzY.charAt(strZzY.length() - 1));
    }

    private void zzZ(zzCF zzcf, zzF2 zzf2, zzEZ zzez, String str, int i) {
        if (this.zztl) {
            if (zzez instanceof zzF0) {
                zzEZ zzezZzv = zzez.zzv("_700A2E7E-5DFE-4F6E-A019-73FEB95F11F0", "");
                if (zzezZzv == null) {
                    zzezZzv = zzZ(zzf2, (zzF0) zzez, (zzZN6) null, (String) null, "_700A2E7E-5DFE-4F6E-A019-73FEB95F11F0", "");
                }
                zzCG.zzZ(zzezZzv, str, zzRM(i));
                return;
            }
            throw zzCD.zzY(zzcf, "No root element to provide property type information.");
        }
    }

    private zzF0 zzZ(String str, zzF2 zzf2, String str2, zzZN6 zzzn6) {
        String strZzUD = this.zztm ? zzZN9.zzUD(str) : zzZN9.zzUC(str);
        String strZzhd = zzZKN.zzU3(str2) ? zzzn6.zzhd() : zzzn6.zzM(str2);
        return !zzZKN.zzU3(strZzhd) ? zzf2.zzx(strZzUD, strZzhd) : zzf2.zzYN(strZzUD);
    }
}
