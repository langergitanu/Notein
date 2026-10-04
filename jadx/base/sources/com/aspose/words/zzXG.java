package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXG extends zzY4X {
    private String zzZAS;
    private int zzZAT = 7;

    private static String zzT7(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\r') {
                int i2 = i + 1;
                if (i2 == str.length() || str.charAt(i2) != '\n') {
                    sb.append(cCharAt);
                }
            } else if (cCharAt == '&') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&amp;");
            } else if (cCharAt == '<') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&lt;");
            } else if (cCharAt != '>') {
                sb.append(cCharAt);
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, "&gt;");
            }
        }
        return sb.toString();
    }

    private static void zzV(ArrayList<zzXZ6> arrayList, ArrayList<zzXZ6> arrayList2) {
        if (arrayList2 == null) {
            return;
        }
        Iterator<zzXZ6> it = arrayList2.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), arrayList);
            if (arrayList.size() == 0) {
                return;
            }
        }
    }

    private boolean zzW(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp) {
        String strZzT7 = zzT7(zzo.getValue());
        if (strZzT7.length() <= 0) {
            return false;
        }
        if (this.zzZAT == 3) {
            zzp.zzX(IOUtils.LINE_SEPARATOR_UNIX);
        }
        zzp.zzX(strZzT7);
        return true;
    }

    private void zzY(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp, ArrayList<zzXZ6> arrayList) {
        if (this.zzZAT == 3) {
            zzp.zzX(IOUtils.LINE_SEPARATOR_UNIX);
        }
        zzp.zzY(zzo.getName());
        String localName = zzo.getLocalName();
        ArrayList<zzXZ6> arrayListZzX = zzX(zzo, zzp, arrayList);
        if (arrayList != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayListZzX, (Iterable) arrayList);
        }
        while (zzo.zzY(localName, 31)) {
            zzZ(zzo, zzp, arrayListZzX);
        }
        zzp.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzZ(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp, ArrayList<zzXZ6> arrayList) {
        int nodeType = zzo.getNodeType();
        boolean zZzY = true;
        if (nodeType == 1) {
            zzY(zzo, zzp, arrayList);
        } else if (nodeType == 6) {
            zZzY = zzY(zzo, zzp);
        } else if (nodeType == 9) {
            zZzY = zzW(zzo, zzp, arrayList);
        } else if (nodeType == 12) {
            zZzY = zzW(zzo, zzp);
        } else if (nodeType != 24) {
            if (nodeType == 3) {
                zzX(zzo, zzp);
            } else if (nodeType == 4) {
                zZzY = zzZ(zzo, zzp);
            }
        }
        if (zZzY) {
            this.zzZAT = nodeType;
        }
        return zZzY;
    }

    public final void zzT8(String str) {
        this.zzZAS = str;
    }

    @Override // com.aspose.words.zzY4X
    public final void zzX(com.aspose.words.internal.zzO zzo) {
    }

    @Override // com.aspose.words.zzY4X
    public final com.aspose.words.internal.zzZOR zzZB(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        if (zzzop.getLength() == 0) {
            return zzzor;
        }
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, new com.aspose.words.internal.zzZNI(false), false);
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop, false);
        String localName = zzo.getLocalName();
        while (zzo.zzY(localName, 31)) {
            zzZ(zzo, zzp, null);
        }
        zzp.flush();
        return zzzor;
    }

    @Override // com.aspose.words.zzY4X
    public final void zzX(com.aspose.words.internal.zzP zzp) {
        zzp.zzY("Transform");
        zzp.zzX("Algorithm", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        zzp.zzo();
    }

    private ArrayList<zzXZ6> zzX(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp, ArrayList<zzXZ6> arrayList) {
        ArrayList<zzXZ6> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        zzXZ6 zzxz6 = null;
        while (zzo.zzT(false)) {
            zzXZ6 zzxz62 = new zzXZ6(zzo);
            if (zzxz62.zzXQQ()) {
                if (com.aspose.words.internal.zzZKN.zzU3(zzxz62.getValue())) {
                    zzxz6 = zzxz62;
                } else {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzxz62);
                }
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzXZ6>) arrayList3, zzxz62);
            }
        }
        String str = this.zzZAS;
        if (str != null && arrayList == null) {
            zzXZ6 zzxz63 = new zzXZ6("xmlns", str);
            if (!zzxz63.zzz(arrayList2)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzxz63);
            }
        }
        zzV(arrayList2, arrayList);
        if (zzxz6 != null && arrayList2.size() == 0) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzxz6);
        }
        zzXZ5 zzxz5 = new zzXZ5();
        Collections.sort(arrayList2, zzxz5);
        zzZ(arrayList2, zzp);
        Collections.sort(arrayList3, zzxz5);
        zzZ((ArrayList<zzXZ6>) arrayList3, zzp);
        return arrayList2;
    }

    private boolean zzW(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp, ArrayList<zzXZ6> arrayList) {
        String value = zzo.getValue();
        boolean z = true;
        if (value != null) {
            zzp.zzX(value);
            return true;
        }
        String localName = zzo.getLocalName();
        while (zzo.zzY(localName, 31)) {
            if (zzZ(zzo, zzp, arrayList)) {
                z = false;
            }
        }
        return z;
    }

    private static boolean zzZ(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp) {
        return zzW(zzp, zzo.getValue());
    }

    private static void zzZ(zzXZ6 zzxz6, ArrayList<zzXZ6> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).zzZ(zzxz6)) {
                arrayList.remove(size);
            }
        }
    }

    private static boolean zzW(com.aspose.words.internal.zzP zzp, String str) {
        String strZzT = zzp.zzT(str.replace(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX));
        zzp.writeString(strZzT);
        return strZzT.length() > 0;
    }

    private boolean zzY(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp) {
        if (zzo.zz6().getDepth() == 0) {
            return false;
        }
        if (this.zzZAT == 3) {
            zzp.zzX(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return zzW(zzp, zzo.getValue());
    }

    private static void zzZ(ArrayList<zzXZ6> arrayList, com.aspose.words.internal.zzP zzp) {
        for (zzXZ6 zzxz6 : arrayList) {
            zzp.zzX(zzxz6.getName(), zzxz6.getValue());
        }
    }

    private void zzX(com.aspose.words.internal.zzO zzo, com.aspose.words.internal.zzP zzp) {
        if (this.zzZAT != 7) {
            zzp.zzX(IOUtils.LINE_SEPARATOR_UNIX);
        }
        String strZzT7 = zzT7(zzo.getValue());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzT7)) {
            zzp.zzW(zzo.getLocalName(), strZzT7);
        } else {
            zzp.zzX(com.aspose.words.internal.zzZKN.format("<?{0}?>", zzo.getLocalName()));
        }
    }
}
