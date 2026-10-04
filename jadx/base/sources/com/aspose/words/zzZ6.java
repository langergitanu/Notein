package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.core.app.NotificationCompat;
import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6 {
    private static String[] zzZEb = {"a", "abbr", "address", "article", "aside", "audio", "b", "bdo", "blockquote", "body", "button", "cite", "code", "dd", "del", "details", "dfn", "div", "dl", "dt", "em", "fieldset", "figcaption", "figure", "footer", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", ContextChain.TAG_INFRA, "ins", "kbd", Constants.ScionAnalytics.PARAM_LABEL, "legend", "li", "map", "mark", "meter", "nav", "ol", "output", ContextChain.TAG_PRODUCT, "pre", NotificationCompat.CATEGORY_PROGRESS, "q", "rp", "rt", "samp", "section", "select", "small", "span", "strong", "sub", "summary", "sup", "textarea", "time", "ul", "var", "video"};
    private ArrayList<zzZDN> zzZE5;
    private zzZDN zzZE6;
    private zzZ7 zzZE7;
    private int zzZE8;
    private HtmlSaveOptions zzZE9;
    private zzZE7 zzZEa;
    private ArrayList<zzZ5> zzZEc;
    private zzZ3 zzZEd;

    public zzZ6(zzZE7 zzze7, HtmlSaveOptions htmlSaveOptions, zzZ7 zzz7, int i) throws Exception {
        this.zzZEa = zzze7;
        this.zzZE9 = htmlSaveOptions;
        this.zzZE7 = zzz7;
        this.zzZE8 = i;
        zzZDN zzzdn = (zzZDN) zzze7.zzYXW().zzYXk().zzyy(1);
        this.zzZE6 = zzzdn;
        if ("frameset".equals(zzzdn.getName())) {
            throw new IllegalStateException("Documents with frames aren't supported.");
        }
        this.zzZE5 = new ArrayList<>();
        this.zzZEc = new ArrayList<>();
        zzaz();
    }

    private static ArrayList<zzZ5> zzB(ArrayList<zzZ5> arrayList) {
        ArrayList<zzZ5> arrayList2 = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList2, arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            zzZ5 zzz5 = arrayList.get(i);
            zzZ5 zzz52 = (zzZ5) C21505OooO0Oo.OooO00o(1, arrayList2);
            if (zzz5.zzax().size() > 0 || zzz5.getByteCount() + zzz52.getByteCount() > 8192 || zzz52.zzaw().size() > 0) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzz5);
            } else {
                zzz52.zzZ(zzz5);
            }
        }
        return arrayList2;
    }

    private void zzZ(zzZDN zzzdn) throws Exception {
        if ("span".equals(zzzdn.getName()) && zzzdn.zzYXk().getCount() == 1 && (zzzdn.zzYXk().zzyy(0) instanceof zzZDI) && zzYXM.zzZ(zzzdn, this.zzZE9).length() > 8192) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZE5, zzzdn);
        }
        for (zzZDK zzzdk : zzzdn.zzYXk()) {
            if (zzzdk instanceof zzZDN) {
                zzZ((zzZDN) zzzdk);
            }
        }
    }

    private void zzaA() throws Exception {
        for (zzZDN zzzdn : this.zzZE5) {
            zzZDN zzzdnZzYXe = zzzdn.zzYXe();
            int iZzV = zzzdnZzYXe.zzYXk().zzV(zzzdn);
            zzzdnZzYXe.zzYXk().zzW(zzzdn);
            int i = 0;
            String strZzZ = zzYXM.zzZ((zzZDI) zzzdn.zzYXk().zzyy(0), this.zzZE9);
            com.aspose.words.internal.zzZO3 zzzo3Zzik = this.zzZE9.zzZ9Y().zzik();
            char[] charArray = strZzZ.toCharArray();
            byte[] bArr = new byte[4096];
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            do {
                RefInt refInt = new RefInt(i);
                RefInt refInt2 = new RefInt(i2);
                RefBoolean refBoolean = new RefBoolean(z);
                zzzo3Zzik.zzZ(charArray, i3, charArray.length - i3, bArr, 0, 4096, refInt, refInt2, refBoolean);
                i = refInt.get();
                i2 = refInt2.get();
                z = refBoolean.get();
                zzZDI zzzdi = new zzZDI(new String(charArray, i3, i));
                zzZDN zzzdn2 = (zzZDN) zzzdn.zzYXi();
                zzzdn2.zzYXk().zzX(zzzdi);
                zzzdnZzYXe.zzYXk().zzZ(iZzV, zzzdn2);
                iZzV++;
                i3 += i;
            } while (!z);
        }
    }

    private String zzay() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<zzZDK> it = this.zzZE6.zzYXk().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZDK>) arrayList, it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.zzZE6.zzYXk().zzW((zzZDK) it2.next());
        }
        String strZzZ = zzYXM.zzZ(this.zzZEa.zzYXW(), this.zzZE9);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.zzZE6.zzYXk().zzX((zzZDK) it3.next());
        }
        return strZzZ;
    }

    private void zzaz() throws Exception {
        zzZ(this.zzZE6);
        zzaA();
        this.zzZE7.zzQ(this.zzZE6);
        long j = ((long) this.zzZE8) * 1000000;
        RefInt refInt = new RefInt(0);
        zzZ(this.zzZE6, j, refInt);
        refInt.get();
        String strZzay = zzay();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        int iZzV4 = this.zzZE9.zzZ9Y().zzV4(strZzay.substring(0, com.aspose.words.internal.zzZKN.zzW(strZzay, ">", com.aspose.words.internal.zzZKN.zzT(strZzay, "<body", i), i) + 1));
        this.zzZE6.zzYXj().zzJH("aid");
        Ref<String> ref = new Ref<>("");
        Ref<String> ref2 = new Ref<>("");
        zzZ(this.zzZE6, iZzV4, ref, ref2);
        ref.get();
        ref2.get();
        this.zzZEc = zzB(this.zzZEc);
        String strZzZ = zzYXM.zzZ(this.zzZEa.zzYXW(), this.zzZE9);
        this.zzZEd = new zzZ3(strZzZ, this.zzZE9.zzZ9Y().zzV4(strZzZ), this.zzZE8, this.zzZEc);
    }

    public final void update(int i, int i2) {
        this.zzZEd.setStartPosition(i);
        int byteCount = 0;
        for (zzZ5 zzz5 : this.zzZEc) {
            zzz5.zzP5(i2);
            zzz5.setStartPosition(byteCount);
            zzz5.zzP4(zzz5.zzaN() + i);
            i2++;
            byteCount += zzz5.getByteCount();
        }
    }

    public final int zzaB() {
        int byteCount = this.zzZEd.getByteCount();
        Iterator<zzZ5> it = this.zzZEc.iterator();
        while (it.hasNext()) {
            byteCount += it.next().getByteCount();
        }
        return byteCount;
    }

    public final String zzaC() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, this.zzZEd.zzau());
        Iterator<zzZ5> it = this.zzZEc.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().zzau());
        }
        return sb.toString();
    }

    public final ArrayList<zzZ5> zzaD() {
        return this.zzZEc;
    }

    public final zzZ3 zzaE() {
        return this.zzZEd;
    }

    public final void zzaF() {
        for (zzZ5 zzz5 : this.zzZEc) {
            zzz5.zzTw(this.zzZE7.zzHL(zzz5.zzau()));
        }
    }

    public final void zzaG() {
        for (zzZ5 zzz5 : this.zzZEc) {
            this.zzZE7.zzw(zzz5.zzau(), zzz5.zzaL(), zzz5.zzaN());
        }
    }

    private static void zzZ(zzZDN zzzdn, long j, RefInt refInt) {
        if (com.aspose.words.internal.zzZKV.zzZ(zzZEb, zzzdn.getName(), zzZEb.length) != -1) {
            zzzdn.zzYXj().zzZ(new zzZDQ("aid", zzYR.zzC(((long) refInt.get()) + j, 1)));
            com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        }
        for (zzZDK zzzdk : zzzdn.zzYXk()) {
            if (zzzdk instanceof zzZDN) {
                zzZ((zzZDN) zzzdk, j, refInt);
            }
        }
    }

    private void zzZ(zzZDN zzzdn, int i, Ref<String> ref, Ref<String> ref2) throws Exception {
        String str;
        zzzdn.zzYXj().zzJH("aid");
        ref.set("P");
        ref2.set(zzzdn.zzYXj().zzJH("aid").getValue());
        int size = this.zzZEc.size();
        int iZzV4 = i;
        int i2 = 0;
        while (i2 < zzzdn.zzYXk().getCount()) {
            zzZDK zzzdkZzyy = zzzdn.zzYXk().zzyy(i2);
            if (zzzdkZzyy instanceof zzZDN) {
                zzZDN zzzdn2 = (zzZDN) zzzdkZzyy;
                String strZzZ = zzYXM.zzZ(zzzdn2, this.zzZE9);
                zzZDS zzzdsZzJH = zzzdn2.zzYXj().zzJH("aid");
                if (this.zzZE9.zzZ9Y().zzV4(strZzZ) > 8192 && zzzdsZzJH != null) {
                    if ("span".equals(zzzdn2.getName()) && zzzdn2.zzYXk().getCount() == 1 && (zzzdn2.zzYXk().zzyy(0) instanceof zzZDI)) {
                        zzZ5 zzz5 = new zzZ5(strZzZ, this.zzZE9.zzZ9Y().zzV4(strZzZ), ref.get(), ref2.get(), this.zzZE8, iZzV4);
                        strZzZ = strZzZ;
                        com.aspose.words.internal.zzZQG.zzZ(this.zzZEc, zzz5);
                        zzzdn.zzYXk().zzW(zzzdn2);
                    } else {
                        zzZ(zzzdn2, this.zzZE9.zzZ9Y().zzV4(strZzZ.substring(0, com.aspose.words.internal.zzZKN.zzT(strZzZ, ">", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) + 1)) + iZzV4, ref, ref2);
                        i2++;
                    }
                    str = strZzZ;
                } else {
                    this.zzZE9.zzZ9Y().zzV4(strZzZ);
                    str = strZzZ;
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZEc, new zzZ5(str, this.zzZE9.zzZ9Y().zzV4(strZzZ), ref.get(), ref2.get(), this.zzZE8, iZzV4));
                    zzzdn.zzYXk().zzW(zzzdn2);
                }
                iZzV4 += this.zzZE9.zzZ9Y().zzV4(str);
            }
        }
        if (this.zzZEc.size() > 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZEc.get(size).zzax(), ref2.get());
            com.aspose.words.internal.zzZQG.zzZ(((zzZ5) C21505OooO0Oo.OooO00o(1, this.zzZEc)).zzaw(), ref2.get());
        }
        ref.set("S");
        ref2.set(zzzdn.zzYXj().zzJH("aid").getValue());
    }
}
