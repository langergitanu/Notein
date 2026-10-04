package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN5 {
    private String mName;
    private String mValue;
    private boolean zzZVa;
    private zzZN5 zzZVb;
    private List<zzZN5> zzZV9 = new ArrayList();
    private Map<String, String> zzZV8 = new HashMap();
    private Map<String, Object> zzZV7 = new HashMap();

    public zzZN5() {
    }

    public final Map<String, String> getAttributes() {
        return this.zzZV8;
    }

    public final List<zzZN5> getChildren() {
        return this.zzZV9;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final void zzZ(zzZN5 zzzn5) {
        zzzn5.zzZVb = this;
        this.zzZV9.add(zzzn5);
    }

    public final boolean zzh8() {
        return this.zzZVa;
    }

    public final void zzh9() {
        this.zzZVa = true;
    }

    public final boolean zzha() {
        Iterator<zzZN5> it = this.zzZV9.iterator();
        while (it.hasNext()) {
            if (it.next().zzZVa) {
                return true;
            }
        }
        return false;
    }

    public zzZN5(String str) {
        this.mName = str;
    }
}
