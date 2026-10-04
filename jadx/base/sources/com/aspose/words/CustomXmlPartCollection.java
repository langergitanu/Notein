package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class CustomXmlPartCollection implements Iterable<CustomXmlPart> {
    private byte[] zzZk0;
    private ArrayList<CustomXmlPart> zzZm = new ArrayList<>();

    public void add(CustomXmlPart customXmlPart) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, customXmlPart);
    }

    public void clear() {
        this.zzZm.clear();
        this.zzZk0 = null;
    }

    public CustomXmlPartCollection deepClone() {
        CustomXmlPartCollection customXmlPartCollection = new CustomXmlPartCollection();
        Iterator<CustomXmlPart> it = iterator();
        while (it.hasNext()) {
            customXmlPartCollection.add(it.next().deepClone());
        }
        byte[] bArr = this.zzZk0;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            customXmlPartCollection.zzZk0 = bArr2;
            byte[] bArr3 = this.zzZk0;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        }
        return customXmlPartCollection;
    }

    public CustomXmlPart get(int i) {
        return this.zzZm.get(i);
    }

    public CustomXmlPart getById(String str) {
        for (CustomXmlPart customXmlPart : this.zzZm) {
            if (com.aspose.words.internal.zzZKN.equals(customXmlPart.getId(), str)) {
                return customXmlPart;
            }
        }
        return null;
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<CustomXmlPart> iterator() {
        return this.zzZm.iterator();
    }

    public void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public void set(int i, CustomXmlPart customXmlPart) {
        this.zzZm.set(i, customXmlPart);
    }

    public final void zzYx(byte[] bArr) {
        this.zzZk0 = bArr;
    }

    public final byte[] zzZTF() {
        return this.zzZk0;
    }

    public final CustomXmlPart zzZTG() throws Exception {
        for (CustomXmlPart customXmlPart : this.zzZm) {
            if (customXmlPart.getData() != null) {
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(customXmlPart.getData());
                try {
                    org.w3c.dom.Document documentZzX = com.aspose.words.internal.zzZSN.zzX(zzzor, true);
                    if (documentZzX.getDocumentElement() != null && "b:Sources".equals(documentZzX.getDocumentElement().getNodeName())) {
                        return customXmlPart;
                    }
                } finally {
                    zzzor.close();
                }
            }
        }
        return null;
    }

    public CustomXmlPart add(String str, String str2) {
        CustomXmlPart customXmlPart = new CustomXmlPart();
        customXmlPart.setId(str);
        customXmlPart.setData(com.aspose.words.internal.zzZO0.zzhV().getBytes(str2));
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, customXmlPart);
        return customXmlPart;
    }
}
