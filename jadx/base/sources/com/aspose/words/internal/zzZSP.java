package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes5.dex */
class zzZSP implements zzEZ {
    private ArrayList<zzEZ> zz68;
    private ArrayList<zzEZ> zz69;
    protected zzEZ zz6a;
    protected Node zz6b;

    public zzZSP(Node node) {
        this.zz6b = node;
    }

    private boolean hasAttributes() {
        Element element = (Element) zzZKW.zzZ(this.zz6b, Element.class);
        return element != null ? element.hasAttributes() : this.zz6b.getAttributes() != null && this.zz6b.getAttributes().getLength() > 0;
    }

    private static zzEZ zzU(Node node) {
        short nodeType = node.getNodeType();
        return nodeType != 1 ? nodeType != 11 ? nodeType != 17 ? new zzZSP(node) : new zzZSU((zzZL5) node) : new zzZST((DocumentType) node) : new zzZSR((Element) node);
    }

    private ArrayList<zzEZ> zzmw() {
        if (this.zz68 == null) {
            if (hasAttributes()) {
                this.zz68 = new ArrayList<>(this.zz6b.getAttributes().getLength());
                for (int i = 0; i < this.zz6b.getAttributes().getLength(); i++) {
                    zzZQG.zzZ(this.zz68, zzU(this.zz6b.getAttributes().item(i)));
                }
            } else {
                this.zz68 = zzZSQ.zz6d;
            }
        }
        return this.zz68;
    }

    @Override // com.aspose.words.internal.zzEZ
    public String getLocalName() {
        return this.zz6b.getLocalName() == null ? this.zz6b.getNodeName() : this.zz6b.getLocalName();
    }

    @Override // com.aspose.words.internal.zzEZ
    public final int getNodeType() {
        return this.zz6b.getNodeType();
    }

    @Override // com.aspose.words.internal.zzEZ
    public final String getValue() {
        return this.zz6b.getNodeValue();
    }

    @Override // com.aspose.words.internal.zzEZ
    public final void setValue(String str) {
        this.zz6b.setNodeValue(str);
    }

    @Override // com.aspose.words.internal.zzEZ
    public final Object zzEl() {
        return this.zz6b;
    }

    @Override // com.aspose.words.internal.zzEZ
    public final String zzEm() {
        return this.zz6b.getNamespaceURI() == null ? "" : this.zz6b.getNamespaceURI();
    }

    @Override // com.aspose.words.internal.zzEZ
    public final ArrayList<zzEZ> zzEn() {
        if (this.zz69 == null) {
            if (this.zz6b.hasChildNodes()) {
                this.zz69 = new ArrayList<>(this.zz6b.getChildNodes().getLength());
                for (int i = 0; i < this.zz6b.getChildNodes().getLength(); i++) {
                    zzZQG.zzZ(this.zz69, zzU(this.zz6b.getChildNodes().item(i)));
                }
            } else {
                this.zz69 = zzZSQ.zz6d;
            }
        }
        return this.zz69;
    }

    public final void zzW(zzEZ zzez) {
        if (this.zz6a != null && zzZKN.equals(zzez.getLocalName(), this.zz6a.getLocalName()) && zzZKN.equals(zzez.zzEm(), this.zz6a.zzEm())) {
            this.zz6a = zzez;
        }
        this.zz68 = null;
    }

    @Override // com.aspose.words.internal.zzEZ
    public final zzEZ zzY(zzEZ zzez) {
        zzZSN.zzY(this.zz6b, ((zzZSP) zzez).zz6b);
        this.zz69 = null;
        this.zz68 = null;
        return zzez;
    }

    @Override // com.aspose.words.internal.zzEZ
    public final zzEZ zzv(String str, String str2) {
        zzEZ next;
        zzEZ zzez = this.zz6a;
        if (zzez != null && zzZKN.equals(zzez.getLocalName(), str) && zzZKN.equals(this.zz6a.zzEm(), str2)) {
            return this.zz6a;
        }
        Iterator<zzEZ> it = zzmw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (zzZKN.equals(next.getLocalName(), str) && zzZKN.equals(next.zzEm(), str2)) {
                break;
            }
        }
        this.zz6a = next;
        return next;
    }
}
