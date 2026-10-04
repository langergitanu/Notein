package com.aspose.slides.Collections.Generic;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class KeyValuePair<TKey, TValue> extends AbstractC7020m9<KeyValuePair> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f1637k4 = true;

    /* JADX INFO: renamed from: kk */
    private TValue f1638kk;

    /* JADX INFO: renamed from: x1 */
    private TKey f1639x1;

    static {
        C7019kk.m27454k4(KeyValuePair.class, (InterfaceC7014c5) new InterfaceC7014c5<KeyValuePair>() { // from class: com.aspose.slides.Collections.Generic.KeyValuePair.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public KeyValuePair mo838x1() {
                return new KeyValuePair();
            }
        });
    }

    public KeyValuePair() {
    }

    public static boolean equals(KeyValuePair keyValuePair, KeyValuePair keyValuePair2) {
        return keyValuePair.equals(keyValuePair2);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m836k4(KeyValuePair keyValuePair) {
        return C14067j2.m66728k4(keyValuePair.f1639x1, this.f1639x1) && C14067j2.m66728k4(keyValuePair.f1638kk, this.f1638kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public KeyValuePair Clone() {
        KeyValuePair keyValuePair = new KeyValuePair();
        CloneTo(keyValuePair);
        return keyValuePair;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public void CloneTo(KeyValuePair keyValuePair) {
        keyValuePair.f1639x1 = this.f1639x1;
        keyValuePair.f1638kk = this.f1638kk;
    }

    public Object clone() {
        return Clone();
    }

    public TKey getKey() {
        return this.f1639x1;
    }

    public TValue getValue() {
        return this.f1638kk;
    }

    public int hashCode() {
        TKey tkey = this.f1639x1;
        int iHashCode = (tkey != null ? tkey.hashCode() : 0) * 31;
        TValue tvalue = this.f1638kk;
        return iHashCode + (tvalue != null ? tvalue.hashCode() : 0);
    }

    public String toString() {
        return C14113y2.m67408k4("[", getKey() != null ? getKey().toString() : "", ", ", getValue() != null ? getValue().toString() : "", "]");
    }

    public KeyValuePair(TKey tkey, TValue tvalue) {
        this.f1639x1 = tkey;
        this.f1638kk = tvalue;
    }

    public boolean equals(Object obj) {
        if (!f1637k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof KeyValuePair) {
            return m836k4((KeyValuePair) obj);
        }
        return false;
    }
}
