package o0oooO0O;

import Oooo0.o0OoOo0;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22221Oooo0O0;
import com.aspose.words.ControlChar;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import o00oo0Oo.C25698OooOOOO;
import o0oo0ooo.C31412OooO00o;
import o0ooO00.C31416OooO00o;
import o0ooO0OO.C31431OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31437OooO0o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31445OooOOO0;
import o0ooO0Oo.C31447OooOOOo;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31450OooOOoo;
import o0ooO0oo.C31491OooO0oO;
import o0ooOO0O.C31609OooO0Oo;
import o0ooOO0o.C31610OooO;
import o0ooOO0o.C31617OooO0oO;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31669OooO00o;
import o0ooOoo.C31676OooO0oo;
import o0ooo0.AbstractC31720OooOOOo;
import o0ooo0.AbstractC31726OooOo0O;
import o0ooo0.C31722OooOOo0;
import o0ooo0.C31730OooOoOO;
import o0ooo0.C31732OooOoo0;
import o0ooo0.InterfaceC31731OooOoo;
import o0ooo0o.AbstractC31763OooO0O0;
import o0ooo0o.C31762OooO00o;
import o0ooo0o.C31765OooO0Oo;
import o0ooo0oo.C31782OooOOOo;
import o0oooO00.C31803OooOO0o;
import o0oooO00.C31804OooOOO;
import o0oooO00.C31805OooOOO0;
import o0oooO00.C31806OooOOOO;
import o0oooO00.C31807OooOOOo;
import o0oooO00.C31808OooOOo0;
import o0oooOO0.C31835OooO00o;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0oooO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31810OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC31826OooOOo0 f113433OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C31816OooO0oO f113434OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f113435OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C31431OooO00o f113430OooO0Oo = C31431OooO00o.OooO00o("BMC");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C31431OooO00o f113432OooO0o0 = C31431OooO00o.OooO00o("EMC");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final float[] f113431OooO0o = {0.6f, 0.75686276f, 0.84313726f};

    public C31810OooO00o(AbstractC31826OooOOo0 abstractC31826OooOOo0) throws IOException {
        C31610OooO c31610OooOOooO0OO;
        this.f113433OooO00o = abstractC31826OooOOo0;
        C31811OooO0O0 c31811OooO0O0 = abstractC31826OooOOo0.f113444OooOo0o;
        if (c31811OooO0O0.OooO00o() != null) {
            C31610OooO c31610OooOOooO00o = c31811OooO0O0.OooO00o();
            Iterator it = ((ArrayList) abstractC31826OooOOo0.OooO0Oo()).iterator();
            while (it.hasNext()) {
                C31807OooOOOo c31807OooOOOoOooO0O0 = ((C31803OooOO0o) it.next()).OooO0O0();
                if (c31807OooOOOoOooO0O0 != null && (c31610OooOOooO0OO = c31807OooOOOoOooO0O0.OooO0OO()) != null) {
                    C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112300o0000o;
                    C31436OooO0Oo c31436OooO0Oo = c31610OooOOooO0OO.f113005OooOo0o;
                    C31436OooO0Oo c31436OooO0OoOooo0OO = c31436OooO0Oo.Oooo0OO(c31441OooOO0);
                    C31436OooO0Oo c31436OooO0OoOooo0OO2 = c31610OooOOooO00o.f113005OooOo0o.Oooo0OO(c31441OooOO0);
                    C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO0);
                    for (C31441OooOO0 c31441OooOO02 : c31436OooO0Oo2 == null ? Collections.EMPTY_SET : c31436OooO0Oo2.f112222OooOoO0.keySet()) {
                        try {
                            if (c31610OooOOooO00o.OooO0O0(c31441OooOO02) == null) {
                                Log.d("PdfBox-Android", "Adding font resource " + c31441OooOO02 + " from widget to AcroForm");
                                c31436OooO0OoOooo0OO2.o000OoOO(c31441OooOO02, c31436OooO0OoOooo0OO.o0OoO0o(c31441OooOO02));
                            }
                        } catch (IOException unused) {
                            Log.w("PdfBox-Android", "Unable to match field level font with AcroForm font");
                        }
                    }
                }
            }
        }
        try {
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0O0 = abstractC31826OooOOo0.OooO0O0(C31441OooOO0.f112443o0OOO0o);
            this.f113434OooO0O0 = new C31816OooO0oO(abstractC31434OooO0O0OooO0O0 instanceof C31450OooOOoo ? (C31450OooOOoo) abstractC31434OooO0O0OooO0O0 : null, c31811OooO0O0.OooO00o());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Could not process default appearance string '");
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0O02 = abstractC31826OooOOo0.OooO0O0(C31441OooOO0.f112443o0OOO0o);
            sb.append(abstractC31434OooO0O0OooO0O02 instanceof C31450OooOOoo ? ((C31450OooOOoo) abstractC31434OooO0O0OooO0O02).OooOooo() : null);
            sb.append("' for field '");
            sb.append(abstractC31826OooOOo0.OooO00o());
            sb.append("'");
            throw new IOException(sb.toString(), e);
        }
    }

    public static C31676OooO0oo OooO00o(C31676OooO0oo c31676OooO0oo, float f) {
        float fOooO0O0 = c31676OooO0oo.OooO0O0() + f;
        float fOooO0OO = c31676OooO0oo.OooO0OO() + f;
        float f2 = f * 2.0f;
        return new C31676OooO0oo(fOooO0O0, fOooO0OO, c31676OooO0oo.OooO0o() - f2, c31676OooO0oo.OooO00o() - f2);
    }

    public static C31676OooO0oo OooO0O0(C31803OooOO0o c31803OooOO0o, C31807OooOOOo c31807OooOOOo) {
        C31676OooO0oo c31676OooO0ooOooO0O0 = c31807OooOOOo.OooO0O0();
        if (c31676OooO0ooOooO0O0 != null) {
            return c31676OooO0ooOooO0O0;
        }
        C31676OooO0oo c31676OooO0ooOooO0OO = c31803OooOO0o.OooO0OO();
        c31676OooO0ooOooO0OO.getClass();
        C31676OooO0oo c31676OooO0oo = new C31676OooO0oo();
        c31676OooO0oo.OooO0oO(c31676OooO0ooOooO0OO.OooO0o());
        c31676OooO0oo.OooO0oo(c31676OooO0ooOooO0OO.OooO00o());
        return c31676OooO0oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float OooO0OO(AbstractC31720OooOOOo abstractC31720OooOOOo, int i) throws IOException {
        C31730OooOoOO c31730OooOoOO;
        Path pathOooOOoo = null;
        if (abstractC31720OooOOOo instanceof C31732OooOoo0) {
            C31732OooOoo0 c31732OooOoo0 = (C31732OooOoo0) abstractC31720OooOOOo;
            String strOooO0Oo = c31732OooOoo0.f113325OooOooO.OooO0Oo(i);
            if (c31732OooOoo0.f113354Oooo00O == null) {
                c31732OooOoo0.f113354Oooo00O = c31732OooOoo0.f113309OooOo0o.Oooo0OO(C31441OooOO0.f112271Oooooo);
            }
            C31436OooO0Oo c31436OooO0Oo = c31732OooOoo0.f113354Oooo00O;
            if (c31436OooO0Oo == null) {
                c31730OooOoOO = null;
                if (c31730OooOoOO != null) {
                    C31412OooO00o c31412OooO00oOooO0OO = c31732OooOoo0.OooO0OO();
                    C31676OooO0oo c31676OooO0ooOooO0O0 = c31730OooOoOO.OooO0O0();
                    if (c31676OooO0ooOooO0O0 != null) {
                        C31437OooO0o c31437OooO0o = new C31437OooO0o(Math.max(c31412OooO00oOooO0OO.f112165OooO00o, c31676OooO0ooOooO0O0.OooO0O0()));
                        C31433OooO00o c31433OooO00o = c31676OooO0ooOooO0O0.f113215OooOo0o;
                        c31433OooO00o.o0000O0O(0, c31437OooO0o);
                        c31433OooO00o.o0000O0O(1, new C31437OooO0o(Math.max(c31412OooO00oOooO0OO.f112166OooO0O0, c31676OooO0ooOooO0O0.OooO0OO())));
                        c31676OooO0ooOooO0O0.OooO0oO(Math.min(c31412OooO00oOooO0OO.f112167OooO0OO, c31676OooO0ooOooO0O0.OooO0Oo()));
                        c31676OooO0ooOooO0O0.OooO0oo(Math.min(c31412OooO00oOooO0OO.f112168OooO0Oo, c31676OooO0ooOooO0O0.OooO0o0()));
                        float fOooO0O0 = c31676OooO0ooOooO0O0.OooO0O0();
                        float fOooO0OO = c31676OooO0ooOooO0O0.OooO0OO();
                        float fOooO0Oo = c31676OooO0ooOooO0O0.OooO0Oo();
                        float fOooO0o0 = c31676OooO0ooOooO0O0.OooO0o0();
                        Path path = new Path();
                        path.moveTo(fOooO0O0, fOooO0OO);
                        path.lineTo(fOooO0Oo, fOooO0OO);
                        path.lineTo(fOooO0Oo, fOooO0o0);
                        path.lineTo(fOooO0O0, fOooO0o0);
                        path.close();
                        pathOooOOoo = path;
                    }
                }
            } else {
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.OooOooo(strOooO0Oo));
                C31448OooOOo c31448OooOOo = abstractC31434OooO0O0O0000O0O instanceof C31448OooOOo ? (C31448OooOOo) abstractC31434OooO0O0O0000O0O : null;
                if (c31448OooOOo != null) {
                    c31730OooOoOO = new C31730OooOoOO(c31448OooOOo);
                }
                if (c31730OooOoOO != null) {
                }
            }
        } else if (abstractC31720OooOOOo instanceof InterfaceC31731OooOoo) {
            pathOooOOoo = ((InterfaceC31731OooOoo) abstractC31720OooOOOo).getPath(i);
        } else if (abstractC31720OooOOOo instanceof AbstractC31726OooOo0O) {
            AbstractC31726OooOo0O abstractC31726OooOo0O = (AbstractC31726OooOo0O) abstractC31720OooOOOo;
            pathOooOOoo = abstractC31726OooOo0O.OooOOoo(abstractC31726OooOo0O.f113325OooOooO.OooO0Oo(i));
        } else {
            Log.w("PdfBox-Android", "Unknown font class: " + abstractC31720OooOOOo.getClass());
        }
        if (pathOooOOoo == null) {
            return -1.0f;
        }
        RectF rectF = new RectF();
        pathOooOOoo.computeBounds(rectF, true);
        return rectF.height();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x041a A[LOOP:19: B:164:0x0418->B:165:0x041a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f3 A[LOOP:1: B:196:0x04eb->B:198:0x04f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0d8f  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0efb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x04f7 A[EDGE_INSN: B:550:0x04f7->B:199:0x04f7 BREAK  A[LOOP:1: B:196:0x04eb->B:198:0x04f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0cfc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v107, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v108, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v113, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v127 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo(String str) throws IOException {
        int i;
        Iterator it;
        boolean z;
        int iO000O00O;
        String str2;
        C31816OooO0oO c31816OooO0oO;
        String str3;
        String str4;
        float fOooO0o0;
        float fOooO0Oo;
        C31416OooO00o c31416OooO00oOooO00o;
        C31807OooOOOo c31807OooOOOoOooO00o;
        float f;
        ByteArrayOutputStream byteArrayOutputStream;
        float f2;
        float fOooO00o;
        C31816OooO0oO c31816OooO0oO2;
        C31610OooO c31610OooOOooO0OO;
        C31491OooO0oO c31491OooO0oO;
        Object objOooOo0O;
        ArrayList arrayList;
        int iIndexOf;
        C31617OooO0oO c31617OooO0oO;
        Stack<AbstractC31720OooOOOo> stack;
        Stack<AbstractC31763OooO0O0> stack2;
        C31676OooO0oo c31676OooO0oo;
        Stack<AbstractC31763OooO0O0> stack3;
        C31807OooOOOo c31807OooOOOo;
        ByteArrayOutputStream byteArrayOutputStream2;
        C31609OooO0Oo c31609OooO0Oo;
        Stack<AbstractC31763OooO0O0> stack4;
        String str5;
        float fMin;
        String str6;
        float f3;
        boolean z2;
        ArrayList arrayList2;
        float fOooO0OO;
        float f4;
        float fMin2;
        String str7;
        String str8;
        ArrayList arrayList3;
        AbstractC31443OooOO0o abstractC31443OooOO0o;
        int iOooo0;
        ArrayList arrayList4;
        float f5;
        C31436OooO0Oo c31436OooO0Oo;
        int[] iArr_values;
        int length;
        int i2;
        int i3;
        Iterator it2;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        int[] iArr;
        int i4;
        String str9;
        boolean z4;
        C31818OooOO0 c31818OooOO0;
        ?? arrayList5;
        boolean z5;
        float f12;
        ArrayList arrayList6;
        int i5;
        String str10;
        C31676OooO0oo c31676OooO0ooOooO0O0;
        String str11 = "Error: You must call beginText() before calling endText.";
        String str12 = "ET";
        AbstractC31826OooOOo0 abstractC31826OooOOo0 = this.f113433OooO00o;
        C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) abstractC31826OooOOo0.f113445OooOoO0.o0000O0O(C31441OooOO0.f112241OooOoo);
        C31782OooOOOo c31782OooOOOo = c31436OooO0Oo2 != null ? new C31782OooOOOo(c31436OooO0Oo2) : null;
        C31811OooO0O0 c31811OooO0O0 = abstractC31826OooOOo0.f113444OooOo0o;
        if (c31782OooOOOo != null) {
            C31436OooO0Oo c31436OooO0Oo3 = (C31436OooO0Oo) c31782OooOOOo.f113418OooOo0o.o0000O0O(C31441OooOO0.f112293o0000OO0);
            if ((c31436OooO0Oo3 != null ? Ooooo00.OooOOO.OooO0O0(c31436OooO0Oo3) : null) != null) {
                c31811OooO0O0.getClass();
                Log.i("PdfBox-Android", "Field contains a formatting action but no ScriptingHandler has been supplied - formatted value might be incorrect");
            }
        }
        this.f113435OooO0OO = str;
        boolean z6 = abstractC31826OooOOo0 instanceof C31824OooOOOo;
        String str13 = " ";
        if (z6) {
            i = 3;
            if (!((C31824OooOOOo) abstractC31826OooOOo0).f113445OooOoO0.o0000o0(C31441OooOO0.f112292o0000OO, 4096)) {
                this.f113435OooO0OO = this.f113435OooO0OO.replaceAll("\\u000D\\u000A|[\\u000A\\u000B\\u000C\\u000D\\u0085\\u2028\\u2029]", " ");
            }
        } else {
            i = 3;
        }
        Iterator it3 = ((ArrayList) abstractC31826OooOOo0.OooO0Oo()).iterator();
        while (it3.hasNext()) {
            C31803OooOO0o c31803OooOO0o = (C31803OooOO0o) it3.next();
            C31436OooO0Oo c31436OooO0Oo4 = c31803OooOO0o.f113422OooOo0o;
            c31436OooO0Oo4.getClass();
            if (c31436OooO0Oo4.f112222OooOoO0.containsKey(C31441OooOO0.OooOooo("PMD"))) {
                Log.w("PdfBox-Android", "widget of field " + abstractC31826OooOOo0.OooO00o() + " is a PaperMetaData widget, no appearance stream created");
            } else {
                C31816OooO0oO c31816OooO0oO3 = this.f113434OooO0O0;
                C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112443o0OOO0o;
                C31436OooO0Oo c31436OooO0Oo5 = c31803OooOO0o.f113422OooOo0o;
                if (c31436OooO0Oo5.o0000O0O(c31441OooOO0) != null) {
                    this.f113434OooO0O0 = new C31816OooO0oO((C31450OooOOoo) c31436OooO0Oo5.o0000O0O(c31441OooOO0), c31811OooO0O0.OooO00o());
                }
                if (c31803OooOO0o.OooO0OO() == null) {
                    c31436OooO0Oo5.o000OOoO(C31441OooOO0.f112246Oooo0);
                    Log.w("PdfBox-Android", "widget of field " + abstractC31826OooOOo0.OooO00o() + " has no rectangle, no appearance stream created");
                } else {
                    C31804OooOOO c31804OooOOOOooO00o = c31803OooOO0o.OooO00o();
                    if (c31804OooOOOOooO00o == null) {
                        c31804OooOOOOooO00o = new C31804OooOOO();
                        c31436OooO0Oo5.o000OoOo(C31441OooOO0.f112246Oooo0, c31804OooOOOOooO00o);
                    }
                    C31806OooOOOO c31806OooOOOOOooO00o = c31804OooOOOOooO00o.OooO00o();
                    float f13 = 0.0f;
                    if (c31806OooOOOOOooO00o != null && (c31806OooOOOOOooO00o.f113425OooOo0o instanceof C31448OooOOo) && (c31676OooO0ooOooO0O0 = c31806OooOOOOOooO00o.OooO00o().OooO0O0()) != null && Math.abs(c31676OooO0ooOooO0O0.OooO0o()) > 0.0f && Math.abs(c31676OooO0ooOooO0O0.OooO00o()) > 0.0f) {
                        c31807OooOOOoOooO00o = c31806OooOOOOOooO00o.OooO00o();
                        str3 = str11;
                        str4 = str12;
                        it = it3;
                        c31816OooO0oO = c31816OooO0oO3;
                        z = z6;
                        str2 = str13;
                    } else {
                        C31807OooOOOo c31807OooOOOo2 = new C31807OooOOOo(c31811OooO0O0.f113437OooOo0o, C31441OooOO0.f112338o000Ooo);
                        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo5.o0000O0O(C31441OooOO0.f112353o000o0oo);
                        C31805OooOOO0 c31805OooOOO0 = abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo ? new C31805OooOOO0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O) : null;
                        if (c31805OooOOO0 != null) {
                            it = it3;
                            z = z6;
                            iO000O00O = c31805OooOOO0.f113424OooOo0o.o000O00O(C31441OooOO0.f112456oo0o0O0, null, 0);
                        } else {
                            it = it3;
                            z = z6;
                            iO000O00O = 0;
                        }
                        C31676OooO0oo c31676OooO0ooOooO0OO = c31803OooOO0o.OooO0OO();
                        String str14 = str13;
                        double d = iO000O00O;
                        double radians = Math.toRadians(d);
                        float fCos = (float) Math.cos(radians);
                        float fSin = (float) Math.sin(radians);
                        C31837OooO0OO c31837OooO0OO = new C31837OooO0OO(fCos, fSin, -fSin, fCos, 0.0f, 0.0f);
                        float fOooO0o = c31676OooO0ooOooO0OO.OooO0o();
                        float fOooO00o2 = c31676OooO0ooOooO0OO.OooO00o();
                        float[] fArr = c31837OooO0OO.f113464OooOo0o;
                        f13 = 0.0f;
                        str2 = str14;
                        c31816OooO0oO = c31816OooO0oO3;
                        str3 = str11;
                        str4 = str12;
                        PointF pointF = new PointF(OooOO0.OooO0O0.OooO00o(fOooO00o2, fArr[i], fOooO0o * fArr[0], fArr[6]), OooOO0.OooO0O0.OooO00o(fOooO00o2, fArr[4], fOooO0o * fArr[1], fArr[7]));
                        C31676OooO0oo c31676OooO0oo2 = new C31676OooO0oo(Math.abs(pointF.x), Math.abs(pointF.y));
                        C31668OooO c31668OooO = c31807OooOOOo2.f113426OooOo0o;
                        c31668OooO.f113202OooOo0o.o000OoOO(C31441OooOO0.f112256OoooO, c31676OooO0oo2.f113215OooOo0o);
                        if (iO000O00O == 0) {
                            c31416OooO00oOooO00o = new C31416OooO00o();
                        } else {
                            if (iO000O00O == 90) {
                                fOooO0o0 = c31676OooO0oo2.OooO0o0();
                                fOooO0Oo = 0.0f;
                            } else if (iO000O00O == 180) {
                                float fOooO0o02 = c31676OooO0oo2.OooO0o0();
                                fOooO0Oo = c31676OooO0oo2.OooO0Oo();
                                fOooO0o0 = fOooO0o02;
                            } else if (iO000O00O != 270) {
                                fOooO0o0 = 0.0f;
                                fOooO0Oo = 0.0f;
                            } else {
                                fOooO0Oo = c31676OooO0oo2.OooO0Oo();
                                fOooO0o0 = 0.0f;
                            }
                            double radians2 = Math.toRadians(d);
                            float fCos2 = (float) Math.cos(radians2);
                            float fSin2 = (float) Math.sin(radians2);
                            c31416OooO00oOooO00o = new C31837OooO0OO(fCos2, fSin2, -fSin2, fCos2, fOooO0o0, fOooO0Oo).OooO00o();
                        }
                        int i6 = c31416OooO00oOooO00o.f112185OooOoo;
                        if (i6 == -1) {
                            double d2 = c31416OooO00oOooO00o.f112181OooOo0o;
                            double d3 = c31416OooO00oOooO00o.f112183OooOoO0;
                            double d4 = d2 * d3;
                            double d5 = c31416OooO00oOooO00o.f112180OooOo;
                            double d6 = c31416OooO00oOooO00o.f112182OooOoO;
                            if ((d5 * d6) + d4 != 0.0d) {
                                i6 = 32;
                            } else {
                                if (c31416OooO00oOooO00o.f112184OooOoOO != 0.0d || c31416OooO00oOooO00o.f112186OooOoo0 != 0.0d) {
                                    i6 = 1;
                                } else if (d2 == 1.0d && d6 == 1.0d && d3 == 0.0d && d5 == 0.0d) {
                                    i6 = 0;
                                } else {
                                    i6 = 0;
                                }
                                if ((d2 * d6) - (d3 * d5) < 0.0d) {
                                    i6 |= 64;
                                }
                                double d7 = (d5 * d5) + (d2 * d2);
                                if (d7 != (d6 * d6) + (d3 * d3)) {
                                    i6 |= 4;
                                } else if (d7 != 1.0d) {
                                    i6 |= 2;
                                }
                                if ((d2 == 0.0d && d6 == 0.0d) || (d5 == 0.0d && d3 == 0.0d && (d2 < 0.0d || d6 < 0.0d))) {
                                    i6 |= 8;
                                } else if (d3 != 0.0d || d5 != 0.0d) {
                                    i6 |= 16;
                                }
                            }
                        }
                        boolean z7 = i6 == 0;
                        C31448OooOOo c31448OooOOo = c31668OooO.f113202OooOo0o;
                        if (!z7) {
                            C31433OooO00o c31433OooO00o = new C31433OooO00o();
                            double d8 = c31416OooO00oOooO00o.f112181OooOo0o;
                            double d9 = c31416OooO00oOooO00o.f112180OooOo;
                            double d10 = c31416OooO00oOooO00o.f112183OooOoO0;
                            double d11 = c31416OooO00oOooO00o.f112182OooOoO;
                            double d12 = c31416OooO00oOooO00o.f112184OooOoOO;
                            double d13 = c31416OooO00oOooO00o.f112186OooOoo0;
                            double[] dArr = new double[6];
                            dArr[0] = d8;
                            dArr[1] = d9;
                            dArr[2] = d10;
                            dArr[i] = d11;
                            dArr[4] = d12;
                            dArr[5] = d13;
                            int i7 = 0;
                            for (int i8 = 6; i7 < i8; i8 = 6) {
                                c31433OooO00o.OooOooo(new C31437OooO0o((float) dArr[i7]));
                                i7++;
                            }
                            c31448OooOOo.o000OoOO(C31441OooOO0.f112348o000o0OO, c31433OooO00o);
                        }
                        c31448OooOOo.o000Oo(C31441OooOO0.f112315o000O0O, 1);
                        new HashMap();
                        C31436OooO0Oo c31436OooO0Oo6 = new C31436OooO0Oo();
                        C31448OooOOo c31448OooOOo2 = c31668OooO.f113202OooOo0o;
                        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112389o00O0Oo0;
                        c31448OooOOo2.getClass();
                        c31448OooOOo2.o000OoOO(c31441OooOO02, c31436OooO0Oo6);
                        c31804OooOOOOooO00o.f113423OooOo0o.o000OoOo(C31441OooOO0.f112357o000oo0, c31807OooOOOo2);
                        c31807OooOOOoOooO00o = c31807OooOOOo2;
                    }
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo5.o0000O0O(C31441OooOO0.f112353o000o0oo);
                    C31805OooOOO0 c31805OooOOO02 = abstractC31434OooO0O0O0000O0O2 instanceof C31436OooO0Oo ? new C31805OooOOO0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O2) : null;
                    C31668OooO c31668OooO2 = c31807OooOOOoOooO00o.f113426OooOo0o;
                    if (c31805OooOOO02 == null) {
                        f = 2.0f;
                        if (c31668OooO2.f113202OooOo0o.o000O00O(C31441OooOO0.f112340o000OooO, null, 0) != 0) {
                            f2 = 1.0f;
                        }
                        c31816OooO0oO2 = this.f113434OooO0O0;
                        c31816OooO0oO2.getClass();
                        c31610OooOOooO0OO = c31807OooOOOoOooO00o.OooO0OO();
                        if (c31610OooOOooO0OO == null) {
                            c31610OooOOooO0OO = new C31610OooO();
                            c31668OooO2.f113202OooOo0o.o000OoOo(C31441OooOO0.f112389o00O0Oo0, c31610OooOOooO0OO);
                        }
                        if (c31610OooOOooO0OO.OooO0O0(c31816OooO0oO2.f113439OooO0O0) == null) {
                            C31441OooOO0 c31441OooOO03 = c31816OooO0oO2.f113439OooO0O0;
                            AbstractC31720OooOOOo abstractC31720OooOOOo = c31816OooO0oO2.f113440OooO0OO;
                            C31441OooOO0 c31441OooOO04 = C31441OooOO0.f112300o0000o;
                            C31436OooO0Oo c31436OooO0Oo7 = c31610OooOOooO0OO.f113005OooOo0o;
                            C31436OooO0Oo c31436OooO0Oo8 = (C31436OooO0Oo) c31436OooO0Oo7.o0000O0O(c31441OooOO04);
                            if (c31436OooO0Oo8 == null) {
                                c31436OooO0Oo8 = new C31436OooO0Oo();
                                c31436OooO0Oo7.o000OoOO(c31441OooOO04, c31436OooO0Oo8);
                            }
                            c31436OooO0Oo8.o000OoOo(c31441OooOO03, abstractC31720OooOOOo);
                        }
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        C31609OooO0Oo c31609OooO0Oo2 = new C31609OooO0Oo(byteArrayOutputStream3);
                        c31491OooO0oO = new C31491OooO0oO(c31807OooOOOoOooO00o);
                        while (true) {
                            objOooOo0O = c31491OooO0oO.OooOo0O();
                            arrayList = c31491OooO0oO.f112664OooO0o0;
                            if (objOooOo0O != null) {
                                break;
                            } else {
                                arrayList.add(objOooOo0O);
                            }
                        }
                        C31431OooO00o c31431OooO00o = f113430OooO0Oo;
                        iIndexOf = arrayList.indexOf(c31431OooO00o);
                        String str15 = IOUtils.LINE_SEPARATOR_UNIX;
                        ByteArrayOutputStream byteArrayOutputStream4 = c31609OooO0Oo2.f113003OooO00o;
                        if (iIndexOf != -1) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                c31609OooO0Oo2.OooO00o(it4.next());
                            }
                            Object[] objArr = {C31441OooOO0.f112455oo0O, c31431OooO00o};
                            int i9 = 0;
                            for (int i10 = 2; i9 < i10; i10 = 2) {
                                c31609OooO0Oo2.OooO00o(objArr[i9]);
                                i9++;
                            }
                            byteArrayOutputStream4.write(IOUtils.LINE_SEPARATOR_UNIX.getBytes(C31835OooO00o.f113456OooO00o));
                        } else {
                            Iterator it5 = arrayList.subList(0, iIndexOf + 1).iterator();
                            while (it5.hasNext()) {
                                c31609OooO0Oo2.OooO00o(it5.next());
                            }
                        }
                        c31617OooO0oO = new C31617OooO0oO(c31811OooO0O0.f113437OooOo0o, c31807OooOOOoOooO00o, byteArrayOutputStream3);
                        C31676OooO0oo c31676OooO0ooOooO0O02 = OooO0O0(c31803OooOO0o, c31807OooOOOoOooO00o);
                        float fOooO00o3 = c31803OooOO0o.OooO0Oo() == null ? c31803OooOO0o.OooO0Oo().OooO00o() : f13;
                        float f14 = f2;
                        C31676OooO0oo c31676OooO0ooOooO00o = OooO00o(c31676OooO0ooOooO0O02, Math.max(f14, fOooO00o3));
                        C31676OooO0oo c31676OooO0ooOooO00o2 = OooO00o(c31676OooO0ooOooO00o, Math.max(f14, fOooO00o3));
                        if (c31617OooO0oO.f113028OooOoO) {
                            Log.w("PdfBox-Android", "Saving the graphics state is not allowed within text objects.");
                        }
                        stack = c31617OooO0oO.f113030OooOoOO;
                        if (!stack.isEmpty()) {
                            stack.push(stack.peek());
                        }
                        stack2 = c31617OooO0oO.f113031OooOoo;
                        if (stack2.isEmpty()) {
                            c31676OooO0oo = c31676OooO0ooOooO00o;
                            stack2.push(stack2.peek());
                        } else {
                            c31676OooO0oo = c31676OooO0ooOooO00o;
                        }
                        stack3 = c31617OooO0oO.f113032OooOoo0;
                        if (stack3.isEmpty()) {
                            c31807OooOOOo = c31807OooOOOoOooO00o;
                            stack3.push(stack3.peek());
                        } else {
                            c31807OooOOOo = c31807OooOOOoOooO00o;
                        }
                        c31617OooO0oO.Oooo0OO("q");
                        C31811OooO0O0 c31811OooO0O02 = c31811OooO0O0;
                        c31617OooO0oO.OooO00o(c31676OooO0oo.OooO0O0(), c31676OooO0oo.OooO0OO(), c31676OooO0oo.OooO0o(), c31676OooO0oo.OooO00o());
                        if (!c31617OooO0oO.f113028OooOoO) {
                            throw new IllegalStateException("Error: clip is not allowed within a text block.");
                        }
                        c31617OooO0oO.Oooo0OO("W");
                        c31617OooO0oO.Oooo0OO(BackupFile.PREFIX_NOTE_DIR);
                        AbstractC31720OooOOOo abstractC31720OooOOOo2 = this.f113434OooO0O0.f113440OooO0OO;
                        if (abstractC31720OooOOOo2 == null) {
                            throw new IllegalArgumentException("font is null, check whether /DA entry is incomplete or incorrect");
                        }
                        if (abstractC31720OooOOOo2.getName().contains("+")) {
                            Log.w("PdfBox-Android", "Font '" + this.f113434OooO0O0.f113439OooO0O0.f112461OooOo + "' of field '" + abstractC31826OooOOo0.OooO00o() + "' contains subsetted font '" + abstractC31720OooOOOo2.getName() + "'");
                            Log.w("PdfBox-Android", "This may bring trouble with PDField.setValue(), PDAcroForm.flatten() or PDAcroForm.refreshAppearances()");
                            Log.w("PdfBox-Android", "You should replace this font with a non-subsetted font:");
                            Log.w("PdfBox-Android", "PDFont font = PDType0Font.load(doc, new FileInputStream(fontfile), false);");
                            StringBuilder sb = new StringBuilder("acroForm.getDefaultResources().put(COSName.getPDFName(\"");
                            sb.append(this.f113434OooO0O0.f113439OooO0O0.f112461OooOo);
                            sb.append("\", font);");
                            Log.w("PdfBox-Android", sb.toString());
                        }
                        float f15 = this.f113434OooO0O0.f113441OooO0Oo;
                        String str16 = "";
                        if (f15 == f13 && f15 == f13) {
                            if (abstractC31826OooOOo0 instanceof C31824OooOOOo) {
                                stack4 = stack2;
                                byteArrayOutputStream2 = byteArrayOutputStream4;
                                z5 = ((C31824OooOOOo) abstractC31826OooOOo0).f113445OooOoO0.o0000o0(C31441OooOO0.f112292o0000OO, 4096);
                                if (z5) {
                                    str5 = IOUtils.LINE_SEPARATOR_UNIX;
                                    float f16 = abstractC31720OooOOOo2.OooO00o().f113464OooOo0o[4] * 1000.0f;
                                    float fOooO0o2 = (c31676OooO0ooOooO00o2.OooO0o() / (abstractC31720OooOOOo2.OooOO0(this.f113435OooO0OO) * abstractC31720OooOOOo2.OooO00o().f113464OooOo0o[0])) * abstractC31720OooOOOo2.OooO00o().f113464OooOo0o[0] * 1000.0f;
                                    C31722OooOOo0 c31722OooOOo0OooO0oo = abstractC31720OooOOOo2.OooO0oo();
                                    if (c31722OooOOo0OooO0oo.f113314OooOo == Float.NEGATIVE_INFINITY) {
                                        f12 = f16;
                                        c31609OooO0Oo = c31609OooO0Oo2;
                                        c31722OooOOo0OooO0oo.f113314OooOo = Math.abs(c31722OooOOo0OooO0oo.f113315OooOo0o.o0000ooO(C31441OooOO0.f112265OoooOoo, 0.0f));
                                    } else {
                                        f12 = f16;
                                        c31609OooO0Oo = c31609OooO0Oo2;
                                    }
                                    float f17 = c31722OooOOo0OooO0oo.f113314OooOo;
                                    C31722OooOOo0 c31722OooOOo0OooO0oo2 = abstractC31720OooOOOo2.OooO0oo();
                                    c31722OooOOo0OooO0oo2.getClass();
                                    float fOooO00o4 = (f17 + (-c31722OooOOo0OooO0oo2.f113315OooOo0o.o0000ooO(C31441OooOO0.f112280o000000O, 0.0f))) * abstractC31720OooOOOo2.OooO00o().f113464OooOo0o[4];
                                    if (fOooO00o4 <= f13) {
                                        fOooO00o4 = abstractC31720OooOOOo2.OooO0OO().OooO00o() * abstractC31720OooOOOo2.OooO00o().f113464OooOo0o[4];
                                    }
                                    fMin = Math.min((c31676OooO0ooOooO00o2.OooO00o() / fOooO00o4) * f12, fOooO0o2);
                                } else {
                                    String str17 = this.f113435OooO0OO;
                                    if (str17.isEmpty()) {
                                        arrayList6 = new ArrayList(1);
                                        arrayList6.add(new C31827OooOOoo(""));
                                    } else {
                                        String[] strArrSplit = str17.replace('\t', ControlChar.SPACE_CHAR).split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
                                        ArrayList arrayList7 = new ArrayList(strArrSplit.length);
                                        int length2 = strArrSplit.length;
                                        int i11 = 0;
                                        while (i11 < length2) {
                                            String str18 = strArrSplit[i11];
                                            if (str18.length() == 0) {
                                                i5 = i11;
                                                str10 = str2;
                                            } else {
                                                i5 = i11;
                                                str10 = str18;
                                            }
                                            int i12 = length2;
                                            arrayList7.add(new C31827OooOOoo(str10));
                                            i11 = i5 + 1;
                                            length2 = i12;
                                        }
                                        arrayList6 = arrayList7;
                                    }
                                    float fOooO0o3 = c31676OooO0ooOooO00o2.OooO0o() - c31676OooO0ooOooO00o2.OooO0O0();
                                    ArrayList arrayList8 = arrayList6;
                                    float f18 = 4.0f;
                                    while (true) {
                                        if (f18 > 12.0f) {
                                            str5 = str15;
                                            fMin = Math.min(f18, 12.0f);
                                            break;
                                        }
                                        Iterator it6 = arrayList8.iterator();
                                        int size = 0;
                                        while (it6.hasNext()) {
                                            size += ((C31827OooOOoo) it6.next()).OooO00o(abstractC31720OooOOOo2, f18, fOooO0o3).size();
                                            str15 = str15;
                                        }
                                        str5 = str15;
                                        if (abstractC31720OooOOOo2.OooO0OO().OooO00o() * (f18 / 1000.0f) * size > c31676OooO0ooOooO00o2.OooO00o()) {
                                            fMin = Math.max(f18 - 1.0f, 4.0f);
                                            break;
                                        } else {
                                            f18 += 1.0f;
                                            str15 = str5;
                                        }
                                    }
                                    c31609OooO0Oo = c31609OooO0Oo2;
                                }
                            } else {
                                byteArrayOutputStream2 = byteArrayOutputStream4;
                                stack4 = stack2;
                            }
                            if (z5) {
                            }
                        } else {
                            byteArrayOutputStream2 = byteArrayOutputStream4;
                            c31609OooO0Oo = c31609OooO0Oo2;
                            stack4 = stack2;
                            str5 = IOUtils.LINE_SEPARATOR_UNIX;
                            fMin = f15;
                        }
                        boolean z8 = abstractC31826OooOOo0 instanceof C31818OooOO0;
                        if (z8) {
                            C31818OooOO0 c31818OooOO02 = (C31818OooOO0) abstractC31826OooOOo0;
                            C31441OooOO0 c31441OooOO05 = C31441OooOO0.f112319o000O0o0;
                            C31436OooO0Oo c31436OooO0Oo9 = c31818OooOO02.f113445OooOoO0;
                            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O3 = c31436OooO0Oo9.o0000O0O(c31441OooOO05);
                            if (abstractC31434OooO0O0O0000O0O3 != null) {
                                C31433OooO00o c31433OooO00o2 = (C31433OooO00o) abstractC31434OooO0O0O0000O0O3;
                                z2 = z8;
                                ArrayList arrayList9 = new ArrayList();
                                c31818OooOO0 = c31818OooOO02;
                                arrayList2 = arrayList;
                                for (int i13 = 0; i13 < c31433OooO00o2.f112214OooOo.size(); i13++) {
                                    arrayList9.add(Integer.valueOf(((AbstractC31443OooOO0o) (c31433OooO00o2.Oooo0(i13) instanceof C31445OooOOO0 ? ((C31445OooOOO0) c31433OooO00o2.Oooo0(i13)).f112467OooOo : c31433OooO00o2.Oooo0(i13))).Oooo0()));
                                }
                                arrayList5 = new C31669OooO00o(arrayList9, c31433OooO00o2);
                            } else {
                                z2 = z8;
                                c31818OooOO0 = c31818OooOO02;
                                arrayList2 = arrayList;
                                arrayList5 = Collections.EMPTY_LIST;
                            }
                            List<String> listOooO0o0 = c31818OooOO0.OooO0o0();
                            List listOooO0O0 = C25698OooOOOO.OooO0O0(0, c31436OooO0Oo9.o0000O0O(C31441OooOO0.f112371o00O0000));
                            if (!listOooO0o0.isEmpty() && !listOooO0O0.isEmpty() && arrayList5.isEmpty()) {
                                arrayList5 = new ArrayList();
                                Iterator<String> it7 = listOooO0o0.iterator();
                                while (it7.hasNext()) {
                                    arrayList5.add(Integer.valueOf(listOooO0O0.indexOf(it7.next())));
                                }
                            }
                            int iO000O00O2 = c31436OooO0Oo9.o000O00O(C31441OooOO0.f112412o00OO0o0, null, 0);
                            float fOooO00o5 = (abstractC31720OooOOOo2.OooO0OO().OooO00o() * fMin) / 1000.0f;
                            C31676OooO0oo c31676OooO0ooOooO00o3 = OooO00o(c31807OooOOOo.OooO0O0(), 1.0f);
                            Iterator it8 = arrayList5.iterator();
                            while (it8.hasNext()) {
                                int iIntValue = ((Integer) it8.next()).intValue();
                                float[] fArr2 = f113431OooO0o;
                                int i14 = iO000O00O2;
                                float f19 = fArr2[0];
                                Iterator it9 = it8;
                                float f20 = fArr2[1];
                                C31676OooO0oo c31676OooO0oo3 = c31676OooO0ooOooO00o3;
                                float f21 = fArr2[2];
                                String str19 = str16;
                                float f22 = fMin;
                                if (C31617OooO0oO.OooOOO0(f19) || C31617OooO0oO.OooOOO0(f20) || C31617OooO0oO.OooOOO0(f21)) {
                                    throw new IllegalArgumentException("Parameters must be within 0..1, but are ".concat(String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f19), Float.valueOf(f20), Float.valueOf(f21))));
                                }
                                c31617OooO0oO.Oooo0(f19);
                                c31617OooO0oO.Oooo0(f20);
                                c31617OooO0oO.Oooo0(f21);
                                c31617OooO0oO.Oooo0OO("rg");
                                c31617OooO0oO.Oooo000(C31765OooO0Oo.f113414OooOo);
                                c31617OooO0oO.OooO00o(c31676OooO0oo3.OooO0O0(), (c31676OooO0oo3.OooO0o0() - (((iIntValue - i14) + 1) * fOooO00o5)) + f, c31676OooO0oo3.OooO0o(), fOooO00o5);
                                if (c31617OooO0oO.f113028OooOoO) {
                                    throw new IllegalStateException("Error: fill is not allowed within a text block.");
                                }
                                c31617OooO0oO.Oooo0OO("f");
                                str16 = str19;
                                iO000O00O2 = i14;
                                it8 = it9;
                                c31676OooO0ooOooO00o3 = c31676OooO0oo3;
                                fMin = f22;
                            }
                            str6 = str16;
                            f3 = fMin;
                            c31617OooO0oO.OooOooo();
                        } else {
                            str6 = "";
                            f3 = fMin;
                            z2 = z8;
                            arrayList2 = arrayList;
                        }
                        if (c31617OooO0oO.f113028OooOoO) {
                            throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
                        }
                        c31617OooO0oO.Oooo0OO("BT");
                        c31617OooO0oO.f113028OooOoO = true;
                        C31816OooO0oO c31816OooO0oO4 = this.f113434OooO0O0;
                        float f23 = c31816OooO0oO4.f113441OooO0Oo;
                        if (f23 == f13) {
                            f23 = f3;
                        }
                        AbstractC31720OooOOOo abstractC31720OooOOOo3 = c31816OooO0oO4.f113440OooO0OO;
                        if (stack.isEmpty()) {
                            stack.add(abstractC31720OooOOOo3);
                        } else {
                            stack.setElementAt(abstractC31720OooOOOo3, stack.size() - 1);
                        }
                        if (abstractC31720OooOOOo3.OooOOo()) {
                            c31617OooO0oO.f113027OooOo0o.f113013OooOoo0.add(abstractC31720OooOOOo3);
                        }
                        C31610OooO c31610OooO = c31617OooO0oO.f113029OooOoO0;
                        c31610OooO.getClass();
                        c31610OooO.OooO00o(C31441OooOO0.f112300o0000o, "F", abstractC31720OooOOOo3).Oooo00o(c31617OooO0oO.f113026OooOo);
                        c31617OooO0oO.f113026OooOo.write(32);
                        c31617OooO0oO.Oooo0(f23);
                        c31617OooO0oO.Oooo0OO("Tf");
                        C31762OooO00o c31762OooO00o = c31816OooO0oO4.f113442OooO0o0;
                        if (c31762OooO00o != null) {
                            c31617OooO0oO.OooOOoo(c31762OooO00o);
                        }
                        float f24 = f3 / 1000.0f;
                        float fOooO00o6 = abstractC31720OooOOOo2.OooO0OO().OooO00o() * f24;
                        if (abstractC31720OooOOOo2.OooO0oo() != null) {
                            C31722OooOOo0 c31722OooOOo0OooO0oo3 = abstractC31720OooOOOo2.OooO0oo();
                            if (c31722OooOOo0OooO0oo3.f113314OooOo == Float.NEGATIVE_INFINITY) {
                                c31722OooOOo0OooO0oo3.f113314OooOo = Math.abs(c31722OooOOo0OooO0oo3.f113315OooOo0o.o0000ooO(C31441OooOO0.f112265OoooOoo, 0.0f));
                            }
                            f4 = c31722OooOOo0OooO0oo3.f113314OooOo * f24;
                            C31722OooOOo0 c31722OooOOo0OooO0oo4 = abstractC31720OooOOOo2.OooO0oo();
                            c31722OooOOo0OooO0oo4.getClass();
                            fOooO0OO = c31722OooOOo0OooO0oo4.f113315OooOo0o.o0000ooO(C31441OooOO0.f112280o000000O, 0.0f);
                        } else {
                            float fOooO0OO2 = OooO0OO(abstractC31720OooOOOo2, "H".codePointAt(0));
                            fOooO0OO = OooO0OO(abstractC31720OooOOOo2, "y".codePointAt(0)) - OooO0OO(abstractC31720OooOOOo2, "a".codePointAt(0));
                            Log.d("PdfBox-Android", "missing font descriptor - resolved Cap/Descent to " + fOooO0OO2 + "/" + fOooO0OO);
                            f4 = fOooO0OO2 * f24;
                        }
                        float f25 = fOooO0OO * f24;
                        if (z) {
                            if (((C31824OooOOOo) abstractC31826OooOOo0).f113445OooOoO0.o0000o0(C31441OooOO0.f112292o0000OO, 4096)) {
                                fMin2 = c31676OooO0ooOooO00o2.OooO0o0() - fOooO00o6;
                            } else if (f4 > c31676OooO0oo.OooO00o()) {
                                fMin2 = (-f25) + c31676OooO0oo.OooO0OO();
                            } else {
                                float fOooO0OO3 = c31676OooO0oo.OooO0OO() + ((c31676OooO0oo.OooO00o() - f4) / f);
                                float f26 = -f25;
                                fMin2 = fOooO0OO3 - c31676OooO0oo.OooO0OO() < f26 ? Math.min(c31676OooO0ooOooO00o2.OooO0OO() + f26, Math.max(fOooO0OO3, (c31676OooO0ooOooO00o2.OooO00o() - c31676OooO0ooOooO00o2.OooO0OO()) - f4)) : fOooO0OO3;
                            }
                            float fOooO0O0 = c31676OooO0ooOooO00o2.OooO0O0();
                            if (z) {
                                C31441OooOO0 c31441OooOO06 = C31441OooOO0.f112292o0000OO;
                                C31436OooO0Oo c31436OooO0Oo10 = ((C31824OooOOOo) abstractC31826OooOOo0).f113445OooOoO0;
                                if (c31436OooO0Oo10.o0000o0(c31441OooOO06, 16777216) && !c31436OooO0Oo10.o0000o0(c31441OooOO06, 4096) && !c31436OooO0Oo10.o0000o0(c31441OooOO06, 8192) && !c31436OooO0Oo10.o0000o0(c31441OooOO06, 1048576)) {
                                    int iO000O00O3 = c31436OooO0Oo10.o000O00O(C31441OooOO0.f112349o000o0Oo, null, -1);
                                    AbstractC31443OooOO0o abstractC31443OooOO0o2 = (AbstractC31443OooOO0o) abstractC31826OooOOo0.OooO0O0(C31441OooOO0.f112385o00O0OO0);
                                    int iOooo02 = abstractC31443OooOO0o2 != null ? abstractC31443OooOO0o2.Oooo0() : 0;
                                    int iMin = Math.min(this.f113435OooO0OO.length(), iO000O00O3);
                                    C31676OooO0oo c31676OooO0ooOooO00o4 = OooO00o(c31807OooOOOo.OooO0O0(), 1.0f);
                                    float fOooO0o4 = c31807OooOOOo.OooO0O0().OooO0o() / iO000O00O3;
                                    C31722OooOOo0 c31722OooOOo0OooO0oo5 = abstractC31720OooOOOo2.OooO0oo();
                                    c31722OooOOo0OooO0oo5.getClass();
                                    float fOooO0OO4 = c31676OooO0ooOooO00o4.OooO0OO() + ((c31807OooOOOo.OooO0O0().OooO00o() - ((c31722OooOOo0OooO0oo5.f113315OooOo0o.o0000ooO(C31441OooOO0.f112251Oooo0OO, 0.0f) / 1000.0f) * f3)) / f);
                                    float f27 = fOooO0o4 / f;
                                    if (iOooo02 == 2) {
                                        f27 += (iO000O00O3 - iMin) * fOooO0o4;
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                        if (iOooo02 == 1) {
                                            f27 += ((iO000O00O3 - iMin) / 2) * fOooO0o4;
                                        }
                                    }
                                    float f28 = f13;
                                    int i15 = 0;
                                    while (i15 < iMin) {
                                        int i16 = i15 + 1;
                                        String strSubstring = this.f113435OooO0OO.substring(i15, i16);
                                        float fOooOO0 = ((abstractC31720OooOOOo2.OooOO0(strSubstring) / 1000.0f) * f3) / f;
                                        c31617OooO0oO.OooOOo0(((f28 / f) + f27) - (fOooOO0 / f), fOooO0OO4);
                                        c31617OooO0oO.Oooo00o(strSubstring);
                                        f27 = fOooO0o4;
                                        f28 = fOooOO0;
                                        i15 = i16;
                                        fOooO0OO4 = f13;
                                        z4 = true;
                                    }
                                    str7 = str3;
                                    str8 = str4;
                                } else if (z2) {
                                    c31617OooO0oO.OooOooo();
                                    AbstractC31443OooOO0o abstractC31443OooOO0o3 = (AbstractC31443OooOO0o) abstractC31826OooOOo0.OooO0O0(C31441OooOO0.f112385o00O0OO0);
                                    int iOooo03 = abstractC31443OooOO0o3 != null ? abstractC31443OooOO0o3.Oooo0() : 0;
                                    if (iOooo03 == 1 || iOooo03 == 2) {
                                        float fOooO0o5 = (c31807OooOOOo.OooO0O0().OooO0o() - ((abstractC31720OooOOOo2.OooOO0(this.f113435OooO0OO) / 1000.0f) * f3)) - 4.0f;
                                        i4 = 1;
                                        if (iOooo03 == 1) {
                                            fOooO0o5 /= f;
                                        }
                                        c31617OooO0oO.OooOOo0(fOooO0o5, f13);
                                    } else {
                                        if (iOooo03 != 0) {
                                            throw new IOException(C21532OooOOo.OooO0OO(iOooo03, "Error: Unknown justification value:"));
                                        }
                                        i4 = 1;
                                    }
                                    C31818OooOO0 c31818OooOO03 = (C31818OooOO0) abstractC31826OooOOo0;
                                    List listOooO0O02 = C25698OooOOOO.OooO0O0(i4, c31818OooOO03.f113445OooOoO0.o0000O0O(C31441OooOO0.f112371o00O0000));
                                    int size2 = listOooO0O02.size();
                                    float fOooO0o03 = c31676OooO0ooOooO00o2.OooO0o0();
                                    int iO000O00O4 = c31818OooOO03.f113445OooOoO0.o000O00O(C31441OooOO0.f112412o00OO0o0, null, 0);
                                    int i17 = iO000O00O4;
                                    while (i17 < size2) {
                                        if (i17 == iO000O00O4) {
                                            C31722OooOOo0 c31722OooOOo0OooO0oo6 = abstractC31720OooOOOo2.OooO0oo();
                                            c31722OooOOo0OooO0oo6.getClass();
                                            fOooO0o03 -= (c31722OooOOo0OooO0oo6.f113315OooOo0o.o0000ooO(C31441OooOO0.f112251Oooo0OO, 0.0f) / 1000.0f) * f3;
                                        } else {
                                            fOooO0o03 -= (abstractC31720OooOOOo2.OooO0OO().OooO00o() / 1000.0f) * f3;
                                            if (c31617OooO0oO.f113028OooOoO) {
                                                throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
                                            }
                                            c31617OooO0oO.Oooo0OO("BT");
                                            c31617OooO0oO.f113028OooOoO = true;
                                        }
                                        c31617OooO0oO.OooOOo0(c31676OooO0ooOooO00o2.OooO0O0(), fOooO0o03);
                                        c31617OooO0oO.Oooo00o((String) listOooO0O02.get(i17));
                                        if (i17 == size2 - 1) {
                                            str9 = str4;
                                        } else {
                                            if (!c31617OooO0oO.f113028OooOoO) {
                                                throw new IllegalStateException(str3);
                                            }
                                            str9 = str4;
                                            c31617OooO0oO.Oooo0OO(str9);
                                            c31617OooO0oO.f113028OooOoO = false;
                                        }
                                        i17++;
                                        str4 = str9;
                                        str3 = str3;
                                    }
                                    str7 = str3;
                                    str8 = str4;
                                } else {
                                    str7 = str3;
                                    str8 = str4;
                                    String str20 = this.f113435OooO0OO;
                                    if (str20.isEmpty()) {
                                        arrayList3 = new ArrayList(1);
                                        arrayList3.add(new C31827OooOOoo(str6));
                                    } else {
                                        String[] strArrSplit2 = str20.replace('\t', ControlChar.SPACE_CHAR).split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
                                        ArrayList arrayList10 = new ArrayList(strArrSplit2.length);
                                        int length3 = strArrSplit2.length;
                                        int i18 = 0;
                                        while (i18 < length3) {
                                            String str21 = strArrSplit2[i18];
                                            if (str21.length() == 0) {
                                                str21 = str2;
                                            }
                                            arrayList10.add(new C31827OooOOoo(str21));
                                            i18++;
                                            strArrSplit2 = strArrSplit2;
                                        }
                                        arrayList3 = arrayList10;
                                    }
                                    float fOooO00o7 = abstractC31720OooOOOo2.OooO0OO().OooO00o() * f24;
                                    float fOooO0o6 = c31676OooO0ooOooO00o2.OooO0o();
                                    if (abstractC31826OooOOo0 instanceof C31824OooOOOo) {
                                        boolean z9 = ((C31824OooOOOo) abstractC31826OooOOo0).f113445OooOoO0.o0000o0(C31441OooOO0.f112292o0000OO, 4096);
                                        C31441OooOO0 c31441OooOO07 = C31441OooOO0.f112385o00O0OO0;
                                        abstractC31443OooOO0o = (AbstractC31443OooOO0o) abstractC31826OooOOo0.OooO0O0(c31441OooOO07);
                                        if (abstractC31443OooOO0o == null) {
                                            iOooo0 = abstractC31443OooOO0o.Oooo0();
                                            f5 = fOooO0O0;
                                            c31436OooO0Oo = c31436OooO0Oo5;
                                            arrayList4 = arrayList3;
                                        } else {
                                            iOooo0 = 0;
                                            arrayList4 = arrayList3;
                                            f5 = fOooO0O0;
                                            c31436OooO0Oo = c31436OooO0Oo5;
                                        }
                                        int iO000O00O5 = c31436OooO0Oo.o000O00O(c31441OooOO07, null, iOooo0);
                                        iArr_values = C22221Oooo0O0._values();
                                        length = iArr_values.length;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < length) {
                                                i3 = 1;
                                                break;
                                            }
                                            i3 = iArr_values[i2];
                                            iArr = iArr_values;
                                            if (C22221Oooo0O0.OooO00o(i3) == iO000O00O5) {
                                                break;
                                            }
                                            i2++;
                                            iArr_values = iArr;
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            Iterator it10 = arrayList4.iterator();
                                            float f29 = f5;
                                            boolean z10 = true;
                                            while (it10.hasNext()) {
                                                C31827OooOOoo c31827OooOOoo = (C31827OooOOoo) it10.next();
                                                if (z9) {
                                                    it2 = it10;
                                                    float f30 = f3;
                                                    ArrayList<C31825OooOOo> arrayListOooO00o = c31827OooOOoo.OooO00o(abstractC31720OooOOOo2, f30, fOooO0o6);
                                                    f3 = f30;
                                                    float f31 = 0.0f;
                                                    float f32 = 0.0f;
                                                    float size3 = 0.0f;
                                                    for (C31825OooOOo c31825OooOOo : arrayListOooO00o) {
                                                        float f33 = f29;
                                                        float f34 = fOooO0o6;
                                                        int iOooO00o = o0OoOo0.OooO00o(i3);
                                                        boolean z11 = z9;
                                                        if (iOooO00o == 1) {
                                                            f9 = (f34 - c31825OooOOo.f113447OooO0O0) / f;
                                                        } else if (iOooO00o != 2) {
                                                            if (iOooO00o != i) {
                                                                f32 = 0.0f;
                                                            } else if (arrayListOooO00o.indexOf(c31825OooOOo) != arrayListOooO00o.size() - 1) {
                                                                size3 = (f34 - c31825OooOOo.f113447OooO0O0) / (c31825OooOOo.f113446OooO00o.size() - 1);
                                                            }
                                                            f10 = (-f31) + f32 + f33;
                                                            if (arrayListOooO00o.indexOf(c31825OooOOo) == 0 || !z10) {
                                                                fMin2 -= fOooO00o7;
                                                                c31617OooO0oO.OooOOo0(f10, -fOooO00o7);
                                                            } else {
                                                                c31617OooO0oO.OooOOo0(f10, fMin2);
                                                            }
                                                            f31 += f10;
                                                            int i19 = 0;
                                                            for (C31828OooOo0 c31828OooOo0 : c31825OooOOo.f113446OooO00o) {
                                                                float f35 = f31;
                                                                float f36 = fOooO00o7;
                                                                c31617OooO0oO.Oooo00o(c31828OooOo0.f113450OooO0O0);
                                                                float fFloatValue = ((Float) c31828OooOo0.f113449OooO00o.getIterator().getAttribute(C31829OooOo00.f113451OooOo0o)).floatValue();
                                                                if (i19 != r5.size() - 1) {
                                                                    c31617OooO0oO.OooOOo0(fFloatValue + size3, 0.0f);
                                                                    f11 = f35 + fFloatValue + size3;
                                                                } else {
                                                                    f11 = f35;
                                                                }
                                                                i19++;
                                                                f31 = f11;
                                                                fOooO00o7 = f36;
                                                            }
                                                            fOooO0o6 = f34;
                                                            f29 = f33;
                                                            z9 = z11;
                                                            i = 3;
                                                        } else {
                                                            f9 = f34 - c31825OooOOo.f113447OooO0O0;
                                                        }
                                                        f32 = f9;
                                                        f10 = (-f31) + f32 + f33;
                                                        if (arrayListOooO00o.indexOf(c31825OooOOo) == 0) {
                                                            fMin2 -= fOooO00o7;
                                                            c31617OooO0oO.OooOOo0(f10, -fOooO00o7);
                                                        }
                                                        f31 += f10;
                                                        int i192 = 0;
                                                        while (r6.hasNext()) {
                                                        }
                                                        fOooO0o6 = f34;
                                                        f29 = f33;
                                                        z9 = z11;
                                                        i = 3;
                                                    }
                                                    f6 = fOooO00o7;
                                                    f7 = fOooO0o6;
                                                    z3 = z9;
                                                    f29 -= f31;
                                                    z10 = false;
                                                } else {
                                                    it2 = it10;
                                                    f6 = fOooO00o7;
                                                    float f37 = f29;
                                                    f7 = fOooO0o6;
                                                    z3 = z9;
                                                    float fOooOO02 = (abstractC31720OooOOOo2.OooOO0(c31827OooOOoo.f113448OooO00o) * f3) / 1000.0f;
                                                    if (fOooOO02 < f7) {
                                                        int iOooO00o2 = o0OoOo0.OooO00o(i3);
                                                        if (iOooO00o2 == 1) {
                                                            f8 = (f7 - fOooOO02) / f;
                                                        } else if (iOooO00o2 == 2) {
                                                            f8 = f7 - fOooOO02;
                                                        }
                                                        c31617OooO0oO.OooOOo0(f37 + f8, fMin2);
                                                        c31617OooO0oO.Oooo00o(c31827OooOOoo.f113448OooO00o);
                                                        f29 = f37;
                                                    }
                                                    f8 = 0.0f;
                                                    c31617OooO0oO.OooOOo0(f37 + f8, fMin2);
                                                    c31617OooO0oO.Oooo00o(c31827OooOOoo.f113448OooO00o);
                                                    f29 = f37;
                                                }
                                                fOooO00o7 = f6;
                                                it10 = it2;
                                                fOooO0o6 = f7;
                                                z9 = z3;
                                                i = 3;
                                            }
                                        }
                                    }
                                    C31441OooOO0 c31441OooOO072 = C31441OooOO0.f112385o00O0OO0;
                                    abstractC31443OooOO0o = (AbstractC31443OooOO0o) abstractC31826OooOOo0.OooO0O0(c31441OooOO072);
                                    if (abstractC31443OooOO0o == null) {
                                    }
                                    int iO000O00O52 = c31436OooO0Oo.o000O00O(c31441OooOO072, null, iOooo0);
                                    iArr_values = C22221Oooo0O0._values();
                                    length = iArr_values.length;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                        }
                                        i2++;
                                        iArr_values = iArr;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                    }
                                }
                                if (!c31617OooO0oO.f113028OooOoO) {
                                    throw new IllegalStateException(str7);
                                }
                                c31617OooO0oO.Oooo0OO(str8);
                                c31617OooO0oO.f113028OooOoO = false;
                                if (!stack.isEmpty()) {
                                    stack.pop();
                                }
                                if (!stack4.isEmpty()) {
                                    stack4.pop();
                                }
                                if (!stack3.isEmpty()) {
                                    stack3.pop();
                                }
                                c31617OooO0oO.Oooo0OO("Q");
                                c31617OooO0oO.close();
                                C31431OooO00o c31431OooO00o2 = f113432OooO0o0;
                                ArrayList arrayList11 = arrayList2;
                                int iIndexOf2 = arrayList11.indexOf(c31431OooO00o2);
                                if (iIndexOf2 == -1) {
                                    c31609OooO0Oo.OooO00o(new Object[]{c31431OooO00o2}[0]);
                                    byteArrayOutputStream2.write(str5.getBytes(C31835OooO00o.f113456OooO00o));
                                } else {
                                    C31609OooO0Oo c31609OooO0Oo3 = c31609OooO0Oo;
                                    Iterator it11 = arrayList11.subList(iIndexOf2, arrayList11.size()).iterator();
                                    while (it11.hasNext()) {
                                        c31609OooO0Oo3.OooO00o(it11.next());
                                    }
                                }
                                byteArrayOutputStream3.close();
                                byte[] byteArray = byteArrayOutputStream3.toByteArray();
                                C31447OooOOOo c31447OooOOOoO000o00o = c31668OooO2.f113202OooOo0o.o000o00o(null);
                                c31447OooOOOoO000o00o.write(byteArray);
                                c31447OooOOOoO000o00o.close();
                                this.f113434OooO0O0 = c31816OooO0oO;
                                str12 = str8;
                                str11 = str7;
                                str13 = str2;
                                it3 = it;
                                z6 = z;
                                c31811OooO0O0 = c31811OooO0O02;
                                i = 3;
                            }
                        }
                    } else {
                        f = 2.0f;
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    C31617OooO0oO c31617OooO0oO2 = new C31617OooO0oO(c31811OooO0O0.f113437OooOo0o, c31807OooOOOoOooO00o, byteArrayOutputStream5);
                    if (c31805OooOOO02 != null) {
                        C31762OooO00o c31762OooO00oOooO00o = c31805OooOOO02.OooO00o(C31441OooOO0.f112354o000oOoO);
                        if (c31762OooO00oOooO00o != null) {
                            c31617OooO0oO2.OooOOoo(c31762OooO00oOooO00o);
                            C31676OooO0oo c31676OooO0ooOooO0O03 = OooO0O0(c31803OooOO0o, c31807OooOOOoOooO00o);
                            f2 = 1.0f;
                            byteArrayOutputStream = byteArrayOutputStream5;
                            c31617OooO0oO2.OooO00o(c31676OooO0ooOooO0O03.OooO0O0(), c31676OooO0ooOooO0O03.OooO0OO(), c31676OooO0ooOooO0O03.OooO0o(), c31676OooO0ooOooO0O03.OooO00o());
                            if (c31617OooO0oO2.f113028OooOoO) {
                                throw new IllegalStateException("Error: fill is not allowed within a text block.");
                            }
                            c31617OooO0oO2.Oooo0OO("f");
                        } else {
                            byteArrayOutputStream = byteArrayOutputStream5;
                            f2 = 1.0f;
                        }
                        C31762OooO00o c31762OooO00oOooO00o2 = c31805OooOOO02.OooO00o(C31441OooOO0.f112260OoooOO0);
                        if (c31762OooO00oOooO00o2 != null) {
                            Stack<AbstractC31763OooO0O0> stack5 = c31617OooO0oO2.f113031OooOoo;
                            boolean zIsEmpty = stack5.isEmpty();
                            AbstractC31763OooO0O0 abstractC31763OooO0O0 = c31762OooO00oOooO00o2.f113412OooO0OO;
                            if (zIsEmpty || stack5.peek() != abstractC31763OooO0O0) {
                                c31617OooO0oO2.OooO0OO(abstractC31763OooO0O0).Oooo00o(c31617OooO0oO2.f113026OooOo);
                                c31617OooO0oO2.f113026OooOo.write(32);
                                c31617OooO0oO2.Oooo0OO("CS");
                                if (stack5.isEmpty()) {
                                    stack5.add(abstractC31763OooO0O0);
                                    for (float f38 : c31762OooO00oOooO00o2.OooO00o()) {
                                        c31617OooO0oO2.Oooo0(f38);
                                    }
                                    c31617OooO0oO2.Oooo0OO("SC");
                                    fOooO00o = f2;
                                } else {
                                    stack5.setElementAt(abstractC31763OooO0O0, stack5.size() - 1);
                                    while (i < r11) {
                                    }
                                    c31617OooO0oO2.Oooo0OO("SC");
                                    fOooO00o = f2;
                                }
                            } else {
                                while (i < r11) {
                                }
                                c31617OooO0oO2.Oooo0OO("SC");
                                fOooO00o = f2;
                            }
                        } else {
                            fOooO00o = f13;
                        }
                        C31808OooOOo0 c31808OooOOo0OooO0Oo = c31803OooOO0o.OooO0Oo();
                        if (c31808OooOOo0OooO0Oo != null && c31808OooOOo0OooO0Oo.OooO00o() > f13) {
                            fOooO00o = c31808OooOOo0OooO0Oo.OooO00o();
                        }
                        if (fOooO00o > f13 && c31762OooO00oOooO00o2 != null) {
                            if (fOooO00o != f2) {
                                c31617OooO0oO2.Oooo0(fOooO00o);
                                c31617OooO0oO2.Oooo0OO("w");
                            }
                            C31676OooO0oo c31676OooO0ooOooO00o5 = OooO00o(OooO0O0(c31803OooOO0o, c31807OooOOOoOooO00o), Math.max(0.5f, fOooO00o / f));
                            c31617OooO0oO2.OooO00o(c31676OooO0ooOooO00o5.OooO0O0(), c31676OooO0ooOooO00o5.OooO0OO(), c31676OooO0ooOooO00o5.OooO0o(), c31676OooO0ooOooO00o5.OooO00o());
                            if (c31617OooO0oO2.f113028OooOoO) {
                                throw new IllegalStateException("Error: closeAndStroke is not allowed within a text block.");
                            }
                            c31617OooO0oO2.Oooo0OO("s");
                        }
                    } else {
                        byteArrayOutputStream = byteArrayOutputStream5;
                        f2 = 1.0f;
                    }
                    c31617OooO0oO2.close();
                    byteArrayOutputStream.close();
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    C31447OooOOOo c31447OooOOOoO000o00o2 = c31668OooO2.f113202OooOo0o.o000o00o(null);
                    c31447OooOOOoO000o00o2.write(byteArray2);
                    c31447OooOOOoO000o00o2.close();
                    c31816OooO0oO2 = this.f113434OooO0O0;
                    c31816OooO0oO2.getClass();
                    c31610OooOOooO0OO = c31807OooOOOoOooO00o.OooO0OO();
                    if (c31610OooOOooO0OO == null) {
                    }
                    if (c31610OooOOooO0OO.OooO0O0(c31816OooO0oO2.f113439OooO0O0) == null) {
                    }
                    ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
                    C31609OooO0Oo c31609OooO0Oo22 = new C31609OooO0Oo(byteArrayOutputStream32);
                    c31491OooO0oO = new C31491OooO0oO(c31807OooOOOoOooO00o);
                    while (true) {
                        objOooOo0O = c31491OooO0oO.OooOo0O();
                        arrayList = c31491OooO0oO.f112664OooO0o0;
                        if (objOooOo0O != null) {
                        }
                        arrayList.add(objOooOo0O);
                    }
                    C31431OooO00o c31431OooO00o3 = f113430OooO0Oo;
                    iIndexOf = arrayList.indexOf(c31431OooO00o3);
                    String str152 = IOUtils.LINE_SEPARATOR_UNIX;
                    ByteArrayOutputStream byteArrayOutputStream42 = c31609OooO0Oo22.f113003OooO00o;
                    if (iIndexOf != -1) {
                    }
                    c31617OooO0oO = new C31617OooO0oO(c31811OooO0O0.f113437OooOo0o, c31807OooOOOoOooO00o, byteArrayOutputStream32);
                    C31676OooO0oo c31676OooO0ooOooO0O022 = OooO0O0(c31803OooOO0o, c31807OooOOOoOooO00o);
                    if (c31803OooOO0o.OooO0Oo() == null) {
                    }
                    float f142 = f2;
                    C31676OooO0oo c31676OooO0ooOooO00o6 = OooO00o(c31676OooO0ooOooO0O022, Math.max(f142, fOooO00o3));
                    C31676OooO0oo c31676OooO0ooOooO00o22 = OooO00o(c31676OooO0ooOooO00o6, Math.max(f142, fOooO00o3));
                    if (c31617OooO0oO.f113028OooOoO) {
                    }
                    stack = c31617OooO0oO.f113030OooOoOO;
                    if (!stack.isEmpty()) {
                    }
                    stack2 = c31617OooO0oO.f113031OooOoo;
                    if (stack2.isEmpty()) {
                    }
                    stack3 = c31617OooO0oO.f113032OooOoo0;
                    if (stack3.isEmpty()) {
                    }
                    c31617OooO0oO.Oooo0OO("q");
                    C31811OooO0O0 c31811OooO0O022 = c31811OooO0O0;
                    c31617OooO0oO.OooO00o(c31676OooO0oo.OooO0O0(), c31676OooO0oo.OooO0OO(), c31676OooO0oo.OooO0o(), c31676OooO0oo.OooO00o());
                    if (!c31617OooO0oO.f113028OooOoO) {
                    }
                }
            }
        }
    }
}
