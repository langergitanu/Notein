package com.aspose.words.internal;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8F {
    private static String zzD(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                stringBuffer.append((char) b);
            }
        }
        return stringBuffer.toString();
    }

    private static String zzP(String str, byte[] bArr) {
        String strLineSeparator = zzYGI.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(strLineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            if (bArr.length - i > 32) {
                stringBuffer.append(str2);
                stringBuffer.append(zzYGI.zzVG(zzYGC.zzm(bArr, i, 32)));
                stringBuffer.append("    ");
                stringBuffer.append(zzD(bArr, i, 32));
                stringBuffer.append(strLineSeparator);
            } else {
                stringBuffer.append(str2);
                stringBuffer.append(zzYGI.zzVG(zzYGC.zzm(bArr, i, bArr.length - i)));
                for (int length = bArr.length - i; length != 32; length++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                stringBuffer.append(zzD(bArr, i, bArr.length - i));
                stringBuffer.append(strLineSeparator);
            }
        }
        return stringBuffer.toString();
    }

    private static String zzXq(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof zzZD5) {
            zzZ("", false, (zzZD5) obj, stringBuffer);
        } else {
            if (!(obj instanceof zzZDK)) {
                return "unknown object type " + obj.toString();
            }
            zzZ("", false, ((zzZDK) obj).zzXL0(), stringBuffer);
        }
        return stringBuffer.toString();
    }

    public static String zzXr(Object obj) {
        return zzXq(obj);
    }

    private static void zzZ(String str, boolean z, zzZD5 zzzd5, StringBuffer stringBuffer) {
        while (true) {
            String strLineSeparator = zzYGI.lineSeparator();
            if (zzzd5 instanceof zzZD4) {
                Enumeration enumerationZzXKE = ((zzZD4) zzzd5).zzXKE();
                String str2 = str + "    ";
                stringBuffer.append(str);
                if (zzzd5 instanceof zzZCP) {
                    stringBuffer.append("BER Sequence");
                } else if (zzzd5 instanceof zzZC2) {
                    stringBuffer.append("DER Sequence");
                } else {
                    stringBuffer.append("Sequence");
                }
                stringBuffer.append(strLineSeparator);
                while (enumerationZzXKE.hasMoreElements()) {
                    Object objNextElement = enumerationZzXKE.nextElement();
                    if (objNextElement == null || objNextElement.equals(zzZC8.zzWHS)) {
                        stringBuffer.append(str2);
                        stringBuffer.append("NULL");
                        stringBuffer.append(strLineSeparator);
                    } else if (objNextElement instanceof zzZD5) {
                        zzZ(str2, z, (zzZD5) objNextElement, stringBuffer);
                    } else {
                        zzZ(str2, z, ((zzZDK) objNextElement).zzXL0(), stringBuffer);
                    }
                }
                return;
            }
            if (zzzd5 instanceof zzZCY) {
                String str3 = str + "    ";
                stringBuffer.append(str);
                if (zzzd5 instanceof zzZCL) {
                    stringBuffer.append("BER Tagged [");
                } else {
                    stringBuffer.append("Tagged [");
                }
                zzZCY zzzcy = (zzZCY) zzzd5;
                stringBuffer.append(Integer.toString(zzzcy.zzXKy()));
                stringBuffer.append(']');
                if (!zzzcy.zzXKx()) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(strLineSeparator);
                if (zzzcy.isEmpty()) {
                    stringBuffer.append(str3);
                    stringBuffer.append("EMPTY");
                    stringBuffer.append(strLineSeparator);
                    return;
                }
                zzzd5 = zzzcy.zzXKw();
                str = str3;
            } else {
                if (zzzd5 instanceof zzZD2) {
                    Enumeration enumerationZzXKE2 = ((zzZD2) zzzd5).zzXKE();
                    String str4 = str + "    ";
                    stringBuffer.append(str);
                    if (zzzd5 instanceof zzZCN) {
                        stringBuffer.append("BER Set");
                    } else if (zzzd5 instanceof zzZC0) {
                        stringBuffer.append("DER Set");
                    } else {
                        stringBuffer.append("Set");
                    }
                    stringBuffer.append(strLineSeparator);
                    while (enumerationZzXKE2.hasMoreElements()) {
                        Object objNextElement2 = enumerationZzXKE2.nextElement();
                        if (objNextElement2 == null) {
                            stringBuffer.append(str4);
                            stringBuffer.append("NULL");
                            stringBuffer.append(strLineSeparator);
                        } else if (objNextElement2 instanceof zzZD5) {
                            zzZ(str4, z, (zzZD5) objNextElement2, stringBuffer);
                        } else {
                            zzZ(str4, z, ((zzZDK) objNextElement2).zzXL0(), stringBuffer);
                        }
                    }
                    return;
                }
                if (zzzd5 instanceof zzZD9) {
                    zzZD9 zzzd9 = (zzZD9) zzzd5;
                    if (zzzd5 instanceof zzZCS) {
                        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, "BER Constructed Octet String[");
                        sbOooO0OO.append(zzzd9.zzXL5().length);
                        sbOooO0OO.append("] ");
                        stringBuffer.append(sbOooO0OO.toString());
                    } else {
                        StringBuilder sbOooO0OO2 = C22226Oooo0oo.OooO0OO(str, "DER Octet String[");
                        sbOooO0OO2.append(zzzd9.zzXL5().length);
                        sbOooO0OO2.append("] ");
                        stringBuffer.append(sbOooO0OO2.toString());
                    }
                    if (z) {
                        stringBuffer.append(zzP(str, zzzd9.zzXL5()));
                        return;
                    } else {
                        stringBuffer.append(strLineSeparator);
                        return;
                    }
                }
                if (zzzd5 instanceof zzZDA) {
                    StringBuilder sbOooO0OO3 = C22226Oooo0oo.OooO0OO(str, "ObjectIdentifier(");
                    sbOooO0OO3.append(((zzZDA) zzzd5).getId());
                    sbOooO0OO3.append(")");
                    sbOooO0OO3.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO3.toString());
                    return;
                }
                if (zzzd5 instanceof zzZDM) {
                    StringBuilder sbOooO0OO4 = C22226Oooo0oo.OooO0OO(str, "Boolean(");
                    sbOooO0OO4.append(((zzZDM) zzzd5).zzXL1());
                    sbOooO0OO4.append(")");
                    sbOooO0OO4.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO4.toString());
                    return;
                }
                if (zzzd5 instanceof zzZDD) {
                    StringBuilder sbOooO0OO5 = C22226Oooo0oo.OooO0OO(str, "Integer(");
                    sbOooO0OO5.append(((zzZDD) zzzd5).zzXKZ());
                    sbOooO0OO5.append(")");
                    sbOooO0OO5.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO5.toString());
                    return;
                }
                if (zzzd5 instanceof zzZCG) {
                    zzZCG zzzcg = (zzZCG) zzzd5;
                    StringBuilder sbOooO0OO6 = C22226Oooo0oo.OooO0OO(str, "DER Bit String[");
                    sbOooO0OO6.append(zzzcg.getBytes().length);
                    sbOooO0OO6.append(", ");
                    sbOooO0OO6.append(zzzcg.zzXL4());
                    sbOooO0OO6.append("] ");
                    stringBuffer.append(sbOooO0OO6.toString());
                    if (z) {
                        stringBuffer.append(zzP(str, zzzcg.getBytes()));
                        return;
                    } else {
                        stringBuffer.append(strLineSeparator);
                        return;
                    }
                }
                if (zzzd5 instanceof zzZC9) {
                    StringBuilder sbOooO0OO7 = C22226Oooo0oo.OooO0OO(str, "IA5String(");
                    sbOooO0OO7.append(((zzZC9) zzzd5).getString());
                    sbOooO0OO7.append(") ");
                    sbOooO0OO7.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO7.toString());
                    return;
                }
                if (zzzd5 instanceof zzZBV) {
                    StringBuilder sbOooO0OO8 = C22226Oooo0oo.OooO0OO(str, "UTF8String(");
                    sbOooO0OO8.append(((zzZBV) zzzd5).getString());
                    sbOooO0OO8.append(") ");
                    sbOooO0OO8.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO8.toString());
                    return;
                }
                if (zzzd5 instanceof zzZC3) {
                    StringBuilder sbOooO0OO9 = C22226Oooo0oo.OooO0OO(str, "PrintableString(");
                    sbOooO0OO9.append(((zzZC3) zzzd5).getString());
                    sbOooO0OO9.append(") ");
                    sbOooO0OO9.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO9.toString());
                    return;
                }
                if (zzzd5 instanceof zzZBS) {
                    StringBuilder sbOooO0OO10 = C22226Oooo0oo.OooO0OO(str, "VisibleString(");
                    sbOooO0OO10.append(((zzZBS) zzzd5).getString());
                    sbOooO0OO10.append(") ");
                    sbOooO0OO10.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO10.toString());
                    return;
                }
                if (zzzd5 instanceof zzZCH) {
                    StringBuilder sbOooO0OO11 = C22226Oooo0oo.OooO0OO(str, "BMPString(");
                    sbOooO0OO11.append(((zzZCH) zzzd5).getString());
                    sbOooO0OO11.append(") ");
                    sbOooO0OO11.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO11.toString());
                    return;
                }
                if (zzzd5 instanceof zzZBY) {
                    StringBuilder sbOooO0OO12 = C22226Oooo0oo.OooO0OO(str, "T61String(");
                    sbOooO0OO12.append(((zzZBY) zzzd5).getString());
                    sbOooO0OO12.append(") ");
                    sbOooO0OO12.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO12.toString());
                    return;
                }
                if (zzzd5 instanceof zzZCA) {
                    StringBuilder sbOooO0OO13 = C22226Oooo0oo.OooO0OO(str, "GraphicString(");
                    sbOooO0OO13.append(((zzZCA) zzzd5).getString());
                    sbOooO0OO13.append(") ");
                    sbOooO0OO13.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO13.toString());
                    return;
                }
                if (zzzd5 instanceof zzZBT) {
                    StringBuilder sbOooO0OO14 = C22226Oooo0oo.OooO0OO(str, "VideotexString(");
                    sbOooO0OO14.append(((zzZBT) zzzd5).getString());
                    sbOooO0OO14.append(") ");
                    sbOooO0OO14.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO14.toString());
                    return;
                }
                if (zzzd5 instanceof zzZCW) {
                    StringBuilder sbOooO0OO15 = C22226Oooo0oo.OooO0OO(str, "UTCTime(");
                    sbOooO0OO15.append(((zzZCW) zzzd5).zzXKU());
                    sbOooO0OO15.append(") ");
                    sbOooO0OO15.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO15.toString());
                    return;
                }
                if (zzzd5 instanceof zzZDF) {
                    StringBuilder sbOooO0OO16 = C22226Oooo0oo.OooO0OO(str, "GeneralizedTime(");
                    sbOooO0OO16.append(((zzZDF) zzzd5).zzXKU());
                    sbOooO0OO16.append(") ");
                    sbOooO0OO16.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO16.toString());
                    return;
                }
                if (zzzd5 instanceof zzZCV) {
                    stringBuffer.append(zzZ("BER", str, z, zzzd5, strLineSeparator));
                    return;
                }
                if (zzzd5 instanceof zzZCI) {
                    stringBuffer.append(zzZ("DER", str, z, zzzd5, strLineSeparator));
                    return;
                }
                if (zzzd5 instanceof zzZBR) {
                    stringBuffer.append(zzZ("", str, z, zzzd5, strLineSeparator));
                    return;
                }
                if (zzzd5 instanceof zzZDI) {
                    StringBuilder sbOooO0OO17 = C22226Oooo0oo.OooO0OO(str, "DER Enumerated(");
                    sbOooO0OO17.append(((zzZDI) zzzd5).zzXKZ());
                    sbOooO0OO17.append(")");
                    sbOooO0OO17.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO17.toString());
                    return;
                }
                if (!(zzzd5 instanceof zzZDG)) {
                    StringBuilder sbOooO0OO18 = C22218Oooo.OooO0OO(str);
                    sbOooO0OO18.append(zzzd5.toString());
                    sbOooO0OO18.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO18.toString());
                    return;
                }
                zzZDG zzzdg = (zzZDG) zzzd5;
                stringBuffer.append(str + "External " + strLineSeparator);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                str = sb.toString();
                if (zzzdg.zzXKX() != null) {
                    StringBuilder sbOooO0OO19 = C22226Oooo0oo.OooO0OO(str, "Direct Reference: ");
                    sbOooO0OO19.append(zzzdg.zzXKX().getId());
                    sbOooO0OO19.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO19.toString());
                }
                if (zzzdg.zzXKV() != null) {
                    StringBuilder sbOooO0OO20 = C22226Oooo0oo.OooO0OO(str, "Indirect Reference: ");
                    sbOooO0OO20.append(zzzdg.zzXKV().toString());
                    sbOooO0OO20.append(strLineSeparator);
                    stringBuffer.append(sbOooO0OO20.toString());
                }
                if (zzzdg.zzXKY() != null) {
                    zzZ(str, z, zzzdg.zzXKY(), stringBuffer);
                }
                StringBuilder sbOooO0OO21 = C22226Oooo0oo.OooO0OO(str, "Encoding: ");
                sbOooO0OO21.append(zzzdg.getEncoding());
                sbOooO0OO21.append(strLineSeparator);
                stringBuffer.append(sbOooO0OO21.toString());
                zzzd5 = zzzdg.zzXKW();
            }
        }
    }

    private static String zzZ(String str, String str2, boolean z, zzZD5 zzzd5, String str3) {
        zzZDP zzzdpZzYF = zzZDP.zzYF(zzzd5);
        StringBuffer stringBuffer = new StringBuffer();
        if (zzzdpZzYF.zzXLa()) {
            try {
                zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzzdpZzYF.zzXL7());
                stringBuffer.append(str2 + str + " ApplicationSpecific[" + zzzdpZzYF.zzXL8() + "]" + str3);
                Enumeration enumerationZzXKE = zzzd4ZzYy.zzXKE();
                while (enumerationZzXKE.hasMoreElements()) {
                    zzZ(str2 + "    ", z, (zzZD5) enumerationZzXKE.nextElement(), stringBuffer);
                }
            } catch (IOException e) {
                stringBuffer.append(e);
            }
            return stringBuffer.toString();
        }
        return str2 + str + " ApplicationSpecific[" + zzzdpZzYF.zzXL8() + "] (" + zzYGI.zzVG(zzYGC.encode(zzzdpZzYF.zzXL9())) + ")" + str3;
    }
}
