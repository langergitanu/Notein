package o0oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o0oo0oOo.C31357OooO0O0;
import o0oo0ooO.InterfaceC31408OooO0OO;
import o0ooO00.C31416OooO00o;

/* JADX INFO: renamed from: o0oo0oO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31352OooOOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f111945OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC31408OooO0OO f111946OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f111947OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f111948OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Path f111949OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PointF f111950OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f111951OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final PointF f111952OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f111953OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ArrayList f111954OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f111955OooOO0O;

    /* JADX INFO: renamed from: o0oo0oO0.OooOOo0$OooO00o */
    public class OooO00o extends AbstractC20449OooO0Oo {
        public OooO00o() {
        }

        @Override // OooOOO0.AbstractC20449OooO0Oo
        public final List OooOo0o(ArrayList arrayList, C31349OooOOOO c31349OooOOOO) {
            String str;
            C31352OooOOo0 c31352OooOOo0 = C31352OooOOo0.this;
            c31352OooOOo0.f111955OooOO0O++;
            String str2 = C31349OooOOOO.f111937OooO0O0.get(c31349OooOOOO.f111939OooO00o);
            boolean zEquals = "rmoveto".equals(str2);
            ArrayList arrayList2 = c31352OooOOo0.f111945OooO;
            if (zEquals) {
                if (arrayList.size() < 2) {
                    return null;
                }
                if (c31352OooOOo0.f111953OooO0oo) {
                    arrayList2.add(new PointF(((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue()));
                    return null;
                }
                c31352OooOOo0.OooO0o0((Number) arrayList.get(0), (Number) arrayList.get(1));
                return null;
            }
            if ("vmoveto".equals(str2)) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                if (c31352OooOOo0.f111953OooO0oo) {
                    arrayList2.add(new PointF(0.0f, ((Number) arrayList.get(0)).floatValue()));
                    return null;
                }
                c31352OooOOo0.OooO0o0(0, (Number) arrayList.get(0));
                return null;
            }
            if ("hmoveto".equals(str2)) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                if (c31352OooOOo0.f111953OooO0oo) {
                    arrayList2.add(new PointF(((Number) arrayList.get(0)).floatValue(), 0.0f));
                    return null;
                }
                c31352OooOOo0.OooO0o0((Number) arrayList.get(0), 0);
                return null;
            }
            if ("rlineto".equals(str2)) {
                if (arrayList.size() < 2) {
                    return null;
                }
                c31352OooOOo0.OooO0Oo((Number) arrayList.get(0), (Number) arrayList.get(1));
                return null;
            }
            if ("hlineto".equals(str2)) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                c31352OooOOo0.OooO0Oo((Number) arrayList.get(0), 0);
                return null;
            }
            if ("vlineto".equals(str2)) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                c31352OooOOo0.OooO0Oo(0, (Number) arrayList.get(0));
                return null;
            }
            if ("rrcurveto".equals(str2)) {
                if (arrayList.size() < 6) {
                    return null;
                }
                c31352OooOOo0.OooO0o((Number) arrayList.get(0), (Number) arrayList.get(1), (Number) arrayList.get(2), (Number) arrayList.get(3), (Number) arrayList.get(4), (Number) arrayList.get(5));
                return null;
            }
            boolean zEquals2 = "closepath".equals(str2);
            PointF pointF = c31352OooOOo0.f111952OooO0oO;
            String str3 = c31352OooOOo0.f111948OooO0OO;
            String str4 = c31352OooOOo0.f111947OooO0O0;
            if (zEquals2) {
                if (c31352OooOOo0.f111949OooO0Oo.isEmpty()) {
                    Log.w("PdfBox-Android", "closepath without initial moveTo in font " + str4 + ", glyph " + str3);
                } else {
                    c31352OooOOo0.f111949OooO0Oo.close();
                }
                c31352OooOOo0.f111949OooO0Oo.moveTo(pointF.x, pointF.y);
                return null;
            }
            if ("sbw".equals(str2)) {
                if (arrayList.size() < 3) {
                    return null;
                }
                c31352OooOOo0.f111950OooO0o = new PointF(((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue());
                c31352OooOOo0.f111951OooO0o0 = ((Number) arrayList.get(2)).intValue();
                pointF.set(c31352OooOOo0.f111950OooO0o);
                return null;
            }
            if ("hsbw".equals(str2)) {
                if (arrayList.size() < 2) {
                    return null;
                }
                c31352OooOOo0.f111950OooO0o = new PointF(((Number) arrayList.get(0)).floatValue(), 0.0f);
                c31352OooOOo0.f111951OooO0o0 = ((Number) arrayList.get(1)).intValue();
                pointF.set(c31352OooOOo0.f111950OooO0o);
                return null;
            }
            if ("vhcurveto".equals(str2)) {
                if (arrayList.size() < 4) {
                    return null;
                }
                c31352OooOOo0.OooO0o(0, (Number) arrayList.get(0), (Number) arrayList.get(1), (Number) arrayList.get(2), (Number) arrayList.get(3), 0);
                return null;
            }
            if ("hvcurveto".equals(str2)) {
                if (arrayList.size() < 4) {
                    return null;
                }
                c31352OooOOo0.OooO0o((Number) arrayList.get(0), 0, (Number) arrayList.get(1), (Number) arrayList.get(2), 0, (Number) arrayList.get(3));
                return null;
            }
            if (!"seac".equals(str2)) {
                if ("setcurrentpoint".equals(str2)) {
                    if (arrayList.size() < 2) {
                        return null;
                    }
                    pointF.set(((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue());
                    return null;
                }
                if (!"callothersubr".equals(str2)) {
                    if ("div".equals(str2)) {
                        float fFloatValue = ((Number) C21505OooO0Oo.OooO00o(2, arrayList)).floatValue() / ((Number) C21505OooO0Oo.OooO00o(1, arrayList)).floatValue();
                        ArrayList arrayList3 = new ArrayList(arrayList);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList3.add(Float.valueOf(fFloatValue));
                        return arrayList3;
                    }
                    if ("hstem".equals(str2) || "vstem".equals(str2) || "hstem3".equals(str2) || "vstem3".equals(str2) || "dotsection".equals(str2) || "endchar".equals(str2)) {
                        return null;
                    }
                    if ("return".equals(str2) || "callsubr".equals(str2)) {
                        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Unexpected charstring command: ", str2, " in glyph ", str3, " of font ");
                        sbOooO0O0.append(str4);
                        Log.w("PdfBox-Android", sbOooO0O0.toString());
                        return null;
                    }
                    if (str2 != null) {
                        throw new IllegalArgumentException("Unhandled command: ".concat(str2));
                    }
                    Log.w("PdfBox-Android", "Unknown charstring command: " + c31349OooOOOO.f111939OooO00o + " in glyph " + str3 + " of font " + str4);
                    return null;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                int iIntValue = ((Number) arrayList.get(0)).intValue();
                if (iIntValue != 0) {
                    if (iIntValue == 1) {
                        c31352OooOOo0.f111953OooO0oo = true;
                        return null;
                    }
                    Log.w("PdfBox-Android", "Invalid callothersubr parameter: " + iIntValue);
                    return null;
                }
                c31352OooOOo0.f111953OooO0oo = false;
                if (arrayList2.size() < 7) {
                    StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("flex without moveTo in font ", str4, ", glyph ", str3, ", command ");
                    sbOooO0O02.append(c31352OooOOo0.f111955OooOO0O);
                    Log.w("PdfBox-Android", sbOooO0O02.toString());
                    return null;
                }
                PointF pointF2 = (PointF) arrayList2.get(0);
                pointF2.set(pointF.x + pointF2.x, pointF.y + pointF2.y);
                PointF pointF3 = (PointF) arrayList2.get(1);
                pointF3.set(pointF2.x + pointF3.x, pointF2.y + pointF3.y);
                pointF3.set(pointF3.x - pointF.x, pointF3.y - pointF.y);
                PointF pointF4 = (PointF) arrayList2.get(1);
                PointF pointF5 = (PointF) arrayList2.get(2);
                PointF pointF6 = (PointF) arrayList2.get(3);
                c31352OooOOo0.OooO0o(Float.valueOf(pointF4.x), Float.valueOf(pointF4.y), Float.valueOf(pointF5.x), Float.valueOf(pointF5.y), Float.valueOf(pointF6.x), Float.valueOf(pointF6.y));
                PointF pointF7 = (PointF) arrayList2.get(4);
                PointF pointF8 = (PointF) arrayList2.get(5);
                PointF pointF9 = (PointF) arrayList2.get(6);
                c31352OooOOo0.OooO0o(Float.valueOf(pointF7.x), Float.valueOf(pointF7.y), Float.valueOf(pointF8.x), Float.valueOf(pointF8.y), Float.valueOf(pointF9.x), Float.valueOf(pointF9.y));
                arrayList2.clear();
                return null;
            }
            if (arrayList.size() < 5) {
                return null;
            }
            Number number = (Number) arrayList.get(0);
            Number number2 = (Number) arrayList.get(1);
            Number number3 = (Number) arrayList.get(2);
            Number number4 = (Number) arrayList.get(3);
            Number number5 = (Number) arrayList.get(4);
            InterfaceC31408OooO0OO interfaceC31408OooO0OO = c31352OooOOo0.f111946OooO00o;
            String str5 = (String) ((HashMap) C31357OooO0O0.f111966OooO0o0.f81814OooO0O0).get(Integer.valueOf(number4.intValue()));
            if (str5 == null) {
                str5 = ".notdef";
            }
            try {
                c31352OooOOo0.f111949OooO0Oo.op(interfaceC31408OooO0OO.OooO0Oo(str5).OooO00o(), Path.Op.UNION);
            } catch (IOException unused) {
                Log.w("PdfBox-Android", "invalid seac character in glyph " + str3 + " of font " + str4);
            }
            String str6 = (String) ((HashMap) C31357OooO0O0.f111966OooO0o0.f81814OooO0O0).get(Integer.valueOf(number5.intValue()));
            try {
                C31352OooOOo0 c31352OooOOo0OooO0Oo = interfaceC31408OooO0OO.OooO0Oo(str6 != null ? str6 : ".notdef");
                double dFloatValue = (c31352OooOOo0.f111950OooO0o.x + number2.floatValue()) - number.floatValue();
                double dFloatValue2 = c31352OooOOo0.f111950OooO0o.y + number3.floatValue();
                C31416OooO00o c31416OooO00o = new C31416OooO00o();
                str = "PdfBox-Android";
                try {
                    c31416OooO00o.f112182OooOoO = 1.0d;
                    c31416OooO00o.f112181OooOo0o = 1.0d;
                    c31416OooO00o.f112180OooOo = 0.0d;
                    c31416OooO00o.f112183OooOoO0 = 0.0d;
                    c31416OooO00o.f112184OooOoOO = dFloatValue;
                    c31416OooO00o.f112186OooOoo0 = dFloatValue2;
                    if (dFloatValue == 0.0d && dFloatValue2 == 0.0d) {
                        c31416OooO00o.f112185OooOoo = 0;
                    } else {
                        c31416OooO00o.f112185OooOoo = 1;
                    }
                    c31352OooOOo0.f111949OooO0Oo.op(c31352OooOOo0OooO0Oo.OooO00o(), Path.Op.UNION);
                    return null;
                } catch (IOException unused2) {
                    Log.w(str, "invalid seac character in glyph " + str3 + " of font " + str4);
                    return null;
                }
            } catch (IOException unused3) {
                str = "PdfBox-Android";
            }
        }
    }

    public C31352OooOOo0() {
        throw null;
    }

    public C31352OooOOo0(InterfaceC31408OooO0OO interfaceC31408OooO0OO, String str, String str2) {
        this.f111949OooO0Oo = null;
        this.f111951OooO0o0 = 0;
        this.f111950OooO0o = null;
        this.f111952OooO0oO = null;
        this.f111953OooO0oo = false;
        this.f111945OooO = new ArrayList();
        this.f111946OooO00o = interfaceC31408OooO0OO;
        this.f111947OooO0O0 = str;
        this.f111948OooO0OO = str2;
        this.f111952OooO0oO = new PointF(0.0f, 0.0f);
    }

    public final Path OooO00o() {
        if (this.f111949OooO0Oo == null) {
            OooO0OO();
        }
        return this.f111949OooO0Oo;
    }

    public final int OooO0O0() {
        if (this.f111949OooO0Oo == null) {
            OooO0OO();
        }
        return this.f111951OooO0o0;
    }

    public final void OooO0OO() {
        this.f111949OooO0Oo = new Path();
        this.f111950OooO0o = new PointF(0.0f, 0.0f);
        this.f111951OooO0o0 = 0;
        new OooO00o().OooOo(this.f111954OooOO0);
    }

    public final void OooO0Oo(Number number, Number number2) {
        PointF pointF = this.f111952OooO0oO;
        float fFloatValue = number.floatValue() + pointF.x;
        float fFloatValue2 = number2.floatValue() + pointF.y;
        if (this.f111949OooO0Oo.isEmpty()) {
            Log.w("PdfBox-Android", "rlineTo without initial moveTo in font " + this.f111947OooO0O0 + ", glyph " + this.f111948OooO0OO);
            this.f111949OooO0Oo.moveTo(fFloatValue, fFloatValue2);
        } else {
            this.f111949OooO0Oo.lineTo(fFloatValue, fFloatValue2);
        }
        pointF.set(fFloatValue, fFloatValue2);
    }

    public final void OooO0o(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        PointF pointF = this.f111952OooO0oO;
        float fFloatValue = number.floatValue() + pointF.x;
        float fFloatValue2 = number2.floatValue() + pointF.y;
        float fFloatValue3 = number3.floatValue() + fFloatValue;
        float fFloatValue4 = number4.floatValue() + fFloatValue2;
        float fFloatValue5 = number5.floatValue() + fFloatValue3;
        float fFloatValue6 = number6.floatValue() + fFloatValue4;
        if (this.f111949OooO0Oo.isEmpty()) {
            Log.w("PdfBox-Android", "rrcurveTo without initial moveTo in font " + this.f111947OooO0O0 + ", glyph " + this.f111948OooO0OO);
            this.f111949OooO0Oo.moveTo(fFloatValue5, fFloatValue6);
        } else {
            this.f111949OooO0Oo.cubicTo(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6);
        }
        pointF.set(fFloatValue5, fFloatValue6);
    }

    public final void OooO0o0(Number number, Number number2) {
        PointF pointF = this.f111952OooO0oO;
        float fFloatValue = number.floatValue() + pointF.x;
        float fFloatValue2 = number2.floatValue() + pointF.y;
        this.f111949OooO0Oo.moveTo(fFloatValue, fFloatValue2);
        pointF.set(fFloatValue, fFloatValue2);
    }

    public final String toString() {
        return this.f111954OooOO0.toString().replace("|", IOUtils.LINE_SEPARATOR_UNIX).replace(",", " ");
    }
}
