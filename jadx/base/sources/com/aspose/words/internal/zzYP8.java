package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.security.cert.PolicyNode;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzYP8 implements PolicyNode {
    protected String zzVU8;
    protected Set zzVU9;
    protected PolicyNode zzVUa;
    protected Set zzVUb;
    protected List zzVUc;
    protected boolean zzWqe;
    protected int zzZGR;

    public zzYP8(List list, int i, Set set, PolicyNode policyNode, Set set2, String str, boolean z) {
        this.zzVUc = list;
        this.zzZGR = i;
        this.zzVUb = set;
        this.zzVUa = policyNode;
        this.zzVU9 = set2;
        this.zzVU8 = str;
        this.zzWqe = z;
    }

    @Override // java.security.cert.PolicyNode
    public final Iterator getChildren() {
        return this.zzVUc.iterator();
    }

    @Override // java.security.cert.PolicyNode
    public final int getDepth() {
        return this.zzZGR;
    }

    @Override // java.security.cert.PolicyNode
    public final Set getExpectedPolicies() {
        return this.zzVUb;
    }

    @Override // java.security.cert.PolicyNode
    public final PolicyNode getParent() {
        return this.zzVUa;
    }

    @Override // java.security.cert.PolicyNode
    public final Set getPolicyQualifiers() {
        return this.zzVU9;
    }

    @Override // java.security.cert.PolicyNode
    public final String getValidPolicy() {
        return this.zzVU8;
    }

    public final boolean hasChildren() {
        return !this.zzVUc.isEmpty();
    }

    @Override // java.security.cert.PolicyNode
    public final boolean isCritical() {
        return this.zzWqe;
    }

    public final String toString() {
        return toString("");
    }

    public final void zzOE(boolean z) {
        this.zzWqe = z;
    }

    public final void zzY(zzYP8 zzyp8) {
        this.zzVUc.remove(zzyp8);
    }

    public final void zzZ(zzYP8 zzyp8) {
        this.zzVUc.add(zzyp8);
        zzyp8.zzVUa = this;
    }

    private String toString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.zzVU8);
        stringBuffer.append(" {\n");
        for (int i = 0; i < this.zzVUc.size(); i++) {
            stringBuffer.append(((zzYP8) this.zzVUc.get(i)).toString(C21111o0ooOoO.OooO0Oo(str, "    ")));
        }
        stringBuffer.append(str);
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }
}
