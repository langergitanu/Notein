package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class VbaProject implements Cloneable {
    private String mName;
    private String zzLr;
    private int zzX0A;
    private String zzX0f;
    private String zzX0g;
    private byte[] zzX0h;
    private com.aspose.words.internal.zzAA zzX0i;
    private String zzX0j;
    private short zzX0k;
    private int zzX0l;
    private int zzX0m;
    private String zzX0n;
    private String zzX0o;
    private int zzX0p;
    private int zzX0q;
    private int zzX0r;
    private VbaReferenceCollection zzX0s;
    private VbaModuleCollection zzX0t;
    private short zzX0u;
    private zzY3M zzX0v;
    private ArrayList<String> zzX4f;
    private String zzZh;
    private String zzjf;

    public VbaProject() {
        this.mName = "Project";
        this.zzX0r = 1;
        this.zzX0u = (short) 1251;
        this.zzX0q = EditingLanguage.ENGLISH_US;
        this.zzX0p = EditingLanguage.ENGLISH_US;
        this.zzX0l = 1;
        this.zzX0k = (short) 1;
        this.zzLr = "";
        this.zzX0i = null;
        VbaModule vbaModule = new VbaModule("ThisDocument");
        vbaModule.setType(0);
        getModules().add(vbaModule);
    }

    private void zzD(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        zzY3L zzy3l = new zzY3L(new com.aspose.words.internal.zzZOW(zzzor2), com.aspose.words.internal.zzZO0.zzQz(this.zzX0u));
        zzy3l.zzV((short) 1, this.zzX0r);
        zzy3l.zzV((short) 2, this.zzX0q);
        zzy3l.zzV((short) 20, this.zzX0p);
        zzy3l.zzT((short) 3, this.zzX0u);
        zzy3l.zzY((short) 4, this.mName);
        zzy3l.zzY((short) 5, this.zzLr);
        zzy3l.zzZ((short) 64, com.aspose.words.internal.zzZO0.zzhU(), this.zzLr);
        zzy3l.zzY((short) 6, this.zzX0o);
        zzy3l.zzY((short) 61, this.zzX0n);
        zzy3l.zzV((short) 7, this.zzX0A);
        zzy3l.zzV((short) 8, 0);
        zzy3l.zzJ((short) 9);
        zzy3l.zzl(4);
        zzy3l.zzk(this.zzX0l);
        zzy3l.zzJ(this.zzX0k);
        zzy3l.zzY((short) 12, this.zzX0j);
        zzy3l.zzZ((short) 60, com.aspose.words.internal.zzZO0.zzhU(), this.zzX0j);
        Iterator<VbaReference> it = getReferences().iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzy3l);
        }
        zzy3l.zzT((short) 15, (short) getModules().getCount());
        zzy3l.zzJ((short) 19);
        zzy3l.zzl(2);
        zzy3l.zzJ((short) -1);
        Iterator<VbaModule> it2 = getModules().iterator();
        while (it2.hasNext()) {
            it2.next().zzZ(zzy3l);
        }
        zzy3l.zzJ((short) 16);
        zzy3l.zzl(0);
        zzzor2.zzH(0L);
        zzYIN.zzY(zzzor2, zzzor);
    }

    private static com.aspose.words.internal.zzZOR zzXTZ() throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzor.writeByte((byte) -52);
        zzzor.writeByte((byte) 97);
        zzzor.writeByte((byte) -1);
        zzzor.writeByte((byte) -1);
        zzzor.writeByte((byte) 0);
        zzzor.writeByte((byte) 0);
        zzzor.writeByte((byte) 0);
        return zzzor;
    }

    private com.aspose.words.internal.zzZOR zzXU0() throws Exception {
        StringBuilder sb = new StringBuilder();
        zzZ(sb, "ID", this.zzZh, true);
        for (VbaModule vbaModule : getModules()) {
            zzZ(sb, VbaModule.zzjg(vbaModule.getType()), vbaModule.getName(), false);
        }
        zzZ(sb, "Name", this.mName, true);
        zzZ(sb, "VersionCompatible32", "393222000", true);
        zzZ(sb, "CMG", this.zzX0g, true);
        zzZ(sb, "DPB", this.zzjf, true);
        zzZ(sb, "GC", this.zzX0f, true);
        return new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzQz(this.zzX0u).getBytes(sb.toString()));
    }

    private void zzXU1() {
        ArrayList<String> arrayList = this.zzX4f;
        if (arrayList != null) {
            arrayList.clear();
        }
        for (VbaModule vbaModule : getModules()) {
            if (!com.aspose.words.internal.zzZKN.zzU3(vbaModule.getSourceCode())) {
                for (String str : com.aspose.words.internal.zzZKN.zzZ(vbaModule.getSourceCode(), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd)) {
                    com.aspose.words.internal.zzZNT zzzntZzUX = new com.aspose.words.internal.zzZNR("Sub\\s*([a-z, A-Z, 0-9]*)\\(\\)").zzUX(str);
                    if (!com.aspose.words.internal.zzZKN.zzU3(zzzntZzUX.getValue())) {
                        zzA0(com.aspose.words.internal.zzZKN.format("{0}.{1}.{2}", getName(), vbaModule.getName(), OooO0O0.OooO00o(zzzntZzUX, 1)));
                    }
                }
            }
        }
    }

    private void zzXU2() throws Exception {
        String strZzZn = this.zzX0v.zzQZ().zzZn(this.zzX0i.zzYs("PROJECT").zzWy());
        this.zzZh = zzXY(strZzZn, "ID");
        this.zzX0g = zzXY(strZzZn, "CMG");
        this.zzjf = zzXY(strZzZn, "DPB");
        this.zzX0f = zzXY(strZzZn, "GC");
    }

    private static String zzXY(String str, String str2) {
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, com.aspose.words.internal.zzZKN.zzO(str2, "=\""), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
        if (iZzT == -1) {
            return "";
        }
        int iIndexOf = str.indexOf(34, iZzT) + 1;
        int iIndexOf2 = str.indexOf(34, iIndexOf);
        return (iIndexOf <= 0 || iIndexOf2 <= 0) ? "" : C22241OooO0Oo.OooO00o(iIndexOf2, iIndexOf, iIndexOf, iIndexOf, str);
    }

    private static void zzZ(StringBuilder sb, String str, String str2, boolean z) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            com.aspose.words.internal.zzZNH.zzU(sb, str);
            sb.append('=');
            if (z) {
                sb.append('\"');
            }
            com.aspose.words.internal.zzZNH.zzU(sb, str2);
            if (z) {
                sb.append('\"');
            }
            com.aspose.words.internal.zzZNH.zzU(sb, IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    public VbaProject deepClone() {
        VbaProject vbaProject = (VbaProject) memberwiseClone();
        vbaProject.zzX0t = this.zzX0t.zzY(vbaProject);
        vbaProject.zzX0s = getReferences().zzXTS();
        if (this.zzX4f != null) {
            vbaProject.zzX4f = new ArrayList<>();
            Iterator<String> it = this.zzX4f.iterator();
            while (it.hasNext()) {
                vbaProject.zzA0(it.next());
            }
        }
        return vbaProject;
    }

    public int getCodePage() {
        return this.zzX0u;
    }

    public VbaModuleCollection getModules() {
        if (this.zzX0t == null) {
            this.zzX0t = new VbaModuleCollection(this);
        }
        return this.zzX0t;
    }

    public String getName() {
        return this.mName;
    }

    public VbaReferenceCollection getReferences() {
        if (this.zzX0s == null) {
            this.zzX0s = new VbaReferenceCollection(this);
        }
        return this.zzX0s;
    }

    public final byte[] getSignature() {
        return this.zzX0h;
    }

    public boolean isSigned() {
        return this.zzX0h != null;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setCodePage(int i) {
        this.zzX0u = (short) i;
    }

    public void setName(String str) {
        this.mName = str;
        zzXU4();
    }

    public final void zzA0(String str) {
        if (this.zzX4f == null) {
            this.zzX4f = new ArrayList<>();
        }
        this.zzX4f.add(str);
    }

    public final void zzXI(byte[] bArr) {
        this.zzX0h = bArr;
    }

    public final com.aspose.words.internal.zzAA zzXU3() throws Exception {
        com.aspose.words.internal.zzAA zzaa = this.zzX0i;
        if (zzaa != null) {
            return zzaa;
        }
        com.aspose.words.internal.zzAA zzaa2 = new com.aspose.words.internal.zzAA();
        this.zzX0i = zzaa2;
        zzaa2.zzZ("VBA", new com.aspose.words.internal.zzAA());
        this.zzX0i.zzZ("PROJECT", zzXU0());
        com.aspose.words.internal.zzAA zzaaZzYq = this.zzX0i.zzYq("VBA");
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzD(zzzor);
        zzzor.zzH(0L);
        zzaaZzYq.zzZ("dir", zzzor);
        zzaaZzYq.zzZ("_VBA_PROJECT", zzXTZ());
        for (VbaModule vbaModule : getModules()) {
            if (vbaModule.zzXU5() != null) {
                this.zzX0i.zzZ(vbaModule.getName(), vbaModule.zzXU5());
            }
            com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
            zzYIN.zzY(com.aspose.words.internal.zzZYD.zzXk(vbaModule.getSourceCode()) ? new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzQz(this.zzX0u).getBytes(vbaModule.getSourceCode())) : new com.aspose.words.internal.zzZOR(), zzzor2);
            zzaaZzYq.zzZ(vbaModule.getName(), zzzor2);
        }
        return this.zzX0i;
    }

    public final void zzXU4() {
        this.zzX0i = null;
        this.zzX0h = null;
        zzXU1();
    }

    public final ArrayList<String> zzXWD() {
        return this.zzX4f;
    }

    public final void zzYU(ArrayList<String> arrayList) {
        this.zzX4f = arrayList;
    }

    public VbaProject(com.aspose.words.internal.zzAA zzaa) throws Exception {
        String strZzjf;
        this.zzX0i = zzaa;
        try {
            com.aspose.words.internal.zzZOR zzzorZzYs = zzaa.zzYq("VBA").zzYs("dir");
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            zzYIN.zzZ(zzzorZzYs, zzzor);
            zzzor.zzH(0L);
            zzY3M zzy3m = new zzY3M(new com.aspose.words.internal.zzZOX(zzzor));
            this.zzX0v = zzy3m;
            this.zzX0r = zzy3m.zzXTY();
            this.zzX0q = this.zzX0v.zzXTY();
            this.zzX0p = this.zzX0v.zzXTY();
            short sZzXTX = this.zzX0v.zzXTX();
            this.zzX0u = sZzXTX;
            this.zzX0v.zzZ(com.aspose.words.internal.zzZO0.zzQz(sZzXTX));
            this.mName = this.zzX0v.zzjf(4);
            this.zzLr = this.zzX0v.zzV4(5, 64);
            this.zzX0o = this.zzX0v.zzjf(6);
            if (this.zzX0v.zzXTW() == 73) {
                strZzjf = this.zzX0v.zzjf(73);
            } else {
                strZzjf = this.zzX0v.zzjf(61);
            }
            this.zzX0n = strZzjf;
            this.zzX0A = this.zzX0v.zzXTY();
            this.zzX0m = this.zzX0v.zzXTY();
            this.zzX0v.zzXTV();
            this.zzX0l = this.zzX0v.zzXb();
            this.zzX0k = this.zzX0v.zzX9();
            if (this.zzX0v.zzXTW() == 12) {
                this.zzX0j = this.zzX0v.zzV4(12, 60);
            }
            while (this.zzX0v.zzXTW() != 15) {
                getReferences().zzZ(VbaReference.zzZ(this.zzX0v));
            }
            short sZzXTX2 = this.zzX0v.zzXTX();
            this.zzX0v.zzn(8);
            for (int i = 0; i < sZzXTX2; i++) {
                VbaModule vbaModuleZzZ = VbaModule.zzZ(this.zzX0v, zzaa);
                if (vbaModuleZzZ != null) {
                    getModules().zzZ(vbaModuleZzZ);
                }
            }
            zzXU2();
        } catch (Exception unused) {
        }
    }
}
